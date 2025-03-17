package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.Callable;

final class V2 implements Callable<List<R5>> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f49972a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ S2 f49973b;

    V2(S2 s22, String str) {
        this.f49972a = str;
        this.f49973b = s22;
    }

    public final /* synthetic */ Object call() {
        this.f49973b.f49947a.K0();
        return this.f49973b.f49947a.u0().f1(this.f49972a);
    }
}
