package com.oppwa.mobile.connect.checkout.uicomponent.card.token;

import com.oppwa.mobile.connect.checkout.uicomponent.PaymentDetailsUiComponentInteraction;
import com.oppwa.mobile.connect.payment.token.Card;

public interface CardTokenUiComponentInteraction extends PaymentDetailsUiComponentInteraction {
    String getBrand();

    Card getCard();

    Integer[] getInstallmentOptions();

    void setNumberOfInstallments(int i10);
}
