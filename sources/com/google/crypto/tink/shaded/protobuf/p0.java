package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.v0;
import java.util.Arrays;

public final class p0 {

    /* renamed from: f  reason: collision with root package name */
    private static final p0 f68078f = new p0(0, new int[0], new Object[0], false);

    /* renamed from: a  reason: collision with root package name */
    private int f68079a;

    /* renamed from: b  reason: collision with root package name */
    private int[] f68080b;

    /* renamed from: c  reason: collision with root package name */
    private Object[] f68081c;

    /* renamed from: d  reason: collision with root package name */
    private int f68082d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f68083e;

    private p0() {
        this(0, new int[8], new Object[8], true);
    }

    private void b(int i10) {
        int[] iArr = this.f68080b;
        if (i10 > iArr.length) {
            int i11 = this.f68079a;
            int i12 = i11 + (i11 / 2);
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.f68080b = Arrays.copyOf(iArr, i10);
            this.f68081c = Arrays.copyOf(this.f68081c, i10);
        }
    }

    public static p0 c() {
        return f68078f;
    }

    private static int f(int[] iArr, int i10) {
        int i11 = 17;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 = (i11 * 31) + iArr[i12];
        }
        return i11;
    }

    private static int g(Object[] objArr, int i10) {
        int i11 = 17;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 = (i11 * 31) + objArr[i12].hashCode();
        }
        return i11;
    }

    static p0 j(p0 p0Var, p0 p0Var2) {
        int i10 = p0Var.f68079a + p0Var2.f68079a;
        int[] copyOf = Arrays.copyOf(p0Var.f68080b, i10);
        System.arraycopy(p0Var2.f68080b, 0, copyOf, p0Var.f68079a, p0Var2.f68079a);
        Object[] copyOf2 = Arrays.copyOf(p0Var.f68081c, i10);
        System.arraycopy(p0Var2.f68081c, 0, copyOf2, p0Var.f68079a, p0Var2.f68079a);
        return new p0(i10, copyOf, copyOf2, true);
    }

    static p0 k() {
        return new p0();
    }

    private static boolean l(Object[] objArr, Object[] objArr2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (!objArr[i11].equals(objArr2[i11])) {
                return false;
            }
        }
        return true;
    }

    private static boolean o(int[] iArr, int[] iArr2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (iArr[i11] != iArr2[i11]) {
                return false;
            }
        }
        return true;
    }

    private static void q(int i10, Object obj, v0 v0Var) {
        int a10 = u0.a(i10);
        int b10 = u0.b(i10);
        if (b10 == 0) {
            v0Var.u(a10, ((Long) obj).longValue());
        } else if (b10 == 1) {
            v0Var.s(a10, ((Long) obj).longValue());
        } else if (b10 == 2) {
            v0Var.M(a10, (C9525h) obj);
        } else if (b10 != 3) {
            if (b10 == 5) {
                v0Var.c(a10, ((Integer) obj).intValue());
                return;
            }
            throw new RuntimeException(B.e());
        } else if (v0Var.t() == v0.a.ASCENDING) {
            v0Var.x(a10);
            ((p0) obj).r(v0Var);
            v0Var.C(a10);
        } else {
            v0Var.C(a10);
            ((p0) obj).r(v0Var);
            v0Var.x(a10);
        }
    }

    /* access modifiers changed from: package-private */
    public void a() {
        if (!this.f68083e) {
            throw new UnsupportedOperationException();
        }
    }

    public int d() {
        int W10;
        int i10 = this.f68082d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f68079a; i12++) {
            int i13 = this.f68080b[i12];
            int a10 = u0.a(i13);
            int b10 = u0.b(i13);
            if (b10 == 0) {
                W10 = C9528k.W(a10, ((Long) this.f68081c[i12]).longValue());
            } else if (b10 == 1) {
                W10 = C9528k.o(a10, ((Long) this.f68081c[i12]).longValue());
            } else if (b10 == 2) {
                W10 = C9528k.g(a10, (C9525h) this.f68081c[i12]);
            } else if (b10 == 3) {
                W10 = (C9528k.T(a10) * 2) + ((p0) this.f68081c[i12]).d();
            } else if (b10 == 5) {
                W10 = C9528k.m(a10, ((Integer) this.f68081c[i12]).intValue());
            } else {
                throw new IllegalStateException(B.e());
            }
            i11 += W10;
        }
        this.f68082d = i11;
        return i11;
    }

    public int e() {
        int i10 = this.f68082d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f68079a; i12++) {
            i11 += C9528k.I(u0.a(this.f68080b[i12]), (C9525h) this.f68081c[i12]);
        }
        this.f68082d = i11;
        return i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        int i10 = this.f68079a;
        return i10 == p0Var.f68079a && o(this.f68080b, p0Var.f68080b, i10) && l(this.f68081c, p0Var.f68081c, this.f68079a);
    }

    public void h() {
        this.f68083e = false;
    }

    public int hashCode() {
        int i10 = this.f68079a;
        return ((((527 + i10) * 31) + f(this.f68080b, i10)) * 31) + g(this.f68081c, this.f68079a);
    }

    /* access modifiers changed from: package-private */
    public p0 i(p0 p0Var) {
        if (p0Var.equals(c())) {
            return this;
        }
        a();
        int i10 = this.f68079a + p0Var.f68079a;
        b(i10);
        System.arraycopy(p0Var.f68080b, 0, this.f68080b, this.f68079a, p0Var.f68079a);
        System.arraycopy(p0Var.f68081c, 0, this.f68081c, this.f68079a, p0Var.f68079a);
        this.f68079a = i10;
        return this;
    }

    /* access modifiers changed from: package-private */
    public final void m(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < this.f68079a; i11++) {
            U.d(sb2, i10, String.valueOf(u0.a(this.f68080b[i11])), this.f68081c[i11]);
        }
    }

    /* access modifiers changed from: package-private */
    public void n(int i10, Object obj) {
        a();
        b(this.f68079a + 1);
        int[] iArr = this.f68080b;
        int i11 = this.f68079a;
        iArr[i11] = i10;
        this.f68081c[i11] = obj;
        this.f68079a = i11 + 1;
    }

    /* access modifiers changed from: package-private */
    public void p(v0 v0Var) {
        if (v0Var.t() == v0.a.DESCENDING) {
            for (int i10 = this.f68079a - 1; i10 >= 0; i10--) {
                v0Var.b(u0.a(this.f68080b[i10]), this.f68081c[i10]);
            }
            return;
        }
        for (int i11 = 0; i11 < this.f68079a; i11++) {
            v0Var.b(u0.a(this.f68080b[i11]), this.f68081c[i11]);
        }
    }

    public void r(v0 v0Var) {
        if (this.f68079a != 0) {
            if (v0Var.t() == v0.a.ASCENDING) {
                for (int i10 = 0; i10 < this.f68079a; i10++) {
                    q(this.f68080b[i10], this.f68081c[i10], v0Var);
                }
                return;
            }
            for (int i11 = this.f68079a - 1; i11 >= 0; i11--) {
                q(this.f68080b[i11], this.f68081c[i11], v0Var);
            }
        }
    }

    private p0(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f68082d = -1;
        this.f68079a = i10;
        this.f68080b = iArr;
        this.f68081c = objArr;
        this.f68083e = z10;
    }
}
