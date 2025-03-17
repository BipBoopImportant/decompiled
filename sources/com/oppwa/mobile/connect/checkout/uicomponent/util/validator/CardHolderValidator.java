package com.oppwa.mobile.connect.checkout.uicomponent.util.validator;

import android.content.Context;
import com.oppwa.mobile.connect.R;
import com.oppwa.mobile.connect.checkout.uicomponent.util.validator.InputValidator;

public class CardHolderValidator extends InputValidator {
    public static final int CARD_HOLDER_MIN_LENGTH = 3;

    public CardHolderValidator(Context context, InputValidator.Watcher watcher) {
        super(context, watcher);
    }

    public String checkForValidationError(String str) {
        if (str == null || str.isEmpty() || str.length() < 3) {
            return this.f121554a.getString(R.string.checkout_error_card_holder_invalid);
        }
        return null;
    }
}
