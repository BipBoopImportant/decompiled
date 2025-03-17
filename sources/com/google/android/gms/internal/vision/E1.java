package com.google.android.gms.internal.vision;

import com.google.ar.core.ImageFormat;
import com.oppwa.mobile.connect.BuildConfig;
import d9.M;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

final class E1<T> implements S1<T> {

    /* renamed from: r  reason: collision with root package name */
    private static final int[] f49175r = new int[0];

    /* renamed from: s  reason: collision with root package name */
    private static final Unsafe f49176s = q2.t();

    /* renamed from: a  reason: collision with root package name */
    private final int[] f49177a;

    /* renamed from: b  reason: collision with root package name */
    private final Object[] f49178b;

    /* renamed from: c  reason: collision with root package name */
    private final int f49179c;

    /* renamed from: d  reason: collision with root package name */
    private final int f49180d;

    /* renamed from: e  reason: collision with root package name */
    private final A1 f49181e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f49182f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f49183g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f49184h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f49185i;

    /* renamed from: j  reason: collision with root package name */
    private final int[] f49186j;

    /* renamed from: k  reason: collision with root package name */
    private final int f49187k;

    /* renamed from: l  reason: collision with root package name */
    private final int f49188l;

    /* renamed from: m  reason: collision with root package name */
    private final H1 f49189m;

    /* renamed from: n  reason: collision with root package name */
    private final C7502j1 f49190n;

    /* renamed from: o  reason: collision with root package name */
    private final C7503j2<?, ?> f49191o;

    /* renamed from: p  reason: collision with root package name */
    private final E0<?> f49192p;

    /* renamed from: q  reason: collision with root package name */
    private final C7548x1 f49193q;

    private E1(int[] iArr, Object[] objArr, int i10, int i11, A1 a12, boolean z10, boolean z11, int[] iArr2, int i12, int i13, H1 h12, C7502j1 j1Var, C7503j2<?, ?> j2Var, E0<?> e02, C7548x1 x1Var) {
        A1 a13 = a12;
        E0<?> e03 = e02;
        this.f49177a = iArr;
        this.f49178b = objArr;
        this.f49179c = i10;
        this.f49180d = i11;
        this.f49183g = a13 instanceof Q0;
        this.f49184h = z10;
        this.f49182f = e03 != null && e03.e(a12);
        this.f49185i = false;
        this.f49186j = iArr2;
        this.f49187k = i12;
        this.f49188l = i13;
        this.f49189m = h12;
        this.f49190n = j1Var;
        this.f49191o = j2Var;
        this.f49192p = e03;
        this.f49181e = a13;
        this.f49193q = x1Var;
    }

    private final int A(int i10, int i11) {
        int length = (this.f49177a.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int i14 = this.f49177a[i13];
            if (i10 == i14) {
                return i13;
            }
            if (i10 < i14) {
                length = i12 - 1;
            } else {
                i11 = i12 + 1;
            }
        }
        return -1;
    }

    private final Object B(int i10) {
        return this.f49178b[(i10 / 3) << 1];
    }

    private final void C(T t10, int i10) {
        int L10 = L(i10);
        long j10 = (long) (1048575 & L10);
        if (j10 != 1048575) {
            q2.h(t10, j10, (1 << (L10 >>> 20)) | q2.b(t10, j10));
        }
    }

