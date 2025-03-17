package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.C7186g0;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

final class Q0<T> implements C7178d1<T> {

    /* renamed from: s  reason: collision with root package name */
    private static final Unsafe f48232s = C1.z();

    /* renamed from: a  reason: collision with root package name */
    private final int[] f48233a;

    /* renamed from: b  reason: collision with root package name */
    private final Object[] f48234b;

    /* renamed from: c  reason: collision with root package name */
    private final int f48235c;

    /* renamed from: d  reason: collision with root package name */
    private final int f48236d;

    /* renamed from: e  reason: collision with root package name */
    private final int f48237e;

    /* renamed from: f  reason: collision with root package name */
    private final M0 f48238f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f48239g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f48240h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f48241i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f48242j;

    /* renamed from: k  reason: collision with root package name */
    private final int[] f48243k;

    /* renamed from: l  reason: collision with root package name */
    private final int[] f48244l;

    /* renamed from: m  reason: collision with root package name */
    private final int[] f48245m;

    /* renamed from: n  reason: collision with root package name */
    private final T0 f48246n;

    /* renamed from: o  reason: collision with root package name */
    private final C7233w0 f48247o;

    /* renamed from: p  reason: collision with root package name */
    private final C7231v1<?, ?> f48248p;

    /* renamed from: q  reason: collision with root package name */
    private final T<?> f48249q;

    /* renamed from: r  reason: collision with root package name */
    private final H0 f48250r;

    private Q0(int[] iArr, Object[] objArr, int i10, int i11, int i12, M0 m02, boolean z10, boolean z11, int[] iArr2, int[] iArr3, int[] iArr4, T0 t02, C7233w0 w0Var, C7231v1<?, ?> v1Var, T<?> t10, H0 h02) {
        M0 m03 = m02;
        T<?> t11 = t10;
        this.f48233a = iArr;
        this.f48234b = objArr;
        this.f48235c = i10;
        this.f48236d = i11;
        this.f48237e = i12;
        this.f48240h = m03 instanceof C7186g0;
        this.f48241i = z10;
        this.f48239g = t11 != null && t11.g(m02);
        this.f48242j = false;
        this.f48243k = iArr2;
        this.f48244l = iArr3;
        this.f48245m = iArr4;
        this.f48246n = t02;
        this.f48247o = w0Var;
        this.f48248p = v1Var;
        this.f48249q = t11;
        this.f48238f = m03;
        this.f48250r = h02;
    }

    private final boolean A(T t10, int i10, int i11, int i12) {
        return this.f48241i ? y(t10, i10) : (i11 & i12) != 0;
    }

    private static boolean B(Object obj, int i10, C7178d1 d1Var) {
        return d1Var.g(C1.M(obj, (long) (i10 & 1048575)));
    }

    private final C7178d1 C(int i10) {
        int i11 = (i10 / 4) << 1;
        C7178d1 d1Var = (C7178d1) this.f48234b[i11];
        if (d1Var != null) {
            return d1Var;
        }
        C7178d1 b10 = Y0.a().b((Class) this.f48234b[i11 + 1]);
        this.f48234b[i11] = b10;
        return b10;
    }

    private final Object D(int i10) {
        return this.f48234b[(i10 / 4) << 1];
    }

    private final C7198k0<?> E(int i10) {
        return (C7198k0) this.f48234b[((i10 / 4) << 1) + 1];
    }

    private final int F(int i10) {
        return this.f48233a[i10 + 1];
    }

    private final int G(int i10) {
        return this.f48233a[i10 + 2];
    }

    private final int H(int i10) {
        int i11 = this.f48235c;
        if (i10 >= i11) {
            int i12 = this.f48237e;
            if (i10 < i12) {
                int i13 = (i10 - i11) << 2;
                if (this.f48233a[i13] == i10) {
                    return i13;
                }
                return -1;
            } else if (i10 <= this.f48236d) {
                int i14 = i12 - i11;
                int length = (this.f48233a.length / 4) - 1;
                while (i14 <= length) {
                    int i15 = (length + i14) >>> 1;
                    int i16 = i15 << 2;
                    int i17 = this.f48233a[i16];
                    if (i10 == i17) {
                        return i16;
                    }
                    if (i10 < i17) {
                        length = i15 - 1;
                    } else {
                        i14 = i15 + 1;
                    }
                }
            }
        }
        return -1;
    }

    private final void I(T t10, int i10) {
        if (!this.f48241i) {
            int G10 = G(i10);
            long j10 = (long) (G10 & 1048575);
            C1.g(t10, j10, C1.H(t10, j10) | (1 << (G10 >>> 20)));
        }
    }

