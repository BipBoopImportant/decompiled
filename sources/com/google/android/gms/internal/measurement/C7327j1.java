package com.google.android.gms.internal.measurement;

import K9.C6620s;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.util.e;
import com.google.android.gms.common.util.h;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import sa.C8768v;
import sa.K;

/* renamed from: com.google.android.gms.internal.measurement.j1  reason: case insensitive filesystem */
public class C7327j1 {

    /* renamed from: j  reason: collision with root package name */
    private static volatile C7327j1 f48964j;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final String f48965a;

    /* renamed from: b  reason: collision with root package name */
    protected final e f48966b;

    /* renamed from: c  reason: collision with root package name */
    private final ExecutorService f48967c;

    /* renamed from: d  reason: collision with root package name */
    private final ra.a f48968d;

    /* renamed from: e  reason: collision with root package name */
    private final List<Pair<K, c>> f48969e;

    /* renamed from: f  reason: collision with root package name */
    private int f48970f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public boolean f48971g;

    /* renamed from: h  reason: collision with root package name */
    private String f48972h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public volatile Q0 f48973i;

    /* renamed from: com.google.android.gms.internal.measurement.j1$a */
    abstract class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final long f48974a;

        /* renamed from: b  reason: collision with root package name */
        final long f48975b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f48976c;

        a(C7327j1 j1Var) {
            this(true);
        }

        /* access modifiers changed from: package-private */
        public abstract void a();

        /* access modifiers changed from: protected */
        public void b() {
        }

        public void run() {
            if (C7327j1.this.f48971g) {
                b();
                return;
            }
            try {
                a();
            } catch (Exception e10) {
                C7327j1.this.q(e10, false, this.f48976c);
                b();
            }
        }

