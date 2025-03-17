package com.oppwa.mobile.connect.provider.parser;

import com.oppwa.mobile.connect.payment.ImageDetail;
import java.util.Map;
import java.util.function.Function;

public final /* synthetic */ class Z implements Function {
    public final Object apply(Object obj) {
        return (ImageDetail) ((Map.Entry) obj).getValue();
    }
}
