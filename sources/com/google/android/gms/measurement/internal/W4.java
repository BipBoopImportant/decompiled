package com.google.android.gms.measurement.internal;

import android.content.ComponentName;

final class W4 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ S4 f49985a;

    W4(S4 s42) {
        this.f49985a = s42;
    }

    public final void run() {
        C7685s4.K(this.f49985a.f49954c, new ComponentName(this.f49985a.f49954c.zza(), "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
