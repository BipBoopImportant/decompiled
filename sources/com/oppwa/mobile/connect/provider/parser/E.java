package com.oppwa.mobile.connect.provider.parser;

import com.oppwa.mobile.connect.provider.model.response.CheckoutInfoResponse;
import java.util.function.Function;

public final /* synthetic */ class E implements Function {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CheckoutInfoResponseParser f122048a;

    public /* synthetic */ E(CheckoutInfoResponseParser checkoutInfoResponseParser) {
        this.f122048a = checkoutInfoResponseParser;
    }

    public final Object apply(Object obj) {
        return this.f122048a.a((CheckoutInfoResponse.Config.Registration) obj);
    }
}
