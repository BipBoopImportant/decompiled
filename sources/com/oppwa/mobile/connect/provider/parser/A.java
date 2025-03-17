package com.oppwa.mobile.connect.provider.parser;

import com.oppwa.mobile.connect.payment.CheckoutData;
import com.oppwa.mobile.connect.provider.model.response.CheckoutDataResponse;
import java.util.function.Consumer;

public final /* synthetic */ class A implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CheckoutDataResponseParser f122042a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ CheckoutData.Builder f122043b;

    public /* synthetic */ A(CheckoutDataResponseParser checkoutDataResponseParser, CheckoutData.Builder builder) {
        this.f122042a = checkoutDataResponseParser;
        this.f122043b = builder;
    }

    public final void accept(Object obj) {
        this.f122042a.a(this.f122043b, (CheckoutDataResponse.Merchant) obj);
    }
}
