package com.oppwa.mobile.connect.checkout.uicomponent.bankaccount.sepa;

import android.widget.EditText;
import com.oppwa.mobile.connect.checkout.uicomponent.PaymentDetailsUiComponent;

public interface DirectDebitSepaUiComponent extends PaymentDetailsUiComponent<DirectDebitSepaUiComponentInteraction> {
    EditText getAccountHolderEditText();

    EditText getIbanEditText();
}
