package com.oppwa.mobile.connect.provider.parser;

import com.oppwa.mobile.connect.provider.model.response.CheckoutInfoResponse;
import java.util.function.Predicate;

public final /* synthetic */ class H implements Predicate {
    public final boolean test(Object obj) {
        return CheckoutInfoResponseParser.a((CheckoutInfoResponse.Config.Registration[]) obj);
    }
}
