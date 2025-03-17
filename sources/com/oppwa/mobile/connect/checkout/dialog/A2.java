package com.oppwa.mobile.connect.checkout.dialog;

import java.util.Map;
import java.util.function.Consumer;

public final /* synthetic */ class A2 implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f120798a;

    public /* synthetic */ A2(String str) {
        this.f120798a = str;
    }

    public final void accept(Object obj) {
        ((Map) obj).remove(this.f120798a);
    }
}
