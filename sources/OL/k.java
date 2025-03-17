package ol;

import E1.I;
import E1.a0;
import G1.C4504g;
import O0.g1;
import O0.h1;
import QJ.Q;
import U0.A1;
import U0.C4883j;
import U0.C4889m;
import U0.C4892n0;
import U0.C4895p;
import U0.C4912y;
import U0.F1;
import U0.M0;
import XH.C16807N;
import XH.y;
import androidx.compose.ui.d;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.L;
import m0.C5544h;
import m0.C5546i;
import m0.C5570z;
import nI.C17631a;
import nI.p;
import nI.q;
import p1.C5747v0;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a=\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\t\u0010\n\u001a@\u0010\u0014\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000f2\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0011H@¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0019²\u0006\u000e\u0010\u0016\u001a\u00020\r8\n@\nX\u0002²\u0006\f\u0010\u0018\u001a\u00020\u00178\nX\u0002"}, d2 = {"Landroidx/compose/ui/d;", "modifier", "Lol/e;", "colors", "LO0/g1;", "scrollBehavior", "Lkotlin/Function0;", "LXH/N;", "content", "e", "(Landroidx/compose/ui/d;Lol/e;LO0/g1;LnI/p;LU0/m;II)V", "LO0/h1;", "state", "", "velocity", "Lm0/z;", "flingAnimationSpec", "Lm0/i;", "snapAnimationSpec", "Lc2/y;", "n", "(LO0/h1;FLm0/z;Lm0/i;LdI/e;)Ljava/lang/Object;", "heightOffsetLimit", "Lp1/v0;", "appBarContainerColor", "uicomposables_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class k {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.uicomposables.FlexibleTopBarKt$FlexibleTopBar$1$1", f = "FlexibleTopBar.kt", l = {}, m = "invokeSuspend")
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f100537c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ g1 f100538d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C4892n0 f100539e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(g1 g1Var, C4892n0 n0Var, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f100538d = g1Var;
            this.f100539e = n0Var;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f100538d, this.f100539e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x000e, code lost:
            r2 = r2.getState();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r2) {
            /*
                r1 = this;
                eI.C17187b.f()
                int r0 = r1.f100537c
                if (r0 != 0) goto L_0x0040
                XH.y.b(r2)
                O0.g1 r2 = r1.f100538d
                if (r2 == 0) goto L_0x001d
                O0.h1 r2 = r2.getState()
                if (r2 == 0) goto L_0x001d
                float r2 = r2.e()
                java.lang.Float r2 = kotlin.coroutines.jvm.internal.b.d(r2)
                goto L_0x001e
            L_0x001d:
                r2 = 0
            L_0x001e:
                U0.n0 r0 = r1.f100539e
                float r0 = ol.k.f(r0)
                boolean r2 = kotlin.jvm.internal.C17542s.c(r2, r0)
                if (r2 != 0) goto L_0x003d
                O0.g1 r2 = r1.f100538d
                if (r2 == 0) goto L_0x003d
                O0.h1 r2 = r2.getState()
                if (r2 == 0) goto L_0x003d
                U0.n0 r0 = r1.f100539e
                float r0 = ol.k.f(r0)
                r2.i(r0)
            L_0x003d:
                XH.N r2 = XH.C16807N.f139792a
                return r2
            L_0x0040:
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r2.<init>(r0)
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: ol.k.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f100540a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ g1 f100541b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C4892n0 f100542c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements I {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ g1 f100543a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C4892n0 f100544b;

            a(g1 g1Var, C4892n0 n0Var) {
                this.f100543a = g1Var;
                this.f100544b = n0Var;
            }

            /* access modifiers changed from: private */
            public static final C16807N c(a0 a0Var, float f10, a0.a aVar) {
                C17542s.j(aVar, "$this$layout");
                a0.a.i(aVar, a0Var, 0, (int) f10, 0.0f, 4, (Object) null);
                return C16807N.f139792a;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:2:0x0031, code lost:
                r0 = r0.getState();
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final E1.J i(E1.K r10, java.util.List<? extends E1.H> r11, long r12) {
                /*
                    r9 = this;
                    java.lang.String r0 = "$this$Layout"
                    kotlin.jvm.internal.C17542s.j(r10, r0)
                    java.lang.String r0 = "measurables"
                    kotlin.jvm.internal.C17542s.j(r11, r0)
                    java.lang.Object r11 = YH.C16877v.w0(r11)
                    E1.H r11 = (E1.H) r11
                    r6 = 14
                    r7 = 0
                    r2 = 0
                    r3 = 0
                    r4 = 0
                    r5 = 0
                    r0 = r12
                    long r0 = c2.C5267b.d(r0, r2, r3, r4, r5, r6, r7)
                    E1.a0 r11 = r11.i0(r0)
                    U0.n0 r0 = r9.f100544b
                    int r1 = r11.z0()
                    float r1 = (float) r1
                    r2 = -1
                    float r2 = (float) r2
                    float r1 = r1 * r2
                    ol.k.g(r0, r1)
                    O0.g1 r0 = r9.f100543a
                    if (r0 == 0) goto L_0x003c
                    O0.h1 r0 = r0.getState()
                    if (r0 == 0) goto L_0x003c
                    float r0 = r0.d()
                    goto L_0x003d
                L_0x003c:
                    r0 = 0
                L_0x003d:
                    int r1 = r11.z0()
                    float r1 = (float) r1
                    float r1 = r1 + r0
                    int r1 = pI.C17752b.e(r1)
                    int r3 = c2.C5267b.l(r12)
                    r12 = 0
                    int r4 = tI.C17978n.e(r1, r12)
                    ol.l r6 = new ol.l
                    r6.<init>(r11, r0)
                    r7 = 4
                    r8 = 0
                    r5 = 0
                    r2 = r10
                    E1.J r10 = E1.K.v0(r2, r3, r4, r5, r6, r7, r8)
                    return r10
                */
                throw new UnsupportedOperationException("Method not decompiled: ol.k.b.a.i(E1.K, java.util.List, long):E1.J");
            }
        }

        b(p<? super C4889m, ? super Integer, C16807N> pVar, g1 g1Var, C4892n0 n0Var) {
            this.f100540a = pVar;
            this.f100541b = g1Var;
            this.f100542c = n0Var;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(123572950, i10, -1, "com.ingka.ikea.app.uicomposables.FlexibleTopBar.<anonymous> (FlexibleTopBar.kt:103)");
                }
                p<C4889m, Integer, C16807N> pVar = this.f100540a;
                mVar.W(-1354336399);
                boolean V10 = mVar.V(this.f100541b);
                g1 g1Var = this.f100541b;
                C4892n0 n0Var = this.f100542c;
                Object D10 = mVar.D();
                if (V10 || D10 == C4889m.f14007a.a()) {
                    D10 = new a(g1Var, n0Var);
                    mVar.u(D10);
                }
                I i11 = (I) D10;
                mVar.P();
                d.a aVar = androidx.compose.ui.d.f18749a;
                int a10 = C4883j.a(mVar, 0);
                C4912y s10 = mVar.s();
                androidx.compose.ui.d e10 = androidx.compose.ui.c.e(mVar, aVar);
                C4504g.a aVar2 = C4504g.f6515W;
                C17631a<C4504g> a11 = aVar2.a();
                if (mVar.m() == null) {
                    C4883j.c();
                }
                mVar.I();
                if (mVar.i()) {
                    mVar.p(a11);
                } else {
                    mVar.t();
                }
                C4889m a12 = F1.a(mVar);
                F1.c(a12, i11, aVar2.c());
                F1.c(a12, s10, aVar2.e());
                p<C4504g, Integer, C16807N> b10 = aVar2.b();
                if (a12.i() || !C17542s.e(a12.D(), Integer.valueOf(a10))) {
                    a12.u(Integer.valueOf(a10));
                    a12.w(Integer.valueOf(a10), b10);
                }
                F1.c(a12, e10, aVar2.d());
                pVar.invoke(mVar, 0);
                mVar.x();
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

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LQJ/Q;", "", "velocity", "LXH/N;", "<anonymous>", "(LQJ/Q;F)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.uicomposables.FlexibleTopBarKt$FlexibleTopBar$appBarDragModifier$2$1", f = "FlexibleTopBar.kt", l = {87}, m = "invokeSuspend")
    static final class c extends l implements q<Q, Float, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f100545c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ float f100546d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ g1 f100547e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(g1 g1Var, C17164e<? super c> eVar) {
            super(3, eVar);
            this.f100547e = g1Var;
        }

        public final Object i(Q q10, float f10, C17164e<? super C16807N> eVar) {
            c cVar = new c(this.f100547e, eVar);
            cVar.f100546d = f10;
            return cVar.invokeSuspend(C16807N.f139792a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return i((Q) obj, ((Number) obj2).floatValue(), (C17164e) obj3);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f100545c;
            if (i10 == 0) {
                y.b(obj);
                float f11 = this.f100546d;
                h1 state = this.f100547e.getState();
                C5570z<Float> c10 = this.f100547e.c();
                C5546i<Float> d10 = this.f100547e.d();
                this.f100546d = f11;
                this.f100545c = 1;
                if (k.n(state, f11, c10, d10, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.app.uicomposables.FlexibleTopBarKt", f = "FlexibleTopBar.kt", l = {143, 159}, m = "settleAppBar")
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f100548c;

        /* renamed from: d  reason: collision with root package name */
        Object f100549d;

        /* renamed from: e  reason: collision with root package name */
        Object f100550e;

        /* renamed from: f  reason: collision with root package name */
        Object f100551f;

        /* renamed from: g  reason: collision with root package name */
        Object f100552g;

        /* renamed from: h  reason: collision with root package name */
        Object f100553h;

        /* renamed from: i  reason: collision with root package name */
        float f100554i;

        /* renamed from: j  reason: collision with root package name */
        /* synthetic */ Object f100555j;

        /* renamed from: k  reason: collision with root package name */
        int f100556k;

        d(C17164e<? super d> eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f100555j = obj;
            this.f100556k |= Integer.MIN_VALUE;
            return k.n((h1) null, 0.0f, (C5570z<Float>) null, (C5546i<Float>) null, this);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v0, resolved type: nI.q} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void e(androidx.compose.ui.d r33, ol.e r34, O0.g1 r35, nI.p<? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r36, U0.C4889m r37, int r38, int r39) {
        /*
            r4 = r36
            r5 = r38
            java.lang.String r0 = "content"
            kotlin.jvm.internal.C17542s.j(r4, r0)
            r0 = 1786783547(0x6a80273b, float:7.746388E25)
            r1 = r37
            U0.m r1 = r1.k(r0)
            r2 = r39 & 1
            if (r2 == 0) goto L_0x001c
            r3 = r5 | 6
            r6 = r3
            r3 = r33
            goto L_0x0030
        L_0x001c:
            r3 = r5 & 6
            if (r3 != 0) goto L_0x002d
            r3 = r33
            boolean r6 = r1.V(r3)
            if (r6 == 0) goto L_0x002a
            r6 = 4
            goto L_0x002b
        L_0x002a:
            r6 = 2
        L_0x002b:
            r6 = r6 | r5
            goto L_0x0030
        L_0x002d:
            r3 = r33
            r6 = r5
        L_0x0030:
            r7 = r5 & 48
            if (r7 != 0) goto L_0x0049
            r7 = r39 & 2
            if (r7 != 0) goto L_0x0043
            r7 = r34
            boolean r8 = r1.V(r7)
            if (r8 == 0) goto L_0x0045
            r8 = 32
            goto L_0x0047
        L_0x0043:
            r7 = r34
        L_0x0045:
            r8 = 16
        L_0x0047:
            r6 = r6 | r8
            goto L_0x004b
        L_0x0049:
            r7 = r34
        L_0x004b:
            r14 = r39 & 4
            r15 = 256(0x100, float:3.59E-43)
            if (r14 == 0) goto L_0x0056
            r6 = r6 | 384(0x180, float:5.38E-43)
            r13 = r35
            goto L_0x0067
        L_0x0056:
            r8 = r5 & 384(0x180, float:5.38E-43)
            r13 = r35
            if (r8 != 0) goto L_0x0067
            boolean r8 = r1.V(r13)
            if (r8 == 0) goto L_0x0064
            r8 = r15
            goto L_0x0066
        L_0x0064:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0066:
            r6 = r6 | r8
        L_0x0067:
            r8 = r39 & 8
            if (r8 == 0) goto L_0x006f
            r6 = r6 | 3072(0xc00, float:4.305E-42)
        L_0x006d:
            r12 = r6
            goto L_0x0080
        L_0x006f:
            r8 = r5 & 3072(0xc00, float:4.305E-42)
            if (r8 != 0) goto L_0x006d
            boolean r8 = r1.F(r4)
            if (r8 == 0) goto L_0x007c
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x007e
        L_0x007c:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x007e:
            r6 = r6 | r8
            goto L_0x006d
        L_0x0080:
            r6 = r12 & 1171(0x493, float:1.641E-42)
            r8 = 1170(0x492, float:1.64E-42)
            if (r6 != r8) goto L_0x0096
            boolean r6 = r1.l()
            if (r6 != 0) goto L_0x008d
            goto L_0x0096
        L_0x008d:
            r1.L()
            r2 = r3
            r20 = r7
            r3 = r13
            goto L_0x022f
        L_0x0096:
            r1.G()
            r6 = r5 & 1
            r11 = 0
            if (r6 == 0) goto L_0x00b2
            boolean r6 = r1.O()
            if (r6 == 0) goto L_0x00a5
            goto L_0x00b2
        L_0x00a5:
            r1.L()
            r2 = r39 & 2
            if (r2 == 0) goto L_0x00ae
            r12 = r12 & -113(0xffffffffffffff8f, float:NaN)
        L_0x00ae:
            r2 = r3
            r3 = r7
            r14 = r13
            goto L_0x00dc
        L_0x00b2:
            if (r2 == 0) goto L_0x00b7
            androidx.compose.ui.d$a r2 = androidx.compose.ui.d.f18749a
            goto L_0x00b8
        L_0x00b7:
            r2 = r3
        L_0x00b8:
            r3 = r39 & 2
            if (r3 == 0) goto L_0x00d3
            ol.f r6 = ol.f.f100525a
            r3 = 384(0x180, float:5.38E-43)
            r16 = 3
            r7 = 0
            r9 = 0
            r11 = r1
            r17 = r12
            r12 = r3
            r13 = r16
            ol.e r3 = r6.a(r7, r9, r11, r12, r13)
            r12 = r17 & -113(0xffffffffffffff8f, float:NaN)
            goto L_0x00d6
        L_0x00d3:
            r17 = r12
            r3 = r7
        L_0x00d6:
            if (r14 == 0) goto L_0x00da
            r14 = 0
            goto L_0x00dc
        L_0x00da:
            r14 = r35
        L_0x00dc:
            r1.y()
            boolean r6 = U0.C4895p.J()
            if (r6 == 0) goto L_0x00eb
            r6 = -1
            java.lang.String r7 = "com.ingka.ikea.app.uicomposables.FlexibleTopBar (FlexibleTopBar.kt:54)"
            U0.C4895p.S(r0, r12, r6, r7)
        L_0x00eb:
            r0 = -2035758193(0xffffffff86a8cb8f, float:-6.349368E-35)
            r1.W(r0)
            java.lang.Object r0 = r1.D()
            U0.m$a r16 = U0.C4889m.f14007a
            java.lang.Object r6 = r16.a()
            r7 = 0
            if (r0 != r6) goto L_0x0105
            U0.n0 r0 = U0.D0.a(r7)
            r1.u(r0)
        L_0x0105:
            U0.n0 r0 = (U0.C4892n0) r0
            r1.P()
            float r6 = f(r0)
            java.lang.Float r6 = java.lang.Float.valueOf(r6)
            r8 = -2035755290(0xffffffff86a8d6e6, float:-6.351034E-35)
            r1.W(r8)
            r13 = r12 & 896(0x380, float:1.256E-42)
            r11 = 0
            r10 = 1
            if (r13 != r15) goto L_0x0120
            r8 = r10
            goto L_0x0121
        L_0x0120:
            r8 = r11
        L_0x0121:
            java.lang.Object r9 = r1.D()
            if (r8 != 0) goto L_0x0130
            java.lang.Object r8 = r16.a()
            if (r9 != r8) goto L_0x012e
            goto L_0x0130
        L_0x012e:
            r8 = 0
            goto L_0x0139
        L_0x0130:
            ol.k$a r9 = new ol.k$a
            r8 = 0
            r9.<init>(r14, r0, r8)
            r1.u(r9)
        L_0x0139:
            nI.p r9 = (nI.p) r9
            r1.P()
            U0.P.g(r6, r9, r1, r11)
            if (r14 == 0) goto L_0x014e
            O0.h1 r6 = r14.getState()
            if (r6 == 0) goto L_0x014e
            float r6 = r6.f()
            goto L_0x014f
        L_0x014e:
            r6 = r7
        L_0x014f:
            r9 = 1008981770(0x3c23d70a, float:0.01)
            int r6 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r6 <= 0) goto L_0x0159
            r6 = 1065353216(0x3f800000, float:1.0)
            goto L_0x015a
        L_0x0159:
            r6 = r7
        L_0x015a:
            r9 = r12 & 112(0x70, float:1.57E-43)
            long r17 = r3.a(r6, r1, r9)
            r6 = 1137180672(0x43c80000, float:400.0)
            r9 = 5
            m0.o0 r9 = m0.C5548j.h(r7, r6, r8, r9, r8)
            r12 = 432(0x1b0, float:6.05E-43)
            r19 = 8
            java.lang.String r20 = "color"
            r21 = 0
            r6 = r17
            r8 = r9
            r9 = r20
            r10 = r21
            r11 = r1
            r20 = r3
            r3 = r13
            r13 = r19
            U0.A1 r6 = l0.u.a(r6, r8, r9, r10, r11, r12, r13)
            r7 = -2035722448(0xffffffff86a95730, float:-6.3698845E-35)
            r1.W(r7)
            if (r14 == 0) goto L_0x01f5
            boolean r7 = r14.b()
            if (r7 != 0) goto L_0x01f5
            androidx.compose.ui.d$a r22 = androidx.compose.ui.d.f18749a
            p0.v r24 = p0.v.Vertical
            r7 = -2035717294(0xffffffff86a96b52, float:-6.372843E-35)
            r1.W(r7)
            if (r3 != r15) goto L_0x019c
            r11 = 1
            goto L_0x019d
        L_0x019c:
            r11 = 0
        L_0x019d:
            java.lang.Object r7 = r1.D()
            if (r11 != 0) goto L_0x01a9
            java.lang.Object r8 = r16.a()
            if (r7 != r8) goto L_0x01b1
        L_0x01a9:
            ol.g r7 = new ol.g
            r7.<init>(r14)
            r1.u(r7)
        L_0x01b1:
            nI.l r7 = (nI.C17642l) r7
            r1.P()
            r8 = 0
            p0.r r23 = p0.q.i(r7, r1, r8)
            r7 = -2035713505(0xffffffff86a97a1f, float:-6.3750175E-35)
            r1.W(r7)
            if (r3 != r15) goto L_0x01c5
            r11 = 1
            goto L_0x01c6
        L_0x01c5:
            r11 = r8
        L_0x01c6:
            java.lang.Object r3 = r1.D()
            if (r11 != 0) goto L_0x01d2
            java.lang.Object r7 = r16.a()
            if (r3 != r7) goto L_0x01db
        L_0x01d2:
            ol.k$c r3 = new ol.k$c
            r7 = 0
            r3.<init>(r14, r7)
            r1.u(r3)
        L_0x01db:
            r29 = r3
            nI.q r29 = (nI.q) r29
            r1.P()
            r31 = 188(0xbc, float:2.63E-43)
            r32 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r30 = 0
            androidx.compose.ui.d r3 = p0.q.h(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            goto L_0x01f7
        L_0x01f5:
            androidx.compose.ui.d$a r3 = androidx.compose.ui.d.f18749a
        L_0x01f7:
            r1.P()
            androidx.compose.ui.d r3 = r2.s(r3)
            long r8 = h(r6)
            ol.k$b r6 = new ol.k$b
            r6.<init>(r4, r14, r0)
            r0 = 54
            r7 = 123572950(0x75d92d6, float:1.6669343E-34)
            r10 = 1
            c1.a r15 = c1.c.e(r7, r10, r6, r1, r0)
            r17 = 12582912(0xc00000, float:1.7632415E-38)
            r18 = 122(0x7a, float:1.71E-43)
            r7 = 0
            r10 = 0
            r12 = 0
            r13 = 0
            r0 = 0
            r6 = r3
            r19 = r14
            r14 = r0
            r16 = r1
            O0.P0.a(r6, r7, r8, r10, r12, r13, r14, r15, r16, r17, r18)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x022d
            U0.C4895p.R()
        L_0x022d:
            r3 = r19
        L_0x022f:
            U0.Y0 r7 = r1.n()
            if (r7 == 0) goto L_0x0247
            ol.h r8 = new ol.h
            r0 = r8
            r1 = r2
            r2 = r20
            r4 = r36
            r5 = r38
            r6 = r39
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r8)
        L_0x0247:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ol.k.e(androidx.compose.ui.d, ol.e, O0.g1, nI.p, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final float f(C4892n0 n0Var) {
        return n0Var.a();
    }

    /* access modifiers changed from: private */
    public static final void g(C4892n0 n0Var, float f10) {
        n0Var.n(f10);
    }

    private static final long h(A1<C5747v0> a12) {
        return a12.getValue().y();
    }

    /* access modifiers changed from: private */
    public static final C16807N i(g1 g1Var, float f10) {
        h1 state = g1Var.getState();
        state.h(state.d() + f10);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N j(androidx.compose.ui.d dVar, e eVar, g1 g1Var, p pVar, int i10, int i11, C4889m mVar, int i12) {
        e(dVar, eVar, g1Var, pVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object n(O0.h1 r30, float r31, m0.C5570z<java.lang.Float> r32, m0.C5546i<java.lang.Float> r33, dI.C17164e<? super c2.y> r34) {
        /*
            r0 = r30
            r10 = r31
            r11 = r32
            r12 = r34
            boolean r1 = r12 instanceof ol.k.d
            if (r1 == 0) goto L_0x001c
            r1 = r12
            ol.k$d r1 = (ol.k.d) r1
            int r2 = r1.f100556k
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x001c
            int r2 = r2 - r3
            r1.f100556k = r2
        L_0x001a:
            r13 = r1
            goto L_0x0022
        L_0x001c:
            ol.k$d r1 = new ol.k$d
            r1.<init>(r12)
            goto L_0x001a
        L_0x0022:
            java.lang.Object r1 = r13.f100555j
            java.lang.Object r14 = eI.C17187b.f()
            int r2 = r13.f100556k
            r15 = 2
            r9 = 1
            r8 = 0
            if (r2 == 0) goto L_0x0078
            if (r2 == r9) goto L_0x0055
            if (r2 != r15) goto L_0x004d
            java.lang.Object r0 = r13.f100552g
            kotlin.jvm.internal.L r0 = (kotlin.jvm.internal.L) r0
            java.lang.Object r2 = r13.f100551f
            dI.e r2 = (dI.C17164e) r2
            java.lang.Object r2 = r13.f100550e
            m0.i r2 = (m0.C5546i) r2
            java.lang.Object r2 = r13.f100549d
            m0.z r2 = (m0.C5570z) r2
            java.lang.Object r2 = r13.f100548c
            O0.h1 r2 = (O0.h1) r2
            XH.y.b(r1)
            r15 = r8
            goto L_0x0157
        L_0x004d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0055:
            float r0 = r13.f100554i
            java.lang.Object r2 = r13.f100553h
            kotlin.jvm.internal.L r2 = (kotlin.jvm.internal.L) r2
            java.lang.Object r2 = r13.f100552g
            kotlin.jvm.internal.L r2 = (kotlin.jvm.internal.L) r2
            java.lang.Object r3 = r13.f100551f
            dI.e r3 = (dI.C17164e) r3
            java.lang.Object r4 = r13.f100550e
            m0.i r4 = (m0.C5546i) r4
            java.lang.Object r5 = r13.f100549d
            m0.z r5 = (m0.C5570z) r5
            java.lang.Object r6 = r13.f100548c
            O0.h1 r6 = (O0.h1) r6
            XH.y.b(r1)
            r10 = r0
            r12 = r3
            r11 = r5
            r0 = r6
            goto L_0x00f1
        L_0x0078:
            XH.y.b(r1)
            float r1 = r30.b()
            r2 = 1008981770(0x3c23d70a, float:0.01)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 < 0) goto L_0x0165
            float r1 = r30.b()
            r2 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 != 0) goto L_0x0092
            goto L_0x0165
        L_0x0092:
            kotlin.jvm.internal.L r7 = new kotlin.jvm.internal.L
            r7.<init>()
            r7.f144345a = r10
            if (r11 == 0) goto L_0x00f3
            float r1 = java.lang.Math.abs(r31)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto L_0x00f3
            kotlin.jvm.internal.L r5 = new kotlin.jvm.internal.L
            r5.<init>()
            r16 = 28
            r17 = 0
            r1 = 0
            r3 = 0
            r18 = 0
            r20 = 0
            r2 = r31
            r15 = r5
            r5 = r18
            r21 = r7
            r7 = r20
            r8 = r16
            r16 = r14
            r14 = r9
            r9 = r17
            m0.k r1 = m0.C5552l.c(r1, r2, r3, r5, r7, r8, r9)
            ol.i r4 = new ol.i
            r8 = r21
            r4.<init>(r15, r0, r8)
            r13.f100548c = r0
            r13.f100549d = r11
            r9 = r33
            r13.f100550e = r9
            r13.f100551f = r12
            r13.f100552g = r8
            r13.f100553h = r15
            r13.f100554i = r10
            r13.f100556k = r14
            r3 = 0
            r6 = 2
            r7 = 0
            r2 = r32
            r5 = r13
            java.lang.Object r1 = m0.t0.h(r1, r2, r3, r4, r5, r6, r7)
            r14 = r16
            if (r1 != r14) goto L_0x00ef
            return r14
        L_0x00ef:
            r2 = r8
            r4 = r9
        L_0x00f1:
            r1 = r2
            goto L_0x00f8
        L_0x00f3:
            r9 = r33
            r8 = r7
            r1 = r8
            r4 = r9
        L_0x00f8:
            if (r4 == 0) goto L_0x0159
            float r2 = r0.d()
            r15 = 0
            int r2 = (r2 > r15 ? 1 : (r2 == r15 ? 0 : -1))
            if (r2 >= 0) goto L_0x015a
            float r2 = r0.d()
            float r3 = r0.e()
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 <= 0) goto L_0x015a
            float r21 = r0.d()
            r28 = 30
            r29 = 0
            r22 = 0
            r23 = 0
            r25 = 0
            r27 = 0
            m0.k r2 = m0.C5552l.c(r21, r22, r23, r25, r27, r28, r29)
            float r3 = r0.b()
            r5 = 1056964608(0x3f000000, float:0.5)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 >= 0) goto L_0x012f
            r8 = r15
            goto L_0x0133
        L_0x012f:
            float r8 = r0.e()
        L_0x0133:
            java.lang.Float r3 = kotlin.coroutines.jvm.internal.b.d(r8)
            ol.j r6 = new ol.j
            r6.<init>(r0)
            r13.f100548c = r0
            r13.f100549d = r11
            r13.f100550e = r4
            r13.f100551f = r12
            r13.f100552g = r1
            r13.f100554i = r10
            r0 = 2
            r13.f100556k = r0
            r5 = 0
            r8 = 4
            r9 = 0
            r7 = r13
            java.lang.Object r0 = m0.t0.j(r2, r3, r4, r5, r6, r7, r8, r9)
            if (r0 != r14) goto L_0x0156
            return r14
        L_0x0156:
            r0 = r1
        L_0x0157:
            r1 = r0
            goto L_0x015a
        L_0x0159:
            r15 = 0
        L_0x015a:
            float r0 = r1.f144345a
            long r0 = c2.z.a(r15, r0)
            c2.y r0 = c2.y.b(r0)
            return r0
        L_0x0165:
            c2.y$a r0 = c2.y.f23066b
            long r0 = r0.a()
            c2.y r0 = c2.y.b(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ol.k.n(O0.h1, float, m0.z, m0.i, dI.e):java.lang.Object");
    }

    /* access modifiers changed from: private */
    public static final C16807N o(h1 h1Var, C5544h hVar) {
        C17542s.j(hVar, "$this$animateTo");
        h1Var.h(((Number) hVar.e()).floatValue());
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N p(L l10, h1 h1Var, L l11, C5544h hVar) {
        C17542s.j(hVar, "$this$animateDecay");
        float floatValue = ((Number) hVar.e()).floatValue() - l10.f144345a;
        float d10 = h1Var.d();
        h1Var.h(d10 + floatValue);
        float abs = Math.abs(d10 - h1Var.d());
        l10.f144345a = ((Number) hVar.e()).floatValue();
        l11.f144345a = ((Number) hVar.f()).floatValue();
        if (Math.abs(floatValue - abs) > 0.5f) {
            hVar.a();
        }
        return C16807N.f139792a;
    }
}
