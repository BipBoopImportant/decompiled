package com.google.android.gms.measurement.internal;

import K9.C6620s;
import android.os.RemoteException;
import sa.C8755h;

final class J4 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ E5 f49687a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C7685s4 f49688b;

    J4(C7685s4 s4Var, E5 e52) {
        this.f49687a = e52;
        this.f49688b = s4Var;
    }

    public final void run() {
        C8755h A10 = this.f49688b.f50393d;
        if (A10 == null) {
            this.f49688b.f().E().a("Failed to send measurementEnabled to service");
            return;
        }
        try {
            C6620s.l(this.f49687a);
            A10.Q2(this.f49687a);
            this.f49688b.o0();
        } catch (RemoteException e10) {
            this.f49688b.f().E().b("Failed to send measurementEnabled to the service", e10);
        }
    }
}
