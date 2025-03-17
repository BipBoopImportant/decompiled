package com.oppwa.mobile.connect.payment;

import java.util.Map;
import java.util.function.Function;

public final /* synthetic */ class j implements Function {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Map f121880a;

    public /* synthetic */ j(Map map) {
        this.f121880a = map;
    }

    public final Object apply(Object obj) {
        return (BrandInfo) this.f121880a.get((String) obj);
    }
}
