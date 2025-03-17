package com.oppwa.mobile.connect.checkout.dialog;

import com.oppwa.mobile.connect.exception.PaymentError;
import java.util.function.Consumer;

public final /* synthetic */ class H implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BaseActivity f120952a;

    public /* synthetic */ H(BaseActivity baseActivity) {
        this.f120952a = baseActivity;
    }

    public final void accept(Object obj) {
        this.f120952a.a((PaymentError) obj);
    }
}
