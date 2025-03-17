package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.U1;

/* renamed from: com.google.android.gms.measurement.internal.c  reason: case insensitive filesystem */
final class C7569c extends C7562b {

    /* renamed from: g  reason: collision with root package name */
    private U1 f50086g;

    /* renamed from: h  reason: collision with root package name */
    private final /* synthetic */ Y5 f50087h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C7569c(Y5 y52, String str, int i10, U1 u12) {
        super(str, i10);
        this.f50087h = y52;
        this.f50086g = u12;
    }

    /* access modifiers changed from: package-private */
    public final int a() {
        return this.f50086g.M();
    }

    /* access modifiers changed from: package-private */
    public final boolean i() {
        return this.f50086g.V();
    }

    /* access modifiers changed from: package-private */
    public final boolean j() {
        return false;
    }

    /* JADX WARNING: type inference failed for: r7v3, types: [java.lang.Integer] */
    /* JADX WARNING: type inference failed for: r7v15, types: [java.lang.Integer] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x03ae  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x03b1  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x03b9 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x03ba  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean k(java.lang.Long r16, java.lang.Long r17, com.google.android.gms.internal.measurement.C7427v2 r18, long r19, com.google.android.gms.measurement.internal.G r21, boolean r22) {
        /*
            r15 = this;
            r0 = r15
            boolean r1 = com.google.android.gms.internal.measurement.O6.a()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x001b
            com.google.android.gms.measurement.internal.Y5 r1 = r0.f50087h
            com.google.android.gms.measurement.internal.i r1 = r1.a()
            java.lang.String r4 = r0.f50055a
            com.google.android.gms.measurement.internal.Y1<java.lang.Boolean> r5 = com.google.android.gms.measurement.internal.K.f49691A0
            boolean r1 = r1.H(r4, r5)
            if (r1 == 0) goto L_0x001b
            r1 = r3
            goto L_0x001c
        L_0x001b:
            r1 = r2
        L_0x001c:
            com.google.android.gms.internal.measurement.U1 r4 = r0.f50086g
            boolean r4 = r4.U()
            if (r4 == 0) goto L_0x0029
            r4 = r21
            long r4 = r4.f49632e
            goto L_0x002b
        L_0x0029:
            r4 = r19
        L_0x002b:
            com.google.android.gms.measurement.internal.Y5 r6 = r0.f50087h
            com.google.android.gms.measurement.internal.h2 r6 = r6.f()
            r7 = 2
            boolean r6 = r6.A(r7)
            r7 = 0
            if (r6 == 0) goto L_0x008d
            com.google.android.gms.measurement.internal.Y5 r6 = r0.f50087h
            com.google.android.gms.measurement.internal.h2 r6 = r6.f()
            com.google.android.gms.measurement.internal.i2 r6 = r6.I()
            int r8 = r0.f50056b
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            com.google.android.gms.internal.measurement.U1 r9 = r0.f50086g
            boolean r9 = r9.W()
            if (r9 == 0) goto L_0x005c
            com.google.android.gms.internal.measurement.U1 r9 = r0.f50086g
            int r9 = r9.M()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            goto L_0x005d
        L_0x005c:
            r9 = r7
        L_0x005d:
            com.google.android.gms.measurement.internal.Y5 r10 = r0.f50087h
            com.google.android.gms.measurement.internal.e2 r10 = r10.d()
            com.google.android.gms.internal.measurement.U1 r11 = r0.f50086g
            java.lang.String r11 = r11.Q()
            java.lang.String r10 = r10.c(r11)
            java.lang.String r11 = "Evaluating filter. audience, filter, event"
            r6.d(r11, r8, r9, r10)
            com.google.android.gms.measurement.internal.Y5 r6 = r0.f50087h
            com.google.android.gms.measurement.internal.h2 r6 = r6.f()
            com.google.android.gms.measurement.internal.i2 r6 = r6.I()
            com.google.android.gms.measurement.internal.Y5 r8 = r0.f50087h
            com.google.android.gms.measurement.internal.N5 r8 = r8.l()
            com.google.android.gms.internal.measurement.U1 r9 = r0.f50086g
            java.lang.String r8 = r8.I(r9)
            java.lang.String r9 = "Filter definition"
            r6.b(r9, r8)
        L_0x008d:
            com.google.android.gms.internal.measurement.U1 r6 = r0.f50086g
            boolean r6 = r6.W()
            if (r6 == 0) goto L_0x03fd
            com.google.android.gms.internal.measurement.U1 r6 = r0.f50086g
            int r6 = r6.M()
            r8 = 256(0x100, float:3.59E-43)
            if (r6 <= r8) goto L_0x00a1
            goto L_0x03fd
        L_0x00a1:
            com.google.android.gms.internal.measurement.U1 r6 = r0.f50086g
            boolean r6 = r6.S()
            com.google.android.gms.internal.measurement.U1 r8 = r0.f50086g
            boolean r8 = r8.T()
            com.google.android.gms.internal.measurement.U1 r9 = r0.f50086g
            boolean r9 = r9.U()
            if (r6 != 0) goto L_0x00bc
            if (r8 != 0) goto L_0x00bc
            if (r9 == 0) goto L_0x00ba
            goto L_0x00bc
        L_0x00ba:
            r6 = r2
            goto L_0x00bd
        L_0x00bc:
            r6 = r3
        L_0x00bd:
            if (r22 == 0) goto L_0x00e9
            if (r6 != 0) goto L_0x00e9
            com.google.android.gms.measurement.internal.Y5 r1 = r0.f50087h
            com.google.android.gms.measurement.internal.h2 r1 = r1.f()
            com.google.android.gms.measurement.internal.i2 r1 = r1.I()
            int r2 = r0.f50056b
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            com.google.android.gms.internal.measurement.U1 r4 = r0.f50086g
            boolean r4 = r4.W()
            if (r4 == 0) goto L_0x00e3
            com.google.android.gms.internal.measurement.U1 r4 = r0.f50086g
            int r4 = r4.M()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
        L_0x00e3:
            java.lang.String r4 = "Event filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID"
            r1.c(r4, r2, r7)
            return r3
        L_0x00e9:
            com.google.android.gms.internal.measurement.U1 r8 = r0.f50086g
            java.lang.String r9 = r18.X()
            boolean r10 = r8.V()
            if (r10 == 0) goto L_0x010b
            com.google.android.gms.internal.measurement.W1 r10 = r8.P()
            java.lang.Boolean r4 = com.google.android.gms.measurement.internal.C7562b.c(r4, r10)
            if (r4 != 0) goto L_0x0101
            goto L_0x03a2
        L_0x0101:
            boolean r4 = r4.booleanValue()
            if (r4 != 0) goto L_0x010b
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            goto L_0x03a2
        L_0x010b:
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            java.util.List r5 = r8.R()
            java.util.Iterator r5 = r5.iterator()
        L_0x0118:
            boolean r10 = r5.hasNext()
            if (r10 == 0) goto L_0x0151
            java.lang.Object r10 = r5.next()
            com.google.android.gms.internal.measurement.V1 r10 = (com.google.android.gms.internal.measurement.V1) r10
            java.lang.String r11 = r10.O()
            boolean r11 = r11.isEmpty()
            if (r11 == 0) goto L_0x0149
            com.google.android.gms.measurement.internal.Y5 r4 = r0.f50087h
            com.google.android.gms.measurement.internal.h2 r4 = r4.f()
            com.google.android.gms.measurement.internal.i2 r4 = r4.J()
            com.google.android.gms.measurement.internal.Y5 r5 = r0.f50087h
            com.google.android.gms.measurement.internal.e2 r5 = r5.d()
            java.lang.String r5 = r5.c(r9)
            java.lang.String r8 = "null or empty param name in filter. event"
            r4.b(r8, r5)
            goto L_0x03a2
        L_0x0149:
            java.lang.String r10 = r10.O()
            r4.add(r10)
            goto L_0x0118
        L_0x0151:
            j0.a r5 = new j0.a
            r5.<init>()
            java.util.List r10 = r18.Y()
            java.util.Iterator r10 = r10.iterator()
        L_0x015e:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x01eb
            java.lang.Object r11 = r10.next()
            com.google.android.gms.internal.measurement.x2 r11 = (com.google.android.gms.internal.measurement.C7443x2) r11
            java.lang.String r12 = r11.Z()
            boolean r12 = r4.contains(r12)
            if (r12 == 0) goto L_0x015e
            boolean r12 = r11.e0()
            if (r12 == 0) goto L_0x0192
            java.lang.String r12 = r11.Z()
            boolean r13 = r11.e0()
            if (r13 == 0) goto L_0x018d
            long r13 = r11.V()
            java.lang.Long r11 = java.lang.Long.valueOf(r13)
            goto L_0x018e
        L_0x018d:
            r11 = r7
        L_0x018e:
            r5.put(r12, r11)
            goto L_0x015e
        L_0x0192:
            boolean r12 = r11.c0()
            if (r12 == 0) goto L_0x01b0
            java.lang.String r12 = r11.Z()
            boolean r13 = r11.c0()
            if (r13 == 0) goto L_0x01ab
            double r13 = r11.J()
            java.lang.Double r11 = java.lang.Double.valueOf(r13)
            goto L_0x01ac
        L_0x01ab:
            r11 = r7
        L_0x01ac:
            r5.put(r12, r11)
            goto L_0x015e
        L_0x01b0:
            boolean r12 = r11.g0()
            if (r12 == 0) goto L_0x01c2
            java.lang.String r12 = r11.Z()
            java.lang.String r11 = r11.a0()
            r5.put(r12, r11)
            goto L_0x015e
        L_0x01c2:
            com.google.android.gms.measurement.internal.Y5 r4 = r0.f50087h
            com.google.android.gms.measurement.internal.h2 r4 = r4.f()
            com.google.android.gms.measurement.internal.i2 r4 = r4.J()
            com.google.android.gms.measurement.internal.Y5 r5 = r0.f50087h
            com.google.android.gms.measurement.internal.e2 r5 = r5.d()
            java.lang.String r5 = r5.c(r9)
            com.google.android.gms.measurement.internal.Y5 r8 = r0.f50087h
            com.google.android.gms.measurement.internal.e2 r8 = r8.d()
            java.lang.String r9 = r11.Z()
            java.lang.String r8 = r8.f(r9)
            java.lang.String r9 = "Unknown value for param. event, param"
            r4.c(r9, r5, r8)
            goto L_0x03a2
        L_0x01eb:
            java.util.List r4 = r8.R()
            java.util.Iterator r4 = r4.iterator()
        L_0x01f3:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L_0x03a0
            java.lang.Object r8 = r4.next()
            com.google.android.gms.internal.measurement.V1 r8 = (com.google.android.gms.internal.measurement.V1) r8
            boolean r10 = r8.Q()
            if (r10 == 0) goto L_0x020d
            boolean r10 = r8.P()
            if (r10 == 0) goto L_0x020d
            r10 = r3
            goto L_0x020e
        L_0x020d:
            r10 = r2
        L_0x020e:
            java.lang.String r11 = r8.O()
            boolean r12 = r11.isEmpty()
            if (r12 == 0) goto L_0x0233
            com.google.android.gms.measurement.internal.Y5 r4 = r0.f50087h
            com.google.android.gms.measurement.internal.h2 r4 = r4.f()
            com.google.android.gms.measurement.internal.i2 r4 = r4.J()
            com.google.android.gms.measurement.internal.Y5 r5 = r0.f50087h
            com.google.android.gms.measurement.internal.e2 r5 = r5.d()
            java.lang.String r5 = r5.c(r9)
            java.lang.String r8 = "Event has empty param name. event"
            r4.b(r8, r5)
            goto L_0x03a2
        L_0x0233:
            java.lang.Object r12 = r5.get(r11)
            boolean r13 = r12 instanceof java.lang.Long
            if (r13 == 0) goto L_0x0282
            boolean r13 = r8.R()
            if (r13 != 0) goto L_0x0266
            com.google.android.gms.measurement.internal.Y5 r4 = r0.f50087h
            com.google.android.gms.measurement.internal.h2 r4 = r4.f()
            com.google.android.gms.measurement.internal.i2 r4 = r4.J()
            com.google.android.gms.measurement.internal.Y5 r5 = r0.f50087h
            com.google.android.gms.measurement.internal.e2 r5 = r5.d()
            java.lang.String r5 = r5.c(r9)
            com.google.android.gms.measurement.internal.Y5 r8 = r0.f50087h
            com.google.android.gms.measurement.internal.e2 r8 = r8.d()
            java.lang.String r8 = r8.f(r11)
            java.lang.String r9 = "No number filter for long param. event, param"
            r4.c(r9, r5, r8)
            goto L_0x03a2
        L_0x0266:
            java.lang.Long r12 = (java.lang.Long) r12
            long r11 = r12.longValue()
            com.google.android.gms.internal.measurement.W1 r8 = r8.M()
            java.lang.Boolean r8 = com.google.android.gms.measurement.internal.C7562b.c(r11, r8)
            if (r8 != 0) goto L_0x0278
            goto L_0x03a2
        L_0x0278:
            boolean r8 = r8.booleanValue()
            if (r8 != r10) goto L_0x01f3
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            goto L_0x03a2
        L_0x0282:
            boolean r13 = r12 instanceof java.lang.Double
            if (r13 == 0) goto L_0x02cd
            boolean r13 = r8.R()
            if (r13 != 0) goto L_0x02b1
            com.google.android.gms.measurement.internal.Y5 r4 = r0.f50087h
            com.google.android.gms.measurement.internal.h2 r4 = r4.f()
            com.google.android.gms.measurement.internal.i2 r4 = r4.J()
            com.google.android.gms.measurement.internal.Y5 r5 = r0.f50087h
            com.google.android.gms.measurement.internal.e2 r5 = r5.d()
            java.lang.String r5 = r5.c(r9)
            com.google.android.gms.measurement.internal.Y5 r8 = r0.f50087h
            com.google.android.gms.measurement.internal.e2 r8 = r8.d()
            java.lang.String r8 = r8.f(r11)
            java.lang.String r9 = "No number filter for double param. event, param"
            r4.c(r9, r5, r8)
            goto L_0x03a2
        L_0x02b1:
            java.lang.Double r12 = (java.lang.Double) r12
            double r11 = r12.doubleValue()
            com.google.android.gms.internal.measurement.W1 r8 = r8.M()
            java.lang.Boolean r8 = com.google.android.gms.measurement.internal.C7562b.b(r11, r8)
            if (r8 != 0) goto L_0x02c3
            goto L_0x03a2
        L_0x02c3:
            boolean r8 = r8.booleanValue()
            if (r8 != r10) goto L_0x01f3
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            goto L_0x03a2
        L_0x02cd:
            boolean r13 = r12 instanceof java.lang.String
            if (r13 == 0) goto L_0x0354
            boolean r13 = r8.T()
            if (r13 == 0) goto L_0x02e8
            java.lang.String r12 = (java.lang.String) r12
            com.google.android.gms.internal.measurement.Y1 r8 = r8.N()
            com.google.android.gms.measurement.internal.Y5 r11 = r0.f50087h
            com.google.android.gms.measurement.internal.h2 r11 = r11.f()
            java.lang.Boolean r8 = com.google.android.gms.measurement.internal.C7562b.g(r12, r8, r11)
            goto L_0x02fe
        L_0x02e8:
            boolean r13 = r8.R()
            if (r13 == 0) goto L_0x0330
            java.lang.String r12 = (java.lang.String) r12
            boolean r13 = com.google.android.gms.measurement.internal.N5.e0(r12)
            if (r13 == 0) goto L_0x030c
            com.google.android.gms.internal.measurement.W1 r8 = r8.M()
            java.lang.Boolean r8 = com.google.android.gms.measurement.internal.C7562b.e(r12, r8)
        L_0x02fe:
            if (r8 != 0) goto L_0x0302
            goto L_0x03a2
        L_0x0302:
            boolean r8 = r8.booleanValue()
            if (r8 != r10) goto L_0x01f3
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            goto L_0x03a2
        L_0x030c:
            com.google.android.gms.measurement.internal.Y5 r4 = r0.f50087h
            com.google.android.gms.measurement.internal.h2 r4 = r4.f()
            com.google.android.gms.measurement.internal.i2 r4 = r4.J()
            com.google.android.gms.measurement.internal.Y5 r5 = r0.f50087h
            com.google.android.gms.measurement.internal.e2 r5 = r5.d()
            java.lang.String r5 = r5.c(r9)
            com.google.android.gms.measurement.internal.Y5 r8 = r0.f50087h
            com.google.android.gms.measurement.internal.e2 r8 = r8.d()
            java.lang.String r8 = r8.f(r11)
            java.lang.String r9 = "Invalid param value for number filter. event, param"
            r4.c(r9, r5, r8)
            goto L_0x03a2
        L_0x0330:
            com.google.android.gms.measurement.internal.Y5 r4 = r0.f50087h
            com.google.android.gms.measurement.internal.h2 r4 = r4.f()
            com.google.android.gms.measurement.internal.i2 r4 = r4.J()
            com.google.android.gms.measurement.internal.Y5 r5 = r0.f50087h
            com.google.android.gms.measurement.internal.e2 r5 = r5.d()
            java.lang.String r5 = r5.c(r9)
            com.google.android.gms.measurement.internal.Y5 r8 = r0.f50087h
            com.google.android.gms.measurement.internal.e2 r8 = r8.d()
            java.lang.String r8 = r8.f(r11)
            java.lang.String r9 = "No filter for String param. event, param"
            r4.c(r9, r5, r8)
            goto L_0x03a2
        L_0x0354:
            if (r12 != 0) goto L_0x037c
            com.google.android.gms.measurement.internal.Y5 r4 = r0.f50087h
            com.google.android.gms.measurement.internal.h2 r4 = r4.f()
            com.google.android.gms.measurement.internal.i2 r4 = r4.I()
            com.google.android.gms.measurement.internal.Y5 r5 = r0.f50087h
            com.google.android.gms.measurement.internal.e2 r5 = r5.d()
            java.lang.String r5 = r5.c(r9)
            com.google.android.gms.measurement.internal.Y5 r7 = r0.f50087h
            com.google.android.gms.measurement.internal.e2 r7 = r7.d()
            java.lang.String r7 = r7.f(r11)
            java.lang.String r8 = "Missing param for filter. event, param"
            r4.c(r8, r5, r7)
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            goto L_0x03a2
        L_0x037c:
            com.google.android.gms.measurement.internal.Y5 r4 = r0.f50087h
            com.google.android.gms.measurement.internal.h2 r4 = r4.f()
            com.google.android.gms.measurement.internal.i2 r4 = r4.J()
            com.google.android.gms.measurement.internal.Y5 r5 = r0.f50087h
            com.google.android.gms.measurement.internal.e2 r5 = r5.d()
            java.lang.String r5 = r5.c(r9)
            com.google.android.gms.measurement.internal.Y5 r8 = r0.f50087h
            com.google.android.gms.measurement.internal.e2 r8 = r8.d()
            java.lang.String r8 = r8.f(r11)
            java.lang.String r9 = "Unknown param type. event, param"
            r4.c(r9, r5, r8)
            goto L_0x03a2
        L_0x03a0:
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
        L_0x03a2:
            com.google.android.gms.measurement.internal.Y5 r4 = r0.f50087h
            com.google.android.gms.measurement.internal.h2 r4 = r4.f()
            com.google.android.gms.measurement.internal.i2 r4 = r4.I()
            if (r7 != 0) goto L_0x03b1
            java.lang.String r5 = "null"
            goto L_0x03b2
        L_0x03b1:
            r5 = r7
        L_0x03b2:
            java.lang.String r8 = "Event filter result"
            r4.b(r8, r5)
            if (r7 != 0) goto L_0x03ba
            return r2
        L_0x03ba:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r0.f50057c = r2
            boolean r4 = r7.booleanValue()
            if (r4 != 0) goto L_0x03c5
            return r3
        L_0x03c5:
            r0.f50058d = r2
            if (r6 == 0) goto L_0x03fc
            boolean r2 = r18.b0()
            if (r2 == 0) goto L_0x03fc
            long r4 = r18.U()
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            com.google.android.gms.internal.measurement.U1 r4 = r0.f50086g
            boolean r4 = r4.T()
            if (r4 == 0) goto L_0x03ee
            if (r1 == 0) goto L_0x03eb
            com.google.android.gms.internal.measurement.U1 r1 = r0.f50086g
            boolean r1 = r1.V()
            if (r1 == 0) goto L_0x03eb
            r2 = r16
        L_0x03eb:
            r0.f50060f = r2
            goto L_0x03fc
        L_0x03ee:
            if (r1 == 0) goto L_0x03fa
            com.google.android.gms.internal.measurement.U1 r1 = r0.f50086g
            boolean r1 = r1.V()
            if (r1 == 0) goto L_0x03fa
            r2 = r17
        L_0x03fa:
            r0.f50059e = r2
        L_0x03fc:
            return r3
        L_0x03fd:
            com.google.android.gms.measurement.internal.Y5 r1 = r0.f50087h
            com.google.android.gms.measurement.internal.h2 r1 = r1.f()
            com.google.android.gms.measurement.internal.i2 r1 = r1.J()
            java.lang.String r3 = r0.f50055a
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C7607h2.t(r3)
            com.google.android.gms.internal.measurement.U1 r4 = r0.f50086g
            boolean r4 = r4.W()
            if (r4 == 0) goto L_0x041f
            com.google.android.gms.internal.measurement.U1 r4 = r0.f50086g
            int r4 = r4.M()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
        L_0x041f:
            java.lang.String r4 = java.lang.String.valueOf(r7)
            java.lang.String r5 = "Invalid event filter ID. appId, id"
            r1.c(r5, r3, r4)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C7569c.k(java.lang.Long, java.lang.Long, com.google.android.gms.internal.measurement.v2, long, com.google.android.gms.measurement.internal.G, boolean):boolean");
    }
}
