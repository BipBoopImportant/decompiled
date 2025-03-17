package com.oppwa.mobile.connect.payment.blik;

import java.util.Map;
import java.util.function.Consumer;

public final /* synthetic */ class a implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Map f121843a;

    public /* synthetic */ a(Map map) {
        this.f121843a = map;
    }

    public final void accept(Object obj) {
        this.f121843a.put("virtualAccount.accountPin", (String) obj);
    }
}
