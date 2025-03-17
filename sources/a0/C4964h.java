package a0;

import H2.i;
import I.n;
import android.media.MediaCodec;
import androidx.concurrent.futures.c;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import ob.C10101e;

/* renamed from: a0.h  reason: case insensitive filesystem */
public class C4964h implements C4962f {

    /* renamed from: a  reason: collision with root package name */
    private final MediaCodec f15103a;

    /* renamed from: b  reason: collision with root package name */
    private final MediaCodec.BufferInfo f15104b;

    /* renamed from: c  reason: collision with root package name */
    private final int f15105c;

    /* renamed from: d  reason: collision with root package name */
    private final ByteBuffer f15106d;

    /* renamed from: e  reason: collision with root package name */
    private final C10101e<Void> f15107e;

    /* renamed from: f  reason: collision with root package name */
    private final c.a<Void> f15108f;

    /* renamed from: g  reason: collision with root package name */
    private final AtomicBoolean f15109g = new AtomicBoolean(false);

    C4964h(MediaCodec mediaCodec, int i10, MediaCodec.BufferInfo bufferInfo) {
        this.f15103a = (MediaCodec) i.g(mediaCodec);
        this.f15105c = i10;
        this.f15106d = mediaCodec.getOutputBuffer(i10);
        this.f15104b = (MediaCodec.BufferInfo) i.g(bufferInfo);
        AtomicReference atomicReference = new AtomicReference();
        this.f15107e = c.a(new C4963g(atomicReference));
        this.f15108f = (c.a) i.g((c.a) atomicReference.get());
    }

    private void f() {
        if (this.f15109g.get()) {
            throw new IllegalStateException("encoded data is closed.");
        }
    }

    public ByteBuffer U0() {
        f();
        this.f15106d.position(this.f15104b.offset);
        ByteBuffer byteBuffer = this.f15106d;
        MediaCodec.BufferInfo bufferInfo = this.f15104b;
        byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
        return this.f15106d;
    }

    public void close() {
        if (!this.f15109g.getAndSet(true)) {
            try {
                this.f15103a.releaseOutputBuffer(this.f15105c, false);
                this.f15108f.c(null);
            } catch (IllegalStateException e10) {
                this.f15108f.f(e10);
            }
        }
    }

    public C10101e<Void> d() {
        return n.B(this.f15107e);
    }

    public long d1() {
        return this.f15104b.presentationTimeUs;
    }

    public MediaCodec.BufferInfo q0() {
        return this.f15104b;
    }

    public long size() {
        return (long) this.f15104b.size;
    }

    public boolean y0() {
        return (this.f15104b.flags & 1) != 0;
    }
}
