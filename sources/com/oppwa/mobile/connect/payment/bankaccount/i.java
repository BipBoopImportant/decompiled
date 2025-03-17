package com.oppwa.mobile.connect.payment.bankaccount;

import java.util.Map;
import java.util.function.Consumer;

public final /* synthetic */ class i implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Map f121839a;

    public /* synthetic */ i(Map map) {
        this.f121839a = map;
    }

    public final void accept(Object obj) {
        this.f121839a.put("bankAccount.routingNumber", (String) obj);
    }
}
