package com.google.android.gms.measurement.internal;

import K9.C6620s;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.V0;
import java.util.ArrayList;
import sa.C8755h;

final class Q4 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f49922a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f49923b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ E5 f49924c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ V0 f49925d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ C7685s4 f49926e;

    Q4(C7685s4 s4Var, String str, String str2, E5 e52, V0 v02) {
        this.f49922a = str;
        this.f49923b = str2;
        this.f49924c = e52;
        this.f49925d = v02;
        this.f49926e = s4Var;
    }

    public final void run() {
        ArrayList<Bundle> arrayList = new ArrayList<>();
        try {
            C8755h A10 = this.f49926e.f50393d;
            if (A10 == null) {
                this.f49926e.f().E().c("Failed to get conditional properties; not connected to service", this.f49922a, this.f49923b);
                return;
            }
            C6620s.l(this.f49924c);
            arrayList = Q5.r0(A10.J(this.f49922a, this.f49923b, this.f49924c));
            this.f49926e.o0();
            this.f49926e.h().R(this.f49925d, arrayList);
        } catch (RemoteException e10) {
            this.f49926e.f().E().d("Failed to get conditional properties; remote exception", this.f49922a, this.f49923b, e10);
        } finally {
            this.f49926e.h().R(this.f49925d, arrayList);
        }
    }
}
