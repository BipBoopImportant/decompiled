package com.ingka.ikea.scanandgo.cart.impl.dialog;

import Dy.X;
import Gy.l;
import U0.C4889m;
import U0.C4895p;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import XH.s;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.s1;
import androidx.fragment.app.C5187o;
import androidx.fragment.app.W;
import androidx.lifecycle.C5212o;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import l3.a;
import nI.C17631a;
import nI.p;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u00158BX\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/ingka/ikea/scanandgo/cart/impl/dialog/CombinedCartOnboardingDialog;", "Lcom/ingka/ikea/core/android/fragments/BaseBottomSheetDialogFragment;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Landroid/content/DialogInterface;", "dialog", "LXH/N;", "onCancel", "(Landroid/content/DialogInterface;)V", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "LOy/a;", "O", "LXH/o;", "z0", "()LOy/a;", "viewModel", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CombinedCartOnboardingDialog extends d {

    /* renamed from: O  reason: collision with root package name */
    private final C16824o f119851O;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CombinedCartOnboardingDialog f119852a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.ingka.ikea.scanandgo.cart.impl.dialog.CombinedCartOnboardingDialog$a$a  reason: collision with other inner class name */
        static final class C2992a implements p<C4889m, Integer, C16807N> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ CombinedCartOnboardingDialog f119853a;

            C2992a(CombinedCartOnboardingDialog combinedCartOnboardingDialog) {
                this.f119853a = combinedCartOnboardingDialog;
            }

            /* access modifiers changed from: private */
            public static final C16807N c(CombinedCartOnboardingDialog combinedCartOnboardingDialog) {
                combinedCartOnboardingDialog.z0().C();
                combinedCartOnboardingDialog.dismiss();
                return C16807N.f139792a;
            }

            public final void b(C4889m mVar, int i10) {
                if ((i10 & 3) != 2 || !mVar.l()) {
                    if (C4895p.J()) {
                        C4895p.S(1824567382, i10, -1, "com.ingka.ikea.scanandgo.cart.impl.dialog.CombinedCartOnboardingDialog.onCreateView.<anonymous>.<anonymous>.<anonymous> (CombinedCartOnboardingDialog.kt:41)");
                    }
                    mVar.W(-699905298);
                    boolean F10 = mVar.F(this.f119853a);
                    CombinedCartOnboardingDialog combinedCartOnboardingDialog = this.f119853a;
                    Object D10 = mVar.D();
                    if (F10 || D10 == C4889m.f14007a.a()) {
                        D10 = new b(combinedCartOnboardingDialog);
                        mVar.u(D10);
                    }
                    mVar.P();
                    X.r((C17631a) D10, mVar, 0);
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

        a(CombinedCartOnboardingDialog combinedCartOnboardingDialog) {
            this.f119852a = combinedCartOnboardingDialog;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(2114704163, i10, -1, "com.ingka.ikea.scanandgo.cart.impl.dialog.CombinedCartOnboardingDialog.onCreateView.<anonymous>.<anonymous> (CombinedCartOnboardingDialog.kt:40)");
                }
                TC.e.c((androidx.compose.ui.d) null, c1.c.e(1824567382, true, new C2992a(this.f119852a), mVar, 54), mVar, 48, 1);
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

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/fragment/app/o;", "b", "()Landroidx/fragment/app/o;"}, k = 3, mv = {2, 1, 0})
    public static final class b extends C17544u implements C17631a<C5187o> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f119854c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(C5187o oVar) {
            super(0);
            this.f119854c = oVar;
        }

        /* renamed from: b */
        public final C5187o invoke() {
            return this.f119854c;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/k0;", "b", "()Landroidx/lifecycle/k0;"}, k = 3, mv = {2, 1, 0})
    public static final class c extends C17544u implements C17631a<k0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f119855c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(C17631a aVar) {
            super(0);
            this.f119855c = aVar;
        }

        /* renamed from: b */
        public final k0 invoke() {
            return (k0) this.f119855c.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/j0;", "b", "()Landroidx/lifecycle/j0;"}, k = 3, mv = {2, 1, 0})
    public static final class d extends C17544u implements C17631a<j0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C16824o f119856c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(C16824o oVar) {
            super(0);
            this.f119856c = oVar;
        }

        /* renamed from: b */
        public final j0 invoke() {
            return W.d(this.f119856c).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Ll3/a;", "b", "()Ll3/a;"}, k = 3, mv = {2, 1, 0})
    public static final class e extends C17544u implements C17631a<l3.a> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f119857c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f119858d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(C17631a aVar, C16824o oVar) {
            super(0);
            this.f119857c = aVar;
            this.f119858d = oVar;
        }

        /* renamed from: b */
        public final l3.a invoke() {
            l3.a aVar;
            C17631a aVar2 = this.f119857c;
            if (aVar2 != null && (aVar = (l3.a) aVar2.invoke()) != null) {
                return aVar;
            }
            k0 a10 = W.d(this.f119858d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return oVar != null ? oVar.getDefaultViewModelCreationExtras() : a.C0407a.f25486b;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/i0$c;", "b", "()Landroidx/lifecycle/i0$c;"}, k = 3, mv = {2, 1, 0})
    public static final class f extends C17544u implements C17631a<i0.c> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f119859c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f119860d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(C5187o oVar, C16824o oVar2) {
            super(0);
            this.f119859c = oVar;
            this.f119860d = oVar2;
        }

        /* renamed from: b */
        public final i0.c invoke() {
            i0.c defaultViewModelProviderFactory;
            k0 a10 = W.d(this.f119860d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return (oVar == null || (defaultViewModelProviderFactory = oVar.getDefaultViewModelProviderFactory()) == null) ? this.f119859c.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public CombinedCartOnboardingDialog() {
        C16824o a10 = C16825p.a(s.NONE, new c(new b(this)));
        this.f119851O = W.b(this, P.b(Oy.a.class), new d(a10), new e((C17631a) null, a10), new f(this, a10));
    }

    /* access modifiers changed from: private */
    public static final void A0(DialogInterface dialogInterface) {
        C17542s.h(dialogInterface, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        com.google.android.material.bottomsheet.a aVar = (com.google.android.material.bottomsheet.a) dialogInterface;
        aVar.o().W0(true);
        aVar.o().X0(3);
        aVar.r(true);
        aVar.setOnShowListener((DialogInterface.OnShowListener) null);
    }

    /* access modifiers changed from: private */
    public final Oy.a z0() {
        return (Oy.a) this.f119851O.getValue();
    }

    public void onCancel(DialogInterface dialogInterface) {
        C17542s.j(dialogInterface, "dialog");
        super.onCancel(dialogInterface);
        z0().D();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C17542s.j(layoutInflater, "inflater");
        Context requireContext = requireContext();
        C17542s.i(requireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(requireContext, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        composeView.setViewCompositionStrategy(s1.d.f19581b);
        composeView.setContent(c1.c.c(2114704163, true, new a(this)));
        return composeView;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C17542s.j(view, "view");
        super.onViewCreated(view, bundle);
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setOnShowListener(new l());
        }
        z0().E();
    }
}
