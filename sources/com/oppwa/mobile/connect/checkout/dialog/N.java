package com.oppwa.mobile.connect.checkout.dialog;

import androidx.lifecycle.L;
import com.oppwa.mobile.connect.checkout.meta.PaymentDetails;

public final /* synthetic */ class N implements L {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BaseActivity f121030a;

    public /* synthetic */ N(BaseActivity baseActivity) {
        this.f121030a = baseActivity;
    }

    public final void onChanged(Object obj) {
        this.f121030a.a((PaymentDetails) obj);
    }
}
