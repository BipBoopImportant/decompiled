package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.z  reason: case insensitive filesystem */
final class C7729z implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C7657o3 f50538a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ A f50539b;

    C7729z(A a10, C7657o3 o3Var) {
        this.f50538a = o3Var;
        this.f50539b = a10;
    }

    public final void run() {
        this.f50538a.zzd();
        if (C7590f.a()) {
            this.f50538a.q().B(this);
            return;
        }
        boolean e10 = this.f50539b.e();
        this.f50539b.f49519c = 0;
        if (e10) {
            this.f50539b.d();
        }
    }
}
