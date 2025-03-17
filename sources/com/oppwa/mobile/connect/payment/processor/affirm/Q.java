package com.oppwa.mobile.connect.payment.processor.affirm;

import com.oppwa.mobile.connect.payment.BillingAddress;
import com.oppwa.mobile.connect.payment.CheckoutData;
import java.util.function.Function;

public final /* synthetic */ class Q implements Function {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C14128a f121910a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ CheckoutData f121911b;

    public /* synthetic */ Q(C14128a aVar, CheckoutData checkoutData) {
        this.f121910a = aVar;
        this.f121911b = checkoutData;
    }

    public final Object apply(Object obj) {
        return this.f121910a.a(this.f121911b, (BillingAddress) obj);
    }
}
