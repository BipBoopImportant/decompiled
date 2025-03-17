package com.oppwa.mobile.connect.provider.parser;

import com.oppwa.mobile.connect.payment.CheckoutData;
import com.oppwa.mobile.connect.provider.model.response.CheckoutDataResponse;
import java.util.function.Consumer;

/* renamed from: com.oppwa.mobile.connect.provider.parser.x  reason: case insensitive filesystem */
public final /* synthetic */ class C14187x implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CheckoutDataResponseParser f122104a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ CheckoutData.Builder f122105b;

    public /* synthetic */ C14187x(CheckoutDataResponseParser checkoutDataResponseParser, CheckoutData.Builder builder) {
        this.f122104a = checkoutDataResponseParser;
        this.f122105b = builder;
    }

    public final void accept(Object obj) {
        this.f122104a.a(this.f122105b, (CheckoutDataResponse.BillingAddress) obj);
    }
}
