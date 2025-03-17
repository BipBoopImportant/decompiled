package com.google.ar.core;

import com.google.ar.core.ArCoreApk;
import java.util.function.Consumer;

final /* synthetic */ class L implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ long f67690a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ long f67691b;

    /* synthetic */ L(long j10, long j11) {
        this.f67690a = j10;
        this.f67691b = j11;
    }

    public final /* synthetic */ void accept(Object obj) {
        ArCoreApkJniAdapter.nativeInvokeAvailabilityCallback(this.f67690a, this.f67691b, ((ArCoreApk.Availability) obj).nativeCode);
    }
}
