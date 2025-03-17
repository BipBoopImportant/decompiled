package com.oppwa.mobile.connect.provider.parser;

import com.oppwa.mobile.connect.payment.CheckoutInfo;
import com.oppwa.mobile.connect.provider.model.response.CheckoutInfoResponse;
import java.util.function.Consumer;

public final /* synthetic */ class F implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CheckoutInfoResponseParser f122049a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ CheckoutInfo.Builder f122050b;

    public /* synthetic */ F(CheckoutInfoResponseParser checkoutInfoResponseParser, CheckoutInfo.Builder builder) {
        this.f122049a = checkoutInfoResponseParser;
        this.f122050b = builder;
    }

    public final void accept(Object obj) {
        this.f122049a.a(this.f122050b, (CheckoutInfoResponse.Config.BrandConfig) obj);
    }
}
