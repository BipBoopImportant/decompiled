package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.d5  reason: case insensitive filesystem */
final class C7582d5 {

    /* renamed from: a  reason: collision with root package name */
    private C7610h5 f50112a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ C7575c5 f50113b;

    C7582d5(C7575c5 c5Var) {
        this.f50113b = c5Var;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        this.f50113b.k();
        if (this.f50112a != null) {
            this.f50113b.f50094c.removeCallbacks(this.f50112a);
        }
        this.f50113b.e().f50376u.a(false);
        this.f50113b.C(false);
        if (this.f50113b.a().r(K.f49731U0) && this.f50113b.o().M0()) {
            this.f50113b.f().I().a("Retrying trigger URI registration in foreground");
            this.f50113b.o().K0();
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(long j10) {
        this.f50112a = new C7610h5(this, this.f50113b.zzb().a(), j10);
        this.f50113b.f50094c.postDelayed(this.f50112a, 2000);
    }
}
