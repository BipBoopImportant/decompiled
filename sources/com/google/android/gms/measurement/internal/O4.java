package com.google.android.gms.measurement.internal;

import K9.C6620s;
import android.os.RemoteException;
import android.text.TextUtils;
import sa.C8755h;

final class O4 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ boolean f49857a = true;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ E5 f49858b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ boolean f49859c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ C7597g f49860d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ C7597g f49861e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ C7685s4 f49862f;

    O4(C7685s4 s4Var, boolean z10, E5 e52, boolean z11, C7597g gVar, C7597g gVar2) {
        this.f49858b = e52;
        this.f49859c = z11;
        this.f49860d = gVar;
        this.f49861e = gVar2;
        this.f49862f = s4Var;
    }

    public final void run() {
        C8755h A10 = this.f49862f.f50393d;
        if (A10 == null) {
            this.f49862f.f().E().a("Discarding data. Failed to send conditional user property to service");
            return;
        }
        if (this.f49857a) {
            C6620s.l(this.f49858b);
            this.f49862f.X(A10, this.f49859c ? null : this.f49860d, this.f49858b);
        } else {
            try {
                if (TextUtils.isEmpty(this.f49861e.f50134a)) {
                    C6620s.l(this.f49858b);
                    A10.p1(this.f49860d, this.f49858b);
                } else {
                    A10.i2(this.f49860d);
                }
            } catch (RemoteException e10) {
                this.f49862f.f().E().b("Failed to send conditional user property to the service", e10);
            }
        }
        this.f49862f.o0();
    }
}
