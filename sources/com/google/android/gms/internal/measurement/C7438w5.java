package com.google.android.gms.internal.measurement;

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

/* renamed from: com.google.android.gms.internal.measurement.w5  reason: case insensitive filesystem */
final class C7438w5<T> implements K5<T> {

    /* renamed from: q  reason: collision with root package name */
    private static final int[] f49115q = new int[0];

    /* renamed from: r  reason: collision with root package name */
    private static final Unsafe f49116r = C7287e6.p();

    /* renamed from: a  reason: collision with root package name */
    private final int[] f49117a;

    /* renamed from: b  reason: collision with root package name */
    private final Object[] f49118b;

    /* renamed from: c  reason: collision with root package name */
    private final int f49119c;

    /* renamed from: d  reason: collision with root package name */
    private final int f49120d;

    /* renamed from: e  reason: collision with root package name */
    private final C7406s5 f49121e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f49122f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f49123g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f49124h;

    /* renamed from: i  reason: collision with root package name */
    private final int[] f49125i;

    /* renamed from: j  reason: collision with root package name */
    private final int f49126j;

    /* renamed from: k  reason: collision with root package name */
    private final int f49127k;

    /* renamed from: l  reason: collision with root package name */
    private final C7462z5 f49128l;

    /* renamed from: m  reason: collision with root package name */
    private final C7259b5 f49129m;

    /* renamed from: n  reason: collision with root package name */
    private final Z5<?, ?> f49130n;

    /* renamed from: o  reason: collision with root package name */
    private final C7461z4<?> f49131o;

    /* renamed from: p  reason: collision with root package name */
    private final C7383p5 f49132p;

    private C7438w5(int[] iArr, Object[] objArr, int i10, int i11, C7406s5 s5Var, boolean z10, int[] iArr2, int i12, int i13, C7462z5 z5Var, C7259b5 b5Var, Z5<?, ?> z52, C7461z4<?> z4Var, C7383p5 p5Var) {
        this.f49117a = iArr;
        this.f49118b = objArr;
        this.f49119c = i10;
        this.f49120d = i11;
        this.f49123g = s5Var instanceof L4;
        this.f49122f = z4Var != null && z4Var.e(s5Var);
        this.f49124h = false;
        this.f49125i = iArr2;
        this.f49126j = i12;
        this.f49127k = i13;
        this.f49128l = z5Var;
        this.f49129m = b5Var;
        this.f49130n = z52;
        this.f49131o = z4Var;
        this.f49121e = s5Var;
        this.f49132p = p5Var;
    }

    private final void A(T t10, int i10, int i11) {
        C7287e6.h(t10, (long) (y(i11) & 1048575), i10);
    }

    private final void B(T t10, T t11, int i10) {
        int i11 = this.f49117a[i10];
        if (G(t11, i11, i10)) {
            long C10 = (long) (C(i10) & 1048575);
            Unsafe unsafe = f49116r;
            Object object = unsafe.getObject(t11, C10);
            if (object != null) {
                K5 K10 = K(i10);
                if (!G(t10, i11, i10)) {
                    if (!P(object)) {
                        unsafe.putObject(t10, C10, object);
                    } else {
                        Object zza = K10.zza();
                        K10.b(zza, object);
                        unsafe.putObject(t10, C10, zza);
                    }
                    A(t10, i11, i10);
                    return;
                }
                Object object2 = unsafe.getObject(t10, C10);
                if (!P(object2)) {
                    Object zza2 = K10.zza();
                    K10.b(zza2, object2);
                    unsafe.putObject(t10, C10, zza2);
                    object2 = zza2;
                }
                K10.b(object2, object);
                return;
            }
            int i12 = this.f49117a[i10];
            String valueOf = String.valueOf(t11);
            throw new IllegalStateException("Source subfield " + i12 + " is present but null: " + valueOf);
        }
    }

    private final int C(int i10) {
        return this.f49117a[i10 + 1];
    }

    private static <T> int D(T t10, long j10) {
        return ((Integer) C7287e6.B(t10, j10)).intValue();
    }

    static C7269c6 E(Object obj) {
        L4 l42 = (L4) obj;
        C7269c6 c6Var = l42.zzb;
        if (c6Var != C7269c6.k()) {
            return c6Var;
        }
        C7269c6 l10 = C7269c6.l();
        l42.zzb = l10;
        return l10;
    }

