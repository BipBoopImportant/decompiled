package com.google.android.gms.measurement.internal;

import java.util.concurrent.Executor;

final class D3 implements Executor {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C7691t3 f49574a;

    D3(C7691t3 t3Var) {
        this.f49574a = t3Var;
    }

    public final void execute(Runnable runnable) {
        this.f49574a.q().B(runnable);
    }
}
