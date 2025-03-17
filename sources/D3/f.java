package D3;

import D3.c;
import android.graphics.Bitmap;
import androidx.media3.exoplayer.C5228e;
import androidx.media3.exoplayer.image.ImageOutput;
import androidx.media3.exoplayer.v0;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import q3.C5807s;
import t3.C5950a;
import t3.I;
import z3.D;

public class f extends C5228e {

    /* renamed from: A  reason: collision with root package name */
    private int f33818A = 1;

    /* renamed from: B  reason: collision with root package name */
    private C5807s f33819B;

    /* renamed from: C  reason: collision with root package name */
    private c f33820C;

    /* renamed from: D  reason: collision with root package name */
    private y3.f f33821D;

    /* renamed from: E  reason: collision with root package name */
    private ImageOutput f33822E;

    /* renamed from: F  reason: collision with root package name */
    private Bitmap f33823F;

    /* renamed from: G  reason: collision with root package name */
    private boolean f33824G;

    /* renamed from: H  reason: collision with root package name */
    private b f33825H;

    /* renamed from: I  reason: collision with root package name */
    private b f33826I;

    /* renamed from: J  reason: collision with root package name */
    private int f33827J;

    /* renamed from: r  reason: collision with root package name */
    private final c.a f33828r;

    /* renamed from: s  reason: collision with root package name */
    private final y3.f f33829s = y3.f.N();

    /* renamed from: t  reason: collision with root package name */
    private final ArrayDeque<a> f33830t = new ArrayDeque<>();

    /* renamed from: u  reason: collision with root package name */
    private boolean f33831u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f33832v;

    /* renamed from: w  reason: collision with root package name */
    private a f33833w = a.f33837c;

    /* renamed from: x  reason: collision with root package name */
    private long f33834x = -9223372036854775807L;

    /* renamed from: y  reason: collision with root package name */
    private long f33835y = -9223372036854775807L;

    /* renamed from: z  reason: collision with root package name */
    private int f33836z = 0;

    private static final class a {

        /* renamed from: c  reason: collision with root package name */
        public static final a f33837c = new a(-9223372036854775807L, -9223372036854775807L);

        /* renamed from: a  reason: collision with root package name */
        public final long f33838a;

        /* renamed from: b  reason: collision with root package name */
        public final long f33839b;

        public a(long j10, long j11) {
            this.f33838a = j10;
            this.f33839b = j11;
        }
    }

    private static class b {

        /* renamed from: a  reason: collision with root package name */
        private final int f33840a;

        /* renamed from: b  reason: collision with root package name */
        private final long f33841b;

        /* renamed from: c  reason: collision with root package name */
        private Bitmap f33842c;

        public b(int i10, long j10) {
            this.f33840a = i10;
            this.f33841b = j10;
        }

        public long a() {
            return this.f33841b;
        }

        public Bitmap b() {
            return this.f33842c;
        }

        public int c() {
            return this.f33840a;
        }

        public boolean d() {
            return this.f33842c != null;
        }

        public void e(Bitmap bitmap) {
            this.f33842c = bitmap;
        }
    }

    public f(c.a aVar, ImageOutput imageOutput) {
        super(4);
        this.f33828r = aVar;
        this.f33822E = x0(imageOutput);
    }

    private void A0(int i10) {
        this.f33818A = Math.min(this.f33818A, i10);
    }

    private void B0(long j10, y3.f fVar) {
        boolean z10 = true;
        if (fVar.D()) {
            this.f33824G = true;
            return;
        }
        b bVar = new b(this.f33827J, fVar.f32281f);
        this.f33826I = bVar;
        this.f33827J++;
        if (!this.f33824G) {
            long a10 = bVar.a();
            boolean z11 = a10 - 30000 <= j10 && j10 <= 30000 + a10;
            b bVar2 = this.f33825H;
            boolean z12 = bVar2 != null && bVar2.a() <= j10 && j10 < a10;
            boolean z02 = z0((b) C5950a.i(this.f33826I));
            if (!z11 && !z12 && !z02) {
                z10 = false;
            }
            this.f33824G = z10;
            if (z12 && !z11) {
                return;
            }
        }
        this.f33825H = this.f33826I;
        this.f33826I = null;
    }

    private void C0(long j10) {
        this.f33834x = j10;
        while (!this.f33830t.isEmpty() && j10 >= this.f33830t.peek().f33838a) {
            this.f33833w = this.f33830t.removeFirst();
        }
    }

    private void E0() {
        this.f33821D = null;
        this.f33836z = 0;
        this.f33835y = -9223372036854775807L;
        c cVar = this.f33820C;
        if (cVar != null) {
            cVar.release();
            this.f33820C = null;
        }
    }

    private void F0(ImageOutput imageOutput) {
        this.f33822E = x0(imageOutput);
    }

