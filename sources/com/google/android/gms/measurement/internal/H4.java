package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import sa.C8755h;

final class H4 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C7630k4 f49650a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C7685s4 f49651b;

    H4(C7685s4 s4Var, C7630k4 k4Var) {
        this.f49650a = k4Var;
        this.f49651b = s4Var;
    }

    public final void run() {
        C8755h A10 = this.f49651b.f50393d;
        if (A10 == null) {
            this.f49651b.f().E().a("Failed to send current screen to service");
            return;
        }
        try {
            C7630k4 k4Var = this.f49650a;
            if (k4Var == null) {
                A10.q0(0, (String) null, (String) null, this.f49651b.zza().getPackageName());
            } else {
                A10.q0(k4Var.f50212c, k4Var.f50210a, k4Var.f50211b, this.f49651b.zza().getPackageName());
            }
            this.f49651b.o0();
        } catch (RemoteException e10) {
            this.f49651b.f().E().b("Failed to send current screen to the service", e10);
        }
    }
}
