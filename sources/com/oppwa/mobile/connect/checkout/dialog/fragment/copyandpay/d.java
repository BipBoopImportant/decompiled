package com.oppwa.mobile.connect.checkout.dialog.fragment.copyandpay;

import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import androidx.lifecycle.F;
import androidx.lifecycle.K;

class d extends F<c> {

    /* renamed from: a  reason: collision with root package name */
    private final c f121221a;

    public d(Context context, Bundle bundle, K<Bundle> k10) {
        c cVar = new c(context, bundle, k10);
        this.f121221a = cVar;
        cVar.b();
    }

    /* access modifiers changed from: protected */
    public void onActive() {
        super.onActive();
        postValue(this.f121221a);
    }

    /* access modifiers changed from: protected */
    public void onInactive() {
        super.onInactive();
        if (this.f121221a.getParent() instanceof ViewGroup) {
            ((ViewGroup) this.f121221a.getParent()).removeView(this.f121221a);
        }
    }
}
