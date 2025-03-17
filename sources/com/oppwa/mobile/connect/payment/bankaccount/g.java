package com.oppwa.mobile.connect.payment.bankaccount;

import java.util.Map;
import java.util.function.Consumer;

public final /* synthetic */ class g implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Map f121837a;

    public /* synthetic */ g(Map map) {
        this.f121837a = map;
    }

    public final void accept(Object obj) {
        this.f121837a.put("bankAccount.holder", (String) obj);
    }
}
