package com.oppwa.mobile.connect.payment;

import com.oppwa.mobile.connect.payment.BrandsValidation;
import java.util.function.BinaryOperator;

public final /* synthetic */ class n implements BinaryOperator {
    public final Object apply(Object obj, Object obj2) {
        return BrandsValidation.Filter.a((BrandInfo) obj, (BrandInfo) obj2);
    }
}
