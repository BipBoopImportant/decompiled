package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

final class T3 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ AtomicReference f49957a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f49958b = null;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f49959c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ String f49960d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ boolean f49961e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ C7691t3 f49962f;

    T3(C7691t3 t3Var, AtomicReference atomicReference, String str, String str2, String str3, boolean z10) {
        this.f49957a = atomicReference;
        this.f49959c = str2;
        this.f49960d = str3;
        this.f49961e = z10;
        this.f49962f = t3Var;
    }

    public final void run() {
        this.f49962f.f50228a.K().U(this.f49957a, (String) null, this.f49959c, this.f49960d, this.f49961e);
    }
}
