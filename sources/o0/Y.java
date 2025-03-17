package O0;

import U0.C4889m;
import U0.C4895p;
import U0.C4910x;
import U0.I0;
import U0.M0;
import XH.C16807N;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import nI.C17631a;
import nI.p;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a;\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\t\u0010\n\u001a\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\f\u0010\r\" \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0000X\u0004¢\u0006\f\n\u0004\b\t\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"LO0/t;", "colorScheme", "LO0/C0;", "shapes", "LO0/i1;", "typography", "Lkotlin/Function0;", "LXH/N;", "content", "a", "(LO0/t;LO0/C0;LO0/i1;LnI/p;LU0/m;II)V", "LH0/V;", "b", "(LO0/t;LU0/m;I)LH0/V;", "LU0/I0;", "", "LU0/I0;", "getLocalUsingExpressiveTheme", "()LU0/I0;", "LocalUsingExpressiveTheme", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class Y {

    /* renamed from: a  reason: collision with root package name */
    private static final I0<Boolean> f10187a = C4910x.f(a.f10188c);

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends C17544u implements C17631a<Boolean> {

        /* renamed from: c  reason: collision with root package name */
        public static final a f10188c = new a();

        a() {
            super(0);
        }

        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "a", "(LU0/m;I)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ i1 f10189c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f10190d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(i1 i1Var, p<? super C4889m, ? super Integer, C16807N> pVar) {
            super(2);
            this.f10189c = i1Var;
            this.f10190d = pVar;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-1066563262, i10, -1, "androidx.compose.material3.MaterialTheme.<anonymous> (MaterialTheme.kt:68)");
                }
                d1.a(this.f10189c.a(), this.f10190d, mVar, 0);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class c extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C4753t f10191c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C0 f10192d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ i1 f10193e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f10194f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f10195g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ int f10196h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C4753t tVar, C0 c02, i1 i1Var, p<? super C4889m, ? super Integer, C16807N> pVar, int i10, int i11) {
            super(2);
            this.f10191c = tVar;
            this.f10192d = c02;
            this.f10193e = i1Var;
            this.f10194f = pVar;
            this.f10195g = i10;
            this.f10196h = i11;
        }

        public final void a(C4889m mVar, int i10) {
            Y.a(this.f10191c, this.f10192d, this.f10193e, this.f10194f, mVar, M0.a(this.f10195g | 1), this.f10196h);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:55:0x008e, code lost:
        if ((r15 & 4) != 0) goto L_0x0090;
     */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x012a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(O0.C4753t r9, O0.C0 r10, O0.i1 r11, nI.p<? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r12, U0.C4889m r13, int r14, int r15) {
        /*
            r0 = -2127166334(0xffffffff81360482, float:-3.3431355E-38)
            U0.m r13 = r13.k(r0)
            r1 = r14 & 6
            if (r1 != 0) goto L_0x001a
            r1 = r15 & 1
            if (r1 != 0) goto L_0x0017
            boolean r1 = r13.V(r9)
            if (r1 == 0) goto L_0x0017
            r1 = 4
            goto L_0x0018
        L_0x0017:
            r1 = 2
        L_0x0018:
            r1 = r1 | r14
            goto L_0x001b
        L_0x001a:
            r1 = r14
        L_0x001b:
            r2 = r14 & 48
            if (r2 != 0) goto L_0x002f
            r2 = r15 & 2
            if (r2 != 0) goto L_0x002c
            boolean r2 = r13.V(r10)
            if (r2 == 0) goto L_0x002c
            r2 = 32
            goto L_0x002e
        L_0x002c:
            r2 = 16
        L_0x002e:
            r1 = r1 | r2
        L_0x002f:
            r2 = r14 & 384(0x180, float:5.38E-43)
            if (r2 != 0) goto L_0x0043
            r2 = r15 & 4
            if (r2 != 0) goto L_0x0040
            boolean r2 = r13.V(r11)
            if (r2 == 0) goto L_0x0040
            r2 = 256(0x100, float:3.59E-43)
            goto L_0x0042
        L_0x0040:
            r2 = 128(0x80, float:1.794E-43)
        L_0x0042:
            r1 = r1 | r2
        L_0x0043:
            r2 = r15 & 8
            if (r2 == 0) goto L_0x004a
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x005a
        L_0x004a:
            r2 = r14 & 3072(0xc00, float:4.305E-42)
            if (r2 != 0) goto L_0x005a
            boolean r2 = r13.F(r12)
            if (r2 == 0) goto L_0x0057
            r2 = 2048(0x800, float:2.87E-42)
            goto L_0x0059
        L_0x0057:
            r2 = 1024(0x400, float:1.435E-42)
        L_0x0059:
            r1 = r1 | r2
        L_0x005a:
            r2 = r1 & 1171(0x493, float:1.641E-42)
            r3 = 1170(0x492, float:1.64E-42)
            if (r2 != r3) goto L_0x006f
            boolean r2 = r13.l()
            if (r2 != 0) goto L_0x0067
            goto L_0x006f
        L_0x0067:
            r13.L()
        L_0x006a:
            r2 = r9
            r3 = r10
            r4 = r11
            goto L_0x012f
        L_0x006f:
            r13.G()
            r2 = r14 & 1
            if (r2 == 0) goto L_0x0094
            boolean r2 = r13.O()
            if (r2 == 0) goto L_0x007d
            goto L_0x0094
        L_0x007d:
            r13.L()
            r2 = r15 & 1
            if (r2 == 0) goto L_0x0086
            r1 = r1 & -15
        L_0x0086:
            r2 = r15 & 2
            if (r2 == 0) goto L_0x008c
            r1 = r1 & -113(0xffffffffffffff8f, float:NaN)
        L_0x008c:
            r2 = r15 & 4
            if (r2 == 0) goto L_0x0092
        L_0x0090:
            r1 = r1 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x0092:
            r8 = r1
            goto L_0x00b8
        L_0x0094:
            r2 = r15 & 1
            r3 = 6
            if (r2 == 0) goto L_0x00a1
            O0.X r9 = O0.X.f10101a
            O0.t r9 = r9.a(r13, r3)
            r1 = r1 & -15
        L_0x00a1:
            r2 = r15 & 2
            if (r2 == 0) goto L_0x00ad
            O0.X r10 = O0.X.f10101a
            O0.C0 r10 = r10.b(r13, r3)
            r1 = r1 & -113(0xffffffffffffff8f, float:NaN)
        L_0x00ad:
            r2 = r15 & 4
            if (r2 == 0) goto L_0x0092
            O0.X r11 = O0.X.f10101a
            O0.i1 r11 = r11.c(r13, r3)
            goto L_0x0090
        L_0x00b8:
            r13.y()
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x00c7
            r1 = -1
            java.lang.String r2 = "androidx.compose.material3.MaterialTheme (MaterialTheme.kt:55)"
            U0.C4895p.S(r0, r8, r1, r2)
        L_0x00c7:
            r6 = 0
            r7 = 7
            r1 = 0
            r2 = 0
            r3 = 0
            r5 = r13
            n0.G r0 = O0.C4756u0.d(r1, r2, r3, r5, r6, r7)
            r1 = r8 & 14
            H0.V r1 = b(r9, r13, r1)
            U0.I0 r2 = O0.C4755u.g()
            U0.J0 r3 = r2.d(r9)
            U0.I0 r2 = androidx.compose.foundation.j.a()
            U0.J0 r4 = r2.d(r0)
            U0.I0 r0 = N0.p.d()
            O0.v r2 = O0.C4757v.f11547b
            U0.J0 r5 = r0.d(r2)
            U0.I0 r0 = O0.D0.c()
            U0.J0 r6 = r0.d(r10)
            U0.I0 r0 = H0.W.b()
            U0.J0 r7 = r0.d(r1)
            U0.I0 r0 = O0.j1.b()
            U0.J0 r8 = r0.d(r11)
            U0.J0[] r0 = new U0.J0[]{r3, r4, r5, r6, r7, r8}
            O0.Y$b r1 = new O0.Y$b
            r1.<init>(r11, r12)
            r2 = 54
            r3 = -1066563262(0xffffffffc06d8942, float:-3.7115026)
            r4 = 1
            c1.a r1 = c1.c.e(r3, r4, r1, r13, r2)
            int r2 = U0.J0.f13770i
            r2 = r2 | 48
            U0.C4910x.b(r0, r1, r13, r2)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x006a
            U0.C4895p.R()
            goto L_0x006a
        L_0x012f:
            U0.Y0 r9 = r13.n()
            if (r9 == 0) goto L_0x0141
            O0.Y$c r10 = new O0.Y$c
            r1 = r10
            r5 = r12
            r6 = r14
            r7 = r15
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r9.a(r10)
        L_0x0141:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: O0.Y.a(O0.t, O0.C0, O0.i1, nI.p, U0.m, int, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: H0.V} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: H0.V} */
    /* JADX WARNING: type inference failed for: r13v2 */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0023, code lost:
        if (r13 == U0.C4889m.f14007a.a()) goto L_0x0025;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final H0.V b(O0.C4753t r11, U0.C4889m r12, int r13) {
        /*
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x000f
            r0 = -1
            java.lang.String r1 = "androidx.compose.material3.rememberTextSelectionColors (MaterialTheme.kt:159)"
            r2 = 1866455512(0x6f3fd9d8, float:5.9374994E28)
            U0.C4895p.S(r2, r13, r0, r1)
        L_0x000f:
            long r0 = r11.B()
            boolean r11 = r12.e(r0)
            java.lang.Object r13 = r12.D()
            if (r11 != 0) goto L_0x0025
            U0.m$a r11 = U0.C4889m.f14007a
            java.lang.Object r11 = r11.a()
            if (r13 != r11) goto L_0x003e
        L_0x0025:
            H0.V r13 = new H0.V
            r9 = 14
            r10 = 0
            r5 = 1053609165(0x3ecccccd, float:0.4)
            r6 = 0
            r7 = 0
            r8 = 0
            r3 = r0
            long r6 = p1.C5747v0.o(r3, r5, r6, r7, r8, r9, r10)
            r8 = 0
            r3 = r13
            r4 = r0
            r3.<init>(r4, r6, r8)
            r12.u(r13)
        L_0x003e:
            H0.V r13 = (H0.V) r13
            boolean r11 = U0.C4895p.J()
            if (r11 == 0) goto L_0x0049
            U0.C4895p.R()
        L_0x0049:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: O0.Y.b(O0.t, U0.m, int):H0.V");
    }
}
