package com.oppwa.mobile.connect.checkout.dialog.fragment.paymentmethodselection;

import com.oppwa.mobile.connect.checkout.uicomponent.paymentmethodselection.PaymentMethodSelectionUiComponentInteraction;
import java.util.function.Consumer;

public final /* synthetic */ class i implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ PaymentMethodSelectionFragment f121233a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ PaymentMethodSelectionUiComponentInteraction f121234b;

    public /* synthetic */ i(PaymentMethodSelectionFragment paymentMethodSelectionFragment, PaymentMethodSelectionUiComponentInteraction paymentMethodSelectionUiComponentInteraction) {
        this.f121233a = paymentMethodSelectionFragment;
        this.f121234b = paymentMethodSelectionUiComponentInteraction;
    }

    public final void accept(Object obj) {
        this.f121233a.a(this.f121234b, (String) obj);
    }
}
