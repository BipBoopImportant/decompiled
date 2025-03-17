package com.oppwa.mobile.connect.checkout.uicomponent;

import com.oppwa.mobile.connect.payment.token.Token;
import java.util.function.Function;

public final /* synthetic */ class e implements Function {
    public final Object apply(Object obj) {
        return ((Token) obj).getPaymentBrand();
    }
}
