package G3;

import G3.C6479C;
import J3.C6569b;
import q3.C5791b;
import q3.J;
import q3.w;
import t3.N;

/* renamed from: G3.z  reason: case insensitive filesystem */
public final class C6505z extends m0 {

    /* renamed from: m  reason: collision with root package name */
    private final boolean f36016m;

    /* renamed from: n  reason: collision with root package name */
    private final J.c f36017n;

    /* renamed from: o  reason: collision with root package name */
    private final J.b f36018o;

    /* renamed from: p  reason: collision with root package name */
    private a f36019p;

    /* renamed from: q  reason: collision with root package name */
    private C6504y f36020q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f36021r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f36022s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f36023t;

    /* renamed from: G3.z$a */
    private static final class a extends C6501v {

        /* renamed from: h  reason: collision with root package name */
        public static final Object f36024h = new Object();

        /* renamed from: f  reason: collision with root package name */
        private final Object f36025f;
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public final Object f36026g;

        private a(J j10, Object obj, Object obj2) {
            super(j10);
            this.f36025f = obj;
            this.f36026g = obj2;
        }

        public static a u(w wVar) {
            return new a(new b(wVar), J.c.f27915q, f36024h);
        }

        public static a v(J j10, Object obj, Object obj2) {
            return new a(j10, obj, obj2);
        }

        public int b(Object obj) {
            Object obj2;
            J j10 = this.f35993e;
            if (f36024h.equals(obj) && (obj2 = this.f36026g) != null) {
                obj = obj2;
            }
            return j10.b(obj);
        }

        public J.b g(int i10, J.b bVar, boolean z10) {
            this.f35993e.g(i10, bVar, z10);
            if (N.d(bVar.f27903b, this.f36026g) && z10) {
                bVar.f27903b = f36024h;
            }
            return bVar;
        }

        public Object m(int i10) {
            Object m10 = this.f35993e.m(i10);
            return N.d(m10, this.f36026g) ? f36024h : m10;
        }

        public J.c o(int i10, J.c cVar, long j10) {
            this.f35993e.o(i10, cVar, j10);
            if (N.d(cVar.f27925a, this.f36025f)) {
                cVar.f27925a = J.c.f27915q;
            }
            return cVar;
        }

        public a t(J j10) {
            return new a(j10, this.f36025f, this.f36026g);
        }
    }

    /* renamed from: G3.z$b */
    public static final class b extends J {

        /* renamed from: e  reason: collision with root package name */
        private final w f36027e;

        public b(w wVar) {
            this.f36027e = wVar;
        }

        public int b(Object obj) {
            return obj == a.f36024h ? 0 : -1;
        }

        public J.b g(int i10, J.b bVar, boolean z10) {
            Object obj = null;
            Integer num = z10 ? 0 : null;
            if (z10) {
                obj = a.f36024h;
            }
            bVar.t(num, obj, 0, -9223372036854775807L, 0, C5791b.f28078g, true);
            return bVar;
        }

        public int i() {
            return 1;
        }

        public Object m(int i10) {
            return a.f36024h;
        }

        public J.c o(int i10, J.c cVar, long j10) {
            cVar.g(J.c.f27915q, this.f36027e, (Object) null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, (w.g) null, 0, -9223372036854775807L, 0, 0, 0);
            J.c cVar2 = cVar;
            cVar2.f27935k = true;
            return cVar2;
        }

        public int p() {
            return 1;
        }
    }

    public C6505z(C6479C c10, boolean z10) {
        super(c10);
        this.f36016m = z10 && c10.k();
        this.f36017n = new J.c();
        this.f36018o = new J.b();
        J m10 = c10.m();
        if (m10 != null) {
            this.f36019p = a.v(m10, (Object) null, (Object) null);
            this.f36023t = true;
            return;
        }
        this.f36019p = a.u(c10.e());
    }

    private Object T(Object obj) {
        return (this.f36019p.f36026g == null || !this.f36019p.f36026g.equals(obj)) ? obj : a.f36024h;
    }

    private Object U(Object obj) {
        return (this.f36019p.f36026g == null || !obj.equals(a.f36024h)) ? obj : this.f36019p.f36026g;
    }

