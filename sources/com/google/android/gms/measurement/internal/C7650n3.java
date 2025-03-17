package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.n3  reason: case insensitive filesystem */
final class C7650n3 implements Callable<List<C7645m5>> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ E5 f50243a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Bundle f50244b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ S2 f50245c;

    C7650n3(S2 s22, E5 e52, Bundle bundle) {
        this.f50243a = e52;
        this.f50244b = bundle;
        this.f50245c = s22;
    }

    public final /* synthetic */ Object call() {
        this.f50245c.f49947a.K0();
        return this.f50245c.f49947a.o(this.f50243a, this.f50244b);
    }
}
