package com.oppwa.mobile.connect.checkout.dialog;

import com.oppwa.mobile.connect.payment.CheckoutInfo;
import java.util.function.Function;

public final /* synthetic */ class A1 implements Function {
    public final Object apply(Object obj) {
        return Boolean.valueOf(((CheckoutInfo) obj).isCollectRedShieldDeviceId());
    }
}