    private final void J(T t10, int i10, int i11) {
        C1.g(t10, (long) (G(i11) & 1048575), i10);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0484, code lost:
        r10 = r10 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x029b, code lost:
        r15 = r14;
     */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x048a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void K(T r18, com.google.android.gms.internal.clearcut.Q1 r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            boolean r3 = r0.f48239g
            if (r3 == 0) goto L_0x0021
            com.google.android.gms.internal.clearcut.T<?> r3 = r0.f48249q
            com.google.android.gms.internal.clearcut.X r3 = r3.b(r1)
            boolean r5 = r3.b()
            if (r5 != 0) goto L_0x0021
            java.util.Iterator r3 = r3.e()
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x0023
        L_0x0021:
            r3 = 0
            r5 = 0
        L_0x0023:
            int[] r6 = r0.f48233a
            int r6 = r6.length
            sun.misc.Unsafe r7 = f48232s
            r9 = -1
            r10 = 0
            r11 = 0
        L_0x002b:
            if (r10 >= r6) goto L_0x0488
            int r12 = r0.F(r10)
            int[] r13 = r0.f48233a
            r14 = r13[r10]
            r15 = 267386880(0xff00000, float:2.3665827E-29)
            r15 = r15 & r12
            int r15 = r15 >>> 20
            boolean r4 = r0.f48241i
            r16 = 1048575(0xfffff, float:1.469367E-39)
            if (r4 != 0) goto L_0x0059
            r4 = 17
            if (r15 > r4) goto L_0x0059
            int r4 = r10 + 2
            r4 = r13[r4]
            r13 = r4 & r16
            if (r13 == r9) goto L_0x0053
            long r8 = (long) r13
            int r11 = r7.getInt(r1, r8)
            r9 = r13
        L_0x0053:
            int r4 = r4 >>> 20
            r8 = 1
            int r4 = r8 << r4
            goto L_0x005a
        L_0x0059:
            r4 = 0
        L_0x005a:
            if (r5 == 0) goto L_0x0078
            com.google.android.gms.internal.clearcut.T<?> r8 = r0.f48249q
            int r8 = r8.a(r5)
            if (r8 > r14) goto L_0x0078
            com.google.android.gms.internal.clearcut.T<?> r8 = r0.f48249q
            r8.c(r2, r5)
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0076
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x005a
        L_0x0076:
            r5 = 0
            goto L_0x005a
        L_0x0078:
            r8 = r12 & r16
            long r12 = (long) r8
            switch(r15) {
                case 0: goto L_0x0479;
                case 1: goto L_0x046d;
                case 2: goto L_0x0461;
                case 3: goto L_0x0455;
                case 4: goto L_0x0449;
                case 5: goto L_0x043d;
                case 6: goto L_0x0431;
                case 7: goto L_0x0425;
                case 8: goto L_0x0419;
                case 9: goto L_0x0408;
                case 10: goto L_0x03f9;
                case 11: goto L_0x03ec;
                case 12: goto L_0x03df;
                case 13: goto L_0x03d2;
                case 14: goto L_0x03c5;
                case 15: goto L_0x03b8;
                case 16: goto L_0x03ab;
                case 17: goto L_0x039a;
                case 18: goto L_0x038a;
                case 19: goto L_0x037a;
                case 20: goto L_0x036a;
                case 21: goto L_0x035a;
                case 22: goto L_0x034a;
                case 23: goto L_0x033a;
                case 24: goto L_0x032a;
                case 25: goto L_0x031a;
                case 26: goto L_0x030b;
                case 27: goto L_0x02f8;
                case 28: goto L_0x02e9;
                case 29: goto L_0x02da;
                case 30: goto L_0x02cb;
                case 31: goto L_0x02bc;
                case 32: goto L_0x02ad;
                case 33: goto L_0x029e;
                case 34: goto L_0x028d;
                case 35: goto L_0x027d;
                case 36: goto L_0x026d;
                case 37: goto L_0x025d;
                case 38: goto L_0x024d;
                case 39: goto L_0x023d;
                case 40: goto L_0x022d;
                case 41: goto L_0x021d;
                case 42: goto L_0x020d;
                case 43: goto L_0x01fd;
                case 44: goto L_0x01ed;
                case 45: goto L_0x01dd;
                case 46: goto L_0x01cd;
                case 47: goto L_0x01bd;
                case 48: goto L_0x01ad;
                case 49: goto L_0x019a;
                case 50: goto L_0x0191;
                case 51: goto L_0x0182;
                case 52: goto L_0x0173;
                case 53: goto L_0x0164;
                case 54: goto L_0x0155;
                case 55: goto L_0x0146;
                case 56: goto L_0x0137;
                case 57: goto L_0x0128;
                case 58: goto L_0x0119;
                case 59: goto L_0x010a;
                case 60: goto L_0x00f7;
                case 61: goto L_0x00e7;
                case 62: goto L_0x00d9;
                case 63: goto L_0x00cb;
                case 64: goto L_0x00bd;
                case 65: goto L_0x00af;
                case 66: goto L_0x00a1;
                case 67: goto L_0x0093;
                case 68: goto L_0x0081;
                default: goto L_0x007e;
            }
        L_0x007e:
            r15 = 0
            goto L_0x0484
        L_0x0081:
            boolean r4 = r0.z(r1, r14, r10)
            if (r4 == 0) goto L_0x007e
            java.lang.Object r4 = r7.getObject(r1, r12)
            com.google.android.gms.internal.clearcut.d1 r8 = r0.C(r10)
            r2.J(r14, r4, r8)
            goto L_0x007e
        L_0x0093:
            boolean r4 = r0.z(r1, r14, r10)
            if (r4 == 0) goto L_0x007e
            long r12 = R(r1, r12)
            r2.a(r14, r12)
            goto L_0x007e
        L_0x00a1:
            boolean r4 = r0.z(r1, r14, r10)
            if (r4 == 0) goto L_0x007e
            int r4 = Q(r1, r12)
            r2.v(r14, r4)
            goto L_0x007e
        L_0x00af:
            boolean r4 = r0.z(r1, r14, r10)
            if (r4 == 0) goto L_0x007e
            long r12 = R(r1, r12)
            r2.K(r14, r12)
            goto L_0x007e
        L_0x00bd:
            boolean r4 = r0.z(r1, r14, r10)
            if (r4 == 0) goto L_0x007e
            int r4 = Q(r1, r12)
            r2.P(r14, r4)
            goto L_0x007e
        L_0x00cb:
            boolean r4 = r0.z(r1, r14, r10)
            if (r4 == 0) goto L_0x007e
            int r4 = Q(r1, r12)
            r2.M(r14, r4)
            goto L_0x007e
        L_0x00d9:
            boolean r4 = r0.z(r1, r14, r10)
            if (r4 == 0) goto L_0x007e
            int r4 = Q(r1, r12)
            r2.u(r14, r4)
            goto L_0x007e
        L_0x00e7:
            boolean r4 = r0.z(r1, r14, r10)
            if (r4 == 0) goto L_0x007e
            java.lang.Object r4 = r7.getObject(r1, r12)
            com.google.android.gms.internal.clearcut.A r4 = (com.google.android.gms.internal.clearcut.A) r4
            r2.H(r14, r4)
            goto L_0x007e
        L_0x00f7:
            boolean r4 = r0.z(r1, r14, r10)
            if (r4 == 0) goto L_0x007e
            java.lang.Object r4 = r7.getObject(r1, r12)
            com.google.android.gms.internal.clearcut.d1 r8 = r0.C(r10)
            r2.I(r14, r4, r8)
            goto L_0x007e
        L_0x010a:
            boolean r4 = r0.z(r1, r14, r10)
            if (r4 == 0) goto L_0x007e
            java.lang.Object r4 = r7.getObject(r1, r12)
            u(r14, r4, r2)
            goto L_0x007e
        L_0x0119:
            boolean r4 = r0.z(r1, r14, r10)
            if (r4 == 0) goto L_0x007e
            boolean r4 = S(r1, r12)
            r2.zzb(r14, r4)
            goto L_0x007e
        L_0x0128:
            boolean r4 = r0.z(r1, r14, r10)
            if (r4 == 0) goto L_0x007e
            int r4 = Q(r1, r12)
            r2.m(r14, r4)
            goto L_0x007e
        L_0x0137:
            boolean r4 = r0.z(r1, r14, r10)
            if (r4 == 0) goto L_0x007e
            long r12 = R(r1, r12)
            r2.f(r14, r12)
            goto L_0x007e
        L_0x0146:
            boolean r4 = r0.z(r1, r14, r10)
            if (r4 == 0) goto L_0x007e
            int r4 = Q(r1, r12)
            r2.e(r14, r4)
            goto L_0x007e
        L_0x0155:
            boolean r4 = r0.z(r1, r14, r10)
            if (r4 == 0) goto L_0x007e
            long r12 = R(r1, r12)
            r2.j(r14, r12)
            goto L_0x007e
        L_0x0164:
            boolean r4 = r0.z(r1, r14, r10)
            if (r4 == 0) goto L_0x007e
            long r12 = R(r1, r12)
            r2.L(r14, r12)
            goto L_0x007e
        L_0x0173:
            boolean r4 = r0.z(r1, r14, r10)
            if (r4 == 0) goto L_0x007e
            float r4 = P(r1, r12)
            r2.l(r14, r4)
            goto L_0x007e
        L_0x0182:
            boolean r4 = r0.z(r1, r14, r10)
            if (r4 == 0) goto L_0x007e
            double r12 = O(r1, r12)
            r2.k(r14, r12)
            goto L_0x007e
        L_0x0191:
            java.lang.Object r4 = r7.getObject(r1, r12)
            r0.w(r2, r14, r4, r10)
            goto L_0x007e
        L_0x019a:
            int[] r4 = r0.f48233a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.d1 r12 = r0.C(r10)
            com.google.android.gms.internal.clearcut.C7184f1.l(r4, r8, r2, r12)
            goto L_0x007e
        L_0x01ad:
            int[] r4 = r0.f48233a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            r14 = 1
            com.google.android.gms.internal.clearcut.C7184f1.F(r4, r8, r2, r14)
            goto L_0x007e
        L_0x01bd:
            r14 = 1
            int[] r4 = r0.f48233a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.C7184f1.Q(r4, r8, r2, r14)
            goto L_0x007e
        L_0x01cd:
            r14 = 1
            int[] r4 = r0.f48233a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.C7184f1.K(r4, r8, r2, r14)
            goto L_0x007e
        L_0x01dd:
            r14 = 1
            int[] r4 = r0.f48233a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.C7184f1.S(r4, r8, r2, r14)
            goto L_0x007e
        L_0x01ed:
            r14 = 1
            int[] r4 = r0.f48233a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.C7184f1.T(r4, r8, r2, r14)
            goto L_0x007e
        L_0x01fd:
            r14 = 1
            int[] r4 = r0.f48233a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.C7184f1.O(r4, r8, r2, r14)
            goto L_0x007e
        L_0x020d:
            r14 = 1
            int[] r4 = r0.f48233a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.C7184f1.U(r4, r8, r2, r14)
            goto L_0x007e
        L_0x021d:
            r14 = 1
            int[] r4 = r0.f48233a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.C7184f1.R(r4, r8, r2, r14)
            goto L_0x007e
        L_0x022d:
            r14 = 1
            int[] r4 = r0.f48233a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.C7184f1.H(r4, r8, r2, r14)
            goto L_0x007e
        L_0x023d:
            r14 = 1
            int[] r4 = r0.f48233a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.C7184f1.M(r4, r8, r2, r14)
            goto L_0x007e
        L_0x024d:
            r14 = 1
            int[] r4 = r0.f48233a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.C7184f1.x(r4, r8, r2, r14)
            goto L_0x007e
        L_0x025d:
            r14 = 1
            int[] r4 = r0.f48233a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.C7184f1.r(r4, r8, r2, r14)
            goto L_0x007e
        L_0x026d:
            r14 = 1
            int[] r4 = r0.f48233a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.C7184f1.m(r4, r8, r2, r14)
            goto L_0x007e
        L_0x027d:
            r14 = 1
            int[] r4 = r0.f48233a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.C7184f1.f(r4, r8, r2, r14)
            goto L_0x007e
        L_0x028d:
            int[] r4 = r0.f48233a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            r14 = 0
            com.google.android.gms.internal.clearcut.C7184f1.F(r4, r8, r2, r14)
        L_0x029b:
            r15 = r14
            goto L_0x0484
        L_0x029e:
            r14 = 0
            int[] r4 = r0.f48233a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.C7184f1.Q(r4, r8, r2, r14)
            goto L_0x029b
        L_0x02ad:
            r14 = 0
            int[] r4 = r0.f48233a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.C7184f1.K(r4, r8, r2, r14)
            goto L_0x029b
        L_0x02bc:
            r14 = 0
            int[] r4 = r0.f48233a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.C7184f1.S(r4, r8, r2, r14)
            goto L_0x029b
        L_0x02cb:
            r14 = 0
            int[] r4 = r0.f48233a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.C7184f1.T(r4, r8, r2, r14)
            goto L_0x029b
        L_0x02da:
            r14 = 0
            int[] r4 = r0.f48233a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.C7184f1.O(r4, r8, r2, r14)
            goto L_0x029b
        L_0x02e9:
            int[] r4 = r0.f48233a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.C7184f1.k(r4, r8, r2)
            goto L_0x007e
        L_0x02f8:
            int[] r4 = r0.f48233a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.d1 r12 = r0.C(r10)
            com.google.android.gms.internal.clearcut.C7184f1.e(r4, r8, r2, r12)
            goto L_0x007e
        L_0x030b:
            int[] r4 = r0.f48233a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.C7184f1.d(r4, r8, r2)
            goto L_0x007e
        L_0x031a:
            int[] r4 = r0.f48233a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            r15 = 0
            com.google.android.gms.internal.clearcut.C7184f1.U(r4, r8, r2, r15)
            goto L_0x0484
        L_0x032a:
            r15 = 0
            int[] r4 = r0.f48233a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.C7184f1.R(r4, r8, r2, r15)
            goto L_0x0484
        L_0x033a:
            r15 = 0
            int[] r4 = r0.f48233a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.C7184f1.H(r4, r8, r2, r15)
            goto L_0x0484
        L_0x034a:
            r15 = 0
            int[] r4 = r0.f48233a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.C7184f1.M(r4, r8, r2, r15)
            goto L_0x0484
        L_0x035a:
            r15 = 0
            int[] r4 = r0.f48233a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.C7184f1.x(r4, r8, r2, r15)
            goto L_0x0484
        L_0x036a:
            r15 = 0
            int[] r4 = r0.f48233a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.C7184f1.r(r4, r8, r2, r15)
            goto L_0x0484
        L_0x037a:
            r15 = 0
            int[] r4 = r0.f48233a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.C7184f1.m(r4, r8, r2, r15)
            goto L_0x0484
        L_0x038a:
            r15 = 0
            int[] r4 = r0.f48233a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r12)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.C7184f1.f(r4, r8, r2, r15)
            goto L_0x0484
        L_0x039a:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0484
            java.lang.Object r4 = r7.getObject(r1, r12)
            com.google.android.gms.internal.clearcut.d1 r8 = r0.C(r10)
            r2.J(r14, r4, r8)
            goto L_0x0484
        L_0x03ab:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0484
            long r12 = r7.getLong(r1, r12)
            r2.a(r14, r12)
            goto L_0x0484
        L_0x03b8:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0484
            int r4 = r7.getInt(r1, r12)
            r2.v(r14, r4)
            goto L_0x0484
        L_0x03c5:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0484
            long r12 = r7.getLong(r1, r12)
            r2.K(r14, r12)
            goto L_0x0484
        L_0x03d2:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0484
            int r4 = r7.getInt(r1, r12)
            r2.P(r14, r4)
            goto L_0x0484
        L_0x03df:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0484
            int r4 = r7.getInt(r1, r12)
            r2.M(r14, r4)
            goto L_0x0484
        L_0x03ec:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0484
            int r4 = r7.getInt(r1, r12)
            r2.u(r14, r4)
            goto L_0x0484
        L_0x03f9:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0484
            java.lang.Object r4 = r7.getObject(r1, r12)
            com.google.android.gms.internal.clearcut.A r4 = (com.google.android.gms.internal.clearcut.A) r4
            r2.H(r14, r4)
            goto L_0x0484
        L_0x0408:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0484
            java.lang.Object r4 = r7.getObject(r1, r12)
            com.google.android.gms.internal.clearcut.d1 r8 = r0.C(r10)
            r2.I(r14, r4, r8)
            goto L_0x0484
        L_0x0419:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0484
            java.lang.Object r4 = r7.getObject(r1, r12)
            u(r14, r4, r2)
            goto L_0x0484
        L_0x0425:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0484
            boolean r4 = com.google.android.gms.internal.clearcut.C1.J(r1, r12)
            r2.zzb(r14, r4)
            goto L_0x0484
        L_0x0431:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0484
            int r4 = r7.getInt(r1, r12)
            r2.m(r14, r4)
            goto L_0x0484
        L_0x043d:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0484
            long r12 = r7.getLong(r1, r12)
            r2.f(r14, r12)
            goto L_0x0484
        L_0x0449:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0484
            int r4 = r7.getInt(r1, r12)
            r2.e(r14, r4)
            goto L_0x0484
        L_0x0455:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0484
            long r12 = r7.getLong(r1, r12)
            r2.j(r14, r12)
            goto L_0x0484
        L_0x0461:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0484
            long r12 = r7.getLong(r1, r12)
            r2.L(r14, r12)
            goto L_0x0484
        L_0x046d:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0484
            float r4 = com.google.android.gms.internal.clearcut.C1.K(r1, r12)
            r2.l(r14, r4)
            goto L_0x0484
        L_0x0479:
            r15 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0484
            double r12 = com.google.android.gms.internal.clearcut.C1.L(r1, r12)
            r2.k(r14, r12)
        L_0x0484:
            int r10 = r10 + 4
            goto L_0x002b
        L_0x0488:
            if (r5 == 0) goto L_0x049f
            com.google.android.gms.internal.clearcut.T<?> r4 = r0.f48249q
            r4.c(r2, r5)
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x049d
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            r5 = r4
            goto L_0x0488
        L_0x049d:
            r5 = 0
            goto L_0x0488
        L_0x049f:
            com.google.android.gms.internal.clearcut.v1<?, ?> r3 = r0.f48248p
            v(r3, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.Q0.K(java.lang.Object, com.google.android.gms.internal.clearcut.Q1):void");
    }

    private final void L(T t10, T t11, int i10) {
        int F10 = F(i10);
        int i11 = this.f48233a[i10];
        long j10 = (long) (F10 & 1048575);
        if (z(t11, i11, i10)) {
            Object M10 = C1.M(t10, j10);
            Object M11 = C1.M(t11, j10);
            if (M10 != null && M11 != null) {
                C1.i(t10, j10, C7192i0.d(M10, M11));
                J(t10, i11, i10);
            } else if (M11 != null) {
                C1.i(t10, j10, M11);
                J(t10, i11, i10);
            }
        }
    }

    private final boolean M(T t10, T t11, int i10) {
        return y(t10, i10) == y(t11, i10);
    }

    private static <E> List<E> N(Object obj, long j10) {
        return (List) C1.M(obj, j10);
    }

    private static <T> double O(T t10, long j10) {
        return ((Double) C1.M(t10, j10)).doubleValue();
    }

    private static <T> float P(T t10, long j10) {
        return ((Float) C1.M(t10, j10)).floatValue();
    }

    private static <T> int Q(T t10, long j10) {
        return ((Integer) C1.M(t10, j10)).intValue();
    }

    private static <T> long R(T t10, long j10) {
        return ((Long) C1.M(t10, j10)).longValue();
    }

    private static <T> boolean S(T t10, long j10) {
        return ((Boolean) C1.M(t10, j10)).booleanValue();
    }

    private static C7234w1 T(Object obj) {
        C7186g0 g0Var = (C7186g0) obj;
        C7234w1 w1Var = g0Var.zzjp;
        if (w1Var != C7234w1.h()) {
            return w1Var;
        }
        C7234w1 i10 = C7234w1.i();
        g0Var.zzjp = i10;
        return i10;
    }

    private static int a(int i10, byte[] bArr, int i11, int i12, Object obj, C7232w wVar) {
        return C7229v.c(i10, bArr, i11, i12, T(obj), wVar);
    }

    private static int k(C7178d1<?> d1Var, int i10, byte[] bArr, int i11, int i12, C7201l0<?> l0Var, C7232w wVar) {
        int m10 = m(d1Var, bArr, i11, i12, wVar);
        while (true) {
            l0Var.add(wVar.f48495c);
            if (m10 >= i12) {
                break;
            }
            int e10 = C7229v.e(bArr, m10, wVar);
            if (i10 != wVar.f48493a) {
                break;
            }
            m10 = m(d1Var, bArr, e10, i12, wVar);
        }
        return m10;
    }

    private static int l(C7178d1 d1Var, byte[] bArr, int i10, int i11, int i12, C7232w wVar) {
        Q0 q02 = (Q0) d1Var;
        Object e10 = q02.e();
        int r10 = q02.r(e10, bArr, i10, i11, i12, wVar);
        q02.d(e10);
        wVar.f48495c = e10;
        return r10;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m(com.google.android.gms.internal.clearcut.C7178d1 r6, byte[] r7, int r8, int r9, com.google.android.gms.internal.clearcut.C7232w r10) {
        /*
            int r0 = r8 + 1
            byte r8 = r7[r8]
            if (r8 >= 0) goto L_0x000c
            int r0 = com.google.android.gms.internal.clearcut.C7229v.d(r8, r7, r0, r10)
            int r8 = r10.f48493a
        L_0x000c:
            r3 = r0
            if (r8 < 0) goto L_0x0025
            int r9 = r9 - r3
            if (r8 > r9) goto L_0x0025
            java.lang.Object r9 = r6.e()
            int r8 = r8 + r3
            r0 = r6
            r1 = r9
            r2 = r7
            r4 = r8
            r5 = r10
            r0.j(r1, r2, r3, r4, r5)
            r6.d(r9)
            r10.f48495c = r9
            return r8
        L_0x0025:
            com.google.android.gms.internal.clearcut.m0 r6 = com.google.android.gms.internal.clearcut.C7204m0.a()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.Q0.m(com.google.android.gms.internal.clearcut.d1, byte[], int, int, com.google.android.gms.internal.clearcut.w):int");
    }

    private static <UT, UB> int n(C7231v1<UT, UB> v1Var, T t10) {
        return v1Var.j(v1Var.k(t10));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0062, code lost:
        r3 = java.lang.Long.valueOf(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0073, code lost:
        r3 = java.lang.Integer.valueOf(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00b1, code lost:
        r12.putObject(r1, r9, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00bc, code lost:
        r2 = r2 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00bd, code lost:
        r12.putInt(r1, r13, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0130, code lost:
        r12.putObject(r1, r9, r2);
        r2 = r4 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0141, code lost:
        r12.putObject(r1, r9, r2);
        r2 = r4 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:?, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:?, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int o(T r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, int r25, long r26, int r28, com.google.android.gms.internal.clearcut.C7232w r29) {
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
            sun.misc.Unsafe r12 = f48232s
            int[] r7 = r0.f48233a
            int r13 = r6 + 2
            r7 = r7[r13]
            r13 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r7 & r13
            long r13 = (long) r7
            r7 = 5
            r15 = 2
            switch(r25) {
                case 51: goto L_0x0167;
                case 52: goto L_0x015c;
                case 53: goto L_0x0152;
                case 54: goto L_0x0152;
                case 55: goto L_0x0148;
                case 56: goto L_0x0136;
                case 57: goto L_0x0126;
                case 58: goto L_0x0110;
                case 59: goto L_0x00e4;
                case 60: goto L_0x00c2;
                case 61: goto L_0x00a5;
                case 62: goto L_0x0148;
                case 63: goto L_0x0078;
                case 64: goto L_0x0126;
                case 65: goto L_0x0136;
                case 66: goto L_0x0067;
                case 67: goto L_0x0056;
                case 68: goto L_0x0028;
                default: goto L_0x0026;
            }
        L_0x0026:
            goto L_0x0173
        L_0x0028:
            r7 = 3
            if (r5 != r7) goto L_0x0173
            r2 = r2 & -8
            r7 = r2 | 4
            com.google.android.gms.internal.clearcut.d1 r2 = r0.C(r6)
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r7
            r7 = r29
            int r2 = l(r2, r3, r4, r5, r6, r7)
            int r3 = r12.getInt(r1, r13)
            if (r3 != r8) goto L_0x004b
            java.lang.Object r15 = r12.getObject(r1, r9)
            goto L_0x004c
        L_0x004b:
            r15 = 0
        L_0x004c:
            java.lang.Object r3 = r11.f48495c
            if (r15 != 0) goto L_0x0051
            goto L_0x00b1
        L_0x0051:
            java.lang.Object r3 = com.google.android.gms.internal.clearcut.C7192i0.d(r15, r3)
            goto L_0x00b1
        L_0x0056:
            if (r5 != 0) goto L_0x0173
            int r2 = com.google.android.gms.internal.clearcut.C7229v.g(r3, r4, r11)
            long r3 = r11.f48494b
            long r3 = com.google.android.gms.internal.clearcut.J.a(r3)
        L_0x0062:
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            goto L_0x00b1
        L_0x0067:
            if (r5 != 0) goto L_0x0173
            int r2 = com.google.android.gms.internal.clearcut.C7229v.e(r3, r4, r11)
            int r3 = r11.f48493a
            int r3 = com.google.android.gms.internal.clearcut.J.e(r3)
        L_0x0073:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x00b1
        L_0x0078:
            if (r5 != 0) goto L_0x0173
            int r3 = com.google.android.gms.internal.clearcut.C7229v.e(r3, r4, r11)
            int r4 = r11.f48493a
            com.google.android.gms.internal.clearcut.k0 r5 = r0.E(r6)
            if (r5 == 0) goto L_0x009c
            com.google.android.gms.internal.clearcut.j0 r5 = r5.d(r4)
            if (r5 == 0) goto L_0x008d
            goto L_0x009c
        L_0x008d:
            com.google.android.gms.internal.clearcut.w1 r1 = T(r17)
            long r4 = (long) r4
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r1.e(r2, r4)
            r2 = r3
            goto L_0x0174
        L_0x009c:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r12.putObject(r1, r9, r2)
            r2 = r3
            goto L_0x00bd
        L_0x00a5:
            if (r5 != r15) goto L_0x0173
            int r2 = com.google.android.gms.internal.clearcut.C7229v.e(r3, r4, r11)
            int r4 = r11.f48493a
            if (r4 != 0) goto L_0x00b5
            com.google.android.gms.internal.clearcut.A r3 = com.google.android.gms.internal.clearcut.A.f48133b
        L_0x00b1:
            r12.putObject(r1, r9, r3)
            goto L_0x00bd
        L_0x00b5:
            com.google.android.gms.internal.clearcut.A r3 = com.google.android.gms.internal.clearcut.A.r(r3, r2, r4)
            r12.putObject(r1, r9, r3)
        L_0x00bc:
            int r2 = r2 + r4
        L_0x00bd:
            r12.putInt(r1, r13, r8)
            goto L_0x0174
        L_0x00c2:
            if (r5 != r15) goto L_0x0173
            com.google.android.gms.internal.clearcut.d1 r2 = r0.C(r6)
            r5 = r20
            int r2 = m(r2, r3, r4, r5, r11)
            int r3 = r12.getInt(r1, r13)
            if (r3 != r8) goto L_0x00d9
            java.lang.Object r15 = r12.getObject(r1, r9)
            goto L_0x00da
        L_0x00d9:
            r15 = 0
        L_0x00da:
            java.lang.Object r3 = r11.f48495c
            if (r15 != 0) goto L_0x00df
        L_0x00de:
            goto L_0x00b1
        L_0x00df:
            java.lang.Object r3 = com.google.android.gms.internal.clearcut.C7192i0.d(r15, r3)
            goto L_0x00de
        L_0x00e4:
            if (r5 != r15) goto L_0x0173
            int r2 = com.google.android.gms.internal.clearcut.C7229v.e(r3, r4, r11)
            int r4 = r11.f48493a
            if (r4 != 0) goto L_0x00f1
            java.lang.String r3 = ""
            goto L_0x00b1
        L_0x00f1:
            r5 = 536870912(0x20000000, float:1.0842022E-19)
            r5 = r24 & r5
            if (r5 == 0) goto L_0x0105
            int r5 = r2 + r4
            boolean r5 = com.google.android.gms.internal.clearcut.E1.i(r3, r2, r5)
            if (r5 == 0) goto L_0x0100
            goto L_0x0105
        L_0x0100:
            com.google.android.gms.internal.clearcut.m0 r1 = com.google.android.gms.internal.clearcut.C7204m0.e()
            throw r1
        L_0x0105:
            java.lang.String r5 = new java.lang.String
            java.nio.charset.Charset r6 = com.google.android.gms.internal.clearcut.C7192i0.f48408a
            r5.<init>(r3, r2, r4, r6)
            r12.putObject(r1, r9, r5)
            goto L_0x00bc
        L_0x0110:
            if (r5 != 0) goto L_0x0173
            int r2 = com.google.android.gms.internal.clearcut.C7229v.g(r3, r4, r11)
            long r3 = r11.f48494b
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L_0x0120
            r15 = 1
            goto L_0x0121
        L_0x0120:
            r15 = 0
        L_0x0121:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r15)
            goto L_0x00b1
        L_0x0126:
            if (r5 != r7) goto L_0x0173
            int r2 = com.google.android.gms.internal.clearcut.C7229v.h(r18, r19)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
        L_0x0130:
            r12.putObject(r1, r9, r2)
            int r2 = r4 + 4
            goto L_0x00bd
        L_0x0136:
            r2 = 1
            if (r5 != r2) goto L_0x0173
            long r2 = com.google.android.gms.internal.clearcut.C7229v.k(r18, r19)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
        L_0x0141:
            r12.putObject(r1, r9, r2)
            int r2 = r4 + 8
            goto L_0x00bd
        L_0x0148:
            if (r5 != 0) goto L_0x0173
            int r2 = com.google.android.gms.internal.clearcut.C7229v.e(r3, r4, r11)
            int r3 = r11.f48493a
            goto L_0x0073
        L_0x0152:
            if (r5 != 0) goto L_0x0173
            int r2 = com.google.android.gms.internal.clearcut.C7229v.g(r3, r4, r11)
            long r3 = r11.f48494b
            goto L_0x0062
        L_0x015c:
            if (r5 != r7) goto L_0x0173
            float r2 = com.google.android.gms.internal.clearcut.C7229v.n(r18, r19)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            goto L_0x0130
        L_0x0167:
            r2 = 1
            if (r5 != r2) goto L_0x0173
            double r2 = com.google.android.gms.internal.clearcut.C7229v.l(r18, r19)
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            goto L_0x0141
        L_0x0173:
            r2 = r4
        L_0x0174:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.Q0.o(java.lang.Object, byte[], int, int, int, int, int, int, int, long, int, com.google.android.gms.internal.clearcut.w):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0235, code lost:
        if (r7.f48494b != 0) goto L_0x0237;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0237, code lost:
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0239, code lost:
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x023a, code lost:
        r12.i(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x023d, code lost:
        if (r4 >= r5) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x023f, code lost:
        r6 = com.google.android.gms.internal.clearcut.C7229v.e(r3, r4, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0245, code lost:
        if (r2 != r7.f48493a) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0247, code lost:
        r4 = com.google.android.gms.internal.clearcut.C7229v.g(r3, r6, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x024f, code lost:
        if (r7.f48494b == 0) goto L_0x0239;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:?, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:?, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:?, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:?, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0139, code lost:
        if (r4 == 0) goto L_0x013b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x013b, code lost:
        r12.add(com.google.android.gms.internal.clearcut.A.f48133b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0141, code lost:
        r12.add(com.google.android.gms.internal.clearcut.A.r(r3, r1, r4));
        r1 = r1 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0149, code lost:
        if (r1 >= r5) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x014b, code lost:
        r4 = com.google.android.gms.internal.clearcut.C7229v.e(r3, r1, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0151, code lost:
        if (r2 != r7.f48493a) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0153, code lost:
        r1 = com.google.android.gms.internal.clearcut.C7229v.e(r3, r4, r7);
        r4 = r7.f48493a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0159, code lost:
        if (r4 != 0) goto L_0x0141;
     */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x019c  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01d6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int p(T r16, byte[] r17, int r18, int r19, int r20, int r21, int r22, int r23, long r24, int r26, long r27, com.google.android.gms.internal.clearcut.C7232w r29) {
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
            sun.misc.Unsafe r11 = f48232s
            java.lang.Object r12 = r11.getObject(r1, r9)
            com.google.android.gms.internal.clearcut.l0 r12 = (com.google.android.gms.internal.clearcut.C7201l0) r12
            boolean r13 = r12.N()
            r14 = 1
            if (r13 != 0) goto L_0x0033
            int r13 = r12.size()
            if (r13 != 0) goto L_0x002b
            r13 = 10
            goto L_0x002c
        L_0x002b:
            int r13 = r13 << r14
        L_0x002c:
            com.google.android.gms.internal.clearcut.l0 r12 = r12.R0(r13)
            r11.putObject(r1, r9, r12)
        L_0x0033:
            r9 = 5
            r10 = 0
            r13 = 2
            switch(r26) {
                case 18: goto L_0x0360;
                case 19: goto L_0x0322;
                case 20: goto L_0x02ea;
                case 21: goto L_0x02ea;
                case 22: goto L_0x02d0;
                case 23: goto L_0x0291;
                case 24: goto L_0x0252;
                case 25: goto L_0x0201;
                case 26: goto L_0x0176;
                case 27: goto L_0x015c;
                case 28: goto L_0x0131;
                case 29: goto L_0x02d0;
                case 30: goto L_0x00f9;
                case 31: goto L_0x0252;
                case 32: goto L_0x0291;
                case 33: goto L_0x00b9;
                case 34: goto L_0x0079;
                case 35: goto L_0x0360;
                case 36: goto L_0x0322;
                case 37: goto L_0x02ea;
                case 38: goto L_0x02ea;
                case 39: goto L_0x02d0;
                case 40: goto L_0x0291;
                case 41: goto L_0x0252;
                case 42: goto L_0x0201;
                case 43: goto L_0x02d0;
                case 44: goto L_0x00f9;
                case 45: goto L_0x0252;
                case 46: goto L_0x0291;
                case 47: goto L_0x00b9;
                case 48: goto L_0x0079;
                case 49: goto L_0x003b;
                default: goto L_0x003a;
            }
        L_0x003a:
            goto L_0x0076
        L_0x003b:
            r1 = 3
            if (r6 != r1) goto L_0x0076
            com.google.android.gms.internal.clearcut.d1 r1 = r15.C(r8)
            r6 = r2 & -8
            r6 = r6 | 4
            r21 = r1
            r22 = r17
            r23 = r18
            r24 = r19
            r25 = r6
            r26 = r29
            int r4 = l(r21, r22, r23, r24, r25, r26)
        L_0x0056:
            java.lang.Object r8 = r7.f48495c
            r12.add(r8)
            if (r4 >= r5) goto L_0x0076
            int r8 = com.google.android.gms.internal.clearcut.C7229v.e(r3, r4, r7)
            int r9 = r7.f48493a
            if (r2 != r9) goto L_0x0076
            r21 = r1
            r22 = r17
            r23 = r8
            r24 = r19
            r25 = r6
            r26 = r29
            int r4 = l(r21, r22, r23, r24, r25, r26)
            goto L_0x0056
        L_0x0076:
            r1 = r4
            goto L_0x039e
        L_0x0079:
            if (r6 != r13) goto L_0x009d
            com.google.android.gms.internal.clearcut.A0 r12 = (com.google.android.gms.internal.clearcut.A0) r12
            int r1 = com.google.android.gms.internal.clearcut.C7229v.e(r3, r4, r7)
            int r2 = r7.f48493a
            int r2 = r2 + r1
        L_0x0084:
            if (r1 >= r2) goto L_0x0094
            int r1 = com.google.android.gms.internal.clearcut.C7229v.g(r3, r1, r7)
            long r4 = r7.f48494b
            long r4 = com.google.android.gms.internal.clearcut.J.a(r4)
            r12.p(r4)
            goto L_0x0084
        L_0x0094:
            if (r1 != r2) goto L_0x0098
            goto L_0x039e
        L_0x0098:
            com.google.android.gms.internal.clearcut.m0 r1 = com.google.android.gms.internal.clearcut.C7204m0.a()
            throw r1
        L_0x009d:
            if (r6 != 0) goto L_0x0076
            com.google.android.gms.internal.clearcut.A0 r12 = (com.google.android.gms.internal.clearcut.A0) r12
        L_0x00a1:
            int r1 = com.google.android.gms.internal.clearcut.C7229v.g(r3, r4, r7)
            long r8 = r7.f48494b
            long r8 = com.google.android.gms.internal.clearcut.J.a(r8)
            r12.p(r8)
            if (r1 >= r5) goto L_0x039e
            int r4 = com.google.android.gms.internal.clearcut.C7229v.e(r3, r1, r7)
            int r6 = r7.f48493a
            if (r2 != r6) goto L_0x039e
            goto L_0x00a1
        L_0x00b9:
            if (r6 != r13) goto L_0x00dd
            com.google.android.gms.internal.clearcut.h0 r12 = (com.google.android.gms.internal.clearcut.C7189h0) r12
            int r1 = com.google.android.gms.internal.clearcut.C7229v.e(r3, r4, r7)
            int r2 = r7.f48493a
            int r2 = r2 + r1
        L_0x00c4:
            if (r1 >= r2) goto L_0x00d4
            int r1 = com.google.android.gms.internal.clearcut.C7229v.e(r3, r1, r7)
            int r4 = r7.f48493a
            int r4 = com.google.android.gms.internal.clearcut.J.e(r4)
            r12.i(r4)
            goto L_0x00c4
        L_0x00d4:
            if (r1 != r2) goto L_0x00d8
            goto L_0x039e
        L_0x00d8:
            com.google.android.gms.internal.clearcut.m0 r1 = com.google.android.gms.internal.clearcut.C7204m0.a()
            throw r1
        L_0x00dd:
            if (r6 != 0) goto L_0x0076
            com.google.android.gms.internal.clearcut.h0 r12 = (com.google.android.gms.internal.clearcut.C7189h0) r12
        L_0x00e1:
            int r1 = com.google.android.gms.internal.clearcut.C7229v.e(r3, r4, r7)
            int r4 = r7.f48493a
            int r4 = com.google.android.gms.internal.clearcut.J.e(r4)
            r12.i(r4)
            if (r1 >= r5) goto L_0x039e
            int r4 = com.google.android.gms.internal.clearcut.C7229v.e(r3, r1, r7)
            int r6 = r7.f48493a
            if (r2 != r6) goto L_0x039e
            goto L_0x00e1
        L_0x00f9:
            if (r6 != r13) goto L_0x0100
            int r2 = com.google.android.gms.internal.clearcut.C7229v.f(r3, r4, r12, r7)
            goto L_0x0111
        L_0x0100:
            if (r6 != 0) goto L_0x0076
            r2 = r20
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r12
            r7 = r29
            int r2 = com.google.android.gms.internal.clearcut.C7229v.b(r2, r3, r4, r5, r6, r7)
        L_0x0111:
            com.google.android.gms.internal.clearcut.g0 r1 = (com.google.android.gms.internal.clearcut.C7186g0) r1
            com.google.android.gms.internal.clearcut.w1 r3 = r1.zzjp
            com.google.android.gms.internal.clearcut.w1 r4 = com.google.android.gms.internal.clearcut.C7234w1.h()
            if (r3 != r4) goto L_0x011c
            r3 = 0
        L_0x011c:
            com.google.android.gms.internal.clearcut.k0 r4 = r15.E(r8)
            com.google.android.gms.internal.clearcut.v1<?, ?> r5 = r0.f48248p
            r6 = r21
            java.lang.Object r3 = com.google.android.gms.internal.clearcut.C7184f1.c(r6, r12, r4, r3, r5)
            com.google.android.gms.internal.clearcut.w1 r3 = (com.google.android.gms.internal.clearcut.C7234w1) r3
            if (r3 == 0) goto L_0x012e
            r1.zzjp = r3
        L_0x012e:
            r1 = r2
            goto L_0x039e
        L_0x0131:
            if (r6 != r13) goto L_0x0076
            int r1 = com.google.android.gms.internal.clearcut.C7229v.e(r3, r4, r7)
            int r4 = r7.f48493a
            if (r4 != 0) goto L_0x0141
        L_0x013b:
            com.google.android.gms.internal.clearcut.A r4 = com.google.android.gms.internal.clearcut.A.f48133b
            r12.add(r4)
            goto L_0x0149
        L_0x0141:
            com.google.android.gms.internal.clearcut.A r6 = com.google.android.gms.internal.clearcut.A.r(r3, r1, r4)
            r12.add(r6)
            int r1 = r1 + r4
        L_0x0149:
            if (r1 >= r5) goto L_0x039e
            int r4 = com.google.android.gms.internal.clearcut.C7229v.e(r3, r1, r7)
            int r6 = r7.f48493a
            if (r2 != r6) goto L_0x039e
            int r1 = com.google.android.gms.internal.clearcut.C7229v.e(r3, r4, r7)
            int r4 = r7.f48493a
            if (r4 != 0) goto L_0x0141
            goto L_0x013b
        L_0x015c:
            if (r6 != r13) goto L_0x0076
            com.google.android.gms.internal.clearcut.d1 r1 = r15.C(r8)
            r21 = r1
            r22 = r20
            r23 = r17
            r24 = r18
            r25 = r19
            r26 = r12
            r27 = r29
            int r1 = k(r21, r22, r23, r24, r25, r26, r27)
            goto L_0x039e
        L_0x0176:
            if (r6 != r13) goto L_0x0076
            r8 = 536870912(0x20000000, double:2.652494739E-315)
            long r8 = r24 & r8
            int r1 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            java.lang.String r6 = ""
            if (r1 != 0) goto L_0x01b5
            int r1 = com.google.android.gms.internal.clearcut.C7229v.e(r3, r4, r7)
            int r4 = r7.f48493a
            if (r4 != 0) goto L_0x018f
        L_0x018b:
            r12.add(r6)
            goto L_0x019a
        L_0x018f:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = com.google.android.gms.internal.clearcut.C7192i0.f48408a
            r8.<init>(r3, r1, r4, r9)
        L_0x0196:
            r12.add(r8)
            int r1 = r1 + r4
        L_0x019a:
            if (r1 >= r5) goto L_0x039e
            int r4 = com.google.android.gms.internal.clearcut.C7229v.e(r3, r1, r7)
            int r8 = r7.f48493a
            if (r2 != r8) goto L_0x039e
            int r1 = com.google.android.gms.internal.clearcut.C7229v.e(r3, r4, r7)
            int r4 = r7.f48493a
            if (r4 != 0) goto L_0x01ad
            goto L_0x018b
        L_0x01ad:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = com.google.android.gms.internal.clearcut.C7192i0.f48408a
            r8.<init>(r3, r1, r4, r9)
            goto L_0x0196
        L_0x01b5:
            int r1 = com.google.android.gms.internal.clearcut.C7229v.e(r3, r4, r7)
            int r4 = r7.f48493a
            if (r4 != 0) goto L_0x01c1
        L_0x01bd:
            r12.add(r6)
            goto L_0x01d4
        L_0x01c1:
            int r8 = r1 + r4
            boolean r9 = com.google.android.gms.internal.clearcut.E1.i(r3, r1, r8)
            if (r9 == 0) goto L_0x01fc
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = com.google.android.gms.internal.clearcut.C7192i0.f48408a
            r9.<init>(r3, r1, r4, r10)
        L_0x01d0:
            r12.add(r9)
            r1 = r8
        L_0x01d4:
            if (r1 >= r5) goto L_0x039e
            int r4 = com.google.android.gms.internal.clearcut.C7229v.e(r3, r1, r7)
            int r8 = r7.f48493a
            if (r2 != r8) goto L_0x039e
            int r1 = com.google.android.gms.internal.clearcut.C7229v.e(r3, r4, r7)
            int r4 = r7.f48493a
            if (r4 != 0) goto L_0x01e7
            goto L_0x01bd
        L_0x01e7:
            int r8 = r1 + r4
            boolean r9 = com.google.android.gms.internal.clearcut.E1.i(r3, r1, r8)
            if (r9 == 0) goto L_0x01f7
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = com.google.android.gms.internal.clearcut.C7192i0.f48408a
            r9.<init>(r3, r1, r4, r10)
            goto L_0x01d0
        L_0x01f7:
            com.google.android.gms.internal.clearcut.m0 r1 = com.google.android.gms.internal.clearcut.C7204m0.e()
            throw r1
        L_0x01fc:
            com.google.android.gms.internal.clearcut.m0 r1 = com.google.android.gms.internal.clearcut.C7204m0.e()
            throw r1
        L_0x0201:
            r1 = 0
            if (r6 != r13) goto L_0x0229
            com.google.android.gms.internal.clearcut.x r12 = (com.google.android.gms.internal.clearcut.C7235x) r12
            int r2 = com.google.android.gms.internal.clearcut.C7229v.e(r3, r4, r7)
            int r4 = r7.f48493a
            int r4 = r4 + r2
        L_0x020d:
            if (r2 >= r4) goto L_0x0220
            int r2 = com.google.android.gms.internal.clearcut.C7229v.g(r3, r2, r7)
            long r5 = r7.f48494b
            int r5 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r5 == 0) goto L_0x021b
            r5 = r14
            goto L_0x021c
        L_0x021b:
            r5 = r1
        L_0x021c:
            r12.i(r5)
            goto L_0x020d
        L_0x0220:
            if (r2 != r4) goto L_0x0224
            goto L_0x012e
        L_0x0224:
            com.google.android.gms.internal.clearcut.m0 r1 = com.google.android.gms.internal.clearcut.C7204m0.a()
            throw r1
        L_0x0229:
            if (r6 != 0) goto L_0x0076
            com.google.android.gms.internal.clearcut.x r12 = (com.google.android.gms.internal.clearcut.C7235x) r12
            int r4 = com.google.android.gms.internal.clearcut.C7229v.g(r3, r4, r7)
            long r8 = r7.f48494b
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 == 0) goto L_0x0239
        L_0x0237:
            r6 = r14
            goto L_0x023a
        L_0x0239:
            r6 = r1
        L_0x023a:
            r12.i(r6)
            if (r4 >= r5) goto L_0x0076
            int r6 = com.google.android.gms.internal.clearcut.C7229v.e(r3, r4, r7)
            int r8 = r7.f48493a
            if (r2 != r8) goto L_0x0076
            int r4 = com.google.android.gms.internal.clearcut.C7229v.g(r3, r6, r7)
            long r8 = r7.f48494b
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 == 0) goto L_0x0239
            goto L_0x0237
        L_0x0252:
            if (r6 != r13) goto L_0x0272
            com.google.android.gms.internal.clearcut.h0 r12 = (com.google.android.gms.internal.clearcut.C7189h0) r12
            int r1 = com.google.android.gms.internal.clearcut.C7229v.e(r3, r4, r7)
            int r2 = r7.f48493a
            int r2 = r2 + r1
        L_0x025d:
            if (r1 >= r2) goto L_0x0269
            int r4 = com.google.android.gms.internal.clearcut.C7229v.h(r3, r1)
            r12.i(r4)
            int r1 = r1 + 4
            goto L_0x025d
        L_0x0269:
            if (r1 != r2) goto L_0x026d
            goto L_0x039e
        L_0x026d:
            com.google.android.gms.internal.clearcut.m0 r1 = com.google.android.gms.internal.clearcut.C7204m0.a()
            throw r1
        L_0x0272:
            if (r6 != r9) goto L_0x0076
            com.google.android.gms.internal.clearcut.h0 r12 = (com.google.android.gms.internal.clearcut.C7189h0) r12
            int r1 = com.google.android.gms.internal.clearcut.C7229v.h(r17, r18)
            r12.i(r1)
        L_0x027d:
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x039e
            int r4 = com.google.android.gms.internal.clearcut.C7229v.e(r3, r1, r7)
            int r6 = r7.f48493a
            if (r2 != r6) goto L_0x039e
            int r1 = com.google.android.gms.internal.clearcut.C7229v.h(r3, r4)
            r12.i(r1)
            goto L_0x027d
        L_0x0291:
            if (r6 != r13) goto L_0x02b1
            com.google.android.gms.internal.clearcut.A0 r12 = (com.google.android.gms.internal.clearcut.A0) r12
            int r1 = com.google.android.gms.internal.clearcut.C7229v.e(r3, r4, r7)
            int r2 = r7.f48493a
            int r2 = r2 + r1
        L_0x029c:
            if (r1 >= r2) goto L_0x02a8
            long r4 = com.google.android.gms.internal.clearcut.C7229v.k(r3, r1)
            r12.p(r4)
            int r1 = r1 + 8
            goto L_0x029c
        L_0x02a8:
            if (r1 != r2) goto L_0x02ac
            goto L_0x039e
        L_0x02ac:
            com.google.android.gms.internal.clearcut.m0 r1 = com.google.android.gms.internal.clearcut.C7204m0.a()
            throw r1
        L_0x02b1:
            if (r6 != r14) goto L_0x0076
            com.google.android.gms.internal.clearcut.A0 r12 = (com.google.android.gms.internal.clearcut.A0) r12
            long r8 = com.google.android.gms.internal.clearcut.C7229v.k(r17, r18)
            r12.p(r8)
        L_0x02bc:
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x039e
            int r4 = com.google.android.gms.internal.clearcut.C7229v.e(r3, r1, r7)
            int r6 = r7.f48493a
            if (r2 != r6) goto L_0x039e
            long r8 = com.google.android.gms.internal.clearcut.C7229v.k(r3, r4)
            r12.p(r8)
            goto L_0x02bc
        L_0x02d0:
            if (r6 != r13) goto L_0x02d8
            int r1 = com.google.android.gms.internal.clearcut.C7229v.f(r3, r4, r12, r7)
            goto L_0x039e
        L_0x02d8:
            if (r6 != 0) goto L_0x0076
            r21 = r17
            r22 = r18
            r23 = r19
            r24 = r12
            r25 = r29
            int r1 = com.google.android.gms.internal.clearcut.C7229v.b(r20, r21, r22, r23, r24, r25)
            goto L_0x039e
        L_0x02ea:
            if (r6 != r13) goto L_0x030a
            com.google.android.gms.internal.clearcut.A0 r12 = (com.google.android.gms.internal.clearcut.A0) r12
            int r1 = com.google.android.gms.internal.clearcut.C7229v.e(r3, r4, r7)
            int r2 = r7.f48493a
            int r2 = r2 + r1
        L_0x02f5:
            if (r1 >= r2) goto L_0x0301
            int r1 = com.google.android.gms.internal.clearcut.C7229v.g(r3, r1, r7)
            long r4 = r7.f48494b
            r12.p(r4)
            goto L_0x02f5
        L_0x0301:
            if (r1 != r2) goto L_0x0305
            goto L_0x039e
        L_0x0305:
            com.google.android.gms.internal.clearcut.m0 r1 = com.google.android.gms.internal.clearcut.C7204m0.a()
            throw r1
        L_0x030a:
            if (r6 != 0) goto L_0x0076
            com.google.android.gms.internal.clearcut.A0 r12 = (com.google.android.gms.internal.clearcut.A0) r12
        L_0x030e:
            int r1 = com.google.android.gms.internal.clearcut.C7229v.g(r3, r4, r7)
            long r8 = r7.f48494b
            r12.p(r8)
            if (r1 >= r5) goto L_0x039e
            int r4 = com.google.android.gms.internal.clearcut.C7229v.e(r3, r1, r7)
            int r6 = r7.f48493a
            if (r2 != r6) goto L_0x039e
            goto L_0x030e
        L_0x0322:
            if (r6 != r13) goto L_0x0341
            com.google.android.gms.internal.clearcut.e0 r12 = (com.google.android.gms.internal.clearcut.C7180e0) r12
            int r1 = com.google.android.gms.internal.clearcut.C7229v.e(r3, r4, r7)
            int r2 = r7.f48493a
            int r2 = r2 + r1
        L_0x032d:
            if (r1 >= r2) goto L_0x0339
            float r4 = com.google.android.gms.internal.clearcut.C7229v.n(r3, r1)
            r12.i(r4)
            int r1 = r1 + 4
            goto L_0x032d
        L_0x0339:
            if (r1 != r2) goto L_0x033c
            goto L_0x039e
        L_0x033c:
            com.google.android.gms.internal.clearcut.m0 r1 = com.google.android.gms.internal.clearcut.C7204m0.a()
            throw r1
        L_0x0341:
            if (r6 != r9) goto L_0x0076
            com.google.android.gms.internal.clearcut.e0 r12 = (com.google.android.gms.internal.clearcut.C7180e0) r12
            float r1 = com.google.android.gms.internal.clearcut.C7229v.n(r17, r18)
            r12.i(r1)
        L_0x034c:
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x039e
            int r4 = com.google.android.gms.internal.clearcut.C7229v.e(r3, r1, r7)
            int r6 = r7.f48493a
            if (r2 != r6) goto L_0x039e
            float r1 = com.google.android.gms.internal.clearcut.C7229v.n(r3, r4)
            r12.i(r1)
            goto L_0x034c
        L_0x0360:
            if (r6 != r13) goto L_0x037f
            com.google.android.gms.internal.clearcut.P r12 = (com.google.android.gms.internal.clearcut.P) r12
            int r1 = com.google.android.gms.internal.clearcut.C7229v.e(r3, r4, r7)
            int r2 = r7.f48493a
            int r2 = r2 + r1
        L_0x036b:
            if (r1 >= r2) goto L_0x0377
            double r4 = com.google.android.gms.internal.clearcut.C7229v.l(r3, r1)
            r12.i(r4)
            int r1 = r1 + 8
            goto L_0x036b
        L_0x0377:
            if (r1 != r2) goto L_0x037a
            goto L_0x039e
        L_0x037a:
            com.google.android.gms.internal.clearcut.m0 r1 = com.google.android.gms.internal.clearcut.C7204m0.a()
            throw r1
        L_0x037f:
            if (r6 != r14) goto L_0x0076
            com.google.android.gms.internal.clearcut.P r12 = (com.google.android.gms.internal.clearcut.P) r12
            double r8 = com.google.android.gms.internal.clearcut.C7229v.l(r17, r18)
            r12.i(r8)
        L_0x038a:
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x039e
            int r4 = com.google.android.gms.internal.clearcut.C7229v.e(r3, r1, r7)
            int r6 = r7.f48493a
            if (r2 != r6) goto L_0x039e
            double r8 = com.google.android.gms.internal.clearcut.C7229v.l(r3, r4)
            r12.i(r8)
            goto L_0x038a
        L_0x039e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.Q0.p(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.gms.internal.clearcut.w):int");
    }

