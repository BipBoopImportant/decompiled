package com.google.android.gms.measurement.internal;

import K9.C6620s;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;
import sa.C8755h;

/* renamed from: com.google.android.gms.measurement.internal.w4  reason: case insensitive filesystem */
final class C7713w4 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ AtomicReference f50460a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ E5 f50461b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ Bundle f50462c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ C7685s4 f50463d;

    C7713w4(C7685s4 s4Var, AtomicReference atomicReference, E5 e52, Bundle bundle) {
        this.f50460a = atomicReference;
        this.f50461b = e52;
        this.f50462c = bundle;
        this.f50463d = s4Var;
    }

    public final void run() {
        synchronized (this.f50460a) {
            try {
                C8755h A10 = this.f50463d.f50393d;
                if (A10 == null) {
                    this.f50463d.f().E().a("Failed to get trigger URIs; not connected to service");
                    this.f50460a.notify();
                    return;
                }
                C6620s.l(this.f50461b);
                this.f50460a.set(A10.r0(this.f50461b, this.f50462c));
                this.f50463d.o0();
                this.f50460a.notify();
            } catch (RemoteException e10) {
                try {
                    this.f50463d.f().E().b("Failed to get trigger URIs; remote exception", e10);
                    this.f50460a.notify();
                } catch (Throwable th2) {
                    this.f50460a.notify();
                    throw th2;
                }
            }
        }
    }
}
