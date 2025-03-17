package com.oppwa.mobile.connect.checkout.uicomponent.util.validator;

import android.content.Context;
import com.oppwa.mobile.connect.R;
import com.oppwa.mobile.connect.checkout.uicomponent.util.validator.InputValidator;

public class PhoneNumberValidator extends InputValidator {
    public PhoneNumberValidator(Context context, InputValidator.Watcher watcher) {
        super(context, watcher);
    }

    /* access modifiers changed from: protected */
    public String checkForValidationError(String str) {
        if (str == null || str.isEmpty() || str.length() < 5) {
            return this.f121554a.getString(R.string.checkout_error_mobile_phone_number_invalid);
        }
        return null;
    }
}
