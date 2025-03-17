package Zq;

import E1.I;
import G1.C4504g;
import O0.F0;
import QJ.Q;
import QJ.T;
import U0.A1;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4912y;
import U0.F1;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import XH.t;
import XH.y;
import androidx.compose.foundation.layout.C5077h;
import androidx.compose.foundation.layout.C5079j;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.d;
import androidx.recyclerview.widget.RecyclerView;
import br.C11124e;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import i1.C5437c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17525a;
import kotlin.jvm.internal.C17540p;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.q;
import or.C11712e;
import s0.C5848T;
import s0.C5861g;
import s0.a0;
import sl.C11865e;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a3\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a5\u0010\u000f\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00030\n2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001aG\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00030\nH\u0001¢\u0006\u0004\b\u0016\u0010\u0017\u001a'\u0010\u001b\u001a\u00020\u00032\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u001a\u001a\u00020\u0019H\u0003¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d²\u0006\f\u0010\u0012\u001a\u00020\u00118\nX\u0002"}, d2 = {"Lor/e;", "viewModel", "Lkotlin/Function0;", "LXH/N;", "onShowAvailableRewards", "onClosedClicked", "p", "(Lor/e;LnI/a;LnI/a;LU0/m;I)V", "LQq/d;", "details", "Lkotlin/Function1;", "Lor/e$c;", "onEvent", "LO0/F0;", "sheetState", "k", "(LQq/d;LnI/l;LO0/F0;LU0/m;II)V", "Lor/e$d;", "uiState", "onExpiringKeysClicked", "", "updateDataWithFilter", "v", "(Lor/e$d;LnI/a;LnI/a;LnI/l;LU0/m;I)V", "onClick", "Landroidx/compose/ui/d;", "modifier", "i", "(LnI/a;Landroidx/compose/ui/d;LU0/m;II)V", "familyrewards-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class j {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class a extends C17525a implements C17631a<C16807N> {

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Q f90169h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ F0 f90170i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ C17642l<C11712e.c, C16807N> f90171j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(Q q10, F0 f02, C17642l<? super C11712e.c, C16807N> lVar) {
            super(0, C17542s.a.class, "hide", "ExpiringKeysBottomSheet$hide(Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/material3/SheetState;Lkotlin/jvm/functions/Function1;Lcom/ingka/ikea/familyrewards/implementation/viewmodel/FamilyRewardsHistoryViewModel$Event;)V", 0);
            this.f90169h = q10;
            this.f90170i = f02;
            this.f90171j = lVar;
        }

        public final void a() {
            j.m(this.f90169h, this.f90170i, this.f90171j, (C11712e.c) null, 8, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements p<C4889m, Integer, C5848T> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f90172a = new b();

        b() {
        }

        public final C5848T a(C4889m mVar, int i10) {
            mVar.W(1285853032);
            if (C4895p.J()) {
                C4895p.S(1285853032, i10, -1, "com.ingka.ikea.familyrewards.implementation.compose.history.ExpiringKeysBottomSheet.<anonymous> (FamilyRewardsHistoryScreen.kt:128)");
            }
            C5848T c10 = a0.c(C5848T.f28733a, mVar, 6);
            if (C4895p.J()) {
                C4895p.R();
            }
            mVar.P();
            return c10;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((C4889m) obj, ((Number) obj2).intValue());
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c implements q<C5861g, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Qq.d f90173a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Q f90174b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ F0 f90175c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17642l<C11712e.c, C16807N> f90176d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* synthetic */ class a extends C17525a implements C17631a<C16807N> {

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ Q f90177h;

            /* renamed from: i  reason: collision with root package name */
            final /* synthetic */ F0 f90178i;

            /* renamed from: j  reason: collision with root package name */
            final /* synthetic */ C17642l<C11712e.c, C16807N> f90179j;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(Q q10, F0 f02, C17642l<? super C11712e.c, C16807N> lVar) {
                super(0, C17542s.a.class, "hide", "ExpiringKeysBottomSheet$hide(Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/material3/SheetState;Lkotlin/jvm/functions/Function1;Lcom/ingka/ikea/familyrewards/implementation/viewmodel/FamilyRewardsHistoryViewModel$Event;)V", 0);
                this.f90177h = q10;
                this.f90178i = f02;
                this.f90179j = lVar;
            }

            public final void a() {
                j.m(this.f90177h, this.f90178i, this.f90179j, (C11712e.c) null, 8, (Object) null);
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return C16807N.f139792a;
            }
        }

        c(Qq.d dVar, Q q10, F0 f02, C17642l<? super C11712e.c, C16807N> lVar) {
            this.f90173a = dVar;
            this.f90174b = q10;
            this.f90175c = f02;
            this.f90176d = lVar;
        }

        /* access modifiers changed from: private */
        public static final C16807N c(Q q10, F0 f02, C17642l lVar) {
            j.l(q10, f02, lVar, C11712e.c.b.f100680a);
            return C16807N.f139792a;
        }

        public final void b(C5861g gVar, C4889m mVar, int i10) {
            C17542s.j(gVar, "$this$ModalBottomSheet");
            if ((i10 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(2021965236, i10, -1, "com.ingka.ikea.familyrewards.implementation.compose.history.ExpiringKeysBottomSheet.<anonymous> (FamilyRewardsHistoryScreen.kt:132)");
                }
                Qq.d dVar = this.f90173a;
                mVar.W(-1886177521);
                boolean F10 = mVar.F(this.f90174b) | mVar.V(this.f90175c) | mVar.V(this.f90176d);
                Q q10 = this.f90174b;
                F0 f02 = this.f90175c;
                C17642l<C11712e.c, C16807N> lVar = this.f90176d;
                Object D10 = mVar.D();
                if (F10 || D10 == C4889m.f14007a.a()) {
                    D10 = new k(q10, f02, lVar);
                    mVar.u(D10);
                }
                C17631a aVar = (C17631a) D10;
                mVar.P();
                mVar.W(-1886175406);
                boolean F11 = mVar.F(this.f90174b) | mVar.V(this.f90175c) | mVar.V(this.f90176d);
                Q q11 = this.f90174b;
                F0 f03 = this.f90175c;
                C17642l<C11712e.c, C16807N> lVar2 = this.f90176d;
                Object D11 = mVar.D();
                if (F11 || D11 == C4889m.f14007a.a()) {
                    D11 = new a(q11, f03, lVar2);
                    mVar.u(D11);
                }
                mVar.P();
                br.j.g(dVar, aVar, (C17631a) D11, (androidx.compose.ui.d) null, mVar, 0, 8);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            b((C5861g) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.familyrewards.implementation.compose.history.FamilyRewardsHistoryScreenKt$ExpiringKeysBottomSheet$hide$1", f = "FamilyRewardsHistoryScreen.kt", l = {115}, m = "invokeSuspend")
    static final class d extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f90180c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ F0 f90181d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(F0 f02, C17164e<? super d> eVar) {
            super(2, eVar);
            this.f90181d = f02;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new d(this.f90181d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((d) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f90180c;
            if (i10 == 0) {
                y.b(obj);
                F0 f02 = this.f90181d;
                this.f90180c = 1;
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.familyrewards.implementation.compose.history.FamilyRewardsHistoryScreenKt$FamilyRewardsHistoryScreen$1$1", f = "FamilyRewardsHistoryScreen.kt", l = {}, m = "invokeSuspend")
    static final class e extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f90182c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f90183d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C11712e f90184e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f90185f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ A1<C11712e.d> f90186g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(C17631a<C16807N> aVar, C11712e eVar, C17631a<C16807N> aVar2, A1<? extends C11712e.d> a12, C17164e<? super e> eVar2) {
            super(2, eVar2);
            this.f90183d = aVar;
            this.f90184e = eVar;
            this.f90185f = aVar2;
            this.f90186g = a12;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new e(this.f90183d, this.f90184e, this.f90185f, this.f90186g, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((e) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f90182c == 0) {
                y.b(obj);
                C11712e.b c10 = j.q(this.f90186g).c();
                if (c10 != null) {
                    if (C17542s.e(c10, C11712e.b.a.f100677a)) {
                        this.f90183d.invoke();
                        this.f90184e.C(C11712e.c.f.f100684a);
                    } else if (C17542s.e(c10, C11712e.b.C2356b.f100678a)) {
                        this.f90185f.invoke();
                        this.f90184e.C(C11712e.c.f.f100684a);
                    } else {
                        throw new t();
                    }
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class f extends C17540p implements C17642l<C11712e.c, C16807N> {
        f(Object obj) {
            super(1, obj, C11712e.class, "event", "event(Lcom/ingka/ikea/familyrewards/implementation/viewmodel/FamilyRewardsHistoryViewModel$Event;)V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            t((C11712e.c) obj);
            return C16807N.f139792a;
        }

        public final void t(C11712e.c cVar) {
            C17542s.j(cVar, "p0");
            ((C11712e) this.receiver).C(cVar);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void i(nI.C17631a<XH.C16807N> r19, androidx.compose.ui.d r20, U0.C4889m r21, int r22, int r23) {
        /*
            r12 = r19
            r13 = r22
            r14 = r23
            r0 = 612283512(0x247eb478, float:5.5230333E-17)
            r1 = r21
            U0.m r15 = r1.k(r0)
            r1 = r14 & 1
            if (r1 == 0) goto L_0x0016
            r1 = r13 | 6
            goto L_0x0026
        L_0x0016:
            r1 = r13 & 6
            if (r1 != 0) goto L_0x0025
            boolean r1 = r15.F(r12)
            if (r1 == 0) goto L_0x0022
            r1 = 4
            goto L_0x0023
        L_0x0022:
            r1 = 2
        L_0x0023:
            r1 = r1 | r13
            goto L_0x0026
        L_0x0025:
            r1 = r13
        L_0x0026:
            r2 = r14 & 2
            if (r2 == 0) goto L_0x002f
            r1 = r1 | 48
        L_0x002c:
            r3 = r20
            goto L_0x0041
        L_0x002f:
            r3 = r13 & 48
            if (r3 != 0) goto L_0x002c
            r3 = r20
            boolean r4 = r15.V(r3)
            if (r4 == 0) goto L_0x003e
            r4 = 32
            goto L_0x0040
        L_0x003e:
            r4 = 16
        L_0x0040:
            r1 = r1 | r4
        L_0x0041:
            r4 = r1 & 19
            r5 = 18
            if (r4 != r5) goto L_0x0053
            boolean r4 = r15.l()
            if (r4 != 0) goto L_0x004e
            goto L_0x0053
        L_0x004e:
            r15.L()
            goto L_0x00c3
        L_0x0053:
            if (r2 == 0) goto L_0x005a
            androidx.compose.ui.d$a r2 = androidx.compose.ui.d.f18749a
            r16 = r2
            goto L_0x005c
        L_0x005a:
            r16 = r3
        L_0x005c:
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x0068
            r2 = -1
            java.lang.String r3 = "com.ingka.ikea.familyrewards.implementation.compose.history.CloseButton (FamilyRewardsHistoryScreen.kt:187)"
            U0.C4895p.S(r0, r1, r2, r3)
        L_0x0068:
            int r0 = uK.C18146a.f148097J2
            int r2 = Oo.b.f84665i
            r3 = 0
            java.lang.String r2 = J1.j.b(r2, r15, r3)
            SC.H0 r10 = SC.H0.PrimaryInverseStatic
            SC.G0 r11 = SC.G0.Small
            r9 = 24
            float r3 = (float) r9
            float r6 = c2.h.B(r3)
            float r5 = c2.h.B(r3)
            r8 = 9
            r17 = 0
            r4 = 0
            r7 = 0
            r3 = r16
            r18 = r9
            r9 = r17
            androidx.compose.ui.d r3 = androidx.compose.foundation.layout.D.m(r3, r4, r5, r6, r7, r8, r9)
            androidx.compose.ui.d r3 = s0.C5852X.e(r3)
            java.lang.String r4 = "FAB_TEST_TAG"
            androidx.compose.ui.d r3 = androidx.compose.ui.platform.C5116k1.a(r3, r4)
            r4 = 234881024(0xe000000, float:1.5777218E-30)
            int r1 = r1 << 24
            r1 = r1 & r4
            r4 = 221184(0x36000, float:3.09945E-40)
            r17 = r1 | r4
            r18 = 200(0xc8, float:2.8E-43)
            r4 = 0
            r6 = 0
            r7 = 0
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r10
            r5 = r11
            r8 = r19
            r9 = r15
            r10 = r17
            r11 = r18
            SC.F0.b(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x00c1
            U0.C4895p.R()
        L_0x00c1:
            r3 = r16
        L_0x00c3:
            U0.Y0 r0 = r15.n()
            if (r0 == 0) goto L_0x00d1
            Zq.i r1 = new Zq.i
            r1.<init>(r12, r3, r13, r14)
            r0.a(r1)
        L_0x00d1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Zq.j.i(nI.a, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N j(C17631a aVar, androidx.compose.ui.d dVar, int i10, int i11, C4889m mVar, int i12) {
        i(aVar, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: nI.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void k(Qq.d r26, nI.C17642l<? super or.C11712e.c, XH.C16807N> r27, O0.F0 r28, U0.C4889m r29, int r30, int r31) {
        /*
            r1 = r26
            r2 = r27
            r4 = r30
            r0 = 1063139441(0x3f5e3871, float:0.8680487)
            r3 = r29
            U0.m r3 = r3.k(r0)
            r5 = r31 & 1
            r6 = 2
            if (r5 == 0) goto L_0x0017
            r5 = r4 | 6
            goto L_0x0027
        L_0x0017:
            r5 = r4 & 6
            if (r5 != 0) goto L_0x0026
            boolean r5 = r3.F(r1)
            if (r5 == 0) goto L_0x0023
            r5 = 4
            goto L_0x0024
        L_0x0023:
            r5 = r6
        L_0x0024:
            r5 = r5 | r4
            goto L_0x0027
        L_0x0026:
            r5 = r4
        L_0x0027:
            r7 = r31 & 2
            r8 = 32
            if (r7 == 0) goto L_0x0030
            r5 = r5 | 48
            goto L_0x003f
        L_0x0030:
            r7 = r4 & 48
            if (r7 != 0) goto L_0x003f
            boolean r7 = r3.F(r2)
            if (r7 == 0) goto L_0x003c
            r7 = r8
            goto L_0x003e
        L_0x003c:
            r7 = 16
        L_0x003e:
            r5 = r5 | r7
        L_0x003f:
            r7 = r4 & 384(0x180, float:5.38E-43)
            r9 = 256(0x100, float:3.59E-43)
            if (r7 != 0) goto L_0x0059
            r7 = r31 & 4
            if (r7 != 0) goto L_0x0053
            r7 = r28
            boolean r10 = r3.V(r7)
            if (r10 == 0) goto L_0x0055
            r10 = r9
            goto L_0x0057
        L_0x0053:
            r7 = r28
        L_0x0055:
            r10 = 128(0x80, float:1.794E-43)
        L_0x0057:
            r5 = r5 | r10
            goto L_0x005b
        L_0x0059:
            r7 = r28
        L_0x005b:
            r10 = r5 & 147(0x93, float:2.06E-43)
            r11 = 146(0x92, float:2.05E-43)
            if (r10 != r11) goto L_0x006d
            boolean r10 = r3.l()
            if (r10 != 0) goto L_0x0068
            goto L_0x006d
        L_0x0068:
            r3.L()
            goto L_0x0181
        L_0x006d:
            r3.G()
            r10 = r4 & 1
            r12 = 1
            if (r10 == 0) goto L_0x0086
            boolean r10 = r3.O()
            if (r10 == 0) goto L_0x007c
            goto L_0x0086
        L_0x007c:
            r3.L()
            r6 = r31 & 4
            if (r6 == 0) goto L_0x0093
            r5 = r5 & -897(0xfffffffffffffc7f, float:NaN)
            goto L_0x0093
        L_0x0086:
            r10 = r31 & 4
            if (r10 == 0) goto L_0x0093
            r7 = 0
            r10 = 6
            O0.F0 r6 = O0.C4725e0.l(r12, r7, r3, r10, r6)
            r5 = r5 & -897(0xfffffffffffffc7f, float:NaN)
            r7 = r6
        L_0x0093:
            r3.y()
            boolean r6 = U0.C4895p.J()
            if (r6 == 0) goto L_0x00a2
            r6 = -1
            java.lang.String r10 = "com.ingka.ikea.familyrewards.implementation.compose.history.ExpiringKeysBottomSheet (FamilyRewardsHistoryScreen.kt:109)"
            U0.C4895p.S(r0, r5, r6, r10)
        L_0x00a2:
            java.lang.Object r0 = r3.D()
            U0.m$a r6 = U0.C4889m.f14007a
            java.lang.Object r10 = r6.a()
            if (r0 != r10) goto L_0x00bd
            dI.j r0 = dI.C17169j.f142968a
            QJ.Q r0 = U0.P.k(r0, r3)
            U0.B r10 = new U0.B
            r10.<init>(r0)
            r3.u(r10)
            r0 = r10
        L_0x00bd:
            U0.B r0 = (U0.B) r0
            QJ.Q r0 = r0.a()
            r10 = 1824278771(0x6cbc48f3, float:1.8209804E27)
            r3.W(r10)
            boolean r10 = r3.F(r0)
            r13 = r5 & 896(0x380, float:1.256E-42)
            r11 = r13 ^ 384(0x180, float:5.38E-43)
            r15 = 0
            if (r11 <= r9) goto L_0x00da
            boolean r11 = r3.V(r7)
            if (r11 != 0) goto L_0x00de
        L_0x00da:
            r11 = r5 & 384(0x180, float:5.38E-43)
            if (r11 != r9) goto L_0x00e0
        L_0x00de:
            r9 = r12
            goto L_0x00e1
        L_0x00e0:
            r9 = r15
        L_0x00e1:
            r9 = r9 | r10
            r5 = r5 & 112(0x70, float:1.57E-43)
            if (r5 != r8) goto L_0x00e8
            r5 = r12
            goto L_0x00e9
        L_0x00e8:
            r5 = r15
        L_0x00e9:
            r5 = r5 | r9
            java.lang.Object r8 = r3.D()
            if (r5 != 0) goto L_0x00f6
            java.lang.Object r5 = r6.a()
            if (r8 != r5) goto L_0x00fe
        L_0x00f6:
            Zq.j$a r8 = new Zq.j$a
            r8.<init>(r0, r7, r2)
            r3.u(r8)
        L_0x00fe:
            r5 = r8
            nI.a r5 = (nI.C17631a) r5
            r3.P()
            float r6 = (float) r15
            float r14 = c2.h.B(r6)
            tK.h r6 = SC.C13575d.a(r3, r15)
            long r16 = r6.x0()
            r22 = 14
            r23 = 0
            r18 = 1060320051(0x3f333333, float:0.7)
            r19 = 0
            r20 = 0
            r21 = 0
            long r8 = p1.C5747v0.o(r16, r18, r19, r20, r21, r22, r23)
            r6 = r15
            r15 = r8
            tK.h r8 = SC.C13575d.a(r3, r6)
            long r10 = r8.i()
            tK.h r6 = SC.C13575d.a(r3, r6)
            long r8 = r6.G0()
            r6 = r12
            r19 = r13
            r12 = r8
            r8 = 8
            float r8 = (float) r8
            float r20 = c2.h.B(r8)
            float r21 = c2.h.B(r8)
            r24 = 12
            r25 = 0
            r22 = 0
            r23 = 0
            A0.f r9 = A0.g.g(r20, r21, r22, r23, r24, r25)
            Zq.a r8 = Zq.a.f90143a
            nI.p r17 = r8.a()
            Zq.j$b r18 = Zq.j.b.f90172a
            Zq.j$c r8 = new Zq.j$c
            r8.<init>(r1, r0, r7, r2)
            r0 = 54
            r1 = 2021965236(0x7884bdb4, float:2.1538463E34)
            c1.a r20 = c1.c.e(r1, r6, r8, r3, r0)
            r0 = 817889280(0x30c00000, float:1.3969839E-9)
            r22 = r19 | r0
            r23 = 384(0x180, float:5.38E-43)
            r24 = 2058(0x80a, float:2.884E-42)
            r6 = 0
            r8 = 0
            r19 = 0
            r0 = r7
            r21 = r3
            O0.C4725e0.a(r5, r6, r7, r8, r9, r10, r12, r14, r15, r17, r18, r19, r20, r21, r22, r23, r24)
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x0180
            U0.C4895p.R()
        L_0x0180:
            r7 = r0
        L_0x0181:
            U0.Y0 r6 = r3.n()
            if (r6 == 0) goto L_0x0199
            Zq.g r8 = new Zq.g
            r0 = r8
            r1 = r26
            r2 = r27
            r3 = r7
            r4 = r30
            r5 = r31
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r8)
        L_0x0199:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Zq.j.k(Qq.d, nI.l, O0.F0, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final void l(Q q10, F0 f02, C17642l<? super C11712e.c, C16807N> lVar, C11712e.c cVar) {
        C16314k.d(q10, (C17168i) null, (T) null, new d(f02, (C17164e<? super d>) null), 3, (Object) null).s(new h(lVar, cVar));
    }

    static /* synthetic */ void m(Q q10, F0 f02, C17642l lVar, C11712e.c cVar, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            cVar = null;
        }
        l(q10, f02, lVar, cVar);
    }

    /* access modifiers changed from: private */
    public static final C16807N n(C17642l lVar, C11712e.c cVar, Throwable th2) {
        lVar.invoke(C11712e.c.a.f100679a);
        if (cVar != null) {
            lVar.invoke(cVar);
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N o(Qq.d dVar, C17642l lVar, F0 f02, int i10, int i11, C4889m mVar, int i12) {
        k(dVar, lVar, f02, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: nI.l} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void p(or.C11712e r17, nI.C17631a<XH.C16807N> r18, nI.C17631a<XH.C16807N> r19, U0.C4889m r20, int r21) {
        /*
            r6 = r17
            r7 = r18
            r8 = r19
            r9 = r21
            java.lang.String r0 = "viewModel"
            kotlin.jvm.internal.C17542s.j(r6, r0)
            java.lang.String r0 = "onShowAvailableRewards"
            kotlin.jvm.internal.C17542s.j(r7, r0)
            java.lang.String r0 = "onClosedClicked"
            kotlin.jvm.internal.C17542s.j(r8, r0)
            r0 = -333770321(0xffffffffec1b11af, float:-7.4986804E26)
            r1 = r20
            U0.m r5 = r1.k(r0)
            r1 = r9 & 6
            if (r1 != 0) goto L_0x002f
            boolean r1 = r5.F(r6)
            if (r1 == 0) goto L_0x002c
            r1 = 4
            goto L_0x002d
        L_0x002c:
            r1 = 2
        L_0x002d:
            r1 = r1 | r9
            goto L_0x0030
        L_0x002f:
            r1 = r9
        L_0x0030:
            r2 = r9 & 48
            r3 = 32
            if (r2 != 0) goto L_0x0041
            boolean r2 = r5.F(r7)
            if (r2 == 0) goto L_0x003e
            r2 = r3
            goto L_0x0040
        L_0x003e:
            r2 = 16
        L_0x0040:
            r1 = r1 | r2
        L_0x0041:
            r2 = r9 & 384(0x180, float:5.38E-43)
            r4 = 256(0x100, float:3.59E-43)
            if (r2 != 0) goto L_0x0052
            boolean r2 = r5.F(r8)
            if (r2 == 0) goto L_0x004f
            r2 = r4
            goto L_0x0051
        L_0x004f:
            r2 = 128(0x80, float:1.794E-43)
        L_0x0051:
            r1 = r1 | r2
        L_0x0052:
            r2 = r1 & 147(0x93, float:2.06E-43)
            r10 = 146(0x92, float:2.05E-43)
            if (r2 != r10) goto L_0x0065
            boolean r2 = r5.l()
            if (r2 != 0) goto L_0x005f
            goto L_0x0065
        L_0x005f:
            r5.L()
            r1 = r5
            goto L_0x01a5
        L_0x0065:
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x0071
            r2 = -1
            java.lang.String r10 = "com.ingka.ikea.familyrewards.implementation.compose.history.FamilyRewardsHistoryScreen (FamilyRewardsHistoryScreen.kt:59)"
            U0.C4895p.S(r0, r1, r2, r10)
        L_0x0071:
            TJ.P r10 = r17.m()
            r15 = 0
            r16 = 7
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = r5
            U0.A1 r15 = j3.a.c(r10, r11, r12, r13, r14, r15, r16)
            or.e$d r0 = q(r15)
            or.e$b r10 = r0.c()
            r0 = -1445930223(0xffffffffa9d0db11, float:-9.2750575E-14)
            r5.W(r0)
            boolean r0 = r5.V(r15)
            r2 = r1 & 112(0x70, float:1.57E-43)
            r11 = 1
            r12 = 0
            if (r2 != r3) goto L_0x009a
            r2 = r11
            goto L_0x009b
        L_0x009a:
            r2 = r12
        L_0x009b:
            r0 = r0 | r2
            boolean r2 = r5.F(r6)
            r0 = r0 | r2
            r1 = r1 & 896(0x380, float:1.256E-42)
            if (r1 != r4) goto L_0x00a6
            goto L_0x00a7
        L_0x00a6:
            r11 = r12
        L_0x00a7:
            r0 = r0 | r11
            java.lang.Object r1 = r5.D()
            if (r0 != 0) goto L_0x00b9
            U0.m$a r0 = U0.C4889m.f14007a
            java.lang.Object r0 = r0.a()
            if (r1 != r0) goto L_0x00b7
            goto L_0x00b9
        L_0x00b7:
            r14 = r5
            goto L_0x00cd
        L_0x00b9:
            Zq.j$e r11 = new Zq.j$e
            r13 = 0
            r0 = r11
            r1 = r18
            r2 = r17
            r3 = r19
            r4 = r15
            r14 = r5
            r5 = r13
            r0.<init>(r1, r2, r3, r4, r5)
            r14.u(r11)
            r1 = r11
        L_0x00cd:
            nI.p r1 = (nI.p) r1
            r14.P()
            U0.P.g(r10, r1, r14, r12)
            or.e$d r10 = q(r15)
            r0 = -1445915404(0xffffffffa9d114f4, float:-9.285099E-14)
            r14.W(r0)
            boolean r0 = r14.F(r6)
            java.lang.Object r1 = r14.D()
            if (r0 != 0) goto L_0x00f1
            U0.m$a r0 = U0.C4889m.f14007a
            java.lang.Object r0 = r0.a()
            if (r1 != r0) goto L_0x00f9
        L_0x00f1:
            Zq.b r1 = new Zq.b
            r1.<init>(r6)
            r14.u(r1)
        L_0x00f9:
            r11 = r1
            nI.a r11 = (nI.C17631a) r11
            r14.P()
            r0 = -1445912359(0xffffffffa9d120d9, float:-9.2871626E-14)
            r14.W(r0)
            boolean r0 = r14.F(r6)
            java.lang.Object r1 = r14.D()
            if (r0 != 0) goto L_0x0117
            U0.m$a r0 = U0.C4889m.f14007a
            java.lang.Object r0 = r0.a()
            if (r1 != r0) goto L_0x011f
        L_0x0117:
            Zq.c r1 = new Zq.c
            r1.<init>(r6)
            r14.u(r1)
        L_0x011f:
            r12 = r1
            nI.a r12 = (nI.C17631a) r12
            r14.P()
            r0 = -1445909172(0xffffffffa9d12d4c, float:-9.289322E-14)
            r14.W(r0)
            boolean r0 = r14.F(r6)
            java.lang.Object r1 = r14.D()
            if (r0 != 0) goto L_0x013d
            U0.m$a r0 = U0.C4889m.f14007a
            java.lang.Object r0 = r0.a()
            if (r1 != r0) goto L_0x0145
        L_0x013d:
            Zq.d r1 = new Zq.d
            r1.<init>(r6)
            r14.u(r1)
        L_0x0145:
            r13 = r1
            nI.l r13 = (nI.C17642l) r13
            r14.P()
            r0 = 0
            r1 = r14
            r2 = r15
            r15 = r0
            v(r10, r11, r12, r13, r14, r15)
            or.e$d r0 = q(r2)
            or.e$a r0 = r0.a()
            if (r0 == 0) goto L_0x019c
            boolean r2 = r0 instanceof or.C11712e.a.C2355a
            if (r2 == 0) goto L_0x0196
            or.e$a$a r0 = (or.C11712e.a.C2355a) r0
            Qq.d r10 = r0.a()
            r0 = -1445898777(0xffffffffa9d155e7, float:-9.296366E-14)
            r1.W(r0)
            boolean r0 = r1.F(r6)
            java.lang.Object r2 = r1.D()
            if (r0 != 0) goto L_0x017e
            U0.m$a r0 = U0.C4889m.f14007a
            java.lang.Object r0 = r0.a()
            if (r2 != r0) goto L_0x0186
        L_0x017e:
            Zq.j$f r2 = new Zq.j$f
            r2.<init>(r6)
            r1.u(r2)
        L_0x0186:
            uI.h r2 = (uI.C18059h) r2
            r1.P()
            r11 = r2
            nI.l r11 = (nI.C17642l) r11
            r14 = 0
            r15 = 4
            r12 = 0
            r13 = r1
            k(r10, r11, r12, r13, r14, r15)
            goto L_0x019c
        L_0x0196:
            XH.t r0 = new XH.t
            r0.<init>()
            throw r0
        L_0x019c:
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x01a5
            U0.C4895p.R()
        L_0x01a5:
            U0.Y0 r0 = r1.n()
            if (r0 == 0) goto L_0x01b3
            Zq.e r1 = new Zq.e
            r1.<init>(r6, r7, r8, r9)
            r0.a(r1)
        L_0x01b3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Zq.j.p(or.e, nI.a, nI.a, U0.m, int):void");
    }

    /* access modifiers changed from: private */
    public static final C11712e.d q(A1<? extends C11712e.d> a12) {
        return (C11712e.d) a12.getValue();
    }

    /* access modifiers changed from: private */
    public static final C16807N r(C11712e eVar) {
        eVar.C(C11712e.c.C2357c.f100681a);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N s(C11712e eVar) {
        eVar.C(C11712e.c.d.f100682a);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N t(C11712e eVar, String str) {
        C17542s.j(str, "filterYear");
        eVar.C(new C11712e.c.C2358e(str));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N u(C11712e eVar, C17631a aVar, C17631a aVar2, int i10, C4889m mVar, int i11) {
        p(eVar, aVar, aVar2, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    public static final void v(C11712e.d dVar, C17631a<C16807N> aVar, C17631a<C16807N> aVar2, C17642l<? super String, C16807N> lVar, C4889m mVar, int i10) {
        int i11;
        C5079j jVar;
        int i12;
        C11712e.d dVar2 = dVar;
        C17631a<C16807N> aVar3 = aVar;
        C17631a<C16807N> aVar4 = aVar2;
        C17642l<? super String, C16807N> lVar2 = lVar;
        int i13 = i10;
        C17542s.j(dVar2, "uiState");
        C17542s.j(aVar3, "onClosedClicked");
        C17542s.j(aVar4, "onExpiringKeysClicked");
        C17542s.j(lVar2, "updateDataWithFilter");
        C4889m k10 = mVar.k(518615654);
        if ((i13 & 6) == 0) {
            i11 = (k10.F(dVar2) ? 4 : 2) | i13;
        } else {
            i11 = i13;
        }
        if ((i13 & 48) == 0) {
            i11 |= k10.F(aVar3) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i11 |= k10.F(aVar4) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i11 |= k10.F(lVar2) ? RecyclerView.n.FLAG_MOVED : 1024;
        }
        int i14 = i11;
        if ((i14 & 1171) != 1170 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(518615654, i14, -1, "com.ingka.ikea.familyrewards.implementation.compose.history.FamilyRewardsHistoryScreenInternal (FamilyRewardsHistoryScreen.kt:147)");
            }
            d.a aVar5 = androidx.compose.ui.d.f18749a;
            androidx.compose.ui.d f10 = J.f(aVar5, 0.0f, 1, (Object) null);
            C5437c.a aVar6 = C5437c.f24302a;
            I h10 = C5077h.h(aVar6.o(), false);
            int a10 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            androidx.compose.ui.d e10 = androidx.compose.ui.c.e(k10, f10);
            C4504g.a aVar7 = C4504g.f6515W;
            C17631a<C4504g> a11 = aVar7.a();
            if (k10.m() == null) {
                C4883j.c();
            }
            k10.I();
            if (k10.i()) {
                k10.p(a11);
            } else {
                k10.t();
            }
            C4889m a12 = F1.a(k10);
            F1.c(a12, h10, aVar7.c());
            F1.c(a12, s10, aVar7.e());
            p<C4504g, Integer, C16807N> b10 = aVar7.b();
            if (a12.i() || !C17542s.e(a12.D(), Integer.valueOf(a10))) {
                a12.u(Integer.valueOf(a10));
                a12.w(Integer.valueOf(a10), b10);
            }
            F1.c(a12, e10, aVar7.d());
            C5079j jVar2 = C5079j.f18125a;
            if (dVar2 instanceof C11712e.d.b) {
                k10.W(-1688002632);
                br.p.i(k10, 0);
                k10.P();
                jVar = jVar2;
                i12 = 0;
            } else if (dVar2 instanceof C11712e.d.a) {
                k10.W(-1687875625);
                jVar = jVar2;
                i12 = 0;
                C11865e.i(J1.j.b(Oo.b.f84536V8, k10, 0), J1.j.b(Oo.b.f84526U8, k10, 0), J1.j.b(Oo.b.f84616d5, k10, 0), (androidx.compose.ui.d) null, aVar, k10, (i14 << 9) & 57344, 8);
                k10.P();
            } else {
                jVar = jVar2;
                i12 = 0;
                if (dVar2 instanceof C11712e.d.C2359d) {
                    k10.W(-1687465650);
                    C11712e.d.C2359d dVar3 = (C11712e.d.C2359d) dVar2;
                    br.t.f(dVar3, lVar, dVar3.g(), aVar2, k10, ((i14 >> 6) & 112) | ((i14 << 3) & 7168));
                    k10.P();
                } else if (dVar2 instanceof C11712e.d.c) {
                    k10.W(-1687087481);
                    C11124e.d(((C11712e.d.c) dVar2).d(), k10, 0);
                    k10.P();
                } else {
                    k10.W(-193000592);
                    k10.P();
                    throw new t();
                }
            }
            k10.W(-192966422);
            if (!(dVar2 instanceof C11712e.d.a)) {
                i(aVar3, jVar.a(aVar5, aVar6.n()), k10, (i14 >> 3) & 14, i12);
            }
            k10.P();
            k10.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new f(dVar, aVar, aVar2, lVar, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N w(C11712e.d dVar, C17631a aVar, C17631a aVar2, C17642l lVar, int i10, C4889m mVar, int i11) {
        v(dVar, aVar, aVar2, lVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }
}
