package com.google.android.gms.measurement.internal;

import sa.C8755h;

final class T4 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C8755h f49963a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ S4 f49964b;

    T4(S4 s42, C8755h hVar) {
        this.f49963a = hVar;
        this.f49964b = s42;
    }

    public final void run() {
        synchronized (this.f49964b) {
            try {
                this.f49964b.f49952a = false;
                if (!this.f49964b.f49954c.i0()) {
                    this.f49964b.f49954c.f().D().a("Connected to remote service");
                    this.f49964b.f49954c.W(this.f49963a);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
