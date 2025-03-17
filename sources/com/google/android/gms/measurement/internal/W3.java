package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

final class W3 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ AtomicReference f49983a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C7691t3 f49984b;

    W3(C7691t3 t3Var, AtomicReference atomicReference) {
        this.f49983a = atomicReference;
        this.f49984b = t3Var;
    }

    public final void run() {
        synchronized (this.f49983a) {
            try {
                this.f49983a.set(Double.valueOf(this.f49984b.a().l(this.f49984b.m().E(), K.f49740Z)));
                this.f49983a.notify();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
