package com.google.android.gms.measurement.internal;

import K9.C6620s;
import S9.c;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.adjust.sdk.Constants;
import com.google.android.gms.common.util.e;
import com.google.android.gms.common.util.h;
import com.google.android.gms.internal.measurement.B3;
import com.google.android.gms.internal.measurement.C7282e1;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;
import sa.C8750c;

public class P2 implements C7657o3 {

    /* renamed from: J  reason: collision with root package name */
    private static volatile P2 f49863J;

    /* renamed from: A  reason: collision with root package name */
    private long f49864A;

    /* renamed from: B  reason: collision with root package name */
    private volatile Boolean f49865B;

    /* renamed from: C  reason: collision with root package name */
    private Boolean f49866C;

    /* renamed from: D  reason: collision with root package name */
    private Boolean f49867D;

    /* renamed from: E  reason: collision with root package name */
    private volatile boolean f49868E;

    /* renamed from: F  reason: collision with root package name */
    private int f49869F;

    /* renamed from: G  reason: collision with root package name */
    private int f49870G;

    /* renamed from: H  reason: collision with root package name */
    private AtomicInteger f49871H = new AtomicInteger(0);

    /* renamed from: I  reason: collision with root package name */
    final long f49872I;

    /* renamed from: a  reason: collision with root package name */
    private final Context f49873a;

    /* renamed from: b  reason: collision with root package name */
    private final String f49874b;

    /* renamed from: c  reason: collision with root package name */
    private final String f49875c;

    /* renamed from: d  reason: collision with root package name */
    private final String f49876d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f49877e;

    /* renamed from: f  reason: collision with root package name */
    private final C7590f f49878f;

    /* renamed from: g  reason: collision with root package name */
    private final C7611i f49879g;

    /* renamed from: h  reason: collision with root package name */
    private final C7683s2 f49880h;

    /* renamed from: i  reason: collision with root package name */
    private final C7607h2 f49881i;

    /* renamed from: j  reason: collision with root package name */
    private final J2 f49882j;

    /* renamed from: k  reason: collision with root package name */
    private final C7575c5 f49883k;

    /* renamed from: l  reason: collision with root package name */
    private final Q5 f49884l;

    /* renamed from: m  reason: collision with root package name */
    private final C7586e2 f49885m;

    /* renamed from: n  reason: collision with root package name */
    private final e f49886n;

    /* renamed from: o  reason: collision with root package name */
    private final C7644m4 f49887o;

    /* renamed from: p  reason: collision with root package name */
    private final C7691t3 f49888p;

    /* renamed from: q  reason: collision with root package name */
    private final C7555a f49889q;

    /* renamed from: r  reason: collision with root package name */
    private final C7595f4 f49890r;

    /* renamed from: s  reason: collision with root package name */
    private final String f49891s;

    /* renamed from: t  reason: collision with root package name */
    private C7579d2 f49892t;

    /* renamed from: u  reason: collision with root package name */
    private C7685s4 f49893u;

    /* renamed from: v  reason: collision with root package name */
    private E f49894v;

    /* renamed from: w  reason: collision with root package name */
    private C7565b2 f49895w;

    /* renamed from: x  reason: collision with root package name */
    private C7616i4 f49896x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f49897y = false;

    /* renamed from: z  reason: collision with root package name */
    private Boolean f49898z;

