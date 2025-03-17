package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.C7186g0;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.clearcut.w1  reason: case insensitive filesystem */
public final class C7234w1 {

    /* renamed from: f  reason: collision with root package name */
    private static final C7234w1 f48498f = new C7234w1(0, new int[0], new Object[0], false);

    /* renamed from: a  reason: collision with root package name */
    private int f48499a;

    /* renamed from: b  reason: collision with root package name */
    private int[] f48500b;

    /* renamed from: c  reason: collision with root package name */
    private Object[] f48501c;

    /* renamed from: d  reason: collision with root package name */
    private int f48502d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f48503e;

    private C7234w1() {
        this(0, new int[8], new Object[8], true);
    }

    static C7234w1 a(C7234w1 w1Var, C7234w1 w1Var2) {
        int i10 = w1Var.f48499a + w1Var2.f48499a;
        int[] copyOf = Arrays.copyOf(w1Var.f48500b, i10);
        System.arraycopy(w1Var2.f48500b, 0, copyOf, w1Var.f48499a, w1Var2.f48499a);
        Object[] copyOf2 = Arrays.copyOf(w1Var.f48501c, i10);
        System.arraycopy(w1Var2.f48501c, 0, copyOf2, w1Var.f48499a, w1Var2.f48499a);
        return new C7234w1(i10, copyOf, copyOf2, true);
    }

    private static void f(int i10, Object obj, Q1 q12) {
        int i11 = i10 >>> 3;
        int i12 = i10 & 7;
        if (i12 == 0) {
            q12.L(i11, ((Long) obj).longValue());
        } else if (i12 == 1) {
            q12.f(i11, ((Long) obj).longValue());
        } else if (i12 == 2) {
            q12.H(i11, (A) obj);
        } else if (i12 != 3) {
            if (i12 == 5) {
                q12.m(i11, ((Integer) obj).intValue());
                return;
            }
            throw new RuntimeException(C7204m0.c());
        } else if (q12.s() == C7186g0.e.f48392l) {
            q12.N(i11);
            ((C7234w1) obj).g(q12);
            q12.G(i11);
        } else {
            q12.G(i11);
            ((C7234w1) obj).g(q12);
            q12.N(i11);
        }
    }

    public static C7234w1 h() {
        return f48498f;
    }

    static C7234w1 i() {
        return new C7234w1();
    }

    /* access modifiers changed from: package-private */
    public final void b(Q1 q12) {
        if (q12.s() == C7186g0.e.f48393m) {
            for (int i10 = this.f48499a - 1; i10 >= 0; i10--) {
                q12.g(this.f48500b[i10] >>> 3, this.f48501c[i10]);
            }
            return;
        }
        for (int i11 = 0; i11 < this.f48499a; i11++) {
            q12.g(this.f48500b[i11] >>> 3, this.f48501c[i11]);
        }
    }

    /* access modifiers changed from: package-private */
    public final void c(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < this.f48499a; i11++) {
            P0.c(sb2, i10, String.valueOf(this.f48500b[i11] >>> 3), this.f48501c[i11]);
        }
    }

    public final int d() {
        int d02;
        int i10 = this.f48502d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f48499a; i12++) {
            int i13 = this.f48500b[i12];
            int i14 = i13 >>> 3;
            int i15 = i13 & 7;
            if (i15 == 0) {
                d02 = M.d0(i14, ((Long) this.f48501c[i12]).longValue());
            } else if (i15 == 1) {
                d02 = M.k0(i14, ((Long) this.f48501c[i12]).longValue());
            } else if (i15 == 2) {
                d02 = M.N(i14, (A) this.f48501c[i12]);
            } else if (i15 == 3) {
                d02 = (M.B0(i14) << 1) + ((C7234w1) this.f48501c[i12]).d();
            } else if (i15 == 5) {
                d02 = M.t0(i14, ((Integer) this.f48501c[i12]).intValue());
            } else {
                throw new IllegalStateException(C7204m0.c());
            }
            i11 += d02;
        }
        this.f48502d = i11;
        return i11;
    }

    /* access modifiers changed from: package-private */
    public final void e(int i10, Object obj) {
        if (this.f48503e) {
            int i11 = this.f48499a;
            int[] iArr = this.f48500b;
            if (i11 == iArr.length) {
                int i12 = i11 + (i11 < 4 ? 8 : i11 >> 1);
                this.f48500b = Arrays.copyOf(iArr, i12);
                this.f48501c = Arrays.copyOf(this.f48501c, i12);
            }
            int[] iArr2 = this.f48500b;
            int i13 = this.f48499a;
            iArr2[i13] = i10;
            this.f48501c[i13] = obj;
            this.f48499a = i13 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C7234w1)) {
            return false;
        }
        C7234w1 w1Var = (C7234w1) obj;
        int i10 = this.f48499a;
        if (i10 == w1Var.f48499a) {
            int[] iArr = this.f48500b;
            int[] iArr2 = w1Var.f48500b;
            int i11 = 0;
            while (true) {
                if (i11 >= i10) {
                    Object[] objArr = this.f48501c;
                    Object[] objArr2 = w1Var.f48501c;
                    int i12 = this.f48499a;
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

    public final void g(Q1 q12) {
        if (this.f48499a != 0) {
            if (q12.s() == C7186g0.e.f48392l) {
                for (int i10 = 0; i10 < this.f48499a; i10++) {
                    f(this.f48500b[i10], this.f48501c[i10], q12);
                }
                return;
            }
            for (int i11 = this.f48499a - 1; i11 >= 0; i11--) {
                f(this.f48500b[i11], this.f48501c[i11], q12);
            }
        }
    }

    public final int hashCode() {
        int i10 = this.f48499a;
        int i11 = (i10 + 527) * 31;
        int[] iArr = this.f48500b;
        int i12 = 17;
        int i13 = 17;
        for (int i14 = 0; i14 < i10; i14++) {
            i13 = (i13 * 31) + iArr[i14];
        }
        int i15 = (i11 + i13) * 31;
        Object[] objArr = this.f48501c;
        int i16 = this.f48499a;
        for (int i17 = 0; i17 < i16; i17++) {
            i12 = (i12 * 31) + objArr[i17].hashCode();
        }
        return i15 + i12;
    }

    public final int j() {
        int i10 = this.f48502d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f48499a; i12++) {
            i11 += M.X(this.f48500b[i12] >>> 3, (A) this.f48501c[i12]);
        }
        this.f48502d = i11;
        return i11;
    }

    public final void k() {
        this.f48503e = false;
    }

    private C7234w1(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f48502d = -1;
        this.f48499a = i10;
        this.f48500b = iArr;
        this.f48501c = objArr;
        this.f48503e = z10;
    }
}
