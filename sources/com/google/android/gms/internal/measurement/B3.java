package com.google.android.gms.internal.measurement;

import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import jb.f;

public abstract class B3<T> {

    /* renamed from: h  reason: collision with root package name */
    private static final Object f48545h = new Object();

    /* renamed from: i  reason: collision with root package name */
    private static volatile J3 f48546i;

    /* renamed from: j  reason: collision with root package name */
    private static N3 f48547j = new N3(new C3());

    /* renamed from: k  reason: collision with root package name */
    private static final AtomicInteger f48548k = new AtomicInteger();

    /* renamed from: a  reason: collision with root package name */
    private final K3 f48549a;

    /* renamed from: b  reason: collision with root package name */
    private final String f48550b;

    /* renamed from: c  reason: collision with root package name */
    private Object f48551c;

    /* renamed from: d  reason: collision with root package name */
    private volatile int f48552d;

    /* renamed from: e  reason: collision with root package name */
    private volatile T f48553e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f48554f;

    /* renamed from: g  reason: collision with root package name */
    private volatile boolean f48555g;

    static {
        new AtomicReference();
    }

    static /* synthetic */ B3 a(K3 k32, String str, Boolean bool, boolean z10) {
        return new F3(k32, str, bool, true);
    }

    static /* synthetic */ B3 b(K3 k32, String str, Double d10, boolean z10) {
        return new I3(k32, str, d10, true);
    }

    static /* synthetic */ B3 c(K3 k32, String str, Long l10, boolean z10) {
        return new G3(k32, str, l10, true);
    }

    static /* synthetic */ B3 d(K3 k32, String str, String str2, boolean z10) {
        return new H3(k32, str, str2, true);
    }

    private final T f(J3 j32) {
        f<Context, Boolean> fVar;
        K3 k32 = this.f48549a;
        if (!k32.f48709e && ((fVar = k32.f48713i) == null || fVar.apply(j32.a()).booleanValue())) {
            C7420u3 a10 = C7420u3.a(j32.a());
            K3 k33 = this.f48549a;
            Object zza = a10.zza(k33.f48709e ? null : h(k33.f48707c));
            if (zza != null) {
                return g(zza);
            }
        }
        return null;
    }

    private final String h(String str) {
        if (str != null && str.isEmpty()) {
            return this.f48550b;
        }
        String str2 = this.f48550b;
        return str + str2;
    }

