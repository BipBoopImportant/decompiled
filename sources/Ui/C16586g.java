package UI;

import PI.C16195e;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import uJ.C18096U;
import uJ.C18113f0;
import uJ.C18121j0;

/* renamed from: UI.g  reason: case insensitive filesystem */
public final class C16586g {

    /* renamed from: a  reason: collision with root package name */
    private final C16195e f139026a;

    /* renamed from: UI.g$a */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final C18096U f139027a;

        /* renamed from: b  reason: collision with root package name */
        private final int f139028b;

        public a(C18096U u10, int i10) {
            this.f139027a = u10;
            this.f139028b = i10;
        }

        public final int a() {
            return this.f139028b;
        }

        public final C18096U b() {
            return this.f139027a;
        }
    }

    /* renamed from: UI.g$b */
    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final C18113f0 f139029a;

        /* renamed from: b  reason: collision with root package name */
        private final int f139030b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f139031c;

        public b(C18113f0 f0Var, int i10, boolean z10) {
            this.f139029a = f0Var;
            this.f139030b = i10;
            this.f139031c = z10;
        }

        public final boolean a() {
            return this.f139031c;
        }

        public final int b() {
            return this.f139030b;
        }

        public final C18113f0 c() {
            return this.f139029a;
        }
    }

    public C16586g(C16195e eVar) {
        C17542s.j(eVar, "javaResolverSettings");
        this.f139026a = eVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:62:0x0183  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x018a  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x018c  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01d2  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01e8  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01ee  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0202  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final UI.C16586g.b b(uJ.C18113f0 r19, nI.C17642l<? super java.lang.Integer, UI.C16587h> r20, int r21, UI.p0 r22, boolean r23, boolean r24) {
        /*
            r18 = this;
            r0 = r18
            r1 = r20
            r2 = r22
            r3 = r24
            boolean r4 = UI.q0.a(r22)
            r5 = 0
            r6 = 1
            if (r3 == 0) goto L_0x0015
            if (r23 != 0) goto L_0x0013
            goto L_0x0015
        L_0x0013:
            r7 = r5
            goto L_0x0016
        L_0x0015:
            r7 = r6
        L_0x0016:
            r8 = 0
            if (r4 != 0) goto L_0x0029
            java.util.List r4 = r19.L0()
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L_0x0029
            UI.g$b r1 = new UI.g$b
            r1.<init>(r8, r6, r5)
            return r1
        L_0x0029:
            uJ.y0 r4 = r19.N0()
            DI.h r4 = r4.e()
            if (r4 != 0) goto L_0x0039
            UI.g$b r1 = new UI.g$b
            r1.<init>(r8, r6, r5)
            return r1
        L_0x0039:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r21)
            java.lang.Object r9 = r1.invoke(r9)
            UI.h r9 = (UI.C16587h) r9
            DI.h r4 = UI.s0.f(r4, r9, r2)
            java.lang.Boolean r2 = UI.s0.h(r9, r2)
            if (r4 == 0) goto L_0x0056
            uJ.y0 r10 = r4.k()
            if (r10 != 0) goto L_0x0054
            goto L_0x0056
        L_0x0054:
            r12 = r10
            goto L_0x005b
        L_0x0056:
            uJ.y0 r10 = r19.N0()
            goto L_0x0054
        L_0x005b:
            int r10 = r21 + 1
            java.util.List r11 = r19.L0()
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.List r13 = r12.getParameters()
            java.lang.String r14 = "getParameters(...)"
            kotlin.jvm.internal.C17542s.i(r13, r14)
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.util.Iterator r14 = r11.iterator()
            java.util.Iterator r15 = r13.iterator()
            java.util.ArrayList r6 = new java.util.ArrayList
            r5 = 10
            int r11 = YH.C16877v.y(r11, r5)
            int r13 = YH.C16877v.y(r13, r5)
            int r11 = java.lang.Math.min(r11, r13)
            r6.<init>(r11)
        L_0x0089:
            boolean r11 = r14.hasNext()
            if (r11 == 0) goto L_0x014e
            boolean r11 = r15.hasNext()
            if (r11 == 0) goto L_0x014e
            java.lang.Object r11 = r14.next()
            java.lang.Object r13 = r15.next()
            DI.n0 r13 = (DI.n0) r13
            uJ.E0 r11 = (uJ.E0) r11
            if (r7 != 0) goto L_0x00ac
            UI.g$a r5 = new UI.g$a
            r23 = r7
            r7 = 0
            r5.<init>(r8, r7)
            goto L_0x0100
        L_0x00ac:
            r23 = r7
            boolean r5 = r11.a()
            if (r5 != 0) goto L_0x00c1
            uJ.U r5 = r11.getType()
            uJ.P0 r5 = r5.Q0()
            UI.g$a r5 = r0.d(r5, r1, r10, r3)
            goto L_0x0100
        L_0x00c1:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r10)
            java.lang.Object r5 = r1.invoke(r5)
            UI.h r5 = (UI.C16587h) r5
            UI.k r5 = r5.f()
            UI.k r7 = UI.C16590k.FORCE_FLEXIBILITY
            if (r5 != r7) goto L_0x00f8
            uJ.U r5 = r11.getType()
            uJ.P0 r5 = r5.Q0()
            UI.g$a r7 = new UI.g$a
            uJ.f0 r8 = uJ.C18090N.c(r5)
            r1 = 0
            uJ.f0 r8 = r8.U0(r1)
            uJ.f0 r1 = uJ.C18090N.d(r5)
            r5 = 1
            uJ.f0 r1 = r1.U0(r5)
            uJ.P0 r1 = uJ.C18099X.e(r8, r1)
            r7.<init>(r1, r5)
            r5 = r7
            goto L_0x0100
        L_0x00f8:
            r5 = 1
            UI.g$a r1 = new UI.g$a
            r7 = 0
            r1.<init>(r7, r5)
            r5 = r1
        L_0x0100:
            int r1 = r5.a()
            int r10 = r10 + r1
            uJ.U r1 = r5.b()
            java.lang.String r7 = "getProjectionKind(...)"
            if (r1 == 0) goto L_0x011d
            uJ.U r1 = r5.b()
            uJ.Q0 r5 = r11.c()
            kotlin.jvm.internal.C17542s.i(r5, r7)
            uJ.E0 r7 = zJ.C18755d.k(r1, r5, r13)
            goto L_0x0142
        L_0x011d:
            if (r4 == 0) goto L_0x013a
            boolean r1 = r11.a()
            if (r1 != 0) goto L_0x013a
            uJ.U r1 = r11.getType()
            java.lang.String r5 = "getType(...)"
            kotlin.jvm.internal.C17542s.i(r1, r5)
            uJ.Q0 r5 = r11.c()
            kotlin.jvm.internal.C17542s.i(r5, r7)
            uJ.E0 r7 = zJ.C18755d.k(r1, r5, r13)
            goto L_0x0142
        L_0x013a:
            if (r4 == 0) goto L_0x0141
            uJ.E0 r7 = uJ.M0.s(r13)
            goto L_0x0142
        L_0x0141:
            r7 = 0
        L_0x0142:
            r6.add(r7)
            r1 = r20
            r7 = r23
            r5 = 10
            r8 = 0
            goto L_0x0089
        L_0x014e:
            int r10 = r10 - r21
            if (r4 != 0) goto L_0x016e
            if (r2 != 0) goto L_0x016e
            boolean r1 = r6.isEmpty()
            if (r1 == 0) goto L_0x015b
            goto L_0x0170
        L_0x015b:
            java.util.Iterator r1 = r6.iterator()
        L_0x015f:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0170
            java.lang.Object r3 = r1.next()
            uJ.E0 r3 = (uJ.E0) r3
            if (r3 != 0) goto L_0x016e
            goto L_0x015f
        L_0x016e:
            r7 = 0
            goto L_0x0178
        L_0x0170:
            UI.g$b r1 = new UI.g$b
            r2 = 0
            r7 = 0
            r1.<init>(r7, r10, r2)
            return r1
        L_0x0178:
            EI.h r1 = r19.getAnnotations()
            UI.f r3 = UI.s0.f139073b
            if (r4 == 0) goto L_0x0183
            goto L_0x0184
        L_0x0183:
            r3 = r7
        L_0x0184:
            EI.h r4 = UI.s0.g()
            if (r2 == 0) goto L_0x018c
            r8 = r4
            goto L_0x018d
        L_0x018c:
            r8 = r7
        L_0x018d:
            r4 = 3
            EI.h[] r4 = new EI.C15649h[r4]
            r5 = 0
            r4[r5] = r1
            r1 = 1
            r4[r1] = r3
            r3 = 2
            r4[r3] = r8
            java.util.List r3 = YH.C16877v.s(r4)
            EI.h r3 = UI.s0.e(r3)
            uJ.u0 r11 = uJ.v0.b(r3)
            java.util.List r3 = r19.L0()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r4 = r6.iterator()
            java.util.Iterator r7 = r3.iterator()
            java.util.ArrayList r13 = new java.util.ArrayList
            r8 = 10
            int r6 = YH.C16877v.y(r6, r8)
            int r3 = YH.C16877v.y(r3, r8)
            int r3 = java.lang.Math.min(r6, r3)
            r13.<init>(r3)
        L_0x01c6:
            boolean r3 = r4.hasNext()
            if (r3 == 0) goto L_0x01e6
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L_0x01e6
            java.lang.Object r3 = r4.next()
            java.lang.Object r6 = r7.next()
            uJ.E0 r6 = (uJ.E0) r6
            uJ.E0 r3 = (uJ.E0) r3
            if (r3 != 0) goto L_0x01e1
            goto L_0x01e2
        L_0x01e1:
            r6 = r3
        L_0x01e2:
            r13.add(r6)
            goto L_0x01c6
        L_0x01e6:
            if (r2 == 0) goto L_0x01ee
            boolean r3 = r2.booleanValue()
        L_0x01ec:
            r14 = r3
            goto L_0x01f3
        L_0x01ee:
            boolean r3 = r19.O0()
            goto L_0x01ec
        L_0x01f3:
            r16 = 16
            r17 = 0
            r15 = 0
            uJ.f0 r3 = uJ.C18099X.k(r11, r12, r13, r14, r15, r16, r17)
            boolean r4 = r9.d()
            if (r4 == 0) goto L_0x0206
            uJ.f0 r3 = r0.e(r3)
        L_0x0206:
            if (r2 == 0) goto L_0x020f
            boolean r2 = r9.g()
            if (r2 == 0) goto L_0x020f
            r5 = r1
        L_0x020f:
            UI.g$b r1 = new UI.g$b
            r1.<init>(r3, r10, r5)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: UI.C16586g.b(uJ.f0, nI.l, int, UI.p0, boolean, boolean):UI.g$b");
    }

    static /* synthetic */ b c(C16586g gVar, C18113f0 f0Var, C17642l lVar, int i10, p0 p0Var, boolean z10, boolean z11, int i11, Object obj) {
        return gVar.b(f0Var, lVar, i10, p0Var, (i11 & 8) != 0 ? false : z10, (i11 & 16) != 0 ? false : z11);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0096, code lost:
        if (r13 == null) goto L_0x0098;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final UI.C16586g.a d(uJ.P0 r12, nI.C17642l<? super java.lang.Integer, UI.C16587h> r13, int r14, boolean r15) {
        /*
            r11 = this;
            boolean r0 = uJ.C18100Y.a(r12)
            r1 = 0
            if (r0 == 0) goto L_0x000e
            UI.g$a r12 = new UI.g$a
            r13 = 1
            r12.<init>(r1, r13)
            return r12
        L_0x000e:
            boolean r0 = r12 instanceof uJ.C18087K
            if (r0 == 0) goto L_0x00ad
            boolean r0 = r12 instanceof uJ.C18111e0
            r9 = r12
            uJ.K r9 = (uJ.C18087K) r9
            uJ.f0 r3 = r9.V0()
            UI.p0 r6 = UI.p0.FLEXIBLE_LOWER
            r2 = r11
            r4 = r13
            r5 = r14
            r7 = r0
            r8 = r15
            UI.g$b r10 = r2.b(r3, r4, r5, r6, r7, r8)
            uJ.f0 r3 = r9.W0()
            UI.p0 r6 = UI.p0.FLEXIBLE_UPPER
            UI.g$b r13 = r2.b(r3, r4, r5, r6, r7, r8)
            r10.b()
            r13.b()
            uJ.f0 r14 = r10.c()
            if (r14 != 0) goto L_0x0043
            uJ.f0 r14 = r13.c()
            if (r14 != 0) goto L_0x0043
            goto L_0x00a3
        L_0x0043:
            boolean r14 = r10.a()
            if (r14 != 0) goto L_0x0085
            boolean r14 = r13.a()
            if (r14 == 0) goto L_0x0050
            goto L_0x0085
        L_0x0050:
            if (r0 == 0) goto L_0x006c
            RI.k r1 = new RI.k
            uJ.f0 r12 = r10.c()
            if (r12 != 0) goto L_0x005e
            uJ.f0 r12 = r9.V0()
        L_0x005e:
            uJ.f0 r13 = r13.c()
            if (r13 != 0) goto L_0x0068
            uJ.f0 r13 = r9.W0()
        L_0x0068:
            r1.<init>(r12, r13)
            goto L_0x00a3
        L_0x006c:
            uJ.f0 r12 = r10.c()
            if (r12 != 0) goto L_0x0076
            uJ.f0 r12 = r9.V0()
        L_0x0076:
            uJ.f0 r13 = r13.c()
            if (r13 != 0) goto L_0x0080
            uJ.f0 r13 = r9.W0()
        L_0x0080:
            uJ.P0 r1 = uJ.C18099X.e(r12, r13)
            goto L_0x00a3
        L_0x0085:
            uJ.f0 r13 = r13.c()
            if (r13 == 0) goto L_0x0098
            uJ.f0 r14 = r10.c()
            if (r14 != 0) goto L_0x0092
            r14 = r13
        L_0x0092:
            uJ.P0 r13 = uJ.C18099X.e(r14, r13)
            if (r13 != 0) goto L_0x009f
        L_0x0098:
            uJ.f0 r13 = r10.c()
            kotlin.jvm.internal.C17542s.g(r13)
        L_0x009f:
            uJ.P0 r1 = uJ.O0.d(r12, r13)
        L_0x00a3:
            UI.g$a r12 = new UI.g$a
            int r13 = r10.b()
            r12.<init>(r1, r13)
            goto L_0x00df
        L_0x00ad:
            boolean r0 = r12 instanceof uJ.C18113f0
            if (r0 == 0) goto L_0x00e0
            r2 = r12
            uJ.f0 r2 = (uJ.C18113f0) r2
            UI.p0 r5 = UI.p0.INFLEXIBLE
            r8 = 8
            r9 = 0
            r6 = 0
            r1 = r11
            r3 = r13
            r4 = r14
            r7 = r15
            UI.g$b r13 = c(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            UI.g$a r14 = new UI.g$a
            boolean r15 = r13.a()
            if (r15 == 0) goto L_0x00d3
            uJ.f0 r15 = r13.c()
            uJ.P0 r12 = uJ.O0.d(r12, r15)
            goto L_0x00d7
        L_0x00d3:
            uJ.f0 r12 = r13.c()
        L_0x00d7:
            int r13 = r13.b()
            r14.<init>(r12, r13)
            r12 = r14
        L_0x00df:
            return r12
        L_0x00e0:
            XH.t r12 = new XH.t
            r12.<init>()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: UI.C16586g.d(uJ.P0, nI.l, int, boolean):UI.g$a");
    }

    private final C18113f0 e(C18113f0 f0Var) {
        return this.f139026a.a() ? C18121j0.h(f0Var, true) : new C16589j(f0Var);
    }

    public final C18096U a(C18096U u10, C17642l<? super Integer, C16587h> lVar, boolean z10) {
        C17542s.j(u10, "<this>");
        C17542s.j(lVar, "qualifiers");
        return d(u10.Q0(), lVar, 0, z10).b();
    }
}
