package com.oppwa.mobile.connect.utils;

import java.util.Map;
import java.util.function.Function;

public final /* synthetic */ class i implements Function {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Map f122233a;

    public /* synthetic */ i(Map map) {
        this.f122233a = map;
    }

    public final Object apply(Object obj) {
        return ParcelUtils.b(this.f122233a, (Map) obj);
    }
}
