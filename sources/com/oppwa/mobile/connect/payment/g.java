package com.oppwa.mobile.connect.payment;

import java.util.Map;
import java.util.function.Function;

public final /* synthetic */ class g implements Function {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f121871a;

    public /* synthetic */ g(String str) {
        this.f121871a = str;
    }

    public final Object apply(Object obj) {
        return BrandsValidation.a(this.f121871a, (Map) obj);
    }
}
