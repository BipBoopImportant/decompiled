package com.google.android.gms.internal.measurement;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.measurement.c6  reason: case insensitive filesystem */
public final class C7269c6 {

    /* renamed from: f  reason: collision with root package name */
    private static final C7269c6 f48872f = new C7269c6(0, new int[0], new Object[0], false);

    /* renamed from: a  reason: collision with root package name */
    private int f48873a;

    /* renamed from: b  reason: collision with root package name */
    private int[] f48874b;

    /* renamed from: c  reason: collision with root package name */
    private Object[] f48875c;

    /* renamed from: d  reason: collision with root package name */
    private int f48876d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f48877e;

    private C7269c6() {
        this(0, new int[8], new Object[8], true);
    }

    static C7269c6 c(C7269c6 c6Var, C7269c6 c6Var2) {
        int i10 = c6Var.f48873a + c6Var2.f48873a;
        int[] copyOf = Arrays.copyOf(c6Var.f48874b, i10);
        System.arraycopy(c6Var2.f48874b, 0, copyOf, c6Var.f48873a, c6Var2.f48873a);
        Object[] copyOf2 = Arrays.copyOf(c6Var.f48875c, i10);
        System.arraycopy(c6Var2.f48875c, 0, copyOf2, c6Var.f48873a, c6Var2.f48873a);
        return new C7269c6(i10, copyOf, copyOf2, true);
    }

    private final void d(int i10) {
        int[] iArr = this.f48874b;
        if (i10 > iArr.length) {
            int i11 = this.f48873a;
            int i12 = i11 + (i11 / 2);
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.f48874b = Arrays.copyOf(iArr, i10);
            this.f48875c = Arrays.copyOf(this.f48875c, i10);
        }
    }

    private static void f(int i10, Object obj, C7399r6 r6Var) {
        int i11 = i10 >>> 3;
        int i12 = i10 & 7;
        if (i12 == 0) {
            r6Var.a(i11, ((Long) obj).longValue());
        } else if (i12 == 1) {
            r6Var.j(i11, ((Long) obj).longValue());
        } else if (i12 == 2) {
            r6Var.I(i11, (C7276d4) obj);
        } else if (i12 != 3) {
            if (i12 == 5) {
                r6Var.p(i11, ((Integer) obj).intValue());
                return;
            }
            throw new RuntimeException(U4.a());
        } else if (r6Var.zza() == 1) {
            r6Var.d(i11);
            ((C7269c6) obj).j(r6Var);
            r6Var.c(i11);
        } else {
            r6Var.c(i11);
            ((C7269c6) obj).j(r6Var);
            r6Var.d(i11);
        }
    }

    public static C7269c6 k() {
        return f48872f;
    }

    static C7269c6 l() {
        return new C7269c6();
    }

    private final void n() {
        if (!this.f48877e) {
            throw new UnsupportedOperationException();
        }
    }

    public final int a() {
        int i02;
        int i10 = this.f48876d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f48873a; i12++) {
            int i13 = this.f48874b[i12];
            int i14 = i13 >>> 3;
            int i15 = i13 & 7;
            if (i15 == 0) {
                i02 = C7405s4.i0(i14, ((Long) this.f48875c[i12]).longValue());
            } else if (i15 == 1) {
                i02 = C7405s4.i(i14, ((Long) this.f48875c[i12]).longValue());
            } else if (i15 == 2) {
                i02 = C7405s4.j(i14, (C7276d4) this.f48875c[i12]);
            } else if (i15 == 3) {
                i02 = (C7405s4.k0(i14) << 1) + ((C7269c6) this.f48875c[i12]).a();
            } else if (i15 == 5) {
                i02 = C7405s4.A(i14, ((Integer) this.f48875c[i12]).intValue());
            } else {
                throw new IllegalStateException(U4.a());
            }
            i11 += i02;
        }
        this.f48876d = i11;
        return i11;
    }

    /* access modifiers changed from: package-private */
    public final C7269c6 b(C7269c6 c6Var) {
        if (c6Var.equals(f48872f)) {
            return this;
        }
        n();
        int i10 = this.f48873a + c6Var.f48873a;
        d(i10);
        System.arraycopy(c6Var.f48874b, 0, this.f48874b, this.f48873a, c6Var.f48873a);
        System.arraycopy(c6Var.f48875c, 0, this.f48875c, this.f48873a, c6Var.f48873a);
        this.f48873a = i10;
        return this;
    }

    /* access modifiers changed from: package-private */
    public final void e(int i10, Object obj) {
        n();
        d(this.f48873a + 1);
        int[] iArr = this.f48874b;
        int i11 = this.f48873a;
        iArr[i11] = i10;
        this.f48875c[i11] = obj;
        this.f48873a = i11 + 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C7269c6)) {
            return false;
        }
        C7269c6 c6Var = (C7269c6) obj;
        int i10 = this.f48873a;
        if (i10 == c6Var.f48873a) {
            int[] iArr = this.f48874b;
            int[] iArr2 = c6Var.f48874b;
            int i11 = 0;
            while (true) {
                if (i11 >= i10) {
                    Object[] objArr = this.f48875c;
                    Object[] objArr2 = c6Var.f48875c;
                    int i12 = this.f48873a;
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
    public final void g(C7399r6 r6Var) {
        if (r6Var.zza() == 2) {
            for (int i10 = this.f48873a - 1; i10 >= 0; i10--) {
                r6Var.g(this.f48874b[i10] >>> 3, this.f48875c[i10]);
            }
            return;
        }
        for (int i11 = 0; i11 < this.f48873a; i11++) {
            r6Var.g(this.f48874b[i11] >>> 3, this.f48875c[i11]);
        }
    }

    /* access modifiers changed from: package-private */
    public final void h(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < this.f48873a; i11++) {
            C7446x5.d(sb2, i10, String.valueOf(this.f48874b[i11] >>> 3), this.f48875c[i11]);
        }
    }

    public final int hashCode() {
        int i10 = this.f48873a;
        int i11 = (i10 + 527) * 31;
        int[] iArr = this.f48874b;
        int i12 = 17;
        int i13 = 17;
        for (int i14 = 0; i14 < i10; i14++) {
            i13 = (i13 * 31) + iArr[i14];
        }
        int i15 = (i11 + i13) * 31;
        Object[] objArr = this.f48875c;
        int i16 = this.f48873a;
        for (int i17 = 0; i17 < i16; i17++) {
            i12 = (i12 * 31) + objArr[i17].hashCode();
        }
        return i15 + i12;
    }

    public final int i() {
        int i10 = this.f48876d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f48873a; i12++) {
            i11 += C7405s4.C(this.f48874b[i12] >>> 3, (C7276d4) this.f48875c[i12]);
        }
        this.f48876d = i11;
        return i11;
    }

    public final void j(C7399r6 r6Var) {
        if (this.f48873a != 0) {
            if (r6Var.zza() == 1) {
                for (int i10 = 0; i10 < this.f48873a; i10++) {
                    f(this.f48874b[i10], this.f48875c[i10], r6Var);
                }
                return;
            }
            for (int i11 = this.f48873a - 1; i11 >= 0; i11--) {
                f(this.f48874b[i11], this.f48875c[i11], r6Var);
            }
        }
    }

    public final void m() {
        if (this.f48877e) {
            this.f48877e = false;
        }
    }

    private C7269c6(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f48876d = -1;
        this.f48873a = i10;
        this.f48874b = iArr;
        this.f48875c = objArr;
        this.f48877e = z10;
    }
}
