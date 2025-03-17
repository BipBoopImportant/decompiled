package com.oppwa.mobile.connect.checkout.uicomponent;

import com.oppwa.mobile.connect.payment.CheckoutInfo;

public interface PaymentDetailsUiComponentInteraction extends UiComponentInteraction {
    void closeCheckout();

    CheckoutInfo getCheckoutInfo();

    boolean isRegistrationOnly();

    boolean shouldSkipPaymentMethodSelection();

    void submitPaymentDetails();
}
