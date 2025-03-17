package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.F5;
import java.util.concurrent.Callable;

public final /* synthetic */ class D2 implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private /* synthetic */ C2 f49572a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ String f49573b;

    public /* synthetic */ D2(C2 c22, String str) {
        this.f49572a = c22;
        this.f49573b = str;
    }

    public final Object call() {
        return new F5("internal.remoteConfig", new I2(this.f49572a, this.f49573b));
    }
}
