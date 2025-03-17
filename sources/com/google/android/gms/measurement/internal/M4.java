package com.google.android.gms.measurement.internal;

import K9.C6620s;
import android.os.RemoteException;
import sa.C8755h;

final class M4 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ E5 f49834a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C7685s4 f49835b;

    M4(C7685s4 s4Var, E5 e52) {
        this.f49834a = e52;
        this.f49835b = s4Var;
    }

    public final void run() {
        C8755h A10 = this.f49835b.f50393d;
        if (A10 == null) {
            this.f49835b.f().E().a("Failed to send consent settings to service");
            return;
        }
        try {
            C6620s.l(this.f49834a);
            A10.h3(this.f49834a);
            this.f49835b.o0();
        } catch (RemoteException e10) {
            this.f49835b.f().E().b("Failed to send consent settings to the service", e10);
        }
    }
}
