package com.ingka.ikea.offerhub.impl.ui;

import Bw.j;
import E1.I;
import G1.C4504g;
import KJ.C15987c;
import N1.P;
import O0.C4725e0;
import O0.C4762x0;
import O0.F0;
import O0.H0;
import O0.L0;
import Op.c1;
import QJ.C16297b0;
import QJ.Q;
import QJ.T;
import S1.C;
import S1.C4820m;
import S1.C4830x;
import SC.C13607l;
import SC.G0;
import SC.Y2;
import TC.C13679b;
import U0.A1;
import U0.B;
import U0.C4883j;
import U0.C4889m;
import U0.C4894o0;
import U0.C4895p;
import U0.C4899r0;
import U0.C4912y;
import U0.F1;
import U0.M0;
import U0.Y0;
import U0.o1;
import XH.C16807N;
import XH.y;
import Y1.k;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.C5080k;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.C5116k1;
import androidx.recyclerview.widget.RecyclerView;
import c1.C5264a;
import c2.h;
import com.google.ar.core.ImageMetadata;
import com.ingka.ikea.analytics.Interaction$Component;
import com.ingka.ikea.core.model.Category;
import com.ingka.ikea.offerhub.impl.ui.i;
import dI.C17164e;
import dI.C17168i;
import dI.C17169j;
import eI.C17187b;
import i1.C5437c;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17525a;
import kotlin.jvm.internal.C17540p;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.q;
import nI.r;
import r0.m;
import s0.C5834E;
import s0.C5848T;
import s0.C5857c;
import s0.C5862h;
import sB.C15035a;
import t0.C5938c;
import t0.x;
import tB.C15062c;
import tK.C18030v;
import uK.C18146a;
import zw.C15347b0;
import zw.C15349c0;
import zw.C15351d0;
import zw.C15353e0;
import zw.C15355f0;
import zw.C15357g0;
import zw.C15358h;
import zw.C15360i;
import zw.J0;
import zw.S;
import zw.U;
import zw.V;
import zw.W;
import zw.X;
import zw.s0;
import zw.w0;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\u001aE\u0010\n\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u0006H\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a§\u0001\u0010\u0016\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u00062\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e2\"\u0010\u0012\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u00040\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00040\u00022\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u000eH\u0001¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0013\u0010\u0019\u001a\u00020\u0004*\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u001a!\u0010\u001b\u001a\u00020\u0004*\u00020\u00182\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000eH\u0002¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0001\u0010!\u001a\u00020\u0004*\u00020\u00182\u0006\u0010\r\u001a\u00020\f2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u00062\"\u0010\u0012\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u00040\u00102\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e2\u0006\u0010\u001f\u001a\u00020\u001e2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00040\u0002H\u0002¢\u0006\u0004\b!\u0010\"\u001a\u0013\u0010#\u001a\u00020\u0004*\u00020\u0018H\u0002¢\u0006\u0004\b#\u0010\u001a\u001a\u0013\u0010$\u001a\u00020\u0004*\u00020\u0018H\u0002¢\u0006\u0004\b$\u0010\u001a\u001a\u0013\u0010%\u001a\u00020\u0004*\u00020\u0018H\u0002¢\u0006\u0004\b%\u0010\u001a¨\u0006)²\u0006\f\u0010\r\u001a\u00020\f8\nX\u0002²\u0006\u000e\u0010'\u001a\u00020&8\n@\nX\u0002²\u0006\u000e\u0010(\u001a\u00020&8\n@\nX\u0002²\u0006\u000e\u0010\u001f\u001a\u00020\u001e8\n@\nX\u0002"}, d2 = {"LBw/c;", "offerHubViewModel", "Lkotlin/Function1;", "Lcom/ingka/ikea/offerhub/impl/ui/i;", "LXH/N;", "onScreenUiEvent", "Lkotlin/Function2;", "LOp/c1;", "Lcom/ingka/ikea/analytics/Interaction$Component;", "onProductItemEvent", "w", "(LBw/c;LnI/l;LnI/p;LU0/m;I)V", "LBw/j;", "uiState", "Lkotlin/Function0;", "onErrorTryAgainClicked", "Lkotlin/Function3;", "", "onShuffleClicked", "onPullToRefresh", "onOpenShoppingListClicked", "onSnackbarConsumed", "q", "(LBw/j;LnI/l;LnI/p;LnI/a;LnI/q;LnI/a;LnI/l;LnI/a;LU0/m;I)V", "Lt0/x;", "X", "(Lt0/x;)V", "W", "(Lt0/x;LnI/a;)V", "onFilterButtonClicked", "", "shuffleSectionHeightInPx", "onShuffleSectionHeightChanged", "J", "(Lt0/x;LBw/j;LnI/l;LnI/p;LnI/q;LnI/a;ILnI/l;)V", "Y", "V", "Z", "", "showFilterBottomSheet", "isRefreshingState", "offerhub-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class b {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ L0 f119167a;

        a(L0 l02) {
            this.f119167a = l02;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-1270920110, i10, -1, "com.ingka.ikea.offerhub.impl.ui.OfferHub.<anonymous> (OfferHubComposables.kt:112)");
                }
                Y2.c(this.f119167a, (androidx.compose.ui.d) null, (r<? super H0, ? super p<? super C4889m, ? super Integer, C16807N>, ? super C4889m, ? super Integer, C16807N>) null, mVar, 6, 6);
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
    /* renamed from: com.ingka.ikea.offerhub.impl.ui.b$b  reason: collision with other inner class name */
    static final class C2979b implements q<C5834E, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f119168a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f119169b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Q f119170c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ R0.e f119171d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ j f119172e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ F0 f119173f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ q<Interaction$Component, String, String, C16807N> f119174g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C4899r0<Boolean> f119175h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ C17642l<i, C16807N> f119176i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f119177j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ p<c1, Interaction$Component, C16807N> f119178k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ C4899r0<Boolean> f119179l;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
        @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.offerhub.impl.ui.OfferHubComposablesKt$OfferHub$2$1$1$1", f = "OfferHubComposables.kt", l = {124}, m = "invokeSuspend")
        /* renamed from: com.ingka.ikea.offerhub.impl.ui.b$b$a */
        static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f119180c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ C4899r0<Boolean> f119181d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(C4899r0<Boolean> r0Var, C17164e<? super a> eVar) {
                super(2, eVar);
                this.f119181d = r0Var;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new a(this.f119181d, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f119180c;
                if (i10 == 0) {
                    y.b(obj);
                    b.u(this.f119181d, true);
                    this.f119180c = 1;
                    if (C16297b0.b(300, this) == f10) {
                        return f10;
                    }
                } else if (i10 == 1) {
                    y.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b.u(this.f119181d, false);
                return C16807N.f139792a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.ingka.ikea.offerhub.impl.ui.b$b$b  reason: collision with other inner class name */
        static final class C2980b implements q<C5857c, C4889m, Integer, C16807N> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ boolean f119182a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ R0.e f119183b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C4899r0<Boolean> f119184c;

            C2980b(boolean z10, R0.e eVar, C4899r0<Boolean> r0Var) {
                this.f119182a = z10;
                this.f119183b = eVar;
                this.f119184c = r0Var;
            }

            public final void a(C5857c cVar, C4889m mVar, int i10) {
                int i11;
                C5857c cVar2 = cVar;
                C4889m mVar2 = mVar;
                C17542s.j(cVar2, "$this$PullToRefreshBox");
                if ((i10 & 6) == 0) {
                    i11 = i10 | (mVar2.V(cVar2) ? 4 : 2);
                } else {
                    i11 = i10;
                }
                if ((i11 & 19) != 18 || !mVar.l()) {
                    if (C4895p.J()) {
                        C4895p.S(-1024763742, i11, -1, "com.ingka.ikea.offerhub.impl.ui.OfferHub.<anonymous>.<anonymous> (OfferHubComposables.kt:130)");
                    }
                    if (this.f119182a) {
                        R0.b bVar = R0.b.f12188a;
                        boolean E10 = b.t(this.f119184c);
                        androidx.compose.ui.d a10 = cVar2.a(androidx.compose.ui.d.f18749a, C5437c.f24302a.m());
                        C18030v vVar = C18030v.f147664a;
                        int i12 = C18030v.f147665b;
                        long G02 = vVar.a(mVar2, i12).G0();
                        bVar.a(this.f119183b, E10, a10, vVar.a(mVar2, i12).k(), G02, 0.0f, mVar, R0.b.f12192e << 18, 32);
                    }
                    if (C4895p.J()) {
                        C4895p.R();
                        return;
                    }
                    return;
                }
                mVar.L();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                a((C5857c) obj, (C4889m) obj2, ((Number) obj3).intValue());
                return C16807N.f139792a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.ingka.ikea.offerhub.impl.ui.b$b$c */
        static final class c implements q<C5857c, C4889m, Integer, C16807N> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C5834E f119185a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C17642l<i, C16807N> f119186b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ j f119187c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ C17631a<C16807N> f119188d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ p<c1, Interaction$Component, C16807N> f119189e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ q<Interaction$Component, String, String, C16807N> f119190f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ C4899r0<Boolean> f119191g;

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ C4894o0 f119192h;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.ingka.ikea.offerhub.impl.ui.b$b$c$a */
            static final class a implements q<C5938c, C4889m, Integer, C16807N> {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ C17642l<i, C16807N> f119193a;

                a(C17642l<? super i, C16807N> lVar) {
                    this.f119193a = lVar;
                }

                /* access modifiers changed from: private */
                public static final C16807N c(C17642l lVar) {
                    lVar.invoke(i.c.f119210a);
                    return C16807N.f139792a;
                }

                /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: nI.a} */
                /* JADX WARNING: Multi-variable type inference failed */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void b(t0.C5938c r14, U0.C4889m r15, int r16) {
                    /*
                        r13 = this;
                        r0 = r13
                        r10 = r15
                        r1 = r16
                        java.lang.String r2 = "$this$item"
                        r3 = r14
                        kotlin.jvm.internal.C17542s.j(r14, r2)
                        r2 = r1 & 17
                        r3 = 16
                        if (r2 != r3) goto L_0x001b
                        boolean r2 = r15.l()
                        if (r2 != 0) goto L_0x0017
                        goto L_0x001b
                    L_0x0017:
                        r15.L()
                        goto L_0x006d
                    L_0x001b:
                        boolean r2 = U0.C4895p.J()
                        if (r2 == 0) goto L_0x002a
                        r2 = -1
                        java.lang.String r3 = "com.ingka.ikea.offerhub.impl.ui.OfferHub.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OfferHubComposables.kt:153)"
                        r4 = -795936043(0xffffffffd08efad5, float:-1.91904256E10)
                        U0.C4895p.S(r4, r1, r2, r3)
                    L_0x002a:
                        ol.v r1 = ol.v.BACK
                        r2 = 400150232(0x17d9ced8, float:1.4075511E-24)
                        r15.W(r2)
                        nI.l<com.ingka.ikea.offerhub.impl.ui.i, XH.N> r2 = r0.f119193a
                        boolean r2 = r15.V(r2)
                        nI.l<com.ingka.ikea.offerhub.impl.ui.i, XH.N> r3 = r0.f119193a
                        java.lang.Object r4 = r15.D()
                        if (r2 != 0) goto L_0x0048
                        U0.m$a r2 = U0.C4889m.f14007a
                        java.lang.Object r2 = r2.a()
                        if (r4 != r2) goto L_0x0050
                    L_0x0048:
                        com.ingka.ikea.offerhub.impl.ui.h r4 = new com.ingka.ikea.offerhub.impl.ui.h
                        r4.<init>(r3)
                        r15.u(r4)
                    L_0x0050:
                        r2 = r4
                        nI.a r2 = (nI.C17631a) r2
                        r15.P()
                        r11 = 6
                        r12 = 508(0x1fc, float:7.12E-43)
                        r3 = 0
                        r4 = 0
                        r5 = 0
                        r6 = 0
                        r7 = 0
                        r8 = 0
                        r9 = 0
                        r10 = r15
                        ol.p.c(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                        boolean r1 = U0.C4895p.J()
                        if (r1 == 0) goto L_0x006d
                        U0.C4895p.R()
                    L_0x006d:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.offerhub.impl.ui.b.C2979b.c.a.b(t0.c, U0.m, int):void");
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    b((C5938c) obj, (C4889m) obj2, ((Number) obj3).intValue());
                    return C16807N.f139792a;
                }
            }

            c(C5834E e10, C17642l<? super i, C16807N> lVar, j jVar, C17631a<C16807N> aVar, p<? super c1, ? super Interaction$Component, C16807N> pVar, q<? super Interaction$Component, ? super String, ? super String, C16807N> qVar, C4899r0<Boolean> r0Var, C4894o0 o0Var) {
                this.f119185a = e10;
                this.f119186b = lVar;
                this.f119187c = jVar;
                this.f119188d = aVar;
                this.f119189e = pVar;
                this.f119190f = qVar;
                this.f119191g = r0Var;
                this.f119192h = o0Var;
            }

            /* access modifiers changed from: private */
            public static final C16807N f(j jVar, C17631a aVar, C17642l lVar, p pVar, q qVar, C4899r0 r0Var, C4894o0 o0Var, x xVar) {
                C17542s.j(xVar, "$this$LazyColumn");
                xVar.b("TopAppBar", "TopAppBar", c1.c.c(-795936043, true, new a(lVar)));
                if (jVar.l()) {
                    b.X(xVar);
                } else if (jVar.j()) {
                    b.W(xVar, aVar);
                } else {
                    b.J(xVar, jVar, lVar, pVar, qVar, new f(r0Var), C2979b.h(o0Var), new g(o0Var));
                }
                return C16807N.f139792a;
            }

            /* access modifiers changed from: private */
            public static final C16807N h(C4899r0 r0Var) {
                b.s(r0Var, true);
                return C16807N.f139792a;
            }

            /* access modifiers changed from: private */
            public static final C16807N i(C4894o0 o0Var, int i10) {
                C2979b.i(o0Var, i10);
                return C16807N.f139792a;
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v11, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v13, resolved type: com.ingka.ikea.offerhub.impl.ui.e} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: com.ingka.ikea.offerhub.impl.ui.e} */
            /* JADX WARNING: type inference failed for: r15v12 */
            /* JADX WARNING: Code restructure failed: missing block: B:11:0x0077, code lost:
                if (r15 == U0.C4889m.f14007a.a()) goto L_0x0079;
             */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void e(s0.C5857c r13, U0.C4889m r14, int r15) {
                /*
                    r12 = this;
                    java.lang.String r0 = "$this$PullToRefreshBox"
                    kotlin.jvm.internal.C17542s.j(r13, r0)
                    r13 = r15 & 17
                    r0 = 16
                    if (r13 != r0) goto L_0x0017
                    boolean r13 = r14.l()
                    if (r13 != 0) goto L_0x0012
                    goto L_0x0017
                L_0x0012:
                    r14.L()
                    goto L_0x009f
                L_0x0017:
                    boolean r13 = U0.C4895p.J()
                    if (r13 == 0) goto L_0x0026
                    r13 = -1
                    java.lang.String r0 = "com.ingka.ikea.offerhub.impl.ui.OfferHub.<anonymous>.<anonymous> (OfferHubComposables.kt:144)"
                    r1 = 1890418241(0x70ad7e41, float:4.295483E29)
                    U0.C4895p.S(r1, r15, r13, r0)
                L_0x0026:
                    androidx.compose.ui.d$a r13 = androidx.compose.ui.d.f18749a
                    r15 = 1
                    r0 = 0
                    r1 = 0
                    androidx.compose.ui.d r13 = androidx.compose.foundation.layout.J.f(r13, r1, r15, r0)
                    s0.E r15 = r12.f119185a
                    androidx.compose.ui.d r0 = androidx.compose.foundation.layout.D.h(r13, r15)
                    r13 = -295283735(0xffffffffee6653e9, float:-1.7820748E28)
                    r14.W(r13)
                    nI.l<com.ingka.ikea.offerhub.impl.ui.i, XH.N> r13 = r12.f119186b
                    boolean r13 = r14.V(r13)
                    Bw.j r15 = r12.f119187c
                    boolean r15 = r14.F(r15)
                    r13 = r13 | r15
                    nI.a<XH.N> r15 = r12.f119188d
                    boolean r15 = r14.V(r15)
                    r13 = r13 | r15
                    nI.p<Op.c1, com.ingka.ikea.analytics.Interaction$Component, XH.N> r15 = r12.f119189e
                    boolean r15 = r14.V(r15)
                    r13 = r13 | r15
                    nI.q<com.ingka.ikea.analytics.Interaction$Component, java.lang.String, java.lang.String, XH.N> r15 = r12.f119190f
                    boolean r15 = r14.V(r15)
                    r13 = r13 | r15
                    Bw.j r2 = r12.f119187c
                    nI.a<XH.N> r3 = r12.f119188d
                    nI.l<com.ingka.ikea.offerhub.impl.ui.i, XH.N> r4 = r12.f119186b
                    nI.p<Op.c1, com.ingka.ikea.analytics.Interaction$Component, XH.N> r5 = r12.f119189e
                    nI.q<com.ingka.ikea.analytics.Interaction$Component, java.lang.String, java.lang.String, XH.N> r6 = r12.f119190f
                    U0.r0<java.lang.Boolean> r7 = r12.f119191g
                    U0.o0 r8 = r12.f119192h
                    java.lang.Object r15 = r14.D()
                    if (r13 != 0) goto L_0x0079
                    U0.m$a r13 = U0.C4889m.f14007a
                    java.lang.Object r13 = r13.a()
                    if (r15 != r13) goto L_0x0082
                L_0x0079:
                    com.ingka.ikea.offerhub.impl.ui.e r15 = new com.ingka.ikea.offerhub.impl.ui.e
                    r1 = r15
                    r1.<init>(r2, r3, r4, r5, r6, r7, r8)
                    r14.u(r15)
                L_0x0082:
                    r8 = r15
                    nI.l r8 = (nI.C17642l) r8
                    r14.P()
                    r10 = 0
                    r11 = 254(0xfe, float:3.56E-43)
                    r1 = 0
                    r2 = 0
                    r3 = 0
                    r4 = 0
                    r5 = 0
                    r6 = 0
                    r7 = 0
                    r9 = r14
                    t0.C5937b.a(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                    boolean r13 = U0.C4895p.J()
                    if (r13 == 0) goto L_0x009f
                    U0.C4895p.R()
                L_0x009f:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.offerhub.impl.ui.b.C2979b.c.e(s0.c, U0.m, int):void");
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                e((C5857c) obj, (C4889m) obj2, ((Number) obj3).intValue());
                return C16807N.f139792a;
            }
        }

        C2979b(boolean z10, C17631a<C16807N> aVar, Q q10, R0.e eVar, j jVar, F0 f02, q<? super Interaction$Component, ? super String, ? super String, C16807N> qVar, C4899r0<Boolean> r0Var, C17642l<? super i, C16807N> lVar, C17631a<C16807N> aVar2, p<? super c1, ? super Interaction$Component, C16807N> pVar, C4899r0<Boolean> r0Var2) {
            this.f119168a = z10;
            this.f119169b = aVar;
            this.f119170c = q10;
            this.f119171d = eVar;
            this.f119172e = jVar;
            this.f119173f = f02;
            this.f119174g = qVar;
            this.f119175h = r0Var;
            this.f119176i = lVar;
            this.f119177j = aVar2;
            this.f119178k = pVar;
            this.f119179l = r0Var2;
        }

        /* access modifiers changed from: private */
        public static final int h(C4894o0 o0Var) {
            return o0Var.e();
        }

        /* access modifiers changed from: private */
        public static final void i(C4894o0 o0Var, int i10) {
            o0Var.g(i10);
        }

        /* access modifiers changed from: private */
        public static final C16807N j(boolean z10, C17631a aVar, Q q10, C4899r0 r0Var) {
            if (z10) {
                aVar.invoke();
                QJ.F0 unused = C16314k.d(q10, (C17168i) null, (T) null, new a(r0Var, (C17164e<? super a>) null), 3, (Object) null);
            }
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N k(C4899r0 r0Var) {
            b.s(r0Var, false);
            return C16807N.f139792a;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: nI.a} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void f(s0.C5834E r21, U0.C4889m r22, int r23) {
            /*
                r20 = this;
                r0 = r20
                r2 = r21
                r11 = r22
                java.lang.String r1 = "contentPadding"
                kotlin.jvm.internal.C17542s.j(r2, r1)
                r1 = r23 & 6
                if (r1 != 0) goto L_0x001b
                boolean r1 = r11.V(r2)
                if (r1 == 0) goto L_0x0017
                r1 = 4
                goto L_0x0018
            L_0x0017:
                r1 = 2
            L_0x0018:
                r1 = r23 | r1
                goto L_0x001d
            L_0x001b:
                r1 = r23
            L_0x001d:
                r3 = r1 & 19
                r4 = 18
                if (r3 != r4) goto L_0x002f
                boolean r3 = r22.l()
                if (r3 != 0) goto L_0x002a
                goto L_0x002f
            L_0x002a:
                r22.L()
                goto L_0x0161
            L_0x002f:
                boolean r3 = U0.C4895p.J()
                if (r3 == 0) goto L_0x003e
                r3 = -1
                java.lang.String r4 = "com.ingka.ikea.offerhub.impl.ui.OfferHub.<anonymous> (OfferHubComposables.kt:114)"
                r5 = 475941211(0x1c5e495b, float:7.354845E-22)
                U0.C4895p.S(r5, r1, r3, r4)
            L_0x003e:
                r1 = -2013908275(0xffffffff87f632cd, float:-3.7043824E-34)
                r11.W(r1)
                java.lang.Object r1 = r22.D()
                U0.m$a r12 = U0.C4889m.f14007a
                java.lang.Object r3 = r12.a()
                if (r1 != r3) goto L_0x0058
                r1 = 0
                U0.o0 r1 = U0.C4877g1.a(r1)
                r11.u(r1)
            L_0x0058:
                r9 = r1
                U0.o0 r9 = (U0.C4894o0) r9
                r22.P()
                U0.r0<java.lang.Boolean> r1 = r0.f119175h
                boolean r10 = com.ingka.ikea.offerhub.impl.ui.b.t(r1)
                androidx.compose.ui.d$a r1 = androidx.compose.ui.d.f18749a
                r3 = 0
                r13 = 1
                r14 = 0
                androidx.compose.ui.d r1 = androidx.compose.foundation.layout.J.f(r1, r3, r13, r14)
                androidx.compose.ui.d r15 = androidx.compose.foundation.layout.D.h(r1, r2)
                r1 = -2013904000(0xffffffff87f64380, float:-3.705364E-34)
                r11.W(r1)
                boolean r1 = r0.f119168a
                boolean r1 = r11.b(r1)
                nI.a<XH.N> r3 = r0.f119169b
                boolean r3 = r11.V(r3)
                r1 = r1 | r3
                QJ.Q r3 = r0.f119170c
                boolean r3 = r11.F(r3)
                r1 = r1 | r3
                boolean r3 = r0.f119168a
                nI.a<XH.N> r4 = r0.f119169b
                QJ.Q r5 = r0.f119170c
                U0.r0<java.lang.Boolean> r6 = r0.f119175h
                java.lang.Object r7 = r22.D()
                if (r1 != 0) goto L_0x009f
                java.lang.Object r1 = r12.a()
                if (r7 != r1) goto L_0x00a7
            L_0x009f:
                com.ingka.ikea.offerhub.impl.ui.c r7 = new com.ingka.ikea.offerhub.impl.ui.c
                r7.<init>(r3, r4, r5, r6)
                r11.u(r7)
            L_0x00a7:
                r16 = r7
                nI.a r16 = (nI.C17631a) r16
                r22.P()
                R0.e r8 = r0.f119171d
                com.ingka.ikea.offerhub.impl.ui.b$b$b r1 = new com.ingka.ikea.offerhub.impl.ui.b$b$b
                boolean r3 = r0.f119168a
                U0.r0<java.lang.Boolean> r4 = r0.f119175h
                r1.<init>(r3, r8, r4)
                r3 = -1024763742(0xffffffffc2eb58a2, float:-117.67311)
                r7 = 54
                c1.a r17 = c1.c.e(r3, r13, r1, r11, r7)
                com.ingka.ikea.offerhub.impl.ui.b$b$c r6 = new com.ingka.ikea.offerhub.impl.ui.b$b$c
                nI.l<com.ingka.ikea.offerhub.impl.ui.i, XH.N> r3 = r0.f119176i
                Bw.j r4 = r0.f119172e
                nI.a<XH.N> r5 = r0.f119177j
                nI.p<Op.c1, com.ingka.ikea.analytics.Interaction$Component, XH.N> r1 = r0.f119178k
                nI.q<com.ingka.ikea.analytics.Interaction$Component, java.lang.String, java.lang.String, XH.N> r7 = r0.f119174g
                U0.r0<java.lang.Boolean> r14 = r0.f119179l
                r18 = r1
                r1 = r6
                r2 = r21
                r19 = r12
                r12 = r6
                r6 = r18
                r0 = 54
                r18 = r8
                r8 = r14
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
                r1 = 1890418241(0x70ad7e41, float:4.295483E29)
                c1.a r7 = c1.c.e(r1, r13, r12, r11, r0)
                r9 = 1769472(0x1b0000, float:2.479558E-39)
                r0 = 16
                r5 = 0
                r1 = r10
                r2 = r16
                r3 = r15
                r4 = r18
                r6 = r17
                r8 = r22
                r10 = r0
                R0.c.d(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
                r0 = r20
                U0.r0<java.lang.Boolean> r1 = r0.f119179l
                boolean r1 = com.ingka.ikea.offerhub.impl.ui.b.r(r1)
                if (r1 == 0) goto L_0x0158
                Bw.j r1 = r0.f119172e
                Bw.j$d r1 = r1.k()
                if (r1 == 0) goto L_0x014e
                boolean r2 = r1 instanceof Bw.j.d.a
                if (r2 == 0) goto L_0x0115
                Bw.j$d$a r1 = (Bw.j.d.a) r1
                goto L_0x0116
            L_0x0115:
                r1 = 0
            L_0x0116:
                if (r1 == 0) goto L_0x011e
                Bw.j$d$a$a r1 = r1.a()
                r2 = r1
                goto L_0x011f
            L_0x011e:
                r2 = 0
            L_0x011f:
                if (r2 != 0) goto L_0x0122
                goto L_0x014e
            L_0x0122:
                O0.F0 r1 = r0.f119173f
                r3 = -2013815859(0xffffffff87f79bcd, float:-3.7256E-34)
                r11.W(r3)
                U0.r0<java.lang.Boolean> r3 = r0.f119179l
                java.lang.Object r4 = r22.D()
                java.lang.Object r5 = r19.a()
                if (r4 != r5) goto L_0x013e
                com.ingka.ikea.offerhub.impl.ui.d r4 = new com.ingka.ikea.offerhub.impl.ui.d
                r4.<init>(r3)
                r11.u(r4)
            L_0x013e:
                r3 = r4
                nI.a r3 = (nI.C17631a) r3
                r22.P()
                nI.q<com.ingka.ikea.analytics.Interaction$Component, java.lang.String, java.lang.String, XH.N> r4 = r0.f119174g
                r6 = 384(0x180, float:5.38E-43)
                r5 = r22
                zw.P.b(r1, r2, r3, r4, r5, r6)
                goto L_0x0158
            L_0x014e:
                boolean r1 = U0.C4895p.J()
                if (r1 == 0) goto L_0x0157
                U0.C4895p.R()
            L_0x0157:
                return
            L_0x0158:
                boolean r1 = U0.C4895p.J()
                if (r1 == 0) goto L_0x0161
                U0.C4895p.R()
            L_0x0161:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.offerhub.impl.ui.b.C2979b.f(s0.E, U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            f((C5834E) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class c extends C17525a implements C17631a<C16807N> {
        c(Object obj) {
            super(0, obj, Bw.c.class, "retry", "retry(Z)V", 0);
        }

        public final void a() {
            Bw.c.T((Bw.c) this.f144363a, false, 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class d extends C17540p implements q<Interaction$Component, String, String, C16807N> {
        d(Object obj) {
            super(3, obj, Bw.c.class, "shuffle", "shuffle(Lcom/ingka/ikea/analytics/Interaction$Component;Ljava/lang/String;Ljava/lang/String;)V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            t((Interaction$Component) obj, (String) obj2, (String) obj3);
            return C16807N.f139792a;
        }

        public final void t(Interaction$Component interaction$Component, String str, String str2) {
            C17542s.j(interaction$Component, "p0");
            ((Bw.c) this.receiver).U(interaction$Component, str, str2);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class e extends C17525a implements C17631a<C16807N> {
        e(Object obj) {
            super(0, obj, Bw.c.class, "pullToRefresh", "pullToRefresh(Z)V", 0);
        }

        public final void a() {
            Bw.c.R((Bw.c) this.f144363a, false, 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class f extends C17540p implements C17631a<C16807N> {
        f(Object obj) {
            super(0, obj, Bw.c.class, "onShoppingListModifiedConsumed", "onShoppingListModifiedConsumed()V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            t();
            return C16807N.f139792a;
        }

        public final void t() {
            ((Bw.c) this.receiver).P();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class g implements q<C5938c, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f119194a;

        g(C17631a<C16807N> aVar) {
            this.f119194a = aVar;
        }

        public final void a(C5938c cVar, C4889m mVar, int i10) {
            C4889m mVar2 = mVar;
            int i11 = i10;
            C17542s.j(cVar, "$this$item");
            if ((i11 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-134380988, i11, -1, "com.ingka.ikea.offerhub.impl.ui.error.<anonymous> (OfferHubComposables.kt:218)");
                }
                d.a aVar = androidx.compose.ui.d.f18749a;
                androidx.compose.ui.d i12 = TC.e.i(J.h(aVar, 0.0f, 1, (Object) null));
                C5073d.f n10 = C5073d.f18068a.n(h.B((float) 16));
                C17631a<C16807N> aVar2 = this.f119194a;
                C5437c.a aVar3 = C5437c.f24302a;
                I a10 = C5080k.a(n10, aVar3.k(), mVar2, 6);
                int a11 = C4883j.a(mVar2, 0);
                C4912y s10 = mVar.s();
                androidx.compose.ui.d e10 = androidx.compose.ui.c.e(mVar2, i12);
                C4504g.a aVar4 = C4504g.f6515W;
                C17631a<C4504g> a12 = aVar4.a();
                if (mVar.m() == null) {
                    C4883j.c();
                }
                mVar.I();
                if (mVar.i()) {
                    mVar2.p(a12);
                } else {
                    mVar.t();
                }
                C4889m a13 = F1.a(mVar);
                F1.c(a13, a10, aVar4.c());
                F1.c(a13, s10, aVar4.e());
                p<C4504g, Integer, C16807N> b10 = aVar4.b();
                if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                    a13.u(Integer.valueOf(a11));
                    a13.w(Integer.valueOf(a11), b10);
                }
                F1.c(a13, e10, aVar4.d());
                C5862h hVar = C5862h.f28810a;
                SC.F0.b(C18146a.f148569o, J1.j.b(Oo.b.f84823w3, mVar2, 0), C5116k1.a(hVar.b(aVar, aVar3.g()), "TryAgainButton"), false, (SC.H0) null, (G0) null, (m) null, false, aVar2, mVar, 0, 248);
                C13607l.j(J1.j.b(Oo.b.f84812v3, mVar2, 0), C13679b.a.C2856b.f116680a, hVar.b(aVar, aVar3.g()), 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (Y1.j) null, (Y1.f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar, 48, 0, 262136);
                mVar.x();
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((C5938c) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N A(C17642l lVar, Bw.c cVar, i iVar) {
        C17542s.j(iVar, "screenUiEvent");
        lVar.invoke(iVar);
        cVar.N(iVar);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N B(p pVar, Bw.c cVar, c1 c1Var, Interaction$Component interaction$Component) {
        C17542s.j(c1Var, "productItemUiEvent");
        C17542s.j(interaction$Component, "component");
        pVar.invoke(c1Var, interaction$Component);
        cVar.M(c1Var, interaction$Component);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void J(x xVar, j jVar, C17642l<? super i, C16807N> lVar, p<? super c1, ? super Interaction$Component, C16807N> pVar, q<? super Interaction$Component, ? super String, ? super String, C16807N> qVar, C17631a<C16807N> aVar, int i10, C17642l<? super Integer, C16807N> lVar2) {
        x xVar2 = xVar;
        C17642l<? super i, C16807N> lVar3 = lVar;
        Z(xVar);
        j.a g10 = jVar.g();
        if (g10 != null) {
            s0.g(xVar, g10, new C15349c0(lVar));
        }
        j.c i11 = jVar.i();
        if (i11 != null) {
            w0.a(xVar, i11, pVar, "RecommendationsOnSale", new C15353e0(lVar));
        } else {
            p<? super c1, ? super Interaction$Component, C16807N> pVar2 = pVar;
        }
        C15987c<cw.b> c10 = jVar.c();
        if (c10 != null) {
            C15358h.s(xVar, c10, new C15355f0(lVar), new C15357g0(lVar));
        }
        j.b h10 = jVar.h();
        if (h10 != null) {
            w0.c(xVar, h10, pVar, Interaction$Component.OFFER_HUB_NEW_OFFERS, "Recent", new S(lVar), new zw.T(lVar), (androidx.compose.ui.d) null, 64, (Object) null);
        }
        Y(xVar);
        j.d k10 = jVar.k();
        if (k10 != null) {
            J0.H(xVar, k10, pVar, qVar, aVar, i10, lVar2, new U(lVar));
        }
        j.b e10 = jVar.e();
        if (e10 != null) {
            V(xVar);
            w0.c(xVar, e10, pVar, Interaction$Component.OFFER_HUB_LOWEST_PRICE, "LowestPrice", new V(lVar), new W(lVar), (androidx.compose.ui.d) null, 64, (Object) null);
        }
        j.b d10 = jVar.d();
        if (d10 != null) {
            w0.c(xVar, d10, pVar, Interaction$Component.OFFER_HUB_LIMITED_TIME, "ExpiringSoon", new X(lVar), new C15351d0(lVar), (androidx.compose.ui.d) null, 64, (Object) null);
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N K(C17642l lVar, Category category) {
        C17542s.j(category, "it");
        lVar.invoke(new i.d(category.a(), category.d(), i.a.CATEGORY_CAROUSEL, Interaction$Component.OFFER_HUB_CAROUSEL));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N L(C17642l lVar, String str, String str2) {
        C17542s.j(str, "categoryId");
        C17542s.j(str2, "categoryTitle");
        lVar.invoke(new i.d(str, str2, i.a.RECOMMENDATION_CAROUSEL, Interaction$Component.OFFER_HUB_FAVOURITES_ON_OFFER));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N M(C17642l lVar, String str, cw.c cVar) {
        C17542s.j(str, "id");
        C17542s.j(cVar, "type");
        lVar.invoke(new i.f(str, cVar));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N N(C17642l lVar, String str, String str2, cw.c cVar) {
        C17542s.j(str, "linkTo");
        C17542s.j(str2, "id");
        C17542s.j(cVar, "type");
        lVar.invoke(new i.e(str, str2, cVar));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N O(C17642l lVar, String str, String str2) {
        C17542s.j(str, "categoryId");
        C17542s.j(str2, "categoryTitle");
        lVar.invoke(new i.d(str, str2, i.a.OFFERS_PRODUCT_CAROUSEL, Interaction$Component.OFFER_HUB_NEW_OFFERS));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N P(C17642l lVar, String str, List list, Interaction$Component interaction$Component) {
        C17542s.j(str, "id");
        C17542s.j(list, "itemNos");
        C17542s.j(interaction$Component, "component");
        lVar.invoke(new i.g(str, list, interaction$Component));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N Q(C17642l lVar, String str, List list, Interaction$Component interaction$Component) {
        C17542s.j(str, "id");
        C17542s.j(list, "itemNos");
        C17542s.j(interaction$Component, "component");
        lVar.invoke(new i.g(str, list, interaction$Component));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N R(C17642l lVar, String str, String str2) {
        C17542s.j(str, "categoryId");
        C17542s.j(str2, "categoryTitle");
        lVar.invoke(new i.d(str, str2, i.a.OFFERS_PRODUCT_CAROUSEL, Interaction$Component.OFFER_HUB_LOWEST_PRICE));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N S(C17642l lVar, String str, List list, Interaction$Component interaction$Component) {
        C17542s.j(str, "id");
        C17542s.j(list, "itemNos");
        C17542s.j(interaction$Component, "component");
        lVar.invoke(new i.g(str, list, interaction$Component));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N T(C17642l lVar, String str, String str2) {
        C17542s.j(str, "categoryId");
        C17542s.j(str2, "categoryTitle");
        lVar.invoke(new i.d(str, str2, i.a.OFFERS_PRODUCT_CAROUSEL, Interaction$Component.OFFER_HUB_LIMITED_TIME));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N U(C17642l lVar, String str, List list, Interaction$Component interaction$Component) {
        C17542s.j(str, "id");
        C17542s.j(list, "itemNos");
        C17542s.j(interaction$Component, "component");
        lVar.invoke(new i.g(str, list, interaction$Component));
        return C16807N.f139792a;
    }

    private static final void V(x xVar) {
        xVar.k("LowestPriceHeader", "LowestPriceHeader", C15360i.f132690a.b());
    }

    /* access modifiers changed from: private */
    public static final void W(x xVar, C17631a<C16807N> aVar) {
        x.i(xVar, (Object) null, (Object) null, c1.c.c(-134380988, true, new g(aVar)), 3, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final void X(x xVar) {
        Z(xVar);
        s0.h(xVar);
        w0.d(xVar, "Recent");
        J0.J(xVar, (Integer) null, 1, (Object) null);
        w0.d(xVar, "LowestPrice");
        w0.d(xVar, "ExpiringSoon");
    }

    private static final void Y(x xVar) {
        xVar.b("RecentSpacer", "RecentSpacer", C15360i.f132690a.a());
    }

    private static final void Z(x xVar) {
        xVar.b("TitleSection", "TitleSection", C15360i.f132690a.c());
    }

    public static final void q(j jVar, C17642l<? super i, C16807N> lVar, p<? super c1, ? super Interaction$Component, C16807N> pVar, C17631a<C16807N> aVar, q<? super Interaction$Component, ? super String, ? super String, C16807N> qVar, C17631a<C16807N> aVar2, C17642l<? super String, C16807N> lVar2, C17631a<C16807N> aVar3, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        j jVar2 = jVar;
        C17642l<? super i, C16807N> lVar3 = lVar;
        p<? super c1, ? super Interaction$Component, C16807N> pVar2 = pVar;
        C17631a<C16807N> aVar4 = aVar;
        q<? super Interaction$Component, ? super String, ? super String, C16807N> qVar2 = qVar;
        C17631a<C16807N> aVar5 = aVar2;
        C17642l<? super String, C16807N> lVar4 = lVar2;
        C17631a<C16807N> aVar6 = aVar3;
        int i12 = i10;
        C17542s.j(jVar2, "uiState");
        C17542s.j(lVar3, "onScreenUiEvent");
        C17542s.j(pVar2, "onProductItemEvent");
        C17542s.j(aVar4, "onErrorTryAgainClicked");
        C17542s.j(qVar2, "onShuffleClicked");
        C17542s.j(aVar5, "onPullToRefresh");
        C17542s.j(lVar4, "onOpenShoppingListClicked");
        C17542s.j(aVar6, "onSnackbarConsumed");
        C4889m k10 = mVar.k(-1250133492);
        if ((i12 & 6) == 0) {
            i11 = ((i12 & 8) == 0 ? k10.V(jVar2) : k10.F(jVar2) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k10.F(lVar3) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i11 |= k10.F(pVar2) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i11 |= k10.F(aVar4) ? RecyclerView.n.FLAG_MOVED : 1024;
        }
        if ((i12 & 24576) == 0) {
            i11 |= k10.F(qVar2) ? 16384 : 8192;
        }
        if ((196608 & i12) == 0) {
            i11 |= k10.F(aVar5) ? 131072 : ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        }
        if ((1572864 & i12) == 0) {
            i11 |= k10.F(lVar4) ? ImageMetadata.SHADING_MODE : ImageMetadata.LENS_APERTURE;
        }
        if ((12582912 & i12) == 0) {
            i11 |= k10.F(aVar6) ? 8388608 : 4194304;
        }
        int i13 = i11;
        if ((4793491 & i13) != 4793490 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-1250133492, i13, -1, "com.ingka.ikea.offerhub.impl.ui.OfferHub (OfferHubComposables.kt:101)");
            }
            F0 l10 = C4725e0.l(false, (C17642l<? super O0.G0, Boolean>) null, k10, 0, 3);
            k10.W(206417295);
            Object D10 = k10.D();
            C4889m.a aVar7 = C4889m.f14007a;
            if (D10 == aVar7.a()) {
                D10 = u1.e(Boolean.FALSE, (o1) null, 2, (Object) null);
                k10.u(D10);
            }
            C4899r0 r0Var = (C4899r0) D10;
            k10.P();
            Object D11 = k10.D();
            if (D11 == aVar7.a()) {
                B b10 = new B(U0.P.k(C17169j.f142968a, k10));
                k10.u(b10);
                D11 = b10;
            }
            Q a10 = ((B) D11).a();
            k10.W(206420687);
            Object D12 = k10.D();
            if (D12 == aVar7.a()) {
                D12 = u1.e(Boolean.FALSE, (o1) null, 2, (Object) null);
                k10.u(D12);
            }
            C4899r0 r0Var2 = (C4899r0) D12;
            k10.P();
            R0.e r10 = R0.c.r(k10, 0);
            boolean z10 = !jVar.l() && !jVar.j();
            k10.W(206426925);
            Object D13 = k10.D();
            if (D13 == aVar7.a()) {
                D13 = new L0();
                k10.u(D13);
            }
            L0 l02 = (L0) D13;
            k10.P();
            C5264a e10 = c1.c.e(-1270920110, true, new a(l02), k10, 54);
            C2979b bVar = r0;
            L0 l03 = l02;
            int i14 = i13;
            C2979b bVar2 = new C2979b(z10, aVar2, a10, r10, jVar, l10, qVar, r0Var2, lVar, aVar, pVar, r0Var);
            mVar2 = k10;
            C4762x0.a((androidx.compose.ui.d) null, (p<? super C4889m, ? super Integer, C16807N>) null, (p<? super C4889m, ? super Integer, C16807N>) null, e10, (p<? super C4889m, ? super Integer, C16807N>) null, 0, 0, 0, (C5848T) null, c1.c.e(475941211, true, bVar, mVar2, 54), mVar2, 805309440, 503);
            C15035a f10 = jVar.f();
            if (f10 != null) {
                int i15 = i14 >> 12;
                C15062c.c(l03, f10, lVar2, aVar3, f10.a() == C15035a.C3239a.ADD, mVar2, (i15 & 896) | 6 | (i15 & 7168), 0);
            }
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
        }
        Y0 n10 = mVar2.n();
        if (n10 != null) {
            n10.a(new C15347b0(jVar, lVar, pVar, aVar, qVar, aVar2, lVar2, aVar3, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final boolean r(C4899r0<Boolean> r0Var) {
        return r0Var.getValue().booleanValue();
    }

    /* access modifiers changed from: private */
    public static final void s(C4899r0<Boolean> r0Var, boolean z10) {
        r0Var.setValue(Boolean.valueOf(z10));
    }

    /* access modifiers changed from: private */
    public static final boolean t(C4899r0<Boolean> r0Var) {
        return r0Var.getValue().booleanValue();
    }

    /* access modifiers changed from: private */
    public static final void u(C4899r0<Boolean> r0Var, boolean z10) {
        r0Var.setValue(Boolean.valueOf(z10));
    }

    /* access modifiers changed from: private */
    public static final C16807N v(j jVar, C17642l lVar, p pVar, C17631a aVar, q qVar, C17631a aVar2, C17642l lVar2, C17631a aVar3, int i10, C4889m mVar, int i11) {
        q(jVar, lVar, pVar, aVar, qVar, aVar2, lVar2, aVar3, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: nI.p} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void w(Bw.c r18, nI.C17642l<? super com.ingka.ikea.offerhub.impl.ui.i, XH.C16807N> r19, nI.p<? super Op.c1, ? super com.ingka.ikea.analytics.Interaction$Component, XH.C16807N> r20, U0.C4889m r21, int r22) {
        /*
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r22
            java.lang.String r4 = "offerHubViewModel"
            kotlin.jvm.internal.C17542s.j(r0, r4)
            java.lang.String r4 = "onScreenUiEvent"
            kotlin.jvm.internal.C17542s.j(r1, r4)
            java.lang.String r4 = "onProductItemEvent"
            kotlin.jvm.internal.C17542s.j(r2, r4)
            r4 = 361999890(0x1593ae12, float:5.964746E-26)
            r5 = r21
            U0.m r15 = r5.k(r4)
            r5 = r3 & 6
            if (r5 != 0) goto L_0x002f
            boolean r5 = r15.F(r0)
            if (r5 == 0) goto L_0x002c
            r5 = 4
            goto L_0x002d
        L_0x002c:
            r5 = 2
        L_0x002d:
            r5 = r5 | r3
            goto L_0x0030
        L_0x002f:
            r5 = r3
        L_0x0030:
            r6 = r3 & 48
            r12 = 32
            if (r6 != 0) goto L_0x0041
            boolean r6 = r15.F(r1)
            if (r6 == 0) goto L_0x003e
            r6 = r12
            goto L_0x0040
        L_0x003e:
            r6 = 16
        L_0x0040:
            r5 = r5 | r6
        L_0x0041:
            r6 = r3 & 384(0x180, float:5.38E-43)
            r13 = 256(0x100, float:3.59E-43)
            if (r6 != 0) goto L_0x0052
            boolean r6 = r15.F(r2)
            if (r6 == 0) goto L_0x004f
            r6 = r13
            goto L_0x0051
        L_0x004f:
            r6 = 128(0x80, float:1.794E-43)
        L_0x0051:
            r5 = r5 | r6
        L_0x0052:
            r14 = r5
            r5 = r14 & 147(0x93, float:2.06E-43)
            r6 = 146(0x92, float:2.05E-43)
            if (r5 != r6) goto L_0x0065
            boolean r5 = r15.l()
            if (r5 != 0) goto L_0x0060
            goto L_0x0065
        L_0x0060:
            r15.L()
            goto L_0x01b7
        L_0x0065:
            boolean r5 = U0.C4895p.J()
            if (r5 == 0) goto L_0x0071
            r5 = -1
            java.lang.String r6 = "com.ingka.ikea.offerhub.impl.ui.OfferHubScreen (OfferHubComposables.kt:66)"
            U0.C4895p.S(r4, r14, r5, r6)
        L_0x0071:
            TJ.P r5 = r18.m()
            r10 = 0
            r11 = 7
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = r15
            U0.A1 r4 = j3.a.c(r5, r6, r7, r8, r9, r10, r11)
            Bw.j r5 = x(r4)
            r4 = -1621309839(0xffffffff9f5cc671, float:-4.675096E-20)
            r15.W(r4)
            boolean r4 = r15.F(r0)
            java.lang.Object r6 = r15.D()
            if (r4 != 0) goto L_0x009b
            U0.m$a r4 = U0.C4889m.f14007a
            java.lang.Object r4 = r4.a()
            if (r6 != r4) goto L_0x00a3
        L_0x009b:
            com.ingka.ikea.offerhub.impl.ui.b$c r6 = new com.ingka.ikea.offerhub.impl.ui.b$c
            r6.<init>(r0)
            r15.u(r6)
        L_0x00a3:
            r8 = r6
            nI.a r8 = (nI.C17631a) r8
            r15.P()
            r4 = -1621308141(0xffffffff9f5ccd13, float:-4.6756446E-20)
            r15.W(r4)
            boolean r4 = r15.F(r0)
            java.lang.Object r6 = r15.D()
            if (r4 != 0) goto L_0x00c1
            U0.m$a r4 = U0.C4889m.f14007a
            java.lang.Object r4 = r4.a()
            if (r6 != r4) goto L_0x00c9
        L_0x00c1:
            com.ingka.ikea.offerhub.impl.ui.b$d r6 = new com.ingka.ikea.offerhub.impl.ui.b$d
            r6.<init>(r0)
            r15.u(r6)
        L_0x00c9:
            uI.h r6 = (uI.C18059h) r6
            r15.P()
            r4 = -1621306407(0xffffffff9f5cd3d9, float:-4.6762048E-20)
            r15.W(r4)
            boolean r4 = r15.F(r0)
            java.lang.Object r7 = r15.D()
            if (r4 != 0) goto L_0x00e6
            U0.m$a r4 = U0.C4889m.f14007a
            java.lang.Object r4 = r4.a()
            if (r7 != r4) goto L_0x00ee
        L_0x00e6:
            com.ingka.ikea.offerhub.impl.ui.b$e r7 = new com.ingka.ikea.offerhub.impl.ui.b$e
            r7.<init>(r0)
            r15.u(r7)
        L_0x00ee:
            r10 = r7
            nI.a r10 = (nI.C17631a) r10
            r15.P()
            r4 = -1621304374(0xffffffff9f5cdbca, float:-4.6768617E-20)
            r15.W(r4)
            boolean r4 = r15.F(r0)
            java.lang.Object r7 = r15.D()
            if (r4 != 0) goto L_0x010c
            U0.m$a r4 = U0.C4889m.f14007a
            java.lang.Object r4 = r4.a()
            if (r7 != r4) goto L_0x0114
        L_0x010c:
            com.ingka.ikea.offerhub.impl.ui.b$f r7 = new com.ingka.ikea.offerhub.impl.ui.b$f
            r7.<init>(r0)
            r15.u(r7)
        L_0x0114:
            uI.h r7 = (uI.C18059h) r7
            r15.P()
            r4 = -1621322586(0xffffffff9f5c94a6, float:-4.670977E-20)
            r15.W(r4)
            r4 = r14 & 112(0x70, float:1.57E-43)
            if (r4 != r12) goto L_0x0126
            r16 = 1
            goto L_0x0128
        L_0x0126:
            r16 = 0
        L_0x0128:
            boolean r17 = r15.F(r0)
            r16 = r16 | r17
            java.lang.Object r9 = r15.D()
            if (r16 != 0) goto L_0x013c
            U0.m$a r16 = U0.C4889m.f14007a
            java.lang.Object r11 = r16.a()
            if (r9 != r11) goto L_0x0144
        L_0x013c:
            zw.Q r9 = new zw.Q
            r9.<init>(r1, r0)
            r15.u(r9)
        L_0x0144:
            nI.l r9 = (nI.C17642l) r9
            r15.P()
            r11 = -1621317028(0xffffffff9f5caa5c, float:-4.672773E-20)
            r15.W(r11)
            r11 = r14 & 896(0x380, float:1.256E-42)
            if (r11 != r13) goto L_0x0155
            r11 = 1
            goto L_0x0156
        L_0x0155:
            r11 = 0
        L_0x0156:
            boolean r13 = r15.F(r0)
            r11 = r11 | r13
            java.lang.Object r13 = r15.D()
            if (r11 != 0) goto L_0x0169
            U0.m$a r11 = U0.C4889m.f14007a
            java.lang.Object r11 = r11.a()
            if (r13 != r11) goto L_0x0171
        L_0x0169:
            zw.Y r13 = new zw.Y
            r13.<init>(r2, r0)
            r15.u(r13)
        L_0x0171:
            r11 = r13
            nI.p r11 = (nI.p) r11
            r15.P()
            r13 = r6
            nI.q r13 = (nI.q) r13
            r6 = -1621301550(0xffffffff9f5ce6d2, float:-4.6777742E-20)
            r15.W(r6)
            if (r4 != r12) goto L_0x0185
            r17 = 1
            goto L_0x0187
        L_0x0185:
            r17 = 0
        L_0x0187:
            java.lang.Object r4 = r15.D()
            if (r17 != 0) goto L_0x0195
            U0.m$a r6 = U0.C4889m.f14007a
            java.lang.Object r6 = r6.a()
            if (r4 != r6) goto L_0x019d
        L_0x0195:
            zw.Z r4 = new zw.Z
            r4.<init>(r1)
            r15.u(r4)
        L_0x019d:
            nI.l r4 = (nI.C17642l) r4
            r15.P()
            r12 = r7
            nI.a r12 = (nI.C17631a) r12
            r14 = 0
            r6 = r9
            r7 = r11
            r9 = r13
            r11 = r4
            r13 = r15
            q(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            boolean r4 = U0.C4895p.J()
            if (r4 == 0) goto L_0x01b7
            U0.C4895p.R()
        L_0x01b7:
            U0.Y0 r4 = r15.n()
            if (r4 == 0) goto L_0x01c5
            zw.a0 r5 = new zw.a0
            r5.<init>(r0, r1, r2, r3)
            r4.a(r5)
        L_0x01c5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.offerhub.impl.ui.b.w(Bw.c, nI.l, nI.p, U0.m, int):void");
    }

    private static final j x(A1<j> a12) {
        return a12.getValue();
    }

    /* access modifiers changed from: private */
    public static final C16807N y(C17642l lVar, String str) {
        C17542s.j(str, "listId");
        lVar.invoke(new i.h(str));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N z(Bw.c cVar, C17642l lVar, p pVar, int i10, C4889m mVar, int i11) {
        w(cVar, lVar, pVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }
}
