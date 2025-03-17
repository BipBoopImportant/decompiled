package com.oppwa.mobile.connect.provider.parser;

import com.oppwa.mobile.connect.payment.ShippingAddress;
import com.oppwa.mobile.connect.provider.model.response.CheckoutDataResponse;
import java.util.function.Consumer;

public final /* synthetic */ class B implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CheckoutDataResponseParser f122046a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ShippingAddress.Builder f122047b;

    public /* synthetic */ B(CheckoutDataResponseParser checkoutDataResponseParser, ShippingAddress.Builder builder) {
        this.f122046a = checkoutDataResponseParser;
        this.f122047b = builder;
    }

    public final void accept(Object obj) {
        this.f122046a.a(this.f122047b, (CheckoutDataResponse.Customer) obj);
    }
}
