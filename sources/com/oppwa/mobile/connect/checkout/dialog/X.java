package com.oppwa.mobile.connect.checkout.dialog;

import android.os.Bundle;
import java.util.function.Consumer;

public final /* synthetic */ class X implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BaseActivity f121105a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Bundle f121106b;

    public /* synthetic */ X(BaseActivity baseActivity, Bundle bundle) {
        this.f121105a = baseActivity;
        this.f121106b = bundle;
    }

    public final void accept(Object obj) {
        this.f121105a.a(this.f121106b, (String) obj);
    }
}
