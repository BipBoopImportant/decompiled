package com.oppwa.mobile.connect.checkout.uicomponent.util.validator;

import android.content.Context;
import com.oppwa.mobile.connect.R;
import com.oppwa.mobile.connect.checkout.uicomponent.util.validator.InputValidator;
import com.oppwa.mobile.connect.payment.bankaccount.BankAccountPaymentParams;

public class IbanValidator extends InputValidator {
    public IbanValidator(Context context, InputValidator.Watcher watcher) {
        super(context, watcher);
    }

    /* access modifiers changed from: protected */
    public String checkForValidationError(String str) {
        if (!BankAccountPaymentParams.isIbanValid(str)) {
            return this.f121554a.getString(R.string.checkout_error_iban_invalid);
        }
        return null;
    }
}
