package com.google.android.gms.measurement.internal;

import K9.C6620s;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.util.e;
import j0.C5445a;
import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.a  reason: case insensitive filesystem */
public final class C7555a extends Z1 {

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, Long> f50032b = new C5445a();

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, Integer> f50033c = new C5445a();

    /* renamed from: d  reason: collision with root package name */
    private long f50034d;

    public C7555a(P2 p22) {
        super(p22);
    }

    /* access modifiers changed from: private */
    public final void A(long j10) {
        for (String put : this.f50032b.keySet()) {
            this.f50032b.put(put, Long.valueOf(j10));
        }
        if (!this.f50032b.isEmpty()) {
            this.f50034d = j10;
        }
    }

    static /* synthetic */ void B(C7555a aVar, String str, long j10) {
        aVar.k();
        C6620s.f(str);
        Integer num = aVar.f50033c.get(str);
        if (num != null) {
            C7630k4 B10 = aVar.r().B(false);
            int intValue = num.intValue() - 1;
            if (intValue == 0) {
                aVar.f50033c.remove(str);
                Long l10 = aVar.f50032b.get(str);
                if (l10 == null) {
                    aVar.f().E().a("First ad unit exposure time was never set");
                } else {
                    aVar.f50032b.remove(str);
                    aVar.z(str, j10 - l10.longValue(), B10);
                }
                if (aVar.f50033c.isEmpty()) {
                    long j11 = aVar.f50034d;
                    if (j11 == 0) {
                        aVar.f().E().a("First ad exposure time was never set");
                        return;
                    }
                    aVar.v(j10 - j11, B10);
                    aVar.f50034d = 0;
                    return;
                }
                return;
            }
            aVar.f50033c.put(str, Integer.valueOf(intValue));
            return;
        }
        aVar.f().E().b("Call to endAdUnitExposure for unknown ad unit id", str);
    }

    private final void v(long j10, C7630k4 k4Var) {
        if (k4Var == null) {
            f().I().a("Not logging ad exposure. No active activity");
        } else if (j10 < 1000) {
            f().I().b("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j10));
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j10);
            Q5.V(k4Var, bundle, true);
            o().e1("am", "_xa", bundle);
        }
    }

    static /* synthetic */ void x(C7555a aVar, String str, long j10) {
        aVar.k();
        C6620s.f(str);
        if (aVar.f50033c.isEmpty()) {
            aVar.f50034d = j10;
        }
        Integer num = aVar.f50033c.get(str);
        if (num != null) {
            aVar.f50033c.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (aVar.f50033c.size() >= 100) {
            aVar.f().J().a("Too many ads visible");
        } else {
            aVar.f50033c.put(str, 1);
            aVar.f50032b.put(str, Long.valueOf(j10));
        }
    }

    private final void z(String str, long j10, C7630k4 k4Var) {
        if (k4Var == null) {
            f().I().a("Not logging ad unit exposure. No active activity");
        } else if (j10 < 1000) {
            f().I().b("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j10));
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j10);
            Q5.V(k4Var, bundle, true);
            o().e1("am", "_xu", bundle);
        }
    }

    public final void C(String str, long j10) {
        if (str == null || str.length() == 0) {
            f().E().a("Ad unit id must be a non-empty string");
        } else {
            q().B(new C7722y(this, str, j10));
        }
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

    public final void u(long j10) {
        C7630k4 B10 = r().B(false);
        for (String next : this.f50032b.keySet()) {
            z(next, j10 - this.f50032b.get(next).longValue(), B10);
        }
        if (!this.f50032b.isEmpty()) {
            v(j10 - this.f50034d, B10);
        }
        A(j10);
    }

    public final void y(String str, long j10) {
        if (str == null || str.length() == 0) {
            f().E().a("Ad unit id must be a non-empty string");
        } else {
            q().B(new Y(this, str, j10));
        }
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
