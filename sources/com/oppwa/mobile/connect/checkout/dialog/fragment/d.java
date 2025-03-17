package com.oppwa.mobile.connect.checkout.dialog.fragment;

import android.view.View;
import com.oppwa.mobile.connect.checkout.uicomponent.PaymentDetailsUiComponentInteraction;

public final /* synthetic */ class d implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ PaymentDetailsUiComponentInteraction f121225a;

    public /* synthetic */ d(PaymentDetailsUiComponentInteraction paymentDetailsUiComponentInteraction) {
        this.f121225a = paymentDetailsUiComponentInteraction;
    }

    public final void onClick(View view) {
        this.f121225a.closeCheckout();
    }
}
