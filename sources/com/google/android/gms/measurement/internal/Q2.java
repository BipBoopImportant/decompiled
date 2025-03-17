package com.google.android.gms.measurement.internal;

final class Q2 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C7684s3 f49918a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ P2 f49919b;

    Q2(P2 p22, C7684s3 s3Var) {
        this.f49918a = s3Var;
        this.f49919b = p22;
    }

    public final void run() {
        P2.e(this.f49919b, this.f49918a);
        this.f49919b.b(this.f49918a.f50388g);
    }
}
