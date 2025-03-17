package com.google.android.gms.measurement.internal;

import java.util.Map;
import java.util.Set;

final class Y5 extends C7721x5 {

    /* renamed from: d  reason: collision with root package name */
    private String f50017d;

    /* renamed from: e  reason: collision with root package name */
    private Set<Integer> f50018e;

    /* renamed from: f  reason: collision with root package name */
    private Map<Integer, a6> f50019f;

    /* renamed from: g  reason: collision with root package name */
    private Long f50020g;

    /* renamed from: h  reason: collision with root package name */
    private Long f50021h;

    Y5(C7728y5 y5Var) {
        super(y5Var);
    }

    private final a6 w(Integer num) {
        if (this.f50019f.containsKey(num)) {
            return this.f50019f.get(num);
        }
        a6 a6Var = new a6(this, this.f50017d);
        this.f50019f.put(num, a6Var);
        return a6Var;
    }

    private final boolean y(int i10, int i11) {
        a6 a6Var = this.f50019f.get(Integer.valueOf(i10));
        if (a6Var == null) {
            return false;
        }
        return a6Var.f50050d.get(i11);
    }

    /* access modifiers changed from: protected */
    public final boolean v() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x05ef, code lost:
        if (r9.R() == false) goto L_0x05fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x05f1, code lost:
        r9 = java.lang.Integer.valueOf(r9.m());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x05fa, code lost:
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x05fb, code lost:
        r7.c("Invalid property filter ID. appId, id", r8, java.lang.String.valueOf(r9));
        r9 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.google.android.gms.internal.measurement.C7411t2> x(java.lang.String r53, java.util.List<com.google.android.gms.internal.measurement.C7427v2> r54, java.util.List<com.google.android.gms.internal.measurement.F2> r55, java.lang.Long r56, java.lang.Long r57, boolean r58) {
        /*
            r52 = this;
            r10 = r52
            K9.C6620s.f(r53)
            K9.C6620s.l(r54)
            K9.C6620s.l(r55)
            r0 = r53
            r10.f50017d = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r10.f50018e = r0
            j0.a r0 = new j0.a
            r0.<init>()
            r10.f50019f = r0
            r0 = r56
            r10.f50020g = r0
            r0 = r57
            r10.f50021h = r0
            java.util.Iterator r0 = r54.iterator()
        L_0x0029:
            boolean r1 = r0.hasNext()
            r11 = 0
            if (r1 == 0) goto L_0x0044
            java.lang.Object r1 = r0.next()
            com.google.android.gms.internal.measurement.v2 r1 = (com.google.android.gms.internal.measurement.C7427v2) r1
            java.lang.String r2 = "_s"
            java.lang.String r1 = r1.X()
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0029
            r1 = 1
            goto L_0x0045
        L_0x0044:
            r1 = r11
        L_0x0045:
            boolean r0 = com.google.android.gms.internal.measurement.O6.a()
            if (r0 == 0) goto L_0x005b
            com.google.android.gms.measurement.internal.i r0 = r52.a()
            java.lang.String r2 = r10.f50017d
            com.google.android.gms.measurement.internal.Y1<java.lang.Boolean> r3 = com.google.android.gms.measurement.internal.K.f49691A0
            boolean r0 = r0.H(r2, r3)
            if (r0 == 0) goto L_0x005b
            r13 = 1
            goto L_0x005c
        L_0x005b:
            r13 = r11
        L_0x005c:
            boolean r0 = com.google.android.gms.internal.measurement.O6.a()
            if (r0 == 0) goto L_0x0072
            com.google.android.gms.measurement.internal.i r0 = r52.a()
            java.lang.String r2 = r10.f50017d
            com.google.android.gms.measurement.internal.Y1<java.lang.Boolean> r3 = com.google.android.gms.measurement.internal.K.f49799z0
            boolean r0 = r0.H(r2, r3)
            if (r0 == 0) goto L_0x0072
            r14 = 1
            goto L_0x0073
        L_0x0072:
            r14 = r11
        L_0x0073:
            if (r1 == 0) goto L_0x00b4
            com.google.android.gms.measurement.internal.p r2 = r52.n()
            java.lang.String r3 = r10.f50017d
            r2.s()
            r2.k()
            K9.C6620s.f(r3)
            android.content.ContentValues r0 = new android.content.ContentValues
            r0.<init>()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r11)
            java.lang.String r5 = "current_session_count"
            r0.put(r5, r4)
            android.database.sqlite.SQLiteDatabase r4 = r2.z()     // Catch:{ SQLiteException -> 0x00a2 }
            java.lang.String r5 = "events"
            java.lang.String r6 = "app_id = ?"
            java.lang.String[] r7 = new java.lang.String[]{r3}     // Catch:{ SQLiteException -> 0x00a2 }
            r4.update(r5, r0, r6, r7)     // Catch:{ SQLiteException -> 0x00a2 }
            goto L_0x00b4
        L_0x00a2:
            r0 = move-exception
            com.google.android.gms.measurement.internal.h2 r2 = r2.f()
            com.google.android.gms.measurement.internal.i2 r2 = r2.E()
            java.lang.String r4 = "Error resetting session-scoped event counts. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C7607h2.t(r3)
            r2.c(r4, r3, r0)
        L_0x00b4:
            java.util.Map r0 = java.util.Collections.emptyMap()
            if (r14 == 0) goto L_0x00c6
            if (r13 == 0) goto L_0x00c6
            com.google.android.gms.measurement.internal.p r0 = r52.n()
            java.lang.String r2 = r10.f50017d
            java.util.Map r0 = r0.h1(r2)
        L_0x00c6:
            com.google.android.gms.measurement.internal.p r2 = r52.n()
            java.lang.String r3 = r10.f50017d
            java.util.Map r15 = r2.g1(r3)
            boolean r2 = r15.isEmpty()
            if (r2 != 0) goto L_0x0378
            java.util.HashSet r2 = new java.util.HashSet
            java.util.Set r3 = r15.keySet()
            r2.<init>(r3)
            if (r1 == 0) goto L_0x01e2
            java.lang.String r1 = r10.f50017d
            com.google.android.gms.measurement.internal.p r3 = r52.n()
            java.lang.String r4 = r10.f50017d
            java.util.Map r3 = r3.i1(r4)
            K9.C6620s.f(r1)
            K9.C6620s.l(r15)
            j0.a r1 = new j0.a
            r1.<init>()
            boolean r4 = r15.isEmpty()
            if (r4 != 0) goto L_0x01e0
            java.util.Set r4 = r15.keySet()
            java.util.Iterator r4 = r4.iterator()
        L_0x0106:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x01e0
            java.lang.Object r5 = r4.next()
            java.lang.Integer r5 = (java.lang.Integer) r5
            r5.intValue()
            java.lang.Object r6 = r15.get(r5)
            com.google.android.gms.internal.measurement.C2 r6 = (com.google.android.gms.internal.measurement.C2) r6
            java.lang.Object r7 = r3.get(r5)
            java.util.List r7 = (java.util.List) r7
            if (r7 == 0) goto L_0x0129
            boolean r8 = r7.isEmpty()
            if (r8 == 0) goto L_0x012d
        L_0x0129:
            r17 = r3
            goto L_0x01dc
        L_0x012d:
            com.google.android.gms.measurement.internal.N5 r8 = r52.l()
            java.util.List r9 = r6.Y()
            java.util.List r8 = r8.N(r9, r7)
            boolean r9 = r8.isEmpty()
            if (r9 != 0) goto L_0x0106
            com.google.android.gms.internal.measurement.L4$a r9 = r6.A()
            com.google.android.gms.internal.measurement.C2$a r9 = (com.google.android.gms.internal.measurement.C2.a) r9
            com.google.android.gms.internal.measurement.C2$a r9 = r9.C()
            com.google.android.gms.internal.measurement.C2$a r8 = r9.D(r8)
            com.google.android.gms.measurement.internal.N5 r9 = r52.l()
            java.util.List r11 = r6.a0()
            java.util.List r9 = r9.N(r11, r7)
            com.google.android.gms.internal.measurement.C2$a r11 = r8.H()
            r11.I(r9)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.List r11 = r6.X()
            java.util.Iterator r11 = r11.iterator()
        L_0x016d:
            boolean r16 = r11.hasNext()
            if (r16 == 0) goto L_0x0191
            java.lang.Object r16 = r11.next()
            r12 = r16
            com.google.android.gms.internal.measurement.u2 r12 = (com.google.android.gms.internal.measurement.C7419u2) r12
            int r16 = r12.m()
            r17 = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r16)
            boolean r3 = r7.contains(r3)
            if (r3 != 0) goto L_0x018e
            r9.add(r12)
        L_0x018e:
            r3 = r17
            goto L_0x016d
        L_0x0191:
            r17 = r3
            com.google.android.gms.internal.measurement.C2$a r3 = r8.z()
            r3.A(r9)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.List r6 = r6.Z()
            java.util.Iterator r6 = r6.iterator()
        L_0x01a7:
            boolean r9 = r6.hasNext()
            if (r9 == 0) goto L_0x01c5
            java.lang.Object r9 = r6.next()
            com.google.android.gms.internal.measurement.D2 r9 = (com.google.android.gms.internal.measurement.D2) r9
            int r11 = r9.M()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            boolean r11 = r7.contains(r11)
            if (r11 != 0) goto L_0x01a7
            r3.add(r9)
            goto L_0x01a7
        L_0x01c5:
            com.google.android.gms.internal.measurement.C2$a r6 = r8.E()
            r6.G(r3)
            com.google.android.gms.internal.measurement.s5 r3 = r8.s()
            com.google.android.gms.internal.measurement.L4 r3 = (com.google.android.gms.internal.measurement.L4) r3
            com.google.android.gms.internal.measurement.C2 r3 = (com.google.android.gms.internal.measurement.C2) r3
            r1.put(r5, r3)
        L_0x01d7:
            r3 = r17
            r11 = 0
            goto L_0x0106
        L_0x01dc:
            r1.put(r5, r6)
            goto L_0x01d7
        L_0x01e0:
            r11 = r1
            goto L_0x01e3
        L_0x01e2:
            r11 = r15
        L_0x01e3:
            java.util.Iterator r12 = r2.iterator()
        L_0x01e7:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto L_0x0378
            java.lang.Object r1 = r12.next()
            r9 = r1
            java.lang.Integer r9 = (java.lang.Integer) r9
            r9.intValue()
            java.lang.Object r1 = r11.get(r9)
            com.google.android.gms.internal.measurement.C2 r1 = (com.google.android.gms.internal.measurement.C2) r1
            java.util.BitSet r5 = new java.util.BitSet
            r5.<init>()
            java.util.BitSet r6 = new java.util.BitSet
            r6.<init>()
            j0.a r7 = new j0.a
            r7.<init>()
            if (r1 == 0) goto L_0x024b
            int r2 = r1.m()
            if (r2 != 0) goto L_0x0215
            goto L_0x024b
        L_0x0215:
            java.util.List r2 = r1.X()
            java.util.Iterator r2 = r2.iterator()
        L_0x021d:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x024b
            java.lang.Object r3 = r2.next()
            com.google.android.gms.internal.measurement.u2 r3 = (com.google.android.gms.internal.measurement.C7419u2) r3
            boolean r4 = r3.P()
            if (r4 == 0) goto L_0x021d
            int r4 = r3.m()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            boolean r8 = r3.O()
            if (r8 == 0) goto L_0x0246
            long r16 = r3.L()
            java.lang.Long r3 = java.lang.Long.valueOf(r16)
            goto L_0x0247
        L_0x0246:
            r3 = 0
        L_0x0247:
            r7.put(r4, r3)
            goto L_0x021d
        L_0x024b:
            j0.a r8 = new j0.a
            r8.<init>()
            if (r1 == 0) goto L_0x029e
            int r2 = r1.O()
            if (r2 != 0) goto L_0x0259
            goto L_0x029e
        L_0x0259:
            java.util.List r2 = r1.Z()
            java.util.Iterator r2 = r2.iterator()
        L_0x0261:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x029e
            java.lang.Object r3 = r2.next()
            com.google.android.gms.internal.measurement.D2 r3 = (com.google.android.gms.internal.measurement.D2) r3
            boolean r4 = r3.Q()
            if (r4 == 0) goto L_0x0297
            int r4 = r3.m()
            if (r4 <= 0) goto L_0x0297
            int r4 = r3.M()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            int r16 = r3.m()
            r57 = r2
            r17 = 1
            int r2 = r16 + -1
            long r2 = r3.J(r2)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r8.put(r4, r2)
            goto L_0x029b
        L_0x0297:
            r57 = r2
            r17 = 1
        L_0x029b:
            r2 = r57
            goto L_0x0261
        L_0x029e:
            r17 = 1
            if (r1 == 0) goto L_0x02e7
            r2 = 0
        L_0x02a3:
            int r3 = r1.R()
            int r3 = r3 << 6
            if (r2 >= r3) goto L_0x02e7
            java.util.List r3 = r1.a0()
            boolean r3 = com.google.android.gms.measurement.internal.N5.c0(r3, r2)
            if (r3 == 0) goto L_0x02d9
            com.google.android.gms.measurement.internal.h2 r3 = r52.f()
            com.google.android.gms.measurement.internal.i2 r3 = r3.I()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            r16 = r11
            java.lang.String r11 = "Filter already evaluated. audience ID, filter ID"
            r3.c(r11, r9, r4)
            r6.set(r2)
            java.util.List r3 = r1.Y()
            boolean r3 = com.google.android.gms.measurement.internal.N5.c0(r3, r2)
            if (r3 == 0) goto L_0x02db
            r5.set(r2)
            goto L_0x02e2
        L_0x02d9:
            r16 = r11
        L_0x02db:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r7.remove(r3)
        L_0x02e2:
            int r2 = r2 + 1
            r11 = r16
            goto L_0x02a3
        L_0x02e7:
            r16 = r11
            java.lang.Object r1 = r15.get(r9)
            r4 = r1
            com.google.android.gms.internal.measurement.C2 r4 = (com.google.android.gms.internal.measurement.C2) r4
            if (r14 == 0) goto L_0x035c
            if (r13 == 0) goto L_0x035c
            java.lang.Object r1 = r0.get(r9)
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L_0x035c
            java.lang.Long r2 = r10.f50021h
            if (r2 == 0) goto L_0x035c
            java.lang.Long r2 = r10.f50020g
            if (r2 != 0) goto L_0x0305
            goto L_0x035c
        L_0x0305:
            java.util.Iterator r1 = r1.iterator()
        L_0x0309:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x035c
            java.lang.Object r2 = r1.next()
            com.google.android.gms.internal.measurement.U1 r2 = (com.google.android.gms.internal.measurement.U1) r2
            int r3 = r2.M()
            java.lang.Long r11 = r10.f50021h
            long r18 = r11.longValue()
            r20 = 1000(0x3e8, double:4.94E-321)
            long r18 = r18 / r20
            boolean r2 = r2.T()
            if (r2 == 0) goto L_0x0331
            java.lang.Long r2 = r10.f50020g
            long r18 = r2.longValue()
            long r18 = r18 / r20
        L_0x0331:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            boolean r2 = r7.containsKey(r2)
            if (r2 == 0) goto L_0x0346
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            java.lang.Long r11 = java.lang.Long.valueOf(r18)
            r7.put(r2, r11)
        L_0x0346:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            boolean r2 = r8.containsKey(r2)
            if (r2 == 0) goto L_0x0309
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            java.lang.Long r3 = java.lang.Long.valueOf(r18)
            r8.put(r2, r3)
            goto L_0x0309
        L_0x035c:
            com.google.android.gms.measurement.internal.a6 r11 = new com.google.android.gms.measurement.internal.a6
            java.lang.String r3 = r10.f50017d
            r18 = 0
            r1 = r11
            r2 = r52
            r57 = r12
            r12 = r9
            r9 = r18
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            java.util.Map<java.lang.Integer, com.google.android.gms.measurement.internal.a6> r1 = r10.f50019f
            r1.put(r12, r11)
            r12 = r57
            r11 = r16
            goto L_0x01e7
        L_0x0378:
            r17 = 1
            boolean r0 = r54.isEmpty()
            java.lang.String r1 = "Skipping failed audience ID"
            if (r0 != 0) goto L_0x04dd
            com.google.android.gms.measurement.internal.Z5 r0 = new com.google.android.gms.measurement.internal.Z5
            r2 = 0
            r0.<init>(r10)
            j0.a r2 = new j0.a
            r2.<init>()
            java.util.Iterator r3 = r54.iterator()
        L_0x0391:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x04dd
            java.lang.Object r4 = r3.next()
            com.google.android.gms.internal.measurement.v2 r4 = (com.google.android.gms.internal.measurement.C7427v2) r4
            java.lang.String r5 = r10.f50017d
            com.google.android.gms.internal.measurement.v2 r5 = r0.a(r5, r4)
            if (r5 == 0) goto L_0x0391
            com.google.android.gms.measurement.internal.p r6 = r52.n()
            java.lang.String r7 = r10.f50017d
            java.lang.String r8 = r5.X()
            java.lang.String r9 = r4.X()
            com.google.android.gms.measurement.internal.G r9 = r6.R0(r7, r9)
            if (r9 != 0) goto L_0x03f4
            com.google.android.gms.measurement.internal.h2 r9 = r6.f()
            com.google.android.gms.measurement.internal.i2 r9 = r9.J()
            java.lang.Object r11 = com.google.android.gms.measurement.internal.C7607h2.t(r7)
            com.google.android.gms.measurement.internal.e2 r6 = r6.d()
            java.lang.String r6 = r6.c(r8)
            java.lang.String r8 = "Event aggregate wasn't created during raw event logging. appId, event"
            r9.c(r8, r11, r6)
            com.google.android.gms.measurement.internal.G r6 = new com.google.android.gms.measurement.internal.G
            r18 = r6
            java.lang.String r20 = r4.X()
            long r27 = r4.U()
            r33 = 0
            r34 = 0
            r21 = 1
            r23 = 1
            r25 = 1
            r29 = 0
            r31 = 0
            r32 = 0
            r19 = r7
            r18.<init>(r19, r20, r21, r23, r25, r27, r29, r31, r32, r33, r34)
            goto L_0x0429
        L_0x03f4:
            com.google.android.gms.measurement.internal.G r6 = new com.google.android.gms.measurement.internal.G
            r35 = r6
            java.lang.String r4 = r9.f49628a
            r36 = r4
            java.lang.String r4 = r9.f49629b
            r37 = r4
            long r7 = r9.f49630c
            r11 = 1
            long r38 = r7 + r11
            long r7 = r9.f49631d
            long r40 = r7 + r11
            long r7 = r9.f49632e
            long r42 = r7 + r11
            long r7 = r9.f49633f
            r44 = r7
            long r7 = r9.f49634g
            r46 = r7
            java.lang.Long r4 = r9.f49635h
            r48 = r4
            java.lang.Long r4 = r9.f49636i
            r49 = r4
            java.lang.Long r4 = r9.f49637j
            r50 = r4
            java.lang.Boolean r4 = r9.f49638k
            r51 = r4
            r35.<init>(r36, r37, r38, r40, r42, r44, r46, r48, r49, r50, r51)
        L_0x0429:
            com.google.android.gms.measurement.internal.p r4 = r52.n()
            r4.W(r6)
            if (r58 != 0) goto L_0x0391
            long r7 = r6.f49630c
            java.lang.String r4 = r5.X()
            java.lang.Object r9 = r2.get(r4)
            java.util.Map r9 = (java.util.Map) r9
            if (r9 != 0) goto L_0x044d
            com.google.android.gms.measurement.internal.p r9 = r52.n()
            java.lang.String r11 = r10.f50017d
            java.util.Map r9 = r9.W0(r11, r4)
            r2.put(r4, r9)
        L_0x044d:
            java.util.Set r4 = r9.keySet()
            java.util.Iterator r4 = r4.iterator()
        L_0x0455:
            boolean r11 = r4.hasNext()
            if (r11 == 0) goto L_0x0391
            java.lang.Object r11 = r4.next()
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r12 = r11.intValue()
            java.util.Set<java.lang.Integer> r13 = r10.f50018e
            boolean r13 = r13.contains(r11)
            if (r13 == 0) goto L_0x0479
            com.google.android.gms.measurement.internal.h2 r12 = r52.f()
            com.google.android.gms.measurement.internal.i2 r12 = r12.I()
            r12.b(r1, r11)
            goto L_0x0455
        L_0x0479:
            java.lang.Object r13 = r9.get(r11)
            java.util.List r13 = (java.util.List) r13
            java.util.Iterator r13 = r13.iterator()
            r14 = r17
        L_0x0485:
            boolean r15 = r13.hasNext()
            if (r15 == 0) goto L_0x04cc
            java.lang.Object r14 = r13.next()
            com.google.android.gms.internal.measurement.U1 r14 = (com.google.android.gms.internal.measurement.U1) r14
            com.google.android.gms.measurement.internal.c r15 = new com.google.android.gms.measurement.internal.c
            r57 = r0
            java.lang.String r0 = r10.f50017d
            r15.<init>(r10, r0, r12, r14)
            java.lang.Long r0 = r10.f50020g
            r16 = r2
            java.lang.Long r2 = r10.f50021h
            int r14 = r14.M()
            boolean r25 = r10.y(r12, r14)
            r18 = r15
            r19 = r0
            r20 = r2
            r21 = r5
            r22 = r7
            r24 = r6
            boolean r14 = r18.k(r19, r20, r21, r22, r24, r25)
            if (r14 == 0) goto L_0x04c6
            com.google.android.gms.measurement.internal.a6 r0 = r10.w(r11)
            r0.c(r15)
            r0 = r57
            r2 = r16
            goto L_0x0485
        L_0x04c6:
            java.util.Set<java.lang.Integer> r0 = r10.f50018e
            r0.add(r11)
            goto L_0x04d0
        L_0x04cc:
            r57 = r0
            r16 = r2
        L_0x04d0:
            if (r14 != 0) goto L_0x04d7
            java.util.Set<java.lang.Integer> r0 = r10.f50018e
            r0.add(r11)
        L_0x04d7:
            r0 = r57
            r2 = r16
            goto L_0x0455
        L_0x04dd:
            if (r58 == 0) goto L_0x04e5
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
        L_0x04e5:
            boolean r0 = r55.isEmpty()
            if (r0 != 0) goto L_0x060e
            j0.a r0 = new j0.a
            r0.<init>()
            java.util.Iterator r2 = r55.iterator()
        L_0x04f4:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x060e
            java.lang.Object r3 = r2.next()
            com.google.android.gms.internal.measurement.F2 r3 = (com.google.android.gms.internal.measurement.F2) r3
            java.lang.String r4 = r3.X()
            java.lang.Object r5 = r0.get(r4)
            java.util.Map r5 = (java.util.Map) r5
            if (r5 != 0) goto L_0x0519
            com.google.android.gms.measurement.internal.p r5 = r52.n()
            java.lang.String r6 = r10.f50017d
            java.util.Map r5 = r5.Y0(r6, r4)
            r0.put(r4, r5)
        L_0x0519:
            java.util.Set r4 = r5.keySet()
            java.util.Iterator r4 = r4.iterator()
        L_0x0521:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x04f4
            java.lang.Object r6 = r4.next()
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r7 = r6.intValue()
            java.util.Set<java.lang.Integer> r8 = r10.f50018e
            boolean r8 = r8.contains(r6)
            if (r8 == 0) goto L_0x0545
            com.google.android.gms.measurement.internal.h2 r3 = r52.f()
            com.google.android.gms.measurement.internal.i2 r3 = r3.I()
            r3.b(r1, r6)
            goto L_0x04f4
        L_0x0545:
            java.lang.Object r8 = r5.get(r6)
            java.util.List r8 = (java.util.List) r8
            java.util.Iterator r8 = r8.iterator()
            r9 = r17
        L_0x0551:
            boolean r11 = r8.hasNext()
            if (r11 == 0) goto L_0x0605
            java.lang.Object r9 = r8.next()
            com.google.android.gms.internal.measurement.X1 r9 = (com.google.android.gms.internal.measurement.X1) r9
            com.google.android.gms.measurement.internal.h2 r11 = r52.f()
            r12 = 2
            boolean r11 = r11.A(r12)
            if (r11 == 0) goto L_0x05a6
            com.google.android.gms.measurement.internal.h2 r11 = r52.f()
            com.google.android.gms.measurement.internal.i2 r11 = r11.I()
            boolean r12 = r9.R()
            if (r12 == 0) goto L_0x057f
            int r12 = r9.m()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            goto L_0x0580
        L_0x057f:
            r12 = 0
        L_0x0580:
            com.google.android.gms.measurement.internal.e2 r13 = r52.d()
            java.lang.String r14 = r9.N()
            java.lang.String r13 = r13.g(r14)
            java.lang.String r14 = "Evaluating filter. audience, filter, property"
            r11.d(r14, r6, r12, r13)
            com.google.android.gms.measurement.internal.h2 r11 = r52.f()
            com.google.android.gms.measurement.internal.i2 r11 = r11.I()
            com.google.android.gms.measurement.internal.N5 r12 = r52.l()
            java.lang.String r12 = r12.J(r9)
            java.lang.String r13 = "Filter definition"
            r11.b(r13, r12)
        L_0x05a6:
            boolean r11 = r9.R()
            if (r11 == 0) goto L_0x05dd
            int r11 = r9.m()
            r12 = 256(0x100, float:3.59E-43)
            if (r11 <= r12) goto L_0x05b5
            goto L_0x05dd
        L_0x05b5:
            com.google.android.gms.measurement.internal.d r11 = new com.google.android.gms.measurement.internal.d
            java.lang.String r12 = r10.f50017d
            r11.<init>(r10, r12, r7, r9)
            java.lang.Long r12 = r10.f50020g
            java.lang.Long r13 = r10.f50021h
            int r9 = r9.m()
            boolean r9 = r10.y(r7, r9)
            boolean r9 = r11.k(r12, r13, r3, r9)
            if (r9 == 0) goto L_0x05d7
            com.google.android.gms.measurement.internal.a6 r12 = r10.w(r6)
            r12.c(r11)
            goto L_0x0551
        L_0x05d7:
            java.util.Set<java.lang.Integer> r7 = r10.f50018e
            r7.add(r6)
            goto L_0x0605
        L_0x05dd:
            com.google.android.gms.measurement.internal.h2 r7 = r52.f()
            com.google.android.gms.measurement.internal.i2 r7 = r7.J()
            java.lang.String r8 = r10.f50017d
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C7607h2.t(r8)
            boolean r11 = r9.R()
            if (r11 == 0) goto L_0x05fa
            int r9 = r9.m()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            goto L_0x05fb
        L_0x05fa:
            r9 = 0
        L_0x05fb:
            java.lang.String r9 = java.lang.String.valueOf(r9)
            java.lang.String r11 = "Invalid property filter ID. appId, id"
            r7.c(r11, r8, r9)
            r9 = 0
        L_0x0605:
            if (r9 != 0) goto L_0x0521
            java.util.Set<java.lang.Integer> r7 = r10.f50018e
            r7.add(r6)
            goto L_0x0521
        L_0x060e:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Map<java.lang.Integer, com.google.android.gms.measurement.internal.a6> r0 = r10.f50019f
            java.util.Set r0 = r0.keySet()
            java.util.Set<java.lang.Integer> r2 = r10.f50018e
            r0.removeAll(r2)
            java.util.Iterator r2 = r0.iterator()
        L_0x0622:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x06ad
            java.lang.Object r0 = r2.next()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r3 = r0.intValue()
            java.util.Map<java.lang.Integer, com.google.android.gms.measurement.internal.a6> r4 = r10.f50019f
            java.lang.Object r4 = r4.get(r0)
            com.google.android.gms.measurement.internal.a6 r4 = (com.google.android.gms.measurement.internal.a6) r4
            K9.C6620s.l(r4)
            com.google.android.gms.internal.measurement.t2 r3 = r4.a(r3)
            r1.add(r3)
            com.google.android.gms.measurement.internal.p r4 = r52.n()
            java.lang.String r5 = r10.f50017d
            com.google.android.gms.internal.measurement.C2 r3 = r3.P()
            r4.s()
            r4.k()
            K9.C6620s.f(r5)
            K9.C6620s.l(r3)
            byte[] r3 = r3.l()
            android.content.ContentValues r6 = new android.content.ContentValues
            r6.<init>()
            java.lang.String r7 = "app_id"
            r6.put(r7, r5)
            java.lang.String r7 = "audience_id"
            r6.put(r7, r0)
            java.lang.String r0 = "current_results"
            r6.put(r0, r3)
            android.database.sqlite.SQLiteDatabase r0 = r4.z()     // Catch:{ SQLiteException -> 0x0698 }
            java.lang.String r3 = "audience_filter_values"
            r7 = 5
            r8 = 0
            long r6 = r0.insertWithOnConflict(r3, r8, r6, r7)     // Catch:{ SQLiteException -> 0x0696 }
            r11 = -1
            int r0 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r0 != 0) goto L_0x0622
            com.google.android.gms.measurement.internal.h2 r0 = r4.f()     // Catch:{ SQLiteException -> 0x0696 }
            com.google.android.gms.measurement.internal.i2 r0 = r0.E()     // Catch:{ SQLiteException -> 0x0696 }
            java.lang.String r3 = "Failed to insert filter results (got -1). appId"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.C7607h2.t(r5)     // Catch:{ SQLiteException -> 0x0696 }
            r0.b(r3, r6)     // Catch:{ SQLiteException -> 0x0696 }
            goto L_0x0622
        L_0x0696:
            r0 = move-exception
            goto L_0x069a
        L_0x0698:
            r0 = move-exception
            r8 = 0
        L_0x069a:
            com.google.android.gms.measurement.internal.h2 r3 = r4.f()
            com.google.android.gms.measurement.internal.i2 r3 = r3.E()
            java.lang.String r4 = "Error storing filter results. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C7607h2.t(r5)
            r3.c(r4, r5, r0)
            goto L_0x0622
        L_0x06ad:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.Y5.x(java.lang.String, java.util.List, java.util.List, java.lang.Long, java.lang.Long, boolean):java.util.List");
    }
}
