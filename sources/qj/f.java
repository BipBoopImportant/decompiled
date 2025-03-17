package qj;

import android.content.DialogInterface;
import android.view.KeyEvent;
import com.ingka.ikea.app.scanandgoonlineredesign.dialog.checkoutconfirmation.CheckoutConfirmationDialog;

public final /* synthetic */ class f implements DialogInterface.OnKeyListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CheckoutConfirmationDialog f101408a;

    public /* synthetic */ f(CheckoutConfirmationDialog checkoutConfirmationDialog) {
        this.f101408a = checkoutConfirmationDialog;
    }

    public final boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
        return CheckoutConfirmationDialog.T0(this.f101408a, dialogInterface, i10, keyEvent);
    }
}
