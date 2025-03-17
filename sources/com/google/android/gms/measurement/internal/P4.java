package com.google.android.gms.measurement.internal;

import K9.C6620s;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;
import sa.C8755h;

final class P4 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ AtomicReference f49904a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f49905b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f49906c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ String f49907d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ E5 f49908e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ boolean f49909f;

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ C7685s4 f49910g;

    P4(C7685s4 s4Var, AtomicReference atomicReference, String str, String str2, String str3, E5 e52, boolean z10) {
        this.f49904a = atomicReference;
        this.f49905b = str;
        this.f49906c = str2;
        this.f49907d = str3;
        this.f49908e = e52;
        this.f49909f = z10;
        this.f49910g = s4Var;
    }

    public final void run() {
        synchronized (this.f49904a) {
            try {
                C8755h A10 = this.f49910g.f50393d;
                if (A10 == null) {
                    this.f49910g.f().E().d("(legacy) Failed to get user properties; not connected to service", C7607h2.t(this.f49905b), this.f49906c, this.f49907d);
                    this.f49904a.set(Collections.emptyList());
                    this.f49904a.notify();
                    return;
                }
                if (TextUtils.isEmpty(this.f49905b)) {
                    C6620s.l(this.f49908e);
                    this.f49904a.set(A10.n3(this.f49906c, this.f49907d, this.f49909f, this.f49908e));
                } else {
                    this.f49904a.set(A10.P(this.f49905b, this.f49906c, this.f49907d, this.f49909f));
                }
                this.f49910g.o0();
                this.f49904a.notify();
            } catch (RemoteException e10) {
                try {
                    this.f49910g.f().E().d("(legacy) Failed to get user properties; remote exception", C7607h2.t(this.f49905b), this.f49906c, e10);
                    this.f49904a.set(Collections.emptyList());
                    this.f49904a.notify();
                } catch (Throwable th2) {
                    this.f49904a.notify();
                    throw th2;
                }
            }
        }
    }
}
