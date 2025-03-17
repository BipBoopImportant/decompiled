package com.oppwa.mobile.connect.payment.processor.affirm;

import com.affirm.android.model.Billing;
import com.affirm.android.model.Name;
import java.util.function.Consumer;

public final /* synthetic */ class O implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Billing.Builder f121908a;

    public /* synthetic */ O(Billing.Builder builder) {
        this.f121908a = builder;
    }

    public final void accept(Object obj) {
        this.f121908a.setName(Name.builder().setFull((String) obj).build());
    }
}
