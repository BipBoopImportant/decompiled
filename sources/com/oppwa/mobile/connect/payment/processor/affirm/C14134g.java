package com.oppwa.mobile.connect.payment.processor.affirm;

import com.oppwa.mobile.connect.exception.PaymentError;
import com.oppwa.mobile.connect.payment.CheckoutData;
import com.oppwa.mobile.connect.provider.listener.ResponseListener;

/* renamed from: com.oppwa.mobile.connect.payment.processor.affirm.g  reason: case insensitive filesystem */
public final /* synthetic */ class C14134g implements ResponseListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AffirmViewModel f121920a;

    public /* synthetic */ C14134g(AffirmViewModel affirmViewModel) {
        this.f121920a = affirmViewModel;
    }

    public final void onResult(Object obj, PaymentError paymentError) {
        this.f121920a.a((CheckoutData) obj, paymentError);
    }
}
