package com.oppwa.mobile.connect.checkout.dialog;

import com.oppwa.mobile.connect.payment.BillingAddress;
import com.oppwa.mobile.connect.payment.googlepay.GooglePayPaymentData;
import java.util.function.Function;

/* renamed from: com.oppwa.mobile.connect.checkout.dialog.x1  reason: case insensitive filesystem */
public final /* synthetic */ class C14121x1 implements Function {
    public final Object apply(Object obj) {
        return new BillingAddress.Builder().setStreet1(((GooglePayPaymentData.Address) obj).getAddress1()).setStreet2(CheckoutHelper.a((GooglePayPaymentData.Address) obj)).setCity(((GooglePayPaymentData.Address) obj).getLocality()).setState(((GooglePayPaymentData.Address) obj).getAdministrativeArea()).setPostCode(((GooglePayPaymentData.Address) obj).getPostalCode()).setCountry(((GooglePayPaymentData.Address) obj).getCountryCode()).build();
    }
}
