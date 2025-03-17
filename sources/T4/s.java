package t4;

import N3.C6663a;
import N3.O;
import N3.r;
import java.util.Collections;
import q3.C5807s;
import t3.A;
import t3.B;
import t3.C5950a;
import t4.L;

public final class s implements C8788m {

    /* renamed from: a  reason: collision with root package name */
    private final String f56473a;

    /* renamed from: b  reason: collision with root package name */
    private final int f56474b;

    /* renamed from: c  reason: collision with root package name */
    private final B f56475c;

    /* renamed from: d  reason: collision with root package name */
    private final A f56476d;

    /* renamed from: e  reason: collision with root package name */
    private O f56477e;

    /* renamed from: f  reason: collision with root package name */
    private String f56478f;

    /* renamed from: g  reason: collision with root package name */
    private C5807s f56479g;

    /* renamed from: h  reason: collision with root package name */
    private int f56480h;

    /* renamed from: i  reason: collision with root package name */
    private int f56481i;

    /* renamed from: j  reason: collision with root package name */
    private int f56482j;

    /* renamed from: k  reason: collision with root package name */
    private int f56483k;

    /* renamed from: l  reason: collision with root package name */
    private long f56484l = -9223372036854775807L;

    /* renamed from: m  reason: collision with root package name */
    private boolean f56485m;

    /* renamed from: n  reason: collision with root package name */
    private int f56486n;

    /* renamed from: o  reason: collision with root package name */
    private int f56487o;

    /* renamed from: p  reason: collision with root package name */
    private int f56488p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f56489q;

    /* renamed from: r  reason: collision with root package name */
    private long f56490r;

    /* renamed from: s  reason: collision with root package name */
    private int f56491s;

    /* renamed from: t  reason: collision with root package name */
    private long f56492t;

    /* renamed from: u  reason: collision with root package name */
    private int f56493u;

    /* renamed from: v  reason: collision with root package name */
    private String f56494v;

    public s(String str, int i10) {
        this.f56473a = str;
        this.f56474b = i10;
        B b10 = new B(1024);
        this.f56475c = b10;
        this.f56476d = new A(b10.e());
    }

    private static long b(A a10) {
        return (long) a10.h((a10.h(2) + 1) * 8);
    }

    private void g(A a10) {
        if (!a10.g()) {
            this.f56485m = true;
            l(a10);
        } else if (!this.f56485m) {
            return;
        }
        if (this.f56486n != 0) {
            throw q3.B.a((String) null, (Throwable) null);
        } else if (this.f56487o == 0) {
            k(a10, j(a10));
            if (this.f56489q) {
                a10.r((int) this.f56490r);
            }
        } else {
            throw q3.B.a((String) null, (Throwable) null);
        }
    }

    private int h(A a10) {
        int b10 = a10.b();
        C6663a.b d10 = C6663a.d(a10, true);
        this.f56494v = d10.f38813c;
        this.f56491s = d10.f38811a;
        this.f56493u = d10.f38812b;
        return b10 - a10.b();
    }

    private void i(A a10) {
        int h10 = a10.h(3);
        this.f56488p = h10;
        if (h10 == 0) {
            a10.r(8);
        } else if (h10 == 1) {
            a10.r(9);
        } else if (h10 == 3 || h10 == 4 || h10 == 5) {
            a10.r(6);
        } else if (h10 == 6 || h10 == 7) {
            a10.r(1);
        } else {
            throw new IllegalStateException();
        }
    }

    private int j(A a10) {
        int h10;
        if (this.f56488p == 0) {
            int i10 = 0;
            do {
                h10 = a10.h(8);
                i10 += h10;
            } while (h10 == 255);
            return i10;
        }
        throw q3.B.a((String) null, (Throwable) null);
    }

    private void k(A a10, int i10) {
        int e10 = a10.e();
        boolean z10 = false;
        if ((e10 & 7) == 0) {
            this.f56475c.W(e10 >> 3);
        } else {
            a10.i(this.f56475c.e(), 0, i10 * 8);
            this.f56475c.W(0);
        }
        this.f56477e.a(this.f56475c, i10);
        if (this.f56484l != -9223372036854775807L) {
            z10 = true;
        }
        C5950a.g(z10);
        this.f56477e.c(this.f56484l, 1, i10, 0, (O.a) null);
        this.f56484l += this.f56492t;
    }

