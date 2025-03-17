package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

final class X3 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ AtomicReference f49989a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C7691t3 f49990b;

    X3(C7691t3 t3Var, AtomicReference atomicReference) {
        this.f49989a = atomicReference;
        this.f49990b = t3Var;
    }

    public final void run() {
        synchronized (this.f49989a) {
            try {
                this.f49989a.set(Integer.valueOf(this.f49990b.a().w(this.f49990b.m().E(), K.f49738Y)));
                this.f49989a.notify();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