    private boolean G0() {
        boolean z10 = getState() == 2;
        int i10 = this.f33818A;
        if (i10 == 0) {
            return z10;
        }
        if (i10 == 1) {
            return true;
        }
        if (i10 == 3) {
            return false;
        }
        throw new IllegalStateException();
    }

    private boolean t0(C5807s sVar) {
        int b10 = this.f33828r.b(sVar);
        return b10 == v0.v(4) || b10 == v0.v(3);
    }

    private Bitmap u0(int i10) {
        C5950a.i(this.f33823F);
        int width = this.f33823F.getWidth() / ((C5807s) C5950a.i(this.f33819B)).f28226K;
        int height = this.f33823F.getHeight() / ((C5807s) C5950a.i(this.f33819B)).f28227L;
        int i11 = this.f33819B.f28226K;
        return Bitmap.createBitmap(this.f33823F, (i10 % i11) * width, (i10 / i11) * height, width, height);
    }

    private boolean v0(long j10, long j11) {
        if (this.f33823F != null && this.f33825H == null) {
            return false;
        }
        if (this.f33818A == 0 && getState() != 2) {
            return false;
        }
        if (this.f33823F == null) {
            C5950a.i(this.f33820C);
            e a10 = this.f33820C.a();
            if (a10 == null) {
                return false;
            }
            if (((e) C5950a.i(a10)).D()) {
                if (this.f33836z == 3) {
                    E0();
                    C5950a.i(this.f33819B);
                    y0();
                } else {
                    ((e) C5950a.i(a10)).J();
                    if (this.f33830t.isEmpty()) {
                        this.f33832v = true;
                    }
                }
                return false;
            }
            C5950a.j(a10.f33817e, "Non-EOS buffer came back from the decoder without bitmap.");
            this.f33823F = a10.f33817e;
            ((e) C5950a.i(a10)).J();
        }
        if (!this.f33824G || this.f33823F == null || this.f33825H == null) {
            return false;
        }
        C5950a.i(this.f33819B);
        C5807s sVar = this.f33819B;
        int i10 = sVar.f28226K;
        boolean z10 = ((i10 == 1 && sVar.f28227L == 1) || i10 == -1 || sVar.f28227L == -1) ? false : true;
        if (!this.f33825H.d()) {
            b bVar = this.f33825H;
            bVar.e(z10 ? u0(bVar.c()) : (Bitmap) C5950a.i(this.f33823F));
        }
        if (!D0(j10, j11, (Bitmap) C5950a.i(this.f33825H.b()), this.f33825H.a())) {
            return false;
        }
        C0(((b) C5950a.i(this.f33825H)).a());
        this.f33818A = 3;
        if (!z10 || ((b) C5950a.i(this.f33825H)).c() == (((C5807s) C5950a.i(this.f33819B)).f28227L * ((C5807s) C5950a.i(this.f33819B)).f28226K) - 1) {
            this.f33823F = null;
        }
        this.f33825H = this.f33826I;
        this.f33826I = null;
        return true;
    }

    private boolean w0(long j10) {
        if (this.f33824G && this.f33825H != null) {
            return false;
        }
        D X10 = X();
        c cVar = this.f33820C;
        if (cVar == null || this.f33836z == 3 || this.f33831u) {
            return false;
        }
        if (this.f33821D == null) {
            y3.f fVar = (y3.f) cVar.e();
            this.f33821D = fVar;
            if (fVar == null) {
                return false;
            }
        }
        if (this.f33836z == 2) {
            C5950a.i(this.f33821D);
            this.f33821D.I(4);
            ((c) C5950a.i(this.f33820C)).f(this.f33821D);
            this.f33821D = null;
            this.f33836z = 3;
            return false;
        }
        int q02 = q0(X10, this.f33821D, 0);
        if (q02 == -5) {
            this.f33819B = (C5807s) C5950a.i(X10.f32383b);
            this.f33836z = 2;
            return true;
        } else if (q02 == -4) {
            this.f33821D.L();
            ByteBuffer byteBuffer = this.f33821D.f32279d;
            boolean z10 = (byteBuffer != null && byteBuffer.remaining() > 0) || ((y3.f) C5950a.i(this.f33821D)).D();
            if (z10) {
                ((c) C5950a.i(this.f33820C)).f((y3.f) C5950a.i(this.f33821D));
                this.f33827J = 0;
            }
            B0(j10, (y3.f) C5950a.i(this.f33821D));
            if (((y3.f) C5950a.i(this.f33821D)).D()) {
                this.f33831u = true;
                this.f33821D = null;
                return false;
            }
            this.f33835y = Math.max(this.f33835y, ((y3.f) C5950a.i(this.f33821D)).f32281f);
            if (z10) {
                this.f33821D = null;
            } else {
                ((y3.f) C5950a.i(this.f33821D)).v();
            }
            return !this.f33824G;
        } else if (q02 == -3) {
            return false;
        } else {
            throw new IllegalStateException();
        }
    }

