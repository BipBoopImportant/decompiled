package com.oppwa.mobile.connect.provider.parser;

import com.oppwa.mobile.connect.payment.CheckoutInfo;
import com.oppwa.mobile.connect.provider.model.response.CheckoutInfoResponse;
import java.util.function.Consumer;

public final /* synthetic */ class I implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CheckoutInfoResponseParser f122053a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ CheckoutInfo.Builder f122054b;

    public /* synthetic */ I(CheckoutInfoResponseParser checkoutInfoResponseParser, CheckoutInfo.Builder builder) {
        this.f122053a = checkoutInfoResponseParser;
        this.f122054b = builder;
    }

    public final void accept(Object obj) {
        this.f122053a.a(this.f122054b, (CheckoutInfoResponse.Config.Registration[]) obj);
    }
}
