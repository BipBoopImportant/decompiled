package com.oppwa.mobile.connect.checkout.dialog;

import androidx.lifecycle.L;
import com.oppwa.mobile.connect.exception.PaymentError;

public final /* synthetic */ class I0 implements L {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BaseServiceActivity f120953a;

    public /* synthetic */ I0(BaseServiceActivity baseServiceActivity) {
        this.f120953a = baseServiceActivity;
    }

    public final void onChanged(Object obj) {
        this.f120953a.b((PaymentError) obj);
    }
}
