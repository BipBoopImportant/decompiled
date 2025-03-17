package com.google.android.gms.measurement.internal;

import K9.C6620s;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.util.e;
import com.google.android.gms.internal.measurement.C7309h1;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.measurement.internal.m4  reason: case insensitive filesystem */
public final class C7644m4 extends B1 {

    /* renamed from: c  reason: collision with root package name */
    private volatile C7630k4 f50229c;

    /* renamed from: d  reason: collision with root package name */
    private volatile C7630k4 f50230d;

    /* renamed from: e  reason: collision with root package name */
    protected C7630k4 f50231e;

    /* renamed from: f  reason: collision with root package name */
    private final Map<Integer, C7630k4> f50232f = new ConcurrentHashMap();

    /* renamed from: g  reason: collision with root package name */
    private C7309h1 f50233g;

    /* renamed from: h  reason: collision with root package name */
    private volatile boolean f50234h;

    /* renamed from: i  reason: collision with root package name */
    private volatile C7630k4 f50235i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public C7630k4 f50236j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f50237k;

    /* renamed from: l  reason: collision with root package name */
    private final Object f50238l = new Object();

    public C7644m4(P2 p22) {
        super(p22);
    }

    /* access modifiers changed from: private */
    public final void G(C7630k4 k4Var, C7630k4 k4Var2, long j10, boolean z10, Bundle bundle) {
        Bundle bundle2;
        long j11;
        C7630k4 k4Var3 = k4Var;
        C7630k4 k4Var4 = k4Var2;
        long j12 = j10;
        Bundle bundle3 = bundle;
        k();
        boolean z11 = false;
        boolean z12 = k4Var4 == null || k4Var4.f50212c != k4Var3.f50212c || !Objects.equals(k4Var4.f50211b, k4Var3.f50211b) || !Objects.equals(k4Var4.f50210a, k4Var3.f50210a);
        if (z10 && this.f50231e != null) {
            z11 = true;
        }
        if (z12) {
            if (bundle3 == null) {
                bundle2 = new Bundle();
            }
            Bundle bundle4 = bundle2;
            Q5.V(k4Var3, bundle4, true);
            if (k4Var4 != null) {
                String str = k4Var4.f50210a;
                if (str != null) {
                    bundle4.putString("_pn", str);
                }
                String str2 = k4Var4.f50211b;
                if (str2 != null) {
                    bundle4.putString("_pc", str2);
                }
                bundle4.putLong("_pi", k4Var4.f50212c);
            }
            if (z11) {
                long a10 = t().f50097f.a(j12);
                if (a10 > 0) {
                    h().K(bundle4, a10);
                }
            }
            if (!a().V()) {
                bundle4.putLong("_mst", 1);
            }
            String str3 = k4Var3.f50214e ? "app" : "auto";
            long a11 = zzb().a();
            if (k4Var3.f50214e) {
                long j13 = k4Var3.f50215f;
                if (j13 != 0) {
                    j11 = j13;
                    o().f0(str3, "_vs", j11, bundle4);
                }
            }
            j11 = a11;
            o().f0(str3, "_vs", j11, bundle4);
        }
        if (z11) {
            H(this.f50231e, true, j12);
        }
        this.f50231e = k4Var3;
        if (k4Var3.f50214e) {
            this.f50236j = k4Var3;
        }
        s().J(k4Var3);
    }

    /* access modifiers changed from: private */
    public final void H(C7630k4 k4Var, boolean z10, long j10) {
        l().u(zzb().c());
        if (t().D(k4Var != null && k4Var.f50213d, z10, j10) && k4Var != null) {
            k4Var.f50213d = false;
        }
    }

    static /* synthetic */ void I(C7644m4 m4Var, Bundle bundle, C7630k4 k4Var, C7630k4 k4Var2, long j10) {
        if (bundle != null) {
            bundle.remove("screen_name");
            bundle.remove("screen_class");
        }
        m4Var.G(k4Var, k4Var2, j10, true, m4Var.h().D((String) null, "screen_view", bundle, (List<String>) null, false));
    }

    private final void M(String str, C7630k4 k4Var, boolean z10) {
        C7630k4 k4Var2;
        String str2 = str;
        C7630k4 k4Var3 = k4Var;
        C7630k4 k4Var4 = this.f50229c == null ? this.f50230d : this.f50229c;
        if (k4Var3.f50211b == null) {
            k4Var2 = new C7630k4(k4Var3.f50210a, str2 != null ? c(str2, "Activity") : null, k4Var3.f50212c, k4Var3.f50214e, k4Var3.f50215f);
        } else {
            k4Var2 = k4Var3;
        }
        this.f50230d = this.f50229c;
        this.f50229c = k4Var2;
        q().B(new C7665p4(this, k4Var2, k4Var4, zzb().c(), z10));
    }

