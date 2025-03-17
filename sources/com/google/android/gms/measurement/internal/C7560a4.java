package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.a4  reason: case insensitive filesystem */
final class C7560a4 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C7671q3 f50041a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ long f50042b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ boolean f50043c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ C7691t3 f50044d;

    C7560a4(C7691t3 t3Var, C7671q3 q3Var, long j10, boolean z10) {
        this.f50041a = q3Var;
        this.f50042b = j10;
        this.f50043c = z10;
        this.f50044d = t3Var;
    }

    public final void run() {
        this.f50044d.O(this.f50041a);
        C7691t3.U(this.f50044d, this.f50041a, this.f50042b, false, this.f50043c);
    }
}
