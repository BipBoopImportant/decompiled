package com.google.android.gms.measurement.internal;

import K9.C6620s;
import android.os.RemoteException;
import sa.C8755h;

final class E4 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ E5 f49587a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C7685s4 f49588b;

    E4(C7685s4 s4Var, E5 e52) {
        this.f49587a = e52;
        this.f49588b = s4Var;
    }

    public final void run() {
        C8755h A10 = this.f49588b.f50393d;
        if (A10 == null) {
            this.f49588b.f().J().a("Failed to send app backgrounded");
            return;
        }
        try {
            C6620s.l(this.f49587a);
            A10.J1(this.f49587a);
            this.f49588b.o0();
        } catch (RemoteException e10) {
            this.f49588b.f().E().b("Failed to send app backgrounded to the service", e10);
        }
    }
}
