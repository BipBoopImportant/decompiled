package z3;

import G3.c0;
import android.util.Pair;
import q3.J;
import t3.C5950a;

/* renamed from: z3.a  reason: case insensitive filesystem */
public abstract class C6278a extends J {

    /* renamed from: e  reason: collision with root package name */
    private final int f32403e;

    /* renamed from: f  reason: collision with root package name */
    private final c0 f32404f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f32405g;

    public C6278a(boolean z10, c0 c0Var) {
        this.f32405g = z10;
        this.f32404f = c0Var;
        this.f32403e = c0Var.getLength();
    }

    private int B(int i10, boolean z10) {
        if (z10) {
            return this.f32404f.c(i10);
        }
        if (i10 < this.f32403e - 1) {
            return i10 + 1;
        }
        return -1;
    }

    private int C(int i10, boolean z10) {
        if (z10) {
            return this.f32404f.b(i10);
        }
        if (i10 > 0) {
            return i10 - 1;
        }
        return -1;
    }

    public static Object v(Object obj) {
        return ((Pair) obj).second;
    }

    public static Object w(Object obj) {
        return ((Pair) obj).first;
    }

    public static Object y(Object obj, Object obj2) {
        return Pair.create(obj, obj2);
    }

    /* access modifiers changed from: protected */
    public abstract int A(int i10);

    /* access modifiers changed from: protected */
    public abstract J D(int i10);

    public int a(boolean z10) {
        if (this.f32403e == 0) {
            return -1;
        }
        int i10 = 0;
        if (this.f32405g) {
            z10 = false;
        }
        if (z10) {
            i10 = this.f32404f.f();
        }
        while (D(i10).q()) {
            i10 = B(i10, z10);
            if (i10 == -1) {
                return -1;
            }
        }
        return A(i10) + D(i10).a(z10);
    }

    public final int b(Object obj) {
        int b10;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Object w10 = w(obj);
        Object v10 = v(obj);
        int s10 = s(w10);
        if (s10 == -1 || (b10 = D(s10).b(v10)) == -1) {
            return -1;
        }
        return z(s10) + b10;
    }

    public int c(boolean z10) {
        int i10 = this.f32403e;
        if (i10 == 0) {
            return -1;
        }
        if (this.f32405g) {
            z10 = false;
        }
        int d10 = z10 ? this.f32404f.d() : i10 - 1;
        while (D(d10).q()) {
            d10 = C(d10, z10);
            if (d10 == -1) {
                return -1;
            }
        }
        return A(d10) + D(d10).c(z10);
    }

    public int e(int i10, int i11, boolean z10) {
        int i12 = 0;
        if (this.f32405g) {
            if (i11 == 1) {
                i11 = 2;
            }
            z10 = false;
        }
        int u10 = u(i10);
        int A10 = A(u10);
        J D10 = D(u10);
        int i13 = i10 - A10;
        if (i11 != 2) {
            i12 = i11;
        }
        int e10 = D10.e(i13, i12, z10);
        if (e10 != -1) {
            return A10 + e10;
        }
        int B10 = B(u10, z10);
        while (B10 != -1 && D(B10).q()) {
            B10 = B(B10, z10);
        }
        if (B10 != -1) {
            return A(B10) + D(B10).a(z10);
        }
        if (i11 == 2) {
            return a(z10);
        }
        return -1;
    }

    public final J.b g(int i10, J.b bVar, boolean z10) {
        int t10 = t(i10);
        int A10 = A(t10);
        D(t10).g(i10 - z(t10), bVar, z10);
        bVar.f27904c += A10;
        if (z10) {
            bVar.f27903b = y(x(t10), C5950a.e(bVar.f27903b));
        }
        return bVar;
    }

    public final J.b h(Object obj, J.b bVar) {
        Object w10 = w(obj);
        Object v10 = v(obj);
        int s10 = s(w10);
        int A10 = A(s10);
        D(s10).h(v10, bVar);
        bVar.f27904c += A10;
        bVar.f27903b = obj;
        return bVar;
    }

    public int l(int i10, int i11, boolean z10) {
        int i12 = 0;
        if (this.f32405g) {
            if (i11 == 1) {
                i11 = 2;
            }
            z10 = false;
        }
        int u10 = u(i10);
        int A10 = A(u10);
        J D10 = D(u10);
        int i13 = i10 - A10;
        if (i11 != 2) {
            i12 = i11;
        }
        int l10 = D10.l(i13, i12, z10);
        if (l10 != -1) {
            return A10 + l10;
        }
        int C10 = C(u10, z10);
        while (C10 != -1 && D(C10).q()) {
            C10 = C(C10, z10);
        }
        if (C10 != -1) {
            return A(C10) + D(C10).c(z10);
        }
        if (i11 == 2) {
            return c(z10);
        }
        return -1;
    }

    public final Object m(int i10) {
        int t10 = t(i10);
        return y(x(t10), D(t10).m(i10 - z(t10)));
    }

    public final J.c o(int i10, J.c cVar, long j10) {
        int u10 = u(i10);
        int A10 = A(u10);
        int z10 = z(u10);
        D(u10).o(i10 - A10, cVar, j10);
        Object x10 = x(u10);
        if (!J.c.f27915q.equals(cVar.f27925a)) {
            x10 = y(x10, cVar.f27925a);
        }
        cVar.f27925a = x10;
        cVar.f27938n += z10;
        cVar.f27939o += z10;
        return cVar;
    }

    /* access modifiers changed from: protected */
    public abstract int s(Object obj);

    /* access modifiers changed from: protected */
    public abstract int t(int i10);

    /* access modifiers changed from: protected */
    public abstract int u(int i10);

    /* access modifiers changed from: protected */
    public abstract Object x(int i10);

    /* access modifiers changed from: protected */
    public abstract int z(int i10);
}
