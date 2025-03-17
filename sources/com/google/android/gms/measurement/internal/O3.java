package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

final class O3 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ long f49855a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C7691t3 f49856b;

    O3(C7691t3 t3Var, long j10) {
        this.f49855a = j10;
        this.f49856b = t3Var;
    }

    public final void run() {
        this.f49856b.P0(this.f49855a);
        this.f49856b.s().R(new AtomicReference());
    }
}
