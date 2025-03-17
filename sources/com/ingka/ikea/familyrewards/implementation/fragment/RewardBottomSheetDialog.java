package com.ingka.ikea.familyrewards.implementation.fragment;

import QJ.Q;
import U0.A1;
import U0.C4889m;
import U0.C4895p;
import U0.C4910x;
import U0.J0;
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
import com.ingka.ikea.ui.bottomsheetdialog.BottomSheetComposeDialogFragment;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import ir.i;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.P;
import kr.h;
import l3.a;
import nI.C17631a;
import nI.p;
import or.n;
import vm.C12190a;
import vm.C12192c;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0015¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\b\u0010\tR\"\u0010\u0011\u001a\u00020\n8\u0000@\u0000X.¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0017\u001a\u00020\u00128\u0014XD¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001d\u001a\u00020\u00188BX\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u001eR\u001b\u0010$\u001a\u00020 8BX\u0002¢\u0006\f\n\u0004\b!\u0010\u001a\u001a\u0004\b\"\u0010#¨\u0006'²\u0006\f\u0010&\u001a\u00020%8\nX\u0002"}, d2 = {"Lcom/ingka/ikea/familyrewards/implementation/fragment/RewardBottomSheetDialog;", "Lcom/ingka/ikea/ui/bottomsheetdialog/BottomSheetComposeDialogFragment;", "<init>", "()V", "LXH/N;", "u0", "(LU0/m;I)V", "Lcom/ingka/ikea/ui/bottomsheetdialog/BottomSheetComposeDialogFragment$a;", "D0", "()Lcom/ingka/ikea/ui/bottomsheetdialog/BottomSheetComposeDialogFragment$a;", "Lvm/a;", "U", "Lvm/a;", "M0", "()Lvm/a;", "setBarcode$familyrewards_implementation_release", "(Lvm/a;)V", "barcode", "", "X", "Z", "z0", "()Z", "showTopHandle", "", "Y", "LXH/o;", "getRequestKey", "()Ljava/lang/String;", "requestKey", "Lcom/ingka/ikea/ui/bottomsheetdialog/BottomSheetComposeDialogFragment$a;", "result", "Lor/n;", "y0", "N0", "()Lor/n;", "viewModel", "Lkr/h;", "uiState", "familyrewards-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RewardBottomSheetDialog extends f {

    /* renamed from: U  reason: collision with root package name */
    public C12190a f95900U;

    /* renamed from: X  reason: collision with root package name */
    private final boolean f95901X;

    /* renamed from: Y  reason: collision with root package name */
    private final C16824o f95902Y = C16825p.b(new i(this));

    /* renamed from: Z  reason: collision with root package name */
    private BottomSheetComposeDialogFragment.a f95903Z;

    /* renamed from: y0  reason: collision with root package name */
    private final C16824o f95904y0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.familyrewards.implementation.fragment.RewardBottomSheetDialog$BottomSheetContent$1$1", f = "RewardBottomSheetDialog.kt", l = {}, m = "invokeSuspend")
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f95905c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ RewardBottomSheetDialog f95906d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ A1<h> f95907e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(RewardBottomSheetDialog rewardBottomSheetDialog, A1<? extends h> a12, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f95906d = rewardBottomSheetDialog;
            this.f95907e = a12;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f95906d, this.f95907e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f95905c == 0) {
                y.b(obj);
                if (!(RewardBottomSheetDialog.I0(this.f95907e) instanceof h.d)) {
                    this.f95906d.x0();
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RewardBottomSheetDialog f95908a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ A1<h> f95909b;

        b(RewardBottomSheetDialog rewardBottomSheetDialog, A1<? extends h> a12) {
            this.f95908a = rewardBottomSheetDialog;
            this.f95909b = a12;
        }

        /* access modifiers changed from: private */
        public static final C16807N e(RewardBottomSheetDialog rewardBottomSheetDialog) {
            rewardBottomSheetDialog.w0();
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N f(RewardBottomSheetDialog rewardBottomSheetDialog) {
            rewardBottomSheetDialog.w0();
            return C16807N.f139792a;
        }

        public final void c(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(559781964, i10, -1, "com.ingka.ikea.familyrewards.implementation.fragment.RewardBottomSheetDialog.BottomSheetContent.<anonymous> (RewardBottomSheetDialog.kt:47)");
                }
                h J02 = RewardBottomSheetDialog.I0(this.f95909b);
                mVar.W(1298541274);
                boolean F10 = mVar.F(this.f95908a);
                RewardBottomSheetDialog rewardBottomSheetDialog = this.f95908a;
                Object D10 = mVar.D();
                if (F10 || D10 == C4889m.f14007a.a()) {
                    D10 = new h(rewardBottomSheetDialog);
                    mVar.u(D10);
                }
                C17631a aVar = (C17631a) D10;
                mVar.P();
                mVar.W(1298539386);
                boolean F11 = mVar.F(this.f95908a);
                RewardBottomSheetDialog rewardBottomSheetDialog2 = this.f95908a;
                Object D11 = mVar.D();
                if (F11 || D11 == C4889m.f14007a.a()) {
                    D11 = new i(rewardBottomSheetDialog2);
                    mVar.u(D11);
                }
                mVar.P();
                Uq.c.c(J02, aVar, (C17631a) D11, mVar, 0);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            c((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/fragment/app/o;", "b", "()Landroidx/fragment/app/o;"}, k = 3, mv = {2, 1, 0})
    public static final class c extends C17544u implements C17631a<C5187o> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f95910c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(C5187o oVar) {
            super(0);
            this.f95910c = oVar;
        }

        /* renamed from: b */
        public final C5187o invoke() {
            return this.f95910c;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/k0;", "b", "()Landroidx/lifecycle/k0;"}, k = 3, mv = {2, 1, 0})
    public static final class d extends C17544u implements C17631a<k0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f95911c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(C17631a aVar) {
            super(0);
            this.f95911c = aVar;
        }

        /* renamed from: b */
        public final k0 invoke() {
            return (k0) this.f95911c.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/j0;", "b", "()Landroidx/lifecycle/j0;"}, k = 3, mv = {2, 1, 0})
    public static final class e extends C17544u implements C17631a<j0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C16824o f95912c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(C16824o oVar) {
            super(0);
            this.f95912c = oVar;
        }

        /* renamed from: b */
        public final j0 invoke() {
            return W.d(this.f95912c).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Ll3/a;", "b", "()Ll3/a;"}, k = 3, mv = {2, 1, 0})
    public static final class f extends C17544u implements C17631a<l3.a> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f95913c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f95914d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(C17631a aVar, C16824o oVar) {
            super(0);
            this.f95913c = aVar;
            this.f95914d = oVar;
        }

        /* renamed from: b */
        public final l3.a invoke() {
            l3.a aVar;
            C17631a aVar2 = this.f95913c;
            if (aVar2 != null && (aVar = (l3.a) aVar2.invoke()) != null) {
                return aVar;
            }
            k0 a10 = W.d(this.f95914d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return oVar != null ? oVar.getDefaultViewModelCreationExtras() : a.C0407a.f25486b;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/i0$c;", "b", "()Landroidx/lifecycle/i0$c;"}, k = 3, mv = {2, 1, 0})
    public static final class g extends C17544u implements C17631a<i0.c> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f95915c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f95916d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(C5187o oVar, C16824o oVar2) {
            super(0);
            this.f95915c = oVar;
            this.f95916d = oVar2;
        }

        /* renamed from: b */
        public final i0.c invoke() {
            i0.c defaultViewModelProviderFactory;
            k0 a10 = W.d(this.f95916d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return (oVar == null || (defaultViewModelProviderFactory = oVar.getDefaultViewModelProviderFactory()) == null) ? this.f95915c.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public RewardBottomSheetDialog() {
        C16824o a10 = C16825p.a(s.NONE, new d(new c(this)));
        this.f95904y0 = W.b(this, P.b(n.class), new e(a10), new f((C17631a) null, a10), new g(this, a10));
    }

    /* access modifiers changed from: private */
    public static final h I0(A1<? extends h> a12) {
        return (h) a12.getValue();
    }

    private final n N0() {
        return (n) this.f95904y0.getValue();
    }

    /* access modifiers changed from: private */
    public static final String O0(RewardBottomSheetDialog rewardBottomSheetDialog) {
        String string = rewardBottomSheetDialog.requireArguments().getString("requestKey");
        if (string != null) {
            return string;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    private final String getRequestKey() {
        return (String) this.f95902Y.getValue();
    }

    /* access modifiers changed from: protected */
    public BottomSheetComposeDialogFragment.a D0() {
        BottomSheetComposeDialogFragment.a aVar = this.f95903Z;
        return aVar == null ? BottomSheetComposeDialogFragment.a.f120570c.a(getRequestKey()) : aVar;
    }

    public final C12190a M0() {
        C12190a aVar = this.f95900U;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("barcode");
        return null;
    }

    /* access modifiers changed from: protected */
    public void u0(C4889m mVar, int i10) {
        mVar.W(-546761844);
        if (C4895p.J()) {
            C4895p.S(-546761844, i10, -1, "com.ingka.ikea.familyrewards.implementation.fragment.RewardBottomSheetDialog.BottomSheetContent (RewardBottomSheetDialog.kt:39)");
        }
        A1<h> c10 = j3.a.c(N0().m(), (C5221y) null, (r.b) null, (C17168i) null, mVar, 0, 7);
        h I02 = I0(c10);
        mVar.W(1685691809);
        boolean V10 = mVar.V(c10) | mVar.F(this);
        Object D10 = mVar.D();
        if (V10 || D10 == C4889m.f14007a.a()) {
            D10 = new a(this, c10, (C17164e<? super a>) null);
            mVar.u(D10);
        }
        mVar.P();
        U0.P.g(I02, (p) D10, mVar, 0);
        C4910x.a(C12192c.d().d(M0()), c1.c.e(559781964, true, new b(this, c10), mVar, 54), mVar, J0.f13770i | 48);
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
    }

    /* access modifiers changed from: protected */
    public boolean z0() {
        return this.f95901X;
    }
}
