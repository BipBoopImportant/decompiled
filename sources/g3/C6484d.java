package G3;

import G3.C6478B;
import G3.C6485e;
import I3.x;
import androidx.media3.exoplayer.Y;
import q3.A;
import q3.C5807s;
import t3.C5950a;
import t3.N;
import y3.f;
import z3.D;
import z3.J;

/* renamed from: G3.d  reason: case insensitive filesystem */
public final class C6484d implements C6478B, C6478B.a {

    /* renamed from: a  reason: collision with root package name */
    public final C6478B f35834a;

    /* renamed from: b  reason: collision with root package name */
    private C6478B.a f35835b;

    /* renamed from: c  reason: collision with root package name */
    private a[] f35836c = new a[0];

    /* renamed from: d  reason: collision with root package name */
    private long f35837d;

    /* renamed from: e  reason: collision with root package name */
    long f35838e;

    /* renamed from: f  reason: collision with root package name */
    long f35839f;

    /* renamed from: g  reason: collision with root package name */
    private C6485e.b f35840g;

    /* renamed from: G3.d$a */
    private final class a implements a0 {

        /* renamed from: a  reason: collision with root package name */
        public final a0 f35841a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f35842b;

        public a(a0 a0Var) {
            this.f35841a = a0Var;
        }

        public void a() {
            this.f35842b = false;
        }

        public boolean f() {
            return !C6484d.this.m() && this.f35841a.f();
        }

        public void g() {
            this.f35841a.g();
        }

        public int h(D d10, f fVar, int i10) {
            if (C6484d.this.m()) {
                return -3;
            }
            if (this.f35842b) {
                fVar.I(4);
                return -4;
            }
            long d11 = C6484d.this.d();
            int h10 = this.f35841a.h(d10, fVar, i10);
            if (h10 == -5) {
                C5807s sVar = (C5807s) C5950a.e(d10.f32383b);
                int i11 = sVar.f28222G;
                if (!(i11 == 0 && sVar.f28223H == 0)) {
                    C6484d dVar = C6484d.this;
                    int i12 = 0;
                    if (dVar.f35838e != 0) {
                        i11 = 0;
                    }
                    if (dVar.f35839f == Long.MIN_VALUE) {
                        i12 = sVar.f28223H;
                    }
                    d10.f32383b = sVar.b().Y(i11).Z(i12).M();
                }
                return -5;
            }
            long j10 = C6484d.this.f35839f;
            if (j10 == Long.MIN_VALUE || ((h10 != -4 || fVar.f32281f < j10) && (h10 != -3 || d11 != Long.MIN_VALUE || fVar.f32280e))) {
                return h10;
            }
            fVar.v();
            fVar.I(4);
            this.f35842b = true;
            return -4;
        }

        public int i(long j10) {
            if (C6484d.this.m()) {
                return -3;
            }
            return this.f35841a.i(j10);
        }
    }

    public C6484d(C6478B b10, boolean z10, long j10, long j11) {
        this.f35834a = b10;
        this.f35837d = z10 ? j10 : -9223372036854775807L;
        this.f35838e = j10;
        this.f35839f = j11;
    }

    private J k(long j10, J j11) {
        long q10 = N.q(j11.f32396a, 0, j10 - this.f35838e);
        long j12 = j11.f32397b;
        long j13 = this.f35839f;
        long q11 = N.q(j12, 0, j13 == Long.MIN_VALUE ? Long.MAX_VALUE : j13 - j10);
        return (q10 == j11.f32396a && q11 == j11.f32397b) ? j11 : new J(q10, q11);
    }

