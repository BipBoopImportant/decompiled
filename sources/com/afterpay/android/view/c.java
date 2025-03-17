package com.afterpay.android.view;

import android.content.DialogInterface;

public final /* synthetic */ class c implements DialogInterface.OnCancelListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AfterpayCheckoutActivity f46055a;

    public /* synthetic */ c(AfterpayCheckoutActivity afterpayCheckoutActivity) {
        this.f46055a = afterpayCheckoutActivity;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        AfterpayCheckoutActivity.t0(this.f46055a, dialogInterface);
    }
}
