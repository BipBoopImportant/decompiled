package G3;

import G3.C6478B;
import I3.x;
import androidx.media3.exoplayer.Y;
import t3.C5950a;
import y3.f;
import z3.D;
import z3.J;

final class h0 implements C6478B, C6478B.a {

    /* renamed from: a  reason: collision with root package name */
    private final C6478B f35929a;

    /* renamed from: b  reason: collision with root package name */
    private final long f35930b;

    /* renamed from: c  reason: collision with root package name */
    private C6478B.a f35931c;

    private static final class a implements a0 {

        /* renamed from: a  reason: collision with root package name */
        private final a0 f35932a;

        /* renamed from: b  reason: collision with root package name */
        private final long f35933b;

        public a(a0 a0Var, long j10) {
            this.f35932a = a0Var;
            this.f35933b = j10;
        }

        public a0 a() {
            return this.f35932a;
        }

        public boolean f() {
            return this.f35932a.f();
        }

        public void g() {
            this.f35932a.g();
        }

        public int h(D d10, f fVar, int i10) {
            int h10 = this.f35932a.h(d10, fVar, i10);
            if (h10 == -4) {
                fVar.f32281f += this.f35933b;
            }
            return h10;
        }

        public int i(long j10) {
            return this.f35932a.i(j10 - this.f35933b);
        }
    }

    public h0(C6478B b10, long j10) {
        this.f35929a = b10;
        this.f35930b = j10;
    }

    public boolean a() {
        return this.f35929a.a();
    }

    public boolean b(Y y10) {
        return this.f35929a.b(y10.a().f(y10.f22618a - this.f35930b).d());
    }

    public long c() {
        long c10 = this.f35929a.c();
        if (c10 == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return this.f35930b + c10;
    }

    public long d() {
        long d10 = this.f35929a.d();
        if (d10 == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return this.f35930b + d10;
    }

    public void e(long j10) {
        this.f35929a.e(j10 - this.f35930b);
    }

    public void f(C6478B b10) {
        ((C6478B.a) C5950a.e(this.f35931c)).f(this);
    }

    public long g(x[] xVarArr, boolean[] zArr, a0[] a0VarArr, boolean[] zArr2, long j10) {
        a0[] a0VarArr2 = a0VarArr;
        a0[] a0VarArr3 = new a0[a0VarArr2.length];
        int i10 = 0;
        while (true) {
            a0 a0Var = null;
            if (i10 >= a0VarArr2.length) {
                break;
            }
            a aVar = (a) a0VarArr2[i10];
            if (aVar != null) {
                a0Var = aVar.a();
            }
            a0VarArr3[i10] = a0Var;
            i10++;
        }
        long g10 = this.f35929a.g(xVarArr, zArr, a0VarArr3, zArr2, j10 - this.f35930b);
        for (int i11 = 0; i11 < a0VarArr2.length; i11++) {
            a0 a0Var2 = a0VarArr3[i11];
            if (a0Var2 == null) {
                a0VarArr2[i11] = null;
            } else {
                a0 a0Var3 = a0VarArr2[i11];
                if (a0Var3 == null || ((a) a0Var3).a() != a0Var2) {
                    a0VarArr2[i11] = new a(a0Var2, this.f35930b);
                }
            }
        }
        return g10 + this.f35930b;
    }

    public long i(long j10) {
        return this.f35929a.i(j10 - this.f35930b) + this.f35930b;
    }

    public void j(C6478B.a aVar, long j10) {
        this.f35931c = aVar;
        this.f35929a.j(this, j10 - this.f35930b);
    }

    public C6478B k() {
        return this.f35929a;
    }

    public long l() {
        long l10 = this.f35929a.l();
        if (l10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return this.f35930b + l10;
    }

    /* renamed from: m */
    public void h(C6478B b10) {
        ((C6478B.a) C5950a.e(this.f35931c)).h(this);
    }

    public void o() {
        this.f35929a.o();
    }

    public long p(long j10, J j11) {
        return this.f35929a.p(j10 - this.f35930b, j11) + this.f35930b;
    }

    public k0 s() {
        return this.f35929a.s();
    }

    public void u(long j10, boolean z10) {
        this.f35929a.u(j10 - this.f35930b, z10);
    }
}
