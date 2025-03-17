package androidx.media3.exoplayer;

import G3.C6478B;
import G3.C6479C;
import G3.C6484d;
import G3.a0;
import G3.k0;
import G3.r;
import I3.C;
import I3.D;
import I3.x;
import J3.C6569b;
import java.io.IOException;
import q3.J;
import t3.C5950a;
import t3.q;

final class Z {

    /* renamed from: a  reason: collision with root package name */
    public final C6478B f22624a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f22625b;

    /* renamed from: c  reason: collision with root package name */
    public final a0[] f22626c;

    /* renamed from: d  reason: collision with root package name */
    public final long f22627d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f22628e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f22629f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f22630g;

    /* renamed from: h  reason: collision with root package name */
    public C5224a0 f22631h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f22632i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean[] f22633j;

    /* renamed from: k  reason: collision with root package name */
    private final v0[] f22634k;

    /* renamed from: l  reason: collision with root package name */
    private final C f22635l;

    /* renamed from: m  reason: collision with root package name */
    private final q0 f22636m;

    /* renamed from: n  reason: collision with root package name */
    private Z f22637n;

    /* renamed from: o  reason: collision with root package name */
    private k0 f22638o = k0.f35937d;

    /* renamed from: p  reason: collision with root package name */
    private D f22639p;

    /* renamed from: q  reason: collision with root package name */
    private long f22640q;

    interface a {
        Z a(C5224a0 a0Var, long j10);
    }

    public Z(v0[] v0VarArr, long j10, C c10, C6569b bVar, q0 q0Var, C5224a0 a0Var, D d10, long j11) {
        v0[] v0VarArr2 = v0VarArr;
        C5224a0 a0Var2 = a0Var;
        this.f22634k = v0VarArr2;
        this.f22640q = j10;
        this.f22635l = c10;
        this.f22636m = q0Var;
        C6479C.b bVar2 = a0Var2.f22647a;
        this.f22625b = bVar2.f35620a;
        this.f22631h = a0Var2;
        this.f22627d = j11;
        this.f22639p = d10;
        this.f22626c = new a0[v0VarArr2.length];
        this.f22633j = new boolean[v0VarArr2.length];
        this.f22624a = f(bVar2, q0Var, bVar, a0Var2.f22648b, a0Var2.f22650d);
    }

    private void c(a0[] a0VarArr) {
        int i10 = 0;
        while (true) {
            v0[] v0VarArr = this.f22634k;
            if (i10 < v0VarArr.length) {
                if (v0VarArr[i10].i() == -2 && this.f22639p.c(i10)) {
                    a0VarArr[i10] = new r();
                }
                i10++;
            } else {
                return;
            }
        }
    }

    private static C6478B f(C6479C.b bVar, q0 q0Var, C6569b bVar2, long j10, long j11) {
        C6478B h10 = q0Var.h(bVar, bVar2, j10);
        return j11 != -9223372036854775807L ? new C6484d(h10, true, 0, j11) : h10;
    }

