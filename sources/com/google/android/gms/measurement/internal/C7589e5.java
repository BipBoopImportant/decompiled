package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.e5  reason: case insensitive filesystem */
final class C7589e5 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ long f50123a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C7575c5 f50124b;

    C7589e5(C7575c5 c5Var, long j10) {
        this.f50123a = j10;
        this.f50124b = c5Var;
    }

    public final void run() {
        C7575c5.B(this.f50124b, this.f50123a);
    }
}
