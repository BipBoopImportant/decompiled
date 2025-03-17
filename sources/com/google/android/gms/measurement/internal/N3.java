package com.google.android.gms.measurement.internal;

import android.os.Bundle;

final class N3 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Bundle f49846a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C7691t3 f49847b;

    N3(C7691t3 t3Var, Bundle bundle) {
        this.f49846a = bundle;
        this.f49847b = t3Var;
    }

    public final void run() {
        C7691t3.d1(this.f49847b, this.f49846a);
    }
}
