package com.oppwa.mobile.connect.checkout.uicomponent.card;

import com.oppwa.mobile.connect.checkout.uicomponent.PaymentDetailsUiComponentInteraction;

public interface CardUiComponentInteraction extends PaymentDetailsUiComponentInteraction {
    String getCardBrand();

    boolean isCardScanningAvailable();

    void scanCard();

    void setCardBrand(String str);

    void setNumberOfInstallments(int i10);

    void setTokenizationEnabled(boolean z10);
}
