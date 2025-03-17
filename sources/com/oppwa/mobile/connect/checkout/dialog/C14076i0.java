package com.oppwa.mobile.connect.checkout.dialog;

import android.os.Bundle;
import com.oppwa.mobile.connect.payment.PaymentParams;
import java.util.function.Consumer;

/* renamed from: com.oppwa.mobile.connect.checkout.dialog.i0  reason: case insensitive filesystem */
public final /* synthetic */ class C14076i0 implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BaseActivity f121254a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Bundle f121255b;

    public /* synthetic */ C14076i0(BaseActivity baseActivity, Bundle bundle) {
        this.f121254a = baseActivity;
        this.f121255b = bundle;
    }

    public final void accept(Object obj) {
        this.f121254a.a(this.f121255b, (PaymentParams) obj);
    }
}
