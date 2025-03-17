package com.oppwa.mobile.connect.payment.processor.affirm;

import com.oppwa.mobile.connect.payment.ShippingAddress;
import java.util.function.Function;

public final /* synthetic */ class M implements Function {
    public final Object apply(Object obj) {
        return ((ShippingAddress) obj).getCustomer();
    }
}
