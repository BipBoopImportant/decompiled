package com.google.android.gms.measurement.internal;

public final class Y1<V> {

    /* renamed from: g  reason: collision with root package name */
    private static final Object f49999g = new Object();

    /* renamed from: a  reason: collision with root package name */
    private final String f50000a;

    /* renamed from: b  reason: collision with root package name */
    private final X1<V> f50001b;

    /* renamed from: c  reason: collision with root package name */
    private final V f50002c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f50003d;

    /* renamed from: e  reason: collision with root package name */
    private volatile V f50004e;

    /* renamed from: f  reason: collision with root package name */
    private volatile V f50005f;

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processHandlersOutBlocks(RegionMaker.java:1008)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:978)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x0048 */
    public final V a(V r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f50003d
            monitor-enter(r0)
            monitor-exit(r0)     // Catch:{ all -> 0x006e }
            if (r4 == 0) goto L_0x0007
            return r4
        L_0x0007:
            com.google.android.gms.measurement.internal.f r4 = com.google.android.gms.measurement.internal.W1.f49977a
            if (r4 != 0) goto L_0x000e
            V r4 = r3.f50002c
            return r4
        L_0x000e:
            java.lang.Object r4 = f49999g
            monitor-enter(r4)
            boolean r0 = com.google.android.gms.measurement.internal.C7590f.a()     // Catch:{ all -> 0x001e }
            if (r0 == 0) goto L_0x0024
            V r0 = r3.f50005f     // Catch:{ all -> 0x001e }
            if (r0 != 0) goto L_0x0020
            V r0 = r3.f50002c     // Catch:{ all -> 0x001e }
            goto L_0x0022
        L_0x001e:
            r0 = move-exception
            goto L_0x006c
        L_0x0020:
            V r0 = r3.f50005f     // Catch:{ all -> 0x001e }
        L_0x0022:
            monitor-exit(r4)     // Catch:{ all -> 0x001e }
            return r0
        L_0x0024:
            monitor-exit(r4)     // Catch:{ all -> 0x001e }
            java.util.List r4 = com.google.android.gms.measurement.internal.K.f49742a     // Catch:{ SecurityException -> 0x005a }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ SecurityException -> 0x005a }
        L_0x002d:
            boolean r0 = r4.hasNext()     // Catch:{ SecurityException -> 0x005a }
            if (r0 == 0) goto L_0x005a
            java.lang.Object r0 = r4.next()     // Catch:{ SecurityException -> 0x005a }
            com.google.android.gms.measurement.internal.Y1 r0 = (com.google.android.gms.measurement.internal.Y1) r0     // Catch:{ SecurityException -> 0x005a }
            boolean r1 = com.google.android.gms.measurement.internal.C7590f.a()     // Catch:{ SecurityException -> 0x005a }
            if (r1 != 0) goto L_0x0052
            r1 = 0
            com.google.android.gms.measurement.internal.X1<V> r2 = r0.f50001b     // Catch:{ IllegalStateException -> 0x0048 }
            if (r2 == 0) goto L_0x0048
            java.lang.Object r1 = r2.zza()     // Catch:{ IllegalStateException -> 0x0048 }
        L_0x0048:
            java.lang.Object r2 = f49999g     // Catch:{ SecurityException -> 0x005a }
            monitor-enter(r2)     // Catch:{ SecurityException -> 0x005a }
            r0.f50005f = r1     // Catch:{ all -> 0x004f }
            monitor-exit(r2)     // Catch:{ all -> 0x004f }
            goto L_0x002d
        L_0x004f:
            r4 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x004f }
            throw r4     // Catch:{ SecurityException -> 0x005a }
        L_0x0052:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch:{ SecurityException -> 0x005a }
            java.lang.String r0 = "Refreshing flag cache must be done on a worker thread."
            r4.<init>(r0)     // Catch:{ SecurityException -> 0x005a }
            throw r4     // Catch:{ SecurityException -> 0x005a }
        L_0x005a:
            com.google.android.gms.measurement.internal.X1<V> r4 = r3.f50001b
            if (r4 != 0) goto L_0x0061
            V r4 = r3.f50002c
            return r4
        L_0x0061:
            java.lang.Object r4 = r4.zza()     // Catch:{ SecurityException -> 0x0069, IllegalStateException -> 0x0066 }
            return r4
        L_0x0066:
            V r4 = r3.f50002c
            return r4
        L_0x0069:
            V r4 = r3.f50002c
            return r4
        L_0x006c:
            monitor-exit(r4)     // Catch:{ all -> 0x001e }
            throw r0
        L_0x006e:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x006e }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.Y1.a(java.lang.Object):java.lang.Object");
    }

    public final String b() {
        return this.f50000a;
    }

    private Y1(String str, V v10, V v11, X1<V> x12) {
        this.f50003d = new Object();
        this.f50004e = null;
        this.f50005f = null;
        this.f50000a = str;
        this.f50002c = v10;
        this.f50001b = x12;
    }
}
