package com.oppwa.mobile.connect.checkout.uicomponent.util.validator;

import android.content.Context;
import com.oppwa.mobile.connect.R;
import com.oppwa.mobile.connect.checkout.uicomponent.util.validator.InputValidator;
import com.oppwa.mobile.connect.payment.card.CardPaymentParams;
import java.util.Calendar;

public class CardExpiryDateValidator extends InputValidator {

    /* renamed from: d  reason: collision with root package name */
    private final boolean f121548d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f121549e;

    public CardExpiryDateValidator(Context context, InputValidator.Watcher watcher, boolean z10, boolean z11) {
        super(context, watcher);
        this.f121548d = z10;
        this.f121549e = z11;
    }

    public static String extractMonth(String str) {
        if (str == null) {
            return null;
        }
        if (str.length() == 2) {
            return str;
        }
        if (str.length() >= 2) {
            return str.substring(0, 2);
        }
        return null;
    }

    public static String extractYear(String str) {
        if (str == null) {
            return null;
        }
        if (str.length() == 4) {
            return String.valueOf(Calendar.getInstance().get(1)).substring(0, 2) + str.substring(2);
        } else if (str.length() == 6) {
            return str.substring(2);
        } else {
            return null;
        }
    }

    public String checkForValidationError(String str) {
        if (this.f121548d && (str == null || str.isEmpty())) {
            return null;
        }
        String extractMonth = extractMonth(str);
        String extractYear = extractYear(str);
        if (!CardPaymentParams.isExpiryMonthValid(extractMonth) || !CardPaymentParams.isExpiryYearValid(extractYear)) {
            return this.f121554a.getString(R.string.checkout_error_expiration_date_invalid);
        }
        if (this.f121549e || !CardPaymentParams.isCardExpired(extractMonth, extractYear)) {
            return null;
        }
        return this.f121554a.getString(R.string.checkout_error_expiration_date);
    }
}
