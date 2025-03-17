package com.oppwa.mobile.connect.payment.processor.affirm;

import com.affirm.android.model.Shipping;
import com.oppwa.mobile.connect.payment.Customer;
import java.util.function.Consumer;

public final /* synthetic */ class J implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C14128a f121904a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Shipping.Builder f121905b;

    public /* synthetic */ J(C14128a aVar, Shipping.Builder builder) {
        this.f121904a = aVar;
        this.f121905b = builder;
    }

    public final void accept(Object obj) {
        this.f121904a.a(this.f121905b, (Customer) obj);
    }
}
