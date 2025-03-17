package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.V0;

final class M2 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ V0 f49831a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ AppMeasurementDynamiteService f49832b;

    M2(AppMeasurementDynamiteService appMeasurementDynamiteService, V0 v02) {
        this.f49831a = v02;
        this.f49832b = appMeasurementDynamiteService;
    }

    public final void run() {
        this.f49832b.f49527a.K().C(this.f49831a);
    }
}
