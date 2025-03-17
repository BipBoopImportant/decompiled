package com.oppwa.mobile.connect.checkout.uicomponent.paymentmethodselection;

import com.oppwa.mobile.connect.checkout.meta.PaymentMethod;
import com.oppwa.mobile.connect.checkout.uicomponent.UiComponentInteraction;
import com.oppwa.mobile.connect.payment.CheckoutInfo;

public interface PaymentMethodSelectionUiComponentInteraction extends UiComponentInteraction {
    void closeCheckout();

    CheckoutInfo getCheckoutInfo();

    PaymentMethod[] getPaymentMethods();

    void onPaymentMethodSelected(PaymentMethod paymentMethod);
}
