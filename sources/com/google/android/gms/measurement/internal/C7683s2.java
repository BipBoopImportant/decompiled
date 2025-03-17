package com.google.android.gms.measurement.internal;

import K9.C6620s;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.measurement.internal.C7671q3;

/* renamed from: com.google.android.gms.measurement.internal.s2  reason: case insensitive filesystem */
final class C7683s2 extends C7664p3 {

    /* renamed from: B  reason: collision with root package name */
    static final Pair<String, Long> f50356B = new Pair<>("", 0L);

    /* renamed from: A  reason: collision with root package name */
    public final C7697u2 f50357A = new C7697u2(this, "default_event_parameters", (Bundle) null);

    /* renamed from: c  reason: collision with root package name */
    private SharedPreferences f50358c;

    /* renamed from: d  reason: collision with root package name */
    private Object f50359d = new Object();

    /* renamed from: e  reason: collision with root package name */
    private SharedPreferences f50360e;

    /* renamed from: f  reason: collision with root package name */
    public C7711w2 f50361f;

    /* renamed from: g  reason: collision with root package name */
    public final C7718x2 f50362g = new C7718x2(this, "first_open_time", 0);

    /* renamed from: h  reason: collision with root package name */
    public final C7718x2 f50363h = new C7718x2(this, "app_install_time", 0);

    /* renamed from: i  reason: collision with root package name */
    public final C7725y2 f50364i = new C7725y2(this, "app_instance_id", (String) null);

    /* renamed from: j  reason: collision with root package name */
    private String f50365j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f50366k;

    /* renamed from: l  reason: collision with root package name */
    private long f50367l;

    /* renamed from: m  reason: collision with root package name */
    public final C7718x2 f50368m = new C7718x2(this, "session_timeout", 1800000);

    /* renamed from: n  reason: collision with root package name */
    public final C7704v2 f50369n = new C7704v2(this, "start_new_session", true);

    /* renamed from: o  reason: collision with root package name */
    public final C7725y2 f50370o = new C7725y2(this, "non_personalized_ads", (String) null);

    /* renamed from: p  reason: collision with root package name */
    public final C7697u2 f50371p = new C7697u2(this, "last_received_uri_timestamps_by_source", (Bundle) null);

    /* renamed from: q  reason: collision with root package name */
    public final C7704v2 f50372q = new C7704v2(this, "allow_remote_dynamite", false);

    /* renamed from: r  reason: collision with root package name */
    public final C7718x2 f50373r = new C7718x2(this, "last_pause_time", 0);

    /* renamed from: s  reason: collision with root package name */
    public final C7718x2 f50374s = new C7718x2(this, "session_id", 0);

    /* renamed from: t  reason: collision with root package name */
    public boolean f50375t;

    /* renamed from: u  reason: collision with root package name */
    public C7704v2 f50376u = new C7704v2(this, "app_backgrounded", false);

    /* renamed from: v  reason: collision with root package name */
    public C7704v2 f50377v = new C7704v2(this, "deep_link_retrieval_complete", false);

    /* renamed from: w  reason: collision with root package name */
    public C7718x2 f50378w = new C7718x2(this, "deep_link_retrieval_attempts", 0);

    /* renamed from: x  reason: collision with root package name */
    public final C7725y2 f50379x = new C7725y2(this, "firebase_feature_rollouts", (String) null);

    /* renamed from: y  reason: collision with root package name */
    public final C7725y2 f50380y = new C7725y2(this, "deferred_attribution_cache", (String) null);

    /* renamed from: z  reason: collision with root package name */
    public final C7718x2 f50381z = new C7718x2(this, "deferred_attribution_cache_timestamp", 0);

    C7683s2(P2 p22) {
        super(p22);
    }