    private void g() {
        if (u()) {
            int i10 = 0;
            while (true) {
                D d10 = this.f22639p;
                if (i10 < d10.f36665a) {
                    boolean c10 = d10.c(i10);
                    x xVar = this.f22639p.f36667c[i10];
                    if (c10 && xVar != null) {
                        xVar.c();
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    private void h(a0[] a0VarArr) {
        int i10 = 0;
        while (true) {
            v0[] v0VarArr = this.f22634k;
            if (i10 < v0VarArr.length) {
                if (v0VarArr[i10].i() == -2) {
                    a0VarArr[i10] = null;
                }
                i10++;
            } else {
                return;
            }
        }
    }

    private void i() {
        if (u()) {
            int i10 = 0;
            while (true) {
                D d10 = this.f22639p;
                if (i10 < d10.f36665a) {
                    boolean c10 = d10.c(i10);
                    x xVar = this.f22639p.f36667c[i10];
                    if (c10 && xVar != null) {
                        xVar.j();
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    private boolean u() {
        return this.f22637n == null;
    }

    private static void y(q0 q0Var, C6478B b10) {
        try {
            if (b10 instanceof C6484d) {
                q0Var.A(((C6484d) b10).f35834a);
            } else {
                q0Var.A(b10);
            }
        } catch (RuntimeException e10) {
            q.d("MediaPeriodHolder", "Period release failed.", e10);
        }
    }

    public void A(Z z10) {
        if (z10 != this.f22637n) {
            g();
            this.f22637n = z10;
            i();
        }
    }

    public void B(long j10) {
        this.f22640q = j10;
    }

    public long C(long j10) {
        return j10 - m();
    }

    public long D(long j10) {
        return j10 + m();
    }

    public void E() {
        C6478B b10 = this.f22624a;
        if (b10 instanceof C6484d) {
            long j10 = this.f22631h.f22650d;
            if (j10 == -9223372036854775807L) {
                j10 = Long.MIN_VALUE;
            }
            ((C6484d) b10).t(0, j10);
        }
    }

    public long a(D d10, long j10, boolean z10) {
        return b(d10, j10, z10, new boolean[this.f22634k.length]);
    }

    public long b(D d10, long j10, boolean z10, boolean[] zArr) {
        D d11 = d10;
        int i10 = 0;
        while (true) {
            boolean z11 = true;
            if (i10 >= d11.f36665a) {
                break;
            }
            boolean[] zArr2 = this.f22633j;
            if (z10 || !d10.b(this.f22639p, i10)) {
                z11 = false;
            }
            zArr2[i10] = z11;
            i10++;
        }
        h(this.f22626c);
        g();
        this.f22639p = d11;
        i();
        long g10 = this.f22624a.g(d11.f36667c, this.f22633j, this.f22626c, zArr, j10);
        c(this.f22626c);
        this.f22630g = false;
        int i11 = 0;
        while (true) {
            a0[] a0VarArr = this.f22626c;
            if (i11 >= a0VarArr.length) {
                return g10;
            }
            if (a0VarArr[i11] != null) {
                C5950a.g(d10.c(i11));
                if (this.f22634k[i11].i() != -2) {
                    this.f22630g = true;
                }
            } else {
                C5950a.g(d11.f36667c[i11] == null);
            }
            i11++;
        }
    }

    public boolean d(C5224a0 a0Var) {
        if (c0.d(this.f22631h.f22651e, a0Var.f22651e)) {
            C5224a0 a0Var2 = this.f22631h;
            return a0Var2.f22648b == a0Var.f22648b && a0Var2.f22647a.equals(a0Var.f22647a);
        }
    }

    public void e(Y y10) {
        C5950a.g(u());
        this.f22624a.b(y10);
    }

    public long j() {
        if (!this.f22629f) {
            return this.f22631h.f22648b;
        }
        long d10 = this.f22630g ? this.f22624a.d() : Long.MIN_VALUE;
        return d10 == Long.MIN_VALUE ? this.f22631h.f22651e : d10;
    }

    public Z k() {
        return this.f22637n;
    }

    public long l() {
        if (!this.f22629f) {
            return 0;
        }
        return this.f22624a.c();
    }

    public long m() {
        return this.f22640q;
    }

    public long n() {
        return this.f22631h.f22648b + this.f22640q;
    }

    public k0 o() {
        return this.f22638o;
    }

    public D p() {
        return this.f22639p;
    }

    public void q(float f10, J j10, boolean z10) {
        this.f22629f = true;
        this.f22638o = this.f22624a.s();
        D z11 = z(f10, j10, z10);
        C5224a0 a0Var = this.f22631h;
        long j11 = a0Var.f22648b;
        long j12 = a0Var.f22651e;
        if (j12 != -9223372036854775807L && j11 >= j12) {
            j11 = Math.max(0, j12 - 1);
        }
        long a10 = a(z11, j11, false);
        long j13 = this.f22640q;
        C5224a0 a0Var2 = this.f22631h;
        this.f22640q = j13 + (a0Var2.f22648b - a10);
        this.f22631h = a0Var2.b(a10);
    }

    public boolean r() {
        try {
            if (!this.f22629f) {
                this.f22624a.o();
            } else {
                for (a0 a0Var : this.f22626c) {
                    if (a0Var != null) {
                        a0Var.g();
                    }
                }
            }
            return false;
        } catch (IOException unused) {
            return true;
        }
    }

    public boolean s() {
        return this.f22629f && (!this.f22630g || this.f22624a.d() == Long.MIN_VALUE);
    }

    public boolean t() {
        return this.f22629f && (s() || j() - this.f22631h.f22648b >= this.f22627d);
    }

    public void v(C6478B.a aVar, long j10) {
        this.f22628e = true;
        this.f22624a.j(aVar, j10);
    }

    public void w(long j10) {
        C5950a.g(u());
        if (this.f22629f) {
            this.f22624a.e(C(j10));
        }
    }

    public void x() {
        g();
        y(this.f22636m, this.f22624a);
    }

    public D z(float f10, J j10, boolean z10) {
        D k10 = this.f22635l.k(this.f22634k, o(), this.f22631h.f22647a, j10);
        for (int i10 = 0; i10 < k10.f36665a; i10++) {
            boolean z11 = true;
            if (k10.c(i10)) {
                if (k10.f36667c[i10] == null && this.f22634k[i10].i() != -2) {
                    z11 = false;
                }
                C5950a.g(z11);
            } else {
                if (k10.f36667c[i10] != null) {
                    z11 = false;
                }
                C5950a.g(z11);
            }
        }
        for (x xVar : k10.f36667c) {
            if (xVar != null) {
                xVar.e(f10);
                xVar.i(z10);
            }
        }
        return k10;
    }
}
