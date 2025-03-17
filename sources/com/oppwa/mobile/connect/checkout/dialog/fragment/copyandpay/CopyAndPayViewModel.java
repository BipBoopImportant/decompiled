package com.oppwa.mobile.connect.checkout.dialog.fragment.copyandpay;

import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.K;
import androidx.lifecycle.f0;

public class CopyAndPayViewModel extends f0 {

    /* renamed from: a  reason: collision with root package name */
    private final K<Bundle> f121204a;

    /* renamed from: b  reason: collision with root package name */
    private final d f121205b;

    public CopyAndPayViewModel(Context context, Bundle bundle) {
        K<Bundle> k10 = new K<>();
        this.f121204a = k10;
        this.f121205b = new d(context, bundle, k10);
    }

    public K<Bundle> getResultLiveData() {
        return this.f121204a;
    }

    public d getWebViewLiveData() {
        return this.f121205b;
    }

    public void setResult(Bundle bundle) {
        this.f121204a.postValue(bundle);
    }
}
