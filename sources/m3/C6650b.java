package M3;

import androidx.media3.exoplayer.C5228e;
import androidx.media3.exoplayer.v0;
import java.nio.ByteBuffer;
import q3.C5807s;
import t3.B;
import t3.N;
import y3.f;

/* renamed from: M3.b  reason: case insensitive filesystem */
public final class C6650b extends C5228e {

    /* renamed from: r  reason: collision with root package name */
    private final f f38471r = new f(1);

    /* renamed from: s  reason: collision with root package name */
    private final B f38472s = new B();

    /* renamed from: t  reason: collision with root package name */
    private C6649a f38473t;

    /* renamed from: u  reason: collision with root package name */
    private long f38474u;

    public C6650b() {
        super(6);
    }

    private float[] t0(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() != 16) {
            return null;
        }
        this.f38472s.U(byteBuffer.array(), byteBuffer.limit());
        this.f38472s.W(byteBuffer.arrayOffset() + 4);
        float[] fArr = new float[3];
        for (int i10 = 0; i10 < 3; i10++) {
            fArr[i10] = Float.intBitsToFloat(this.f38472s.u());
        }
        return fArr;
    }

    private void u0() {
        C6649a aVar = this.f38473t;
        if (aVar != null) {
            aVar.e();
        }
    }

    public int b(C5807s sVar) {
        return "application/x-camera-motion".equals(sVar.f28244o) ? v0.v(4) : v0.v(0);
    }

    public boolean d() {
        return n();
    }

    public boolean f() {
        return true;
    }

    /* access modifiers changed from: protected */
    public void f0() {
        u0();
    }

    public String getName() {
        return "CameraMotionRenderer";
    }

    /* access modifiers changed from: protected */
    public void i0(long j10, boolean z10) {
        this.f38474u = Long.MIN_VALUE;
        u0();
    }

    public void k(long j10, long j11) {
        while (!n() && this.f38474u < 100000 + j10) {
            this.f38471r.v();
            boolean z10 = false;
            if (q0(X(), this.f38471r, 0) == -4 && !this.f38471r.D()) {
                long j12 = this.f38471r.f32281f;
                this.f38474u = j12;
                if (j12 < Z()) {
                    z10 = true;
                }
                if (this.f38473t != null && !z10) {
                    this.f38471r.L();
                    float[] t02 = t0((ByteBuffer) N.i(this.f38471r.f32279d));
                    if (t02 != null) {
                        ((C6649a) N.i(this.f38473t)).b(this.f38474u - c0(), t02);
                    }
                }
            } else {
                return;
            }
        }
    }

    public void x(int i10, Object obj) {
        if (i10 == 8) {
            this.f38473t = (C6649a) obj;
        } else {
            super.x(i10, obj);
        }
    }
}
