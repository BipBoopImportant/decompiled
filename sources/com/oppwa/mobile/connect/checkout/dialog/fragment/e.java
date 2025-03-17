package com.oppwa.mobile.connect.checkout.dialog.fragment;

import com.oppwa.mobile.connect.checkout.uicomponent.PaymentDetailsUiComponentInteraction;
import java.util.function.Function;

public final /* synthetic */ class e implements Function {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ PaymentDetailsFragment f121226a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ PaymentDetailsUiComponentInteraction f121227b;

    public /* synthetic */ e(PaymentDetailsFragment paymentDetailsFragment, PaymentDetailsUiComponentInteraction paymentDetailsUiComponentInteraction) {
        this.f121226a = paymentDetailsFragment;
        this.f121227b = paymentDetailsUiComponentInteraction;
    }

    public final Object apply(Object obj) {
        return this.f121226a.a(this.f121227b, (String) obj);
    }
}
