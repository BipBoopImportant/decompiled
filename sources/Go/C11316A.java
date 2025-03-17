package go;

import J1.j;
import O0.F0;
import QJ.Q;
import QJ.T;
import SC.C13652w1;
import SC.C13656x1;
import SC.C13664z1;
import SC.K0;
import SC.L;
import SC.M;
import SC.N;
import U0.A1;
import U0.C4889m;
import U0.C4895p;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import XH.y;
import androidx.compose.foundation.layout.J;
import androidx.recyclerview.widget.RecyclerView;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import lo.o;
import nI.C17631a;
import nI.p;
import r0.m;
import s0.C5848T;
import s0.a0;

@Metadata(d1 = {"\u0000.\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aM\u0010\f\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0001¢\u0006\u0004\b\f\u0010\r\u001aC\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0001¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012²\u0006\f\u0010\u000f\u001a\u00020\u000e8\nX\u0002"}, d2 = {"", "checkoutId", "LO0/F0;", "sheetState", "LQJ/Q;", "coroutineScope", "Lkotlin/Function0;", "LXH/N;", "onChangeDeliveryMethod", "onDismiss", "Llo/o;", "viewModel", "f", "(Ljava/lang/String;LO0/F0;LQJ/Q;LnI/a;LnI/a;Llo/o;LU0/m;II)V", "Lgo/T;", "uiState", "j", "(LO0/F0;Lgo/T;LQJ/Q;LnI/a;LnI/a;LU0/m;I)V", "checkout-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: go.A  reason: case insensitive filesystem */
public final class C11316A {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: go.A$a */
    static final class a implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Q f97685a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ F0 f97686b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f97687c;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
        @f(c = "com.ingka.ikea.checkout.impl.delivery.compose.CompareDeliveryPricesBottomSheetKt$CompareDeliveryPricesBottomSheetContent$1$1$1$1", f = "CompareDeliveryPricesBottomSheet.kt", l = {90}, m = "invokeSuspend")
        /* renamed from: go.A$a$a  reason: collision with other inner class name */
        static final class C2188a extends l implements p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f97688c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ F0 f97689d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2188a(F0 f02, C17164e<? super C2188a> eVar) {
                super(2, eVar);
                this.f97689d = f02;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new C2188a(this.f97689d, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((C2188a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f97688c;
                if (i10 == 0) {
                    y.b(obj);
                    F0 f02 = this.f97689d;
                    this.f97688c = 1;
                    if (f02.k(this) == f10) {
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

        a(Q q10, F0 f02, C17631a<C16807N> aVar) {
            this.f97685a = q10;
            this.f97686b = f02;
            this.f97687c = aVar;
        }

        /* access modifiers changed from: private */
        public static final C16807N e(Q q10, F0 f02, C17631a aVar) {
            C16314k.d(q10, (C17168i) null, (T) null, new C2188a(f02, (C17164e<? super C2188a>) null), 3, (Object) null).s(new C11341z(f02, aVar));
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N f(F0 f02, C17631a aVar, Throwable th2) {
            if (!f02.l()) {
                aVar.invoke();
            }
            return C16807N.f139792a;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: nI.a} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void c(U0.C4889m r15, int r16) {
            /*
                r14 = this;
                r0 = r14
                r11 = r15
                r1 = r16
                r2 = r1 & 3
                r3 = 2
                if (r2 != r3) goto L_0x0014
                boolean r2 = r15.l()
                if (r2 != 0) goto L_0x0010
                goto L_0x0014
            L_0x0010:
                r15.L()
                goto L_0x0088
            L_0x0014:
                boolean r2 = U0.C4895p.J()
                if (r2 == 0) goto L_0x0023
                r2 = -1
                java.lang.String r3 = "com.ingka.ikea.checkout.impl.delivery.compose.CompareDeliveryPricesBottomSheetContent.<anonymous> (CompareDeliveryPricesBottomSheet.kt:85)"
                r4 = 1910632558(0x71e1f06e, float:2.2375932E30)
                U0.C4895p.S(r4, r1, r2, r3)
            L_0x0023:
                androidx.compose.ui.d$a r1 = androidx.compose.ui.d.f18749a
                r2 = 1
                r3 = 0
                r4 = 0
                androidx.compose.ui.d r2 = androidx.compose.foundation.layout.J.h(r1, r4, r2, r3)
                int r1 = rv.C11849b.f102218O
                r3 = 0
                java.lang.String r1 = J1.j.b(r1, r15, r3)
                SC.N r4 = SC.N.Secondary
                r3 = -622339995(0xffffffffdae7d865, float:-3.2629324E16)
                r15.W(r3)
                QJ.Q r3 = r0.f97685a
                boolean r3 = r15.F(r3)
                O0.F0 r5 = r0.f97686b
                boolean r5 = r15.V(r5)
                r3 = r3 | r5
                nI.a<XH.N> r5 = r0.f97687c
                boolean r5 = r15.V(r5)
                r3 = r3 | r5
                QJ.Q r5 = r0.f97685a
                O0.F0 r6 = r0.f97686b
                nI.a<XH.N> r7 = r0.f97687c
                java.lang.Object r8 = r15.D()
                if (r3 != 0) goto L_0x0063
                U0.m$a r3 = U0.C4889m.f14007a
                java.lang.Object r3 = r3.a()
                if (r8 != r3) goto L_0x006b
            L_0x0063:
                go.y r8 = new go.y
                r8.<init>(r5, r6, r7)
                r15.u(r8)
            L_0x006b:
                r10 = r8
                nI.a r10 = (nI.C17631a) r10
                r15.P()
                r12 = 3120(0xc30, float:4.372E-42)
                r13 = 500(0x1f4, float:7.0E-43)
                r3 = 0
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                r11 = r15
                SC.L.b(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
                boolean r1 = U0.C4895p.J()
                if (r1 == 0) goto L_0x0088
                U0.C4895p.R()
            L_0x0088:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: go.C11316A.a.c(U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            c((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: go.A$b */
    static final class b implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f97690a;

        b(C17631a<C16807N> aVar) {
            this.f97690a = aVar;
        }

        public final void a(C4889m mVar, int i10) {
            int i11 = i10;
            if ((i11 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(1968614831, i11, -1, "com.ingka.ikea.checkout.impl.delivery.compose.CompareDeliveryPricesBottomSheetContent.<anonymous> (CompareDeliveryPricesBottomSheet.kt:99)");
                }
                L.b(j.b(Oo.b.f84522U4, mVar, 0), J.h(androidx.compose.ui.d.f18749a, 0.0f, 1, (Object) null), false, N.Tertiary, (M) null, false, (Integer) null, (K0) null, (m) null, this.f97690a, mVar, 3120, 500);
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
    /* renamed from: go.A$c */
    static final class c implements p<C4889m, Integer, C5848T> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f97691a = new c();

        c() {
        }

        public final C5848T a(C4889m mVar, int i10) {
            mVar.W(-1917219177);
            if (C4895p.J()) {
                C4895p.S(-1917219177, i10, -1, "com.ingka.ikea.checkout.impl.delivery.compose.CompareDeliveryPricesBottomSheetContent.<anonymous> (CompareDeliveryPricesBottomSheet.kt:114)");
            }
            C5848T d10 = a0.d(C5848T.f28733a, mVar, 6);
            if (C4895p.J()) {
                C4895p.R();
            }
            mVar.P();
            return d10;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((C4889m) obj, ((Number) obj2).intValue());
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: go.A$d */
    static final class d implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ T f97692a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f97693b;

        d(T t10, C17631a<C16807N> aVar) {
            this.f97692a = t10;
            this.f97693b = aVar;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-650149896, i10, -1, "com.ingka.ikea.checkout.impl.delivery.compose.CompareDeliveryPricesBottomSheetContent.<anonymous> (CompareDeliveryPricesBottomSheet.kt:108)");
                }
                I.h(this.f97692a, this.f97693b, mVar, 0);
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.checkout.impl.delivery.compose.CompareDeliveryPricesBottomSheetKt$CompareDeliveryPricesBottomSheetContent$dismissBottomSheet$1$1$1", f = "CompareDeliveryPricesBottomSheet.kt", l = {73}, m = "invokeSuspend")
    /* renamed from: go.A$e */
    static final class e extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f97694c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ F0 f97695d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(F0 f02, C17164e<? super e> eVar) {
            super(2, eVar);
            this.f97695d = f02;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new e(this.f97695d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((e) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f97694c;
            if (i10 == 0) {
                y.b(obj);
                F0 f02 = this.f97695d;
                this.f97694c = 1;
                if (f02.k(this) == f10) {
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

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: nI.a} */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00eb, code lost:
        if ((r30 & 32) != 0) goto L_0x00ed;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x01ac  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x016d  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x016f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void f(java.lang.String r22, O0.F0 r23, QJ.Q r24, nI.C17631a<XH.C16807N> r25, nI.C17631a<XH.C16807N> r26, lo.o r27, U0.C4889m r28, int r29, int r30) {
        /*
            r1 = r22
            r9 = r23
            r10 = r24
            r11 = r25
            r12 = r26
            r13 = r29
            java.lang.String r0 = "checkoutId"
            kotlin.jvm.internal.C17542s.j(r1, r0)
            java.lang.String r0 = "sheetState"
            kotlin.jvm.internal.C17542s.j(r9, r0)
            java.lang.String r0 = "coroutineScope"
            kotlin.jvm.internal.C17542s.j(r10, r0)
            java.lang.String r0 = "onChangeDeliveryMethod"
            kotlin.jvm.internal.C17542s.j(r11, r0)
            java.lang.String r0 = "onDismiss"
            kotlin.jvm.internal.C17542s.j(r12, r0)
            r0 = 1790062034(0x6ab22dd2, float:1.0770259E26)
            r2 = r28
            U0.m r8 = r2.k(r0)
            r2 = r30 & 1
            if (r2 == 0) goto L_0x0035
            r2 = r13 | 6
            goto L_0x0045
        L_0x0035:
            r2 = r13 & 6
            if (r2 != 0) goto L_0x0044
            boolean r2 = r8.V(r1)
            if (r2 == 0) goto L_0x0041
            r2 = 4
            goto L_0x0042
        L_0x0041:
            r2 = 2
        L_0x0042:
            r2 = r2 | r13
            goto L_0x0045
        L_0x0044:
            r2 = r13
        L_0x0045:
            r3 = r30 & 2
            if (r3 == 0) goto L_0x004c
            r2 = r2 | 48
            goto L_0x005c
        L_0x004c:
            r3 = r13 & 48
            if (r3 != 0) goto L_0x005c
            boolean r3 = r8.V(r9)
            if (r3 == 0) goto L_0x0059
            r3 = 32
            goto L_0x005b
        L_0x0059:
            r3 = 16
        L_0x005b:
            r2 = r2 | r3
        L_0x005c:
            r3 = r30 & 4
            if (r3 == 0) goto L_0x0063
            r2 = r2 | 384(0x180, float:5.38E-43)
            goto L_0x0073
        L_0x0063:
            r3 = r13 & 384(0x180, float:5.38E-43)
            if (r3 != 0) goto L_0x0073
            boolean r3 = r8.F(r10)
            if (r3 == 0) goto L_0x0070
            r3 = 256(0x100, float:3.59E-43)
            goto L_0x0072
        L_0x0070:
            r3 = 128(0x80, float:1.794E-43)
        L_0x0072:
            r2 = r2 | r3
        L_0x0073:
            r3 = r30 & 8
            r4 = 2048(0x800, float:2.87E-42)
            if (r3 == 0) goto L_0x007c
            r2 = r2 | 3072(0xc00, float:4.305E-42)
            goto L_0x008b
        L_0x007c:
            r3 = r13 & 3072(0xc00, float:4.305E-42)
            if (r3 != 0) goto L_0x008b
            boolean r3 = r8.F(r11)
            if (r3 == 0) goto L_0x0088
            r3 = r4
            goto L_0x008a
        L_0x0088:
            r3 = 1024(0x400, float:1.435E-42)
        L_0x008a:
            r2 = r2 | r3
        L_0x008b:
            r3 = r30 & 16
            if (r3 == 0) goto L_0x0092
            r2 = r2 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00a2
        L_0x0092:
            r3 = r13 & 24576(0x6000, float:3.4438E-41)
            if (r3 != 0) goto L_0x00a2
            boolean r3 = r8.F(r12)
            if (r3 == 0) goto L_0x009f
            r3 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a1
        L_0x009f:
            r3 = 8192(0x2000, float:1.14794E-41)
        L_0x00a1:
            r2 = r2 | r3
        L_0x00a2:
            r3 = 196608(0x30000, float:2.75506E-40)
            r3 = r3 & r13
            if (r3 != 0) goto L_0x00bc
            r3 = r30 & 32
            if (r3 != 0) goto L_0x00b6
            r3 = r27
            boolean r5 = r8.F(r3)
            if (r5 == 0) goto L_0x00b8
            r5 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ba
        L_0x00b6:
            r3 = r27
        L_0x00b8:
            r5 = 65536(0x10000, float:9.18355E-41)
        L_0x00ba:
            r2 = r2 | r5
            goto L_0x00be
        L_0x00bc:
            r3 = r27
        L_0x00be:
            r5 = 74899(0x12493, float:1.04956E-40)
            r5 = r5 & r2
            r6 = 74898(0x12492, float:1.04954E-40)
            if (r5 != r6) goto L_0x00d5
            boolean r5 = r8.l()
            if (r5 != 0) goto L_0x00ce
            goto L_0x00d5
        L_0x00ce:
            r8.L()
            r6 = r3
            r15 = r8
            goto L_0x01b0
        L_0x00d5:
            r8.G()
            r5 = r13 & 1
            r6 = -458753(0xfffffffffff8ffff, float:NaN)
            if (r5 == 0) goto L_0x00f0
            boolean r5 = r8.O()
            if (r5 == 0) goto L_0x00e6
            goto L_0x00f0
        L_0x00e6:
            r8.L()
            r5 = r30 & 32
            if (r5 == 0) goto L_0x00ee
        L_0x00ed:
            r2 = r2 & r6
        L_0x00ee:
            r7 = r3
            goto L_0x0136
        L_0x00f0:
            r5 = r30 & 32
            if (r5 == 0) goto L_0x00ee
            r3 = 1729797275(0x671a9c9b, float:7.301333E23)
            r8.C(r3)
            m3.a r3 = m3.a.f26247a
            r5 = 6
            androidx.lifecycle.k0 r15 = r3.a(r8, r5)
            if (r15 == 0) goto L_0x012e
            boolean r3 = r15 instanceof androidx.lifecycle.C5212o
            if (r3 == 0) goto L_0x0111
            r3 = r15
            androidx.lifecycle.o r3 = (androidx.lifecycle.C5212o) r3
            l3.a r3 = r3.getDefaultViewModelCreationExtras()
        L_0x010e:
            r18 = r3
            goto L_0x0114
        L_0x0111:
            l3.a$a r3 = l3.a.C0407a.f25486b
            goto L_0x010e
        L_0x0114:
            java.lang.Class<lo.o> r3 = lo.o.class
            uI.d r14 = kotlin.jvm.internal.P.b(r3)
            r20 = 0
            r21 = 0
            r16 = 0
            r17 = 0
            r19 = r8
            androidx.lifecycle.f0 r3 = m3.c.c(r14, r15, r16, r17, r18, r19, r20, r21)
            r8.U()
            lo.o r3 = (lo.o) r3
            goto L_0x00ed
        L_0x012e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"
            r0.<init>(r1)
            throw r0
        L_0x0136:
            r8.y()
            boolean r3 = U0.C4895p.J()
            if (r3 == 0) goto L_0x0145
            r3 = -1
            java.lang.String r5 = "com.ingka.ikea.checkout.impl.delivery.compose.CompareDeliveryPricesBottomSheet (CompareDeliveryPricesBottomSheet.kt:45)"
            U0.C4895p.S(r0, r2, r3, r5)
        L_0x0145:
            TJ.g r14 = r7.j(r1)
            go.T$c r15 = go.T.c.f97761a
            r20 = 48
            r21 = 14
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = r8
            U0.A1 r0 = j3.a.b(r14, r15, r16, r17, r18, r19, r20, r21)
            go.T r3 = g(r0)
            r0 = 2005972381(0x7790b59d, float:5.870112E33)
            r8.W(r0)
            boolean r0 = r8.F(r7)
            r5 = r2 & 7168(0x1c00, float:1.0045E-41)
            if (r5 != r4) goto L_0x016f
            r4 = 1
            goto L_0x0170
        L_0x016f:
            r4 = 0
        L_0x0170:
            r0 = r0 | r4
            java.lang.Object r4 = r8.D()
            if (r0 != 0) goto L_0x017f
            U0.m$a r0 = U0.C4889m.f14007a
            java.lang.Object r0 = r0.a()
            if (r4 != r0) goto L_0x0187
        L_0x017f:
            go.t r4 = new go.t
            r4.<init>(r7, r11)
            r8.u(r4)
        L_0x0187:
            r5 = r4
            nI.a r5 = (nI.C17631a) r5
            r8.P()
            int r0 = r2 >> 3
            r0 = r0 & 14
            r4 = r2 & 896(0x380, float:1.256E-42)
            r0 = r0 | r4
            r4 = 57344(0xe000, float:8.0356E-41)
            r2 = r2 & r4
            r0 = r0 | r2
            r2 = r23
            r4 = r24
            r6 = r26
            r14 = r7
            r7 = r8
            r15 = r8
            r8 = r0
            j(r2, r3, r4, r5, r6, r7, r8)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x01af
            U0.C4895p.R()
        L_0x01af:
            r6 = r14
        L_0x01b0:
            U0.Y0 r14 = r15.n()
            if (r14 == 0) goto L_0x01cd
            go.u r15 = new go.u
            r0 = r15
            r1 = r22
            r2 = r23
            r3 = r24
            r4 = r25
            r5 = r26
            r7 = r29
            r8 = r30
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r14.a(r15)
        L_0x01cd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: go.C11316A.f(java.lang.String, O0.F0, QJ.Q, nI.a, nI.a, lo.o, U0.m, int, int):void");
    }

    private static final T g(A1<? extends T> a12) {
        return (T) a12.getValue();
    }

    /* access modifiers changed from: private */
    public static final C16807N h(o oVar, C17631a aVar) {
        oVar.C();
        aVar.invoke();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N i(String str, F0 f02, Q q10, C17631a aVar, C17631a aVar2, o oVar, int i10, int i11, C4889m mVar, int i12) {
        f(str, f02, q10, aVar, aVar2, oVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    public static final void j(F0 f02, T t10, Q q10, C17631a<C16807N> aVar, C17631a<C16807N> aVar2, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        F0 f03 = f02;
        T t11 = t10;
        Q q11 = q10;
        C17631a<C16807N> aVar3 = aVar;
        C17631a<C16807N> aVar4 = aVar2;
        int i12 = i10;
        C17542s.j(f03, "sheetState");
        C17542s.j(t11, "uiState");
        C17542s.j(q11, "coroutineScope");
        C17542s.j(aVar3, "onChangeDeliveryMethod");
        C17542s.j(aVar4, "onDismiss");
        C4889m k10 = mVar.k(798880168);
        if ((i12 & 6) == 0) {
            i11 = (k10.V(f03) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k10.V(t11) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i11 |= k10.F(q11) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i11 |= k10.F(aVar3) ? RecyclerView.n.FLAG_MOVED : 1024;
        }
        if ((i12 & 24576) == 0) {
            i11 |= k10.F(aVar4) ? 16384 : 8192;
        }
        if ((i11 & 9363) != 9362 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(798880168, i11, -1, "com.ingka.ikea.checkout.impl.delivery.compose.CompareDeliveryPricesBottomSheetContent (CompareDeliveryPricesBottomSheet.kt:70)");
            }
            k10.W(-2103053703);
            boolean z10 = false;
            boolean F10 = k10.F(q11) | ((i11 & 14) == 4);
            if ((57344 & i11) == 16384) {
                z10 = true;
            }
            boolean z11 = F10 | z10;
            Object D10 = k10.D();
            if (z11 || D10 == C4889m.f14007a.a()) {
                D10 = new C11337v(q11, f03, aVar4);
                k10.u(D10);
            }
            C17631a aVar5 = (C17631a) D10;
            k10.P();
            mVar2 = k10;
            SC.J.d(aVar2, (androidx.compose.ui.d) null, f02, C13656x1.c.f116498a, new C13664z1(C13652w1.Stacked, c1.c.e(1910632558, true, new a(q11, f03, aVar3), k10, 54), c1.c.e(1968614831, true, new b(aVar5), k10, 54)), false, 0, 0.0f, c.f97691a, c1.c.e(-650149896, true, new d(t11, aVar5), k10, 54), mVar2, ((i11 >> 12) & 14) | 805306368 | ((i11 << 6) & 896) | (C13656x1.c.f116499b << 9) | (C13664z1.f116520d << 12), 226);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
        }
        Y0 n10 = mVar2.n();
        if (n10 != null) {
            n10.a(new C11338w(f02, t10, q10, aVar, aVar2, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N k(Q q10, F0 f02, C17631a aVar) {
        C16314k.d(q10, (C17168i) null, (T) null, new e(f02, (C17164e<? super e>) null), 3, (Object) null).s(new C11339x(f02, aVar));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N l(F0 f02, C17631a aVar, Throwable th2) {
        if (!f02.l()) {
            aVar.invoke();
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N m(F0 f02, T t10, Q q10, C17631a aVar, C17631a aVar2, int i10, C4889m mVar, int i11) {
        j(f02, t10, q10, aVar, aVar2, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }
}
