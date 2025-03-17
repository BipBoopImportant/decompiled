package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

final class I4 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ AppMeasurementDynamiteService.a f49669a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ AppMeasurementDynamiteService f49670b;

    I4(AppMeasurementDynamiteService appMeasurementDynamiteService, AppMeasurementDynamiteService.a aVar) {
        this.f49669a = aVar;
        this.f49670b = appMeasurementDynamiteService;
    }

    public final void run() {
        this.f49670b.f49527a.G().o0(this.f49669a);
    }
}
