package com.oppwa.mobile.connect.checkout.uicomponent.util.view;

import android.widget.EditText;

public class CardSecurityCodeEditTextWrapper extends EditTextWrapper {
    public CardSecurityCodeEditTextWrapper(EditText editText) {
        super(editText, 18);
        setMaxLength(4);
    }
}
