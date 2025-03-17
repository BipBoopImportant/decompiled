package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;

final class V3 implements S5 {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C7691t3 f49974a;

    V3(C7691t3 t3Var) {
        this.f49974a = t3Var;
    }

    public final void a(String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            this.f49974a.j0("auto", str2, bundle, str);
        } else {
            this.f49974a.X0("auto", str2, bundle);
        }
    }
}
