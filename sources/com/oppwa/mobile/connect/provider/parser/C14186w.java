package com.oppwa.mobile.connect.provider.parser;

import com.oppwa.mobile.connect.payment.Cart;
import java.util.List;
import java.util.function.Consumer;

/* renamed from: com.oppwa.mobile.connect.provider.parser.w  reason: case insensitive filesystem */
public final /* synthetic */ class C14186w implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CheckoutDataResponseParser f122102a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Cart.Builder f122103b;

    public /* synthetic */ C14186w(CheckoutDataResponseParser checkoutDataResponseParser, Cart.Builder builder) {
        this.f122102a = checkoutDataResponseParser;
        this.f122103b = builder;
    }

    public final void accept(Object obj) {
        this.f122102a.a(this.f122103b, (List) obj);
    }
}
