package com.google.android.gms.measurement.internal;

import android.os.Bundle;

final class Q3 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Bundle f49920a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C7691t3 f49921b;

    Q3(C7691t3 t3Var, Bundle bundle) {
        this.f49920a = bundle;
        this.f49921b = t3Var;
    }

    public final void run() {
        C7691t3.T0(this.f49921b, this.f49920a);
    }
}
