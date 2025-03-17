package com.oppwa.mobile.connect.payment.processor.affirm;

import com.oppwa.mobile.connect.payment.CartItem;
import java.util.function.Function;

public final /* synthetic */ class X implements Function {
    public final Object apply(Object obj) {
        return ((CartItem) obj).getTotalDiscountAmount();
    }
}
