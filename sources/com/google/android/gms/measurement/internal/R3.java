package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.V0;

final class R3 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ V0 f49936a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ J f49937b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f49938c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ AppMeasurementDynamiteService f49939d;

    R3(AppMeasurementDynamiteService appMeasurementDynamiteService, V0 v02, J j10, String str) {
        this.f49936a = v02;
        this.f49937b = j10;
        this.f49938c = str;
        this.f49939d = appMeasurementDynamiteService;
    }

    public final void run() {
        this.f49939d.f49527a.K().D(this.f49936a, this.f49937b, this.f49938c);
    }
}
