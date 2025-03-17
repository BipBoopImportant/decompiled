package com.google.android.gms.measurement.internal;

import K9.C6620s;
import android.os.Bundle;
import android.os.RemoteException;
import sa.C8755h;

final class G4 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ E5 f49642a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Bundle f49643b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ C7685s4 f49644c;

    G4(C7685s4 s4Var, E5 e52, Bundle bundle) {
        this.f49642a = e52;
        this.f49643b = bundle;
        this.f49644c = s4Var;
    }

    public final void run() {
        C8755h A10 = this.f49644c.f50393d;
        if (A10 == null) {
            this.f49644c.f().E().a("Failed to send default event parameters to service");
            return;
        }
        try {
            C6620s.l(this.f49642a);
            A10.H1(this.f49643b, this.f49642a);
        } catch (RemoteException e10) {
            this.f49644c.f().E().b("Failed to send default event parameters to service", e10);
        }
    }
}
