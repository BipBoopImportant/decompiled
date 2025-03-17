package com.google.android.gms.measurement.internal;

import K9.C6620s;
import S9.c;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.util.e;
import com.google.android.gms.common.util.o;
import java.lang.reflect.InvocationTargetException;
import sa.E;

/* renamed from: com.google.android.gms.measurement.internal.i  reason: case insensitive filesystem */
public final class C7611i extends C7643m3 {

    /* renamed from: b  reason: collision with root package name */
    private Boolean f50177b;

    /* renamed from: c  reason: collision with root package name */
    private String f50178c;

    /* renamed from: d  reason: collision with root package name */
    private C7625k f50179d = new C7632l();

    /* renamed from: e  reason: collision with root package name */
    private Boolean f50180e;

    C7611i(P2 p22) {
        super(p22);
    }

    public static long I() {
        return K.f49754e.a(null).longValue();
    }

    public static long K() {
        return (long) K.f49770l.a(null).intValue();
    }

    public static long P() {
        return K.f49716N.a(null).longValue();
    }

    public static long Q() {
        return K.f49706I.a(null).longValue();
    }

    private final String c(String str, String str2) {
        Class<String> cls = String.class;
        try {
            String str3 = (String) Class.forName("android.os.SystemProperties").getMethod("get", new Class[]{cls, cls}).invoke((Object) null, new Object[]{str, str2});
            C6620s.l(str3);
            return str3;
        } catch (ClassNotFoundException e10) {
            f().E().b("Could not find SystemProperties class", e10);
            return str2;
        } catch (NoSuchMethodException e11) {
            f().E().b("Could not find SystemProperties.get() method", e11);
            return str2;
        } catch (IllegalAccessException e12) {
            f().E().b("Could not access SystemProperties.get()", e12);
            return str2;
        } catch (InvocationTargetException e13) {
            f().E().b("SystemProperties.get() threw an exception", e13);
            return str2;
        }
    }

