package com.oppwa.mobile.connect.provider.parser.transaction;

import java.util.Map;
import java.util.function.Consumer;

public final /* synthetic */ class A implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Map f122078a;

    public /* synthetic */ A(Map map) {
        this.f122078a = map;
    }

    public final void accept(Object obj) {
        this.f122078a.put("callbackUrl", (String) obj);
    }
}
