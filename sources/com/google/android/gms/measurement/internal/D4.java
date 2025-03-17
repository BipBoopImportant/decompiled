package com.google.android.gms.measurement.internal;

import K9.C6620s;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.V0;
import sa.C8755h;

final class D4 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ E5 f49575a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ V0 f49576b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ C7685s4 f49577c;

    D4(C7685s4 s4Var, E5 e52, V0 v02) {
        this.f49575a = e52;
        this.f49576b = v02;
        this.f49577c = s4Var;
    }

    public final void run() {
        try {
            if (!this.f49577c.e().K().x()) {
                this.f49577c.f().K().a("Analytics storage consent denied; will not get app instance id");
                this.f49577c.o().V0((String) null);
                this.f49577c.e().f50364i.b((String) null);
                return;
            }
            C8755h A10 = this.f49577c.f50393d;
            if (A10 == null) {
                this.f49577c.f().E().a("Failed to get app instance id");
                this.f49577c.h().Q(this.f49576b, (String) null);
                return;
            }
            C6620s.l(this.f49575a);
            String u22 = A10.u2(this.f49575a);
            if (u22 != null) {
                this.f49577c.o().V0(u22);
                this.f49577c.e().f50364i.b(u22);
            }
            this.f49577c.o0();
            this.f49577c.h().Q(this.f49576b, u22);
        } catch (RemoteException e10) {
            this.f49577c.f().E().b("Failed to get app instance id", e10);
        } finally {
            this.f49577c.h().Q(this.f49576b, (String) null);
        }
    }
}