    private final T j(J3 j32) {
        Object zza;
        C7381p3 a10 = this.f48549a.f48706b != null ? C7460z3.b(j32.a(), this.f48549a.f48706b) ? this.f48549a.f48712h ? C7356m3.a(j32.a().getContentResolver(), C7452y3.a(C7452y3.b(j32.a(), this.f48549a.f48706b.getLastPathSegment())), new A3()) : C7356m3.a(j32.a().getContentResolver(), this.f48549a.f48706b, new A3()) : null : L3.b(j32.a(), this.f48549a.f48705a, new A3());
        if (a10 == null || (zza = a10.zza(k())) == null) {
            return null;
        }
        return g(zza);
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public static void l(android.content.Context r3) {
        /*
            com.google.android.gms.internal.measurement.J3 r0 = f48546i
            if (r0 != 0) goto L_0x004e
            if (r3 != 0) goto L_0x0007
            goto L_0x004e
        L_0x0007:
            java.lang.Object r0 = f48545h
            monitor-enter(r0)
            com.google.android.gms.internal.measurement.J3 r1 = f48546i     // Catch:{ all -> 0x0048 }
            if (r1 != 0) goto L_0x004a
            monitor-enter(r0)     // Catch:{ all -> 0x0048 }
            com.google.android.gms.internal.measurement.J3 r1 = f48546i     // Catch:{ all -> 0x0022 }
            android.content.Context r2 = r3.getApplicationContext()     // Catch:{ all -> 0x0022 }
            if (r2 != 0) goto L_0x0018
            goto L_0x0019
        L_0x0018:
            r3 = r2
        L_0x0019:
            if (r1 == 0) goto L_0x0024
            android.content.Context r2 = r1.a()     // Catch:{ all -> 0x0022 }
            if (r2 == r3) goto L_0x0044
            goto L_0x0024
        L_0x0022:
            r3 = move-exception
            goto L_0x0046
        L_0x0024:
            if (r1 == 0) goto L_0x002f
            com.google.android.gms.internal.measurement.C7356m3.d()     // Catch:{ all -> 0x0022 }
            com.google.android.gms.internal.measurement.L3.c()     // Catch:{ all -> 0x0022 }
            com.google.android.gms.internal.measurement.C7420u3.c()     // Catch:{ all -> 0x0022 }
        L_0x002f:
            com.google.android.gms.internal.measurement.D3 r1 = new com.google.android.gms.internal.measurement.D3     // Catch:{ all -> 0x0022 }
            r1.<init>(r3)     // Catch:{ all -> 0x0022 }
            jb.r r1 = jb.s.a(r1)     // Catch:{ all -> 0x0022 }
            com.google.android.gms.internal.measurement.j3 r2 = new com.google.android.gms.internal.measurement.j3     // Catch:{ all -> 0x0022 }
            r2.<init>(r3, r1)     // Catch:{ all -> 0x0022 }
            f48546i = r2     // Catch:{ all -> 0x0022 }
            java.util.concurrent.atomic.AtomicInteger r3 = f48548k     // Catch:{ all -> 0x0022 }
            r3.incrementAndGet()     // Catch:{ all -> 0x0022 }
        L_0x0044:
            monitor-exit(r0)     // Catch:{ all -> 0x0022 }
            goto L_0x004a
        L_0x0046:
            monitor-exit(r0)     // Catch:{ all -> 0x0022 }
            throw r3     // Catch:{ all -> 0x0048 }
        L_0x0048:
            r3 = move-exception
            goto L_0x004c
        L_0x004a:
            monitor-exit(r0)     // Catch:{ all -> 0x0048 }
            return
        L_0x004c:
            monitor-exit(r0)     // Catch:{ all -> 0x0048 }
            throw r3
        L_0x004e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.B3.l(android.content.Context):void");
    }

    public static void m() {
        f48548k.incrementAndGet();
    }

    static /* synthetic */ boolean n() {
        return true;
    }

    private final T o() {
        return this.f48551c;
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x0086 A[Catch:{ all -> 0x004e }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final T e() {
        /*
            r8 = this;
            boolean r0 = r8.f48554f
            if (r0 != 0) goto L_0x0011
            com.google.android.gms.internal.measurement.N3 r0 = f48547j
            java.lang.String r1 = r8.f48550b
            boolean r0 = r0.a(r1)
            java.lang.String r1 = "Attempt to access PhenotypeFlag not via codegen. All new PhenotypeFlags must be accessed through codegen APIs. If you believe you are seeing this error by mistake, you can add your flag to the exemption list located at //java/com/google/android/libraries/phenotype/client/lockdown/flags.textproto. Send the addition CL to ph-reviews@. See go/phenotype-android-codegen for information about generated code. See go/ph-lockdown for more information about this error."
            jb.l.p(r0, r1)
        L_0x0011:
            java.util.concurrent.atomic.AtomicInteger r0 = f48548k
            int r0 = r0.get()
            int r1 = r8.f48552d
            if (r1 >= r0) goto L_0x0099
            monitor-enter(r8)
            int r1 = r8.f48552d     // Catch:{ all -> 0x004e }
            if (r1 >= r0) goto L_0x0095
            com.google.android.gms.internal.measurement.J3 r1 = f48546i     // Catch:{ all -> 0x004e }
            jb.k r2 = jb.k.a()     // Catch:{ all -> 0x004e }
            r3 = 0
            if (r1 == 0) goto L_0x0050
            jb.r r2 = r1.b()     // Catch:{ all -> 0x004e }
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x004e }
            jb.k r2 = (jb.k) r2     // Catch:{ all -> 0x004e }
            boolean r4 = r2.c()     // Catch:{ all -> 0x004e }
            if (r4 == 0) goto L_0x0050
            java.lang.Object r3 = r2.b()     // Catch:{ all -> 0x004e }
            com.google.android.gms.internal.measurement.v3 r3 = (com.google.android.gms.internal.measurement.C7428v3) r3     // Catch:{ all -> 0x004e }
            com.google.android.gms.internal.measurement.K3 r4 = r8.f48549a     // Catch:{ all -> 0x004e }
            android.net.Uri r5 = r4.f48706b     // Catch:{ all -> 0x004e }
            java.lang.String r6 = r4.f48705a     // Catch:{ all -> 0x004e }
            java.lang.String r4 = r4.f48708d     // Catch:{ all -> 0x004e }
            java.lang.String r7 = r8.f48550b     // Catch:{ all -> 0x004e }
            java.lang.String r3 = r3.a(r5, r6, r4, r7)     // Catch:{ all -> 0x004e }
            goto L_0x0050
        L_0x004e:
            r0 = move-exception
            goto L_0x0097
        L_0x0050:
            if (r1 == 0) goto L_0x0054
            r4 = 1
            goto L_0x0055
        L_0x0054:
            r4 = 0
        L_0x0055:
            java.lang.String r5 = "Must call PhenotypeFlagInitializer.maybeInit() first"
            jb.l.p(r4, r5)     // Catch:{ all -> 0x004e }
            com.google.android.gms.internal.measurement.K3 r4 = r8.f48549a     // Catch:{ all -> 0x004e }
            boolean r4 = r4.f48710f     // Catch:{ all -> 0x004e }
            if (r4 == 0) goto L_0x006e
            java.lang.Object r4 = r8.f(r1)     // Catch:{ all -> 0x004e }
            if (r4 == 0) goto L_0x0067
            goto L_0x0080
        L_0x0067:
            java.lang.Object r4 = r8.j(r1)     // Catch:{ all -> 0x004e }
            if (r4 == 0) goto L_0x007c
            goto L_0x0080
        L_0x006e:
            java.lang.Object r4 = r8.j(r1)     // Catch:{ all -> 0x004e }
            if (r4 == 0) goto L_0x0075
            goto L_0x0080
        L_0x0075:
            java.lang.Object r4 = r8.f(r1)     // Catch:{ all -> 0x004e }
            if (r4 == 0) goto L_0x007c
            goto L_0x0080
        L_0x007c:
            java.lang.Object r4 = r8.o()     // Catch:{ all -> 0x004e }
        L_0x0080:
            boolean r1 = r2.c()     // Catch:{ all -> 0x004e }
            if (r1 == 0) goto L_0x0091
            if (r3 != 0) goto L_0x008d
            java.lang.Object r4 = r8.o()     // Catch:{ all -> 0x004e }
            goto L_0x0091
        L_0x008d:
            java.lang.Object r4 = r8.g(r3)     // Catch:{ all -> 0x004e }
        L_0x0091:
            r8.f48553e = r4     // Catch:{ all -> 0x004e }
            r8.f48552d = r0     // Catch:{ all -> 0x004e }
        L_0x0095:
            monitor-exit(r8)     // Catch:{ all -> 0x004e }
            goto L_0x0099
        L_0x0097:
            monitor-exit(r8)     // Catch:{ all -> 0x004e }
            throw r0
        L_0x0099:
            T r0 = r8.f48553e
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.B3.e():java.lang.Object");
    }

    /* access modifiers changed from: package-private */
    public abstract T g(Object obj);

    public final String k() {
        return h(this.f48549a.f48708d);
    }

    private B3(K3 k32, String str, T t10, boolean z10) {
        this.f48552d = -1;
        String str2 = k32.f48705a;
        if (str2 == null && k32.f48706b == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        } else if (str2 == null || k32.f48706b == null) {
            this.f48549a = k32;
            this.f48550b = str;
            this.f48551c = t10;
            this.f48554f = z10;
            this.f48555g = false;
        } else {
            throw new IllegalArgumentException("Must pass one of SharedPreferences file name or ContentProvider URI");
        }
    }
}
