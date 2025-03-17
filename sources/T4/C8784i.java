package t4;

import N3.C6663a;
import N3.C6675m;
import N3.O;
import N3.r;
import java.util.Arrays;
import java.util.Collections;
import q3.C5807s;
import t3.A;
import t3.B;
import t3.C5950a;
import t3.N;
import t3.q;
import t4.L;

/* renamed from: t4.i  reason: case insensitive filesystem */
public final class C8784i implements C8788m {

    /* renamed from: w  reason: collision with root package name */
    private static final byte[] f56295w = {73, 68, 51};

    /* renamed from: a  reason: collision with root package name */
    private final boolean f56296a;

    /* renamed from: b  reason: collision with root package name */
    private final A f56297b;

    /* renamed from: c  reason: collision with root package name */
    private final B f56298c;

    /* renamed from: d  reason: collision with root package name */
    private final String f56299d;

    /* renamed from: e  reason: collision with root package name */
    private final int f56300e;

    /* renamed from: f  reason: collision with root package name */
    private String f56301f;

    /* renamed from: g  reason: collision with root package name */
    private O f56302g;

    /* renamed from: h  reason: collision with root package name */
    private O f56303h;

    /* renamed from: i  reason: collision with root package name */
    private int f56304i;

    /* renamed from: j  reason: collision with root package name */
    private int f56305j;

    /* renamed from: k  reason: collision with root package name */
    private int f56306k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f56307l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f56308m;

    /* renamed from: n  reason: collision with root package name */
    private int f56309n;

    /* renamed from: o  reason: collision with root package name */
    private int f56310o;

    /* renamed from: p  reason: collision with root package name */
    private int f56311p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f56312q;

    /* renamed from: r  reason: collision with root package name */
    private long f56313r;

    /* renamed from: s  reason: collision with root package name */
    private int f56314s;

    /* renamed from: t  reason: collision with root package name */
    private long f56315t;

    /* renamed from: u  reason: collision with root package name */
    private O f56316u;

    /* renamed from: v  reason: collision with root package name */
    private long f56317v;

    public C8784i(boolean z10) {
        this(z10, (String) null, 0);
    }

    private void b() {
        C5950a.e(this.f56302g);
        N.i(this.f56316u);
        N.i(this.f56303h);
    }

    private void g(B b10) {
        if (b10.a() != 0) {
            this.f56297b.f29434a[0] = b10.e()[b10.f()];
            this.f56297b.p(2);
            int h10 = this.f56297b.h(4);
            int i10 = this.f56310o;
            if (i10 == -1 || h10 == i10) {
                if (!this.f56308m) {
                    this.f56308m = true;
                    this.f56309n = this.f56311p;
                    this.f56310o = h10;
                }
                t();
                return;
            }
            q();
        }
    }

    private boolean h(B b10, int i10) {
        b10.W(i10 + 1);
        if (!w(b10, this.f56297b.f29434a, 1)) {
            return false;
        }
        this.f56297b.p(4);
        int h10 = this.f56297b.h(1);
        int i11 = this.f56309n;
        if (i11 != -1 && h10 != i11) {
            return false;
        }
        if (this.f56310o != -1) {
            if (!w(b10, this.f56297b.f29434a, 1)) {
                return true;
            }
            this.f56297b.p(2);
            if (this.f56297b.h(4) != this.f56310o) {
                return false;
            }
            b10.W(i10 + 2);
        }
        if (!w(b10, this.f56297b.f29434a, 4)) {
            return true;
        }
        this.f56297b.p(14);
        int h11 = this.f56297b.h(13);
        if (h11 < 7) {
            return false;
        }
        byte[] e10 = b10.e();
        int g10 = b10.g();
        int i12 = i10 + h11;
        if (i12 >= g10) {
            return true;
        }
        byte b11 = e10[i12];
        if (b11 == -1) {
            int i13 = i12 + 1;
            if (i13 == g10) {
                return true;
            }
            return l((byte) -1, e10[i13]) && ((e10[i13] & 8) >> 3) == h10;
        } else if (b11 != 73) {
            return false;
        } else {
            int i14 = i12 + 1;
            if (i14 == g10) {
                return true;
            }
            if (e10[i14] != 68) {
                return false;
            }
            int i15 = i12 + 2;
            return i15 == g10 || e10[i15] == 51;
        }
    }

    private boolean i(B b10, byte[] bArr, int i10) {
        int min = Math.min(b10.a(), i10 - this.f56305j);
        b10.l(bArr, this.f56305j, min);
        int i11 = this.f56305j + min;
        this.f56305j = i11;
        return i11 == i10;
    }

    private void j(B b10) {
        byte[] e10 = b10.e();
        int f10 = b10.f();
        int g10 = b10.g();
        while (f10 < g10) {
            int i10 = f10 + 1;
            byte b11 = e10[f10];
            byte b12 = b11 & 255;
            if (this.f56306k != 512 || !l((byte) -1, (byte) b12) || (!this.f56308m && !h(b10, f10 - 1))) {
                int i11 = this.f56306k;
                byte b13 = b12 | i11;
                if (b13 == 329) {
                    this.f56306k = 768;
                } else if (b13 == 511) {
                    this.f56306k = 512;
                } else if (b13 == 836) {
                    this.f56306k = 1024;
                } else if (b13 == 1075) {
                    u();
                    b10.W(i10);
                    return;
                } else if (i11 != 256) {
                    this.f56306k = 256;
                }
                f10 = i10;
            } else {
                this.f56311p = (b11 & 8) >> 3;
                boolean z10 = true;
                if ((b11 & 1) != 0) {
                    z10 = false;
                }
                this.f56307l = z10;
                if (!this.f56308m) {
                    r();
                } else {
                    t();
                }
                b10.W(i10);
                return;
            }
        }
        b10.W(f10);
    }

