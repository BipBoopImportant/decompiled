package com.google.android.gms.internal.clearcut;

public final class k2 extends T1<k2> implements Cloneable {

    /* renamed from: c  reason: collision with root package name */
    private String[] f48420c;

    /* renamed from: d  reason: collision with root package name */
    private String[] f48421d;

    /* renamed from: e  reason: collision with root package name */
    private int[] f48422e = C7168a2.f48295a;

    /* renamed from: f  reason: collision with root package name */
    private long[] f48423f;

    /* renamed from: g  reason: collision with root package name */
    private long[] f48424g;

    public k2() {
        String[] strArr = C7168a2.f48300f;
        this.f48420c = strArr;
        this.f48421d = strArr;
        long[] jArr = C7168a2.f48296b;
        this.f48423f = jArr;
        this.f48424g = jArr;
        this.f48261b = null;
        this.f48281a = -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public final k2 clone() {
        try {
            k2 k2Var = (k2) super.clone();
            String[] strArr = this.f48420c;
            if (strArr != null && strArr.length > 0) {
                k2Var.f48420c = (String[]) strArr.clone();
            }
            String[] strArr2 = this.f48421d;
            if (strArr2 != null && strArr2.length > 0) {
                k2Var.f48421d = (String[]) strArr2.clone();
            }
            int[] iArr = this.f48422e;
            if (iArr != null && iArr.length > 0) {
                k2Var.f48422e = (int[]) iArr.clone();
            }
            long[] jArr = this.f48423f;
            if (jArr != null && jArr.length > 0) {
                k2Var.f48423f = (long[]) jArr.clone();
            }
            long[] jArr2 = this.f48424g;
            if (jArr2 != null && jArr2.length > 0) {
                k2Var.f48424g = (long[]) jArr2.clone();
            }
            return k2Var;
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    public final void a(R1 r12) {
        String[] strArr = this.f48420c;
        int i10 = 0;
        if (strArr != null && strArr.length > 0) {
            int i11 = 0;
            while (true) {
                String[] strArr2 = this.f48420c;
                if (i11 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i11];
                if (str != null) {
                    r12.c(1, str);
                }
                i11++;
            }
        }
        String[] strArr3 = this.f48421d;
        if (strArr3 != null && strArr3.length > 0) {
            int i12 = 0;
            while (true) {
                String[] strArr4 = this.f48421d;
                if (i12 >= strArr4.length) {
                    break;
                }
                String str2 = strArr4[i12];
                if (str2 != null) {
                    r12.c(2, str2);
                }
                i12++;
            }
        }
        int[] iArr = this.f48422e;
        if (iArr != null && iArr.length > 0) {
            int i13 = 0;
            while (true) {
                int[] iArr2 = this.f48422e;
                if (i13 >= iArr2.length) {
                    break;
                }
                r12.l(3, iArr2[i13]);
                i13++;
            }
        }
        long[] jArr = this.f48423f;
        if (jArr != null && jArr.length > 0) {
            int i14 = 0;
            while (true) {
                long[] jArr2 = this.f48423f;
                if (i14 >= jArr2.length) {
                    break;
                }
                r12.u(4, jArr2[i14]);
                i14++;
            }
        }
        long[] jArr3 = this.f48424g;
        if (jArr3 != null && jArr3.length > 0) {
            while (true) {
                long[] jArr4 = this.f48424g;
                if (i10 >= jArr4.length) {
                    break;
                }
                r12.u(5, jArr4[i10]);
                i10++;
            }
        }
        super.a(r12);
    }

    /* access modifiers changed from: protected */
    public final int d() {
        long[] jArr;
        int[] iArr;
        int d10 = super.d();
        String[] strArr = this.f48420c;
        int i10 = 0;
        if (strArr != null && strArr.length > 0) {
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            while (true) {
                String[] strArr2 = this.f48420c;
                if (i11 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i11];
                if (str != null) {
                    i13++;
                    i12 += R1.r(str);
                }
                i11++;
            }
            d10 = d10 + i12 + i13;
        }
        String[] strArr3 = this.f48421d;
        if (strArr3 != null && strArr3.length > 0) {
            int i14 = 0;
            int i15 = 0;
            int i16 = 0;
            while (true) {
                String[] strArr4 = this.f48421d;
                if (i14 >= strArr4.length) {
                    break;
                }
                String str2 = strArr4[i14];
                if (str2 != null) {
                    i16++;
                    i15 += R1.r(str2);
                }
                i14++;
            }
            d10 = d10 + i15 + i16;
        }
        int[] iArr2 = this.f48422e;
        if (iArr2 != null && iArr2.length > 0) {
            int i17 = 0;
            int i18 = 0;
            while (true) {
                iArr = this.f48422e;
                if (i17 >= iArr.length) {
                    break;
                }
                i18 += R1.z(iArr[i17]);
                i17++;
            }
            d10 = d10 + i18 + iArr.length;
        }
        long[] jArr2 = this.f48423f;
        if (jArr2 != null && jArr2.length > 0) {
            int i19 = 0;
            int i20 = 0;
            while (true) {
                jArr = this.f48423f;
                if (i19 >= jArr.length) {
                    break;
                }
                i20 += R1.x(jArr[i19]);
                i19++;
            }
            d10 = d10 + i20 + jArr.length;
        }
        long[] jArr3 = this.f48424g;
        if (jArr3 == null || jArr3.length <= 0) {
            return d10;
        }
        int i21 = 0;
        while (true) {
            long[] jArr4 = this.f48424g;
            if (i10 >= jArr4.length) {
                return d10 + i21 + jArr4.length;
            }
            i21 += R1.x(jArr4[i10]);
            i10++;
        }
    }

    public final /* synthetic */ X1 e() {
        return (k2) clone();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k2)) {
            return false;
        }
        k2 k2Var = (k2) obj;
        if (!W1.c(this.f48420c, k2Var.f48420c) || !W1.c(this.f48421d, k2Var.f48421d) || !W1.a(this.f48422e, k2Var.f48422e) || !W1.b(this.f48423f, k2Var.f48423f) || !W1.b(this.f48424g, k2Var.f48424g)) {
            return false;
        }
        U1 u12 = this.f48261b;
        if (u12 != null && !u12.a()) {
            return this.f48261b.equals(k2Var.f48261b);
        }
        U1 u13 = k2Var.f48261b;
        return u13 == null || u13.a();
    }

    public final /* synthetic */ T1 f() {
        return (k2) clone();
    }

    public final int hashCode() {
        int hashCode = (((((((((((k2.class.getName().hashCode() + 527) * 31) + W1.f(this.f48420c)) * 31) + W1.f(this.f48421d)) * 31) + W1.d(this.f48422e)) * 31) + W1.e(this.f48423f)) * 31) + W1.e(this.f48424g)) * 31;
        U1 u12 = this.f48261b;
        return hashCode + ((u12 == null || u12.a()) ? 0 : this.f48261b.hashCode());
    }
}
