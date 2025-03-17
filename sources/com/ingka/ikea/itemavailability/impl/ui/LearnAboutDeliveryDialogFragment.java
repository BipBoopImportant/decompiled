package com.ingka.ikea.itemavailability.impl.ui;

import U0.C4889m;
import U0.C4895p;
import XH.C16807N;
import Xu.b;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.s1;
import c1.c;
import com.ingka.ikea.core.android.fragments.BaseDialogFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lg.f;
import nI.C17631a;
import nI.p;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J\u0019\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/ingka/ikea/itemavailability/impl/ui/LearnAboutDeliveryDialogFragment;", "Lcom/ingka/ikea/core/android/fragments/BaseDialogFragment;", "<init>", "()V", "LXH/N;", "onStart", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroidx/compose/ui/platform/ComposeView;", "u0", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;", "itemavailability-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LearnAboutDeliveryDialogFragment extends BaseDialogFragment {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LearnAboutDeliveryDialogFragment f96388a;

        a(LearnAboutDeliveryDialogFragment learnAboutDeliveryDialogFragment) {
            this.f96388a = learnAboutDeliveryDialogFragment;
        }

        /* access modifiers changed from: private */
        public static final C16807N c(LearnAboutDeliveryDialogFragment learnAboutDeliveryDialogFragment) {
            learnAboutDeliveryDialogFragment.dismiss();
            return C16807N.f139792a;
        }

        public final void b(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-1129099183, i10, -1, "com.ingka.ikea.itemavailability.impl.ui.LearnAboutDeliveryDialogFragment.onCreateView.<anonymous>.<anonymous> (LearnAboutDeliveryDialogFragment.kt:39)");
                }
                mVar.W(-581571035);
                boolean V10 = mVar.V(this.f96388a);
                LearnAboutDeliveryDialogFragment learnAboutDeliveryDialogFragment = this.f96388a;
                Object D10 = mVar.D();
                if (V10 || D10 == C4889m.f14007a.a()) {
                    D10 = new a(learnAboutDeliveryDialogFragment);
                    mVar.u(D10);
                }
                mVar.P();
                b.b((C17631a) D10, mVar, 0);
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

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, f.f75301m);
    }

    public void onStart() {
        Window window;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setLayout(-1, -1);
        }
    }

    /* renamed from: u0 */
    public ComposeView onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C17542s.j(layoutInflater, "inflater");
        Context requireContext = requireContext();
        C17542s.i(requireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(requireContext, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        composeView.setViewCompositionStrategy(s1.d.f19581b);
        composeView.setContent(c.c(-1129099183, true, new a(this)));
        return composeView;
    }
}
