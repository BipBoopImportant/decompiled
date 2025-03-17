package com.oppwa.mobile.connect.checkout.uicomponent.util.validator;

import android.content.Context;
import com.oppwa.mobile.connect.R;
import com.oppwa.mobile.connect.checkout.uicomponent.util.validator.InputValidator;

public class PhoneCountryCodeValidator extends InputValidator {
    public PhoneCountryCodeValidator(Context context, InputValidator.Watcher watcher) {
        super(context, watcher);
    }

    /* access modifiers changed from: protected */
    public String checkForValidationError(String str) {
        if (str == null || str.isEmpty()) {
            return this.f121554a.getString(R.string.checkout_layout_hint_country_code);
        }
        return null;
    }
}
