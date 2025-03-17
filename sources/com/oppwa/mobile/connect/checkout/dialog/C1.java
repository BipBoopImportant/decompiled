package com.oppwa.mobile.connect.checkout.dialog;

import com.oppwa.mobile.connect.checkout.meta.OnBeforeSubmitCallback;
import com.oppwa.mobile.connect.checkout.meta.PaymentDetails;

public final /* synthetic */ class C1 implements OnBeforeSubmitCallback.Listener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CheckoutViewModel f120866a;

    public /* synthetic */ C1(CheckoutViewModel checkoutViewModel) {
        this.f120866a = checkoutViewModel;
    }

    public final void onComplete(PaymentDetails paymentDetails) {
        this.f120866a.a(paymentDetails);
    }
}
