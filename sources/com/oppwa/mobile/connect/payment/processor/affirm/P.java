package com.oppwa.mobile.connect.payment.processor.affirm;

import com.affirm.android.model.Checkout;
import com.affirm.android.model.Shipping;
import java.util.function.Consumer;

public final /* synthetic */ class P implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Checkout.Builder f121909a;

    public /* synthetic */ P(Checkout.Builder builder) {
        this.f121909a = builder;
    }

    public final void accept(Object obj) {
        Checkout.Builder unused = this.f121909a.setShipping((Shipping) obj);
    }
}