    private boolean W(long j10) {
        C6504y yVar = this.f36020q;
        int b10 = this.f36019p.b(yVar.f36007a.f35620a);
        if (b10 == -1) {
            return false;
        }
        long j11 = this.f36019p.f(b10, this.f36018o).f27905d;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            j10 = Math.max(0, j11 - 1);
        }
        yVar.t(j10);
        return true;
    }

    public void A() {
        this.f36022s = false;
        this.f36021r = false;
        super.A();
    }

    /* access modifiers changed from: protected */
    public C6479C.b I(C6479C.b bVar) {
        return bVar.a(T(bVar.f35620a));
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void P(q3.J r15) {
        /*
            r14 = this;
            boolean r0 = r14.f36022s
            if (r0 == 0) goto L_0x0019
            G3.z$a r0 = r14.f36019p
            G3.z$a r15 = r0.t(r15)
            r14.f36019p = r15
            G3.y r15 = r14.f36020q
            if (r15 == 0) goto L_0x00b1
            long r0 = r15.m()
            r14.W(r0)
            goto L_0x00b1
        L_0x0019:
            boolean r0 = r15.q()
            if (r0 == 0) goto L_0x0036
            boolean r0 = r14.f36023t
            if (r0 == 0) goto L_0x002a
            G3.z$a r0 = r14.f36019p
            G3.z$a r15 = r0.t(r15)
            goto L_0x0032
        L_0x002a:
            java.lang.Object r0 = q3.J.c.f27915q
            java.lang.Object r1 = G3.C6505z.a.f36024h
            G3.z$a r15 = G3.C6505z.a.v(r15, r0, r1)
        L_0x0032:
            r14.f36019p = r15
            goto L_0x00b1
        L_0x0036:
            q3.J$c r0 = r14.f36017n
            r1 = 0
            r15.n(r1, r0)
            q3.J$c r0 = r14.f36017n
            long r2 = r0.c()
            q3.J$c r0 = r14.f36017n
            java.lang.Object r0 = r0.f27925a
            G3.y r4 = r14.f36020q
            if (r4 == 0) goto L_0x0074
            long r4 = r4.n()
            G3.z$a r6 = r14.f36019p
            G3.y r7 = r14.f36020q
            G3.C$b r7 = r7.f36007a
            java.lang.Object r7 = r7.f35620a
            q3.J$b r8 = r14.f36018o
            r6.h(r7, r8)
            q3.J$b r6 = r14.f36018o
            long r6 = r6.n()
            long r6 = r6 + r4
            G3.z$a r4 = r14.f36019p
            q3.J$c r5 = r14.f36017n
            q3.J$c r1 = r4.n(r1, r5)
            long r4 = r1.c()
            int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r1 == 0) goto L_0x0074
            r12 = r6
            goto L_0x0075
        L_0x0074:
            r12 = r2
        L_0x0075:
            q3.J$c r9 = r14.f36017n
            q3.J$b r10 = r14.f36018o
            r11 = 0
            r8 = r15
            android.util.Pair r1 = r8.j(r9, r10, r11, r12)
            java.lang.Object r2 = r1.first
            java.lang.Object r1 = r1.second
            java.lang.Long r1 = (java.lang.Long) r1
            long r3 = r1.longValue()
            boolean r1 = r14.f36023t
            if (r1 == 0) goto L_0x0094
            G3.z$a r0 = r14.f36019p
            G3.z$a r15 = r0.t(r15)
            goto L_0x0098
        L_0x0094:
            G3.z$a r15 = G3.C6505z.a.v(r15, r0, r2)
        L_0x0098:
            r14.f36019p = r15
            G3.y r15 = r14.f36020q
            if (r15 == 0) goto L_0x00b1
            boolean r0 = r14.W(r3)
            if (r0 == 0) goto L_0x00b1
            G3.C$b r15 = r15.f36007a
            java.lang.Object r0 = r15.f35620a
            java.lang.Object r0 = r14.U(r0)
            G3.C$b r15 = r15.a(r0)
            goto L_0x00b2
        L_0x00b1:
            r15 = 0
        L_0x00b2:
            r0 = 1
            r14.f36023t = r0
            r14.f36022s = r0
            G3.z$a r0 = r14.f36019p
            r14.z(r0)
            if (r15 == 0) goto L_0x00c9
            G3.y r0 = r14.f36020q
            java.lang.Object r0 = t3.C5950a.e(r0)
            G3.y r0 = (G3.C6504y) r0
            r0.k(r15)
        L_0x00c9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: G3.C6505z.P(q3.J):void");
    }

    public void R() {
        if (!this.f36016m) {
            this.f36021r = true;
            Q();
        }
    }

    /* renamed from: S */
    public C6504y a(C6479C.b bVar, C6569b bVar2, long j10) {
        C6504y yVar = new C6504y(bVar, bVar2, j10);
        yVar.w(this.f35949k);
        if (this.f36022s) {
            yVar.k(bVar.a(U(bVar.f35620a)));
        } else {
            this.f36020q = yVar;
            if (!this.f36021r) {
                this.f36021r = true;
                Q();
            }
        }
        return yVar;
    }

    public J V() {
        return this.f36019p;
    }

    public void j() {
    }

    public void l(w wVar) {
        if (this.f36023t) {
            this.f36019p = this.f36019p.t(new i0(this.f36019p.f35993e, wVar));
        } else {
            this.f36019p = a.u(wVar);
        }
        this.f35949k.l(wVar);
    }

    public void o(C6478B b10) {
        ((C6504y) b10).v();
        if (b10 == this.f36020q) {
            this.f36020q = null;
        }
    }
}
