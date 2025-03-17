package com.ingka.ikea.boka.impl.bottomsheet;

import QJ.Q;
import U0.A1;
import U0.C4889m;
import U0.C4895p;
import U0.L;
import U0.M;
import XH.C16796C;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import XH.s;
import XH.y;
import androidx.fragment.app.C5187o;
import androidx.fragment.app.W;
import androidx.lifecycle.C5212o;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;
import androidx.lifecycle.r;
import bn.C11110a;
import com.ingka.ikea.boka.impl.bottomsheet.a;
import com.ingka.ikea.ui.bottomsheetdialog.BottomSheetComposeDialogFragment;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import l3.a;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import x4.C8951o;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 02\u00020\u00012\u00020\u0002:\u00011B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0015¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\u00020\u00058\u0016XD¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0019\u001a\u00020\u00148\u0014XD¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001f\u001a\u00020\u001a8BX\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\"\u0010&\u001a\u00020 8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0016\u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010.\u001a\u00020'8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u0016\u0010/\u001a\u00020\u00148\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016¨\u00064²\u0006\f\u00103\u001a\u0002028\nX\u0002"}, d2 = {"Lcom/ingka/ikea/boka/impl/bottomsheet/BokaBottomSheetFragment;", "Lcom/ingka/ikea/ui/bottomsheetdialog/BottomSheetComposeDialogFragment;", "", "<init>", "()V", "", "url", "LXH/N;", "T0", "(Ljava/lang/String;)V", "u0", "(LU0/m;I)V", "Lcom/ingka/ikea/ui/bottomsheetdialog/BottomSheetComposeDialogFragment$a;", "D0", "()Lcom/ingka/ikea/ui/bottomsheetdialog/BottomSheetComposeDialogFragment$a;", "U", "Ljava/lang/String;", "R0", "()Ljava/lang/String;", "destId", "", "X", "Z", "z0", "()Z", "showTopHandle", "Lcom/ingka/ikea/boka/impl/bottomsheet/a;", "Y", "LXH/o;", "S0", "()Lcom/ingka/ikea/boka/impl/bottomsheet/a;", "viewModel", "Lbn/a;", "Lbn/a;", "Q0", "()Lbn/a;", "setBokaNavigation", "(Lbn/a;)V", "bokaNavigation", "LQm/a;", "y0", "LQm/a;", "P0", "()LQm/a;", "setBokaAnalytics", "(LQm/a;)V", "bokaAnalytics", "hasError", "A0", "a", "Lcom/ingka/ikea/boka/impl/bottomsheet/a$a;", "state", "boka-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BokaBottomSheetFragment extends b {

    /* renamed from: A0  reason: collision with root package name */
    public static final a f93241A0 = new a((DefaultConstructorMarker) null);

    /* renamed from: B0  reason: collision with root package name */
    public static final int f93242B0 = 8;

    /* renamed from: U  reason: collision with root package name */
    private final String f93243U = "boka/book";

    /* renamed from: X  reason: collision with root package name */
    private final boolean f93244X;

    /* renamed from: Y  reason: collision with root package name */
    private final C16824o f93245Y;

    /* renamed from: Z  reason: collision with root package name */
    public C11110a f93246Z;

    /* renamed from: y0  reason: collision with root package name */
    public Qm.a f93247y0;

    /* renamed from: z0  reason: collision with root package name */
    private boolean f93248z0;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/boka/impl/bottomsheet/BokaBottomSheetFragment$a;", "", "<init>", "()V", "", "REQUEST_KEY", "Ljava/lang/String;", "BUNDLE_KEY_SHOW_GENERIC_ERROR_SNACKBAR", "boka-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.boka.impl.bottomsheet.BokaBottomSheetFragment$BottomSheetContent$4$1", f = "BokaBottomSheetFragment.kt", l = {}, m = "invokeSuspend")
    static final class b extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f93249c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ BokaBottomSheetFragment f93250d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(BokaBottomSheetFragment bokaBottomSheetFragment, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f93250d = bokaBottomSheetFragment;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new b(this.f93250d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f93249c == 0) {
                y.b(obj);
                this.f93250d.x0();
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/ingka/ikea/boka/impl/bottomsheet/BokaBottomSheetFragment$c", "LU0/L;", "LXH/N;", "b", "()V", "runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c implements L {
        public void b() {
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/fragment/app/o;", "b", "()Landroidx/fragment/app/o;"}, k = 3, mv = {2, 1, 0})
    public static final class d extends C17544u implements C17631a<C5187o> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f93251c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(C5187o oVar) {
            super(0);
            this.f93251c = oVar;
        }

        /* renamed from: b */
        public final C5187o invoke() {
            return this.f93251c;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/k0;", "b", "()Landroidx/lifecycle/k0;"}, k = 3, mv = {2, 1, 0})
    public static final class e extends C17544u implements C17631a<k0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f93252c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(C17631a aVar) {
            super(0);
            this.f93252c = aVar;
        }

        /* renamed from: b */
        public final k0 invoke() {
            return (k0) this.f93252c.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/j0;", "b", "()Landroidx/lifecycle/j0;"}, k = 3, mv = {2, 1, 0})
    public static final class f extends C17544u implements C17631a<j0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C16824o f93253c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(C16824o oVar) {
            super(0);
            this.f93253c = oVar;
        }

        /* renamed from: b */
        public final j0 invoke() {
            return W.d(this.f93253c).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Ll3/a;", "b", "()Ll3/a;"}, k = 3, mv = {2, 1, 0})
    public static final class g extends C17544u implements C17631a<l3.a> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f93254c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f93255d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(C17631a aVar, C16824o oVar) {
            super(0);
            this.f93254c = aVar;
            this.f93255d = oVar;
        }

        /* renamed from: b */
        public final l3.a invoke() {
            l3.a aVar;
            C17631a aVar2 = this.f93254c;
            if (aVar2 != null && (aVar = (l3.a) aVar2.invoke()) != null) {
                return aVar;
            }
            k0 a10 = W.d(this.f93255d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return oVar != null ? oVar.getDefaultViewModelCreationExtras() : a.C0407a.f25486b;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/i0$c;", "b", "()Landroidx/lifecycle/i0$c;"}, k = 3, mv = {2, 1, 0})
    public static final class h extends C17544u implements C17631a<i0.c> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f93256c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f93257d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(C5187o oVar, C16824o oVar2) {
            super(0);
            this.f93256c = oVar;
            this.f93257d = oVar2;
        }

        /* renamed from: b */
        public final i0.c invoke() {
            i0.c defaultViewModelProviderFactory;
            k0 a10 = W.d(this.f93257d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return (oVar == null || (defaultViewModelProviderFactory = oVar.getDefaultViewModelProviderFactory()) == null) ? this.f93256c.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public BokaBottomSheetFragment() {
        C16824o a10 = C16825p.a(s.NONE, new e(new d(this)));
        this.f93245Y = W.b(this, P.b(a.class), new f(a10), new g((C17631a) null, a10), new h(this, a10));
    }

    private static final a.C2078a K0(A1<? extends a.C2078a> a12) {
        return (a.C2078a) a12.getValue();
    }

    /* access modifiers changed from: private */
    public static final L L0(BokaBottomSheetFragment bokaBottomSheetFragment, A1 a12, M m10) {
        C17542s.j(m10, "$this$DisposableEffect");
        if (C17542s.e(K0(a12), a.C2078a.C2079a.f93261a)) {
            bokaBottomSheetFragment.f93248z0 = true;
            bokaBottomSheetFragment.w0();
        }
        return new c();
    }

    /* access modifiers changed from: private */
    public static final C16807N M0(BokaBottomSheetFragment bokaBottomSheetFragment, A1 a12) {
        a.C2078a K02 = K0(a12);
        C17542s.h(K02, "null cannot be cast to non-null type com.ingka.ikea.boka.impl.bottomsheet.BokaBottomSheetViewModel.State.Ready");
        bokaBottomSheetFragment.T0(((a.C2078a.c) K02).a());
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N N0(BokaBottomSheetFragment bokaBottomSheetFragment) {
        bokaBottomSheetFragment.w0();
        return C16807N.f139792a;
    }

    private final a S0() {
        return (a) this.f93245Y.getValue();
    }

    private final void T0(String str) {
        P0().a();
        C8951o f10 = rw.f.f(this, R0(), (C17642l) null, 2, (Object) null);
        if (f10 != null) {
            Q0().b(f10, str);
        }
    }

    /* access modifiers changed from: protected */
    public BottomSheetComposeDialogFragment.a D0() {
        rw.d.a(this, Boolean.valueOf(this.f93248z0), "BokaBottomSheetRequestKey");
        return new BottomSheetComposeDialogFragment.a("BokaBottomSheetRequestKey", D2.d.b(C16796C.a("ShowGenericErrorSnackBar", Boolean.valueOf(this.f93248z0))));
    }

    public final Qm.a P0() {
        Qm.a aVar = this.f93247y0;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("bokaAnalytics");
        return null;
    }

    public final C11110a Q0() {
        C11110a aVar = this.f93246Z;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("bokaNavigation");
        return null;
    }

    public String R0() {
        return this.f93243U;
    }

    /* access modifiers changed from: protected */
    public void u0(C4889m mVar, int i10) {
        mVar.W(-659446665);
        if (C4895p.J()) {
            C4895p.S(-659446665, i10, -1, "com.ingka.ikea.boka.impl.bottomsheet.BokaBottomSheetFragment.BottomSheetContent (BokaBottomSheetFragment.kt:42)");
        }
        A1<a.C2078a> c10 = j3.a.c(S0().getState(), (C5221y) null, (r.b) null, (C17168i) null, mVar, 0, 7);
        a.C2078a K02 = K0(c10);
        mVar.W(791370933);
        boolean V10 = mVar.V(c10) | mVar.F(this);
        Object D10 = mVar.D();
        if (V10 || D10 == C4889m.f14007a.a()) {
            D10 = new Rm.a(this, c10);
            mVar.u(D10);
        }
        mVar.P();
        U0.P.c(K02, (C17642l) D10, mVar, 0);
        a.C2078a K03 = K0(c10);
        mVar.W(791379815);
        boolean F10 = mVar.F(this) | mVar.V(c10);
        Object D11 = mVar.D();
        if (F10 || D11 == C4889m.f14007a.a()) {
            D11 = new Rm.b(this, c10);
            mVar.u(D11);
        }
        C17631a aVar = (C17631a) D11;
        mVar.P();
        mVar.W(791384084);
        boolean F11 = mVar.F(this);
        Object D12 = mVar.D();
        if (F11 || D12 == C4889m.f14007a.a()) {
            D12 = new Rm.c(this);
            mVar.u(D12);
        }
        mVar.P();
        Sm.g.i(K03, aVar, (C17631a) D12, mVar, 0);
        C16807N n10 = C16807N.f139792a;
        mVar.W(791386215);
        boolean F12 = mVar.F(this);
        Object D13 = mVar.D();
        if (F12 || D13 == C4889m.f14007a.a()) {
            D13 = new b(this, (C17164e<? super b>) null);
            mVar.u(D13);
        }
        mVar.P();
        U0.P.g(n10, (p) D13, mVar, 6);
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
    }

    /* access modifiers changed from: protected */
    public boolean z0() {
        return this.f93244X;
    }
}
