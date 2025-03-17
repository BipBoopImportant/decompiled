package oE;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import javax.net.ssl.SSLSocketFactory;
import pE.C14919d;

/* renamed from: oE.f  reason: case insensitive filesystem */
public class C14883f {

    /* renamed from: t  reason: collision with root package name */
    public static boolean f130038t = false;

    /* renamed from: u  reason: collision with root package name */
    private static C14883f f130039u;

    /* renamed from: v  reason: collision with root package name */
    private static final Object f130040v = new Object();

    /* renamed from: a  reason: collision with root package name */
    private final int f130041a;

    /* renamed from: b  reason: collision with root package name */
    private final int f130042b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f130043c;

    /* renamed from: d  reason: collision with root package name */
    private final long f130044d;

    /* renamed from: e  reason: collision with root package name */
    private final int f130045e;

    /* renamed from: f  reason: collision with root package name */
    private int f130046f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f130047g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f130048h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f130049i;

    /* renamed from: j  reason: collision with root package name */
    private String f130050j;

    /* renamed from: k  reason: collision with root package name */
    private String f130051k;

    /* renamed from: l  reason: collision with root package name */
    private String f130052l;

    /* renamed from: m  reason: collision with root package name */
    private String f130053m;

    /* renamed from: n  reason: collision with root package name */
    private int f130054n;

    /* renamed from: o  reason: collision with root package name */
    private final String f130055o;

    /* renamed from: p  reason: collision with root package name */
    private final int f130056p;

    /* renamed from: q  reason: collision with root package name */
    private final int f130057q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f130058r;

