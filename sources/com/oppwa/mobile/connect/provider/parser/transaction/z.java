package com.oppwa.mobile.connect.provider.parser.transaction;

import java.util.Map;
import java.util.function.Consumer;

public final /* synthetic */ class z implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Map f122099a;

    public /* synthetic */ z(Map map) {
        this.f122099a = map;
    }

    public final void accept(Object obj) {
        this.f122099a.put("clientToken", (String) obj);
    }
}
