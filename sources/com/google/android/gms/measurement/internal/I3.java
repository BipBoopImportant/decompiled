package com.google.android.gms.measurement.internal;

import android.os.Bundle;

final class I3 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f49660a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f49661b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ long f49662c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ Bundle f49663d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ boolean f49664e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ boolean f49665f;

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ boolean f49666g;

    /* renamed from: h  reason: collision with root package name */
    private final /* synthetic */ String f49667h;

    /* renamed from: i  reason: collision with root package name */
    private final /* synthetic */ C7691t3 f49668i;

    I3(C7691t3 t3Var, String str, String str2, long j10, Bundle bundle, boolean z10, boolean z11, boolean z12, String str3) {
        this.f49660a = str;
        this.f49661b = str2;
        this.f49662c = j10;
        this.f49663d = bundle;
        this.f49664e = z10;
        this.f49665f = z11;
        this.f49666g = z12;
        this.f49667h = str3;
        this.f49668i = t3Var;
    }

    public final void run() {
        this.f49668i.g0(this.f49660a, this.f49661b, this.f49662c, this.f49663d, this.f49664e, this.f49665f, this.f49666g, this.f49667h);
    }
}
