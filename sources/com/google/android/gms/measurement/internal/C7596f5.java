package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.V0;

/* renamed from: com.google.android.gms.measurement.internal.f5  reason: case insensitive filesystem */
final class C7596f5 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ V0 f50132a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ AppMeasurementDynamiteService f50133b;

    C7596f5(AppMeasurementDynamiteService appMeasurementDynamiteService, V0 v02) {
        this.f50132a = v02;
        this.f50133b = appMeasurementDynamiteService;
    }

    public final void run() {
        this.f50133b.f49527a.M().S(this.f50132a, this.f50133b.f49527a.n());
    }
}
