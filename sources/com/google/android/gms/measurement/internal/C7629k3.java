package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.k3  reason: case insensitive filesystem */
final class C7629k3 implements Callable<List<C7645m5>> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ E5 f50207a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Bundle f50208b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ S2 f50209c;

    C7629k3(S2 s22, E5 e52, Bundle bundle) {
        this.f50207a = e52;
        this.f50208b = bundle;
        this.f50209c = s22;
    }

    public final /* synthetic */ Object call() {
        this.f50209c.f49947a.K0();
        return this.f50209c.f49947a.o(this.f50207a, this.f50208b);
    }
}
