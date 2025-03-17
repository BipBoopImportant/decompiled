package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* renamed from: com.google.android.gms.measurement.internal.l4  reason: case insensitive filesystem */
final class C7637l4 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Bundle f50222a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C7630k4 f50223b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ C7630k4 f50224c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ long f50225d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ C7644m4 f50226e;

    C7637l4(C7644m4 m4Var, Bundle bundle, C7630k4 k4Var, C7630k4 k4Var2, long j10) {
        this.f50222a = bundle;
        this.f50223b = k4Var;
        this.f50224c = k4Var2;
        this.f50225d = j10;
        this.f50226e = m4Var;
    }

    public final void run() {
        C7644m4.I(this.f50226e, this.f50222a, this.f50223b, this.f50224c, this.f50225d);
    }
}
