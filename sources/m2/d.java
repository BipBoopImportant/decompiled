package m2;

import p2.e;

public class d {

    /* renamed from: i  reason: collision with root package name */
    public static final Object f26137i = new String("FIXED_DIMENSION");

    /* renamed from: j  reason: collision with root package name */
    public static final Object f26138j = new String("WRAP_DIMENSION");

    /* renamed from: k  reason: collision with root package name */
    public static final Object f26139k = new String("SPREAD_DIMENSION");

    /* renamed from: l  reason: collision with root package name */
    public static final Object f26140l = new String("PARENT_DIMENSION");

    /* renamed from: m  reason: collision with root package name */
    public static final Object f26141m = new String("PERCENT_DIMENSION");

    /* renamed from: n  reason: collision with root package name */
    public static final Object f26142n = new String("RATIO_DIMENSION");

    /* renamed from: a  reason: collision with root package name */
    private final int f26143a;

    /* renamed from: b  reason: collision with root package name */
    int f26144b;

    /* renamed from: c  reason: collision with root package name */
    int f26145c;

    /* renamed from: d  reason: collision with root package name */
    float f26146d;

    /* renamed from: e  reason: collision with root package name */
    int f26147e;

    /* renamed from: f  reason: collision with root package name */
    String f26148f;

    /* renamed from: g  reason: collision with root package name */
    Object f26149g;

    /* renamed from: h  reason: collision with root package name */
    boolean f26150h;

    private d() {
        this.f26143a = -2;
        this.f26144b = 0;
        this.f26145c = Integer.MAX_VALUE;
        this.f26146d = 1.0f;
        this.f26147e = 0;
        this.f26148f = null;
        this.f26149g = f26138j;
        this.f26150h = false;
    }

    public static d b(int i10) {
        d dVar = new d(f26137i);
        dVar.j(i10);
        return dVar;
    }

    public static d c(Object obj) {
        d dVar = new d(f26137i);
        dVar.k(obj);
        return dVar;
    }

    public static d d() {
        return new d(f26140l);
    }

    public static d e(Object obj, float f10) {
        d dVar = new d(f26141m);
        dVar.q(obj, f10);
        return dVar;
    }

    public static d f(String str) {
        d dVar = new d(f26142n);
        dVar.r(str);
        return dVar;
    }

    public static d g(Object obj) {
        d dVar = new d();
        dVar.t(obj);
        return dVar;
    }

    public static d h() {
        return new d(f26138j);
    }

    public void a(g gVar, e eVar, int i10) {
        String str = this.f26148f;
        if (str != null) {
            eVar.H0(str);
        }
        int i11 = 2;
        if (i10 == 0) {
            if (this.f26150h) {
                eVar.T0(e.b.MATCH_CONSTRAINT);
                Object obj = this.f26149g;
                if (obj == f26138j) {
                    i11 = 1;
                } else if (obj != f26141m) {
                    i11 = 0;
                }
                eVar.U0(i11, this.f26144b, this.f26145c, this.f26146d);
                return;
            }
            int i12 = this.f26144b;
            if (i12 > 0) {
                eVar.e1(i12);
            }
            int i13 = this.f26145c;
            if (i13 < Integer.MAX_VALUE) {
                eVar.b1(i13);
            }
            Object obj2 = this.f26149g;
            if (obj2 == f26138j) {
                eVar.T0(e.b.WRAP_CONTENT);
            } else if (obj2 == f26140l) {
                eVar.T0(e.b.MATCH_PARENT);
            } else if (obj2 == null) {
                eVar.T0(e.b.FIXED);
                eVar.o1(this.f26147e);
            }
        } else if (this.f26150h) {
            eVar.k1(e.b.MATCH_CONSTRAINT);
            Object obj3 = this.f26149g;
            if (obj3 == f26138j) {
                i11 = 1;
            } else if (obj3 != f26141m) {
                i11 = 0;
            }
            eVar.l1(i11, this.f26144b, this.f26145c, this.f26146d);
        } else {
            int i14 = this.f26144b;
            if (i14 > 0) {
                eVar.d1(i14);
            }
            int i15 = this.f26145c;
            if (i15 < Integer.MAX_VALUE) {
                eVar.a1(i15);
            }
            Object obj4 = this.f26149g;
            if (obj4 == f26138j) {
                eVar.k1(e.b.WRAP_CONTENT);
            } else if (obj4 == f26140l) {
                eVar.k1(e.b.MATCH_PARENT);
            } else if (obj4 == null) {
                eVar.k1(e.b.FIXED);
                eVar.P0(this.f26147e);
            }
        }
    }

    public boolean i(int i10) {
        return this.f26149g == null && this.f26147e == i10;
    }

    public d j(int i10) {
        this.f26149g = null;
        this.f26147e = i10;
        return this;
    }

    public d k(Object obj) {
        this.f26149g = obj;
        if (obj instanceof Integer) {
            this.f26147e = ((Integer) obj).intValue();
            this.f26149g = null;
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    public int l() {
        return this.f26147e;
    }

    public d m(int i10) {
        if (this.f26145c >= 0) {
            this.f26145c = i10;
        }
        return this;
    }

    public d n(Object obj) {
        Object obj2 = f26138j;
        if (obj == obj2 && this.f26150h) {
            this.f26149g = obj2;
            this.f26145c = Integer.MAX_VALUE;
        }
        return this;
    }

    public d o(int i10) {
        if (i10 >= 0) {
            this.f26144b = i10;
        }
        return this;
    }

    public d p(Object obj) {
        if (obj == f26138j) {
            this.f26144b = -2;
        }
        return this;
    }

    public d q(Object obj, float f10) {
        this.f26146d = f10;
        return this;
    }

    public d r(String str) {
        this.f26148f = str;
        return this;
    }

    public d s(int i10) {
        this.f26150h = true;
        if (i10 >= 0) {
            this.f26145c = i10;
        }
        return this;
    }

    public d t(Object obj) {
        this.f26149g = obj;
        this.f26150h = true;
        return this;
    }

    private d(Object obj) {
        this.f26143a = -2;
        this.f26144b = 0;
        this.f26145c = Integer.MAX_VALUE;
        this.f26146d = 1.0f;
        this.f26147e = 0;
        this.f26148f = null;
        this.f26150h = false;
        this.f26149g = obj;
    }
}
