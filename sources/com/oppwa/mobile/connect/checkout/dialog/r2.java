package com.oppwa.mobile.connect.checkout.dialog;

import com.oppwa.mobile.connect.exception.PaymentError;
import com.oppwa.mobile.connect.provider.listener.BinInfoListener;
import com.oppwa.mobile.connect.provider.model.BinInfo;

public final /* synthetic */ class r2 implements BinInfoListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C14060d f121312a;

    public /* synthetic */ r2(C14060d dVar) {
        this.f121312a = dVar;
    }

    public final void onResult(BinInfo binInfo, PaymentError paymentError) {
        this.f121312a.a(binInfo, paymentError);
    }
}
