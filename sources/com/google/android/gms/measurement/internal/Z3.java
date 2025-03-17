package com.google.android.gms.measurement.internal;

final class Z3 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Boolean f50025a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C7691t3 f50026b;

    Z3(C7691t3 t3Var, Boolean bool) {
        this.f50025a = bool;
        this.f50026b = t3Var;
    }

    public final void run() {
        this.f50026b.c0(this.f50025a, true);
    }
}
