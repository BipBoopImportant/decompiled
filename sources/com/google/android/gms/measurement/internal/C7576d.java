package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.X1;

/* renamed from: com.google.android.gms.measurement.internal.d  reason: case insensitive filesystem */
final class C7576d extends C7562b {

    /* renamed from: g  reason: collision with root package name */
    private X1 f50099g;

    /* renamed from: h  reason: collision with root package name */
    private final /* synthetic */ Y5 f50100h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C7576d(Y5 y52, String str, int i10, X1 x12) {
        super(str, i10);
        this.f50100h = y52;
        this.f50099g = x12;
    }

    /* access modifiers changed from: package-private */
    public final int a() {
        return this.f50099g.m();
    }

    /* access modifiers changed from: package-private */
    public final boolean i() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public final boolean j() {
        return true;
    }

    /* JADX WARNING: type inference failed for: r4v17, types: [java.lang.Integer] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean k(java.lang.Long r11, java.lang.Long r12, com.google.android.gms.internal.measurement.F2 r13, boolean r14) {
        /*
            r10 = this;
            boolean r0 = com.google.android.gms.internal.measurement.O6.a()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x001a
            com.google.android.gms.measurement.internal.Y5 r0 = r10.f50100h
            com.google.android.gms.measurement.internal.i r0 = r0.a()
            java.lang.String r3 = r10.f50055a
            com.google.android.gms.measurement.internal.Y1<java.lang.Boolean> r4 = com.google.android.gms.measurement.internal.K.f49797y0
            boolean r0 = r0.H(r3, r4)
            if (r0 == 0) goto L_0x001a
            r0 = r2
            goto L_0x001b
        L_0x001a:
            r0 = r1
        L_0x001b:
            com.google.android.gms.internal.measurement.X1 r3 = r10.f50099g
            boolean r3 = r3.O()
            com.google.android.gms.internal.measurement.X1 r4 = r10.f50099g
            boolean r4 = r4.P()
            com.google.android.gms.internal.measurement.X1 r5 = r10.f50099g
            boolean r5 = r5.Q()
            if (r3 != 0) goto L_0x0036
            if (r4 != 0) goto L_0x0036
            if (r5 == 0) goto L_0x0034
            goto L_0x0036
        L_0x0034:
            r3 = r1
            goto L_0x0037
        L_0x0036:
            r3 = r2
        L_0x0037:
            r4 = 0
            if (r14 == 0) goto L_0x0064
            if (r3 != 0) goto L_0x0064
            com.google.android.gms.measurement.internal.Y5 r11 = r10.f50100h
            com.google.android.gms.measurement.internal.h2 r11 = r11.f()
            com.google.android.gms.measurement.internal.i2 r11 = r11.I()
            int r12 = r10.f50056b
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            com.google.android.gms.internal.measurement.X1 r13 = r10.f50099g
            boolean r13 = r13.R()
            if (r13 == 0) goto L_0x005e
            com.google.android.gms.internal.measurement.X1 r13 = r10.f50099g
            int r13 = r13.m()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r13)
        L_0x005e:
            java.lang.String r13 = "Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID"
            r11.c(r13, r12, r4)
            return r2
        L_0x0064:
            com.google.android.gms.internal.measurement.X1 r6 = r10.f50099g
            com.google.android.gms.internal.measurement.V1 r6 = r6.K()
            boolean r7 = r6.P()
            boolean r8 = r13.b0()
            if (r8 == 0) goto L_0x00ab
            boolean r8 = r6.R()
            if (r8 != 0) goto L_0x0099
            com.google.android.gms.measurement.internal.Y5 r6 = r10.f50100h
            com.google.android.gms.measurement.internal.h2 r6 = r6.f()
            com.google.android.gms.measurement.internal.i2 r6 = r6.J()
            com.google.android.gms.measurement.internal.Y5 r7 = r10.f50100h
            com.google.android.gms.measurement.internal.e2 r7 = r7.d()
            java.lang.String r8 = r13.X()
            java.lang.String r7 = r7.g(r8)
            java.lang.String r8 = "No number filter for long property. property"
            r6.b(r8, r7)
            goto L_0x0189
        L_0x0099:
            long r8 = r13.S()
            com.google.android.gms.internal.measurement.W1 r4 = r6.M()
            java.lang.Boolean r4 = com.google.android.gms.measurement.internal.C7562b.c(r8, r4)
            java.lang.Boolean r4 = com.google.android.gms.measurement.internal.C7562b.d(r4, r7)
            goto L_0x0189
        L_0x00ab:
            boolean r8 = r13.Z()
            if (r8 == 0) goto L_0x00e8
            boolean r8 = r6.R()
            if (r8 != 0) goto L_0x00d6
            com.google.android.gms.measurement.internal.Y5 r6 = r10.f50100h
            com.google.android.gms.measurement.internal.h2 r6 = r6.f()
            com.google.android.gms.measurement.internal.i2 r6 = r6.J()
            com.google.android.gms.measurement.internal.Y5 r7 = r10.f50100h
            com.google.android.gms.measurement.internal.e2 r7 = r7.d()
            java.lang.String r8 = r13.X()
            java.lang.String r7 = r7.g(r8)
            java.lang.String r8 = "No number filter for double property. property"
            r6.b(r8, r7)
            goto L_0x0189
        L_0x00d6:
            double r8 = r13.J()
            com.google.android.gms.internal.measurement.W1 r4 = r6.M()
            java.lang.Boolean r4 = com.google.android.gms.measurement.internal.C7562b.b(r8, r4)
            java.lang.Boolean r4 = com.google.android.gms.measurement.internal.C7562b.d(r4, r7)
            goto L_0x0189
        L_0x00e8:
            boolean r8 = r13.d0()
            if (r8 == 0) goto L_0x016c
            boolean r8 = r6.T()
            if (r8 != 0) goto L_0x0155
            boolean r8 = r6.R()
            if (r8 != 0) goto L_0x0118
            com.google.android.gms.measurement.internal.Y5 r6 = r10.f50100h
            com.google.android.gms.measurement.internal.h2 r6 = r6.f()
            com.google.android.gms.measurement.internal.i2 r6 = r6.J()
            com.google.android.gms.measurement.internal.Y5 r7 = r10.f50100h
            com.google.android.gms.measurement.internal.e2 r7 = r7.d()
            java.lang.String r8 = r13.X()
            java.lang.String r7 = r7.g(r8)
            java.lang.String r8 = "No string or number filter defined. property"
            r6.b(r8, r7)
            goto L_0x0189
        L_0x0118:
            java.lang.String r8 = r13.Y()
            boolean r8 = com.google.android.gms.measurement.internal.N5.e0(r8)
            if (r8 == 0) goto L_0x0133
            java.lang.String r4 = r13.Y()
            com.google.android.gms.internal.measurement.W1 r6 = r6.M()
            java.lang.Boolean r4 = com.google.android.gms.measurement.internal.C7562b.e(r4, r6)
            java.lang.Boolean r4 = com.google.android.gms.measurement.internal.C7562b.d(r4, r7)
            goto L_0x0189
        L_0x0133:
            com.google.android.gms.measurement.internal.Y5 r6 = r10.f50100h
            com.google.android.gms.measurement.internal.h2 r6 = r6.f()
            com.google.android.gms.measurement.internal.i2 r6 = r6.J()
            com.google.android.gms.measurement.internal.Y5 r7 = r10.f50100h
            com.google.android.gms.measurement.internal.e2 r7 = r7.d()
            java.lang.String r8 = r13.X()
            java.lang.String r7 = r7.g(r8)
            java.lang.String r8 = r13.Y()
            java.lang.String r9 = "Invalid user property value for Numeric number filter. property, value"
            r6.c(r9, r7, r8)
            goto L_0x0189
        L_0x0155:
            java.lang.String r4 = r13.Y()
            com.google.android.gms.internal.measurement.Y1 r6 = r6.N()
            com.google.android.gms.measurement.internal.Y5 r8 = r10.f50100h
            com.google.android.gms.measurement.internal.h2 r8 = r8.f()
            java.lang.Boolean r4 = com.google.android.gms.measurement.internal.C7562b.g(r4, r6, r8)
            java.lang.Boolean r4 = com.google.android.gms.measurement.internal.C7562b.d(r4, r7)
            goto L_0x0189
        L_0x016c:
            com.google.android.gms.measurement.internal.Y5 r6 = r10.f50100h
            com.google.android.gms.measurement.internal.h2 r6 = r6.f()
            com.google.android.gms.measurement.internal.i2 r6 = r6.J()
            com.google.android.gms.measurement.internal.Y5 r7 = r10.f50100h
            com.google.android.gms.measurement.internal.e2 r7 = r7.d()
            java.lang.String r8 = r13.X()
            java.lang.String r7 = r7.g(r8)
            java.lang.String r8 = "User property has no value, property"
            r6.b(r8, r7)
        L_0x0189:
            com.google.android.gms.measurement.internal.Y5 r6 = r10.f50100h
            com.google.android.gms.measurement.internal.h2 r6 = r6.f()
            com.google.android.gms.measurement.internal.i2 r6 = r6.I()
            if (r4 != 0) goto L_0x0198
            java.lang.String r7 = "null"
            goto L_0x0199
        L_0x0198:
            r7 = r4
        L_0x0199:
            java.lang.String r8 = "Property filter result"
            r6.b(r8, r7)
            if (r4 != 0) goto L_0x01a1
            return r1
        L_0x01a1:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r10.f50057c = r1
            if (r5 == 0) goto L_0x01ae
            boolean r1 = r4.booleanValue()
            if (r1 != 0) goto L_0x01ae
            return r2
        L_0x01ae:
            if (r14 == 0) goto L_0x01b8
            com.google.android.gms.internal.measurement.X1 r14 = r10.f50099g
            boolean r14 = r14.O()
            if (r14 == 0) goto L_0x01ba
        L_0x01b8:
            r10.f50058d = r4
        L_0x01ba:
            boolean r14 = r4.booleanValue()
            if (r14 == 0) goto L_0x01ff
            if (r3 == 0) goto L_0x01ff
            boolean r14 = r13.c0()
            if (r14 == 0) goto L_0x01ff
            long r13 = r13.U()
            if (r11 == 0) goto L_0x01d2
            long r13 = r11.longValue()
        L_0x01d2:
            if (r0 == 0) goto L_0x01ea
            com.google.android.gms.internal.measurement.X1 r11 = r10.f50099g
            boolean r11 = r11.O()
            if (r11 == 0) goto L_0x01ea
            com.google.android.gms.internal.measurement.X1 r11 = r10.f50099g
            boolean r11 = r11.P()
            if (r11 != 0) goto L_0x01ea
            if (r12 == 0) goto L_0x01ea
            long r13 = r12.longValue()
        L_0x01ea:
            com.google.android.gms.internal.measurement.X1 r11 = r10.f50099g
            boolean r11 = r11.P()
            if (r11 == 0) goto L_0x01f9
            java.lang.Long r11 = java.lang.Long.valueOf(r13)
            r10.f50060f = r11
            goto L_0x01ff
        L_0x01f9:
            java.lang.Long r11 = java.lang.Long.valueOf(r13)
            r10.f50059e = r11
        L_0x01ff:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C7576d.k(java.lang.Long, java.lang.Long, com.google.android.gms.internal.measurement.F2, boolean):boolean");
    }
}