    private final Bundle u() {
        try {
            if (zza().getPackageManager() == null) {
                f().E().a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo c10 = c.a(zza()).c(zza().getPackageName(), 128);
            if (c10 != null) {
                return c10.metaData;
            }
            f().E().a("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e10) {
            f().E().b("Failed to load metadata: Package name not found", e10);
            return null;
        }
    }

    public final long A(String str, Y1<Long> y12) {
        if (TextUtils.isEmpty(str)) {
            return y12.a(null).longValue();
        }
        String c10 = this.f50179d.c(str, y12.b());
        if (TextUtils.isEmpty(c10)) {
            return y12.a(null).longValue();
        }
        try {
            return y12.a(Long.valueOf(Long.parseLong(c10))).longValue();
        } catch (NumberFormatException unused) {
            return y12.a(null).longValue();
        }
    }

    public final E B(String str, boolean z10) {
        Object obj;
        C6620s.f(str);
        Bundle u10 = u();
        if (u10 == null) {
            f().E().a("Failed to load metadata: Metadata bundle is null");
            obj = null;
        } else {
            obj = u10.get(str);
        }
        if (obj == null) {
            return E.UNINITIALIZED;
        }
        if (Boolean.TRUE.equals(obj)) {
            return E.GRANTED;
        }
        if (Boolean.FALSE.equals(obj)) {
            return E.DENIED;
        }
        if (z10 && "eu_consent_policy".equals(obj)) {
            return E.POLICY;
        }
        f().J().b("Invalid manifest metadata for", str);
        return E.UNINITIALIZED;
    }

    /* access modifiers changed from: package-private */
    public final long C(String str) {
        return A(str, K.f49745b);
    }

    public final String D(String str, Y1<String> y12) {
        return TextUtils.isEmpty(str) ? y12.a(null) : y12.a(this.f50179d.c(str, y12.b()));
    }

    /* access modifiers changed from: package-private */
    public final Boolean E(String str) {
        C6620s.f(str);
        Bundle u10 = u();
        if (u10 == null) {
            f().E().a("Failed to load metadata: Metadata bundle is null");
            return null;
        } else if (!u10.containsKey(str)) {
            return null;
        } else {
            return Boolean.valueOf(u10.getBoolean(str));
        }
    }

    public final boolean F(String str, Y1<Boolean> y12) {
        return H(str, y12);
    }

    /* access modifiers changed from: package-private */
    public final String G(String str) {
        return D(str, K.f49734W);
    }

    public final boolean H(String str, Y1<Boolean> y12) {
        if (TextUtils.isEmpty(str)) {
            return y12.a(null).booleanValue();
        }
        String c10 = this.f50179d.c(str, y12.b());
        return TextUtils.isEmpty(c10) ? y12.a(null).booleanValue() : y12.a(Boolean.valueOf("1".equals(c10))).booleanValue();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002b A[SYNTHETIC, Splitter:B:9:0x002b] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<java.lang.String> J(java.lang.String r4) {
        /*
            r3 = this;
            K9.C6620s.f(r4)
            android.os.Bundle r0 = r3.u()
            r1 = 0
            if (r0 != 0) goto L_0x0019
            com.google.android.gms.measurement.internal.h2 r4 = r3.f()
            com.google.android.gms.measurement.internal.i2 r4 = r4.E()
            java.lang.String r0 = "Failed to load metadata: Metadata bundle is null"
            r4.a(r0)
        L_0x0017:
            r4 = r1
            goto L_0x0028
        L_0x0019:
            boolean r2 = r0.containsKey(r4)
            if (r2 != 0) goto L_0x0020
            goto L_0x0017
        L_0x0020:
            int r4 = r0.getInt(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
        L_0x0028:
            if (r4 != 0) goto L_0x002b
            return r1
        L_0x002b:
            android.content.Context r0 = r3.zza()     // Catch:{ NotFoundException -> 0x0043 }
            android.content.res.Resources r0 = r0.getResources()     // Catch:{ NotFoundException -> 0x0043 }
            int r4 = r4.intValue()     // Catch:{ NotFoundException -> 0x0043 }
            java.lang.String[] r4 = r0.getStringArray(r4)     // Catch:{ NotFoundException -> 0x0043 }
            if (r4 != 0) goto L_0x003e
            return r1
        L_0x003e:
            java.util.List r4 = java.util.Arrays.asList(r4)     // Catch:{ NotFoundException -> 0x0043 }
            return r4
        L_0x0043:
            r4 = move-exception
            com.google.android.gms.measurement.internal.h2 r0 = r3.f()
            com.google.android.gms.measurement.internal.i2 r0 = r0.E()
            java.lang.String r2 = "Failed to load string array from metadata: resource not found"
            r0.b(r2, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C7611i.J(java.lang.String):java.util.List");
    }

    public final void L(String str) {
        this.f50178c = str;
    }

    /* access modifiers changed from: package-private */
    public final boolean M(String str) {
        return H(str, K.f49732V);
    }

    public final boolean N(String str) {
        return "1".equals(this.f50179d.c(str, "gaia_collection_enabled"));
    }

    public final boolean O(String str) {
        return "1".equals(this.f50179d.c(str, "measurement.event_sampling_enabled"));
    }

    public final String R() {
        return c("debug.firebase.analytics.app", "");
    }

    public final String S() {
        return c("debug.deferred.deeplink", "");
    }

    public final String T() {
        return this.f50178c;
    }

    public final boolean U() {
        Boolean E10 = E("google_analytics_adid_collection_enabled");
        return E10 == null || E10.booleanValue();
    }

    public final boolean V() {
        Boolean E10 = E("google_analytics_automatic_screen_reporting_enabled");
        return E10 == null || E10.booleanValue();
    }

    public final boolean W() {
        Boolean E10 = E("firebase_analytics_collection_deactivated");
        return E10 != null && E10.booleanValue();
    }

    /* access modifiers changed from: package-private */
    public final boolean X() {
        if (this.f50177b == null) {
            Boolean E10 = E("app_measurement_lite");
            this.f50177b = E10;
            if (E10 == null) {
                this.f50177b = Boolean.FALSE;
            }
        }
        return this.f50177b.booleanValue() || !this.f50228a.t();
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

    public final double l(String str, Y1<Double> y12) {
        if (TextUtils.isEmpty(str)) {
            return y12.a(null).doubleValue();
        }
        String c10 = this.f50179d.c(str, y12.b());
        if (TextUtils.isEmpty(c10)) {
            return y12.a(null).doubleValue();
        }
        try {
            return y12.a(Double.valueOf(Double.parseDouble(c10))).doubleValue();
        } catch (NumberFormatException unused) {
            return y12.a(null).doubleValue();
        }
    }

    /* access modifiers changed from: package-private */
    public final int m(String str) {
        return n(str, K.f49726S, 500, 2000);
    }

    public final int n(String str, Y1<Integer> y12, int i10, int i11) {
        return Math.max(Math.min(w(str, y12), i11), i10);
    }

    /* access modifiers changed from: package-private */
    public final int o(String str, boolean z10) {
        if (z10) {
            return n(str, K.f49749c0, 100, 500);
        }
        return 500;
    }

    /* access modifiers changed from: package-private */
    public final void p(C7625k kVar) {
        this.f50179d = kVar;
    }

    public final /* bridge */ /* synthetic */ J2 q() {
        return super.q();
    }

    public final boolean r(Y1<Boolean> y12) {
        return H((String) null, y12);
    }

    public final boolean s() {
        if (this.f50180e == null) {
            synchronized (this) {
                try {
                    if (this.f50180e == null) {
                        ApplicationInfo applicationInfo = zza().getApplicationInfo();
                        String a10 = o.a();
                        if (applicationInfo != null) {
                            String str = applicationInfo.processName;
                            this.f50180e = Boolean.valueOf(str != null && str.equals(a10));
                        }
                        if (this.f50180e == null) {
                            this.f50180e = Boolean.TRUE;
                            f().E().a("My process not in the list of running processes");
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f50180e.booleanValue();
    }

    public final boolean t() {
        Boolean E10 = E("google_analytics_sgtm_upload_enabled");
        if (E10 == null) {
            return false;
        }
        return E10.booleanValue();
    }

    public final int v(String str) {
        return n(str, K.f49728T, 25, 100);
    }

    public final int w(String str, Y1<Integer> y12) {
        if (TextUtils.isEmpty(str)) {
            return y12.a(null).intValue();
        }
        String c10 = this.f50179d.c(str, y12.b());
        if (TextUtils.isEmpty(c10)) {
            return y12.a(null).intValue();
        }
        try {
            return y12.a(Integer.valueOf(Integer.parseInt(c10))).intValue();
        } catch (NumberFormatException unused) {
            return y12.a(null).intValue();
        }
    }

    /* access modifiers changed from: package-private */
    public final int x(String str, boolean z10) {
        return Math.max(o(str, z10), 256);
    }

    public final int y() {
        return h().a0(201500000, true) ? 100 : 25;
    }

    public final int z(String str) {
        return w(str, K.f49778p);
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
