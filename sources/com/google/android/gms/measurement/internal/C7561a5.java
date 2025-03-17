package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.a5  reason: case insensitive filesystem */
final class C7561a5 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C7728y5 f50045a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Runnable f50046b;

    C7561a5(Z4 z42, C7728y5 y5Var, Runnable runnable) {
        this.f50045a = y5Var;
        this.f50046b = runnable;
    }

    public final void run() {
        this.f50045a.K0();
        this.f50045a.C(this.f50046b);
        this.f50045a.P0();
    }
}
