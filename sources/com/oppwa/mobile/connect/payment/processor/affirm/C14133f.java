package com.oppwa.mobile.connect.payment.processor.affirm;

import androidx.lifecycle.L;
import com.oppwa.mobile.connect.provider.Transaction;

/* renamed from: com.oppwa.mobile.connect.payment.processor.affirm.f  reason: case insensitive filesystem */
public final /* synthetic */ class C14133f implements L {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AffirmProcessorActivity f121919a;

    public /* synthetic */ C14133f(AffirmProcessorActivity affirmProcessorActivity) {
        this.f121919a = affirmProcessorActivity;
    }

    public final void onChanged(Object obj) {
        this.f121919a.a((Transaction) obj);
    }
}
