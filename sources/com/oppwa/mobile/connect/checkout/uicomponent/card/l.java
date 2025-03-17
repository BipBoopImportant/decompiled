package com.oppwa.mobile.connect.checkout.uicomponent.card;

import com.oppwa.mobile.connect.exception.PaymentError;
import com.oppwa.mobile.connect.provider.listener.BinInfoListener;
import com.oppwa.mobile.connect.provider.model.BinInfo;

public final /* synthetic */ class l implements BinInfoListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CardUiViewModel f121528a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f121529b;

    public /* synthetic */ l(CardUiViewModel cardUiViewModel, String str) {
        this.f121528a = cardUiViewModel;
        this.f121529b = str;
    }

    public final void onResult(BinInfo binInfo, PaymentError paymentError) {
        this.f121528a.a(this.f121529b, binInfo, paymentError);
    }
}
