package com.google.android.gms.measurement.internal;

import java.util.Objects;

final class B3 extends A {

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ C7691t3 f49538e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    B3(C7691t3 t3Var, C7657o3 o3Var) {
        super(o3Var);
        this.f49538e = t3Var;
    }

    public final void d() {
        C7691t3 o10 = this.f49538e.o();
        Objects.requireNonNull(o10);
        new Thread(new A3(o10)).start();
    }
}
