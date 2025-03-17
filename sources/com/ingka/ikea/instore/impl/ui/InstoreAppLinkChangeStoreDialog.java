package com.ingka.ikea.instore.impl.ui;

import It.C10744g;
import U0.C4889m;
import U0.C4895p;
import XH.C16807N;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import com.ingka.ikea.core.android.fragments.BaseComposeDialogFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import mu.C11595a;
import nI.C17631a;
import ut.J;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0015¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/ingka/ikea/instore/impl/ui/InstoreAppLinkChangeStoreDialog;", "Lcom/ingka/ikea/core/android/fragments/BaseComposeDialogFragment;", "<init>", "()V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "LXH/N;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "u0", "(LU0/m;I)V", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class InstoreAppLinkChangeStoreDialog extends BaseComposeDialogFragment {
    /* access modifiers changed from: private */
    public static final C16807N z0(InstoreAppLinkChangeStoreDialog instoreAppLinkChangeStoreDialog) {
        instoreAppLinkChangeStoreDialog.dismiss();
        return C16807N.f139792a;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C17542s.j(view, "view");
        super.onViewCreated(view, bundle);
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setCancelable(false);
        }
        Dialog dialog2 = getDialog();
        if (dialog2 != null) {
            dialog2.setCanceledOnTouchOutside(false);
        }
    }

    /* access modifiers changed from: protected */
    public void u0(C4889m mVar, int i10) {
        mVar.W(1783584724);
        if (C4895p.J()) {
            C4895p.S(1783584724, i10, -1, "com.ingka.ikea.instore.impl.ui.InstoreAppLinkChangeStoreDialog.DialogContent (InstoreAppLinkChangeStoreDialog.kt:19)");
        }
        mVar.W(-1451644865);
        boolean z10 = (((i10 & 14) ^ 6) > 4 && mVar.V(this)) || (i10 & 6) == 4;
        Object D10 = mVar.D();
        if (z10 || D10 == C4889m.f14007a.a()) {
            D10 = new C11595a(this);
            mVar.u(D10);
        }
        mVar.P();
        J.c((C10744g) null, (C17631a) D10, mVar, 0, 1);
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
    }
}
