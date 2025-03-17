package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.h5  reason: case insensitive filesystem */
final class C7610h5 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private long f50174a;

    /* renamed from: b  reason: collision with root package name */
    private long f50175b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ C7582d5 f50176c;

    C7610h5(C7582d5 d5Var, long j10, long j11) {
        this.f50176c = d5Var;
        this.f50174a = j10;
        this.f50175b = j11;
    }

    public static /* synthetic */ void a(C7610h5 h5Var) {
        C7582d5 d5Var = h5Var.f50176c;
        long j10 = h5Var.f50174a;
        long j11 = h5Var.f50175b;
        d5Var.f50113b.k();
        d5Var.f50113b.f().D().a("Application going to the background");
        d5Var.f50113b.e().f50376u.a(true);
        d5Var.f50113b.C(true);
        if (!d5Var.f50113b.a().V()) {
            d5Var.f50113b.D(false, false, j11);
            d5Var.f50113b.f50097f.e(j11);
        }
        d5Var.f50113b.f().H().b("Application backgrounded at: timestamp_millis", Long.valueOf(j10));
        d5Var.f50113b.o().D0();
        if (d5Var.f50113b.a().r(K.f49717N0)) {
            long A10 = d5Var.f50113b.h().C0(d5Var.f50113b.zza().getPackageName(), d5Var.f50113b.a().T()) ? 1000 : d5Var.f50113b.a().A(d5Var.f50113b.zza().getPackageName(), K.f49690A);
            d5Var.f50113b.f().I().b("[sgtm] Scheduling batch upload with minimum latency in millis", Long.valueOf(A10));
            d5Var.f50113b.p().A(A10);
        }
    }

    public final void run() {
        this.f50176c.f50113b.q().B(new C7603g5(this));
    }
}