    private void l(A a10) {
        boolean g10;
        int h10 = a10.h(1);
        int h11 = h10 == 1 ? a10.h(1) : 0;
        this.f56486n = h11;
        if (h11 == 0) {
            if (h10 == 1) {
                b(a10);
            }
            if (a10.g()) {
                this.f56487o = a10.h(6);
                int h12 = a10.h(4);
                int h13 = a10.h(3);
                if (h12 == 0 && h13 == 0) {
                    if (h10 == 0) {
                        int e10 = a10.e();
                        int h14 = h(a10);
                        a10.p(e10);
                        byte[] bArr = new byte[((h14 + 7) / 8)];
                        a10.i(bArr, 0, h14);
                        C5807s M10 = new C5807s.b().e0(this.f56478f).s0("audio/mp4a-latm").R(this.f56494v).Q(this.f56493u).t0(this.f56491s).f0(Collections.singletonList(bArr)).i0(this.f56473a).q0(this.f56474b).M();
                        if (!M10.equals(this.f56479g)) {
                            this.f56479g = M10;
                            this.f56492t = 1024000000 / ((long) M10.f28220E);
                            this.f56477e.e(M10);
                        }
                    } else {
                        a10.r(((int) b(a10)) - h(a10));
                    }
                    i(a10);
                    boolean g11 = a10.g();
                    this.f56489q = g11;
                    this.f56490r = 0;
                    if (g11) {
                        if (h10 == 1) {
                            this.f56490r = b(a10);
                        } else {
                            do {
                                g10 = a10.g();
                                this.f56490r = (this.f56490r << 8) + ((long) a10.h(8));
                            } while (g10);
                        }
                    }
                    if (a10.g()) {
                        a10.r(8);
                        return;
                    }
                    return;
                }
                throw q3.B.a((String) null, (Throwable) null);
            }
            throw q3.B.a((String) null, (Throwable) null);
        }
        throw q3.B.a((String) null, (Throwable) null);
    }

    private void m(int i10) {
        this.f56475c.S(i10);
        this.f56476d.n(this.f56475c.e());
    }

    public void a(B b10) {
        C5950a.i(this.f56477e);
        while (b10.a() > 0) {
            int i10 = this.f56480h;
            if (i10 != 0) {
                if (i10 == 1) {
                    int H10 = b10.H();
                    if ((H10 & 224) == 224) {
                        this.f56483k = H10;
                        this.f56480h = 2;
                    } else if (H10 != 86) {
                        this.f56480h = 0;
                    }
                } else if (i10 == 2) {
                    int H11 = ((this.f56483k & -225) << 8) | b10.H();
                    this.f56482j = H11;
                    if (H11 > this.f56475c.e().length) {
                        m(this.f56482j);
                    }
                    this.f56481i = 0;
                    this.f56480h = 3;
                } else if (i10 == 3) {
                    int min = Math.min(b10.a(), this.f56482j - this.f56481i);
                    b10.l(this.f56476d.f29434a, this.f56481i, min);
                    int i11 = this.f56481i + min;
                    this.f56481i = i11;
                    if (i11 == this.f56482j) {
                        this.f56476d.p(0);
                        g(this.f56476d);
                        this.f56480h = 0;
                    }
                } else {
                    throw new IllegalStateException();
                }
            } else if (b10.H() == 86) {
                this.f56480h = 1;
            }
        }
    }

    public void c() {
        this.f56480h = 0;
        this.f56484l = -9223372036854775807L;
        this.f56485m = false;
    }

    public void d(r rVar, L.d dVar) {
        dVar.a();
        this.f56477e = rVar.t(dVar.c(), 1);
        this.f56478f = dVar.b();
    }

    public void e(boolean z10) {
    }

    public void f(long j10, int i10) {
        this.f56484l = j10;
    }
}
