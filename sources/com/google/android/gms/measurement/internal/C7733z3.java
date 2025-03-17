package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.z3  reason: case insensitive filesystem */
final class C7733z3 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ AtomicReference f50543a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C7691t3 f50544b;

    C7733z3(C7691t3 t3Var, AtomicReference atomicReference) {
        this.f50543a = atomicReference;
        this.f50544b = t3Var;
    }

    public final void run() {
        synchronized (this.f50543a) {
            try {
                this.f50543a.set(Boolean.valueOf(this.f50544b.a().M(this.f50544b.m().E())));
                this.f50543a.notify();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
