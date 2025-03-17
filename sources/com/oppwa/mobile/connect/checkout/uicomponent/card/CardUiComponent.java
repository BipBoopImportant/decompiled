package com.oppwa.mobile.connect.checkout.uicomponent.card;

import android.widget.EditText;
import com.oppwa.mobile.connect.checkout.uicomponent.PaymentDetailsUiComponent;
import java.util.Set;

public interface CardUiComponent extends PaymentDetailsUiComponent<CardUiComponentInteraction> {
    EditText getCardExpiryDateEditText();

    EditText getCardHolderEditText();

    EditText getCardNumberEditText();

    EditText getCardSecurityCodeEditText();

    EditText getPhoneCountryCodeEditText() {
        return null;
    }

    EditText getPhoneNumberEditText() {
        return null;
    }

    void onCardBrandChange(String str);

    void onCardBrandDetection(Set<String> set);
}
