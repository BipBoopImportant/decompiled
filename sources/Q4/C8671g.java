package q4;

import android.text.Layout;

/* renamed from: q4.g  reason: case insensitive filesystem */
final class C8671g {

    /* renamed from: a  reason: collision with root package name */
    private String f55491a;

    /* renamed from: b  reason: collision with root package name */
    private int f55492b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f55493c;

    /* renamed from: d  reason: collision with root package name */
    private int f55494d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f55495e;

    /* renamed from: f  reason: collision with root package name */
    private int f55496f = -1;

    /* renamed from: g  reason: collision with root package name */
    private int f55497g = -1;

    /* renamed from: h  reason: collision with root package name */
    private int f55498h = -1;

    /* renamed from: i  reason: collision with root package name */
    private int f55499i = -1;

    /* renamed from: j  reason: collision with root package name */
    private int f55500j = -1;

    /* renamed from: k  reason: collision with root package name */
    private float f55501k;

    /* renamed from: l  reason: collision with root package name */
    private String f55502l;

    /* renamed from: m  reason: collision with root package name */
    private int f55503m = -1;

    /* renamed from: n  reason: collision with root package name */
    private int f55504n = -1;

    /* renamed from: o  reason: collision with root package name */
    private Layout.Alignment f55505o;

    /* renamed from: p  reason: collision with root package name */
    private Layout.Alignment f55506p;

    /* renamed from: q  reason: collision with root package name */
    private int f55507q = -1;

    /* renamed from: r  reason: collision with root package name */
    private C8666b f55508r;

    /* renamed from: s  reason: collision with root package name */
    private float f55509s = Float.MAX_VALUE;

    private C8671g r(C8671g gVar, boolean z10) {
        int i10;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (gVar != null) {
            if (!this.f55493c && gVar.f55493c) {
                w(gVar.f55492b);
            }
            if (this.f55498h == -1) {
                this.f55498h = gVar.f55498h;
            }
            if (this.f55499i == -1) {
                this.f55499i = gVar.f55499i;
            }
            if (this.f55491a == null && (str = gVar.f55491a) != null) {
                this.f55491a = str;
            }
            if (this.f55496f == -1) {
                this.f55496f = gVar.f55496f;
            }
            if (this.f55497g == -1) {
                this.f55497g = gVar.f55497g;
            }
            if (this.f55504n == -1) {
                this.f55504n = gVar.f55504n;
            }
            if (this.f55505o == null && (alignment2 = gVar.f55505o) != null) {
                this.f55505o = alignment2;
            }
            if (this.f55506p == null && (alignment = gVar.f55506p) != null) {
                this.f55506p = alignment;
            }
            if (this.f55507q == -1) {
                this.f55507q = gVar.f55507q;
            }
            if (this.f55500j == -1) {
                this.f55500j = gVar.f55500j;
                this.f55501k = gVar.f55501k;
            }
            if (this.f55508r == null) {
                this.f55508r = gVar.f55508r;
            }
            if (this.f55509s == Float.MAX_VALUE) {
                this.f55509s = gVar.f55509s;
            }
            if (z10 && !this.f55495e && gVar.f55495e) {
                u(gVar.f55494d);
            }
            if (z10 && this.f55503m == -1 && (i10 = gVar.f55503m) != -1) {
                this.f55503m = i10;
            }
        }
        return this;
    }

    public C8671g A(String str) {
        this.f55502l = str;
        return this;
    }

    public C8671g B(boolean z10) {
        this.f55499i = z10 ? 1 : 0;
        return this;
    }

    public C8671g C(boolean z10) {
        this.f55496f = z10 ? 1 : 0;
        return this;
    }

    public C8671g D(Layout.Alignment alignment) {
        this.f55506p = alignment;
        return this;
    }

    public C8671g E(int i10) {
        this.f55504n = i10;
        return this;
    }

    public C8671g F(int i10) {
        this.f55503m = i10;
        return this;
    }

    public C8671g G(float f10) {
        this.f55509s = f10;
        return this;
    }

    public C8671g H(Layout.Alignment alignment) {
        this.f55505o = alignment;
        return this;
    }

    public C8671g I(boolean z10) {
        this.f55507q = z10 ? 1 : 0;
        return this;
    }

    public C8671g J(C8666b bVar) {
        this.f55508r = bVar;
        return this;
    }

    public C8671g K(boolean z10) {
        this.f55497g = z10 ? 1 : 0;
        return this;
    }

    public C8671g a(C8671g gVar) {
        return r(gVar, true);
    }

    public int b() {
        if (this.f55495e) {
            return this.f55494d;
        }
        throw new IllegalStateException("Background color has not been defined.");
    }

    public int c() {
        if (this.f55493c) {
            return this.f55492b;
        }
        throw new IllegalStateException("Font color has not been defined.");
    }

    public String d() {
        return this.f55491a;
    }

    public float e() {
        return this.f55501k;
    }

    public int f() {
        return this.f55500j;
    }

    public String g() {
        return this.f55502l;
    }

    public Layout.Alignment h() {
        return this.f55506p;
    }

    public int i() {
        return this.f55504n;
    }

    public int j() {
        return this.f55503m;
    }

    public float k() {
        return this.f55509s;
    }

    public int l() {
        int i10 = this.f55498h;
        if (i10 == -1 && this.f55499i == -1) {
            return -1;
        }
        int i11 = 0;
        int i12 = i10 == 1 ? 1 : 0;
        if (this.f55499i == 1) {
            i11 = 2;
        }
        return i12 | i11;
    }

    public Layout.Alignment m() {
        return this.f55505o;
    }

    public boolean n() {
        return this.f55507q == 1;
    }

    public C8666b o() {
        return this.f55508r;
    }

    public boolean p() {
        return this.f55495e;
    }

    public boolean q() {
        return this.f55493c;
    }

    public boolean s() {
        return this.f55496f == 1;
    }

    public boolean t() {
        return this.f55497g == 1;
    }

    public C8671g u(int i10) {
        this.f55494d = i10;
        this.f55495e = true;
        return this;
    }

    public C8671g v(boolean z10) {
        this.f55498h = z10 ? 1 : 0;
        return this;
    }

    public C8671g w(int i10) {
        this.f55492b = i10;
        this.f55493c = true;
        return this;
    }

    public C8671g x(String str) {
        this.f55491a = str;
        return this;
    }

    public C8671g y(float f10) {
        this.f55501k = f10;
        return this;
    }

    public C8671g z(int i10) {
        this.f55500j = i10;
        return this;
    }
}
