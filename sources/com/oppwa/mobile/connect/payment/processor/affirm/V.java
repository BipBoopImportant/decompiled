package com.oppwa.mobile.connect.payment.processor.affirm;

import com.affirm.android.model.Name;
import com.affirm.android.model.Shipping;
import java.util.function.Consumer;

public final /* synthetic */ class V implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Shipping.Builder f121915a;

    public /* synthetic */ V(Shipping.Builder builder) {
        this.f121915a = builder;
    }

    public final void accept(Object obj) {
        this.f121915a.setName(Name.builder().setFull((String) obj).build());
    }
}
