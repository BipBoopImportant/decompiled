package com.oppwa.mobile.connect.checkout.uicomponent.util.validator;

import android.content.Context;
import com.oppwa.mobile.connect.R;
import com.oppwa.mobile.connect.checkout.uicomponent.util.validator.InputValidator;
import com.oppwa.mobile.connect.payment.card.CardPaymentParams;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CardNumberValidator extends InputValidator {

    /* renamed from: d  reason: collision with root package name */
    private final boolean f121550d;

    /* renamed from: e  reason: collision with root package name */
    private final Matcher f121551e;

    public CardNumberValidator(Context context, InputValidator.Watcher watcher, String str, boolean z10) {
        super(context, watcher);
        this.f121550d = z10;
        this.f121551e = Pattern.compile(str).matcher("");
    }

    /* access modifiers changed from: protected */
    public String checkForValidationError(String str) {
        if (str == null || str.isEmpty() || !CardPaymentParams.isNumberValid(str, this.f121550d) || !this.f121551e.reset(str).matches()) {
            return this.f121554a.getString(R.string.checkout_error_card_number_invalid);
        }
        return null;
    }
}
