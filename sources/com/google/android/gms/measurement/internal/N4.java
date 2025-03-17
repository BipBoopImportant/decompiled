package com.google.android.gms.measurement.internal;

import K9.C6620s;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;
import sa.C8755h;

final class N4 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ AtomicReference f49848a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f49849b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f49850c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ String f49851d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ E5 f49852e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ C7685s4 f49853f;

    N4(C7685s4 s4Var, AtomicReference atomicReference, String str, String str2, String str3, E5 e52) {
        this.f49848a = atomicReference;
        this.f49849b = str;
        this.f49850c = str2;
        this.f49851d = str3;
        this.f49852e = e52;
        this.f49853f = s4Var;
    }

    public final void run() {
        synchronized (this.f49848a) {
            try {
                C8755h A10 = this.f49853f.f50393d;
                if (A10 == null) {
                    this.f49853f.f().E().d("(legacy) Failed to get conditional properties; not connected to service", C7607h2.t(this.f49849b), this.f49850c, this.f49851d);
                    this.f49848a.set(Collections.emptyList());
                    this.f49848a.notify();
                    return;
                }
                if (TextUtils.isEmpty(this.f49849b)) {
                    C6620s.l(this.f49852e);
                    this.f49848a.set(A10.J(this.f49850c, this.f49851d, this.f49852e));
                } else {
                    this.f49848a.set(A10.t0(this.f49849b, this.f49850c, this.f49851d));
                }
                this.f49853f.o0();
                this.f49848a.notify();
            } catch (RemoteException e10) {
                try {
                    this.f49853f.f().E().d("(legacy) Failed to get conditional properties; remote exception", C7607h2.t(this.f49849b), this.f49850c, e10);
                    this.f49848a.set(Collections.emptyList());
                    this.f49848a.notify();
                } catch (Throwable th2) {
                    this.f49848a.notify();
                    throw th2;
                }
            }
        }
    }
}
