package com.google.android.gms.measurement.internal;

import K9.C6620s;
import android.os.RemoteException;
import sa.C8755h;

final class B4 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ E5 f49539a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C7685s4 f49540b;

    B4(C7685s4 s4Var, E5 e52) {
        this.f49539a = e52;
        this.f49540b = s4Var;
    }

    public final void run() {
        C8755h A10 = this.f49540b.f50393d;
        if (A10 == null) {
            this.f49540b.f().E().a("Failed to reset data on the service: not connected to service");
            return;
        }
        try {
            C6620s.l(this.f49539a);
            A10.U1(this.f49539a);
        } catch (RemoteException e10) {
            this.f49540b.f().E().b("Failed to reset data on the service: remote exception", e10);
        }
        this.f49540b.o0();
    }
}
