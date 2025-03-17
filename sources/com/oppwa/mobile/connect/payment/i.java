package com.oppwa.mobile.connect.payment;

import java.util.Map;
import java.util.function.Function;

public final /* synthetic */ class i implements Function {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f121875a;

    public /* synthetic */ i(String str) {
        this.f121875a = str;
    }

    public final Object apply(Object obj) {
        return BrandsValidation.b(this.f121875a, (Map) obj);
    }
}
