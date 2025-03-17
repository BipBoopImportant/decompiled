package com.oppwa.mobile.connect.payment.bankaccount;

import java.util.Map;
import java.util.function.Consumer;

public final /* synthetic */ class j implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Map f121840a;

    public /* synthetic */ j(Map map) {
        this.f121840a = map;
    }

    public final void accept(Object obj) {
        this.f121840a.put("customParameters[ACI_INSTANTPAY.COUNTRY]", (String) obj);
    }
}
