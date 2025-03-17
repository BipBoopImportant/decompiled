package com.oppwa.mobile.connect.checkout.uicomponent.util.validator;

import android.content.Context;
import com.oppwa.mobile.connect.R;
import com.oppwa.mobile.connect.checkout.uicomponent.util.validator.InputValidator;
import java.util.regex.Pattern;

public class AccountHolderValidator extends InputValidator {

    /* renamed from: d  reason: collision with root package name */
    private final Pattern f121546d = Pattern.compile(".{3,128}");

    public AccountHolderValidator(Context context, InputValidator.Watcher watcher) {
        super(context, watcher);
    }

    /* access modifiers changed from: protected */
    public String checkForValidationError(String str) {
        if (str == null || str.isEmpty() || !this.f121546d.matcher(str).matches()) {
            return this.f121554a.getString(R.string.checkout_error_account_holder_invalid);
        }
        return null;
    }
}
