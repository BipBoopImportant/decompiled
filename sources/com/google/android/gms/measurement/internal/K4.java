package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.V0;
import sa.C8755h;

final class K4 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ J f49804a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f49805b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ V0 f49806c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ C7685s4 f49807d;

    K4(C7685s4 s4Var, J j10, String str, V0 v02) {
        this.f49804a = j10;
        this.f49805b = str;
        this.f49806c = v02;
        this.f49807d = s4Var;
    }

    public final void run() {
        byte[] bArr = null;
        try {
            C8755h A10 = this.f49807d.f50393d;
            if (A10 == null) {
                this.f49807d.f().E().a("Discarding data. Failed to send event to service to bundle");
                return;
            }
            bArr = A10.J2(this.f49804a, this.f49805b);
            this.f49807d.o0();
            this.f49807d.h().T(this.f49806c, bArr);
        } catch (RemoteException e10) {
            this.f49807d.f().E().b("Failed to send event to the service to bundle", e10);
        } finally {
            this.f49807d.h().T(this.f49806c, bArr);
        }
    }
}