    private final C7630k4 R(C7309h1 h1Var) {
        C6620s.l(h1Var);
        C7630k4 k4Var = this.f50232f.get(Integer.valueOf(h1Var.f48933a));
        if (k4Var == null) {
            C7630k4 k4Var2 = new C7630k4((String) null, c(h1Var.f48934b, "Activity"), h().N0());
            this.f50232f.put(Integer.valueOf(h1Var.f48933a), k4Var2);
            k4Var = k4Var2;
        }
        return this.f50235i != null ? this.f50235i : k4Var;
    }

    private final String c(String str, String str2) {
        if (str == null) {
            return str2;
        }
        String[] split = str.split("\\.");
        String str3 = split.length > 0 ? split[split.length - 1] : "";
        return str3.length() > a().o((String) null, false) ? str3.substring(0, a().o((String) null, false)) : str3;
    }

    public final C7630k4 B(boolean z10) {
        w();
        k();
        if (!z10) {
            return this.f50231e;
        }
        C7630k4 k4Var = this.f50231e;
        return k4Var != null ? k4Var : this.f50236j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00c7, code lost:
        r1 = f().I();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00d1, code lost:
        if (r10 != null) goto L_0x00d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00d3, code lost:
        r3 = "null";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00d6, code lost:
        r3 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00d7, code lost:
        if (r11 != null) goto L_0x00dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00d9, code lost:
        r4 = "null";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00dc, code lost:
        r4 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00dd, code lost:
        r1.c("Logging screen view with name, class", r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00e2, code lost:
        if (r8.f50229c != null) goto L_0x00e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00e4, code lost:
        r1 = r8.f50230d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00e6, code lost:
        r5 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00e8, code lost:
        r1 = r8.f50229c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00eb, code lost:
        r9 = new com.google.android.gms.measurement.internal.C7630k4(r10, r11, h().N0(), true, r19);
        r8.f50229c = r9;
        r8.f50230d = r5;
        r8.f50235i = r9;
        q().B(new com.google.android.gms.measurement.internal.C7637l4(r17, r18, r9, r5, zzb().c()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x011b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void C(android.os.Bundle r18, long r19) {
        /*
            r17 = this;
            r8 = r17
            r0 = r18
            java.lang.Object r1 = r8.f50238l
            monitor-enter(r1)
            boolean r2 = r8.f50237k     // Catch:{ all -> 0x001a }
            if (r2 != 0) goto L_0x001d
            com.google.android.gms.measurement.internal.h2 r0 = r17.f()     // Catch:{ all -> 0x001a }
            com.google.android.gms.measurement.internal.i2 r0 = r0.K()     // Catch:{ all -> 0x001a }
            java.lang.String r2 = "Cannot log screen view event when the app is in the background."
            r0.a(r2)     // Catch:{ all -> 0x001a }
            monitor-exit(r1)     // Catch:{ all -> 0x001a }
            return
        L_0x001a:
            r0 = move-exception
            goto L_0x011c
        L_0x001d:
            r2 = 0
            r3 = 0
            if (r0 == 0) goto L_0x008a
            java.lang.String r4 = "screen_name"
            java.lang.String r4 = r0.getString(r4)     // Catch:{ all -> 0x001a }
            if (r4 == 0) goto L_0x0054
            int r5 = r4.length()     // Catch:{ all -> 0x001a }
            if (r5 <= 0) goto L_0x003d
            int r5 = r4.length()     // Catch:{ all -> 0x001a }
            com.google.android.gms.measurement.internal.i r6 = r17.a()     // Catch:{ all -> 0x001a }
            int r6 = r6.o(r3, r2)     // Catch:{ all -> 0x001a }
            if (r5 <= r6) goto L_0x0054
        L_0x003d:
            com.google.android.gms.measurement.internal.h2 r0 = r17.f()     // Catch:{ all -> 0x001a }
            com.google.android.gms.measurement.internal.i2 r0 = r0.K()     // Catch:{ all -> 0x001a }
            java.lang.String r2 = "Invalid screen name length for screen view. Length"
            int r3 = r4.length()     // Catch:{ all -> 0x001a }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x001a }
            r0.b(r2, r3)     // Catch:{ all -> 0x001a }
            monitor-exit(r1)     // Catch:{ all -> 0x001a }
            return
        L_0x0054:
            java.lang.String r5 = "screen_class"
            java.lang.String r5 = r0.getString(r5)     // Catch:{ all -> 0x001a }
            if (r5 == 0) goto L_0x0087
            int r6 = r5.length()     // Catch:{ all -> 0x001a }
            if (r6 <= 0) goto L_0x0070
            int r6 = r5.length()     // Catch:{ all -> 0x001a }
            com.google.android.gms.measurement.internal.i r7 = r17.a()     // Catch:{ all -> 0x001a }
            int r3 = r7.o(r3, r2)     // Catch:{ all -> 0x001a }
            if (r6 <= r3) goto L_0x0087
        L_0x0070:
            com.google.android.gms.measurement.internal.h2 r0 = r17.f()     // Catch:{ all -> 0x001a }
            com.google.android.gms.measurement.internal.i2 r0 = r0.K()     // Catch:{ all -> 0x001a }
            java.lang.String r2 = "Invalid screen class length for screen view. Length"
            int r3 = r5.length()     // Catch:{ all -> 0x001a }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x001a }
            r0.b(r2, r3)     // Catch:{ all -> 0x001a }
            monitor-exit(r1)     // Catch:{ all -> 0x001a }
            return
        L_0x0087:
            r10 = r4
            r3 = r5
            goto L_0x008b
        L_0x008a:
            r10 = r3
        L_0x008b:
            if (r3 != 0) goto L_0x009c
            com.google.android.gms.internal.measurement.h1 r3 = r8.f50233g     // Catch:{ all -> 0x001a }
            if (r3 == 0) goto L_0x009a
            java.lang.String r3 = r3.f48934b     // Catch:{ all -> 0x001a }
            java.lang.String r4 = "Activity"
            java.lang.String r3 = r8.c(r3, r4)     // Catch:{ all -> 0x001a }
            goto L_0x009c
        L_0x009a:
            java.lang.String r3 = "Activity"
        L_0x009c:
            r11 = r3
            com.google.android.gms.measurement.internal.k4 r3 = r8.f50229c     // Catch:{ all -> 0x001a }
            boolean r4 = r8.f50234h     // Catch:{ all -> 0x001a }
            if (r4 == 0) goto L_0x00c6
            if (r3 == 0) goto L_0x00c6
            r8.f50234h = r2     // Catch:{ all -> 0x001a }
            java.lang.String r2 = r3.f50211b     // Catch:{ all -> 0x001a }
            boolean r2 = java.util.Objects.equals(r2, r11)     // Catch:{ all -> 0x001a }
            java.lang.String r3 = r3.f50210a     // Catch:{ all -> 0x001a }
            boolean r3 = java.util.Objects.equals(r3, r10)     // Catch:{ all -> 0x001a }
            if (r2 == 0) goto L_0x00c6
            if (r3 == 0) goto L_0x00c6
            com.google.android.gms.measurement.internal.h2 r0 = r17.f()     // Catch:{ all -> 0x001a }
            com.google.android.gms.measurement.internal.i2 r0 = r0.K()     // Catch:{ all -> 0x001a }
            java.lang.String r2 = "Ignoring call to log screen view event with duplicate parameters."
            r0.a(r2)     // Catch:{ all -> 0x001a }
            monitor-exit(r1)     // Catch:{ all -> 0x001a }
            return
        L_0x00c6:
            monitor-exit(r1)     // Catch:{ all -> 0x001a }
            com.google.android.gms.measurement.internal.h2 r1 = r17.f()
            com.google.android.gms.measurement.internal.i2 r1 = r1.I()
            java.lang.String r2 = "Logging screen view with name, class"
            if (r10 != 0) goto L_0x00d6
            java.lang.String r3 = "null"
            goto L_0x00d7
        L_0x00d6:
            r3 = r10
        L_0x00d7:
            if (r11 != 0) goto L_0x00dc
            java.lang.String r4 = "null"
            goto L_0x00dd
        L_0x00dc:
            r4 = r11
        L_0x00dd:
            r1.c(r2, r3, r4)
            com.google.android.gms.measurement.internal.k4 r1 = r8.f50229c
            if (r1 != 0) goto L_0x00e8
            com.google.android.gms.measurement.internal.k4 r1 = r8.f50230d
        L_0x00e6:
            r5 = r1
            goto L_0x00eb
        L_0x00e8:
            com.google.android.gms.measurement.internal.k4 r1 = r8.f50229c
            goto L_0x00e6
        L_0x00eb:
            com.google.android.gms.measurement.internal.k4 r4 = new com.google.android.gms.measurement.internal.k4
            com.google.android.gms.measurement.internal.Q5 r1 = r17.h()
            long r12 = r1.N0()
            r14 = 1
            r9 = r4
            r15 = r19
            r9.<init>(r10, r11, r12, r14, r15)
            r8.f50229c = r4
            r8.f50230d = r5
            r8.f50235i = r4
            com.google.android.gms.common.util.e r1 = r17.zzb()
            long r6 = r1.c()
            com.google.android.gms.measurement.internal.J2 r9 = r17.q()
            com.google.android.gms.measurement.internal.l4 r10 = new com.google.android.gms.measurement.internal.l4
            r1 = r10
            r2 = r17
            r3 = r18
            r1.<init>(r2, r3, r4, r5, r6)
            r9.B(r10)
            return
        L_0x011c:
            monitor-exit(r1)     // Catch:{ all -> 0x001a }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C7644m4.C(android.os.Bundle, long):void");
    }

    public final void D(C7309h1 h1Var) {
        synchronized (this.f50238l) {
            try {
                if (Objects.equals(this.f50233g, h1Var)) {
                    this.f50233g = null;
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        if (a().V()) {
            this.f50232f.remove(Integer.valueOf(h1Var.f48933a));
        }
    }

    public final void E(C7309h1 h1Var, Bundle bundle) {
        Bundle bundle2;
        if (a().V() && bundle != null && (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) != null) {
            this.f50232f.put(Integer.valueOf(h1Var.f48933a), new C7630k4(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id")));
        }
    }

    @Deprecated
    public final void F(C7309h1 h1Var, String str, String str2) {
        if (!a().V()) {
            f().K().a("setCurrentScreen cannot be called while screen reporting is disabled.");
            return;
        }
        C7630k4 k4Var = this.f50229c;
        if (k4Var == null) {
            f().K().a("setCurrentScreen cannot be called while no activity active");
        } else if (this.f50232f.get(Integer.valueOf(h1Var.f48933a)) == null) {
            f().K().a("setCurrentScreen must be called with an activity in the activity lifecycle");
        } else {
            if (str2 == null) {
                str2 = c(h1Var.f48934b, "Activity");
            }
            boolean equals = Objects.equals(k4Var.f50211b, str2);
            boolean equals2 = Objects.equals(k4Var.f50210a, str);
            if (equals && equals2) {
                f().K().a("setCurrentScreen cannot be called with the same class and name");
            } else if (str != null && (str.length() <= 0 || str.length() > a().o((String) null, false))) {
                f().K().b("Invalid screen name length in setCurrentScreen. Length", Integer.valueOf(str.length()));
            } else if (str2 == null || (str2.length() > 0 && str2.length() <= a().o((String) null, false))) {
                f().I().c("Setting current screen to name, class", str == null ? "null" : str, str2);
                C7630k4 k4Var2 = new C7630k4(str, str2, h().N0());
                this.f50232f.put(Integer.valueOf(h1Var.f48933a), k4Var2);
                M(h1Var.f48934b, k4Var2, true);
            } else {
                f().K().b("Invalid class name length in setCurrentScreen. Length", Integer.valueOf(str2.length()));
            }
        }
    }

    public final C7630k4 N() {
        return this.f50229c;
    }

    public final void O(C7309h1 h1Var) {
        synchronized (this.f50238l) {
            this.f50237k = false;
            this.f50234h = true;
        }
        long c10 = zzb().c();
        if (!a().V()) {
            this.f50229c = null;
            q().B(new C7678r4(this, c10));
            return;
        }
        C7630k4 R10 = R(h1Var);
        this.f50230d = this.f50229c;
        this.f50229c = null;
        q().B(new C7672q4(this, R10, c10));
    }

    public final void P(C7309h1 h1Var, Bundle bundle) {
        C7630k4 k4Var;
        if (a().V() && bundle != null && (k4Var = this.f50232f.get(Integer.valueOf(h1Var.f48933a))) != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("id", k4Var.f50212c);
            bundle2.putString("name", k4Var.f50210a);
            bundle2.putString("referrer_name", k4Var.f50211b);
            bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
        }
    }

    public final void Q(C7309h1 h1Var) {
        synchronized (this.f50238l) {
            this.f50237k = true;
            if (!Objects.equals(h1Var, this.f50233g)) {
                synchronized (this.f50238l) {
                    this.f50233g = h1Var;
                    this.f50234h = false;
                }
                if (a().V()) {
                    this.f50235i = null;
                    q().B(new C7692t4(this));
                }
            }
        }
        if (!a().V()) {
            this.f50229c = this.f50235i;
            q().B(new C7658o4(this));
            return;
        }
        M(h1Var.f48934b, R(h1Var), false);
        C7555a l10 = l();
        l10.q().B(new C7557a1(l10, l10.zzb().c()));
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
