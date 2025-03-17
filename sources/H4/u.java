package h4;

import N3.C6679q;
import t3.B;

final class u {

    /* renamed from: a  reason: collision with root package name */
    public c f51609a;

    /* renamed from: b  reason: collision with root package name */
    public long f51610b;

    /* renamed from: c  reason: collision with root package name */
    public long f51611c;

    /* renamed from: d  reason: collision with root package name */
    public long f51612d;

    /* renamed from: e  reason: collision with root package name */
    public int f51613e;

    /* renamed from: f  reason: collision with root package name */
    public int f51614f;

    /* renamed from: g  reason: collision with root package name */
    public long[] f51615g = new long[0];

    /* renamed from: h  reason: collision with root package name */
    public int[] f51616h = new int[0];

    /* renamed from: i  reason: collision with root package name */
    public int[] f51617i = new int[0];

    /* renamed from: j  reason: collision with root package name */
    public long[] f51618j = new long[0];

    /* renamed from: k  reason: collision with root package name */
    public boolean[] f51619k = new boolean[0];

    /* renamed from: l  reason: collision with root package name */
    public boolean f51620l;

    /* renamed from: m  reason: collision with root package name */
    public boolean[] f51621m = new boolean[0];

    /* renamed from: n  reason: collision with root package name */
    public t f51622n;

    /* renamed from: o  reason: collision with root package name */
    public final B f51623o = new B();

    /* renamed from: p  reason: collision with root package name */
    public boolean f51624p;

    /* renamed from: q  reason: collision with root package name */
    public long f51625q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f51626r;

    public void a(C6679q qVar) {
        qVar.readFully(this.f51623o.e(), 0, this.f51623o.g());
        this.f51623o.W(0);
        this.f51624p = false;
    }

    public void b(B b10) {
        b10.l(this.f51623o.e(), 0, this.f51623o.g());
        this.f51623o.W(0);
        this.f51624p = false;
    }

    public long c(int i10) {
        return this.f51618j[i10];
    }

    public void d(int i10) {
        this.f51623o.S(i10);
        this.f51620l = true;
        this.f51624p = true;
    }

    public void e(int i10, int i11) {
        this.f51613e = i10;
        this.f51614f = i11;
        if (this.f51616h.length < i10) {
            this.f51615g = new long[i10];
            this.f51616h = new int[i10];
        }
        if (this.f51617i.length < i11) {
            int i12 = (i11 * 125) / 100;
            this.f51617i = new int[i12];
            this.f51618j = new long[i12];
            this.f51619k = new boolean[i12];
            this.f51621m = new boolean[i12];
        }
    }

    public void f() {
        this.f51613e = 0;
        this.f51625q = 0;
        this.f51626r = false;
        this.f51620l = false;
        this.f51624p = false;
        this.f51622n = null;
    }

    public boolean g(int i10) {
        return this.f51620l && this.f51621m[i10];
    }
}
