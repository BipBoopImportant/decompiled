package ut;

import O0.F0;
import QJ.Q;
import QJ.T;
import U0.C4889m;
import U0.C4895p;
import U0.M0;
import XH.C16807N;
import XH.y;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import nI.C17631a;
import nI.p;
import nI.q;
import s0.C5848T;
import s0.C5861g;
import s0.a0;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aG\u0010\n\u001a\u00020\u00052\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\t\u001a\u00020\bH\u0001¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LMt/a;", "benefitUiModel", "LT0/d;", "widthSizeClass", "Lkotlin/Function0;", "LXH/N;", "onActionClick", "onClosed", "Landroidx/compose/ui/d;", "modifier", "c", "(LMt/a;ILnI/a;LnI/a;Landroidx/compose/ui/d;LU0/m;II)V", "instore-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class z0 {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.instore.impl.composables.StoreBenefitModalKt$StoreBenefitModal$1$1", f = "StoreBenefitModal.kt", l = {39}, m = "invokeSuspend")
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f104395c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Mt.a f104396d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ F0 f104397e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(Mt.a aVar, F0 f02, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f104396d = aVar;
            this.f104397e = f02;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f104396d, this.f104397e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f104395c;
            if (i10 == 0) {
                y.b(obj);
                if (this.f104396d != null) {
                    F0 f02 = this.f104397e;
                    this.f104395c = 1;
                    if (f02.p(this) == f10) {
                        return f10;
                    }
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
    static final class b implements p<C4889m, Integer, C5848T> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f104398a = new b();

        b() {
        }

        public final C5848T a(C4889m mVar, int i10) {
            mVar.W(-2121598656);
            if (C4895p.J()) {
                C4895p.S(-2121598656, i10, -1, "com.ingka.ikea.instore.impl.composables.StoreBenefitModal.<anonymous> (StoreBenefitModal.kt:58)");
            }
            C5848T b10 = a0.b(C5848T.f28733a, mVar, 6);
            if (C4895p.J()) {
                C4895p.R();
            }
            mVar.P();
            return b10;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((C4889m) obj, ((Number) obj2).intValue());
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c implements q<C5861g, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Mt.a f104399a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f104400b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Q f104401c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ F0 f104402d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f104403e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f104404f;

        c(Mt.a aVar, int i10, Q q10, F0 f02, C17631a<C16807N> aVar2, C17631a<C16807N> aVar3) {
            this.f104399a = aVar;
            this.f104400b = i10;
            this.f104401c = q10;
            this.f104402d = f02;
            this.f104403e = aVar2;
            this.f104404f = aVar3;
        }

        /* access modifiers changed from: private */
        public static final C16807N f(Q q10, F0 f02, C17631a aVar) {
            z0.d(q10, f02, aVar, new C0());
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N h() {
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N i(C17631a aVar, Q q10, F0 f02, C17631a aVar2) {
            z0.d(q10, f02, aVar2, aVar);
            return C16807N.f139792a;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: nI.a} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: nI.a} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void e(s0.C5861g r11, U0.C4889m r12, int r13) {
            /*
                r10 = this;
                java.lang.String r0 = "$this$ModalBottomSheet"
                kotlin.jvm.internal.C17542s.j(r11, r0)
                r11 = r13 & 17
                r0 = 16
                if (r11 != r0) goto L_0x0017
                boolean r11 = r12.l()
                if (r11 != 0) goto L_0x0012
                goto L_0x0017
            L_0x0012:
                r12.L()
                goto L_0x00d3
            L_0x0017:
                boolean r11 = U0.C4895p.J()
                if (r11 == 0) goto L_0x0026
                r11 = -1
                java.lang.String r0 = "com.ingka.ikea.instore.impl.composables.StoreBenefitModal.<anonymous> (StoreBenefitModal.kt:61)"
                r1 = 1774985332(0x69cc2074, float:3.0846765E25)
                U0.C4895p.S(r1, r13, r11, r0)
            L_0x0026:
                Mt.a r11 = r10.f104399a
                Mm.a r0 = r11.b()
                int r11 = st.c.f102820x
                r13 = 0
                java.lang.String r1 = J1.j.b(r11, r12, r13)
                Mt.a r11 = r10.f104399a
                IC.e r11 = r11.d()
                int r13 = IC.C13023e.f110931a
                java.lang.String r2 = r11.a(r12, r13)
                int r3 = r10.f104400b
                r11 = -2023087414(0xffffffff876a22ca, float:-1.7614427E-34)
                r12.W(r11)
                QJ.Q r11 = r10.f104401c
                boolean r11 = r12.F(r11)
                O0.F0 r13 = r10.f104402d
                boolean r13 = r12.V(r13)
                r11 = r11 | r13
                nI.a<XH.N> r13 = r10.f104403e
                boolean r13 = r12.V(r13)
                r11 = r11 | r13
                QJ.Q r13 = r10.f104401c
                O0.F0 r4 = r10.f104402d
                nI.a<XH.N> r5 = r10.f104403e
                java.lang.Object r6 = r12.D()
                if (r11 != 0) goto L_0x006f
                U0.m$a r11 = U0.C4889m.f14007a
                java.lang.Object r11 = r11.a()
                if (r6 != r11) goto L_0x0077
            L_0x006f:
                ut.A0 r6 = new ut.A0
                r6.<init>(r13, r4, r5)
                r12.u(r6)
            L_0x0077:
                r4 = r6
                nI.a r4 = (nI.C17631a) r4
                r12.P()
                r11 = -2023091587(0xffffffff876a127d, float:-1.7609637E-34)
                r12.W(r11)
                QJ.Q r11 = r10.f104401c
                boolean r11 = r12.F(r11)
                O0.F0 r13 = r10.f104402d
                boolean r13 = r12.V(r13)
                r11 = r11 | r13
                nI.a<XH.N> r13 = r10.f104403e
                boolean r13 = r12.V(r13)
                r11 = r11 | r13
                nI.a<XH.N> r13 = r10.f104404f
                boolean r13 = r12.V(r13)
                r11 = r11 | r13
                nI.a<XH.N> r13 = r10.f104404f
                QJ.Q r5 = r10.f104401c
                O0.F0 r6 = r10.f104402d
                nI.a<XH.N> r7 = r10.f104403e
                java.lang.Object r8 = r12.D()
                if (r11 != 0) goto L_0x00b4
                U0.m$a r11 = U0.C4889m.f14007a
                java.lang.Object r11 = r11.a()
                if (r8 != r11) goto L_0x00bc
            L_0x00b4:
                ut.B0 r8 = new ut.B0
                r8.<init>(r13, r5, r6, r7)
                r12.u(r8)
            L_0x00bc:
                r5 = r8
                nI.a r5 = (nI.C17631a) r5
                r12.P()
                r8 = 0
                r9 = 64
                r6 = 0
                r7 = r12
                Bm.o.D(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
                boolean r11 = U0.C4895p.J()
                if (r11 == 0) goto L_0x00d3
                U0.C4895p.R()
            L_0x00d3:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ut.z0.c.e(s0.g, U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            e((C5861g) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.instore.impl.composables.StoreBenefitModalKt$StoreBenefitModal$hideBenefitModalAndThen$1", f = "StoreBenefitModal.kt", l = {44}, m = "invokeSuspend")
    static final class d extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f104405c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ F0 f104406d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(F0 f02, C17164e<? super d> eVar) {
            super(2, eVar);
            this.f104406d = f02;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new d(this.f104406d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((d) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f104405c;
            if (i10 == 0) {
                y.b(obj);
                F0 f02 = this.f104406d;
                this.f104405c = 1;
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

    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0185  */
    /* JADX WARNING: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c(Mt.a r30, int r31, nI.C17631a<XH.C16807N> r32, nI.C17631a<XH.C16807N> r33, androidx.compose.ui.d r34, U0.C4889m r35, int r36, int r37) {
        /*
            r7 = r30
            r8 = r32
            r11 = r33
            r9 = r36
            java.lang.String r0 = "onActionClick"
            kotlin.jvm.internal.C17542s.j(r8, r0)
            java.lang.String r0 = "onClosed"
            kotlin.jvm.internal.C17542s.j(r11, r0)
            r0 = 1768599932(0x696ab17c, float:1.7732924E25)
            r1 = r35
            U0.m r13 = r1.k(r0)
            r1 = r37 & 1
            r2 = 2
            if (r1 == 0) goto L_0x0023
            r1 = r9 | 6
            goto L_0x0033
        L_0x0023:
            r1 = r9 & 6
            if (r1 != 0) goto L_0x0032
            boolean r1 = r13.F(r7)
            if (r1 == 0) goto L_0x002f
            r1 = 4
            goto L_0x0030
        L_0x002f:
            r1 = r2
        L_0x0030:
            r1 = r1 | r9
            goto L_0x0033
        L_0x0032:
            r1 = r9
        L_0x0033:
            r3 = r37 & 2
            if (r3 == 0) goto L_0x003c
            r1 = r1 | 48
            r12 = r31
            goto L_0x004e
        L_0x003c:
            r3 = r9 & 48
            r12 = r31
            if (r3 != 0) goto L_0x004e
            boolean r3 = r13.d(r12)
            if (r3 == 0) goto L_0x004b
            r3 = 32
            goto L_0x004d
        L_0x004b:
            r3 = 16
        L_0x004d:
            r1 = r1 | r3
        L_0x004e:
            r3 = r37 & 4
            if (r3 == 0) goto L_0x0055
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0065
        L_0x0055:
            r3 = r9 & 384(0x180, float:5.38E-43)
            if (r3 != 0) goto L_0x0065
            boolean r3 = r13.F(r8)
            if (r3 == 0) goto L_0x0062
            r3 = 256(0x100, float:3.59E-43)
            goto L_0x0064
        L_0x0062:
            r3 = 128(0x80, float:1.794E-43)
        L_0x0064:
            r1 = r1 | r3
        L_0x0065:
            r3 = r37 & 8
            if (r3 == 0) goto L_0x006c
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x007c
        L_0x006c:
            r3 = r9 & 3072(0xc00, float:4.305E-42)
            if (r3 != 0) goto L_0x007c
            boolean r3 = r13.F(r11)
            if (r3 == 0) goto L_0x0079
            r3 = 2048(0x800, float:2.87E-42)
            goto L_0x007b
        L_0x0079:
            r3 = 1024(0x400, float:1.435E-42)
        L_0x007b:
            r1 = r1 | r3
        L_0x007c:
            r3 = r37 & 16
            if (r3 == 0) goto L_0x0086
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
        L_0x0082:
            r4 = r34
        L_0x0084:
            r6 = r1
            goto L_0x0099
        L_0x0086:
            r4 = r9 & 24576(0x6000, float:3.4438E-41)
            if (r4 != 0) goto L_0x0082
            r4 = r34
            boolean r5 = r13.V(r4)
            if (r5 == 0) goto L_0x0095
            r5 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0097
        L_0x0095:
            r5 = 8192(0x2000, float:1.14794E-41)
        L_0x0097:
            r1 = r1 | r5
            goto L_0x0084
        L_0x0099:
            r1 = r6 & 9363(0x2493, float:1.312E-41)
            r5 = 9362(0x2492, float:1.3119E-41)
            if (r1 != r5) goto L_0x00ad
            boolean r1 = r13.l()
            if (r1 != 0) goto L_0x00a6
            goto L_0x00ad
        L_0x00a6:
            r13.L()
            r5 = r4
            r1 = r13
            goto L_0x017f
        L_0x00ad:
            if (r3 == 0) goto L_0x00b3
            androidx.compose.ui.d$a r1 = androidx.compose.ui.d.f18749a
            r5 = r1
            goto L_0x00b4
        L_0x00b3:
            r5 = r4
        L_0x00b4:
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x00c0
            r1 = -1
            java.lang.String r3 = "com.ingka.ikea.instore.impl.composables.StoreBenefitModal (StoreBenefitModal.kt:33)"
            U0.C4895p.S(r0, r6, r1, r3)
        L_0x00c0:
            java.lang.Object r0 = r13.D()
            U0.m$a r1 = U0.C4889m.f14007a
            java.lang.Object r3 = r1.a()
            if (r0 != r3) goto L_0x00db
            dI.j r0 = dI.C17169j.f142968a
            QJ.Q r0 = U0.P.k(r0, r13)
            U0.B r3 = new U0.B
            r3.<init>(r0)
            r13.u(r3)
            r0 = r3
        L_0x00db:
            U0.B r0 = (U0.B) r0
            QJ.Q r3 = r0.a()
            r4 = 1
            r0 = 0
            r10 = 6
            O0.F0 r2 = O0.C4725e0.l(r4, r0, r13, r10, r2)
            r10 = -295095627(0xffffffffee6932b5, float:-1.8042827E28)
            r13.W(r10)
            boolean r10 = r13.F(r7)
            boolean r14 = r13.V(r2)
            r10 = r10 | r14
            java.lang.Object r14 = r13.D()
            if (r10 != 0) goto L_0x0103
            java.lang.Object r1 = r1.a()
            if (r14 != r1) goto L_0x010b
        L_0x0103:
            ut.z0$a r14 = new ut.z0$a
            r14.<init>(r7, r2, r0)
            r13.u(r14)
        L_0x010b:
            nI.p r14 = (nI.p) r14
            r13.P()
            r0 = r6 & 14
            U0.P.g(r7, r14, r13, r0)
            if (r7 == 0) goto L_0x0171
            java.lang.String r0 = "StoreBenefitModal_root"
            androidx.compose.ui.d r10 = androidx.compose.ui.platform.C5116k1.a(r5, r0)
            tK.v r0 = tK.C18030v.f147664a
            int r1 = tK.C18030v.f147665b
            tK.h r0 = r0.a(r13, r1)
            long r14 = r0.i()
            ut.z0$b r22 = ut.z0.b.f104398a
            ut.z0$c r1 = new ut.z0$c
            r0 = r1
            r7 = r1
            r1 = r30
            r25 = r2
            r2 = r31
            r8 = r4
            r4 = r25
            r29 = r5
            r5 = r33
            r16 = r6
            r6 = r32
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r0 = 54
            r1 = 1774985332(0x69cc2074, float:3.0846765E25)
            c1.a r24 = c1.c.e(r1, r8, r7, r13, r0)
            int r0 = r16 >> 9
            r0 = r0 & 14
            r1 = 805306368(0x30000000, float:4.656613E-10)
            r26 = r0 | r1
            r27 = 384(0x180, float:5.38E-43)
            r28 = 2520(0x9d8, float:3.531E-42)
            r0 = 0
            r12 = r0
            r0 = 0
            r1 = r13
            r13 = r0
            r16 = 0
            r18 = 0
            r19 = 0
            r21 = 0
            r23 = 0
            r9 = r33
            r11 = r25
            r25 = r1
            O0.C4725e0.a(r9, r10, r11, r12, r13, r14, r16, r18, r19, r21, r22, r23, r24, r25, r26, r27, r28)
            goto L_0x0174
        L_0x0171:
            r29 = r5
            r1 = r13
        L_0x0174:
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x017d
            U0.C4895p.R()
        L_0x017d:
            r5 = r29
        L_0x017f:
            U0.Y0 r8 = r1.n()
            if (r8 == 0) goto L_0x019a
            ut.x0 r9 = new ut.x0
            r0 = r9
            r1 = r30
            r2 = r31
            r3 = r32
            r4 = r33
            r6 = r36
            r7 = r37
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.a(r9)
        L_0x019a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ut.z0.c(Mt.a, int, nI.a, nI.a, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final void d(Q q10, F0 f02, C17631a<C16807N> aVar, C17631a<C16807N> aVar2) {
        C16314k.d(q10, (C17168i) null, (T) null, new d(f02, (C17164e<? super d>) null), 3, (Object) null).s(new y0(f02, aVar, aVar2));
    }

    /* access modifiers changed from: private */
    public static final C16807N e(F0 f02, C17631a aVar, C17631a aVar2, Throwable th2) {
        if (!f02.l()) {
            aVar.invoke();
            aVar2.invoke();
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N f(Mt.a aVar, int i10, C17631a aVar2, C17631a aVar3, androidx.compose.ui.d dVar, int i11, int i12, C4889m mVar, int i13) {
        c(aVar, i10, aVar2, aVar3, dVar, mVar, M0.a(i11 | 1), i12);
        return C16807N.f139792a;
    }
}
