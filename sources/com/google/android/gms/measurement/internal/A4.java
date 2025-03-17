package com.google.android.gms.measurement.internal;

import K9.C6620s;
import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;
import sa.C8755h;

final class A4 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ AtomicReference f49522a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ E5 f49523b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ C7685s4 f49524c;

    A4(C7685s4 s4Var, AtomicReference atomicReference, E5 e52) {
        this.f49522a = atomicReference;
        this.f49523b = e52;
        this.f49524c = s4Var;
    }

    public final void run() {
        synchronized (this.f49522a) {
            try {
                if (!this.f49524c.e().K().x()) {
                    this.f49524c.f().K().a("Analytics storage consent denied; will not get app instance id");
                    this.f49524c.o().V0((String) null);
                    this.f49524c.e().f50364i.b((String) null);
                    this.f49522a.set((Object) null);
                    this.f49522a.notify();
                    return;
                }
                C8755h A10 = this.f49524c.f50393d;
                if (A10 == null) {
                    this.f49524c.f().E().a("Failed to get app instance id");
                    this.f49522a.notify();
                    return;
                }
                C6620s.l(this.f49523b);
                this.f49522a.set(A10.u2(this.f49523b));
                String str = (String) this.f49522a.get();
                if (str != null) {
                    this.f49524c.o().V0(str);
                    this.f49524c.e().f50364i.b(str);
                }
                this.f49524c.o0();
                this.f49522a.notify();
            } catch (RemoteException e10) {
                try {
                    this.f49524c.f().E().b("Failed to get app instance id", e10);
                    this.f49522a.notify();
                } catch (Throwable th2) {
                    this.f49522a.notify();
                    throw th2;
                }
            }
        }
    }
}
