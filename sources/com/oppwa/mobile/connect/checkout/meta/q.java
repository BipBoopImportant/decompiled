package com.oppwa.mobile.connect.checkout.meta;

import androidx.lifecycle.L;

public final /* synthetic */ class q implements L {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ DisposableLiveData f121459a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ L f121460b;

    public /* synthetic */ q(DisposableLiveData disposableLiveData, L l10) {
        this.f121459a = disposableLiveData;
        this.f121460b = l10;
    }

    public final void onChanged(Object obj) {
        this.f121459a.a(this.f121460b, obj);
    }
}