    private P2(C7684s3 s3Var) {
        Bundle bundle;
        boolean z10 = false;
        C6620s.l(s3Var);
        C7590f fVar = new C7590f(s3Var.f50382a);
        this.f49878f = fVar;
        W1.f49977a = fVar;
        Context context = s3Var.f50382a;
        this.f49873a = context;
        this.f49874b = s3Var.f50383b;
        this.f49875c = s3Var.f50384c;
        this.f49876d = s3Var.f50385d;
        this.f49877e = s3Var.f50389h;
        this.f49865B = s3Var.f50386e;
        this.f49891s = s3Var.f50391j;
        this.f49868E = true;
        C7282e1 e1Var = s3Var.f50388g;
        if (!(e1Var == null || (bundle = e1Var.f48906g) == null)) {
            Object obj = bundle.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.f49866C = (Boolean) obj;
            }
            Object obj2 = e1Var.f48906g.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.f49867D = (Boolean) obj2;
            }
        }
        B3.l(context);
        e d10 = h.d();
        this.f49886n = d10;
        Long l10 = s3Var.f50390i;
        this.f49872I = l10 != null ? l10.longValue() : d10.a();
        this.f49879g = new C7611i(this);
        C7683s2 s2Var = new C7683s2(this);
        s2Var.n();
        this.f49880h = s2Var;
        C7607h2 h2Var = new C7607h2(this);
        h2Var.n();
        this.f49881i = h2Var;
        Q5 q52 = new Q5(this);
        q52.n();
        this.f49884l = q52;
        this.f49885m = new C7586e2(new C7698u3(s3Var, this));
        this.f49889q = new C7555a(this);
        C7644m4 m4Var = new C7644m4(this);
        m4Var.x();
        this.f49887o = m4Var;
        C7691t3 t3Var = new C7691t3(this);
        t3Var.x();
        this.f49888p = t3Var;
        C7575c5 c5Var = new C7575c5(this);
        c5Var.x();
        this.f49883k = c5Var;
        C7595f4 f4Var = new C7595f4(this);
        f4Var.n();
        this.f49890r = f4Var;
        J2 j22 = new J2(this);
        j22.n();
        this.f49882j = j22;
        C7282e1 e1Var2 = s3Var.f50388g;
        if (!(e1Var2 == null || e1Var2.f48901b == 0)) {
            z10 = true;
        }
        boolean z11 = !z10;
        if (context.getApplicationContext() instanceof Application) {
            G().Z0(z11);
        } else {
            f().J().a("Application context is not an Application");
        }
        j22.B(new Q2(this, s3Var));
    }

    public static P2 a(Context context, C7282e1 e1Var, Long l10) {
        Bundle bundle;
        if (e1Var != null && (e1Var.f48904e == null || e1Var.f48905f == null)) {
            e1Var = new C7282e1(e1Var.f48900a, e1Var.f48901b, e1Var.f48902c, e1Var.f48903d, (String) null, (String) null, e1Var.f48906g, (String) null);
        }
        C6620s.l(context);
        C6620s.l(context.getApplicationContext());
        if (f49863J == null) {
            synchronized (P2.class) {
                try {
                    if (f49863J == null) {
                        f49863J = new P2(new C7684s3(context, e1Var, l10));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } else if (!(e1Var == null || (bundle = e1Var.f48906g) == null || !bundle.containsKey("dataCollectionDefaultEnabled"))) {
            C6620s.l(f49863J);
            f49863J.j(e1Var.f48906g.getBoolean("dataCollectionDefaultEnabled"));
        }
        C6620s.l(f49863J);
        return f49863J;
    }

    private static void c(B1 b12) {
        if (b12 == null) {
            throw new IllegalStateException("Component not created");
        } else if (!b12.u()) {
            String valueOf = String.valueOf(b12.getClass());
            throw new IllegalStateException("Component not initialized: " + valueOf);
        }
    }

    private static void d(Z1 z12) {
        if (z12 == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    static /* synthetic */ void e(P2 p22, C7684s3 s3Var) {
        p22.q().k();
        E e10 = new E(p22);
        e10.n();
        p22.f49894v = e10;
        C7565b2 b2Var = new C7565b2(p22, s3Var.f50387f);
        b2Var.x();
        p22.f49895w = b2Var;
        C7579d2 d2Var = new C7579d2(p22);
        d2Var.x();
        p22.f49892t = d2Var;
        C7685s4 s4Var = new C7685s4(p22);
        s4Var.x();
        p22.f49893u = s4Var;
        p22.f49884l.o();
        p22.f49880h.o();
        p22.f49895w.y();
        C7616i4 i4Var = new C7616i4(p22);
        i4Var.x();
        p22.f49896x = i4Var;
        i4Var.y();
        p22.f().H().b("App measurement initialized, version", 114010L);
        p22.f().H().a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String E10 = b2Var.E();
        if (TextUtils.isEmpty(p22.f49874b)) {
            if (p22.M().C0(E10, p22.f49879g.T())) {
                p22.f().H().a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
            } else {
                C7614i2 H10 = p22.f().H();
                H10.a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app " + E10);
            }
        }
        p22.f().D().a("Debug-level message logging enabled");
        if (p22.f49869F != p22.f49871H.get()) {
            p22.f().E().c("Not all components initialized", Integer.valueOf(p22.f49869F), Integer.valueOf(p22.f49871H.get()));
        }
        p22.f49897y = true;
    }

    public static /* synthetic */ void g(P2 p22, String str, int i10, Throwable th2, byte[] bArr, Map map) {
        List<ResolveInfo> queryIntentActivities;
        if ((i10 == 200 || i10 == 204 || i10 == 304) && th2 == null) {
            p22.E().f50377v.a(true);
            if (bArr == null || bArr.length == 0) {
                p22.f().D().a("Deferred Deep Link response empty.");
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(new String(bArr));
                String optString = jSONObject.optString(Constants.DEEPLINK, "");
                if (TextUtils.isEmpty(optString)) {
                    p22.f().D().a("Deferred Deep Link is empty.");
                    return;
                }
                String optString2 = jSONObject.optString("gclid", "");
                String optString3 = jSONObject.optString("gbraid", "");
                String optString4 = jSONObject.optString("gad_source", "");
                double optDouble = jSONObject.optDouble("timestamp", 0.0d);
                Bundle bundle = new Bundle();
                Q5 M10 = p22.M();
                if (TextUtils.isEmpty(optString) || (queryIntentActivities = M10.zza().getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(optString)), 0)) == null || queryIntentActivities.isEmpty()) {
                    p22.f().J().d("Deferred Deep Link validation failed. gclid, gbraid, deep link", optString2, optString3, optString);
                    return;
                }
                if (!TextUtils.isEmpty(optString3)) {
                    bundle.putString("gbraid", optString3);
                }
                if (!TextUtils.isEmpty(optString4)) {
                    bundle.putString("gad_source", optString4);
                }
                bundle.putString("gclid", optString2);
                bundle.putString("_cis", "ddp");
                p22.f49888p.e1("auto", "_cmp", bundle);
                Q5 M11 = p22.M();
                if (!TextUtils.isEmpty(optString) && M11.g0(optString, optDouble)) {
                    M11.zza().sendBroadcast(new Intent("android.google.analytics.action.DEEPLINK_ACTION"));
                }
            } catch (JSONException e10) {
                p22.f().E().b("Failed to parse the Deferred Deep Link response. exception", e10);
            }
        } else {
            p22.f().J().c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i10), th2);
        }
    }

    private static void h(C7643m3 m3Var) {
        if (m3Var == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    private static void i(C7664p3 p3Var) {
        if (p3Var == null) {
            throw new IllegalStateException("Component not created");
        } else if (!p3Var.p()) {
            String valueOf = String.valueOf(p3Var.getClass());
            throw new IllegalStateException("Component not initialized: " + valueOf);
        }
    }

    public final C7565b2 A() {
        c(this.f49895w);
        return this.f49895w;
    }

    public final C7579d2 B() {
        c(this.f49892t);
        return this.f49892t;
    }

    public final C7586e2 C() {
        return this.f49885m;
    }

    public final C7607h2 D() {
        C7607h2 h2Var = this.f49881i;
        if (h2Var == null || !h2Var.p()) {
            return null;
        }
        return this.f49881i;
    }

    public final C7683s2 E() {
        h(this.f49880h);
        return this.f49880h;
    }

    /* access modifiers changed from: package-private */
    public final J2 F() {
        return this.f49882j;
    }

    public final C7691t3 G() {
        c(this.f49888p);
        return this.f49888p;
    }

    public final C7595f4 H() {
        i(this.f49890r);
        return this.f49890r;
    }

    public final C7616i4 I() {
        d(this.f49896x);
        return this.f49896x;
    }

    public final C7644m4 J() {
        c(this.f49887o);
        return this.f49887o;
    }

    public final C7685s4 K() {
        c(this.f49893u);
        return this.f49893u;
    }

    public final C7575c5 L() {
        c(this.f49883k);
        return this.f49883k;
    }

    public final Q5 M() {
        h(this.f49884l);
        return this.f49884l;
    }

    public final String N() {
        return this.f49874b;
    }

    public final String O() {
        return this.f49875c;
    }

    public final String P() {
        return this.f49876d;
    }

    public final String Q() {
        return this.f49891s;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0118, code lost:
        if (r4.y() != false) goto L_0x011c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(com.google.android.gms.internal.measurement.C7282e1 r12) {
        /*
            r11 = this;
            com.google.android.gms.measurement.internal.J2 r0 = r11.q()
            r0.k()
            com.google.android.gms.measurement.internal.i r0 = r11.f49879g
            com.google.android.gms.measurement.internal.Y1<java.lang.Boolean> r1 = com.google.android.gms.measurement.internal.K.f49715M0
            boolean r0 = r0.r(r1)
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0021
            com.google.android.gms.measurement.internal.i4 r0 = r11.I()
            com.google.android.gms.internal.measurement.E2$a r0 = r0.B()
            com.google.android.gms.internal.measurement.E2$a r4 = com.google.android.gms.internal.measurement.E2.a.CLIENT_UPLOAD_ELIGIBLE
            if (r0 != r4) goto L_0x0021
            r0 = r3
            goto L_0x0022
        L_0x0021:
            r0 = r2
        L_0x0022:
            boolean r4 = com.google.android.gms.internal.measurement.C7297f7.a()
            if (r4 == 0) goto L_0x003c
            com.google.android.gms.measurement.internal.i r4 = r11.f49879g
            com.google.android.gms.measurement.internal.Y1<java.lang.Boolean> r5 = com.google.android.gms.measurement.internal.K.f49725R0
            boolean r4 = r4.r(r5)
            if (r4 == 0) goto L_0x003c
            com.google.android.gms.measurement.internal.Q5 r4 = r11.M()
            boolean r4 = r4.S0()
            if (r4 != 0) goto L_0x003e
        L_0x003c:
            if (r0 == 0) goto L_0x007a
        L_0x003e:
            com.google.android.gms.measurement.internal.Q5 r4 = r11.M()
            r4.k()
            android.content.IntentFilter r5 = new android.content.IntentFilter
            r5.<init>()
            java.lang.String r6 = "com.google.android.gms.measurement.TRIGGERS_AVAILABLE"
            r5.addAction(r6)
            com.google.android.gms.measurement.internal.i r6 = r4.a()
            boolean r1 = r6.r(r1)
            if (r1 == 0) goto L_0x005e
            java.lang.String r1 = "com.google.android.gms.measurement.BATCHES_AVAILABLE"
            r5.addAction(r1)
        L_0x005e:
            sa.n0 r1 = new sa.n0
            com.google.android.gms.measurement.internal.P2 r6 = r4.f50228a
            r1.<init>(r6)
            android.content.Context r6 = r4.zza()
            r7 = 2
            u2.C6012a.l(r6, r1, r5, r7)
            com.google.android.gms.measurement.internal.h2 r1 = r4.f()
            com.google.android.gms.measurement.internal.i2 r1 = r1.D()
            java.lang.String r4 = "Registered app receiver"
            r1.a(r4)
        L_0x007a:
            r1 = 0
            if (r0 == 0) goto L_0x0090
            com.google.android.gms.measurement.internal.i4 r0 = r11.I()
            com.google.android.gms.measurement.internal.Y1<java.lang.Long> r4 = com.google.android.gms.measurement.internal.K.f49796y
            java.lang.Object r4 = r4.a(r1)
            java.lang.Long r4 = (java.lang.Long) r4
            long r4 = r4.longValue()
            r0.A(r4)
        L_0x0090:
            com.google.android.gms.measurement.internal.s2 r0 = r11.E()
            com.google.android.gms.measurement.internal.q3 r0 = r0.K()
            int r4 = r0.b()
            com.google.android.gms.measurement.internal.i r5 = r11.f49879g
            java.lang.String r6 = "google_analytics_default_allow_ad_storage"
            sa.E r5 = r5.B(r6, r2)
            com.google.android.gms.measurement.internal.i r6 = r11.f49879g
            java.lang.String r7 = "google_analytics_default_allow_analytics_storage"
            sa.E r6 = r6.B(r7, r2)
            sa.E r7 = sa.E.UNINITIALIZED
            r8 = -10
            r9 = 30
            if (r5 != r7) goto L_0x00b6
            if (r6 == r7) goto L_0x00c5
        L_0x00b6:
            com.google.android.gms.measurement.internal.s2 r10 = r11.E()
            boolean r10 = r10.v(r8)
            if (r10 == 0) goto L_0x00c5
            com.google.android.gms.measurement.internal.q3 r4 = com.google.android.gms.measurement.internal.C7671q3.f(r5, r6, r8)
            goto L_0x011c
        L_0x00c5:
            com.google.android.gms.measurement.internal.b2 r5 = r11.A()
            java.lang.String r5 = r5.G()
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x00f0
            if (r4 == 0) goto L_0x00e3
            if (r4 == r9) goto L_0x00e3
            r5 = 10
            if (r4 == r5) goto L_0x00e3
            if (r4 == r9) goto L_0x00e3
            if (r4 == r9) goto L_0x00e3
            r5 = 40
            if (r4 != r5) goto L_0x00f0
        L_0x00e3:
            com.google.android.gms.measurement.internal.t3 r4 = r11.G()
            com.google.android.gms.measurement.internal.q3 r5 = new com.google.android.gms.measurement.internal.q3
            r5.<init>(r1, r1, r8)
            r4.P(r5, r2)
            goto L_0x011b
        L_0x00f0:
            com.google.android.gms.measurement.internal.b2 r4 = r11.A()
            java.lang.String r4 = r4.G()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L_0x011b
            if (r12 == 0) goto L_0x011b
            android.os.Bundle r4 = r12.f48906g
            if (r4 == 0) goto L_0x011b
            com.google.android.gms.measurement.internal.s2 r4 = r11.E()
            boolean r4 = r4.v(r9)
            if (r4 == 0) goto L_0x011b
            android.os.Bundle r4 = r12.f48906g
            com.google.android.gms.measurement.internal.q3 r4 = com.google.android.gms.measurement.internal.C7671q3.c(r4, r9)
            boolean r5 = r4.y()
            if (r5 == 0) goto L_0x011b
            goto L_0x011c
        L_0x011b:
            r4 = r1
        L_0x011c:
            if (r4 == 0) goto L_0x0126
            com.google.android.gms.measurement.internal.t3 r0 = r11.G()
            r0.P(r4, r3)
            r0 = r4
        L_0x0126:
            com.google.android.gms.measurement.internal.t3 r4 = r11.G()
            r4.O(r0)
            com.google.android.gms.measurement.internal.s2 r0 = r11.E()
            com.google.android.gms.measurement.internal.C r0 = r0.J()
            int r0 = r0.a()
            com.google.android.gms.measurement.internal.i r4 = r11.f49879g
            java.lang.String r5 = "google_analytics_default_allow_ad_personalization_signals"
            sa.E r4 = r4.B(r5, r3)
            if (r4 == r7) goto L_0x0150
            com.google.android.gms.measurement.internal.h2 r5 = r11.f()
            com.google.android.gms.measurement.internal.i2 r5 = r5.I()
            java.lang.String r6 = "Default ad personalization consent from Manifest"
            r5.b(r6, r4)
        L_0x0150:
            com.google.android.gms.measurement.internal.i r4 = r11.f49879g
            java.lang.String r5 = "google_analytics_default_allow_ad_user_data"
            sa.E r4 = r4.B(r5, r3)
            if (r4 == r7) goto L_0x016d
            boolean r5 = com.google.android.gms.measurement.internal.C7671q3.l(r8, r0)
            if (r5 == 0) goto L_0x016d
            com.google.android.gms.measurement.internal.t3 r12 = r11.G()
            com.google.android.gms.measurement.internal.C r0 = com.google.android.gms.measurement.internal.C.d(r4, r8)
            r12.N(r0, r3)
            goto L_0x01f0
        L_0x016d:
            com.google.android.gms.measurement.internal.b2 r4 = r11.A()
            java.lang.String r4 = r4.G()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L_0x018c
            if (r0 == 0) goto L_0x017f
            if (r0 != r9) goto L_0x018c
        L_0x017f:
            com.google.android.gms.measurement.internal.t3 r12 = r11.G()
            com.google.android.gms.measurement.internal.C r0 = new com.google.android.gms.measurement.internal.C
            r0.<init>(r1, r8)
            r12.N(r0, r3)
            goto L_0x01f0
        L_0x018c:
            com.google.android.gms.measurement.internal.b2 r4 = r11.A()
            java.lang.String r4 = r4.G()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L_0x01b9
            if (r12 == 0) goto L_0x01b9
            android.os.Bundle r4 = r12.f48906g
            if (r4 == 0) goto L_0x01b9
            boolean r0 = com.google.android.gms.measurement.internal.C7671q3.l(r9, r0)
            if (r0 == 0) goto L_0x01b9
            android.os.Bundle r0 = r12.f48906g
            com.google.android.gms.measurement.internal.C r0 = com.google.android.gms.measurement.internal.C.b(r0, r9)
            boolean r4 = r0.k()
            if (r4 == 0) goto L_0x01b9
            com.google.android.gms.measurement.internal.t3 r4 = r11.G()
            r4.N(r0, r3)
        L_0x01b9:
            com.google.android.gms.measurement.internal.b2 r0 = r11.A()
            java.lang.String r0 = r0.G()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x01f0
            if (r12 == 0) goto L_0x01f0
            android.os.Bundle r0 = r12.f48906g
            if (r0 == 0) goto L_0x01f0
            com.google.android.gms.measurement.internal.s2 r0 = r11.E()
            com.google.android.gms.measurement.internal.y2 r0 = r0.f50370o
            java.lang.String r0 = r0.a()
            if (r0 != 0) goto L_0x01f0
            android.os.Bundle r0 = r12.f48906g
            java.lang.Boolean r0 = com.google.android.gms.measurement.internal.C.e(r0)
            if (r0 == 0) goto L_0x01f0
            com.google.android.gms.measurement.internal.t3 r4 = r11.G()
            java.lang.String r12 = r12.f48904e
            java.lang.String r5 = "allow_personalized_ads"
            java.lang.String r0 = r0.toString()
            r4.m0(r12, r5, r0, r2)
        L_0x01f0:
            com.google.android.gms.measurement.internal.i r12 = r11.f49879g
            java.lang.String r0 = "google_analytics_tcf_data_enabled"
            java.lang.Boolean r12 = r12.E(r0)
            if (r12 != 0) goto L_0x01fc
            r12 = r3
            goto L_0x0200
        L_0x01fc:
            boolean r12 = r12.booleanValue()
        L_0x0200:
            if (r12 == 0) goto L_0x021d
            com.google.android.gms.measurement.internal.h2 r12 = r11.f()
            com.google.android.gms.measurement.internal.i2 r12 = r12.D()
            java.lang.String r0 = "TCF client enabled."
            r12.a(r0)
            com.google.android.gms.measurement.internal.t3 r12 = r11.G()
            r12.L0()
            com.google.android.gms.measurement.internal.t3 r12 = r11.G()
            r12.J0()
        L_0x021d:
            com.google.android.gms.measurement.internal.s2 r12 = r11.E()
            com.google.android.gms.measurement.internal.x2 r12 = r12.f50362g
            long r4 = r12.a()
            r6 = 0
            int r12 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r12 != 0) goto L_0x024b
            com.google.android.gms.measurement.internal.h2 r12 = r11.f()
            com.google.android.gms.measurement.internal.i2 r12 = r12.I()
            long r4 = r11.f49872I
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            java.lang.String r4 = "Persisting first open"
            r12.b(r4, r0)
            com.google.android.gms.measurement.internal.s2 r12 = r11.E()
            com.google.android.gms.measurement.internal.x2 r12 = r12.f50362g
            long r4 = r11.f49872I
            r12.b(r4)
        L_0x024b:
            com.google.android.gms.measurement.internal.t3 r12 = r11.G()
            com.google.android.gms.measurement.internal.W5 r12 = r12.f50420r
            r12.c()
            boolean r12 = r11.s()
            if (r12 != 0) goto L_0x02df
            boolean r12 = r11.o()
            if (r12 == 0) goto L_0x043f
            com.google.android.gms.measurement.internal.Q5 r12 = r11.M()
            java.lang.String r0 = "android.permission.INTERNET"
            boolean r12 = r12.D0(r0)
            if (r12 != 0) goto L_0x0279
            com.google.android.gms.measurement.internal.h2 r12 = r11.f()
            com.google.android.gms.measurement.internal.i2 r12 = r12.E()
            java.lang.String r0 = "App is missing INTERNET permission"
            r12.a(r0)
        L_0x0279:
            com.google.android.gms.measurement.internal.Q5 r12 = r11.M()
            java.lang.String r0 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r12 = r12.D0(r0)
            if (r12 != 0) goto L_0x0292
            com.google.android.gms.measurement.internal.h2 r12 = r11.f()
            com.google.android.gms.measurement.internal.i2 r12 = r12.E()
            java.lang.String r0 = "App is missing ACCESS_NETWORK_STATE permission"
            r12.a(r0)
        L_0x0292:
            android.content.Context r12 = r11.f49873a
            S9.b r12 = S9.c.a(r12)
            boolean r12 = r12.f()
            if (r12 != 0) goto L_0x02d0
            com.google.android.gms.measurement.internal.i r12 = r11.f49879g
            boolean r12 = r12.X()
            if (r12 != 0) goto L_0x02d0
            android.content.Context r12 = r11.f49873a
            boolean r12 = com.google.android.gms.measurement.internal.Q5.b0(r12)
            if (r12 != 0) goto L_0x02bb
            com.google.android.gms.measurement.internal.h2 r12 = r11.f()
            com.google.android.gms.measurement.internal.i2 r12 = r12.E()
            java.lang.String r0 = "AppMeasurementReceiver not registered/enabled"
            r12.a(r0)
        L_0x02bb:
            android.content.Context r12 = r11.f49873a
            boolean r12 = com.google.android.gms.measurement.internal.Q5.c0(r12, r2)
            if (r12 != 0) goto L_0x02d0
            com.google.android.gms.measurement.internal.h2 r12 = r11.f()
            com.google.android.gms.measurement.internal.i2 r12 = r12.E()
            java.lang.String r0 = "AppMeasurementService not registered/enabled"
            r12.a(r0)
        L_0x02d0:
            com.google.android.gms.measurement.internal.h2 r12 = r11.f()
            com.google.android.gms.measurement.internal.i2 r12 = r12.E()
            java.lang.String r0 = "Uploading is not possible. App measurement disabled"
            r12.a(r0)
            goto L_0x043f
        L_0x02df:
            com.google.android.gms.measurement.internal.b2 r12 = r11.A()
            java.lang.String r12 = r12.G()
            boolean r12 = android.text.TextUtils.isEmpty(r12)
            if (r12 == 0) goto L_0x02fb
            com.google.android.gms.measurement.internal.b2 r12 = r11.A()
            java.lang.String r12 = r12.D()
            boolean r12 = android.text.TextUtils.isEmpty(r12)
            if (r12 != 0) goto L_0x037b
        L_0x02fb:
            r11.M()
            com.google.android.gms.measurement.internal.b2 r12 = r11.A()
            java.lang.String r12 = r12.G()
            com.google.android.gms.measurement.internal.s2 r0 = r11.E()
            java.lang.String r0 = r0.Q()
            com.google.android.gms.measurement.internal.b2 r2 = r11.A()
            java.lang.String r2 = r2.D()
            com.google.android.gms.measurement.internal.s2 r4 = r11.E()
            java.lang.String r4 = r4.P()
            boolean r12 = com.google.android.gms.measurement.internal.Q5.k0(r12, r0, r2, r4)
            if (r12 == 0) goto L_0x035d
            com.google.android.gms.measurement.internal.h2 r12 = r11.f()
            com.google.android.gms.measurement.internal.i2 r12 = r12.H()
            java.lang.String r0 = "Rechecking which service to use due to a GMP App Id change"
            r12.a(r0)
            com.google.android.gms.measurement.internal.s2 r12 = r11.E()
            r12.A()
            com.google.android.gms.measurement.internal.d2 r12 = r11.B()
            r12.G()
            com.google.android.gms.measurement.internal.s4 r12 = r11.f49893u
            r12.e0()
            com.google.android.gms.measurement.internal.s4 r12 = r11.f49893u
            r12.d0()
            com.google.android.gms.measurement.internal.s2 r12 = r11.E()
            com.google.android.gms.measurement.internal.x2 r12 = r12.f50362g
            long r4 = r11.f49872I
            r12.b(r4)
            com.google.android.gms.measurement.internal.s2 r12 = r11.E()
            com.google.android.gms.measurement.internal.y2 r12 = r12.f50364i
            r12.b(r1)
        L_0x035d:
            com.google.android.gms.measurement.internal.s2 r12 = r11.E()
            com.google.android.gms.measurement.internal.b2 r0 = r11.A()
            java.lang.String r0 = r0.G()
            r12.G(r0)
            com.google.android.gms.measurement.internal.s2 r12 = r11.E()
            com.google.android.gms.measurement.internal.b2 r0 = r11.A()
            java.lang.String r0 = r0.D()
            r12.D(r0)
        L_0x037b:
            com.google.android.gms.measurement.internal.s2 r12 = r11.E()
            com.google.android.gms.measurement.internal.q3 r12 = r12.K()
            com.google.android.gms.measurement.internal.q3$a r0 = com.google.android.gms.measurement.internal.C7671q3.a.ANALYTICS_STORAGE
            boolean r12 = r12.m(r0)
            if (r12 != 0) goto L_0x0394
            com.google.android.gms.measurement.internal.s2 r12 = r11.E()
            com.google.android.gms.measurement.internal.y2 r12 = r12.f50364i
            r12.b(r1)
        L_0x0394:
            com.google.android.gms.measurement.internal.t3 r12 = r11.G()
            com.google.android.gms.measurement.internal.s2 r0 = r11.E()
            com.google.android.gms.measurement.internal.y2 r0 = r0.f50364i
            java.lang.String r0 = r0.a()
            r12.V0(r0)
            com.google.android.gms.measurement.internal.Q5 r12 = r11.M()
            boolean r12 = r12.T0()
            if (r12 != 0) goto L_0x03d5
            com.google.android.gms.measurement.internal.s2 r12 = r11.E()
            com.google.android.gms.measurement.internal.y2 r12 = r12.f50379x
            java.lang.String r12 = r12.a()
            boolean r12 = android.text.TextUtils.isEmpty(r12)
            if (r12 != 0) goto L_0x03d5
            com.google.android.gms.measurement.internal.h2 r12 = r11.f()
            com.google.android.gms.measurement.internal.i2 r12 = r12.J()
            java.lang.String r0 = "Remote config removed with active feature rollouts"
            r12.a(r0)
            com.google.android.gms.measurement.internal.s2 r12 = r11.E()
            com.google.android.gms.measurement.internal.y2 r12 = r12.f50379x
            r12.b(r1)
        L_0x03d5:
            com.google.android.gms.measurement.internal.b2 r12 = r11.A()
            java.lang.String r12 = r12.G()
            boolean r12 = android.text.TextUtils.isEmpty(r12)
            if (r12 == 0) goto L_0x03f1
            com.google.android.gms.measurement.internal.b2 r12 = r11.A()
            java.lang.String r12 = r12.D()
            boolean r12 = android.text.TextUtils.isEmpty(r12)
            if (r12 != 0) goto L_0x043f
        L_0x03f1:
            boolean r12 = r11.o()
            com.google.android.gms.measurement.internal.s2 r0 = r11.E()
            boolean r0 = r0.B()
            if (r0 != 0) goto L_0x0410
            com.google.android.gms.measurement.internal.i r0 = r11.f49879g
            boolean r0 = r0.W()
            if (r0 != 0) goto L_0x0410
            com.google.android.gms.measurement.internal.s2 r0 = r11.E()
            r2 = r12 ^ 1
            r0.E(r2)
        L_0x0410:
            if (r12 == 0) goto L_0x0419
            com.google.android.gms.measurement.internal.t3 r12 = r11.G()
            r12.E0()
        L_0x0419:
            com.google.android.gms.measurement.internal.c5 r12 = r11.L()
            com.google.android.gms.measurement.internal.l5 r12 = r12.f50096e
            r12.a()
            com.google.android.gms.measurement.internal.s4 r12 = r11.K()
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            r12.R(r0)
            com.google.android.gms.measurement.internal.s4 r12 = r11.K()
            com.google.android.gms.measurement.internal.s2 r0 = r11.E()
            com.google.android.gms.measurement.internal.u2 r0 = r0.f50357A
            android.os.Bundle r0 = r0.a()
            r12.B(r0)
        L_0x043f:
            boolean r12 = com.google.android.gms.internal.measurement.C7297f7.a()
            if (r12 == 0) goto L_0x04c0
            com.google.android.gms.measurement.internal.i r12 = r11.f49879g
            com.google.android.gms.measurement.internal.Y1<java.lang.Boolean> r0 = com.google.android.gms.measurement.internal.K.f49725R0
            boolean r12 = r12.r(r0)
            if (r12 == 0) goto L_0x04c0
            com.google.android.gms.measurement.internal.Q5 r12 = r11.M()
            boolean r12 = r12.S0()
            if (r12 == 0) goto L_0x04c0
            com.google.android.gms.measurement.internal.Y1<java.lang.Integer> r12 = com.google.android.gms.measurement.internal.K.f49785s0
            java.lang.Object r0 = r12.a(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            if (r0 <= 0) goto L_0x04ac
            java.lang.Object r12 = r12.a(r1)
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            long r0 = (long) r12
            r4 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r4
            java.util.Random r12 = new java.util.Random
            r12.<init>()
            r2 = 5000(0x1388, float:7.006E-42)
            int r12 = r12.nextInt(r2)
            long r4 = (long) r12
            long r0 = r0 + r4
            com.google.android.gms.common.util.e r12 = r11.f49886n
            long r4 = r12.c()
            long r0 = r0 - r4
            r4 = 500(0x1f4, double:2.47E-321)
            long r0 = java.lang.Math.max(r4, r0)
            int r12 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r12 <= 0) goto L_0x04a4
            com.google.android.gms.measurement.internal.h2 r12 = r11.f()
            com.google.android.gms.measurement.internal.i2 r12 = r12.I()
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            java.lang.String r4 = "Waiting to fetch trigger URIs until some time after boot. Delay in millis"
            r12.b(r4, r2)
        L_0x04a4:
            com.google.android.gms.measurement.internal.t3 r12 = r11.G()
            r12.a1(r0)
            goto L_0x04c0
        L_0x04ac:
            java.lang.Thread r12 = new java.lang.Thread
            com.google.android.gms.measurement.internal.t3 r0 = r11.G()
            java.util.Objects.requireNonNull(r0)
            com.google.android.gms.measurement.internal.O2 r1 = new com.google.android.gms.measurement.internal.O2
            r1.<init>(r0)
            r12.<init>(r1)
            r12.start()
        L_0x04c0:
            com.google.android.gms.measurement.internal.s2 r12 = r11.E()
            com.google.android.gms.measurement.internal.v2 r12 = r12.f50372q
            r12.a(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.P2.b(com.google.android.gms.internal.measurement.e1):void");
    }

    public final C7607h2 f() {
        i(this.f49881i);
        return this.f49881i;
    }

    /* access modifiers changed from: package-private */
    public final void j(boolean z10) {
        this.f49865B = Boolean.valueOf(z10);
    }

    /* access modifiers changed from: package-private */
    public final void k() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    /* access modifiers changed from: package-private */
    public final void l() {
        this.f49871H.incrementAndGet();
    }

    /* access modifiers changed from: package-private */
    public final void m() {
        this.f49869F++;
    }

    public final boolean n() {
        return this.f49865B != null && this.f49865B.booleanValue();
    }

    public final boolean o() {
        return w() == 0;
    }

    public final boolean p() {
        q().k();
        return this.f49868E;
    }

    public final J2 q() {
        i(this.f49882j);
        return this.f49882j;
    }

    public final boolean r() {
        return TextUtils.isEmpty(this.f49874b);
    }

    /* access modifiers changed from: protected */
    public final boolean s() {
        if (this.f49897y) {
            q().k();
            Boolean bool = this.f49898z;
            if (bool == null || this.f49864A == 0 || (bool != null && !bool.booleanValue() && Math.abs(this.f49886n.c() - this.f49864A) > 1000)) {
                this.f49864A = this.f49886n.c();
                boolean z10 = true;
                Boolean valueOf = Boolean.valueOf(M().D0("android.permission.INTERNET") && M().D0("android.permission.ACCESS_NETWORK_STATE") && (c.a(this.f49873a).f() || this.f49879g.X() || (Q5.b0(this.f49873a) && Q5.c0(this.f49873a, false))));
                this.f49898z = valueOf;
                if (valueOf.booleanValue()) {
                    if (!M().i0(A().G(), A().D()) && TextUtils.isEmpty(A().D())) {
                        z10 = false;
                    }
                    this.f49898z = Boolean.valueOf(z10);
                }
            }
            return this.f49898z.booleanValue();
        }
        throw new IllegalStateException("AppMeasurement is not initialized");
    }

    public final boolean t() {
        return this.f49877e;
    }

    public final boolean u() {
        q().k();
        i(H());
        String E10 = A().E();
        boolean z10 = false;
        if (!this.f49879g.U()) {
            f().I().a("ADID collection is disabled from Manifest. Skipping");
            return false;
        }
        Pair<String, Boolean> s10 = E().s(E10);
        if (((Boolean) s10.second).booleanValue() || TextUtils.isEmpty((CharSequence) s10.first)) {
            f().I().a("ADID unavailable to retrieve Deferred Deep Link. Skipping");
            return false;
        } else if (!H().u()) {
            f().J().a("Network is not available for Deferred Deep Link request. Skipping");
            return false;
        } else {
            StringBuilder sb2 = new StringBuilder();
            C7685s4 K10 = K();
            K10.k();
            K10.w();
            if (!K10.m0() || K10.h().F0() >= 234200) {
                C8750c r02 = G().r0();
                Bundle bundle = r02 != null ? r02.f56108a : null;
                int i10 = 1;
                if (bundle == null) {
                    int i11 = this.f49870G;
                    this.f49870G = i11 + 1;
                    if (i11 < 10) {
                        z10 = true;
                    }
                    f().D().b("Failed to retrieve DMA consent from the service, " + (z10 ? "Retrying." : "Skipping.") + " retryCount", Integer.valueOf(this.f49870G));
                    return z10;
                }
                C7671q3 c10 = C7671q3.c(bundle, 100);
                sb2.append("&gcs=");
                sb2.append(c10.u());
                C b10 = C.b(bundle, 100);
                sb2.append("&dma=");
                sb2.append(b10.h() == Boolean.FALSE ? 0 : 1);
                if (!TextUtils.isEmpty(b10.i())) {
                    sb2.append("&dma_cps=");
                    sb2.append(b10.i());
                }
                if (C.e(bundle) == Boolean.TRUE) {
                    i10 = 0;
                }
                sb2.append("&npa=");
                sb2.append(i10);
                f().I().b("Consent query parameters to Bow", sb2);
            }
            Q5 M10 = M();
            A();
            URL I10 = M10.I(114010, E10, (String) s10.first, E().f50378w.a() - 1, sb2.toString());
            if (I10 != null) {
                C7595f4 H10 = H();
                R2 r22 = new R2(this);
                H10.m();
                C6620s.l(I10);
                C6620s.l(r22);
                H10.q().x(new C7609h4(H10, E10, I10, (byte[]) null, (Map<String, String>) null, r22));
            }
            return false;
        }
    }

    public final void v(boolean z10) {
        q().k();
        this.f49868E = z10;
    }

    public final int w() {
        q().k();
        if (this.f49879g.W()) {
            return 1;
        }
        Boolean bool = this.f49867D;
        if (bool != null && bool.booleanValue()) {
            return 2;
        }
        if (!p()) {
            return 8;
        }
        Boolean N10 = E().N();
        if (N10 != null) {
            return N10.booleanValue() ? 0 : 3;
        }
        Boolean E10 = this.f49879g.E("firebase_analytics_collection_enabled");
        if (E10 != null) {
            return E10.booleanValue() ? 0 : 4;
        }
        Boolean bool2 = this.f49866C;
        return bool2 != null ? bool2.booleanValue() ? 0 : 5 : (this.f49865B == null || this.f49865B.booleanValue()) ? 0 : 7;
    }

    public final C7555a x() {
        d(this.f49889q);
        return this.f49889q;
    }

    public final C7611i y() {
        return this.f49879g;
    }

    public final E z() {
        i(this.f49894v);
        return this.f49894v;
    }

    public final Context zza() {
        return this.f49873a;
    }

    public final e zzb() {
        return this.f49886n;
    }

    public final C7590f zzd() {
        return this.f49878f;
    }
}