        a(boolean z10) {
            this.f48974a = C7327j1.this.f48966b.a();
            this.f48975b = C7327j1.this.f48966b.c();
            this.f48976c = z10;
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.j1$b */
    class b implements Application.ActivityLifecycleCallbacks {
        b() {
        }

        public final void onActivityCreated(Activity activity, Bundle bundle) {
            C7327j1.this.l(new N1(this, bundle, activity));
        }

        public final void onActivityDestroyed(Activity activity) {
            C7327j1.this.l(new S1(this, activity));
        }

        public final void onActivityPaused(Activity activity) {
            C7327j1.this.l(new O1(this, activity));
        }

        public final void onActivityResumed(Activity activity) {
            C7327j1.this.l(new P1(this, activity));
        }

        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            R0 r02 = new R0();
            C7327j1.this.l(new Q1(this, activity, r02));
            Bundle J32 = r02.J3(50);
            if (J32 != null) {
                bundle.putAll(J32);
            }
        }

        public final void onActivityStarted(Activity activity) {
            C7327j1.this.l(new M1(this, activity));
        }

        public final void onActivityStopped(Activity activity) {
            C7327j1.this.l(new R1(this, activity));
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.j1$c */
    static class c extends C7246a1 {

        /* renamed from: a  reason: collision with root package name */
        private final K f48979a;

        c(K k10) {
            this.f48979a = k10;
        }

        public final void P2(String str, String str2, Bundle bundle, long j10) {
            this.f48979a.a(str, str2, bundle, j10);
        }

        public final int zza() {
            return System.identityHashCode(this.f48979a);
        }
    }

    private C7327j1(Context context, String str, String str2, String str3, Bundle bundle) {
        if (str == null || !I(str2, str3)) {
            this.f48965a = "FA";
        } else {
            this.f48965a = str;
        }
        this.f48966b = h.d();
        boolean z10 = true;
        this.f48967c = J0.a().a(new C7418u1(this), 1);
        this.f48968d = new ra.a(this);
        this.f48969e = new ArrayList();
        if (!E(context) || P()) {
            if (!I(str2, str3)) {
                this.f48972h = "fa";
                if (str2 == null || str3 == null) {
                    if ((str2 == null) ^ (str3 != null ? false : z10)) {
                        Log.w(this.f48965a, "Specified origin or custom app id is null. Both parameters will be ignored.");
                    }
                } else {
                    Log.v(this.f48965a, "Deferring to Google Analytics for Firebase for event data collection. https://firebase.google.com/docs/analytics");
                }
            } else {
                this.f48972h = str2;
            }
            l(new C7354m1(this, str2, str3, context, bundle));
            Application application = (Application) context.getApplicationContext();
            if (application == null) {
                Log.w(this.f48965a, "Unable to register lifecycle notifications. Application null.");
            } else {
                application.registerActivityLifecycleCallbacks(new b());
            }
        } else {
            this.f48972h = null;
            this.f48971g = true;
            Log.w(this.f48965a, "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Remove this value or add Google Analytics for Firebase to resume data collection.");
        }
    }

    private static boolean E(Context context) {
        try {
            return new C8768v(context, C8768v.a(context)).b("google_app_id") != null;
        } catch (IllegalStateException unused) {
        }
    }

    /* access modifiers changed from: private */
    public final boolean I(String str, String str2) {
        return (str2 == null || str == null || P()) ? false : true;
    }

    private final boolean P() {
        try {
            Class.forName("com.google.firebase.analytics.FirebaseAnalytics", false, getClass().getClassLoader());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static C7327j1 e(Context context) {
        return f(context, (String) null, (String) null, (String) null, (Bundle) null);
    }

    public static C7327j1 f(Context context, String str, String str2, String str3, Bundle bundle) {
        C6620s.l(context);
        if (f48964j == null) {
            synchronized (C7327j1.class) {
                try {
                    if (f48964j == null) {
                        f48964j = new C7327j1(context, str, str2, str3, bundle);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f48964j;
    }

    /* access modifiers changed from: private */
    public final void l(a aVar) {
        this.f48967c.execute(aVar);
    }

    /* access modifiers changed from: private */
    public final void q(Exception exc, boolean z10, boolean z11) {
        this.f48971g |= z10;
        if (z10) {
            Log.w(this.f48965a, "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z11) {
            i(5, "Error with data collection. Data lost.", exc, (Object) null, (Object) null);
        }
        Log.w(this.f48965a, "Error with data collection. Data lost.", exc);
    }

    private final void u(String str, String str2, Bundle bundle, boolean z10, boolean z11, Long l10) {
        l(new L1(this, l10, str, str2, bundle, z10, z11));
    }

    public final ra.a A() {
        return this.f48968d;
    }

    public final void B(String str) {
        l(new C7426v1(this, str));
    }

    public final void C(String str, String str2) {
        v((String) null, str, str2, false);
    }

    public final void D(String str, String str2, Bundle bundle) {
        u(str, str2, bundle, true, true, (Long) null);
    }

    public final void F(Bundle bundle) {
        l(new C7410t1(this, bundle));
    }

    public final void G(String str) {
        l(new C7442x1(this, str));
    }

    public final void J(Bundle bundle) {
        l(new I1(this, bundle));
    }

    public final void K(String str) {
        l(new C7379p1(this, str));
    }

    public final String L() {
        R0 r02 = new R0();
        l(new B1(this, r02));
        return r02.M3(50);
    }

    public final String M() {
        R0 r02 = new R0();
        l(new C1(this, r02));
        return r02.M3(500);
    }

    public final String N() {
        R0 r02 = new R0();
        l(new E1(this, r02));
        return r02.M3(500);
    }

    public final String O() {
        R0 r02 = new R0();
        l(new C7450y1(this, r02));
        return r02.M3(500);
    }

    public final int a(String str) {
        R0 r02 = new R0();
        l(new H1(this, str, r02));
        Integer num = (Integer) R0.K3(r02.J3(10000), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    public final long b() {
        R0 r02 = new R0();
        l(new A1(this, r02));
        Long L32 = r02.L3(500);
        if (L32 != null) {
            return L32.longValue();
        }
        long nextLong = new Random(System.nanoTime() ^ this.f48966b.a()).nextLong();
        int i10 = this.f48970f + 1;
        this.f48970f = i10;
        return nextLong + ((long) i10);
    }

    /* access modifiers changed from: protected */
    public final Q0 c(Context context, boolean z10) {
        try {
            return T0.asInterface(DynamiteModule.e(context, DynamiteModule.f48096e, ModuleDescriptor.MODULE_ID).d("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
        } catch (DynamiteModule.a e10) {
            q(e10, true, false);
            return null;
        }
    }

    public final List<Bundle> g(String str, String str2) {
        R0 r02 = new R0();
        l(new C7387q1(this, str, str2, r02));
        List<Bundle> list = (List) R0.K3(r02.J3(5000), List.class);
        return list == null ? Collections.emptyList() : list;
    }

    public final Map<String, Object> h(String str, String str2, boolean z10) {
        R0 r02 = new R0();
        l(new F1(this, str, str2, z10, r02));
        Bundle J32 = r02.J3(5000);
        if (J32 == null || J32.size() == 0) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap(J32.size());
        for (String next : J32.keySet()) {
            Object obj = J32.get(next);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                hashMap.put(next, obj);
            }
        }
        return hashMap;
    }

    public final void i(int i10, String str, Object obj, Object obj2, Object obj3) {
        l(new G1(this, false, 5, str, obj, (Object) null, (Object) null));
    }

    public final void j(Activity activity, String str, String str2) {
        l(new C7402s1(this, C7309h1.x(activity), str, str2));
    }

    public final void k(Bundle bundle) {
        l(new C7371o1(this, bundle));
    }

    public final void p(Boolean bool) {
        l(new C7394r1(this, bool));
    }

    public final void r(Runnable runnable) {
        l(new C7434w1(this, runnable));
    }

    public final void s(String str, Bundle bundle) {
        u((String) null, str, bundle, false, true, (Long) null);
    }

    public final void t(String str, String str2, Bundle bundle) {
        l(new C7363n1(this, str, str2, bundle));
    }

    public final void v(String str, String str2, Object obj, boolean z10) {
        l(new C7345l1(this, str, str2, obj, z10));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003f, code lost:
        if (r4.f48973i == null) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r4.f48973i.registerOnMeasurementEventListener(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0046, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0047, code lost:
        android.util.Log.w(r4.f48965a, "Failed to register event listener on calling thread. Trying again on the dynamite thread.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004e, code lost:
        l(new com.google.android.gms.internal.measurement.K1(r4, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0056, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void w(sa.K r5) {
        /*
            r4 = this;
            K9.C6620s.l(r5)
            java.util.List<android.util.Pair<sa.K, com.google.android.gms.internal.measurement.j1$c>> r0 = r4.f48969e
            monitor-enter(r0)
            r1 = 0
        L_0x0007:
            java.util.List<android.util.Pair<sa.K, com.google.android.gms.internal.measurement.j1$c>> r2 = r4.f48969e     // Catch:{ all -> 0x0028 }
            int r2 = r2.size()     // Catch:{ all -> 0x0028 }
            if (r1 >= r2) goto L_0x002d
            java.util.List<android.util.Pair<sa.K, com.google.android.gms.internal.measurement.j1$c>> r2 = r4.f48969e     // Catch:{ all -> 0x0028 }
            java.lang.Object r2 = r2.get(r1)     // Catch:{ all -> 0x0028 }
            android.util.Pair r2 = (android.util.Pair) r2     // Catch:{ all -> 0x0028 }
            java.lang.Object r2 = r2.first     // Catch:{ all -> 0x0028 }
            boolean r2 = r5.equals(r2)     // Catch:{ all -> 0x0028 }
            if (r2 == 0) goto L_0x002a
            java.lang.String r5 = r4.f48965a     // Catch:{ all -> 0x0028 }
            java.lang.String r1 = "OnEventListener already registered."
            android.util.Log.w(r5, r1)     // Catch:{ all -> 0x0028 }
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            return
        L_0x0028:
            r5 = move-exception
            goto L_0x0057
        L_0x002a:
            int r1 = r1 + 1
            goto L_0x0007
        L_0x002d:
            com.google.android.gms.internal.measurement.j1$c r1 = new com.google.android.gms.internal.measurement.j1$c     // Catch:{ all -> 0x0028 }
            r1.<init>(r5)     // Catch:{ all -> 0x0028 }
            java.util.List<android.util.Pair<sa.K, com.google.android.gms.internal.measurement.j1$c>> r2 = r4.f48969e     // Catch:{ all -> 0x0028 }
            android.util.Pair r3 = new android.util.Pair     // Catch:{ all -> 0x0028 }
            r3.<init>(r5, r1)     // Catch:{ all -> 0x0028 }
            r2.add(r3)     // Catch:{ all -> 0x0028 }
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            com.google.android.gms.internal.measurement.Q0 r5 = r4.f48973i
            if (r5 == 0) goto L_0x004e
            com.google.android.gms.internal.measurement.Q0 r5 = r4.f48973i     // Catch:{ BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException -> 0x0047 }
            r5.registerOnMeasurementEventListener(r1)     // Catch:{ BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException -> 0x0047 }
            return
        L_0x0047:
            java.lang.String r5 = r4.f48965a
            java.lang.String r0 = "Failed to register event listener on calling thread. Trying again on the dynamite thread."
            android.util.Log.w(r5, r0)
        L_0x004e:
            com.google.android.gms.internal.measurement.K1 r5 = new com.google.android.gms.internal.measurement.K1
            r5.<init>(r4, r1)
            r4.l(r5)
            return
        L_0x0057:
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C7327j1.w(sa.K):void");
    }

    public final void x(boolean z10) {
        l(new J1(this, z10));
    }
}
