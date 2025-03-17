package com.google.android.gms.measurement.internal;

final class G3 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ long f49640a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C7691t3 f49641b;

    G3(C7691t3 t3Var, long j10) {
        this.f49640a = j10;
        this.f49641b = t3Var;
    }

    public final void run() {
        this.f49641b.e().f50368m.b(this.f49640a);
        this.f49641b.f().D().b("Session timeout duration set", Long.valueOf(this.f49640a));
    }
}
