package com.google.ar.core;

import com.google.ar.core.ArCoreApk;

final /* synthetic */ class I implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ H f67673a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ ArCoreApk.Availability f67674b;

    /* synthetic */ I(H h10, ArCoreApk.Availability availability) {
        this.f67673a = h10;
        this.f67674b = availability;
    }

    public final /* synthetic */ void run() {
        this.f67673a.f67670a.accept(this.f67674b);
    }
}