    private boolean l(byte b10, byte b11) {
        return m(((b10 & 255) << 8) | (b11 & 255));
    }

    public static boolean m(int i10) {
        return (i10 & 65526) == 65520;
    }

    private void n() {
        this.f56297b.p(0);
        if (!this.f56312q) {
            int i10 = 2;
            int h10 = this.f56297b.h(2) + 1;
            if (h10 != 2) {
                q.h("AdtsReader", "Detected audio object type: " + h10 + ", but assuming AAC LC.");
            } else {
                i10 = h10;
            }
            this.f56297b.r(5);
            byte[] a10 = C6663a.a(i10, this.f56310o, this.f56297b.h(3));
            C6663a.b e10 = C6663a.e(a10);
            C5807s M10 = new C5807s.b().e0(this.f56301f).s0("audio/mp4a-latm").R(e10.f38813c).Q(e10.f38812b).t0(e10.f38811a).f0(Collections.singletonList(a10)).i0(this.f56299d).q0(this.f56300e).M();
            this.f56313r = 1024000000 / ((long) M10.f28220E);
            this.f56302g.e(M10);
            this.f56312q = true;
        } else {
            this.f56297b.r(10);
        }
        this.f56297b.r(4);
        int h11 = this.f56297b.h(13);
        int i11 = h11 - 7;
        if (this.f56307l) {
            i11 = h11 - 9;
        }
        v(this.f56302g, this.f56313r, 0, i11);
    }

    private void o() {
        this.f56303h.a(this.f56298c, 10);
        this.f56298c.W(6);
        v(this.f56303h, 0, 10, this.f56298c.G() + 10);
    }

    private void p(B b10) {
        int min = Math.min(b10.a(), this.f56314s - this.f56305j);
        this.f56316u.a(b10, min);
        int i10 = this.f56305j + min;
        this.f56305j = i10;
        if (i10 == this.f56314s) {
            C5950a.g(this.f56315t != -9223372036854775807L);
            this.f56316u.c(this.f56315t, 1, this.f56314s, 0, (O.a) null);
            this.f56315t += this.f56317v;
            s();
        }
    }

    private void q() {
        this.f56308m = false;
        s();
    }

    private void r() {
        this.f56304i = 1;
        this.f56305j = 0;
    }

    private void s() {
        this.f56304i = 0;
        this.f56305j = 0;
        this.f56306k = 256;
    }

    private void t() {
        this.f56304i = 3;
        this.f56305j = 0;
    }

    private void u() {
        this.f56304i = 2;
        this.f56305j = f56295w.length;
        this.f56314s = 0;
        this.f56298c.W(0);
    }

    private void v(O o10, long j10, int i10, int i11) {
        this.f56304i = 4;
        this.f56305j = i10;
        this.f56316u = o10;
        this.f56317v = j10;
        this.f56314s = i11;
    }

    private boolean w(B b10, byte[] bArr, int i10) {
        if (b10.a() < i10) {
            return false;
        }
        b10.l(bArr, 0, i10);
        return true;
    }

    public void a(B b10) {
        b();
        while (b10.a() > 0) {
            int i10 = this.f56304i;
            if (i10 == 0) {
                j(b10);
            } else if (i10 == 1) {
                g(b10);
            } else if (i10 != 2) {
                if (i10 == 3) {
                    if (i(b10, this.f56297b.f29434a, this.f56307l ? 7 : 5)) {
                        n();
                    }
                } else if (i10 == 4) {
                    p(b10);
                } else {
                    throw new IllegalStateException();
                }
            } else if (i(b10, this.f56298c.e(), 10)) {
                o();
            }
        }
    }

    public void c() {
        this.f56315t = -9223372036854775807L;
        q();
    }

    public void d(r rVar, L.d dVar) {
        dVar.a();
        this.f56301f = dVar.b();
        O t10 = rVar.t(dVar.c(), 1);
        this.f56302g = t10;
        this.f56316u = t10;
        if (this.f56296a) {
            dVar.a();
            O t11 = rVar.t(dVar.c(), 5);
            this.f56303h = t11;
            t11.e(new C5807s.b().e0(dVar.b()).s0("application/id3").M());
            return;
        }
        this.f56303h = new C6675m();
    }

    public void e(boolean z10) {
    }

    public void f(long j10, int i10) {
        this.f56315t = j10;
    }

    public long k() {
        return this.f56313r;
    }

    public C8784i(boolean z10, String str, int i10) {
        this.f56297b = new A(new byte[7]);
        this.f56298c = new B(Arrays.copyOf(f56295w, 10));
        s();
        this.f56309n = -1;
        this.f56310o = -1;
        this.f56313r = -9223372036854775807L;
        this.f56315t = -9223372036854775807L;
        this.f56296a = z10;
        this.f56299d = str;
        this.f56300e = i10;
    }
}
