package com.google.android.gms.measurement.internal;

import K9.C6620s;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.V0;
import sa.C8755h;

/* renamed from: com.google.android.gms.measurement.internal.v4  reason: case insensitive filesystem */
final class C7706v4 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f50448a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f50449b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ E5 f50450c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ boolean f50451d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ V0 f50452e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ C7685s4 f50453f;

    C7706v4(C7685s4 s4Var, String str, String str2, E5 e52, boolean z10, V0 v02) {
        this.f50448a = str;
        this.f50449b = str2;
        this.f50450c = e52;
        this.f50451d = z10;
        this.f50452e = v02;
        this.f50453f = s4Var;
    }

    public final void run() {
        Bundle bundle = new Bundle();
        try {
            C8755h A10 = this.f50453f.f50393d;
            if (A10 == null) {
                this.f50453f.f().E().c("Failed to get user properties; not connected to service", this.f50448a, this.f50449b);
                return;
            }
            C6620s.l(this.f50450c);
            bundle = Q5.E(A10.n3(this.f50448a, this.f50449b, this.f50451d, this.f50450c));
            this.f50453f.o0();
            this.f50453f.h().P(this.f50452e, bundle);
        } catch (RemoteException e10) {
            this.f50453f.f().E().c("Failed to get user properties; remote exception", this.f50448a, e10);
        } finally {
            this.f50453f.h().P(this.f50452e, bundle);
        }
    }
}