    private final <K, V> int q(T t10, byte[] bArr, int i10, int i11, int i12, int i13, long j10, C7232w wVar) {
        Unsafe unsafe = f48232s;
        Object D10 = D(i12);
        Object object = unsafe.getObject(t10, j10);
        if (this.f48250r.h(object)) {
            Object f10 = this.f48250r.f(D10);
            this.f48250r.c(f10, object);
            unsafe.putObject(t10, j10, f10);
            object = f10;
        }
        this.f48250r.e(D10);
        this.f48250r.i(object);
        int e10 = C7229v.e(bArr, i10, wVar);
        int i14 = wVar.f48493a;
        if (i14 < 0 || i14 > i11 - e10) {
            throw C7204m0.a();
        }
        throw null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v39, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v40, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v15, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0265, code lost:
        r2 = r8;
        r27 = r9;
        r6 = r13;
        r8 = r18;
        r9 = r35;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x02f1, code lost:
        if (r0 == r15) goto L_0x02f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x02fe, code lost:
        r15 = r30;
        r14 = r31;
        r12 = r32;
        r13 = r34;
        r11 = r36;
        r8 = r18;
        r1 = r19;
        r7 = r26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0346, code lost:
        if (r0 == r15) goto L_0x02f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0361, code lost:
        if (r0 == r15) goto L_0x02f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0078, code lost:
        r18 = r8;
        r8 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b1, code lost:
        r13 = r34;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b3, code lost:
        r1 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b5, code lost:
        r10 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00bb, code lost:
        r12 = r32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00bd, code lost:
        r10 = r34;
        r13 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0125, code lost:
        r1 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x012f, code lost:
        r7 = r7 | r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0134, code lost:
        r10 = r34;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0174, code lost:
        r7 = r7 | r20;
        r1 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0177, code lost:
        r13 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0197, code lost:
        r9.putObject(r14, r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01e8, code lost:
        r0 = r8 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01ea, code lost:
        r7 = r7 | r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01ec, code lost:
        r1 = r13;
        r8 = r18;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int r(T r31, byte[] r32, int r33, int r34, int r35, com.google.android.gms.internal.clearcut.C7232w r36) {
        /*
            r30 = this;
            r15 = r30
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r36
            sun.misc.Unsafe r9 = f48232s
            r10 = -1
            r16 = 0
            r0 = r33
            r8 = r10
            r1 = r16
            r7 = r1
        L_0x0015:
            r17 = 1048575(0xfffff, float:1.469367E-39)
            if (r0 >= r13) goto L_0x0396
            int r1 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x0029
            int r0 = com.google.android.gms.internal.clearcut.C7229v.d(r0, r12, r1, r11)
            int r1 = r11.f48493a
            r4 = r0
            r6 = r1
            goto L_0x002b
        L_0x0029:
            r6 = r0
            r4 = r1
        L_0x002b:
            int r5 = r6 >>> 3
            r3 = r6 & 7
            int r2 = r15.H(r5)
            if (r2 == r10) goto L_0x0364
            int[] r0 = r15.f48233a
            int r1 = r2 + 1
            r1 = r0[r1]
            r18 = 267386880(0xff00000, float:2.3665827E-29)
            r18 = r1 & r18
            int r10 = r18 >>> 20
            r13 = r1 & r17
            long r12 = (long) r13
            r33 = r1
            r1 = 17
            r18 = r6
            if (r10 > r1) goto L_0x026f
            int r1 = r2 + 2
            r0 = r0[r1]
            int r1 = r0 >>> 20
            r6 = 1
            int r20 = r6 << r1
            r0 = r0 & r17
            if (r0 == r8) goto L_0x006a
            r1 = -1
            r19 = r2
            if (r8 == r1) goto L_0x0062
            long r1 = (long) r8
            r9.putInt(r14, r1, r7)
        L_0x0062:
            long r1 = (long) r0
            int r1 = r9.getInt(r14, r1)
            r8 = r0
            r7 = r1
            goto L_0x006c
        L_0x006a:
            r19 = r2
        L_0x006c:
            r0 = 5
            switch(r10) {
                case 0: goto L_0x024c;
                case 1: goto L_0x0231;
                case 2: goto L_0x020b;
                case 3: goto L_0x020b;
                case 4: goto L_0x01f0;
                case 5: goto L_0x01ce;
                case 6: goto L_0x01b9;
                case 7: goto L_0x019b;
                case 8: goto L_0x017a;
                case 9: goto L_0x014c;
                case 10: goto L_0x0138;
                case 11: goto L_0x01f0;
                case 12: goto L_0x00f9;
                case 13: goto L_0x01b9;
                case 14: goto L_0x01ce;
                case 15: goto L_0x00e2;
                case 16: goto L_0x00c2;
                case 17: goto L_0x007d;
                default: goto L_0x0070;
            }
        L_0x0070:
            r12 = r32
            r10 = r34
            r13 = r18
            r19 = -1
        L_0x0078:
            r18 = r8
            r8 = r4
            goto L_0x0265
        L_0x007d:
            r0 = 3
            if (r3 != r0) goto L_0x00b9
            int r0 = r5 << 3
            r5 = r0 | 4
            r2 = r19
            com.google.android.gms.internal.clearcut.d1 r0 = r15.C(r2)
            r19 = -1
            r1 = r32
            r2 = r4
            r3 = r34
            r4 = r5
            r5 = r36
            int r0 = l(r0, r1, r2, r3, r4, r5)
            r1 = r7 & r20
            if (r1 != 0) goto L_0x00a2
            java.lang.Object r1 = r11.f48495c
        L_0x009e:
            r9.putObject(r14, r12, r1)
            goto L_0x00ad
        L_0x00a2:
            java.lang.Object r1 = r9.getObject(r14, r12)
            java.lang.Object r2 = r11.f48495c
            java.lang.Object r1 = com.google.android.gms.internal.clearcut.C7192i0.d(r1, r2)
            goto L_0x009e
        L_0x00ad:
            r7 = r7 | r20
            r12 = r32
        L_0x00b1:
            r13 = r34
        L_0x00b3:
            r1 = r18
        L_0x00b5:
            r10 = r19
            goto L_0x0015
        L_0x00b9:
            r19 = -1
        L_0x00bb:
            r12 = r32
        L_0x00bd:
            r10 = r34
            r13 = r18
            goto L_0x0078
        L_0x00c2:
            r19 = -1
            if (r3 != 0) goto L_0x00bb
            r5 = r12
            r12 = r32
            int r10 = com.google.android.gms.internal.clearcut.C7229v.g(r12, r4, r11)
            long r0 = r11.f48494b
            long r21 = com.google.android.gms.internal.clearcut.J.a(r0)
            r0 = r9
            r1 = r31
            r2 = r5
            r4 = r21
            r0.putLong(r1, r2, r4)
            r7 = r7 | r20
            r13 = r34
            r0 = r10
            goto L_0x00b3
        L_0x00e2:
            r5 = r12
            r19 = -1
            r12 = r32
            if (r3 != 0) goto L_0x00bd
            int r0 = com.google.android.gms.internal.clearcut.C7229v.e(r12, r4, r11)
            int r1 = r11.f48493a
            int r1 = com.google.android.gms.internal.clearcut.J.e(r1)
            r9.putInt(r14, r5, r1)
            r7 = r7 | r20
            goto L_0x00b1
        L_0x00f9:
            r5 = r12
            r2 = r19
            r19 = -1
            r12 = r32
            if (r3 != 0) goto L_0x0132
            int r0 = com.google.android.gms.internal.clearcut.C7229v.e(r12, r4, r11)
            int r1 = r11.f48493a
            com.google.android.gms.internal.clearcut.k0 r2 = r15.E(r2)
            if (r2 == 0) goto L_0x0114
            com.google.android.gms.internal.clearcut.j0 r2 = r2.d(r1)
            if (r2 == 0) goto L_0x0117
        L_0x0114:
            r13 = r18
            goto L_0x012c
        L_0x0117:
            com.google.android.gms.internal.clearcut.w1 r2 = T(r31)
            long r3 = (long) r1
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r13 = r18
            r2.e(r13, r1)
        L_0x0125:
            r1 = r13
        L_0x0126:
            r10 = r19
            r13 = r34
            goto L_0x0015
        L_0x012c:
            r9.putInt(r14, r5, r1)
        L_0x012f:
            r7 = r7 | r20
            goto L_0x0125
        L_0x0132:
            r13 = r18
        L_0x0134:
            r10 = r34
            goto L_0x0078
        L_0x0138:
            r5 = r12
            r13 = r18
            r0 = 2
            r19 = -1
            r12 = r32
            if (r3 != r0) goto L_0x0134
            int r0 = com.google.android.gms.internal.clearcut.C7229v.m(r12, r4, r11)
            java.lang.Object r1 = r11.f48495c
            r9.putObject(r14, r5, r1)
            goto L_0x012f
        L_0x014c:
            r5 = r12
            r13 = r18
            r2 = r19
            r0 = 2
            r19 = -1
            r12 = r32
            if (r3 != r0) goto L_0x0134
            com.google.android.gms.internal.clearcut.d1 r0 = r15.C(r2)
            r10 = r34
            int r0 = m(r0, r12, r4, r10, r11)
            r1 = r7 & r20
            if (r1 != 0) goto L_0x0169
            java.lang.Object r1 = r11.f48495c
            goto L_0x0197
        L_0x0169:
            java.lang.Object r1 = r9.getObject(r14, r5)
            java.lang.Object r2 = r11.f48495c
            java.lang.Object r1 = com.google.android.gms.internal.clearcut.C7192i0.d(r1, r2)
            goto L_0x0197
        L_0x0174:
            r7 = r7 | r20
            r1 = r13
        L_0x0177:
            r13 = r10
            goto L_0x00b5
        L_0x017a:
            r10 = r34
            r5 = r12
            r13 = r18
            r0 = 2
            r19 = -1
            r12 = r32
            if (r3 != r0) goto L_0x0078
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r33 & r0
            if (r0 != 0) goto L_0x0191
            int r0 = com.google.android.gms.internal.clearcut.C7229v.i(r12, r4, r11)
            goto L_0x0195
        L_0x0191:
            int r0 = com.google.android.gms.internal.clearcut.C7229v.j(r12, r4, r11)
        L_0x0195:
            java.lang.Object r1 = r11.f48495c
        L_0x0197:
            r9.putObject(r14, r5, r1)
            goto L_0x0174
        L_0x019b:
            r10 = r34
            r1 = r12
            r13 = r18
            r19 = -1
            r12 = r32
            if (r3 != 0) goto L_0x0078
            int r0 = com.google.android.gms.internal.clearcut.C7229v.g(r12, r4, r11)
            long r3 = r11.f48494b
            r17 = 0
            int r3 = (r3 > r17 ? 1 : (r3 == r17 ? 0 : -1))
            if (r3 == 0) goto L_0x01b3
            goto L_0x01b5
        L_0x01b3:
            r6 = r16
        L_0x01b5:
            com.google.android.gms.internal.clearcut.C1.j(r14, r1, r6)
            goto L_0x0174
        L_0x01b9:
            r10 = r34
            r1 = r12
            r13 = r18
            r19 = -1
            r12 = r32
            if (r3 != r0) goto L_0x0078
            int r0 = com.google.android.gms.internal.clearcut.C7229v.h(r12, r4)
            r9.putInt(r14, r1, r0)
            int r0 = r4 + 4
            goto L_0x0174
        L_0x01ce:
            r10 = r34
            r1 = r12
            r13 = r18
            r19 = -1
            r12 = r32
            if (r3 != r6) goto L_0x0078
            long r5 = com.google.android.gms.internal.clearcut.C7229v.k(r12, r4)
            r0 = r9
            r2 = r1
            r1 = r31
            r18 = r8
            r8 = r4
            r4 = r5
            r0.putLong(r1, r2, r4)
        L_0x01e8:
            int r0 = r8 + 8
        L_0x01ea:
            r7 = r7 | r20
        L_0x01ec:
            r1 = r13
            r8 = r18
            goto L_0x0177
        L_0x01f0:
            r10 = r34
            r19 = -1
            r28 = r12
            r12 = r32
            r13 = r18
            r18 = r8
            r8 = r4
            r4 = r28
            if (r3 != 0) goto L_0x0265
            int r0 = com.google.android.gms.internal.clearcut.C7229v.e(r12, r8, r11)
            int r1 = r11.f48493a
            r9.putInt(r14, r4, r1)
            goto L_0x01ea
        L_0x020b:
            r10 = r34
            r19 = -1
            r28 = r12
            r12 = r32
            r13 = r18
            r18 = r8
            r8 = r4
            r4 = r28
            if (r3 != 0) goto L_0x0265
            int r6 = com.google.android.gms.internal.clearcut.C7229v.g(r12, r8, r11)
            long r2 = r11.f48494b
            r0 = r9
            r1 = r31
            r21 = r2
            r2 = r4
            r4 = r21
            r0.putLong(r1, r2, r4)
            r7 = r7 | r20
            r0 = r6
            goto L_0x01ec
        L_0x0231:
            r10 = r34
            r19 = -1
            r28 = r12
            r12 = r32
            r13 = r18
            r18 = r8
            r8 = r4
            r4 = r28
            if (r3 != r0) goto L_0x0265
            float r0 = com.google.android.gms.internal.clearcut.C7229v.n(r12, r8)
            com.google.android.gms.internal.clearcut.C1.f(r14, r4, r0)
            int r0 = r8 + 4
            goto L_0x01ea
        L_0x024c:
            r10 = r34
            r19 = -1
            r28 = r12
            r12 = r32
            r13 = r18
            r18 = r8
            r8 = r4
            r4 = r28
            if (r3 != r6) goto L_0x0265
            double r0 = com.google.android.gms.internal.clearcut.C7229v.l(r12, r8)
            com.google.android.gms.internal.clearcut.C1.e(r14, r4, r0)
            goto L_0x01e8
        L_0x0265:
            r2 = r8
            r27 = r9
            r6 = r13
            r8 = r18
            r9 = r35
            goto L_0x0371
        L_0x026f:
            r0 = r12
            r13 = r18
            r19 = -1
            r12 = r32
            r18 = r8
            r8 = r4
            r4 = 27
            if (r10 != r4) goto L_0x02bc
            r4 = 2
            if (r3 != r4) goto L_0x02b3
            java.lang.Object r3 = r9.getObject(r14, r0)
            com.google.android.gms.internal.clearcut.l0 r3 = (com.google.android.gms.internal.clearcut.C7201l0) r3
            boolean r4 = r3.N()
            if (r4 != 0) goto L_0x029e
            int r4 = r3.size()
            if (r4 != 0) goto L_0x0295
            r4 = 10
            goto L_0x0297
        L_0x0295:
            int r4 = r4 << 1
        L_0x0297:
            com.google.android.gms.internal.clearcut.l0 r3 = r3.R0(r4)
            r9.putObject(r14, r0, r3)
        L_0x029e:
            r5 = r3
            com.google.android.gms.internal.clearcut.d1 r0 = r15.C(r2)
            r1 = r13
            r2 = r32
            r3 = r8
            r4 = r34
            r6 = r36
            int r0 = k(r0, r1, r2, r3, r4, r5, r6)
            r8 = r18
            goto L_0x0126
        L_0x02b3:
            r26 = r7
            r15 = r8
            r27 = r9
            r19 = r13
            goto L_0x036d
        L_0x02bc:
            r4 = 49
            if (r10 > r4) goto L_0x0313
            r4 = r33
            r20 = r9
            r33 = r10
            long r9 = (long) r4
            r21 = r0
            r0 = r30
            r1 = r31
            r23 = r2
            r2 = r32
            r6 = r3
            r3 = r8
            r4 = r34
            r24 = r5
            r5 = r13
            r25 = r6
            r6 = r24
            r26 = r7
            r7 = r25
            r15 = r8
            r8 = r23
            r27 = r20
            r11 = r33
            r19 = r13
            r12 = r21
            r14 = r36
            int r0 = r0.p(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 != r15) goto L_0x02fe
        L_0x02f3:
            r9 = r35
            r2 = r0
        L_0x02f6:
            r8 = r18
            r6 = r19
            r7 = r26
            goto L_0x0371
        L_0x02fe:
            r15 = r30
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r36
            r8 = r18
            r1 = r19
            r7 = r26
        L_0x030e:
            r9 = r27
            r10 = -1
            goto L_0x0015
        L_0x0313:
            r4 = r33
            r21 = r0
            r23 = r2
            r25 = r3
            r24 = r5
            r26 = r7
            r15 = r8
            r27 = r9
            r33 = r10
            r19 = r13
            r0 = 50
            r9 = r33
            r7 = r25
            if (r9 != r0) goto L_0x0349
            r0 = 2
            if (r7 != r0) goto L_0x036d
            r0 = r30
            r1 = r31
            r2 = r32
            r3 = r15
            r4 = r34
            r5 = r23
            r6 = r24
            r7 = r21
            r9 = r36
            int r0 = r0.q(r1, r2, r3, r4, r5, r6, r7, r9)
            if (r0 != r15) goto L_0x02fe
            goto L_0x02f3
        L_0x0349:
            r0 = r30
            r8 = r4
            r1 = r31
            r2 = r32
            r3 = r15
            r4 = r34
            r5 = r19
            r6 = r24
            r10 = r21
            r12 = r23
            r13 = r36
            int r0 = r0.o(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 != r15) goto L_0x02fe
            goto L_0x02f3
        L_0x0364:
            r15 = r4
            r19 = r6
            r26 = r7
            r18 = r8
            r27 = r9
        L_0x036d:
            r9 = r35
            r2 = r15
            goto L_0x02f6
        L_0x0371:
            if (r6 != r9) goto L_0x037c
            if (r9 != 0) goto L_0x0376
            goto L_0x037c
        L_0x0376:
            r0 = r7
            r1 = r8
            r7 = r2
            r8 = r6
            r2 = -1
            goto L_0x03a5
        L_0x037c:
            r0 = r6
            r1 = r32
            r3 = r34
            r4 = r31
            r5 = r36
            int r0 = a(r0, r1, r2, r3, r4, r5)
            r15 = r30
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r36
            r1 = r6
            goto L_0x030e
        L_0x0396:
            r26 = r7
            r18 = r8
            r27 = r9
            r9 = r35
            r7 = r0
            r8 = r1
            r2 = r10
            r1 = r18
            r0 = r26
        L_0x03a5:
            if (r1 == r2) goto L_0x03b2
            long r1 = (long) r1
            r10 = r31
            r3 = r27
            r3.putInt(r10, r1, r0)
        L_0x03af:
            r11 = r30
            goto L_0x03b5
        L_0x03b2:
            r10 = r31
            goto L_0x03af
        L_0x03b5:
            int[] r12 = r11.f48244l
            if (r12 == 0) goto L_0x03f5
            int r13 = r12.length
            r0 = 0
            r5 = r0
            r14 = r16
        L_0x03be:
            if (r14 >= r13) goto L_0x03ee
            r1 = r12[r14]
            com.google.android.gms.internal.clearcut.v1<?, ?> r6 = r11.f48248p
            int[] r0 = r11.f48233a
            r2 = r0[r1]
            int r0 = r11.F(r1)
            r0 = r0 & r17
            long r3 = (long) r0
            java.lang.Object r0 = com.google.android.gms.internal.clearcut.C1.M(r10, r3)
            if (r0 != 0) goto L_0x03d6
            goto L_0x03e9
        L_0x03d6:
            com.google.android.gms.internal.clearcut.k0 r4 = r11.E(r1)
            if (r4 != 0) goto L_0x03dd
            goto L_0x03e9
        L_0x03dd:
            com.google.android.gms.internal.clearcut.H0 r3 = r11.f48250r
            java.util.Map r3 = r3.i(r0)
            r0 = r30
            java.lang.Object r5 = r0.t(r1, r2, r3, r4, r5, r6)
        L_0x03e9:
            com.google.android.gms.internal.clearcut.w1 r5 = (com.google.android.gms.internal.clearcut.C7234w1) r5
            int r14 = r14 + 1
            goto L_0x03be
        L_0x03ee:
            if (r5 == 0) goto L_0x03f5
            com.google.android.gms.internal.clearcut.v1<?, ?> r0 = r11.f48248p
            r0.h(r10, r5)
        L_0x03f5:
            r0 = r34
            if (r9 != 0) goto L_0x0401
            if (r7 != r0) goto L_0x03fc
            goto L_0x0405
        L_0x03fc:
            com.google.android.gms.internal.clearcut.m0 r0 = com.google.android.gms.internal.clearcut.C7204m0.d()
            throw r0
        L_0x0401:
            if (r7 > r0) goto L_0x0406
            if (r8 != r9) goto L_0x0406
        L_0x0405:
            return r7
        L_0x0406:
            com.google.android.gms.internal.clearcut.m0 r0 = com.google.android.gms.internal.clearcut.C7204m0.d()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.Q0.r(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.clearcut.w):int");
    }

    static <T> Q0<T> s(Class<T> cls, K0 k02, T0 t02, C7233w0 w0Var, C7231v1<?, ?> v1Var, T<?> t10, H0 h02) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        K0 k03 = k02;
        if (k03 instanceof C7167a1) {
            C7167a1 a1Var = (C7167a1) k03;
            boolean z10 = a1Var.a() == C7186g0.e.f48390j;
            if (a1Var.d() == 0) {
                i12 = 0;
                i11 = 0;
                i10 = 0;
            } else {
                int f10 = a1Var.f();
                int g10 = a1Var.g();
                i12 = a1Var.k();
                i11 = f10;
                i10 = g10;
            }
            int[] iArr = new int[(i12 << 2)];
            Object[] objArr = new Object[(i12 << 1)];
            int[] iArr2 = a1Var.h() > 0 ? new int[a1Var.h()] : null;
            int[] iArr3 = a1Var.i() > 0 ? new int[a1Var.i()] : null;
            C7171b1 e10 = a1Var.e();
            if (e10.a()) {
                int g11 = e10.g();
                int i16 = 0;
                int i17 = 0;
                int i18 = 0;
                while (true) {
                    if (g11 >= a1Var.l() || i16 >= ((g11 - i11) << 2)) {
                        if (e10.k()) {
                            i15 = (int) C1.b(e10.l());
                            i14 = (int) C1.b(e10.m());
                            i13 = 0;
                        } else {
                            i15 = (int) C1.b(e10.n());
                            if (e10.o()) {
                                i14 = (int) C1.b(e10.p());
                                i13 = e10.q();
                            } else {
                                i14 = 0;
                                i13 = 0;
                            }
                        }
                        iArr[i16] = e10.g();
                        int i19 = i16 + 1;
                        iArr[i19] = (e10.s() ? 536870912 : 0) | (e10.r() ? 268435456 : 0) | (e10.h() << 20) | i15;
                        iArr[i16 + 2] = i14 | (i13 << 20);
                        if (e10.v() != null) {
                            int i20 = (i16 / 4) << 1;
                            objArr[i20] = e10.v();
                            if (e10.t() != null) {
                                objArr[i20 + 1] = e10.t();
                            } else if (e10.u() != null) {
                                objArr[i20 + 1] = e10.u();
                            }
                        } else if (e10.t() != null) {
                            objArr[((i16 / 4) << 1) + 1] = e10.t();
                        } else if (e10.u() != null) {
                            objArr[((i16 / 4) << 1) + 1] = e10.u();
                        }
                        int h10 = e10.h();
                        if (h10 == C7170b0.MAP.ordinal()) {
                            iArr2[i17] = i16;
                            i17++;
                        } else if (h10 >= 18 && h10 <= 49) {
                            iArr3[i18] = iArr[i19] & 1048575;
                            i18++;
                        }
                        if (!e10.a()) {
                            break;
                        }
                        g11 = e10.g();
                    } else {
                        for (int i21 = 0; i21 < 4; i21++) {
                            iArr[i16 + i21] = -1;
                        }
                    }
                    i16 += 4;
                }
            }
            return new Q0(iArr, objArr, i11, i10, a1Var.l(), a1Var.c(), z10, false, a1Var.j(), iArr2, iArr3, t02, w0Var, v1Var, t10, h02);
        }
        ((C7217q1) k03).a();
        throw new NoSuchMethodError();
    }

    private final <K, V, UT, UB> UB t(int i10, int i11, Map<K, V> map, C7198k0<?> k0Var, UB ub2, C7231v1<UT, UB> v1Var) {
        this.f48250r.e(D(i10));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry next = it.next();
            if (k0Var.d(((Integer) next.getValue()).intValue()) == null) {
                if (ub2 == null) {
                    ub2 = v1Var.f();
                }
                F x10 = A.x(E0.a((F0) null, next.getKey(), next.getValue()));
                try {
                    E0.b(x10.b(), (F0) null, next.getKey(), next.getValue());
                    v1Var.b(ub2, i11, x10.a());
                    it.remove();
                } catch (IOException e10) {
                    throw new RuntimeException(e10);
                }
            }
        }
        return ub2;
    }

    private static void u(int i10, Object obj, Q1 q12) {
        if (obj instanceof String) {
            q12.z(i10, (String) obj);
        } else {
            q12.H(i10, (A) obj);
        }
    }

    private static <UT, UB> void v(C7231v1<UT, UB> v1Var, T t10, Q1 q12) {
        v1Var.c(v1Var.k(t10), q12);
    }

    private final <K, V> void w(Q1 q12, int i10, Object obj, int i11) {
        if (obj != null) {
            this.f48250r.e(D(i11));
            q12.O(i10, (F0) null, this.f48250r.zzh(obj));
        }
    }

    private final void x(T t10, T t11, int i10) {
        long F10 = (long) (F(i10) & 1048575);
        if (y(t11, i10)) {
            Object M10 = C1.M(t10, F10);
            Object M11 = C1.M(t11, F10);
            if (M10 != null && M11 != null) {
                C1.i(t10, F10, C7192i0.d(M10, M11));
                I(t10, i10);
            } else if (M11 != null) {
                C1.i(t10, F10, M11);
                I(t10, i10);
            }
        }
    }

    private final boolean y(T t10, int i10) {
        if (this.f48241i) {
            int F10 = F(i10);
            long j10 = (long) (F10 & 1048575);
            switch ((F10 & 267386880) >>> 20) {
                case 0:
                    return C1.L(t10, j10) != 0.0d;
                case 1:
                    return C1.K(t10, j10) != 0.0f;
                case 2:
                    return C1.I(t10, j10) != 0;
                case 3:
                    return C1.I(t10, j10) != 0;
                case 4:
                    return C1.H(t10, j10) != 0;
                case 5:
                    return C1.I(t10, j10) != 0;
                case 6:
                    return C1.H(t10, j10) != 0;
                case 7:
                    return C1.J(t10, j10);
                case 8:
                    Object M10 = C1.M(t10, j10);
                    if (M10 instanceof String) {
                        return !((String) M10).isEmpty();
                    }
                    if (M10 instanceof A) {
                        return !A.f48133b.equals(M10);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    return C1.M(t10, j10) != null;
                case 10:
                    return !A.f48133b.equals(C1.M(t10, j10));
                case 11:
                    return C1.H(t10, j10) != 0;
                case 12:
                    return C1.H(t10, j10) != 0;
                case 13:
                    return C1.H(t10, j10) != 0;
                case 14:
                    return C1.I(t10, j10) != 0;
                case 15:
                    return C1.H(t10, j10) != 0;
                case 16:
                    return C1.I(t10, j10) != 0;
                case 17:
                    return C1.M(t10, j10) != null;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            int G10 = G(i10);
            return (C1.H(t10, (long) (G10 & 1048575)) & (1 << (G10 >>> 20))) != 0;
        }
    }

    private final boolean z(T t10, int i10, int i11) {
        return C1.H(t10, (long) (G(i11) & 1048575)) == i10;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0039, code lost:
        r2 = r2 * 53;
        r3 = R(r9, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003f, code lost:
        r3 = com.google.android.gms.internal.clearcut.C7192i0.j(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004a, code lost:
        r2 = r2 * 53;
        r3 = Q(r9, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0073, code lost:
        r2 = r2 * 53;
        r3 = com.google.android.gms.internal.clearcut.C1.M(r9, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0087, code lost:
        r2 = r2 * 53;
        r3 = ((java.lang.String) com.google.android.gms.internal.clearcut.C1.M(r9, r5)).hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a0, code lost:
        r3 = com.google.android.gms.internal.clearcut.C7192i0.f(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00d6, code lost:
        r3 = java.lang.Float.floatToIntBits(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00e8, code lost:
        r3 = java.lang.Double.doubleToLongBits(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00f2, code lost:
        if (r3 != null) goto L_0x00f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00f4, code lost:
        r7 = r3.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00f8, code lost:
        r2 = (r2 * 53) + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0110, code lost:
        if (r3 != null) goto L_0x00f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0128, code lost:
        r1 = r1 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0026, code lost:
        r3 = com.google.android.gms.internal.clearcut.C1.M(r9, r5);
        r2 = r2 * 53;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002c, code lost:
        r3 = r3.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0030, code lost:
        r2 = r2 + r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int b(T r9) {
        /*
            r8 = this;
            int[] r0 = r8.f48233a
            int r0 = r0.length
            r1 = 0
            r2 = r1
        L_0x0005:
            if (r1 >= r0) goto L_0x012c
            int r3 = r8.F(r1)
            int[] r4 = r8.f48233a
            r4 = r4[r1]
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r5 & r3
            long r5 = (long) r5
            r7 = 267386880(0xff00000, float:2.3665827E-29)
            r3 = r3 & r7
            int r3 = r3 >>> 20
            r7 = 37
            switch(r3) {
                case 0: goto L_0x0121;
                case 1: goto L_0x011a;
                case 2: goto L_0x00fc;
                case 3: goto L_0x00fc;
                case 4: goto L_0x0104;
                case 5: goto L_0x00fc;
                case 6: goto L_0x0104;
                case 7: goto L_0x0113;
                case 8: goto L_0x0087;
                case 9: goto L_0x010c;
                case 10: goto L_0x0073;
                case 11: goto L_0x0104;
                case 12: goto L_0x0104;
                case 13: goto L_0x0104;
                case 14: goto L_0x00fc;
                case 15: goto L_0x0104;
                case 16: goto L_0x00fc;
                case 17: goto L_0x00ee;
                case 18: goto L_0x0073;
                case 19: goto L_0x0073;
                case 20: goto L_0x0073;
                case 21: goto L_0x0073;
                case 22: goto L_0x0073;
                case 23: goto L_0x0073;
                case 24: goto L_0x0073;
                case 25: goto L_0x0073;
                case 26: goto L_0x0073;
                case 27: goto L_0x0073;
                case 28: goto L_0x0073;
                case 29: goto L_0x0073;
                case 30: goto L_0x0073;
                case 31: goto L_0x0073;
                case 32: goto L_0x0073;
                case 33: goto L_0x0073;
                case 34: goto L_0x0073;
                case 35: goto L_0x0073;
                case 36: goto L_0x0073;
                case 37: goto L_0x0073;
                case 38: goto L_0x0073;
                case 39: goto L_0x0073;
                case 40: goto L_0x0073;
                case 41: goto L_0x0073;
                case 42: goto L_0x0073;
                case 43: goto L_0x0073;
                case 44: goto L_0x0073;
                case 45: goto L_0x0073;
                case 46: goto L_0x0073;
                case 47: goto L_0x0073;
                case 48: goto L_0x0073;
                case 49: goto L_0x0073;
                case 50: goto L_0x0073;
                case 51: goto L_0x00dc;
                case 52: goto L_0x00ca;
                case 53: goto L_0x00c2;
                case 54: goto L_0x00ba;
                case 55: goto L_0x00b3;
                case 56: goto L_0x00ac;
                case 57: goto L_0x00a5;
                case 58: goto L_0x0094;
                case 59: goto L_0x0081;
                case 60: goto L_0x007a;
                case 61: goto L_0x006d;
                case 62: goto L_0x0066;
                case 63: goto L_0x005f;
                case 64: goto L_0x0058;
                case 65: goto L_0x0051;
                case 66: goto L_0x0044;
                case 67: goto L_0x0033;
                case 68: goto L_0x0020;
                default: goto L_0x001e;
            }
        L_0x001e:
            goto L_0x0128
        L_0x0020:
            boolean r3 = r8.z(r9, r4, r1)
            if (r3 == 0) goto L_0x0128
        L_0x0026:
            java.lang.Object r3 = com.google.android.gms.internal.clearcut.C1.M(r9, r5)
            int r2 = r2 * 53
        L_0x002c:
            int r3 = r3.hashCode()
        L_0x0030:
            int r2 = r2 + r3
            goto L_0x0128
        L_0x0033:
            boolean r3 = r8.z(r9, r4, r1)
            if (r3 == 0) goto L_0x0128
        L_0x0039:
            int r2 = r2 * 53
            long r3 = R(r9, r5)
        L_0x003f:
            int r3 = com.google.android.gms.internal.clearcut.C7192i0.j(r3)
            goto L_0x0030
        L_0x0044:
            boolean r3 = r8.z(r9, r4, r1)
            if (r3 == 0) goto L_0x0128
        L_0x004a:
            int r2 = r2 * 53
            int r3 = Q(r9, r5)
            goto L_0x0030
        L_0x0051:
            boolean r3 = r8.z(r9, r4, r1)
            if (r3 == 0) goto L_0x0128
            goto L_0x0039
        L_0x0058:
            boolean r3 = r8.z(r9, r4, r1)
            if (r3 == 0) goto L_0x0128
            goto L_0x004a
        L_0x005f:
            boolean r3 = r8.z(r9, r4, r1)
            if (r3 == 0) goto L_0x0128
            goto L_0x004a
        L_0x0066:
            boolean r3 = r8.z(r9, r4, r1)
            if (r3 == 0) goto L_0x0128
            goto L_0x004a
        L_0x006d:
            boolean r3 = r8.z(r9, r4, r1)
            if (r3 == 0) goto L_0x0128
        L_0x0073:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.clearcut.C1.M(r9, r5)
            goto L_0x002c
        L_0x007a:
            boolean r3 = r8.z(r9, r4, r1)
            if (r3 == 0) goto L_0x0128
            goto L_0x0026
        L_0x0081:
            boolean r3 = r8.z(r9, r4, r1)
            if (r3 == 0) goto L_0x0128
        L_0x0087:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.clearcut.C1.M(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0030
        L_0x0094:
            boolean r3 = r8.z(r9, r4, r1)
            if (r3 == 0) goto L_0x0128
            int r2 = r2 * 53
            boolean r3 = S(r9, r5)
        L_0x00a0:
            int r3 = com.google.android.gms.internal.clearcut.C7192i0.f(r3)
            goto L_0x0030
        L_0x00a5:
            boolean r3 = r8.z(r9, r4, r1)
            if (r3 == 0) goto L_0x0128
            goto L_0x004a
        L_0x00ac:
            boolean r3 = r8.z(r9, r4, r1)
            if (r3 == 0) goto L_0x0128
            goto L_0x0039
        L_0x00b3:
            boolean r3 = r8.z(r9, r4, r1)
            if (r3 == 0) goto L_0x0128
            goto L_0x004a
        L_0x00ba:
            boolean r3 = r8.z(r9, r4, r1)
            if (r3 == 0) goto L_0x0128
            goto L_0x0039
        L_0x00c2:
            boolean r3 = r8.z(r9, r4, r1)
            if (r3 == 0) goto L_0x0128
            goto L_0x0039
        L_0x00ca:
            boolean r3 = r8.z(r9, r4, r1)
            if (r3 == 0) goto L_0x0128
            int r2 = r2 * 53
            float r3 = P(r9, r5)
        L_0x00d6:
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0030
        L_0x00dc:
            boolean r3 = r8.z(r9, r4, r1)
            if (r3 == 0) goto L_0x0128
            int r2 = r2 * 53
            double r3 = O(r9, r5)
        L_0x00e8:
            long r3 = java.lang.Double.doubleToLongBits(r3)
            goto L_0x003f
        L_0x00ee:
            java.lang.Object r3 = com.google.android.gms.internal.clearcut.C1.M(r9, r5)
            if (r3 == 0) goto L_0x00f8
        L_0x00f4:
            int r7 = r3.hashCode()
        L_0x00f8:
            int r2 = r2 * 53
            int r2 = r2 + r7
            goto L_0x0128
        L_0x00fc:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.clearcut.C1.I(r9, r5)
            goto L_0x003f
        L_0x0104:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.clearcut.C1.H(r9, r5)
            goto L_0x0030
        L_0x010c:
            java.lang.Object r3 = com.google.android.gms.internal.clearcut.C1.M(r9, r5)
            if (r3 == 0) goto L_0x00f8
            goto L_0x00f4
        L_0x0113:
            int r2 = r2 * 53
            boolean r3 = com.google.android.gms.internal.clearcut.C1.J(r9, r5)
            goto L_0x00a0
        L_0x011a:
            int r2 = r2 * 53
            float r3 = com.google.android.gms.internal.clearcut.C1.K(r9, r5)
            goto L_0x00d6
        L_0x0121:
            int r2 = r2 * 53
            double r3 = com.google.android.gms.internal.clearcut.C1.L(r9, r5)
            goto L_0x00e8
        L_0x0128:
            int r1 = r1 + 4
            goto L_0x0005
        L_0x012c:
            int r2 = r2 * 53
            com.google.android.gms.internal.clearcut.v1<?, ?> r0 = r8.f48248p
            java.lang.Object r0 = r0.k(r9)
            int r0 = r0.hashCode()
            int r2 = r2 + r0
            boolean r0 = r8.f48239g
            if (r0 == 0) goto L_0x014a
            int r2 = r2 * 53
            com.google.android.gms.internal.clearcut.T<?> r0 = r8.f48249q
            com.google.android.gms.internal.clearcut.X r9 = r0.b(r9)
            int r9 = r9.hashCode()
            int r2 = r2 + r9
        L_0x014a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.Q0.b(java.lang.Object):int");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x005d, code lost:
        if (com.google.android.gms.internal.clearcut.C7184f1.y(com.google.android.gms.internal.clearcut.C1.M(r10, r6), com.google.android.gms.internal.clearcut.C1.M(r11, r6)) != false) goto L_0x01a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0070, code lost:
        if (com.google.android.gms.internal.clearcut.C1.I(r10, r6) == com.google.android.gms.internal.clearcut.C1.I(r11, r6)) goto L_0x01a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0081, code lost:
        if (com.google.android.gms.internal.clearcut.C1.H(r10, r6) == com.google.android.gms.internal.clearcut.C1.H(r11, r6)) goto L_0x01a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0094, code lost:
        if (com.google.android.gms.internal.clearcut.C1.I(r10, r6) == com.google.android.gms.internal.clearcut.C1.I(r11, r6)) goto L_0x01a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a5, code lost:
        if (com.google.android.gms.internal.clearcut.C1.H(r10, r6) == com.google.android.gms.internal.clearcut.C1.H(r11, r6)) goto L_0x01a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b6, code lost:
        if (com.google.android.gms.internal.clearcut.C1.H(r10, r6) == com.google.android.gms.internal.clearcut.C1.H(r11, r6)) goto L_0x01a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00c7, code lost:
        if (com.google.android.gms.internal.clearcut.C1.H(r10, r6) == com.google.android.gms.internal.clearcut.C1.H(r11, r6)) goto L_0x01a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00dd, code lost:
        if (com.google.android.gms.internal.clearcut.C7184f1.y(com.google.android.gms.internal.clearcut.C1.M(r10, r6), com.google.android.gms.internal.clearcut.C1.M(r11, r6)) != false) goto L_0x01a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00f3, code lost:
        if (com.google.android.gms.internal.clearcut.C7184f1.y(com.google.android.gms.internal.clearcut.C1.M(r10, r6), com.google.android.gms.internal.clearcut.C1.M(r11, r6)) != false) goto L_0x01a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0109, code lost:
        if (com.google.android.gms.internal.clearcut.C7184f1.y(com.google.android.gms.internal.clearcut.C1.M(r10, r6), com.google.android.gms.internal.clearcut.C1.M(r11, r6)) != false) goto L_0x01a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x011b, code lost:
        if (com.google.android.gms.internal.clearcut.C1.J(r10, r6) == com.google.android.gms.internal.clearcut.C1.J(r11, r6)) goto L_0x01a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x012d, code lost:
        if (com.google.android.gms.internal.clearcut.C1.H(r10, r6) == com.google.android.gms.internal.clearcut.C1.H(r11, r6)) goto L_0x01a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0141, code lost:
        if (com.google.android.gms.internal.clearcut.C1.I(r10, r6) == com.google.android.gms.internal.clearcut.C1.I(r11, r6)) goto L_0x01a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0153, code lost:
        if (com.google.android.gms.internal.clearcut.C1.H(r10, r6) == com.google.android.gms.internal.clearcut.C1.H(r11, r6)) goto L_0x01a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0167, code lost:
        if (com.google.android.gms.internal.clearcut.C1.I(r10, r6) == com.google.android.gms.internal.clearcut.C1.I(r11, r6)) goto L_0x01a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x017b, code lost:
        if (com.google.android.gms.internal.clearcut.C1.I(r10, r6) == com.google.android.gms.internal.clearcut.C1.I(r11, r6)) goto L_0x01a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x018d, code lost:
        if (com.google.android.gms.internal.clearcut.C1.H(r10, r6) == com.google.android.gms.internal.clearcut.C1.H(r11, r6)) goto L_0x01a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01a1, code lost:
        if (com.google.android.gms.internal.clearcut.C1.I(r10, r6) == com.google.android.gms.internal.clearcut.C1.I(r11, r6)) goto L_0x01a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0038, code lost:
        if (com.google.android.gms.internal.clearcut.C7184f1.y(com.google.android.gms.internal.clearcut.C1.M(r10, r6), com.google.android.gms.internal.clearcut.C1.M(r11, r6)) != false) goto L_0x01a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003a, code lost:
        r3 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean c(T r10, T r11) {
        /*
            r9 = this;
            int[] r0 = r9.f48233a
            int r0 = r0.length
            r1 = 0
            r2 = r1
        L_0x0005:
            r3 = 1
            if (r2 >= r0) goto L_0x01ac
            int r4 = r9.F(r2)
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r6 = r4 & r5
            long r6 = (long) r6
            r8 = 267386880(0xff00000, float:2.3665827E-29)
            r4 = r4 & r8
            int r4 = r4 >>> 20
            switch(r4) {
                case 0: goto L_0x0191;
                case 1: goto L_0x017f;
                case 2: goto L_0x016b;
                case 3: goto L_0x0157;
                case 4: goto L_0x0145;
                case 5: goto L_0x0131;
                case 6: goto L_0x011f;
                case 7: goto L_0x010d;
                case 8: goto L_0x00f7;
                case 9: goto L_0x00e1;
                case 10: goto L_0x00cb;
                case 11: goto L_0x00b9;
                case 12: goto L_0x00a8;
                case 13: goto L_0x0097;
                case 14: goto L_0x0084;
                case 15: goto L_0x0073;
                case 16: goto L_0x0060;
                case 17: goto L_0x004b;
                case 18: goto L_0x003d;
                case 19: goto L_0x003d;
                case 20: goto L_0x003d;
                case 21: goto L_0x003d;
                case 22: goto L_0x003d;
                case 23: goto L_0x003d;
                case 24: goto L_0x003d;
                case 25: goto L_0x003d;
                case 26: goto L_0x003d;
                case 27: goto L_0x003d;
                case 28: goto L_0x003d;
                case 29: goto L_0x003d;
                case 30: goto L_0x003d;
                case 31: goto L_0x003d;
                case 32: goto L_0x003d;
                case 33: goto L_0x003d;
                case 34: goto L_0x003d;
                case 35: goto L_0x003d;
                case 36: goto L_0x003d;
                case 37: goto L_0x003d;
                case 38: goto L_0x003d;
                case 39: goto L_0x003d;
                case 40: goto L_0x003d;
                case 41: goto L_0x003d;
                case 42: goto L_0x003d;
                case 43: goto L_0x003d;
                case 44: goto L_0x003d;
                case 45: goto L_0x003d;
                case 46: goto L_0x003d;
                case 47: goto L_0x003d;
                case 48: goto L_0x003d;
                case 49: goto L_0x003d;
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
            goto L_0x01a5
        L_0x001c:
            int r4 = r9.G(r2)
            r4 = r4 & r5
            long r4 = (long) r4
            int r8 = com.google.android.gms.internal.clearcut.C1.H(r10, r4)
            int r4 = com.google.android.gms.internal.clearcut.C1.H(r11, r4)
            if (r8 != r4) goto L_0x003a
            java.lang.Object r4 = com.google.android.gms.internal.clearcut.C1.M(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.clearcut.C1.M(r11, r6)
            boolean r4 = com.google.android.gms.internal.clearcut.C7184f1.y(r4, r5)
            if (r4 != 0) goto L_0x01a5
        L_0x003a:
            r3 = r1
            goto L_0x01a5
        L_0x003d:
            java.lang.Object r3 = com.google.android.gms.internal.clearcut.C1.M(r10, r6)
            java.lang.Object r4 = com.google.android.gms.internal.clearcut.C1.M(r11, r6)
            boolean r3 = com.google.android.gms.internal.clearcut.C7184f1.y(r3, r4)
            goto L_0x01a5
        L_0x004b:
            boolean r4 = r9.M(r10, r11, r2)
            if (r4 == 0) goto L_0x003a
            java.lang.Object r4 = com.google.android.gms.internal.clearcut.C1.M(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.clearcut.C1.M(r11, r6)
            boolean r4 = com.google.android.gms.internal.clearcut.C7184f1.y(r4, r5)
            if (r4 != 0) goto L_0x01a5
            goto L_0x003a
        L_0x0060:
            boolean r4 = r9.M(r10, r11, r2)
            if (r4 == 0) goto L_0x003a
            long r4 = com.google.android.gms.internal.clearcut.C1.I(r10, r6)
            long r6 = com.google.android.gms.internal.clearcut.C1.I(r11, r6)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x01a5
            goto L_0x003a
        L_0x0073:
            boolean r4 = r9.M(r10, r11, r2)
            if (r4 == 0) goto L_0x003a
            int r4 = com.google.android.gms.internal.clearcut.C1.H(r10, r6)
            int r5 = com.google.android.gms.internal.clearcut.C1.H(r11, r6)
            if (r4 == r5) goto L_0x01a5
            goto L_0x003a
        L_0x0084:
            boolean r4 = r9.M(r10, r11, r2)
            if (r4 == 0) goto L_0x003a
            long r4 = com.google.android.gms.internal.clearcut.C1.I(r10, r6)
            long r6 = com.google.android.gms.internal.clearcut.C1.I(r11, r6)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x01a5
            goto L_0x003a
        L_0x0097:
            boolean r4 = r9.M(r10, r11, r2)
            if (r4 == 0) goto L_0x003a
            int r4 = com.google.android.gms.internal.clearcut.C1.H(r10, r6)
            int r5 = com.google.android.gms.internal.clearcut.C1.H(r11, r6)
            if (r4 == r5) goto L_0x01a5
            goto L_0x003a
        L_0x00a8:
            boolean r4 = r9.M(r10, r11, r2)
            if (r4 == 0) goto L_0x003a
            int r4 = com.google.android.gms.internal.clearcut.C1.H(r10, r6)
            int r5 = com.google.android.gms.internal.clearcut.C1.H(r11, r6)
            if (r4 == r5) goto L_0x01a5
            goto L_0x003a
        L_0x00b9:
            boolean r4 = r9.M(r10, r11, r2)
            if (r4 == 0) goto L_0x003a
            int r4 = com.google.android.gms.internal.clearcut.C1.H(r10, r6)
            int r5 = com.google.android.gms.internal.clearcut.C1.H(r11, r6)
            if (r4 == r5) goto L_0x01a5
            goto L_0x003a
        L_0x00cb:
            boolean r4 = r9.M(r10, r11, r2)
            if (r4 == 0) goto L_0x003a
            java.lang.Object r4 = com.google.android.gms.internal.clearcut.C1.M(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.clearcut.C1.M(r11, r6)
            boolean r4 = com.google.android.gms.internal.clearcut.C7184f1.y(r4, r5)
            if (r4 != 0) goto L_0x01a5
            goto L_0x003a
        L_0x00e1:
            boolean r4 = r9.M(r10, r11, r2)
            if (r4 == 0) goto L_0x003a
            java.lang.Object r4 = com.google.android.gms.internal.clearcut.C1.M(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.clearcut.C1.M(r11, r6)
            boolean r4 = com.google.android.gms.internal.clearcut.C7184f1.y(r4, r5)
            if (r4 != 0) goto L_0x01a5
            goto L_0x003a
        L_0x00f7:
            boolean r4 = r9.M(r10, r11, r2)
            if (r4 == 0) goto L_0x003a
            java.lang.Object r4 = com.google.android.gms.internal.clearcut.C1.M(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.clearcut.C1.M(r11, r6)
            boolean r4 = com.google.android.gms.internal.clearcut.C7184f1.y(r4, r5)
            if (r4 != 0) goto L_0x01a5
            goto L_0x003a
        L_0x010d:
            boolean r4 = r9.M(r10, r11, r2)
            if (r4 == 0) goto L_0x003a
            boolean r4 = com.google.android.gms.internal.clearcut.C1.J(r10, r6)
            boolean r5 = com.google.android.gms.internal.clearcut.C1.J(r11, r6)
            if (r4 == r5) goto L_0x01a5
            goto L_0x003a
        L_0x011f:
            boolean r4 = r9.M(r10, r11, r2)
            if (r4 == 0) goto L_0x003a
            int r4 = com.google.android.gms.internal.clearcut.C1.H(r10, r6)
            int r5 = com.google.android.gms.internal.clearcut.C1.H(r11, r6)
            if (r4 == r5) goto L_0x01a5
            goto L_0x003a
        L_0x0131:
            boolean r4 = r9.M(r10, r11, r2)
            if (r4 == 0) goto L_0x003a
            long r4 = com.google.android.gms.internal.clearcut.C1.I(r10, r6)
            long r6 = com.google.android.gms.internal.clearcut.C1.I(r11, r6)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x01a5
            goto L_0x003a
        L_0x0145:
            boolean r4 = r9.M(r10, r11, r2)
            if (r4 == 0) goto L_0x003a
            int r4 = com.google.android.gms.internal.clearcut.C1.H(r10, r6)
            int r5 = com.google.android.gms.internal.clearcut.C1.H(r11, r6)
            if (r4 == r5) goto L_0x01a5
            goto L_0x003a
        L_0x0157:
            boolean r4 = r9.M(r10, r11, r2)
            if (r4 == 0) goto L_0x003a
            long r4 = com.google.android.gms.internal.clearcut.C1.I(r10, r6)
            long r6 = com.google.android.gms.internal.clearcut.C1.I(r11, r6)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x01a5
            goto L_0x003a
        L_0x016b:
            boolean r4 = r9.M(r10, r11, r2)
            if (r4 == 0) goto L_0x003a
            long r4 = com.google.android.gms.internal.clearcut.C1.I(r10, r6)
            long r6 = com.google.android.gms.internal.clearcut.C1.I(r11, r6)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x01a5
            goto L_0x003a
        L_0x017f:
            boolean r4 = r9.M(r10, r11, r2)
            if (r4 == 0) goto L_0x003a
            int r4 = com.google.android.gms.internal.clearcut.C1.H(r10, r6)
            int r5 = com.google.android.gms.internal.clearcut.C1.H(r11, r6)
            if (r4 == r5) goto L_0x01a5
            goto L_0x003a
        L_0x0191:
            boolean r4 = r9.M(r10, r11, r2)
            if (r4 == 0) goto L_0x003a
            long r4 = com.google.android.gms.internal.clearcut.C1.I(r10, r6)
            long r6 = com.google.android.gms.internal.clearcut.C1.I(r11, r6)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x01a5
            goto L_0x003a
        L_0x01a5:
            if (r3 != 0) goto L_0x01a8
            return r1
        L_0x01a8:
            int r2 = r2 + 4
            goto L_0x0005
        L_0x01ac:
            com.google.android.gms.internal.clearcut.v1<?, ?> r0 = r9.f48248p
            java.lang.Object r0 = r0.k(r10)
            com.google.android.gms.internal.clearcut.v1<?, ?> r2 = r9.f48248p
            java.lang.Object r2 = r2.k(r11)
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x01bf
            return r1
        L_0x01bf:
            boolean r0 = r9.f48239g
            if (r0 == 0) goto L_0x01d4
            com.google.android.gms.internal.clearcut.T<?> r0 = r9.f48249q
            com.google.android.gms.internal.clearcut.X r10 = r0.b(r10)
            com.google.android.gms.internal.clearcut.T<?> r0 = r9.f48249q
            com.google.android.gms.internal.clearcut.X r11 = r0.b(r11)
            boolean r10 = r10.equals(r11)
            return r10
        L_0x01d4:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.Q0.c(java.lang.Object, java.lang.Object):boolean");
    }

    public final void d(T t10) {
        int[] iArr = this.f48244l;
        if (iArr != null) {
            for (int F10 : iArr) {
                long F11 = (long) (F(F10) & 1048575);
                Object M10 = C1.M(t10, F11);
                if (M10 != null) {
                    C1.i(t10, F11, this.f48250r.g(M10));
                }
            }
        }
        int[] iArr2 = this.f48245m;
        if (iArr2 != null) {
            for (int i10 : iArr2) {
                this.f48247o.a(t10, (long) i10);
            }
        }
        this.f48248p.d(t10);
        if (this.f48239g) {
            this.f48249q.f(t10);
        }
    }

    public final T e() {
        return this.f48246n.a(this.f48238f);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x0533, code lost:
        r15.J(r10, com.google.android.gms.internal.clearcut.C1.M(r14, (long) (r9 & 1048575)), C(r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x054e, code lost:
        r15.a(r10, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x055f, code lost:
        r15.v(r10, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x0570, code lost:
        r15.K(r10, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x0581, code lost:
        r15.P(r10, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x0592, code lost:
        r15.M(r10, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x05a3, code lost:
        r15.u(r10, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x05ae, code lost:
        r15.H(r10, (com.google.android.gms.internal.clearcut.A) com.google.android.gms.internal.clearcut.C1.M(r14, (long) (r9 & 1048575)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006e, code lost:
        r15.J(r9, com.google.android.gms.internal.clearcut.C1.M(r14, (long) (r8 & 1048575)), C(r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x05c1, code lost:
        r15.I(r10, com.google.android.gms.internal.clearcut.C1.M(r14, (long) (r9 & 1048575)), C(r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x05d6, code lost:
        u(r10, com.google.android.gms.internal.clearcut.C1.M(r14, (long) (r9 & 1048575)), r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x05ed, code lost:
        r15.zzb(r10, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x05fe, code lost:
        r15.m(r10, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x060f, code lost:
        r15.f(r10, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x0620, code lost:
        r15.e(r10, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x0631, code lost:
        r15.j(r10, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x0642, code lost:
        r15.L(r10, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x0653, code lost:
        r15.l(r10, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x0664, code lost:
        r15.k(r10, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0089, code lost:
        r15.a(r9, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x009a, code lost:
        r15.v(r9, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00ab, code lost:
        r15.K(r9, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00bc, code lost:
        r15.P(r9, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00cd, code lost:
        r15.M(r9, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00de, code lost:
        r15.u(r9, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00e9, code lost:
        r15.H(r9, (com.google.android.gms.internal.clearcut.A) com.google.android.gms.internal.clearcut.C1.M(r14, (long) (r8 & 1048575)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00fc, code lost:
        r15.I(r9, com.google.android.gms.internal.clearcut.C1.M(r14, (long) (r8 & 1048575)), C(r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0111, code lost:
        u(r9, com.google.android.gms.internal.clearcut.C1.M(r14, (long) (r8 & 1048575)), r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0128, code lost:
        r15.zzb(r9, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0139, code lost:
        r15.m(r9, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x014a, code lost:
        r15.f(r9, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x015b, code lost:
        r15.e(r9, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x016c, code lost:
        r15.j(r9, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x017d, code lost:
        r15.L(r9, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x018e, code lost:
        r15.l(r9, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x019f, code lost:
        r15.k(r9, r10);
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x04c1  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x04fe  */
    /* JADX WARNING: Removed duplicated region for block: B:351:0x0986  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(T r14, com.google.android.gms.internal.clearcut.Q1 r15) {
        /*
            r13 = this;
            int r0 = r15.s()
            int r1 = com.google.android.gms.internal.clearcut.C7186g0.e.f48393m
            r2 = 267386880(0xff00000, float:2.3665827E-29)
            r3 = 0
            r4 = 1
            r5 = 0
            r6 = 1048575(0xfffff, float:1.469367E-39)
            if (r0 != r1) goto L_0x04d7
            com.google.android.gms.internal.clearcut.v1<?, ?> r0 = r13.f48248p
            v(r0, r14, r15)
            boolean r0 = r13.f48239g
            if (r0 == 0) goto L_0x0030
            com.google.android.gms.internal.clearcut.T<?> r0 = r13.f48249q
            com.google.android.gms.internal.clearcut.X r0 = r0.b(r14)
            boolean r1 = r0.b()
            if (r1 != 0) goto L_0x0030
            java.util.Iterator r0 = r0.a()
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L_0x0032
        L_0x0030:
            r0 = r3
            r1 = r0
        L_0x0032:
            int[] r7 = r13.f48233a
            int r7 = r7.length
            int r7 = r7 + -4
        L_0x0037:
            if (r7 < 0) goto L_0x04bf
            int r8 = r13.F(r7)
            int[] r9 = r13.f48233a
            r9 = r9[r7]
        L_0x0041:
            if (r1 == 0) goto L_0x005f
            com.google.android.gms.internal.clearcut.T<?> r10 = r13.f48249q
            int r10 = r10.a(r1)
            if (r10 <= r9) goto L_0x005f
            com.google.android.gms.internal.clearcut.T<?> r10 = r13.f48249q
            r10.c(r15, r1)
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x005d
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L_0x0041
        L_0x005d:
            r1 = r3
            goto L_0x0041
        L_0x005f:
            r10 = r8 & r2
            int r10 = r10 >>> 20
            switch(r10) {
                case 0: goto L_0x04ad;
                case 1: goto L_0x049f;
                case 2: goto L_0x0491;
                case 3: goto L_0x0483;
                case 4: goto L_0x0475;
                case 5: goto L_0x0467;
                case 6: goto L_0x0459;
                case 7: goto L_0x044b;
                case 8: goto L_0x0443;
                case 9: goto L_0x043b;
                case 10: goto L_0x0433;
                case 11: goto L_0x0425;
                case 12: goto L_0x0417;
                case 13: goto L_0x0409;
                case 14: goto L_0x03fb;
                case 15: goto L_0x03ed;
                case 16: goto L_0x03df;
                case 17: goto L_0x03d7;
                case 18: goto L_0x03c6;
                case 19: goto L_0x03b5;
                case 20: goto L_0x03a4;
                case 21: goto L_0x0393;
                case 22: goto L_0x0382;
                case 23: goto L_0x0371;
                case 24: goto L_0x0360;
                case 25: goto L_0x034f;
                case 26: goto L_0x033e;
                case 27: goto L_0x0329;
                case 28: goto L_0x0318;
                case 29: goto L_0x0307;
                case 30: goto L_0x02f6;
                case 31: goto L_0x02e5;
                case 32: goto L_0x02d4;
                case 33: goto L_0x02c3;
                case 34: goto L_0x02b2;
                case 35: goto L_0x02a1;
                case 36: goto L_0x0290;
                case 37: goto L_0x027f;
                case 38: goto L_0x026e;
                case 39: goto L_0x025d;
                case 40: goto L_0x024c;
                case 41: goto L_0x023b;
                case 42: goto L_0x022a;
                case 43: goto L_0x0219;
                case 44: goto L_0x0208;
                case 45: goto L_0x01f7;
                case 46: goto L_0x01e6;
                case 47: goto L_0x01d5;
                case 48: goto L_0x01c4;
                case 49: goto L_0x01af;
                case 50: goto L_0x01a4;
                case 51: goto L_0x0193;
                case 52: goto L_0x0182;
                case 53: goto L_0x0171;
                case 54: goto L_0x0160;
                case 55: goto L_0x014f;
                case 56: goto L_0x013e;
                case 57: goto L_0x012d;
                case 58: goto L_0x011c;
                case 59: goto L_0x010b;
                case 60: goto L_0x00f6;
                case 61: goto L_0x00e3;
                case 62: goto L_0x00d2;
                case 63: goto L_0x00c1;
                case 64: goto L_0x00b0;
                case 65: goto L_0x009f;
                case 66: goto L_0x008e;
                case 67: goto L_0x007d;
                case 68: goto L_0x0068;
                default: goto L_0x0066;
            }
        L_0x0066:
            goto L_0x04bb
        L_0x0068:
            boolean r10 = r13.z(r14, r9, r7)
            if (r10 == 0) goto L_0x04bb
        L_0x006e:
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C1.M(r14, r10)
            com.google.android.gms.internal.clearcut.d1 r10 = r13.C(r7)
            r15.J(r9, r8, r10)
            goto L_0x04bb
        L_0x007d:
            boolean r10 = r13.z(r14, r9, r7)
            if (r10 == 0) goto L_0x04bb
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = R(r14, r10)
        L_0x0089:
            r15.a(r9, r10)
            goto L_0x04bb
        L_0x008e:
            boolean r10 = r13.z(r14, r9, r7)
            if (r10 == 0) goto L_0x04bb
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = Q(r14, r10)
        L_0x009a:
            r15.v(r9, r8)
            goto L_0x04bb
        L_0x009f:
            boolean r10 = r13.z(r14, r9, r7)
            if (r10 == 0) goto L_0x04bb
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = R(r14, r10)
        L_0x00ab:
            r15.K(r9, r10)
            goto L_0x04bb
        L_0x00b0:
            boolean r10 = r13.z(r14, r9, r7)
            if (r10 == 0) goto L_0x04bb
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = Q(r14, r10)
        L_0x00bc:
            r15.P(r9, r8)
            goto L_0x04bb
        L_0x00c1:
            boolean r10 = r13.z(r14, r9, r7)
            if (r10 == 0) goto L_0x04bb
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = Q(r14, r10)
        L_0x00cd:
            r15.M(r9, r8)
            goto L_0x04bb
        L_0x00d2:
            boolean r10 = r13.z(r14, r9, r7)
            if (r10 == 0) goto L_0x04bb
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = Q(r14, r10)
        L_0x00de:
            r15.u(r9, r8)
            goto L_0x04bb
        L_0x00e3:
            boolean r10 = r13.z(r14, r9, r7)
            if (r10 == 0) goto L_0x04bb
        L_0x00e9:
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C1.M(r14, r10)
            com.google.android.gms.internal.clearcut.A r8 = (com.google.android.gms.internal.clearcut.A) r8
            r15.H(r9, r8)
            goto L_0x04bb
        L_0x00f6:
            boolean r10 = r13.z(r14, r9, r7)
            if (r10 == 0) goto L_0x04bb
        L_0x00fc:
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C1.M(r14, r10)
            com.google.android.gms.internal.clearcut.d1 r10 = r13.C(r7)
            r15.I(r9, r8, r10)
            goto L_0x04bb
        L_0x010b:
            boolean r10 = r13.z(r14, r9, r7)
            if (r10 == 0) goto L_0x04bb
        L_0x0111:
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C1.M(r14, r10)
            u(r9, r8, r15)
            goto L_0x04bb
        L_0x011c:
            boolean r10 = r13.z(r14, r9, r7)
            if (r10 == 0) goto L_0x04bb
            r8 = r8 & r6
            long r10 = (long) r8
            boolean r8 = S(r14, r10)
        L_0x0128:
            r15.zzb(r9, r8)
            goto L_0x04bb
        L_0x012d:
            boolean r10 = r13.z(r14, r9, r7)
            if (r10 == 0) goto L_0x04bb
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = Q(r14, r10)
        L_0x0139:
            r15.m(r9, r8)
            goto L_0x04bb
        L_0x013e:
            boolean r10 = r13.z(r14, r9, r7)
            if (r10 == 0) goto L_0x04bb
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = R(r14, r10)
        L_0x014a:
            r15.f(r9, r10)
            goto L_0x04bb
        L_0x014f:
            boolean r10 = r13.z(r14, r9, r7)
            if (r10 == 0) goto L_0x04bb
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = Q(r14, r10)
        L_0x015b:
            r15.e(r9, r8)
            goto L_0x04bb
        L_0x0160:
            boolean r10 = r13.z(r14, r9, r7)
            if (r10 == 0) goto L_0x04bb
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = R(r14, r10)
        L_0x016c:
            r15.j(r9, r10)
            goto L_0x04bb
        L_0x0171:
            boolean r10 = r13.z(r14, r9, r7)
            if (r10 == 0) goto L_0x04bb
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = R(r14, r10)
        L_0x017d:
            r15.L(r9, r10)
            goto L_0x04bb
        L_0x0182:
            boolean r10 = r13.z(r14, r9, r7)
            if (r10 == 0) goto L_0x04bb
            r8 = r8 & r6
            long r10 = (long) r8
            float r8 = P(r14, r10)
        L_0x018e:
            r15.l(r9, r8)
            goto L_0x04bb
        L_0x0193:
            boolean r10 = r13.z(r14, r9, r7)
            if (r10 == 0) goto L_0x04bb
            r8 = r8 & r6
            long r10 = (long) r8
            double r10 = O(r14, r10)
        L_0x019f:
            r15.k(r9, r10)
            goto L_0x04bb
        L_0x01a4:
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C1.M(r14, r10)
            r13.w(r15, r9, r8, r7)
            goto L_0x04bb
        L_0x01af:
            int[] r9 = r13.f48233a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C1.M(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.d1 r10 = r13.C(r7)
            com.google.android.gms.internal.clearcut.C7184f1.l(r9, r8, r15, r10)
            goto L_0x04bb
        L_0x01c4:
            int[] r9 = r13.f48233a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C1.M(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.C7184f1.F(r9, r8, r15, r4)
            goto L_0x04bb
        L_0x01d5:
            int[] r9 = r13.f48233a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C1.M(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.C7184f1.Q(r9, r8, r15, r4)
            goto L_0x04bb
        L_0x01e6:
            int[] r9 = r13.f48233a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C1.M(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.C7184f1.K(r9, r8, r15, r4)
            goto L_0x04bb
        L_0x01f7:
            int[] r9 = r13.f48233a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C1.M(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.C7184f1.S(r9, r8, r15, r4)
            goto L_0x04bb
        L_0x0208:
            int[] r9 = r13.f48233a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C1.M(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.C7184f1.T(r9, r8, r15, r4)
            goto L_0x04bb
        L_0x0219:
            int[] r9 = r13.f48233a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C1.M(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.C7184f1.O(r9, r8, r15, r4)
            goto L_0x04bb
        L_0x022a:
            int[] r9 = r13.f48233a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C1.M(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.C7184f1.U(r9, r8, r15, r4)
            goto L_0x04bb
        L_0x023b:
            int[] r9 = r13.f48233a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C1.M(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.C7184f1.R(r9, r8, r15, r4)
            goto L_0x04bb
        L_0x024c:
            int[] r9 = r13.f48233a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C1.M(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.C7184f1.H(r9, r8, r15, r4)
            goto L_0x04bb
        L_0x025d:
            int[] r9 = r13.f48233a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C1.M(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.C7184f1.M(r9, r8, r15, r4)
            goto L_0x04bb
        L_0x026e:
            int[] r9 = r13.f48233a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C1.M(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.C7184f1.x(r9, r8, r15, r4)
            goto L_0x04bb
        L_0x027f:
            int[] r9 = r13.f48233a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C1.M(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.C7184f1.r(r9, r8, r15, r4)
            goto L_0x04bb
        L_0x0290:
            int[] r9 = r13.f48233a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C1.M(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.C7184f1.m(r9, r8, r15, r4)
            goto L_0x04bb
        L_0x02a1:
            int[] r9 = r13.f48233a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C1.M(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.C7184f1.f(r9, r8, r15, r4)
            goto L_0x04bb
        L_0x02b2:
            int[] r9 = r13.f48233a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C1.M(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.C7184f1.F(r9, r8, r15, r5)
            goto L_0x04bb
        L_0x02c3:
            int[] r9 = r13.f48233a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C1.M(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.C7184f1.Q(r9, r8, r15, r5)
            goto L_0x04bb
        L_0x02d4:
            int[] r9 = r13.f48233a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C1.M(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.C7184f1.K(r9, r8, r15, r5)
            goto L_0x04bb
        L_0x02e5:
            int[] r9 = r13.f48233a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C1.M(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.C7184f1.S(r9, r8, r15, r5)
            goto L_0x04bb
        L_0x02f6:
            int[] r9 = r13.f48233a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C1.M(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.C7184f1.T(r9, r8, r15, r5)
            goto L_0x04bb
        L_0x0307:
            int[] r9 = r13.f48233a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C1.M(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.C7184f1.O(r9, r8, r15, r5)
            goto L_0x04bb
        L_0x0318:
            int[] r9 = r13.f48233a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C1.M(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.C7184f1.k(r9, r8, r15)
            goto L_0x04bb
        L_0x0329:
            int[] r9 = r13.f48233a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C1.M(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.d1 r10 = r13.C(r7)
            com.google.android.gms.internal.clearcut.C7184f1.e(r9, r8, r15, r10)
            goto L_0x04bb
        L_0x033e:
            int[] r9 = r13.f48233a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C1.M(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.C7184f1.d(r9, r8, r15)
            goto L_0x04bb
        L_0x034f:
            int[] r9 = r13.f48233a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C1.M(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.C7184f1.U(r9, r8, r15, r5)
            goto L_0x04bb
        L_0x0360:
            int[] r9 = r13.f48233a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C1.M(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.C7184f1.R(r9, r8, r15, r5)
            goto L_0x04bb
        L_0x0371:
            int[] r9 = r13.f48233a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C1.M(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.C7184f1.H(r9, r8, r15, r5)
            goto L_0x04bb
        L_0x0382:
            int[] r9 = r13.f48233a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C1.M(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.C7184f1.M(r9, r8, r15, r5)
            goto L_0x04bb
        L_0x0393:
            int[] r9 = r13.f48233a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C1.M(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.C7184f1.x(r9, r8, r15, r5)
            goto L_0x04bb
        L_0x03a4:
            int[] r9 = r13.f48233a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C1.M(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.C7184f1.r(r9, r8, r15, r5)
            goto L_0x04bb
        L_0x03b5:
            int[] r9 = r13.f48233a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C1.M(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.C7184f1.m(r9, r8, r15, r5)
            goto L_0x04bb
        L_0x03c6:
            int[] r9 = r13.f48233a
            r9 = r9[r7]
            r8 = r8 & r6
            long r10 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.clearcut.C1.M(r14, r10)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.clearcut.C7184f1.f(r9, r8, r15, r5)
            goto L_0x04bb
        L_0x03d7:
            boolean r10 = r13.y(r14, r7)
            if (r10 == 0) goto L_0x04bb
            goto L_0x006e
        L_0x03df:
            boolean r10 = r13.y(r14, r7)
            if (r10 == 0) goto L_0x04bb
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = com.google.android.gms.internal.clearcut.C1.I(r14, r10)
            goto L_0x0089
        L_0x03ed:
            boolean r10 = r13.y(r14, r7)
            if (r10 == 0) goto L_0x04bb
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.clearcut.C1.H(r14, r10)
            goto L_0x009a
        L_0x03fb:
            boolean r10 = r13.y(r14, r7)
            if (r10 == 0) goto L_0x04bb
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = com.google.android.gms.internal.clearcut.C1.I(r14, r10)
            goto L_0x00ab
        L_0x0409:
            boolean r10 = r13.y(r14, r7)
            if (r10 == 0) goto L_0x04bb
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.clearcut.C1.H(r14, r10)
            goto L_0x00bc
        L_0x0417:
            boolean r10 = r13.y(r14, r7)
            if (r10 == 0) goto L_0x04bb
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.clearcut.C1.H(r14, r10)
            goto L_0x00cd
        L_0x0425:
            boolean r10 = r13.y(r14, r7)
            if (r10 == 0) goto L_0x04bb
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.clearcut.C1.H(r14, r10)
            goto L_0x00de
        L_0x0433:
            boolean r10 = r13.y(r14, r7)
            if (r10 == 0) goto L_0x04bb
            goto L_0x00e9
        L_0x043b:
            boolean r10 = r13.y(r14, r7)
            if (r10 == 0) goto L_0x04bb
            goto L_0x00fc
        L_0x0443:
            boolean r10 = r13.y(r14, r7)
            if (r10 == 0) goto L_0x04bb
            goto L_0x0111
        L_0x044b:
            boolean r10 = r13.y(r14, r7)
            if (r10 == 0) goto L_0x04bb
            r8 = r8 & r6
            long r10 = (long) r8
            boolean r8 = com.google.android.gms.internal.clearcut.C1.J(r14, r10)
            goto L_0x0128
        L_0x0459:
            boolean r10 = r13.y(r14, r7)
            if (r10 == 0) goto L_0x04bb
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.clearcut.C1.H(r14, r10)
            goto L_0x0139
        L_0x0467:
            boolean r10 = r13.y(r14, r7)
            if (r10 == 0) goto L_0x04bb
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = com.google.android.gms.internal.clearcut.C1.I(r14, r10)
            goto L_0x014a
        L_0x0475:
            boolean r10 = r13.y(r14, r7)
            if (r10 == 0) goto L_0x04bb
            r8 = r8 & r6
            long r10 = (long) r8
            int r8 = com.google.android.gms.internal.clearcut.C1.H(r14, r10)
            goto L_0x015b
        L_0x0483:
            boolean r10 = r13.y(r14, r7)
            if (r10 == 0) goto L_0x04bb
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = com.google.android.gms.internal.clearcut.C1.I(r14, r10)
            goto L_0x016c
        L_0x0491:
            boolean r10 = r13.y(r14, r7)
            if (r10 == 0) goto L_0x04bb
            r8 = r8 & r6
            long r10 = (long) r8
            long r10 = com.google.android.gms.internal.clearcut.C1.I(r14, r10)
            goto L_0x017d
        L_0x049f:
            boolean r10 = r13.y(r14, r7)
            if (r10 == 0) goto L_0x04bb
            r8 = r8 & r6
            long r10 = (long) r8
            float r8 = com.google.android.gms.internal.clearcut.C1.K(r14, r10)
            goto L_0x018e
        L_0x04ad:
            boolean r10 = r13.y(r14, r7)
            if (r10 == 0) goto L_0x04bb
            r8 = r8 & r6
            long r10 = (long) r8
            double r10 = com.google.android.gms.internal.clearcut.C1.L(r14, r10)
            goto L_0x019f
        L_0x04bb:
            int r7 = r7 + -4
            goto L_0x0037
        L_0x04bf:
            if (r1 == 0) goto L_0x04d6
            com.google.android.gms.internal.clearcut.T<?> r14 = r13.f48249q
            r14.c(r15, r1)
            boolean r14 = r0.hasNext()
            if (r14 == 0) goto L_0x04d4
            java.lang.Object r14 = r0.next()
            java.util.Map$Entry r14 = (java.util.Map.Entry) r14
            r1 = r14
            goto L_0x04bf
        L_0x04d4:
            r1 = r3
            goto L_0x04bf
        L_0x04d6:
            return
        L_0x04d7:
            boolean r0 = r13.f48241i
            if (r0 == 0) goto L_0x09a0
            boolean r0 = r13.f48239g
            if (r0 == 0) goto L_0x04f6
            com.google.android.gms.internal.clearcut.T<?> r0 = r13.f48249q
            com.google.android.gms.internal.clearcut.X r0 = r0.b(r14)
            boolean r1 = r0.b()
            if (r1 != 0) goto L_0x04f6
            java.util.Iterator r0 = r0.e()
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L_0x04f8
        L_0x04f6:
            r0 = r3
            r1 = r0
        L_0x04f8:
            int[] r7 = r13.f48233a
            int r7 = r7.length
            r8 = r5
        L_0x04fc:
            if (r8 >= r7) goto L_0x0984
            int r9 = r13.F(r8)
            int[] r10 = r13.f48233a
            r10 = r10[r8]
        L_0x0506:
            if (r1 == 0) goto L_0x0524
            com.google.android.gms.internal.clearcut.T<?> r11 = r13.f48249q
            int r11 = r11.a(r1)
            if (r11 > r10) goto L_0x0524
            com.google.android.gms.internal.clearcut.T<?> r11 = r13.f48249q
            r11.c(r15, r1)
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0522
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L_0x0506
        L_0x0522:
            r1 = r3
            goto L_0x0506
        L_0x0524:
            r11 = r9 & r2
            int r11 = r11 >>> 20
            switch(r11) {
                case 0: goto L_0x0972;
                case 1: goto L_0x0964;
                case 2: goto L_0x0956;
                case 3: goto L_0x0948;
                case 4: goto L_0x093a;
                case 5: goto L_0x092c;
                case 6: goto L_0x091e;
                case 7: goto L_0x0910;
                case 8: goto L_0x0908;
                case 9: goto L_0x0900;
                case 10: goto L_0x08f8;
                case 11: goto L_0x08ea;
                case 12: goto L_0x08dc;
                case 13: goto L_0x08ce;
                case 14: goto L_0x08c0;
                case 15: goto L_0x08b2;
                case 16: goto L_0x08a4;
                case 17: goto L_0x089c;
                case 18: goto L_0x088b;
                case 19: goto L_0x087a;
                case 20: goto L_0x0869;
                case 21: goto L_0x0858;
                case 22: goto L_0x0847;
                case 23: goto L_0x0836;
                case 24: goto L_0x0825;
                case 25: goto L_0x0814;
                case 26: goto L_0x0803;
                case 27: goto L_0x07ee;
                case 28: goto L_0x07dd;
                case 29: goto L_0x07cc;
                case 30: goto L_0x07bb;
                case 31: goto L_0x07aa;
                case 32: goto L_0x0799;
                case 33: goto L_0x0788;
                case 34: goto L_0x0777;
                case 35: goto L_0x0766;
                case 36: goto L_0x0755;
                case 37: goto L_0x0744;
                case 38: goto L_0x0733;
                case 39: goto L_0x0722;
                case 40: goto L_0x0711;
                case 41: goto L_0x0700;
                case 42: goto L_0x06ef;
                case 43: goto L_0x06de;
                case 44: goto L_0x06cd;
                case 45: goto L_0x06bc;
                case 46: goto L_0x06ab;
                case 47: goto L_0x069a;
                case 48: goto L_0x0689;
                case 49: goto L_0x0674;
                case 50: goto L_0x0669;
                case 51: goto L_0x0658;
                case 52: goto L_0x0647;
                case 53: goto L_0x0636;
                case 54: goto L_0x0625;
                case 55: goto L_0x0614;
                case 56: goto L_0x0603;
                case 57: goto L_0x05f2;
                case 58: goto L_0x05e1;
                case 59: goto L_0x05d0;
                case 60: goto L_0x05bb;
                case 61: goto L_0x05a8;
                case 62: goto L_0x0597;
                case 63: goto L_0x0586;
                case 64: goto L_0x0575;
                case 65: goto L_0x0564;
                case 66: goto L_0x0553;
                case 67: goto L_0x0542;
                case 68: goto L_0x052d;
                default: goto L_0x052b;
            }
        L_0x052b:
            goto L_0x0980
        L_0x052d:
            boolean r11 = r13.z(r14, r10, r8)
            if (r11 == 0) goto L_0x0980
        L_0x0533:
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C1.M(r14, r11)
            com.google.android.gms.internal.clearcut.d1 r11 = r13.C(r8)
            r15.J(r10, r9, r11)
            goto L_0x0980
        L_0x0542:
            boolean r11 = r13.z(r14, r10, r8)
            if (r11 == 0) goto L_0x0980
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = R(r14, r11)
        L_0x054e:
            r15.a(r10, r11)
            goto L_0x0980
        L_0x0553:
            boolean r11 = r13.z(r14, r10, r8)
            if (r11 == 0) goto L_0x0980
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = Q(r14, r11)
        L_0x055f:
            r15.v(r10, r9)
            goto L_0x0980
        L_0x0564:
            boolean r11 = r13.z(r14, r10, r8)
            if (r11 == 0) goto L_0x0980
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = R(r14, r11)
        L_0x0570:
            r15.K(r10, r11)
            goto L_0x0980
        L_0x0575:
            boolean r11 = r13.z(r14, r10, r8)
            if (r11 == 0) goto L_0x0980
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = Q(r14, r11)
        L_0x0581:
            r15.P(r10, r9)
            goto L_0x0980
        L_0x0586:
            boolean r11 = r13.z(r14, r10, r8)
            if (r11 == 0) goto L_0x0980
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = Q(r14, r11)
        L_0x0592:
            r15.M(r10, r9)
            goto L_0x0980
        L_0x0597:
            boolean r11 = r13.z(r14, r10, r8)
            if (r11 == 0) goto L_0x0980
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = Q(r14, r11)
        L_0x05a3:
            r15.u(r10, r9)
            goto L_0x0980
        L_0x05a8:
            boolean r11 = r13.z(r14, r10, r8)
            if (r11 == 0) goto L_0x0980
        L_0x05ae:
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C1.M(r14, r11)
            com.google.android.gms.internal.clearcut.A r9 = (com.google.android.gms.internal.clearcut.A) r9
            r15.H(r10, r9)
            goto L_0x0980
        L_0x05bb:
            boolean r11 = r13.z(r14, r10, r8)
            if (r11 == 0) goto L_0x0980
        L_0x05c1:
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C1.M(r14, r11)
            com.google.android.gms.internal.clearcut.d1 r11 = r13.C(r8)
            r15.I(r10, r9, r11)
            goto L_0x0980
        L_0x05d0:
            boolean r11 = r13.z(r14, r10, r8)
            if (r11 == 0) goto L_0x0980
        L_0x05d6:
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C1.M(r14, r11)
            u(r10, r9, r15)
            goto L_0x0980
        L_0x05e1:
            boolean r11 = r13.z(r14, r10, r8)
            if (r11 == 0) goto L_0x0980
            r9 = r9 & r6
            long r11 = (long) r9
            boolean r9 = S(r14, r11)
        L_0x05ed:
            r15.zzb(r10, r9)
            goto L_0x0980
        L_0x05f2:
            boolean r11 = r13.z(r14, r10, r8)
            if (r11 == 0) goto L_0x0980
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = Q(r14, r11)
        L_0x05fe:
            r15.m(r10, r9)
            goto L_0x0980
        L_0x0603:
            boolean r11 = r13.z(r14, r10, r8)
            if (r11 == 0) goto L_0x0980
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = R(r14, r11)
        L_0x060f:
            r15.f(r10, r11)
            goto L_0x0980
        L_0x0614:
            boolean r11 = r13.z(r14, r10, r8)
            if (r11 == 0) goto L_0x0980
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = Q(r14, r11)
        L_0x0620:
            r15.e(r10, r9)
            goto L_0x0980
        L_0x0625:
            boolean r11 = r13.z(r14, r10, r8)
            if (r11 == 0) goto L_0x0980
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = R(r14, r11)
        L_0x0631:
            r15.j(r10, r11)
            goto L_0x0980
        L_0x0636:
            boolean r11 = r13.z(r14, r10, r8)
            if (r11 == 0) goto L_0x0980
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = R(r14, r11)
        L_0x0642:
            r15.L(r10, r11)
            goto L_0x0980
        L_0x0647:
            boolean r11 = r13.z(r14, r10, r8)
            if (r11 == 0) goto L_0x0980
            r9 = r9 & r6
            long r11 = (long) r9
            float r9 = P(r14, r11)
        L_0x0653:
            r15.l(r10, r9)
            goto L_0x0980
        L_0x0658:
            boolean r11 = r13.z(r14, r10, r8)
            if (r11 == 0) goto L_0x0980
            r9 = r9 & r6
            long r11 = (long) r9
            double r11 = O(r14, r11)
        L_0x0664:
            r15.k(r10, r11)
            goto L_0x0980
        L_0x0669:
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C1.M(r14, r11)
            r13.w(r15, r10, r9, r8)
            goto L_0x0980
        L_0x0674:
            int[] r10 = r13.f48233a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C1.M(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.d1 r11 = r13.C(r8)
            com.google.android.gms.internal.clearcut.C7184f1.l(r10, r9, r15, r11)
            goto L_0x0980
        L_0x0689:
            int[] r10 = r13.f48233a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C1.M(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.C7184f1.F(r10, r9, r15, r4)
            goto L_0x0980
        L_0x069a:
            int[] r10 = r13.f48233a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C1.M(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.C7184f1.Q(r10, r9, r15, r4)
            goto L_0x0980
        L_0x06ab:
            int[] r10 = r13.f48233a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C1.M(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.C7184f1.K(r10, r9, r15, r4)
            goto L_0x0980
        L_0x06bc:
            int[] r10 = r13.f48233a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C1.M(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.C7184f1.S(r10, r9, r15, r4)
            goto L_0x0980
        L_0x06cd:
            int[] r10 = r13.f48233a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C1.M(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.C7184f1.T(r10, r9, r15, r4)
            goto L_0x0980
        L_0x06de:
            int[] r10 = r13.f48233a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C1.M(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.C7184f1.O(r10, r9, r15, r4)
            goto L_0x0980
        L_0x06ef:
            int[] r10 = r13.f48233a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C1.M(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.C7184f1.U(r10, r9, r15, r4)
            goto L_0x0980
        L_0x0700:
            int[] r10 = r13.f48233a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C1.M(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.C7184f1.R(r10, r9, r15, r4)
            goto L_0x0980
        L_0x0711:
            int[] r10 = r13.f48233a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C1.M(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.C7184f1.H(r10, r9, r15, r4)
            goto L_0x0980
        L_0x0722:
            int[] r10 = r13.f48233a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C1.M(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.C7184f1.M(r10, r9, r15, r4)
            goto L_0x0980
        L_0x0733:
            int[] r10 = r13.f48233a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C1.M(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.C7184f1.x(r10, r9, r15, r4)
            goto L_0x0980
        L_0x0744:
            int[] r10 = r13.f48233a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C1.M(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.C7184f1.r(r10, r9, r15, r4)
            goto L_0x0980
        L_0x0755:
            int[] r10 = r13.f48233a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C1.M(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.C7184f1.m(r10, r9, r15, r4)
            goto L_0x0980
        L_0x0766:
            int[] r10 = r13.f48233a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C1.M(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.C7184f1.f(r10, r9, r15, r4)
            goto L_0x0980
        L_0x0777:
            int[] r10 = r13.f48233a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C1.M(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.C7184f1.F(r10, r9, r15, r5)
            goto L_0x0980
        L_0x0788:
            int[] r10 = r13.f48233a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C1.M(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.C7184f1.Q(r10, r9, r15, r5)
            goto L_0x0980
        L_0x0799:
            int[] r10 = r13.f48233a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C1.M(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.C7184f1.K(r10, r9, r15, r5)
            goto L_0x0980
        L_0x07aa:
            int[] r10 = r13.f48233a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C1.M(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.C7184f1.S(r10, r9, r15, r5)
            goto L_0x0980
        L_0x07bb:
            int[] r10 = r13.f48233a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C1.M(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.C7184f1.T(r10, r9, r15, r5)
            goto L_0x0980
        L_0x07cc:
            int[] r10 = r13.f48233a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C1.M(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.C7184f1.O(r10, r9, r15, r5)
            goto L_0x0980
        L_0x07dd:
            int[] r10 = r13.f48233a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C1.M(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.C7184f1.k(r10, r9, r15)
            goto L_0x0980
        L_0x07ee:
            int[] r10 = r13.f48233a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C1.M(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.d1 r11 = r13.C(r8)
            com.google.android.gms.internal.clearcut.C7184f1.e(r10, r9, r15, r11)
            goto L_0x0980
        L_0x0803:
            int[] r10 = r13.f48233a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C1.M(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.C7184f1.d(r10, r9, r15)
            goto L_0x0980
        L_0x0814:
            int[] r10 = r13.f48233a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C1.M(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.C7184f1.U(r10, r9, r15, r5)
            goto L_0x0980
        L_0x0825:
            int[] r10 = r13.f48233a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C1.M(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.C7184f1.R(r10, r9, r15, r5)
            goto L_0x0980
        L_0x0836:
            int[] r10 = r13.f48233a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C1.M(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.C7184f1.H(r10, r9, r15, r5)
            goto L_0x0980
        L_0x0847:
            int[] r10 = r13.f48233a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C1.M(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.C7184f1.M(r10, r9, r15, r5)
            goto L_0x0980
        L_0x0858:
            int[] r10 = r13.f48233a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C1.M(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.C7184f1.x(r10, r9, r15, r5)
            goto L_0x0980
        L_0x0869:
            int[] r10 = r13.f48233a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C1.M(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.C7184f1.r(r10, r9, r15, r5)
            goto L_0x0980
        L_0x087a:
            int[] r10 = r13.f48233a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C1.M(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.C7184f1.m(r10, r9, r15, r5)
            goto L_0x0980
        L_0x088b:
            int[] r10 = r13.f48233a
            r10 = r10[r8]
            r9 = r9 & r6
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.clearcut.C1.M(r14, r11)
            java.util.List r9 = (java.util.List) r9
            com.google.android.gms.internal.clearcut.C7184f1.f(r10, r9, r15, r5)
            goto L_0x0980
        L_0x089c:
            boolean r11 = r13.y(r14, r8)
            if (r11 == 0) goto L_0x0980
            goto L_0x0533
        L_0x08a4:
            boolean r11 = r13.y(r14, r8)
            if (r11 == 0) goto L_0x0980
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = com.google.android.gms.internal.clearcut.C1.I(r14, r11)
            goto L_0x054e
        L_0x08b2:
            boolean r11 = r13.y(r14, r8)
            if (r11 == 0) goto L_0x0980
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.gms.internal.clearcut.C1.H(r14, r11)
            goto L_0x055f
        L_0x08c0:
            boolean r11 = r13.y(r14, r8)
            if (r11 == 0) goto L_0x0980
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = com.google.android.gms.internal.clearcut.C1.I(r14, r11)
            goto L_0x0570
        L_0x08ce:
            boolean r11 = r13.y(r14, r8)
            if (r11 == 0) goto L_0x0980
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.gms.internal.clearcut.C1.H(r14, r11)
            goto L_0x0581
        L_0x08dc:
            boolean r11 = r13.y(r14, r8)
            if (r11 == 0) goto L_0x0980
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.gms.internal.clearcut.C1.H(r14, r11)
            goto L_0x0592
        L_0x08ea:
            boolean r11 = r13.y(r14, r8)
            if (r11 == 0) goto L_0x0980
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.gms.internal.clearcut.C1.H(r14, r11)
            goto L_0x05a3
        L_0x08f8:
            boolean r11 = r13.y(r14, r8)
            if (r11 == 0) goto L_0x0980
            goto L_0x05ae
        L_0x0900:
            boolean r11 = r13.y(r14, r8)
            if (r11 == 0) goto L_0x0980
            goto L_0x05c1
        L_0x0908:
            boolean r11 = r13.y(r14, r8)
            if (r11 == 0) goto L_0x0980
            goto L_0x05d6
        L_0x0910:
            boolean r11 = r13.y(r14, r8)
            if (r11 == 0) goto L_0x0980
            r9 = r9 & r6
            long r11 = (long) r9
            boolean r9 = com.google.android.gms.internal.clearcut.C1.J(r14, r11)
            goto L_0x05ed
        L_0x091e:
            boolean r11 = r13.y(r14, r8)
            if (r11 == 0) goto L_0x0980
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.gms.internal.clearcut.C1.H(r14, r11)
            goto L_0x05fe
        L_0x092c:
            boolean r11 = r13.y(r14, r8)
            if (r11 == 0) goto L_0x0980
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = com.google.android.gms.internal.clearcut.C1.I(r14, r11)
            goto L_0x060f
        L_0x093a:
            boolean r11 = r13.y(r14, r8)
            if (r11 == 0) goto L_0x0980
            r9 = r9 & r6
            long r11 = (long) r9
            int r9 = com.google.android.gms.internal.clearcut.C1.H(r14, r11)
            goto L_0x0620
        L_0x0948:
            boolean r11 = r13.y(r14, r8)
            if (r11 == 0) goto L_0x0980
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = com.google.android.gms.internal.clearcut.C1.I(r14, r11)
            goto L_0x0631
        L_0x0956:
            boolean r11 = r13.y(r14, r8)
            if (r11 == 0) goto L_0x0980
            r9 = r9 & r6
            long r11 = (long) r9
            long r11 = com.google.android.gms.internal.clearcut.C1.I(r14, r11)
            goto L_0x0642
        L_0x0964:
            boolean r11 = r13.y(r14, r8)
            if (r11 == 0) goto L_0x0980
            r9 = r9 & r6
            long r11 = (long) r9
            float r9 = com.google.android.gms.internal.clearcut.C1.K(r14, r11)
            goto L_0x0653
        L_0x0972:
            boolean r11 = r13.y(r14, r8)
            if (r11 == 0) goto L_0x0980
            r9 = r9 & r6
            long r11 = (long) r9
            double r11 = com.google.android.gms.internal.clearcut.C1.L(r14, r11)
            goto L_0x0664
        L_0x0980:
            int r8 = r8 + 4
            goto L_0x04fc
        L_0x0984:
            if (r1 == 0) goto L_0x099a
            com.google.android.gms.internal.clearcut.T<?> r2 = r13.f48249q
            r2.c(r15, r1)
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0998
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L_0x0984
        L_0x0998:
            r1 = r3
            goto L_0x0984
        L_0x099a:
            com.google.android.gms.internal.clearcut.v1<?, ?> r0 = r13.f48248p
            v(r0, r14, r15)
            return
        L_0x09a0:
            r13.K(r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.Q0.f(java.lang.Object, com.google.android.gms.internal.clearcut.Q1):void");
    }

    public final boolean g(T t10) {
        int i10;
        int i11;
        T t11 = t10;
        int[] iArr = this.f48243k;
        int i12 = 1;
        if (iArr == null || iArr.length == 0) {
            return true;
        }
        int length = iArr.length;
        int i13 = -1;
        int i14 = 0;
        int i15 = 0;
        while (i14 < length) {
            int i16 = iArr[i14];
            int H10 = H(i16);
            int F10 = F(H10);
            if (!this.f48241i) {
                int i17 = this.f48233a[H10 + 2];
                int i18 = i17 & 1048575;
                i11 = i12 << (i17 >>> 20);
                if (i18 != i13) {
                    i10 = length;
                    i15 = f48232s.getInt(t11, (long) i18);
                    i13 = i18;
                } else {
                    i10 = length;
                }
            } else {
                i10 = length;
                i11 = 0;
            }
            if ((268435456 & F10) != 0 && !A(t11, H10, i15, i11)) {
                return false;
            }
            int i19 = (267386880 & F10) >>> 20;
            if (i19 != 9 && i19 != 17) {
                if (i19 != 27) {
                    if (i19 == 60 || i19 == 68) {
                        if (z(t11, i16, H10) && !B(t11, F10, C(H10))) {
                            return false;
                        }
                    } else if (i19 != 49) {
                        if (i19 == 50 && !this.f48250r.zzh(C1.M(t11, (long) (F10 & 1048575))).isEmpty()) {
                            this.f48250r.e(D(H10));
                            throw null;
                        }
                    }
                }
                List list = (List) C1.M(t11, (long) (F10 & 1048575));
                if (!list.isEmpty()) {
                    C7178d1 C10 = C(H10);
                    for (int i20 = 0; i20 < list.size(); i20++) {
                        if (!C10.g(list.get(i20))) {
                            return false;
                        }
                    }
                    continue;
                } else {
                    continue;
                }
            } else if (A(t11, H10, i15, i11) && !B(t11, F10, C(H10))) {
                return false;
            }
            i14++;
            length = i10;
            i12 = 1;
        }
        return !this.f48239g || this.f48249q.b(t11).d();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0057, code lost:
        com.google.android.gms.internal.clearcut.C1.h(r7, r2, com.google.android.gms.internal.clearcut.C1.I(r8, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005e, code lost:
        I(r7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0069, code lost:
        com.google.android.gms.internal.clearcut.C1.g(r7, r2, com.google.android.gms.internal.clearcut.C1.H(r8, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0093, code lost:
        com.google.android.gms.internal.clearcut.C1.i(r7, r2, com.google.android.gms.internal.clearcut.C1.M(r8, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00f1, code lost:
        r0 = r0 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002b, code lost:
        com.google.android.gms.internal.clearcut.C1.i(r7, r2, com.google.android.gms.internal.clearcut.C1.M(r8, r2));
        J(r7, r4, r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h(T r7, T r8) {
        /*
            r6 = this;
            r8.getClass()
            r0 = 0
        L_0x0004:
            int[] r1 = r6.f48233a
            int r1 = r1.length
            if (r0 >= r1) goto L_0x00f5
            int r1 = r6.F(r0)
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r2 = r2 & r1
            long r2 = (long) r2
            int[] r4 = r6.f48233a
            r4 = r4[r0]
            r5 = 267386880(0xff00000, float:2.3665827E-29)
            r1 = r1 & r5
            int r1 = r1 >>> 20
            switch(r1) {
                case 0: goto L_0x00e2;
                case 1: goto L_0x00d3;
                case 2: goto L_0x00cc;
                case 3: goto L_0x00c5;
                case 4: goto L_0x00be;
                case 5: goto L_0x00b7;
                case 6: goto L_0x00b0;
                case 7: goto L_0x00a2;
                case 8: goto L_0x009b;
                case 9: goto L_0x004c;
                case 10: goto L_0x008d;
                case 11: goto L_0x0086;
                case 12: goto L_0x007f;
                case 13: goto L_0x0078;
                case 14: goto L_0x0071;
                case 15: goto L_0x0063;
                case 16: goto L_0x0051;
                case 17: goto L_0x004c;
                case 18: goto L_0x0045;
                case 19: goto L_0x0045;
                case 20: goto L_0x0045;
                case 21: goto L_0x0045;
                case 22: goto L_0x0045;
                case 23: goto L_0x0045;
                case 24: goto L_0x0045;
                case 25: goto L_0x0045;
                case 26: goto L_0x0045;
                case 27: goto L_0x0045;
                case 28: goto L_0x0045;
                case 29: goto L_0x0045;
                case 30: goto L_0x0045;
                case 31: goto L_0x0045;
                case 32: goto L_0x0045;
                case 33: goto L_0x0045;
                case 34: goto L_0x0045;
                case 35: goto L_0x0045;
                case 36: goto L_0x0045;
                case 37: goto L_0x0045;
                case 38: goto L_0x0045;
                case 39: goto L_0x0045;
                case 40: goto L_0x0045;
                case 41: goto L_0x0045;
                case 42: goto L_0x0045;
                case 43: goto L_0x0045;
                case 44: goto L_0x0045;
                case 45: goto L_0x0045;
                case 46: goto L_0x0045;
                case 47: goto L_0x0045;
                case 48: goto L_0x0045;
                case 49: goto L_0x0045;
                case 50: goto L_0x003e;
                case 51: goto L_0x0037;
                case 52: goto L_0x0037;
                case 53: goto L_0x0037;
                case 54: goto L_0x0037;
                case 55: goto L_0x0037;
                case 56: goto L_0x0037;
                case 57: goto L_0x0037;
                case 58: goto L_0x0037;
                case 59: goto L_0x0037;
                case 60: goto L_0x0020;
                case 61: goto L_0x0025;
                case 62: goto L_0x0025;
                case 63: goto L_0x0025;
                case 64: goto L_0x0025;
                case 65: goto L_0x0025;
                case 66: goto L_0x0025;
                case 67: goto L_0x0025;
                case 68: goto L_0x0020;
                default: goto L_0x001e;
            }
        L_0x001e:
            goto L_0x00f1
        L_0x0020:
            r6.L(r7, r8, r0)
            goto L_0x00f1
        L_0x0025:
            boolean r1 = r6.z(r8, r4, r0)
            if (r1 == 0) goto L_0x00f1
        L_0x002b:
            java.lang.Object r1 = com.google.android.gms.internal.clearcut.C1.M(r8, r2)
            com.google.android.gms.internal.clearcut.C1.i(r7, r2, r1)
            r6.J(r7, r4, r0)
            goto L_0x00f1
        L_0x0037:
            boolean r1 = r6.z(r8, r4, r0)
            if (r1 == 0) goto L_0x00f1
            goto L_0x002b
        L_0x003e:
            com.google.android.gms.internal.clearcut.H0 r1 = r6.f48250r
            com.google.android.gms.internal.clearcut.C7184f1.h(r1, r7, r8, r2)
            goto L_0x00f1
        L_0x0045:
            com.google.android.gms.internal.clearcut.w0 r1 = r6.f48247o
            r1.b(r7, r8, r2)
            goto L_0x00f1
        L_0x004c:
            r6.x(r7, r8, r0)
            goto L_0x00f1
        L_0x0051:
            boolean r1 = r6.y(r8, r0)
            if (r1 == 0) goto L_0x00f1
        L_0x0057:
            long r4 = com.google.android.gms.internal.clearcut.C1.I(r8, r2)
            com.google.android.gms.internal.clearcut.C1.h(r7, r2, r4)
        L_0x005e:
            r6.I(r7, r0)
            goto L_0x00f1
        L_0x0063:
            boolean r1 = r6.y(r8, r0)
            if (r1 == 0) goto L_0x00f1
        L_0x0069:
            int r1 = com.google.android.gms.internal.clearcut.C1.H(r8, r2)
            com.google.android.gms.internal.clearcut.C1.g(r7, r2, r1)
            goto L_0x005e
        L_0x0071:
            boolean r1 = r6.y(r8, r0)
            if (r1 == 0) goto L_0x00f1
            goto L_0x0057
        L_0x0078:
            boolean r1 = r6.y(r8, r0)
            if (r1 == 0) goto L_0x00f1
            goto L_0x0069
        L_0x007f:
            boolean r1 = r6.y(r8, r0)
            if (r1 == 0) goto L_0x00f1
            goto L_0x0069
        L_0x0086:
            boolean r1 = r6.y(r8, r0)
            if (r1 == 0) goto L_0x00f1
            goto L_0x0069
        L_0x008d:
            boolean r1 = r6.y(r8, r0)
            if (r1 == 0) goto L_0x00f1
        L_0x0093:
            java.lang.Object r1 = com.google.android.gms.internal.clearcut.C1.M(r8, r2)
            com.google.android.gms.internal.clearcut.C1.i(r7, r2, r1)
            goto L_0x005e
        L_0x009b:
            boolean r1 = r6.y(r8, r0)
            if (r1 == 0) goto L_0x00f1
            goto L_0x0093
        L_0x00a2:
            boolean r1 = r6.y(r8, r0)
            if (r1 == 0) goto L_0x00f1
            boolean r1 = com.google.android.gms.internal.clearcut.C1.J(r8, r2)
            com.google.android.gms.internal.clearcut.C1.j(r7, r2, r1)
            goto L_0x005e
        L_0x00b0:
            boolean r1 = r6.y(r8, r0)
            if (r1 == 0) goto L_0x00f1
            goto L_0x0069
        L_0x00b7:
            boolean r1 = r6.y(r8, r0)
            if (r1 == 0) goto L_0x00f1
            goto L_0x0057
        L_0x00be:
            boolean r1 = r6.y(r8, r0)
            if (r1 == 0) goto L_0x00f1
            goto L_0x0069
        L_0x00c5:
            boolean r1 = r6.y(r8, r0)
            if (r1 == 0) goto L_0x00f1
            goto L_0x0057
        L_0x00cc:
            boolean r1 = r6.y(r8, r0)
            if (r1 == 0) goto L_0x00f1
            goto L_0x0057
        L_0x00d3:
            boolean r1 = r6.y(r8, r0)
            if (r1 == 0) goto L_0x00f1
            float r1 = com.google.android.gms.internal.clearcut.C1.K(r8, r2)
            com.google.android.gms.internal.clearcut.C1.f(r7, r2, r1)
            goto L_0x005e
        L_0x00e2:
            boolean r1 = r6.y(r8, r0)
            if (r1 == 0) goto L_0x00f1
            double r4 = com.google.android.gms.internal.clearcut.C1.L(r8, r2)
            com.google.android.gms.internal.clearcut.C1.e(r7, r2, r4)
            goto L_0x005e
        L_0x00f1:
            int r0 = r0 + 4
            goto L_0x0004
        L_0x00f5:
            boolean r0 = r6.f48241i
            if (r0 != 0) goto L_0x0107
            com.google.android.gms.internal.clearcut.v1<?, ?> r0 = r6.f48248p
            com.google.android.gms.internal.clearcut.C7184f1.i(r0, r7, r8)
            boolean r0 = r6.f48239g
            if (r0 == 0) goto L_0x0107
            com.google.android.gms.internal.clearcut.T<?> r0 = r6.f48249q
            com.google.android.gms.internal.clearcut.C7184f1.g(r0, r7, r8)
        L_0x0107:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.Q0.h(java.lang.Object, java.lang.Object):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01d8, code lost:
        if (r0.f48242j != false) goto L_0x0187;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01e9, code lost:
        if (r0.f48242j != false) goto L_0x0187;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x01fa, code lost:
        if (r0.f48242j != false) goto L_0x0187;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x020b, code lost:
        if (r0.f48242j != false) goto L_0x0187;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x021d, code lost:
        if (r0.f48242j != false) goto L_0x0187;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x022f, code lost:
        if (r0.f48242j != false) goto L_0x0187;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0241, code lost:
        if (r0.f48242j != false) goto L_0x0187;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0253, code lost:
        if (r0.f48242j != false) goto L_0x0187;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0265, code lost:
        if (r0.f48242j != false) goto L_0x0187;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0277, code lost:
        if (r0.f48242j != false) goto L_0x0187;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004d, code lost:
        r3 = com.google.android.gms.internal.clearcut.M.P(r3, (com.google.android.gms.internal.clearcut.M0) com.google.android.gms.internal.clearcut.C1.M(r1, r4), C(r12));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005b, code lost:
        r13 = r13 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x0365, code lost:
        if ((r4 instanceof com.google.android.gms.internal.clearcut.A) != false) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x03b5, code lost:
        r12 = r12 + 4;
        r3 = 267386880;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0068, code lost:
        r3 = com.google.android.gms.internal.clearcut.M.g0(r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x041f, code lost:
        if (z(r1, r15, r4) != false) goto L_0x0421;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x0421, code lost:
        r6 = com.google.android.gms.internal.clearcut.M.P(r15, (com.google.android.gms.internal.clearcut.M0) r2.getObject(r1, r10), C(r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x042f, code lost:
        r5 = r5 + r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x0431, code lost:
        r9 = false;
        r13 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x0442, code lost:
        r6 = com.google.android.gms.internal.clearcut.M.g0(r15, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x0451, code lost:
        r6 = com.google.android.gms.internal.clearcut.M.r0(r15, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x045a, code lost:
        if (z(r1, r15, r4) != false) goto L_0x045c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x045c, code lost:
        r6 = com.google.android.gms.internal.clearcut.M.o0(r15, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x0467, code lost:
        if (z(r1, r15, r4) != false) goto L_0x0469;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x0469, code lost:
        r9 = com.google.android.gms.internal.clearcut.M.v0(r15, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x046e, code lost:
        r5 = r5 + r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0077, code lost:
        r3 = com.google.android.gms.internal.clearcut.M.r0(r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x047a, code lost:
        r6 = com.google.android.gms.internal.clearcut.M.w0(r15, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x0489, code lost:
        r6 = com.google.android.gms.internal.clearcut.M.n0(r15, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x0492, code lost:
        if (z(r1, r15, r4) != false) goto L_0x0494;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x0494, code lost:
        r6 = r2.getObject(r1, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x0498, code lost:
        r6 = com.google.android.gms.internal.clearcut.M.N(r15, (com.google.android.gms.internal.clearcut.A) r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x04a3, code lost:
        if (z(r1, r15, r4) != false) goto L_0x04a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x04a5, code lost:
        r6 = com.google.android.gms.internal.clearcut.C7184f1.n(r15, r2.getObject(r1, r10), C(r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x04bf, code lost:
        if ((r6 instanceof com.google.android.gms.internal.clearcut.A) != false) goto L_0x0498;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x04c2, code lost:
        r6 = com.google.android.gms.internal.clearcut.M.C(r15, (java.lang.String) r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x04ce, code lost:
        if (z(r1, r15, r4) != false) goto L_0x04d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x04d0, code lost:
        r6 = com.google.android.gms.internal.clearcut.M.Q(r15, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0082, code lost:
        r3 = com.google.android.gms.internal.clearcut.M.o0(r3, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x0569, code lost:
        if (r0.f48242j != false) goto L_0x056b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x056b, code lost:
        r2.putInt(r1, (long) r9, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x056f, code lost:
        r9 = (com.google.android.gms.internal.clearcut.M.B0(r15) + com.google.android.gms.internal.clearcut.M.D0(r6)) + r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x0589, code lost:
        if (r0.f48242j != false) goto L_0x056b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x059a, code lost:
        if (r0.f48242j != false) goto L_0x056b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x008d, code lost:
        r3 = com.google.android.gms.internal.clearcut.M.v0(r3, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x05ab, code lost:
        if (r0.f48242j != false) goto L_0x056b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:306:0x05bc, code lost:
        if (r0.f48242j != false) goto L_0x056b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x05cd, code lost:
        if (r0.f48242j != false) goto L_0x056b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:0x05de, code lost:
        if (r0.f48242j != false) goto L_0x056b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:318:0x05ef, code lost:
        if (r0.f48242j != false) goto L_0x056b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:322:0x0601, code lost:
        if (r0.f48242j != false) goto L_0x056b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x0613, code lost:
        if (r0.f48242j != false) goto L_0x056b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:330:0x0625, code lost:
        if (r0.f48242j != false) goto L_0x056b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:334:0x0637, code lost:
        if (r0.f48242j != false) goto L_0x056b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:338:0x0649, code lost:
        if (r0.f48242j != false) goto L_0x056b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x009c, code lost:
        r3 = com.google.android.gms.internal.clearcut.M.w0(r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:342:0x065b, code lost:
        if (r0.f48242j != false) goto L_0x056b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:0x066a, code lost:
        r5 = r5 + r6;
        r6 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:0x0715, code lost:
        if ((r12 & r18) != 0) goto L_0x0421;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:367:0x072f, code lost:
        if ((r12 & r18) != 0) goto L_0x045c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:369:0x0735, code lost:
        if ((r12 & r18) != 0) goto L_0x0469;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:377:0x074f, code lost:
        if ((r12 & r18) != 0) goto L_0x0494;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:379:0x0755, code lost:
        if ((r12 & r18) != 0) goto L_0x04a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ab, code lost:
        r3 = com.google.android.gms.internal.clearcut.M.n0(r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:383:0x0763, code lost:
        if ((r6 instanceof com.google.android.gms.internal.clearcut.A) != false) goto L_0x0498;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:385:0x0769, code lost:
        if ((r12 & r18) != 0) goto L_0x04d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:392:0x0784, code lost:
        r5 = r5 + r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b6, code lost:
        r4 = com.google.android.gms.internal.clearcut.C1.M(r1, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:410:0x07d6, code lost:
        r4 = r4 + 4;
        r11 = r6;
        r6 = r9;
        r9 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00ba, code lost:
        r3 = com.google.android.gms.internal.clearcut.M.N(r3, (com.google.android.gms.internal.clearcut.A) r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00c7, code lost:
        r3 = com.google.android.gms.internal.clearcut.C7184f1.n(r3, com.google.android.gms.internal.clearcut.C1.M(r1, r4), C(r12));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00e0, code lost:
        if ((r4 instanceof com.google.android.gms.internal.clearcut.A) != false) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00e3, code lost:
        r3 = com.google.android.gms.internal.clearcut.M.C(r3, (java.lang.String) r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00f1, code lost:
        r3 = com.google.android.gms.internal.clearcut.M.Q(r3, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00fd, code lost:
        r3 = com.google.android.gms.internal.clearcut.M.t0(r3, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0109, code lost:
        r3 = com.google.android.gms.internal.clearcut.M.k0(r3, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0119, code lost:
        r3 = com.google.android.gms.internal.clearcut.M.j0(r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0129, code lost:
        r3 = com.google.android.gms.internal.clearcut.M.d0(r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0139, code lost:
        r3 = com.google.android.gms.internal.clearcut.M.W(r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0145, code lost:
        r3 = com.google.android.gms.internal.clearcut.M.z(r3, 0.0f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0151, code lost:
        r3 = com.google.android.gms.internal.clearcut.M.y(r3, 0.0d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0185, code lost:
        if (r0.f48242j != false) goto L_0x0187;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0187, code lost:
        r2.putInt(r1, (long) r14, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x018b, code lost:
        r3 = (com.google.android.gms.internal.clearcut.M.B0(r3) + com.google.android.gms.internal.clearcut.M.D0(r4)) + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01a5, code lost:
        if (r0.f48242j != false) goto L_0x0187;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01b6, code lost:
        if (r0.f48242j != false) goto L_0x0187;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01c7, code lost:
        if (r0.f48242j != false) goto L_0x0187;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int i(T r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            boolean r2 = r0.f48241i
            r3 = 267386880(0xff00000, float:2.3665827E-29)
            r6 = 0
            r7 = 1
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r9 = 0
            r11 = 0
            if (r2 == 0) goto L_0x03c3
            sun.misc.Unsafe r2 = f48232s
            r12 = r11
            r13 = r12
        L_0x0016:
            int[] r14 = r0.f48233a
            int r14 = r14.length
            if (r12 >= r14) goto L_0x03bb
            int r14 = r0.F(r12)
            r15 = r14 & r3
            int r15 = r15 >>> 20
            int[] r3 = r0.f48233a
            r3 = r3[r12]
            r14 = r14 & r8
            long r4 = (long) r14
            com.google.android.gms.internal.clearcut.b0 r14 = com.google.android.gms.internal.clearcut.C7170b0.DOUBLE_LIST_PACKED
            int r14 = r14.a()
            if (r15 < r14) goto L_0x0041
            com.google.android.gms.internal.clearcut.b0 r14 = com.google.android.gms.internal.clearcut.C7170b0.SINT64_LIST_PACKED
            int r14 = r14.a()
            if (r15 > r14) goto L_0x0041
            int[] r14 = r0.f48233a
            int r17 = r12 + 2
            r14 = r14[r17]
            r14 = r14 & r8
            goto L_0x0042
        L_0x0041:
            r14 = r11
        L_0x0042:
            switch(r15) {
                case 0: goto L_0x03ad;
                case 1: goto L_0x03a5;
                case 2: goto L_0x0399;
                case 3: goto L_0x038d;
                case 4: goto L_0x0381;
                case 5: goto L_0x0379;
                case 6: goto L_0x0371;
                case 7: goto L_0x0369;
                case 8: goto L_0x0359;
                case 9: goto L_0x0351;
                case 10: goto L_0x0349;
                case 11: goto L_0x033d;
                case 12: goto L_0x0331;
                case 13: goto L_0x0329;
                case 14: goto L_0x0321;
                case 15: goto L_0x0315;
                case 16: goto L_0x0309;
                case 17: goto L_0x0301;
                case 18: goto L_0x028f;
                case 19: goto L_0x0299;
                case 20: goto L_0x02f7;
                case 21: goto L_0x02ed;
                case 22: goto L_0x02e3;
                case 23: goto L_0x028f;
                case 24: goto L_0x0299;
                case 25: goto L_0x02d9;
                case 26: goto L_0x02cf;
                case 27: goto L_0x02c1;
                case 28: goto L_0x02b7;
                case 29: goto L_0x02ad;
                case 30: goto L_0x02a3;
                case 31: goto L_0x0299;
                case 32: goto L_0x028f;
                case 33: goto L_0x0285;
                case 34: goto L_0x027b;
                case 35: goto L_0x0269;
                case 36: goto L_0x0257;
                case 37: goto L_0x0245;
                case 38: goto L_0x0233;
                case 39: goto L_0x0221;
                case 40: goto L_0x020f;
                case 41: goto L_0x01fd;
                case 42: goto L_0x01ec;
                case 43: goto L_0x01db;
                case 44: goto L_0x01ca;
                case 45: goto L_0x01b9;
                case 46: goto L_0x01a8;
                case 47: goto L_0x0197;
                case 48: goto L_0x0177;
                case 49: goto L_0x0169;
                case 50: goto L_0x0159;
                case 51: goto L_0x014b;
                case 52: goto L_0x013f;
                case 53: goto L_0x012f;
                case 54: goto L_0x011f;
                case 55: goto L_0x010f;
                case 56: goto L_0x0103;
                case 57: goto L_0x00f7;
                case 58: goto L_0x00eb;
                case 59: goto L_0x00d4;
                case 60: goto L_0x00c1;
                case 61: goto L_0x00b0;
                case 62: goto L_0x00a1;
                case 63: goto L_0x0092;
                case 64: goto L_0x0087;
                case 65: goto L_0x007c;
                case 66: goto L_0x006d;
                case 67: goto L_0x005e;
                case 68: goto L_0x0047;
                default: goto L_0x0045;
            }
        L_0x0045:
            goto L_0x03b5
        L_0x0047:
            boolean r14 = r0.z(r1, r3, r12)
            if (r14 == 0) goto L_0x03b5
        L_0x004d:
            java.lang.Object r4 = com.google.android.gms.internal.clearcut.C1.M(r1, r4)
            com.google.android.gms.internal.clearcut.M0 r4 = (com.google.android.gms.internal.clearcut.M0) r4
            com.google.android.gms.internal.clearcut.d1 r5 = r0.C(r12)
            int r3 = com.google.android.gms.internal.clearcut.M.P(r3, r4, r5)
        L_0x005b:
            int r13 = r13 + r3
            goto L_0x03b5
        L_0x005e:
            boolean r14 = r0.z(r1, r3, r12)
            if (r14 == 0) goto L_0x03b5
            long r4 = R(r1, r4)
        L_0x0068:
            int r3 = com.google.android.gms.internal.clearcut.M.g0(r3, r4)
            goto L_0x005b
        L_0x006d:
            boolean r14 = r0.z(r1, r3, r12)
            if (r14 == 0) goto L_0x03b5
            int r4 = Q(r1, r4)
        L_0x0077:
            int r3 = com.google.android.gms.internal.clearcut.M.r0(r3, r4)
            goto L_0x005b
        L_0x007c:
            boolean r4 = r0.z(r1, r3, r12)
            if (r4 == 0) goto L_0x03b5
        L_0x0082:
            int r3 = com.google.android.gms.internal.clearcut.M.o0(r3, r9)
            goto L_0x005b
        L_0x0087:
            boolean r4 = r0.z(r1, r3, r12)
            if (r4 == 0) goto L_0x03b5
        L_0x008d:
            int r3 = com.google.android.gms.internal.clearcut.M.v0(r3, r11)
            goto L_0x005b
        L_0x0092:
            boolean r14 = r0.z(r1, r3, r12)
            if (r14 == 0) goto L_0x03b5
            int r4 = Q(r1, r4)
        L_0x009c:
            int r3 = com.google.android.gms.internal.clearcut.M.w0(r3, r4)
            goto L_0x005b
        L_0x00a1:
            boolean r14 = r0.z(r1, r3, r12)
            if (r14 == 0) goto L_0x03b5
            int r4 = Q(r1, r4)
        L_0x00ab:
            int r3 = com.google.android.gms.internal.clearcut.M.n0(r3, r4)
            goto L_0x005b
        L_0x00b0:
            boolean r14 = r0.z(r1, r3, r12)
            if (r14 == 0) goto L_0x03b5
        L_0x00b6:
            java.lang.Object r4 = com.google.android.gms.internal.clearcut.C1.M(r1, r4)
        L_0x00ba:
            com.google.android.gms.internal.clearcut.A r4 = (com.google.android.gms.internal.clearcut.A) r4
            int r3 = com.google.android.gms.internal.clearcut.M.N(r3, r4)
            goto L_0x005b
        L_0x00c1:
            boolean r14 = r0.z(r1, r3, r12)
            if (r14 == 0) goto L_0x03b5
        L_0x00c7:
            java.lang.Object r4 = com.google.android.gms.internal.clearcut.C1.M(r1, r4)
            com.google.android.gms.internal.clearcut.d1 r5 = r0.C(r12)
            int r3 = com.google.android.gms.internal.clearcut.C7184f1.n(r3, r4, r5)
            goto L_0x005b
        L_0x00d4:
            boolean r14 = r0.z(r1, r3, r12)
            if (r14 == 0) goto L_0x03b5
            java.lang.Object r4 = com.google.android.gms.internal.clearcut.C1.M(r1, r4)
            boolean r5 = r4 instanceof com.google.android.gms.internal.clearcut.A
            if (r5 == 0) goto L_0x00e3
        L_0x00e2:
            goto L_0x00ba
        L_0x00e3:
            java.lang.String r4 = (java.lang.String) r4
            int r3 = com.google.android.gms.internal.clearcut.M.C(r3, r4)
            goto L_0x005b
        L_0x00eb:
            boolean r4 = r0.z(r1, r3, r12)
            if (r4 == 0) goto L_0x03b5
        L_0x00f1:
            int r3 = com.google.android.gms.internal.clearcut.M.Q(r3, r7)
            goto L_0x005b
        L_0x00f7:
            boolean r4 = r0.z(r1, r3, r12)
            if (r4 == 0) goto L_0x03b5
        L_0x00fd:
            int r3 = com.google.android.gms.internal.clearcut.M.t0(r3, r11)
            goto L_0x005b
        L_0x0103:
            boolean r4 = r0.z(r1, r3, r12)
            if (r4 == 0) goto L_0x03b5
        L_0x0109:
            int r3 = com.google.android.gms.internal.clearcut.M.k0(r3, r9)
            goto L_0x005b
        L_0x010f:
            boolean r14 = r0.z(r1, r3, r12)
            if (r14 == 0) goto L_0x03b5
            int r4 = Q(r1, r4)
        L_0x0119:
            int r3 = com.google.android.gms.internal.clearcut.M.j0(r3, r4)
            goto L_0x005b
        L_0x011f:
            boolean r14 = r0.z(r1, r3, r12)
            if (r14 == 0) goto L_0x03b5
            long r4 = R(r1, r4)
        L_0x0129:
            int r3 = com.google.android.gms.internal.clearcut.M.d0(r3, r4)
            goto L_0x005b
        L_0x012f:
            boolean r14 = r0.z(r1, r3, r12)
            if (r14 == 0) goto L_0x03b5
            long r4 = R(r1, r4)
        L_0x0139:
            int r3 = com.google.android.gms.internal.clearcut.M.W(r3, r4)
            goto L_0x005b
        L_0x013f:
            boolean r4 = r0.z(r1, r3, r12)
            if (r4 == 0) goto L_0x03b5
        L_0x0145:
            int r3 = com.google.android.gms.internal.clearcut.M.z(r3, r6)
            goto L_0x005b
        L_0x014b:
            boolean r4 = r0.z(r1, r3, r12)
            if (r4 == 0) goto L_0x03b5
        L_0x0151:
            r4 = 0
            int r3 = com.google.android.gms.internal.clearcut.M.y(r3, r4)
            goto L_0x005b
        L_0x0159:
            com.google.android.gms.internal.clearcut.H0 r14 = r0.f48250r
            java.lang.Object r4 = com.google.android.gms.internal.clearcut.C1.M(r1, r4)
            java.lang.Object r5 = r0.D(r12)
            int r3 = r14.d(r3, r4, r5)
            goto L_0x005b
        L_0x0169:
            java.util.List r4 = N(r1, r4)
            com.google.android.gms.internal.clearcut.d1 r5 = r0.C(r12)
            int r3 = com.google.android.gms.internal.clearcut.C7184f1.u(r3, r4, r5)
            goto L_0x005b
        L_0x0177:
            java.lang.Object r4 = r2.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.clearcut.C7184f1.q(r4)
            if (r4 <= 0) goto L_0x03b5
            boolean r5 = r0.f48242j
            if (r5 == 0) goto L_0x018b
        L_0x0187:
            long r14 = (long) r14
            r2.putInt(r1, r14, r4)
        L_0x018b:
            int r3 = com.google.android.gms.internal.clearcut.M.B0(r3)
            int r5 = com.google.android.gms.internal.clearcut.M.D0(r4)
            int r3 = r3 + r5
            int r3 = r3 + r4
            goto L_0x005b
        L_0x0197:
            java.lang.Object r4 = r2.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.clearcut.C7184f1.J(r4)
            if (r4 <= 0) goto L_0x03b5
            boolean r5 = r0.f48242j
            if (r5 == 0) goto L_0x018b
            goto L_0x0187
        L_0x01a8:
            java.lang.Object r4 = r2.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.clearcut.C7184f1.N(r4)
            if (r4 <= 0) goto L_0x03b5
            boolean r5 = r0.f48242j
            if (r5 == 0) goto L_0x018b
            goto L_0x0187
        L_0x01b9:
            java.lang.Object r4 = r2.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.clearcut.C7184f1.L(r4)
            if (r4 <= 0) goto L_0x03b5
            boolean r5 = r0.f48242j
            if (r5 == 0) goto L_0x018b
            goto L_0x0187
        L_0x01ca:
            java.lang.Object r4 = r2.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.clearcut.C7184f1.v(r4)
            if (r4 <= 0) goto L_0x03b5
            boolean r5 = r0.f48242j
            if (r5 == 0) goto L_0x018b
            goto L_0x0187
        L_0x01db:
            java.lang.Object r4 = r2.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.clearcut.C7184f1.G(r4)
            if (r4 <= 0) goto L_0x03b5
            boolean r5 = r0.f48242j
            if (r5 == 0) goto L_0x018b
            goto L_0x0187
        L_0x01ec:
            java.lang.Object r4 = r2.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.clearcut.C7184f1.P(r4)
            if (r4 <= 0) goto L_0x03b5
            boolean r5 = r0.f48242j
            if (r5 == 0) goto L_0x018b
            goto L_0x0187
        L_0x01fd:
            java.lang.Object r4 = r2.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.clearcut.C7184f1.L(r4)
            if (r4 <= 0) goto L_0x03b5
            boolean r5 = r0.f48242j
            if (r5 == 0) goto L_0x018b
            goto L_0x0187
        L_0x020f:
            java.lang.Object r4 = r2.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.clearcut.C7184f1.N(r4)
            if (r4 <= 0) goto L_0x03b5
            boolean r5 = r0.f48242j
            if (r5 == 0) goto L_0x018b
            goto L_0x0187
        L_0x0221:
            java.lang.Object r4 = r2.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.clearcut.C7184f1.E(r4)
            if (r4 <= 0) goto L_0x03b5
            boolean r5 = r0.f48242j
            if (r5 == 0) goto L_0x018b
            goto L_0x0187
        L_0x0233:
            java.lang.Object r4 = r2.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.clearcut.C7184f1.j(r4)
            if (r4 <= 0) goto L_0x03b5
            boolean r5 = r0.f48242j
            if (r5 == 0) goto L_0x018b
            goto L_0x0187
        L_0x0245:
            java.lang.Object r4 = r2.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.clearcut.C7184f1.a(r4)
            if (r4 <= 0) goto L_0x03b5
            boolean r5 = r0.f48242j
            if (r5 == 0) goto L_0x018b
            goto L_0x0187
        L_0x0257:
            java.lang.Object r4 = r2.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.clearcut.C7184f1.L(r4)
            if (r4 <= 0) goto L_0x03b5
            boolean r5 = r0.f48242j
            if (r5 == 0) goto L_0x018b
            goto L_0x0187
        L_0x0269:
            java.lang.Object r4 = r2.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.android.gms.internal.clearcut.C7184f1.N(r4)
            if (r4 <= 0) goto L_0x03b5
            boolean r5 = r0.f48242j
            if (r5 == 0) goto L_0x018b
            goto L_0x0187
        L_0x027b:
            java.util.List r4 = N(r1, r4)
            int r3 = com.google.android.gms.internal.clearcut.C7184f1.X(r3, r4, r11)
            goto L_0x005b
        L_0x0285:
            java.util.List r4 = N(r1, r4)
            int r3 = com.google.android.gms.internal.clearcut.C7184f1.b0(r3, r4, r11)
            goto L_0x005b
        L_0x028f:
            java.util.List r4 = N(r1, r4)
            int r3 = com.google.android.gms.internal.clearcut.C7184f1.d0(r3, r4, r11)
            goto L_0x005b
        L_0x0299:
            java.util.List r4 = N(r1, r4)
            int r3 = com.google.android.gms.internal.clearcut.C7184f1.c0(r3, r4, r11)
            goto L_0x005b
        L_0x02a3:
            java.util.List r4 = N(r1, r4)
            int r3 = com.google.android.gms.internal.clearcut.C7184f1.Y(r3, r4, r11)
            goto L_0x005b
        L_0x02ad:
            java.util.List r4 = N(r1, r4)
            int r3 = com.google.android.gms.internal.clearcut.C7184f1.a0(r3, r4, r11)
            goto L_0x005b
        L_0x02b7:
            java.util.List r4 = N(r1, r4)
            int r3 = com.google.android.gms.internal.clearcut.C7184f1.t(r3, r4)
            goto L_0x005b
        L_0x02c1:
            java.util.List r4 = N(r1, r4)
            com.google.android.gms.internal.clearcut.d1 r5 = r0.C(r12)
            int r3 = com.google.android.gms.internal.clearcut.C7184f1.p(r3, r4, r5)
            goto L_0x005b
        L_0x02cf:
            java.util.List r4 = N(r1, r4)
            int r3 = com.google.android.gms.internal.clearcut.C7184f1.o(r3, r4)
            goto L_0x005b
        L_0x02d9:
            java.util.List r4 = N(r1, r4)
            int r3 = com.google.android.gms.internal.clearcut.C7184f1.e0(r3, r4, r11)
            goto L_0x005b
        L_0x02e3:
            java.util.List r4 = N(r1, r4)
            int r3 = com.google.android.gms.internal.clearcut.C7184f1.Z(r3, r4, r11)
            goto L_0x005b
        L_0x02ed:
            java.util.List r4 = N(r1, r4)
            int r3 = com.google.android.gms.internal.clearcut.C7184f1.W(r3, r4, r11)
            goto L_0x005b
        L_0x02f7:
            java.util.List r4 = N(r1, r4)
            int r3 = com.google.android.gms.internal.clearcut.C7184f1.V(r3, r4, r11)
            goto L_0x005b
        L_0x0301:
            boolean r14 = r0.y(r1, r12)
            if (r14 == 0) goto L_0x03b5
            goto L_0x004d
        L_0x0309:
            boolean r14 = r0.y(r1, r12)
            if (r14 == 0) goto L_0x03b5
            long r4 = com.google.android.gms.internal.clearcut.C1.I(r1, r4)
            goto L_0x0068
        L_0x0315:
            boolean r14 = r0.y(r1, r12)
            if (r14 == 0) goto L_0x03b5
            int r4 = com.google.android.gms.internal.clearcut.C1.H(r1, r4)
            goto L_0x0077
        L_0x0321:
            boolean r4 = r0.y(r1, r12)
            if (r4 == 0) goto L_0x03b5
            goto L_0x0082
        L_0x0329:
            boolean r4 = r0.y(r1, r12)
            if (r4 == 0) goto L_0x03b5
            goto L_0x008d
        L_0x0331:
            boolean r14 = r0.y(r1, r12)
            if (r14 == 0) goto L_0x03b5
            int r4 = com.google.android.gms.internal.clearcut.C1.H(r1, r4)
            goto L_0x009c
        L_0x033d:
            boolean r14 = r0.y(r1, r12)
            if (r14 == 0) goto L_0x03b5
            int r4 = com.google.android.gms.internal.clearcut.C1.H(r1, r4)
            goto L_0x00ab
        L_0x0349:
            boolean r14 = r0.y(r1, r12)
            if (r14 == 0) goto L_0x03b5
            goto L_0x00b6
        L_0x0351:
            boolean r14 = r0.y(r1, r12)
            if (r14 == 0) goto L_0x03b5
            goto L_0x00c7
        L_0x0359:
            boolean r14 = r0.y(r1, r12)
            if (r14 == 0) goto L_0x03b5
            java.lang.Object r4 = com.google.android.gms.internal.clearcut.C1.M(r1, r4)
            boolean r5 = r4 instanceof com.google.android.gms.internal.clearcut.A
            if (r5 == 0) goto L_0x00e3
            goto L_0x00e2
        L_0x0369:
            boolean r4 = r0.y(r1, r12)
            if (r4 == 0) goto L_0x03b5
            goto L_0x00f1
        L_0x0371:
            boolean r4 = r0.y(r1, r12)
            if (r4 == 0) goto L_0x03b5
            goto L_0x00fd
        L_0x0379:
            boolean r4 = r0.y(r1, r12)
            if (r4 == 0) goto L_0x03b5
            goto L_0x0109
        L_0x0381:
            boolean r14 = r0.y(r1, r12)
            if (r14 == 0) goto L_0x03b5
            int r4 = com.google.android.gms.internal.clearcut.C1.H(r1, r4)
            goto L_0x0119
        L_0x038d:
            boolean r14 = r0.y(r1, r12)
            if (r14 == 0) goto L_0x03b5
            long r4 = com.google.android.gms.internal.clearcut.C1.I(r1, r4)
            goto L_0x0129
        L_0x0399:
            boolean r14 = r0.y(r1, r12)
            if (r14 == 0) goto L_0x03b5
            long r4 = com.google.android.gms.internal.clearcut.C1.I(r1, r4)
            goto L_0x0139
        L_0x03a5:
            boolean r4 = r0.y(r1, r12)
            if (r4 == 0) goto L_0x03b5
            goto L_0x0145
        L_0x03ad:
            boolean r4 = r0.y(r1, r12)
            if (r4 == 0) goto L_0x03b5
            goto L_0x0151
        L_0x03b5:
            int r12 = r12 + 4
            r3 = 267386880(0xff00000, float:2.3665827E-29)
            goto L_0x0016
        L_0x03bb:
            com.google.android.gms.internal.clearcut.v1<?, ?> r2 = r0.f48248p
            int r1 = n(r2, r1)
            int r13 = r13 + r1
            return r13
        L_0x03c3:
            sun.misc.Unsafe r2 = f48232s
            r3 = -1
            r4 = r11
            r5 = r4
            r12 = r5
        L_0x03c9:
            int[] r13 = r0.f48233a
            int r13 = r13.length
            if (r4 >= r13) goto L_0x07dd
            int r13 = r0.F(r4)
            int[] r14 = r0.f48233a
            r15 = r14[r4]
            r16 = 267386880(0xff00000, float:2.3665827E-29)
            r17 = r13 & r16
            int r6 = r17 >>> 20
            r11 = 17
            if (r6 > r11) goto L_0x03f4
            int r11 = r4 + 2
            r11 = r14[r11]
            r14 = r11 & r8
            int r18 = r11 >>> 20
            int r18 = r7 << r18
            if (r14 == r3) goto L_0x03f2
            long r9 = (long) r14
            int r12 = r2.getInt(r1, r9)
            r3 = r14
        L_0x03f2:
            r9 = r11
            goto L_0x0414
        L_0x03f4:
            boolean r9 = r0.f48242j
            if (r9 == 0) goto L_0x0412
            com.google.android.gms.internal.clearcut.b0 r9 = com.google.android.gms.internal.clearcut.C7170b0.DOUBLE_LIST_PACKED
            int r9 = r9.a()
            if (r6 < r9) goto L_0x0412
            com.google.android.gms.internal.clearcut.b0 r9 = com.google.android.gms.internal.clearcut.C7170b0.SINT64_LIST_PACKED
            int r9 = r9.a()
            if (r6 > r9) goto L_0x0412
            int[] r9 = r0.f48233a
            int r10 = r4 + 2
            r9 = r9[r10]
            r9 = r9 & r8
        L_0x040f:
            r18 = 0
            goto L_0x0414
        L_0x0412:
            r9 = 0
            goto L_0x040f
        L_0x0414:
            r10 = r13 & r8
            long r10 = (long) r10
            switch(r6) {
                case 0: goto L_0x07c7;
                case 1: goto L_0x07b9;
                case 2: goto L_0x07a9;
                case 3: goto L_0x0799;
                case 4: goto L_0x0789;
                case 5: goto L_0x0779;
                case 6: goto L_0x076d;
                case 7: goto L_0x0767;
                case 8: goto L_0x0759;
                case 9: goto L_0x0753;
                case 10: goto L_0x074d;
                case 11: goto L_0x0743;
                case 12: goto L_0x0739;
                case 13: goto L_0x0733;
                case 14: goto L_0x072d;
                case 15: goto L_0x0723;
                case 16: goto L_0x0719;
                case 17: goto L_0x0713;
                case 18: goto L_0x0706;
                case 19: goto L_0x0686;
                case 20: goto L_0x06f9;
                case 21: goto L_0x06ec;
                case 22: goto L_0x06df;
                case 23: goto L_0x067a;
                case 24: goto L_0x0686;
                case 25: goto L_0x06d3;
                case 26: goto L_0x06c7;
                case 27: goto L_0x06b7;
                case 28: goto L_0x06ab;
                case 29: goto L_0x069e;
                case 30: goto L_0x0692;
                case 31: goto L_0x0686;
                case 32: goto L_0x067a;
                case 33: goto L_0x066e;
                case 34: goto L_0x065f;
                case 35: goto L_0x064d;
                case 36: goto L_0x063b;
                case 37: goto L_0x0629;
                case 38: goto L_0x0617;
                case 39: goto L_0x0605;
                case 40: goto L_0x05f3;
                case 41: goto L_0x05e1;
                case 42: goto L_0x05d0;
                case 43: goto L_0x05bf;
                case 44: goto L_0x05ae;
                case 45: goto L_0x059d;
                case 46: goto L_0x058c;
                case 47: goto L_0x057b;
                case 48: goto L_0x055b;
                case 49: goto L_0x054b;
                case 50: goto L_0x053b;
                case 51: goto L_0x052d;
                case 52: goto L_0x0520;
                case 53: goto L_0x0510;
                case 54: goto L_0x0500;
                case 55: goto L_0x04f0;
                case 56: goto L_0x04e2;
                case 57: goto L_0x04d6;
                case 58: goto L_0x04ca;
                case 59: goto L_0x04b3;
                case 60: goto L_0x049f;
                case 61: goto L_0x048e;
                case 62: goto L_0x047f;
                case 63: goto L_0x0470;
                case 64: goto L_0x0463;
                case 65: goto L_0x0456;
                case 66: goto L_0x0447;
                case 67: goto L_0x0438;
                case 68: goto L_0x041b;
                default: goto L_0x041a;
            }
        L_0x041a:
            goto L_0x0430
        L_0x041b:
            boolean r6 = r0.z(r1, r15, r4)
            if (r6 == 0) goto L_0x0430
        L_0x0421:
            java.lang.Object r6 = r2.getObject(r1, r10)
            com.google.android.gms.internal.clearcut.M0 r6 = (com.google.android.gms.internal.clearcut.M0) r6
            com.google.android.gms.internal.clearcut.d1 r9 = r0.C(r4)
            int r6 = com.google.android.gms.internal.clearcut.M.P(r15, r6, r9)
        L_0x042f:
            int r5 = r5 + r6
        L_0x0430:
            r6 = 0
        L_0x0431:
            r9 = 0
            r10 = 0
            r13 = 0
            goto L_0x07d6
        L_0x0438:
            boolean r6 = r0.z(r1, r15, r4)
            if (r6 == 0) goto L_0x0430
            long r9 = R(r1, r10)
        L_0x0442:
            int r6 = com.google.android.gms.internal.clearcut.M.g0(r15, r9)
            goto L_0x042f
        L_0x0447:
            boolean r6 = r0.z(r1, r15, r4)
            if (r6 == 0) goto L_0x0430
            int r6 = Q(r1, r10)
        L_0x0451:
            int r6 = com.google.android.gms.internal.clearcut.M.r0(r15, r6)
            goto L_0x042f
        L_0x0456:
            boolean r6 = r0.z(r1, r15, r4)
            if (r6 == 0) goto L_0x0430
        L_0x045c:
            r9 = 0
            int r6 = com.google.android.gms.internal.clearcut.M.o0(r15, r9)
            goto L_0x042f
        L_0x0463:
            boolean r6 = r0.z(r1, r15, r4)
            if (r6 == 0) goto L_0x0430
        L_0x0469:
            r6 = 0
            int r9 = com.google.android.gms.internal.clearcut.M.v0(r15, r6)
        L_0x046e:
            int r5 = r5 + r9
            goto L_0x0430
        L_0x0470:
            boolean r6 = r0.z(r1, r15, r4)
            if (r6 == 0) goto L_0x0430
            int r6 = Q(r1, r10)
        L_0x047a:
            int r6 = com.google.android.gms.internal.clearcut.M.w0(r15, r6)
            goto L_0x042f
        L_0x047f:
            boolean r6 = r0.z(r1, r15, r4)
            if (r6 == 0) goto L_0x0430
            int r6 = Q(r1, r10)
        L_0x0489:
            int r6 = com.google.android.gms.internal.clearcut.M.n0(r15, r6)
            goto L_0x042f
        L_0x048e:
            boolean r6 = r0.z(r1, r15, r4)
            if (r6 == 0) goto L_0x0430
        L_0x0494:
            java.lang.Object r6 = r2.getObject(r1, r10)
        L_0x0498:
            com.google.android.gms.internal.clearcut.A r6 = (com.google.android.gms.internal.clearcut.A) r6
            int r6 = com.google.android.gms.internal.clearcut.M.N(r15, r6)
            goto L_0x042f
        L_0x049f:
            boolean r6 = r0.z(r1, r15, r4)
            if (r6 == 0) goto L_0x0430
        L_0x04a5:
            java.lang.Object r6 = r2.getObject(r1, r10)
            com.google.android.gms.internal.clearcut.d1 r9 = r0.C(r4)
            int r6 = com.google.android.gms.internal.clearcut.C7184f1.n(r15, r6, r9)
            goto L_0x042f
        L_0x04b3:
            boolean r6 = r0.z(r1, r15, r4)
            if (r6 == 0) goto L_0x0430
            java.lang.Object r6 = r2.getObject(r1, r10)
            boolean r9 = r6 instanceof com.google.android.gms.internal.clearcut.A
            if (r9 == 0) goto L_0x04c2
        L_0x04c1:
            goto L_0x0498
        L_0x04c2:
            java.lang.String r6 = (java.lang.String) r6
            int r6 = com.google.android.gms.internal.clearcut.M.C(r15, r6)
            goto L_0x042f
        L_0x04ca:
            boolean r6 = r0.z(r1, r15, r4)
            if (r6 == 0) goto L_0x0430
        L_0x04d0:
            int r6 = com.google.android.gms.internal.clearcut.M.Q(r15, r7)
            goto L_0x042f
        L_0x04d6:
            boolean r6 = r0.z(r1, r15, r4)
            if (r6 == 0) goto L_0x0430
            r6 = 0
            int r9 = com.google.android.gms.internal.clearcut.M.t0(r15, r6)
            goto L_0x046e
        L_0x04e2:
            boolean r6 = r0.z(r1, r15, r4)
            if (r6 == 0) goto L_0x0430
            r9 = 0
            int r6 = com.google.android.gms.internal.clearcut.M.k0(r15, r9)
            goto L_0x042f
        L_0x04f0:
            boolean r6 = r0.z(r1, r15, r4)
            if (r6 == 0) goto L_0x0430
            int r6 = Q(r1, r10)
            int r6 = com.google.android.gms.internal.clearcut.M.j0(r15, r6)
            goto L_0x042f
        L_0x0500:
            boolean r6 = r0.z(r1, r15, r4)
            if (r6 == 0) goto L_0x0430
            long r9 = R(r1, r10)
            int r6 = com.google.android.gms.internal.clearcut.M.d0(r15, r9)
            goto L_0x042f
        L_0x0510:
            boolean r6 = r0.z(r1, r15, r4)
            if (r6 == 0) goto L_0x0430
            long r9 = R(r1, r10)
            int r6 = com.google.android.gms.internal.clearcut.M.W(r15, r9)
            goto L_0x042f
        L_0x0520:
            boolean r6 = r0.z(r1, r15, r4)
            if (r6 == 0) goto L_0x0430
            r6 = 0
            int r9 = com.google.android.gms.internal.clearcut.M.z(r15, r6)
            goto L_0x046e
        L_0x052d:
            boolean r6 = r0.z(r1, r15, r4)
            if (r6 == 0) goto L_0x0430
            r9 = 0
            int r6 = com.google.android.gms.internal.clearcut.M.y(r15, r9)
            goto L_0x042f
        L_0x053b:
            com.google.android.gms.internal.clearcut.H0 r6 = r0.f48250r
            java.lang.Object r9 = r2.getObject(r1, r10)
            java.lang.Object r10 = r0.D(r4)
            int r6 = r6.d(r15, r9, r10)
            goto L_0x042f
        L_0x054b:
            java.lang.Object r6 = r2.getObject(r1, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.clearcut.d1 r9 = r0.C(r4)
            int r6 = com.google.android.gms.internal.clearcut.C7184f1.u(r15, r6, r9)
            goto L_0x042f
        L_0x055b:
            java.lang.Object r6 = r2.getObject(r1, r10)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.google.android.gms.internal.clearcut.C7184f1.q(r6)
            if (r6 <= 0) goto L_0x0430
            boolean r10 = r0.f48242j
            if (r10 == 0) goto L_0x056f
        L_0x056b:
            long r9 = (long) r9
            r2.putInt(r1, r9, r6)
        L_0x056f:
            int r9 = com.google.android.gms.internal.clearcut.M.B0(r15)
            int r10 = com.google.android.gms.internal.clearcut.M.D0(r6)
            int r9 = r9 + r10
            int r9 = r9 + r6
            goto L_0x046e
        L_0x057b:
            java.lang.Object r6 = r2.getObject(r1, r10)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.google.android.gms.internal.clearcut.C7184f1.J(r6)
            if (r6 <= 0) goto L_0x0430
            boolean r10 = r0.f48242j
            if (r10 == 0) goto L_0x056f
            goto L_0x056b
        L_0x058c:
            java.lang.Object r6 = r2.getObject(r1, r10)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.google.android.gms.internal.clearcut.C7184f1.N(r6)
            if (r6 <= 0) goto L_0x0430
            boolean r10 = r0.f48242j
            if (r10 == 0) goto L_0x056f
            goto L_0x056b
        L_0x059d:
            java.lang.Object r6 = r2.getObject(r1, r10)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.google.android.gms.internal.clearcut.C7184f1.L(r6)
            if (r6 <= 0) goto L_0x0430
            boolean r10 = r0.f48242j
            if (r10 == 0) goto L_0x056f
            goto L_0x056b
        L_0x05ae:
            java.lang.Object r6 = r2.getObject(r1, r10)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.google.android.gms.internal.clearcut.C7184f1.v(r6)
            if (r6 <= 0) goto L_0x0430
            boolean r10 = r0.f48242j
            if (r10 == 0) goto L_0x056f
            goto L_0x056b
        L_0x05bf:
            java.lang.Object r6 = r2.getObject(r1, r10)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.google.android.gms.internal.clearcut.C7184f1.G(r6)
            if (r6 <= 0) goto L_0x0430
            boolean r10 = r0.f48242j
            if (r10 == 0) goto L_0x056f
            goto L_0x056b
        L_0x05d0:
            java.lang.Object r6 = r2.getObject(r1, r10)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.google.android.gms.internal.clearcut.C7184f1.P(r6)
            if (r6 <= 0) goto L_0x0430
            boolean r10 = r0.f48242j
            if (r10 == 0) goto L_0x056f
            goto L_0x056b
        L_0x05e1:
            java.lang.Object r6 = r2.getObject(r1, r10)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.google.android.gms.internal.clearcut.C7184f1.L(r6)
            if (r6 <= 0) goto L_0x0430
            boolean r10 = r0.f48242j
            if (r10 == 0) goto L_0x056f
            goto L_0x056b
        L_0x05f3:
            java.lang.Object r6 = r2.getObject(r1, r10)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.google.android.gms.internal.clearcut.C7184f1.N(r6)
            if (r6 <= 0) goto L_0x0430
            boolean r10 = r0.f48242j
            if (r10 == 0) goto L_0x056f
            goto L_0x056b
        L_0x0605:
            java.lang.Object r6 = r2.getObject(r1, r10)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.google.android.gms.internal.clearcut.C7184f1.E(r6)
            if (r6 <= 0) goto L_0x0430
            boolean r10 = r0.f48242j
            if (r10 == 0) goto L_0x056f
            goto L_0x056b
        L_0x0617:
            java.lang.Object r6 = r2.getObject(r1, r10)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.google.android.gms.internal.clearcut.C7184f1.j(r6)
            if (r6 <= 0) goto L_0x0430
            boolean r10 = r0.f48242j
            if (r10 == 0) goto L_0x056f
            goto L_0x056b
        L_0x0629:
            java.lang.Object r6 = r2.getObject(r1, r10)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.google.android.gms.internal.clearcut.C7184f1.a(r6)
            if (r6 <= 0) goto L_0x0430
            boolean r10 = r0.f48242j
            if (r10 == 0) goto L_0x056f
            goto L_0x056b
        L_0x063b:
            java.lang.Object r6 = r2.getObject(r1, r10)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.google.android.gms.internal.clearcut.C7184f1.L(r6)
            if (r6 <= 0) goto L_0x0430
            boolean r10 = r0.f48242j
            if (r10 == 0) goto L_0x056f
            goto L_0x056b
        L_0x064d:
            java.lang.Object r6 = r2.getObject(r1, r10)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.google.android.gms.internal.clearcut.C7184f1.N(r6)
            if (r6 <= 0) goto L_0x0430
            boolean r10 = r0.f48242j
            if (r10 == 0) goto L_0x056f
            goto L_0x056b
        L_0x065f:
            java.lang.Object r6 = r2.getObject(r1, r10)
            java.util.List r6 = (java.util.List) r6
            r9 = 0
            int r6 = com.google.android.gms.internal.clearcut.C7184f1.X(r15, r6, r9)
        L_0x066a:
            int r5 = r5 + r6
            r6 = r9
            goto L_0x0431
        L_0x066e:
            r9 = 0
            java.lang.Object r6 = r2.getObject(r1, r10)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.google.android.gms.internal.clearcut.C7184f1.b0(r15, r6, r9)
            goto L_0x066a
        L_0x067a:
            r9 = 0
            java.lang.Object r6 = r2.getObject(r1, r10)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.google.android.gms.internal.clearcut.C7184f1.d0(r15, r6, r9)
            goto L_0x066a
        L_0x0686:
            r9 = 0
            java.lang.Object r6 = r2.getObject(r1, r10)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.google.android.gms.internal.clearcut.C7184f1.c0(r15, r6, r9)
            goto L_0x066a
        L_0x0692:
            r9 = 0
            java.lang.Object r6 = r2.getObject(r1, r10)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.google.android.gms.internal.clearcut.C7184f1.Y(r15, r6, r9)
            goto L_0x066a
        L_0x069e:
            r9 = 0
            java.lang.Object r6 = r2.getObject(r1, r10)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.google.android.gms.internal.clearcut.C7184f1.a0(r15, r6, r9)
            goto L_0x042f
        L_0x06ab:
            java.lang.Object r6 = r2.getObject(r1, r10)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.google.android.gms.internal.clearcut.C7184f1.t(r15, r6)
            goto L_0x042f
        L_0x06b7:
            java.lang.Object r6 = r2.getObject(r1, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.clearcut.d1 r9 = r0.C(r4)
            int r6 = com.google.android.gms.internal.clearcut.C7184f1.p(r15, r6, r9)
            goto L_0x042f
        L_0x06c7:
            java.lang.Object r6 = r2.getObject(r1, r10)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.google.android.gms.internal.clearcut.C7184f1.o(r15, r6)
            goto L_0x042f
        L_0x06d3:
            java.lang.Object r6 = r2.getObject(r1, r10)
            java.util.List r6 = (java.util.List) r6
            r9 = 0
            int r6 = com.google.android.gms.internal.clearcut.C7184f1.e0(r15, r6, r9)
            goto L_0x066a
        L_0x06df:
            r9 = 0
            java.lang.Object r6 = r2.getObject(r1, r10)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.google.android.gms.internal.clearcut.C7184f1.Z(r15, r6, r9)
            goto L_0x066a
        L_0x06ec:
            r9 = 0
            java.lang.Object r6 = r2.getObject(r1, r10)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.google.android.gms.internal.clearcut.C7184f1.W(r15, r6, r9)
            goto L_0x066a
        L_0x06f9:
            r9 = 0
            java.lang.Object r6 = r2.getObject(r1, r10)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.google.android.gms.internal.clearcut.C7184f1.V(r15, r6, r9)
            goto L_0x066a
        L_0x0706:
            r9 = 0
            java.lang.Object r6 = r2.getObject(r1, r10)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.google.android.gms.internal.clearcut.C7184f1.d0(r15, r6, r9)
            goto L_0x042f
        L_0x0713:
            r6 = r12 & r18
            if (r6 == 0) goto L_0x0430
            goto L_0x0421
        L_0x0719:
            r6 = r12 & r18
            if (r6 == 0) goto L_0x0430
            long r9 = r2.getLong(r1, r10)
            goto L_0x0442
        L_0x0723:
            r6 = r12 & r18
            if (r6 == 0) goto L_0x0430
            int r6 = r2.getInt(r1, r10)
            goto L_0x0451
        L_0x072d:
            r6 = r12 & r18
            if (r6 == 0) goto L_0x0430
            goto L_0x045c
        L_0x0733:
            r6 = r12 & r18
            if (r6 == 0) goto L_0x0430
            goto L_0x0469
        L_0x0739:
            r6 = r12 & r18
            if (r6 == 0) goto L_0x0430
            int r6 = r2.getInt(r1, r10)
            goto L_0x047a
        L_0x0743:
            r6 = r12 & r18
            if (r6 == 0) goto L_0x0430
            int r6 = r2.getInt(r1, r10)
            goto L_0x0489
        L_0x074d:
            r6 = r12 & r18
            if (r6 == 0) goto L_0x0430
            goto L_0x0494
        L_0x0753:
            r6 = r12 & r18
            if (r6 == 0) goto L_0x0430
            goto L_0x04a5
        L_0x0759:
            r6 = r12 & r18
            if (r6 == 0) goto L_0x0430
            java.lang.Object r6 = r2.getObject(r1, r10)
            boolean r9 = r6 instanceof com.google.android.gms.internal.clearcut.A
            if (r9 == 0) goto L_0x04c2
            goto L_0x04c1
        L_0x0767:
            r6 = r12 & r18
            if (r6 == 0) goto L_0x0430
            goto L_0x04d0
        L_0x076d:
            r6 = r12 & r18
            if (r6 == 0) goto L_0x0430
            r6 = 0
            int r9 = com.google.android.gms.internal.clearcut.M.t0(r15, r6)
            int r5 = r5 + r9
            goto L_0x0431
        L_0x0779:
            r6 = 0
            r9 = r12 & r18
            r13 = 0
            if (r9 == 0) goto L_0x0785
            int r9 = com.google.android.gms.internal.clearcut.M.k0(r15, r13)
        L_0x0784:
            int r5 = r5 + r9
        L_0x0785:
            r9 = 0
        L_0x0786:
            r10 = 0
            goto L_0x07d6
        L_0x0789:
            r6 = 0
            r13 = 0
            r9 = r12 & r18
            if (r9 == 0) goto L_0x0785
            int r9 = r2.getInt(r1, r10)
            int r9 = com.google.android.gms.internal.clearcut.M.j0(r15, r9)
            goto L_0x0784
        L_0x0799:
            r6 = 0
            r13 = 0
            r9 = r12 & r18
            if (r9 == 0) goto L_0x0785
            long r9 = r2.getLong(r1, r10)
            int r9 = com.google.android.gms.internal.clearcut.M.d0(r15, r9)
            goto L_0x0784
        L_0x07a9:
            r6 = 0
            r13 = 0
            r9 = r12 & r18
            if (r9 == 0) goto L_0x0785
            long r9 = r2.getLong(r1, r10)
            int r9 = com.google.android.gms.internal.clearcut.M.W(r15, r9)
            goto L_0x0784
        L_0x07b9:
            r6 = 0
            r13 = 0
            r9 = r12 & r18
            if (r9 == 0) goto L_0x0785
            r9 = 0
            int r10 = com.google.android.gms.internal.clearcut.M.z(r15, r9)
            int r5 = r5 + r10
            goto L_0x0786
        L_0x07c7:
            r6 = 0
            r9 = 0
            r13 = 0
            r10 = r12 & r18
            if (r10 == 0) goto L_0x0786
            r10 = 0
            int r15 = com.google.android.gms.internal.clearcut.M.y(r15, r10)
            int r5 = r5 + r15
        L_0x07d6:
            int r4 = r4 + 4
            r11 = r6
            r6 = r9
            r9 = r13
            goto L_0x03c9
        L_0x07dd:
            com.google.android.gms.internal.clearcut.v1<?, ?> r2 = r0.f48248p
            int r2 = n(r2, r1)
            int r5 = r5 + r2
            boolean r2 = r0.f48239g
            if (r2 == 0) goto L_0x07f3
            com.google.android.gms.internal.clearcut.T<?> r2 = r0.f48249q
            com.google.android.gms.internal.clearcut.X r1 = r2.b(r1)
            int r1 = r1.l()
            int r5 = r5 + r1
        L_0x07f3:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.Q0.i(java.lang.Object):int");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v2, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005c, code lost:
        r9.putLong(r23, r2, r4);
        r0 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0070, code lost:
        r9.putInt(r14, r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0074, code lost:
        if (r7 == 0) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0076, code lost:
        r0 = com.google.android.gms.internal.clearcut.C7229v.e(r12, r10, r11);
        r1 = r11.f48493a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0083, code lost:
        r1 = r11.f48495c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0085, code lost:
        r9.putObject(r14, r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00d0, code lost:
        r0 = r10 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00e0, code lost:
        r0 = r10 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00e4, code lost:
        if (r7 == 0) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0163, code lost:
        if (r0 == r15) goto L_0x0165;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0196, code lost:
        if (r0 == r15) goto L_0x0165;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01af, code lost:
        if (r0 == r15) goto L_0x0165;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void j(T r23, byte[] r24, int r25, int r26, com.google.android.gms.internal.clearcut.C7232w r27) {
        /*
            r22 = this;
            r15 = r22
            r14 = r23
            r12 = r24
            r13 = r26
            r11 = r27
            boolean r0 = r15.f48241i
            if (r0 == 0) goto L_0x01cb
            sun.misc.Unsafe r9 = f48232s
            r0 = r25
        L_0x0012:
            if (r0 >= r13) goto L_0x01c2
            int r1 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x0024
            int r0 = com.google.android.gms.internal.clearcut.C7229v.d(r0, r12, r1, r11)
            int r1 = r11.f48493a
            r10 = r0
            r16 = r1
            goto L_0x0027
        L_0x0024:
            r16 = r0
            r10 = r1
        L_0x0027:
            int r6 = r16 >>> 3
            r7 = r16 & 7
            int r8 = r15.H(r6)
            if (r8 < 0) goto L_0x004b
            int[] r0 = r15.f48233a
            int r1 = r8 + 1
            r5 = r0[r1]
            r0 = 267386880(0xff00000, float:2.3665827E-29)
            r0 = r0 & r5
            int r4 = r0 >>> 20
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            long r2 = (long) r0
            r0 = 17
            r1 = 2
            if (r4 > r0) goto L_0x0105
            r0 = 5
            r6 = 1
            switch(r4) {
                case 0: goto L_0x00fb;
                case 1: goto L_0x00f1;
                case 2: goto L_0x00e7;
                case 3: goto L_0x00e7;
                case 4: goto L_0x00e4;
                case 5: goto L_0x00d4;
                case 6: goto L_0x00c7;
                case 7: goto L_0x00b2;
                case 8: goto L_0x00a1;
                case 9: goto L_0x0089;
                case 10: goto L_0x007d;
                case 11: goto L_0x00e4;
                case 12: goto L_0x0074;
                case 13: goto L_0x00c7;
                case 14: goto L_0x00d4;
                case 15: goto L_0x0064;
                case 16: goto L_0x0050;
                default: goto L_0x004b;
            }
        L_0x004b:
            r21 = r9
            r15 = r10
            goto L_0x01b2
        L_0x0050:
            if (r7 != 0) goto L_0x004b
            int r6 = com.google.android.gms.internal.clearcut.C7229v.g(r12, r10, r11)
            long r0 = r11.f48494b
            long r4 = com.google.android.gms.internal.clearcut.J.a(r0)
        L_0x005c:
            r0 = r9
            r1 = r23
            r0.putLong(r1, r2, r4)
            r0 = r6
            goto L_0x0012
        L_0x0064:
            if (r7 != 0) goto L_0x004b
            int r0 = com.google.android.gms.internal.clearcut.C7229v.e(r12, r10, r11)
            int r1 = r11.f48493a
            int r1 = com.google.android.gms.internal.clearcut.J.e(r1)
        L_0x0070:
            r9.putInt(r14, r2, r1)
            goto L_0x0012
        L_0x0074:
            if (r7 != 0) goto L_0x004b
        L_0x0076:
            int r0 = com.google.android.gms.internal.clearcut.C7229v.e(r12, r10, r11)
            int r1 = r11.f48493a
            goto L_0x0070
        L_0x007d:
            if (r7 != r1) goto L_0x004b
            int r0 = com.google.android.gms.internal.clearcut.C7229v.m(r12, r10, r11)
        L_0x0083:
            java.lang.Object r1 = r11.f48495c
        L_0x0085:
            r9.putObject(r14, r2, r1)
            goto L_0x0012
        L_0x0089:
            if (r7 != r1) goto L_0x004b
            com.google.android.gms.internal.clearcut.d1 r0 = r15.C(r8)
            int r0 = m(r0, r12, r10, r13, r11)
            java.lang.Object r1 = r9.getObject(r14, r2)
            if (r1 != 0) goto L_0x009a
            goto L_0x0083
        L_0x009a:
            java.lang.Object r4 = r11.f48495c
            java.lang.Object r1 = com.google.android.gms.internal.clearcut.C7192i0.d(r1, r4)
            goto L_0x0085
        L_0x00a1:
            if (r7 != r1) goto L_0x004b
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r0 & r5
            if (r0 != 0) goto L_0x00ad
            int r0 = com.google.android.gms.internal.clearcut.C7229v.i(r12, r10, r11)
            goto L_0x0083
        L_0x00ad:
            int r0 = com.google.android.gms.internal.clearcut.C7229v.j(r12, r10, r11)
            goto L_0x0083
        L_0x00b2:
            if (r7 != 0) goto L_0x004b
            int r0 = com.google.android.gms.internal.clearcut.C7229v.g(r12, r10, r11)
            long r4 = r11.f48494b
            r7 = 0
            int r1 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r1 == 0) goto L_0x00c1
            goto L_0x00c2
        L_0x00c1:
            r6 = 0
        L_0x00c2:
            com.google.android.gms.internal.clearcut.C1.j(r14, r2, r6)
            goto L_0x0012
        L_0x00c7:
            if (r7 != r0) goto L_0x004b
            int r0 = com.google.android.gms.internal.clearcut.C7229v.h(r12, r10)
            r9.putInt(r14, r2, r0)
        L_0x00d0:
            int r0 = r10 + 4
            goto L_0x0012
        L_0x00d4:
            if (r7 != r6) goto L_0x004b
            long r4 = com.google.android.gms.internal.clearcut.C7229v.k(r12, r10)
            r0 = r9
            r1 = r23
            r0.putLong(r1, r2, r4)
        L_0x00e0:
            int r0 = r10 + 8
            goto L_0x0012
        L_0x00e4:
            if (r7 != 0) goto L_0x004b
            goto L_0x0076
        L_0x00e7:
            if (r7 != 0) goto L_0x004b
            int r6 = com.google.android.gms.internal.clearcut.C7229v.g(r12, r10, r11)
            long r4 = r11.f48494b
            goto L_0x005c
        L_0x00f1:
            if (r7 != r0) goto L_0x004b
            float r0 = com.google.android.gms.internal.clearcut.C7229v.n(r12, r10)
            com.google.android.gms.internal.clearcut.C1.f(r14, r2, r0)
            goto L_0x00d0
        L_0x00fb:
            if (r7 != r6) goto L_0x004b
            double r0 = com.google.android.gms.internal.clearcut.C7229v.l(r12, r10)
            com.google.android.gms.internal.clearcut.C1.e(r14, r2, r0)
            goto L_0x00e0
        L_0x0105:
            r0 = 27
            if (r4 != r0) goto L_0x013d
            if (r7 != r1) goto L_0x004b
            java.lang.Object r0 = r9.getObject(r14, r2)
            com.google.android.gms.internal.clearcut.l0 r0 = (com.google.android.gms.internal.clearcut.C7201l0) r0
            boolean r1 = r0.N()
            if (r1 != 0) goto L_0x0129
            int r1 = r0.size()
            if (r1 != 0) goto L_0x0120
            r1 = 10
            goto L_0x0122
        L_0x0120:
            int r1 = r1 << 1
        L_0x0122:
            com.google.android.gms.internal.clearcut.l0 r0 = r0.R0(r1)
            r9.putObject(r14, r2, r0)
        L_0x0129:
            r5 = r0
            com.google.android.gms.internal.clearcut.d1 r0 = r15.C(r8)
            r1 = r16
            r2 = r24
            r3 = r10
            r4 = r26
            r6 = r27
            int r0 = k(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0012
        L_0x013d:
            r0 = 49
            if (r4 > r0) goto L_0x0175
            long r0 = (long) r5
            r17 = r0
            r0 = r22
            r1 = r23
            r19 = r2
            r2 = r24
            r3 = r10
            r5 = r4
            r4 = r26
            r25 = r5
            r5 = r16
            r21 = r9
            r15 = r10
            r9 = r17
            r11 = r25
            r12 = r19
            r14 = r27
            int r0 = r0.p(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 != r15) goto L_0x0167
        L_0x0165:
            r2 = r0
            goto L_0x01b3
        L_0x0167:
            r15 = r22
            r14 = r23
            r12 = r24
            r13 = r26
            r11 = r27
            r9 = r21
            goto L_0x0012
        L_0x0175:
            r19 = r2
            r25 = r4
            r21 = r9
            r15 = r10
            r0 = 50
            r9 = r25
            if (r9 != r0) goto L_0x0199
            if (r7 != r1) goto L_0x01b2
            r0 = r22
            r1 = r23
            r2 = r24
            r3 = r15
            r4 = r26
            r5 = r8
            r7 = r19
            r9 = r27
            int r0 = r0.q(r1, r2, r3, r4, r5, r6, r7, r9)
            if (r0 != r15) goto L_0x0167
            goto L_0x0165
        L_0x0199:
            r0 = r22
            r1 = r23
            r2 = r24
            r3 = r15
            r4 = r26
            r10 = r5
            r5 = r16
            r12 = r8
            r8 = r10
            r10 = r19
            r13 = r27
            int r0 = r0.o(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 != r15) goto L_0x0167
            goto L_0x0165
        L_0x01b2:
            r2 = r15
        L_0x01b3:
            r0 = r16
            r1 = r24
            r3 = r26
            r4 = r23
            r5 = r27
            int r0 = a(r0, r1, r2, r3, r4, r5)
            goto L_0x0167
        L_0x01c2:
            r4 = r13
            if (r0 != r4) goto L_0x01c6
            return
        L_0x01c6:
            com.google.android.gms.internal.clearcut.m0 r0 = com.google.android.gms.internal.clearcut.C7204m0.d()
            throw r0
        L_0x01cb:
            r4 = r13
            r5 = 0
            r0 = r22
            r1 = r23
            r2 = r24
            r3 = r25
            r4 = r26
            r6 = r27
            r0.r(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.Q0.j(java.lang.Object, byte[], int, int, com.google.android.gms.internal.clearcut.w):void");
    }
}
