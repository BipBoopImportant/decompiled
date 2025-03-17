package yn;

import O0.C4737k0;
import O0.K;
import QJ.F0;
import QJ.Q;
import QJ.T;
import U0.B;
import U0.C4889m;
import U0.C4895p;
import U0.C4910x;
import U0.J0;
import U0.M0;
import U0.P;
import XH.C16807N;
import XH.y;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.C5100f0;
import c2.h;
import c2.t;
import dI.C17164e;
import dI.C17168i;
import dI.C17169j;
import e.C5281d;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.p;
import nI.q;
import p1.c1;
import s0.C5850V;
import s0.C5861g;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aS\u0010\f\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0001¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lkotlin/Function0;", "LXH/N;", "drawerContent", "Landroidx/compose/ui/d;", "modifier", "LO0/K;", "drawerState", "", "gesturesEnabled", "Lp1/v0;", "scrimColor", "content", "b", "(LnI/p;Landroidx/compose/ui/d;LO0/K;ZJLnI/p;LU0/m;II)V", "plp-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class n2 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ K f107062a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f107063b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f107064c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ long f107065d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f107066e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ p<C4889m, Integer, C16807N> f107067f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
        @f(c = "com.ingka.ikea.browseandsearch.plp.impl.composables.RightModalNavigationDrawerKt$RightModalNavigationDrawer$1$1$1$1", f = "RightModalNavigationDrawer.kt", l = {42}, m = "invokeSuspend")
        /* renamed from: yn.n2$a$a  reason: collision with other inner class name */
        static final class C2543a extends l implements p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f107068c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ K f107069d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2543a(K k10, C17164e<? super C2543a> eVar) {
                super(2, eVar);
                this.f107069d = k10;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new C2543a(this.f107069d, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((C2543a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f107068c;
                if (i10 == 0) {
                    y.b(obj);
                    K k10 = this.f107069d;
                    this.f107068c = 1;
                    if (k10.d(this) == f10) {
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
        static final class b implements p<C4889m, Integer, C16807N> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ p<C4889m, Integer, C16807N> f107070a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: yn.n2$a$b$a  reason: collision with other inner class name */
            static final class C2544a implements p<C4889m, Integer, C16807N> {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ p<C4889m, Integer, C16807N> f107071a;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: yn.n2$a$b$a$a  reason: collision with other inner class name */
                static final class C2545a implements q<C5861g, C4889m, Integer, C16807N> {

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ p<C4889m, Integer, C16807N> f107072a;

                    C2545a(p<? super C4889m, ? super Integer, C16807N> pVar) {
                        this.f107072a = pVar;
                    }

                    public final void a(C5861g gVar, C4889m mVar, int i10) {
                        C17542s.j(gVar, "$this$ModalDrawerSheet");
                        if ((i10 & 17) != 16 || !mVar.l()) {
                            if (C4895p.J()) {
                                C4895p.S(-892181969, i10, -1, "com.ingka.ikea.browseandsearch.plp.impl.composables.RightModalNavigationDrawer.<anonymous>.<anonymous>.<anonymous>.<anonymous> (RightModalNavigationDrawer.kt:52)");
                            }
                            this.f107072a.invoke(mVar, 0);
                            if (C4895p.J()) {
                                C4895p.R();
                                return;
                            }
                            return;
                        }
                        mVar.L();
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                        a((C5861g) obj, (C4889m) obj2, ((Number) obj3).intValue());
                        return C16807N.f139792a;
                    }
                }

                C2544a(p<? super C4889m, ? super Integer, C16807N> pVar) {
                    this.f107071a = pVar;
                }

                public final void a(C4889m mVar, int i10) {
                    int i11 = i10;
                    if ((i11 & 3) != 2 || !mVar.l()) {
                        if (C4895p.J()) {
                            C4895p.S(1190019155, i11, -1, "com.ingka.ikea.browseandsearch.plp.impl.composables.RightModalNavigationDrawer.<anonymous>.<anonymous>.<anonymous> (RightModalNavigationDrawer.kt:47)");
                        }
                        float f10 = (float) 0;
                        C4889m mVar2 = mVar;
                        C4737k0.b((d) null, c1.a(), 0, 0, h.B(f10), C5850V.c(h.B(f10), 0.0f, 0.0f, 0.0f, 14, (Object) null), c1.c.e(-892181969, true, new C2545a(this.f107071a), mVar2, 54), mVar2, 1597488, 13);
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

            b(p<? super C4889m, ? super Integer, C16807N> pVar) {
                this.f107070a = pVar;
            }

            public final void a(C4889m mVar, int i10) {
                if ((i10 & 3) != 2 || !mVar.l()) {
                    if (C4895p.J()) {
                        C4895p.S(-97608429, i10, -1, "com.ingka.ikea.browseandsearch.plp.impl.composables.RightModalNavigationDrawer.<anonymous>.<anonymous> (RightModalNavigationDrawer.kt:46)");
                    }
                    C4910x.a(C5100f0.k().d(t.Ltr), c1.c.e(1190019155, true, new C2544a(this.f107070a), mVar, 54), mVar, J0.f13770i | 48);
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

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class c implements p<C4889m, Integer, C16807N> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ p<C4889m, Integer, C16807N> f107073a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: yn.n2$a$c$a  reason: collision with other inner class name */
            static final class C2546a implements p<C4889m, Integer, C16807N> {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ p<C4889m, Integer, C16807N> f107074a;

                C2546a(p<? super C4889m, ? super Integer, C16807N> pVar) {
                    this.f107074a = pVar;
                }

                public final void a(C4889m mVar, int i10) {
                    if ((i10 & 3) != 2 || !mVar.l()) {
                        if (C4895p.J()) {
                            C4895p.S(1857953710, i10, -1, "com.ingka.ikea.browseandsearch.plp.impl.composables.RightModalNavigationDrawer.<anonymous>.<anonymous>.<anonymous> (RightModalNavigationDrawer.kt:62)");
                        }
                        this.f107074a.invoke(mVar, 0);
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

            c(p<? super C4889m, ? super Integer, C16807N> pVar) {
                this.f107073a = pVar;
            }

            public final void a(C4889m mVar, int i10) {
                if ((i10 & 3) != 2 || !mVar.l()) {
                    if (C4895p.J()) {
                        C4895p.S(570326126, i10, -1, "com.ingka.ikea.browseandsearch.plp.impl.composables.RightModalNavigationDrawer.<anonymous>.<anonymous> (RightModalNavigationDrawer.kt:61)");
                    }
                    C4910x.a(C5100f0.k().d(t.Ltr), c1.c.e(1857953710, true, new C2546a(this.f107073a), mVar, 54), mVar, J0.f13770i | 48);
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

        a(K k10, d dVar, boolean z10, long j10, p<? super C4889m, ? super Integer, C16807N> pVar, p<? super C4889m, ? super Integer, C16807N> pVar2) {
            this.f107062a = k10;
            this.f107063b = dVar;
            this.f107064c = z10;
            this.f107065d = j10;
            this.f107066e = pVar;
            this.f107067f = pVar2;
        }

        /* access modifiers changed from: private */
        public static final C16807N c(Q q10, K k10) {
            F0 unused = C16314k.d(q10, (C17168i) null, (T) null, new C2543a(k10, (C17164e<? super C2543a>) null), 3, (Object) null);
            return C16807N.f139792a;
        }

        public final void b(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-395680308, i10, -1, "com.ingka.ikea.browseandsearch.plp.impl.composables.RightModalNavigationDrawer.<anonymous> (RightModalNavigationDrawer.kt:38)");
                }
                Object D10 = mVar.D();
                C4889m.a aVar = C4889m.f14007a;
                if (D10 == aVar.a()) {
                    B b10 = new B(P.k(C17169j.f142968a, mVar));
                    mVar.u(b10);
                    D10 = b10;
                }
                Q a10 = ((B) D10).a();
                boolean i11 = this.f107062a.i();
                mVar.W(549781360);
                boolean F10 = mVar.F(a10) | mVar.V(this.f107062a);
                K k10 = this.f107062a;
                Object D11 = mVar.D();
                if (F10 || D11 == aVar.a()) {
                    D11 = new m2(a10, k10);
                    mVar.u(D11);
                }
                mVar.P();
                C5281d.a(i11, (C17631a) D11, mVar, 0, 0);
                C4737k0.c(c1.c.e(-97608429, true, new b(this.f107066e), mVar, 54), this.f107063b, this.f107062a, this.f107064c, this.f107065d, c1.c.e(570326126, true, new c(this.f107067f), mVar, 54), mVar, 196614, 0);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x0177  */
    /* JADX WARNING: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00ce  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(nI.p<? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r18, androidx.compose.ui.d r19, O0.K r20, boolean r21, long r22, nI.p<? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r24, U0.C4889m r25, int r26, int r27) {
        /*
            r8 = r18
            r9 = r24
            r10 = r26
            java.lang.String r0 = "drawerContent"
            kotlin.jvm.internal.C17542s.j(r8, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.C17542s.j(r9, r0)
            r0 = -1438584564(0xffffffffaa40f10c, float:-1.7136656E-13)
            r1 = r25
            U0.m r11 = r1.k(r0)
            r1 = r27 & 1
            r2 = 2
            if (r1 == 0) goto L_0x0021
            r1 = r10 | 6
            goto L_0x0031
        L_0x0021:
            r1 = r10 & 6
            if (r1 != 0) goto L_0x0030
            boolean r1 = r11.F(r8)
            if (r1 == 0) goto L_0x002d
            r1 = 4
            goto L_0x002e
        L_0x002d:
            r1 = r2
        L_0x002e:
            r1 = r1 | r10
            goto L_0x0031
        L_0x0030:
            r1 = r10
        L_0x0031:
            r3 = r27 & 2
            if (r3 == 0) goto L_0x003a
            r1 = r1 | 48
        L_0x0037:
            r4 = r19
            goto L_0x004c
        L_0x003a:
            r4 = r10 & 48
            if (r4 != 0) goto L_0x0037
            r4 = r19
            boolean r5 = r11.V(r4)
            if (r5 == 0) goto L_0x0049
            r5 = 32
            goto L_0x004b
        L_0x0049:
            r5 = 16
        L_0x004b:
            r1 = r1 | r5
        L_0x004c:
            r5 = r10 & 384(0x180, float:5.38E-43)
            if (r5 != 0) goto L_0x0065
            r5 = r27 & 4
            if (r5 != 0) goto L_0x005f
            r5 = r20
            boolean r6 = r11.V(r5)
            if (r6 == 0) goto L_0x0061
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x0063
        L_0x005f:
            r5 = r20
        L_0x0061:
            r6 = 128(0x80, float:1.794E-43)
        L_0x0063:
            r1 = r1 | r6
            goto L_0x0067
        L_0x0065:
            r5 = r20
        L_0x0067:
            r6 = r27 & 8
            if (r6 == 0) goto L_0x0070
            r1 = r1 | 3072(0xc00, float:4.305E-42)
        L_0x006d:
            r7 = r21
            goto L_0x0082
        L_0x0070:
            r7 = r10 & 3072(0xc00, float:4.305E-42)
            if (r7 != 0) goto L_0x006d
            r7 = r21
            boolean r12 = r11.b(r7)
            if (r12 == 0) goto L_0x007f
            r12 = 2048(0x800, float:2.87E-42)
            goto L_0x0081
        L_0x007f:
            r12 = 1024(0x400, float:1.435E-42)
        L_0x0081:
            r1 = r1 | r12
        L_0x0082:
            r12 = r10 & 24576(0x6000, float:3.4438E-41)
            if (r12 != 0) goto L_0x009b
            r12 = r27 & 16
            if (r12 != 0) goto L_0x0095
            r12 = r22
            boolean r14 = r11.e(r12)
            if (r14 == 0) goto L_0x0097
            r14 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0099
        L_0x0095:
            r12 = r22
        L_0x0097:
            r14 = 8192(0x2000, float:1.14794E-41)
        L_0x0099:
            r1 = r1 | r14
            goto L_0x009d
        L_0x009b:
            r12 = r22
        L_0x009d:
            r14 = r27 & 32
            r15 = 196608(0x30000, float:2.75506E-40)
            if (r14 == 0) goto L_0x00a5
            r1 = r1 | r15
            goto L_0x00b5
        L_0x00a5:
            r14 = r10 & r15
            if (r14 != 0) goto L_0x00b5
            boolean r14 = r11.F(r9)
            if (r14 == 0) goto L_0x00b2
            r14 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b4
        L_0x00b2:
            r14 = 65536(0x10000, float:9.18355E-41)
        L_0x00b4:
            r1 = r1 | r14
        L_0x00b5:
            r14 = 74899(0x12493, float:1.04956E-40)
            r14 = r14 & r1
            r15 = 74898(0x12492, float:1.04954E-40)
            if (r14 != r15) goto L_0x00ce
            boolean r14 = r11.l()
            if (r14 != 0) goto L_0x00c5
            goto L_0x00ce
        L_0x00c5:
            r11.L()
            r2 = r4
            r3 = r5
            r4 = r7
            r5 = r12
            goto L_0x0171
        L_0x00ce:
            r11.G()
            r14 = r10 & 1
            r15 = -57345(0xffffffffffff1fff, float:NaN)
            r0 = 1
            if (r14 == 0) goto L_0x00f4
            boolean r14 = r11.O()
            if (r14 == 0) goto L_0x00e0
            goto L_0x00f4
        L_0x00e0:
            r11.L()
            r2 = r27 & 4
            if (r2 == 0) goto L_0x00e9
            r1 = r1 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x00e9:
            r2 = r27 & 16
            if (r2 == 0) goto L_0x00ee
            r1 = r1 & r15
        L_0x00ee:
            r14 = r7
            r16 = r12
            r12 = r4
            r13 = r5
            goto L_0x0125
        L_0x00f4:
            if (r3 == 0) goto L_0x00f9
            androidx.compose.ui.d$a r3 = androidx.compose.ui.d.f18749a
            goto L_0x00fa
        L_0x00f9:
            r3 = r4
        L_0x00fa:
            r4 = r27 & 4
            if (r4 == 0) goto L_0x0109
            O0.L r4 = O0.L.Closed
            r5 = 0
            r14 = 6
            O0.K r2 = O0.C4737k0.t(r4, r5, r11, r14, r2)
            r1 = r1 & -897(0xfffffffffffffc7f, float:NaN)
            goto L_0x010a
        L_0x0109:
            r2 = r5
        L_0x010a:
            if (r6 == 0) goto L_0x010d
            r7 = r0
        L_0x010d:
            r4 = r27 & 16
            if (r4 == 0) goto L_0x0120
            O0.I r4 = O0.I.f9768a
            int r5 = O0.I.f9773f
            long r4 = r4.e(r11, r5)
            r1 = r1 & r15
            r13 = r2
            r12 = r3
            r16 = r4
            r14 = r7
            goto L_0x0125
        L_0x0120:
            r14 = r7
            r16 = r12
            r13 = r2
            r12 = r3
        L_0x0125:
            r11.y()
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x0137
            r2 = -1
            java.lang.String r3 = "com.ingka.ikea.browseandsearch.plp.impl.composables.RightModalNavigationDrawer (RightModalNavigationDrawer.kt:35)"
            r4 = -1438584564(0xffffffffaa40f10c, float:-1.7136656E-13)
            U0.C4895p.S(r4, r1, r2, r3)
        L_0x0137:
            U0.I0 r1 = androidx.compose.ui.platform.C5100f0.k()
            c2.t r2 = c2.t.Rtl
            U0.J0 r15 = r1.d(r2)
            yn.n2$a r7 = new yn.n2$a
            r6 = r0
            r0 = r7
            r1 = r13
            r2 = r12
            r3 = r14
            r4 = r16
            r8 = r6
            r6 = r18
            r9 = r7
            r7 = r24
            r0.<init>(r1, r2, r3, r4, r6, r7)
            r0 = 54
            r1 = -395680308(0xffffffffe86a65cc, float:-4.4276463E24)
            c1.a r0 = c1.c.e(r1, r8, r9, r11, r0)
            int r1 = U0.J0.f13770i
            r1 = r1 | 48
            U0.C4910x.a(r15, r0, r11, r1)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x016c
            U0.C4895p.R()
        L_0x016c:
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r16
        L_0x0171:
            U0.Y0 r11 = r11.n()
            if (r11 == 0) goto L_0x0188
            yn.l2 r12 = new yn.l2
            r0 = r12
            r1 = r18
            r7 = r24
            r8 = r26
            r9 = r27
            r0.<init>(r1, r2, r3, r4, r5, r7, r8, r9)
            r11.a(r12)
        L_0x0188:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yn.n2.b(nI.p, androidx.compose.ui.d, O0.K, boolean, long, nI.p, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N c(p pVar, d dVar, K k10, boolean z10, long j10, p pVar2, int i10, int i11, C4889m mVar, int i12) {
        b(pVar, dVar, k10, z10, j10, pVar2, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
