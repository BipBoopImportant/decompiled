package com.oppwa.mobile.connect.checkout.dialog.fragment;

import android.view.View;
import com.oppwa.mobile.connect.checkout.uicomponent.PaymentDetailsUiComponentInteraction;

public final /* synthetic */ class f implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ PaymentDetailsFragment f121228a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ PaymentDetailsUiComponentInteraction f121229b;

    public /* synthetic */ f(PaymentDetailsFragment paymentDetailsFragment, PaymentDetailsUiComponentInteraction paymentDetailsUiComponentInteraction) {
        this.f121228a = paymentDetailsFragment;
        this.f121229b = paymentDetailsUiComponentInteraction;
    }

    public final void onClick(View view) {
        this.f121228a.b(this.f121229b, view);
    }
}
