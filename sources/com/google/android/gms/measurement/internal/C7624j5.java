package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* renamed from: com.google.android.gms.measurement.internal.j5  reason: case insensitive filesystem */
final class C7624j5 {

    /* renamed from: a  reason: collision with root package name */
    private long f50199a;

    /* renamed from: b  reason: collision with root package name */
    protected long f50200b;

    /* renamed from: c  reason: collision with root package name */
    private final A f50201c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ C7575c5 f50202d;

    public C7624j5(C7575c5 c5Var) {
        this.f50202d = c5Var;
        this.f50201c = new C7617i5(this, c5Var.f50228a);
        long c10 = c5Var.zzb().c();
        this.f50199a = c10;
        this.f50200b = c10;
    }

    static /* synthetic */ void c(C7624j5 j5Var) {
        j5Var.f50202d.k();
        j5Var.d(false, false, j5Var.f50202d.zzb().c());
        j5Var.f50202d.l().u(j5Var.f50202d.zzb().c());
    }

    /* access modifiers changed from: package-private */
    public final long a(long j10) {
        long j11 = j10 - this.f50200b;
        this.f50200b = j10;
        return j11;
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        this.f50201c.a();
        if (this.f50202d.a().r(K.f49737X0)) {
            this.f50199a = this.f50202d.zzb().c();
        } else {
            this.f50199a = 0;
        }
        this.f50200b = this.f50199a;
    }

    public final boolean d(boolean z10, boolean z11, long j10) {
        this.f50202d.k();
        this.f50202d.w();
        if (this.f50202d.f50228a.o()) {
            this.f50202d.e().f50373r.b(this.f50202d.zzb().a());
        }
        long j11 = j10 - this.f50199a;
        if (z10 || j11 >= 1000) {
            if (!z11) {
                j11 = a(j10);
            }
            this.f50202d.f().I().b("Recording user engagement, ms", Long.valueOf(j11));
            Bundle bundle = new Bundle();
            bundle.putLong("_et", j11);
            Q5.V(this.f50202d.r().B(!this.f50202d.a().V()), bundle, true);
            if (!z11) {
                this.f50202d.o().e1("auto", "_e", bundle);
            }
            this.f50199a = j10;
            this.f50201c.a();
            this.f50201c.b(K.f49771l0.a(null).longValue());
            return true;
        }
        this.f50202d.f().I().b("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j11));
        return false;
    }

    /* access modifiers changed from: package-private */
    public final void e(long j10) {
        this.f50201c.a();
    }

    /* access modifiers changed from: package-private */
    public final void f(long j10) {
        this.f50202d.k();
        this.f50201c.a();
        this.f50199a = j10;
        this.f50200b = j10;
    }
}
