package com.oppwa.mobile.connect.payment.processor.affirm;

import com.affirm.android.model.Checkout;
import java.util.List;
import java.util.function.Consumer;

public final /* synthetic */ class U implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C14128a f121913a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Checkout.Builder f121914b;

    public /* synthetic */ U(C14128a aVar, Checkout.Builder builder) {
        this.f121913a = aVar;
        this.f121914b = builder;
    }

    public final void accept(Object obj) {
        this.f121913a.a(this.f121914b, (List) obj);
    }
}
