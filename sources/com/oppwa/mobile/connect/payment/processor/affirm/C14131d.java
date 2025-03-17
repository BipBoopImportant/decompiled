package com.oppwa.mobile.connect.payment.processor.affirm;

import androidx.lifecycle.L;
import com.affirm.android.model.Checkout;

/* renamed from: com.oppwa.mobile.connect.payment.processor.affirm.d  reason: case insensitive filesystem */
public final /* synthetic */ class C14131d implements L {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AffirmProcessorActivity f121917a;

    public /* synthetic */ C14131d(AffirmProcessorActivity affirmProcessorActivity) {
        this.f121917a = affirmProcessorActivity;
    }

    public final void onChanged(Object obj) {
        this.f121917a.a((Checkout) obj);
    }
}
