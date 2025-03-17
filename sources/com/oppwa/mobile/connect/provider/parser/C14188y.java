package com.oppwa.mobile.connect.provider.parser;

import com.oppwa.mobile.connect.payment.CheckoutData;
import com.oppwa.mobile.connect.provider.model.response.CheckoutDataResponse;
import java.util.function.Consumer;

/* renamed from: com.oppwa.mobile.connect.provider.parser.y  reason: case insensitive filesystem */
public final /* synthetic */ class C14188y implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CheckoutDataResponseParser f122106a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ CheckoutData.Builder f122107b;

    public /* synthetic */ C14188y(CheckoutDataResponseParser checkoutDataResponseParser, CheckoutData.Builder builder) {
        this.f122106a = checkoutDataResponseParser;
        this.f122107b = builder;
    }

    public final void accept(Object obj) {
        this.f122106a.a(this.f122107b, (CheckoutDataResponse.ShippingAddress) obj);
    }
}
