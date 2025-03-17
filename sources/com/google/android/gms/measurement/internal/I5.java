package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;

final class I5 implements S5 {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ C7728y5 f49671a;

    I5(C7728y5 y5Var) {
        this.f49671a = y5Var;
    }

    public final void a(String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            this.f49671a.q().B(new H5(this, str, str2, bundle));
        } else if (this.f49671a.f50513l != null) {
            this.f49671a.f50513l.f().E().b("AppId not known when logging event", str2);
        }
    }
}
