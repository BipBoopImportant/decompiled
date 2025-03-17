package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* renamed from: com.google.android.gms.measurement.internal.p4  reason: case insensitive filesystem */
final class C7665p4 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C7630k4 f50282a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C7630k4 f50283b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ long f50284c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ boolean f50285d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ C7644m4 f50286e;

    C7665p4(C7644m4 m4Var, C7630k4 k4Var, C7630k4 k4Var2, long j10, boolean z10) {
        this.f50282a = k4Var;
        this.f50283b = k4Var2;
        this.f50284c = j10;
        this.f50285d = z10;
        this.f50286e = m4Var;
    }

    public final void run() {
        this.f50286e.G(this.f50282a, this.f50283b, this.f50284c, this.f50285d, (Bundle) null);
    }
}
