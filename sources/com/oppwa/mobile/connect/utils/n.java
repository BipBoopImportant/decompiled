package com.oppwa.mobile.connect.utils;

import java.util.Map;
import java.util.function.Function;

public final /* synthetic */ class n implements Function {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Map f122237a;

    public /* synthetic */ n(Map map) {
        this.f122237a = map;
    }

    public final Object apply(Object obj) {
        return ParcelUtils.a(this.f122237a, (Map) obj);
    }
}
