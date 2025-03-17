package com.oppwa.mobile.connect.payment.processor.affirm;

import com.affirm.android.model.Billing;
import com.affirm.android.model.Checkout;
import java.util.function.Consumer;

public final /* synthetic */ class S implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Checkout.Builder f121912a;

    public /* synthetic */ S(Checkout.Builder builder) {
        this.f121912a = builder;
    }

    public final void accept(Object obj) {
        Checkout.Builder unused = this.f121912a.setBilling((Billing) obj);
    }
}
