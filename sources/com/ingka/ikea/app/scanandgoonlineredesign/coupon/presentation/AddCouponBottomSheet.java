package com.ingka.ikea.app.scanandgoonlineredesign.coupon.presentation;

import QJ.Q;
import U0.C4889m;
import U0.C4895p;
import XH.C16796C;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import XH.s;
import XH.t;
import XH.y;
import androidx.fragment.app.C5187o;
import androidx.fragment.app.W;
import androidx.lifecycle.C5212o;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;
import com.ingka.ikea.app.scanandgoonlineredesign.coupon.navigation.AddCouponBottomSheetNavigation;
import com.ingka.ikea.app.scanandgoonlineredesign.coupon.presentation.a;
import com.ingka.ikea.ui.bottomsheetdialog.BottomSheetComposeDialogFragment;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.P;
import l3.a;
import nI.C17631a;
import nI.p;

@Metadata(d1 = {"\u00001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t*\u0001\t\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0006H\u0015¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00118BX\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/ingka/ikea/app/scanandgoonlineredesign/coupon/presentation/AddCouponBottomSheet;", "Lcom/ingka/ikea/ui/bottomsheetdialog/BottomSheetComposeDialogFragment;", "<init>", "()V", "Lcom/ingka/ikea/app/scanandgoonlineredesign/coupon/navigation/AddCouponBottomSheetNavigation$NavigationResult;", "action", "LXH/N;", "M0", "(Lcom/ingka/ikea/app/scanandgoonlineredesign/coupon/navigation/AddCouponBottomSheetNavigation$NavigationResult;)V", "com/ingka/ikea/app/scanandgoonlineredesign/coupon/presentation/AddCouponBottomSheet$b", "N0", "()Lcom/ingka/ikea/app/scanandgoonlineredesign/coupon/presentation/AddCouponBottomSheet$b;", "u0", "(LU0/m;I)V", "Lcom/ingka/ikea/ui/bottomsheetdialog/BottomSheetComposeDialogFragment$a;", "D0", "()Lcom/ingka/ikea/ui/bottomsheetdialog/BottomSheetComposeDialogFragment$a;", "Lcom/ingka/ikea/app/scanandgoonlineredesign/coupon/presentation/a;", "R", "LXH/o;", "L0", "()Lcom/ingka/ikea/app/scanandgoonlineredesign/coupon/presentation/a;", "viewModel", "S", "Lcom/ingka/ikea/ui/bottomsheetdialog/BottomSheetComposeDialogFragment$a;", "result", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AddCouponBottomSheet extends BottomSheetComposeDialogFragment {

    /* renamed from: R  reason: collision with root package name */
    private final C16824o f91274R;

    /* renamed from: S  reason: collision with root package name */
    private BottomSheetComposeDialogFragment.a f91275S;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.scanandgoonlineredesign.coupon.presentation.AddCouponBottomSheet$BottomSheetContent$1$1", f = "AddCouponBottomSheet.kt", l = {}, m = "invokeSuspend")
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f91276c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ AddCouponBottomSheet f91277d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(AddCouponBottomSheet addCouponBottomSheet, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f91277d = addCouponBottomSheet;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f91277d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f91276c == 0) {
                y.b(obj);
                this.f91277d.x0();
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/ingka/ikea/app/scanandgoonlineredesign/coupon/presentation/AddCouponBottomSheet$b", "Lcom/ingka/ikea/app/scanandgoonlineredesign/coupon/presentation/b;", "Lcom/ingka/ikea/app/scanandgoonlineredesign/coupon/presentation/a$b;", "action", "LXH/N;", "a", "(Lcom/ingka/ikea/app/scanandgoonlineredesign/coupon/presentation/a$b;)V", "Lcom/ingka/ikea/app/scanandgoonlineredesign/coupon/presentation/a$a;", "b", "(Lcom/ingka/ikea/app/scanandgoonlineredesign/coupon/presentation/a$a;)V", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AddCouponBottomSheet f91278a;

        b(AddCouponBottomSheet addCouponBottomSheet) {
            this.f91278a = addCouponBottomSheet;
        }

        public void a(a.b bVar) {
            C17542s.j(bVar, "action");
            this.f91278a.L0().h(bVar);
        }

        public void b(a.C1995a aVar) {
            C17542s.j(aVar, "action");
            if (aVar instanceof a.C1995a.C1996a) {
                this.f91278a.M0(((a.C1995a.C1996a) aVar).a());
                this.f91278a.w0();
            } else if (!C17542s.e(aVar, a.C1995a.b.f91290a)) {
                throw new t();
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/fragment/app/o;", "b", "()Landroidx/fragment/app/o;"}, k = 3, mv = {2, 1, 0})
    public static final class c extends C17544u implements C17631a<C5187o> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f91279c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(C5187o oVar) {
            super(0);
            this.f91279c = oVar;
        }

        /* renamed from: b */
        public final C5187o invoke() {
            return this.f91279c;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/k0;", "b", "()Landroidx/lifecycle/k0;"}, k = 3, mv = {2, 1, 0})
    public static final class d extends C17544u implements C17631a<k0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f91280c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(C17631a aVar) {
            super(0);
            this.f91280c = aVar;
        }

        /* renamed from: b */
        public final k0 invoke() {
            return (k0) this.f91280c.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/j0;", "b", "()Landroidx/lifecycle/j0;"}, k = 3, mv = {2, 1, 0})
    public static final class e extends C17544u implements C17631a<j0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C16824o f91281c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(C16824o oVar) {
            super(0);
            this.f91281c = oVar;
        }

        /* renamed from: b */
        public final j0 invoke() {
            return W.d(this.f91281c).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Ll3/a;", "b", "()Ll3/a;"}, k = 3, mv = {2, 1, 0})
    public static final class f extends C17544u implements C17631a<l3.a> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f91282c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f91283d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(C17631a aVar, C16824o oVar) {
            super(0);
            this.f91282c = aVar;
            this.f91283d = oVar;
        }

        /* renamed from: b */
        public final l3.a invoke() {
            l3.a aVar;
            C17631a aVar2 = this.f91282c;
            if (aVar2 != null && (aVar = (l3.a) aVar2.invoke()) != null) {
                return aVar;
            }
            k0 a10 = W.d(this.f91283d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return oVar != null ? oVar.getDefaultViewModelCreationExtras() : a.C0407a.f25486b;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/i0$c;", "b", "()Landroidx/lifecycle/i0$c;"}, k = 3, mv = {2, 1, 0})
    public static final class g extends C17544u implements C17631a<i0.c> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f91284c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f91285d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(C5187o oVar, C16824o oVar2) {
            super(0);
            this.f91284c = oVar;
            this.f91285d = oVar2;
        }

        /* renamed from: b */
        public final i0.c invoke() {
            i0.c defaultViewModelProviderFactory;
            k0 a10 = W.d(this.f91285d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return (oVar == null || (defaultViewModelProviderFactory = oVar.getDefaultViewModelProviderFactory()) == null) ? this.f91284c.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public AddCouponBottomSheet() {
        C16824o a10 = C16825p.a(s.NONE, new d(new c(this)));
        this.f91274R = W.b(this, P.b(a.class), new e(a10), new f((C17631a) null, a10), new g(this, a10));
    }

    /* access modifiers changed from: private */
    public final a L0() {
        return (a) this.f91274R.getValue();
    }

    /* access modifiers changed from: private */
    public final void M0(AddCouponBottomSheetNavigation.NavigationResult navigationResult) {
        this.f91275S = new BottomSheetComposeDialogFragment.a("AddCouponBottomSheet.RequestKey", D2.d.b(C16796C.a("AddCouponBottomSheet.ResultKey", navigationResult)));
    }

    private final b N0() {
        return new b(this);
    }

    /* access modifiers changed from: protected */
    public BottomSheetComposeDialogFragment.a D0() {
        BottomSheetComposeDialogFragment.a aVar = this.f91275S;
        return aVar == null ? new BottomSheetComposeDialogFragment.a("AddCouponBottomSheet.RequestKey", D2.d.b(C16796C.a("AddCouponBottomSheet.ResultKey", AddCouponBottomSheetNavigation.NavigationResult.b.f91272a))) : aVar;
    }

    /* access modifiers changed from: protected */
    public void u0(C4889m mVar, int i10) {
        mVar.W(-666902959);
        if (C4895p.J()) {
            C4895p.S(-666902959, i10, -1, "com.ingka.ikea.app.scanandgoonlineredesign.coupon.presentation.AddCouponBottomSheet.BottomSheetContent (AddCouponBottomSheet.kt:21)");
        }
        c.k(L0(), N0(), mVar, 0);
        C16807N n10 = C16807N.f139792a;
        mVar.W(1644553283);
        boolean F10 = mVar.F(this);
        Object D10 = mVar.D();
        if (F10 || D10 == C4889m.f14007a.a()) {
            D10 = new a(this, (C17164e<? super a>) null);
            mVar.u(D10);
        }
        mVar.P();
        U0.P.g(n10, (p) D10, mVar, 6);
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
    }
}
