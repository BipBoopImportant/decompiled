package t4;

import N3.C6664b;
import N3.O;
import N3.r;
import q3.C5807s;
import t3.A;
import t3.B;
import t3.C5950a;
import t3.N;
import t4.L;

/* renamed from: t4.c  reason: case insensitive filesystem */
public final class C8778c implements C8788m {

    /* renamed from: a  reason: collision with root package name */
    private final A f56251a;

    /* renamed from: b  reason: collision with root package name */
    private final B f56252b;

    /* renamed from: c  reason: collision with root package name */
    private final String f56253c;

    /* renamed from: d  reason: collision with root package name */
    private final int f56254d;

    /* renamed from: e  reason: collision with root package name */
    private String f56255e;

    /* renamed from: f  reason: collision with root package name */
    private O f56256f;

    /* renamed from: g  reason: collision with root package name */
    private int f56257g;

    /* renamed from: h  reason: collision with root package name */
    private int f56258h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f56259i;

    /* renamed from: j  reason: collision with root package name */
    private long f56260j;

    /* renamed from: k  reason: collision with root package name */
    private C5807s f56261k;

    /* renamed from: l  reason: collision with root package name */
    private int f56262l;

    /* renamed from: m  reason: collision with root package name */
    private long f56263m;

    public C8778c() {
        this((String) null, 0);
    }

    private boolean b(B b10, byte[] bArr, int i10) {
        int min = Math.min(b10.a(), i10 - this.f56258h);
        b10.l(bArr, this.f56258h, min);
        int i11 = this.f56258h + min;
        this.f56258h = i11;
        return i11 == i10;
    }

    private void g() {
        this.f56251a.p(0);
        C6664b.C0611b f10 = C6664b.f(this.f56251a);
        C5807s sVar = this.f56261k;
        if (sVar == null || f10.f38823d != sVar.f28219D || f10.f38822c != sVar.f28220E || !N.d(f10.f38820a, sVar.f28244o)) {
            C5807s.b n02 = new C5807s.b().e0(this.f56255e).s0(f10.f38820a).Q(f10.f38823d).t0(f10.f38822c).i0(this.f56253c).q0(this.f56254d).n0(f10.f38826g);
            if ("audio/ac3".equals(f10.f38820a)) {
                n02.P(f10.f38826g);
            }
            C5807s M10 = n02.M();
            this.f56261k = M10;
            this.f56256f.e(M10);
        }
        this.f56262l = f10.f38824e;
        this.f56260j = (((long) f10.f38825f) * 1000000) / ((long) this.f56261k.f28220E);
    }

    private boolean h(B b10) {
        while (true) {
            boolean z10 = false;
            if (b10.a() <= 0) {
                return false;
            }
            if (!this.f56259i) {
                if (b10.H() == 11) {
                    z10 = true;
                }
                this.f56259i = z10;
            } else {
                int H10 = b10.H();
                if (H10 == 119) {
                    this.f56259i = false;
                    return true;
                }
                if (H10 == 11) {
                    z10 = true;
                }
                this.f56259i = z10;
            }
        }
    }

    public void a(B b10) {
        C5950a.i(this.f56256f);
        while (b10.a() > 0) {
            int i10 = this.f56257g;
            boolean z10 = true;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        int min = Math.min(b10.a(), this.f56262l - this.f56258h);
                        this.f56256f.a(b10, min);
                        int i11 = this.f56258h + min;
                        this.f56258h = i11;
                        if (i11 == this.f56262l) {
                            if (this.f56263m == -9223372036854775807L) {
                                z10 = false;
                            }
                            C5950a.g(z10);
                            this.f56256f.c(this.f56263m, 1, this.f56262l, 0, (O.a) null);
                            this.f56263m += this.f56260j;
                            this.f56257g = 0;
                        }
                    }
                } else if (b(b10, this.f56252b.e(), 128)) {
                    g();
                    this.f56252b.W(0);
                    this.f56256f.a(this.f56252b, 128);
                    this.f56257g = 2;
                }
            } else if (h(b10)) {
                this.f56257g = 1;
                this.f56252b.e()[0] = 11;
                this.f56252b.e()[1] = 119;
                this.f56258h = 2;
            }
        }
    }

    public void c() {
        this.f56257g = 0;
        this.f56258h = 0;
        this.f56259i = false;
        this.f56263m = -9223372036854775807L;
    }

    public void d(r rVar, L.d dVar) {
        dVar.a();
        this.f56255e = dVar.b();
        this.f56256f = rVar.t(dVar.c(), 1);
    }

    public void e(boolean z10) {
    }

    public void f(long j10, int i10) {
        this.f56263m = j10;
    }

    public C8778c(String str, int i10) {
        A a10 = new A(new byte[128]);
        this.f56251a = a10;
        this.f56252b = new B(a10.f29434a);
        this.f56257g = 0;
        this.f56263m = -9223372036854775807L;
        this.f56253c = str;
        this.f56254d = i10;
    }
}
