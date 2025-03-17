package com.oppwa.mobile.connect.payment.processor.affirm;

import com.oppwa.mobile.connect.payment.ShippingAddress;
import java.util.function.Function;

public final /* synthetic */ class H implements Function {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C14128a f121902a;

    public /* synthetic */ H(C14128a aVar) {
        this.f121902a = aVar;
    }

    public final Object apply(Object obj) {
        return this.f121902a.a((ShippingAddress) obj);
    }
}