    private static ImageOutput x0(ImageOutput imageOutput) {
        return imageOutput == null ? ImageOutput.f43001a : imageOutput;
    }

    private void y0() {
        if (t0(this.f33819B)) {
            c cVar = this.f33820C;
            if (cVar != null) {
                cVar.release();
            }
            this.f33820C = this.f33828r.a();
            return;
        }
        throw T(new d("Provided decoder factory can't create decoder for format."), this.f33819B, 4005);
    }

    private boolean z0(b bVar) {
        return ((C5807s) C5950a.i(this.f33819B)).f28226K == -1 || this.f33819B.f28227L == -1 || bVar.c() == (((C5807s) C5950a.i(this.f33819B)).f28227L * this.f33819B.f28226K) - 1;
    }

    /* access modifiers changed from: protected */
    public boolean D0(long j10, long j11, Bitmap bitmap, long j12) {
        long j13 = j12 - j10;
        if (!G0() && j13 >= 30000) {
            return false;
        }
        this.f33822E.onImageAvailable(j12 - this.f33833w.f33839b, bitmap);
        return true;
    }

    public int b(C5807s sVar) {
        return this.f33828r.b(sVar);
    }

    public boolean d() {
        return this.f33832v;
    }

    public boolean f() {
        int i10 = this.f33818A;
        return i10 == 3 || (i10 == 0 && this.f33824G);
    }

    /* access modifiers changed from: protected */
    public void f0() {
        this.f33819B = null;
        this.f33833w = a.f33837c;
        this.f33830t.clear();
        E0();
        this.f33822E.a();
    }

    /* access modifiers changed from: protected */
    public void g0(boolean z10, boolean z11) {
        this.f33818A = z11 ? 1 : 0;
    }

    public String getName() {
        return "ImageRenderer";
    }

    /* access modifiers changed from: protected */
    public void i0(long j10, boolean z10) {
        A0(1);
        this.f33832v = false;
        this.f33831u = false;
        this.f33823F = null;
        this.f33825H = null;
        this.f33826I = null;
        this.f33824G = false;
        this.f33821D = null;
        c cVar = this.f33820C;
        if (cVar != null) {
            cVar.flush();
        }
        this.f33830t.clear();
    }

    /* access modifiers changed from: protected */
    public void j0() {
        E0();
    }

    public void k(long j10, long j11) {
        if (!this.f33832v) {
            if (this.f33819B == null) {
                D X10 = X();
                this.f33829s.v();
                int q02 = q0(X10, this.f33829s, 2);
                if (q02 == -5) {
                    this.f33819B = (C5807s) C5950a.i(X10.f32383b);
                    y0();
                } else if (q02 == -4) {
                    C5950a.g(this.f33829s.D());
                    this.f33831u = true;
                    this.f33832v = true;
                    return;
                } else {
                    return;
                }
            }
            try {
                I.a("drainAndFeedDecoder");
                while (v0(j10, j11)) {
                }
                while (w0(j10)) {
                }
                I.b();
            } catch (d e10) {
                throw T(e10, (C5807s) null, 4003);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void l0() {
        E0();
        A0(1);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0026, code lost:
        if (r2 >= r5) goto L_0x0036;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void o0(q3.C5807s[] r5, long r6, long r8, G3.C6479C.b r10) {
        /*
            r4 = this;
            super.o0(r5, r6, r8, r10)
            D3.f$a r5 = r4.f33833w
            long r5 = r5.f33839b
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 == 0) goto L_0x0036
            java.util.ArrayDeque<D3.f$a> r5 = r4.f33830t
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L_0x0029
            long r5 = r4.f33835y
            int r7 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r7 == 0) goto L_0x0036
            long r2 = r4.f33834x
            int r7 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r7 == 0) goto L_0x0029
            int r5 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r5 < 0) goto L_0x0029
            goto L_0x0036
        L_0x0029:
            java.util.ArrayDeque<D3.f$a> r5 = r4.f33830t
            D3.f$a r6 = new D3.f$a
            long r0 = r4.f33835y
            r6.<init>(r0, r8)
            r5.add(r6)
            goto L_0x003d
        L_0x0036:
            D3.f$a r5 = new D3.f$a
            r5.<init>(r0, r8)
            r4.f33833w = r5
        L_0x003d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: D3.f.o0(q3.s[], long, long, G3.C$b):void");
    }

    public void x(int i10, Object obj) {
        if (i10 != 15) {
            super.x(i10, obj);
        } else {
            F0(obj instanceof ImageOutput ? (ImageOutput) obj : null);
        }
    }
}
