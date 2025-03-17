package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.u0;
import java.util.Arrays;

public final class p0 {

    /* renamed from: f  reason: collision with root package name */
    private static final p0 f21405f = new p0(0, new int[0], new Object[0], false);

    /* renamed from: a  reason: collision with root package name */
    private int f21406a;

    /* renamed from: b  reason: collision with root package name */
    private int[] f21407b;

    /* renamed from: c  reason: collision with root package name */
    private Object[] f21408c;

    /* renamed from: d  reason: collision with root package name */
    private int f21409d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f21410e;

    private p0() {
        this(0, new int[8], new Object[8], true);
    }

    private void b(int i10) {
        int[] iArr = this.f21407b;
        if (i10 > iArr.length) {
            int i11 = this.f21406a;
            int i12 = i11 + (i11 / 2);
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.f21407b = Arrays.copyOf(iArr, i10);
            this.f21408c = Arrays.copyOf(this.f21408c, i10);
        }
    }

    public static p0 c() {
        return f21405f;
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
        int i10 = p0Var.f21406a + p0Var2.f21406a;
        int[] copyOf = Arrays.copyOf(p0Var.f21407b, i10);
        System.arraycopy(p0Var2.f21407b, 0, copyOf, p0Var.f21406a, p0Var2.f21406a);
        Object[] copyOf2 = Arrays.copyOf(p0Var.f21408c, i10);
        System.arraycopy(p0Var2.f21408c, 0, copyOf2, p0Var.f21406a, p0Var2.f21406a);
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

    private static void q(int i10, Object obj, u0 u0Var) {
        int a10 = t0.a(i10);
        int b10 = t0.b(i10);
        if (b10 == 0) {
            u0Var.u(a10, ((Long) obj).longValue());
        } else if (b10 == 1) {
            u0Var.s(a10, ((Long) obj).longValue());
        } else if (b10 == 2) {
            u0Var.K(a10, (C5154g) obj);
        } else if (b10 != 3) {
            if (b10 == 5) {
                u0Var.c(a10, ((Integer) obj).intValue());
                return;
            }
            throw new RuntimeException(A.e());
        } else if (u0Var.t() == u0.a.ASCENDING) {
            u0Var.x(a10);
            ((p0) obj).r(u0Var);
            u0Var.C(a10);
        } else {
            u0Var.C(a10);
            ((p0) obj).r(u0Var);
            u0Var.x(a10);
        }
    }

    /* access modifiers changed from: package-private */
    public void a() {
        if (!this.f21410e) {
            throw new UnsupportedOperationException();
        }
    }

    public int d() {
        int X10;
        int i10 = this.f21409d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f21406a; i12++) {
            int i13 = this.f21407b[i12];
            int a10 = t0.a(i13);
            int b10 = t0.b(i13);
            if (b10 == 0) {
                X10 = C5157j.X(a10, ((Long) this.f21408c[i12]).longValue());
            } else if (b10 == 1) {
                X10 = C5157j.o(a10, ((Long) this.f21408c[i12]).longValue());
            } else if (b10 == 2) {
                X10 = C5157j.g(a10, (C5154g) this.f21408c[i12]);
            } else if (b10 == 3) {
                X10 = (C5157j.U(a10) * 2) + ((p0) this.f21408c[i12]).d();
            } else if (b10 == 5) {
                X10 = C5157j.m(a10, ((Integer) this.f21408c[i12]).intValue());
            } else {
                throw new IllegalStateException(A.e());
            }
            i11 += X10;
        }
        this.f21409d = i11;
        return i11;
    }

    public int e() {
        int i10 = this.f21409d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f21406a; i12++) {
            i11 += C5157j.J(t0.a(this.f21407b[i12]), (C5154g) this.f21408c[i12]);
        }
        this.f21409d = i11;
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
        int i10 = this.f21406a;
        return i10 == p0Var.f21406a && o(this.f21407b, p0Var.f21407b, i10) && l(this.f21408c, p0Var.f21408c, this.f21406a);
    }

    public void h() {
        if (this.f21410e) {
            this.f21410e = false;
        }
    }

    public int hashCode() {
        int i10 = this.f21406a;
        return ((((527 + i10) * 31) + f(this.f21407b, i10)) * 31) + g(this.f21408c, this.f21406a);
    }

    /* access modifiers changed from: package-private */
    public p0 i(p0 p0Var) {
        if (p0Var.equals(c())) {
            return this;
        }
        a();
        int i10 = this.f21406a + p0Var.f21406a;
        b(i10);
        System.arraycopy(p0Var.f21407b, 0, this.f21407b, this.f21406a, p0Var.f21406a);
        System.arraycopy(p0Var.f21408c, 0, this.f21408c, this.f21406a, p0Var.f21406a);
        this.f21406a = i10;
        return this;
    }

    /* access modifiers changed from: package-private */
    public final void m(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < this.f21406a; i11++) {
            U.d(sb2, i10, String.valueOf(t0.a(this.f21407b[i11])), this.f21408c[i11]);
        }
    }

    /* access modifiers changed from: package-private */
    public void n(int i10, Object obj) {
        a();
        b(this.f21406a + 1);
        int[] iArr = this.f21407b;
        int i11 = this.f21406a;
        iArr[i11] = i10;
        this.f21408c[i11] = obj;
        this.f21406a = i11 + 1;
    }

    /* access modifiers changed from: package-private */
    public void p(u0 u0Var) {
        if (u0Var.t() == u0.a.DESCENDING) {
            for (int i10 = this.f21406a - 1; i10 >= 0; i10--) {
                u0Var.b(t0.a(this.f21407b[i10]), this.f21408c[i10]);
            }
            return;
        }
        for (int i11 = 0; i11 < this.f21406a; i11++) {
            u0Var.b(t0.a(this.f21407b[i11]), this.f21408c[i11]);
        }
    }

    public void r(u0 u0Var) {
        if (this.f21406a != 0) {
            if (u0Var.t() == u0.a.ASCENDING) {
                for (int i10 = 0; i10 < this.f21406a; i10++) {
                    q(this.f21407b[i10], this.f21408c[i10], u0Var);
                }
                return;
            }
            for (int i11 = this.f21406a - 1; i11 >= 0; i11--) {
                q(this.f21407b[i11], this.f21408c[i11], u0Var);
            }
        }
    }

    private p0(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f21409d = -1;
        this.f21406a = i10;
        this.f21407b = iArr;
        this.f21408c = objArr;
        this.f21410e = z10;
    }
}
