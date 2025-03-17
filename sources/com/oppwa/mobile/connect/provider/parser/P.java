package com.oppwa.mobile.connect.provider.parser;

import com.oppwa.mobile.connect.payment.CheckoutInfo;
import com.oppwa.mobile.connect.provider.model.response.CheckoutInfoResponse;
import java.util.function.Consumer;

public final /* synthetic */ class P implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CheckoutInfoResponseParser f122057a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ CheckoutInfo.Builder f122058b;

    public /* synthetic */ P(CheckoutInfoResponseParser checkoutInfoResponseParser, CheckoutInfo.Builder builder) {
        this.f122057a = checkoutInfoResponseParser;
        this.f122058b = builder;
    }

    public final void accept(Object obj) {
        this.f122057a.a(this.f122058b, (CheckoutInfoResponse.Config) obj);
    }
}
