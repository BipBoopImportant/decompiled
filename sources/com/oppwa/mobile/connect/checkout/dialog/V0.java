package com.oppwa.mobile.connect.checkout.dialog;

import java.util.function.Consumer;

public final /* synthetic */ class V0 implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f121096a;

    public /* synthetic */ V0(String str) {
        this.f121096a = str;
    }

    public final void accept(Object obj) {
        ((BlikPaymentInfoViewModel) obj).a(this.f121096a);
    }
}
