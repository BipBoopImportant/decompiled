package Qw;

import E1.I;
import G1.C4504g;
import IC.C13023e;
import KJ.C15987c;
import N1.P;
import Nn.C10809l;
import O0.C4725e0;
import O0.C4762x0;
import O0.F0;
import O0.e1;
import O0.g1;
import QJ.Q;
import QJ.T;
import Qw.C13453C;
import Qw.C13455E;
import Qw.C13463a;
import S1.C;
import S1.C4820m;
import S1.C4830x;
import SC.C13607l;
import SC.C13643u0;
import SC.C13656x1;
import SC.C13664z1;
import SC.G0;
import SC.H0;
import SC.K0;
import SC.L;
import SC.M;
import SC.N;
import SC.W1;
import SC.Z1;
import TC.C13679b;
import Tw.C13688a;
import Tw.C13693f;
import U0.A1;
import U0.B;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4899r0;
import U0.C4912y;
import U0.F1;
import U0.M0;
import U0.Y0;
import U0.o1;
import XH.C16807N;
import XH.y;
import YH.C16877v;
import android.content.Context;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.C5080k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.C5116k1;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.r;
import androidx.recyclerview.widget.RecyclerView;
import c1.C5264a;
import com.google.ar.core.ImageMetadata;
import dI.C17164e;
import dI.C17168i;
import dI.C17169j;
import eI.C17187b;
import i1.C5437c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17631a;
import nI.C17642l;
import ol.u;
import ol.v;
import rv.C11849b;
import s0.C5834E;
import s0.C5842M;
import s0.C5848T;
import s0.C5862h;
import t0.C5938c;
import t0.x;
import tK.C18030v;
import uK.C18146a;
import xB.C15201a;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a7\u0010\u0010\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000eH\u0003¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001d\u0010\u0015\u001a\u0004\u0018\u00010\u0003*\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0001\u0010%\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00172\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e2\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00040\u00022\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e2\u0018\u0010 \u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001e\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\"\u001a\u00020!2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b%\u0010&\u001a+\u0010'\u001a\u00020\u00042\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u000eH\u0003¢\u0006\u0004\b'\u0010(\u001aY\u0010-\u001a\u00020\u00042\b\u0010*\u001a\u0004\u0018\u00010)2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00040\u00022\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e2\b\b\u0002\u0010,\u001a\u00020+H\u0003¢\u0006\u0004\b-\u0010.\u001a%\u00102\u001a\u00020\u00042\u0006\u00100\u001a\u00020/2\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u00040\u000eH\u0003¢\u0006\u0004\b2\u00103\u001ak\u00104\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00172\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00040\u00022\u0018\u0010 \u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001e\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\"\u001a\u00020!2\b\b\u0002\u0010,\u001a\u00020+H\u0003¢\u0006\u0004\b4\u00105\u001aQ\u00108\u001a\u00020\u00042\u0006\u0010*\u001a\u00020)2\u0006\u00106\u001a\u00020#2\u0012\u00107\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00040\u00022\b\b\u0002\u0010,\u001a\u00020+H\u0003¢\u0006\u0004\b8\u00109\u001aO\u0010>\u001a\u00020\u00042\u0006\u0010;\u001a\u00020:2\u0006\u0010<\u001a\u00020\f2\u0018\u0010=\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001e\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000eH\u0003¢\u0006\u0004\b>\u0010?\u001a\u0013\u0010A\u001a\u00020\u001a*\u00020@H\u0003¢\u0006\u0004\bA\u0010B¨\u0006C²\u0006\f\u0010\u0018\u001a\u00020\u00178\nX\u0002"}, d2 = {"LQw/N0;", "paymentViewModel", "Lkotlin/Function1;", "LQw/C;", "LXH/N;", "onEvent", "G", "(LQw/N0;LnI/l;LU0/m;I)V", "LTw/f$a;", "expressPaymentError", "LQJ/Q;", "coroutineScope", "LO0/F0;", "sheetState", "Lkotlin/Function0;", "onDismiss", "t", "(LTw/f$a;LQJ/Q;LO0/F0;LnI/a;LU0/m;II)V", "LTw/a;", "Landroid/content/Context;", "context", "X", "(LTw/a;Landroid/content/Context;)LQw/C;", "LTw/f;", "uiState", "onCompletePurchaseClicked", "", "onDeleteTransactionCallback", "onTopAppBarBackClicked", "onTopAppBarReassuranceClicked", "", "LNn/D;", "onPaymentOptionsSelected", "LQw/f0;", "paymentOptionsCallback", "", "onPriceSummaryExpandedToggled", "J", "(LTw/f;LnI/a;LnI/l;LnI/a;LnI/a;LnI/l;LQw/f0;LnI/l;LU0/m;I)V", "L", "(LnI/a;LnI/a;LU0/m;I)V", "LTw/f$c;", "priceSummaryUiState", "Landroidx/compose/ui/d;", "modifier", "p", "(LTw/f$c;LnI/l;LnI/l;LnI/a;Landroidx/compose/ui/d;LU0/m;II)V", "LTw/f$d;", "state", "onErrorDismissed", "r", "(LTw/f$d;LnI/a;LU0/m;I)V", "B", "(LTw/f;LnI/l;LnI/l;LnI/l;LQw/f0;Landroidx/compose/ui/d;LU0/m;II)V", "expanded", "onExpandToggled", "E", "(LTw/f$c;ZLnI/l;LnI/l;Landroidx/compose/ui/d;LU0/m;II)V", "LQw/g0;", "paymentOptionsWithWarning", "confirmationBottomSheetState", "onSelectPaymentOption", "x", "(LQw/g0;LO0/F0;LnI/l;LQJ/Q;LnI/a;LU0/m;I)V", "LTw/f$c$a;", "W", "(LTw/f$c$a;LU0/m;I)Ljava/lang/String;", "onlinepayment-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class w0 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements nI.p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C13693f.d f115026a;

        a(C13693f.d dVar) {
            this.f115026a = dVar;
        }

        public final void a(C4889m mVar, int i10) {
            int i11 = i10;
            if ((i11 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(10223927, i11, -1, "com.ingka.ikea.onlinepayment.impl.presentation.compose.ErrorAlertDialogContainer.<anonymous> (PaymentScreen.kt:472)");
                }
                C13607l.j(this.f115026a.a().a(mVar, C13023e.f110931a), C13679b.a.C2856b.f116680a, (androidx.compose.ui.d) null, 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (Y1.k) null, (Y1.j) null, (Y1.f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar, 48, 0, 262140);
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
    static final class b implements nI.p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f115027a;

        b(C17631a<C16807N> aVar) {
            this.f115027a = aVar;
        }

        public final void a(C4889m mVar, int i10) {
            int i11 = i10;
            if ((i11 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(904931664, i11, -1, "com.ingka.ikea.onlinepayment.impl.presentation.compose.ExpressPaymentErrorBottomSheet.<anonymous> (PaymentScreen.kt:286)");
                }
                L.b(J1.j.b(Oo.b.f84330B2, mVar, 0), J.h(androidx.compose.ui.d.f18749a, 0.0f, 1, (Object) null), false, (N) null, (M) null, false, (Integer) null, (K0) null, (r0.m) null, this.f115027a, mVar, 48, 508);
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
    static final class c implements nI.p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C13693f.a f115028a;

        c(C13693f.a aVar) {
            this.f115028a = aVar;
        }

        public final void a(C4889m mVar, int i10) {
            C4889m mVar2 = mVar;
            int i11 = i10;
            if ((i11 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(1928242778, i11, -1, "com.ingka.ikea.onlinepayment.impl.presentation.compose.ExpressPaymentErrorBottomSheet.<anonymous> (PaymentScreen.kt:295)");
                }
                d.a aVar = androidx.compose.ui.d.f18749a;
                androidx.compose.ui.d i12 = TC.e.i(J.h(aVar, 0.0f, 1, (Object) null));
                C13693f.a aVar2 = this.f115028a;
                I a10 = C5080k.a(C5073d.f18068a.g(), C5437c.f24302a.k(), mVar2, 0);
                int a11 = C4883j.a(mVar2, 0);
                C4912y s10 = mVar.s();
                androidx.compose.ui.d e10 = androidx.compose.ui.c.e(mVar2, i12);
                C4504g.a aVar3 = C4504g.f6515W;
                C17631a<C4504g> a12 = aVar3.a();
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
                F1.c(a13, a10, aVar3.c());
                F1.c(a13, s10, aVar3.e());
                nI.p<C4504g, Integer, C16807N> b10 = aVar3.b();
                if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                    a13.u(Integer.valueOf(a11));
                    a13.w(Integer.valueOf(a11), b10);
                }
                F1.c(a13, e10, aVar3.d());
                C5862h hVar = C5862h.f28810a;
                float f10 = (float) 8;
                androidx.compose.ui.d m10 = D.m(aVar, 0.0f, 0.0f, 0.0f, c2.h.B(f10), 7, (Object) null);
                C13023e c10 = aVar2.c();
                int i13 = C13023e.f110931a;
                float f11 = f10;
                C13693f.a aVar4 = aVar2;
                C4889m mVar3 = mVar;
                C13607l.j(c10.a(mVar2, i13), C13679b.C2857b.a.f116683a, m10, 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (Y1.k) null, (Y1.j) null, (Y1.f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar3, 432, 0, 262136);
                C13607l.j(aVar4.b().a(mVar, i13), C13679b.a.C2856b.f116680a, D.m(aVar, 0.0f, 0.0f, 0.0f, c2.h.B(f11), 7, (Object) null), 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (Y1.k) null, (Y1.j) null, (Y1.f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar3, 432, 0, 262136);
                C4889m mVar4 = mVar;
                mVar4.W(1948171641);
                for (Wg.a aVar5 : aVar4.a()) {
                    C4889m mVar5 = mVar;
                    C13607l.j(aVar5.b().a(mVar4, C13023e.f110931a), C13679b.a.C2856b.f116680a, D.m(androidx.compose.ui.d.f18749a, 0.0f, c2.h.B(f11), 0.0f, 0.0f, 13, (Object) null), 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (Y1.k) null, (Y1.j) null, (Y1.f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar5, 432, 0, 262136);
                    String a14 = aVar5.a("Error: ");
                    C13607l.j("(" + a14 + ")", C13679b.a.c.f116681a, (androidx.compose.ui.d) null, C18030v.f147664a.a(mVar, C18030v.f147665b).J0(), 0, (C4830x) null, (C) null, (C4820m) null, 0, (Y1.k) null, (Y1.j) null, (Y1.f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar5, 48, 0, 262132);
                    mVar4 = mVar;
                }
                mVar.P();
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.onlinepayment.impl.presentation.compose.PaymentScreenKt$ExpressPaymentErrorBottomSheet$dismissBottomSheet$1$1$1", f = "PaymentScreen.kt", l = {274}, m = "invokeSuspend")
    static final class d extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f115029c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ F0 f115030d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(F0 f02, C17164e<? super d> eVar) {
            super(2, eVar);
            this.f115030d = f02;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new d(this.f115030d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((d) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f115029c;
            if (i10 == 0) {
                y.b(obj);
                F0 f02 = this.f115030d;
                this.f115029c = 1;
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class e implements nI.p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C13476g0 f115031a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C17642l<List<? extends Nn.D>, C16807N> f115032b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f115033c;

        e(C13476g0 g0Var, C17642l<? super List<? extends Nn.D>, C16807N> lVar, C17631a<C16807N> aVar) {
            this.f115031a = g0Var;
            this.f115032b = lVar;
            this.f115033c = aVar;
        }

        /* access modifiers changed from: private */
        public static final C16807N c(C17642l lVar, C13476g0 g0Var, C17631a aVar) {
            lVar.invoke(g0Var.a());
            aVar.invoke();
            return C16807N.f139792a;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: nI.a} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(U0.C4889m r7, int r8) {
            /*
                r6 = this;
                r0 = r8 & 3
                r1 = 2
                if (r0 != r1) goto L_0x0010
                boolean r0 = r7.l()
                if (r0 != 0) goto L_0x000c
                goto L_0x0010
            L_0x000c:
                r7.L()
                goto L_0x0081
            L_0x0010:
                boolean r0 = U0.C4895p.J()
                if (r0 == 0) goto L_0x001f
                r0 = -1
                java.lang.String r1 = "com.ingka.ikea.onlinepayment.impl.presentation.compose.PaymentConfirmationBottomSheet.<anonymous> (PaymentScreen.kt:597)"
                r2 = -680194012(0xffffffffd7751024, float:-2.69449672E14)
                U0.C4895p.S(r2, r8, r0, r1)
            L_0x001f:
                Qw.g0 r8 = r6.f115031a
                java.util.List r8 = r8.a()
                java.lang.Object r8 = YH.C16877v.w0(r8)
                Nn.D r8 = (Nn.D) r8
                java.lang.String r0 = r8.b()
                Qw.g0 r8 = r6.f115031a
                java.lang.String r1 = r8.b()
                r8 = 525131065(0x1f4cdd39, float:4.338167E-20)
                r7.W(r8)
                nI.l<java.util.List<? extends Nn.D>, XH.N> r8 = r6.f115032b
                boolean r8 = r7.V(r8)
                Qw.g0 r2 = r6.f115031a
                boolean r2 = r7.F(r2)
                r8 = r8 | r2
                nI.a<XH.N> r2 = r6.f115033c
                boolean r2 = r7.V(r2)
                r8 = r8 | r2
                nI.l<java.util.List<? extends Nn.D>, XH.N> r2 = r6.f115032b
                Qw.g0 r3 = r6.f115031a
                nI.a<XH.N> r4 = r6.f115033c
                java.lang.Object r5 = r7.D()
                if (r8 != 0) goto L_0x0063
                U0.m$a r8 = U0.C4889m.f14007a
                java.lang.Object r8 = r8.a()
                if (r5 != r8) goto L_0x006b
            L_0x0063:
                Qw.x0 r5 = new Qw.x0
                r5.<init>(r2, r3, r4)
                r7.u(r5)
            L_0x006b:
                r2 = r5
                nI.a r2 = (nI.C17631a) r2
                r7.P()
                nI.a<XH.N> r3 = r6.f115033c
                r5 = 0
                r4 = r7
                Qw.U.b(r0, r1, r2, r3, r4, r5)
                boolean r7 = U0.C4895p.J()
                if (r7 == 0) goto L_0x0081
                U0.C4895p.R()
            L_0x0081:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Qw.w0.e.b(U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.onlinepayment.impl.presentation.compose.PaymentScreenKt$PaymentConfirmationBottomSheet$dismissBottomSheet$1$1$1", f = "PaymentScreen.kt", l = {586}, m = "invokeSuspend")
    static final class f extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f115034c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ F0 f115035d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(F0 f02, C17164e<? super f> eVar) {
            super(2, eVar);
            this.f115035d = f02;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new f(this.f115035d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((f) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f115034c;
            if (i10 == 0) {
                y.b(obj);
                F0 f02 = this.f115035d;
                this.f115034c = 1;
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class g implements nI.q<C5938c, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C13693f.c f115036a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C17642l<Boolean, C16807N> f115037b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l<String, C16807N> f115038c;

        g(C13693f.c cVar, C17642l<? super Boolean, C16807N> lVar, C17642l<? super String, C16807N> lVar2) {
            this.f115036a = cVar;
            this.f115037b = lVar;
            this.f115038c = lVar2;
        }

        public final void a(C5938c cVar, C4889m mVar, int i10) {
            C17542s.j(cVar, "$this$item");
            if ((i10 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(2060506904, i10, -1, "com.ingka.ikea.onlinepayment.impl.presentation.compose.PaymentOptionsScreenContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PaymentScreen.kt:495)");
                }
                C13693f.c cVar2 = this.f115036a;
                w0.E(cVar2, cVar2.a(), this.f115037b, this.f115038c, (androidx.compose.ui.d) null, mVar, C13023e.f110931a | RC.m.f115340m, 16);
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class h implements C17631a<C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C13474f0 f115039a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C13693f.b f115040b;

        h(C13474f0 f0Var, C13693f.b bVar) {
            this.f115039a = f0Var;
            this.f115040b = bVar;
        }

        public final void a() {
            this.f115039a.b().invoke(this.f115040b.j().e(), this.f115040b.g());
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class i implements C17631a<C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C17642l<List<? extends Nn.D>, C16807N> f115041a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C13693f.b f115042b;

        i(C17642l<? super List<? extends Nn.D>, C16807N> lVar, C13693f.b bVar) {
            this.f115041a = lVar;
            this.f115042b = bVar;
        }

        public final void a() {
            this.f115041a.invoke(this.f115042b.h());
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class j implements nI.p<Integer, C13693f.b, Object> {

        /* renamed from: a  reason: collision with root package name */
        public static final j f115043a = new j();

        public final Object a(int i10, C13693f.b bVar) {
            C17542s.j(bVar, "item");
            return Long.valueOf(bVar.f());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a(((Number) obj).intValue(), (C15201a) obj2);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
    public static final class k extends C17544u implements C17642l<Integer, Object> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ nI.p f115044c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ List f115045d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public k(nI.p pVar, List list) {
            super(1);
            this.f115044c = pVar;
            this.f115045d = list;
        }

        public final Object a(int i10) {
            return this.f115044c.invoke(Integer.valueOf(i10), this.f115045d.get(i10));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
    public static final class l extends C17544u implements C17642l<Integer, Object> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List f115046c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public l(List list) {
            super(1);
            this.f115046c = list;
        }

        public final Object a(int i10) {
            C15201a aVar = (C15201a) this.f115046c.get(i10);
            return null;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lt0/c;", "", "it", "LXH/N;", "a", "(Lt0/c;ILU0/m;I)V"}, k = 3, mv = {2, 1, 0})
    public static final class m extends C17544u implements nI.r<C5938c, Integer, C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List f115047c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C13474f0 f115048d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C17642l f115049e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C13693f f115050f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public m(List list, C13474f0 f0Var, C17642l lVar, C13693f fVar) {
            super(4);
            this.f115047c = list;
            this.f115048d = f0Var;
            this.f115049e = lVar;
            this.f115050f = fVar;
        }

        public final void a(C5938c cVar, int i10, C4889m mVar, int i11) {
            int i12;
            if ((i11 & 6) == 0) {
                i12 = (mVar.V(cVar) ? 4 : 2) | i11;
            } else {
                i12 = i11;
            }
            if ((i11 & 48) == 0) {
                i12 |= mVar.d(i10) ? 32 : 16;
            }
            if ((i12 & 147) != 146 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-1091073711, i12, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:188)");
                }
                C13693f.b bVar = (C13693f.b) this.f115047c.get(i10);
                mVar.W(838195127);
                C13472e0 j10 = bVar.j();
                C17642l<String, C16807N> c10 = this.f115048d.c();
                mVar.W(-388598188);
                boolean V10 = mVar.V(this.f115048d) | mVar.F(bVar);
                Object D10 = mVar.D();
                if (V10 || D10 == C4889m.f14007a.a()) {
                    D10 = new h(this.f115048d, bVar);
                    mVar.u(D10);
                }
                C17631a aVar = (C17631a) D10;
                mVar.P();
                C17642l<C13473f, C16807N> a10 = this.f115048d.a();
                mVar.W(-388587043);
                boolean V11 = mVar.V(this.f115049e) | mVar.F(bVar);
                Object D11 = mVar.D();
                if (V11 || D11 == C4889m.f14007a.a()) {
                    D11 = new i(this.f115049e, bVar);
                    mVar.u(D11);
                }
                mVar.P();
                C13470d0.l(j10, c10, aVar, a10, (C17631a) D11, mVar, 0);
                mVar.W(-388583387);
                if (i10 < this.f115050f.e().size() - 1) {
                    C13643u0.c((androidx.compose.ui.d) null, 0.0f, 0, mVar, 0, 7);
                }
                mVar.P();
                mVar.P();
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3, Object obj4) {
            a((C5938c) obj, ((Number) obj2).intValue(), (C4889m) obj3, ((Number) obj4).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class n implements nI.p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C13693f.c f115051a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C17642l<String, C16807N> f115052b;

        n(C13693f.c cVar, C17642l<? super String, C16807N> lVar) {
            this.f115051a = cVar;
            this.f115052b = lVar;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(18282057, i10, -1, "com.ingka.ikea.onlinepayment.impl.presentation.compose.PaymentPriceSummaryContent.<anonymous>.<anonymous> (PaymentScreen.kt:563)");
                }
                RC.l.r(this.f115051a.b(), C5116k1.a(androidx.compose.ui.d.f18749a, "PaymentOptionsScreenTestTags.PRICE_SUMMARY_LIST"), this.f115052b, mVar, RC.m.f115340m | 48, 0);
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
    static final class o implements nI.p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C17642l<C13453C, C16807N> f115053a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ N0 f115054b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C4899r0<C13456F> f115055c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C4899r0<C13473f> f115056d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C4899r0<C13476g0> f115057e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C4899r0<C13693f.d> f115058f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ A1<C13693f> f115059g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ F0 f115060h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ Q f115061i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ F0 f115062j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ F0 f115063k;

        o(C17642l<? super C13453C, C16807N> lVar, N0 n02, C4899r0<C13456F> r0Var, C4899r0<C13473f> r0Var2, C4899r0<C13476g0> r0Var3, C4899r0<C13693f.d> r0Var4, A1<C13693f> a12, F0 f02, Q q10, F0 f03, F0 f04) {
            this.f115053a = lVar;
            this.f115054b = n02;
            this.f115055c = r0Var;
            this.f115056d = r0Var2;
            this.f115057e = r0Var3;
            this.f115058f = r0Var4;
            this.f115059g = a12;
            this.f115060h = f02;
            this.f115061i = q10;
            this.f115062j = f03;
            this.f115063k = f04;
        }

        /* access modifiers changed from: private */
        public static final C16807N B(C17642l lVar) {
            lVar.invoke(C13463a.c.f114889a);
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N C(C17642l lVar) {
            lVar.invoke(C13463a.d.f114890a);
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N D(N0 n02, C4899r0 r0Var, List list) {
            C17542s.j(list, "paymentOptions");
            Nn.D d10 = (Nn.D) C16877v.y0(list);
            String f10 = d10 != null ? d10.f() : null;
            if (f10 == null || f10.length() == 0) {
                n02.q(list);
            } else {
                r0Var.setValue(new C13476g0(f10, list));
            }
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N E(N0 n02, boolean z10) {
            n02.p(z10);
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N F(C4899r0 r0Var) {
            r0Var.setValue(null);
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N G(C4899r0 r0Var) {
            r0Var.setValue(null);
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N H(N0 n02, List list) {
            C17542s.j(list, "paymentOptions");
            n02.q(list);
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N I(C4899r0 r0Var) {
            r0Var.setValue(null);
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N J(C4899r0 r0Var, String str, C15987c cVar) {
            C17542s.j(str, "name");
            C17542s.j(cVar, "banks");
            r0Var.setValue(new C13456F(str, cVar));
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N K(C4899r0 r0Var, N0 n02) {
            r0Var.setValue(null);
            n02.t();
            n02.s();
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N L(C17642l lVar) {
            lVar.invoke(C13463a.C2820a.f114887a);
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N M(C4899r0 r0Var, C13473f fVar) {
            C17542s.j(fVar, "additionalInformation");
            r0Var.setValue(fVar);
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N N(N0 n02) {
            n02.B(C10809l.a.f84097a);
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N O(N0 n02, String str) {
            C17542s.j(str, "it");
            n02.v(str);
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N v(C17642l lVar, String str) {
            C17542s.j(str, "it");
            lVar.invoke(new C13463a.b(str));
            return C16807N.f139792a;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            u((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: nI.a} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: nI.l} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: nI.a} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: nI.a} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: nI.l} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: nI.l} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v44, resolved type: nI.l} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void u(U0.C4889m r12, int r13) {
            /*
                r11 = this;
                r0 = r13 & 3
                r1 = 2
                if (r0 != r1) goto L_0x0011
                boolean r0 = r12.l()
                if (r0 != 0) goto L_0x000c
                goto L_0x0011
            L_0x000c:
                r12.L()
                goto L_0x0303
            L_0x0011:
                boolean r0 = U0.C4895p.J()
                if (r0 == 0) goto L_0x0020
                r0 = -1
                java.lang.String r1 = "com.ingka.ikea.onlinepayment.impl.presentation.compose.PaymentScreen.<anonymous> (PaymentScreen.kt:147)"
                r2 = 312444631(0x129f86d7, float:1.0067551E-27)
                U0.C4895p.S(r2, r13, r0, r1)
            L_0x0020:
                U0.A1<Tw.f> r13 = r11.f115059g
                Tw.f r0 = Qw.w0.H(r13)
                r13 = 2085770531(0x7c525523, float:4.3684365E36)
                r12.W(r13)
                nI.l<Qw.C, XH.N> r13 = r11.f115053a
                boolean r13 = r12.V(r13)
                nI.l<Qw.C, XH.N> r1 = r11.f115053a
                java.lang.Object r2 = r12.D()
                if (r13 != 0) goto L_0x0042
                U0.m$a r13 = U0.C4889m.f14007a
                java.lang.Object r13 = r13.a()
                if (r2 != r13) goto L_0x004a
            L_0x0042:
                Qw.y0 r2 = new Qw.y0
                r2.<init>(r1)
                r12.u(r2)
            L_0x004a:
                nI.l r2 = (nI.C17642l) r2
                r12.P()
                r13 = 2085775038(0x7c5266be, float:4.3698648E36)
                r12.W(r13)
                U0.r0<Qw.F> r13 = r11.f115055c
                java.lang.Object r1 = r12.D()
                U0.m$a r10 = U0.C4889m.f14007a
                java.lang.Object r3 = r10.a()
                if (r1 != r3) goto L_0x006b
                Qw.J0 r1 = new Qw.J0
                r1.<init>(r13)
                r12.u(r1)
            L_0x006b:
                nI.p r1 = (nI.p) r1
                r12.P()
                r13 = 2085780479(0x7c527bff, float:4.371589E36)
                r12.W(r13)
                U0.r0<Qw.f> r13 = r11.f115056d
                java.lang.Object r3 = r12.D()
                java.lang.Object r4 = r10.a()
                if (r3 != r4) goto L_0x008a
                Qw.K0 r3 = new Qw.K0
                r3.<init>(r13)
                r12.u(r3)
            L_0x008a:
                nI.l r3 = (nI.C17642l) r3
                r12.P()
                Qw.f0 r6 = new Qw.f0
                r6.<init>(r2, r1, r3)
                r13 = 2085745655(0x7c51f3f7, float:4.360553E36)
                r12.W(r13)
                Qw.N0 r13 = r11.f115054b
                boolean r13 = r12.F(r13)
                Qw.N0 r1 = r11.f115054b
                java.lang.Object r2 = r12.D()
                if (r13 != 0) goto L_0x00ae
                java.lang.Object r13 = r10.a()
                if (r2 != r13) goto L_0x00b6
            L_0x00ae:
                Qw.L0 r2 = new Qw.L0
                r2.<init>(r1)
                r12.u(r2)
            L_0x00b6:
                r1 = r2
                nI.a r1 = (nI.C17631a) r1
                r12.P()
                r13 = 2085735114(0x7c51caca, float:4.3572124E36)
                r12.W(r13)
                Qw.N0 r13 = r11.f115054b
                boolean r13 = r12.F(r13)
                Qw.N0 r2 = r11.f115054b
                java.lang.Object r3 = r12.D()
                if (r13 != 0) goto L_0x00d6
                java.lang.Object r13 = r10.a()
                if (r3 != r13) goto L_0x00de
            L_0x00d6:
                Qw.M0 r3 = new Qw.M0
                r3.<init>(r2)
                r12.u(r3)
            L_0x00de:
                r2 = r3
                nI.l r2 = (nI.C17642l) r2
                r12.P()
                r13 = 2085738488(0x7c51d7f8, float:4.3582816E36)
                r12.W(r13)
                nI.l<Qw.C, XH.N> r13 = r11.f115053a
                boolean r13 = r12.V(r13)
                nI.l<Qw.C, XH.N> r3 = r11.f115053a
                java.lang.Object r4 = r12.D()
                if (r13 != 0) goto L_0x00fe
                java.lang.Object r13 = r10.a()
                if (r4 != r13) goto L_0x0106
            L_0x00fe:
                Qw.z0 r4 = new Qw.z0
                r4.<init>(r3)
                r12.u(r4)
            L_0x0106:
                r3 = r4
                nI.a r3 = (nI.C17631a) r3
                r12.P()
                r13 = 2085741563(0x7c51e3fb, float:4.359256E36)
                r12.W(r13)
                nI.l<Qw.C, XH.N> r13 = r11.f115053a
                boolean r13 = r12.V(r13)
                nI.l<Qw.C, XH.N> r4 = r11.f115053a
                java.lang.Object r5 = r12.D()
                if (r13 != 0) goto L_0x0126
                java.lang.Object r13 = r10.a()
                if (r5 != r13) goto L_0x012e
            L_0x0126:
                Qw.A0 r5 = new Qw.A0
                r5.<init>(r4)
                r12.u(r5)
            L_0x012e:
                r4 = r5
                nI.a r4 = (nI.C17631a) r4
                r12.P()
                r13 = 2085751925(0x7c520c75, float:4.36254E36)
                r12.W(r13)
                Qw.N0 r13 = r11.f115054b
                boolean r13 = r12.F(r13)
                Qw.N0 r5 = r11.f115054b
                U0.r0<Qw.g0> r7 = r11.f115057e
                java.lang.Object r8 = r12.D()
                if (r13 != 0) goto L_0x0150
                java.lang.Object r13 = r10.a()
                if (r8 != r13) goto L_0x0158
            L_0x0150:
                Qw.B0 r8 = new Qw.B0
                r8.<init>(r5, r7)
                r12.u(r8)
            L_0x0158:
                r5 = r8
                nI.l r5 = (nI.C17642l) r5
                r12.P()
                r13 = 2085786241(0x7c529281, float:4.3734152E36)
                r12.W(r13)
                Qw.N0 r13 = r11.f115054b
                boolean r13 = r12.F(r13)
                Qw.N0 r7 = r11.f115054b
                java.lang.Object r8 = r12.D()
                if (r13 != 0) goto L_0x0178
                java.lang.Object r13 = r10.a()
                if (r8 != r13) goto L_0x0180
            L_0x0178:
                Qw.C0 r8 = new Qw.C0
                r8.<init>(r7)
                r12.u(r8)
            L_0x0180:
                r7 = r8
                nI.l r7 = (nI.C17642l) r7
                r12.P()
                r9 = 0
                r8 = r12
                Qw.w0.J(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
                U0.r0<Qw.F> r13 = r11.f115055c
                java.lang.Object r13 = r13.getValue()
                Qw.F r13 = (Qw.C13456F) r13
                r0 = 2085791013(0x7c52a525, float:4.3749275E36)
                r12.W(r0)
                if (r13 != 0) goto L_0x019c
                goto L_0x01d0
            L_0x019c:
                O0.F0 r3 = r11.f115060h
                QJ.Q r4 = r11.f115061i
                U0.r0<Qw.F> r0 = r11.f115055c
                java.lang.String r1 = r13.b()
                KJ.c r2 = r13.a()
                r13 = -86665520(0xfffffffffad596d0, float:-5.5450904E35)
                r12.W(r13)
                java.lang.Object r13 = r12.D()
                java.lang.Object r5 = r10.a()
                if (r13 != r5) goto L_0x01c2
                Qw.D0 r13 = new Qw.D0
                r13.<init>(r0)
                r12.u(r13)
            L_0x01c2:
                r5 = r13
                nI.a r5 = (nI.C17631a) r5
                r12.P()
                r7 = 24576(0x6000, float:3.4438E-41)
                r6 = r12
                Qw.C13462L.h(r1, r2, r3, r4, r5, r6, r7)
                XH.N r13 = XH.C16807N.f139792a
            L_0x01d0:
                r12.P()
                U0.r0<Qw.f> r13 = r11.f115056d
                java.lang.Object r13 = r13.getValue()
                r0 = r13
                Qw.f r0 = (Qw.C13473f) r0
                r13 = 2085804558(0x7c52da0e, float:4.37922E36)
                r12.W(r13)
                if (r0 != 0) goto L_0x01e5
                goto L_0x0213
            L_0x01e5:
                O0.F0 r1 = r11.f115062j
                QJ.Q r2 = r11.f115061i
                U0.r0<Qw.f> r13 = r11.f115056d
                r3 = -86653804(0xfffffffffad5c494, float:-5.5497315E35)
                r12.W(r3)
                java.lang.Object r3 = r12.D()
                java.lang.Object r4 = r10.a()
                if (r3 != r4) goto L_0x0203
                Qw.E0 r3 = new Qw.E0
                r3.<init>(r13)
                r12.u(r3)
            L_0x0203:
                nI.a r3 = (nI.C17631a) r3
                r12.P()
                r6 = 3072(0xc00, float:4.305E-42)
                r7 = 16
                r4 = 0
                r5 = r12
                Qw.C13471e.d(r0, r1, r2, r3, r4, r5, r6, r7)
                XH.N r13 = XH.C16807N.f139792a
            L_0x0213:
                r12.P()
                U0.r0<Qw.g0> r13 = r11.f115057e
                java.lang.Object r13 = r13.getValue()
                r0 = r13
                Qw.g0 r0 = (Qw.C13476g0) r0
                r13 = 2085816578(0x7c530902, float:4.3830293E36)
                r12.W(r13)
                if (r0 != 0) goto L_0x0228
                goto L_0x027a
            L_0x0228:
                O0.F0 r1 = r11.f115063k
                Qw.N0 r13 = r11.f115054b
                QJ.Q r3 = r11.f115061i
                U0.r0<Qw.g0> r2 = r11.f115057e
                r4 = -86642220(0xfffffffffad5f1d4, float:-5.5543204E35)
                r12.W(r4)
                boolean r4 = r12.F(r13)
                java.lang.Object r5 = r12.D()
                if (r4 != 0) goto L_0x0246
                java.lang.Object r4 = r10.a()
                if (r5 != r4) goto L_0x024e
            L_0x0246:
                Qw.F0 r5 = new Qw.F0
                r5.<init>(r13)
                r12.u(r5)
            L_0x024e:
                r13 = r5
                nI.l r13 = (nI.C17642l) r13
                r12.P()
                r4 = -86636204(0xfffffffffad60954, float:-5.5567036E35)
                r12.W(r4)
                java.lang.Object r4 = r12.D()
                java.lang.Object r5 = r10.a()
                if (r4 != r5) goto L_0x026c
                Qw.G0 r4 = new Qw.G0
                r4.<init>(r2)
                r12.u(r4)
            L_0x026c:
                nI.a r4 = (nI.C17631a) r4
                r12.P()
                r6 = 24576(0x6000, float:3.4438E-41)
                r2 = r13
                r5 = r12
                Qw.w0.x(r0, r1, r2, r3, r4, r5, r6)
                XH.N r13 = XH.C16807N.f139792a
            L_0x027a:
                r12.P()
                U0.r0<Tw.f$d> r13 = r11.f115058f
                java.lang.Object r13 = r13.getValue()
                Tw.f$d r13 = (Tw.C13693f.d) r13
                r0 = 2085833932(0x7c534ccc, float:4.388529E36)
                r12.W(r0)
                if (r13 != 0) goto L_0x028e
                goto L_0x02bc
            L_0x028e:
                Qw.N0 r0 = r11.f115054b
                U0.r0<Tw.f$d> r1 = r11.f115058f
                r2 = -86628026(0xfffffffffad62946, float:-5.5599433E35)
                r12.W(r2)
                boolean r2 = r12.F(r0)
                java.lang.Object r3 = r12.D()
                if (r2 != 0) goto L_0x02a8
                java.lang.Object r2 = r10.a()
                if (r3 != r2) goto L_0x02b0
            L_0x02a8:
                Qw.H0 r3 = new Qw.H0
                r3.<init>(r1, r0)
                r12.u(r3)
            L_0x02b0:
                nI.a r3 = (nI.C17631a) r3
                r12.P()
                int r0 = IC.C13023e.f110931a
                Qw.w0.r(r13, r3, r12, r0)
                XH.N r13 = XH.C16807N.f139792a
            L_0x02bc:
                r12.P()
                U0.A1<Tw.f> r13 = r11.f115059g
                Tw.f r13 = Qw.w0.H(r13)
                Tw.f$a r0 = r13.d()
                if (r0 != 0) goto L_0x02cc
                goto L_0x02fa
            L_0x02cc:
                QJ.Q r1 = r11.f115061i
                nI.l<Qw.C, XH.N> r13 = r11.f115053a
                r2 = -86614990(0xfffffffffad65c32, float:-5.5651074E35)
                r12.W(r2)
                boolean r2 = r12.V(r13)
                java.lang.Object r3 = r12.D()
                if (r2 != 0) goto L_0x02e6
                java.lang.Object r2 = r10.a()
                if (r3 != r2) goto L_0x02ee
            L_0x02e6:
                Qw.I0 r3 = new Qw.I0
                r3.<init>(r13)
                r12.u(r3)
            L_0x02ee:
                nI.a r3 = (nI.C17631a) r3
                r12.P()
                r5 = 0
                r6 = 4
                r2 = 0
                r4 = r12
                Qw.w0.t(r0, r1, r2, r3, r4, r5, r6)
            L_0x02fa:
                boolean r12 = U0.C4895p.J()
                if (r12 == 0) goto L_0x0303
                U0.C4895p.R()
            L_0x0303:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Qw.w0.o.u(U0.m, int):void");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.onlinepayment.impl.presentation.compose.PaymentScreenKt$PaymentScreen$2$1", f = "PaymentScreen.kt", l = {}, m = "invokeSuspend")
    static final class p extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f115064c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ A1<C13693f> f115065d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C4899r0<C13693f.d> f115066e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ N0 f115067f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(A1<C13693f> a12, C4899r0<C13693f.d> r0Var, N0 n02, C17164e<? super p> eVar) {
            super(2, eVar);
            this.f115065d = a12;
            this.f115066e = r0Var;
            this.f115067f = n02;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new p(this.f115065d, this.f115066e, this.f115067f, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((p) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f115064c == 0) {
                y.b(obj);
                if (w0.H(this.f115065d).g() != null) {
                    C4899r0<C13693f.d> r0Var = this.f115066e;
                    N0 n02 = this.f115067f;
                    r0Var.setValue(w0.H(this.f115065d).g());
                    n02.o();
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.onlinepayment.impl.presentation.compose.PaymentScreenKt$PaymentScreen$3$1", f = "PaymentScreen.kt", l = {}, m = "invokeSuspend")
    static final class q extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f115068c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Context f115069d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ A1<C13693f> f115070e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C17642l<C13453C, C16807N> f115071f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ N0 f115072g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        q(Context context, A1<C13693f> a12, C17642l<? super C13453C, C16807N> lVar, N0 n02, C17164e<? super q> eVar) {
            super(2, eVar);
            this.f115069d = context;
            this.f115070e = a12;
            this.f115071f = lVar;
            this.f115072g = n02;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new q(this.f115069d, this.f115070e, this.f115071f, this.f115072g, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((q) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f115068c == 0) {
                y.b(obj);
                C13453C V10 = w0.X(w0.H(this.f115070e).c(), this.f115069d);
                if (V10 != null) {
                    C17642l<C13453C, C16807N> lVar = this.f115071f;
                    N0 n02 = this.f115072g;
                    lVar.invoke(V10);
                    n02.t();
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class r implements nI.p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C13693f f115073a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f115074b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f115075c;

        r(C13693f fVar, C17631a<C16807N> aVar, C17631a<C16807N> aVar2) {
            this.f115073a = fVar;
            this.f115074b = aVar;
            this.f115075c = aVar2;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(381239416, i10, -1, "com.ingka.ikea.onlinepayment.impl.presentation.compose.PaymentScreenContent.<anonymous> (PaymentScreen.kt:361)");
                }
                if (!this.f115073a.i()) {
                    w0.L(this.f115074b, this.f115075c, mVar, 0);
                }
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
    static final class s implements nI.q<C5834E, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C13693f f115076a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C17642l<Boolean, C16807N> f115077b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l<String, C16807N> f115078c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f115079d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C17642l<List<? extends Nn.D>, C16807N> f115080e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C13474f0 f115081f;

        s(C13693f fVar, C17642l<? super Boolean, C16807N> lVar, C17642l<? super String, C16807N> lVar2, C17631a<C16807N> aVar, C17642l<? super List<? extends Nn.D>, C16807N> lVar3, C13474f0 f0Var) {
            this.f115076a = fVar;
            this.f115077b = lVar;
            this.f115078c = lVar2;
            this.f115079d = aVar;
            this.f115080e = lVar3;
            this.f115081f = f0Var;
        }

        public final void a(C5834E e10, C4889m mVar, int i10) {
            C17542s.j(e10, "padding");
            if ((i10 & 6) == 0) {
                i10 |= mVar.V(e10) ? 4 : 2;
            }
            if ((i10 & 19) != 18 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-1891079603, i10, -1, "com.ingka.ikea.onlinepayment.impl.presentation.compose.PaymentScreenContent.<anonymous> (PaymentScreen.kt:369)");
                }
                if (this.f115076a.i()) {
                    mVar.W(941516659);
                    Tg.b.b(C5116k1.a(D.h(androidx.compose.ui.d.f18749a, e10), "PaymentOptionsScreenTestTags.LOADING"), mVar, 0, 0);
                    mVar.P();
                } else {
                    mVar.W(941769526);
                    if (this.f115076a.h()) {
                        mVar.W(941802913);
                        w0.p(this.f115076a.f(), this.f115077b, this.f115078c, this.f115079d, D.h(androidx.compose.ui.d.f18749a, e10), mVar, C13023e.f110931a | RC.m.f115340m, 0);
                        mVar.P();
                    } else {
                        mVar.W(942271695);
                        w0.B(this.f115076a, this.f115077b, this.f115078c, this.f115080e, this.f115081f, D.h(androidx.compose.ui.d.f18749a, e10), mVar, 0, 0);
                        mVar.P();
                    }
                    mVar.P();
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
            a((C5834E) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class t implements nI.q<C5842M, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f115082a;

        t(C17631a<C16807N> aVar) {
            this.f115082a = aVar;
        }

        public final void a(C5842M m10, C4889m mVar, int i10) {
            C17542s.j(m10, "$this$IkeaTopAppBar");
            if ((i10 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(1863037192, i10, -1, "com.ingka.ikea.onlinepayment.impl.presentation.compose.PaymentTopAppBar.<anonymous> (PaymentScreen.kt:410)");
                }
                androidx.compose.ui.d a10 = C5116k1.a(androidx.compose.ui.d.f18749a, "PaymentOptionsScreenTestTags.TOP_BAR_REASSURANCE");
                SC.F0.b(C18146a.f147999C9, J1.j.b(C11849b.f102168B1, mVar, 0), a10, false, H0.Tertiary, (G0) null, (r0.m) null, false, this.f115082a, mVar, 24960, 232);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((C5842M) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N A(C13476g0 g0Var, F0 f02, C17642l lVar, Q q10, C17631a aVar, int i10, C4889m mVar, int i11) {
        x(g0Var, f02, lVar, q10, aVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0165  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void B(Tw.C13693f r20, nI.C17642l<? super java.lang.Boolean, XH.C16807N> r21, nI.C17642l<? super java.lang.String, XH.C16807N> r22, nI.C17642l<? super java.util.List<? extends Nn.D>, XH.C16807N> r23, Qw.C13474f0 r24, androidx.compose.ui.d r25, U0.C4889m r26, int r27, int r28) {
        /*
            r6 = r20
            r7 = r27
            r0 = -2099626201(0xffffffff82da3f27, float:-3.2068469E-37)
            r1 = r26
            U0.m r15 = r1.k(r0)
            r1 = r28 & 1
            if (r1 == 0) goto L_0x0014
            r1 = r7 | 6
            goto L_0x0024
        L_0x0014:
            r1 = r7 & 6
            if (r1 != 0) goto L_0x0023
            boolean r1 = r15.F(r6)
            if (r1 == 0) goto L_0x0020
            r1 = 4
            goto L_0x0021
        L_0x0020:
            r1 = 2
        L_0x0021:
            r1 = r1 | r7
            goto L_0x0024
        L_0x0023:
            r1 = r7
        L_0x0024:
            r2 = r28 & 2
            r3 = 32
            if (r2 == 0) goto L_0x002f
            r1 = r1 | 48
            r14 = r21
            goto L_0x0040
        L_0x002f:
            r2 = r7 & 48
            r14 = r21
            if (r2 != 0) goto L_0x0040
            boolean r2 = r15.F(r14)
            if (r2 == 0) goto L_0x003d
            r2 = r3
            goto L_0x003f
        L_0x003d:
            r2 = 16
        L_0x003f:
            r1 = r1 | r2
        L_0x0040:
            r2 = r28 & 4
            r4 = 256(0x100, float:3.59E-43)
            if (r2 == 0) goto L_0x004b
            r1 = r1 | 384(0x180, float:5.38E-43)
            r13 = r22
            goto L_0x005c
        L_0x004b:
            r2 = r7 & 384(0x180, float:5.38E-43)
            r13 = r22
            if (r2 != 0) goto L_0x005c
            boolean r2 = r15.F(r13)
            if (r2 == 0) goto L_0x0059
            r2 = r4
            goto L_0x005b
        L_0x0059:
            r2 = 128(0x80, float:1.794E-43)
        L_0x005b:
            r1 = r1 | r2
        L_0x005c:
            r2 = r28 & 8
            if (r2 == 0) goto L_0x0065
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            r12 = r23
            goto L_0x0077
        L_0x0065:
            r2 = r7 & 3072(0xc00, float:4.305E-42)
            r12 = r23
            if (r2 != 0) goto L_0x0077
            boolean r2 = r15.F(r12)
            if (r2 == 0) goto L_0x0074
            r2 = 2048(0x800, float:2.87E-42)
            goto L_0x0076
        L_0x0074:
            r2 = 1024(0x400, float:1.435E-42)
        L_0x0076:
            r1 = r1 | r2
        L_0x0077:
            r2 = r28 & 16
            r8 = 16384(0x4000, float:2.2959E-41)
            if (r2 == 0) goto L_0x0082
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            r11 = r24
            goto L_0x0093
        L_0x0082:
            r2 = r7 & 24576(0x6000, float:3.4438E-41)
            r11 = r24
            if (r2 != 0) goto L_0x0093
            boolean r2 = r15.V(r11)
            if (r2 == 0) goto L_0x0090
            r2 = r8
            goto L_0x0092
        L_0x0090:
            r2 = 8192(0x2000, float:1.14794E-41)
        L_0x0092:
            r1 = r1 | r2
        L_0x0093:
            r2 = r28 & 32
            r9 = 196608(0x30000, float:2.75506E-40)
            if (r2 == 0) goto L_0x009d
            r1 = r1 | r9
        L_0x009a:
            r9 = r25
            goto L_0x00ae
        L_0x009d:
            r9 = r9 & r7
            if (r9 != 0) goto L_0x009a
            r9 = r25
            boolean r10 = r15.V(r9)
            if (r10 == 0) goto L_0x00ab
            r10 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00ad
        L_0x00ab:
            r10 = 65536(0x10000, float:9.18355E-41)
        L_0x00ad:
            r1 = r1 | r10
        L_0x00ae:
            r10 = 74899(0x12493, float:1.04956E-40)
            r10 = r10 & r1
            r5 = 74898(0x12492, float:1.04954E-40)
            if (r10 != r5) goto L_0x00c4
            boolean r5 = r15.l()
            if (r5 != 0) goto L_0x00be
            goto L_0x00c4
        L_0x00be:
            r15.L()
            r1 = r15
            goto L_0x015f
        L_0x00c4:
            if (r2 == 0) goto L_0x00ca
            androidx.compose.ui.d$a r2 = androidx.compose.ui.d.f18749a
            r10 = r2
            goto L_0x00cb
        L_0x00ca:
            r10 = r9
        L_0x00cb:
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x00d7
            r2 = -1
            java.lang.String r5 = "com.ingka.ikea.onlinepayment.impl.presentation.compose.PaymentOptionsScreenContent (PaymentScreen.kt:489)"
            U0.C4895p.S(r0, r1, r2, r5)
        L_0x00d7:
            java.lang.String r0 = "PaymentOptionsScreenTestTags.CONTAINER"
            androidx.compose.ui.d r9 = androidx.compose.ui.platform.C5116k1.a(r10, r0)
            r0 = 1947884178(0x741a5a92, float:4.891667E31)
            r15.W(r0)
            boolean r0 = r15.F(r6)
            r2 = r1 & 112(0x70, float:1.57E-43)
            r5 = 0
            r16 = 1
            if (r2 != r3) goto L_0x00f1
            r2 = r16
            goto L_0x00f2
        L_0x00f1:
            r2 = r5
        L_0x00f2:
            r0 = r0 | r2
            r2 = r1 & 896(0x380, float:1.256E-42)
            if (r2 != r4) goto L_0x00fa
            r2 = r16
            goto L_0x00fb
        L_0x00fa:
            r2 = r5
        L_0x00fb:
            r0 = r0 | r2
            r2 = 57344(0xe000, float:8.0356E-41)
            r2 = r2 & r1
            if (r2 != r8) goto L_0x0105
            r2 = r16
            goto L_0x0106
        L_0x0105:
            r2 = r5
        L_0x0106:
            r0 = r0 | r2
            r1 = r1 & 7168(0x1c00, float:1.0045E-41)
            r2 = 2048(0x800, float:2.87E-42)
            if (r1 != r2) goto L_0x010f
            r5 = r16
        L_0x010f:
            r0 = r0 | r5
            java.lang.Object r1 = r15.D()
            if (r0 != 0) goto L_0x011e
            U0.m$a r0 = U0.C4889m.f14007a
            java.lang.Object r0 = r0.a()
            if (r1 != r0) goto L_0x0132
        L_0x011e:
            Qw.i0 r8 = new Qw.i0
            r0 = r8
            r1 = r20
            r2 = r21
            r3 = r22
            r4 = r24
            r5 = r23
            r0.<init>(r1, r2, r3, r4, r5)
            r15.u(r8)
            r1 = r8
        L_0x0132:
            r16 = r1
            nI.l r16 = (nI.C17642l) r16
            r15.P()
            r18 = 0
            r19 = 254(0xfe, float:3.56E-43)
            r0 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r17 = 0
            r8 = r9
            r9 = r0
            r0 = r10
            r10 = r1
            r11 = r2
            r12 = r3
            r13 = r4
            r14 = r5
            r1 = r15
            r15 = r17
            r17 = r1
            t0.C5937b.a(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x015e
            U0.C4895p.R()
        L_0x015e:
            r9 = r0
        L_0x015f:
            U0.Y0 r10 = r1.n()
            if (r10 == 0) goto L_0x017d
            Qw.j0 r11 = new Qw.j0
            r0 = r11
            r1 = r20
            r2 = r21
            r3 = r22
            r4 = r23
            r5 = r24
            r6 = r9
            r7 = r27
            r8 = r28
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r10.a(r11)
        L_0x017d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Qw.w0.B(Tw.f, nI.l, nI.l, nI.l, Qw.f0, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N C(C13693f fVar, C17642l lVar, C17642l lVar2, C13474f0 f0Var, C17642l lVar3, x xVar) {
        C17542s.j(xVar, "$this$LazyColumn");
        C13693f.c f10 = fVar.f();
        if (f10 != null) {
            x.i(xVar, (Object) null, (Object) null, c1.c.c(2060506904, true, new g(f10, lVar, lVar2)), 3, (Object) null);
        }
        x.i(xVar, (Object) null, (Object) null, C13452B.f114762a.a(), 3, (Object) null);
        List<C13693f.b> e10 = fVar.e();
        j jVar = j.f115043a;
        xVar.e(e10.size(), jVar != null ? new k(jVar, e10) : null, new l(e10), c1.c.c(-1091073711, true, new m(e10, f0Var, lVar3, fVar)));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N D(C13693f fVar, C17642l lVar, C17642l lVar2, C17642l lVar3, C13474f0 f0Var, androidx.compose.ui.d dVar, int i10, int i11, C4889m mVar, int i12) {
        B(fVar, lVar, lVar2, lVar3, f0Var, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01a9  */
    /* JADX WARNING: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void E(Tw.C13693f.c r24, boolean r25, nI.C17642l<? super java.lang.Boolean, XH.C16807N> r26, nI.C17642l<? super java.lang.String, XH.C16807N> r27, androidx.compose.ui.d r28, U0.C4889m r29, int r30, int r31) {
        /*
            r1 = r24
            r4 = r27
            r6 = r30
            r0 = 16
            r2 = 2
            r3 = 4
            r5 = -1410449729(0xffffffffabee3ebf, float:-1.6928333E-12)
            r7 = r29
            U0.m r12 = r7.k(r5)
            r8 = 1
            r7 = r31 & 1
            if (r7 == 0) goto L_0x001b
            r7 = r6 | 6
            goto L_0x0034
        L_0x001b:
            r7 = r6 & 6
            if (r7 != 0) goto L_0x0033
            r7 = r6 & 8
            if (r7 != 0) goto L_0x0028
            boolean r7 = r12.V(r1)
            goto L_0x002c
        L_0x0028:
            boolean r7 = r12.F(r1)
        L_0x002c:
            if (r7 == 0) goto L_0x0030
            r7 = r3
            goto L_0x0031
        L_0x0030:
            r7 = r2
        L_0x0031:
            r7 = r7 | r6
            goto L_0x0034
        L_0x0033:
            r7 = r6
        L_0x0034:
            r2 = r31 & 2
            if (r2 == 0) goto L_0x003d
            r7 = r7 | 48
        L_0x003a:
            r2 = r25
            goto L_0x004e
        L_0x003d:
            r2 = r6 & 48
            if (r2 != 0) goto L_0x003a
            r2 = r25
            boolean r9 = r12.b(r2)
            if (r9 == 0) goto L_0x004c
            r9 = 32
            goto L_0x004d
        L_0x004c:
            r9 = r0
        L_0x004d:
            r7 = r7 | r9
        L_0x004e:
            r3 = r31 & 4
            if (r3 == 0) goto L_0x0057
            r7 = r7 | 384(0x180, float:5.38E-43)
        L_0x0054:
            r3 = r26
            goto L_0x0069
        L_0x0057:
            r3 = r6 & 384(0x180, float:5.38E-43)
            if (r3 != 0) goto L_0x0054
            r3 = r26
            boolean r9 = r12.F(r3)
            if (r9 == 0) goto L_0x0066
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x0068
        L_0x0066:
            r9 = 128(0x80, float:1.794E-43)
        L_0x0068:
            r7 = r7 | r9
        L_0x0069:
            r9 = r31 & 8
            if (r9 == 0) goto L_0x0070
            r7 = r7 | 3072(0xc00, float:4.305E-42)
            goto L_0x0080
        L_0x0070:
            r9 = r6 & 3072(0xc00, float:4.305E-42)
            if (r9 != 0) goto L_0x0080
            boolean r9 = r12.F(r4)
            if (r9 == 0) goto L_0x007d
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x007f
        L_0x007d:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x007f:
            r7 = r7 | r9
        L_0x0080:
            r0 = r31 & 16
            if (r0 == 0) goto L_0x008a
            r7 = r7 | 24576(0x6000, float:3.4438E-41)
        L_0x0086:
            r9 = r28
        L_0x0088:
            r10 = r7
            goto L_0x009d
        L_0x008a:
            r9 = r6 & 24576(0x6000, float:3.4438E-41)
            if (r9 != 0) goto L_0x0086
            r9 = r28
            boolean r10 = r12.V(r9)
            if (r10 == 0) goto L_0x0099
            r10 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009b
        L_0x0099:
            r10 = 8192(0x2000, float:1.14794E-41)
        L_0x009b:
            r7 = r7 | r10
            goto L_0x0088
        L_0x009d:
            r7 = r10 & 9363(0x2493, float:1.312E-41)
            r11 = 9362(0x2492, float:1.3119E-41)
            if (r7 != r11) goto L_0x00b0
            boolean r7 = r12.l()
            if (r7 != 0) goto L_0x00aa
            goto L_0x00b0
        L_0x00aa:
            r12.L()
            r5 = r12
            goto L_0x01a3
        L_0x00b0:
            if (r0 == 0) goto L_0x00b5
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            goto L_0x00b6
        L_0x00b5:
            r0 = r9
        L_0x00b6:
            boolean r7 = U0.C4895p.J()
            if (r7 == 0) goto L_0x00c2
            r7 = -1
            java.lang.String r9 = "com.ingka.ikea.onlinepayment.impl.presentation.compose.PaymentPriceSummaryContent (PaymentScreen.kt:552)"
            U0.C4895p.S(r5, r10, r7, r9)
        L_0x00c2:
            androidx.compose.foundation.layout.d r5 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r5 = r5.g()
            i1.c$a r7 = i1.C5437c.f24302a
            i1.c$b r7 = r7.k()
            r9 = 0
            E1.I r5 = androidx.compose.foundation.layout.C5080k.a(r5, r7, r12, r9)
            int r7 = U0.C4883j.a(r12, r9)
            U0.y r9 = r12.s()
            androidx.compose.ui.d r11 = androidx.compose.ui.c.e(r12, r0)
            G1.g$a r13 = G1.C4504g.f6515W
            nI.a r14 = r13.a()
            U0.f r15 = r12.m()
            if (r15 != 0) goto L_0x00ee
            U0.C4883j.c()
        L_0x00ee:
            r12.I()
            boolean r15 = r12.i()
            if (r15 == 0) goto L_0x00fb
            r12.p(r14)
            goto L_0x00fe
        L_0x00fb:
            r12.t()
        L_0x00fe:
            U0.m r14 = U0.F1.a(r12)
            nI.p r15 = r13.c()
            U0.F1.c(r14, r5, r15)
            nI.p r5 = r13.e()
            U0.F1.c(r14, r9, r5)
            nI.p r5 = r13.b()
            boolean r9 = r14.i()
            if (r9 != 0) goto L_0x0128
            java.lang.Object r9 = r14.D()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r7)
            boolean r9 = kotlin.jvm.internal.C17542s.e(r9, r15)
            if (r9 != 0) goto L_0x0136
        L_0x0128:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r7)
            r14.u(r9)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r14.w(r7, r5)
        L_0x0136:
            nI.p r5 = r13.d()
            U0.F1.c(r14, r11, r5)
            s0.h r5 = s0.C5862h.f28810a
            androidx.compose.ui.d$a r5 = androidx.compose.ui.d.f18749a
            java.lang.String r7 = "PaymentOptionsScreenTestTags.PRICE_SUMMARY"
            androidx.compose.ui.d r9 = androidx.compose.ui.platform.C5116k1.a(r5, r7)
            Tw.f$c$a r5 = r24.c()
            int r7 = IC.C13023e.f110931a
            java.lang.String r7 = W(r5, r12, r7)
            Qw.w0$n r5 = new Qw.w0$n
            r5.<init>(r1, r4)
            r11 = 54
            r13 = 18282057(0x116f649, float:2.772735E-38)
            c1.a r19 = c1.c.e(r13, r8, r5, r12, r11)
            int r5 = r10 >> 3
            r5 = r5 & 112(0x70, float:1.57E-43)
            r8 = 100663680(0x6000180, float:2.4075226E-35)
            r5 = r5 | r8
            int r8 = r10 << 12
            r10 = 458752(0x70000, float:6.42848E-40)
            r8 = r8 & r10
            r21 = r5 | r8
            r22 = 384(0x180, float:5.38E-43)
            r23 = 3800(0xed8, float:5.325E-42)
            r10 = 0
            r11 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r8 = r26
            r5 = r12
            r12 = r25
            r20 = r5
            SC.C13627q.b(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            tK.u r7 = tK.C18029u.f147649a
            float r8 = r7.d()
            r12 = 0
            r13 = 5
            r7 = 0
            r9 = 0
            r11 = r5
            SC.C13643u0.c(r7, r8, r9, r11, r12, r13)
            r5.x()
            boolean r7 = U0.C4895p.J()
            if (r7 == 0) goto L_0x01a2
            U0.C4895p.R()
        L_0x01a2:
            r9 = r0
        L_0x01a3:
            U0.Y0 r8 = r5.n()
            if (r8 == 0) goto L_0x01bf
            Qw.m0 r10 = new Qw.m0
            r0 = r10
            r1 = r24
            r2 = r25
            r3 = r26
            r4 = r27
            r5 = r9
            r6 = r30
            r7 = r31
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.a(r10)
        L_0x01bf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Qw.w0.E(Tw.f$c, boolean, nI.l, nI.l, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N F(C13693f.c cVar, boolean z10, C17642l lVar, C17642l lVar2, androidx.compose.ui.d dVar, int i10, int i11, C4889m mVar, int i12) {
        E(cVar, z10, lVar, lVar2, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    public static final void G(N0 n02, C17642l<? super C13453C, C16807N> lVar, C4889m mVar, int i10) {
        int i11;
        N0 n03 = n02;
        C17642l<? super C13453C, C16807N> lVar2 = lVar;
        int i12 = i10;
        C17542s.j(n03, "paymentViewModel");
        C17542s.j(lVar2, "onEvent");
        C4889m k10 = mVar.k(-1495382019);
        if ((i12 & 6) == 0) {
            i11 = ((i12 & 8) == 0 ? k10.V(n03) : k10.F(n03) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k10.F(lVar2) ? 32 : 16;
        }
        int i13 = i11;
        if ((i13 & 19) != 18 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-1495382019, i13, -1, "com.ingka.ikea.onlinepayment.impl.presentation.compose.PaymentScreen (PaymentScreen.kt:120)");
            }
            A1<C13693f> c10 = j3.a.c(n02.m(), (C5221y) null, (r.b) null, (C17168i) null, k10, 0, 7);
            Object D10 = k10.D();
            C4889m.a aVar = C4889m.f14007a;
            if (D10 == aVar.a()) {
                B b10 = new B(U0.P.k(C17169j.f142968a, k10));
                k10.u(b10);
                D10 = b10;
            }
            Q a10 = ((B) D10).a();
            F0 l10 = C4725e0.l(true, (C17642l<? super O0.G0, Boolean>) null, k10, 6, 2);
            k10.W(1706727205);
            Object D11 = k10.D();
            if (D11 == aVar.a()) {
                D11 = u1.e((Object) null, (o1) null, 2, (Object) null);
                k10.u(D11);
            }
            C4899r0 r0Var = (C4899r0) D11;
            k10.P();
            F0 l11 = C4725e0.l(true, (C17642l<? super O0.G0, Boolean>) null, k10, 6, 2);
            k10.W(1706734081);
            Object D12 = k10.D();
            if (D12 == aVar.a()) {
                D12 = u1.e((Object) null, (o1) null, 2, (Object) null);
                k10.u(D12);
            }
            C4899r0 r0Var2 = (C4899r0) D12;
            k10.P();
            F0 l12 = C4725e0.l(true, (C17642l<? super O0.G0, Boolean>) null, k10, 6, 2);
            k10.W(1706740785);
            Object D13 = k10.D();
            if (D13 == aVar.a()) {
                D13 = u1.e((Object) null, (o1) null, 2, (Object) null);
                k10.u(D13);
            }
            C4899r0 r0Var3 = (C4899r0) D13;
            k10.P();
            k10.W(1706744286);
            Object D14 = k10.D();
            if (D14 == aVar.a()) {
                D14 = u1.e((Object) null, (o1) null, 2, (Object) null);
                k10.u(D14);
            }
            C4899r0 r0Var4 = (C4899r0) D14;
            k10.P();
            o oVar = r0;
            boolean z10 = true;
            C4899r0 r0Var5 = r0Var4;
            A1<C13693f> a12 = c10;
            C4899r0 r0Var6 = r0Var4;
            F0 f02 = l11;
            int i14 = i13;
            o oVar2 = new o(lVar, n02, r0Var2, r0Var, r0Var3, r0Var5, c10, f02, a10, l10, l12);
            TC.e.e(false, c1.c.e(312444631, true, oVar, k10, 54), k10, 48, 1);
            C13693f.d g10 = H(a12).g();
            k10.W(1706871367);
            A1<C13693f> a13 = a12;
            int i15 = i14 & 14;
            boolean V10 = k10.V(a13) | (i15 == 4 || ((i14 & 8) != 0 && k10.F(n03)));
            Object D15 = k10.D();
            if (V10 || D15 == aVar.a()) {
                D15 = new p(a13, r0Var6, n03, (C17164e<? super p>) null);
                k10.u(D15);
            }
            k10.P();
            U0.P.g(g10, (nI.p) D15, k10, C13023e.f110931a);
            Context context = (Context) k10.Q(AndroidCompositionLocals_androidKt.g());
            C13693f H10 = H(a13);
            k10.W(1706879867);
            boolean V11 = k10.V(a13) | k10.F(context) | ((i14 & 112) == 32);
            if (i15 != 4 && ((i14 & 8) == 0 || !k10.F(n03))) {
                z10 = false;
            }
            boolean z11 = V11 | z10;
            Object D16 = k10.D();
            if (z11 || D16 == aVar.a()) {
                q qVar = new q(context, a13, lVar, n02, (C17164e<? super q>) null);
                k10.u(qVar);
                D16 = qVar;
            }
            k10.P();
            U0.P.g(H10, (nI.p) D16, k10, 0);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new C13478h0(n03, lVar, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C13693f H(A1<C13693f> a12) {
        return a12.getValue();
    }

    /* access modifiers changed from: private */
    public static final C16807N I(N0 n02, C17642l lVar, int i10, C4889m mVar, int i11) {
        G(n02, lVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    public static final void J(C13693f fVar, C17631a<C16807N> aVar, C17642l<? super String, C16807N> lVar, C17631a<C16807N> aVar2, C17631a<C16807N> aVar3, C17642l<? super List<? extends Nn.D>, C16807N> lVar2, C13474f0 f0Var, C17642l<? super Boolean, C16807N> lVar3, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        C13693f fVar2 = fVar;
        C17631a<C16807N> aVar4 = aVar;
        C17642l<? super String, C16807N> lVar4 = lVar;
        C17631a<C16807N> aVar5 = aVar2;
        C17631a<C16807N> aVar6 = aVar3;
        C17642l<? super List<? extends Nn.D>, C16807N> lVar5 = lVar2;
        C13474f0 f0Var2 = f0Var;
        C17642l<? super Boolean, C16807N> lVar6 = lVar3;
        int i12 = i10;
        C17542s.j(fVar2, "uiState");
        C17542s.j(aVar4, "onCompletePurchaseClicked");
        C17542s.j(lVar4, "onDeleteTransactionCallback");
        C17542s.j(aVar5, "onTopAppBarBackClicked");
        C17542s.j(aVar6, "onTopAppBarReassuranceClicked");
        C17542s.j(lVar5, "onPaymentOptionsSelected");
        C17542s.j(f0Var2, "paymentOptionsCallback");
        C17542s.j(lVar6, "onPriceSummaryExpandedToggled");
        C4889m k10 = mVar.k(1935414716);
        if ((i12 & 6) == 0) {
            i11 = (k10.F(fVar2) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k10.F(aVar4) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i11 |= k10.F(lVar4) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i11 |= k10.F(aVar5) ? RecyclerView.n.FLAG_MOVED : 1024;
        }
        if ((i12 & 24576) == 0) {
            i11 |= k10.F(aVar6) ? 16384 : 8192;
        }
        if ((196608 & i12) == 0) {
            i11 |= k10.F(lVar5) ? 131072 : ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        }
        if ((1572864 & i12) == 0) {
            i11 |= k10.V(f0Var2) ? ImageMetadata.SHADING_MODE : ImageMetadata.LENS_APERTURE;
        }
        if ((12582912 & i12) == 0) {
            i11 |= k10.F(lVar6) ? 8388608 : 4194304;
        }
        if ((4793491 & i11) != 4793490 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(1935414716, i11, -1, "com.ingka.ikea.onlinepayment.impl.presentation.compose.PaymentScreenContent (PaymentScreen.kt:358)");
            }
            C5264a e10 = c1.c.e(381239416, true, new r(fVar2, aVar5, aVar6), k10, 54);
            s sVar = r0;
            mVar2 = k10;
            s sVar2 = new s(fVar, lVar3, lVar, aVar, lVar2, f0Var);
            C4762x0.a((androidx.compose.ui.d) null, e10, (nI.p<? super C4889m, ? super Integer, C16807N>) null, (nI.p<? super C4889m, ? super Integer, C16807N>) null, (nI.p<? super C4889m, ? super Integer, C16807N>) null, 0, 0, 0, (C5848T) null, c1.c.e(-1891079603, true, sVar, mVar2, 54), mVar2, 805306416, 509);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
        }
        Y0 n10 = mVar2.n();
        if (n10 != null) {
            t0 t0Var = r0;
            t0 t0Var2 = new t0(fVar, aVar, lVar, aVar2, aVar3, lVar2, f0Var, lVar3, i10);
            n10.a(t0Var);
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N K(C13693f fVar, C17631a aVar, C17642l lVar, C17631a aVar2, C17631a aVar3, C17642l lVar2, C13474f0 f0Var, C17642l lVar3, int i10, C4889m mVar, int i11) {
        J(fVar, aVar, lVar, aVar2, aVar3, lVar2, f0Var, lVar3, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void L(C17631a<C16807N> aVar, C17631a<C16807N> aVar2, C4889m mVar, int i10) {
        int i11;
        C17631a<C16807N> aVar3 = aVar;
        C17631a<C16807N> aVar4 = aVar2;
        int i12 = i10;
        C4889m k10 = mVar.k(-315644807);
        if ((i12 & 6) == 0) {
            i11 = (k10.F(aVar3) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k10.F(aVar4) ? 32 : 16;
        }
        if ((i11 & 19) != 18 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-315644807, i11, -1, "com.ingka.ikea.onlinepayment.impl.presentation.compose.PaymentTopAppBar (PaymentScreen.kt:403)");
            }
            ol.p.c(v.BACK, aVar, C5116k1.a(androidx.compose.ui.d.f18749a, "PaymentOptionsScreenTestTags.TOP_BAR"), J1.j.b(C11849b.f102349t1, k10, 0), (u) null, c1.c.e(1863037192, true, new t(aVar4), k10, 54), (C5848T) null, (e1) null, (g1) null, k10, ((i11 << 3) & 112) | 196998, 464);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new C13484k0(aVar3, aVar4, i12));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N M(C17631a aVar, C17631a aVar2, int i10, C4889m mVar, int i11) {
        L(aVar, aVar2, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    private static final String W(C13693f.c.a aVar, C4889m mVar, int i10) {
        mVar.W(1007431401);
        if (C4895p.J()) {
            C4895p.S(1007431401, i10, -1, "com.ingka.ikea.onlinepayment.impl.presentation.compose.formattedTitle (PaymentScreen.kt:629)");
        }
        C13023e a10 = aVar.a();
        int i11 = C13023e.f110931a;
        String str = a10.a(mVar, i11) + " " + aVar.b().a(mVar, i11);
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
        return str;
    }

    /* access modifiers changed from: private */
    public static final C13453C X(C13688a aVar, Context context) {
        if (C17542s.e(aVar, C13688a.c.f116761a)) {
            return null;
        }
        if (aVar instanceof C13688a.e) {
            return new C13453C.a(((C13688a.e) aVar).a());
        }
        if (C17542s.e(aVar, C13688a.C2867a.f116758a)) {
            return C13455E.a.f114770a;
        }
        if (aVar instanceof C13688a.b) {
            C13688a.b bVar = (C13688a.b) aVar;
            return new C13455E.b(bVar.b().b(context), C16877v.G0(bVar.a(), "\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new C13490n0(context), 30, (Object) null));
        } else if (C17542s.e(aVar, C13688a.d.f116762a)) {
            return C13463a.e.f114891a;
        } else {
            throw new XH.t();
        }
    }

    /* access modifiers changed from: private */
    public static final CharSequence Y(Context context, C13023e eVar) {
        C17542s.j(eVar, "it");
        return eVar.b(context);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x02c9  */
    /* JADX WARNING: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00b3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void p(Tw.C13693f.c r27, nI.C17642l<? super java.lang.Boolean, XH.C16807N> r28, nI.C17642l<? super java.lang.String, XH.C16807N> r29, nI.C17631a<XH.C16807N> r30, androidx.compose.ui.d r31, U0.C4889m r32, int r33, int r34) {
        /*
            r8 = r27
            r9 = r33
            r0 = 16
            r1 = 2
            r2 = 4
            r3 = 1537339714(0x5ba1f142, float:9.1165474E16)
            r4 = r32
            U0.m r15 = r4.k(r3)
            r4 = 1
            r5 = r34 & 1
            if (r5 == 0) goto L_0x0019
            r5 = r9 | 6
            goto L_0x0032
        L_0x0019:
            r5 = r9 & 6
            if (r5 != 0) goto L_0x0031
            r5 = r9 & 8
            if (r5 != 0) goto L_0x0026
            boolean r5 = r15.V(r8)
            goto L_0x002a
        L_0x0026:
            boolean r5 = r15.F(r8)
        L_0x002a:
            if (r5 == 0) goto L_0x002e
            r5 = r2
            goto L_0x002f
        L_0x002e:
            r5 = r1
        L_0x002f:
            r5 = r5 | r9
            goto L_0x0032
        L_0x0031:
            r5 = r9
        L_0x0032:
            r1 = r34 & 2
            if (r1 == 0) goto L_0x003b
            r5 = r5 | 48
            r14 = r28
            goto L_0x004c
        L_0x003b:
            r1 = r9 & 48
            r14 = r28
            if (r1 != 0) goto L_0x004c
            boolean r1 = r15.F(r14)
            if (r1 == 0) goto L_0x004a
            r1 = 32
            goto L_0x004b
        L_0x004a:
            r1 = r0
        L_0x004b:
            r5 = r5 | r1
        L_0x004c:
            r1 = r34 & 4
            if (r1 == 0) goto L_0x0055
            r5 = r5 | 384(0x180, float:5.38E-43)
            r13 = r29
            goto L_0x0067
        L_0x0055:
            r1 = r9 & 384(0x180, float:5.38E-43)
            r13 = r29
            if (r1 != 0) goto L_0x0067
            boolean r1 = r15.F(r13)
            if (r1 == 0) goto L_0x0064
            r1 = 256(0x100, float:3.59E-43)
            goto L_0x0066
        L_0x0064:
            r1 = 128(0x80, float:1.794E-43)
        L_0x0066:
            r5 = r5 | r1
        L_0x0067:
            r1 = r34 & 8
            if (r1 == 0) goto L_0x0070
            r5 = r5 | 3072(0xc00, float:4.305E-42)
            r12 = r30
            goto L_0x0082
        L_0x0070:
            r1 = r9 & 3072(0xc00, float:4.305E-42)
            r12 = r30
            if (r1 != 0) goto L_0x0082
            boolean r1 = r15.F(r12)
            if (r1 == 0) goto L_0x007f
            r1 = 2048(0x800, float:2.87E-42)
            goto L_0x0081
        L_0x007f:
            r1 = 1024(0x400, float:1.435E-42)
        L_0x0081:
            r5 = r5 | r1
        L_0x0082:
            r0 = r34 & 16
            if (r0 == 0) goto L_0x008c
            r5 = r5 | 24576(0x6000, float:3.4438E-41)
        L_0x0088:
            r1 = r31
        L_0x008a:
            r10 = r5
            goto L_0x009f
        L_0x008c:
            r1 = r9 & 24576(0x6000, float:3.4438E-41)
            if (r1 != 0) goto L_0x0088
            r1 = r31
            boolean r2 = r15.V(r1)
            if (r2 == 0) goto L_0x009b
            r2 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009d
        L_0x009b:
            r2 = 8192(0x2000, float:1.14794E-41)
        L_0x009d:
            r5 = r5 | r2
            goto L_0x008a
        L_0x009f:
            r2 = r10 & 9363(0x2493, float:1.312E-41)
            r5 = 9362(0x2492, float:1.3119E-41)
            if (r2 != r5) goto L_0x00b3
            boolean r2 = r15.l()
            if (r2 != 0) goto L_0x00ac
            goto L_0x00b3
        L_0x00ac:
            r15.L()
            r5 = r1
            r1 = r15
            goto L_0x02c3
        L_0x00b3:
            if (r0 == 0) goto L_0x00b9
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            r11 = r0
            goto L_0x00ba
        L_0x00b9:
            r11 = r1
        L_0x00ba:
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x00c6
            r0 = -1
            java.lang.String r1 = "com.ingka.ikea.onlinepayment.impl.presentation.compose.CompletePurchaseContent (PaymentScreen.kt:430)"
            U0.C4895p.S(r3, r10, r0, r1)
        L_0x00c6:
            java.lang.String r0 = "PaymentOptionsScreenTestTags.COMPLETE_PAYMENT"
            androidx.compose.ui.d r0 = androidx.compose.ui.platform.C5116k1.a(r11, r0)
            r1 = 0
            r2 = 0
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.J.f(r0, r1, r4, r2)
            i1.c$a r16 = i1.C5437c.f24302a
            i1.c r1 = r16.o()
            r7 = 0
            E1.I r1 = androidx.compose.foundation.layout.C5077h.h(r1, r7)
            int r2 = U0.C4883j.a(r15, r7)
            U0.y r3 = r15.s()
            androidx.compose.ui.d r0 = androidx.compose.ui.c.e(r15, r0)
            G1.g$a r17 = G1.C4504g.f6515W
            nI.a r5 = r17.a()
            U0.f r6 = r15.m()
            if (r6 != 0) goto L_0x00f8
            U0.C4883j.c()
        L_0x00f8:
            r15.I()
            boolean r6 = r15.i()
            if (r6 == 0) goto L_0x0105
            r15.p(r5)
            goto L_0x0108
        L_0x0105:
            r15.t()
        L_0x0108:
            U0.m r5 = U0.F1.a(r15)
            nI.p r6 = r17.c()
            U0.F1.c(r5, r1, r6)
            nI.p r1 = r17.e()
            U0.F1.c(r5, r3, r1)
            nI.p r1 = r17.b()
            boolean r3 = r5.i()
            if (r3 != 0) goto L_0x0132
            java.lang.Object r3 = r5.D()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            boolean r3 = kotlin.jvm.internal.C17542s.e(r3, r6)
            if (r3 != 0) goto L_0x0140
        L_0x0132:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r5.u(r3)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r5.w(r2, r1)
        L_0x0140:
            nI.p r1 = r17.d()
            U0.F1.c(r5, r0, r1)
            androidx.compose.foundation.layout.j r6 = androidx.compose.foundation.layout.C5079j.f18125a
            androidx.compose.ui.d$a r5 = androidx.compose.ui.d.f18749a
            androidx.compose.foundation.o r19 = androidx.compose.foundation.m.c(r7, r15, r7, r4)
            r23 = 14
            r24 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r18 = r5
            androidx.compose.ui.d r0 = androidx.compose.foundation.m.f(r18, r19, r20, r21, r22, r23, r24)
            androidx.compose.foundation.layout.d r1 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r1 = r1.g()
            i1.c$b r2 = r16.k()
            E1.I r1 = androidx.compose.foundation.layout.C5080k.a(r1, r2, r15, r7)
            int r2 = U0.C4883j.a(r15, r7)
            U0.y r3 = r15.s()
            androidx.compose.ui.d r0 = androidx.compose.ui.c.e(r15, r0)
            nI.a r4 = r17.a()
            U0.f r18 = r15.m()
            if (r18 != 0) goto L_0x0186
            U0.C4883j.c()
        L_0x0186:
            r15.I()
            boolean r18 = r15.i()
            if (r18 == 0) goto L_0x0193
            r15.p(r4)
            goto L_0x0196
        L_0x0193:
            r15.t()
        L_0x0196:
            U0.m r4 = U0.F1.a(r15)
            nI.p r7 = r17.c()
            U0.F1.c(r4, r1, r7)
            nI.p r1 = r17.e()
            U0.F1.c(r4, r3, r1)
            nI.p r1 = r17.b()
            boolean r3 = r4.i()
            if (r3 != 0) goto L_0x01c0
            java.lang.Object r3 = r4.D()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r2)
            boolean r3 = kotlin.jvm.internal.C17542s.e(r3, r7)
            if (r3 != 0) goto L_0x01ce
        L_0x01c0:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r4.u(r3)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4.w(r2, r1)
        L_0x01ce:
            nI.p r1 = r17.d()
            U0.F1.c(r4, r0, r1)
            s0.h r0 = s0.C5862h.f28810a
            r0 = 936575732(0x37d302f4, float:2.5154535E-5)
            r15.W(r0)
            if (r8 != 0) goto L_0x01e5
            r25 = r5
            r26 = r6
            r8 = 0
            goto L_0x020f
        L_0x01e5:
            boolean r1 = r27.a()
            int r0 = IC.C13023e.f110931a
            int r2 = RC.m.f115340m
            r0 = r0 | r2
            r2 = r10 & 14
            r0 = r0 | r2
            int r2 = r10 << 3
            r3 = r2 & 896(0x380, float:1.256E-42)
            r0 = r0 | r3
            r2 = r2 & 7168(0x1c00, float:1.0045E-41)
            r7 = r0 | r2
            r18 = 16
            r4 = 0
            r0 = r27
            r2 = r28
            r3 = r29
            r25 = r5
            r5 = r15
            r26 = r6
            r6 = r7
            r8 = 0
            r7 = r18
            E(r0, r1, r2, r3, r4, r5, r6, r7)
        L_0x020f:
            r15.P()
            r15.x()
            i1.c r0 = r16.b()
            r2 = r25
            r1 = r26
            androidx.compose.ui.d r0 = r1.a(r2, r0)
            i1.c r1 = r16.o()
            E1.I r1 = androidx.compose.foundation.layout.C5077h.h(r1, r8)
            int r2 = U0.C4883j.a(r15, r8)
            U0.y r3 = r15.s()
            androidx.compose.ui.d r0 = androidx.compose.ui.c.e(r15, r0)
            nI.a r4 = r17.a()
            U0.f r5 = r15.m()
            if (r5 != 0) goto L_0x0242
            U0.C4883j.c()
        L_0x0242:
            r15.I()
            boolean r5 = r15.i()
            if (r5 == 0) goto L_0x024f
            r15.p(r4)
            goto L_0x0252
        L_0x024f:
            r15.t()
        L_0x0252:
            U0.m r4 = U0.F1.a(r15)
            nI.p r5 = r17.c()
            U0.F1.c(r4, r1, r5)
            nI.p r1 = r17.e()
            U0.F1.c(r4, r3, r1)
            nI.p r1 = r17.b()
            boolean r3 = r4.i()
            if (r3 != 0) goto L_0x027c
            java.lang.Object r3 = r4.D()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            boolean r3 = kotlin.jvm.internal.C17542s.e(r3, r5)
            if (r3 != 0) goto L_0x028a
        L_0x027c:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r4.u(r3)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4.w(r2, r1)
        L_0x028a:
            nI.p r1 = r17.d()
            U0.F1.c(r4, r0, r1)
            int r0 = rv.C11849b.f102226Q
            java.lang.String r0 = J1.j.b(r0, r15, r8)
            int r1 = r10 << 9
            r2 = 3670016(0x380000, float:5.142788E-39)
            r18 = r1 & r2
            r19 = 62
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r10 = r0
            r0 = r11
            r11 = r1
            r12 = r2
            r13 = r3
            r14 = r4
            r1 = r15
            r15 = r5
            r16 = r30
            r17 = r1
            SC.X0.b(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r1.x()
            r1.x()
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x02c2
            U0.C4895p.R()
        L_0x02c2:
            r5 = r0
        L_0x02c3:
            U0.Y0 r8 = r1.n()
            if (r8 == 0) goto L_0x02de
            Qw.l0 r10 = new Qw.l0
            r0 = r10
            r1 = r27
            r2 = r28
            r3 = r29
            r4 = r30
            r6 = r33
            r7 = r34
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.a(r10)
        L_0x02de:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Qw.w0.p(Tw.f$c, nI.l, nI.l, nI.a, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N q(C13693f.c cVar, C17642l lVar, C17642l lVar2, C17631a aVar, androidx.compose.ui.d dVar, int i10, int i11, C4889m mVar, int i12) {
        p(cVar, lVar, lVar2, aVar, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void r(C13693f.d dVar, C17631a<C16807N> aVar, C4889m mVar, int i10) {
        int i11;
        C4889m k10 = mVar.k(1322689417);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? k10.V(dVar) : k10.F(dVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= k10.F(aVar) ? 32 : 16;
        }
        if ((i11 & 19) != 18 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(1322689417, i11, -1, "com.ingka.ikea.onlinepayment.impl.presentation.compose.ErrorAlertDialogContainer (PaymentScreen.kt:464)");
            }
            Z1.d(dVar.b().a(k10, C13023e.f110931a), new W1(J1.j.b(Oo.b.f84616d5, k10, 0), aVar), aVar, (androidx.compose.ui.d) null, (androidx.compose.ui.window.h) null, c1.c.e(10223927, true, new a(dVar), k10, 54), k10, (W1.f116045c << 3) | ImageMetadata.EDGE_MODE | ((i11 << 3) & 896), 24);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new q0(dVar, aVar, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N s(C13693f.d dVar, C17631a aVar, int i10, C4889m mVar, int i11) {
        r(dVar, aVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x015b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void t(Tw.C13693f.a r21, QJ.Q r22, O0.F0 r23, nI.C17631a<XH.C16807N> r24, U0.C4889m r25, int r26, int r27) {
        /*
            r1 = r21
            r2 = r22
            r0 = r24
            r15 = r26
            r3 = -25547766(0xfffffffffe7a2c0a, float:-8.3133916E37)
            r4 = r25
            U0.m r14 = r4.k(r3)
            r4 = r27 & 1
            r5 = 2
            if (r4 == 0) goto L_0x0019
            r4 = r15 | 6
            goto L_0x0029
        L_0x0019:
            r4 = r15 & 6
            if (r4 != 0) goto L_0x0028
            boolean r4 = r14.F(r1)
            if (r4 == 0) goto L_0x0025
            r4 = 4
            goto L_0x0026
        L_0x0025:
            r4 = r5
        L_0x0026:
            r4 = r4 | r15
            goto L_0x0029
        L_0x0028:
            r4 = r15
        L_0x0029:
            r6 = r27 & 2
            if (r6 == 0) goto L_0x0030
            r4 = r4 | 48
            goto L_0x0040
        L_0x0030:
            r6 = r15 & 48
            if (r6 != 0) goto L_0x0040
            boolean r6 = r14.F(r2)
            if (r6 == 0) goto L_0x003d
            r6 = 32
            goto L_0x003f
        L_0x003d:
            r6 = 16
        L_0x003f:
            r4 = r4 | r6
        L_0x0040:
            r6 = r15 & 384(0x180, float:5.38E-43)
            r7 = 256(0x100, float:3.59E-43)
            if (r6 != 0) goto L_0x005a
            r6 = r27 & 4
            if (r6 != 0) goto L_0x0054
            r6 = r23
            boolean r8 = r14.V(r6)
            if (r8 == 0) goto L_0x0056
            r8 = r7
            goto L_0x0058
        L_0x0054:
            r6 = r23
        L_0x0056:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0058:
            r4 = r4 | r8
            goto L_0x005c
        L_0x005a:
            r6 = r23
        L_0x005c:
            r8 = r27 & 8
            r9 = 2048(0x800, float:2.87E-42)
            if (r8 == 0) goto L_0x0065
            r4 = r4 | 3072(0xc00, float:4.305E-42)
            goto L_0x0074
        L_0x0065:
            r8 = r15 & 3072(0xc00, float:4.305E-42)
            if (r8 != 0) goto L_0x0074
            boolean r8 = r14.F(r0)
            if (r8 == 0) goto L_0x0071
            r8 = r9
            goto L_0x0073
        L_0x0071:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x0073:
            r4 = r4 | r8
        L_0x0074:
            r8 = r4 & 1171(0x493, float:1.641E-42)
            r10 = 1170(0x492, float:1.64E-42)
            if (r8 != r10) goto L_0x0089
            boolean r8 = r14.l()
            if (r8 != 0) goto L_0x0081
            goto L_0x0089
        L_0x0081:
            r14.L()
            r3 = r6
            r20 = r14
            goto L_0x0160
        L_0x0089:
            r14.G()
            r8 = r15 & 1
            r10 = 0
            r11 = 1
            if (r8 == 0) goto L_0x00a4
            boolean r8 = r14.O()
            if (r8 == 0) goto L_0x0099
            goto L_0x00a4
        L_0x0099:
            r14.L()
            r5 = r27 & 4
            if (r5 == 0) goto L_0x00a2
            r4 = r4 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x00a2:
            r13 = r6
            goto L_0x00b0
        L_0x00a4:
            r8 = r27 & 4
            if (r8 == 0) goto L_0x00a2
            r6 = 6
            O0.F0 r5 = O0.C4725e0.l(r11, r10, r14, r6, r5)
            r4 = r4 & -897(0xfffffffffffffc7f, float:NaN)
            r13 = r5
        L_0x00b0:
            r14.y()
            boolean r5 = U0.C4895p.J()
            if (r5 == 0) goto L_0x00bf
            r5 = -1
            java.lang.String r6 = "com.ingka.ikea.onlinepayment.impl.presentation.compose.ExpressPaymentErrorBottomSheet (PaymentScreen.kt:270)"
            U0.C4895p.S(r3, r4, r5, r6)
        L_0x00bf:
            r3 = 144183156(0x8980f74, float:9.1518E-34)
            r14.W(r3)
            boolean r3 = r14.F(r2)
            r5 = r4 & 896(0x380, float:1.256E-42)
            r6 = r5 ^ 384(0x180, float:5.38E-43)
            r8 = 0
            if (r6 <= r7) goto L_0x00d6
            boolean r6 = r14.V(r13)
            if (r6 != 0) goto L_0x00da
        L_0x00d6:
            r6 = r4 & 384(0x180, float:5.38E-43)
            if (r6 != r7) goto L_0x00dc
        L_0x00da:
            r6 = r11
            goto L_0x00dd
        L_0x00dc:
            r6 = r8
        L_0x00dd:
            r3 = r3 | r6
            r6 = r4 & 7168(0x1c00, float:1.0045E-41)
            if (r6 != r9) goto L_0x00e3
            r8 = r11
        L_0x00e3:
            r3 = r3 | r8
            java.lang.Object r6 = r14.D()
            if (r3 != 0) goto L_0x00f2
            U0.m$a r3 = U0.C4889m.f14007a
            java.lang.Object r3 = r3.a()
            if (r6 != r3) goto L_0x00fa
        L_0x00f2:
            Qw.r0 r6 = new Qw.r0
            r6.<init>(r2, r13, r0)
            r14.u(r6)
        L_0x00fa:
            nI.a r6 = (nI.C17631a) r6
            r14.P()
            SC.x1$c r7 = SC.C13656x1.c.f116498a
            SC.z1 r8 = new SC.z1
            SC.w1 r3 = SC.C13652w1.Stacked
            Qw.w0$b r9 = new Qw.w0$b
            r9.<init>(r6)
            r6 = 904931664(0x35f02950, float:1.7893417E-6)
            r12 = 54
            c1.a r6 = c1.c.e(r6, r11, r9, r14, r12)
            r8.<init>(r3, r6, r10)
            Qw.w0$c r3 = new Qw.w0$c
            r3.<init>(r1)
            r6 = 1928242778(0x72eea65a, float:9.453893E30)
            c1.a r16 = c1.c.e(r6, r11, r3, r14, r12)
            int r3 = r4 >> 9
            r3 = r3 & 14
            r4 = 805306368(0x30000000, float:4.656613E-10)
            r3 = r3 | r4
            r3 = r3 | r5
            int r4 = SC.C13656x1.c.f116499b
            int r4 = r4 << 9
            r3 = r3 | r4
            int r4 = SC.C13664z1.f116520d
            int r4 = r4 << 12
            r17 = r3 | r4
            r18 = 482(0x1e2, float:6.75E-43)
            r4 = 0
            r9 = 0
            r10 = 0
            r12 = 0
            r19 = 0
            r3 = r24
            r5 = r13
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r10
            r11 = r12
            r12 = r19
            r19 = r13
            r13 = r16
            r20 = r14
            r15 = r17
            r16 = r18
            SC.J.d(r3, r4, r5, r6, r7, r8, r9, r11, r12, r13, r14, r15, r16)
            boolean r3 = U0.C4895p.J()
            if (r3 == 0) goto L_0x015e
            U0.C4895p.R()
        L_0x015e:
            r3 = r19
        L_0x0160:
            U0.Y0 r7 = r20.n()
            if (r7 == 0) goto L_0x0179
            Qw.s0 r8 = new Qw.s0
            r0 = r8
            r1 = r21
            r2 = r22
            r4 = r24
            r5 = r26
            r6 = r27
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r8)
        L_0x0179:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Qw.w0.t(Tw.f$a, QJ.Q, O0.F0, nI.a, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N u(Q q10, F0 f02, C17631a aVar) {
        C16314k.d(q10, (C17168i) null, (T) null, new d(f02, (C17164e<? super d>) null), 3, (Object) null).s(new u0(f02, aVar));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N v(F0 f02, C17631a aVar, Throwable th2) {
        if (!f02.l()) {
            aVar.invoke();
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N w(C13693f.a aVar, Q q10, F0 f02, C17631a aVar2, int i10, int i11, C4889m mVar, int i12) {
        t(aVar, q10, f02, aVar2, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void x(C13476g0 g0Var, F0 f02, C17642l<? super List<? extends Nn.D>, C16807N> lVar, Q q10, C17631a<C16807N> aVar, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        C13476g0 g0Var2 = g0Var;
        F0 f03 = f02;
        C17642l<? super List<? extends Nn.D>, C16807N> lVar2 = lVar;
        Q q11 = q10;
        C17631a<C16807N> aVar2 = aVar;
        int i12 = i10;
        C4889m k10 = mVar.k(-1575012908);
        if ((i12 & 6) == 0) {
            i11 = (k10.F(g0Var2) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k10.V(f03) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i11 |= k10.F(lVar2) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i11 |= k10.F(q11) ? RecyclerView.n.FLAG_MOVED : 1024;
        }
        if ((i12 & 24576) == 0) {
            i11 |= k10.F(aVar2) ? 16384 : 8192;
        }
        if ((i11 & 9363) != 9362 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-1575012908, i11, -1, "com.ingka.ikea.onlinepayment.impl.presentation.compose.PaymentConfirmationBottomSheet (PaymentScreen.kt:582)");
            }
            k10.W(760742607);
            boolean z10 = false;
            boolean F10 = k10.F(q11) | ((i11 & 112) == 32);
            if ((57344 & i11) == 16384) {
                z10 = true;
            }
            boolean z11 = F10 | z10;
            Object D10 = k10.D();
            if (z11 || D10 == C4889m.f14007a.a()) {
                D10 = new o0(q11, f03, aVar2);
                k10.u(D10);
            }
            k10.P();
            mVar2 = k10;
            SC.J.d(aVar, (androidx.compose.ui.d) null, f02, C13656x1.c.f116498a, (C13664z1) null, false, 0, 0.0f, (nI.p<? super C4889m, ? super Integer, ? extends C5848T>) null, c1.c.e(-680194012, true, new e(g0Var2, lVar2, (C17631a) D10), k10, 54), mVar2, ((i11 >> 12) & 14) | 805306368 | ((i11 << 3) & 896) | (C13656x1.c.f116499b << 9), 498);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
        }
        Y0 n10 = mVar2.n();
        if (n10 != null) {
            n10.a(new p0(g0Var, f02, lVar, q10, aVar, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N y(Q q10, F0 f02, C17631a aVar) {
        C16314k.d(q10, (C17168i) null, (T) null, new f(f02, (C17164e<? super f>) null), 3, (Object) null).s(new v0(f02, aVar));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N z(F0 f02, C17631a aVar, Throwable th2) {
        if (!f02.l()) {
            aVar.invoke();
        }
        return C16807N.f139792a;
    }
}