    private final boolean F(T t10, int i10) {
        int y10 = y(i10);
        long j10 = (long) (y10 & 1048575);
        if (j10 == 1048575) {
            int C10 = C(i10);
            long j11 = (long) (C10 & 1048575);
            switch ((C10 & 267386880) >>> 20) {
                case 0:
                    return Double.doubleToRawLongBits(C7287e6.a(t10, j11)) != 0;
                case 1:
                    return Float.floatToRawIntBits(C7287e6.n(t10, j11)) != 0;
                case 2:
                    return C7287e6.x(t10, j11) != 0;
                case 3:
                    return C7287e6.x(t10, j11) != 0;
                case 4:
                    return C7287e6.t(t10, j11) != 0;
                case 5:
                    return C7287e6.x(t10, j11) != 0;
                case 6:
                    return C7287e6.t(t10, j11) != 0;
                case 7:
                    return C7287e6.F(t10, j11);
                case 8:
                    Object B10 = C7287e6.B(t10, j11);
                    if (B10 instanceof String) {
                        return !((String) B10).isEmpty();
                    }
                    if (B10 instanceof C7276d4) {
                        return !C7276d4.f48892b.equals(B10);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    return C7287e6.B(t10, j11) != null;
                case 10:
                    return !C7276d4.f48892b.equals(C7287e6.B(t10, j11));
                case 11:
                    return C7287e6.t(t10, j11) != 0;
                case 12:
                    return C7287e6.t(t10, j11) != 0;
                case 13:
                    return C7287e6.t(t10, j11) != 0;
                case 14:
                    return C7287e6.x(t10, j11) != 0;
                case 15:
                    return C7287e6.t(t10, j11) != 0;
                case 16:
                    return C7287e6.x(t10, j11) != 0;
                case 17:
                    return C7287e6.B(t10, j11) != null;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            return (C7287e6.t(t10, j10) & (1 << (y10 >>> 20))) != 0;
        }
    }

    private final boolean G(T t10, int i10, int i11) {
        return C7287e6.t(t10, (long) (y(i11) & 1048575)) == i10;
    }

    private final boolean H(T t10, T t11, int i10) {
        return F(t10, i10) == F(t11, i10);
    }

    private static <T> long I(T t10, long j10) {
        return ((Long) C7287e6.B(t10, j10)).longValue();
    }

    private final Q4 J(int i10) {
        return (Q4) this.f49118b[((i10 / 3) << 1) + 1];
    }

    private final K5 K(int i10) {
        int i11 = (i10 / 3) << 1;
        K5 k52 = (K5) this.f49118b[i11];
        if (k52 != null) {
            return k52;
        }
        K5 b10 = G5.a().b((Class) this.f49118b[i11 + 1]);
        this.f49118b[i11] = b10;
        return b10;
    }

    private static <T> boolean L(T t10, long j10) {
        return ((Boolean) C7287e6.B(t10, j10)).booleanValue();
    }

    private final Object M(int i10) {
        return this.f49118b[(i10 / 3) << 1];
    }

    private static void N(Object obj) {
        if (!P(obj)) {
            String valueOf = String.valueOf(obj);
            throw new IllegalArgumentException("Mutating immutable message: " + valueOf);
        }
    }

    private static boolean O(int i10) {
        return (i10 & 536870912) != 0;
    }

    private static boolean P(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof L4) {
            return ((L4) obj).I();
        }
        return true;
    }

    private static <T> double f(T t10, long j10) {
        return ((Double) C7287e6.B(t10, j10)).doubleValue();
    }

    private final int g(int i10) {
        if (i10 < this.f49119c || i10 > this.f49120d) {
            return -1;
        }
        return h(i10, 0);
    }

    private final int h(int i10, int i11) {
        int length = (this.f49117a.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int i14 = this.f49117a[i13];
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

    /* JADX WARNING: Removed duplicated region for block: B:122:0x0266  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0269  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0280  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0284  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x0343  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x038c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static <T> com.google.android.gms.internal.measurement.C7438w5<T> j(java.lang.Class<T> r32, com.google.android.gms.internal.measurement.C7391q5 r33, com.google.android.gms.internal.measurement.C7462z5 r34, com.google.android.gms.internal.measurement.C7259b5 r35, com.google.android.gms.internal.measurement.Z5<?, ?> r36, com.google.android.gms.internal.measurement.C7461z4<?> r37, com.google.android.gms.internal.measurement.C7383p5 r38) {
        /*
            r0 = r33
            boolean r1 = r0 instanceof com.google.android.gms.internal.measurement.I5
            if (r1 == 0) goto L_0x040a
            com.google.android.gms.internal.measurement.I5 r0 = (com.google.android.gms.internal.measurement.I5) r0
            java.lang.String r1 = r0.a()
            int r2 = r1.length()
            r3 = 0
            char r4 = r1.charAt(r3)
            r5 = 55296(0xd800, float:7.7486E-41)
            r6 = 1
            if (r4 < r5) goto L_0x0026
            r4 = r6
        L_0x001c:
            int r7 = r4 + 1
            char r4 = r1.charAt(r4)
            if (r4 < r5) goto L_0x0027
            r4 = r7
            goto L_0x001c
        L_0x0026:
            r7 = r6
        L_0x0027:
            int r4 = r7 + 1
            char r7 = r1.charAt(r7)
            if (r7 < r5) goto L_0x0046
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x0033:
            int r10 = r4 + 1
            char r4 = r1.charAt(r4)
            if (r4 < r5) goto L_0x0043
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            int r4 = r4 << r9
            r7 = r7 | r4
            int r9 = r9 + 13
            r4 = r10
            goto L_0x0033
        L_0x0043:
            int r4 = r4 << r9
            r7 = r7 | r4
            r4 = r10
        L_0x0046:
            if (r7 != 0) goto L_0x0057
            int[] r7 = f49115q
            r9 = r3
            r11 = r9
            r12 = r11
            r13 = r12
            r14 = r13
            r17 = r14
            r16 = r7
            r7 = r17
            goto L_0x016b
        L_0x0057:
            int r7 = r4 + 1
            char r4 = r1.charAt(r4)
            if (r4 < r5) goto L_0x0076
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x0063:
            int r10 = r7 + 1
            char r7 = r1.charAt(r7)
            if (r7 < r5) goto L_0x0073
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            int r7 = r7 << r9
            r4 = r4 | r7
            int r9 = r9 + 13
            r7 = r10
            goto L_0x0063
        L_0x0073:
            int r7 = r7 << r9
            r4 = r4 | r7
            r7 = r10
        L_0x0076:
            int r9 = r7 + 1
            char r7 = r1.charAt(r7)
            if (r7 < r5) goto L_0x0095
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r10 = 13
        L_0x0082:
            int r11 = r9 + 1
            char r9 = r1.charAt(r9)
            if (r9 < r5) goto L_0x0092
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r10
            r7 = r7 | r9
            int r10 = r10 + 13
            r9 = r11
            goto L_0x0082
        L_0x0092:
            int r9 = r9 << r10
            r7 = r7 | r9
            r9 = r11
        L_0x0095:
            int r10 = r9 + 1
            char r9 = r1.charAt(r9)
            if (r9 < r5) goto L_0x00b4
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r11 = 13
        L_0x00a1:
            int r12 = r10 + 1
            char r10 = r1.charAt(r10)
            if (r10 < r5) goto L_0x00b1
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            int r10 = r10 << r11
            r9 = r9 | r10
            int r11 = r11 + 13
            r10 = r12
            goto L_0x00a1
        L_0x00b1:
            int r10 = r10 << r11
            r9 = r9 | r10
            r10 = r12
        L_0x00b4:
            int r11 = r10 + 1
            char r10 = r1.charAt(r10)
            if (r10 < r5) goto L_0x00d3
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            r12 = 13
        L_0x00c0:
            int r13 = r11 + 1
            char r11 = r1.charAt(r11)
            if (r11 < r5) goto L_0x00d0
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            int r11 = r11 << r12
            r10 = r10 | r11
            int r12 = r12 + 13
            r11 = r13
            goto L_0x00c0
        L_0x00d0:
            int r11 = r11 << r12
            r10 = r10 | r11
            r11 = r13
        L_0x00d3:
            int r12 = r11 + 1
            char r11 = r1.charAt(r11)
            if (r11 < r5) goto L_0x00f2
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            r13 = 13
        L_0x00df:
            int r14 = r12 + 1
            char r12 = r1.charAt(r12)
            if (r12 < r5) goto L_0x00ef
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r13
            r11 = r11 | r12
            int r13 = r13 + 13
            r12 = r14
            goto L_0x00df
        L_0x00ef:
            int r12 = r12 << r13
            r11 = r11 | r12
            r12 = r14
        L_0x00f2:
            int r13 = r12 + 1
            char r12 = r1.charAt(r12)
            if (r12 < r5) goto L_0x0111
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            r14 = 13
        L_0x00fe:
            int r15 = r13 + 1
            char r13 = r1.charAt(r13)
            if (r13 < r5) goto L_0x010e
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            int r13 = r13 << r14
            r12 = r12 | r13
            int r14 = r14 + 13
            r13 = r15
            goto L_0x00fe
        L_0x010e:
            int r13 = r13 << r14
            r12 = r12 | r13
            r13 = r15
        L_0x0111:
            int r14 = r13 + 1
            char r13 = r1.charAt(r13)
            if (r13 < r5) goto L_0x0132
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            r15 = 13
        L_0x011d:
            int r16 = r14 + 1
            char r14 = r1.charAt(r14)
            if (r14 < r5) goto L_0x012e
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r14 = r14 << r15
            r13 = r13 | r14
            int r15 = r15 + 13
            r14 = r16
            goto L_0x011d
        L_0x012e:
            int r14 = r14 << r15
            r13 = r13 | r14
            r14 = r16
        L_0x0132:
            int r15 = r14 + 1
            char r14 = r1.charAt(r14)
            if (r14 < r5) goto L_0x0155
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            r16 = 13
        L_0x013e:
            int r17 = r15 + 1
            char r15 = r1.charAt(r15)
            if (r15 < r5) goto L_0x0150
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r15 = r15 << r16
            r14 = r14 | r15
            int r16 = r16 + 13
            r15 = r17
            goto L_0x013e
        L_0x0150:
            int r15 = r15 << r16
            r14 = r14 | r15
            r15 = r17
        L_0x0155:
            int r16 = r14 + r12
            int r13 = r16 + r13
            int[] r13 = new int[r13]
            int r16 = r4 << 1
            int r16 = r16 + r7
            r7 = r4
            r17 = r14
            r4 = r15
            r14 = r10
            r31 = r13
            r13 = r9
            r9 = r16
            r16 = r31
        L_0x016b:
            sun.misc.Unsafe r10 = f49116r
            java.lang.Object[] r15 = r0.b()
            com.google.android.gms.internal.measurement.s5 r18 = r0.zza()
            java.lang.Class r3 = r18.getClass()
            int r8 = r11 * 3
            int[] r8 = new int[r8]
            int r11 = r11 << r6
            java.lang.Object[] r11 = new java.lang.Object[r11]
            int r18 = r17 + r12
            r20 = r17
            r21 = r18
            r12 = 0
            r19 = 0
        L_0x0189:
            if (r4 >= r2) goto L_0x03e9
            int r22 = r4 + 1
            char r4 = r1.charAt(r4)
            if (r4 < r5) goto L_0x01b1
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r6 = r22
            r22 = 13
        L_0x0199:
            int r24 = r6 + 1
            char r6 = r1.charAt(r6)
            if (r6 < r5) goto L_0x01ab
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            int r6 = r6 << r22
            r4 = r4 | r6
            int r22 = r22 + 13
            r6 = r24
            goto L_0x0199
        L_0x01ab:
            int r6 = r6 << r22
            r4 = r4 | r6
            r6 = r24
            goto L_0x01b3
        L_0x01b1:
            r6 = r22
        L_0x01b3:
            int r22 = r6 + 1
            char r6 = r1.charAt(r6)
            if (r6 < r5) goto L_0x01e0
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r5 = r22
            r22 = 13
        L_0x01c1:
            int r25 = r5 + 1
            char r5 = r1.charAt(r5)
            r26 = r2
            r2 = 55296(0xd800, float:7.7486E-41)
            if (r5 < r2) goto L_0x01da
            r2 = r5 & 8191(0x1fff, float:1.1478E-41)
            int r2 = r2 << r22
            r6 = r6 | r2
            int r22 = r22 + 13
            r5 = r25
            r2 = r26
            goto L_0x01c1
        L_0x01da:
            int r2 = r5 << r22
            r6 = r6 | r2
            r2 = r25
            goto L_0x01e4
        L_0x01e0:
            r26 = r2
            r2 = r22
        L_0x01e4:
            r5 = r6 & 255(0xff, float:3.57E-43)
            r22 = r14
            r14 = r6 & 1024(0x400, float:1.435E-42)
            if (r14 == 0) goto L_0x01f2
            int r14 = r19 + 1
            r16[r19] = r12
            r19 = r14
        L_0x01f2:
            r14 = 51
            r27 = r13
            if (r5 < r14) goto L_0x02a1
            int r14 = r2 + 1
            char r2 = r1.charAt(r2)
            r13 = 55296(0xd800, float:7.7486E-41)
            if (r2 < r13) goto L_0x0221
            r2 = r2 & 8191(0x1fff, float:1.1478E-41)
            r29 = 13
        L_0x0207:
            int r30 = r14 + 1
            char r14 = r1.charAt(r14)
            if (r14 < r13) goto L_0x021c
            r13 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r13 = r13 << r29
            r2 = r2 | r13
            int r29 = r29 + 13
            r14 = r30
            r13 = 55296(0xd800, float:7.7486E-41)
            goto L_0x0207
        L_0x021c:
            int r13 = r14 << r29
            r2 = r2 | r13
            r14 = r30
        L_0x0221:
            int r13 = r5 + -51
            r29 = r14
            r14 = 9
            if (r13 == r14) goto L_0x022d
            r14 = 17
            if (r13 != r14) goto L_0x022f
        L_0x022d:
            r14 = 1
            goto L_0x0254
        L_0x022f:
            r14 = 12
            if (r13 != r14) goto L_0x0244
            com.google.android.gms.internal.measurement.H5 r13 = r0.zzb()
            com.google.android.gms.internal.measurement.H5 r14 = com.google.android.gms.internal.measurement.H5.PROTO2
            boolean r13 = r13.equals(r14)
            if (r13 != 0) goto L_0x0246
            r13 = r6 & 2048(0x800, float:2.87E-42)
            if (r13 == 0) goto L_0x0244
            goto L_0x0246
        L_0x0244:
            r14 = 1
            goto L_0x025f
        L_0x0246:
            int r13 = r12 / 3
            r14 = 1
            int r13 = r13 << r14
            int r13 = r13 + r14
            int r23 = r9 + 1
            r9 = r15[r9]
            r11[r13] = r9
        L_0x0251:
            r9 = r23
            goto L_0x025f
        L_0x0254:
            int r13 = r12 / 3
            int r13 = r13 << r14
            int r13 = r13 + r14
            int r23 = r9 + 1
            r9 = r15[r9]
            r11[r13] = r9
            goto L_0x0251
        L_0x025f:
            int r2 = r2 << r14
            r13 = r15[r2]
            boolean r14 = r13 instanceof java.lang.reflect.Field
            if (r14 == 0) goto L_0x0269
            java.lang.reflect.Field r13 = (java.lang.reflect.Field) r13
            goto L_0x0271
        L_0x0269:
            java.lang.String r13 = (java.lang.String) r13
            java.lang.reflect.Field r13 = o(r3, r13)
            r15[r2] = r13
        L_0x0271:
            long r13 = r10.objectFieldOffset(r13)
            int r13 = (int) r13
            int r2 = r2 + 1
            r14 = r15[r2]
            r25 = r9
            boolean r9 = r14 instanceof java.lang.reflect.Field
            if (r9 == 0) goto L_0x0284
            java.lang.reflect.Field r14 = (java.lang.reflect.Field) r14
        L_0x0282:
            r2 = r13
            goto L_0x028d
        L_0x0284:
            java.lang.String r14 = (java.lang.String) r14
            java.lang.reflect.Field r14 = o(r3, r14)
            r15[r2] = r14
            goto L_0x0282
        L_0x028d:
            long r13 = r10.objectFieldOffset(r14)
            int r9 = (int) r13
            r14 = r1
            r13 = r2
            r23 = r25
            r2 = 0
            r25 = r0
            r31 = r29
            r29 = r4
            r4 = r31
            goto L_0x03a3
        L_0x02a1:
            int r13 = r9 + 1
            r14 = r15[r9]
            java.lang.String r14 = (java.lang.String) r14
            java.lang.reflect.Field r14 = o(r3, r14)
            r29 = r4
            r4 = 9
            if (r5 == r4) goto L_0x02b5
            r4 = 17
            if (r5 != r4) goto L_0x02ba
        L_0x02b5:
            r25 = r0
            r4 = 1
            goto L_0x032b
        L_0x02ba:
            r4 = 27
            if (r5 == r4) goto L_0x02c2
            r4 = 49
            if (r5 != r4) goto L_0x02c6
        L_0x02c2:
            r25 = r0
            r4 = 1
            goto L_0x0320
        L_0x02c6:
            r4 = 12
            if (r5 == r4) goto L_0x0305
            r4 = 30
            if (r5 == r4) goto L_0x0305
            r4 = 44
            if (r5 != r4) goto L_0x02d3
            goto L_0x0305
        L_0x02d3:
            r4 = 50
            if (r5 != r4) goto L_0x0302
            int r4 = r20 + 1
            r16[r20] = r12
            int r20 = r12 / 3
            r23 = 1
            int r20 = r20 << 1
            int r25 = r9 + 2
            r13 = r15[r13]
            r11[r20] = r13
            r13 = r6 & 2048(0x800, float:2.87E-42)
            if (r13 == 0) goto L_0x02f9
            int r20 = r20 + 1
            int r13 = r9 + 3
            r9 = r15[r25]
            r11[r20] = r9
            r25 = r0
            r20 = r4
        L_0x02f7:
            r0 = r13
            goto L_0x0336
        L_0x02f9:
            r20 = r4
            r31 = r25
            r25 = r0
            r0 = r31
            goto L_0x0336
        L_0x0302:
            r25 = r0
            goto L_0x02f7
        L_0x0305:
            com.google.android.gms.internal.measurement.H5 r4 = r0.zzb()
            r25 = r0
            com.google.android.gms.internal.measurement.H5 r0 = com.google.android.gms.internal.measurement.H5.PROTO2
            if (r4 == r0) goto L_0x0313
            r0 = r6 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x02f7
        L_0x0313:
            int r0 = r12 / 3
            r4 = 1
            int r0 = r0 << r4
            int r0 = r0 + r4
            int r9 = r9 + 2
            r13 = r15[r13]
            r11[r0] = r13
        L_0x031e:
            r0 = r9
            goto L_0x0336
        L_0x0320:
            int r0 = r12 / 3
            int r0 = r0 << r4
            int r0 = r0 + r4
            int r9 = r9 + 2
            r13 = r15[r13]
            r11[r0] = r13
            goto L_0x031e
        L_0x032b:
            int r0 = r12 / 3
            int r0 = r0 << r4
            int r0 = r0 + r4
            java.lang.Class r4 = r14.getType()
            r11[r0] = r4
            goto L_0x02f7
        L_0x0336:
            long r13 = r10.objectFieldOffset(r14)
            int r13 = (int) r13
            r4 = r6 & 4096(0x1000, float:5.74E-42)
            if (r4 == 0) goto L_0x038c
            r4 = 17
            if (r5 > r4) goto L_0x038c
            int r4 = r2 + 1
            char r2 = r1.charAt(r2)
            r9 = 55296(0xd800, float:7.7486E-41)
            if (r2 < r9) goto L_0x0367
            r2 = r2 & 8191(0x1fff, float:1.1478E-41)
            r14 = 13
        L_0x0352:
            int r24 = r4 + 1
            char r4 = r1.charAt(r4)
            if (r4 < r9) goto L_0x0363
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            int r4 = r4 << r14
            r2 = r2 | r4
            int r14 = r14 + 13
            r4 = r24
            goto L_0x0352
        L_0x0363:
            int r4 = r4 << r14
            r2 = r2 | r4
            r4 = r24
        L_0x0367:
            r14 = 1
            int r23 = r7 << 1
            int r24 = r2 / 32
            int r23 = r23 + r24
            r9 = r15[r23]
            boolean r14 = r9 instanceof java.lang.reflect.Field
            if (r14 == 0) goto L_0x037a
            java.lang.reflect.Field r9 = (java.lang.reflect.Field) r9
        L_0x0376:
            r23 = r0
            r14 = r1
            goto L_0x0383
        L_0x037a:
            java.lang.String r9 = (java.lang.String) r9
            java.lang.reflect.Field r9 = o(r3, r9)
            r15[r23] = r9
            goto L_0x0376
        L_0x0383:
            long r0 = r10.objectFieldOffset(r9)
            int r0 = (int) r0
            int r2 = r2 % 32
            r9 = r0
            goto L_0x0395
        L_0x038c:
            r23 = r0
            r14 = r1
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r9 = r0
            r4 = r2
            r2 = 0
        L_0x0395:
            r0 = 18
            if (r5 < r0) goto L_0x03a3
            r0 = 49
            if (r5 > r0) goto L_0x03a3
            int r0 = r21 + 1
            r16[r21] = r13
            r21 = r0
        L_0x03a3:
            int r0 = r12 + 1
            r8[r12] = r29
            int r1 = r12 + 2
            r28 = r3
            r3 = r6 & 512(0x200, float:7.175E-43)
            if (r3 == 0) goto L_0x03b2
            r3 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x03b3
        L_0x03b2:
            r3 = 0
        L_0x03b3:
            r29 = r4
            r4 = r6 & 256(0x100, float:3.59E-43)
            if (r4 == 0) goto L_0x03bc
            r4 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x03bd
        L_0x03bc:
            r4 = 0
        L_0x03bd:
            r3 = r3 | r4
            r4 = r6 & 2048(0x800, float:2.87E-42)
            if (r4 == 0) goto L_0x03c5
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x03c6
        L_0x03c5:
            r4 = 0
        L_0x03c6:
            r3 = r3 | r4
            int r4 = r5 << 20
            r3 = r3 | r4
            r3 = r3 | r13
            r8[r0] = r3
            int r12 = r12 + 3
            int r0 = r2 << 20
            r0 = r0 | r9
            r8[r1] = r0
            r1 = r14
            r14 = r22
            r9 = r23
            r0 = r25
            r2 = r26
            r13 = r27
            r3 = r28
            r4 = r29
            r5 = 55296(0xd800, float:7.7486E-41)
            r6 = 1
            goto L_0x0189
        L_0x03e9:
            r25 = r0
            r27 = r13
            r22 = r14
            com.google.android.gms.internal.measurement.w5 r0 = new com.google.android.gms.internal.measurement.w5
            com.google.android.gms.internal.measurement.s5 r14 = r25.zza()
            r15 = 0
            r9 = r0
            r10 = r8
            r12 = r27
            r13 = r22
            r19 = r34
            r20 = r35
            r21 = r36
            r22 = r37
            r23 = r38
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            return r0
        L_0x040a:
            com.google.android.gms.internal.measurement.W5 r0 = (com.google.android.gms.internal.measurement.W5) r0
            java.lang.NoSuchMethodError r0 = new java.lang.NoSuchMethodError
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C7438w5.j(java.lang.Class, com.google.android.gms.internal.measurement.q5, com.google.android.gms.internal.measurement.z5, com.google.android.gms.internal.measurement.b5, com.google.android.gms.internal.measurement.Z5, com.google.android.gms.internal.measurement.z4, com.google.android.gms.internal.measurement.p5):com.google.android.gms.internal.measurement.w5");
    }

    private final <K, V, UT, UB> UB k(int i10, int i11, Map<K, V> map, Q4 q42, UB ub2, Z5<UT, UB> z52, Object obj) {
        this.f49132p.zza(M(i10));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry next = it.next();
            if (!q42.c(((Integer) next.getValue()).intValue())) {
                if (ub2 == null) {
                    ub2 = z52.i(obj);
                }
                C7330j4 A10 = C7276d4.A(C7340k5.a((C7367n5) null, next.getKey(), next.getValue()));
                try {
                    C7340k5.b(A10.b(), (C7367n5) null, next.getKey(), next.getValue());
                    z52.c(ub2, i11, A10.a());
                    it.remove();
                } catch (IOException e10) {
                    throw new RuntimeException(e10);
                }
            }
        }
        return ub2;
    }

    private final Object l(T t10, int i10) {
        K5 K10 = K(i10);
        long C10 = (long) (C(i10) & 1048575);
        if (!F(t10, i10)) {
            return K10.zza();
        }
        Object object = f49116r.getObject(t10, C10);
        if (P(object)) {
            return object;
        }
        Object zza = K10.zza();
        if (object != null) {
            K10.b(zza, object);
        }
        return zza;
    }

    private final Object m(T t10, int i10, int i11) {
        K5 K10 = K(i11);
        if (!G(t10, i10, i11)) {
            return K10.zza();
        }
        Object object = f49116r.getObject(t10, (long) (C(i11) & 1048575));
        if (P(object)) {
            return object;
        }
        Object zza = K10.zza();
        if (object != null) {
            K10.b(zza, object);
        }
        return zza;
    }

    private final <UT, UB> UB n(Object obj, int i10, UB ub2, Z5<UT, UB> z52, Object obj2) {
        Q4 J10;
        int i11 = this.f49117a[i10];
        Object B10 = C7287e6.B(obj, (long) (C(i10) & 1048575));
        if (B10 == null || (J10 = J(i10)) == null) {
            return ub2;
        }
        return k(i10, i11, this.f49132p.a(B10), J10, ub2, z52, obj2);
    }

    private static Field o(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    private static void p(int i10, Object obj, C7399r6 r6Var) {
        if (obj instanceof String) {
            r6Var.z(i10, (String) obj);
        } else {
            r6Var.I(i10, (C7276d4) obj);
        }
    }

    private static <UT, UB> void q(Z5<UT, UB> z52, T t10, C7399r6 r6Var) {
        z52.g(z52.k(t10), r6Var);
    }

    private final <K, V> void r(C7399r6 r6Var, int i10, Object obj, int i11) {
        if (obj != null) {
            this.f49132p.zza(M(i11));
            r6Var.s(i10, (C7367n5) null, this.f49132p.zzd(obj));
        }
    }

    private final void s(T t10, int i10, int i11, Object obj) {
        f49116r.putObject(t10, (long) (C(i11) & 1048575), obj);
        A(t10, i10, i11);
    }

    private final void t(T t10, int i10, Object obj) {
        f49116r.putObject(t10, (long) (C(i10) & 1048575), obj);
        z(t10, i10);
    }

    private final void u(T t10, T t11, int i10) {
        if (F(t11, i10)) {
            long C10 = (long) (C(i10) & 1048575);
            Unsafe unsafe = f49116r;
            Object object = unsafe.getObject(t11, C10);
            if (object != null) {
                K5 K10 = K(i10);
                if (!F(t10, i10)) {
                    if (!P(object)) {
                        unsafe.putObject(t10, C10, object);
                    } else {
                        Object zza = K10.zza();
                        K10.b(zza, object);
                        unsafe.putObject(t10, C10, zza);
                    }
                    z(t10, i10);
                    return;
                }
                Object object2 = unsafe.getObject(t10, C10);
                if (!P(object2)) {
                    Object zza2 = K10.zza();
                    K10.b(zza2, object2);
                    unsafe.putObject(t10, C10, zza2);
                    object2 = zza2;
                }
                K10.b(object2, object);
                return;
            }
            int i11 = this.f49117a[i10];
            String valueOf = String.valueOf(t11);
            throw new IllegalStateException("Source subfield " + i11 + " is present but null: " + valueOf);
        }
    }

    private final boolean v(T t10, int i10, int i11, int i12, int i13) {
        return i11 == 1048575 ? F(t10, i10) : (i12 & i13) != 0;
    }

    private static boolean w(Object obj, int i10, K5 k52) {
        return k52.a(C7287e6.B(obj, (long) (i10 & 1048575)));
    }

    private static <T> float x(T t10, long j10) {
        return ((Float) C7287e6.B(t10, j10)).floatValue();
    }

    private final int y(int i10) {
        return this.f49117a[i10 + 2];
    }

    private final void z(T t10, int i10) {
        int y10 = y(i10);
        long j10 = (long) (1048575 & y10);
        if (j10 != 1048575) {
            C7287e6.h(t10, j10, (1 << (y10 >>> 20)) | C7287e6.t(t10, j10));
        }
    }

    public final boolean a(T t10) {
        int i10;
        int i11;
        T t11 = t10;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (i14 < this.f49126j) {
            int i15 = this.f49125i[i14];
            int i16 = this.f49117a[i15];
            int C10 = C(i15);
            int i17 = this.f49117a[i15 + 2];
            int i18 = i17 & 1048575;
            int i19 = 1 << (i17 >>> 20);
            if (i18 != i12) {
                if (i18 != 1048575) {
                    i13 = f49116r.getInt(t11, (long) i18);
                }
                i10 = i13;
                i11 = i18;
            } else {
                i11 = i12;
                i10 = i13;
            }
            if ((268435456 & C10) != 0 && !v(t10, i15, i11, i10, i19)) {
                return false;
            }
            int i20 = (267386880 & C10) >>> 20;
            if (i20 != 9 && i20 != 17) {
                if (i20 != 27) {
                    if (i20 == 60 || i20 == 68) {
                        if (G(t11, i16, i15) && !w(t11, C10, K(i15))) {
                            return false;
                        }
                    } else if (i20 != 49) {
                        if (i20 == 50 && !this.f49132p.zzd(C7287e6.B(t11, (long) (C10 & 1048575))).isEmpty()) {
                            this.f49132p.zza(M(i15));
                            throw null;
                        }
                    }
                }
                List list = (List) C7287e6.B(t11, (long) (C10 & 1048575));
                if (!list.isEmpty()) {
                    K5 K10 = K(i15);
                    for (int i21 = 0; i21 < list.size(); i21++) {
                        if (!K10.a(list.get(i21))) {
                            return false;
                        }
                    }
                    continue;
                } else {
                    continue;
                }
            } else if (v(t10, i15, i11, i10, i19) && !w(t11, C10, K(i15))) {
                return false;
            }
            i14++;
            i12 = i11;
            i13 = i10;
        }
        return !this.f49122f || this.f49131o.b(t11).s();
    }

    public final void b(T t10, T t11) {
        N(t10);
        t11.getClass();
        for (int i10 = 0; i10 < this.f49117a.length; i10 += 3) {
            int C10 = C(i10);
            long j10 = (long) (1048575 & C10);
            int i11 = this.f49117a[i10];
            switch ((C10 & 267386880) >>> 20) {
                case 0:
                    if (!F(t11, i10)) {
                        break;
                    } else {
                        C7287e6.f(t10, j10, C7287e6.a(t11, j10));
                        z(t10, i10);
                        break;
                    }
                case 1:
                    if (!F(t11, i10)) {
                        break;
                    } else {
                        C7287e6.g(t10, j10, C7287e6.n(t11, j10));
                        z(t10, i10);
                        break;
                    }
                case 2:
                    if (!F(t11, i10)) {
                        break;
                    } else {
                        C7287e6.i(t10, j10, C7287e6.x(t11, j10));
                        z(t10, i10);
                        break;
                    }
                case 3:
                    if (!F(t11, i10)) {
                        break;
                    } else {
                        C7287e6.i(t10, j10, C7287e6.x(t11, j10));
                        z(t10, i10);
                        break;
                    }
                case 4:
                    if (!F(t11, i10)) {
                        break;
                    } else {
                        C7287e6.h(t10, j10, C7287e6.t(t11, j10));
                        z(t10, i10);
                        break;
                    }
                case 5:
                    if (!F(t11, i10)) {
                        break;
                    } else {
                        C7287e6.i(t10, j10, C7287e6.x(t11, j10));
                        z(t10, i10);
                        break;
                    }
                case 6:
                    if (!F(t11, i10)) {
                        break;
                    } else {
                        C7287e6.h(t10, j10, C7287e6.t(t11, j10));
                        z(t10, i10);
                        break;
                    }
                case 7:
                    if (!F(t11, i10)) {
                        break;
                    } else {
                        C7287e6.v(t10, j10, C7287e6.F(t11, j10));
                        z(t10, i10);
                        break;
                    }
                case 8:
                    if (!F(t11, i10)) {
                        break;
                    } else {
                        C7287e6.j(t10, j10, C7287e6.B(t11, j10));
                        z(t10, i10);
                        break;
                    }
                case 9:
                    u(t10, t11, i10);
                    break;
                case 10:
                    if (!F(t11, i10)) {
                        break;
                    } else {
                        C7287e6.j(t10, j10, C7287e6.B(t11, j10));
                        z(t10, i10);
                        break;
                    }
                case 11:
                    if (!F(t11, i10)) {
                        break;
                    } else {
                        C7287e6.h(t10, j10, C7287e6.t(t11, j10));
                        z(t10, i10);
                        break;
                    }
                case 12:
                    if (!F(t11, i10)) {
                        break;
                    } else {
                        C7287e6.h(t10, j10, C7287e6.t(t11, j10));
                        z(t10, i10);
                        break;
                    }
                case 13:
                    if (!F(t11, i10)) {
                        break;
                    } else {
                        C7287e6.h(t10, j10, C7287e6.t(t11, j10));
                        z(t10, i10);
                        break;
                    }
                case 14:
                    if (!F(t11, i10)) {
                        break;
                    } else {
                        C7287e6.i(t10, j10, C7287e6.x(t11, j10));
                        z(t10, i10);
                        break;
                    }
                case 15:
                    if (!F(t11, i10)) {
                        break;
                    } else {
                        C7287e6.h(t10, j10, C7287e6.t(t11, j10));
                        z(t10, i10);
                        break;
                    }
                case 16:
                    if (!F(t11, i10)) {
                        break;
                    } else {
                        C7287e6.i(t10, j10, C7287e6.x(t11, j10));
                        z(t10, i10);
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
                    this.f49129m.a(t10, t11, j10);
                    break;
                case 50:
                    L5.m(this.f49132p, t10, t11, j10);
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
                    if (!G(t11, i11, i10)) {
                        break;
                    } else {
                        C7287e6.j(t10, j10, C7287e6.B(t11, j10));
                        A(t10, i11, i10);
                        break;
                    }
                case 60:
                    B(t10, t11, i10);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!G(t11, i11, i10)) {
                        break;
                    } else {
                        C7287e6.j(t10, j10, C7287e6.B(t11, j10));
                        A(t10, i11, i10);
                        break;
                    }
                case 68:
                    B(t10, t11, i10);
                    break;
            }
        }
        L5.n(this.f49130n, t10, t11);
        if (this.f49122f) {
            L5.l(this.f49131o, t10, t11);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x006b, code lost:
        if (com.google.android.gms.internal.measurement.L5.p(com.google.android.gms.internal.measurement.C7287e6.B(r10, r6), com.google.android.gms.internal.measurement.C7287e6.B(r11, r6)) != false) goto L_0x01c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x007e, code lost:
        if (com.google.android.gms.internal.measurement.C7287e6.x(r10, r6) == com.google.android.gms.internal.measurement.C7287e6.x(r11, r6)) goto L_0x01c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008f, code lost:
        if (com.google.android.gms.internal.measurement.C7287e6.t(r10, r6) == com.google.android.gms.internal.measurement.C7287e6.t(r11, r6)) goto L_0x01c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a2, code lost:
        if (com.google.android.gms.internal.measurement.C7287e6.x(r10, r6) == com.google.android.gms.internal.measurement.C7287e6.x(r11, r6)) goto L_0x01c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b3, code lost:
        if (com.google.android.gms.internal.measurement.C7287e6.t(r10, r6) == com.google.android.gms.internal.measurement.C7287e6.t(r11, r6)) goto L_0x01c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c4, code lost:
        if (com.google.android.gms.internal.measurement.C7287e6.t(r10, r6) == com.google.android.gms.internal.measurement.C7287e6.t(r11, r6)) goto L_0x01c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00d6, code lost:
        if (com.google.android.gms.internal.measurement.C7287e6.t(r10, r6) == com.google.android.gms.internal.measurement.C7287e6.t(r11, r6)) goto L_0x01c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ec, code lost:
        if (com.google.android.gms.internal.measurement.L5.p(com.google.android.gms.internal.measurement.C7287e6.B(r10, r6), com.google.android.gms.internal.measurement.C7287e6.B(r11, r6)) != false) goto L_0x01c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0102, code lost:
        if (com.google.android.gms.internal.measurement.L5.p(com.google.android.gms.internal.measurement.C7287e6.B(r10, r6), com.google.android.gms.internal.measurement.C7287e6.B(r11, r6)) != false) goto L_0x01c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0118, code lost:
        if (com.google.android.gms.internal.measurement.L5.p(com.google.android.gms.internal.measurement.C7287e6.B(r10, r6), com.google.android.gms.internal.measurement.C7287e6.B(r11, r6)) != false) goto L_0x01c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x012a, code lost:
        if (com.google.android.gms.internal.measurement.C7287e6.F(r10, r6) == com.google.android.gms.internal.measurement.C7287e6.F(r11, r6)) goto L_0x01c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x013c, code lost:
        if (com.google.android.gms.internal.measurement.C7287e6.t(r10, r6) == com.google.android.gms.internal.measurement.C7287e6.t(r11, r6)) goto L_0x01c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0150, code lost:
        if (com.google.android.gms.internal.measurement.C7287e6.x(r10, r6) == com.google.android.gms.internal.measurement.C7287e6.x(r11, r6)) goto L_0x01c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0162, code lost:
        if (com.google.android.gms.internal.measurement.C7287e6.t(r10, r6) == com.google.android.gms.internal.measurement.C7287e6.t(r11, r6)) goto L_0x01c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0176, code lost:
        if (com.google.android.gms.internal.measurement.C7287e6.x(r10, r6) == com.google.android.gms.internal.measurement.C7287e6.x(r11, r6)) goto L_0x01c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x018a, code lost:
        if (com.google.android.gms.internal.measurement.C7287e6.x(r10, r6) == com.google.android.gms.internal.measurement.C7287e6.x(r11, r6)) goto L_0x01c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01a4, code lost:
        if (java.lang.Float.floatToIntBits(com.google.android.gms.internal.measurement.C7287e6.n(r10, r6)) == java.lang.Float.floatToIntBits(com.google.android.gms.internal.measurement.C7287e6.n(r11, r6))) goto L_0x01c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01c0, code lost:
        if (java.lang.Double.doubleToLongBits(com.google.android.gms.internal.measurement.C7287e6.a(r10, r6)) == java.lang.Double.doubleToLongBits(com.google.android.gms.internal.measurement.C7287e6.a(r11, r6))) goto L_0x01c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0038, code lost:
        if (com.google.android.gms.internal.measurement.L5.p(com.google.android.gms.internal.measurement.C7287e6.B(r10, r6), com.google.android.gms.internal.measurement.C7287e6.B(r11, r6)) != false) goto L_0x01c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003a, code lost:
        r3 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean c(T r10, T r11) {
        /*
            r9 = this;
            int[] r0 = r9.f49117a
            int r0 = r0.length
            r1 = 0
            r2 = r1
        L_0x0005:
            r3 = 1
            if (r2 >= r0) goto L_0x01cb
            int r4 = r9.C(r2)
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
            int r4 = r9.y(r2)
            r4 = r4 & r5
            long r4 = (long) r4
            int r8 = com.google.android.gms.internal.measurement.C7287e6.t(r10, r4)
            int r4 = com.google.android.gms.internal.measurement.C7287e6.t(r11, r4)
            if (r8 != r4) goto L_0x003a
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C7287e6.B(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.measurement.C7287e6.B(r11, r6)
            boolean r4 = com.google.android.gms.internal.measurement.L5.p(r4, r5)
            if (r4 != 0) goto L_0x01c4
        L_0x003a:
            r3 = r1
            goto L_0x01c4
        L_0x003d:
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C7287e6.B(r10, r6)
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C7287e6.B(r11, r6)
            boolean r3 = com.google.android.gms.internal.measurement.L5.p(r3, r4)
            goto L_0x01c4
        L_0x004b:
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C7287e6.B(r10, r6)
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C7287e6.B(r11, r6)
            boolean r3 = com.google.android.gms.internal.measurement.L5.p(r3, r4)
            goto L_0x01c4
        L_0x0059:
            boolean r4 = r9.H(r10, r11, r2)
            if (r4 == 0) goto L_0x003a
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C7287e6.B(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.measurement.C7287e6.B(r11, r6)
            boolean r4 = com.google.android.gms.internal.measurement.L5.p(r4, r5)
            if (r4 != 0) goto L_0x01c4
            goto L_0x003a
        L_0x006e:
            boolean r4 = r9.H(r10, r11, r2)
            if (r4 == 0) goto L_0x003a
            long r4 = com.google.android.gms.internal.measurement.C7287e6.x(r10, r6)
            long r6 = com.google.android.gms.internal.measurement.C7287e6.x(r11, r6)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x01c4
            goto L_0x003a
        L_0x0081:
            boolean r4 = r9.H(r10, r11, r2)
            if (r4 == 0) goto L_0x003a
            int r4 = com.google.android.gms.internal.measurement.C7287e6.t(r10, r6)
            int r5 = com.google.android.gms.internal.measurement.C7287e6.t(r11, r6)
            if (r4 == r5) goto L_0x01c4
            goto L_0x003a
        L_0x0092:
            boolean r4 = r9.H(r10, r11, r2)
            if (r4 == 0) goto L_0x003a
            long r4 = com.google.android.gms.internal.measurement.C7287e6.x(r10, r6)
            long r6 = com.google.android.gms.internal.measurement.C7287e6.x(r11, r6)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x01c4
            goto L_0x003a
        L_0x00a5:
            boolean r4 = r9.H(r10, r11, r2)
            if (r4 == 0) goto L_0x003a
            int r4 = com.google.android.gms.internal.measurement.C7287e6.t(r10, r6)
            int r5 = com.google.android.gms.internal.measurement.C7287e6.t(r11, r6)
            if (r4 == r5) goto L_0x01c4
            goto L_0x003a
        L_0x00b6:
            boolean r4 = r9.H(r10, r11, r2)
            if (r4 == 0) goto L_0x003a
            int r4 = com.google.android.gms.internal.measurement.C7287e6.t(r10, r6)
            int r5 = com.google.android.gms.internal.measurement.C7287e6.t(r11, r6)
            if (r4 == r5) goto L_0x01c4
            goto L_0x003a
        L_0x00c8:
            boolean r4 = r9.H(r10, r11, r2)
            if (r4 == 0) goto L_0x003a
            int r4 = com.google.android.gms.internal.measurement.C7287e6.t(r10, r6)
            int r5 = com.google.android.gms.internal.measurement.C7287e6.t(r11, r6)
            if (r4 == r5) goto L_0x01c4
            goto L_0x003a
        L_0x00da:
            boolean r4 = r9.H(r10, r11, r2)
            if (r4 == 0) goto L_0x003a
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C7287e6.B(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.measurement.C7287e6.B(r11, r6)
            boolean r4 = com.google.android.gms.internal.measurement.L5.p(r4, r5)
            if (r4 != 0) goto L_0x01c4
            goto L_0x003a
        L_0x00f0:
            boolean r4 = r9.H(r10, r11, r2)
            if (r4 == 0) goto L_0x003a
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C7287e6.B(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.measurement.C7287e6.B(r11, r6)
            boolean r4 = com.google.android.gms.internal.measurement.L5.p(r4, r5)
            if (r4 != 0) goto L_0x01c4
            goto L_0x003a
        L_0x0106:
            boolean r4 = r9.H(r10, r11, r2)
            if (r4 == 0) goto L_0x003a
            java.lang.Object r4 = com.google.android.gms.internal.measurement.C7287e6.B(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.measurement.C7287e6.B(r11, r6)
            boolean r4 = com.google.android.gms.internal.measurement.L5.p(r4, r5)
            if (r4 != 0) goto L_0x01c4
            goto L_0x003a
        L_0x011c:
            boolean r4 = r9.H(r10, r11, r2)
            if (r4 == 0) goto L_0x003a
            boolean r4 = com.google.android.gms.internal.measurement.C7287e6.F(r10, r6)
            boolean r5 = com.google.android.gms.internal.measurement.C7287e6.F(r11, r6)
            if (r4 == r5) goto L_0x01c4
            goto L_0x003a
        L_0x012e:
            boolean r4 = r9.H(r10, r11, r2)
            if (r4 == 0) goto L_0x003a
            int r4 = com.google.android.gms.internal.measurement.C7287e6.t(r10, r6)
            int r5 = com.google.android.gms.internal.measurement.C7287e6.t(r11, r6)
            if (r4 == r5) goto L_0x01c4
            goto L_0x003a
        L_0x0140:
            boolean r4 = r9.H(r10, r11, r2)
            if (r4 == 0) goto L_0x003a
            long r4 = com.google.android.gms.internal.measurement.C7287e6.x(r10, r6)
            long r6 = com.google.android.gms.internal.measurement.C7287e6.x(r11, r6)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x01c4
            goto L_0x003a
        L_0x0154:
            boolean r4 = r9.H(r10, r11, r2)
            if (r4 == 0) goto L_0x003a
            int r4 = com.google.android.gms.internal.measurement.C7287e6.t(r10, r6)
            int r5 = com.google.android.gms.internal.measurement.C7287e6.t(r11, r6)
            if (r4 == r5) goto L_0x01c4
            goto L_0x003a
        L_0x0166:
            boolean r4 = r9.H(r10, r11, r2)
            if (r4 == 0) goto L_0x003a
            long r4 = com.google.android.gms.internal.measurement.C7287e6.x(r10, r6)
            long r6 = com.google.android.gms.internal.measurement.C7287e6.x(r11, r6)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x01c4
            goto L_0x003a
        L_0x017a:
            boolean r4 = r9.H(r10, r11, r2)
            if (r4 == 0) goto L_0x003a
            long r4 = com.google.android.gms.internal.measurement.C7287e6.x(r10, r6)
            long r6 = com.google.android.gms.internal.measurement.C7287e6.x(r11, r6)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x01c4
            goto L_0x003a
        L_0x018e:
            boolean r4 = r9.H(r10, r11, r2)
            if (r4 == 0) goto L_0x003a
            float r4 = com.google.android.gms.internal.measurement.C7287e6.n(r10, r6)
            int r4 = java.lang.Float.floatToIntBits(r4)
            float r5 = com.google.android.gms.internal.measurement.C7287e6.n(r11, r6)
            int r5 = java.lang.Float.floatToIntBits(r5)
            if (r4 == r5) goto L_0x01c4
            goto L_0x003a
        L_0x01a8:
            boolean r4 = r9.H(r10, r11, r2)
            if (r4 == 0) goto L_0x003a
            double r4 = com.google.android.gms.internal.measurement.C7287e6.a(r10, r6)
            long r4 = java.lang.Double.doubleToLongBits(r4)
            double r6 = com.google.android.gms.internal.measurement.C7287e6.a(r11, r6)
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
            com.google.android.gms.internal.measurement.Z5<?, ?> r0 = r9.f49130n
            java.lang.Object r0 = r0.k(r10)
            com.google.android.gms.internal.measurement.Z5<?, ?> r2 = r9.f49130n
            java.lang.Object r2 = r2.k(r11)
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x01de
            return r1
        L_0x01de:
            boolean r0 = r9.f49122f
            if (r0 == 0) goto L_0x01f3
            com.google.android.gms.internal.measurement.z4<?> r0 = r9.f49131o
            com.google.android.gms.internal.measurement.A4 r10 = r0.b(r10)
            com.google.android.gms.internal.measurement.z4<?> r0 = r9.f49131o
            com.google.android.gms.internal.measurement.A4 r11 = r0.b(r11)
            boolean r10 = r10.equals(r11)
            return r10
        L_0x01f3:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C7438w5.c(java.lang.Object, java.lang.Object):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:196:0x05b8, code lost:
        r22 = r10;
        r20 = r11;
        r21 = r15;
        r16 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x05c0, code lost:
        r11 = r4;
        r15 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x07e0, code lost:
        r22 = r10;
        r20 = r11;
        r16 = r12;
        r21 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:342:0x0b77, code lost:
        r4 = r11 + 3;
        r2 = r13;
        r5 = r15;
        r12 = r16;
        r13 = 1048575;
        r14 = r19;
        r1 = r20;
        r15 = r21;
        r0 = r22;
        r9 = 267386880;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0517  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x0556  */
    /* JADX WARNING: Removed duplicated region for block: B:345:0x0b90  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d(T r24, com.google.android.gms.internal.measurement.C7399r6 r25) {
        /*
            r23 = this;
            r6 = r23
            r7 = r24
            r8 = r25
            int r0 = r25.zza()
            r1 = 2
            r9 = 267386880(0xff00000, float:2.3665827E-29)
            r11 = 1
            r12 = 0
            r13 = 1048575(0xfffff, float:1.469367E-39)
            if (r0 != r1) goto L_0x052c
            com.google.android.gms.internal.measurement.Z5<?, ?> r0 = r6.f49130n
            q(r0, r7, r8)
            boolean r0 = r6.f49122f
            if (r0 == 0) goto L_0x0036
            com.google.android.gms.internal.measurement.z4<?> r0 = r6.f49131o
            com.google.android.gms.internal.measurement.A4 r0 = r0.b(r7)
            com.google.android.gms.internal.measurement.O5<T, java.lang.Object> r1 = r0.f48533a
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0036
            java.util.Iterator r0 = r0.m()
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L_0x0038
        L_0x0036:
            r0 = 0
            r1 = 0
        L_0x0038:
            int[] r2 = r6.f49117a
            int r2 = r2.length
            int r2 = r2 + -3
        L_0x003d:
            if (r2 < 0) goto L_0x0515
            int r3 = r6.C(r2)
            int[] r4 = r6.f49117a
            r4 = r4[r2]
        L_0x0047:
            if (r1 == 0) goto L_0x0065
            com.google.android.gms.internal.measurement.z4<?> r5 = r6.f49131o
            int r5 = r5.a(r1)
            if (r5 <= r4) goto L_0x0065
            com.google.android.gms.internal.measurement.z4<?> r5 = r6.f49131o
            r5.d(r8, r1)
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0063
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L_0x0047
        L_0x0063:
            r1 = 0
            goto L_0x0047
        L_0x0065:
            r5 = r3 & r9
            int r5 = r5 >>> 20
            switch(r5) {
                case 0: goto L_0x0502;
                case 1: goto L_0x04f2;
                case 2: goto L_0x04e2;
                case 3: goto L_0x04d2;
                case 4: goto L_0x04c2;
                case 5: goto L_0x04b2;
                case 6: goto L_0x04a2;
                case 7: goto L_0x0491;
                case 8: goto L_0x0480;
                case 9: goto L_0x046b;
                case 10: goto L_0x0458;
                case 11: goto L_0x0447;
                case 12: goto L_0x0436;
                case 13: goto L_0x0425;
                case 14: goto L_0x0414;
                case 15: goto L_0x0403;
                case 16: goto L_0x03f2;
                case 17: goto L_0x03dd;
                case 18: goto L_0x03cc;
                case 19: goto L_0x03bb;
                case 20: goto L_0x03aa;
                case 21: goto L_0x0399;
                case 22: goto L_0x0388;
                case 23: goto L_0x0377;
                case 24: goto L_0x0366;
                case 25: goto L_0x0355;
                case 26: goto L_0x0344;
                case 27: goto L_0x032f;
                case 28: goto L_0x031e;
                case 29: goto L_0x030d;
                case 30: goto L_0x02fc;
                case 31: goto L_0x02eb;
                case 32: goto L_0x02da;
                case 33: goto L_0x02c9;
                case 34: goto L_0x02b8;
                case 35: goto L_0x02a7;
                case 36: goto L_0x0296;
                case 37: goto L_0x0285;
                case 38: goto L_0x0274;
                case 39: goto L_0x0263;
                case 40: goto L_0x0252;
                case 41: goto L_0x0241;
                case 42: goto L_0x0230;
                case 43: goto L_0x021f;
                case 44: goto L_0x020e;
                case 45: goto L_0x01fd;
                case 46: goto L_0x01ec;
                case 47: goto L_0x01db;
                case 48: goto L_0x01ca;
                case 49: goto L_0x01b5;
                case 50: goto L_0x01aa;
                case 51: goto L_0x0199;
                case 52: goto L_0x0188;
                case 53: goto L_0x0177;
                case 54: goto L_0x0166;
                case 55: goto L_0x0155;
                case 56: goto L_0x0144;
                case 57: goto L_0x0133;
                case 58: goto L_0x0122;
                case 59: goto L_0x0111;
                case 60: goto L_0x00fc;
                case 61: goto L_0x00e9;
                case 62: goto L_0x00d8;
                case 63: goto L_0x00c7;
                case 64: goto L_0x00b6;
                case 65: goto L_0x00a5;
                case 66: goto L_0x0094;
                case 67: goto L_0x0083;
                case 68: goto L_0x006e;
                default: goto L_0x006c;
            }
        L_0x006c:
            goto L_0x0511
        L_0x006e:
            boolean r5 = r6.G(r7, r4, r2)
            if (r5 == 0) goto L_0x0511
            r3 = r3 & r13
            long r14 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C7287e6.B(r7, r14)
            com.google.android.gms.internal.measurement.K5 r5 = r6.K(r2)
            r8.F(r4, r3, r5)
            goto L_0x0511
        L_0x0083:
            boolean r5 = r6.G(r7, r4, r2)
            if (r5 == 0) goto L_0x0511
            r3 = r3 & r13
            long r14 = (long) r3
            long r14 = I(r7, r14)
            r8.q(r4, r14)
            goto L_0x0511
        L_0x0094:
            boolean r5 = r6.G(r7, r4, r2)
            if (r5 == 0) goto L_0x0511
            r3 = r3 & r13
            long r14 = (long) r3
            int r3 = D(r7, r14)
            r8.v(r4, r3)
            goto L_0x0511
        L_0x00a5:
            boolean r5 = r6.G(r7, r4, r2)
            if (r5 == 0) goto L_0x0511
            r3 = r3 & r13
            long r14 = (long) r3
            long r14 = I(r7, r14)
            r8.f(r4, r14)
            goto L_0x0511
        L_0x00b6:
            boolean r5 = r6.G(r7, r4, r2)
            if (r5 == 0) goto L_0x0511
            r3 = r3 & r13
            long r14 = (long) r3
            int r3 = D(r7, r14)
            r8.u(r4, r3)
            goto L_0x0511
        L_0x00c7:
            boolean r5 = r6.G(r7, r4, r2)
            if (r5 == 0) goto L_0x0511
            r3 = r3 & r13
            long r14 = (long) r3
            int r3 = D(r7, r14)
            r8.i(r4, r3)
            goto L_0x0511
        L_0x00d8:
            boolean r5 = r6.G(r7, r4, r2)
            if (r5 == 0) goto L_0x0511
            r3 = r3 & r13
            long r14 = (long) r3
            int r3 = D(r7, r14)
            r8.m(r4, r3)
            goto L_0x0511
        L_0x00e9:
            boolean r5 = r6.G(r7, r4, r2)
            if (r5 == 0) goto L_0x0511
            r3 = r3 & r13
            long r14 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C7287e6.B(r7, r14)
            com.google.android.gms.internal.measurement.d4 r3 = (com.google.android.gms.internal.measurement.C7276d4) r3
            r8.I(r4, r3)
            goto L_0x0511
        L_0x00fc:
            boolean r5 = r6.G(r7, r4, r2)
            if (r5 == 0) goto L_0x0511
            r3 = r3 & r13
            long r14 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C7287e6.B(r7, r14)
            com.google.android.gms.internal.measurement.K5 r5 = r6.K(r2)
            r8.G(r4, r3, r5)
            goto L_0x0511
        L_0x0111:
            boolean r5 = r6.G(r7, r4, r2)
            if (r5 == 0) goto L_0x0511
            r3 = r3 & r13
            long r14 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C7287e6.B(r7, r14)
            p(r4, r3, r8)
            goto L_0x0511
        L_0x0122:
            boolean r5 = r6.G(r7, r4, r2)
            if (r5 == 0) goto L_0x0511
            r3 = r3 & r13
            long r14 = (long) r3
            boolean r3 = L(r7, r14)
            r8.o(r4, r3)
            goto L_0x0511
        L_0x0133:
            boolean r5 = r6.G(r7, r4, r2)
            if (r5 == 0) goto L_0x0511
            r3 = r3 & r13
            long r14 = (long) r3
            int r3 = D(r7, r14)
            r8.p(r4, r3)
            goto L_0x0511
        L_0x0144:
            boolean r5 = r6.G(r7, r4, r2)
            if (r5 == 0) goto L_0x0511
            r3 = r3 & r13
            long r14 = (long) r3
            long r14 = I(r7, r14)
            r8.j(r4, r14)
            goto L_0x0511
        L_0x0155:
            boolean r5 = r6.G(r7, r4, r2)
            if (r5 == 0) goto L_0x0511
            r3 = r3 & r13
            long r14 = (long) r3
            int r3 = D(r7, r14)
            r8.e(r4, r3)
            goto L_0x0511
        L_0x0166:
            boolean r5 = r6.G(r7, r4, r2)
            if (r5 == 0) goto L_0x0511
            r3 = r3 & r13
            long r14 = (long) r3
            long r14 = I(r7, r14)
            r8.r(r4, r14)
            goto L_0x0511
        L_0x0177:
            boolean r5 = r6.G(r7, r4, r2)
            if (r5 == 0) goto L_0x0511
            r3 = r3 & r13
            long r14 = (long) r3
            long r14 = I(r7, r14)
            r8.a(r4, r14)
            goto L_0x0511
        L_0x0188:
            boolean r5 = r6.G(r7, r4, r2)
            if (r5 == 0) goto L_0x0511
            r3 = r3 & r13
            long r14 = (long) r3
            float r3 = x(r7, r14)
            r8.l(r4, r3)
            goto L_0x0511
        L_0x0199:
            boolean r5 = r6.G(r7, r4, r2)
            if (r5 == 0) goto L_0x0511
            r3 = r3 & r13
            long r14 = (long) r3
            double r14 = f(r7, r14)
            r8.k(r4, r14)
            goto L_0x0511
        L_0x01aa:
            r3 = r3 & r13
            long r14 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C7287e6.B(r7, r14)
            r6.r(r8, r4, r3, r2)
            goto L_0x0511
        L_0x01b5:
            int[] r4 = r6.f49117a
            r4 = r4[r2]
            r3 = r3 & r13
            long r14 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C7287e6.B(r7, r14)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.measurement.K5 r5 = r6.K(r2)
            com.google.android.gms.internal.measurement.L5.j(r4, r3, r8, r5)
            goto L_0x0511
        L_0x01ca:
            int[] r4 = r6.f49117a
            r4 = r4[r2]
            r3 = r3 & r13
            long r14 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C7287e6.B(r7, r14)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.measurement.L5.W(r4, r3, r8, r11)
            goto L_0x0511
        L_0x01db:
            int[] r4 = r6.f49117a
            r4 = r4[r2]
            r3 = r3 & r13
            long r14 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C7287e6.B(r7, r14)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.measurement.L5.V(r4, r3, r8, r11)
            goto L_0x0511
        L_0x01ec:
            int[] r4 = r6.f49117a
            r4 = r4[r2]
            r3 = r3 & r13
            long r14 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C7287e6.B(r7, r14)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.measurement.L5.U(r4, r3, r8, r11)
            goto L_0x0511
        L_0x01fd:
            int[] r4 = r6.f49117a
            r4 = r4[r2]
            r3 = r3 & r13
            long r14 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C7287e6.B(r7, r14)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.measurement.L5.R(r4, r3, r8, r11)
            goto L_0x0511
        L_0x020e:
            int[] r4 = r6.f49117a
            r4 = r4[r2]
            r3 = r3 & r13
            long r14 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C7287e6.B(r7, r14)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.measurement.L5.z(r4, r3, r8, r11)
            goto L_0x0511
        L_0x021f:
            int[] r4 = r6.f49117a
            r4 = r4[r2]
            r3 = r3 & r13
            long r14 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C7287e6.B(r7, r14)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.measurement.L5.X(r4, r3, r8, r11)
            goto L_0x0511
        L_0x0230:
            int[] r4 = r6.f49117a
            r4 = r4[r2]
            r3 = r3 & r13
            long r14 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C7287e6.B(r7, r14)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.measurement.L5.k(r4, r3, r8, r11)
            goto L_0x0511
        L_0x0241:
            int[] r4 = r6.f49117a
            r4 = r4[r2]
            r3 = r3 & r13
            long r14 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C7287e6.B(r7, r14)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.measurement.L5.C(r4, r3, r8, r11)
            goto L_0x0511
        L_0x0252:
            int[] r4 = r6.f49117a
            r4 = r4[r2]
            r3 = r3 & r13
            long r14 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C7287e6.B(r7, r14)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.measurement.L5.F(r4, r3, r8, r11)
            goto L_0x0511
        L_0x0263:
            int[] r4 = r6.f49117a
            r4 = r4[r2]
            r3 = r3 & r13
            long r14 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C7287e6.B(r7, r14)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.measurement.L5.L(r4, r3, r8, r11)
            goto L_0x0511
        L_0x0274:
            int[] r4 = r6.f49117a
            r4 = r4[r2]
            r3 = r3 & r13
            long r14 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C7287e6.B(r7, r14)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.measurement.L5.Y(r4, r3, r8, r11)
            goto L_0x0511
        L_0x0285:
            int[] r4 = r6.f49117a
            r4 = r4[r2]
            r3 = r3 & r13
            long r14 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C7287e6.B(r7, r14)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.measurement.L5.O(r4, r3, r8, r11)
            goto L_0x0511
        L_0x0296:
            int[] r4 = r6.f49117a
            r4 = r4[r2]
            r3 = r3 & r13
            long r14 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C7287e6.B(r7, r14)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.measurement.L5.I(r4, r3, r8, r11)
            goto L_0x0511
        L_0x02a7:
            int[] r4 = r6.f49117a
            r4 = r4[r2]
            r3 = r3 & r13
            long r14 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C7287e6.B(r7, r14)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.measurement.L5.w(r4, r3, r8, r11)
            goto L_0x0511
        L_0x02b8:
            int[] r4 = r6.f49117a
            r4 = r4[r2]
            r3 = r3 & r13
            long r14 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C7287e6.B(r7, r14)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.measurement.L5.W(r4, r3, r8, r12)
            goto L_0x0511
        L_0x02c9:
            int[] r4 = r6.f49117a
            r4 = r4[r2]
            r3 = r3 & r13
            long r14 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C7287e6.B(r7, r14)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.measurement.L5.V(r4, r3, r8, r12)
            goto L_0x0511
        L_0x02da:
            int[] r4 = r6.f49117a
            r4 = r4[r2]
            r3 = r3 & r13
            long r14 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C7287e6.B(r7, r14)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.measurement.L5.U(r4, r3, r8, r12)
            goto L_0x0511
        L_0x02eb:
            int[] r4 = r6.f49117a
            r4 = r4[r2]
            r3 = r3 & r13
            long r14 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C7287e6.B(r7, r14)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.measurement.L5.R(r4, r3, r8, r12)
            goto L_0x0511
        L_0x02fc:
            int[] r4 = r6.f49117a
            r4 = r4[r2]
            r3 = r3 & r13
            long r14 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C7287e6.B(r7, r14)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.measurement.L5.z(r4, r3, r8, r12)
            goto L_0x0511
        L_0x030d:
            int[] r4 = r6.f49117a
            r4 = r4[r2]
            r3 = r3 & r13
            long r14 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C7287e6.B(r7, r14)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.measurement.L5.X(r4, r3, r8, r12)
            goto L_0x0511
        L_0x031e:
            int[] r4 = r6.f49117a
            r4 = r4[r2]
            r3 = r3 & r13
            long r14 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C7287e6.B(r7, r14)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.measurement.L5.i(r4, r3, r8)
            goto L_0x0511
        L_0x032f:
            int[] r4 = r6.f49117a
            r4 = r4[r2]
            r3 = r3 & r13
            long r14 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C7287e6.B(r7, r14)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.measurement.K5 r5 = r6.K(r2)
            com.google.android.gms.internal.measurement.L5.v(r4, r3, r8, r5)
            goto L_0x0511
        L_0x0344:
            int[] r4 = r6.f49117a
            r4 = r4[r2]
            r3 = r3 & r13
            long r14 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C7287e6.B(r7, r14)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.measurement.L5.u(r4, r3, r8)
            goto L_0x0511
        L_0x0355:
            int[] r4 = r6.f49117a
            r4 = r4[r2]
            r3 = r3 & r13
            long r14 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C7287e6.B(r7, r14)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.measurement.L5.k(r4, r3, r8, r12)
            goto L_0x0511
        L_0x0366:
            int[] r4 = r6.f49117a
            r4 = r4[r2]
            r3 = r3 & r13
            long r14 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C7287e6.B(r7, r14)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.measurement.L5.C(r4, r3, r8, r12)
            goto L_0x0511
        L_0x0377:
            int[] r4 = r6.f49117a
            r4 = r4[r2]
            r3 = r3 & r13
            long r14 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C7287e6.B(r7, r14)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.measurement.L5.F(r4, r3, r8, r12)
            goto L_0x0511
        L_0x0388:
            int[] r4 = r6.f49117a
            r4 = r4[r2]
            r3 = r3 & r13
            long r14 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C7287e6.B(r7, r14)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.measurement.L5.L(r4, r3, r8, r12)
            goto L_0x0511
        L_0x0399:
            int[] r4 = r6.f49117a
            r4 = r4[r2]
            r3 = r3 & r13
            long r14 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C7287e6.B(r7, r14)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.measurement.L5.Y(r4, r3, r8, r12)
            goto L_0x0511
        L_0x03aa:
            int[] r4 = r6.f49117a
            r4 = r4[r2]
            r3 = r3 & r13
            long r14 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C7287e6.B(r7, r14)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.measurement.L5.O(r4, r3, r8, r12)
            goto L_0x0511
        L_0x03bb:
            int[] r4 = r6.f49117a
            r4 = r4[r2]
            r3 = r3 & r13
            long r14 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C7287e6.B(r7, r14)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.measurement.L5.I(r4, r3, r8, r12)
            goto L_0x0511
        L_0x03cc:
            int[] r4 = r6.f49117a
            r4 = r4[r2]
            r3 = r3 & r13
            long r14 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C7287e6.B(r7, r14)
            java.util.List r3 = (java.util.List) r3
            com.google.android.gms.internal.measurement.L5.w(r4, r3, r8, r12)
            goto L_0x0511
        L_0x03dd:
            boolean r5 = r6.F(r7, r2)
            if (r5 == 0) goto L_0x0511
            r3 = r3 & r13
            long r14 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C7287e6.B(r7, r14)
            com.google.android.gms.internal.measurement.K5 r5 = r6.K(r2)
            r8.F(r4, r3, r5)
            goto L_0x0511
        L_0x03f2:
            boolean r5 = r6.F(r7, r2)
            if (r5 == 0) goto L_0x0511
            r3 = r3 & r13
            long r14 = (long) r3
            long r14 = com.google.android.gms.internal.measurement.C7287e6.x(r7, r14)
            r8.q(r4, r14)
            goto L_0x0511
        L_0x0403:
            boolean r5 = r6.F(r7, r2)
            if (r5 == 0) goto L_0x0511
            r3 = r3 & r13
            long r14 = (long) r3
            int r3 = com.google.android.gms.internal.measurement.C7287e6.t(r7, r14)
            r8.v(r4, r3)
            goto L_0x0511
        L_0x0414:
            boolean r5 = r6.F(r7, r2)
            if (r5 == 0) goto L_0x0511
            r3 = r3 & r13
            long r14 = (long) r3
            long r14 = com.google.android.gms.internal.measurement.C7287e6.x(r7, r14)
            r8.f(r4, r14)
            goto L_0x0511
        L_0x0425:
            boolean r5 = r6.F(r7, r2)
            if (r5 == 0) goto L_0x0511
            r3 = r3 & r13
            long r14 = (long) r3
            int r3 = com.google.android.gms.internal.measurement.C7287e6.t(r7, r14)
            r8.u(r4, r3)
            goto L_0x0511
        L_0x0436:
            boolean r5 = r6.F(r7, r2)
            if (r5 == 0) goto L_0x0511
            r3 = r3 & r13
            long r14 = (long) r3
            int r3 = com.google.android.gms.internal.measurement.C7287e6.t(r7, r14)
            r8.i(r4, r3)
            goto L_0x0511
        L_0x0447:
            boolean r5 = r6.F(r7, r2)
            if (r5 == 0) goto L_0x0511
            r3 = r3 & r13
            long r14 = (long) r3
            int r3 = com.google.android.gms.internal.measurement.C7287e6.t(r7, r14)
            r8.m(r4, r3)
            goto L_0x0511
        L_0x0458:
            boolean r5 = r6.F(r7, r2)
            if (r5 == 0) goto L_0x0511
            r3 = r3 & r13
            long r14 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C7287e6.B(r7, r14)
            com.google.android.gms.internal.measurement.d4 r3 = (com.google.android.gms.internal.measurement.C7276d4) r3
            r8.I(r4, r3)
            goto L_0x0511
        L_0x046b:
            boolean r5 = r6.F(r7, r2)
            if (r5 == 0) goto L_0x0511
            r3 = r3 & r13
            long r14 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C7287e6.B(r7, r14)
            com.google.android.gms.internal.measurement.K5 r5 = r6.K(r2)
            r8.G(r4, r3, r5)
            goto L_0x0511
        L_0x0480:
            boolean r5 = r6.F(r7, r2)
            if (r5 == 0) goto L_0x0511
            r3 = r3 & r13
            long r14 = (long) r3
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C7287e6.B(r7, r14)
            p(r4, r3, r8)
            goto L_0x0511
        L_0x0491:
            boolean r5 = r6.F(r7, r2)
            if (r5 == 0) goto L_0x0511
            r3 = r3 & r13
            long r14 = (long) r3
            boolean r3 = com.google.android.gms.internal.measurement.C7287e6.F(r7, r14)
            r8.o(r4, r3)
            goto L_0x0511
        L_0x04a2:
            boolean r5 = r6.F(r7, r2)
            if (r5 == 0) goto L_0x0511
            r3 = r3 & r13
            long r14 = (long) r3
            int r3 = com.google.android.gms.internal.measurement.C7287e6.t(r7, r14)
            r8.p(r4, r3)
            goto L_0x0511
        L_0x04b2:
            boolean r5 = r6.F(r7, r2)
            if (r5 == 0) goto L_0x0511
            r3 = r3 & r13
            long r14 = (long) r3
            long r14 = com.google.android.gms.internal.measurement.C7287e6.x(r7, r14)
            r8.j(r4, r14)
            goto L_0x0511
        L_0x04c2:
            boolean r5 = r6.F(r7, r2)
            if (r5 == 0) goto L_0x0511
            r3 = r3 & r13
            long r14 = (long) r3
            int r3 = com.google.android.gms.internal.measurement.C7287e6.t(r7, r14)
            r8.e(r4, r3)
            goto L_0x0511
        L_0x04d2:
            boolean r5 = r6.F(r7, r2)
            if (r5 == 0) goto L_0x0511
            r3 = r3 & r13
            long r14 = (long) r3
            long r14 = com.google.android.gms.internal.measurement.C7287e6.x(r7, r14)
            r8.r(r4, r14)
            goto L_0x0511
        L_0x04e2:
            boolean r5 = r6.F(r7, r2)
            if (r5 == 0) goto L_0x0511
            r3 = r3 & r13
            long r14 = (long) r3
            long r14 = com.google.android.gms.internal.measurement.C7287e6.x(r7, r14)
            r8.a(r4, r14)
            goto L_0x0511
        L_0x04f2:
            boolean r5 = r6.F(r7, r2)
            if (r5 == 0) goto L_0x0511
            r3 = r3 & r13
            long r14 = (long) r3
            float r3 = com.google.android.gms.internal.measurement.C7287e6.n(r7, r14)
            r8.l(r4, r3)
            goto L_0x0511
        L_0x0502:
            boolean r5 = r6.F(r7, r2)
            if (r5 == 0) goto L_0x0511
            r3 = r3 & r13
            long r14 = (long) r3
            double r14 = com.google.android.gms.internal.measurement.C7287e6.a(r7, r14)
            r8.k(r4, r14)
        L_0x0511:
            int r2 = r2 + -3
            goto L_0x003d
        L_0x0515:
            if (r1 == 0) goto L_0x052b
            com.google.android.gms.internal.measurement.z4<?> r2 = r6.f49131o
            r2.d(r8, r1)
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0529
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L_0x0515
        L_0x0529:
            r1 = 0
            goto L_0x0515
        L_0x052b:
            return
        L_0x052c:
            boolean r0 = r6.f49122f
            if (r0 == 0) goto L_0x054a
            com.google.android.gms.internal.measurement.z4<?> r0 = r6.f49131o
            com.google.android.gms.internal.measurement.A4 r0 = r0.b(r7)
            com.google.android.gms.internal.measurement.O5<T, java.lang.Object> r1 = r0.f48533a
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x054a
            java.util.Iterator r0 = r0.p()
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            r14 = r0
            goto L_0x054c
        L_0x054a:
            r1 = 0
            r14 = 0
        L_0x054c:
            int[] r0 = r6.f49117a
            int r15 = r0.length
            sun.misc.Unsafe r5 = f49116r
            r2 = r12
            r4 = r2
            r0 = r13
        L_0x0554:
            if (r4 >= r15) goto L_0x0b8c
            int r3 = r6.C(r4)
            int[] r10 = r6.f49117a
            r12 = r10[r4]
            r17 = r3 & r9
            int r9 = r17 >>> 20
            r11 = 17
            if (r9 > r11) goto L_0x058a
            int r11 = r4 + 2
            r10 = r10[r11]
            r11 = r10 & r13
            if (r11 == r0) goto L_0x057e
            if (r11 != r13) goto L_0x0574
            r19 = r14
            r2 = 0
            goto L_0x057c
        L_0x0574:
            r19 = r14
            long r13 = (long) r11
            int r0 = r5.getInt(r7, r13)
            r2 = r0
        L_0x057c:
            r0 = r11
            goto L_0x0580
        L_0x057e:
            r19 = r14
        L_0x0580:
            int r10 = r10 >>> 20
            r11 = 1
            int r10 = r11 << r10
            r11 = r1
            r13 = r2
            r14 = r10
            r10 = r0
            goto L_0x0590
        L_0x058a:
            r19 = r14
            r10 = r0
            r11 = r1
            r13 = r2
            r14 = 0
        L_0x0590:
            if (r11 == 0) goto L_0x05af
            com.google.android.gms.internal.measurement.z4<?> r0 = r6.f49131o
            int r0 = r0.a(r11)
            if (r0 > r12) goto L_0x05af
            com.google.android.gms.internal.measurement.z4<?> r0 = r6.f49131o
            r0.d(r8, r11)
            boolean r0 = r19.hasNext()
            if (r0 == 0) goto L_0x05ad
            java.lang.Object r0 = r19.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            r11 = r0
            goto L_0x0590
        L_0x05ad:
            r11 = 0
            goto L_0x0590
        L_0x05af:
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r3 & r18
            long r2 = (long) r0
            switch(r9) {
                case 0: goto L_0x0b56;
                case 1: goto L_0x0b34;
                case 2: goto L_0x0b12;
                case 3: goto L_0x0aef;
                case 4: goto L_0x0acc;
                case 5: goto L_0x0aa9;
                case 6: goto L_0x0a86;
                case 7: goto L_0x0a63;
                case 8: goto L_0x0a40;
                case 9: goto L_0x0a19;
                case 10: goto L_0x09f4;
                case 11: goto L_0x09d1;
                case 12: goto L_0x09ae;
                case 13: goto L_0x098b;
                case 14: goto L_0x0968;
                case 15: goto L_0x0945;
                case 16: goto L_0x0922;
                case 17: goto L_0x08f6;
                case 18: goto L_0x08e5;
                case 19: goto L_0x08d4;
                case 20: goto L_0x08c3;
                case 21: goto L_0x08b2;
                case 22: goto L_0x08a1;
                case 23: goto L_0x0890;
                case 24: goto L_0x087f;
                case 25: goto L_0x086e;
                case 26: goto L_0x085e;
                case 27: goto L_0x084a;
                case 28: goto L_0x083a;
                case 29: goto L_0x082a;
                case 30: goto L_0x081a;
                case 31: goto L_0x080a;
                case 32: goto L_0x07fa;
                case 33: goto L_0x07ea;
                case 34: goto L_0x07d1;
                case 35: goto L_0x07c1;
                case 36: goto L_0x07b1;
                case 37: goto L_0x07a1;
                case 38: goto L_0x0791;
                case 39: goto L_0x0781;
                case 40: goto L_0x0771;
                case 41: goto L_0x0761;
                case 42: goto L_0x0751;
                case 43: goto L_0x0741;
                case 44: goto L_0x0731;
                case 45: goto L_0x0721;
                case 46: goto L_0x0711;
                case 47: goto L_0x0701;
                case 48: goto L_0x06f1;
                case 49: goto L_0x06de;
                case 50: goto L_0x06d5;
                case 51: goto L_0x06c6;
                case 52: goto L_0x06b7;
                case 53: goto L_0x06a8;
                case 54: goto L_0x0699;
                case 55: goto L_0x068a;
                case 56: goto L_0x067b;
                case 57: goto L_0x066c;
                case 58: goto L_0x065d;
                case 59: goto L_0x064e;
                case 60: goto L_0x063b;
                case 61: goto L_0x062a;
                case 62: goto L_0x061c;
                case 63: goto L_0x060e;
                case 64: goto L_0x0600;
                case 65: goto L_0x05f2;
                case 66: goto L_0x05e4;
                case 67: goto L_0x05d6;
                case 68: goto L_0x05c4;
                default: goto L_0x05b8;
            }
        L_0x05b8:
            r22 = r10
            r20 = r11
            r21 = r15
            r16 = 0
        L_0x05c0:
            r11 = r4
            r15 = r5
            goto L_0x0b77
        L_0x05c4:
            boolean r0 = r6.G(r7, r12, r4)
            if (r0 == 0) goto L_0x05b8
            java.lang.Object r0 = r5.getObject(r7, r2)
            com.google.android.gms.internal.measurement.K5 r1 = r6.K(r4)
            r8.F(r12, r0, r1)
            goto L_0x05b8
        L_0x05d6:
            boolean r0 = r6.G(r7, r12, r4)
            if (r0 == 0) goto L_0x05b8
            long r0 = I(r7, r2)
            r8.q(r12, r0)
            goto L_0x05b8
        L_0x05e4:
            boolean r0 = r6.G(r7, r12, r4)
            if (r0 == 0) goto L_0x05b8
            int r0 = D(r7, r2)
            r8.v(r12, r0)
            goto L_0x05b8
        L_0x05f2:
            boolean r0 = r6.G(r7, r12, r4)
            if (r0 == 0) goto L_0x05b8
            long r0 = I(r7, r2)
            r8.f(r12, r0)
            goto L_0x05b8
        L_0x0600:
            boolean r0 = r6.G(r7, r12, r4)
            if (r0 == 0) goto L_0x05b8
            int r0 = D(r7, r2)
            r8.u(r12, r0)
            goto L_0x05b8
        L_0x060e:
            boolean r0 = r6.G(r7, r12, r4)
            if (r0 == 0) goto L_0x05b8
            int r0 = D(r7, r2)
            r8.i(r12, r0)
            goto L_0x05b8
        L_0x061c:
            boolean r0 = r6.G(r7, r12, r4)
            if (r0 == 0) goto L_0x05b8
            int r0 = D(r7, r2)
            r8.m(r12, r0)
            goto L_0x05b8
        L_0x062a:
            boolean r0 = r6.G(r7, r12, r4)
            if (r0 == 0) goto L_0x05b8
            java.lang.Object r0 = r5.getObject(r7, r2)
            com.google.android.gms.internal.measurement.d4 r0 = (com.google.android.gms.internal.measurement.C7276d4) r0
            r8.I(r12, r0)
            goto L_0x05b8
        L_0x063b:
            boolean r0 = r6.G(r7, r12, r4)
            if (r0 == 0) goto L_0x05b8
            java.lang.Object r0 = r5.getObject(r7, r2)
            com.google.android.gms.internal.measurement.K5 r1 = r6.K(r4)
            r8.G(r12, r0, r1)
            goto L_0x05b8
        L_0x064e:
            boolean r0 = r6.G(r7, r12, r4)
            if (r0 == 0) goto L_0x05b8
            java.lang.Object r0 = r5.getObject(r7, r2)
            p(r12, r0, r8)
            goto L_0x05b8
        L_0x065d:
            boolean r0 = r6.G(r7, r12, r4)
            if (r0 == 0) goto L_0x05b8
            boolean r0 = L(r7, r2)
            r8.o(r12, r0)
            goto L_0x05b8
        L_0x066c:
            boolean r0 = r6.G(r7, r12, r4)
            if (r0 == 0) goto L_0x05b8
            int r0 = D(r7, r2)
            r8.p(r12, r0)
            goto L_0x05b8
        L_0x067b:
            boolean r0 = r6.G(r7, r12, r4)
            if (r0 == 0) goto L_0x05b8
            long r0 = I(r7, r2)
            r8.j(r12, r0)
            goto L_0x05b8
        L_0x068a:
            boolean r0 = r6.G(r7, r12, r4)
            if (r0 == 0) goto L_0x05b8
            int r0 = D(r7, r2)
            r8.e(r12, r0)
            goto L_0x05b8
        L_0x0699:
            boolean r0 = r6.G(r7, r12, r4)
            if (r0 == 0) goto L_0x05b8
            long r0 = I(r7, r2)
            r8.r(r12, r0)
            goto L_0x05b8
        L_0x06a8:
            boolean r0 = r6.G(r7, r12, r4)
            if (r0 == 0) goto L_0x05b8
            long r0 = I(r7, r2)
            r8.a(r12, r0)
            goto L_0x05b8
        L_0x06b7:
            boolean r0 = r6.G(r7, r12, r4)
            if (r0 == 0) goto L_0x05b8
            float r0 = x(r7, r2)
            r8.l(r12, r0)
            goto L_0x05b8
        L_0x06c6:
            boolean r0 = r6.G(r7, r12, r4)
            if (r0 == 0) goto L_0x05b8
            double r0 = f(r7, r2)
            r8.k(r12, r0)
            goto L_0x05b8
        L_0x06d5:
            java.lang.Object r0 = r5.getObject(r7, r2)
            r6.r(r8, r12, r0, r4)
            goto L_0x05b8
        L_0x06de:
            int[] r0 = r6.f49117a
            r0 = r0[r4]
            java.lang.Object r1 = r5.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.measurement.K5 r2 = r6.K(r4)
            com.google.android.gms.internal.measurement.L5.j(r0, r1, r8, r2)
            goto L_0x05b8
        L_0x06f1:
            int[] r0 = r6.f49117a
            r0 = r0[r4]
            java.lang.Object r1 = r5.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            r9 = 1
            com.google.android.gms.internal.measurement.L5.W(r0, r1, r8, r9)
            goto L_0x05b8
        L_0x0701:
            r9 = 1
            int[] r0 = r6.f49117a
            r0 = r0[r4]
            java.lang.Object r1 = r5.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.measurement.L5.V(r0, r1, r8, r9)
            goto L_0x05b8
        L_0x0711:
            r9 = 1
            int[] r0 = r6.f49117a
            r0 = r0[r4]
            java.lang.Object r1 = r5.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.measurement.L5.U(r0, r1, r8, r9)
            goto L_0x05b8
        L_0x0721:
            r9 = 1
            int[] r0 = r6.f49117a
            r0 = r0[r4]
            java.lang.Object r1 = r5.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.measurement.L5.R(r0, r1, r8, r9)
            goto L_0x05b8
        L_0x0731:
            r9 = 1
            int[] r0 = r6.f49117a
            r0 = r0[r4]
            java.lang.Object r1 = r5.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.measurement.L5.z(r0, r1, r8, r9)
            goto L_0x05b8
        L_0x0741:
            r9 = 1
            int[] r0 = r6.f49117a
            r0 = r0[r4]
            java.lang.Object r1 = r5.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.measurement.L5.X(r0, r1, r8, r9)
            goto L_0x05b8
        L_0x0751:
            r9 = 1
            int[] r0 = r6.f49117a
            r0 = r0[r4]
            java.lang.Object r1 = r5.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.measurement.L5.k(r0, r1, r8, r9)
            goto L_0x05b8
        L_0x0761:
            r9 = 1
            int[] r0 = r6.f49117a
            r0 = r0[r4]
            java.lang.Object r1 = r5.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.measurement.L5.C(r0, r1, r8, r9)
            goto L_0x05b8
        L_0x0771:
            r9 = 1
            int[] r0 = r6.f49117a
            r0 = r0[r4]
            java.lang.Object r1 = r5.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.measurement.L5.F(r0, r1, r8, r9)
            goto L_0x05b8
        L_0x0781:
            r9 = 1
            int[] r0 = r6.f49117a
            r0 = r0[r4]
            java.lang.Object r1 = r5.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.measurement.L5.L(r0, r1, r8, r9)
            goto L_0x05b8
        L_0x0791:
            r9 = 1
            int[] r0 = r6.f49117a
            r0 = r0[r4]
            java.lang.Object r1 = r5.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.measurement.L5.Y(r0, r1, r8, r9)
            goto L_0x05b8
        L_0x07a1:
            r9 = 1
            int[] r0 = r6.f49117a
            r0 = r0[r4]
            java.lang.Object r1 = r5.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.measurement.L5.O(r0, r1, r8, r9)
            goto L_0x05b8
        L_0x07b1:
            r9 = 1
            int[] r0 = r6.f49117a
            r0 = r0[r4]
            java.lang.Object r1 = r5.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.measurement.L5.I(r0, r1, r8, r9)
            goto L_0x05b8
        L_0x07c1:
            r9 = 1
            int[] r0 = r6.f49117a
            r0 = r0[r4]
            java.lang.Object r1 = r5.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.measurement.L5.w(r0, r1, r8, r9)
            goto L_0x05b8
        L_0x07d1:
            r9 = 1
            int[] r0 = r6.f49117a
            r0 = r0[r4]
            java.lang.Object r1 = r5.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            r12 = 0
            com.google.android.gms.internal.measurement.L5.W(r0, r1, r8, r12)
        L_0x07e0:
            r22 = r10
            r20 = r11
            r16 = r12
            r21 = r15
            goto L_0x05c0
        L_0x07ea:
            r9 = 1
            r12 = 0
            int[] r0 = r6.f49117a
            r0 = r0[r4]
            java.lang.Object r1 = r5.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.measurement.L5.V(r0, r1, r8, r12)
            goto L_0x07e0
        L_0x07fa:
            r9 = 1
            r12 = 0
            int[] r0 = r6.f49117a
            r0 = r0[r4]
            java.lang.Object r1 = r5.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.measurement.L5.U(r0, r1, r8, r12)
            goto L_0x07e0
        L_0x080a:
            r9 = 1
            r12 = 0
            int[] r0 = r6.f49117a
            r0 = r0[r4]
            java.lang.Object r1 = r5.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.measurement.L5.R(r0, r1, r8, r12)
            goto L_0x07e0
        L_0x081a:
            r9 = 1
            r12 = 0
            int[] r0 = r6.f49117a
            r0 = r0[r4]
            java.lang.Object r1 = r5.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.measurement.L5.z(r0, r1, r8, r12)
            goto L_0x07e0
        L_0x082a:
            r9 = 1
            r12 = 0
            int[] r0 = r6.f49117a
            r0 = r0[r4]
            java.lang.Object r1 = r5.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.measurement.L5.X(r0, r1, r8, r12)
            goto L_0x07e0
        L_0x083a:
            r9 = 1
            int[] r0 = r6.f49117a
            r0 = r0[r4]
            java.lang.Object r1 = r5.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.measurement.L5.i(r0, r1, r8)
            goto L_0x05b8
        L_0x084a:
            r9 = 1
            int[] r0 = r6.f49117a
            r0 = r0[r4]
            java.lang.Object r1 = r5.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.measurement.K5 r2 = r6.K(r4)
            com.google.android.gms.internal.measurement.L5.v(r0, r1, r8, r2)
            goto L_0x05b8
        L_0x085e:
            r9 = 1
            int[] r0 = r6.f49117a
            r0 = r0[r4]
            java.lang.Object r1 = r5.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.measurement.L5.u(r0, r1, r8)
            goto L_0x05b8
        L_0x086e:
            r9 = 1
            int[] r0 = r6.f49117a
            r0 = r0[r4]
            java.lang.Object r1 = r5.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            r12 = 0
            com.google.android.gms.internal.measurement.L5.k(r0, r1, r8, r12)
            goto L_0x07e0
        L_0x087f:
            r9 = 1
            r12 = 0
            int[] r0 = r6.f49117a
            r0 = r0[r4]
            java.lang.Object r1 = r5.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.measurement.L5.C(r0, r1, r8, r12)
            goto L_0x07e0
        L_0x0890:
            r9 = 1
            r12 = 0
            int[] r0 = r6.f49117a
            r0 = r0[r4]
            java.lang.Object r1 = r5.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.measurement.L5.F(r0, r1, r8, r12)
            goto L_0x07e0
        L_0x08a1:
            r9 = 1
            r12 = 0
            int[] r0 = r6.f49117a
            r0 = r0[r4]
            java.lang.Object r1 = r5.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.measurement.L5.L(r0, r1, r8, r12)
            goto L_0x07e0
        L_0x08b2:
            r9 = 1
            r12 = 0
            int[] r0 = r6.f49117a
            r0 = r0[r4]
            java.lang.Object r1 = r5.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.measurement.L5.Y(r0, r1, r8, r12)
            goto L_0x07e0
        L_0x08c3:
            r9 = 1
            r12 = 0
            int[] r0 = r6.f49117a
            r0 = r0[r4]
            java.lang.Object r1 = r5.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.measurement.L5.O(r0, r1, r8, r12)
            goto L_0x07e0
        L_0x08d4:
            r9 = 1
            r12 = 0
            int[] r0 = r6.f49117a
            r0 = r0[r4]
            java.lang.Object r1 = r5.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.measurement.L5.I(r0, r1, r8, r12)
            goto L_0x07e0
        L_0x08e5:
            r9 = 1
            r12 = 0
            int[] r0 = r6.f49117a
            r0 = r0[r4]
            java.lang.Object r1 = r5.getObject(r7, r2)
            java.util.List r1 = (java.util.List) r1
            com.google.android.gms.internal.measurement.L5.w(r0, r1, r8, r12)
            goto L_0x07e0
        L_0x08f6:
            r9 = 1
            r16 = 0
            r0 = r23
            r1 = r24
            r8 = r2
            r2 = r4
            r3 = r10
            r20 = r11
            r11 = r4
            r4 = r13
            r21 = r15
            r15 = r5
            r5 = r14
            boolean r0 = r0.v(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x091f
            java.lang.Object r0 = r15.getObject(r7, r8)
            com.google.android.gms.internal.measurement.K5 r1 = r6.K(r11)
            r8 = r25
            r8.F(r12, r0, r1)
        L_0x091b:
            r22 = r10
            goto L_0x0b77
        L_0x091f:
            r8 = r25
            goto L_0x091b
        L_0x0922:
            r20 = r11
            r21 = r15
            r16 = 0
            r11 = r4
            r15 = r5
            r4 = r2
            r0 = r23
            r1 = r24
            r2 = r11
            r3 = r10
            r22 = r10
            r9 = r4
            r4 = r13
            r5 = r14
            boolean r0 = r0.v(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0b77
            long r0 = r15.getLong(r7, r9)
            r8.q(r12, r0)
            goto L_0x0b77
        L_0x0945:
            r22 = r10
            r20 = r11
            r21 = r15
            r16 = 0
            r9 = r2
            r11 = r4
            r15 = r5
            r0 = r23
            r1 = r24
            r2 = r11
            r3 = r22
            r4 = r13
            r5 = r14
            boolean r0 = r0.v(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0b77
            int r0 = r15.getInt(r7, r9)
            r8.v(r12, r0)
            goto L_0x0b77
        L_0x0968:
            r22 = r10
            r20 = r11
            r21 = r15
            r16 = 0
            r9 = r2
            r11 = r4
            r15 = r5
            r0 = r23
            r1 = r24
            r2 = r11
            r3 = r22
            r4 = r13
            r5 = r14
            boolean r0 = r0.v(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0b77
            long r0 = r15.getLong(r7, r9)
            r8.f(r12, r0)
            goto L_0x0b77
        L_0x098b:
            r22 = r10
            r20 = r11
            r21 = r15
            r16 = 0
            r9 = r2
            r11 = r4
            r15 = r5
            r0 = r23
            r1 = r24
            r2 = r11
            r3 = r22
            r4 = r13
            r5 = r14
            boolean r0 = r0.v(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0b77
            int r0 = r15.getInt(r7, r9)
            r8.u(r12, r0)
            goto L_0x0b77
        L_0x09ae:
            r22 = r10
            r20 = r11
            r21 = r15
            r16 = 0
            r9 = r2
            r11 = r4
            r15 = r5
            r0 = r23
            r1 = r24
            r2 = r11
            r3 = r22
            r4 = r13
            r5 = r14
            boolean r0 = r0.v(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0b77
            int r0 = r15.getInt(r7, r9)
            r8.i(r12, r0)
            goto L_0x0b77
        L_0x09d1:
            r22 = r10
            r20 = r11
            r21 = r15
            r16 = 0
            r9 = r2
            r11 = r4
            r15 = r5
            r0 = r23
            r1 = r24
            r2 = r11
            r3 = r22
            r4 = r13
            r5 = r14
            boolean r0 = r0.v(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0b77
            int r0 = r15.getInt(r7, r9)
            r8.m(r12, r0)
            goto L_0x0b77
        L_0x09f4:
            r22 = r10
            r20 = r11
            r21 = r15
            r16 = 0
            r9 = r2
            r11 = r4
            r15 = r5
            r0 = r23
            r1 = r24
            r2 = r11
            r3 = r22
            r4 = r13
            r5 = r14
            boolean r0 = r0.v(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0b77
            java.lang.Object r0 = r15.getObject(r7, r9)
            com.google.android.gms.internal.measurement.d4 r0 = (com.google.android.gms.internal.measurement.C7276d4) r0
            r8.I(r12, r0)
            goto L_0x0b77
        L_0x0a19:
            r22 = r10
            r20 = r11
            r21 = r15
            r16 = 0
            r9 = r2
            r11 = r4
            r15 = r5
            r0 = r23
            r1 = r24
            r2 = r11
            r3 = r22
            r4 = r13
            r5 = r14
            boolean r0 = r0.v(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0b77
            java.lang.Object r0 = r15.getObject(r7, r9)
            com.google.android.gms.internal.measurement.K5 r1 = r6.K(r11)
            r8.G(r12, r0, r1)
            goto L_0x0b77
        L_0x0a40:
            r22 = r10
            r20 = r11
            r21 = r15
            r16 = 0
            r9 = r2
            r11 = r4
            r15 = r5
            r0 = r23
            r1 = r24
            r2 = r11
            r3 = r22
            r4 = r13
            r5 = r14
            boolean r0 = r0.v(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0b77
            java.lang.Object r0 = r15.getObject(r7, r9)
            p(r12, r0, r8)
            goto L_0x0b77
        L_0x0a63:
            r22 = r10
            r20 = r11
            r21 = r15
            r16 = 0
            r9 = r2
            r11 = r4
            r15 = r5
            r0 = r23
            r1 = r24
            r2 = r11
            r3 = r22
            r4 = r13
            r5 = r14
            boolean r0 = r0.v(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0b77
            boolean r0 = com.google.android.gms.internal.measurement.C7287e6.F(r7, r9)
            r8.o(r12, r0)
            goto L_0x0b77
        L_0x0a86:
            r22 = r10
            r20 = r11
            r21 = r15
            r16 = 0
            r9 = r2
            r11 = r4
            r15 = r5
            r0 = r23
            r1 = r24
            r2 = r11
            r3 = r22
            r4 = r13
            r5 = r14
            boolean r0 = r0.v(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0b77
            int r0 = r15.getInt(r7, r9)
            r8.p(r12, r0)
            goto L_0x0b77
        L_0x0aa9:
            r22 = r10
            r20 = r11
            r21 = r15
            r16 = 0
            r9 = r2
            r11 = r4
            r15 = r5
            r0 = r23
            r1 = r24
            r2 = r11
            r3 = r22
            r4 = r13
            r5 = r14
            boolean r0 = r0.v(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0b77
            long r0 = r15.getLong(r7, r9)
            r8.j(r12, r0)
            goto L_0x0b77
        L_0x0acc:
            r22 = r10
            r20 = r11
            r21 = r15
            r16 = 0
            r9 = r2
            r11 = r4
            r15 = r5
            r0 = r23
            r1 = r24
            r2 = r11
            r3 = r22
            r4 = r13
            r5 = r14
            boolean r0 = r0.v(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0b77
            int r0 = r15.getInt(r7, r9)
            r8.e(r12, r0)
            goto L_0x0b77
        L_0x0aef:
            r22 = r10
            r20 = r11
            r21 = r15
            r16 = 0
            r9 = r2
            r11 = r4
            r15 = r5
            r0 = r23
            r1 = r24
            r2 = r11
            r3 = r22
            r4 = r13
            r5 = r14
            boolean r0 = r0.v(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0b77
            long r0 = r15.getLong(r7, r9)
            r8.r(r12, r0)
            goto L_0x0b77
        L_0x0b12:
            r22 = r10
            r20 = r11
            r21 = r15
            r16 = 0
            r9 = r2
            r11 = r4
            r15 = r5
            r0 = r23
            r1 = r24
            r2 = r11
            r3 = r22
            r4 = r13
            r5 = r14
            boolean r0 = r0.v(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0b77
            long r0 = r15.getLong(r7, r9)
            r8.a(r12, r0)
            goto L_0x0b77
        L_0x0b34:
            r22 = r10
            r20 = r11
            r21 = r15
            r16 = 0
            r9 = r2
            r11 = r4
            r15 = r5
            r0 = r23
            r1 = r24
            r2 = r11
            r3 = r22
            r4 = r13
            r5 = r14
            boolean r0 = r0.v(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0b77
            float r0 = com.google.android.gms.internal.measurement.C7287e6.n(r7, r9)
            r8.l(r12, r0)
            goto L_0x0b77
        L_0x0b56:
            r22 = r10
            r20 = r11
            r21 = r15
            r16 = 0
            r9 = r2
            r11 = r4
            r15 = r5
            r0 = r23
            r1 = r24
            r2 = r11
            r3 = r22
            r4 = r13
            r5 = r14
            boolean r0 = r0.v(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0b77
            double r0 = com.google.android.gms.internal.measurement.C7287e6.a(r7, r9)
            r8.k(r12, r0)
        L_0x0b77:
            int r4 = r11 + 3
            r2 = r13
            r5 = r15
            r12 = r16
            r13 = r18
            r14 = r19
            r1 = r20
            r15 = r21
            r0 = r22
            r9 = 267386880(0xff00000, float:2.3665827E-29)
            r11 = 1
            goto L_0x0554
        L_0x0b8c:
            r19 = r14
        L_0x0b8e:
            if (r1 == 0) goto L_0x0ba5
            com.google.android.gms.internal.measurement.z4<?> r0 = r6.f49131o
            r0.d(r8, r1)
            boolean r0 = r19.hasNext()
            if (r0 == 0) goto L_0x0ba3
            java.lang.Object r0 = r19.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            r1 = r0
            goto L_0x0b8e
        L_0x0ba3:
            r1 = 0
            goto L_0x0b8e
        L_0x0ba5:
            com.google.android.gms.internal.measurement.Z5<?, ?> r0 = r6.f49130n
            q(r0, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C7438w5.d(java.lang.Object, com.google.android.gms.internal.measurement.r6):void");
    }

    public final void e(T t10, byte[] bArr, int i10, int i11, Y3 y32) {
        i(t10, bArr, i10, i11, 0, y32);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: com.google.android.gms.internal.measurement.c6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v18, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v19, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v21, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v26, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v29, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v11, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v19, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v30, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v20, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v16, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v21, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v20, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v22, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v21, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v23, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v22, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v24, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v26, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v25, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v30, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v26, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v31, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v32, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v27, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v31, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v28, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v34, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v35, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v36, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v23, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v30, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v34, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v32, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v14, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v26, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v25, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v35, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v26, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v15, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v36, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v35, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v16, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v29, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v27, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v37, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v28, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v17, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v42, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v18, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v32, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v29, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v39, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v44, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v31, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v19, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v45, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v46, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v40, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v33, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v20, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v41, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v47, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v21, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v37, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v34, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v42, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v51, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v52, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v45, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v53, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v12, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v40, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v19, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v52, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v17, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v57, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v15, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v43, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v21, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v53, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v22, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v16, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v44, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v57, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v58, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v59, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v60, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v60, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v62, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v64, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v23, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v17, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v45, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v68, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v69, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v71, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v72, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v63, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v74, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v76, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v24, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v18, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v46, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v78, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v79, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v80, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v82, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v84, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v43, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v19, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v85, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v47, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v25, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v86, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v33, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v45, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v20, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v87, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v47, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v38, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v29, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v39, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v40, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v21, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v49, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v46, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v90, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v48, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v47, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v22, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v92, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v52, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v46, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v34, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v47, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v48, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v48, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v23, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v95, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v50, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v51, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v52, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v54, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v55, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v24, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v49, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v97, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v49, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v49, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v50, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v25, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v98, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v59, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v60, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v61, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v62, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v35, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v63, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v64, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v65, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v66, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v67, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v56, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v68, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v69, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v26, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v70, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v51, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v105, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v52, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v57, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v106, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v58, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v27, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v53, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v52, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v59, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v109, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v74, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v28, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v55, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v60, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v61, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v29, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v56, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v114, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v115, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v120, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v30, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v57, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v62, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v121, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v58, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v31, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v63, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v123, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v32, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v64, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v124, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v65, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v33, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v66, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v34, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v28, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v59, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v67, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v35, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v90, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v91, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v92, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v94, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v95, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v36, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v60, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v71, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v61, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v29, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v96, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v126, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v72, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v37, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v73, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v38, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v62, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v98, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v99, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v63, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v64, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v100, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v24, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v102, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v39, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v65, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v77, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v128, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v31, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v104, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v129, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v78, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v40, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v66, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v79, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v32, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v106, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v80, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v41, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v68, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v69, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v81, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v131, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v46, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v44, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v47, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v45, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v132, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v73, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v136, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v110, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v75, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v76, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v77, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v50, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v143, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v49, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v79, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v144, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v80, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v145, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v81, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v82, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v148, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v83, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v84, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v151, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v85, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v154, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v155, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v157, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v158, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v86, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v57, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v161, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v87, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v163, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v88, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v164, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v60, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v51, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v89, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v61, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v165, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v52, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v91, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v166, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v62, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v92, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v167, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v93, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v94, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v66, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v54, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v171, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v174, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v56, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v68, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v98, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v104, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v138, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v175, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v105, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v139, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v177, resolved type: byte} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x02f2, code lost:
        r0 = r37;
        r2 = r11;
        r1 = r12;
        r30 = r13;
        r11 = r20;
        r12 = r7;
        r20 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x03a0, code lost:
        r8 = r2;
        r15 = r11;
        r2 = r12;
        r12 = r23;
        r7 = r30;
        r11 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x03c7, code lost:
        r11 = r0;
        r0 = r1;
        r8 = r2;
        r10 = r3;
        r2 = r4;
        r15 = r5;
        r12 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x03cf, code lost:
        r7 = r30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x042b, code lost:
        r11 = r0;
        r0 = r1;
        r8 = r2;
        r10 = r3;
        r2 = r4;
        r15 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0439, code lost:
        r7 = r30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x04d9, code lost:
        r31 = r10;
        r10 = r7;
        r7 = r31;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x054d, code lost:
        r2 = r5;
        r31 = r10;
        r10 = r7;
        r7 = r31;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x057a, code lost:
        r12 = r0;
        r11 = r1;
        r8 = r3;
        r10 = r4;
        r0 = r7;
        r7 = r2;
        r2 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x0645, code lost:
        r12 = r0;
        r11 = r1;
        r7 = r2;
        r8 = r3;
        r10 = r4;
        r2 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x0713, code lost:
        r12 = r0;
        r7 = r2;
        r8 = r3;
        r10 = r4;
        r2 = r5;
        r0 = r11;
        r11 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00ad, code lost:
        r13 = r2;
        r20 = r10;
        r12 = r19;
        r19 = -1;
        r7 = r38;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:375:0x08b6, code lost:
        r0 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:376:0x08b7, code lost:
        if (r0 != r15) goto L_0x08c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:377:0x08b9, code lost:
        r15 = r33;
        r30 = r7;
        r1 = r12;
        r12 = r11;
        r11 = r20;
        r20 = r2;
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:378:0x08c6, code lost:
        r15 = r33;
        r4 = r8;
        r5 = r11;
        r9 = r12;
        r1 = -1;
        r12 = r28;
        r13 = r29;
        r8 = r2;
        r2 = r7;
        r7 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:405:0x09b8, code lost:
        r1 = r10;
        r23 = r11;
        r13 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:406:0x09bd, code lost:
        r11 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:408:0x09c2, code lost:
        r13 = r2;
        r1 = r10;
        r23 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:409:0x09c6, code lost:
        r11 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:413:0x09ef, code lost:
        r1 = r10;
        r23 = r11;
        r13 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:423:0x0a36, code lost:
        r1 = r10;
        r23 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0148, code lost:
        r1 = r28 | r27;
        r4 = r36;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:444:0x0acf, code lost:
        r0 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x014c, code lost:
        r5 = r7;
        r9 = r12;
        r2 = r13;
        r7 = r20;
        r13 = r29;
        r12 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:471:0x0bab, code lost:
        r0 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:472:0x0bac, code lost:
        if (r0 != r1) goto L_0x0c2c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:473:0x0bae, code lost:
        r2 = r0;
        r20 = r13;
        r1 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:484:0x0c2c, code lost:
        r21 = r11;
        r11 = r37;
        r14 = r34;
        r4 = r36;
        r5 = r38;
        r8 = r13;
        r9 = r23;
        r1 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0253, code lost:
        r0 = r11 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0273, code lost:
        r0 = r11 + 8;
     */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=int, for r0v12, types: [int, byte] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x0513  */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x05b8  */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x0608  */
    /* JADX WARNING: Removed duplicated region for block: B:481:0x0bd4  */
    /* JADX WARNING: Removed duplicated region for block: B:483:0x0c01  */
    /* JADX WARNING: Removed duplicated region for block: B:544:0x0541 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:548:0x057a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:552:0x057a A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int i(T r33, byte[] r34, int r35, int r36, int r37, com.google.android.gms.internal.measurement.Y3 r38) {
        /*
            r32 = this;
            r6 = r32
            r15 = r33
            r14 = r34
            r4 = r36
            r5 = r38
            N(r33)
            sun.misc.Unsafe r2 = f49116r
            r16 = 0
            r1 = -1
            r0 = r35
            r7 = r1
            r8 = r16
            r9 = r8
            r12 = r9
            r13 = 1048575(0xfffff, float:1.469367E-39)
        L_0x001c:
            r17 = 0
            if (r0 >= r4) goto L_0x0c3f
            int r9 = r0 + 1
            byte r0 = r14[r0]
            if (r0 >= 0) goto L_0x002f
            int r0 = com.google.android.gms.internal.measurement.Z3.f(r0, r14, r9, r5)
            int r9 = r5.f48829a
            r11 = r0
            r0 = r9
            goto L_0x0030
        L_0x002f:
            r11 = r9
        L_0x0030:
            int r10 = r0 >>> 3
            r9 = r0 & 7
            r3 = 3
            if (r10 <= r7) goto L_0x0048
            int r8 = r8 / r3
            int r7 = r6.f49119c
            if (r10 < r7) goto L_0x0045
            int r7 = r6.f49120d
            if (r10 > r7) goto L_0x0045
            int r7 = r6.h(r10, r8)
            goto L_0x0046
        L_0x0045:
            r7 = r1
        L_0x0046:
            r8 = r7
            goto L_0x004d
        L_0x0048:
            int r7 = r6.g(r10)
            goto L_0x0046
        L_0x004d:
            if (r8 != r1) goto L_0x0061
            r19 = r1
            r30 = r2
            r2 = r11
            r28 = r12
            r29 = r13
            r20 = r16
            r1 = r0
            r12 = r5
            r11 = r10
        L_0x005d:
            r0 = r37
            goto L_0x0bb5
        L_0x0061:
            int[] r7 = r6.f49117a
            int r19 = r8 + 1
            r1 = r7[r19]
            r19 = 267386880(0xff00000, float:2.3665827E-29)
            r19 = r1 & r19
            int r3 = r19 >>> 20
            r19 = r0
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r1 & r18
            r21 = r1
            long r0 = (long) r0
            r22 = r0
            r0 = 17
            r24 = 0
            java.lang.String r1 = ""
            if (r3 > r0) goto L_0x02ff
            int r0 = r8 + 2
            r0 = r7[r0]
            int r7 = r0 >>> 20
            r26 = 1
            int r27 = r26 << r7
            r7 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r7
            if (r0 == r13) goto L_0x00a6
            if (r13 == r7) goto L_0x0097
            long r4 = (long) r13
            r2.putInt(r15, r4, r12)
        L_0x0097:
            if (r0 != r7) goto L_0x009c
            r4 = r16
            goto L_0x00a1
        L_0x009c:
            long r4 = (long) r0
            int r4 = r2.getInt(r15, r4)
        L_0x00a1:
            r29 = r0
            r28 = r4
            goto L_0x00aa
        L_0x00a6:
            r28 = r12
            r29 = r13
        L_0x00aa:
            switch(r3) {
                case 0: goto L_0x02db;
                case 1: goto L_0x02c3;
                case 2: goto L_0x0290;
                case 3: goto L_0x0290;
                case 4: goto L_0x0277;
                case 5: goto L_0x0257;
                case 6: goto L_0x023d;
                case 7: goto L_0x021c;
                case 8: goto L_0x01df;
                case 9: goto L_0x01b7;
                case 10: goto L_0x019e;
                case 11: goto L_0x0277;
                case 12: goto L_0x0158;
                case 13: goto L_0x023d;
                case 14: goto L_0x0257;
                case 15: goto L_0x012d;
                case 16: goto L_0x00eb;
                case 17: goto L_0x00b9;
                default: goto L_0x00ad;
            }
        L_0x00ad:
            r13 = r2
            r20 = r10
            r12 = r19
            r19 = -1
            r10 = r7
            r7 = r38
            goto L_0x02f2
        L_0x00b9:
            r0 = 3
            if (r9 != r0) goto L_0x00ad
            java.lang.Object r0 = r6.l(r15, r8)
            int r1 = r10 << 3
            r12 = r1 | 4
            com.google.android.gms.internal.measurement.K5 r1 = r6.K(r8)
            r3 = r7
            r7 = r0
            r4 = r8
            r8 = r1
            r9 = r34
            r5 = r10
            r10 = r11
            r11 = r36
            r13 = r38
            int r1 = com.google.android.gms.internal.measurement.Z3.j(r7, r8, r9, r10, r11, r12, r13)
            r6.t(r15, r4, r0)
            r12 = r28 | r27
            r0 = r1
            r8 = r4
            r7 = r5
            r9 = r19
            r13 = r29
            r1 = -1
            r4 = r36
            r5 = r38
            goto L_0x001c
        L_0x00eb:
            r3 = r7
            r4 = r8
            r5 = r10
            r7 = r38
            if (r9 != 0) goto L_0x0122
            int r8 = com.google.android.gms.internal.measurement.Z3.t(r14, r11, r7)
            long r0 = r7.f48830b
            long r9 = com.google.android.gms.internal.measurement.C7390q4.b(r0)
            r12 = r19
            r0 = r2
            r19 = -1
            r1 = r33
            r13 = r2
            r11 = r3
            r2 = r22
            r20 = r5
            r35 = r8
            r8 = r4
            r4 = r9
            r0.putLong(r1, r2, r4)
            r0 = r28 | r27
            r4 = r36
            r5 = r7
            r9 = r12
            r2 = r13
            r1 = r19
            r7 = r20
            r13 = r29
            r12 = r0
            r0 = r35
            goto L_0x001c
        L_0x0122:
            r13 = r2
            r10 = r3
            r8 = r4
            r20 = r5
            r12 = r19
            r19 = -1
            goto L_0x02f2
        L_0x012d:
            r13 = r2
            r20 = r10
            r12 = r19
            r19 = -1
            r10 = r7
            r7 = r38
            if (r9 != 0) goto L_0x02f2
            int r0 = com.google.android.gms.internal.measurement.Z3.s(r14, r11, r7)
            int r1 = r7.f48829a
            int r1 = com.google.android.gms.internal.measurement.C7390q4.e(r1)
            r4 = r22
            r13.putInt(r15, r4, r1)
        L_0x0148:
            r1 = r28 | r27
            r4 = r36
        L_0x014c:
            r5 = r7
            r9 = r12
            r2 = r13
            r7 = r20
            r13 = r29
            r12 = r1
        L_0x0154:
            r1 = r19
            goto L_0x001c
        L_0x0158:
            r13 = r2
            r20 = r10
            r12 = r19
            r4 = r22
            r19 = -1
            r10 = r7
            r7 = r38
            if (r9 != 0) goto L_0x02f2
            int r0 = com.google.android.gms.internal.measurement.Z3.s(r14, r11, r7)
            int r1 = r7.f48829a
            com.google.android.gms.internal.measurement.Q4 r2 = r6.J(r8)
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r21 & r3
            if (r3 == 0) goto L_0x019a
            if (r2 == 0) goto L_0x019a
            boolean r2 = r2.c(r1)
            if (r2 == 0) goto L_0x017f
            goto L_0x019a
        L_0x017f:
            com.google.android.gms.internal.measurement.c6 r2 = E(r33)
            long r3 = (long) r1
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r2.e(r12, r1)
            r4 = r36
            r5 = r7
            r9 = r12
            r2 = r13
            r1 = r19
            r7 = r20
        L_0x0194:
            r12 = r28
            r13 = r29
            goto L_0x001c
        L_0x019a:
            r13.putInt(r15, r4, r1)
            goto L_0x0148
        L_0x019e:
            r13 = r2
            r20 = r10
            r12 = r19
            r4 = r22
            r0 = 2
            r19 = -1
            r10 = r7
            r7 = r38
            if (r9 != r0) goto L_0x02f2
            int r0 = com.google.android.gms.internal.measurement.Z3.l(r14, r11, r7)
            java.lang.Object r1 = r7.f48831c
            r13.putObject(r15, r4, r1)
            goto L_0x0148
        L_0x01b7:
            r13 = r2
            r20 = r10
            r12 = r19
            r0 = 2
            r19 = -1
            r10 = r7
            r7 = r38
            if (r9 != r0) goto L_0x02f2
            java.lang.Object r9 = r6.l(r15, r8)
            com.google.android.gms.internal.measurement.K5 r1 = r6.K(r8)
            r0 = r9
            r2 = r34
            r3 = r11
            r4 = r36
            r5 = r38
            int r0 = com.google.android.gms.internal.measurement.Z3.k(r0, r1, r2, r3, r4, r5)
            r6.t(r15, r8, r9)
            r1 = r28 | r27
            goto L_0x014c
        L_0x01df:
            r13 = r2
            r20 = r10
            r12 = r19
            r4 = r22
            r0 = 2
            r19 = -1
            r10 = r7
            r7 = r38
            if (r9 != r0) goto L_0x02f2
            boolean r0 = O(r21)
            if (r0 == 0) goto L_0x01f9
            int r0 = com.google.android.gms.internal.measurement.Z3.q(r14, r11, r7)
            goto L_0x0210
        L_0x01f9:
            int r0 = com.google.android.gms.internal.measurement.Z3.s(r14, r11, r7)
            int r2 = r7.f48829a
            if (r2 < 0) goto L_0x0217
            if (r2 != 0) goto L_0x0206
            r7.f48831c = r1
            goto L_0x0210
        L_0x0206:
            java.lang.String r1 = new java.lang.String
            java.nio.charset.Charset r3 = com.google.android.gms.internal.measurement.O4.f48769a
            r1.<init>(r14, r0, r2, r3)
            r7.f48831c = r1
            int r0 = r0 + r2
        L_0x0210:
            java.lang.Object r1 = r7.f48831c
            r13.putObject(r15, r4, r1)
            goto L_0x0148
        L_0x0217:
            com.google.android.gms.internal.measurement.U4 r0 = com.google.android.gms.internal.measurement.U4.d()
            throw r0
        L_0x021c:
            r13 = r2
            r20 = r10
            r12 = r19
            r4 = r22
            r19 = -1
            r10 = r7
            r7 = r38
            if (r9 != 0) goto L_0x02f2
            int r0 = com.google.android.gms.internal.measurement.Z3.t(r14, r11, r7)
            long r1 = r7.f48830b
            int r1 = (r1 > r24 ? 1 : (r1 == r24 ? 0 : -1))
            if (r1 == 0) goto L_0x0236
            r1 = 1
            goto L_0x0238
        L_0x0236:
            r1 = r16
        L_0x0238:
            com.google.android.gms.internal.measurement.C7287e6.v(r15, r4, r1)
            goto L_0x0148
        L_0x023d:
            r13 = r2
            r20 = r10
            r12 = r19
            r4 = r22
            r0 = 5
            r19 = -1
            r10 = r7
            r7 = r38
            if (r9 != r0) goto L_0x02f2
            int r0 = com.google.android.gms.internal.measurement.Z3.r(r14, r11)
            r13.putInt(r15, r4, r0)
        L_0x0253:
            int r0 = r11 + 4
            goto L_0x0148
        L_0x0257:
            r13 = r2
            r20 = r10
            r12 = r19
            r4 = r22
            r0 = 1
            r19 = -1
            r10 = r7
            r7 = r38
            if (r9 != r0) goto L_0x02f2
            long r17 = com.google.android.gms.internal.measurement.Z3.u(r14, r11)
            r0 = r13
            r1 = r33
            r2 = r4
            r4 = r17
            r0.putLong(r1, r2, r4)
        L_0x0273:
            int r0 = r11 + 8
            goto L_0x0148
        L_0x0277:
            r13 = r2
            r20 = r10
            r12 = r19
            r4 = r22
            r19 = -1
            r10 = r7
            r7 = r38
            if (r9 != 0) goto L_0x02f2
            int r0 = com.google.android.gms.internal.measurement.Z3.s(r14, r11, r7)
            int r1 = r7.f48829a
            r13.putInt(r15, r4, r1)
            goto L_0x0148
        L_0x0290:
            r13 = r2
            r20 = r10
            r12 = r19
            r4 = r22
            r19 = -1
            r10 = r7
            r7 = r38
            if (r9 != 0) goto L_0x02f2
            int r9 = com.google.android.gms.internal.measurement.Z3.t(r14, r11, r7)
            long r2 = r7.f48830b
            r0 = r13
            r1 = r33
            r17 = r2
            r2 = r4
            r4 = r17
            r0.putLong(r1, r2, r4)
            r0 = r28 | r27
            r4 = r36
            r5 = r7
            r2 = r13
            r1 = r19
            r7 = r20
            r13 = r29
            r31 = r12
            r12 = r0
            r0 = r9
            r9 = r31
            goto L_0x001c
        L_0x02c3:
            r13 = r2
            r20 = r10
            r12 = r19
            r4 = r22
            r0 = 5
            r19 = -1
            r10 = r7
            r7 = r38
            if (r9 != r0) goto L_0x02f2
            float r0 = com.google.android.gms.internal.measurement.Z3.o(r14, r11)
            com.google.android.gms.internal.measurement.C7287e6.g(r15, r4, r0)
            goto L_0x0253
        L_0x02db:
            r13 = r2
            r20 = r10
            r12 = r19
            r4 = r22
            r0 = 1
            r19 = -1
            r10 = r7
            r7 = r38
            if (r9 != r0) goto L_0x02f2
            double r0 = com.google.android.gms.internal.measurement.Z3.a(r14, r11)
            com.google.android.gms.internal.measurement.C7287e6.f(r15, r4, r0)
            goto L_0x0273
        L_0x02f2:
            r0 = r37
            r2 = r11
            r1 = r12
            r30 = r13
            r11 = r20
            r12 = r7
            r20 = r8
            goto L_0x0bb5
        L_0x02ff:
            r0 = r5
            r20 = r10
            r4 = r22
            r22 = r1
            r1 = r2
            r23 = r19
            r19 = -1
            r2 = r36
            r10 = 27
            if (r3 != r10) goto L_0x0369
            r10 = 2
            if (r9 != r10) goto L_0x035b
            java.lang.Object r3 = r1.getObject(r15, r4)
            com.google.android.gms.internal.measurement.R4 r3 = (com.google.android.gms.internal.measurement.R4) r3
            boolean r7 = r3.zzc()
            if (r7 != 0) goto L_0x0332
            int r7 = r3.size()
            if (r7 != 0) goto L_0x0329
            r7 = 10
            goto L_0x032b
        L_0x0329:
            int r7 = r7 << 1
        L_0x032b:
            com.google.android.gms.internal.measurement.R4 r3 = r3.c(r7)
            r1.putObject(r15, r4, r3)
        L_0x0332:
            com.google.android.gms.internal.measurement.K5 r7 = r6.K(r8)
            r4 = r8
            r8 = r23
            r9 = r34
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r10 = r11
            r11 = r36
            r28 = r12
            r12 = r3
            r29 = r13
            r13 = r38
            int r3 = com.google.android.gms.internal.measurement.Z3.p(r7, r8, r9, r10, r11, r12, r13)
            r5 = r0
            r0 = r3
            r8 = r4
            r7 = r20
            r9 = r23
            r12 = r28
            r13 = r29
            r4 = r2
            r2 = r1
            goto L_0x0154
        L_0x035b:
            r28 = r12
            r29 = r13
            r2 = r8
            r13 = r11
            r12 = r23
            r11 = r0
            r0 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x092c
        L_0x0369:
            r28 = r12
            r29 = r13
            r13 = 1048575(0xfffff, float:1.469367E-39)
            r12 = r8
            r8 = 49
            if (r3 > r8) goto L_0x08d7
            r8 = r21
            long r7 = (long) r8
            sun.misc.Unsafe r10 = f49116r
            java.lang.Object r21 = r10.getObject(r15, r4)
            r13 = r21
            com.google.android.gms.internal.measurement.R4 r13 = (com.google.android.gms.internal.measurement.R4) r13
            boolean r21 = r13.zzc()
            if (r21 != 0) goto L_0x039b
            int r21 = r13.size()
            r30 = r1
            r26 = 1
            int r1 = r21 << 1
            com.google.android.gms.internal.measurement.R4 r1 = r13.c(r1)
            r10.putObject(r15, r4, r1)
            r13 = r1
            goto L_0x039d
        L_0x039b:
            r30 = r1
        L_0x039d:
            switch(r3) {
                case 18: goto L_0x0856;
                case 19: goto L_0x07f5;
                case 20: goto L_0x07a8;
                case 21: goto L_0x07a8;
                case 22: goto L_0x077d;
                case 23: goto L_0x071c;
                case 24: goto L_0x06b2;
                case 25: goto L_0x064d;
                case 26: goto L_0x0583;
                case 27: goto L_0x0555;
                case 28: goto L_0x04e7;
                case 29: goto L_0x077d;
                case 30: goto L_0x0497;
                case 31: goto L_0x06b2;
                case 32: goto L_0x071c;
                case 33: goto L_0x043d;
                case 34: goto L_0x03d3;
                case 35: goto L_0x0856;
                case 36: goto L_0x07f5;
                case 37: goto L_0x07a8;
                case 38: goto L_0x07a8;
                case 39: goto L_0x077d;
                case 40: goto L_0x071c;
                case 41: goto L_0x06b2;
                case 42: goto L_0x064d;
                case 43: goto L_0x077d;
                case 44: goto L_0x0497;
                case 45: goto L_0x06b2;
                case 46: goto L_0x071c;
                case 47: goto L_0x043d;
                case 48: goto L_0x03d3;
                case 49: goto L_0x03ad;
                default: goto L_0x03a0;
            }
        L_0x03a0:
            r8 = r2
            r15 = r11
            r2 = r12
            r12 = r23
            r7 = r30
            r10 = 1048575(0xfffff, float:1.469367E-39)
            r11 = r0
            goto L_0x08b6
        L_0x03ad:
            r1 = 3
            if (r9 != r1) goto L_0x03a0
            com.google.android.gms.internal.measurement.K5 r7 = r6.K(r12)
            r8 = r23
            r9 = r34
            r10 = r11
            r5 = r11
            r11 = r36
            r4 = r12
            r12 = r13
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r13 = r38
            int r1 = com.google.android.gms.internal.measurement.Z3.g(r7, r8, r9, r10, r11, r12, r13)
        L_0x03c7:
            r11 = r0
            r0 = r1
            r8 = r2
            r10 = r3
            r2 = r4
            r15 = r5
            r12 = r23
        L_0x03cf:
            r7 = r30
            goto L_0x08b7
        L_0x03d3:
            r5 = r11
            r4 = r12
            r1 = 2
            r3 = 1048575(0xfffff, float:1.469367E-39)
            if (r9 != r1) goto L_0x03fc
            com.google.android.gms.internal.measurement.h5 r13 = (com.google.android.gms.internal.measurement.C7313h5) r13
            int r1 = com.google.android.gms.internal.measurement.Z3.s(r14, r5, r0)
            int r7 = r0.f48829a
            int r7 = r7 + r1
        L_0x03e4:
            if (r1 >= r7) goto L_0x03f4
            int r1 = com.google.android.gms.internal.measurement.Z3.t(r14, r1, r0)
            long r8 = r0.f48830b
            long r8 = com.google.android.gms.internal.measurement.C7390q4.b(r8)
            r13.i(r8)
            goto L_0x03e4
        L_0x03f4:
            if (r1 != r7) goto L_0x03f7
            goto L_0x03c7
        L_0x03f7:
            com.google.android.gms.internal.measurement.U4 r0 = com.google.android.gms.internal.measurement.U4.g()
            throw r0
        L_0x03fc:
            if (r9 != 0) goto L_0x0432
            com.google.android.gms.internal.measurement.h5 r13 = (com.google.android.gms.internal.measurement.C7313h5) r13
            int r1 = com.google.android.gms.internal.measurement.Z3.t(r14, r5, r0)
            long r7 = r0.f48830b
            long r7 = com.google.android.gms.internal.measurement.C7390q4.b(r7)
            r13.i(r7)
        L_0x040d:
            if (r1 >= r2) goto L_0x0429
            int r7 = com.google.android.gms.internal.measurement.Z3.s(r14, r1, r0)
            int r8 = r0.f48829a
            r12 = r23
            if (r12 != r8) goto L_0x042b
            int r1 = com.google.android.gms.internal.measurement.Z3.t(r14, r7, r0)
            long r7 = r0.f48830b
            long r7 = com.google.android.gms.internal.measurement.C7390q4.b(r7)
            r13.i(r7)
            r23 = r12
            goto L_0x040d
        L_0x0429:
            r12 = r23
        L_0x042b:
            r11 = r0
            r0 = r1
            r8 = r2
            r10 = r3
            r2 = r4
            r15 = r5
            goto L_0x03cf
        L_0x0432:
            r11 = r0
            r8 = r2
            r10 = r3
            r2 = r4
            r15 = r5
            r12 = r23
        L_0x0439:
            r7 = r30
            goto L_0x08b6
        L_0x043d:
            r5 = r11
            r4 = r12
            r12 = r23
            r1 = 2
            r3 = 1048575(0xfffff, float:1.469367E-39)
            if (r9 != r1) goto L_0x0468
            com.google.android.gms.internal.measurement.M4 r13 = (com.google.android.gms.internal.measurement.M4) r13
            int r1 = com.google.android.gms.internal.measurement.Z3.s(r14, r5, r0)
            int r7 = r0.f48829a
            int r7 = r7 + r1
        L_0x0450:
            if (r1 >= r7) goto L_0x0460
            int r1 = com.google.android.gms.internal.measurement.Z3.s(r14, r1, r0)
            int r8 = r0.f48829a
            int r8 = com.google.android.gms.internal.measurement.C7390q4.e(r8)
            r13.k(r8)
            goto L_0x0450
        L_0x0460:
            if (r1 != r7) goto L_0x0463
            goto L_0x042b
        L_0x0463:
            com.google.android.gms.internal.measurement.U4 r0 = com.google.android.gms.internal.measurement.U4.g()
            throw r0
        L_0x0468:
            if (r9 != 0) goto L_0x0491
            com.google.android.gms.internal.measurement.M4 r13 = (com.google.android.gms.internal.measurement.M4) r13
            int r1 = com.google.android.gms.internal.measurement.Z3.s(r14, r5, r0)
            int r7 = r0.f48829a
            int r7 = com.google.android.gms.internal.measurement.C7390q4.e(r7)
            r13.k(r7)
        L_0x0479:
            if (r1 >= r2) goto L_0x042b
            int r7 = com.google.android.gms.internal.measurement.Z3.s(r14, r1, r0)
            int r8 = r0.f48829a
            if (r12 != r8) goto L_0x042b
            int r1 = com.google.android.gms.internal.measurement.Z3.s(r14, r7, r0)
            int r7 = r0.f48829a
            int r7 = com.google.android.gms.internal.measurement.C7390q4.e(r7)
            r13.k(r7)
            goto L_0x0479
        L_0x0491:
            r11 = r0
            r8 = r2
            r10 = r3
            r2 = r4
            r15 = r5
            goto L_0x0439
        L_0x0497:
            r5 = r11
            r4 = r12
            r12 = r23
            r1 = 2
            r3 = 1048575(0xfffff, float:1.469367E-39)
            if (r9 != r1) goto L_0x04af
            int r1 = com.google.android.gms.internal.measurement.Z3.m(r14, r5, r13, r0)
            r11 = r0
            r18 = r1
            r8 = r2
            r7 = r3
            r9 = r4
            r15 = r5
            r10 = r30
            goto L_0x04c7
        L_0x04af:
            if (r9 != 0) goto L_0x04e0
            r11 = r0
            r0 = r12
            r10 = r30
            r1 = r34
            r8 = r2
            r2 = r5
            r7 = r3
            r3 = r36
            r9 = r4
            r4 = r13
            r15 = r5
            r5 = r38
            int r1 = com.google.android.gms.internal.measurement.Z3.c(r0, r1, r2, r3, r4, r5)
            r18 = r1
        L_0x04c7:
            com.google.android.gms.internal.measurement.Q4 r3 = r6.J(r9)
            r4 = 0
            com.google.android.gms.internal.measurement.Z5<?, ?> r5 = r6.f49130n
            r0 = r33
            r1 = r20
            r2 = r13
            com.google.android.gms.internal.measurement.L5.h(r0, r1, r2, r3, r4, r5)
            r2 = r9
            r0 = r18
        L_0x04d9:
            r31 = r10
            r10 = r7
            r7 = r31
            goto L_0x08b7
        L_0x04e0:
            r15 = r5
            r11 = r0
            r8 = r2
            r10 = r3
            r2 = r4
            goto L_0x0439
        L_0x04e7:
            r8 = r2
            r15 = r11
            r5 = r12
            r12 = r23
            r10 = r30
            r7 = 1048575(0xfffff, float:1.469367E-39)
            r11 = r0
            r0 = 2
            if (r9 != r0) goto L_0x054d
            int r0 = com.google.android.gms.internal.measurement.Z3.s(r14, r15, r11)
            int r1 = r11.f48829a
            if (r1 < 0) goto L_0x0548
            int r2 = r14.length
            int r2 = r2 - r0
            if (r1 > r2) goto L_0x0543
            if (r1 != 0) goto L_0x0509
            com.google.android.gms.internal.measurement.d4 r1 = com.google.android.gms.internal.measurement.C7276d4.f48892b
            r13.add(r1)
            goto L_0x0511
        L_0x0509:
            com.google.android.gms.internal.measurement.d4 r2 = com.google.android.gms.internal.measurement.C7276d4.r(r14, r0, r1)
            r13.add(r2)
        L_0x0510:
            int r0 = r0 + r1
        L_0x0511:
            if (r0 >= r8) goto L_0x0541
            int r1 = com.google.android.gms.internal.measurement.Z3.s(r14, r0, r11)
            int r2 = r11.f48829a
            if (r12 != r2) goto L_0x0541
            int r0 = com.google.android.gms.internal.measurement.Z3.s(r14, r1, r11)
            int r1 = r11.f48829a
            if (r1 < 0) goto L_0x053c
            int r2 = r14.length
            int r2 = r2 - r0
            if (r1 > r2) goto L_0x0537
            if (r1 != 0) goto L_0x052f
            com.google.android.gms.internal.measurement.d4 r1 = com.google.android.gms.internal.measurement.C7276d4.f48892b
            r13.add(r1)
            goto L_0x0511
        L_0x052f:
            com.google.android.gms.internal.measurement.d4 r2 = com.google.android.gms.internal.measurement.C7276d4.r(r14, r0, r1)
            r13.add(r2)
            goto L_0x0510
        L_0x0537:
            com.google.android.gms.internal.measurement.U4 r0 = com.google.android.gms.internal.measurement.U4.g()
            throw r0
        L_0x053c:
            com.google.android.gms.internal.measurement.U4 r0 = com.google.android.gms.internal.measurement.U4.d()
            throw r0
        L_0x0541:
            r2 = r5
            goto L_0x04d9
        L_0x0543:
            com.google.android.gms.internal.measurement.U4 r0 = com.google.android.gms.internal.measurement.U4.g()
            throw r0
        L_0x0548:
            com.google.android.gms.internal.measurement.U4 r0 = com.google.android.gms.internal.measurement.U4.d()
            throw r0
        L_0x054d:
            r2 = r5
            r31 = r10
            r10 = r7
            r7 = r31
            goto L_0x08b6
        L_0x0555:
            r8 = r2
            r15 = r11
            r5 = r12
            r12 = r23
            r10 = r30
            r7 = 1048575(0xfffff, float:1.469367E-39)
            r11 = r0
            r0 = 2
            if (r9 != r0) goto L_0x054d
            com.google.android.gms.internal.measurement.K5 r0 = r6.K(r5)
            r4 = r7
            r7 = r0
            r3 = r8
            r8 = r12
            r9 = r34
            r2 = r10
            r10 = r15
            r1 = r11
            r11 = r36
            r0 = r12
            r12 = r13
            r13 = r38
            int r7 = com.google.android.gms.internal.measurement.Z3.p(r7, r8, r9, r10, r11, r12, r13)
        L_0x057a:
            r12 = r0
            r11 = r1
            r8 = r3
            r10 = r4
            r0 = r7
            r7 = r2
            r2 = r5
            goto L_0x08b7
        L_0x0583:
            r1 = r0
            r3 = r2
            r15 = r11
            r5 = r12
            r0 = r23
            r2 = r30
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r10 = 2
            if (r9 != r10) goto L_0x0645
            r9 = 536870912(0x20000000, double:2.652494739E-315)
            long r7 = r7 & r9
            int r7 = (r7 > r24 ? 1 : (r7 == r24 ? 0 : -1))
            if (r7 != 0) goto L_0x05e3
            int r7 = com.google.android.gms.internal.measurement.Z3.s(r14, r15, r1)
            int r8 = r1.f48829a
            if (r8 < 0) goto L_0x05de
            if (r8 != 0) goto L_0x05a9
            r10 = r22
            r13.add(r10)
            goto L_0x05b6
        L_0x05a9:
            r10 = r22
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r11 = com.google.android.gms.internal.measurement.O4.f48769a
            r9.<init>(r14, r7, r8, r11)
            r13.add(r9)
        L_0x05b5:
            int r7 = r7 + r8
        L_0x05b6:
            if (r7 >= r3) goto L_0x057a
            int r8 = com.google.android.gms.internal.measurement.Z3.s(r14, r7, r1)
            int r9 = r1.f48829a
            if (r0 != r9) goto L_0x057a
            int r7 = com.google.android.gms.internal.measurement.Z3.s(r14, r8, r1)
            int r8 = r1.f48829a
            if (r8 < 0) goto L_0x05d9
            if (r8 != 0) goto L_0x05ce
            r13.add(r10)
            goto L_0x05b6
        L_0x05ce:
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r11 = com.google.android.gms.internal.measurement.O4.f48769a
            r9.<init>(r14, r7, r8, r11)
            r13.add(r9)
            goto L_0x05b5
        L_0x05d9:
            com.google.android.gms.internal.measurement.U4 r0 = com.google.android.gms.internal.measurement.U4.d()
            throw r0
        L_0x05de:
            com.google.android.gms.internal.measurement.U4 r0 = com.google.android.gms.internal.measurement.U4.d()
            throw r0
        L_0x05e3:
            r10 = r22
            int r7 = com.google.android.gms.internal.measurement.Z3.s(r14, r15, r1)
            int r8 = r1.f48829a
            if (r8 < 0) goto L_0x0640
            if (r8 != 0) goto L_0x05f3
            r13.add(r10)
            goto L_0x0606
        L_0x05f3:
            int r9 = r7 + r8
            boolean r11 = com.google.android.gms.internal.measurement.C7305g6.e(r14, r7, r9)
            if (r11 == 0) goto L_0x063b
            java.lang.String r11 = new java.lang.String
            java.nio.charset.Charset r12 = com.google.android.gms.internal.measurement.O4.f48769a
            r11.<init>(r14, r7, r8, r12)
            r13.add(r11)
        L_0x0605:
            r7 = r9
        L_0x0606:
            if (r7 >= r3) goto L_0x057a
            int r8 = com.google.android.gms.internal.measurement.Z3.s(r14, r7, r1)
            int r9 = r1.f48829a
            if (r0 != r9) goto L_0x057a
            int r7 = com.google.android.gms.internal.measurement.Z3.s(r14, r8, r1)
            int r8 = r1.f48829a
            if (r8 < 0) goto L_0x0636
            if (r8 != 0) goto L_0x061e
            r13.add(r10)
            goto L_0x0606
        L_0x061e:
            int r9 = r7 + r8
            boolean r11 = com.google.android.gms.internal.measurement.C7305g6.e(r14, r7, r9)
            if (r11 == 0) goto L_0x0631
            java.lang.String r11 = new java.lang.String
            java.nio.charset.Charset r12 = com.google.android.gms.internal.measurement.O4.f48769a
            r11.<init>(r14, r7, r8, r12)
            r13.add(r11)
            goto L_0x0605
        L_0x0631:
            com.google.android.gms.internal.measurement.U4 r0 = com.google.android.gms.internal.measurement.U4.c()
            throw r0
        L_0x0636:
            com.google.android.gms.internal.measurement.U4 r0 = com.google.android.gms.internal.measurement.U4.d()
            throw r0
        L_0x063b:
            com.google.android.gms.internal.measurement.U4 r0 = com.google.android.gms.internal.measurement.U4.c()
            throw r0
        L_0x0640:
            com.google.android.gms.internal.measurement.U4 r0 = com.google.android.gms.internal.measurement.U4.d()
            throw r0
        L_0x0645:
            r12 = r0
            r11 = r1
            r7 = r2
            r8 = r3
            r10 = r4
            r2 = r5
            goto L_0x08b6
        L_0x064d:
            r1 = r0
            r3 = r2
            r15 = r11
            r5 = r12
            r0 = r23
            r2 = r30
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r7 = 2
            if (r9 != r7) goto L_0x0681
            com.google.android.gms.internal.measurement.b4 r13 = (com.google.android.gms.internal.measurement.C7258b4) r13
            int r7 = com.google.android.gms.internal.measurement.Z3.s(r14, r15, r1)
            int r8 = r1.f48829a
            int r8 = r8 + r7
        L_0x0664:
            if (r7 >= r8) goto L_0x0678
            int r7 = com.google.android.gms.internal.measurement.Z3.t(r14, r7, r1)
            long r9 = r1.f48830b
            int r9 = (r9 > r24 ? 1 : (r9 == r24 ? 0 : -1))
            if (r9 == 0) goto L_0x0672
            r9 = 1
            goto L_0x0674
        L_0x0672:
            r9 = r16
        L_0x0674:
            r13.i(r9)
            goto L_0x0664
        L_0x0678:
            if (r7 != r8) goto L_0x067c
            goto L_0x057a
        L_0x067c:
            com.google.android.gms.internal.measurement.U4 r0 = com.google.android.gms.internal.measurement.U4.g()
            throw r0
        L_0x0681:
            if (r9 != 0) goto L_0x0645
            com.google.android.gms.internal.measurement.b4 r13 = (com.google.android.gms.internal.measurement.C7258b4) r13
            int r7 = com.google.android.gms.internal.measurement.Z3.t(r14, r15, r1)
            long r8 = r1.f48830b
            int r8 = (r8 > r24 ? 1 : (r8 == r24 ? 0 : -1))
            if (r8 == 0) goto L_0x0691
            r8 = 1
            goto L_0x0693
        L_0x0691:
            r8 = r16
        L_0x0693:
            r13.i(r8)
        L_0x0696:
            if (r7 >= r3) goto L_0x057a
            int r8 = com.google.android.gms.internal.measurement.Z3.s(r14, r7, r1)
            int r9 = r1.f48829a
            if (r0 != r9) goto L_0x057a
            int r7 = com.google.android.gms.internal.measurement.Z3.t(r14, r8, r1)
            long r8 = r1.f48830b
            int r8 = (r8 > r24 ? 1 : (r8 == r24 ? 0 : -1))
            if (r8 == 0) goto L_0x06ac
            r8 = 1
            goto L_0x06ae
        L_0x06ac:
            r8 = r16
        L_0x06ae:
            r13.i(r8)
            goto L_0x0696
        L_0x06b2:
            r1 = r0
            r3 = r2
            r15 = r11
            r5 = r12
            r0 = r23
            r2 = r30
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r7 = 2
            if (r9 != r7) goto L_0x06f1
            com.google.android.gms.internal.measurement.M4 r13 = (com.google.android.gms.internal.measurement.M4) r13
            int r7 = com.google.android.gms.internal.measurement.Z3.s(r14, r15, r1)
            int r8 = r1.f48829a
            int r9 = r7 + r8
            int r10 = r14.length
            if (r9 > r10) goto L_0x06ec
            int r10 = r13.size()
            int r8 = r8 / 4
            int r10 = r10 + r8
            r13.m(r10)
        L_0x06d7:
            if (r7 >= r9) goto L_0x06e3
            int r8 = com.google.android.gms.internal.measurement.Z3.r(r14, r7)
            r13.k(r8)
            int r7 = r7 + 4
            goto L_0x06d7
        L_0x06e3:
            if (r7 != r9) goto L_0x06e7
            goto L_0x057a
        L_0x06e7:
            com.google.android.gms.internal.measurement.U4 r0 = com.google.android.gms.internal.measurement.U4.g()
            throw r0
        L_0x06ec:
            com.google.android.gms.internal.measurement.U4 r0 = com.google.android.gms.internal.measurement.U4.g()
            throw r0
        L_0x06f1:
            r7 = 5
            if (r9 != r7) goto L_0x0645
            com.google.android.gms.internal.measurement.M4 r13 = (com.google.android.gms.internal.measurement.M4) r13
            int r7 = com.google.android.gms.internal.measurement.Z3.r(r14, r15)
            r13.k(r7)
            int r11 = r15 + 4
        L_0x06ff:
            if (r11 >= r3) goto L_0x0713
            int r7 = com.google.android.gms.internal.measurement.Z3.s(r14, r11, r1)
            int r8 = r1.f48829a
            if (r0 != r8) goto L_0x0713
            int r8 = com.google.android.gms.internal.measurement.Z3.r(r14, r7)
            r13.k(r8)
            int r11 = r7 + 4
            goto L_0x06ff
        L_0x0713:
            r12 = r0
            r7 = r2
            r8 = r3
            r10 = r4
            r2 = r5
            r0 = r11
            r11 = r1
            goto L_0x08b7
        L_0x071c:
            r1 = r0
            r3 = r2
            r15 = r11
            r5 = r12
            r0 = r23
            r2 = r30
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r7 = 2
            if (r9 != r7) goto L_0x075b
            com.google.android.gms.internal.measurement.h5 r13 = (com.google.android.gms.internal.measurement.C7313h5) r13
            int r7 = com.google.android.gms.internal.measurement.Z3.s(r14, r15, r1)
            int r8 = r1.f48829a
            int r9 = r7 + r8
            int r10 = r14.length
            if (r9 > r10) goto L_0x0756
            int r10 = r13.size()
            int r8 = r8 / 8
            int r10 = r10 + r8
            r13.k(r10)
        L_0x0741:
            if (r7 >= r9) goto L_0x074d
            long r10 = com.google.android.gms.internal.measurement.Z3.u(r14, r7)
            r13.i(r10)
            int r7 = r7 + 8
            goto L_0x0741
        L_0x074d:
            if (r7 != r9) goto L_0x0751
            goto L_0x057a
        L_0x0751:
            com.google.android.gms.internal.measurement.U4 r0 = com.google.android.gms.internal.measurement.U4.g()
            throw r0
        L_0x0756:
            com.google.android.gms.internal.measurement.U4 r0 = com.google.android.gms.internal.measurement.U4.g()
            throw r0
        L_0x075b:
            r7 = 1
            if (r9 != r7) goto L_0x0645
            com.google.android.gms.internal.measurement.h5 r13 = (com.google.android.gms.internal.measurement.C7313h5) r13
            long r7 = com.google.android.gms.internal.measurement.Z3.u(r14, r15)
            r13.i(r7)
            int r11 = r15 + 8
        L_0x0769:
            if (r11 >= r3) goto L_0x0713
            int r7 = com.google.android.gms.internal.measurement.Z3.s(r14, r11, r1)
            int r8 = r1.f48829a
            if (r0 != r8) goto L_0x0713
            long r8 = com.google.android.gms.internal.measurement.Z3.u(r14, r7)
            r13.i(r8)
            int r11 = r7 + 8
            goto L_0x0769
        L_0x077d:
            r1 = r0
            r3 = r2
            r15 = r11
            r5 = r12
            r0 = r23
            r2 = r30
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r7 = 2
            if (r9 != r7) goto L_0x0791
            int r7 = com.google.android.gms.internal.measurement.Z3.m(r14, r15, r13, r1)
            goto L_0x057a
        L_0x0791:
            if (r9 != 0) goto L_0x0645
            r12 = r0
            r11 = r1
            r1 = r34
            r7 = r2
            r2 = r15
            r8 = r3
            r3 = r36
            r10 = r4
            r4 = r13
            r9 = r5
            r5 = r38
            int r0 = com.google.android.gms.internal.measurement.Z3.c(r0, r1, r2, r3, r4, r5)
            r2 = r9
            goto L_0x08b7
        L_0x07a8:
            r8 = r2
            r15 = r11
            r2 = r12
            r12 = r23
            r7 = r30
            r10 = 1048575(0xfffff, float:1.469367E-39)
            r11 = r0
            r0 = 2
            if (r9 != r0) goto L_0x07d4
            com.google.android.gms.internal.measurement.h5 r13 = (com.google.android.gms.internal.measurement.C7313h5) r13
            int r0 = com.google.android.gms.internal.measurement.Z3.s(r14, r15, r11)
            int r1 = r11.f48829a
            int r1 = r1 + r0
        L_0x07bf:
            if (r0 >= r1) goto L_0x07cb
            int r0 = com.google.android.gms.internal.measurement.Z3.t(r14, r0, r11)
            long r3 = r11.f48830b
            r13.i(r3)
            goto L_0x07bf
        L_0x07cb:
            if (r0 != r1) goto L_0x07cf
            goto L_0x08b7
        L_0x07cf:
            com.google.android.gms.internal.measurement.U4 r0 = com.google.android.gms.internal.measurement.U4.g()
            throw r0
        L_0x07d4:
            if (r9 != 0) goto L_0x08b6
            com.google.android.gms.internal.measurement.h5 r13 = (com.google.android.gms.internal.measurement.C7313h5) r13
            int r0 = com.google.android.gms.internal.measurement.Z3.t(r14, r15, r11)
            long r3 = r11.f48830b
            r13.i(r3)
        L_0x07e1:
            if (r0 >= r8) goto L_0x08b7
            int r1 = com.google.android.gms.internal.measurement.Z3.s(r14, r0, r11)
            int r3 = r11.f48829a
            if (r12 != r3) goto L_0x08b7
            int r0 = com.google.android.gms.internal.measurement.Z3.t(r14, r1, r11)
            long r3 = r11.f48830b
            r13.i(r3)
            goto L_0x07e1
        L_0x07f5:
            r8 = r2
            r15 = r11
            r2 = r12
            r12 = r23
            r7 = r30
            r10 = 1048575(0xfffff, float:1.469367E-39)
            r11 = r0
            r0 = 2
            if (r9 != r0) goto L_0x0834
            com.google.android.gms.internal.measurement.H4 r13 = (com.google.android.gms.internal.measurement.H4) r13
            int r0 = com.google.android.gms.internal.measurement.Z3.s(r14, r15, r11)
            int r1 = r11.f48829a
            int r3 = r0 + r1
            int r4 = r14.length
            if (r3 > r4) goto L_0x082f
            int r4 = r13.size()
            int r1 = r1 / 4
            int r4 = r4 + r1
            r13.k(r4)
        L_0x081a:
            if (r0 >= r3) goto L_0x0826
            float r1 = com.google.android.gms.internal.measurement.Z3.o(r14, r0)
            r13.i(r1)
            int r0 = r0 + 4
            goto L_0x081a
        L_0x0826:
            if (r0 != r3) goto L_0x082a
            goto L_0x08b7
        L_0x082a:
            com.google.android.gms.internal.measurement.U4 r0 = com.google.android.gms.internal.measurement.U4.g()
            throw r0
        L_0x082f:
            com.google.android.gms.internal.measurement.U4 r0 = com.google.android.gms.internal.measurement.U4.g()
            throw r0
        L_0x0834:
            r0 = 5
            if (r9 != r0) goto L_0x08b6
            com.google.android.gms.internal.measurement.H4 r13 = (com.google.android.gms.internal.measurement.H4) r13
            float r0 = com.google.android.gms.internal.measurement.Z3.o(r14, r15)
            r13.i(r0)
            int r0 = r15 + 4
        L_0x0842:
            if (r0 >= r8) goto L_0x08b7
            int r1 = com.google.android.gms.internal.measurement.Z3.s(r14, r0, r11)
            int r3 = r11.f48829a
            if (r12 != r3) goto L_0x08b7
            float r0 = com.google.android.gms.internal.measurement.Z3.o(r14, r1)
            r13.i(r0)
            int r0 = r1 + 4
            goto L_0x0842
        L_0x0856:
            r8 = r2
            r15 = r11
            r2 = r12
            r12 = r23
            r7 = r30
            r10 = 1048575(0xfffff, float:1.469367E-39)
            r11 = r0
            r0 = 2
            if (r9 != r0) goto L_0x0894
            com.google.android.gms.internal.measurement.w4 r13 = (com.google.android.gms.internal.measurement.C7437w4) r13
            int r0 = com.google.android.gms.internal.measurement.Z3.s(r14, r15, r11)
            int r1 = r11.f48829a
            int r3 = r0 + r1
            int r4 = r14.length
            if (r3 > r4) goto L_0x088f
            int r4 = r13.size()
            int r1 = r1 / 8
            int r4 = r4 + r1
            r13.k(r4)
        L_0x087b:
            if (r0 >= r3) goto L_0x0887
            double r4 = com.google.android.gms.internal.measurement.Z3.a(r14, r0)
            r13.i(r4)
            int r0 = r0 + 8
            goto L_0x087b
        L_0x0887:
            if (r0 != r3) goto L_0x088a
            goto L_0x08b7
        L_0x088a:
            com.google.android.gms.internal.measurement.U4 r0 = com.google.android.gms.internal.measurement.U4.g()
            throw r0
        L_0x088f:
            com.google.android.gms.internal.measurement.U4 r0 = com.google.android.gms.internal.measurement.U4.g()
            throw r0
        L_0x0894:
            r0 = 1
            if (r9 != r0) goto L_0x08b6
            com.google.android.gms.internal.measurement.w4 r13 = (com.google.android.gms.internal.measurement.C7437w4) r13
            double r0 = com.google.android.gms.internal.measurement.Z3.a(r14, r15)
            r13.i(r0)
            int r0 = r15 + 8
        L_0x08a2:
            if (r0 >= r8) goto L_0x08b7
            int r1 = com.google.android.gms.internal.measurement.Z3.s(r14, r0, r11)
            int r3 = r11.f48829a
            if (r12 != r3) goto L_0x08b7
            double r3 = com.google.android.gms.internal.measurement.Z3.a(r14, r1)
            r13.i(r3)
            int r0 = r1 + 8
            goto L_0x08a2
        L_0x08b6:
            r0 = r15
        L_0x08b7:
            if (r0 != r15) goto L_0x08c6
            r15 = r33
            r30 = r7
            r1 = r12
            r12 = r11
            r11 = r20
            r20 = r2
            r2 = r0
            goto L_0x005d
        L_0x08c6:
            r15 = r33
            r4 = r8
            r5 = r11
            r9 = r12
            r1 = r19
            r12 = r28
            r13 = r29
            r8 = r2
            r2 = r7
            r7 = r20
            goto L_0x001c
        L_0x08d7:
            r15 = r11
            r2 = r12
            r8 = r21
            r10 = r22
            r12 = r23
            r11 = r0
            r0 = r13
            r13 = 50
            if (r3 != r13) goto L_0x0939
            r13 = 2
            if (r9 != r13) goto L_0x0929
            sun.misc.Unsafe r0 = f49116r
            java.lang.Object r1 = r6.M(r2)
            r13 = r15
            r15 = r33
            java.lang.Object r2 = r0.getObject(r15, r4)
            com.google.android.gms.internal.measurement.p5 r3 = r6.f49132p
            boolean r3 = r3.c(r2)
            if (r3 == 0) goto L_0x090c
            com.google.android.gms.internal.measurement.p5 r3 = r6.f49132p
            java.lang.Object r3 = r3.zzb(r1)
            com.google.android.gms.internal.measurement.p5 r7 = r6.f49132p
            r7.b(r3, r2)
            r0.putObject(r15, r4, r3)
            r2 = r3
        L_0x090c:
            com.google.android.gms.internal.measurement.p5 r0 = r6.f49132p
            r0.zza(r1)
            com.google.android.gms.internal.measurement.p5 r0 = r6.f49132p
            r0.a(r2)
            int r0 = com.google.android.gms.internal.measurement.Z3.s(r14, r13, r11)
            int r1 = r11.f48829a
            if (r1 < 0) goto L_0x0924
            int r0 = r36 - r0
            if (r1 <= r0) goto L_0x0923
            goto L_0x0924
        L_0x0923:
            throw r17
        L_0x0924:
            com.google.android.gms.internal.measurement.U4 r0 = com.google.android.gms.internal.measurement.U4.g()
            throw r0
        L_0x0929:
            r13 = r15
            r15 = r33
        L_0x092c:
            r0 = r37
            r30 = r1
            r1 = r12
            r12 = r11
            r11 = r20
            r20 = r2
            r2 = r13
            goto L_0x0bb5
        L_0x0939:
            r13 = r15
            r15 = r33
            sun.misc.Unsafe r0 = f49116r
            int r21 = r2 + 2
            r7 = r7[r21]
            r21 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r7 & r21
            r22 = r8
            long r7 = (long) r7
            switch(r3) {
                case 51: goto L_0x0b8d;
                case 52: goto L_0x0b6f;
                case 53: goto L_0x0b52;
                case 54: goto L_0x0b52;
                case 55: goto L_0x0b35;
                case 56: goto L_0x0b18;
                case 57: goto L_0x0afb;
                case 58: goto L_0x0ad6;
                case 59: goto L_0x0a92;
                case 60: goto L_0x0a58;
                case 61: goto L_0x0a3a;
                case 62: goto L_0x0b35;
                case 63: goto L_0x09f5;
                case 64: goto L_0x0afb;
                case 65: goto L_0x0b18;
                case 66: goto L_0x09c9;
                case 67: goto L_0x0993;
                case 68: goto L_0x0958;
                default: goto L_0x094d;
            }
        L_0x094d:
            r30 = r1
            r23 = r12
            r1 = r13
            r13 = r2
            r12 = r11
            r11 = r20
            goto L_0x0bab
        L_0x0958:
            r0 = 3
            if (r9 != r0) goto L_0x0987
            r3 = r20
            java.lang.Object r0 = r6.m(r15, r3, r2)
            r4 = r12 & -8
            r4 = r4 | 4
            com.google.android.gms.internal.measurement.K5 r8 = r6.K(r2)
            r7 = r0
            r9 = r34
            r10 = r13
            r11 = r36
            r5 = r12
            r12 = r4
            r4 = r13
            r13 = r38
            int r7 = com.google.android.gms.internal.measurement.Z3.j(r7, r8, r9, r10, r11, r12, r13)
            r6.s(r15, r3, r2, r0)
            r12 = r38
            r30 = r1
            r13 = r2
            r11 = r3
            r1 = r4
            r23 = r5
            r0 = r7
            goto L_0x0bac
        L_0x0987:
            r30 = r1
            r23 = r12
            r1 = r13
            r11 = r20
            r12 = r38
            r13 = r2
            goto L_0x0bab
        L_0x0993:
            r10 = r13
            r3 = r20
            r13 = r37
            r31 = r12
            r12 = r11
            r11 = r31
            if (r9 != 0) goto L_0x09c0
            int r9 = com.google.android.gms.internal.measurement.Z3.t(r14, r10, r12)
            r30 = r1
            r18 = r2
            long r1 = r12.f48830b
            long r1 = com.google.android.gms.internal.measurement.C7390q4.b(r1)
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r0.putObject(r15, r4, r1)
            r0.putInt(r15, r7, r3)
            r0 = r9
        L_0x09b8:
            r1 = r10
            r23 = r11
            r13 = r18
        L_0x09bd:
            r11 = r3
            goto L_0x0bac
        L_0x09c0:
            r30 = r1
        L_0x09c2:
            r13 = r2
            r1 = r10
            r23 = r11
        L_0x09c6:
            r11 = r3
            goto L_0x0bab
        L_0x09c9:
            r30 = r1
            r18 = r2
            r10 = r13
            r3 = r20
            r13 = r37
            r31 = r12
            r12 = r11
            r11 = r31
            if (r9 != 0) goto L_0x09ef
            int r1 = com.google.android.gms.internal.measurement.Z3.s(r14, r10, r12)
            int r2 = r12.f48829a
            int r2 = com.google.android.gms.internal.measurement.C7390q4.e(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.putObject(r15, r4, r2)
            r0.putInt(r15, r7, r3)
            r0 = r1
            goto L_0x09b8
        L_0x09ef:
            r1 = r10
            r23 = r11
            r13 = r18
            goto L_0x09c6
        L_0x09f5:
            r30 = r1
            r18 = r2
            r10 = r13
            r3 = r20
            r13 = r37
            r31 = r12
            r12 = r11
            r11 = r31
            if (r9 != 0) goto L_0x09ef
            int r1 = com.google.android.gms.internal.measurement.Z3.s(r14, r10, r12)
            int r2 = r12.f48829a
            r35 = r1
            r9 = r18
            com.google.android.gms.internal.measurement.Q4 r1 = r6.J(r9)
            if (r1 == 0) goto L_0x0a29
            boolean r1 = r1.c(r2)
            if (r1 == 0) goto L_0x0a1c
            goto L_0x0a29
        L_0x0a1c:
            com.google.android.gms.internal.measurement.c6 r0 = E(r33)
            long r1 = (long) r2
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r0.e(r11, r1)
            goto L_0x0a33
        L_0x0a29:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r0.putObject(r15, r4, r1)
            r0.putInt(r15, r7, r3)
        L_0x0a33:
            r0 = r35
            r13 = r9
        L_0x0a36:
            r1 = r10
            r23 = r11
            goto L_0x09bd
        L_0x0a3a:
            r30 = r1
            r10 = r13
            r3 = r20
            r1 = 2
            r13 = r37
            r31 = r12
            r12 = r11
            r11 = r31
            if (r9 != r1) goto L_0x09c2
            int r1 = com.google.android.gms.internal.measurement.Z3.l(r14, r10, r12)
            java.lang.Object r9 = r12.f48831c
            r0.putObject(r15, r4, r9)
            r0.putInt(r15, r7, r3)
            r0 = r1
            r13 = r2
            goto L_0x0a36
        L_0x0a58:
            r30 = r1
            r10 = r13
            r3 = r20
            r1 = 2
            r13 = r37
            r31 = r12
            r12 = r11
            r11 = r31
            if (r9 != r1) goto L_0x0a8b
            java.lang.Object r7 = r6.m(r15, r3, r2)
            com.google.android.gms.internal.measurement.K5 r1 = r6.K(r2)
            r8 = r21
            r0 = r7
            r9 = r30
            r5 = r2
            r2 = r34
            r4 = r3
            r3 = r10
            r23 = r11
            r11 = r4
            r4 = r36
            r13 = r5
            r5 = r38
            int r0 = com.google.android.gms.internal.measurement.Z3.k(r0, r1, r2, r3, r4, r5)
            r6.s(r15, r11, r13, r7)
            r1 = r10
            goto L_0x0bac
        L_0x0a8b:
            r13 = r2
            r23 = r11
            r11 = r3
            r1 = r10
            goto L_0x0bab
        L_0x0a92:
            r3 = r1
            r23 = r12
            r1 = r13
            r13 = r2
            r12 = r11
            r11 = r20
            r2 = 2
            if (r9 != r2) goto L_0x0ad2
            int r2 = com.google.android.gms.internal.measurement.Z3.s(r14, r1, r12)
            int r9 = r12.f48829a
            if (r9 != 0) goto L_0x0aab
            r0.putObject(r15, r4, r10)
            r30 = r3
            goto L_0x0acc
        L_0x0aab:
            r10 = 536870912(0x20000000, float:1.0842022E-19)
            r10 = r22 & r10
            if (r10 == 0) goto L_0x0abf
            int r10 = r2 + r9
            boolean r10 = com.google.android.gms.internal.measurement.C7305g6.e(r14, r2, r10)
            if (r10 == 0) goto L_0x0aba
            goto L_0x0abf
        L_0x0aba:
            com.google.android.gms.internal.measurement.U4 r0 = com.google.android.gms.internal.measurement.U4.c()
            throw r0
        L_0x0abf:
            java.lang.String r10 = new java.lang.String
            r30 = r3
            java.nio.charset.Charset r3 = com.google.android.gms.internal.measurement.O4.f48769a
            r10.<init>(r14, r2, r9, r3)
            r0.putObject(r15, r4, r10)
            int r2 = r2 + r9
        L_0x0acc:
            r0.putInt(r15, r7, r11)
        L_0x0acf:
            r0 = r2
            goto L_0x0bac
        L_0x0ad2:
            r30 = r3
            goto L_0x0bab
        L_0x0ad6:
            r30 = r1
            r23 = r12
            r1 = r13
            r13 = r2
            r12 = r11
            r11 = r20
            if (r9 != 0) goto L_0x0bab
            int r2 = com.google.android.gms.internal.measurement.Z3.t(r14, r1, r12)
            long r9 = r12.f48830b
            int r3 = (r9 > r24 ? 1 : (r9 == r24 ? 0 : -1))
            if (r3 == 0) goto L_0x0aee
            r26 = 1
            goto L_0x0af0
        L_0x0aee:
            r26 = r16
        L_0x0af0:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r26)
            r0.putObject(r15, r4, r3)
            r0.putInt(r15, r7, r11)
            goto L_0x0acf
        L_0x0afb:
            r30 = r1
            r23 = r12
            r1 = r13
            r13 = r2
            r12 = r11
            r11 = r20
            r2 = 5
            if (r9 != r2) goto L_0x0bab
            int r2 = com.google.android.gms.internal.measurement.Z3.r(r14, r1)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.putObject(r15, r4, r2)
            int r2 = r1 + 4
            r0.putInt(r15, r7, r11)
            goto L_0x0acf
        L_0x0b18:
            r30 = r1
            r23 = r12
            r1 = r13
            r13 = r2
            r12 = r11
            r11 = r20
            r2 = 1
            if (r9 != r2) goto L_0x0bab
            long r2 = com.google.android.gms.internal.measurement.Z3.u(r14, r1)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r0.putObject(r15, r4, r2)
            int r2 = r1 + 8
            r0.putInt(r15, r7, r11)
            goto L_0x0acf
        L_0x0b35:
            r30 = r1
            r23 = r12
            r1 = r13
            r13 = r2
            r12 = r11
            r11 = r20
            if (r9 != 0) goto L_0x0bab
            int r2 = com.google.android.gms.internal.measurement.Z3.s(r14, r1, r12)
            int r3 = r12.f48829a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.putObject(r15, r4, r3)
            r0.putInt(r15, r7, r11)
            goto L_0x0acf
        L_0x0b52:
            r30 = r1
            r23 = r12
            r1 = r13
            r13 = r2
            r12 = r11
            r11 = r20
            if (r9 != 0) goto L_0x0bab
            int r2 = com.google.android.gms.internal.measurement.Z3.t(r14, r1, r12)
            long r9 = r12.f48830b
            java.lang.Long r3 = java.lang.Long.valueOf(r9)
            r0.putObject(r15, r4, r3)
            r0.putInt(r15, r7, r11)
            goto L_0x0acf
        L_0x0b6f:
            r30 = r1
            r23 = r12
            r1 = r13
            r13 = r2
            r12 = r11
            r11 = r20
            r2 = 5
            if (r9 != r2) goto L_0x0bab
            float r2 = com.google.android.gms.internal.measurement.Z3.o(r14, r1)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r0.putObject(r15, r4, r2)
            int r2 = r1 + 4
            r0.putInt(r15, r7, r11)
            goto L_0x0acf
        L_0x0b8d:
            r30 = r1
            r23 = r12
            r1 = r13
            r13 = r2
            r12 = r11
            r11 = r20
            r2 = 1
            if (r9 != r2) goto L_0x0bab
            double r2 = com.google.android.gms.internal.measurement.Z3.a(r14, r1)
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            r0.putObject(r15, r4, r2)
            int r2 = r1 + 8
            r0.putInt(r15, r7, r11)
            goto L_0x0acf
        L_0x0bab:
            r0 = r1
        L_0x0bac:
            if (r0 != r1) goto L_0x0c2c
            r2 = r0
            r20 = r13
            r1 = r23
            goto L_0x005d
        L_0x0bb5:
            if (r1 != r0) goto L_0x0bca
            if (r0 != 0) goto L_0x0bba
            goto L_0x0bca
        L_0x0bba:
            r8 = r36
            r11 = r0
            r12 = r1
            r9 = r2
            r0 = r28
            r13 = r29
            r10 = r30
            r7 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x0c4e
        L_0x0bca:
            boolean r3 = r6.f49122f
            if (r3 == 0) goto L_0x0c01
            com.google.android.gms.internal.measurement.x4 r3 = r12.f48832d
            com.google.android.gms.internal.measurement.x4 r4 = com.google.android.gms.internal.measurement.C7445x4.f49140c
            if (r3 == r4) goto L_0x0c01
            com.google.android.gms.internal.measurement.s5 r3 = r6.f49121e
            com.google.android.gms.internal.measurement.Z5<?, ?> r13 = r6.f49130n
            r7 = r1
            r8 = r34
            r9 = r2
            r10 = r36
            r17 = r1
            r21 = r11
            r11 = r33
            r12 = r3
            r14 = r38
            int r0 = com.google.android.gms.internal.measurement.Z3.e(r7, r8, r9, r10, r11, r12, r13, r14)
            r14 = r34
            r4 = r36
            r5 = r38
            r9 = r17
            r1 = r19
            r8 = r20
        L_0x0bf7:
            r7 = r21
            r12 = r28
            r13 = r29
            r2 = r30
            goto L_0x001c
        L_0x0c01:
            r17 = r1
            r21 = r11
            com.google.android.gms.internal.measurement.c6 r4 = E(r33)
            r0 = r17
            r1 = r34
            r7 = 1048575(0xfffff, float:1.469367E-39)
            r8 = r36
            r10 = r30
            r3 = r36
            r11 = r37
            r5 = r38
            int r0 = com.google.android.gms.internal.measurement.Z3.d(r0, r1, r2, r3, r4, r5)
            r14 = r34
            r4 = r8
            r2 = r10
            r9 = r17
            r1 = r19
            r8 = r20
            r7 = r21
            goto L_0x0194
        L_0x0c2c:
            r21 = r11
            r1 = r13
            r17 = r23
            r11 = r37
            r14 = r34
            r4 = r36
            r5 = r38
            r8 = r1
            r9 = r17
            r1 = r19
            goto L_0x0bf7
        L_0x0c3f:
            r11 = r37
            r10 = r2
            r8 = r4
            r28 = r12
            r29 = r13
            r7 = 1048575(0xfffff, float:1.469367E-39)
            r12 = r9
            r9 = r0
            r0 = r28
        L_0x0c4e:
            if (r13 == r7) goto L_0x0c54
            long r1 = (long) r13
            r10.putInt(r15, r1, r0)
        L_0x0c54:
            int r0 = r6.f49126j
            r7 = r0
            r3 = r17
        L_0x0c59:
            int r0 = r6.f49127k
            if (r7 >= r0) goto L_0x0c73
            int[] r0 = r6.f49125i
            r2 = r0[r7]
            com.google.android.gms.internal.measurement.Z5<?, ?> r4 = r6.f49130n
            r0 = r32
            r1 = r33
            r5 = r33
            java.lang.Object r0 = r0.n(r1, r2, r3, r4, r5)
            r3 = r0
            com.google.android.gms.internal.measurement.c6 r3 = (com.google.android.gms.internal.measurement.C7269c6) r3
            int r7 = r7 + 1
            goto L_0x0c59
        L_0x0c73:
            if (r3 == 0) goto L_0x0c7a
            com.google.android.gms.internal.measurement.Z5<?, ?> r0 = r6.f49130n
            r0.h(r15, r3)
        L_0x0c7a:
            if (r11 != 0) goto L_0x0c84
            if (r9 != r8) goto L_0x0c7f
            goto L_0x0c88
        L_0x0c7f:
            com.google.android.gms.internal.measurement.U4 r0 = com.google.android.gms.internal.measurement.U4.e()
            throw r0
        L_0x0c84:
            if (r9 > r8) goto L_0x0c89
            if (r12 != r11) goto L_0x0c89
        L_0x0c88:
            return r9
        L_0x0c89:
            com.google.android.gms.internal.measurement.U4 r0 = com.google.android.gms.internal.measurement.U4.e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C7438w5.i(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.measurement.Y3):int");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x02d4, code lost:
        r12 = r12 + r0;
        r15 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x0564, code lost:
        r11 = r11 + 3;
        r0 = r14;
        r1 = r16;
        r10 = 1048575;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a8, code lost:
        r12 = r12 + r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01ac, code lost:
        r1 = (r1 + r2) + r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zza(T r18) {
        /*
            r17 = this;
            r6 = r17
            r7 = r18
            sun.misc.Unsafe r8 = f49116r
            r10 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r10
            r1 = 0
            r11 = 0
            r12 = 0
        L_0x000d:
            int[] r2 = r6.f49117a
            int r2 = r2.length
            if (r11 >= r2) goto L_0x056e
            int r2 = r6.C(r11)
            r3 = 267386880(0xff00000, float:2.3665827E-29)
            r3 = r3 & r2
            int r3 = r3 >>> 20
            int[] r4 = r6.f49117a
            r13 = r4[r11]
            int r5 = r11 + 2
            r4 = r4[r5]
            r5 = r4 & r10
            r14 = 17
            r15 = 1
            if (r3 > r14) goto L_0x0040
            if (r5 == r0) goto L_0x0037
            if (r5 != r10) goto L_0x0030
            r1 = 0
            goto L_0x0036
        L_0x0030:
            long r0 = (long) r5
            int r0 = r8.getInt(r7, r0)
            r1 = r0
        L_0x0036:
            r0 = r5
        L_0x0037:
            int r4 = r4 >>> 20
            int r4 = r15 << r4
            r14 = r0
            r16 = r1
            r5 = r4
            goto L_0x0044
        L_0x0040:
            r14 = r0
            r16 = r1
            r5 = 0
        L_0x0044:
            r0 = r2 & r10
            long r1 = (long) r0
            com.google.android.gms.internal.measurement.G4 r0 = com.google.android.gms.internal.measurement.G4.DOUBLE_LIST_PACKED
            int r0 = r0.zza()
            if (r3 < r0) goto L_0x0055
            com.google.android.gms.internal.measurement.G4 r0 = com.google.android.gms.internal.measurement.G4.SINT64_LIST_PACKED
            int r0 = r0.zza()
        L_0x0055:
            r4 = 0
            r9 = 0
            switch(r3) {
                case 0: goto L_0x054d;
                case 1: goto L_0x0538;
                case 2: goto L_0x051f;
                case 3: goto L_0x0506;
                case 4: goto L_0x04ed;
                case 5: goto L_0x04d9;
                case 6: goto L_0x04c3;
                case 7: goto L_0x04af;
                case 8: goto L_0x0488;
                case 9: goto L_0x046b;
                case 10: goto L_0x0450;
                case 11: goto L_0x0437;
                case 12: goto L_0x041e;
                case 13: goto L_0x0409;
                case 14: goto L_0x03f5;
                case 15: goto L_0x03dc;
                case 16: goto L_0x03c3;
                case 17: goto L_0x03a4;
                case 18: goto L_0x0397;
                case 19: goto L_0x038a;
                case 20: goto L_0x037d;
                case 21: goto L_0x0370;
                case 22: goto L_0x0363;
                case 23: goto L_0x0356;
                case 24: goto L_0x0349;
                case 25: goto L_0x033d;
                case 26: goto L_0x0331;
                case 27: goto L_0x0321;
                case 28: goto L_0x0315;
                case 29: goto L_0x0308;
                case 30: goto L_0x02fc;
                case 31: goto L_0x02f0;
                case 32: goto L_0x02e4;
                case 33: goto L_0x02d8;
                case 34: goto L_0x02c9;
                case 35: goto L_0x02b3;
                case 36: goto L_0x029d;
                case 37: goto L_0x0287;
                case 38: goto L_0x0271;
                case 39: goto L_0x025b;
                case 40: goto L_0x0245;
                case 41: goto L_0x022f;
                case 42: goto L_0x0219;
                case 43: goto L_0x0204;
                case 44: goto L_0x01ef;
                case 45: goto L_0x01da;
                case 46: goto L_0x01c5;
                case 47: goto L_0x01b0;
                case 48: goto L_0x0198;
                case 49: goto L_0x0188;
                case 50: goto L_0x0178;
                case 51: goto L_0x016a;
                case 52: goto L_0x015e;
                case 53: goto L_0x014e;
                case 54: goto L_0x013e;
                case 55: goto L_0x012e;
                case 56: goto L_0x0122;
                case 57: goto L_0x0116;
                case 58: goto L_0x010a;
                case 59: goto L_0x00ec;
                case 60: goto L_0x00d9;
                case 61: goto L_0x00c8;
                case 62: goto L_0x00b9;
                case 63: goto L_0x00aa;
                case 64: goto L_0x009d;
                case 65: goto L_0x0092;
                case 66: goto L_0x0083;
                case 67: goto L_0x0074;
                case 68: goto L_0x005c;
                default: goto L_0x005b;
            }
        L_0x005b:
            goto L_0x0071
        L_0x005c:
            boolean r0 = r6.G(r7, r13, r11)
            if (r0 == 0) goto L_0x0071
            java.lang.Object r0 = r8.getObject(r7, r1)
            com.google.android.gms.internal.measurement.s5 r0 = (com.google.android.gms.internal.measurement.C7406s5) r0
            com.google.android.gms.internal.measurement.K5 r1 = r6.K(r11)
            int r0 = com.google.android.gms.internal.measurement.C7405s4.m(r13, r0, r1)
        L_0x0070:
            int r12 = r12 + r0
        L_0x0071:
            r15 = 0
            goto L_0x0564
        L_0x0074:
            boolean r0 = r6.G(r7, r13, r11)
            if (r0 == 0) goto L_0x0071
            long r0 = I(r7, r1)
            int r0 = com.google.android.gms.internal.measurement.C7405s4.d0(r13, r0)
            goto L_0x0070
        L_0x0083:
            boolean r0 = r6.G(r7, r13, r11)
            if (r0 == 0) goto L_0x0071
            int r0 = D(r7, r1)
            int r0 = com.google.android.gms.internal.measurement.C7405s4.h0(r13, r0)
            goto L_0x0070
        L_0x0092:
            boolean r0 = r6.G(r7, r13, r11)
            if (r0 == 0) goto L_0x0071
            int r0 = com.google.android.gms.internal.measurement.C7405s4.V(r13, r9)
            goto L_0x0070
        L_0x009d:
            boolean r0 = r6.G(r7, r13, r11)
            if (r0 == 0) goto L_0x0071
            r0 = 0
            int r1 = com.google.android.gms.internal.measurement.C7405s4.c0(r13, r0)
        L_0x00a8:
            int r12 = r12 + r1
            goto L_0x0071
        L_0x00aa:
            boolean r0 = r6.G(r7, r13, r11)
            if (r0 == 0) goto L_0x0071
            int r0 = D(r7, r1)
            int r0 = com.google.android.gms.internal.measurement.C7405s4.h(r13, r0)
            goto L_0x0070
        L_0x00b9:
            boolean r0 = r6.G(r7, r13, r11)
            if (r0 == 0) goto L_0x0071
            int r0 = D(r7, r1)
            int r0 = com.google.android.gms.internal.measurement.C7405s4.l0(r13, r0)
            goto L_0x0070
        L_0x00c8:
            boolean r0 = r6.G(r7, r13, r11)
            if (r0 == 0) goto L_0x0071
            java.lang.Object r0 = r8.getObject(r7, r1)
            com.google.android.gms.internal.measurement.d4 r0 = (com.google.android.gms.internal.measurement.C7276d4) r0
            int r0 = com.google.android.gms.internal.measurement.C7405s4.j(r13, r0)
            goto L_0x0070
        L_0x00d9:
            boolean r0 = r6.G(r7, r13, r11)
            if (r0 == 0) goto L_0x0071
            java.lang.Object r0 = r8.getObject(r7, r1)
            com.google.android.gms.internal.measurement.K5 r1 = r6.K(r11)
            int r0 = com.google.android.gms.internal.measurement.L5.a(r13, r0, r1)
            goto L_0x0070
        L_0x00ec:
            boolean r0 = r6.G(r7, r13, r11)
            if (r0 == 0) goto L_0x0071
            java.lang.Object r0 = r8.getObject(r7, r1)
            boolean r1 = r0 instanceof com.google.android.gms.internal.measurement.C7276d4
            if (r1 == 0) goto L_0x0102
            com.google.android.gms.internal.measurement.d4 r0 = (com.google.android.gms.internal.measurement.C7276d4) r0
            int r0 = com.google.android.gms.internal.measurement.C7405s4.j(r13, r0)
            goto L_0x0070
        L_0x0102:
            java.lang.String r0 = (java.lang.String) r0
            int r0 = com.google.android.gms.internal.measurement.C7405s4.n(r13, r0)
            goto L_0x0070
        L_0x010a:
            boolean r0 = r6.G(r7, r13, r11)
            if (r0 == 0) goto L_0x0071
            int r0 = com.google.android.gms.internal.measurement.C7405s4.o(r13, r15)
            goto L_0x0070
        L_0x0116:
            boolean r0 = r6.G(r7, r13, r11)
            if (r0 == 0) goto L_0x0071
            r0 = 0
            int r1 = com.google.android.gms.internal.measurement.C7405s4.A(r13, r0)
            goto L_0x00a8
        L_0x0122:
            boolean r0 = r6.G(r7, r13, r11)
            if (r0 == 0) goto L_0x0071
            int r0 = com.google.android.gms.internal.measurement.C7405s4.i(r13, r9)
            goto L_0x0070
        L_0x012e:
            boolean r0 = r6.G(r7, r13, r11)
            if (r0 == 0) goto L_0x0071
            int r0 = D(r7, r1)
            int r0 = com.google.android.gms.internal.measurement.C7405s4.U(r13, r0)
            goto L_0x0070
        L_0x013e:
            boolean r0 = r6.G(r7, r13, r11)
            if (r0 == 0) goto L_0x0071
            long r0 = I(r7, r1)
            int r0 = com.google.android.gms.internal.measurement.C7405s4.i0(r13, r0)
            goto L_0x0070
        L_0x014e:
            boolean r0 = r6.G(r7, r13, r11)
            if (r0 == 0) goto L_0x0071
            long r0 = I(r7, r1)
            int r0 = com.google.android.gms.internal.measurement.C7405s4.B(r13, r0)
            goto L_0x0070
        L_0x015e:
            boolean r0 = r6.G(r7, r13, r11)
            if (r0 == 0) goto L_0x0071
            int r0 = com.google.android.gms.internal.measurement.C7405s4.g(r13, r4)
            goto L_0x0070
        L_0x016a:
            boolean r0 = r6.G(r7, r13, r11)
            if (r0 == 0) goto L_0x0071
            r0 = 0
            int r0 = com.google.android.gms.internal.measurement.C7405s4.f(r13, r0)
            goto L_0x0070
        L_0x0178:
            com.google.android.gms.internal.measurement.p5 r0 = r6.f49132p
            java.lang.Object r1 = r8.getObject(r7, r1)
            java.lang.Object r2 = r6.M(r11)
            int r0 = r0.e(r13, r1, r2)
            goto L_0x0070
        L_0x0188:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            com.google.android.gms.internal.measurement.K5 r1 = r6.K(r11)
            int r0 = com.google.android.gms.internal.measurement.L5.c(r13, r0, r1)
            goto L_0x0070
        L_0x0198:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.android.gms.internal.measurement.L5.N(r0)
            if (r0 <= 0) goto L_0x0071
            int r1 = com.google.android.gms.internal.measurement.C7405s4.k0(r13)
            int r2 = com.google.android.gms.internal.measurement.C7405s4.o0(r0)
        L_0x01ac:
            int r1 = r1 + r2
            int r1 = r1 + r0
            goto L_0x00a8
        L_0x01b0:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.android.gms.internal.measurement.L5.K(r0)
            if (r0 <= 0) goto L_0x0071
            int r1 = com.google.android.gms.internal.measurement.C7405s4.k0(r13)
            int r2 = com.google.android.gms.internal.measurement.C7405s4.o0(r0)
            goto L_0x01ac
        L_0x01c5:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.android.gms.internal.measurement.L5.B(r0)
            if (r0 <= 0) goto L_0x0071
            int r1 = com.google.android.gms.internal.measurement.C7405s4.k0(r13)
            int r2 = com.google.android.gms.internal.measurement.C7405s4.o0(r0)
            goto L_0x01ac
        L_0x01da:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.android.gms.internal.measurement.L5.y(r0)
            if (r0 <= 0) goto L_0x0071
            int r1 = com.google.android.gms.internal.measurement.C7405s4.k0(r13)
            int r2 = com.google.android.gms.internal.measurement.C7405s4.o0(r0)
            goto L_0x01ac
        L_0x01ef:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.android.gms.internal.measurement.L5.t(r0)
            if (r0 <= 0) goto L_0x0071
            int r1 = com.google.android.gms.internal.measurement.C7405s4.k0(r13)
            int r2 = com.google.android.gms.internal.measurement.C7405s4.o0(r0)
            goto L_0x01ac
        L_0x0204:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.android.gms.internal.measurement.L5.Q(r0)
            if (r0 <= 0) goto L_0x0071
            int r1 = com.google.android.gms.internal.measurement.C7405s4.k0(r13)
            int r2 = com.google.android.gms.internal.measurement.C7405s4.o0(r0)
            goto L_0x01ac
        L_0x0219:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.android.gms.internal.measurement.L5.e(r0)
            if (r0 <= 0) goto L_0x0071
            int r1 = com.google.android.gms.internal.measurement.C7405s4.k0(r13)
            int r2 = com.google.android.gms.internal.measurement.C7405s4.o0(r0)
            goto L_0x01ac
        L_0x022f:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.android.gms.internal.measurement.L5.y(r0)
            if (r0 <= 0) goto L_0x0071
            int r1 = com.google.android.gms.internal.measurement.C7405s4.k0(r13)
            int r2 = com.google.android.gms.internal.measurement.C7405s4.o0(r0)
            goto L_0x01ac
        L_0x0245:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.android.gms.internal.measurement.L5.B(r0)
            if (r0 <= 0) goto L_0x0071
            int r1 = com.google.android.gms.internal.measurement.C7405s4.k0(r13)
            int r2 = com.google.android.gms.internal.measurement.C7405s4.o0(r0)
            goto L_0x01ac
        L_0x025b:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.android.gms.internal.measurement.L5.E(r0)
            if (r0 <= 0) goto L_0x0071
            int r1 = com.google.android.gms.internal.measurement.C7405s4.k0(r13)
            int r2 = com.google.android.gms.internal.measurement.C7405s4.o0(r0)
            goto L_0x01ac
        L_0x0271:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.android.gms.internal.measurement.L5.T(r0)
            if (r0 <= 0) goto L_0x0071
            int r1 = com.google.android.gms.internal.measurement.C7405s4.k0(r13)
            int r2 = com.google.android.gms.internal.measurement.C7405s4.o0(r0)
            goto L_0x01ac
        L_0x0287:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.android.gms.internal.measurement.L5.H(r0)
            if (r0 <= 0) goto L_0x0071
            int r1 = com.google.android.gms.internal.measurement.C7405s4.k0(r13)
            int r2 = com.google.android.gms.internal.measurement.C7405s4.o0(r0)
            goto L_0x01ac
        L_0x029d:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.android.gms.internal.measurement.L5.y(r0)
            if (r0 <= 0) goto L_0x0071
            int r1 = com.google.android.gms.internal.measurement.C7405s4.k0(r13)
            int r2 = com.google.android.gms.internal.measurement.C7405s4.o0(r0)
            goto L_0x01ac
        L_0x02b3:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.android.gms.internal.measurement.L5.B(r0)
            if (r0 <= 0) goto L_0x0071
            int r1 = com.google.android.gms.internal.measurement.C7405s4.k0(r13)
            int r2 = com.google.android.gms.internal.measurement.C7405s4.o0(r0)
            goto L_0x01ac
        L_0x02c9:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            r3 = 0
            int r0 = com.google.android.gms.internal.measurement.L5.M(r13, r0, r3)
        L_0x02d4:
            int r12 = r12 + r0
            r15 = r3
            goto L_0x0564
        L_0x02d8:
            r3 = 0
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.android.gms.internal.measurement.L5.J(r13, r0, r3)
            goto L_0x02d4
        L_0x02e4:
            r3 = 0
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.android.gms.internal.measurement.L5.A(r13, r0, r3)
            goto L_0x02d4
        L_0x02f0:
            r3 = 0
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.android.gms.internal.measurement.L5.x(r13, r0, r3)
            goto L_0x02d4
        L_0x02fc:
            r3 = 0
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.android.gms.internal.measurement.L5.s(r13, r0, r3)
            goto L_0x02d4
        L_0x0308:
            r3 = 0
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.android.gms.internal.measurement.L5.P(r13, r0, r3)
            goto L_0x0070
        L_0x0315:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.android.gms.internal.measurement.L5.b(r13, r0)
            goto L_0x0070
        L_0x0321:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            com.google.android.gms.internal.measurement.K5 r1 = r6.K(r11)
            int r0 = com.google.android.gms.internal.measurement.L5.r(r13, r0, r1)
            goto L_0x0070
        L_0x0331:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.android.gms.internal.measurement.L5.q(r13, r0)
            goto L_0x0070
        L_0x033d:
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            r3 = 0
            int r0 = com.google.android.gms.internal.measurement.L5.d(r13, r0, r3)
            goto L_0x02d4
        L_0x0349:
            r3 = 0
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.android.gms.internal.measurement.L5.x(r13, r0, r3)
            goto L_0x02d4
        L_0x0356:
            r3 = 0
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.android.gms.internal.measurement.L5.A(r13, r0, r3)
            goto L_0x02d4
        L_0x0363:
            r3 = 0
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.android.gms.internal.measurement.L5.D(r13, r0, r3)
            goto L_0x02d4
        L_0x0370:
            r3 = 0
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.android.gms.internal.measurement.L5.S(r13, r0, r3)
            goto L_0x02d4
        L_0x037d:
            r3 = 0
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.android.gms.internal.measurement.L5.G(r13, r0, r3)
            goto L_0x02d4
        L_0x038a:
            r3 = 0
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.android.gms.internal.measurement.L5.x(r13, r0, r3)
            goto L_0x02d4
        L_0x0397:
            r3 = 0
            java.lang.Object r0 = r8.getObject(r7, r1)
            java.util.List r0 = (java.util.List) r0
            int r0 = com.google.android.gms.internal.measurement.L5.A(r13, r0, r3)
            goto L_0x0070
        L_0x03a4:
            r0 = r17
            r9 = r1
            r1 = r18
            r2 = r11
            r3 = r14
            r4 = r16
            boolean r0 = r0.v(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0071
            java.lang.Object r0 = r8.getObject(r7, r9)
            com.google.android.gms.internal.measurement.s5 r0 = (com.google.android.gms.internal.measurement.C7406s5) r0
            com.google.android.gms.internal.measurement.K5 r1 = r6.K(r11)
            int r0 = com.google.android.gms.internal.measurement.C7405s4.m(r13, r0, r1)
            goto L_0x0070
        L_0x03c3:
            r9 = r1
            r0 = r17
            r1 = r18
            r2 = r11
            r3 = r14
            r4 = r16
            boolean r0 = r0.v(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0071
            long r0 = r8.getLong(r7, r9)
            int r0 = com.google.android.gms.internal.measurement.C7405s4.d0(r13, r0)
            goto L_0x0070
        L_0x03dc:
            r9 = r1
            r0 = r17
            r1 = r18
            r2 = r11
            r3 = r14
            r4 = r16
            boolean r0 = r0.v(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0071
            int r0 = r8.getInt(r7, r9)
            int r0 = com.google.android.gms.internal.measurement.C7405s4.h0(r13, r0)
            goto L_0x0070
        L_0x03f5:
            r0 = r17
            r1 = r18
            r2 = r11
            r3 = r14
            r4 = r16
            boolean r0 = r0.v(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0071
            int r0 = com.google.android.gms.internal.measurement.C7405s4.V(r13, r9)
            goto L_0x0070
        L_0x0409:
            r0 = r17
            r1 = r18
            r2 = r11
            r3 = r14
            r4 = r16
            boolean r0 = r0.v(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0071
            r0 = 0
            int r1 = com.google.android.gms.internal.measurement.C7405s4.c0(r13, r0)
            goto L_0x00a8
        L_0x041e:
            r9 = r1
            r0 = r17
            r1 = r18
            r2 = r11
            r3 = r14
            r4 = r16
            boolean r0 = r0.v(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0071
            int r0 = r8.getInt(r7, r9)
            int r0 = com.google.android.gms.internal.measurement.C7405s4.h(r13, r0)
            goto L_0x0070
        L_0x0437:
            r9 = r1
            r0 = r17
            r1 = r18
            r2 = r11
            r3 = r14
            r4 = r16
            boolean r0 = r0.v(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0071
            int r0 = r8.getInt(r7, r9)
            int r0 = com.google.android.gms.internal.measurement.C7405s4.l0(r13, r0)
            goto L_0x0070
        L_0x0450:
            r9 = r1
            r0 = r17
            r1 = r18
            r2 = r11
            r3 = r14
            r4 = r16
            boolean r0 = r0.v(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0071
            java.lang.Object r0 = r8.getObject(r7, r9)
            com.google.android.gms.internal.measurement.d4 r0 = (com.google.android.gms.internal.measurement.C7276d4) r0
            int r0 = com.google.android.gms.internal.measurement.C7405s4.j(r13, r0)
            goto L_0x0070
        L_0x046b:
            r9 = r1
            r0 = r17
            r1 = r18
            r2 = r11
            r3 = r14
            r4 = r16
            boolean r0 = r0.v(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0071
            java.lang.Object r0 = r8.getObject(r7, r9)
            com.google.android.gms.internal.measurement.K5 r1 = r6.K(r11)
            int r0 = com.google.android.gms.internal.measurement.L5.a(r13, r0, r1)
            goto L_0x0070
        L_0x0488:
            r9 = r1
            r0 = r17
            r1 = r18
            r2 = r11
            r3 = r14
            r4 = r16
            boolean r0 = r0.v(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0071
            java.lang.Object r0 = r8.getObject(r7, r9)
            boolean r1 = r0 instanceof com.google.android.gms.internal.measurement.C7276d4
            if (r1 == 0) goto L_0x04a7
            com.google.android.gms.internal.measurement.d4 r0 = (com.google.android.gms.internal.measurement.C7276d4) r0
            int r0 = com.google.android.gms.internal.measurement.C7405s4.j(r13, r0)
            goto L_0x0070
        L_0x04a7:
            java.lang.String r0 = (java.lang.String) r0
            int r0 = com.google.android.gms.internal.measurement.C7405s4.n(r13, r0)
            goto L_0x0070
        L_0x04af:
            r0 = r17
            r1 = r18
            r2 = r11
            r3 = r14
            r4 = r16
            boolean r0 = r0.v(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0071
            int r0 = com.google.android.gms.internal.measurement.C7405s4.o(r13, r15)
            goto L_0x0070
        L_0x04c3:
            r0 = r17
            r1 = r18
            r2 = r11
            r3 = r14
            r4 = r16
            boolean r0 = r0.v(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0071
            r15 = 0
            int r0 = com.google.android.gms.internal.measurement.C7405s4.A(r13, r15)
        L_0x04d6:
            int r12 = r12 + r0
            goto L_0x0564
        L_0x04d9:
            r15 = 0
            r0 = r17
            r1 = r18
            r2 = r11
            r3 = r14
            r4 = r16
            boolean r0 = r0.v(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0564
            int r0 = com.google.android.gms.internal.measurement.C7405s4.i(r13, r9)
            goto L_0x04d6
        L_0x04ed:
            r9 = r1
            r15 = 0
            r0 = r17
            r1 = r18
            r2 = r11
            r3 = r14
            r4 = r16
            boolean r0 = r0.v(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0564
            int r0 = r8.getInt(r7, r9)
            int r0 = com.google.android.gms.internal.measurement.C7405s4.U(r13, r0)
            goto L_0x04d6
        L_0x0506:
            r9 = r1
            r15 = 0
            r0 = r17
            r1 = r18
            r2 = r11
            r3 = r14
            r4 = r16
            boolean r0 = r0.v(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0564
            long r0 = r8.getLong(r7, r9)
            int r0 = com.google.android.gms.internal.measurement.C7405s4.i0(r13, r0)
            goto L_0x04d6
        L_0x051f:
            r9 = r1
            r15 = 0
            r0 = r17
            r1 = r18
            r2 = r11
            r3 = r14
            r4 = r16
            boolean r0 = r0.v(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0564
            long r0 = r8.getLong(r7, r9)
            int r0 = com.google.android.gms.internal.measurement.C7405s4.B(r13, r0)
            goto L_0x04d6
        L_0x0538:
            r15 = 0
            r0 = r17
            r1 = r18
            r2 = r11
            r3 = r14
            r9 = r4
            r4 = r16
            boolean r0 = r0.v(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0564
            int r0 = com.google.android.gms.internal.measurement.C7405s4.g(r13, r9)
            goto L_0x04d6
        L_0x054d:
            r15 = 0
            r0 = r17
            r1 = r18
            r2 = r11
            r3 = r14
            r4 = r16
            boolean r0 = r0.v(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0564
            r0 = 0
            int r0 = com.google.android.gms.internal.measurement.C7405s4.f(r13, r0)
            goto L_0x04d6
        L_0x0564:
            int r11 = r11 + 3
            r0 = r14
            r1 = r16
            r10 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x000d
        L_0x056e:
            r15 = 0
            com.google.android.gms.internal.measurement.Z5<?, ?> r0 = r6.f49130n
            java.lang.Object r1 = r0.k(r7)
            int r0 = r0.a(r1)
            int r12 = r12 + r0
            boolean r0 = r6.f49122f
            if (r0 == 0) goto L_0x05cc
            com.google.android.gms.internal.measurement.z4<?> r0 = r6.f49131o
            com.google.android.gms.internal.measurement.A4 r0 = r0.b(r7)
            com.google.android.gms.internal.measurement.O5<T, java.lang.Object> r1 = r0.f48533a
            int r1 = r1.i()
            r9 = r15
        L_0x058b:
            if (r9 >= r1) goto L_0x05a5
            com.google.android.gms.internal.measurement.O5<T, java.lang.Object> r2 = r0.f48533a
            java.util.Map$Entry r2 = r2.f(r9)
            java.lang.Object r3 = r2.getKey()
            com.google.android.gms.internal.measurement.C4 r3 = (com.google.android.gms.internal.measurement.C4) r3
            java.lang.Object r2 = r2.getValue()
            int r2 = com.google.android.gms.internal.measurement.A4.b(r3, r2)
            int r15 = r15 + r2
            int r9 = r9 + 1
            goto L_0x058b
        L_0x05a5:
            com.google.android.gms.internal.measurement.O5<T, java.lang.Object> r0 = r0.f48533a
            java.lang.Iterable r0 = r0.m()
            java.util.Iterator r0 = r0.iterator()
        L_0x05af:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x05cb
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            com.google.android.gms.internal.measurement.C4 r2 = (com.google.android.gms.internal.measurement.C4) r2
            java.lang.Object r1 = r1.getValue()
            int r1 = com.google.android.gms.internal.measurement.A4.b(r2, r1)
            int r15 = r15 + r1
            goto L_0x05af
        L_0x05cb:
            int r12 = r12 + r15
        L_0x05cc:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C7438w5.zza(java.lang.Object):int");
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
    public final int zzb(T r9) {
        /*
            r8 = this;
            int[] r0 = r8.f49117a
            int r0 = r0.length
            r1 = 0
            r2 = r1
        L_0x0005:
            if (r1 >= r0) goto L_0x022f
            int r3 = r8.C(r1)
            int[] r4 = r8.f49117a
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
            boolean r3 = r8.G(r9, r4, r1)
            if (r3 == 0) goto L_0x022b
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C7287e6.B(r9, r5)
            int r2 = r2 * 53
            int r3 = r3.hashCode()
        L_0x0030:
            int r2 = r2 + r3
            goto L_0x022b
        L_0x0033:
            boolean r3 = r8.G(r9, r4, r1)
            if (r3 == 0) goto L_0x022b
            int r2 = r2 * 53
            long r3 = I(r9, r5)
            int r3 = com.google.android.gms.internal.measurement.O4.b(r3)
            goto L_0x0030
        L_0x0044:
            boolean r3 = r8.G(r9, r4, r1)
            if (r3 == 0) goto L_0x022b
            int r2 = r2 * 53
            int r3 = D(r9, r5)
            goto L_0x0030
        L_0x0051:
            boolean r3 = r8.G(r9, r4, r1)
            if (r3 == 0) goto L_0x022b
            int r2 = r2 * 53
            long r3 = I(r9, r5)
            int r3 = com.google.android.gms.internal.measurement.O4.b(r3)
            goto L_0x0030
        L_0x0062:
            boolean r3 = r8.G(r9, r4, r1)
            if (r3 == 0) goto L_0x022b
            int r2 = r2 * 53
            int r3 = D(r9, r5)
            goto L_0x0030
        L_0x006f:
            boolean r3 = r8.G(r9, r4, r1)
            if (r3 == 0) goto L_0x022b
            int r2 = r2 * 53
            int r3 = D(r9, r5)
            goto L_0x0030
        L_0x007c:
            boolean r3 = r8.G(r9, r4, r1)
            if (r3 == 0) goto L_0x022b
            int r2 = r2 * 53
            int r3 = D(r9, r5)
            goto L_0x0030
        L_0x0089:
            boolean r3 = r8.G(r9, r4, r1)
            if (r3 == 0) goto L_0x022b
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C7287e6.B(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0030
        L_0x009a:
            boolean r3 = r8.G(r9, r4, r1)
            if (r3 == 0) goto L_0x022b
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C7287e6.B(r9, r5)
            int r2 = r2 * 53
            int r3 = r3.hashCode()
            goto L_0x0030
        L_0x00ab:
            boolean r3 = r8.G(r9, r4, r1)
            if (r3 == 0) goto L_0x022b
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C7287e6.B(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0030
        L_0x00bf:
            boolean r3 = r8.G(r9, r4, r1)
            if (r3 == 0) goto L_0x022b
            int r2 = r2 * 53
            boolean r3 = L(r9, r5)
            int r3 = com.google.android.gms.internal.measurement.O4.c(r3)
            goto L_0x0030
        L_0x00d1:
            boolean r3 = r8.G(r9, r4, r1)
            if (r3 == 0) goto L_0x022b
            int r2 = r2 * 53
            int r3 = D(r9, r5)
            goto L_0x0030
        L_0x00df:
            boolean r3 = r8.G(r9, r4, r1)
            if (r3 == 0) goto L_0x022b
            int r2 = r2 * 53
            long r3 = I(r9, r5)
            int r3 = com.google.android.gms.internal.measurement.O4.b(r3)
            goto L_0x0030
        L_0x00f1:
            boolean r3 = r8.G(r9, r4, r1)
            if (r3 == 0) goto L_0x022b
            int r2 = r2 * 53
            int r3 = D(r9, r5)
            goto L_0x0030
        L_0x00ff:
            boolean r3 = r8.G(r9, r4, r1)
            if (r3 == 0) goto L_0x022b
            int r2 = r2 * 53
            long r3 = I(r9, r5)
            int r3 = com.google.android.gms.internal.measurement.O4.b(r3)
            goto L_0x0030
        L_0x0111:
            boolean r3 = r8.G(r9, r4, r1)
            if (r3 == 0) goto L_0x022b
            int r2 = r2 * 53
            long r3 = I(r9, r5)
            int r3 = com.google.android.gms.internal.measurement.O4.b(r3)
            goto L_0x0030
        L_0x0123:
            boolean r3 = r8.G(r9, r4, r1)
            if (r3 == 0) goto L_0x022b
            int r2 = r2 * 53
            float r3 = x(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0030
        L_0x0135:
            boolean r3 = r8.G(r9, r4, r1)
            if (r3 == 0) goto L_0x022b
            int r2 = r2 * 53
            double r3 = f(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = com.google.android.gms.internal.measurement.O4.b(r3)
            goto L_0x0030
        L_0x014b:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C7287e6.B(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0030
        L_0x0157:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C7287e6.B(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0030
        L_0x0163:
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C7287e6.B(r9, r5)
            if (r3 == 0) goto L_0x016d
            int r7 = r3.hashCode()
        L_0x016d:
            int r2 = r2 * 53
            int r2 = r2 + r7
            goto L_0x022b
        L_0x0172:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.measurement.C7287e6.x(r9, r5)
            int r3 = com.google.android.gms.internal.measurement.O4.b(r3)
            goto L_0x0030
        L_0x017e:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.measurement.C7287e6.t(r9, r5)
            goto L_0x0030
        L_0x0186:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.measurement.C7287e6.x(r9, r5)
            int r3 = com.google.android.gms.internal.measurement.O4.b(r3)
            goto L_0x0030
        L_0x0192:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.measurement.C7287e6.t(r9, r5)
            goto L_0x0030
        L_0x019a:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.measurement.C7287e6.t(r9, r5)
            goto L_0x0030
        L_0x01a2:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.measurement.C7287e6.t(r9, r5)
            goto L_0x0030
        L_0x01aa:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C7287e6.B(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0030
        L_0x01b6:
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C7287e6.B(r9, r5)
            if (r3 == 0) goto L_0x016d
            int r7 = r3.hashCode()
            goto L_0x016d
        L_0x01c1:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.measurement.C7287e6.B(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0030
        L_0x01cf:
            int r2 = r2 * 53
            boolean r3 = com.google.android.gms.internal.measurement.C7287e6.F(r9, r5)
            int r3 = com.google.android.gms.internal.measurement.O4.c(r3)
            goto L_0x0030
        L_0x01db:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.measurement.C7287e6.t(r9, r5)
            goto L_0x0030
        L_0x01e3:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.measurement.C7287e6.x(r9, r5)
            int r3 = com.google.android.gms.internal.measurement.O4.b(r3)
            goto L_0x0030
        L_0x01ef:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.measurement.C7287e6.t(r9, r5)
            goto L_0x0030
        L_0x01f7:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.measurement.C7287e6.x(r9, r5)
            int r3 = com.google.android.gms.internal.measurement.O4.b(r3)
            goto L_0x0030
        L_0x0203:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.measurement.C7287e6.x(r9, r5)
            int r3 = com.google.android.gms.internal.measurement.O4.b(r3)
            goto L_0x0030
        L_0x020f:
            int r2 = r2 * 53
            float r3 = com.google.android.gms.internal.measurement.C7287e6.n(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0030
        L_0x021b:
            int r2 = r2 * 53
            double r3 = com.google.android.gms.internal.measurement.C7287e6.a(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = com.google.android.gms.internal.measurement.O4.b(r3)
            goto L_0x0030
        L_0x022b:
            int r1 = r1 + 3
            goto L_0x0005
        L_0x022f:
            int r2 = r2 * 53
            com.google.android.gms.internal.measurement.Z5<?, ?> r0 = r8.f49130n
            java.lang.Object r0 = r0.k(r9)
            int r0 = r0.hashCode()
            int r2 = r2 + r0
            boolean r0 = r8.f49122f
            if (r0 == 0) goto L_0x024d
            int r2 = r2 * 53
            com.google.android.gms.internal.measurement.z4<?> r0 = r8.f49131o
            com.google.android.gms.internal.measurement.A4 r9 = r0.b(r9)
            int r9 = r9.hashCode()
            int r2 = r2 + r9
        L_0x024d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C7438w5.zzb(java.lang.Object):int");
    }

    public final void zzd(T t10) {
        if (P(t10)) {
            if (t10 instanceof L4) {
                L4 l42 = (L4) t10;
                l42.i(Integer.MAX_VALUE);
                l42.zza = 0;
                l42.H();
            }
            int length = this.f49117a.length;
            for (int i10 = 0; i10 < length; i10 += 3) {
                int C10 = C(i10);
                long j10 = (long) (1048575 & C10);
                int i11 = (C10 & 267386880) >>> 20;
                if (i11 != 9) {
                    if (i11 == 60 || i11 == 68) {
                        if (G(t10, this.f49117a[i10], i10)) {
                            K(i10).zzd(f49116r.getObject(t10, j10));
                        }
                    } else {
                        switch (i11) {
                            case 17:
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
                                this.f49129m.b(t10, j10);
                                continue;
                            case 50:
                                Unsafe unsafe = f49116r;
                                Object object = unsafe.getObject(t10, j10);
                                if (object != null) {
                                    unsafe.putObject(t10, j10, this.f49132p.d(object));
                                    break;
                                } else {
                                    continue;
                                }
                        }
                    }
                }
                if (F(t10, i10)) {
                    K(i10).zzd(f49116r.getObject(t10, j10));
                }
            }
            this.f49130n.l(t10);
            if (this.f49122f) {
                this.f49131o.g(t10);
            }
        }
    }

    public final T zza() {
        return this.f49128l.zza(this.f49121e);
    }
}
