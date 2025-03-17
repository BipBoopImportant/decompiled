package com.google.android.gms.internal.vision;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.vision.m2  reason: case insensitive filesystem */
public final class C7515m2 {

    /* renamed from: f  reason: collision with root package name */
    private static final C7515m2 f49350f = new C7515m2(0, new int[0], new Object[0], false);

    /* renamed from: a  reason: collision with root package name */
    private int f49351a;

    /* renamed from: b  reason: collision with root package name */
    private int[] f49352b;

    /* renamed from: c  reason: collision with root package name */
    private Object[] f49353c;

    /* renamed from: d  reason: collision with root package name */
    private int f49354d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f49355e;

    private C7515m2() {
        this(0, new int[8], new Object[8], true);
    }

    public static C7515m2 a() {
        return f49350f;
    }

    static C7515m2 b(C7515m2 m2Var, C7515m2 m2Var2) {
        int i10 = m2Var.f49351a + m2Var2.f49351a;
        int[] copyOf = Arrays.copyOf(m2Var.f49352b, i10);
        System.arraycopy(m2Var2.f49352b, 0, copyOf, m2Var.f49351a, m2Var2.f49351a);
        Object[] copyOf2 = Arrays.copyOf(m2Var.f49353c, i10);
        System.arraycopy(m2Var2.f49353c, 0, copyOf2, m2Var.f49351a, m2Var2.f49351a);
        return new C7515m2(i10, copyOf, copyOf2, true);
    }

    private static void d(int i10, Object obj, H2 h22) {
        int i11 = i10 >>> 3;
        int i12 = i10 & 7;
        if (i12 == 0) {
            h22.j(i11, ((Long) obj).longValue());
        } else if (i12 == 1) {
            h22.q(i11, ((Long) obj).longValue());
        } else if (i12 == 2) {
            h22.s(i11, (C7497i0) obj);
        } else if (i12 != 3) {
            if (i12 == 5) {
                h22.u(i11, ((Integer) obj).intValue());
                return;
            }
            throw new RuntimeException(Z0.d());
        } else if (h22.zza() == G2.f49202a) {
            h22.c(i11);
            ((C7515m2) obj).h(h22);
            h22.d(i11);
        } else {
            h22.d(i11);
            ((C7515m2) obj).h(h22);
            h22.c(i11);
        }
    }

    static C7515m2 g() {
        return new C7515m2();
    }

    /* access modifiers changed from: package-private */
    public final void c(int i10, Object obj) {
        if (this.f49355e) {
            int i11 = this.f49351a;
            int[] iArr = this.f49352b;
            if (i11 == iArr.length) {
                int i12 = i11 + (i11 < 4 ? 8 : i11 >> 1);
                this.f49352b = Arrays.copyOf(iArr, i12);
                this.f49353c = Arrays.copyOf(this.f49353c, i12);
            }
            int[] iArr2 = this.f49352b;
            int i13 = this.f49351a;
            iArr2[i13] = i10;
            this.f49353c[i13] = obj;
            this.f49351a = i13 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public final void e(H2 h22) {
        if (h22.zza() == G2.f49203b) {
            for (int i10 = this.f49351a - 1; i10 >= 0; i10--) {
                h22.g(this.f49352b[i10] >>> 3, this.f49353c[i10]);
            }
            return;
        }
        for (int i11 = 0; i11 < this.f49351a; i11++) {
            h22.g(this.f49352b[i11] >>> 3, this.f49353c[i11]);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C7515m2)) {
            return false;
        }
        C7515m2 m2Var = (C7515m2) obj;
        int i10 = this.f49351a;
        if (i10 == m2Var.f49351a) {
            int[] iArr = this.f49352b;
            int[] iArr2 = m2Var.f49352b;
            int i11 = 0;
            while (true) {
                if (i11 >= i10) {
                    Object[] objArr = this.f49353c;
                    Object[] objArr2 = m2Var.f49353c;
                    int i12 = this.f49351a;
                    int i13 = 0;
                    while (i13 < i12) {
                        if (objArr[i13].equals(objArr2[i13])) {
                            i13++;
                        }
                    }
                    return true;
                } else if (iArr[i11] != iArr2[i11]) {
                    break;
                } else {
                    i11++;
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final void f(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < this.f49351a; i11++) {
            F1.d(sb2, i10, String.valueOf(this.f49352b[i11] >>> 3), this.f49353c[i11]);
        }
    }

    public final void h(H2 h22) {
        if (this.f49351a != 0) {
            if (h22.zza() == G2.f49202a) {
                for (int i10 = 0; i10 < this.f49351a; i10++) {
                    d(this.f49352b[i10], this.f49353c[i10], h22);
                }
                return;
            }
            for (int i11 = this.f49351a - 1; i11 >= 0; i11--) {
                d(this.f49352b[i11], this.f49353c[i11], h22);
            }
        }
    }

    public final int hashCode() {
        int i10 = this.f49351a;
        int i11 = (i10 + 527) * 31;
        int[] iArr = this.f49352b;
        int i12 = 17;
        int i13 = 17;
        for (int i14 = 0; i14 < i10; i14++) {
            i13 = (i13 * 31) + iArr[i14];
        }
        int i15 = (i11 + i13) * 31;
        Object[] objArr = this.f49353c;
        int i16 = this.f49351a;
        for (int i17 = 0; i17 < i16; i17++) {
            i12 = (i12 * 31) + objArr[i17].hashCode();
        }
        return i15 + i12;
    }

    public final void i() {
        this.f49355e = false;
    }

    public final int j() {
        int i10 = this.f49354d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f49351a; i12++) {
            i11 += C7547x0.c0(this.f49352b[i12] >>> 3, (C7497i0) this.f49353c[i12]);
        }
        this.f49354d = i11;
        return i11;
    }

    public final int k() {
        int h02;
        int i10 = this.f49354d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f49351a; i12++) {
            int i13 = this.f49352b[i12];
            int i14 = i13 >>> 3;
            int i15 = i13 & 7;
            if (i15 == 0) {
                h02 = C7547x0.h0(i14, ((Long) this.f49353c[i12]).longValue());
            } else if (i15 == 1) {
                h02 = C7547x0.q0(i14, ((Long) this.f49353c[i12]).longValue());
            } else if (i15 == 2) {
                h02 = C7547x0.T(i14, (C7497i0) this.f49353c[i12]);
            } else if (i15 == 3) {
                h02 = (C7547x0.g0(i14) << 1) + ((C7515m2) this.f49353c[i12]).k();
            } else if (i15 == 5) {
                h02 = C7547x0.x0(i14, ((Integer) this.f49353c[i12]).intValue());
            } else {
                throw new IllegalStateException(Z0.d());
            }
            i11 += h02;
        }
        this.f49354d = i11;
        return i11;
    }

    private C7515m2(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f49354d = -1;
        this.f49351a = i10;
        this.f49352b = iArr;
        this.f49353c = objArr;
        this.f49355e = z10;
    }
}
