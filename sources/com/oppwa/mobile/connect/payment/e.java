package com.oppwa.mobile.connect.payment;

import android.os.Bundle;
import java.util.function.Consumer;

public final /* synthetic */ class e implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Bundle f121869a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f121870b;

    public /* synthetic */ e(Bundle bundle, String str) {
        this.f121869a = bundle;
        this.f121870b = str;
    }

    public final void accept(Object obj) {
        this.f121869a.putString(this.f121870b, ((BrandInfo) obj).getLabel());
    }
}
