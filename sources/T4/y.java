package t4;

import N3.r;
import t3.A;
import t3.B;
import t3.C5950a;
import t3.H;
import t3.q;
import t4.L;

public final class y implements L {

    /* renamed from: a  reason: collision with root package name */
    private final C8788m f56544a;

    /* renamed from: b  reason: collision with root package name */
    private final A f56545b = new A(new byte[10]);

    /* renamed from: c  reason: collision with root package name */
    private int f56546c = 0;

    /* renamed from: d  reason: collision with root package name */
    private int f56547d;

    /* renamed from: e  reason: collision with root package name */
    private H f56548e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f56549f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f56550g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f56551h;

    /* renamed from: i  reason: collision with root package name */
    private int f56552i;

    /* renamed from: j  reason: collision with root package name */
    private int f56553j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f56554k;

    /* renamed from: l  reason: collision with root package name */
    private long f56555l;

    public y(C8788m mVar) {
        this.f56544a = mVar;
    }

    private boolean e(B b10, byte[] bArr, int i10) {
        int min = Math.min(b10.a(), i10 - this.f56547d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            b10.X(min);
        } else {
            b10.l(bArr, this.f56547d, min);
        }
        int i11 = this.f56547d + min;
        this.f56547d = i11;
        return i11 == i10;
    }

    private boolean f() {
        this.f56545b.p(0);
        int h10 = this.f56545b.h(24);
        if (h10 != 1) {
            q.h("PesReader", "Unexpected start code prefix: " + h10);
            this.f56553j = -1;
            return false;
        }
        this.f56545b.r(8);
        int h11 = this.f56545b.h(16);
        this.f56545b.r(5);
        this.f56554k = this.f56545b.g();
        this.f56545b.r(2);
        this.f56549f = this.f56545b.g();
        this.f56550g = this.f56545b.g();
        this.f56545b.r(6);
        int h12 = this.f56545b.h(8);
        this.f56552i = h12;
        if (h11 == 0) {
            this.f56553j = -1;
        } else {
            int i10 = (h11 - 3) - h12;
            this.f56553j = i10;
            if (i10 < 0) {
                q.h("PesReader", "Found negative packet payload size: " + this.f56553j);
                this.f56553j = -1;
            }
        }
        return true;
    }

    private void g() {
        this.f56545b.p(0);
        this.f56555l = -9223372036854775807L;
        if (this.f56549f) {
            this.f56545b.r(4);
            this.f56545b.r(1);
            this.f56545b.r(1);
            long h10 = (((long) this.f56545b.h(3)) << 30) | ((long) (this.f56545b.h(15) << 15)) | ((long) this.f56545b.h(15));
            this.f56545b.r(1);
            if (!this.f56551h && this.f56550g) {
                this.f56545b.r(4);
                this.f56545b.r(1);
                this.f56545b.r(1);
                this.f56545b.r(1);
                this.f56548e.b((((long) this.f56545b.h(3)) << 30) | ((long) (this.f56545b.h(15) << 15)) | ((long) this.f56545b.h(15)));
                this.f56551h = true;
            }
            this.f56555l = this.f56548e.b(h10);
        }
    }

    private void h(int i10) {
        this.f56546c = i10;
        this.f56547d = 0;
    }

    public void a(B b10, int i10) {
        C5950a.i(this.f56548e);
        if ((i10 & 1) != 0) {
            int i11 = this.f56546c;
            if (!(i11 == 0 || i11 == 1)) {
                if (i11 == 2) {
                    q.h("PesReader", "Unexpected start indicator reading extended header");
                } else if (i11 == 3) {
                    if (this.f56553j != -1) {
                        q.h("PesReader", "Unexpected start indicator: expected " + this.f56553j + " more bytes");
                    }
                    this.f56544a.e(b10.g() == 0);
                } else {
                    throw new IllegalStateException();
                }
            }
            h(1);
        }
        while (b10.a() > 0) {
            int i12 = this.f56546c;
            if (i12 == 0) {
                b10.X(b10.a());
            } else if (i12 != 1) {
                if (i12 == 2) {
                    if (e(b10, this.f56545b.f29434a, Math.min(10, this.f56552i)) && e(b10, (byte[]) null, this.f56552i)) {
                        g();
                        i10 |= this.f56554k ? 4 : 0;
                        this.f56544a.f(this.f56555l, i10);
                        h(3);
                    }
                } else if (i12 == 3) {
                    int a10 = b10.a();
                    int i13 = this.f56553j;
                    int i14 = i13 == -1 ? 0 : a10 - i13;
                    if (i14 > 0) {
                        a10 -= i14;
                        b10.V(b10.f() + a10);
                    }
                    this.f56544a.a(b10);
                    int i15 = this.f56553j;
                    if (i15 != -1) {
                        int i16 = i15 - a10;
                        this.f56553j = i16;
                        if (i16 == 0) {
                            this.f56544a.e(false);
                            h(1);
                        }
                    }
                } else {
                    throw new IllegalStateException();
                }
            } else if (e(b10, this.f56545b.f29434a, 9)) {
                h(f() ? 2 : 0);
            }
        }
    }

    public void b(H h10, r rVar, L.d dVar) {
        this.f56548e = h10;
        this.f56544a.d(rVar, dVar);
    }

    public void c() {
        this.f56546c = 0;
        this.f56547d = 0;
        this.f56551h = false;
        this.f56544a.c();
    }

    public boolean d(boolean z10) {
        return this.f56546c == 3 && this.f56553j == -1 && (!z10 || !(this.f56544a instanceof C8789n));
    }
}
