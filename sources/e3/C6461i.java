package E3;

import java.nio.ByteBuffer;
import t3.C5950a;
import y3.f;

/* renamed from: E3.i  reason: case insensitive filesystem */
final class C6461i extends f {

    /* renamed from: j  reason: collision with root package name */
    private long f34803j;

    /* renamed from: k  reason: collision with root package name */
    private int f34804k;

    /* renamed from: l  reason: collision with root package name */
    private int f34805l = 32;

    public C6461i() {
        super(2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0014, code lost:
        r0 = r4.f32279d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean Q(y3.f r5) {
        /*
            r4 = this;
            boolean r0 = r4.U()
            r1 = 1
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            int r0 = r4.f34804k
            int r2 = r4.f34805l
            r3 = 0
            if (r0 < r2) goto L_0x0010
            return r3
        L_0x0010:
            java.nio.ByteBuffer r5 = r5.f32279d
            if (r5 == 0) goto L_0x0027
            java.nio.ByteBuffer r0 = r4.f32279d
            if (r0 == 0) goto L_0x0027
            int r0 = r0.position()
            int r5 = r5.remaining()
            int r0 = r0 + r5
            r5 = 3072000(0x2ee000, float:4.304789E-39)
            if (r0 <= r5) goto L_0x0027
            return r3
        L_0x0027:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: E3.C6461i.Q(y3.f):boolean");
    }

    public boolean P(f fVar) {
        C5950a.a(!fVar.M());
        C5950a.a(!fVar.C());
        C5950a.a(!fVar.D());
        if (!Q(fVar)) {
            return false;
        }
        int i10 = this.f34804k;
        this.f34804k = i10 + 1;
        if (i10 == 0) {
            this.f32281f = fVar.f32281f;
            if (fVar.F()) {
                I(1);
            }
        }
        ByteBuffer byteBuffer = fVar.f32279d;
        if (byteBuffer != null) {
            K(byteBuffer.remaining());
            this.f32279d.put(byteBuffer);
        }
        this.f34803j = fVar.f32281f;
        return true;
    }

    public long R() {
        return this.f32281f;
    }

    public long S() {
        return this.f34803j;
    }

    public int T() {
        return this.f34804k;
    }

    public boolean U() {
        return this.f34804k > 0;
    }

    public void V(int i10) {
        C5950a.a(i10 > 0);
        this.f34805l = i10;
    }

    public void v() {
        super.v();
        this.f34804k = 0;
    }
}