    /* renamed from: s  reason: collision with root package name */
    private SSLSocketFactory f130059s;

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0156  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    C14883f(android.os.Bundle r5, android.content.Context r6) {
        /*
            r4 = this;
            java.lang.String r6 = "MixpanelAPI.Conf"
            r4.<init>()
            r0 = 0
            java.lang.String r1 = "TLS"
            javax.net.ssl.SSLContext r1 = javax.net.ssl.SSLContext.getInstance(r1)     // Catch:{ GeneralSecurityException -> 0x0014 }
            r1.init(r0, r0, r0)     // Catch:{ GeneralSecurityException -> 0x0014 }
            javax.net.ssl.SSLSocketFactory r0 = r1.getSocketFactory()     // Catch:{ GeneralSecurityException -> 0x0014 }
            goto L_0x001a
        L_0x0014:
            r1 = move-exception
            java.lang.String r2 = "System has no SSL support. Built-in events editor will not be available"
            pE.C14918c.f(r6, r2, r1)
        L_0x001a:
            r4.f130059s = r0
            java.lang.String r0 = "com.mixpanel.android.MPConfig.EnableDebugLogging"
            r1 = 0
            boolean r0 = r5.getBoolean(r0, r1)
            f130038t = r0
            if (r0 == 0) goto L_0x002b
            r0 = 2
            pE.C14918c.g(r0)
        L_0x002b:
            java.lang.String r0 = "com.mixpanel.android.MPConfig.DebugFlushInterval"
            boolean r0 = r5.containsKey(r0)
            if (r0 == 0) goto L_0x0038
            java.lang.String r0 = "We do not support com.mixpanel.android.MPConfig.DebugFlushInterval anymore. There will only be one flush interval. Please, update your AndroidManifest.xml."
            pE.C14918c.k(r6, r0)
        L_0x0038:
            java.lang.String r0 = "com.mixpanel.android.MPConfig.BulkUploadLimit"
            r2 = 40
            int r0 = r5.getInt(r0, r2)
            r4.f130041a = r0
            java.lang.String r0 = "com.mixpanel.android.MPConfig.FlushInterval"
            r2 = 60000(0xea60, float:8.4078E-41)
            int r0 = r5.getInt(r0, r2)
            r4.f130042b = r0
            java.lang.String r0 = "com.mixpanel.android.MPConfig.FlushBatchSize"
            r2 = 50
            int r0 = r5.getInt(r0, r2)
            r4.f130054n = r0
            java.lang.String r0 = "com.mixpanel.android.MPConfig.FlushOnBackground"
            r2 = 1
            boolean r0 = r5.getBoolean(r0, r2)
            r4.f130043c = r0
            java.lang.String r0 = "com.mixpanel.android.MPConfig.MinimumDatabaseLimit"
            r3 = 20971520(0x1400000, float:3.526483E-38)
            int r0 = r5.getInt(r0, r3)
            r4.f130045e = r0
            java.lang.String r0 = "com.mixpanel.android.MPConfig.MaximumDatabaseLimit"
            r3 = 2147483647(0x7fffffff, float:NaN)
            int r0 = r5.getInt(r0, r3)
            r4.f130046f = r0
            java.lang.String r0 = "com.mixpanel.android.MPConfig.ResourcePackageName"
            java.lang.String r0 = r5.getString(r0)
            r4.f130055o = r0
            java.lang.String r0 = "com.mixpanel.android.MPConfig.DisableDecideChecker"
            boolean r0 = r5.getBoolean(r0, r1)
            r4.f130047g = r0
            java.lang.String r0 = "com.mixpanel.android.MPConfig.DisableAppOpenEvent"
            boolean r0 = r5.getBoolean(r0, r2)
            r4.f130048h = r0
            java.lang.String r0 = "com.mixpanel.android.MPConfig.DisableExceptionHandler"
            boolean r0 = r5.getBoolean(r0, r1)
            r4.f130049i = r0
            java.lang.String r0 = "com.mixpanel.android.MPConfig.MinimumSessionDuration"
            r1 = 10000(0x2710, float:1.4013E-41)
            int r0 = r5.getInt(r0, r1)
            r4.f130056p = r0
            java.lang.String r0 = "com.mixpanel.android.MPConfig.SessionTimeoutDuration"
            int r0 = r5.getInt(r0, r3)
            r4.f130057q = r0
            java.lang.String r0 = "com.mixpanel.android.MPConfig.UseIpAddressForGeolocation"
            boolean r1 = r5.getBoolean(r0, r2)
            r4.f130058r = r1
            java.lang.String r1 = "com.mixpanel.android.MPConfig.DataExpiration"
            java.lang.Object r1 = r5.get(r1)
            if (r1 == 0) goto L_0x00f1
            boolean r2 = r1 instanceof java.lang.Integer     // Catch:{ Exception -> 0x00c3 }
            if (r2 == 0) goto L_0x00c5
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ Exception -> 0x00c3 }
            int r1 = r1.intValue()     // Catch:{ Exception -> 0x00c3 }
            long r1 = (long) r1     // Catch:{ Exception -> 0x00c3 }
            goto L_0x00f4
        L_0x00c3:
            r1 = move-exception
            goto L_0x00ec
        L_0x00c5:
            boolean r2 = r1 instanceof java.lang.Float     // Catch:{ Exception -> 0x00c3 }
            if (r2 == 0) goto L_0x00d1
            java.lang.Float r1 = (java.lang.Float) r1     // Catch:{ Exception -> 0x00c3 }
            float r1 = r1.floatValue()     // Catch:{ Exception -> 0x00c3 }
            long r1 = (long) r1     // Catch:{ Exception -> 0x00c3 }
            goto L_0x00f4
        L_0x00d1:
            java.lang.NumberFormatException r2 = new java.lang.NumberFormatException     // Catch:{ Exception -> 0x00c3 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00c3 }
            r3.<init>()     // Catch:{ Exception -> 0x00c3 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x00c3 }
            r3.append(r1)     // Catch:{ Exception -> 0x00c3 }
            java.lang.String r1 = " is not a number."
            r3.append(r1)     // Catch:{ Exception -> 0x00c3 }
            java.lang.String r1 = r3.toString()     // Catch:{ Exception -> 0x00c3 }
            r2.<init>(r1)     // Catch:{ Exception -> 0x00c3 }
            throw r2     // Catch:{ Exception -> 0x00c3 }
        L_0x00ec:
            java.lang.String r2 = "Error parsing com.mixpanel.android.MPConfig.DataExpiration meta-data value"
            pE.C14918c.d(r6, r2, r1)
        L_0x00f1:
            r1 = 432000000(0x19bfcc00, double:2.13436359E-315)
        L_0x00f4:
            r4.f130044d = r1
            boolean r0 = r5.containsKey(r0)
            java.lang.String r1 = "com.mixpanel.android.MPConfig.EventsEndpoint"
            java.lang.String r1 = r5.getString(r1)
            java.lang.String r2 = "https://api.mixpanel.com"
            if (r1 == 0) goto L_0x0113
            if (r0 != 0) goto L_0x0107
            goto L_0x010f
        L_0x0107:
            boolean r3 = r4.u()
            java.lang.String r1 = r4.g(r1, r3)
        L_0x010f:
            r4.y(r1)
            goto L_0x0116
        L_0x0113:
            r4.z(r2)
        L_0x0116:
            java.lang.String r1 = "com.mixpanel.android.MPConfig.PeopleEndpoint"
            java.lang.String r1 = r5.getString(r1)
            if (r1 == 0) goto L_0x012d
            if (r0 != 0) goto L_0x0121
            goto L_0x0129
        L_0x0121:
            boolean r3 = r4.u()
            java.lang.String r1 = r4.g(r1, r3)
        L_0x0129:
            r4.C(r1)
            goto L_0x0130
        L_0x012d:
            r4.D(r2)
        L_0x0130:
            java.lang.String r1 = "com.mixpanel.android.MPConfig.GroupsEndpoint"
            java.lang.String r1 = r5.getString(r1)
            if (r1 == 0) goto L_0x0147
            if (r0 != 0) goto L_0x013b
            goto L_0x0143
        L_0x013b:
            boolean r0 = r4.u()
            java.lang.String r1 = r4.g(r1, r0)
        L_0x0143:
            r4.A(r1)
            goto L_0x014a
        L_0x0147:
            r4.B(r2)
        L_0x014a:
            java.lang.String r0 = "com.mixpanel.android.MPConfig.DecideEndpoint"
            java.lang.String r5 = r5.getString(r0)
            if (r5 == 0) goto L_0x0156
            r4.w(r5)
            goto L_0x0159
        L_0x0156:
            r4.x(r2)
        L_0x0159:
            java.lang.String r5 = r4.toString()
            pE.C14918c.i(r6, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: oE.C14883f.<init>(android.os.Bundle, android.content.Context):void");
    }

    private void A(String str) {
        this.f130052l = str;
    }

    private void B(String str) {
        A(g(str + "/groups/", u()));
    }

    private void C(String str) {
        this.f130051k = str;
    }

    private void D(String str) {
        C(g(str + "/engage/", u()));
    }

    private String g(String str, boolean z10) {
        String str2 = "0";
        if (str.contains("?ip=")) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str.substring(0, str.indexOf("?ip=")));
            sb2.append("?ip=");
            if (z10) {
                str2 = "1";
            }
            sb2.append(str2);
            return sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str);
        sb3.append("?ip=");
        if (z10) {
            str2 = "1";
        }
        sb3.append(str2);
        return sb3.toString();
    }

    public static C14883f m(Context context) {
        synchronized (f130040v) {
            try {
                if (f130039u == null) {
                    f130039u = v(context.getApplicationContext());
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        return f130039u;
    }

    private boolean u() {
        return this.f130058r;
    }

    static C14883f v(Context context) {
        String packageName = context.getPackageName();
        try {
            Bundle bundle = context.getPackageManager().getApplicationInfo(packageName, 128).metaData;
            if (bundle == null) {
                bundle = new Bundle();
            }
            return new C14883f(bundle, context);
        } catch (PackageManager.NameNotFoundException e10) {
            throw new RuntimeException("Can't configure Mixpanel with package name " + packageName, e10);
        }
    }

    private void w(String str) {
        this.f130053m = str;
    }

    private void x(String str) {
        w(str + "/decide");
    }

    private void y(String str) {
        this.f130050j = str;
    }

    private void z(String str) {
        y(g(str + "/track/", u()));
    }

    public int a() {
        return this.f130041a;
    }

    public long b() {
        return this.f130044d;
    }

    public String c() {
        return this.f130053m;
    }

    public boolean d() {
        return this.f130048h;
    }

    public boolean e() {
        return this.f130047g;
    }

    public boolean f() {
        return this.f130049i;
    }

    public String h() {
        return this.f130050j;
    }

    public int i() {
        return this.f130054n;
    }

    public int j() {
        return this.f130042b;
    }

    public boolean k() {
        return this.f130043c;
    }

    public String l() {
        return this.f130052l;
    }

    public int n() {
        return this.f130046f;
    }

    public int o() {
        return this.f130045e;
    }

    public int p() {
        return this.f130056p;
    }

    public synchronized C14919d q() {
        return null;
    }

    public String r() {
        return this.f130051k;
    }

    public synchronized SSLSocketFactory s() {
        return this.f130059s;
    }

    public int t() {
        return this.f130057q;
    }

    public String toString() {
        return "Mixpanel (6.5.2) configured with:\n    BulkUploadLimit " + a() + "\n    FlushInterval " + j() + "\n    FlushInterval " + i() + "\n    DataExpiration " + b() + "\n    MinimumDatabaseLimit " + o() + "\n    MaximumDatabaseLimit " + n() + "\n    DisableAppOpenEvent " + d() + "\n    EnableDebugLogging " + f130038t + "\n    EventsEndpoint " + h() + "\n    PeopleEndpoint " + r() + "\n    DecideEndpoint " + c() + "\n    DisableDecideChecker " + e() + "\n    MinimumSessionDuration: " + p() + "\n    SessionTimeoutDuration: " + t() + "\n    DisableExceptionHandler: " + f() + "\n    FlushOnBackground: " + k();
    }
}
