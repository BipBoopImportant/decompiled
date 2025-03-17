package com.google.android.gms.measurement.internal;

import K9.C6620s;
import L9.a;
import android.os.RemoteException;
import sa.C8755h;

final class C4 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ E5 f49561a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C7685s4 f49562b;

    C4(C7685s4 s4Var, E5 e52) {
        this.f49561a = e52;
        this.f49562b = s4Var;
    }

    public final void run() {
        C8755h A10 = this.f49562b.f50393d;
        if (A10 == null) {
            this.f49562b.f().E().a("Discarding data. Failed to send app launch");
            return;
        }
        try {
            C6620s.l(this.f49561a);
            A10.T1(this.f49561a);
            this.f49562b.n().I();
            this.f49562b.X(A10, (a) null, this.f49561a);
            this.f49562b.o0();
        } catch (RemoteException e10) {
            this.f49562b.f().E().b("Failed to send app launch to the service", e10);
        }
    }
}
