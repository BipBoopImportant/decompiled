package com.oppwa.mobile.connect.checkout.uicomponent.aciinstantpay;

import android.widget.EditText;
import com.oppwa.mobile.connect.checkout.uicomponent.PaymentDetailsUiComponent;

public interface AciInstantPayUiComponent extends PaymentDetailsUiComponent<AciInstantPayUiComponentInteraction> {
    EditText getAccountHolderEditText();

    EditText getAccountNumberEditText();

    EditText getRoutingNumberEditText();
}
