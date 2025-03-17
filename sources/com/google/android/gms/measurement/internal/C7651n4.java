package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.V0;

/* renamed from: com.google.android.gms.measurement.internal.n4  reason: case insensitive filesystem */
final class C7651n4 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ V0 f50246a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f50247b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f50248c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ AppMeasurementDynamiteService f50249d;

    C7651n4(AppMeasurementDynamiteService appMeasurementDynamiteService, V0 v02, String str, String str2) {
        this.f50246a = v02;
        this.f50247b = str;
        this.f50248c = str2;
        this.f50249d = appMeasurementDynamiteService;
    }

    public final void run() {
        this.f50249d.f49527a.K().E(this.f50246a, this.f50247b, this.f50248c);
    }
}
