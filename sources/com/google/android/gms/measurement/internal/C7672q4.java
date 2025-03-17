package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.q4  reason: case insensitive filesystem */
final class C7672q4 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C7630k4 f50300a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ long f50301b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ C7644m4 f50302c;

    C7672q4(C7644m4 m4Var, C7630k4 k4Var, long j10) {
        this.f50300a = k4Var;
        this.f50301b = j10;
        this.f50302c = m4Var;
    }

    public final void run() {
        this.f50302c.H(this.f50300a, false, this.f50301b);
        C7644m4 m4Var = this.f50302c;
        m4Var.f50231e = null;
        m4Var.s().J((C7630k4) null);
    }
}
