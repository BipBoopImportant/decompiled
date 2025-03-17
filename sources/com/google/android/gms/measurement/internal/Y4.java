package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.util.e;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

public final class Y4 extends C7721x5 {

    /* renamed from: d  reason: collision with root package name */
    private final Map<String, X4> f50010d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public final C7718x2 f50011e;

    /* renamed from: f  reason: collision with root package name */
    public final C7718x2 f50012f;

    /* renamed from: g  reason: collision with root package name */
    public final C7718x2 f50013g;

    /* renamed from: h  reason: collision with root package name */
    public final C7718x2 f50014h;

    /* renamed from: i  reason: collision with root package name */
    public final C7718x2 f50015i;

    /* renamed from: j  reason: collision with root package name */
    public final C7718x2 f50016j;

    Y4(C7728y5 y5Var) {
        super(y5Var);
        C7683s2 e10 = e();
        Objects.requireNonNull(e10);
        this.f50011e = new C7718x2(e10, "last_delete_stale", 0);
        C7683s2 e11 = e();
        Objects.requireNonNull(e11);
        this.f50012f = new C7718x2(e11, "last_delete_stale_batch", 0);
        C7683s2 e12 = e();
        Objects.requireNonNull(e12);
        this.f50013g = new C7718x2(e12, "backoff", 0);
        C7683s2 e13 = e();
        Objects.requireNonNull(e13);
        this.f50014h = new C7718x2(e13, "last_upload", 0);
        C7683s2 e14 = e();
        Objects.requireNonNull(e14);
        this.f50015i = new C7718x2(e14, "last_upload_attempt", 0);
        C7683s2 e15 = e();
        Objects.requireNonNull(e15);
        this.f50016j = new C7718x2(e15, "midnight_offset", 0);
    }

    @Deprecated
    private final Pair<String, Boolean> w(String str) {
        X4 x42;
        AdvertisingIdClient.Info info;
        k();
        long c10 = zzb().c();
        X4 x43 = this.f50010d.get(str);
        if (x43 != null && c10 < x43.f49993c) {
            return new Pair<>(x43.f49991a, Boolean.valueOf(x43.f49992b));
        }
        AdvertisingIdClient.a(true);
        long C10 = a().C(str) + c10;
        try {
            info = AdvertisingIdClient.getAdvertisingIdInfo(zza());
        } catch (PackageManager.NameNotFoundException unused) {
            if (x43 != null) {
                try {
                    if (c10 < x43.f49993c + a().A(str, K.f49748c)) {
                        return new Pair<>(x43.f49991a, Boolean.valueOf(x43.f49992b));
                    }
                } catch (Exception e10) {
                    f().D().b("Unable to get advertising id", e10);
                    x42 = new X4("", false, C10);
                }
            }
            info = null;
        }
        if (info == null) {
            return new Pair<>("00000000-0000-0000-0000-000000000000", Boolean.FALSE);
        }
        String id2 = info.getId();
        x42 = id2 != null ? new X4(id2, info.isLimitAdTrackingEnabled(), C10) : new X4("", info.isLimitAdTrackingEnabled(), C10);
        this.f50010d.put(str, x42);
        AdvertisingIdClient.a(false);
        return new Pair<>(x42.f49991a, Boolean.valueOf(x42.f49992b));
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

    public final /* bridge */ /* synthetic */ N5 l() {
        return super.l();
    }

    public final /* bridge */ /* synthetic */ Y5 m() {
        return super.m();
    }

    public final /* bridge */ /* synthetic */ C7660p n() {
        return super.n();
    }

    public final /* bridge */ /* synthetic */ C2 o() {
        return super.o();
    }

    public final /* bridge */ /* synthetic */ Y4 p() {
        return super.p();
    }

    public final /* bridge */ /* synthetic */ J2 q() {
        return super.q();
    }

    public final /* bridge */ /* synthetic */ C7714w5 r() {
        return super.r();
    }

    /* access modifiers changed from: protected */
    public final boolean v() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public final Pair<String, Boolean> x(String str, C7671q3 q3Var) {
        return q3Var.w() ? w(str) : new Pair<>("", Boolean.FALSE);
    }

    /* access modifiers changed from: package-private */
    @Deprecated
    public final String y(String str, boolean z10) {
        k();
        String str2 = z10 ? (String) w(str).first : "00000000-0000-0000-0000-000000000000";
        MessageDigest Q02 = Q5.Q0();
        if (Q02 == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new Object[]{new BigInteger(1, Q02.digest(str2.getBytes()))});
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
