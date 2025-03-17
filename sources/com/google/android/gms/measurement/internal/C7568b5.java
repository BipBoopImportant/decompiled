package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.b5  reason: case insensitive filesystem */
final class C7568b5 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ long f50084a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C7575c5 f50085b;

    C7568b5(C7575c5 c5Var, long j10) {
        this.f50084a = j10;
        this.f50085b = c5Var;
    }

    public final void run() {
        C7575c5.H(this.f50085b, this.f50084a);
    }
}
