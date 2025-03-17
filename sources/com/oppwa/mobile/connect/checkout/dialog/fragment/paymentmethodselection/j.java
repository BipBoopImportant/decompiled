package com.oppwa.mobile.connect.checkout.dialog.fragment.paymentmethodselection;

import android.view.View;
import com.oppwa.mobile.connect.checkout.uicomponent.paymentmethodselection.PaymentMethodSelectionUiComponentInteraction;

public final /* synthetic */ class j implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ PaymentMethodSelectionUiComponentInteraction f121235a;

    public /* synthetic */ j(PaymentMethodSelectionUiComponentInteraction paymentMethodSelectionUiComponentInteraction) {
        this.f121235a = paymentMethodSelectionUiComponentInteraction;
    }

    public final void onClick(View view) {
        this.f121235a.closeCheckout();
    }
}
