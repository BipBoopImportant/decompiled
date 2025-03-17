package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

final class K3 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ AtomicReference f49802a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C7691t3 f49803b;

    K3(C7691t3 t3Var, AtomicReference atomicReference) {
        this.f49802a = atomicReference;
        this.f49803b = t3Var;
    }

    public final void run() {
        synchronized (this.f49802a) {
            try {
                this.f49802a.set(this.f49803b.a().G(this.f49803b.m().E()));
                this.f49802a.notify();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
