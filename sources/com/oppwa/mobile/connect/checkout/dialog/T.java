package com.oppwa.mobile.connect.checkout.dialog;

import com.oppwa.mobile.connect.payment.googlepay.GooglePayPaymentData;
import java.util.function.Function;

public final /* synthetic */ class T implements Function {
    public final Object apply(Object obj) {
        return ((GooglePayPaymentData.CardInfo) obj).getCardNetwork();
    }
}