    private static boolean r(long j10, x[] xVarArr) {
        if (j10 != 0) {
            for (x xVar : xVarArr) {
                if (xVar != null) {
                    C5807s l10 = xVar.l();
                    if (!A.a(l10.f28244o, l10.f28240k)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean a() {
        return this.f35834a.a();
    }

    public boolean b(Y y10) {
        return this.f35834a.b(y10);
    }

    public long c() {
        long c10 = this.f35834a.c();
        if (c10 != Long.MIN_VALUE) {
            long j10 = this.f35839f;
            if (j10 == Long.MIN_VALUE || c10 < j10) {
                return c10;
            }
        }
        return Long.MIN_VALUE;
    }

    public long d() {
        long d10 = this.f35834a.d();
        if (d10 != Long.MIN_VALUE) {
            long j10 = this.f35839f;
            if (j10 == Long.MIN_VALUE || d10 < j10) {
                return d10;
            }
        }
        return Long.MIN_VALUE;
    }

    public void e(long j10) {
        this.f35834a.e(j10);
    }

    public void f(C6478B b10) {
        if (this.f35840g == null) {
            ((C6478B.a) C5950a.e(this.f35835b)).f(this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005e, code lost:
        if (r3 > r5) goto L_0x0061;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long g(I3.x[] r13, boolean[] r14, G3.a0[] r15, boolean[] r16, long r17) {
        /*
            r12 = this;
            r0 = r12
            r1 = r15
            int r2 = r1.length
            G3.d$a[] r2 = new G3.C6484d.a[r2]
            r0.f35836c = r2
            int r2 = r1.length
            G3.a0[] r2 = new G3.a0[r2]
            r10 = 0
            r3 = r10
        L_0x000c:
            int r4 = r1.length
            r11 = 0
            if (r3 >= r4) goto L_0x0021
            G3.d$a[] r4 = r0.f35836c
            r5 = r1[r3]
            G3.d$a r5 = (G3.C6484d.a) r5
            r4[r3] = r5
            if (r5 == 0) goto L_0x001c
            G3.a0 r11 = r5.f35841a
        L_0x001c:
            r2[r3] = r11
            int r3 = r3 + 1
            goto L_0x000c
        L_0x0021:
            G3.B r3 = r0.f35834a
            r4 = r13
            r5 = r14
            r6 = r2
            r7 = r16
            r8 = r17
            long r3 = r3.g(r4, r5, r6, r7, r8)
            boolean r5 = r12.m()
            if (r5 == 0) goto L_0x0043
            long r5 = r0.f35838e
            int r7 = (r17 > r5 ? 1 : (r17 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x0043
            r7 = r13
            boolean r5 = r(r5, r13)
            if (r5 == 0) goto L_0x0043
            r5 = r3
            goto L_0x0048
        L_0x0043:
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x0048:
            r0.f35837d = r5
            int r5 = (r3 > r17 ? 1 : (r3 == r17 ? 0 : -1))
            if (r5 == 0) goto L_0x0063
            long r5 = r0.f35838e
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 < 0) goto L_0x0061
            long r5 = r0.f35839f
            r7 = -9223372036854775808
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r7 == 0) goto L_0x0063
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 > 0) goto L_0x0061
            goto L_0x0063
        L_0x0061:
            r5 = r10
            goto L_0x0064
        L_0x0063:
            r5 = 1
        L_0x0064:
            t3.C5950a.g(r5)
        L_0x0067:
            int r5 = r1.length
            if (r10 >= r5) goto L_0x008d
            r5 = r2[r10]
            if (r5 != 0) goto L_0x0073
            G3.d$a[] r5 = r0.f35836c
            r5[r10] = r11
            goto L_0x0084
        L_0x0073:
            G3.d$a[] r6 = r0.f35836c
            r7 = r6[r10]
            if (r7 == 0) goto L_0x007d
            G3.a0 r7 = r7.f35841a
            if (r7 == r5) goto L_0x0084
        L_0x007d:
            G3.d$a r7 = new G3.d$a
            r7.<init>(r5)
            r6[r10] = r7
        L_0x0084:
            G3.d$a[] r5 = r0.f35836c
            r5 = r5[r10]
            r1[r10] = r5
            int r10 = r10 + 1
            goto L_0x0067
        L_0x008d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: G3.C6484d.g(I3.x[], boolean[], G3.a0[], boolean[], long):long");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0032, code lost:
        if (r0 > r6) goto L_0x0035;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long i(long r6) {
        /*
            r5 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5.f35837d = r0
            G3.d$a[] r0 = r5.f35836c
            int r1 = r0.length
            r2 = 0
            r3 = r2
        L_0x000c:
            if (r3 >= r1) goto L_0x0018
            r4 = r0[r3]
            if (r4 == 0) goto L_0x0015
            r4.a()
        L_0x0015:
            int r3 = r3 + 1
            goto L_0x000c
        L_0x0018:
            G3.B r0 = r5.f35834a
            long r0 = r0.i(r6)
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 == 0) goto L_0x0034
            long r6 = r5.f35838e
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 < 0) goto L_0x0035
            long r6 = r5.f35839f
            r3 = -9223372036854775808
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 == 0) goto L_0x0034
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 > 0) goto L_0x0035
        L_0x0034:
            r2 = 1
        L_0x0035:
            t3.C5950a.g(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: G3.C6484d.i(long):long");
    }

    public void j(C6478B.a aVar, long j10) {
        this.f35835b = aVar;
        this.f35834a.j(this, j10);
    }

    public long l() {
        if (m()) {
            long j10 = this.f35837d;
            this.f35837d = -9223372036854775807L;
            long l10 = l();
            return l10 != -9223372036854775807L ? l10 : j10;
        }
        long l11 = this.f35834a.l();
        if (l11 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        boolean z10 = false;
        C5950a.g(l11 >= this.f35838e);
        long j11 = this.f35839f;
        if (j11 == Long.MIN_VALUE || l11 <= j11) {
            z10 = true;
        }
        C5950a.g(z10);
        return l11;
    }

    /* access modifiers changed from: package-private */
    public boolean m() {
        return this.f35837d != -9223372036854775807L;
    }

    /* renamed from: n */
    public void h(C6478B b10) {
        ((C6478B.a) C5950a.e(this.f35835b)).h(this);
    }

    public void o() {
        C6485e.b bVar = this.f35840g;
        if (bVar == null) {
            this.f35834a.o();
            return;
        }
        throw bVar;
    }

    public long p(long j10, J j11) {
        long j12 = this.f35838e;
        if (j10 == j12) {
            return j12;
        }
        return this.f35834a.p(j10, k(j10, j11));
    }

    public void q(C6485e.b bVar) {
        this.f35840g = bVar;
    }

    public k0 s() {
        return this.f35834a.s();
    }

    public void t(long j10, long j11) {
        this.f35838e = j10;
        this.f35839f = j11;
    }

    public void u(long j10, boolean z10) {
        this.f35834a.u(j10, z10);
    }
}
