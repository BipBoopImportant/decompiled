package com.oppwa.mobile.connect.utils;

import java.util.Map;
import java.util.function.Function;

public final /* synthetic */ class l implements Function {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Map f122234a;

    public /* synthetic */ l(Map map) {
        this.f122234a = map;
    }

    public final Object apply(Object obj) {
        return ParcelUtils.c(this.f122234a, (Map) obj);
    }
}