    /* access modifiers changed from: package-private */
    public final void A() {
        k();
        Boolean N10 = N();
        SharedPreferences.Editor edit = H().edit();
        edit.clear();
        edit.apply();
        if (N10 != null) {
            t(N10);
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean B() {
        SharedPreferences sharedPreferences = this.f50358c;
        if (sharedPreferences == null) {
            return false;
        }
        return sharedPreferences.contains("deferred_analytics_collection");
    }

    /* access modifiers changed from: package-private */
    public final void C(Boolean bool) {
        k();
        SharedPreferences.Editor edit = H().edit();
        if (bool != null) {
            edit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
        } else {
            edit.remove("measurement_enabled_from_api");
        }
        edit.apply();
    }

    /* access modifiers changed from: package-private */
    public final void D(String str) {
        k();
        SharedPreferences.Editor edit = H().edit();
        edit.putString("admob_app_id", str);
        edit.apply();
    }

    /* access modifiers changed from: package-private */
    public final void E(boolean z10) {
        k();
        f().I().b("App measurement setting deferred collection", Boolean.valueOf(z10));
        SharedPreferences.Editor edit = H().edit();
        edit.putBoolean("deferred_analytics_collection", z10);
        edit.apply();
    }

    /* access modifiers changed from: protected */
    public final SharedPreferences F() {
        k();
        m();
        if (this.f50360e == null) {
            synchronized (this.f50359d) {
                try {
                    if (this.f50360e == null) {
                        String str = zza().getPackageName() + "_preferences";
                        f().I().b("Default prefs file", str);
                        this.f50360e = zza().getSharedPreferences(str, 0);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f50360e;
    }

    /* access modifiers changed from: package-private */
    public final void G(String str) {
        k();
        SharedPreferences.Editor edit = H().edit();
        edit.putString("gmp_app_id", str);
        edit.apply();
    }

    /* access modifiers changed from: protected */
    public final SharedPreferences H() {
        k();
        m();
        C6620s.l(this.f50358c);
        return this.f50358c;
    }

    /* access modifiers changed from: package-private */
    public final SparseArray<Long> I() {
        Bundle a10 = this.f50371p.a();
        if (a10 == null) {
            return new SparseArray<>();
        }
        int[] intArray = a10.getIntArray("uriSources");
        long[] longArray = a10.getLongArray("uriTimestamps");
        if (intArray == null || longArray == null) {
            return new SparseArray<>();
        }
        if (intArray.length != longArray.length) {
            f().E().a("Trigger URI source and timestamp array lengths do not match");
            return new SparseArray<>();
        }
        SparseArray<Long> sparseArray = new SparseArray<>();
        for (int i10 = 0; i10 < intArray.length; i10++) {
            sparseArray.put(intArray[i10], Long.valueOf(longArray[i10]));
        }
        return sparseArray;
    }

    /* access modifiers changed from: package-private */
    public final C J() {
        k();
        return C.c(H().getString("dma_consent_settings", (String) null));
    }

    /* access modifiers changed from: package-private */
    public final C7671q3 K() {
        k();
        return C7671q3.e(H().getString("consent_settings", "G1"), H().getInt("consent_source", 100));
    }

    /* access modifiers changed from: package-private */
    public final Boolean L() {
        k();
        if (!H().contains("use_service")) {
            return null;
        }
        return Boolean.valueOf(H().getBoolean("use_service", false));
    }

    /* access modifiers changed from: package-private */
    public final Boolean M() {
        k();
        if (H().contains("measurement_enabled_from_api")) {
            return Boolean.valueOf(H().getBoolean("measurement_enabled_from_api", true));
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final Boolean N() {
        k();
        if (H().contains("measurement_enabled")) {
            return Boolean.valueOf(H().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final String O() {
        k();
        String string = H().getString("previous_os_version", (String) null);
        b().m();
        String str = Build.VERSION.RELEASE;
        if (!TextUtils.isEmpty(str) && !str.equals(string)) {
            SharedPreferences.Editor edit = H().edit();
            edit.putString("previous_os_version", str);
            edit.apply();
        }
        return string;
    }

    /* access modifiers changed from: package-private */
    public final String P() {
        k();
        return H().getString("admob_app_id", (String) null);
    }

    /* access modifiers changed from: package-private */
    public final String Q() {
        k();
        return H().getString("gmp_app_id", (String) null);
    }

    /* access modifiers changed from: protected */
    public final void l() {
        SharedPreferences sharedPreferences = zza().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.f50358c = sharedPreferences;
        boolean z10 = sharedPreferences.getBoolean("has_been_opened", false);
        this.f50375t = z10;
        if (!z10) {
            SharedPreferences.Editor edit = this.f50358c.edit();
            edit.putBoolean("has_been_opened", true);
            edit.apply();
        }
        this.f50361f = new C7711w2(this, "health_monitor", Math.max(0, K.f49751d.a(null).longValue()));
    }

    /* access modifiers changed from: protected */
    public final boolean r() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public final Pair<String, Boolean> s(String str) {
        k();
        if (!K().m(C7671q3.a.AD_STORAGE)) {
            return new Pair<>("", Boolean.FALSE);
        }
        long c10 = zzb().c();
        if (this.f50365j != null && c10 < this.f50367l) {
            return new Pair<>(this.f50365j, Boolean.valueOf(this.f50366k));
        }
        this.f50367l = c10 + a().C(str);
        AdvertisingIdClient.a(true);
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(zza());
            this.f50365j = "";
            String id2 = advertisingIdInfo.getId();
            if (id2 != null) {
                this.f50365j = id2;
            }
            this.f50366k = advertisingIdInfo.isLimitAdTrackingEnabled();
        } catch (Exception e10) {
            f().D().b("Unable to get advertising id", e10);
            this.f50365j = "";
        }
        AdvertisingIdClient.a(false);
        return new Pair<>(this.f50365j, Boolean.valueOf(this.f50366k));
    }

    /* access modifiers changed from: package-private */
    public final void t(Boolean bool) {
        k();
        SharedPreferences.Editor edit = H().edit();
        if (bool != null) {
            edit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            edit.remove("measurement_enabled");
        }
        edit.apply();
    }

    /* access modifiers changed from: package-private */
    public final void u(boolean z10) {
        k();
        SharedPreferences.Editor edit = H().edit();
        edit.putBoolean("use_service", z10);
        edit.apply();
    }

    /* access modifiers changed from: package-private */
    public final boolean v(int i10) {
        return C7671q3.l(i10, H().getInt("consent_source", 100));
    }

    /* access modifiers changed from: package-private */
    public final boolean w(long j10) {
        return j10 - this.f50368m.a() > this.f50373r.a();
    }

    /* access modifiers changed from: package-private */
    public final boolean x(C c10) {
        k();
        if (!C7671q3.l(c10.a(), J().a())) {
            return false;
        }
        SharedPreferences.Editor edit = H().edit();
        edit.putString("dma_consent_settings", c10.j());
        edit.apply();
        return true;
    }

    /* access modifiers changed from: package-private */
    public final boolean y(C7671q3 q3Var) {
        k();
        int b10 = q3Var.b();
        if (!v(b10)) {
            return false;
        }
        SharedPreferences.Editor edit = H().edit();
        edit.putString("consent_settings", q3Var.v());
        edit.putInt("consent_source", b10);
        edit.apply();
        return true;
    }

    /* access modifiers changed from: protected */
    public final boolean z(C7631k5 k5Var) {
        k();
        String string = H().getString("stored_tcf_param", "");
        String g10 = k5Var.g();
        if (g10.equals(string)) {
            return false;
        }
        SharedPreferences.Editor edit = H().edit();
        edit.putString("stored_tcf_param", g10);
        edit.apply();
        return true;
    }
}
