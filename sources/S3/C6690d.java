package S3;

import N3.C6678p;
import N3.C6679q;
import N3.I;
import N3.J;
import N3.O;
import N3.r;
import N3.u;
import N3.v;
import N3.w;
import N3.x;
import N3.y;
import q3.z;
import t3.B;
import t3.C5950a;
import t3.N;

/* renamed from: S3.d  reason: case insensitive filesystem */
public final class C6690d implements C6678p {

    /* renamed from: o  reason: collision with root package name */
    public static final u f39854o = new C6689c();

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f39855a;

    /* renamed from: b  reason: collision with root package name */
    private final B f39856b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f39857c;

    /* renamed from: d  reason: collision with root package name */
    private final v.a f39858d;

    /* renamed from: e  reason: collision with root package name */
    private r f39859e;

    /* renamed from: f  reason: collision with root package name */
    private O f39860f;

    /* renamed from: g  reason: collision with root package name */
    private int f39861g;

    /* renamed from: h  reason: collision with root package name */
    private z f39862h;

    /* renamed from: i  reason: collision with root package name */
    private y f39863i;

    /* renamed from: j  reason: collision with root package name */
    private int f39864j;

    /* renamed from: k  reason: collision with root package name */
    private int f39865k;

    /* renamed from: l  reason: collision with root package name */
    private C6688b f39866l;

    /* renamed from: m  reason: collision with root package name */
    private int f39867m;

    /* renamed from: n  reason: collision with root package name */
    private long f39868n;

    public C6690d() {
        this(0);
    }

    private long e(B b10, boolean z10) {
        boolean z11;
        C5950a.e(this.f39863i);
        int f10 = b10.f();
        while (f10 <= b10.g() - 16) {
            b10.W(f10);
            if (v.d(b10, this.f39863i, this.f39865k, this.f39858d)) {
                b10.W(f10);
                return this.f39858d.f38937a;
            }
            f10++;
        }
        if (z10) {
            while (f10 <= b10.g() - this.f39864j) {
                b10.W(f10);
                boolean z12 = false;
                try {
                    z11 = v.d(b10, this.f39863i, this.f39865k, this.f39858d);
                } catch (IndexOutOfBoundsException unused) {
                    z11 = false;
                }
                if (b10.f() <= b10.g()) {
                    z12 = z11;
                }
                if (z12) {
                    b10.W(f10);
                    return this.f39858d.f38937a;
                }
                f10++;
            }
            b10.W(b10.g());
            return -1;
        }
        b10.W(f10);
        return -1;
    }

    private void f(C6679q qVar) {
        this.f39865k = w.b(qVar);
        ((r) N.i(this.f39859e)).n(g(qVar.getPosition(), qVar.getLength()));
        this.f39861g = 5;
    }

    private J g(long j10, long j11) {
        C5950a.e(this.f39863i);
        y yVar = this.f39863i;
        if (yVar.f38951k != null) {
            return new x(yVar, j10);
        }
        if (j11 == -1 || yVar.f38950j <= 0) {
            return new J.b(yVar.f());
        }
        C6688b bVar = new C6688b(yVar, this.f39865k, j10, j11);
        this.f39866l = bVar;
        return bVar.b();
    }

    private void k(C6679q qVar) {
        byte[] bArr = this.f39855a;
        qVar.o(bArr, 0, bArr.length);
        qVar.f();
        this.f39861g = 2;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ C6678p[] l() {
        return new C6678p[]{new C6690d()};
    }

    private void m() {
        ((O) N.i(this.f39860f)).c((this.f39868n * 1000000) / ((long) ((y) N.i(this.f39863i)).f38945e), 1, this.f39867m, 0, (O.a) null);
    }

    private int n(C6679q qVar, I i10) {
        boolean z10;
        C5950a.e(this.f39860f);
        C5950a.e(this.f39863i);
        C6688b bVar = this.f39866l;
        if (bVar != null && bVar.d()) {
            return this.f39866l.c(qVar, i10);
        }
        if (this.f39868n == -1) {
            this.f39868n = v.i(qVar, this.f39863i);
            return 0;
        }
        int g10 = this.f39856b.g();
        if (g10 < 32768) {
            int c10 = qVar.c(this.f39856b.e(), g10, 32768 - g10);
            z10 = c10 == -1;
            if (!z10) {
                this.f39856b.V(g10 + c10);
            } else if (this.f39856b.a() == 0) {
                m();
                return -1;
            }
        } else {
            z10 = false;
        }
        int f10 = this.f39856b.f();
        int i11 = this.f39867m;
        int i12 = this.f39864j;
        if (i11 < i12) {
            B b10 = this.f39856b;
            b10.X(Math.min(i12 - i11, b10.a()));
        }
        long e10 = e(this.f39856b, z10);
        int f11 = this.f39856b.f() - f10;
        this.f39856b.W(f10);
        this.f39860f.a(this.f39856b, f11);
        this.f39867m += f11;
        if (e10 != -1) {
            m();
            this.f39867m = 0;
            this.f39868n = e10;
        }
        if (this.f39856b.a() < 16) {
            int a10 = this.f39856b.a();
            System.arraycopy(this.f39856b.e(), this.f39856b.f(), this.f39856b.e(), 0, a10);
            this.f39856b.W(0);
            this.f39856b.V(a10);
        }
        return 0;
    }

    private void o(C6679q qVar) {
        this.f39862h = w.d(qVar, !this.f39857c);
        this.f39861g = 1;
    }

    private void p(C6679q qVar) {
        w.a aVar = new w.a(this.f39863i);
        boolean z10 = false;
        while (!z10) {
            z10 = w.e(qVar, aVar);
            this.f39863i = (y) N.i(aVar.f38938a);
        }
        C5950a.e(this.f39863i);
        this.f39864j = Math.max(this.f39863i.f38943c, 6);
        ((O) N.i(this.f39860f)).e(this.f39863i.g(this.f39855a, this.f39862h));
        this.f39861g = 4;
    }

    private void q(C6679q qVar) {
        w.i(qVar);
        this.f39861g = 3;
    }

    public void a(long j10, long j11) {
        long j12 = 0;
        if (j10 == 0) {
            this.f39861g = 0;
        } else {
            C6688b bVar = this.f39866l;
            if (bVar != null) {
                bVar.h(j11);
            }
        }
        if (j11 != 0) {
            j12 = -1;
        }
        this.f39868n = j12;
        this.f39867m = 0;
        this.f39856b.S(0);
    }

    public void b(r rVar) {
        this.f39859e = rVar;
        this.f39860f = rVar.t(0, 1);
        rVar.r();
    }

    public boolean h(C6679q qVar) {
        w.c(qVar, false);
        return w.a(qVar);
    }

    public int j(C6679q qVar, I i10) {
        int i11 = this.f39861g;
        if (i11 == 0) {
            o(qVar);
            return 0;
        } else if (i11 == 1) {
            k(qVar);
            return 0;
        } else if (i11 == 2) {
            q(qVar);
            return 0;
        } else if (i11 == 3) {
            p(qVar);
            return 0;
        } else if (i11 == 4) {
            f(qVar);
            return 0;
        } else if (i11 == 5) {
            return n(qVar, i10);
        } else {
            throw new IllegalStateException();
        }
    }

    public void release() {
    }

    public C6690d(int i10) {
        this.f39855a = new byte[42];
        this.f39856b = new B(new byte[32768], 0);
        this.f39857c = (i10 & 1) == 0 ? false : true;
        this.f39858d = new v.a();
        this.f39861g = 0;
    }
}
