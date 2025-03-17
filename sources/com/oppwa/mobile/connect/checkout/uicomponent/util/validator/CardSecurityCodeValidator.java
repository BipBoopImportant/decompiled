package com.oppwa.mobile.connect.checkout.uicomponent.util.validator;

import android.content.Context;
import com.oppwa.mobile.connect.R;
import com.oppwa.mobile.connect.checkout.uicomponent.util.validator.InputValidator;

public class CardSecurityCodeValidator extends InputValidator {

    /* renamed from: d  reason: collision with root package name */
    private final int f121552d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f121553e;

    public CardSecurityCodeValidator(Context context, InputValidator.Watcher watcher, int i10, boolean z10) {
        super(context, watcher);
        this.f121552d = i10;
        this.f121553e = z10;
    }

    public String checkForValidationError(String str) {
        if (this.f121553e && (str == null || str.isEmpty())) {
            return null;
        }
        if (str == null || str.isEmpty() || str.length() != this.f121552d) {
            return this.f121552d == 4 ? this.f121554a.getString(R.string.checkout_error_security_code_invalid_amex) : this.f121554a.getString(R.string.checkout_error_security_code_invalid);
        }
        return null;
    }
}
