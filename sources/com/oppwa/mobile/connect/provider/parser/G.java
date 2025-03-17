package com.oppwa.mobile.connect.provider.parser;

import com.oppwa.mobile.connect.payment.CheckoutInfo;
import com.oppwa.mobile.connect.provider.model.response.CheckoutInfoResponse;
import java.util.function.Consumer;

public final /* synthetic */ class G implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CheckoutInfoResponseParser f122051a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ CheckoutInfo.Builder f122052b;

    public /* synthetic */ G(CheckoutInfoResponseParser checkoutInfoResponseParser, CheckoutInfo.Builder builder) {
        this.f122051a = checkoutInfoResponseParser;
        this.f122052b = builder;
    }

    public final void accept(Object obj) {
        this.f122051a.a(this.f122052b, (CheckoutInfoResponse.Config.MsdkConfig) obj);
    }
}
