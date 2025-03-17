package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

final class P3 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ AtomicReference f49899a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f49900b = null;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f49901c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ String f49902d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ C7691t3 f49903e;

    P3(C7691t3 t3Var, AtomicReference atomicReference, String str, String str2, String str3) {
        this.f49899a = atomicReference;
        this.f49901c = str2;
        this.f49902d = str3;
        this.f49903e = t3Var;
    }

    public final void run() {
        this.f49903e.f50228a.K().T(this.f49899a, (String) null, this.f49901c, this.f49902d);
    }
}
