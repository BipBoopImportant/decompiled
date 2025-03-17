package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.b4  reason: case insensitive filesystem */
final class C7567b4 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C7671q3 f50080a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ long f50081b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ boolean f50082c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ C7691t3 f50083d;

    C7567b4(C7691t3 t3Var, C7671q3 q3Var, long j10, boolean z10) {
        this.f50080a = q3Var;
        this.f50081b = j10;
        this.f50082c = z10;
        this.f50083d = t3Var;
    }

    public final void run() {
        this.f50083d.O(this.f50080a);
        C7691t3.U(this.f50083d, this.f50080a, this.f50081b, true, this.f50082c);
    }
}
