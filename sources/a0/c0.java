package a0;

import H2.i;
import I.n;
import android.media.MediaCodec;
import androidx.concurrent.futures.c;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import ob.C10101e;

class c0 implements a0 {

    /* renamed from: a  reason: collision with root package name */
    private final MediaCodec f15089a;

    /* renamed from: b  reason: collision with root package name */
    private final int f15090b;

    /* renamed from: c  reason: collision with root package name */
    private final ByteBuffer f15091c;

    /* renamed from: d  reason: collision with root package name */
    private final C10101e<Void> f15092d;

    /* renamed from: e  reason: collision with root package name */
    private final c.a<Void> f15093e;

    /* renamed from: f  reason: collision with root package name */
    private final AtomicBoolean f15094f = new AtomicBoolean(false);

    /* renamed from: g  reason: collision with root package name */
    private long f15095g = 0;

    /* renamed from: h  reason: collision with root package name */
    private boolean f15096h = false;

    c0(MediaCodec mediaCodec, int i10) {
        this.f15089a = (MediaCodec) i.g(mediaCodec);
        this.f15090b = i.d(i10);
        this.f15091c = mediaCodec.getInputBuffer(i10);
        AtomicReference atomicReference = new AtomicReference();
        this.f15092d = c.a(new b0(atomicReference));
        this.f15093e = (c.a) i.g((c.a) atomicReference.get());
    }

    private void h() {
        if (this.f15094f.get()) {
            throw new IllegalStateException("The buffer is submitted or canceled.");
        }
    }

    public void a(boolean z10) {
        h();
        this.f15096h = z10;
    }

    public boolean b() {
        if (this.f15094f.getAndSet(true)) {
            return false;
        }
        try {
            this.f15089a.queueInputBuffer(this.f15090b, this.f15091c.position(), this.f15091c.limit(), this.f15095g, this.f15096h ? 4 : 0);
            this.f15093e.c(null);
            return true;
        } catch (IllegalStateException e10) {
            this.f15093e.f(e10);
            return false;
        }
    }

    public void c(long j10) {
        h();
        i.a(j10 >= 0);
        this.f15095g = j10;
    }

    public C10101e<Void> d() {
        return n.B(this.f15092d);
    }

    public boolean f() {
        if (this.f15094f.getAndSet(true)) {
            return false;
        }
        try {
            this.f15089a.queueInputBuffer(this.f15090b, 0, 0, 0, 0);
            this.f15093e.c(null);
        } catch (IllegalStateException e10) {
            this.f15093e.f(e10);
        }
        return true;
    }
}
