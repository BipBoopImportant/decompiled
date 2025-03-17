package com.oppwa.mobile.connect.payment.processor.affirm;

import com.affirm.android.model.Checkout;
import java.util.Map;
import java.util.function.Consumer;

public final /* synthetic */ class I implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Checkout.Builder f121903a;

    public /* synthetic */ I(Checkout.Builder builder) {
        this.f121903a = builder;
    }

    public final void accept(Object obj) {
        Checkout.Builder unused = this.f121903a.setDiscounts((Map) obj);
    }
}