    private final void D(T t10, int i10, int i11) {
        q2.h(t10, (long) (L(i11) & 1048575), i10);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0487, code lost:
        r10 = r10 + 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x029e, code lost:
        r4 = r15;
     */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x048d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0031  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void E(T r18, com.google.android.gms.internal.vision.H2 r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            boolean r3 = r0.f49182f
            if (r3 == 0) goto L_0x0023
            com.google.android.gms.internal.vision.E0<?> r3 = r0.f49192p
            com.google.android.gms.internal.vision.I0 r3 = r3.b(r1)
            com.google.android.gms.internal.vision.W1<T, java.lang.Object> r5 = r3.f49209a
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x0023
            java.util.Iterator r3 = r3.o()
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x0025
        L_0x0023:
            r3 = 0
            r5 = 0
        L_0x0025:
            int[] r6 = r0.f49177a
            int r6 = r6.length
            sun.misc.Unsafe r7 = f49176s
            r10 = 0
            r11 = 1048575(0xfffff, float:1.469367E-39)
            r12 = 0
        L_0x002f:
            if (r10 >= r6) goto L_0x048b
            int r13 = r0.J(r10)
            int[] r14 = r0.f49177a
            r15 = r14[r10]
            r16 = 267386880(0xff00000, float:2.3665827E-29)
            r16 = r13 & r16
            int r4 = r16 >>> 20
            r9 = 17
            if (r4 > r9) goto L_0x005a
            int r9 = r10 + 2
            r9 = r14[r9]
            r14 = 1048575(0xfffff, float:1.469367E-39)
            r8 = r9 & r14
            if (r8 == r11) goto L_0x0054
            long r11 = (long) r8
            int r12 = r7.getInt(r1, r11)
            r11 = r8
        L_0x0054:
            int r8 = r9 >>> 20
            r9 = 1
            int r8 = r9 << r8
            goto L_0x005b
        L_0x005a:
            r8 = 0
        L_0x005b:
            if (r5 == 0) goto L_0x0079
            com.google.android.gms.internal.vision.E0<?> r9 = r0.f49192p
            int r9 = r9.a(r5)
            if (r9 > r15) goto L_0x0079
            com.google.android.gms.internal.vision.E0<?> r9 = r0.f49192p
            r9.d(r2, r5)
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0077
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x005b
        L_0x0077:
            r5 = 0
            goto L_0x005b
        L_0x0079:
            r9 = 1048575(0xfffff, float:1.469367E-39)
            r13 = r13 & r9
            long r13 = (long) r13
            switch(r4) {
                case 0: goto L_0x047c;
                case 1: goto L_0x0470;
                case 2: goto L_0x0464;
                case 3: goto L_0x0458;
                case 4: goto L_0x044c;
                case 5: goto L_0x0440;
                case 6: goto L_0x0434;
                case 7: goto L_0x0428;
                case 8: goto L_0x041c;
                case 9: goto L_0x040b;
                case 10: goto L_0x03fc;
                case 11: goto L_0x03ef;
                case 12: goto L_0x03e2;
                case 13: goto L_0x03d5;
                case 14: goto L_0x03c8;
                case 15: goto L_0x03bb;
                case 16: goto L_0x03ae;
                case 17: goto L_0x039d;
                case 18: goto L_0x038d;
                case 19: goto L_0x037d;
                case 20: goto L_0x036d;
                case 21: goto L_0x035d;
                case 22: goto L_0x034d;
                case 23: goto L_0x033d;
                case 24: goto L_0x032d;
                case 25: goto L_0x031d;
                case 26: goto L_0x030e;
                case 27: goto L_0x02fb;
                case 28: goto L_0x02ec;
                case 29: goto L_0x02dd;
                case 30: goto L_0x02ce;
                case 31: goto L_0x02bf;
                case 32: goto L_0x02b0;
                case 33: goto L_0x02a1;
                case 34: goto L_0x0290;
                case 35: goto L_0x0280;
                case 36: goto L_0x0270;
                case 37: goto L_0x0260;
                case 38: goto L_0x0250;
                case 39: goto L_0x0240;
                case 40: goto L_0x0230;
                case 41: goto L_0x0220;
                case 42: goto L_0x0210;
                case 43: goto L_0x0200;
                case 44: goto L_0x01f0;
                case 45: goto L_0x01e0;
                case 46: goto L_0x01d0;
                case 47: goto L_0x01c0;
                case 48: goto L_0x01b0;
                case 49: goto L_0x019d;
                case 50: goto L_0x0194;
                case 51: goto L_0x0185;
                case 52: goto L_0x0176;
                case 53: goto L_0x0167;
                case 54: goto L_0x0158;
                case 55: goto L_0x0149;
                case 56: goto L_0x013a;
                case 57: goto L_0x012b;
                case 58: goto L_0x011c;
                case 59: goto L_0x010d;
                case 60: goto L_0x00fa;
                case 61: goto L_0x00ea;
                case 62: goto L_0x00dc;
                case 63: goto L_0x00ce;
                case 64: goto L_0x00c0;
                case 65: goto L_0x00b2;
                case 66: goto L_0x00a4;
                case 67: goto L_0x0096;
                case 68: goto L_0x0084;
                default: goto L_0x0081;
            }
        L_0x0081:
            r4 = 0
            goto L_0x0487
        L_0x0084:
            boolean r4 = r0.w(r1, r15, r10)
            if (r4 == 0) goto L_0x0081
            java.lang.Object r4 = r7.getObject(r1, r13)
            com.google.android.gms.internal.vision.S1 r8 = r0.m(r10)
            r2.H(r15, r4, r8)
            goto L_0x0081
        L_0x0096:
            boolean r4 = r0.w(r1, r15, r10)
            if (r4 == 0) goto L_0x0081
            long r13 = M(r1, r13)
            r2.r(r15, r13)
            goto L_0x0081
        L_0x00a4:
            boolean r4 = r0.w(r1, r15, r10)
            if (r4 == 0) goto L_0x0081
            int r4 = K(r1, r13)
            r2.m(r15, r4)
            goto L_0x0081
        L_0x00b2:
            boolean r4 = r0.w(r1, r15, r10)
            if (r4 == 0) goto L_0x0081
            long r13 = M(r1, r13)
            r2.a(r15, r13)
            goto L_0x0081
        L_0x00c0:
            boolean r4 = r0.w(r1, r15, r10)
            if (r4 == 0) goto L_0x0081
            int r4 = K(r1, r13)
            r2.i(r15, r4)
            goto L_0x0081
        L_0x00ce:
            boolean r4 = r0.w(r1, r15, r10)
            if (r4 == 0) goto L_0x0081
            int r4 = K(r1, r13)
            r2.p(r15, r4)
            goto L_0x0081
        L_0x00dc:
            boolean r4 = r0.w(r1, r15, r10)
            if (r4 == 0) goto L_0x0081
            int r4 = K(r1, r13)
            r2.v(r15, r4)
            goto L_0x0081
        L_0x00ea:
            boolean r4 = r0.w(r1, r15, r10)
            if (r4 == 0) goto L_0x0081
            java.lang.Object r4 = r7.getObject(r1, r13)
            com.google.android.gms.internal.vision.i0 r4 = (com.google.android.gms.internal.vision.C7497i0) r4
            r2.s(r15, r4)
            goto L_0x0081
        L_0x00fa:
            boolean r4 = r0.w(r1, r15, r10)
            if (r4 == 0) goto L_0x0081
            java.lang.Object r4 = r7.getObject(r1, r13)
            com.google.android.gms.internal.vision.S1 r8 = r0.m(r10)
            r2.G(r15, r4, r8)
            goto L_0x0081
        L_0x010d:
            boolean r4 = r0.w(r1, r15, r10)
            if (r4 == 0) goto L_0x0081
            java.lang.Object r4 = r7.getObject(r1, r13)
            r(r15, r4, r2)
            goto L_0x0081
        L_0x011c:
            boolean r4 = r0.w(r1, r15, r10)
            if (r4 == 0) goto L_0x0081
            boolean r4 = O(r1, r13)
            r2.o(r15, r4)
            goto L_0x0081
        L_0x012b:
            boolean r4 = r0.w(r1, r15, r10)
            if (r4 == 0) goto L_0x0081
            int r4 = K(r1, r13)
            r2.u(r15, r4)
            goto L_0x0081
        L_0x013a:
            boolean r4 = r0.w(r1, r15, r10)
            if (r4 == 0) goto L_0x0081
            long r13 = M(r1, r13)
            r2.q(r15, r13)
            goto L_0x0081
        L_0x0149:
            boolean r4 = r0.w(r1, r15, r10)
            if (r4 == 0) goto L_0x0081
            int r4 = K(r1, r13)
            r2.e(r15, r4)
            goto L_0x0081
        L_0x0158:
            boolean r4 = r0.w(r1, r15, r10)
            if (r4 == 0) goto L_0x0081
            long r13 = M(r1, r13)
            r2.f(r15, r13)
            goto L_0x0081
        L_0x0167:
            boolean r4 = r0.w(r1, r15, r10)
            if (r4 == 0) goto L_0x0081
            long r13 = M(r1, r13)
            r2.j(r15, r13)
            goto L_0x0081
        L_0x0176:
            boolean r4 = r0.w(r1, r15, r10)
            if (r4 == 0) goto L_0x0081
            float r4 = G(r1, r13)
            r2.l(r15, r4)
            goto L_0x0081
        L_0x0185:
            boolean r4 = r0.w(r1, r15, r10)
            if (r4 == 0) goto L_0x0081
            double r13 = z(r1, r13)
            r2.k(r15, r13)
            goto L_0x0081
        L_0x0194:
            java.lang.Object r4 = r7.getObject(r1, r13)
            r0.t(r2, r15, r4, r10)
            goto L_0x0081
        L_0x019d:
            int[] r4 = r0.f49177a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.S1 r13 = r0.m(r10)
            com.google.android.gms.internal.vision.T1.x(r4, r8, r2, r13)
            goto L_0x0081
        L_0x01b0:
            int[] r4 = r0.f49177a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            r15 = 1
            com.google.android.gms.internal.vision.T1.K(r4, r8, r2, r15)
            goto L_0x0081
        L_0x01c0:
            r15 = 1
            int[] r4 = r0.f49177a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.T1.Z(r4, r8, r2, r15)
            goto L_0x0081
        L_0x01d0:
            r15 = 1
            int[] r4 = r0.f49177a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.T1.Q(r4, r8, r2, r15)
            goto L_0x0081
        L_0x01e0:
            r15 = 1
            int[] r4 = r0.f49177a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.T1.b0(r4, r8, r2, r15)
            goto L_0x0081
        L_0x01f0:
            r15 = 1
            int[] r4 = r0.f49177a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.T1.c0(r4, r8, r2, r15)
            goto L_0x0081
        L_0x0200:
            r15 = 1
            int[] r4 = r0.f49177a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.T1.W(r4, r8, r2, r15)
            goto L_0x0081
        L_0x0210:
            r15 = 1
            int[] r4 = r0.f49177a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.T1.d0(r4, r8, r2, r15)
            goto L_0x0081
        L_0x0220:
            r15 = 1
            int[] r4 = r0.f49177a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.T1.a0(r4, r8, r2, r15)
            goto L_0x0081
        L_0x0230:
            r15 = 1
            int[] r4 = r0.f49177a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.T1.N(r4, r8, r2, r15)
            goto L_0x0081
        L_0x0240:
            r15 = 1
            int[] r4 = r0.f49177a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.T1.T(r4, r8, r2, r15)
            goto L_0x0081
        L_0x0250:
            r15 = 1
            int[] r4 = r0.f49177a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.T1.G(r4, r8, r2, r15)
            goto L_0x0081
        L_0x0260:
            r15 = 1
            int[] r4 = r0.f49177a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.T1.C(r4, r8, r2, r15)
            goto L_0x0081
        L_0x0270:
            r15 = 1
            int[] r4 = r0.f49177a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.T1.y(r4, r8, r2, r15)
            goto L_0x0081
        L_0x0280:
            r15 = 1
            int[] r4 = r0.f49177a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.T1.l(r4, r8, r2, r15)
            goto L_0x0081
        L_0x0290:
            int[] r4 = r0.f49177a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            r15 = 0
            com.google.android.gms.internal.vision.T1.K(r4, r8, r2, r15)
        L_0x029e:
            r4 = r15
            goto L_0x0487
        L_0x02a1:
            r15 = 0
            int[] r4 = r0.f49177a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.T1.Z(r4, r8, r2, r15)
            goto L_0x029e
        L_0x02b0:
            r15 = 0
            int[] r4 = r0.f49177a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.T1.Q(r4, r8, r2, r15)
            goto L_0x029e
        L_0x02bf:
            r15 = 0
            int[] r4 = r0.f49177a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.T1.b0(r4, r8, r2, r15)
            goto L_0x029e
        L_0x02ce:
            r15 = 0
            int[] r4 = r0.f49177a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.T1.c0(r4, r8, r2, r15)
            goto L_0x029e
        L_0x02dd:
            r15 = 0
            int[] r4 = r0.f49177a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.T1.W(r4, r8, r2, r15)
            goto L_0x029e
        L_0x02ec:
            int[] r4 = r0.f49177a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.T1.w(r4, r8, r2)
            goto L_0x0081
        L_0x02fb:
            int[] r4 = r0.f49177a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.S1 r13 = r0.m(r10)
            com.google.android.gms.internal.vision.T1.k(r4, r8, r2, r13)
            goto L_0x0081
        L_0x030e:
            int[] r4 = r0.f49177a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.T1.j(r4, r8, r2)
            goto L_0x0081
        L_0x031d:
            int[] r4 = r0.f49177a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            r15 = 0
            com.google.android.gms.internal.vision.T1.d0(r4, r8, r2, r15)
            goto L_0x029e
        L_0x032d:
            r15 = 0
            int[] r4 = r0.f49177a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.T1.a0(r4, r8, r2, r15)
            goto L_0x029e
        L_0x033d:
            r15 = 0
            int[] r4 = r0.f49177a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.T1.N(r4, r8, r2, r15)
            goto L_0x029e
        L_0x034d:
            r15 = 0
            int[] r4 = r0.f49177a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.T1.T(r4, r8, r2, r15)
            goto L_0x029e
        L_0x035d:
            r15 = 0
            int[] r4 = r0.f49177a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.T1.G(r4, r8, r2, r15)
            goto L_0x029e
        L_0x036d:
            r15 = 0
            int[] r4 = r0.f49177a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.T1.C(r4, r8, r2, r15)
            goto L_0x029e
        L_0x037d:
            r15 = 0
            int[] r4 = r0.f49177a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.T1.y(r4, r8, r2, r15)
            goto L_0x029e
        L_0x038d:
            r15 = 0
            int[] r4 = r0.f49177a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.T1.l(r4, r8, r2, r15)
            goto L_0x029e
        L_0x039d:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0487
            java.lang.Object r8 = r7.getObject(r1, r13)
            com.google.android.gms.internal.vision.S1 r13 = r0.m(r10)
            r2.H(r15, r8, r13)
            goto L_0x0487
        L_0x03ae:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0487
            long r13 = r7.getLong(r1, r13)
            r2.r(r15, r13)
            goto L_0x0487
        L_0x03bb:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0487
            int r8 = r7.getInt(r1, r13)
            r2.m(r15, r8)
            goto L_0x0487
        L_0x03c8:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0487
            long r13 = r7.getLong(r1, r13)
            r2.a(r15, r13)
            goto L_0x0487
        L_0x03d5:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0487
            int r8 = r7.getInt(r1, r13)
            r2.i(r15, r8)
            goto L_0x0487
        L_0x03e2:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0487
            int r8 = r7.getInt(r1, r13)
            r2.p(r15, r8)
            goto L_0x0487
        L_0x03ef:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0487
            int r8 = r7.getInt(r1, r13)
            r2.v(r15, r8)
            goto L_0x0487
        L_0x03fc:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0487
            java.lang.Object r8 = r7.getObject(r1, r13)
            com.google.android.gms.internal.vision.i0 r8 = (com.google.android.gms.internal.vision.C7497i0) r8
            r2.s(r15, r8)
            goto L_0x0487
        L_0x040b:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0487
            java.lang.Object r8 = r7.getObject(r1, r13)
            com.google.android.gms.internal.vision.S1 r13 = r0.m(r10)
            r2.G(r15, r8, r13)
            goto L_0x0487
        L_0x041c:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0487
            java.lang.Object r8 = r7.getObject(r1, r13)
            r(r15, r8, r2)
            goto L_0x0487
        L_0x0428:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0487
            boolean r8 = com.google.android.gms.internal.vision.q2.w(r1, r13)
            r2.o(r15, r8)
            goto L_0x0487
        L_0x0434:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0487
            int r8 = r7.getInt(r1, r13)
            r2.u(r15, r8)
            goto L_0x0487
        L_0x0440:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0487
            long r13 = r7.getLong(r1, r13)
            r2.q(r15, r13)
            goto L_0x0487
        L_0x044c:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0487
            int r8 = r7.getInt(r1, r13)
            r2.e(r15, r8)
            goto L_0x0487
        L_0x0458:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0487
            long r13 = r7.getLong(r1, r13)
            r2.f(r15, r13)
            goto L_0x0487
        L_0x0464:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0487
            long r13 = r7.getLong(r1, r13)
            r2.j(r15, r13)
            goto L_0x0487
        L_0x0470:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0487
            float r8 = com.google.android.gms.internal.vision.q2.x(r1, r13)
            r2.l(r15, r8)
            goto L_0x0487
        L_0x047c:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0487
            double r13 = com.google.android.gms.internal.vision.q2.C(r1, r13)
            r2.k(r15, r13)
        L_0x0487:
            int r10 = r10 + 3
            goto L_0x002f
        L_0x048b:
            if (r5 == 0) goto L_0x04a2
            com.google.android.gms.internal.vision.E0<?> r4 = r0.f49192p
            r4.d(r2, r5)
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x04a0
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            r5 = r4
            goto L_0x048b
        L_0x04a0:
            r5 = 0
            goto L_0x048b
        L_0x04a2:
            com.google.android.gms.internal.vision.j2<?, ?> r3 = r0.f49191o
            s(r3, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.E1.E(java.lang.Object, com.google.android.gms.internal.vision.H2):void");
    }

    private final void F(T t10, T t11, int i10) {
        int J10 = J(i10);
        int i11 = this.f49177a[i10];
        long j10 = (long) (J10 & 1048575);
        if (w(t11, i11, i10)) {
            Object F10 = w(t10, i11, i10) ? q2.F(t10, j10) : null;
            Object F11 = q2.F(t11, j10);
            if (F10 != null && F11 != null) {
                q2.j(t10, j10, U0.e(F10, F11));
                D(t10, i11, i10);
            } else if (F11 != null) {
                q2.j(t10, j10, F11);
                D(t10, i11, i10);
            }
        }
    }

    private static <T> float G(T t10, long j10) {
        return ((Float) q2.F(t10, j10)).floatValue();
    }

    private final V0 H(int i10) {
        return (V0) this.f49178b[((i10 / 3) << 1) + 1];
    }

    private final boolean I(T t10, T t11, int i10) {
        return v(t10, i10) == v(t11, i10);
    }

    private final int J(int i10) {
        return this.f49177a[i10 + 1];
    }

    private static <T> int K(T t10, long j10) {
        return ((Integer) q2.F(t10, j10)).intValue();
    }

    private final int L(int i10) {
        return this.f49177a[i10 + 2];
    }

    private static <T> long M(T t10, long j10) {
        return ((Long) q2.F(t10, j10)).longValue();
    }

    private static C7515m2 N(Object obj) {
        Q0 q02 = (Q0) obj;
        C7515m2 m2Var = q02.zzb;
        if (m2Var != C7515m2.a()) {
            return m2Var;
        }
        C7515m2 g10 = C7515m2.g();
        q02.zzb = g10;
        return g10;
    }

    private static <T> boolean O(T t10, long j10) {
        return ((Boolean) q2.F(t10, j10)).booleanValue();
    }

    private final int P(int i10) {
        if (i10 < this.f49179c || i10 > this.f49180d) {
            return -1;
        }
        return A(i10, 0);
    }

    private final int f(int i10, int i11) {
        if (i10 < this.f49179c || i10 > this.f49180d) {
            return -1;
        }
        return A(i10, i11);
    }

    private static <UT, UB> int g(C7503j2<UT, UB> j2Var, T t10) {
        return j2Var.l(j2Var.f(t10));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x014d, code lost:
        r2 = r4 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x015e, code lost:
        r2 = r4 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x019e, code lost:
        r12.putInt(r1, r13, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:?, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:?, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int h(T r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, int r25, long r26, int r28, com.google.android.gms.internal.vision.C7481e0 r29) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r18
            r4 = r19
            r2 = r21
            r8 = r22
            r5 = r23
            r9 = r26
            r6 = r28
            r11 = r29
            sun.misc.Unsafe r12 = f49176s
            int[] r7 = r0.f49177a
            int r13 = r6 + 2
            r7 = r7[r13]
            r13 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r7 & r13
            long r13 = (long) r7
            r7 = 5
            r15 = 2
            switch(r25) {
                case 51: goto L_0x018f;
                case 52: goto L_0x0181;
                case 53: goto L_0x0171;
                case 54: goto L_0x0171;
                case 55: goto L_0x0161;
                case 56: goto L_0x0150;
                case 57: goto L_0x0140;
                case 58: goto L_0x0127;
                case 59: goto L_0x00f3;
                case 60: goto L_0x00c5;
                case 61: goto L_0x00b8;
                case 62: goto L_0x0161;
                case 63: goto L_0x008a;
                case 64: goto L_0x0140;
                case 65: goto L_0x0150;
                case 66: goto L_0x0075;
                case 67: goto L_0x0060;
                case 68: goto L_0x0028;
                default: goto L_0x0026;
            }
        L_0x0026:
            goto L_0x01a2
        L_0x0028:
            r7 = 3
            if (r5 != r7) goto L_0x01a2
            r2 = r2 & -8
            r7 = r2 | 4
            com.google.android.gms.internal.vision.S1 r2 = r0.m(r6)
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r7
            r7 = r29
            int r2 = com.google.android.gms.internal.vision.C7477d0.f(r2, r3, r4, r5, r6, r7)
            int r3 = r12.getInt(r1, r13)
            if (r3 != r8) goto L_0x004b
            java.lang.Object r15 = r12.getObject(r1, r9)
            goto L_0x004c
        L_0x004b:
            r15 = 0
        L_0x004c:
            if (r15 != 0) goto L_0x0055
            java.lang.Object r3 = r11.f49312c
            r12.putObject(r1, r9, r3)
            goto L_0x019e
        L_0x0055:
            java.lang.Object r3 = r11.f49312c
            java.lang.Object r3 = com.google.android.gms.internal.vision.U0.e(r15, r3)
            r12.putObject(r1, r9, r3)
            goto L_0x019e
        L_0x0060:
            if (r5 != 0) goto L_0x01a2
            int r2 = com.google.android.gms.internal.vision.C7477d0.k(r3, r4, r11)
            long r3 = r11.f49311b
            long r3 = com.google.android.gms.internal.vision.C7541v0.a(r3)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r12.putObject(r1, r9, r3)
            goto L_0x019e
        L_0x0075:
            if (r5 != 0) goto L_0x01a2
            int r2 = com.google.android.gms.internal.vision.C7477d0.i(r3, r4, r11)
            int r3 = r11.f49310a
            int r3 = com.google.android.gms.internal.vision.C7541v0.d(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r12.putObject(r1, r9, r3)
            goto L_0x019e
        L_0x008a:
            if (r5 != 0) goto L_0x01a2
            int r3 = com.google.android.gms.internal.vision.C7477d0.i(r3, r4, r11)
            int r4 = r11.f49310a
            com.google.android.gms.internal.vision.V0 r5 = r0.H(r6)
            if (r5 == 0) goto L_0x00ae
            boolean r5 = r5.c(r4)
            if (r5 == 0) goto L_0x009f
            goto L_0x00ae
        L_0x009f:
            com.google.android.gms.internal.vision.m2 r1 = N(r17)
            long r4 = (long) r4
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r1.c(r2, r4)
            r2 = r3
            goto L_0x01a3
        L_0x00ae:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r12.putObject(r1, r9, r2)
            r2 = r3
            goto L_0x019e
        L_0x00b8:
            if (r5 != r15) goto L_0x01a2
            int r2 = com.google.android.gms.internal.vision.C7477d0.q(r3, r4, r11)
            java.lang.Object r3 = r11.f49312c
            r12.putObject(r1, r9, r3)
            goto L_0x019e
        L_0x00c5:
            if (r5 != r15) goto L_0x01a2
            com.google.android.gms.internal.vision.S1 r2 = r0.m(r6)
            r5 = r20
            int r2 = com.google.android.gms.internal.vision.C7477d0.g(r2, r3, r4, r5, r11)
            int r3 = r12.getInt(r1, r13)
            if (r3 != r8) goto L_0x00dc
            java.lang.Object r15 = r12.getObject(r1, r9)
            goto L_0x00dd
        L_0x00dc:
            r15 = 0
        L_0x00dd:
            if (r15 != 0) goto L_0x00e5
            java.lang.Object r3 = r11.f49312c
            r12.putObject(r1, r9, r3)
            goto L_0x00ee
        L_0x00e5:
            java.lang.Object r3 = r11.f49312c
            java.lang.Object r3 = com.google.android.gms.internal.vision.U0.e(r15, r3)
            r12.putObject(r1, r9, r3)
        L_0x00ee:
            r12.putInt(r1, r13, r8)
            goto L_0x01a3
        L_0x00f3:
            if (r5 != r15) goto L_0x01a2
            int r2 = com.google.android.gms.internal.vision.C7477d0.i(r3, r4, r11)
            int r4 = r11.f49310a
            if (r4 != 0) goto L_0x0103
            java.lang.String r3 = ""
            r12.putObject(r1, r9, r3)
            goto L_0x0122
        L_0x0103:
            r5 = 536870912(0x20000000, float:1.0842022E-19)
            r5 = r24 & r5
            if (r5 == 0) goto L_0x0117
            int r5 = r2 + r4
            boolean r5 = com.google.android.gms.internal.vision.t2.g(r3, r2, r5)
            if (r5 == 0) goto L_0x0112
            goto L_0x0117
        L_0x0112:
            com.google.android.gms.internal.vision.Z0 r1 = com.google.android.gms.internal.vision.Z0.f()
            throw r1
        L_0x0117:
            java.lang.String r5 = new java.lang.String
            java.nio.charset.Charset r6 = com.google.android.gms.internal.vision.U0.f49276a
            r5.<init>(r3, r2, r4, r6)
            r12.putObject(r1, r9, r5)
            int r2 = r2 + r4
        L_0x0122:
            r12.putInt(r1, r13, r8)
            goto L_0x01a3
        L_0x0127:
            if (r5 != 0) goto L_0x01a2
            int r2 = com.google.android.gms.internal.vision.C7477d0.k(r3, r4, r11)
            long r3 = r11.f49311b
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L_0x0137
            r15 = 1
            goto L_0x0138
        L_0x0137:
            r15 = 0
        L_0x0138:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r15)
            r12.putObject(r1, r9, r3)
            goto L_0x019e
        L_0x0140:
            if (r5 != r7) goto L_0x01a2
            int r2 = com.google.android.gms.internal.vision.C7477d0.h(r18, r19)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r12.putObject(r1, r9, r2)
        L_0x014d:
            int r2 = r4 + 4
            goto L_0x019e
        L_0x0150:
            r2 = 1
            if (r5 != r2) goto L_0x01a2
            long r2 = com.google.android.gms.internal.vision.C7477d0.l(r18, r19)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r12.putObject(r1, r9, r2)
        L_0x015e:
            int r2 = r4 + 8
            goto L_0x019e
        L_0x0161:
            if (r5 != 0) goto L_0x01a2
            int r2 = com.google.android.gms.internal.vision.C7477d0.i(r3, r4, r11)
            int r3 = r11.f49310a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r12.putObject(r1, r9, r3)
            goto L_0x019e
        L_0x0171:
            if (r5 != 0) goto L_0x01a2
            int r2 = com.google.android.gms.internal.vision.C7477d0.k(r3, r4, r11)
            long r3 = r11.f49311b
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r12.putObject(r1, r9, r3)
            goto L_0x019e
        L_0x0181:
            if (r5 != r7) goto L_0x01a2
            float r2 = com.google.android.gms.internal.vision.C7477d0.o(r18, r19)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r12.putObject(r1, r9, r2)
            goto L_0x014d
        L_0x018f:
            r2 = 1
            if (r5 != r2) goto L_0x01a2
            double r2 = com.google.android.gms.internal.vision.C7477d0.m(r18, r19)
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            r12.putObject(r1, r9, r2)
            goto L_0x015e
        L_0x019e:
            r12.putInt(r1, r13, r8)
            goto L_0x01a3
        L_0x01a2:
            r2 = r4
        L_0x01a3:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.E1.h(java.lang.Object, byte[], int, int, int, int, int, int, int, long, int, com.google.android.gms.internal.vision.e0):int");
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x0421 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x01ea  */
    private final int i(T r16, byte[] r17, int r18, int r19, int r20, int r21, int r22, int r23, long r24, int r26, long r27, com.google.android.gms.internal.vision.C7481e0 r29) {
        /*
            r15 = this;
            r0 = r15
            r1 = r16
            r3 = r17
            r4 = r18
            r5 = r19
            r2 = r20
            r6 = r22
            r8 = r23
            r9 = r27
            r7 = r29
            sun.misc.Unsafe r11 = f49176s
            java.lang.Object r12 = r11.getObject(r1, r9)
            com.google.android.gms.internal.vision.a1 r12 = (com.google.android.gms.internal.vision.C7466a1) r12
            boolean r13 = r12.zza()
            r14 = 1
            if (r13 != 0) goto L_0x0033
            int r13 = r12.size()
            if (r13 != 0) goto L_0x002b
            r13 = 10
            goto L_0x002c
        L_0x002b:
            int r13 = r13 << r14
        L_0x002c:
            com.google.android.gms.internal.vision.a1 r12 = r12.c(r13)
            r11.putObject(r1, r9, r12)
        L_0x0033:
            r9 = 5
            r10 = 0
            r13 = 2
            switch(r26) {
                case 18: goto L_0x03e3;
                case 19: goto L_0x03a5;
                case 20: goto L_0x0364;
                case 21: goto L_0x0364;
                case 22: goto L_0x034a;
                case 23: goto L_0x030b;
                case 24: goto L_0x02cc;
                case 25: goto L_0x0275;
                case 26: goto L_0x01c2;
                case 27: goto L_0x01a8;
                case 28: goto L_0x0150;
                case 29: goto L_0x034a;
                case 30: goto L_0x0118;
                case 31: goto L_0x02cc;
                case 32: goto L_0x030b;
                case 33: goto L_0x00cb;
                case 34: goto L_0x007e;
                case 35: goto L_0x03e3;
                case 36: goto L_0x03a5;
                case 37: goto L_0x0364;
                case 38: goto L_0x0364;
                case 39: goto L_0x034a;
                case 40: goto L_0x030b;
                case 41: goto L_0x02cc;
                case 42: goto L_0x0275;
                case 43: goto L_0x034a;
                case 44: goto L_0x0118;
                case 45: goto L_0x02cc;
                case 46: goto L_0x030b;
                case 47: goto L_0x00cb;
                case 48: goto L_0x007e;
                case 49: goto L_0x003b;
                default: goto L_0x003a;
            }
        L_0x003a:
            goto L_0x007b
        L_0x003b:
            r1 = 3
            if (r6 != r1) goto L_0x007b
            com.google.android.gms.internal.vision.S1 r1 = r15.m(r8)
            r6 = r2 & -8
            r6 = r6 | 4
            r21 = r1
            r22 = r17
            r23 = r18
            r24 = r19
            r25 = r6
            r26 = r29
            int r4 = com.google.android.gms.internal.vision.C7477d0.f(r21, r22, r23, r24, r25, r26)
            java.lang.Object r8 = r7.f49312c
            r12.add(r8)
        L_0x005b:
            if (r4 >= r5) goto L_0x007b
            int r8 = com.google.android.gms.internal.vision.C7477d0.i(r3, r4, r7)
            int r9 = r7.f49310a
            if (r2 != r9) goto L_0x007b
            r21 = r1
            r22 = r17
            r23 = r8
            r24 = r19
            r25 = r6
            r26 = r29
            int r4 = com.google.android.gms.internal.vision.C7477d0.f(r21, r22, r23, r24, r25, r26)
            java.lang.Object r8 = r7.f49312c
            r12.add(r8)
            goto L_0x005b
        L_0x007b:
            r1 = r4
            goto L_0x0421
        L_0x007e:
            if (r6 != r13) goto L_0x00a2
            com.google.android.gms.internal.vision.n1 r12 = (com.google.android.gms.internal.vision.C7518n1) r12
            int r1 = com.google.android.gms.internal.vision.C7477d0.i(r3, r4, r7)
            int r2 = r7.f49310a
            int r2 = r2 + r1
        L_0x0089:
            if (r1 >= r2) goto L_0x0099
            int r1 = com.google.android.gms.internal.vision.C7477d0.k(r3, r1, r7)
            long r4 = r7.f49311b
            long r4 = com.google.android.gms.internal.vision.C7541v0.a(r4)
            r12.i(r4)
            goto L_0x0089
        L_0x0099:
            if (r1 != r2) goto L_0x009d
            goto L_0x0421
        L_0x009d:
            com.google.android.gms.internal.vision.Z0 r1 = com.google.android.gms.internal.vision.Z0.a()
            throw r1
        L_0x00a2:
            if (r6 != 0) goto L_0x007b
            com.google.android.gms.internal.vision.n1 r12 = (com.google.android.gms.internal.vision.C7518n1) r12
            int r1 = com.google.android.gms.internal.vision.C7477d0.k(r3, r4, r7)
            long r8 = r7.f49311b
            long r8 = com.google.android.gms.internal.vision.C7541v0.a(r8)
            r12.i(r8)
        L_0x00b3:
            if (r1 >= r5) goto L_0x0421
            int r4 = com.google.android.gms.internal.vision.C7477d0.i(r3, r1, r7)
            int r6 = r7.f49310a
            if (r2 != r6) goto L_0x0421
            int r1 = com.google.android.gms.internal.vision.C7477d0.k(r3, r4, r7)
            long r8 = r7.f49311b
            long r8 = com.google.android.gms.internal.vision.C7541v0.a(r8)
            r12.i(r8)
            goto L_0x00b3
        L_0x00cb:
            if (r6 != r13) goto L_0x00ef
            com.google.android.gms.internal.vision.S0 r12 = (com.google.android.gms.internal.vision.S0) r12
            int r1 = com.google.android.gms.internal.vision.C7477d0.i(r3, r4, r7)
            int r2 = r7.f49310a
            int r2 = r2 + r1
        L_0x00d6:
            if (r1 >= r2) goto L_0x00e6
            int r1 = com.google.android.gms.internal.vision.C7477d0.i(r3, r1, r7)
            int r4 = r7.f49310a
            int r4 = com.google.android.gms.internal.vision.C7541v0.d(r4)
            r12.j(r4)
            goto L_0x00d6
        L_0x00e6:
            if (r1 != r2) goto L_0x00ea
            goto L_0x0421
        L_0x00ea:
            com.google.android.gms.internal.vision.Z0 r1 = com.google.android.gms.internal.vision.Z0.a()
            throw r1
        L_0x00ef:
            if (r6 != 0) goto L_0x007b
            com.google.android.gms.internal.vision.S0 r12 = (com.google.android.gms.internal.vision.S0) r12
            int r1 = com.google.android.gms.internal.vision.C7477d0.i(r3, r4, r7)
            int r4 = r7.f49310a
            int r4 = com.google.android.gms.internal.vision.C7541v0.d(r4)
            r12.j(r4)
        L_0x0100:
            if (r1 >= r5) goto L_0x0421
            int r4 = com.google.android.gms.internal.vision.C7477d0.i(r3, r1, r7)
            int r6 = r7.f49310a
            if (r2 != r6) goto L_0x0421
            int r1 = com.google.android.gms.internal.vision.C7477d0.i(r3, r4, r7)
            int r4 = r7.f49310a
            int r4 = com.google.android.gms.internal.vision.C7541v0.d(r4)
            r12.j(r4)
            goto L_0x0100
        L_0x0118:
            if (r6 != r13) goto L_0x011f
            int r2 = com.google.android.gms.internal.vision.C7477d0.j(r3, r4, r12, r7)
            goto L_0x0130
        L_0x011f:
            if (r6 != 0) goto L_0x007b
            r2 = r20
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r12
            r7 = r29
            int r2 = com.google.android.gms.internal.vision.C7477d0.b(r2, r3, r4, r5, r6, r7)
        L_0x0130:
            com.google.android.gms.internal.vision.Q0 r1 = (com.google.android.gms.internal.vision.Q0) r1
            com.google.android.gms.internal.vision.m2 r3 = r1.zzb
            com.google.android.gms.internal.vision.m2 r4 = com.google.android.gms.internal.vision.C7515m2.a()
            if (r3 != r4) goto L_0x013b
            r3 = 0
        L_0x013b:
            com.google.android.gms.internal.vision.V0 r4 = r15.H(r8)
            com.google.android.gms.internal.vision.j2<?, ?> r5 = r0.f49191o
            r6 = r21
            java.lang.Object r3 = com.google.android.gms.internal.vision.T1.i(r6, r12, r4, r3, r5)
            com.google.android.gms.internal.vision.m2 r3 = (com.google.android.gms.internal.vision.C7515m2) r3
            if (r3 == 0) goto L_0x014d
            r1.zzb = r3
        L_0x014d:
            r1 = r2
            goto L_0x0421
        L_0x0150:
            if (r6 != r13) goto L_0x007b
            int r1 = com.google.android.gms.internal.vision.C7477d0.i(r3, r4, r7)
            int r4 = r7.f49310a
            if (r4 < 0) goto L_0x01a3
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x019e
            if (r4 != 0) goto L_0x0166
            com.google.android.gms.internal.vision.i0 r4 = com.google.android.gms.internal.vision.C7497i0.f49335b
            r12.add(r4)
            goto L_0x016e
        L_0x0166:
            com.google.android.gms.internal.vision.i0 r6 = com.google.android.gms.internal.vision.C7497i0.q(r3, r1, r4)
            r12.add(r6)
        L_0x016d:
            int r1 = r1 + r4
        L_0x016e:
            if (r1 >= r5) goto L_0x0421
            int r4 = com.google.android.gms.internal.vision.C7477d0.i(r3, r1, r7)
            int r6 = r7.f49310a
            if (r2 != r6) goto L_0x0421
            int r1 = com.google.android.gms.internal.vision.C7477d0.i(r3, r4, r7)
            int r4 = r7.f49310a
            if (r4 < 0) goto L_0x0199
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x0194
            if (r4 != 0) goto L_0x018c
            com.google.android.gms.internal.vision.i0 r4 = com.google.android.gms.internal.vision.C7497i0.f49335b
            r12.add(r4)
            goto L_0x016e
        L_0x018c:
            com.google.android.gms.internal.vision.i0 r6 = com.google.android.gms.internal.vision.C7497i0.q(r3, r1, r4)
            r12.add(r6)
            goto L_0x016d
        L_0x0194:
            com.google.android.gms.internal.vision.Z0 r1 = com.google.android.gms.internal.vision.Z0.a()
            throw r1
        L_0x0199:
            com.google.android.gms.internal.vision.Z0 r1 = com.google.android.gms.internal.vision.Z0.b()
            throw r1
        L_0x019e:
            com.google.android.gms.internal.vision.Z0 r1 = com.google.android.gms.internal.vision.Z0.a()
            throw r1
        L_0x01a3:
            com.google.android.gms.internal.vision.Z0 r1 = com.google.android.gms.internal.vision.Z0.b()
            throw r1
        L_0x01a8:
            if (r6 != r13) goto L_0x007b
            com.google.android.gms.internal.vision.S1 r1 = r15.m(r8)
            r21 = r1
            r22 = r20
            r23 = r17
            r24 = r18
            r25 = r19
            r26 = r12
            r27 = r29
            int r1 = com.google.android.gms.internal.vision.C7477d0.e(r21, r22, r23, r24, r25, r26, r27)
            goto L_0x0421
        L_0x01c2:
            if (r6 != r13) goto L_0x007b
            r8 = 536870912(0x20000000, double:2.652494739E-315)
            long r8 = r24 & r8
            int r1 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            java.lang.String r6 = ""
            if (r1 != 0) goto L_0x0215
            int r1 = com.google.android.gms.internal.vision.C7477d0.i(r3, r4, r7)
            int r4 = r7.f49310a
            if (r4 < 0) goto L_0x0210
            if (r4 != 0) goto L_0x01dd
            r12.add(r6)
            goto L_0x01e8
        L_0x01dd:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = com.google.android.gms.internal.vision.U0.f49276a
            r8.<init>(r3, r1, r4, r9)
            r12.add(r8)
        L_0x01e7:
            int r1 = r1 + r4
        L_0x01e8:
            if (r1 >= r5) goto L_0x0421
            int r4 = com.google.android.gms.internal.vision.C7477d0.i(r3, r1, r7)
            int r8 = r7.f49310a
            if (r2 != r8) goto L_0x0421
            int r1 = com.google.android.gms.internal.vision.C7477d0.i(r3, r4, r7)
            int r4 = r7.f49310a
            if (r4 < 0) goto L_0x020b
            if (r4 != 0) goto L_0x0200
            r12.add(r6)
            goto L_0x01e8
        L_0x0200:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = com.google.android.gms.internal.vision.U0.f49276a
            r8.<init>(r3, r1, r4, r9)
            r12.add(r8)
            goto L_0x01e7
        L_0x020b:
            com.google.android.gms.internal.vision.Z0 r1 = com.google.android.gms.internal.vision.Z0.b()
            throw r1
        L_0x0210:
            com.google.android.gms.internal.vision.Z0 r1 = com.google.android.gms.internal.vision.Z0.b()
            throw r1
        L_0x0215:
            int r1 = com.google.android.gms.internal.vision.C7477d0.i(r3, r4, r7)
            int r4 = r7.f49310a
            if (r4 < 0) goto L_0x0270
            if (r4 != 0) goto L_0x0223
            r12.add(r6)
            goto L_0x0236
        L_0x0223:
            int r8 = r1 + r4
            boolean r9 = com.google.android.gms.internal.vision.t2.g(r3, r1, r8)
            if (r9 == 0) goto L_0x026b
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = com.google.android.gms.internal.vision.U0.f49276a
            r9.<init>(r3, r1, r4, r10)
            r12.add(r9)
        L_0x0235:
            r1 = r8
        L_0x0236:
            if (r1 >= r5) goto L_0x0421
            int r4 = com.google.android.gms.internal.vision.C7477d0.i(r3, r1, r7)
            int r8 = r7.f49310a
            if (r2 != r8) goto L_0x0421
            int r1 = com.google.android.gms.internal.vision.C7477d0.i(r3, r4, r7)
            int r4 = r7.f49310a
            if (r4 < 0) goto L_0x0266
            if (r4 != 0) goto L_0x024e
            r12.add(r6)
            goto L_0x0236
        L_0x024e:
            int r8 = r1 + r4
            boolean r9 = com.google.android.gms.internal.vision.t2.g(r3, r1, r8)
            if (r9 == 0) goto L_0x0261
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = com.google.android.gms.internal.vision.U0.f49276a
            r9.<init>(r3, r1, r4, r10)
            r12.add(r9)
            goto L_0x0235
        L_0x0261:
            com.google.android.gms.internal.vision.Z0 r1 = com.google.android.gms.internal.vision.Z0.f()
            throw r1
        L_0x0266:
            com.google.android.gms.internal.vision.Z0 r1 = com.google.android.gms.internal.vision.Z0.b()
            throw r1
        L_0x026b:
            com.google.android.gms.internal.vision.Z0 r1 = com.google.android.gms.internal.vision.Z0.f()
            throw r1
        L_0x0270:
            com.google.android.gms.internal.vision.Z0 r1 = com.google.android.gms.internal.vision.Z0.b()
            throw r1
        L_0x0275:
            r1 = 0
            if (r6 != r13) goto L_0x029d
            com.google.android.gms.internal.vision.g0 r12 = (com.google.android.gms.internal.vision.C7489g0) r12
            int r2 = com.google.android.gms.internal.vision.C7477d0.i(r3, r4, r7)
            int r4 = r7.f49310a
            int r4 = r4 + r2
        L_0x0281:
            if (r2 >= r4) goto L_0x0294
            int r2 = com.google.android.gms.internal.vision.C7477d0.k(r3, r2, r7)
            long r5 = r7.f49311b
            int r5 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r5 == 0) goto L_0x028f
            r5 = r14
            goto L_0x0290
        L_0x028f:
            r5 = r1
        L_0x0290:
            r12.i(r5)
            goto L_0x0281
        L_0x0294:
            if (r2 != r4) goto L_0x0298
            goto L_0x014d
        L_0x0298:
            com.google.android.gms.internal.vision.Z0 r1 = com.google.android.gms.internal.vision.Z0.a()
            throw r1
        L_0x029d:
            if (r6 != 0) goto L_0x007b
            com.google.android.gms.internal.vision.g0 r12 = (com.google.android.gms.internal.vision.C7489g0) r12
            int r4 = com.google.android.gms.internal.vision.C7477d0.k(r3, r4, r7)
            long r8 = r7.f49311b
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 == 0) goto L_0x02ad
            r6 = r14
            goto L_0x02ae
        L_0x02ad:
            r6 = r1
        L_0x02ae:
            r12.i(r6)
        L_0x02b1:
            if (r4 >= r5) goto L_0x007b
            int r6 = com.google.android.gms.internal.vision.C7477d0.i(r3, r4, r7)
            int r8 = r7.f49310a
            if (r2 != r8) goto L_0x007b
            int r4 = com.google.android.gms.internal.vision.C7477d0.k(r3, r6, r7)
            long r8 = r7.f49311b
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 == 0) goto L_0x02c7
            r6 = r14
            goto L_0x02c8
        L_0x02c7:
            r6 = r1
        L_0x02c8:
            r12.i(r6)
            goto L_0x02b1
        L_0x02cc:
            if (r6 != r13) goto L_0x02ec
            com.google.android.gms.internal.vision.S0 r12 = (com.google.android.gms.internal.vision.S0) r12
            int r1 = com.google.android.gms.internal.vision.C7477d0.i(r3, r4, r7)
            int r2 = r7.f49310a
            int r2 = r2 + r1
        L_0x02d7:
            if (r1 >= r2) goto L_0x02e3
            int r4 = com.google.android.gms.internal.vision.C7477d0.h(r3, r1)
            r12.j(r4)
            int r1 = r1 + 4
            goto L_0x02d7
        L_0x02e3:
            if (r1 != r2) goto L_0x02e7
            goto L_0x0421
        L_0x02e7:
            com.google.android.gms.internal.vision.Z0 r1 = com.google.android.gms.internal.vision.Z0.a()
            throw r1
        L_0x02ec:
            if (r6 != r9) goto L_0x007b
            com.google.android.gms.internal.vision.S0 r12 = (com.google.android.gms.internal.vision.S0) r12
            int r1 = com.google.android.gms.internal.vision.C7477d0.h(r17, r18)
            r12.j(r1)
        L_0x02f7:
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x0421
            int r4 = com.google.android.gms.internal.vision.C7477d0.i(r3, r1, r7)
            int r6 = r7.f49310a
            if (r2 != r6) goto L_0x0421
            int r1 = com.google.android.gms.internal.vision.C7477d0.h(r3, r4)
            r12.j(r1)
            goto L_0x02f7
        L_0x030b:
            if (r6 != r13) goto L_0x032b
            com.google.android.gms.internal.vision.n1 r12 = (com.google.android.gms.internal.vision.C7518n1) r12
            int r1 = com.google.android.gms.internal.vision.C7477d0.i(r3, r4, r7)
            int r2 = r7.f49310a
            int r2 = r2 + r1
        L_0x0316:
            if (r1 >= r2) goto L_0x0322
            long r4 = com.google.android.gms.internal.vision.C7477d0.l(r3, r1)
            r12.i(r4)
            int r1 = r1 + 8
            goto L_0x0316
        L_0x0322:
            if (r1 != r2) goto L_0x0326
            goto L_0x0421
        L_0x0326:
            com.google.android.gms.internal.vision.Z0 r1 = com.google.android.gms.internal.vision.Z0.a()
            throw r1
        L_0x032b:
            if (r6 != r14) goto L_0x007b
            com.google.android.gms.internal.vision.n1 r12 = (com.google.android.gms.internal.vision.C7518n1) r12
            long r8 = com.google.android.gms.internal.vision.C7477d0.l(r17, r18)
            r12.i(r8)
        L_0x0336:
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x0421
            int r4 = com.google.android.gms.internal.vision.C7477d0.i(r3, r1, r7)
            int r6 = r7.f49310a
            if (r2 != r6) goto L_0x0421
            long r8 = com.google.android.gms.internal.vision.C7477d0.l(r3, r4)
            r12.i(r8)
            goto L_0x0336
        L_0x034a:
            if (r6 != r13) goto L_0x0352
            int r1 = com.google.android.gms.internal.vision.C7477d0.j(r3, r4, r12, r7)
            goto L_0x0421
        L_0x0352:
            if (r6 != 0) goto L_0x007b
            r21 = r17
            r22 = r18
            r23 = r19
            r24 = r12
            r25 = r29
            int r1 = com.google.android.gms.internal.vision.C7477d0.b(r20, r21, r22, r23, r24, r25)
            goto L_0x0421
        L_0x0364:
            if (r6 != r13) goto L_0x0384
            com.google.android.gms.internal.vision.n1 r12 = (com.google.android.gms.internal.vision.C7518n1) r12
            int r1 = com.google.android.gms.internal.vision.C7477d0.i(r3, r4, r7)
            int r2 = r7.f49310a
            int r2 = r2 + r1
        L_0x036f:
            if (r1 >= r2) goto L_0x037b
            int r1 = com.google.android.gms.internal.vision.C7477d0.k(r3, r1, r7)
            long r4 = r7.f49311b
            r12.i(r4)
            goto L_0x036f
        L_0x037b:
            if (r1 != r2) goto L_0x037f
            goto L_0x0421
        L_0x037f:
            com.google.android.gms.internal.vision.Z0 r1 = com.google.android.gms.internal.vision.Z0.a()
            throw r1
        L_0x0384:
            if (r6 != 0) goto L_0x007b
            com.google.android.gms.internal.vision.n1 r12 = (com.google.android.gms.internal.vision.C7518n1) r12
            int r1 = com.google.android.gms.internal.vision.C7477d0.k(r3, r4, r7)
            long r8 = r7.f49311b
            r12.i(r8)
        L_0x0391:
            if (r1 >= r5) goto L_0x0421
            int r4 = com.google.android.gms.internal.vision.C7477d0.i(r3, r1, r7)
            int r6 = r7.f49310a
            if (r2 != r6) goto L_0x0421
            int r1 = com.google.android.gms.internal.vision.C7477d0.k(r3, r4, r7)
            long r8 = r7.f49311b
            r12.i(r8)
            goto L_0x0391
        L_0x03a5:
            if (r6 != r13) goto L_0x03c4
            com.google.android.gms.internal.vision.P0 r12 = (com.google.android.gms.internal.vision.P0) r12
            int r1 = com.google.android.gms.internal.vision.C7477d0.i(r3, r4, r7)
            int r2 = r7.f49310a
            int r2 = r2 + r1
        L_0x03b0:
            if (r1 >= r2) goto L_0x03bc
            float r4 = com.google.android.gms.internal.vision.C7477d0.o(r3, r1)
            r12.i(r4)
            int r1 = r1 + 4
            goto L_0x03b0
        L_0x03bc:
            if (r1 != r2) goto L_0x03bf
            goto L_0x0421
        L_0x03bf:
            com.google.android.gms.internal.vision.Z0 r1 = com.google.android.gms.internal.vision.Z0.a()
            throw r1
        L_0x03c4:
            if (r6 != r9) goto L_0x007b
            com.google.android.gms.internal.vision.P0 r12 = (com.google.android.gms.internal.vision.P0) r12
            float r1 = com.google.android.gms.internal.vision.C7477d0.o(r17, r18)
            r12.i(r1)
        L_0x03cf:
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x0421
            int r4 = com.google.android.gms.internal.vision.C7477d0.i(r3, r1, r7)
            int r6 = r7.f49310a
            if (r2 != r6) goto L_0x0421
            float r1 = com.google.android.gms.internal.vision.C7477d0.o(r3, r4)
            r12.i(r1)
            goto L_0x03cf
        L_0x03e3:
            if (r6 != r13) goto L_0x0402
            com.google.android.gms.internal.vision.B0 r12 = (com.google.android.gms.internal.vision.B0) r12
            int r1 = com.google.android.gms.internal.vision.C7477d0.i(r3, r4, r7)
            int r2 = r7.f49310a
            int r2 = r2 + r1
        L_0x03ee:
            if (r1 >= r2) goto L_0x03fa
            double r4 = com.google.android.gms.internal.vision.C7477d0.m(r3, r1)
            r12.i(r4)
            int r1 = r1 + 8
            goto L_0x03ee
        L_0x03fa:
            if (r1 != r2) goto L_0x03fd
            goto L_0x0421
        L_0x03fd:
            com.google.android.gms.internal.vision.Z0 r1 = com.google.android.gms.internal.vision.Z0.a()
            throw r1
        L_0x0402:
            if (r6 != r14) goto L_0x007b
            com.google.android.gms.internal.vision.B0 r12 = (com.google.android.gms.internal.vision.B0) r12
            double r8 = com.google.android.gms.internal.vision.C7477d0.m(r17, r18)
            r12.i(r8)
        L_0x040d:
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x0421
            int r4 = com.google.android.gms.internal.vision.C7477d0.i(r3, r1, r7)
            int r6 = r7.f49310a
            if (r2 != r6) goto L_0x0421
            double r8 = com.google.android.gms.internal.vision.C7477d0.m(r3, r4)
            r12.i(r8)
            goto L_0x040d
        L_0x0421:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.E1.i(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.gms.internal.vision.e0):int");
    }

    private final <K, V> int j(T t10, byte[] bArr, int i10, int i11, int i12, long j10, C7481e0 e0Var) {
        Unsafe unsafe = f49176s;
        Object B10 = B(i12);
        Object object = unsafe.getObject(t10, j10);
        if (this.f49193q.zzd(object)) {
            Object c10 = this.f49193q.c(B10);
            this.f49193q.b(c10, object);
            unsafe.putObject(t10, j10, c10);
            object = c10;
        }
        this.f49193q.zzb(B10);
        this.f49193q.zza(object);
        int i13 = C7477d0.i(bArr, i10, e0Var);
        int i14 = e0Var.f49310a;
        if (i14 < 0 || i14 > i11 - i13) {
            throw Z0.a();
        }
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:128:0x0292  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0296  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x02ae  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x02b2  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x0361  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x03ba  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x03cc  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x03da  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static <T> com.google.android.gms.internal.vision.E1<T> l(java.lang.Class<T> r35, com.google.android.gms.internal.vision.C7551y1 r36, com.google.android.gms.internal.vision.H1 r37, com.google.android.gms.internal.vision.C7502j1 r38, com.google.android.gms.internal.vision.C7503j2<?, ?> r39, com.google.android.gms.internal.vision.E0<?> r40, com.google.android.gms.internal.vision.C7548x1 r41) {
        /*
            r0 = r36
            r3 = 13
            r4 = 1
            boolean r5 = r0 instanceof com.google.android.gms.internal.vision.Q1
            if (r5 == 0) goto L_0x0436
            com.google.android.gms.internal.vision.Q1 r0 = (com.google.android.gms.internal.vision.Q1) r0
            int r5 = r0.zza()
            int r6 = com.google.android.gms.internal.vision.O1.f49237b
            r7 = 0
            if (r5 != r6) goto L_0x0016
            r14 = r4
            goto L_0x0017
        L_0x0016:
            r14 = r7
        L_0x0017:
            java.lang.String r5 = r0.a()
            int r6 = r5.length()
            char r8 = r5.charAt(r7)
            r9 = 55296(0xd800, float:7.7486E-41)
            if (r8 < r9) goto L_0x0033
            r8 = r4
        L_0x0029:
            int r10 = r8 + 1
            char r8 = r5.charAt(r8)
            if (r8 < r9) goto L_0x0034
            r8 = r10
            goto L_0x0029
        L_0x0033:
            r10 = r4
        L_0x0034:
            int r8 = r10 + 1
            char r10 = r5.charAt(r10)
            if (r10 < r9) goto L_0x0051
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            r11 = r3
        L_0x003f:
            int r12 = r8 + 1
            char r8 = r5.charAt(r8)
            if (r8 < r9) goto L_0x004e
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r11
            r10 = r10 | r8
            int r11 = r11 + r3
            r8 = r12
            goto L_0x003f
        L_0x004e:
            int r8 = r8 << r11
            r10 = r10 | r8
            r8 = r12
        L_0x0051:
            if (r10 != 0) goto L_0x005f
            int[] r10 = f49175r
            r1 = r7
            r2 = r1
            r11 = r2
            r12 = r11
            r13 = r12
            r15 = r13
            r16 = r10
            goto L_0x017d
        L_0x005f:
            int r10 = r8 + 1
            char r8 = r5.charAt(r8)
            if (r8 < r9) goto L_0x007c
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            r11 = r3
        L_0x006a:
            int r12 = r10 + 1
            char r10 = r5.charAt(r10)
            if (r10 < r9) goto L_0x0079
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            int r10 = r10 << r11
            r8 = r8 | r10
            int r11 = r11 + r3
            r10 = r12
            goto L_0x006a
        L_0x0079:
            int r10 = r10 << r11
            r8 = r8 | r10
            r10 = r12
        L_0x007c:
            int r11 = r10 + 1
            char r10 = r5.charAt(r10)
            if (r10 < r9) goto L_0x0099
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            r12 = r3
        L_0x0087:
            int r13 = r11 + 1
            char r11 = r5.charAt(r11)
            if (r11 < r9) goto L_0x0096
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            int r11 = r11 << r12
            r10 = r10 | r11
            int r12 = r12 + r3
            r11 = r13
            goto L_0x0087
        L_0x0096:
            int r11 = r11 << r12
            r10 = r10 | r11
            r11 = r13
        L_0x0099:
            int r12 = r11 + 1
            char r11 = r5.charAt(r11)
            if (r11 < r9) goto L_0x00b6
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            r13 = r3
        L_0x00a4:
            int r15 = r12 + 1
            char r12 = r5.charAt(r12)
            if (r12 < r9) goto L_0x00b3
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r13
            r11 = r11 | r12
            int r13 = r13 + r3
            r12 = r15
            goto L_0x00a4
        L_0x00b3:
            int r12 = r12 << r13
            r11 = r11 | r12
            r12 = r15
        L_0x00b6:
            int r13 = r12 + 1
            char r12 = r5.charAt(r12)
            if (r12 < r9) goto L_0x00d5
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            r15 = r3
        L_0x00c1:
            int r16 = r13 + 1
            char r13 = r5.charAt(r13)
            if (r13 < r9) goto L_0x00d1
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            int r13 = r13 << r15
            r12 = r12 | r13
            int r15 = r15 + r3
            r13 = r16
            goto L_0x00c1
        L_0x00d1:
            int r13 = r13 << r15
            r12 = r12 | r13
            r13 = r16
        L_0x00d5:
            int r15 = r13 + 1
            char r13 = r5.charAt(r13)
            if (r13 < r9) goto L_0x00f8
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            r16 = r3
        L_0x00e1:
            int r17 = r15 + 1
            char r15 = r5.charAt(r15)
            if (r15 < r9) goto L_0x00f3
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r15 = r15 << r16
            r13 = r13 | r15
            int r16 = r16 + 13
            r15 = r17
            goto L_0x00e1
        L_0x00f3:
            int r15 = r15 << r16
            r13 = r13 | r15
            r15 = r17
        L_0x00f8:
            int r16 = r15 + 1
            char r15 = r5.charAt(r15)
            if (r15 < r9) goto L_0x011e
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            r7 = r16
            r16 = r3
        L_0x0106:
            int r17 = r7 + 1
            char r7 = r5.charAt(r7)
            if (r7 < r9) goto L_0x0118
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            int r7 = r7 << r16
            r15 = r15 | r7
            int r16 = r16 + 13
            r7 = r17
            goto L_0x0106
        L_0x0118:
            int r7 = r7 << r16
            r15 = r15 | r7
            r7 = r17
            goto L_0x0120
        L_0x011e:
            r7 = r16
        L_0x0120:
            int r16 = r7 + 1
            char r7 = r5.charAt(r7)
            if (r7 < r9) goto L_0x0146
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r1 = r16
            r16 = r3
        L_0x012e:
            int r18 = r1 + 1
            char r1 = r5.charAt(r1)
            if (r1 < r9) goto L_0x0140
            r1 = r1 & 8191(0x1fff, float:1.1478E-41)
            int r1 = r1 << r16
            r7 = r7 | r1
            int r16 = r16 + 13
            r1 = r18
            goto L_0x012e
        L_0x0140:
            int r1 = r1 << r16
            r7 = r7 | r1
            r1 = r18
            goto L_0x0148
        L_0x0146:
            r1 = r16
        L_0x0148:
            int r16 = r1 + 1
            char r1 = r5.charAt(r1)
            if (r1 < r9) goto L_0x016d
            r1 = r1 & 8191(0x1fff, float:1.1478E-41)
            r2 = r16
            r16 = r3
        L_0x0156:
            int r19 = r2 + 1
            char r2 = r5.charAt(r2)
            if (r2 < r9) goto L_0x0168
            r2 = r2 & 8191(0x1fff, float:1.1478E-41)
            int r2 = r2 << r16
            r1 = r1 | r2
            int r16 = r16 + 13
            r2 = r19
            goto L_0x0156
        L_0x0168:
            int r2 = r2 << r16
            r1 = r1 | r2
            r16 = r19
        L_0x016d:
            int r2 = r1 + r15
            int r2 = r2 + r7
            int[] r2 = new int[r2]
            int r7 = r8 << 1
            int r7 = r7 + r10
            r34 = r2
            r2 = r1
            r1 = r8
            r8 = r16
            r16 = r34
        L_0x017d:
            sun.misc.Unsafe r10 = f49176s
            java.lang.Object[] r19 = r0.b()
            com.google.android.gms.internal.vision.A1 r20 = r0.zzc()
            java.lang.Class r3 = r20.getClass()
            int r9 = r13 * 3
            int[] r9 = new int[r9]
            int r13 = r13 << r4
            java.lang.Object[] r13 = new java.lang.Object[r13]
            int r20 = r2 + r15
            r23 = r2
            r24 = r20
            r15 = 0
            r22 = 0
        L_0x019b:
            if (r8 >= r6) goto L_0x0412
            int r25 = r8 + 1
            char r8 = r5.charAt(r8)
            r4 = 55296(0xd800, float:7.7486E-41)
            if (r8 < r4) goto L_0x01d2
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            r4 = r25
            r25 = 13
        L_0x01ae:
            r26 = 1
            int r27 = r4 + 1
            char r4 = r5.charAt(r4)
            r28 = r6
            r6 = 55296(0xd800, float:7.7486E-41)
            if (r4 < r6) goto L_0x01cb
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            int r4 = r4 << r25
            r8 = r8 | r4
            r4 = 13
            int r25 = r25 + 13
            r4 = r27
            r6 = r28
            goto L_0x01ae
        L_0x01cb:
            int r4 = r4 << r25
            r8 = r8 | r4
            r4 = r27
        L_0x01d0:
            r6 = 1
            goto L_0x01d7
        L_0x01d2:
            r28 = r6
            r4 = r25
            goto L_0x01d0
        L_0x01d7:
            int r25 = r4 + 1
            char r4 = r5.charAt(r4)
            r6 = 55296(0xd800, float:7.7486E-41)
            if (r4 < r6) goto L_0x020b
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r6 = r25
            r25 = 13
        L_0x01e8:
            r26 = 1
            int r27 = r6 + 1
            char r6 = r5.charAt(r6)
            r29 = r2
            r2 = 55296(0xd800, float:7.7486E-41)
            if (r6 < r2) goto L_0x0205
            r2 = r6 & 8191(0x1fff, float:1.1478E-41)
            int r2 = r2 << r25
            r4 = r4 | r2
            r2 = 13
            int r25 = r25 + 13
            r6 = r27
            r2 = r29
            goto L_0x01e8
        L_0x0205:
            int r2 = r6 << r25
            r4 = r4 | r2
            r2 = r27
            goto L_0x020f
        L_0x020b:
            r29 = r2
            r2 = r25
        L_0x020f:
            r6 = r4 & 255(0xff, float:3.57E-43)
            r25 = r12
            r12 = r4 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x021e
            r12 = 1
            int r26 = r15 + 1
            r16[r15] = r22
            r15 = r26
        L_0x021e:
            r12 = 51
            if (r6 < r12) goto L_0x02cf
            r12 = 1
            int r31 = r2 + 1
            char r2 = r5.charAt(r2)
            r12 = 55296(0xd800, float:7.7486E-41)
            if (r2 < r12) goto L_0x025b
            r2 = r2 & 8191(0x1fff, float:1.1478E-41)
            r12 = r31
            r26 = 1
            r31 = 13
        L_0x0236:
            int r32 = r12 + 1
            char r12 = r5.charAt(r12)
            r33 = r15
            r15 = 55296(0xd800, float:7.7486E-41)
            if (r12 < r15) goto L_0x0253
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r31
            r2 = r2 | r12
            r12 = 13
            int r31 = r31 + 13
            r12 = r32
            r15 = r33
            r26 = 1
            goto L_0x0236
        L_0x0253:
            int r12 = r12 << r31
            r2 = r2 | r12
            r31 = r32
        L_0x0258:
            r12 = 51
            goto L_0x025e
        L_0x025b:
            r33 = r15
            goto L_0x0258
        L_0x025e:
            int r15 = r6 + -51
            r12 = 9
            if (r15 == r12) goto L_0x0268
            r12 = 17
            if (r15 != r12) goto L_0x026a
        L_0x0268:
            r15 = 1
            goto L_0x0280
        L_0x026a:
            r12 = 12
            if (r15 != r12) goto L_0x027e
            if (r14 != 0) goto L_0x027e
            int r12 = r22 / 3
            r15 = 1
            int r12 = r12 << r15
            int r12 = r12 + r15
            int r26 = r7 + 1
            r7 = r19[r7]
            r13[r12] = r7
        L_0x027b:
            r7 = r26
            goto L_0x028b
        L_0x027e:
            r15 = 1
            goto L_0x028b
        L_0x0280:
            int r12 = r22 / 3
            int r12 = r12 << r15
            int r12 = r12 + r15
            int r26 = r7 + 1
            r7 = r19[r7]
            r13[r12] = r7
            goto L_0x027b
        L_0x028b:
            int r2 = r2 << r15
            r12 = r19[r2]
            boolean r15 = r12 instanceof java.lang.reflect.Field
            if (r15 == 0) goto L_0x0296
            java.lang.reflect.Field r12 = (java.lang.reflect.Field) r12
        L_0x0294:
            r15 = r11
            goto L_0x029f
        L_0x0296:
            java.lang.String r12 = (java.lang.String) r12
            java.lang.reflect.Field r12 = p(r3, r12)
            r19[r2] = r12
            goto L_0x0294
        L_0x029f:
            long r11 = r10.objectFieldOffset(r12)
            int r11 = (int) r11
            r12 = 1
            int r2 = r2 + r12
            r12 = r19[r2]
            r27 = r7
            boolean r7 = r12 instanceof java.lang.reflect.Field
            if (r7 == 0) goto L_0x02b2
            java.lang.reflect.Field r12 = (java.lang.reflect.Field) r12
        L_0x02b0:
            r2 = r11
            goto L_0x02bb
        L_0x02b2:
            java.lang.String r12 = (java.lang.String) r12
            java.lang.reflect.Field r12 = p(r3, r12)
            r19[r2] = r12
            goto L_0x02b0
        L_0x02bb:
            long r11 = r10.objectFieldOffset(r12)
            int r7 = (int) r11
            r12 = r2
            r17 = r14
            r11 = r27
            r30 = r31
            r2 = 0
            r14 = 1
            r21 = 13
            r31 = r15
            goto L_0x03dc
        L_0x02cf:
            r33 = r15
            r15 = r11
            r11 = 1
            int r12 = r7 + 1
            r11 = r19[r7]
            java.lang.String r11 = (java.lang.String) r11
            java.lang.reflect.Field r11 = p(r3, r11)
            r31 = r15
            r15 = 9
            if (r6 == r15) goto L_0x02e7
            r15 = 17
            if (r6 != r15) goto L_0x02e9
        L_0x02e7:
            r15 = 1
            goto L_0x0347
        L_0x02e9:
            r15 = 27
            if (r6 == r15) goto L_0x02f1
            r15 = 49
            if (r6 != r15) goto L_0x02f3
        L_0x02f1:
            r15 = 1
            goto L_0x033a
        L_0x02f3:
            r15 = 12
            if (r6 == r15) goto L_0x02ff
            r15 = 30
            if (r6 == r15) goto L_0x02ff
            r15 = 44
            if (r6 != r15) goto L_0x0301
        L_0x02ff:
            r15 = 1
            goto L_0x032b
        L_0x0301:
            r15 = 50
            if (r6 != r15) goto L_0x0329
            r15 = 1
            int r26 = r23 + 1
            r16[r23] = r22
            int r23 = r22 / 3
            int r23 = r23 << 1
            int r27 = r7 + 2
            r12 = r19[r12]
            r13[r23] = r12
            r12 = r4 & 2048(0x800, float:2.87E-42)
            if (r12 == 0) goto L_0x0324
            int r23 = r23 + 1
            int r12 = r7 + 3
            r7 = r19[r27]
            r13[r23] = r7
            r7 = r12
            r23 = r26
            goto L_0x0352
        L_0x0324:
            r23 = r26
            r7 = r27
            goto L_0x0352
        L_0x0329:
            r15 = 1
            goto L_0x0351
        L_0x032b:
            if (r14 != 0) goto L_0x0351
            int r26 = r22 / 3
            int r26 = r26 << 1
            int r26 = r26 + 1
            int r7 = r7 + 2
            r12 = r19[r12]
            r13[r26] = r12
            goto L_0x0352
        L_0x033a:
            int r26 = r22 / 3
            int r26 = r26 << 1
            int r26 = r26 + 1
            int r7 = r7 + 2
            r12 = r19[r12]
            r13[r26] = r12
            goto L_0x0352
        L_0x0347:
            int r7 = r22 / 3
            int r7 = r7 << r15
            int r7 = r7 + r15
            java.lang.Class r26 = r11.getType()
            r13[r7] = r26
        L_0x0351:
            r7 = r12
        L_0x0352:
            long r11 = r10.objectFieldOffset(r11)
            int r11 = (int) r11
            r12 = 4096(0x1000, float:5.74E-42)
            r15 = r4 & 4096(0x1000, float:5.74E-42)
            if (r15 != r12) goto L_0x03ba
            r15 = 17
            if (r6 > r15) goto L_0x03ba
            r15 = 1
            int r17 = r2 + 1
            char r2 = r5.charAt(r2)
            r12 = 55296(0xd800, float:7.7486E-41)
            if (r2 < r12) goto L_0x0392
            r2 = r2 & 8191(0x1fff, float:1.1478E-41)
            r12 = r17
            r17 = 13
        L_0x0373:
            int r30 = r12 + 1
            char r12 = r5.charAt(r12)
            r15 = 55296(0xd800, float:7.7486E-41)
            if (r12 < r15) goto L_0x038b
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r17
            r2 = r2 | r12
            r21 = 13
            int r17 = r17 + 13
            r12 = r30
            r15 = 1
            goto L_0x0373
        L_0x038b:
            r21 = 13
            int r12 = r12 << r17
            r2 = r2 | r12
        L_0x0390:
            r12 = 1
            goto L_0x0398
        L_0x0392:
            r15 = r12
            r21 = 13
            r30 = r17
            goto L_0x0390
        L_0x0398:
            int r17 = r1 << 1
            int r12 = r2 / 32
            int r17 = r17 + r12
            r12 = r19[r17]
            boolean r15 = r12 instanceof java.lang.reflect.Field
            if (r15 == 0) goto L_0x03a9
            java.lang.reflect.Field r12 = (java.lang.reflect.Field) r12
        L_0x03a6:
            r17 = r14
            goto L_0x03b2
        L_0x03a9:
            java.lang.String r12 = (java.lang.String) r12
            java.lang.reflect.Field r12 = p(r3, r12)
            r19[r17] = r12
            goto L_0x03a6
        L_0x03b2:
            long r14 = r10.objectFieldOffset(r12)
            int r12 = (int) r14
            int r2 = r2 % 32
            goto L_0x03c4
        L_0x03ba:
            r17 = r14
            r21 = 13
            r12 = 1048575(0xfffff, float:1.469367E-39)
            r30 = r2
            r2 = 0
        L_0x03c4:
            r14 = 18
            if (r6 < r14) goto L_0x03da
            r14 = 49
            if (r6 > r14) goto L_0x03da
            r14 = 1
            int r15 = r24 + 1
            r16[r24] = r11
            r24 = r15
        L_0x03d3:
            r34 = r11
            r11 = r7
            r7 = r12
            r12 = r34
            goto L_0x03dc
        L_0x03da:
            r14 = 1
            goto L_0x03d3
        L_0x03dc:
            int r15 = r22 + 1
            r9[r22] = r8
            int r8 = r22 + 2
            r14 = r4 & 512(0x200, float:7.175E-43)
            if (r14 == 0) goto L_0x03e9
            r14 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x03ea
        L_0x03e9:
            r14 = 0
        L_0x03ea:
            r4 = r4 & 256(0x100, float:3.59E-43)
            if (r4 == 0) goto L_0x03f1
            r4 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x03f2
        L_0x03f1:
            r4 = 0
        L_0x03f2:
            r4 = r4 | r14
            int r6 = r6 << 20
            r4 = r4 | r6
            r4 = r4 | r12
            r9[r15] = r4
            int r22 = r22 + 3
            int r2 = r2 << 20
            r2 = r2 | r7
            r9[r8] = r2
            r7 = r11
            r14 = r17
            r12 = r25
            r6 = r28
            r2 = r29
            r8 = r30
            r11 = r31
            r15 = r33
            r4 = 1
            goto L_0x019b
        L_0x0412:
            r29 = r2
            r31 = r11
            r25 = r12
            r17 = r14
            com.google.android.gms.internal.vision.E1 r1 = new com.google.android.gms.internal.vision.E1
            com.google.android.gms.internal.vision.A1 r0 = r0.zzc()
            r15 = 0
            r8 = r1
            r10 = r13
            r13 = r0
            r17 = r29
            r18 = r20
            r19 = r37
            r20 = r38
            r21 = r39
            r22 = r40
            r23 = r41
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            return r1
        L_0x0436:
            com.google.android.gms.internal.vision.g2 r0 = (com.google.android.gms.internal.vision.C7491g2) r0
            r0.zza()
            int r0 = com.google.android.gms.internal.vision.O1.f49236a
            java.lang.NoSuchMethodError r0 = new java.lang.NoSuchMethodError
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.E1.l(java.lang.Class, com.google.android.gms.internal.vision.y1, com.google.android.gms.internal.vision.H1, com.google.android.gms.internal.vision.j1, com.google.android.gms.internal.vision.j2, com.google.android.gms.internal.vision.E0, com.google.android.gms.internal.vision.x1):com.google.android.gms.internal.vision.E1");
    }

    private final S1 m(int i10) {
        int i11 = (i10 / 3) << 1;
        S1 s12 = (S1) this.f49178b[i11];
        if (s12 != null) {
            return s12;
        }
        S1 b10 = N1.a().b((Class) this.f49178b[i11 + 1]);
        this.f49178b[i11] = b10;
        return b10;
    }

    private final <K, V, UT, UB> UB n(int i10, int i11, Map<K, V> map, V0 v02, UB ub2, C7503j2<UT, UB> j2Var) {
        this.f49193q.zzb(B(i10));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry next = it.next();
            if (!v02.c(((Integer) next.getValue()).intValue())) {
                if (ub2 == null) {
                    ub2 = j2Var.a();
                }
                C7529r0 B10 = C7497i0.B(C7533s1.a((C7542v1) null, next.getKey(), next.getValue()));
                try {
                    C7533s1.b(B10.b(), (C7542v1) null, next.getKey(), next.getValue());
                    j2Var.c(ub2, i11, B10.a());
                    it.remove();
                } catch (IOException e10) {
                    throw new RuntimeException(e10);
                }
            }
        }
        return ub2;
    }

    private final <UT, UB> UB o(Object obj, int i10, UB ub2, C7503j2<UT, UB> j2Var) {
        V0 H10;
        int i11 = this.f49177a[i10];
        Object F10 = q2.F(obj, (long) (J(i10) & 1048575));
        if (F10 == null || (H10 = H(i10)) == null) {
            return ub2;
        }
        return n(i10, i11, this.f49193q.zza(F10), H10, ub2, j2Var);
    }

    private static Field p(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 40 + name.length() + String.valueOf(arrays).length());
            sb2.append("Field ");
            sb2.append(str);
            sb2.append(" for ");
            sb2.append(name);
            sb2.append(" not found. Known fields are ");
            sb2.append(arrays);
            throw new RuntimeException(sb2.toString());
        }
    }

    private static List<?> q(Object obj, long j10) {
        return (List) q2.F(obj, j10);
    }

    private static void r(int i10, Object obj, H2 h22) {
        if (obj instanceof String) {
            h22.z(i10, (String) obj);
        } else {
            h22.s(i10, (C7497i0) obj);
        }
    }

    private static <UT, UB> void s(C7503j2<UT, UB> j2Var, T t10, H2 h22) {
        j2Var.d(j2Var.f(t10), h22);
    }

    private final <K, V> void t(H2 h22, int i10, Object obj, int i11) {
        if (obj != null) {
            this.f49193q.zzb(B(i11));
            h22.E(i10, (C7542v1) null, this.f49193q.d(obj));
        }
    }

    private final void u(T t10, T t11, int i10) {
        long J10 = (long) (J(i10) & 1048575);
        if (v(t11, i10)) {
            Object F10 = q2.F(t10, J10);
            Object F11 = q2.F(t11, J10);
            if (F10 != null && F11 != null) {
                q2.j(t10, J10, U0.e(F10, F11));
                C(t10, i10);
            } else if (F11 != null) {
                q2.j(t10, J10, F11);
                C(t10, i10);
            }
        }
    }

    private final boolean v(T t10, int i10) {
        int L10 = L(i10);
        long j10 = (long) (L10 & 1048575);
        if (j10 == 1048575) {
            int J10 = J(i10);
            long j11 = (long) (J10 & 1048575);
            switch ((J10 & 267386880) >>> 20) {
                case 0:
                    return q2.C(t10, j11) != 0.0d;
                case 1:
                    return q2.x(t10, j11) != 0.0f;
                case 2:
                    return q2.o(t10, j11) != 0;
                case 3:
                    return q2.o(t10, j11) != 0;
                case 4:
                    return q2.b(t10, j11) != 0;
                case 5:
                    return q2.o(t10, j11) != 0;
                case 6:
                    return q2.b(t10, j11) != 0;
                case 7:
                    return q2.w(t10, j11);
                case 8:
                    Object F10 = q2.F(t10, j11);
                    if (F10 instanceof String) {
                        return !((String) F10).isEmpty();
                    }
                    if (F10 instanceof C7497i0) {
                        return !C7497i0.f49335b.equals(F10);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    return q2.F(t10, j11) != null;
                case 10:
                    return !C7497i0.f49335b.equals(q2.F(t10, j11));
                case 11:
                    return q2.b(t10, j11) != 0;
                case 12:
                    return q2.b(t10, j11) != 0;
                case 13:
                    return q2.b(t10, j11) != 0;
                case 14:
                    return q2.o(t10, j11) != 0;
                case 15:
                    return q2.b(t10, j11) != 0;
                case 16:
                    return q2.o(t10, j11) != 0;
                case 17:
                    return q2.F(t10, j11) != null;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            return (q2.b(t10, j10) & (1 << (L10 >>> 20))) != 0;
        }
    }

    private final boolean w(T t10, int i10, int i11) {
        return q2.b(t10, (long) (L(i11) & 1048575)) == i10;
    }

    private final boolean x(T t10, int i10, int i11, int i12, int i13) {
        return i11 == 1048575 ? v(t10, i10) : (i12 & i13) != 0;
    }

    private static boolean y(Object obj, int i10, S1 s12) {
        return s12.zzd(q2.F(obj, (long) (i10 & 1048575)));
    }

    private static <T> double z(T t10, long j10) {
        return ((Double) q2.F(t10, j10)).doubleValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0513  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0552  */
    /* JADX WARNING: Removed duplicated region for block: B:331:0x0a2a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(T r14, com.google.android.gms.internal.vision.H2 r15) {
        /*
            r13 = this;
            int r0 = r15.zza()
            int r1 = com.google.android.gms.internal.vision.G2.f49203b
            r2 = 267386880(0xff00000, float:2.3665827E-29)
            r3 = 0
            r4 = 1
            r5 = 0
            r6 = 1048575(0xfffff, float:1.469367E-39)
            if (r0 != r1) goto L_0x0529
            com.google.android.gms.internal.vision.j2<?, ?> r0 = r13.f49191o
            s(r0, r14, r15)
            boolean r0 = r13.f49182f
            if (r0 == 0) goto L_0x0032
            com.google.android.gms.internal.vision.E0<?> r0 = r13.f49192p
            com.google.android.gms.internal.vision.I0 r0 = r0.b(r14)
            com.google.android.gms.internal.vision.W1<T, java.lang.Object> r1 = r0.f49209a
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0032
            java.util.Iterator r0 = r0.q()
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L_0x0034
        L_0x0032:
            r0 = r3
            r1 = r0
        L_0x0034:
            int[] r7 = r13.f49177a
            int r7 = r7.length
            int r7 = r7 + -3
        L_0x0039:
            if (r7 < 0) goto L_0x0511
            int r8 = r13.J(r7)
            int[] r9 = r13.f49177a
            r9 = r9[r7]
        L_0x0043:
            if (r1 == 0) goto L_0x0061
            com.google.android.gms.internal.vision.E0<?> r10 = r13.f49192p
            int r10 = r10.a(r1)
            if (r10 <= r9) goto L_0x0061
            com.google.android.gms.internal.vision.E0<?> r10 = r13.f49192p
            r10.d(r15, r1)
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x005f
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L_0x0043
        L_0x005f:
            r1 = r3
            goto L_0x0043
        L_0x0061:
            r10 = r8 & r2
            int r10 = r10 >>> 20
            switch(r10) {
                case 0: goto L_0x04fe;
                case 1: goto L_0x04ee;
                case 2: goto L_0x04de;
                case 3: goto L_0x04ce;
                case 4: goto L_0x04be;
                case 5: goto L_0x04ae;
                case 6: goto L_0x049e;
                case 7: goto L_0x048d;
                case 8: goto L_0x047c;
                case 9: goto L_0x0467;
                case 10: goto L_0x0454;
                case 11: goto L_0x0443;
                case 12: goto L_0x0432;
                case 13: goto L_0x0421;
                case 14: goto L_0x0410;
                case 15: goto L_0x03ff;
                case 16: goto L_0x03ee;
                case 17: goto L_0x03d9;
                case 18: goto L_0x03c8;
                case 19: goto L_0x03b7;
                case 20: goto L_0x03a6;
                case 21: goto L_0x0395;
                case 22: goto L_0x0384;
                case 23: goto L_0x0373;
                case 24: goto L_0x0362;
                case 25: goto L_0x0351;
                case 26: goto L_0x0340;
                case 27: goto L_0x032b;
                case 28: goto L_0x031a;
                case 29: goto L_0x0309;
                case 30: goto L_0x02f8;
                case 31: goto L_0x02e7;
                case 32: goto L_0x02d6;
                case 33: goto L_0x02c5;
                case 34: goto L_0x02b4;
                case 35: goto L_0x02a3;
                case 36: goto L_0x0292;
                case 37: goto L_0x0281;
                case 38: goto L_0x0270;
                case 39: goto L_0x025f;
                case 40: goto L_0x024e;
                case 41: goto L_0x023d;
                case 42: goto L_0x022c;
                case 43: goto L_0x021b;
                case 44: goto L_0x020a;
                case 45: goto L_0x01f9;
                case 46: goto L_0x01e8;
                case 47: goto L_0x01d7;
                case 48: goto L_0x01c6;
                case 49: goto L_0x01b1;
                case 50: goto L_0x01a6;
                case 51: goto L_0x0195;
                case 52: goto L_0x0184;
                case 53: goto L_0x0173;
                case 54: goto L_0x0162;
                case 55: goto L_0x0151;
                case 56: goto L_0x0140;
                case 57: goto L_0x012f;
                case 58: goto L_0x011e;
                case 59: goto L_0x010d;
                case 60: goto L_0x00f8;
                case 61: goto L_0x00e5;
                case 62: goto L_0x00d4;
                case 63: goto L_0x00c3;
                case 64: goto L_0x00b2;
                case 65: goto L_0x00a1;
                case 66: goto L_0x0090;
                case 67: goto L_0x007f;
                case 68: goto L_0x006a;
                default: goto L_0x0068;
            }
        L_0x0068:
            goto L_0x050d
        L_0x006a:
            boolean r10 = r13.w(r14, r9, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.q2.F(r14, r10)
            com.google.android.gms.internal.vision.S1 r10 = r13.m(r7)
            r15.H(r9, r8, r10)
            goto L_0x050d
        L_0x007f:
            boolean r10 = r13.w(r14, r9, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = M(r14, r10)
            r15.r(r9, r10)
            goto L_0x050d
        L_0x0090:
            boolean r10 = r13.w(r14, r9, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = K(r14, r10)
            r15.m(r9, r8)
            goto L_0x050d
        L_0x00a1:
            boolean r10 = r13.w(r14, r9, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = M(r14, r10)
            r15.a(r9, r10)
            goto L_0x050d
        L_0x00b2:
            boolean r10 = r13.w(r14, r9, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = K(r14, r10)
            r15.i(r9, r8)
            goto L_0x050d
        L_0x00c3:
            boolean r10 = r13.w(r14, r9, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = K(r14, r10)
            r15.p(r9, r8)
            goto L_0x050d
        L_0x00d4:
            boolean r10 = r13.w(r14, r9, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = K(r14, r10)
            r15.v(r9, r8)
            goto L_0x050d
        L_0x00e5:
            boolean r10 = r13.w(r14, r9, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.q2.F(r14, r10)
            com.google.android.gms.internal.vision.i0 r8 = (com.google.android.gms.internal.vision.C7497i0) r8
            r15.s(r9, r8)
            goto L_0x050d
        L_0x00f8:
            boolean r10 = r13.w(r14, r9, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.q2.F(r14, r10)
            com.google.android.gms.internal.vision.S1 r10 = r13.m(r7)
            r15.G(r9, r8, r10)
            goto L_0x050d
        L_0x010d:
            boolean r10 = r13.w(r14, r9, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.q2.F(r14, r10)
            r(r9, r8, r15)
            goto L_0x050d
        L_0x011e:
            boolean r10 = r13.w(r14, r9, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            boolean r8 = O(r14, r10)
            r15.o(r9, r8)
            goto L_0x050d
        L_0x012f:
            boolean r10 = r13.w(r14, r9, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = K(r14, r10)
            r15.u(r9, r8)
            goto L_0x050d
        L_0x0140:
            boolean r10 = r13.w(r14, r9, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = M(r14, r10)
            r15.q(r9, r10)
            goto L_0x050d
        L_0x0151:
            boolean r10 = r13.w(r14, r9, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = K(r14, r10)
            r15.e(r9, r8)
            goto L_0x050d
        L_0x0162:
            boolean r10 = r13.w(r14, r9, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = M(r14, r10)
            r15.f(r9, r10)
            goto L_0x050d
        L_0x0173:
            boolean r10 = r13.w(r14, r9, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = M(r14, r10)
            r15.j(r9, r10)
            goto L_0x050d
        L_0x0184:
            boolean r10 = r13.w(r14, r9, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            float r8 = G(r14, r10)
            r15.l(r9, r8)
            goto L_0x050d
        L_0x0195:
            boolean r10 = r13.w(r14, r9, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            double r10 = z(r14, r10)
            r15.k(r9, r10)
            goto L_0x050d
        L_0x01a6:
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.q2.F(r14, r10)
            r13.t(r15, r9, r8, r7)
            goto L_0x050d
        L_0x01b1:
            int[] r9 = r13.f49177a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.q2.F(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.S1 r10 = r13.m(r7)
            com.google.android.gms.internal.vision.T1.x(r9, r8, r15, r10)
            goto L_0x050d
        L_0x01c6:
            int[] r9 = r13.f49177a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.q2.F(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.T1.K(r9, r8, r15, r4)
            goto L_0x050d
        L_0x01d7:
            int[] r9 = r13.f49177a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.q2.F(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.T1.Z(r9, r8, r15, r4)
            goto L_0x050d
        L_0x01e8:
            int[] r9 = r13.f49177a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.q2.F(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.T1.Q(r9, r8, r15, r4)
            goto L_0x050d
        L_0x01f9:
            int[] r9 = r13.f49177a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.q2.F(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.T1.b0(r9, r8, r15, r4)
            goto L_0x050d
        L_0x020a:
            int[] r9 = r13.f49177a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.q2.F(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.T1.c0(r9, r8, r15, r4)
            goto L_0x050d
        L_0x021b:
            int[] r9 = r13.f49177a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.q2.F(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.T1.W(r9, r8, r15, r4)
            goto L_0x050d
        L_0x022c:
            int[] r9 = r13.f49177a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.q2.F(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.T1.d0(r9, r8, r15, r4)
            goto L_0x050d
        L_0x023d:
            int[] r9 = r13.f49177a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.q2.F(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.T1.a0(r9, r8, r15, r4)
            goto L_0x050d
        L_0x024e:
            int[] r9 = r13.f49177a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.q2.F(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.T1.N(r9, r8, r15, r4)
            goto L_0x050d
        L_0x025f:
            int[] r9 = r13.f49177a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.q2.F(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.T1.T(r9, r8, r15, r4)
            goto L_0x050d
        L_0x0270:
            int[] r9 = r13.f49177a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.q2.F(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.T1.G(r9, r8, r15, r4)
            goto L_0x050d
        L_0x0281:
            int[] r9 = r13.f49177a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.q2.F(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.T1.C(r9, r8, r15, r4)
            goto L_0x050d
        L_0x0292:
            int[] r9 = r13.f49177a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.q2.F(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.T1.y(r9, r8, r15, r4)
            goto L_0x050d
        L_0x02a3:
            int[] r9 = r13.f49177a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.q2.F(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.T1.l(r9, r8, r15, r4)
            goto L_0x050d
        L_0x02b4:
            int[] r9 = r13.f49177a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.q2.F(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.T1.K(r9, r8, r15, r5)
            goto L_0x050d
        L_0x02c5:
            int[] r9 = r13.f49177a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.q2.F(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.T1.Z(r9, r8, r15, r5)
            goto L_0x050d
        L_0x02d6:
            int[] r9 = r13.f49177a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.q2.F(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.T1.Q(r9, r8, r15, r5)
            goto L_0x050d
        L_0x02e7:
            int[] r9 = r13.f49177a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.q2.F(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.T1.b0(r9, r8, r15, r5)
            goto L_0x050d
        L_0x02f8:
            int[] r9 = r13.f49177a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.q2.F(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.T1.c0(r9, r8, r15, r5)
            goto L_0x050d
        L_0x0309:
            int[] r9 = r13.f49177a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.q2.F(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.T1.W(r9, r8, r15, r5)
            goto L_0x050d
        L_0x031a:
            int[] r9 = r13.f49177a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.q2.F(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.T1.w(r9, r8, r15)
            goto L_0x050d
        L_0x032b:
            int[] r9 = r13.f49177a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.q2.F(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.S1 r10 = r13.m(r7)
            com.google.android.gms.internal.vision.T1.k(r9, r8, r15, r10)
            goto L_0x050d
        L_0x0340:
            int[] r9 = r13.f49177a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.q2.F(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.T1.j(r9, r8, r15)
            goto L_0x050d
        L_0x0351:
            int[] r9 = r13.f49177a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.q2.F(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.T1.d0(r9, r8, r15, r5)
            goto L_0x050d
        L_0x0362:
            int[] r9 = r13.f49177a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.q2.F(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.T1.a0(r9, r8, r15, r5)
            goto L_0x050d
        L_0x0373:
            int[] r9 = r13.f49177a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.q2.F(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.T1.N(r9, r8, r15, r5)
            goto L_0x050d
        L_0x0384:
            int[] r9 = r13.f49177a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.q2.F(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.T1.T(r9, r8, r15, r5)
            goto L_0x050d
        L_0x0395:
            int[] r9 = r13.f49177a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.q2.F(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.T1.G(r9, r8, r15, r5)
            goto L_0x050d
        L_0x03a6:
            int[] r9 = r13.f49177a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.q2.F(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.T1.C(r9, r8, r15, r5)
            goto L_0x050d
        L_0x03b7:
            int[] r9 = r13.f49177a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.q2.F(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.T1.y(r9, r8, r15, r5)
            goto L_0x050d
        L_0x03c8:
            int[] r9 = r13.f49177a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.q2.F(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.vision.T1.l(r9, r8, r15, r5)
            goto L_0x050d
        L_0x03d9:
            boolean r10 = r13.v(r14, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.q2.F(r14, r10)
            com.google.android.gms.internal.vision.S1 r10 = r13.m(r7)
            r15.H(r9, r8, r10)
            goto L_0x050d
        L_0x03ee:
            boolean r10 = r13.v(r14, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = com.google.android.gms.internal.vision.q2.o(r14, r10)
            r15.r(r9, r10)
            goto L_0x050d
        L_0x03ff:
            boolean r10 = r13.v(r14, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.vision.q2.b(r14, r10)
            r15.m(r9, r8)
            goto L_0x050d
        L_0x0410:
            boolean r10 = r13.v(r14, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = com.google.android.gms.internal.vision.q2.o(r14, r10)
            r15.a(r9, r10)
            goto L_0x050d
        L_0x0421:
            boolean r10 = r13.v(r14, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.vision.q2.b(r14, r10)
            r15.i(r9, r8)
            goto L_0x050d
        L_0x0432:
            boolean r10 = r13.v(r14, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.vision.q2.b(r14, r10)
            r15.p(r9, r8)
            goto L_0x050d
        L_0x0443:
            boolean r10 = r13.v(r14, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.vision.q2.b(r14, r10)
            r15.v(r9, r8)
            goto L_0x050d
        L_0x0454:
            boolean r10 = r13.v(r14, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.q2.F(r14, r10)
            com.google.android.gms.internal.vision.i0 r8 = (com.google.android.gms.internal.vision.C7497i0) r8
            r15.s(r9, r8)
            goto L_0x050d
        L_0x0467:
            boolean r10 = r13.v(r14, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.q2.F(r14, r10)
            com.google.android.gms.internal.vision.S1 r10 = r13.m(r7)
            r15.G(r9, r8, r10)
            goto L_0x050d
        L_0x047c:
            boolean r10 = r13.v(r14, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.vision.q2.F(r14, r10)
            r(r9, r8, r15)
            goto L_0x050d
        L_0x048d:
            boolean r10 = r13.v(r14, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            boolean r8 = com.google.android.gms.internal.vision.q2.w(r14, r10)
            r15.o(r9, r8)
            goto L_0x050d
        L_0x049e:
            boolean r10 = r13.v(r14, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.vision.q2.b(r14, r10)
            r15.u(r9, r8)
            goto L_0x050d
        L_0x04ae:
            boolean r10 = r13.v(r14, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = com.google.android.gms.internal.vision.q2.o(r14, r10)
            r15.q(r9, r10)
            goto L_0x050d
        L_0x04be:
            boolean r10 = r13.v(r14, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.vision.q2.b(r14, r10)
            r15.e(r9, r8)
            goto L_0x050d
        L_0x04ce:
            boolean r10 = r13.v(r14, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = com.google.android.gms.internal.vision.q2.o(r14, r10)
            r15.f(r9, r10)
            goto L_0x050d
        L_0x04de:
            boolean r10 = r13.v(r14, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = com.google.android.gms.internal.vision.q2.o(r14, r10)
            r15.j(r9, r10)
            goto L_0x050d
        L_0x04ee:
            boolean r10 = r13.v(r14, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            float r8 = com.google.android.gms.internal.vision.q2.x(r14, r10)
            r15.l(r9, r8)
            goto L_0x050d
        L_0x04fe:
            boolean r10 = r13.v(r14, r7)
            if (r10 == 0) goto L_0x050d
            r8 = r8 & r6
            long r10 = (long) r8
            double r10 = com.google.android.gms.internal.vision.q2.C(r14, r10)
            r15.k(r9, r10)
        L_0x050d:
            int r7 = r7 + -3
            goto L_0x0039
        L_0x0511:
            if (r1 == 0) goto L_0x0528
            com.google.android.gms.internal.vision.E0<?> r14 = r13.f49192p
            r14.d(r15, r1)
            boolean r14 = r0.hasNext()
            if (r14 == 0) goto L_0x0526
            java.lang.Object r14 = r0.next()
            java.util.Map$Entry r14 = (java.util.Map.Entry) r14
            r1 = r14
            goto L_0x0511
        L_0x0526:
            r1 = r3
            goto L_0x0511
        L_0x0528:
            return
        L_0x0529:
            boolean r0 = r13.f49184h
            if (r0 == 0) goto L_0x0a44
            boolean r0 = r13.f49182f
            if (r0 == 0) goto L_0x054a
            com.google.android.gms.internal.vision.E0<?> r0 = r13.f49192p
            com.google.android.gms.internal.vision.I0 r0 = r0.b(r14)
            com.google.android.gms.internal.vision.W1<T, java.lang.Object> r1 = r0.f49209a
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x054a
            java.util.Iterator r0 = r0.o()
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L_0x054c
        L_0x054a:
            r0 = r3
            r1 = r0
        L_0x054c:
            int[] r7 = r13.f49177a
            int r7 = r7.length
            r8 = r5
        L_0x0550:
            if (r8 >= r7) goto L_0x0a28
            int r9 = r13.J(r8)
            int[] r10 = r13.f49177a
            r10 = r10[r8]
        L_0x055a:
            if (r1 == 0) goto L_0x0578
            com.google.android.gms.internal.vision.E0<?> r11 = r13.f49192p
            int r11 = r11.a(r1)
            if (r11 > r10) goto L_0x0578
            com.google.android.gms.internal.vision.E0<?> r11 = r13.f49192p
            r11.d(r15, r1)
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0576
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L_0x055a
        L_0x0576:
            r1 = r3
            goto L_0x055a
        L_0x0578:
            r11 = r9 & r2
            int r11 = r11 >>> 20
            switch(r11) {
                case 0: goto L_0x0a15;
                case 1: goto L_0x0a05;
                case 2: goto L_0x09f5;
                case 3: goto L_0x09e5;
                case 4: goto L_0x09d5;
                case 5: goto L_0x09c5;
                case 6: goto L_0x09b5;
                case 7: goto L_0x09a4;
                case 8: goto L_0x0993;
                case 9: goto L_0x097e;
                case 10: goto L_0x096b;
                case 11: goto L_0x095a;
                case 12: goto L_0x0949;
                case 13: goto L_0x0938;
                case 14: goto L_0x0927;
                case 15: goto L_0x0916;
                case 16: goto L_0x0905;
                case 17: goto L_0x08f0;
                case 18: goto L_0x08df;
                case 19: goto L_0x08ce;
                case 20: goto L_0x08bd;
                case 21: goto L_0x08ac;
                case 22: goto L_0x089b;
                case 23: goto L_0x088a;
                case 24: goto L_0x0879;
                case 25: goto L_0x0868;
                case 26: goto L_0x0857;
                case 27: goto L_0x0842;
                case 28: goto L_0x0831;
                case 29: goto L_0x0820;
                case 30: goto L_0x080f;
                case 31: goto L_0x07fe;
                case 32: goto L_0x07ed;
                case 33: goto L_0x07dc;
                case 34: goto L_0x07cb;
                case 35: goto L_0x07ba;
                case 36: goto L_0x07a9;
                case 37: goto L_0x0798;
                case 38: goto L_0x0787;
                case 39: goto L_0x0776;
                case 40: goto L_0x0765;
                case 41: goto L_0x0754;
                case 42: goto L_0x0743;
                case 43: goto L_0x0732;
                case 44: goto L_0x0721;
                case 45: goto L_0x0710;
                case 46: goto L_0x06ff;
                case 47: goto L_0x06ee;
                case 48: goto L_0x06dd;
                case 49: goto L_0x06c8;
                case 50: goto L_0x06bd;
                case 51: goto L_0x06ac;
                case 52: goto L_0x069b;
                case 53: goto L_0x068a;
                case 54: goto L_0x0679;
                case 55: goto L_0x0668;
                case 56: goto L_0x0657;
                case 57: goto L_0x0646;
                case 58: goto L_0x0635;
                case 59: goto L_0x0624;
                case 60: goto L_0x060f;
                case 61: goto L_0x05fc;
                case 62: goto L_0x05eb;
                case 63: goto L_0x05da;
                case 64: goto L_0x05c9;
                case 65: goto L_0x05b8;
                case 66: goto L_0x05a7;
                case 67: goto L_0x0596;
                case 68: goto L_0x0581;
                default: goto L_0x057f;
            }
        L_0x057f:
            goto L_0x0a24
        L_0x0581:
            boolean r11 = r13.w(r14, r10, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.q2.F(r14, r11)
            com.google.android.gms.internal.vision.S1 r11 = r13.m(r8)
            r15.H(r10, r9, r11)
            goto L_0x0a24
        L_0x0596:
            boolean r11 = r13.w(r14, r10, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = M(r14, r11)
            r15.r(r10, r11)
            goto L_0x0a24
        L_0x05a7:
            boolean r11 = r13.w(r14, r10, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = K(r14, r11)
            r15.m(r10, r9)
            goto L_0x0a24
        L_0x05b8:
            boolean r11 = r13.w(r14, r10, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = M(r14, r11)
            r15.a(r10, r11)
            goto L_0x0a24
        L_0x05c9:
            boolean r11 = r13.w(r14, r10, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = K(r14, r11)
            r15.i(r10, r9)
            goto L_0x0a24
        L_0x05da:
            boolean r11 = r13.w(r14, r10, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = K(r14, r11)
            r15.p(r10, r9)
            goto L_0x0a24
        L_0x05eb:
            boolean r11 = r13.w(r14, r10, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = K(r14, r11)
            r15.v(r10, r9)
            goto L_0x0a24
        L_0x05fc:
            boolean r11 = r13.w(r14, r10, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.q2.F(r14, r11)
            com.google.android.gms.internal.vision.i0 r9 = (com.google.android.gms.internal.vision.C7497i0) r9
            r15.s(r10, r9)
            goto L_0x0a24
        L_0x060f:
            boolean r11 = r13.w(r14, r10, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.q2.F(r14, r11)
            com.google.android.gms.internal.vision.S1 r11 = r13.m(r8)
            r15.G(r10, r9, r11)
            goto L_0x0a24
        L_0x0624:
            boolean r11 = r13.w(r14, r10, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.q2.F(r14, r11)
            r(r10, r9, r15)
            goto L_0x0a24
        L_0x0635:
            boolean r11 = r13.w(r14, r10, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            boolean r9 = O(r14, r11)
            r15.o(r10, r9)
            goto L_0x0a24
        L_0x0646:
            boolean r11 = r13.w(r14, r10, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = K(r14, r11)
            r15.u(r10, r9)
            goto L_0x0a24
        L_0x0657:
            boolean r11 = r13.w(r14, r10, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = M(r14, r11)
            r15.q(r10, r11)
            goto L_0x0a24
        L_0x0668:
            boolean r11 = r13.w(r14, r10, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = K(r14, r11)
            r15.e(r10, r9)
            goto L_0x0a24
        L_0x0679:
            boolean r11 = r13.w(r14, r10, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = M(r14, r11)
            r15.f(r10, r11)
            goto L_0x0a24
        L_0x068a:
            boolean r11 = r13.w(r14, r10, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = M(r14, r11)
            r15.j(r10, r11)
            goto L_0x0a24
        L_0x069b:
            boolean r11 = r13.w(r14, r10, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            float r9 = G(r14, r11)
            r15.l(r10, r9)
            goto L_0x0a24
        L_0x06ac:
            boolean r11 = r13.w(r14, r10, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            double r11 = z(r14, r11)
            r15.k(r10, r11)
            goto L_0x0a24
        L_0x06bd:
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.q2.F(r14, r11)
            r13.t(r15, r10, r9, r8)
            goto L_0x0a24
        L_0x06c8:
            int[] r10 = r13.f49177a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.q2.F(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.S1 r11 = r13.m(r8)
            com.google.android.gms.internal.vision.T1.x(r10, r9, r15, r11)
            goto L_0x0a24
        L_0x06dd:
            int[] r10 = r13.f49177a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.q2.F(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.T1.K(r10, r9, r15, r4)
            goto L_0x0a24
        L_0x06ee:
            int[] r10 = r13.f49177a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.q2.F(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.T1.Z(r10, r9, r15, r4)
            goto L_0x0a24
        L_0x06ff:
            int[] r10 = r13.f49177a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.q2.F(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.T1.Q(r10, r9, r15, r4)
            goto L_0x0a24
        L_0x0710:
            int[] r10 = r13.f49177a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.q2.F(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.T1.b0(r10, r9, r15, r4)
            goto L_0x0a24
        L_0x0721:
            int[] r10 = r13.f49177a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.q2.F(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.T1.c0(r10, r9, r15, r4)
            goto L_0x0a24
        L_0x0732:
            int[] r10 = r13.f49177a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.q2.F(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.T1.W(r10, r9, r15, r4)
            goto L_0x0a24
        L_0x0743:
            int[] r10 = r13.f49177a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.q2.F(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.T1.d0(r10, r9, r15, r4)
            goto L_0x0a24
        L_0x0754:
            int[] r10 = r13.f49177a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.q2.F(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.T1.a0(r10, r9, r15, r4)
            goto L_0x0a24
        L_0x0765:
            int[] r10 = r13.f49177a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.q2.F(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.T1.N(r10, r9, r15, r4)
            goto L_0x0a24
        L_0x0776:
            int[] r10 = r13.f49177a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.q2.F(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.T1.T(r10, r9, r15, r4)
            goto L_0x0a24
        L_0x0787:
            int[] r10 = r13.f49177a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.q2.F(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.T1.G(r10, r9, r15, r4)
            goto L_0x0a24
        L_0x0798:
            int[] r10 = r13.f49177a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.q2.F(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.T1.C(r10, r9, r15, r4)
            goto L_0x0a24
        L_0x07a9:
            int[] r10 = r13.f49177a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.q2.F(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.T1.y(r10, r9, r15, r4)
            goto L_0x0a24
        L_0x07ba:
            int[] r10 = r13.f49177a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.q2.F(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.T1.l(r10, r9, r15, r4)
            goto L_0x0a24
        L_0x07cb:
            int[] r10 = r13.f49177a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.q2.F(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.T1.K(r10, r9, r15, r5)
            goto L_0x0a24
        L_0x07dc:
            int[] r10 = r13.f49177a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.q2.F(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.T1.Z(r10, r9, r15, r5)
            goto L_0x0a24
        L_0x07ed:
            int[] r10 = r13.f49177a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.q2.F(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.T1.Q(r10, r9, r15, r5)
            goto L_0x0a24
        L_0x07fe:
            int[] r10 = r13.f49177a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.q2.F(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.T1.b0(r10, r9, r15, r5)
            goto L_0x0a24
        L_0x080f:
            int[] r10 = r13.f49177a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.q2.F(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.T1.c0(r10, r9, r15, r5)
            goto L_0x0a24
        L_0x0820:
            int[] r10 = r13.f49177a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.q2.F(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.T1.W(r10, r9, r15, r5)
            goto L_0x0a24
        L_0x0831:
            int[] r10 = r13.f49177a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.q2.F(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.T1.w(r10, r9, r15)
            goto L_0x0a24
        L_0x0842:
            int[] r10 = r13.f49177a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.q2.F(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.S1 r11 = r13.m(r8)
            com.google.android.gms.internal.vision.T1.k(r10, r9, r15, r11)
            goto L_0x0a24
        L_0x0857:
            int[] r10 = r13.f49177a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.q2.F(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.T1.j(r10, r9, r15)
            goto L_0x0a24
        L_0x0868:
            int[] r10 = r13.f49177a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.q2.F(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.T1.d0(r10, r9, r15, r5)
            goto L_0x0a24
        L_0x0879:
            int[] r10 = r13.f49177a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.q2.F(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.T1.a0(r10, r9, r15, r5)
            goto L_0x0a24
        L_0x088a:
            int[] r10 = r13.f49177a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.q2.F(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.T1.N(r10, r9, r15, r5)
            goto L_0x0a24
        L_0x089b:
            int[] r10 = r13.f49177a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.q2.F(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.T1.T(r10, r9, r15, r5)
            goto L_0x0a24
        L_0x08ac:
            int[] r10 = r13.f49177a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.q2.F(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.T1.G(r10, r9, r15, r5)
            goto L_0x0a24
        L_0x08bd:
            int[] r10 = r13.f49177a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.q2.F(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.T1.C(r10, r9, r15, r5)
            goto L_0x0a24
        L_0x08ce:
            int[] r10 = r13.f49177a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.q2.F(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.T1.y(r10, r9, r15, r5)
            goto L_0x0a24
        L_0x08df:
            int[] r10 = r13.f49177a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.q2.F(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.vision.T1.l(r10, r9, r15, r5)
            goto L_0x0a24
        L_0x08f0:
            boolean r11 = r13.v(r14, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.q2.F(r14, r11)
            com.google.android.gms.internal.vision.S1 r11 = r13.m(r8)
            r15.H(r10, r9, r11)
            goto L_0x0a24
        L_0x0905:
            boolean r11 = r13.v(r14, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = com.google.android.gms.internal.vision.q2.o(r14, r11)
            r15.r(r10, r11)
            goto L_0x0a24
        L_0x0916:
            boolean r11 = r13.v(r14, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.gms.internal.vision.q2.b(r14, r11)
            r15.m(r10, r9)
            goto L_0x0a24
        L_0x0927:
            boolean r11 = r13.v(r14, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = com.google.android.gms.internal.vision.q2.o(r14, r11)
            r15.a(r10, r11)
            goto L_0x0a24
        L_0x0938:
            boolean r11 = r13.v(r14, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.gms.internal.vision.q2.b(r14, r11)
            r15.i(r10, r9)
            goto L_0x0a24
        L_0x0949:
            boolean r11 = r13.v(r14, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.gms.internal.vision.q2.b(r14, r11)
            r15.p(r10, r9)
            goto L_0x0a24
        L_0x095a:
            boolean r11 = r13.v(r14, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.gms.internal.vision.q2.b(r14, r11)
            r15.v(r10, r9)
            goto L_0x0a24
        L_0x096b:
            boolean r11 = r13.v(r14, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.q2.F(r14, r11)
            com.google.android.gms.internal.vision.i0 r9 = (com.google.android.gms.internal.vision.C7497i0) r9
            r15.s(r10, r9)
            goto L_0x0a24
        L_0x097e:
            boolean r11 = r13.v(r14, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.q2.F(r14, r11)
            com.google.android.gms.internal.vision.S1 r11 = r13.m(r8)
            r15.G(r10, r9, r11)
            goto L_0x0a24
        L_0x0993:
            boolean r11 = r13.v(r14, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.vision.q2.F(r14, r11)
            r(r10, r9, r15)
            goto L_0x0a24
        L_0x09a4:
            boolean r11 = r13.v(r14, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            boolean r9 = com.google.android.gms.internal.vision.q2.w(r14, r11)
            r15.o(r10, r9)
            goto L_0x0a24
        L_0x09b5:
            boolean r11 = r13.v(r14, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.gms.internal.vision.q2.b(r14, r11)
            r15.u(r10, r9)
            goto L_0x0a24
        L_0x09c5:
            boolean r11 = r13.v(r14, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = com.google.android.gms.internal.vision.q2.o(r14, r11)
            r15.q(r10, r11)
            goto L_0x0a24
        L_0x09d5:
            boolean r11 = r13.v(r14, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.gms.internal.vision.q2.b(r14, r11)
            r15.e(r10, r9)
            goto L_0x0a24
        L_0x09e5:
            boolean r11 = r13.v(r14, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = com.google.android.gms.internal.vision.q2.o(r14, r11)
            r15.f(r10, r11)
            goto L_0x0a24
        L_0x09f5:
            boolean r11 = r13.v(r14, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = com.google.android.gms.internal.vision.q2.o(r14, r11)
            r15.j(r10, r11)
            goto L_0x0a24
        L_0x0a05:
            boolean r11 = r13.v(r14, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            float r9 = com.google.android.gms.internal.vision.q2.x(r14, r11)
            r15.l(r10, r9)
            goto L_0x0a24
        L_0x0a15:
            boolean r11 = r13.v(r14, r8)
            if (r11 == 0) goto L_0x0a24
            r9 = r9 & r6
            long r11 = (long) r9
            double r11 = com.google.android.gms.internal.vision.q2.C(r14, r11)
            r15.k(r10, r11)
        L_0x0a24:
            int r8 = r8 + 3
            goto L_0x0550
        L_0x0a28:
            if (r1 == 0) goto L_0x0a3e
            com.google.android.gms.internal.vision.E0<?> r2 = r13.f49192p
            r2.d(r15, r1)
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0a3c
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L_0x0a28
        L_0x0a3c:
            r1 = r3
            goto L_0x0a28
        L_0x0a3e:
            com.google.android.gms.internal.vision.j2<?, ?> r0 = r13.f49191o
            s(r0, r14, r15)
            return
        L_0x0a44:
            r13.E(r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.E1.a(java.lang.Object, com.google.android.gms.internal.vision.H2):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x006b, code lost:
        if (com.google.android.gms.internal.vision.T1.q(com.google.android.gms.internal.vision.q2.F(r10, r6), com.google.android.gms.internal.vision.q2.F(r11, r6)) != false) goto L_0x01c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x007e, code lost:
        if (com.google.android.gms.internal.vision.q2.o(r10, r6) == com.google.android.gms.internal.vision.q2.o(r11, r6)) goto L_0x01c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008f, code lost:
        if (com.google.android.gms.internal.vision.q2.b(r10, r6) == com.google.android.gms.internal.vision.q2.b(r11, r6)) goto L_0x01c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a2, code lost:
        if (com.google.android.gms.internal.vision.q2.o(r10, r6) == com.google.android.gms.internal.vision.q2.o(r11, r6)) goto L_0x01c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b3, code lost:
        if (com.google.android.gms.internal.vision.q2.b(r10, r6) == com.google.android.gms.internal.vision.q2.b(r11, r6)) goto L_0x01c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c4, code lost:
        if (com.google.android.gms.internal.vision.q2.b(r10, r6) == com.google.android.gms.internal.vision.q2.b(r11, r6)) goto L_0x01c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00d6, code lost:
        if (com.google.android.gms.internal.vision.q2.b(r10, r6) == com.google.android.gms.internal.vision.q2.b(r11, r6)) goto L_0x01c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ec, code lost:
        if (com.google.android.gms.internal.vision.T1.q(com.google.android.gms.internal.vision.q2.F(r10, r6), com.google.android.gms.internal.vision.q2.F(r11, r6)) != false) goto L_0x01c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0102, code lost:
        if (com.google.android.gms.internal.vision.T1.q(com.google.android.gms.internal.vision.q2.F(r10, r6), com.google.android.gms.internal.vision.q2.F(r11, r6)) != false) goto L_0x01c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0118, code lost:
        if (com.google.android.gms.internal.vision.T1.q(com.google.android.gms.internal.vision.q2.F(r10, r6), com.google.android.gms.internal.vision.q2.F(r11, r6)) != false) goto L_0x01c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x012a, code lost:
        if (com.google.android.gms.internal.vision.q2.w(r10, r6) == com.google.android.gms.internal.vision.q2.w(r11, r6)) goto L_0x01c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x013c, code lost:
        if (com.google.android.gms.internal.vision.q2.b(r10, r6) == com.google.android.gms.internal.vision.q2.b(r11, r6)) goto L_0x01c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0150, code lost:
        if (com.google.android.gms.internal.vision.q2.o(r10, r6) == com.google.android.gms.internal.vision.q2.o(r11, r6)) goto L_0x01c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0162, code lost:
        if (com.google.android.gms.internal.vision.q2.b(r10, r6) == com.google.android.gms.internal.vision.q2.b(r11, r6)) goto L_0x01c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0176, code lost:
        if (com.google.android.gms.internal.vision.q2.o(r10, r6) == com.google.android.gms.internal.vision.q2.o(r11, r6)) goto L_0x01c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x018a, code lost:
        if (com.google.android.gms.internal.vision.q2.o(r10, r6) == com.google.android.gms.internal.vision.q2.o(r11, r6)) goto L_0x01c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01a4, code lost:
        if (java.lang.Float.floatToIntBits(com.google.android.gms.internal.vision.q2.x(r10, r6)) == java.lang.Float.floatToIntBits(com.google.android.gms.internal.vision.q2.x(r11, r6))) goto L_0x01c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01c0, code lost:
        if (java.lang.Double.doubleToLongBits(com.google.android.gms.internal.vision.q2.C(r10, r6)) == java.lang.Double.doubleToLongBits(com.google.android.gms.internal.vision.q2.C(r11, r6))) goto L_0x01c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0038, code lost:
        if (com.google.android.gms.internal.vision.T1.q(com.google.android.gms.internal.vision.q2.F(r10, r6), com.google.android.gms.internal.vision.q2.F(r11, r6)) != false) goto L_0x01c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003a, code lost:
        r3 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b(T r10, T r11) {
        /*
            r9 = this;
            int[] r0 = r9.f49177a
            int r0 = r0.length
            r1 = 0
            r2 = r1
        L_0x0005:
            r3 = 1
            if (r2 >= r0) goto L_0x01cb
            int r4 = r9.J(r2)
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r6 = r4 & r5
            long r6 = (long) r6
            r8 = 267386880(0xff00000, float:2.3665827E-29)
            r4 = r4 & r8
            int r4 = r4 >>> 20
            switch(r4) {
                case 0: goto L_0x01a8;
                case 1: goto L_0x018e;
                case 2: goto L_0x017a;
                case 3: goto L_0x0166;
                case 4: goto L_0x0154;
                case 5: goto L_0x0140;
                case 6: goto L_0x012e;
                case 7: goto L_0x011c;
                case 8: goto L_0x0106;
                case 9: goto L_0x00f0;
                case 10: goto L_0x00da;
                case 11: goto L_0x00c8;
                case 12: goto L_0x00b6;
                case 13: goto L_0x00a5;
                case 14: goto L_0x0092;
                case 15: goto L_0x0081;
                case 16: goto L_0x006e;
                case 17: goto L_0x0059;
                case 18: goto L_0x004b;
                case 19: goto L_0x004b;
                case 20: goto L_0x004b;
                case 21: goto L_0x004b;
                case 22: goto L_0x004b;
                case 23: goto L_0x004b;
                case 24: goto L_0x004b;
                case 25: goto L_0x004b;
                case 26: goto L_0x004b;
                case 27: goto L_0x004b;
                case 28: goto L_0x004b;
                case 29: goto L_0x004b;
                case 30: goto L_0x004b;
                case 31: goto L_0x004b;
                case 32: goto L_0x004b;
                case 33: goto L_0x004b;
                case 34: goto L_0x004b;
                case 35: goto L_0x004b;
                case 36: goto L_0x004b;
                case 37: goto L_0x004b;
                case 38: goto L_0x004b;
                case 39: goto L_0x004b;
                case 40: goto L_0x004b;
                case 41: goto L_0x004b;
                case 42: goto L_0x004b;
                case 43: goto L_0x004b;
                case 44: goto L_0x004b;
                case 45: goto L_0x004b;
                case 46: goto L_0x004b;
                case 47: goto L_0x004b;
                case 48: goto L_0x004b;
                case 49: goto L_0x004b;
                case 50: goto L_0x003d;
                case 51: goto L_0x001c;
                case 52: goto L_0x001c;
                case 53: goto L_0x001c;
                case 54: goto L_0x001c;
                case 55: goto L_0x001c;
                case 56: goto L_0x001c;
                case 57: goto L_0x001c;
                case 58: goto L_0x001c;
                case 59: goto L_0x001c;
                case 60: goto L_0x001c;
                case 61: goto L_0x001c;
                case 62: goto L_0x001c;
                case 63: goto L_0x001c;
                case 64: goto L_0x001c;
                case 65: goto L_0x001c;
                case 66: goto L_0x001c;
                case 67: goto L_0x001c;
                case 68: goto L_0x001c;
                default: goto L_0x001a;
            }
        L_0x001a:
            goto L_0x01c4
        L_0x001c:
            int r4 = r9.L(r2)
            r4 = r4 & r5
            long r4 = (long) r4
            int r8 = com.google.android.gms.internal.vision.q2.b(r10, r4)
            int r4 = com.google.android.gms.internal.vision.q2.b(r11, r4)
            if (r8 != r4) goto L_0x003a
            java.lang.Object r4 = com.google.android.gms.internal.vision.q2.F(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.vision.q2.F(r11, r6)
            boolean r4 = com.google.android.gms.internal.vision.T1.q(r4, r5)
            if (r4 != 0) goto L_0x01c4
        L_0x003a:
            r3 = r1
            goto L_0x01c4
        L_0x003d:
            java.lang.Object r3 = com.google.android.gms.internal.vision.q2.F(r10, r6)
            java.lang.Object r4 = com.google.android.gms.internal.vision.q2.F(r11, r6)
            boolean r3 = com.google.android.gms.internal.vision.T1.q(r3, r4)
            goto L_0x01c4
        L_0x004b:
            java.lang.Object r3 = com.google.android.gms.internal.vision.q2.F(r10, r6)
            java.lang.Object r4 = com.google.android.gms.internal.vision.q2.F(r11, r6)
            boolean r3 = com.google.android.gms.internal.vision.T1.q(r3, r4)
            goto L_0x01c4
        L_0x0059:
            boolean r4 = r9.I(r10, r11, r2)
            if (r4 == 0) goto L_0x003a
            java.lang.Object r4 = com.google.android.gms.internal.vision.q2.F(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.vision.q2.F(r11, r6)
            boolean r4 = com.google.android.gms.internal.vision.T1.q(r4, r5)
            if (r4 != 0) goto L_0x01c4
            goto L_0x003a
        L_0x006e:
            boolean r4 = r9.I(r10, r11, r2)
            if (r4 == 0) goto L_0x003a
            long r4 = com.google.android.gms.internal.vision.q2.o(r10, r6)
            long r6 = com.google.android.gms.internal.vision.q2.o(r11, r6)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x01c4
            goto L_0x003a
        L_0x0081:
            boolean r4 = r9.I(r10, r11, r2)
            if (r4 == 0) goto L_0x003a
            int r4 = com.google.android.gms.internal.vision.q2.b(r10, r6)
            int r5 = com.google.android.gms.internal.vision.q2.b(r11, r6)
            if (r4 == r5) goto L_0x01c4
            goto L_0x003a
        L_0x0092:
            boolean r4 = r9.I(r10, r11, r2)
            if (r4 == 0) goto L_0x003a
            long r4 = com.google.android.gms.internal.vision.q2.o(r10, r6)
            long r6 = com.google.android.gms.internal.vision.q2.o(r11, r6)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x01c4
            goto L_0x003a
        L_0x00a5:
            boolean r4 = r9.I(r10, r11, r2)
            if (r4 == 0) goto L_0x003a
            int r4 = com.google.android.gms.internal.vision.q2.b(r10, r6)
            int r5 = com.google.android.gms.internal.vision.q2.b(r11, r6)
            if (r4 == r5) goto L_0x01c4
            goto L_0x003a
        L_0x00b6:
            boolean r4 = r9.I(r10, r11, r2)
            if (r4 == 0) goto L_0x003a
            int r4 = com.google.android.gms.internal.vision.q2.b(r10, r6)
            int r5 = com.google.android.gms.internal.vision.q2.b(r11, r6)
            if (r4 == r5) goto L_0x01c4
            goto L_0x003a
        L_0x00c8:
            boolean r4 = r9.I(r10, r11, r2)
            if (r4 == 0) goto L_0x003a
            int r4 = com.google.android.gms.internal.vision.q2.b(r10, r6)
            int r5 = com.google.android.gms.internal.vision.q2.b(r11, r6)
            if (r4 == r5) goto L_0x01c4
            goto L_0x003a
        L_0x00da:
            boolean r4 = r9.I(r10, r11, r2)
            if (r4 == 0) goto L_0x003a
            java.lang.Object r4 = com.google.android.gms.internal.vision.q2.F(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.vision.q2.F(r11, r6)
            boolean r4 = com.google.android.gms.internal.vision.T1.q(r4, r5)
            if (r4 != 0) goto L_0x01c4
            goto L_0x003a
        L_0x00f0:
            boolean r4 = r9.I(r10, r11, r2)
            if (r4 == 0) goto L_0x003a
            java.lang.Object r4 = com.google.android.gms.internal.vision.q2.F(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.vision.q2.F(r11, r6)
            boolean r4 = com.google.android.gms.internal.vision.T1.q(r4, r5)
            if (r4 != 0) goto L_0x01c4
            goto L_0x003a
        L_0x0106:
            boolean r4 = r9.I(r10, r11, r2)
            if (r4 == 0) goto L_0x003a
            java.lang.Object r4 = com.google.android.gms.internal.vision.q2.F(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.vision.q2.F(r11, r6)
            boolean r4 = com.google.android.gms.internal.vision.T1.q(r4, r5)
            if (r4 != 0) goto L_0x01c4
            goto L_0x003a
        L_0x011c:
            boolean r4 = r9.I(r10, r11, r2)
            if (r4 == 0) goto L_0x003a
            boolean r4 = com.google.android.gms.internal.vision.q2.w(r10, r6)
            boolean r5 = com.google.android.gms.internal.vision.q2.w(r11, r6)
            if (r4 == r5) goto L_0x01c4
            goto L_0x003a
        L_0x012e:
            boolean r4 = r9.I(r10, r11, r2)
            if (r4 == 0) goto L_0x003a
            int r4 = com.google.android.gms.internal.vision.q2.b(r10, r6)
            int r5 = com.google.android.gms.internal.vision.q2.b(r11, r6)
            if (r4 == r5) goto L_0x01c4
            goto L_0x003a
        L_0x0140:
            boolean r4 = r9.I(r10, r11, r2)
            if (r4 == 0) goto L_0x003a
            long r4 = com.google.android.gms.internal.vision.q2.o(r10, r6)
            long r6 = com.google.android.gms.internal.vision.q2.o(r11, r6)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x01c4
            goto L_0x003a
        L_0x0154:
            boolean r4 = r9.I(r10, r11, r2)
            if (r4 == 0) goto L_0x003a
            int r4 = com.google.android.gms.internal.vision.q2.b(r10, r6)
            int r5 = com.google.android.gms.internal.vision.q2.b(r11, r6)
            if (r4 == r5) goto L_0x01c4
            goto L_0x003a
        L_0x0166:
            boolean r4 = r9.I(r10, r11, r2)
            if (r4 == 0) goto L_0x003a
            long r4 = com.google.android.gms.internal.vision.q2.o(r10, r6)
            long r6 = com.google.android.gms.internal.vision.q2.o(r11, r6)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x01c4
            goto L_0x003a
        L_0x017a:
            boolean r4 = r9.I(r10, r11, r2)
            if (r4 == 0) goto L_0x003a
            long r4 = com.google.android.gms.internal.vision.q2.o(r10, r6)
            long r6 = com.google.android.gms.internal.vision.q2.o(r11, r6)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x01c4
            goto L_0x003a
        L_0x018e:
            boolean r4 = r9.I(r10, r11, r2)
            if (r4 == 0) goto L_0x003a
            float r4 = com.google.android.gms.internal.vision.q2.x(r10, r6)
            int r4 = java.lang.Float.floatToIntBits(r4)
            float r5 = com.google.android.gms.internal.vision.q2.x(r11, r6)
            int r5 = java.lang.Float.floatToIntBits(r5)
            if (r4 == r5) goto L_0x01c4
            goto L_0x003a
        L_0x01a8:
            boolean r4 = r9.I(r10, r11, r2)
            if (r4 == 0) goto L_0x003a
            double r4 = com.google.android.gms.internal.vision.q2.C(r10, r6)
            long r4 = java.lang.Double.doubleToLongBits(r4)
            double r6 = com.google.android.gms.internal.vision.q2.C(r11, r6)
            long r6 = java.lang.Double.doubleToLongBits(r6)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x01c4
            goto L_0x003a
        L_0x01c4:
            if (r3 != 0) goto L_0x01c7
            return r1
        L_0x01c7:
            int r2 = r2 + 3
            goto L_0x0005
        L_0x01cb:
            com.google.android.gms.internal.vision.j2<?, ?> r0 = r9.f49191o
            java.lang.Object r0 = r0.f(r10)
            com.google.android.gms.internal.vision.j2<?, ?> r2 = r9.f49191o
            java.lang.Object r2 = r2.f(r11)
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x01de
            return r1
        L_0x01de:
            boolean r0 = r9.f49182f
            if (r0 == 0) goto L_0x01f3
            com.google.android.gms.internal.vision.E0<?> r0 = r9.f49192p
            com.google.android.gms.internal.vision.I0 r10 = r0.b(r10)
            com.google.android.gms.internal.vision.E0<?> r0 = r9.f49192p
            com.google.android.gms.internal.vision.I0 r11 = r0.b(r11)
            boolean r10 = r10.equals(r11)
            return r10
        L_0x01f3:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.E1.b(java.lang.Object, java.lang.Object):boolean");
    }

    public final void c(T t10, T t11) {
        t11.getClass();
        for (int i10 = 0; i10 < this.f49177a.length; i10 += 3) {
            int J10 = J(i10);
            long j10 = (long) (1048575 & J10);
            int i11 = this.f49177a[i10];
            switch ((J10 & 267386880) >>> 20) {
                case 0:
                    if (!v(t11, i10)) {
                        break;
                    } else {
                        q2.f(t10, j10, q2.C(t11, j10));
                        C(t10, i10);
                        break;
                    }
                case 1:
                    if (!v(t11, i10)) {
                        break;
                    } else {
                        q2.g(t10, j10, q2.x(t11, j10));
                        C(t10, i10);
                        break;
                    }
                case 2:
                    if (!v(t11, i10)) {
                        break;
                    } else {
                        q2.i(t10, j10, q2.o(t11, j10));
                        C(t10, i10);
                        break;
                    }
                case 3:
                    if (!v(t11, i10)) {
                        break;
                    } else {
                        q2.i(t10, j10, q2.o(t11, j10));
                        C(t10, i10);
                        break;
                    }
                case 4:
                    if (!v(t11, i10)) {
                        break;
                    } else {
                        q2.h(t10, j10, q2.b(t11, j10));
                        C(t10, i10);
                        break;
                    }
                case 5:
                    if (!v(t11, i10)) {
                        break;
                    } else {
                        q2.i(t10, j10, q2.o(t11, j10));
                        C(t10, i10);
                        break;
                    }
                case 6:
                    if (!v(t11, i10)) {
                        break;
                    } else {
                        q2.h(t10, j10, q2.b(t11, j10));
                        C(t10, i10);
                        break;
                    }
                case 7:
                    if (!v(t11, i10)) {
                        break;
                    } else {
                        q2.k(t10, j10, q2.w(t11, j10));
                        C(t10, i10);
                        break;
                    }
                case 8:
                    if (!v(t11, i10)) {
                        break;
                    } else {
                        q2.j(t10, j10, q2.F(t11, j10));
                        C(t10, i10);
                        break;
                    }
                case 9:
                    u(t10, t11, i10);
                    break;
                case 10:
                    if (!v(t11, i10)) {
                        break;
                    } else {
                        q2.j(t10, j10, q2.F(t11, j10));
                        C(t10, i10);
                        break;
                    }
                case 11:
                    if (!v(t11, i10)) {
                        break;
                    } else {
                        q2.h(t10, j10, q2.b(t11, j10));
                        C(t10, i10);
                        break;
                    }
                case 12:
                    if (!v(t11, i10)) {
                        break;
                    } else {
                        q2.h(t10, j10, q2.b(t11, j10));
                        C(t10, i10);
                        break;
                    }
                case 13:
                    if (!v(t11, i10)) {
                        break;
                    } else {
                        q2.h(t10, j10, q2.b(t11, j10));
                        C(t10, i10);
                        break;
                    }
                case 14:
                    if (!v(t11, i10)) {
                        break;
                    } else {
                        q2.i(t10, j10, q2.o(t11, j10));
                        C(t10, i10);
                        break;
                    }
                case 15:
                    if (!v(t11, i10)) {
                        break;
                    } else {
                        q2.h(t10, j10, q2.b(t11, j10));
                        C(t10, i10);
                        break;
                    }
                case 16:
                    if (!v(t11, i10)) {
                        break;
                    } else {
                        q2.i(t10, j10, q2.o(t11, j10));
                        C(t10, i10);
                        break;
                    }
                case 17:
                    u(t10, t11, i10);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case M.RESPONSE_BODY_ATTRIBUTES_FIELD_NUMBER /*23*/:
                case BuildConfig.MIN_SDK_VERSION /*24*/:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case BuildConfig.TARGET_SDK_VERSION /*33*/:
                case 34:
                case ImageFormat.YUV_420_888 /*35*/:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.f49190n.b(t10, t11, j10);
                    break;
                case 50:
                    T1.n(this.f49193q, t10, t11, j10);
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (!w(t11, i11, i10)) {
                        break;
                    } else {
                        q2.j(t10, j10, q2.F(t11, j10));
                        D(t10, i11, i10);
                        break;
                    }
                case 60:
                    F(t10, t11, i10);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!w(t11, i11, i10)) {
                        break;
                    } else {
                        q2.j(t10, j10, q2.F(t11, j10));
                        D(t10, i11, i10);
                        break;
                    }
                case 68:
                    F(t10, t11, i10);
                    break;
            }
        }
        T1.o(this.f49191o, t10, t11);
        if (this.f49182f) {
            T1.m(this.f49192p, t10, t11);
        }
    }

    public final void d(T t10) {
        int i10;
        int i11 = this.f49187k;
        while (true) {
            i10 = this.f49188l;
            if (i11 >= i10) {
                break;
            }
            long J10 = (long) (J(this.f49186j[i11]) & 1048575);
            Object F10 = q2.F(t10, J10);
            if (F10 != null) {
                q2.j(t10, J10, this.f49193q.a(F10));
            }
            i11++;
        }
        int length = this.f49186j.length;
        while (i10 < length) {
            this.f49190n.d(t10, (long) this.f49186j[i10]);
            i10++;
        }
        this.f49191o.j(t10);
        if (this.f49182f) {
            this.f49192p.g(t10);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v5, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x02d7, code lost:
        r15 = r30;
        r14 = r31;
        r12 = r32;
        r13 = r34;
        r11 = r35;
        r2 = r18;
        r10 = r19;
        r1 = r25;
        r6 = r27;
        r7 = r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0321, code lost:
        if (r0 == r15) goto L_0x02d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0340, code lost:
        if (r0 == r15) goto L_0x02d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00f5, code lost:
        r6 = r6 | r23;
        r9 = r7;
        r2 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00fa, code lost:
        r5 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x022e, code lost:
        r2 = r5;
        r29 = r7;
        r18 = r10;
        r7 = r20;
        r19 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x02ce, code lost:
        if (r0 == r15) goto L_0x02d0;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(T r31, byte[] r32, int r33, int r34, com.google.android.gms.internal.vision.C7481e0 r35) {
        /*
            r30 = this;
            r15 = r30
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r35
            boolean r0 = r15.f49184h
            if (r0 == 0) goto L_0x037f
            sun.misc.Unsafe r9 = f49176s
            r10 = -1
            r16 = 0
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r33
            r7 = r8
            r1 = r10
            r2 = r16
            r6 = r2
        L_0x001d:
            if (r0 >= r13) goto L_0x0364
            int r3 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x002f
            int r0 = com.google.android.gms.internal.vision.C7477d0.d(r0, r12, r3, r11)
            int r3 = r11.f49310a
            r4 = r0
            r17 = r3
            goto L_0x0032
        L_0x002f:
            r17 = r0
            r4 = r3
        L_0x0032:
            int r5 = r17 >>> 3
            r3 = r17 & 7
            if (r5 <= r1) goto L_0x0040
            int r2 = r2 / 3
            int r0 = r15.f(r5, r2)
        L_0x003e:
            r2 = r0
            goto L_0x0045
        L_0x0040:
            int r0 = r15.P(r5)
            goto L_0x003e
        L_0x0045:
            if (r2 != r10) goto L_0x0052
            r2 = r4
            r25 = r5
            r29 = r9
            r19 = r10
            r18 = r16
            goto L_0x0343
        L_0x0052:
            int[] r0 = r15.f49177a
            int r1 = r2 + 1
            r1 = r0[r1]
            r18 = 267386880(0xff00000, float:2.3665827E-29)
            r18 = r1 & r18
            int r10 = r18 >>> 20
            r33 = r5
            r5 = r1 & r8
            r18 = r9
            long r8 = (long) r5
            r5 = 17
            r21 = r1
            if (r10 > r5) goto L_0x0239
            int r5 = r2 + 2
            r0 = r0[r5]
            int r5 = r0 >>> 20
            r1 = 1
            int r23 = r1 << r5
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            r20 = r2
            if (r0 == r7) goto L_0x0091
            if (r7 == r5) goto L_0x0085
            long r1 = (long) r7
            r7 = r18
            r7.putInt(r14, r1, r6)
            goto L_0x0087
        L_0x0085:
            r7 = r18
        L_0x0087:
            if (r0 == r5) goto L_0x008e
            long r1 = (long) r0
            int r6 = r7.getInt(r14, r1)
        L_0x008e:
            r2 = r7
            r7 = r0
            goto L_0x0093
        L_0x0091:
            r2 = r18
        L_0x0093:
            r0 = 5
            switch(r10) {
                case 0: goto L_0x0216;
                case 1: goto L_0x01ff;
                case 2: goto L_0x01de;
                case 3: goto L_0x01de;
                case 4: goto L_0x01c7;
                case 5: goto L_0x01a9;
                case 6: goto L_0x0193;
                case 7: goto L_0x0173;
                case 8: goto L_0x0152;
                case 9: goto L_0x0128;
                case 10: goto L_0x0112;
                case 11: goto L_0x01c7;
                case 12: goto L_0x00fd;
                case 13: goto L_0x0193;
                case 14: goto L_0x01a9;
                case 15: goto L_0x00dd;
                case 16: goto L_0x00a3;
                default: goto L_0x0097;
            }
        L_0x0097:
            r25 = r33
            r26 = r5
            r10 = r20
            r5 = r4
            r20 = r7
            r7 = r2
            goto L_0x022e
        L_0x00a3:
            if (r3 != 0) goto L_0x00d0
            int r10 = com.google.android.gms.internal.vision.C7477d0.k(r12, r4, r11)
            long r0 = r11.f49311b
            long r17 = com.google.android.gms.internal.vision.C7541v0.a(r0)
            r0 = r2
            r1 = r31
            r4 = r20
            r20 = r7
            r7 = r2
            r2 = r8
            r25 = r33
            r8 = r4
            r26 = r5
            r4 = r17
            r0.putLong(r1, r2, r4)
            r6 = r6 | r23
            r9 = r7
            r2 = r8
            r0 = r10
        L_0x00c7:
            r7 = r20
            r1 = r25
            r8 = r26
            r10 = -1
            goto L_0x001d
        L_0x00d0:
            r25 = r33
            r26 = r5
            r8 = r20
            r20 = r7
            r7 = r2
            r5 = r4
            r10 = r8
            goto L_0x022e
        L_0x00dd:
            r25 = r33
            r26 = r5
            r10 = r20
            r20 = r7
            r7 = r2
            if (r3 != 0) goto L_0x00fa
            int r0 = com.google.android.gms.internal.vision.C7477d0.i(r12, r4, r11)
            int r1 = r11.f49310a
            int r1 = com.google.android.gms.internal.vision.C7541v0.d(r1)
            r7.putInt(r14, r8, r1)
        L_0x00f5:
            r6 = r6 | r23
            r9 = r7
            r2 = r10
            goto L_0x00c7
        L_0x00fa:
            r5 = r4
            goto L_0x022e
        L_0x00fd:
            r25 = r33
            r26 = r5
            r10 = r20
            r20 = r7
            r7 = r2
            if (r3 != 0) goto L_0x00fa
            int r0 = com.google.android.gms.internal.vision.C7477d0.i(r12, r4, r11)
            int r1 = r11.f49310a
            r7.putInt(r14, r8, r1)
            goto L_0x00f5
        L_0x0112:
            r25 = r33
            r26 = r5
            r10 = r20
            r0 = 2
            r20 = r7
            r7 = r2
            if (r3 != r0) goto L_0x00fa
            int r0 = com.google.android.gms.internal.vision.C7477d0.q(r12, r4, r11)
            java.lang.Object r1 = r11.f49312c
            r7.putObject(r14, r8, r1)
            goto L_0x00f5
        L_0x0128:
            r25 = r33
            r26 = r5
            r10 = r20
            r0 = 2
            r20 = r7
            r7 = r2
            if (r3 != r0) goto L_0x00fa
            com.google.android.gms.internal.vision.S1 r0 = r15.m(r10)
            int r0 = com.google.android.gms.internal.vision.C7477d0.g(r0, r12, r4, r13, r11)
            java.lang.Object r1 = r7.getObject(r14, r8)
            if (r1 != 0) goto L_0x0148
            java.lang.Object r1 = r11.f49312c
            r7.putObject(r14, r8, r1)
            goto L_0x00f5
        L_0x0148:
            java.lang.Object r2 = r11.f49312c
            java.lang.Object r1 = com.google.android.gms.internal.vision.U0.e(r1, r2)
            r7.putObject(r14, r8, r1)
            goto L_0x00f5
        L_0x0152:
            r25 = r33
            r26 = r5
            r10 = r20
            r0 = 2
            r20 = r7
            r7 = r2
            if (r3 != r0) goto L_0x00fa
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r21 & r0
            if (r0 != 0) goto L_0x0169
            int r0 = com.google.android.gms.internal.vision.C7477d0.n(r12, r4, r11)
            goto L_0x016d
        L_0x0169:
            int r0 = com.google.android.gms.internal.vision.C7477d0.p(r12, r4, r11)
        L_0x016d:
            java.lang.Object r1 = r11.f49312c
            r7.putObject(r14, r8, r1)
            goto L_0x00f5
        L_0x0173:
            r25 = r33
            r26 = r5
            r10 = r20
            r20 = r7
            r7 = r2
            if (r3 != 0) goto L_0x00fa
            int r0 = com.google.android.gms.internal.vision.C7477d0.k(r12, r4, r11)
            long r1 = r11.f49311b
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x018c
            r1 = 1
            goto L_0x018e
        L_0x018c:
            r1 = r16
        L_0x018e:
            com.google.android.gms.internal.vision.q2.k(r14, r8, r1)
            goto L_0x00f5
        L_0x0193:
            r25 = r33
            r26 = r5
            r10 = r20
            r20 = r7
            r7 = r2
            if (r3 != r0) goto L_0x00fa
            int r0 = com.google.android.gms.internal.vision.C7477d0.h(r12, r4)
            r7.putInt(r14, r8, r0)
            int r0 = r4 + 4
            goto L_0x00f5
        L_0x01a9:
            r25 = r33
            r26 = r5
            r10 = r20
            r0 = 1
            r20 = r7
            r7 = r2
            if (r3 != r0) goto L_0x00fa
            long r17 = com.google.android.gms.internal.vision.C7477d0.l(r12, r4)
            r0 = r7
            r1 = r31
            r2 = r8
            r8 = r4
            r4 = r17
            r0.putLong(r1, r2, r4)
            int r0 = r8 + 8
            goto L_0x00f5
        L_0x01c7:
            r25 = r33
            r26 = r5
            r10 = r20
            r5 = r4
            r20 = r7
            r7 = r2
            if (r3 != 0) goto L_0x022e
            int r0 = com.google.android.gms.internal.vision.C7477d0.i(r12, r5, r11)
            int r1 = r11.f49310a
            r7.putInt(r14, r8, r1)
            goto L_0x00f5
        L_0x01de:
            r25 = r33
            r26 = r5
            r10 = r20
            r5 = r4
            r20 = r7
            r7 = r2
            if (r3 != 0) goto L_0x022e
            int r17 = com.google.android.gms.internal.vision.C7477d0.k(r12, r5, r11)
            long r4 = r11.f49311b
            r0 = r7
            r1 = r31
            r2 = r8
            r0.putLong(r1, r2, r4)
            r6 = r6 | r23
            r9 = r7
            r2 = r10
            r0 = r17
            goto L_0x00c7
        L_0x01ff:
            r25 = r33
            r26 = r5
            r10 = r20
            r5 = r4
            r20 = r7
            r7 = r2
            if (r3 != r0) goto L_0x022e
            float r0 = com.google.android.gms.internal.vision.C7477d0.o(r12, r5)
            com.google.android.gms.internal.vision.q2.g(r14, r8, r0)
            int r0 = r5 + 4
            goto L_0x00f5
        L_0x0216:
            r25 = r33
            r26 = r5
            r10 = r20
            r0 = 1
            r5 = r4
            r20 = r7
            r7 = r2
            if (r3 != r0) goto L_0x022e
            double r0 = com.google.android.gms.internal.vision.C7477d0.m(r12, r5)
            com.google.android.gms.internal.vision.q2.f(r14, r8, r0)
            int r0 = r5 + 8
            goto L_0x00f5
        L_0x022e:
            r2 = r5
            r29 = r7
            r18 = r10
            r7 = r20
            r19 = -1
            goto L_0x0343
        L_0x0239:
            r25 = r33
            r5 = r4
            r20 = r7
            r7 = r18
            r26 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r2
            r0 = 27
            if (r10 != r0) goto L_0x0292
            r0 = 2
            if (r3 != r0) goto L_0x0285
            java.lang.Object r0 = r7.getObject(r14, r8)
            com.google.android.gms.internal.vision.a1 r0 = (com.google.android.gms.internal.vision.C7466a1) r0
            boolean r1 = r0.zza()
            if (r1 != 0) goto L_0x0269
            int r1 = r0.size()
            if (r1 != 0) goto L_0x0260
            r1 = 10
            goto L_0x0262
        L_0x0260:
            int r1 = r1 << 1
        L_0x0262:
            com.google.android.gms.internal.vision.a1 r0 = r0.c(r1)
            r7.putObject(r14, r8, r0)
        L_0x0269:
            r8 = r0
            com.google.android.gms.internal.vision.S1 r0 = r15.m(r4)
            r1 = r17
            r2 = r32
            r3 = r5
            r18 = r4
            r4 = r34
            r5 = r8
            r8 = r6
            r6 = r35
            int r0 = com.google.android.gms.internal.vision.C7477d0.e(r0, r1, r2, r3, r4, r5, r6)
            r9 = r7
            r6 = r8
            r2 = r18
            goto L_0x00c7
        L_0x0285:
            r18 = r4
            r15 = r5
            r27 = r6
            r29 = r7
            r28 = r20
            r19 = -1
            goto L_0x0324
        L_0x0292:
            r18 = r4
            r0 = 49
            if (r10 > r0) goto L_0x02f2
            r1 = r21
            long r1 = (long) r1
            r0 = r30
            r21 = r1
            r1 = r31
            r2 = r32
            r4 = r3
            r3 = r5
            r33 = r4
            r4 = r34
            r15 = r5
            r5 = r17
            r27 = r6
            r6 = r25
            r28 = r20
            r20 = r7
            r7 = r33
            r23 = r8
            r9 = r26
            r8 = r18
            r29 = r20
            r19 = -1
            r20 = r10
            r9 = r21
            r11 = r20
            r12 = r23
            r14 = r35
            int r0 = r0.i(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 != r15) goto L_0x02d7
        L_0x02d0:
            r2 = r0
        L_0x02d1:
            r6 = r27
            r7 = r28
            goto L_0x0343
        L_0x02d7:
            r15 = r30
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r35
            r2 = r18
            r10 = r19
            r1 = r25
            r6 = r27
            r7 = r28
        L_0x02eb:
            r9 = r29
            r8 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x001d
        L_0x02f2:
            r33 = r3
            r15 = r5
            r27 = r6
            r29 = r7
            r23 = r8
            r28 = r20
            r1 = r21
            r19 = -1
            r20 = r10
            r0 = 50
            r9 = r20
            if (r9 != r0) goto L_0x0326
            r7 = r33
            r0 = 2
            if (r7 != r0) goto L_0x0324
            r0 = r30
            r1 = r31
            r2 = r32
            r3 = r15
            r4 = r34
            r5 = r18
            r6 = r23
            r8 = r35
            int r0 = r0.j(r1, r2, r3, r4, r5, r6, r8)
            if (r0 != r15) goto L_0x02d7
            goto L_0x02d0
        L_0x0324:
            r2 = r15
            goto L_0x02d1
        L_0x0326:
            r7 = r33
            r0 = r30
            r8 = r1
            r1 = r31
            r2 = r32
            r3 = r15
            r4 = r34
            r5 = r17
            r6 = r25
            r10 = r23
            r12 = r18
            r13 = r35
            int r0 = r0.h(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 != r15) goto L_0x02d7
            goto L_0x02d0
        L_0x0343:
            com.google.android.gms.internal.vision.m2 r4 = N(r31)
            r0 = r17
            r1 = r32
            r3 = r34
            r5 = r35
            int r0 = com.google.android.gms.internal.vision.C7477d0.c(r0, r1, r2, r3, r4, r5)
            r15 = r30
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r35
            r2 = r18
            r10 = r19
            r1 = r25
            goto L_0x02eb
        L_0x0364:
            r27 = r6
            r1 = r8
            r29 = r9
            if (r7 == r1) goto L_0x0375
            long r1 = (long) r7
            r3 = r31
            r6 = r27
            r4 = r29
            r4.putInt(r3, r1, r6)
        L_0x0375:
            r4 = r34
            if (r0 != r4) goto L_0x037a
            return
        L_0x037a:
            com.google.android.gms.internal.vision.Z0 r0 = com.google.android.gms.internal.vision.Z0.e()
            throw r0
        L_0x037f:
            r4 = r13
            r3 = r14
            r5 = 0
            r0 = r30
            r1 = r31
            r2 = r32
            r3 = r33
            r4 = r34
            r6 = r35
            r0.k(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.E1.e(java.lang.Object, byte[], int, int, com.google.android.gms.internal.vision.e0):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v48, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r37v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v13, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v39, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r37v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v26, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r37v24, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r37v25, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r37v26, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r37v27, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r37v28, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r37v29, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v24, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r37v30, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r37v31, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v25, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r37v32, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r37v33, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r37v34, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v26, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r37v35, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v27, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r37v36, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v28, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v24, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r37v37, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r37v38, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v27, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r37v39, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v28, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v30, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v31, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v29, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v32, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v30, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v31, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r37v40, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v53, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v31, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v32, resolved type: byte} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x02a0, code lost:
        r2 = r5;
        r18 = r8;
        r31 = r9;
        r23 = r10;
        r26 = r13;
        r21 = -1;
        r9 = r37;
        r8 = r39;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x034e, code lost:
        if (r0 == r15) goto L_0x0350;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x035b, code lost:
        r15 = r34;
        r14 = r35;
        r12 = r36;
        r3 = r37;
        r13 = r38;
        r11 = r40;
        r8 = r21;
        r1 = r23;
        r6 = r24;
        r2 = r26;
        r7 = r30;
        r9 = r31;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x03a6, code lost:
        if (r0 == r15) goto L_0x0350;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x04cb, code lost:
        r0 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0510, code lost:
        r2 = r2 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0523, code lost:
        r2 = r2 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x056f, code lost:
        r1 = r13.f49247b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0573, code lost:
        if (r1.f49250c == false) goto L_0x0579;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x0575, code lost:
        r15.j(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x0579, code lost:
        r1 = r22[r1.f49249b.ordinal()];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x0583, code lost:
        if (r1 == 17) goto L_0x058a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x0587, code lost:
        if (r1 == 18) goto L_0x058a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x058a, code lost:
        r1 = r15.d(r13.f49247b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x0590, code lost:
        if (r1 == null) goto L_0x0596;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x0592, code lost:
        r0 = com.google.android.gms.internal.vision.U0.e(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x0596, code lost:
        r15.g(r13.f49247b, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x059b, code lost:
        r0 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x009e, code lost:
        r13 = r2;
        r10 = r3;
        r5 = r4;
        r37 = r18;
        r8 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00df, code lost:
        r6 = r6 | r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00e1, code lost:
        r1 = r8;
        r3 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00e3, code lost:
        r2 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0109, code lost:
        r5 = r4;
        r37 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x010f, code lost:
        r10 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0110, code lost:
        r8 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0199, code lost:
        r2 = r13;
        r13 = r1;
        r1 = r8;
        r8 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01ca, code lost:
        r6 = r6 | r24;
        r3 = r37;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01cf, code lost:
        r5 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0231, code lost:
        r6 = r6 | r24;
        r3 = r37;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0235, code lost:
        r1 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0252, code lost:
        r5 = r8;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int k(T r35, byte[] r36, int r37, int r38, int r39, com.google.android.gms.internal.vision.C7481e0 r40) {
        /*
            r34 = this;
            r15 = r34
            r14 = r35
            r12 = r36
            r13 = r38
            r11 = r40
            sun.misc.Unsafe r9 = f49176s
            r16 = 0
            r8 = -1
            r0 = r37
            r1 = r8
            r2 = r16
            r3 = r2
            r6 = r3
            r7 = 1048575(0xfffff, float:1.469367E-39)
        L_0x0019:
            r17 = 0
            if (r0 >= r13) goto L_0x05f3
            int r3 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x002c
            int r0 = com.google.android.gms.internal.vision.C7477d0.d(r0, r12, r3, r11)
            int r3 = r11.f49310a
            r4 = r0
            r5 = r3
            goto L_0x002e
        L_0x002c:
            r5 = r0
            r4 = r3
        L_0x002e:
            int r3 = r5 >>> 3
            r0 = r5 & 7
            r10 = 3
            if (r3 <= r1) goto L_0x003c
            int r2 = r2 / r10
            int r1 = r15.f(r3, r2)
        L_0x003a:
            r2 = r1
            goto L_0x0041
        L_0x003c:
            int r1 = r15.P(r3)
            goto L_0x003a
        L_0x0041:
            r19 = 0
            if (r2 != r8) goto L_0x0055
            r23 = r3
            r2 = r4
            r21 = r8
            r31 = r9
            r26 = r16
            r18 = 1
            r8 = r39
            r9 = r5
            goto L_0x03cc
        L_0x0055:
            int[] r8 = r15.f49177a
            int r22 = r2 + 1
            r10 = r8[r22]
            r22 = 267386880(0xff00000, float:2.3665827E-29)
            r22 = r10 & r22
            int r1 = r22 >>> 20
            r18 = r5
            r13 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r10 & r13
            long r13 = (long) r5
            r5 = 17
            if (r1 > r5) goto L_0x02b1
            int r24 = r2 + 2
            r8 = r8[r24]
            int r24 = r8 >>> 20
            r23 = 1
            int r24 = r23 << r24
            r26 = r13
            r13 = 1048575(0xfffff, float:1.469367E-39)
            r8 = r8 & r13
            if (r8 == r7) goto L_0x0096
            if (r7 == r13) goto L_0x008a
            long r13 = (long) r7
            r7 = r35
            r28 = r26
            r9.putInt(r7, r13, r6)
            goto L_0x008e
        L_0x008a:
            r7 = r35
            r28 = r26
        L_0x008e:
            long r13 = (long) r8
            int r6 = r9.getInt(r7, r13)
            r14 = r7
            r7 = r8
            goto L_0x009a
        L_0x0096:
            r14 = r35
            r28 = r26
        L_0x009a:
            r8 = 5
            switch(r1) {
                case 0: goto L_0x0289;
                case 1: goto L_0x0273;
                case 2: goto L_0x0255;
                case 3: goto L_0x0255;
                case 4: goto L_0x023c;
                case 5: goto L_0x0214;
                case 6: goto L_0x01f1;
                case 7: goto L_0x01d2;
                case 8: goto L_0x01a9;
                case 9: goto L_0x0169;
                case 10: goto L_0x0155;
                case 11: goto L_0x023c;
                case 12: goto L_0x0129;
                case 13: goto L_0x01f1;
                case 14: goto L_0x0214;
                case 15: goto L_0x0113;
                case 16: goto L_0x00e9;
                case 17: goto L_0x00a9;
                default: goto L_0x009e;
            }
        L_0x009e:
            r13 = r2
            r10 = r3
            r5 = r4
            r37 = r18
            r8 = 1
            r18 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x02a0
        L_0x00a9:
            r1 = 3
            if (r0 != r1) goto L_0x009e
            int r0 = r3 << 3
            r5 = r0 | 4
            com.google.android.gms.internal.vision.S1 r0 = r15.m(r2)
            r1 = r36
            r13 = r2
            r2 = r4
            r8 = r3
            r3 = r38
            r4 = r5
            r10 = r18
            r5 = r40
            int r0 = com.google.android.gms.internal.vision.C7477d0.f(r0, r1, r2, r3, r4, r5)
            r1 = r6 & r24
            if (r1 != 0) goto L_0x00d0
            java.lang.Object r1 = r11.f49312c
            r2 = r28
            r9.putObject(r14, r2, r1)
            goto L_0x00df
        L_0x00d0:
            r2 = r28
            java.lang.Object r1 = r9.getObject(r14, r2)
            java.lang.Object r4 = r11.f49312c
            java.lang.Object r1 = com.google.android.gms.internal.vision.U0.e(r1, r4)
            r9.putObject(r14, r2, r1)
        L_0x00df:
            r6 = r6 | r24
        L_0x00e1:
            r1 = r8
            r3 = r10
        L_0x00e3:
            r2 = r13
        L_0x00e4:
            r8 = -1
            r13 = r38
            goto L_0x0019
        L_0x00e9:
            r13 = r2
            r8 = r3
            r10 = r18
            r2 = r28
            if (r0 != 0) goto L_0x0109
            int r17 = com.google.android.gms.internal.vision.C7477d0.k(r12, r4, r11)
            long r0 = r11.f49311b
            long r4 = com.google.android.gms.internal.vision.C7541v0.a(r0)
            r0 = r9
            r1 = r35
            r0.putLong(r1, r2, r4)
            r6 = r6 | r24
            r1 = r8
            r3 = r10
            r2 = r13
            r0 = r17
            goto L_0x00e4
        L_0x0109:
            r5 = r4
            r37 = r10
            r18 = 1048575(0xfffff, float:1.469367E-39)
        L_0x010f:
            r10 = r8
        L_0x0110:
            r8 = 1
            goto L_0x02a0
        L_0x0113:
            r13 = r2
            r8 = r3
            r10 = r18
            r2 = r28
            if (r0 != 0) goto L_0x0109
            int r0 = com.google.android.gms.internal.vision.C7477d0.i(r12, r4, r11)
            int r1 = r11.f49310a
            int r1 = com.google.android.gms.internal.vision.C7541v0.d(r1)
            r9.putInt(r14, r2, r1)
            goto L_0x00df
        L_0x0129:
            r13 = r2
            r8 = r3
            r10 = r18
            r2 = r28
            if (r0 != 0) goto L_0x0109
            int r0 = com.google.android.gms.internal.vision.C7477d0.i(r12, r4, r11)
            int r1 = r11.f49310a
            com.google.android.gms.internal.vision.V0 r4 = r15.H(r13)
            if (r4 == 0) goto L_0x0151
            boolean r4 = r4.c(r1)
            if (r4 == 0) goto L_0x0144
            goto L_0x0151
        L_0x0144:
            com.google.android.gms.internal.vision.m2 r2 = N(r35)
            long r3 = (long) r1
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r2.c(r10, r1)
            goto L_0x00e1
        L_0x0151:
            r9.putInt(r14, r2, r1)
            goto L_0x00df
        L_0x0155:
            r13 = r2
            r8 = r3
            r10 = r18
            r2 = r28
            r1 = 2
            if (r0 != r1) goto L_0x0109
            int r0 = com.google.android.gms.internal.vision.C7477d0.q(r12, r4, r11)
            java.lang.Object r1 = r11.f49312c
            r9.putObject(r14, r2, r1)
            goto L_0x00df
        L_0x0169:
            r13 = r2
            r8 = r3
            r10 = r18
            r2 = r28
            r1 = 2
            if (r0 != r1) goto L_0x019f
            com.google.android.gms.internal.vision.S1 r0 = r15.m(r13)
            r1 = r38
            r18 = 1048575(0xfffff, float:1.469367E-39)
            int r0 = com.google.android.gms.internal.vision.C7477d0.g(r0, r12, r4, r1, r11)
            r4 = r6 & r24
            if (r4 != 0) goto L_0x0189
            java.lang.Object r4 = r11.f49312c
            r9.putObject(r14, r2, r4)
            goto L_0x0196
        L_0x0189:
            java.lang.Object r4 = r9.getObject(r14, r2)
            java.lang.Object r5 = r11.f49312c
            java.lang.Object r4 = com.google.android.gms.internal.vision.U0.e(r4, r5)
            r9.putObject(r14, r2, r4)
        L_0x0196:
            r6 = r6 | r24
            r3 = r10
        L_0x0199:
            r2 = r13
            r13 = r1
            r1 = r8
            r8 = -1
            goto L_0x0019
        L_0x019f:
            r1 = r38
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r4
            r37 = r10
            goto L_0x010f
        L_0x01a9:
            r1 = r38
            r13 = r2
            r8 = r3
            r37 = r18
            r2 = r28
            r5 = 2
            r18 = 1048575(0xfffff, float:1.469367E-39)
            if (r0 != r5) goto L_0x01cf
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r0 & r10
            if (r0 != 0) goto L_0x01c1
            int r0 = com.google.android.gms.internal.vision.C7477d0.n(r12, r4, r11)
            goto L_0x01c5
        L_0x01c1:
            int r0 = com.google.android.gms.internal.vision.C7477d0.p(r12, r4, r11)
        L_0x01c5:
            java.lang.Object r4 = r11.f49312c
            r9.putObject(r14, r2, r4)
        L_0x01ca:
            r6 = r6 | r24
            r3 = r37
            goto L_0x0199
        L_0x01cf:
            r5 = r4
            goto L_0x010f
        L_0x01d2:
            r1 = r38
            r13 = r2
            r8 = r3
            r37 = r18
            r2 = r28
            r18 = 1048575(0xfffff, float:1.469367E-39)
            if (r0 != 0) goto L_0x01cf
            int r0 = com.google.android.gms.internal.vision.C7477d0.k(r12, r4, r11)
            long r4 = r11.f49311b
            int r4 = (r4 > r19 ? 1 : (r4 == r19 ? 0 : -1))
            if (r4 == 0) goto L_0x01eb
            r10 = 1
            goto L_0x01ed
        L_0x01eb:
            r10 = r16
        L_0x01ed:
            com.google.android.gms.internal.vision.q2.k(r14, r2, r10)
            goto L_0x01ca
        L_0x01f1:
            r1 = r38
            r13 = r2
            r10 = r3
            r37 = r18
            r2 = r28
            r18 = 1048575(0xfffff, float:1.469367E-39)
            if (r0 != r8) goto L_0x0211
            int r0 = com.google.android.gms.internal.vision.C7477d0.h(r12, r4)
            r9.putInt(r14, r2, r0)
            int r0 = r4 + 4
            r6 = r6 | r24
            r3 = r37
            r2 = r13
            r8 = -1
            r13 = r1
            r1 = r10
            goto L_0x0019
        L_0x0211:
            r5 = r4
            goto L_0x0110
        L_0x0214:
            r1 = r38
            r13 = r2
            r10 = r3
            r37 = r18
            r2 = r28
            r5 = 1
            r18 = 1048575(0xfffff, float:1.469367E-39)
            if (r0 != r5) goto L_0x0238
            long r19 = com.google.android.gms.internal.vision.C7477d0.l(r12, r4)
            r0 = r9
            r1 = r35
            r8 = r4
            r4 = r19
            r0.putLong(r1, r2, r4)
            int r0 = r8 + 8
        L_0x0231:
            r6 = r6 | r24
            r3 = r37
        L_0x0235:
            r1 = r10
            goto L_0x00e3
        L_0x0238:
            r8 = r5
            r5 = r4
            goto L_0x02a0
        L_0x023c:
            r13 = r2
            r10 = r3
            r8 = r4
            r37 = r18
            r2 = r28
            r18 = 1048575(0xfffff, float:1.469367E-39)
            if (r0 != 0) goto L_0x0252
            int r0 = com.google.android.gms.internal.vision.C7477d0.i(r12, r8, r11)
            int r1 = r11.f49310a
            r9.putInt(r14, r2, r1)
            goto L_0x0231
        L_0x0252:
            r5 = r8
            goto L_0x0110
        L_0x0255:
            r13 = r2
            r10 = r3
            r8 = r4
            r37 = r18
            r2 = r28
            r18 = 1048575(0xfffff, float:1.469367E-39)
            if (r0 != 0) goto L_0x0252
            int r8 = com.google.android.gms.internal.vision.C7477d0.k(r12, r8, r11)
            long r4 = r11.f49311b
            r0 = r9
            r1 = r35
            r0.putLong(r1, r2, r4)
            r6 = r6 | r24
            r3 = r37
            r0 = r8
            goto L_0x0235
        L_0x0273:
            r13 = r2
            r10 = r3
            r5 = r4
            r37 = r18
            r2 = r28
            r18 = 1048575(0xfffff, float:1.469367E-39)
            if (r0 != r8) goto L_0x0110
            float r0 = com.google.android.gms.internal.vision.C7477d0.o(r12, r5)
            com.google.android.gms.internal.vision.q2.g(r14, r2, r0)
            int r0 = r5 + 4
            goto L_0x0231
        L_0x0289:
            r13 = r2
            r10 = r3
            r5 = r4
            r37 = r18
            r2 = r28
            r8 = 1
            r18 = 1048575(0xfffff, float:1.469367E-39)
            if (r0 != r8) goto L_0x02a0
            double r0 = com.google.android.gms.internal.vision.C7477d0.m(r12, r5)
            com.google.android.gms.internal.vision.q2.f(r14, r2, r0)
            int r0 = r5 + 8
            goto L_0x0231
        L_0x02a0:
            r2 = r5
            r18 = r8
            r31 = r9
            r23 = r10
            r26 = r13
            r21 = -1
            r9 = r37
            r8 = r39
            goto L_0x03cc
        L_0x02b1:
            r5 = r4
            r37 = r18
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r3
            r32 = r13
            r14 = r35
            r13 = r2
            r2 = r32
            r8 = 27
            if (r1 != r8) goto L_0x0313
            r8 = 2
            if (r0 != r8) goto L_0x0302
            java.lang.Object r0 = r9.getObject(r14, r2)
            com.google.android.gms.internal.vision.a1 r0 = (com.google.android.gms.internal.vision.C7466a1) r0
            boolean r1 = r0.zza()
            if (r1 != 0) goto L_0x02e4
            int r1 = r0.size()
            if (r1 != 0) goto L_0x02db
            r1 = 10
            goto L_0x02dd
        L_0x02db:
            int r1 = r1 << 1
        L_0x02dd:
            com.google.android.gms.internal.vision.a1 r0 = r0.c(r1)
            r9.putObject(r14, r2, r0)
        L_0x02e4:
            r8 = r0
            com.google.android.gms.internal.vision.S1 r0 = r15.m(r13)
            r1 = r37
            r2 = r36
            r3 = r5
            r10 = r4
            r4 = r38
            r5 = r8
            r24 = r6
            r6 = r40
            int r0 = com.google.android.gms.internal.vision.C7477d0.e(r0, r1, r2, r3, r4, r5, r6)
            r3 = r37
            r1 = r10
            r2 = r13
            r6 = r24
            goto L_0x00e4
        L_0x0302:
            r24 = r6
            r23 = r4
            r15 = r5
            r30 = r7
            r31 = r9
            r26 = r13
            r18 = 1
            r21 = -1
            goto L_0x03a9
        L_0x0313:
            r8 = r4
            r24 = r6
            r4 = 49
            if (r1 > r4) goto L_0x0375
            r26 = r9
            long r9 = (long) r10
            r6 = r0
            r0 = r34
            r22 = r1
            r4 = 17
            r1 = r35
            r27 = r2
            r2 = r36
            r3 = r5
            r4 = r38
            r15 = r5
            r5 = r37
            r29 = r6
            r6 = r8
            r30 = r7
            r7 = r29
            r23 = r8
            r21 = -1
            r25 = 1
            r8 = r13
            r18 = r25
            r31 = r26
            r11 = r22
            r26 = r13
            r12 = r27
            r14 = r40
            int r0 = r0.i(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 != r15) goto L_0x035b
        L_0x0350:
            r9 = r37
            r8 = r39
            r2 = r0
        L_0x0355:
            r6 = r24
            r7 = r30
            goto L_0x03cc
        L_0x035b:
            r15 = r34
            r14 = r35
            r12 = r36
            r3 = r37
            r13 = r38
            r11 = r40
            r8 = r21
            r1 = r23
            r6 = r24
            r2 = r26
            r7 = r30
            r9 = r31
            goto L_0x0019
        L_0x0375:
            r29 = r0
            r22 = r1
            r27 = r2
            r15 = r5
            r30 = r7
            r23 = r8
            r31 = r9
            r26 = r13
            r18 = 1
            r21 = -1
            r0 = 50
            r9 = r22
            if (r9 != r0) goto L_0x03af
            r7 = r29
            r0 = 2
            if (r7 != r0) goto L_0x03a9
            r0 = r34
            r1 = r35
            r2 = r36
            r3 = r15
            r4 = r38
            r5 = r26
            r6 = r27
            r8 = r40
            int r0 = r0.j(r1, r2, r3, r4, r5, r6, r8)
            if (r0 != r15) goto L_0x035b
            goto L_0x0350
        L_0x03a9:
            r9 = r37
            r8 = r39
            r2 = r15
            goto L_0x0355
        L_0x03af:
            r7 = r29
            r0 = r34
            r1 = r35
            r2 = r36
            r3 = r15
            r4 = r38
            r5 = r37
            r6 = r23
            r8 = r10
            r10 = r27
            r12 = r26
            r13 = r40
            int r0 = r0.h(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 != r15) goto L_0x05d5
            goto L_0x0350
        L_0x03cc:
            if (r9 != r8) goto L_0x03d0
            if (r8 != 0) goto L_0x03d3
        L_0x03d0:
            r10 = r34
            goto L_0x03e1
        L_0x03d3:
            r10 = r34
            r14 = r35
            r0 = r2
            r1 = r6
            r3 = r9
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r6 = r38
            goto L_0x0602
        L_0x03e1:
            boolean r0 = r10.f49182f
            if (r0 == 0) goto L_0x05c0
            r11 = r40
            com.google.android.gms.internal.vision.C0 r0 = r11.f49313d
            com.google.android.gms.internal.vision.C0 r1 = com.google.android.gms.internal.vision.C0.b()
            if (r0 == r1) goto L_0x05b3
            com.google.android.gms.internal.vision.A1 r0 = r10.f49181e
            com.google.android.gms.internal.vision.C0 r1 = r11.f49313d
            r12 = r23
            com.google.android.gms.internal.vision.Q0$d r13 = r1.a(r0, r12)
            if (r13 != 0) goto L_0x0416
            com.google.android.gms.internal.vision.m2 r4 = N(r35)
            r0 = r9
            r1 = r36
            r3 = r38
            r5 = r40
            int r0 = com.google.android.gms.internal.vision.C7477d0.c(r0, r1, r2, r3, r4, r5)
            r14 = r35
            r37 = r6
            r23 = r7
            r7 = r36
            r6 = r38
            goto L_0x059c
        L_0x0416:
            r14 = r35
            r0 = r14
            com.google.android.gms.internal.vision.Q0$c r0 = (com.google.android.gms.internal.vision.Q0.c) r0
            r0.x()
            com.google.android.gms.internal.vision.I0<com.google.android.gms.internal.vision.Q0$e> r15 = r0.zzc
            com.google.android.gms.internal.vision.Q0$e r0 = r13.f49247b
            boolean r1 = r0.f49250c
            com.google.android.gms.internal.vision.B2 r0 = r0.f49249b
            com.google.android.gms.internal.vision.B2 r1 = com.google.android.gms.internal.vision.B2.ENUM
            if (r0 == r1) goto L_0x05ad
            int[] r22 = com.google.android.gms.internal.vision.C7473c0.f49307a
            int r0 = r0.ordinal()
            r0 = r22[r0]
            switch(r0) {
                case 1: goto L_0x055e;
                case 2: goto L_0x054d;
                case 3: goto L_0x0539;
                case 4: goto L_0x0539;
                case 5: goto L_0x0526;
                case 6: goto L_0x0526;
                case 7: goto L_0x0513;
                case 8: goto L_0x0513;
                case 9: goto L_0x0500;
                case 10: goto L_0x0500;
                case 11: goto L_0x04e6;
                case 12: goto L_0x04cf;
                case 13: goto L_0x04b5;
                case 14: goto L_0x04ad;
                case 15: goto L_0x049d;
                case 16: goto L_0x048d;
                case 17: goto L_0x0461;
                case 18: goto L_0x0441;
                default: goto L_0x0435;
            }
        L_0x0435:
            r37 = r6
            r23 = r7
            r0 = r17
            r7 = r36
            r6 = r38
            goto L_0x056f
        L_0x0441:
            com.google.android.gms.internal.vision.N1 r0 = com.google.android.gms.internal.vision.N1.a()
            com.google.android.gms.internal.vision.A1 r1 = r13.f49246a
            java.lang.Class r1 = r1.getClass()
            com.google.android.gms.internal.vision.S1 r0 = r0.b(r1)
            r5 = r36
            r4 = r38
            int r2 = com.google.android.gms.internal.vision.C7477d0.g(r0, r5, r2, r4, r11)
            java.lang.Object r0 = r11.f49312c
            r37 = r6
            r23 = r7
            r6 = r4
            r7 = r5
            goto L_0x056f
        L_0x0461:
            r5 = r36
            r4 = r38
            int r0 = r12 << 3
            r17 = r0 | 4
            com.google.android.gms.internal.vision.N1 r0 = com.google.android.gms.internal.vision.N1.a()
            com.google.android.gms.internal.vision.A1 r1 = r13.f49246a
            java.lang.Class r1 = r1.getClass()
            com.google.android.gms.internal.vision.S1 r0 = r0.b(r1)
            r1 = r36
            r3 = r38
            r37 = r6
            r6 = r4
            r4 = r17
            r23 = r7
            r7 = r5
            r5 = r40
            int r2 = com.google.android.gms.internal.vision.C7477d0.f(r0, r1, r2, r3, r4, r5)
            java.lang.Object r0 = r11.f49312c
            goto L_0x056f
        L_0x048d:
            r37 = r6
            r23 = r7
            r7 = r36
            r6 = r38
            int r2 = com.google.android.gms.internal.vision.C7477d0.n(r7, r2, r11)
            java.lang.Object r0 = r11.f49312c
            goto L_0x056f
        L_0x049d:
            r37 = r6
            r23 = r7
            r7 = r36
            r6 = r38
            int r2 = com.google.android.gms.internal.vision.C7477d0.q(r7, r2, r11)
            java.lang.Object r0 = r11.f49312c
            goto L_0x056f
        L_0x04ad:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Shouldn't reach here."
            r0.<init>(r1)
            throw r0
        L_0x04b5:
            r37 = r6
            r23 = r7
            r7 = r36
            r6 = r38
            int r2 = com.google.android.gms.internal.vision.C7477d0.k(r7, r2, r11)
            long r0 = r11.f49311b
            long r0 = com.google.android.gms.internal.vision.C7541v0.a(r0)
            java.lang.Long r17 = java.lang.Long.valueOf(r0)
        L_0x04cb:
            r0 = r17
            goto L_0x056f
        L_0x04cf:
            r37 = r6
            r23 = r7
            r7 = r36
            r6 = r38
            int r2 = com.google.android.gms.internal.vision.C7477d0.i(r7, r2, r11)
            int r0 = r11.f49310a
            int r0 = com.google.android.gms.internal.vision.C7541v0.d(r0)
            java.lang.Integer r17 = java.lang.Integer.valueOf(r0)
            goto L_0x04cb
        L_0x04e6:
            r37 = r6
            r23 = r7
            r7 = r36
            r6 = r38
            int r2 = com.google.android.gms.internal.vision.C7477d0.k(r7, r2, r11)
            long r0 = r11.f49311b
            int r0 = (r0 > r19 ? 1 : (r0 == r19 ? 0 : -1))
            if (r0 == 0) goto L_0x04f9
            goto L_0x04fb
        L_0x04f9:
            r18 = r16
        L_0x04fb:
            java.lang.Boolean r17 = java.lang.Boolean.valueOf(r18)
            goto L_0x04cb
        L_0x0500:
            r37 = r6
            r23 = r7
            r7 = r36
            r6 = r38
            int r0 = com.google.android.gms.internal.vision.C7477d0.h(r7, r2)
            java.lang.Integer r17 = java.lang.Integer.valueOf(r0)
        L_0x0510:
            int r2 = r2 + 4
            goto L_0x04cb
        L_0x0513:
            r37 = r6
            r23 = r7
            r7 = r36
            r6 = r38
            long r0 = com.google.android.gms.internal.vision.C7477d0.l(r7, r2)
            java.lang.Long r17 = java.lang.Long.valueOf(r0)
        L_0x0523:
            int r2 = r2 + 8
            goto L_0x04cb
        L_0x0526:
            r37 = r6
            r23 = r7
            r7 = r36
            r6 = r38
            int r2 = com.google.android.gms.internal.vision.C7477d0.i(r7, r2, r11)
            int r0 = r11.f49310a
            java.lang.Integer r17 = java.lang.Integer.valueOf(r0)
            goto L_0x04cb
        L_0x0539:
            r37 = r6
            r23 = r7
            r7 = r36
            r6 = r38
            int r2 = com.google.android.gms.internal.vision.C7477d0.k(r7, r2, r11)
            long r0 = r11.f49311b
            java.lang.Long r17 = java.lang.Long.valueOf(r0)
            goto L_0x04cb
        L_0x054d:
            r37 = r6
            r23 = r7
            r7 = r36
            r6 = r38
            float r0 = com.google.android.gms.internal.vision.C7477d0.o(r7, r2)
            java.lang.Float r17 = java.lang.Float.valueOf(r0)
            goto L_0x0510
        L_0x055e:
            r37 = r6
            r23 = r7
            r7 = r36
            r6 = r38
            double r0 = com.google.android.gms.internal.vision.C7477d0.m(r7, r2)
            java.lang.Double r17 = java.lang.Double.valueOf(r0)
            goto L_0x0523
        L_0x056f:
            com.google.android.gms.internal.vision.Q0$e r1 = r13.f49247b
            boolean r3 = r1.f49250c
            if (r3 == 0) goto L_0x0579
            r15.j(r1, r0)
            goto L_0x059b
        L_0x0579:
            com.google.android.gms.internal.vision.B2 r1 = r1.f49249b
            int r1 = r1.ordinal()
            r1 = r22[r1]
            r3 = 17
            if (r1 == r3) goto L_0x058a
            r3 = 18
            if (r1 == r3) goto L_0x058a
            goto L_0x0596
        L_0x058a:
            com.google.android.gms.internal.vision.Q0$e r1 = r13.f49247b
            java.lang.Object r1 = r15.d(r1)
            if (r1 == 0) goto L_0x0596
            java.lang.Object r0 = com.google.android.gms.internal.vision.U0.e(r1, r0)
        L_0x0596:
            com.google.android.gms.internal.vision.Q0$e r1 = r13.f49247b
            r15.g(r1, r0)
        L_0x059b:
            r0 = r2
        L_0x059c:
            r13 = r6
            r3 = r9
            r15 = r10
            r1 = r12
            r8 = r21
            r2 = r26
            r9 = r31
            r6 = r37
            r12 = r7
            r7 = r23
            goto L_0x0019
        L_0x05ad:
            r7 = r36
            com.google.android.gms.internal.vision.C7477d0.i(r7, r2, r11)
            throw r17
        L_0x05b3:
            r14 = r35
        L_0x05b5:
            r37 = r6
            r12 = r23
            r6 = r38
            r23 = r7
            r7 = r36
            goto L_0x05c5
        L_0x05c0:
            r14 = r35
            r11 = r40
            goto L_0x05b5
        L_0x05c5:
            com.google.android.gms.internal.vision.m2 r4 = N(r35)
            r0 = r9
            r1 = r36
            r3 = r38
            r5 = r40
            int r0 = com.google.android.gms.internal.vision.C7477d0.c(r0, r1, r2, r3, r4, r5)
            goto L_0x059c
        L_0x05d5:
            r9 = r37
            r8 = r39
            r12 = r23
            r15 = r34
            r14 = r35
            r13 = r38
            r11 = r40
            r3 = r9
            r1 = r12
            r8 = r21
            r6 = r24
            r2 = r26
            r7 = r30
            r9 = r31
            r12 = r36
            goto L_0x0019
        L_0x05f3:
            r8 = r39
            r24 = r6
            r30 = r7
            r31 = r9
            r6 = r13
            r10 = r15
            r1 = r24
            r2 = 1048575(0xfffff, float:1.469367E-39)
        L_0x0602:
            if (r7 == r2) goto L_0x060a
            long r4 = (long) r7
            r2 = r31
            r2.putInt(r14, r4, r1)
        L_0x060a:
            int r1 = r10.f49187k
            r2 = r17
        L_0x060e:
            int r4 = r10.f49188l
            if (r1 >= r4) goto L_0x0621
            int[] r4 = r10.f49186j
            r4 = r4[r1]
            com.google.android.gms.internal.vision.j2<?, ?> r5 = r10.f49191o
            java.lang.Object r2 = r10.o(r14, r4, r2, r5)
            com.google.android.gms.internal.vision.m2 r2 = (com.google.android.gms.internal.vision.C7515m2) r2
            int r1 = r1 + 1
            goto L_0x060e
        L_0x0621:
            if (r2 == 0) goto L_0x0628
            com.google.android.gms.internal.vision.j2<?, ?> r1 = r10.f49191o
            r1.h(r14, r2)
        L_0x0628:
            if (r8 != 0) goto L_0x0632
            if (r0 != r6) goto L_0x062d
            goto L_0x0636
        L_0x062d:
            com.google.android.gms.internal.vision.Z0 r0 = com.google.android.gms.internal.vision.Z0.e()
            throw r0
        L_0x0632:
            if (r0 > r6) goto L_0x0637
            if (r3 != r8) goto L_0x0637
        L_0x0636:
            return r0
        L_0x0637:
            com.google.android.gms.internal.vision.Z0 r0 = com.google.android.gms.internal.vision.Z0.e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.E1.k(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.vision.e0):int");
    }

    public final T zza() {
        return this.f49189m.zza(this.f49181e);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x04d5, code lost:
        r8 = false;
        r10 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x04d9, code lost:
        r13 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x0513, code lost:
        r4 = r4 + r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x061b, code lost:
        r8 = (r8 + r9) + r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x0743, code lost:
        r4 = r4 + r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x0744, code lost:
        r8 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:369:0x08da, code lost:
        r4 = r4 + r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:370:0x08db, code lost:
        r8 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:388:0x0932, code lost:
        r3 = r3 + 3;
        r6 = r8;
        r11 = r10;
        r9 = r13;
        r7 = 1048575;
        r8 = 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zzb(T r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            boolean r2 = r0.f49184h
            r3 = 267386880(0xff00000, float:2.3665827E-29)
            r6 = 0
            r7 = 1048575(0xfffff, float:1.469367E-39)
            r8 = 1
            r9 = 0
            r11 = 0
            if (r2 == 0) goto L_0x0488
            sun.misc.Unsafe r2 = f49176s
            r12 = r11
            r13 = r12
        L_0x0016:
            int[] r14 = r0.f49177a
            int r14 = r14.length
            if (r12 >= r14) goto L_0x0480
            int r14 = r0.J(r12)
            r15 = r14 & r3
            int r15 = r15 >>> 20
            int[] r3 = r0.f49177a
            r3 = r3[r12]
            r14 = r14 & r7
            long r4 = (long) r14
            com.google.android.gms.internal.vision.J0 r14 = com.google.android.gms.internal.vision.J0.DOUBLE_LIST_PACKED
            int r14 = r14.zza()
            if (r15 < r14) goto L_0x003f
            com.google.android.gms.internal.vision.J0 r14 = com.google.android.gms.internal.vision.J0.SINT64_LIST_PACKED
            int r14 = r14.zza()
            if (r15 > r14) goto L_0x003f
            int[] r14 = r0.f49177a
            int r17 = r12 + 2
            r14 = r14[r17]
        L_0x003f:
            switch(r15) {
                case 0: goto L_0x046c;
                case 1: goto L_0x0460;
                case 2: goto L_0x0450;
                case 3: goto L_0x0440;
                case 4: goto L_0x0430;
                case 5: goto L_0x0424;
                case 6: goto L_0x0418;
                case 7: goto L_0x040c;
                case 8: goto L_0x03ee;
                case 9: goto L_0x03da;
                case 10: goto L_0x03c8;
                case 11: goto L_0x03b8;
                case 12: goto L_0x03a8;
                case 13: goto L_0x039c;
                case 14: goto L_0x0390;
                case 15: goto L_0x0380;
                case 16: goto L_0x0370;
                case 17: goto L_0x035a;
                case 18: goto L_0x0350;
                case 19: goto L_0x0346;
                case 20: goto L_0x033c;
                case 21: goto L_0x0332;
                case 22: goto L_0x0328;
                case 23: goto L_0x031e;
                case 24: goto L_0x0314;
                case 25: goto L_0x030a;
                case 26: goto L_0x0300;
                case 27: goto L_0x02f2;
                case 28: goto L_0x02e8;
                case 29: goto L_0x02de;
                case 30: goto L_0x02d4;
                case 31: goto L_0x02ca;
                case 32: goto L_0x02c0;
                case 33: goto L_0x02b6;
                case 34: goto L_0x02ac;
                case 35: goto L_0x0296;
                case 36: goto L_0x0280;
                case 37: goto L_0x026a;
                case 38: goto L_0x0254;
                case 39: goto L_0x023e;
                case 40: goto L_0x0228;
                case 41: goto L_0x0212;
                case 42: goto L_0x01fc;
                case 43: goto L_0x01e7;
                case 44: goto L_0x01d2;
                case 45: goto L_0x01bd;
                case 46: goto L_0x01a8;
                case 47: goto L_0x0193;
                case 48: goto L_0x017b;
                case 49: goto L_0x016d;
                case 50: goto L_0x015d;
                case 51: goto L_0x014f;
                case 52: goto L_0x0143;
                case 53: goto L_0x0133;
                case 54: goto L_0x0123;
                case 55: goto L_0x0113;
                case 56: goto L_0x0107;
                case 57: goto L_0x00fb;
                case 58: goto L_0x00ef;
                case 59: goto L_0x00d1;
                case 60: goto L_0x00be;
                case 61: goto L_0x00ad;
                case 62: goto L_0x009e;
                case 63: goto L_0x008f;
                case 64: goto L_0x0084;
                case 65: goto L_0x0079;
                case 66: goto L_0x006a;
                case 67: goto L_0x005b;
                case 68: goto L_0x0044;
                default: goto L_0x0042;
            }
        L_0x0042:
            goto L_0x047a
        L_0x0044:
            boolean r14 = r0.w(r1, r3, r12)
            if (r14 == 0) goto L_0x047a
            java.lang.Object r4 = com.google.android.gms.internal.vision.q2.F(r1, r4)
            com.google.android.gms.internal.vision.A1 r4 = (com.google.android.gms.internal.vision.A1) r4
            com.google.android.gms.internal.vision.S1 r5 = r0.m(r12)
            int r3 = com.google.android.gms.internal.vision.C7547x0.U(r3, r4, r5)
        L_0x0058:
            int r13 = r13 + r3
            goto L_0x047a
        L_0x005b:
            boolean r14 = r0.w(r1, r3, r12)
            if (r14 == 0) goto L_0x047a
            long r4 = M(r1, r4)
            int r3 = com.google.android.gms.internal.vision.C7547x0.m0(r3, r4)
            goto L_0x0058
        L_0x006a:
            boolean r14 = r0.w(r1, r3, r12)
            if (r14 == 0) goto L_0x047a
            int r4 = K(r1, r4)
            int r3 = com.google.android.gms.internal.vision.C7547x0.t0(r3, r4)
            goto L_0x0058
        L_0x0079:
            boolean r4 = r0.w(r1, r3, r12)
            if (r4 == 0) goto L_0x047a
            int r3 = com.google.android.gms.internal.vision.C7547x0.u0(r3, r9)
            goto L_0x0058
        L_0x0084:
            boolean r4 = r0.w(r1, r3, r12)
            if (r4 == 0) goto L_0x047a
            int r3 = com.google.android.gms.internal.vision.C7547x0.A0(r3, r11)
            goto L_0x0058
        L_0x008f:
            boolean r14 = r0.w(r1, r3, r12)
            if (r14 == 0) goto L_0x047a
            int r4 = K(r1, r4)
            int r3 = com.google.android.gms.internal.vision.C7547x0.C0(r3, r4)
            goto L_0x0058
        L_0x009e:
            boolean r14 = r0.w(r1, r3, r12)
            if (r14 == 0) goto L_0x047a
            int r4 = K(r1, r4)
            int r3 = com.google.android.gms.internal.vision.C7547x0.p0(r3, r4)
            goto L_0x0058
        L_0x00ad:
            boolean r14 = r0.w(r1, r3, r12)
            if (r14 == 0) goto L_0x047a
            java.lang.Object r4 = com.google.android.gms.internal.vision.q2.F(r1, r4)
            com.google.android.gms.internal.vision.i0 r4 = (com.google.android.gms.internal.vision.C7497i0) r4
            int r3 = com.google.android.gms.internal.vision.C7547x0.T(r3, r4)
            goto L_0x0058
        L_0x00be:
            boolean r14 = r0.w(r1, r3, r12)
            if (r14 == 0) goto L_0x047a
            java.lang.Object r4 = com.google.android.gms.internal.vision.q2.F(r1, r4)
            com.google.android.gms.internal.vision.S1 r5 = r0.m(r12)
            int r3 = com.google.android.gms.internal.vision.T1.a(r3, r4, r5)
            goto L_0x0058
        L_0x00d1:
            boolean r14 = r0.w(r1, r3, r12)
            if (r14 == 0) goto L_0x047a
            java.lang.Object r4 = com.google.android.gms.internal.vision.q2.F(r1, r4)
            boolean r5 = r4 instanceof com.google.android.gms.internal.vision.C7497i0
            if (r5 == 0) goto L_0x00e7
            com.google.android.gms.internal.vision.i0 r4 = (com.google.android.gms.internal.vision.C7497i0) r4
            int r3 = com.google.android.gms.internal.vision.C7547x0.T(r3, r4)
            goto L_0x0058
        L_0x00e7:
            java.lang.String r4 = (java.lang.String) r4
            int r3 = com.google.android.gms.internal.vision.C7547x0.G(r3, r4)
            goto L_0x0058
        L_0x00ef:
            boolean r4 = r0.w(r1, r3, r12)
            if (r4 == 0) goto L_0x047a
            int r3 = com.google.android.gms.internal.vision.C7547x0.H(r3, r8)
            goto L_0x0058
        L_0x00fb:
            boolean r4 = r0.w(r1, r3, r12)
            if (r4 == 0) goto L_0x047a
            int r3 = com.google.android.gms.internal.vision.C7547x0.x0(r3, r11)
            goto L_0x0058
        L_0x0107:
            boolean r4 = r0.w(r1, r3, r12)
            if (r4 == 0) goto L_0x047a
            int r3 = com.google.android.gms.internal.vision.C7547x0.q0(r3, r9)
            goto L_0x0058
        L_0x0113:
            boolean r14 = r0.w(r1, r3, r12)
            if (r14 == 0) goto L_0x047a
            int r4 = K(r1, r4)
            int r3 = com.google.android.gms.internal.vision.C7547x0.l0(r3, r4)
            goto L_0x0058
        L_0x0123:
            boolean r14 = r0.w(r1, r3, r12)
            if (r14 == 0) goto L_0x047a
            long r4 = M(r1, r4)
            int r3 = com.google.android.gms.internal.vision.C7547x0.h0(r3, r4)
            goto L_0x0058
        L_0x0133:
            boolean r14 = r0.w(r1, r3, r12)
            if (r14 == 0) goto L_0x047a
            long r4 = M(r1, r4)
            int r3 = com.google.android.gms.internal.vision.C7547x0.b0(r3, r4)
            goto L_0x0058
        L_0x0143:
            boolean r4 = r0.w(r1, r3, r12)
            if (r4 == 0) goto L_0x047a
            int r3 = com.google.android.gms.internal.vision.C7547x0.C(r3, r6)
            goto L_0x0058
        L_0x014f:
            boolean r4 = r0.w(r1, r3, r12)
            if (r4 == 0) goto L_0x047a
            r4 = 0
            int r3 = com.google.android.gms.internal.vision.C7547x0.B(r3, r4)
            goto L_0x0058
        L_0x015d:
            com.google.android.gms.internal.vision.x1 r14 = r0.f49193q
            java.lang.Object r4 = com.google.android.gms.internal.vision.q2.F(r1, r4)
            java.lang.Object r5 = r0.B(r12)
            int r3 = r14.e(r3, r4, r5)
            goto L_0x0058
        L_0x016d:
            java.util.List r4 = q(r1, r4)
            com.google.android.gms.internal.vision.S1 r5 = r0.m(r12)
            int r3 = com.google.android.gms.internal.vision.T1.s(r3, r4, r5)
            goto L_0x0058
        L_0x017b:
            java.lang.Object r4 = r2.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.vision.T1.A(r4)
            if (r4 <= 0) goto L_0x047a
            int r3 = com.google.android.gms.internal.vision.C7547x0.g0(r3)
            int r5 = com.google.android.gms.internal.vision.C7547x0.o0(r4)
        L_0x018f:
            int r3 = r3 + r5
            int r3 = r3 + r4
            goto L_0x0058
        L_0x0193:
            java.lang.Object r4 = r2.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.vision.T1.P(r4)
            if (r4 <= 0) goto L_0x047a
            int r3 = com.google.android.gms.internal.vision.C7547x0.g0(r3)
            int r5 = com.google.android.gms.internal.vision.C7547x0.o0(r4)
            goto L_0x018f
        L_0x01a8:
            java.lang.Object r4 = r2.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.vision.T1.V(r4)
            if (r4 <= 0) goto L_0x047a
            int r3 = com.google.android.gms.internal.vision.C7547x0.g0(r3)
            int r5 = com.google.android.gms.internal.vision.C7547x0.o0(r4)
            goto L_0x018f
        L_0x01bd:
            java.lang.Object r4 = r2.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.vision.T1.S(r4)
            if (r4 <= 0) goto L_0x047a
            int r3 = com.google.android.gms.internal.vision.C7547x0.g0(r3)
            int r5 = com.google.android.gms.internal.vision.C7547x0.o0(r4)
            goto L_0x018f
        L_0x01d2:
            java.lang.Object r4 = r2.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.vision.T1.E(r4)
            if (r4 <= 0) goto L_0x047a
            int r3 = com.google.android.gms.internal.vision.C7547x0.g0(r3)
            int r5 = com.google.android.gms.internal.vision.C7547x0.o0(r4)
            goto L_0x018f
        L_0x01e7:
            java.lang.Object r4 = r2.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.vision.T1.M(r4)
            if (r4 <= 0) goto L_0x047a
            int r3 = com.google.android.gms.internal.vision.C7547x0.g0(r3)
            int r5 = com.google.android.gms.internal.vision.C7547x0.o0(r4)
            goto L_0x018f
        L_0x01fc:
            java.lang.Object r4 = r2.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.vision.T1.Y(r4)
            if (r4 <= 0) goto L_0x047a
            int r3 = com.google.android.gms.internal.vision.C7547x0.g0(r3)
            int r5 = com.google.android.gms.internal.vision.C7547x0.o0(r4)
            goto L_0x018f
        L_0x0212:
            java.lang.Object r4 = r2.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.vision.T1.S(r4)
            if (r4 <= 0) goto L_0x047a
            int r3 = com.google.android.gms.internal.vision.C7547x0.g0(r3)
            int r5 = com.google.android.gms.internal.vision.C7547x0.o0(r4)
            goto L_0x018f
        L_0x0228:
            java.lang.Object r4 = r2.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.vision.T1.V(r4)
            if (r4 <= 0) goto L_0x047a
            int r3 = com.google.android.gms.internal.vision.C7547x0.g0(r3)
            int r5 = com.google.android.gms.internal.vision.C7547x0.o0(r4)
            goto L_0x018f
        L_0x023e:
            java.lang.Object r4 = r2.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.vision.T1.I(r4)
            if (r4 <= 0) goto L_0x047a
            int r3 = com.google.android.gms.internal.vision.C7547x0.g0(r3)
            int r5 = com.google.android.gms.internal.vision.C7547x0.o0(r4)
            goto L_0x018f
        L_0x0254:
            java.lang.Object r4 = r2.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.vision.T1.u(r4)
            if (r4 <= 0) goto L_0x047a
            int r3 = com.google.android.gms.internal.vision.C7547x0.g0(r3)
            int r5 = com.google.android.gms.internal.vision.C7547x0.o0(r4)
            goto L_0x018f
        L_0x026a:
            java.lang.Object r4 = r2.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.vision.T1.e(r4)
            if (r4 <= 0) goto L_0x047a
            int r3 = com.google.android.gms.internal.vision.C7547x0.g0(r3)
            int r5 = com.google.android.gms.internal.vision.C7547x0.o0(r4)
            goto L_0x018f
        L_0x0280:
            java.lang.Object r4 = r2.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.vision.T1.S(r4)
            if (r4 <= 0) goto L_0x047a
            int r3 = com.google.android.gms.internal.vision.C7547x0.g0(r3)
            int r5 = com.google.android.gms.internal.vision.C7547x0.o0(r4)
            goto L_0x018f
        L_0x0296:
            java.lang.Object r4 = r2.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.vision.T1.V(r4)
            if (r4 <= 0) goto L_0x047a
            int r3 = com.google.android.gms.internal.vision.C7547x0.g0(r3)
            int r5 = com.google.android.gms.internal.vision.C7547x0.o0(r4)
            goto L_0x018f
        L_0x02ac:
            java.util.List r4 = q(r1, r4)
            int r3 = com.google.android.gms.internal.vision.T1.z(r3, r4, r11)
            goto L_0x0058
        L_0x02b6:
            java.util.List r4 = q(r1, r4)
            int r3 = com.google.android.gms.internal.vision.T1.O(r3, r4, r11)
            goto L_0x0058
        L_0x02c0:
            java.util.List r4 = q(r1, r4)
            int r3 = com.google.android.gms.internal.vision.T1.U(r3, r4, r11)
            goto L_0x0058
        L_0x02ca:
            java.util.List r4 = q(r1, r4)
            int r3 = com.google.android.gms.internal.vision.T1.R(r3, r4, r11)
            goto L_0x0058
        L_0x02d4:
            java.util.List r4 = q(r1, r4)
            int r3 = com.google.android.gms.internal.vision.T1.D(r3, r4, r11)
            goto L_0x0058
        L_0x02de:
            java.util.List r4 = q(r1, r4)
            int r3 = com.google.android.gms.internal.vision.T1.L(r3, r4, r11)
            goto L_0x0058
        L_0x02e8:
            java.util.List r4 = q(r1, r4)
            int r3 = com.google.android.gms.internal.vision.T1.r(r3, r4)
            goto L_0x0058
        L_0x02f2:
            java.util.List r4 = q(r1, r4)
            com.google.android.gms.internal.vision.S1 r5 = r0.m(r12)
            int r3 = com.google.android.gms.internal.vision.T1.c(r3, r4, r5)
            goto L_0x0058
        L_0x0300:
            java.util.List r4 = q(r1, r4)
            int r3 = com.google.android.gms.internal.vision.T1.b(r3, r4)
            goto L_0x0058
        L_0x030a:
            java.util.List r4 = q(r1, r4)
            int r3 = com.google.android.gms.internal.vision.T1.X(r3, r4, r11)
            goto L_0x0058
        L_0x0314:
            java.util.List r4 = q(r1, r4)
            int r3 = com.google.android.gms.internal.vision.T1.R(r3, r4, r11)
            goto L_0x0058
        L_0x031e:
            java.util.List r4 = q(r1, r4)
            int r3 = com.google.android.gms.internal.vision.T1.U(r3, r4, r11)
            goto L_0x0058
        L_0x0328:
            java.util.List r4 = q(r1, r4)
            int r3 = com.google.android.gms.internal.vision.T1.H(r3, r4, r11)
            goto L_0x0058
        L_0x0332:
            java.util.List r4 = q(r1, r4)
            int r3 = com.google.android.gms.internal.vision.T1.t(r3, r4, r11)
            goto L_0x0058
        L_0x033c:
            java.util.List r4 = q(r1, r4)
            int r3 = com.google.android.gms.internal.vision.T1.d(r3, r4, r11)
            goto L_0x0058
        L_0x0346:
            java.util.List r4 = q(r1, r4)
            int r3 = com.google.android.gms.internal.vision.T1.R(r3, r4, r11)
            goto L_0x0058
        L_0x0350:
            java.util.List r4 = q(r1, r4)
            int r3 = com.google.android.gms.internal.vision.T1.U(r3, r4, r11)
            goto L_0x0058
        L_0x035a:
            boolean r14 = r0.v(r1, r12)
            if (r14 == 0) goto L_0x047a
            java.lang.Object r4 = com.google.android.gms.internal.vision.q2.F(r1, r4)
            com.google.android.gms.internal.vision.A1 r4 = (com.google.android.gms.internal.vision.A1) r4
            com.google.android.gms.internal.vision.S1 r5 = r0.m(r12)
            int r3 = com.google.android.gms.internal.vision.C7547x0.U(r3, r4, r5)
            goto L_0x0058
        L_0x0370:
            boolean r14 = r0.v(r1, r12)
            if (r14 == 0) goto L_0x047a
            long r4 = com.google.android.gms.internal.vision.q2.o(r1, r4)
            int r3 = com.google.android.gms.internal.vision.C7547x0.m0(r3, r4)
            goto L_0x0058
        L_0x0380:
            boolean r14 = r0.v(r1, r12)
            if (r14 == 0) goto L_0x047a
            int r4 = com.google.android.gms.internal.vision.q2.b(r1, r4)
            int r3 = com.google.android.gms.internal.vision.C7547x0.t0(r3, r4)
            goto L_0x0058
        L_0x0390:
            boolean r4 = r0.v(r1, r12)
            if (r4 == 0) goto L_0x047a
            int r3 = com.google.android.gms.internal.vision.C7547x0.u0(r3, r9)
            goto L_0x0058
        L_0x039c:
            boolean r4 = r0.v(r1, r12)
            if (r4 == 0) goto L_0x047a
            int r3 = com.google.android.gms.internal.vision.C7547x0.A0(r3, r11)
            goto L_0x0058
        L_0x03a8:
            boolean r14 = r0.v(r1, r12)
            if (r14 == 0) goto L_0x047a
            int r4 = com.google.android.gms.internal.vision.q2.b(r1, r4)
            int r3 = com.google.android.gms.internal.vision.C7547x0.C0(r3, r4)
            goto L_0x0058
        L_0x03b8:
            boolean r14 = r0.v(r1, r12)
            if (r14 == 0) goto L_0x047a
            int r4 = com.google.android.gms.internal.vision.q2.b(r1, r4)
            int r3 = com.google.android.gms.internal.vision.C7547x0.p0(r3, r4)
            goto L_0x0058
        L_0x03c8:
            boolean r14 = r0.v(r1, r12)
            if (r14 == 0) goto L_0x047a
            java.lang.Object r4 = com.google.android.gms.internal.vision.q2.F(r1, r4)
            com.google.android.gms.internal.vision.i0 r4 = (com.google.android.gms.internal.vision.C7497i0) r4
            int r3 = com.google.android.gms.internal.vision.C7547x0.T(r3, r4)
            goto L_0x0058
        L_0x03da:
            boolean r14 = r0.v(r1, r12)
            if (r14 == 0) goto L_0x047a
            java.lang.Object r4 = com.google.android.gms.internal.vision.q2.F(r1, r4)
            com.google.android.gms.internal.vision.S1 r5 = r0.m(r12)
            int r3 = com.google.android.gms.internal.vision.T1.a(r3, r4, r5)
            goto L_0x0058
        L_0x03ee:
            boolean r14 = r0.v(r1, r12)
            if (r14 == 0) goto L_0x047a
            java.lang.Object r4 = com.google.android.gms.internal.vision.q2.F(r1, r4)
            boolean r5 = r4 instanceof com.google.android.gms.internal.vision.C7497i0
            if (r5 == 0) goto L_0x0404
            com.google.android.gms.internal.vision.i0 r4 = (com.google.android.gms.internal.vision.C7497i0) r4
            int r3 = com.google.android.gms.internal.vision.C7547x0.T(r3, r4)
            goto L_0x0058
        L_0x0404:
            java.lang.String r4 = (java.lang.String) r4
            int r3 = com.google.android.gms.internal.vision.C7547x0.G(r3, r4)
            goto L_0x0058
        L_0x040c:
            boolean r4 = r0.v(r1, r12)
            if (r4 == 0) goto L_0x047a
            int r3 = com.google.android.gms.internal.vision.C7547x0.H(r3, r8)
            goto L_0x0058
        L_0x0418:
            boolean r4 = r0.v(r1, r12)
            if (r4 == 0) goto L_0x047a
            int r3 = com.google.android.gms.internal.vision.C7547x0.x0(r3, r11)
            goto L_0x0058
        L_0x0424:
            boolean r4 = r0.v(r1, r12)
            if (r4 == 0) goto L_0x047a
            int r3 = com.google.android.gms.internal.vision.C7547x0.q0(r3, r9)
            goto L_0x0058
        L_0x0430:
            boolean r14 = r0.v(r1, r12)
            if (r14 == 0) goto L_0x047a
            int r4 = com.google.android.gms.internal.vision.q2.b(r1, r4)
            int r3 = com.google.android.gms.internal.vision.C7547x0.l0(r3, r4)
            goto L_0x0058
        L_0x0440:
            boolean r14 = r0.v(r1, r12)
            if (r14 == 0) goto L_0x047a
            long r4 = com.google.android.gms.internal.vision.q2.o(r1, r4)
            int r3 = com.google.android.gms.internal.vision.C7547x0.h0(r3, r4)
            goto L_0x0058
        L_0x0450:
            boolean r14 = r0.v(r1, r12)
            if (r14 == 0) goto L_0x047a
            long r4 = com.google.android.gms.internal.vision.q2.o(r1, r4)
            int r3 = com.google.android.gms.internal.vision.C7547x0.b0(r3, r4)
            goto L_0x0058
        L_0x0460:
            boolean r4 = r0.v(r1, r12)
            if (r4 == 0) goto L_0x047a
            int r3 = com.google.android.gms.internal.vision.C7547x0.C(r3, r6)
            goto L_0x0058
        L_0x046c:
            boolean r4 = r0.v(r1, r12)
            if (r4 == 0) goto L_0x047a
            r4 = 0
            int r3 = com.google.android.gms.internal.vision.C7547x0.B(r3, r4)
            goto L_0x0058
        L_0x047a:
            int r12 = r12 + 3
            r3 = 267386880(0xff00000, float:2.3665827E-29)
            goto L_0x0016
        L_0x0480:
            com.google.android.gms.internal.vision.j2<?, ?> r2 = r0.f49191o
            int r1 = g(r2, r1)
            int r13 = r13 + r1
            return r13
        L_0x0488:
            sun.misc.Unsafe r2 = f49176s
            r5 = r7
            r3 = r11
            r4 = r3
            r12 = r4
        L_0x048e:
            int[] r13 = r0.f49177a
            int r13 = r13.length
            if (r3 >= r13) goto L_0x093d
            int r13 = r0.J(r3)
            int[] r14 = r0.f49177a
            r15 = r14[r3]
            r16 = 267386880(0xff00000, float:2.3665827E-29)
            r17 = r13 & r16
            int r6 = r17 >>> 20
            r11 = 17
            if (r6 > r11) goto L_0x04b8
            int r11 = r3 + 2
            r11 = r14[r11]
            r14 = r11 & r7
            int r11 = r11 >>> 20
            int r11 = r8 << r11
            if (r14 == r5) goto L_0x04b9
            long r8 = (long) r14
            int r12 = r2.getInt(r1, r8)
            r5 = r14
            goto L_0x04b9
        L_0x04b8:
            r11 = 0
        L_0x04b9:
            r8 = r13 & r7
            long r8 = (long) r8
            switch(r6) {
                case 0: goto L_0x0922;
                case 1: goto L_0x090f;
                case 2: goto L_0x08ff;
                case 3: goto L_0x08ef;
                case 4: goto L_0x08df;
                case 5: goto L_0x08ce;
                case 6: goto L_0x08c1;
                case 7: goto L_0x08b6;
                case 8: goto L_0x089a;
                case 9: goto L_0x0888;
                case 10: goto L_0x0878;
                case 11: goto L_0x086a;
                case 12: goto L_0x085c;
                case 13: goto L_0x0851;
                case 14: goto L_0x0845;
                case 15: goto L_0x0837;
                case 16: goto L_0x0829;
                case 17: goto L_0x0815;
                case 18: goto L_0x0808;
                case 19: goto L_0x07fb;
                case 20: goto L_0x07ee;
                case 21: goto L_0x07e1;
                case 22: goto L_0x07d4;
                case 23: goto L_0x07c7;
                case 24: goto L_0x07ba;
                case 25: goto L_0x07ae;
                case 26: goto L_0x07a2;
                case 27: goto L_0x0792;
                case 28: goto L_0x0786;
                case 29: goto L_0x0779;
                case 30: goto L_0x076d;
                case 31: goto L_0x0761;
                case 32: goto L_0x0755;
                case 33: goto L_0x0749;
                case 34: goto L_0x0738;
                case 35: goto L_0x0722;
                case 36: goto L_0x070c;
                case 37: goto L_0x06f6;
                case 38: goto L_0x06e0;
                case 39: goto L_0x06ca;
                case 40: goto L_0x06b4;
                case 41: goto L_0x069e;
                case 42: goto L_0x0688;
                case 43: goto L_0x0673;
                case 44: goto L_0x065e;
                case 45: goto L_0x0649;
                case 46: goto L_0x0634;
                case 47: goto L_0x061f;
                case 48: goto L_0x0607;
                case 49: goto L_0x05f7;
                case 50: goto L_0x05e7;
                case 51: goto L_0x05d9;
                case 52: goto L_0x05cc;
                case 53: goto L_0x05bc;
                case 54: goto L_0x05ac;
                case 55: goto L_0x059c;
                case 56: goto L_0x058e;
                case 57: goto L_0x0582;
                case 58: goto L_0x0576;
                case 59: goto L_0x0558;
                case 60: goto L_0x0544;
                case 61: goto L_0x0533;
                case 62: goto L_0x0524;
                case 63: goto L_0x0515;
                case 64: goto L_0x0508;
                case 65: goto L_0x04fb;
                case 66: goto L_0x04ec;
                case 67: goto L_0x04dd;
                case 68: goto L_0x04c0;
                default: goto L_0x04bf;
            }
        L_0x04bf:
            goto L_0x04d5
        L_0x04c0:
            boolean r6 = r0.w(r1, r15, r3)
            if (r6 == 0) goto L_0x04d5
            java.lang.Object r6 = r2.getObject(r1, r8)
            com.google.android.gms.internal.vision.A1 r6 = (com.google.android.gms.internal.vision.A1) r6
            com.google.android.gms.internal.vision.S1 r8 = r0.m(r3)
            int r6 = com.google.android.gms.internal.vision.C7547x0.U(r15, r6, r8)
        L_0x04d4:
            int r4 = r4 + r6
        L_0x04d5:
            r6 = 0
            r8 = 0
            r10 = 0
        L_0x04d9:
            r13 = 0
            goto L_0x0932
        L_0x04dd:
            boolean r6 = r0.w(r1, r15, r3)
            if (r6 == 0) goto L_0x04d5
            long r8 = M(r1, r8)
            int r6 = com.google.android.gms.internal.vision.C7547x0.m0(r15, r8)
            goto L_0x04d4
        L_0x04ec:
            boolean r6 = r0.w(r1, r15, r3)
            if (r6 == 0) goto L_0x04d5
            int r6 = K(r1, r8)
            int r6 = com.google.android.gms.internal.vision.C7547x0.t0(r15, r6)
            goto L_0x04d4
        L_0x04fb:
            boolean r6 = r0.w(r1, r15, r3)
            if (r6 == 0) goto L_0x04d5
            r8 = 0
            int r6 = com.google.android.gms.internal.vision.C7547x0.u0(r15, r8)
            goto L_0x04d4
        L_0x0508:
            boolean r6 = r0.w(r1, r15, r3)
            if (r6 == 0) goto L_0x04d5
            r6 = 0
            int r8 = com.google.android.gms.internal.vision.C7547x0.A0(r15, r6)
        L_0x0513:
            int r4 = r4 + r8
            goto L_0x04d5
        L_0x0515:
            boolean r6 = r0.w(r1, r15, r3)
            if (r6 == 0) goto L_0x04d5
            int r6 = K(r1, r8)
            int r6 = com.google.android.gms.internal.vision.C7547x0.C0(r15, r6)
            goto L_0x04d4
        L_0x0524:
            boolean r6 = r0.w(r1, r15, r3)
            if (r6 == 0) goto L_0x04d5
            int r6 = K(r1, r8)
            int r6 = com.google.android.gms.internal.vision.C7547x0.p0(r15, r6)
            goto L_0x04d4
        L_0x0533:
            boolean r6 = r0.w(r1, r15, r3)
            if (r6 == 0) goto L_0x04d5
            java.lang.Object r6 = r2.getObject(r1, r8)
            com.google.android.gms.internal.vision.i0 r6 = (com.google.android.gms.internal.vision.C7497i0) r6
            int r6 = com.google.android.gms.internal.vision.C7547x0.T(r15, r6)
            goto L_0x04d4
        L_0x0544:
            boolean r6 = r0.w(r1, r15, r3)
            if (r6 == 0) goto L_0x04d5
            java.lang.Object r6 = r2.getObject(r1, r8)
            com.google.android.gms.internal.vision.S1 r8 = r0.m(r3)
            int r6 = com.google.android.gms.internal.vision.T1.a(r15, r6, r8)
            goto L_0x04d4
        L_0x0558:
            boolean r6 = r0.w(r1, r15, r3)
            if (r6 == 0) goto L_0x04d5
            java.lang.Object r6 = r2.getObject(r1, r8)
            boolean r8 = r6 instanceof com.google.android.gms.internal.vision.C7497i0
            if (r8 == 0) goto L_0x056e
            com.google.android.gms.internal.vision.i0 r6 = (com.google.android.gms.internal.vision.C7497i0) r6
            int r6 = com.google.android.gms.internal.vision.C7547x0.T(r15, r6)
            goto L_0x04d4
        L_0x056e:
            java.lang.String r6 = (java.lang.String) r6
            int r6 = com.google.android.gms.internal.vision.C7547x0.G(r15, r6)
            goto L_0x04d4
        L_0x0576:
            boolean r6 = r0.w(r1, r15, r3)
            if (r6 == 0) goto L_0x04d5
            r6 = 1
            int r8 = com.google.android.gms.internal.vision.C7547x0.H(r15, r6)
            goto L_0x0513
        L_0x0582:
            boolean r6 = r0.w(r1, r15, r3)
            if (r6 == 0) goto L_0x04d5
            r6 = 0
            int r8 = com.google.android.gms.internal.vision.C7547x0.x0(r15, r6)
            goto L_0x0513
        L_0x058e:
            boolean r6 = r0.w(r1, r15, r3)
            if (r6 == 0) goto L_0x04d5
            r8 = 0
            int r6 = com.google.android.gms.internal.vision.C7547x0.q0(r15, r8)
            goto L_0x04d4
        L_0x059c:
            boolean r6 = r0.w(r1, r15, r3)
            if (r6 == 0) goto L_0x04d5
            int r6 = K(r1, r8)
            int r6 = com.google.android.gms.internal.vision.C7547x0.l0(r15, r6)
            goto L_0x04d4
        L_0x05ac:
            boolean r6 = r0.w(r1, r15, r3)
            if (r6 == 0) goto L_0x04d5
            long r8 = M(r1, r8)
            int r6 = com.google.android.gms.internal.vision.C7547x0.h0(r15, r8)
            goto L_0x04d4
        L_0x05bc:
            boolean r6 = r0.w(r1, r15, r3)
            if (r6 == 0) goto L_0x04d5
            long r8 = M(r1, r8)
            int r6 = com.google.android.gms.internal.vision.C7547x0.b0(r15, r8)
            goto L_0x04d4
        L_0x05cc:
            boolean r6 = r0.w(r1, r15, r3)
            if (r6 == 0) goto L_0x04d5
            r6 = 0
            int r8 = com.google.android.gms.internal.vision.C7547x0.C(r15, r6)
            goto L_0x0513
        L_0x05d9:
            boolean r6 = r0.w(r1, r15, r3)
            if (r6 == 0) goto L_0x04d5
            r8 = 0
            int r6 = com.google.android.gms.internal.vision.C7547x0.B(r15, r8)
            goto L_0x04d4
        L_0x05e7:
            com.google.android.gms.internal.vision.x1 r6 = r0.f49193q
            java.lang.Object r8 = r2.getObject(r1, r8)
            java.lang.Object r9 = r0.B(r3)
            int r6 = r6.e(r15, r8, r9)
            goto L_0x04d4
        L_0x05f7:
            java.lang.Object r6 = r2.getObject(r1, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.vision.S1 r8 = r0.m(r3)
            int r6 = com.google.android.gms.internal.vision.T1.s(r15, r6, r8)
            goto L_0x04d4
        L_0x0607:
            java.lang.Object r6 = r2.getObject(r1, r8)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.google.android.gms.internal.vision.T1.A(r6)
            if (r6 <= 0) goto L_0x04d5
            int r8 = com.google.android.gms.internal.vision.C7547x0.g0(r15)
            int r9 = com.google.android.gms.internal.vision.C7547x0.o0(r6)
        L_0x061b:
            int r8 = r8 + r9
            int r8 = r8 + r6
            goto L_0x0513
        L_0x061f:
            java.lang.Object r6 = r2.getObject(r1, r8)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.google.android.gms.internal.vision.T1.P(r6)
            if (r6 <= 0) goto L_0x04d5
            int r8 = com.google.android.gms.internal.vision.C7547x0.g0(r15)
            int r9 = com.google.android.gms.internal.vision.C7547x0.o0(r6)
            goto L_0x061b
        L_0x0634:
            java.lang.Object r6 = r2.getObject(r1, r8)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.google.android.gms.internal.vision.T1.V(r6)
            if (r6 <= 0) goto L_0x04d5
            int r8 = com.google.android.gms.internal.vision.C7547x0.g0(r15)
            int r9 = com.google.android.gms.internal.vision.C7547x0.o0(r6)
            goto L_0x061b
        L_0x0649:
            java.lang.Object r6 = r2.getObject(r1, r8)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.google.android.gms.internal.vision.T1.S(r6)
            if (r6 <= 0) goto L_0x04d5
            int r8 = com.google.android.gms.internal.vision.C7547x0.g0(r15)
            int r9 = com.google.android.gms.internal.vision.C7547x0.o0(r6)
            goto L_0x061b
        L_0x065e:
            java.lang.Object r6 = r2.getObject(r1, r8)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.google.android.gms.internal.vision.T1.E(r6)
            if (r6 <= 0) goto L_0x04d5
            int r8 = com.google.android.gms.internal.vision.C7547x0.g0(r15)
            int r9 = com.google.android.gms.internal.vision.C7547x0.o0(r6)
            goto L_0x061b
        L_0x0673:
            java.lang.Object r6 = r2.getObject(r1, r8)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.google.android.gms.internal.vision.T1.M(r6)
            if (r6 <= 0) goto L_0x04d5
            int r8 = com.google.android.gms.internal.vision.C7547x0.g0(r15)
            int r9 = com.google.android.gms.internal.vision.C7547x0.o0(r6)
            goto L_0x061b
        L_0x0688:
            java.lang.Object r6 = r2.getObject(r1, r8)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.google.android.gms.internal.vision.T1.Y(r6)
            if (r6 <= 0) goto L_0x04d5
            int r8 = com.google.android.gms.internal.vision.C7547x0.g0(r15)
            int r9 = com.google.android.gms.internal.vision.C7547x0.o0(r6)
            goto L_0x061b
        L_0x069e:
            java.lang.Object r6 = r2.getObject(r1, r8)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.google.android.gms.internal.vision.T1.S(r6)
            if (r6 <= 0) goto L_0x04d5
            int r8 = com.google.android.gms.internal.vision.C7547x0.g0(r15)
            int r9 = com.google.android.gms.internal.vision.C7547x0.o0(r6)
            goto L_0x061b
        L_0x06b4:
            java.lang.Object r6 = r2.getObject(r1, r8)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.google.android.gms.internal.vision.T1.V(r6)
            if (r6 <= 0) goto L_0x04d5
            int r8 = com.google.android.gms.internal.vision.C7547x0.g0(r15)
            int r9 = com.google.android.gms.internal.vision.C7547x0.o0(r6)
            goto L_0x061b
        L_0x06ca:
            java.lang.Object r6 = r2.getObject(r1, r8)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.google.android.gms.internal.vision.T1.I(r6)
            if (r6 <= 0) goto L_0x04d5
            int r8 = com.google.android.gms.internal.vision.C7547x0.g0(r15)
            int r9 = com.google.android.gms.internal.vision.C7547x0.o0(r6)
            goto L_0x061b
        L_0x06e0:
            java.lang.Object r6 = r2.getObject(r1, r8)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.google.android.gms.internal.vision.T1.u(r6)
            if (r6 <= 0) goto L_0x04d5
            int r8 = com.google.android.gms.internal.vision.C7547x0.g0(r15)
            int r9 = com.google.android.gms.internal.vision.C7547x0.o0(r6)
            goto L_0x061b
        L_0x06f6:
            java.lang.Object r6 = r2.getObject(r1, r8)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.google.android.gms.internal.vision.T1.e(r6)
            if (r6 <= 0) goto L_0x04d5
            int r8 = com.google.android.gms.internal.vision.C7547x0.g0(r15)
            int r9 = com.google.android.gms.internal.vision.C7547x0.o0(r6)
            goto L_0x061b
        L_0x070c:
            java.lang.Object r6 = r2.getObject(r1, r8)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.google.android.gms.internal.vision.T1.S(r6)
            if (r6 <= 0) goto L_0x04d5
            int r8 = com.google.android.gms.internal.vision.C7547x0.g0(r15)
            int r9 = com.google.android.gms.internal.vision.C7547x0.o0(r6)
            goto L_0x061b
        L_0x0722:
            java.lang.Object r6 = r2.getObject(r1, r8)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.google.android.gms.internal.vision.T1.V(r6)
            if (r6 <= 0) goto L_0x04d5
            int r8 = com.google.android.gms.internal.vision.C7547x0.g0(r15)
            int r9 = com.google.android.gms.internal.vision.C7547x0.o0(r6)
            goto L_0x061b
        L_0x0738:
            java.lang.Object r6 = r2.getObject(r1, r8)
            java.util.List r6 = (java.util.List) r6
            r10 = 0
            int r6 = com.google.android.gms.internal.vision.T1.z(r15, r6, r10)
        L_0x0743:
            int r4 = r4 + r6
        L_0x0744:
            r6 = 0
            r8 = 0
            goto L_0x04d9
        L_0x0749:
            r10 = 0
            java.lang.Object r6 = r2.getObject(r1, r8)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.google.android.gms.internal.vision.T1.O(r15, r6, r10)
            goto L_0x0743
        L_0x0755:
            r10 = 0
            java.lang.Object r6 = r2.getObject(r1, r8)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.google.android.gms.internal.vision.T1.U(r15, r6, r10)
            goto L_0x0743
        L_0x0761:
            r10 = 0
            java.lang.Object r6 = r2.getObject(r1, r8)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.google.android.gms.internal.vision.T1.R(r15, r6, r10)
            goto L_0x0743
        L_0x076d:
            r10 = 0
            java.lang.Object r6 = r2.getObject(r1, r8)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.google.android.gms.internal.vision.T1.D(r15, r6, r10)
            goto L_0x0743
        L_0x0779:
            r10 = 0
            java.lang.Object r6 = r2.getObject(r1, r8)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.google.android.gms.internal.vision.T1.L(r15, r6, r10)
            goto L_0x04d4
        L_0x0786:
            java.lang.Object r6 = r2.getObject(r1, r8)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.google.android.gms.internal.vision.T1.r(r15, r6)
            goto L_0x04d4
        L_0x0792:
            java.lang.Object r6 = r2.getObject(r1, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.vision.S1 r8 = r0.m(r3)
            int r6 = com.google.android.gms.internal.vision.T1.c(r15, r6, r8)
            goto L_0x04d4
        L_0x07a2:
            java.lang.Object r6 = r2.getObject(r1, r8)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.google.android.gms.internal.vision.T1.b(r15, r6)
            goto L_0x04d4
        L_0x07ae:
            java.lang.Object r6 = r2.getObject(r1, r8)
            java.util.List r6 = (java.util.List) r6
            r10 = 0
            int r6 = com.google.android.gms.internal.vision.T1.X(r15, r6, r10)
            goto L_0x0743
        L_0x07ba:
            r10 = 0
            java.lang.Object r6 = r2.getObject(r1, r8)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.google.android.gms.internal.vision.T1.R(r15, r6, r10)
            goto L_0x0743
        L_0x07c7:
            r10 = 0
            java.lang.Object r6 = r2.getObject(r1, r8)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.google.android.gms.internal.vision.T1.U(r15, r6, r10)
            goto L_0x0743
        L_0x07d4:
            r10 = 0
            java.lang.Object r6 = r2.getObject(r1, r8)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.google.android.gms.internal.vision.T1.H(r15, r6, r10)
            goto L_0x0743
        L_0x07e1:
            r10 = 0
            java.lang.Object r6 = r2.getObject(r1, r8)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.google.android.gms.internal.vision.T1.t(r15, r6, r10)
            goto L_0x0743
        L_0x07ee:
            r10 = 0
            java.lang.Object r6 = r2.getObject(r1, r8)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.google.android.gms.internal.vision.T1.d(r15, r6, r10)
            goto L_0x0743
        L_0x07fb:
            r10 = 0
            java.lang.Object r6 = r2.getObject(r1, r8)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.google.android.gms.internal.vision.T1.R(r15, r6, r10)
            goto L_0x0743
        L_0x0808:
            r10 = 0
            java.lang.Object r6 = r2.getObject(r1, r8)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.google.android.gms.internal.vision.T1.U(r15, r6, r10)
            goto L_0x04d4
        L_0x0815:
            r6 = r12 & r11
            if (r6 == 0) goto L_0x04d5
            java.lang.Object r6 = r2.getObject(r1, r8)
            com.google.android.gms.internal.vision.A1 r6 = (com.google.android.gms.internal.vision.A1) r6
            com.google.android.gms.internal.vision.S1 r8 = r0.m(r3)
            int r6 = com.google.android.gms.internal.vision.C7547x0.U(r15, r6, r8)
            goto L_0x04d4
        L_0x0829:
            r6 = r12 & r11
            if (r6 == 0) goto L_0x04d5
            long r8 = r2.getLong(r1, r8)
            int r6 = com.google.android.gms.internal.vision.C7547x0.m0(r15, r8)
            goto L_0x04d4
        L_0x0837:
            r6 = r12 & r11
            if (r6 == 0) goto L_0x04d5
            int r6 = r2.getInt(r1, r8)
            int r6 = com.google.android.gms.internal.vision.C7547x0.t0(r15, r6)
            goto L_0x04d4
        L_0x0845:
            r6 = r12 & r11
            if (r6 == 0) goto L_0x04d5
            r8 = 0
            int r6 = com.google.android.gms.internal.vision.C7547x0.u0(r15, r8)
            goto L_0x04d4
        L_0x0851:
            r6 = r12 & r11
            if (r6 == 0) goto L_0x04d5
            r6 = 0
            int r8 = com.google.android.gms.internal.vision.C7547x0.A0(r15, r6)
            goto L_0x0513
        L_0x085c:
            r6 = r12 & r11
            if (r6 == 0) goto L_0x04d5
            int r6 = r2.getInt(r1, r8)
            int r6 = com.google.android.gms.internal.vision.C7547x0.C0(r15, r6)
            goto L_0x04d4
        L_0x086a:
            r6 = r12 & r11
            if (r6 == 0) goto L_0x04d5
            int r6 = r2.getInt(r1, r8)
            int r6 = com.google.android.gms.internal.vision.C7547x0.p0(r15, r6)
            goto L_0x04d4
        L_0x0878:
            r6 = r12 & r11
            if (r6 == 0) goto L_0x04d5
            java.lang.Object r6 = r2.getObject(r1, r8)
            com.google.android.gms.internal.vision.i0 r6 = (com.google.android.gms.internal.vision.C7497i0) r6
            int r6 = com.google.android.gms.internal.vision.C7547x0.T(r15, r6)
            goto L_0x04d4
        L_0x0888:
            r6 = r12 & r11
            if (r6 == 0) goto L_0x04d5
            java.lang.Object r6 = r2.getObject(r1, r8)
            com.google.android.gms.internal.vision.S1 r8 = r0.m(r3)
            int r6 = com.google.android.gms.internal.vision.T1.a(r15, r6, r8)
            goto L_0x04d4
        L_0x089a:
            r6 = r12 & r11
            if (r6 == 0) goto L_0x04d5
            java.lang.Object r6 = r2.getObject(r1, r8)
            boolean r8 = r6 instanceof com.google.android.gms.internal.vision.C7497i0
            if (r8 == 0) goto L_0x08ae
            com.google.android.gms.internal.vision.i0 r6 = (com.google.android.gms.internal.vision.C7497i0) r6
            int r6 = com.google.android.gms.internal.vision.C7547x0.T(r15, r6)
            goto L_0x04d4
        L_0x08ae:
            java.lang.String r6 = (java.lang.String) r6
            int r6 = com.google.android.gms.internal.vision.C7547x0.G(r15, r6)
            goto L_0x04d4
        L_0x08b6:
            r6 = r12 & r11
            if (r6 == 0) goto L_0x04d5
            r6 = 1
            int r8 = com.google.android.gms.internal.vision.C7547x0.H(r15, r6)
            goto L_0x0513
        L_0x08c1:
            r6 = 1
            r8 = r12 & r11
            r10 = 0
            if (r8 == 0) goto L_0x0744
            int r8 = com.google.android.gms.internal.vision.C7547x0.x0(r15, r10)
            int r4 = r4 + r8
            goto L_0x0744
        L_0x08ce:
            r6 = 1
            r10 = 0
            r8 = r12 & r11
            r13 = 0
            if (r8 == 0) goto L_0x08db
            int r8 = com.google.android.gms.internal.vision.C7547x0.q0(r15, r13)
        L_0x08da:
            int r4 = r4 + r8
        L_0x08db:
            r6 = 0
            r8 = 0
            goto L_0x0932
        L_0x08df:
            r6 = 1
            r10 = 0
            r13 = 0
            r11 = r11 & r12
            if (r11 == 0) goto L_0x08db
            int r8 = r2.getInt(r1, r8)
            int r8 = com.google.android.gms.internal.vision.C7547x0.l0(r15, r8)
            goto L_0x08da
        L_0x08ef:
            r6 = 1
            r10 = 0
            r13 = 0
            r11 = r11 & r12
            if (r11 == 0) goto L_0x08db
            long r8 = r2.getLong(r1, r8)
            int r8 = com.google.android.gms.internal.vision.C7547x0.h0(r15, r8)
            goto L_0x08da
        L_0x08ff:
            r6 = 1
            r10 = 0
            r13 = 0
            r11 = r11 & r12
            if (r11 == 0) goto L_0x08db
            long r8 = r2.getLong(r1, r8)
            int r8 = com.google.android.gms.internal.vision.C7547x0.b0(r15, r8)
            goto L_0x08da
        L_0x090f:
            r6 = 1
            r10 = 0
            r13 = 0
            r8 = r12 & r11
            if (r8 == 0) goto L_0x0920
            r8 = 0
            int r9 = com.google.android.gms.internal.vision.C7547x0.C(r15, r8)
            int r4 = r4 + r9
        L_0x091d:
            r6 = 0
            goto L_0x0932
        L_0x0920:
            r8 = 0
            goto L_0x091d
        L_0x0922:
            r6 = 1
            r8 = 0
            r10 = 0
            r13 = 0
            r9 = r12 & r11
            r6 = 0
            if (r9 == 0) goto L_0x0932
            int r11 = com.google.android.gms.internal.vision.C7547x0.B(r15, r6)
            int r4 = r4 + r11
        L_0x0932:
            int r3 = r3 + 3
            r6 = r8
            r11 = r10
            r9 = r13
            r7 = 1048575(0xfffff, float:1.469367E-39)
            r8 = 1
            goto L_0x048e
        L_0x093d:
            r10 = r11
            com.google.android.gms.internal.vision.j2<?, ?> r2 = r0.f49191o
            int r2 = g(r2, r1)
            int r4 = r4 + r2
            boolean r2 = r0.f49182f
            if (r2 == 0) goto L_0x0997
            com.google.android.gms.internal.vision.E0<?> r2 = r0.f49192p
            com.google.android.gms.internal.vision.I0 r1 = r2.b(r1)
            r11 = r10
        L_0x0950:
            com.google.android.gms.internal.vision.W1<T, java.lang.Object> r2 = r1.f49209a
            int r2 = r2.m()
            if (r11 >= r2) goto L_0x0970
            com.google.android.gms.internal.vision.W1<T, java.lang.Object> r2 = r1.f49209a
            java.util.Map$Entry r2 = r2.k(r11)
            java.lang.Object r3 = r2.getKey()
            com.google.android.gms.internal.vision.K0 r3 = (com.google.android.gms.internal.vision.K0) r3
            java.lang.Object r2 = r2.getValue()
            int r2 = com.google.android.gms.internal.vision.I0.l(r3, r2)
            int r10 = r10 + r2
            int r11 = r11 + 1
            goto L_0x0950
        L_0x0970:
            com.google.android.gms.internal.vision.W1<T, java.lang.Object> r1 = r1.f49209a
            java.lang.Iterable r1 = r1.p()
            java.util.Iterator r1 = r1.iterator()
        L_0x097a:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0996
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            com.google.android.gms.internal.vision.K0 r3 = (com.google.android.gms.internal.vision.K0) r3
            java.lang.Object r2 = r2.getValue()
            int r2 = com.google.android.gms.internal.vision.I0.l(r3, r2)
            int r10 = r10 + r2
            goto L_0x097a
        L_0x0996:
            int r4 = r4 + r10
        L_0x0997:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.E1.zzb(java.lang.Object):int");
    }

    public final boolean zzd(T t10) {
        int i10;
        int i11;
        T t11 = t10;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (i14 < this.f49187k) {
            int i15 = this.f49186j[i14];
            int i16 = this.f49177a[i15];
            int J10 = J(i15);
            int i17 = this.f49177a[i15 + 2];
            int i18 = i17 & 1048575;
            int i19 = 1 << (i17 >>> 20);
            if (i18 != i12) {
                if (i18 != 1048575) {
                    i13 = f49176s.getInt(t11, (long) i18);
                }
                i10 = i13;
                i11 = i18;
            } else {
                i11 = i12;
                i10 = i13;
            }
            if ((268435456 & J10) != 0 && !x(t10, i15, i11, i10, i19)) {
                return false;
            }
            int i20 = (267386880 & J10) >>> 20;
            if (i20 != 9 && i20 != 17) {
                if (i20 != 27) {
                    if (i20 == 60 || i20 == 68) {
                        if (w(t11, i16, i15) && !y(t11, J10, m(i15))) {
                            return false;
                        }
                    } else if (i20 != 49) {
                        if (i20 == 50 && !this.f49193q.d(q2.F(t11, (long) (J10 & 1048575))).isEmpty()) {
                            this.f49193q.zzb(B(i15));
                            throw null;
                        }
                    }
                }
                List list = (List) q2.F(t11, (long) (J10 & 1048575));
                if (!list.isEmpty()) {
                    S1 m10 = m(i15);
                    for (int i21 = 0; i21 < list.size(); i21++) {
                        if (!m10.zzd(list.get(i21))) {
                            return false;
                        }
                    }
                    continue;
                } else {
                    continue;
                }
            } else if (x(t10, i15, i11, i10, i19) && !y(t11, J10, m(i15))) {
                return false;
            }
            i14++;
            i12 = i11;
            i13 = i10;
        }
        return !this.f49182f || this.f49192p.b(t11).r();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x016d, code lost:
        r2 = (r2 * 53) + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0030, code lost:
        r2 = r2 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x022b, code lost:
        r1 = r1 + 3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zza(T r9) {
        /*
            r8 = this;
            int[] r0 = r8.f49177a
            int r0 = r0.length
            r1 = 0
            r2 = r1
        L_0x0005:
            if (r1 >= r0) goto L_0x022f
            int r3 = r8.J(r1)
            int[] r4 = r8.f49177a
            r4 = r4[r1]
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r5 & r3
            long r5 = (long) r5
            r7 = 267386880(0xff00000, float:2.3665827E-29)
            r3 = r3 & r7
            int r3 = r3 >>> 20
            r7 = 37
            switch(r3) {
                case 0: goto L_0x021b;
                case 1: goto L_0x020f;
                case 2: goto L_0x0203;
                case 3: goto L_0x01f7;
                case 4: goto L_0x01ef;
                case 5: goto L_0x01e3;
                case 6: goto L_0x01db;
                case 7: goto L_0x01cf;
                case 8: goto L_0x01c1;
                case 9: goto L_0x01b6;
                case 10: goto L_0x01aa;
                case 11: goto L_0x01a2;
                case 12: goto L_0x019a;
                case 13: goto L_0x0192;
                case 14: goto L_0x0186;
                case 15: goto L_0x017e;
                case 16: goto L_0x0172;
                case 17: goto L_0x0163;
                case 18: goto L_0x0157;
                case 19: goto L_0x0157;
                case 20: goto L_0x0157;
                case 21: goto L_0x0157;
                case 22: goto L_0x0157;
                case 23: goto L_0x0157;
                case 24: goto L_0x0157;
                case 25: goto L_0x0157;
                case 26: goto L_0x0157;
                case 27: goto L_0x0157;
                case 28: goto L_0x0157;
                case 29: goto L_0x0157;
                case 30: goto L_0x0157;
                case 31: goto L_0x0157;
                case 32: goto L_0x0157;
                case 33: goto L_0x0157;
                case 34: goto L_0x0157;
                case 35: goto L_0x0157;
                case 36: goto L_0x0157;
                case 37: goto L_0x0157;
                case 38: goto L_0x0157;
                case 39: goto L_0x0157;
                case 40: goto L_0x0157;
                case 41: goto L_0x0157;
                case 42: goto L_0x0157;
                case 43: goto L_0x0157;
                case 44: goto L_0x0157;
                case 45: goto L_0x0157;
                case 46: goto L_0x0157;
                case 47: goto L_0x0157;
                case 48: goto L_0x0157;
                case 49: goto L_0x0157;
                case 50: goto L_0x014b;
                case 51: goto L_0x0135;
                case 52: goto L_0x0123;
                case 53: goto L_0x0111;
                case 54: goto L_0x00ff;
                case 55: goto L_0x00f1;
                case 56: goto L_0x00df;
                case 57: goto L_0x00d1;
                case 58: goto L_0x00bf;
                case 59: goto L_0x00ab;
                case 60: goto L_0x009a;
                case 61: goto L_0x0089;
                case 62: goto L_0x007c;
                case 63: goto L_0x006f;
                case 64: goto L_0x0062;
                case 65: goto L_0x0051;
                case 66: goto L_0x0044;
                case 67: goto L_0x0033;
                case 68: goto L_0x0020;
                default: goto L_0x001e;
            }
        L_0x001e:
            goto L_0x022b
        L_0x0020:
            boolean r3 = r8.w(r9, r4, r1)
            if (r3 == 0) goto L_0x022b
            java.lang.Object r3 = com.google.android.gms.internal.vision.q2.F(r9, r5)
            int r2 = r2 * 53
            int r3 = r3.hashCode()
        L_0x0030:
            int r2 = r2 + r3
            goto L_0x022b
        L_0x0033:
            boolean r3 = r8.w(r9, r4, r1)
            if (r3 == 0) goto L_0x022b
            int r2 = r2 * 53
            long r3 = M(r9, r5)
            int r3 = com.google.android.gms.internal.vision.U0.b(r3)
            goto L_0x0030
        L_0x0044:
            boolean r3 = r8.w(r9, r4, r1)
            if (r3 == 0) goto L_0x022b
            int r2 = r2 * 53
            int r3 = K(r9, r5)
            goto L_0x0030
        L_0x0051:
            boolean r3 = r8.w(r9, r4, r1)
            if (r3 == 0) goto L_0x022b
            int r2 = r2 * 53
            long r3 = M(r9, r5)
            int r3 = com.google.android.gms.internal.vision.U0.b(r3)
            goto L_0x0030
        L_0x0062:
            boolean r3 = r8.w(r9, r4, r1)
            if (r3 == 0) goto L_0x022b
            int r2 = r2 * 53
            int r3 = K(r9, r5)
            goto L_0x0030
        L_0x006f:
            boolean r3 = r8.w(r9, r4, r1)
            if (r3 == 0) goto L_0x022b
            int r2 = r2 * 53
            int r3 = K(r9, r5)
            goto L_0x0030
        L_0x007c:
            boolean r3 = r8.w(r9, r4, r1)
            if (r3 == 0) goto L_0x022b
            int r2 = r2 * 53
            int r3 = K(r9, r5)
            goto L_0x0030
        L_0x0089:
            boolean r3 = r8.w(r9, r4, r1)
            if (r3 == 0) goto L_0x022b
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.vision.q2.F(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0030
        L_0x009a:
            boolean r3 = r8.w(r9, r4, r1)
            if (r3 == 0) goto L_0x022b
            java.lang.Object r3 = com.google.android.gms.internal.vision.q2.F(r9, r5)
            int r2 = r2 * 53
            int r3 = r3.hashCode()
            goto L_0x0030
        L_0x00ab:
            boolean r3 = r8.w(r9, r4, r1)
            if (r3 == 0) goto L_0x022b
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.vision.q2.F(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0030
        L_0x00bf:
            boolean r3 = r8.w(r9, r4, r1)
            if (r3 == 0) goto L_0x022b
            int r2 = r2 * 53
            boolean r3 = O(r9, r5)
            int r3 = com.google.android.gms.internal.vision.U0.c(r3)
            goto L_0x0030
        L_0x00d1:
            boolean r3 = r8.w(r9, r4, r1)
            if (r3 == 0) goto L_0x022b
            int r2 = r2 * 53
            int r3 = K(r9, r5)
            goto L_0x0030
        L_0x00df:
            boolean r3 = r8.w(r9, r4, r1)
            if (r3 == 0) goto L_0x022b
            int r2 = r2 * 53
            long r3 = M(r9, r5)
            int r3 = com.google.android.gms.internal.vision.U0.b(r3)
            goto L_0x0030
        L_0x00f1:
            boolean r3 = r8.w(r9, r4, r1)
            if (r3 == 0) goto L_0x022b
            int r2 = r2 * 53
            int r3 = K(r9, r5)
            goto L_0x0030
        L_0x00ff:
            boolean r3 = r8.w(r9, r4, r1)
            if (r3 == 0) goto L_0x022b
            int r2 = r2 * 53
            long r3 = M(r9, r5)
            int r3 = com.google.android.gms.internal.vision.U0.b(r3)
            goto L_0x0030
        L_0x0111:
            boolean r3 = r8.w(r9, r4, r1)
            if (r3 == 0) goto L_0x022b
            int r2 = r2 * 53
            long r3 = M(r9, r5)
            int r3 = com.google.android.gms.internal.vision.U0.b(r3)
            goto L_0x0030
        L_0x0123:
            boolean r3 = r8.w(r9, r4, r1)
            if (r3 == 0) goto L_0x022b
            int r2 = r2 * 53
            float r3 = G(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0030
        L_0x0135:
            boolean r3 = r8.w(r9, r4, r1)
            if (r3 == 0) goto L_0x022b
            int r2 = r2 * 53
            double r3 = z(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = com.google.android.gms.internal.vision.U0.b(r3)
            goto L_0x0030
        L_0x014b:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.vision.q2.F(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0030
        L_0x0157:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.vision.q2.F(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0030
        L_0x0163:
            java.lang.Object r3 = com.google.android.gms.internal.vision.q2.F(r9, r5)
            if (r3 == 0) goto L_0x016d
            int r7 = r3.hashCode()
        L_0x016d:
            int r2 = r2 * 53
            int r2 = r2 + r7
            goto L_0x022b
        L_0x0172:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.vision.q2.o(r9, r5)
            int r3 = com.google.android.gms.internal.vision.U0.b(r3)
            goto L_0x0030
        L_0x017e:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.vision.q2.b(r9, r5)
            goto L_0x0030
        L_0x0186:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.vision.q2.o(r9, r5)
            int r3 = com.google.android.gms.internal.vision.U0.b(r3)
            goto L_0x0030
        L_0x0192:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.vision.q2.b(r9, r5)
            goto L_0x0030
        L_0x019a:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.vision.q2.b(r9, r5)
            goto L_0x0030
        L_0x01a2:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.vision.q2.b(r9, r5)
            goto L_0x0030
        L_0x01aa:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.vision.q2.F(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0030
        L_0x01b6:
            java.lang.Object r3 = com.google.android.gms.internal.vision.q2.F(r9, r5)
            if (r3 == 0) goto L_0x016d
            int r7 = r3.hashCode()
            goto L_0x016d
        L_0x01c1:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.vision.q2.F(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0030
        L_0x01cf:
            int r2 = r2 * 53
            boolean r3 = com.google.android.gms.internal.vision.q2.w(r9, r5)
            int r3 = com.google.android.gms.internal.vision.U0.c(r3)
            goto L_0x0030
        L_0x01db:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.vision.q2.b(r9, r5)
            goto L_0x0030
        L_0x01e3:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.vision.q2.o(r9, r5)
            int r3 = com.google.android.gms.internal.vision.U0.b(r3)
            goto L_0x0030
        L_0x01ef:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.vision.q2.b(r9, r5)
            goto L_0x0030
        L_0x01f7:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.vision.q2.o(r9, r5)
            int r3 = com.google.android.gms.internal.vision.U0.b(r3)
            goto L_0x0030
        L_0x0203:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.vision.q2.o(r9, r5)
            int r3 = com.google.android.gms.internal.vision.U0.b(r3)
            goto L_0x0030
        L_0x020f:
            int r2 = r2 * 53
            float r3 = com.google.android.gms.internal.vision.q2.x(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0030
        L_0x021b:
            int r2 = r2 * 53
            double r3 = com.google.android.gms.internal.vision.q2.C(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = com.google.android.gms.internal.vision.U0.b(r3)
            goto L_0x0030
        L_0x022b:
            int r1 = r1 + 3
            goto L_0x0005
        L_0x022f:
            int r2 = r2 * 53
            com.google.android.gms.internal.vision.j2<?, ?> r0 = r8.f49191o
            java.lang.Object r0 = r0.f(r9)
            int r0 = r0.hashCode()
            int r2 = r2 + r0
            boolean r0 = r8.f49182f
            if (r0 == 0) goto L_0x024d
            int r2 = r2 * 53
            com.google.android.gms.internal.vision.E0<?> r0 = r8.f49192p
            com.google.android.gms.internal.vision.I0 r9 = r0.b(r9)
            int r9 = r9.hashCode()
            int r2 = r2 + r9
        L_0x024d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.E1.zza(java.lang.Object):int");
    }
}
