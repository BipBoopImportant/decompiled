package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

final class U3 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ AtomicReference f49967a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C7691t3 f49968b;

    U3(C7691t3 t3Var, AtomicReference atomicReference) {
        this.f49967a = atomicReference;
        this.f49968b = t3Var;
    }

    public final void run() {
        synchronized (this.f49967a) {
            try {
                this.f49967a.set(Long.valueOf(this.f49968b.a().A(this.f49968b.m().E(), K.f49736X)));
                this.f49967a.notify();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
