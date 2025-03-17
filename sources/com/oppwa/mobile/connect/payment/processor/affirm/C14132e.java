package com.oppwa.mobile.connect.payment.processor.affirm;

import androidx.lifecycle.L;
import com.oppwa.mobile.connect.exception.PaymentError;

/* renamed from: com.oppwa.mobile.connect.payment.processor.affirm.e  reason: case insensitive filesystem */
public final /* synthetic */ class C14132e implements L {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AffirmProcessorActivity f121918a;

    public /* synthetic */ C14132e(AffirmProcessorActivity affirmProcessorActivity) {
        this.f121918a = affirmProcessorActivity;
    }

    public final void onChanged(Object obj) {
        this.f121918a.a((PaymentError) obj);
    }
}
