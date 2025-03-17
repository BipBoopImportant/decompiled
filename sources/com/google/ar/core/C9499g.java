package com.google.ar.core;

import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.ar.core.g  reason: case insensitive filesystem */
final class C9499g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ AtomicBoolean f67759a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ C9500h f67760b;

    C9499g(C9500h hVar, AtomicBoolean atomicBoolean) {
        this.f67759a = atomicBoolean;
        this.f67760b = hVar;
    }

    public final void run() {
        if (!this.f67759a.getAndSet(true)) {
            Log.w("ARCore-InstallService", "requestInstall timed out, launching fullscreen.");
            C9500h hVar = this.f67760b;
            hVar.f67763c.i(hVar.f67761a, hVar.f67762b);
        }
    }
}
