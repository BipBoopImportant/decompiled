package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.r4  reason: case insensitive filesystem */
final class C7678r4 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ long f50353a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C7644m4 f50354b;

    C7678r4(C7644m4 m4Var, long j10) {
        this.f50353a = j10;
        this.f50354b = m4Var;
    }

    public final void run() {
        this.f50354b.l().u(this.f50353a);
        this.f50354b.f50231e = null;
    }
}
