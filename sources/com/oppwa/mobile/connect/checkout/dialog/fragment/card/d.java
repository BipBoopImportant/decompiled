package com.oppwa.mobile.connect.checkout.dialog.fragment.card;

import android.view.View;
import com.oppwa.mobile.connect.payment.BillingAddress;

public final /* synthetic */ class d implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CardPaymentDetailsFragment f121191a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ BillingAddress f121192b;

    public /* synthetic */ d(CardPaymentDetailsFragment cardPaymentDetailsFragment, BillingAddress billingAddress) {
        this.f121191a = cardPaymentDetailsFragment;
        this.f121192b = billingAddress;
    }

    public final void onClick(View view) {
        this.f121191a.a(this.f121192b, view);
    }
}
