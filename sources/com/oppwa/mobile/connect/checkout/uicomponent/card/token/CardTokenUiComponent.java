package com.oppwa.mobile.connect.checkout.uicomponent.card.token;

import android.widget.EditText;
import com.oppwa.mobile.connect.checkout.uicomponent.PaymentDetailsUiComponent;

public interface CardTokenUiComponent extends PaymentDetailsUiComponent<CardTokenUiComponentInteraction> {
    EditText getCardSecurityCodeEditText();
}
