package com.oppwa.mobile.connect.provider.parser.transaction;

import java.util.Map;
import java.util.function.Consumer;

public final /* synthetic */ class B implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Map f122079a;

    public /* synthetic */ B(Map map) {
        this.f122079a = map;
    }

    public final void accept(Object obj) {
        this.f122079a.put("failureCallbackUrl", (String) obj);
    }
}
