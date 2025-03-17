package com.oppwa.mobile.connect.checkout.dialog;

import com.oppwa.mobile.connect.payment.googlepay.GooglePayPaymentData;
import java.util.function.Function;

/* renamed from: com.oppwa.mobile.connect.checkout.dialog.r1  reason: case insensitive filesystem */
public final /* synthetic */ class C14103r1 implements Function {
    public final Object apply(Object obj) {
        return ((GooglePayPaymentData.PaymentMethodData) obj).getTokenizationData();
    }
}
