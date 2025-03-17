package com.oppwa.mobile.connect.payment.bankaccount;

import java.util.Map;
import java.util.function.Consumer;

public final /* synthetic */ class h implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Map f121838a;

    public /* synthetic */ h(Map map) {
        this.f121838a = map;
    }

    public final void accept(Object obj) {
        this.f121838a.put("bankAccount.number", (String) obj);
    }
}
