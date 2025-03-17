package com.oppwa.mobile.connect.provider.parser;

import com.oppwa.mobile.connect.payment.CheckoutData;
import com.oppwa.mobile.connect.provider.model.response.CheckoutDataResponse;
import java.util.function.Consumer;

/* renamed from: com.oppwa.mobile.connect.provider.parser.z  reason: case insensitive filesystem */
public final /* synthetic */ class C14189z implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CheckoutDataResponseParser f122108a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ CheckoutData.Builder f122109b;

    public /* synthetic */ C14189z(CheckoutDataResponseParser checkoutDataResponseParser, CheckoutData.Builder builder) {
        this.f122108a = checkoutDataResponseParser;
        this.f122109b = builder;
    }

    public final void accept(Object obj) {
        this.f122108a.a(this.f122109b, (CheckoutDataResponse.Cart) obj);
    }
}
