package com.afterpay.android.view;

import android.content.DialogInterface;

public final /* synthetic */ class f implements DialogInterface.OnCancelListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AfterpayCheckoutV2Activity f46057a;

    public /* synthetic */ f(AfterpayCheckoutV2Activity afterpayCheckoutV2Activity) {
        this.f46057a = afterpayCheckoutV2Activity;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        AfterpayCheckoutV2Activity.M(this.f46057a, dialogInterface);
    }
}
