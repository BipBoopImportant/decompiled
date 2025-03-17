package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.util.e;
import com.google.android.gms.internal.measurement.O0;

/* renamed from: com.google.android.gms.measurement.internal.c5  reason: case insensitive filesystem */
public final class C7575c5 extends B1 {
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public Handler f50094c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f50095d = true;

    /* renamed from: e  reason: collision with root package name */
    protected final C7638l5 f50096e = new C7638l5(this);

    /* renamed from: f  reason: collision with root package name */
    protected final C7624j5 f50097f = new C7624j5(this);

    /* renamed from: g  reason: collision with root package name */
    private final C7582d5 f50098g = new C7582d5(this);

    C7575c5(P2 p22) {
        super(p22);
    }

    static /* synthetic */ void B(C7575c5 c5Var, long j10) {
        c5Var.k();
        c5Var.F();
        c5Var.f().I().b("Activity paused, time", Long.valueOf(j10));
        c5Var.f50098g.b(j10);
        if (c5Var.a().V()) {
            c5Var.f50097f.e(j10);
        }
    }

    /* access modifiers changed from: private */
    public final void F() {
        k();
        if (this.f50094c == null) {
            this.f50094c = new O0(Looper.getMainLooper());
        }
    }

    static /* synthetic */ void H(C7575c5 c5Var, long j10) {
        c5Var.k();
        c5Var.F();
        c5Var.f().I().b("Activity resumed, time", Long.valueOf(j10));
        if (c5Var.a().r(K.f49735W0)) {
            if (c5Var.a().V() || c5Var.f50095d) {
                c5Var.f50097f.f(j10);
            }
        } else if (c5Var.a().V() || c5Var.e().f50376u.b()) {
            c5Var.f50097f.f(j10);
        }
        c5Var.f50098g.a();
        C7638l5 l5Var = c5Var.f50096e;
        l5Var.f50227a.k();
        if (l5Var.f50227a.f50228a.o()) {
            l5Var.b(l5Var.f50227a.zzb().a(), false);
        }
    }

    /* access modifiers changed from: package-private */
    public final void C(boolean z10) {
        k();
        this.f50095d = z10;
    }

    public final boolean D(boolean z10, boolean z11, long j10) {
        return this.f50097f.d(z10, z11, j10);
    }

    /* access modifiers changed from: package-private */
    public final boolean E() {
        k();
        return this.f50095d;
    }

    public final /* bridge */ /* synthetic */ C7611i a() {
        return super.a();
    }

    public final /* bridge */ /* synthetic */ E b() {
        return super.b();
    }

    public final /* bridge */ /* synthetic */ C7586e2 d() {
        return super.d();
    }

    public final /* bridge */ /* synthetic */ C7683s2 e() {
        return super.e();
    }

    public final /* bridge */ /* synthetic */ C7607h2 f() {
        return super.f();
    }

    public final /* bridge */ /* synthetic */ C7595f4 g() {
        return super.g();
    }

    public final /* bridge */ /* synthetic */ Q5 h() {
        return super.h();
    }

    public final /* bridge */ /* synthetic */ void i() {
        super.i();
    }

    public final /* bridge */ /* synthetic */ void j() {
        super.j();
    }

    public final /* bridge */ /* synthetic */ void k() {
        super.k();
    }

    public final /* bridge */ /* synthetic */ C7555a l() {
        return super.l();
    }

    public final /* bridge */ /* synthetic */ C7565b2 m() {
        return super.m();
    }

    public final /* bridge */ /* synthetic */ C7579d2 n() {
        return super.n();
    }

    public final /* bridge */ /* synthetic */ C7691t3 o() {
        return super.o();
    }

    public final /* bridge */ /* synthetic */ C7616i4 p() {
        return super.p();
    }

    public final /* bridge */ /* synthetic */ J2 q() {
        return super.q();
    }

    public final /* bridge */ /* synthetic */ C7644m4 r() {
        return super.r();
    }

    public final /* bridge */ /* synthetic */ C7685s4 s() {
        return super.s();
    }

    public final /* bridge */ /* synthetic */ C7575c5 t() {
        return super.t();
    }

    /* access modifiers changed from: protected */
    public final boolean v() {
        return false;
    }

    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    public final /* bridge */ /* synthetic */ e zzb() {
        return super.zzb();
    }

    public final /* bridge */ /* synthetic */ C7590f zzd() {
        return super.zzd();
    }
}
