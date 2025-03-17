package t4;

import N3.O;
import N3.r;
import kb.C9967v;
import q3.C5807s;
import t3.A;
import t3.B;
import t3.C5950a;
import t3.N;
import t4.L;
import t4.v;

public final class u implements C8788m {

    /* renamed from: a  reason: collision with root package name */
    private final B f56508a = new B(new byte[15], 2);

    /* renamed from: b  reason: collision with root package name */
    private final A f56509b = new A();

    /* renamed from: c  reason: collision with root package name */
    private final B f56510c = new B();

    /* renamed from: d  reason: collision with root package name */
    private int f56511d = 0;

    /* renamed from: e  reason: collision with root package name */
    private String f56512e;

    /* renamed from: f  reason: collision with root package name */
    private O f56513f;

    /* renamed from: g  reason: collision with root package name */
    private double f56514g = -9.223372036854776E18d;

    /* renamed from: h  reason: collision with root package name */
    private double f56515h = -9.223372036854776E18d;

    /* renamed from: i  reason: collision with root package name */
    private boolean f56516i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f56517j = true;

    /* renamed from: k  reason: collision with root package name */
    private int f56518k;

    /* renamed from: l  reason: collision with root package name */
    private int f56519l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f56520m = true;

    /* renamed from: n  reason: collision with root package name */
    private int f56521n;

    /* renamed from: o  reason: collision with root package name */
    private int f56522o;

    /* renamed from: p  reason: collision with root package name */
    private v.b f56523p = new v.b();

    /* renamed from: q  reason: collision with root package name */
    private int f56524q = -2147483647;

    /* renamed from: r  reason: collision with root package name */
    private int f56525r = -1;

    /* renamed from: s  reason: collision with root package name */
    private int f56526s;

    /* renamed from: t  reason: collision with root package name */
    private long f56527t = -1;

    /* renamed from: u  reason: collision with root package name */
    private boolean f56528u;

    private void b(B b10, B b11, boolean z10) {
        int f10 = b10.f();
        int min = Math.min(b10.a(), b11.a());
        b10.l(b11.e(), b11.f(), min);
        b11.X(min);
        if (z10) {
            b10.W(f10);
        }
    }

    private void g() {
        int i10;
        if (this.f56528u) {
            this.f56517j = false;
            i10 = 1;
        } else {
            i10 = 0;
        }
        double d10 = (((double) (this.f56525r - this.f56526s)) * 1000000.0d) / ((double) this.f56524q);
        long round = Math.round(this.f56514g);
        if (this.f56516i) {
            this.f56516i = false;
            this.f56514g = this.f56515h;
        } else {
            this.f56514g += d10;
        }
        this.f56513f.c(round, i10, this.f56522o, 0, (O.a) null);
        this.f56528u = false;
        this.f56526s = 0;
        this.f56522o = 0;
    }

    private void h(A a10) {
        v.c h10 = v.h(a10);
        this.f56524q = h10.f56533b;
        this.f56525r = h10.f56534c;
        long j10 = this.f56527t;
        long j11 = this.f56523p.f56530b;
        if (j10 != j11) {
            this.f56527t = j11;
            String str = "mhm1";
            if (h10.f56532a != -1) {
                str = str + String.format(".%02X", new Object[]{Integer.valueOf(h10.f56532a)});
            }
            byte[] bArr = h10.f56535d;
            this.f56513f.e(new C5807s.b().e0(this.f56512e).s0("audio/mhm1").t0(this.f56524q).R(str).f0((bArr == null || bArr.length <= 0) ? null : C9967v.G(N.f29467f, bArr)).M());
        }
        this.f56528u = true;
    }

    private boolean i() {
        int g10 = this.f56508a.g();
        this.f56509b.o(this.f56508a.e(), g10);
        boolean g11 = v.g(this.f56509b, this.f56523p);
        if (g11) {
            this.f56521n = 0;
            this.f56522o += this.f56523p.f56531c + g10;
        }
        return g11;
    }

    private boolean j(int i10) {
        return i10 == 1 || i10 == 17;
    }

    private boolean k(B b10) {
        int i10 = this.f56518k;
        if ((i10 & 2) == 0) {
            b10.W(b10.g());
            return false;
        } else if ((i10 & 4) != 0) {
            return true;
        } else {
            while (b10.a() > 0) {
                int i11 = this.f56519l << 8;
                this.f56519l = i11;
                int H10 = i11 | b10.H();
                this.f56519l = H10;
                if (v.e(H10)) {
                    b10.W(b10.f() - 3);
                    this.f56519l = 0;
                    return true;
                }
            }
            return false;
        }
    }

    private void l(B b10) {
        int min = Math.min(b10.a(), this.f56523p.f56531c - this.f56521n);
        this.f56513f.a(b10, min);
        this.f56521n += min;
    }

    public void a(B b10) {
        C5950a.i(this.f56513f);
        while (b10.a() > 0) {
            int i10 = this.f56511d;
            if (i10 != 0) {
                if (i10 == 1) {
                    b(b10, this.f56508a, false);
                    if (this.f56508a.a() != 0) {
                        this.f56520m = false;
                    } else if (i()) {
                        this.f56508a.W(0);
                        O o10 = this.f56513f;
                        B b11 = this.f56508a;
                        o10.a(b11, b11.g());
                        this.f56508a.S(2);
                        this.f56510c.S(this.f56523p.f56531c);
                        this.f56520m = true;
                        this.f56511d = 2;
                    } else if (this.f56508a.g() < 15) {
                        B b12 = this.f56508a;
                        b12.V(b12.g() + 1);
                        this.f56520m = false;
                    }
                } else if (i10 == 2) {
                    if (j(this.f56523p.f56529a)) {
                        b(b10, this.f56510c, true);
                    }
                    l(b10);
                    int i11 = this.f56521n;
                    v.b bVar = this.f56523p;
                    if (i11 == bVar.f56531c) {
                        int i12 = bVar.f56529a;
                        if (i12 == 1) {
                            h(new A(this.f56510c.e()));
                        } else if (i12 == 17) {
                            this.f56526s = v.f(new A(this.f56510c.e()));
                        } else if (i12 == 2) {
                            g();
                        }
                        this.f56511d = 1;
                    }
                } else {
                    throw new IllegalStateException();
                }
            } else if (k(b10)) {
                this.f56511d = 1;
            }
        }
    }

    public void c() {
        this.f56511d = 0;
        this.f56519l = 0;
        this.f56508a.S(2);
        this.f56521n = 0;
        this.f56522o = 0;
        this.f56524q = -2147483647;
        this.f56525r = -1;
        this.f56526s = 0;
        this.f56527t = -1;
        this.f56528u = false;
        this.f56516i = false;
        this.f56520m = true;
        this.f56517j = true;
        this.f56514g = -9.223372036854776E18d;
        this.f56515h = -9.223372036854776E18d;
    }

    public void d(r rVar, L.d dVar) {
        dVar.a();
        this.f56512e = dVar.b();
        this.f56513f = rVar.t(dVar.c(), 1);
    }

    public void e(boolean z10) {
    }

    public void f(long j10, int i10) {
        this.f56518k = i10;
        if (!this.f56517j && (this.f56522o != 0 || !this.f56520m)) {
            this.f56516i = true;
        }
        if (j10 == -9223372036854775807L) {
            return;
        }
        if (this.f56516i) {
            this.f56515h = (double) j10;
        } else {
            this.f56514g = (double) j10;
        }
    }
}
