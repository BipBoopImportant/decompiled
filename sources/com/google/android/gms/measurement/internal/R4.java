package com.google.android.gms.measurement.internal;

import sa.C8755h;

final class R4 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C8755h f49940a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ S4 f49941b;

    R4(S4 s42, C8755h hVar) {
        this.f49940a = hVar;
        this.f49941b = s42;
    }

    public final void run() {
        synchronized (this.f49941b) {
            try {
                this.f49941b.f49952a = false;
                if (!this.f49941b.f49954c.i0()) {
                    this.f49941b.f49954c.f().I().a("Connected to service");
                    this.f49941b.f49954c.W(this.f49940a);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
