package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.V0;

/* renamed from: com.google.android.gms.measurement.internal.x3  reason: case insensitive filesystem */
final class C7719x3 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ V0 f50470a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f50471b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f50472c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ boolean f50473d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ AppMeasurementDynamiteService f50474e;

    C7719x3(AppMeasurementDynamiteService appMeasurementDynamiteService, V0 v02, String str, String str2, boolean z10) {
        this.f50470a = v02;
        this.f50471b = str;
        this.f50472c = str2;
        this.f50473d = z10;
        this.f50474e = appMeasurementDynamiteService;
    }

    public final void run() {
        this.f50474e.f49527a.K().F(this.f50470a, this.f50471b, this.f50472c, this.f50473d);
    }
}
