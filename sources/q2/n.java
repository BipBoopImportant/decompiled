package q2;

import p2.d;
import p2.e;
import p2.i;
import q2.f;
import q2.p;

public class n extends p {

    /* renamed from: k  reason: collision with root package name */
    public f f27810k;

    /* renamed from: l  reason: collision with root package name */
    g f27811l = null;

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f27812a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                q2.p$b[] r0 = q2.p.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f27812a = r0
                q2.p$b r1 = q2.p.b.START     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f27812a     // Catch:{ NoSuchFieldError -> 0x001d }
                q2.p$b r1 = q2.p.b.END     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f27812a     // Catch:{ NoSuchFieldError -> 0x0028 }
                q2.p$b r1 = q2.p.b.CENTER     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: q2.n.a.<clinit>():void");
        }
    }

    public n(e eVar) {
        super(eVar);
        f fVar = new f(this);
        this.f27810k = fVar;
        this.f27834h.f27788e = f.a.TOP;
        this.f27835i.f27788e = f.a.BOTTOM;
        fVar.f27788e = f.a.BASELINE;
        this.f27832f = 1;
    }

    public void a(d dVar) {
        int i10;
        float f10;
        float v10;
        float f11;
        int i11 = a.f27812a[this.f27836j.ordinal()];
        if (i11 == 1) {
            p(dVar);
        } else if (i11 == 2) {
            o(dVar);
        } else if (i11 == 3) {
            e eVar = this.f27828b;
            n(dVar, eVar.f27429P, eVar.f27431R, 1);
            return;
        }
        g gVar = this.f27831e;
        if (gVar.f27786c && !gVar.f27793j && this.f27830d == e.b.MATCH_CONSTRAINT) {
            e eVar2 = this.f27828b;
            int i12 = eVar2.f27486x;
            if (i12 == 2) {
                e L10 = eVar2.L();
                if (L10 != null) {
                    g gVar2 = L10.f27450f.f27831e;
                    if (gVar2.f27793j) {
                        this.f27831e.d((int) ((((float) gVar2.f27790g) * this.f27828b.f27412E) + 0.5f));
                    }
                }
            } else if (i12 == 3 && eVar2.f27448e.f27831e.f27793j) {
                int w10 = eVar2.w();
                if (w10 == -1) {
                    e eVar3 = this.f27828b;
                    f10 = (float) eVar3.f27448e.f27831e.f27790g;
                    v10 = eVar3.v();
                } else if (w10 == 0) {
                    e eVar4 = this.f27828b;
                    f11 = ((float) eVar4.f27448e.f27831e.f27790g) * eVar4.v();
                    i10 = (int) (f11 + 0.5f);
                    this.f27831e.d(i10);
                } else if (w10 != 1) {
                    i10 = 0;
                    this.f27831e.d(i10);
                } else {
                    e eVar5 = this.f27828b;
                    f10 = (float) eVar5.f27448e.f27831e.f27790g;
                    v10 = eVar5.v();
                }
                f11 = f10 / v10;
                i10 = (int) (f11 + 0.5f);
                this.f27831e.d(i10);
            }
        }
        f fVar = this.f27834h;
        if (fVar.f27786c) {
            f fVar2 = this.f27835i;
            if (fVar2.f27786c) {
                if (!fVar.f27793j || !fVar2.f27793j || !this.f27831e.f27793j) {
                    if (!this.f27831e.f27793j && this.f27830d == e.b.MATCH_CONSTRAINT) {
                        e eVar6 = this.f27828b;
                        if (eVar6.f27484w == 0 && !eVar6.m0()) {
                            int i13 = this.f27834h.f27795l.get(0).f27790g;
                            f fVar3 = this.f27834h;
                            int i14 = i13 + fVar3.f27789f;
                            int i15 = this.f27835i.f27795l.get(0).f27790g + this.f27835i.f27789f;
                            fVar3.d(i14);
                            this.f27835i.d(i15);
                            this.f27831e.d(i15 - i14);
                            return;
                        }
                    }
                    if (!this.f27831e.f27793j && this.f27830d == e.b.MATCH_CONSTRAINT && this.f27827a == 1 && this.f27834h.f27795l.size() > 0 && this.f27835i.f27795l.size() > 0) {
                        int i16 = (this.f27835i.f27795l.get(0).f27790g + this.f27835i.f27789f) - (this.f27834h.f27795l.get(0).f27790g + this.f27834h.f27789f);
                        g gVar3 = this.f27831e;
                        int i17 = gVar3.f27796m;
                        if (i16 < i17) {
                            gVar3.d(i16);
                        } else {
                            gVar3.d(i17);
                        }
                    }
                    if (this.f27831e.f27793j && this.f27834h.f27795l.size() > 0 && this.f27835i.f27795l.size() > 0) {
                        f fVar4 = this.f27834h.f27795l.get(0);
                        f fVar5 = this.f27835i.f27795l.get(0);
                        int i18 = fVar4.f27790g + this.f27834h.f27789f;
                        int i19 = fVar5.f27790g + this.f27835i.f27789f;
                        float T10 = this.f27828b.T();
                        if (fVar4 == fVar5) {
                            i18 = fVar4.f27790g;
                            i19 = fVar5.f27790g;
                            T10 = 0.5f;
                        }
                        this.f27834h.d((int) (((float) i18) + 0.5f + (((float) ((i19 - i18) - this.f27831e.f27790g)) * T10)));
                        this.f27835i.d(this.f27834h.f27790g + this.f27831e.f27790g);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void d() {
        e L10;
        e L11;
        e eVar = this.f27828b;
        if (eVar.f27440a) {
            this.f27831e.d(eVar.x());
        }
        if (!this.f27831e.f27793j) {
            this.f27830d = this.f27828b.V();
            if (this.f27828b.b0()) {
                this.f27811l = new C5789a(this);
            }
            e.b bVar = this.f27830d;
            if (bVar != e.b.MATCH_CONSTRAINT) {
                if (bVar == e.b.MATCH_PARENT && (L11 = this.f27828b.L()) != null && L11.V() == e.b.FIXED) {
                    int x10 = (L11.x() - this.f27828b.f27429P.f()) - this.f27828b.f27431R.f();
                    b(this.f27834h, L11.f27450f.f27834h, this.f27828b.f27429P.f());
                    b(this.f27835i, L11.f27450f.f27835i, -this.f27828b.f27431R.f());
                    this.f27831e.d(x10);
                    return;
                } else if (this.f27830d == e.b.FIXED) {
                    this.f27831e.d(this.f27828b.x());
                }
            }
        } else if (this.f27830d == e.b.MATCH_PARENT && (L10 = this.f27828b.L()) != null && L10.V() == e.b.FIXED) {
            b(this.f27834h, L10.f27450f.f27834h, this.f27828b.f27429P.f());
            b(this.f27835i, L10.f27450f.f27835i, -this.f27828b.f27431R.f());
            return;
        }
        g gVar = this.f27831e;
        boolean z10 = gVar.f27793j;
        if (z10) {
            e eVar2 = this.f27828b;
            if (eVar2.f27440a) {
                d[] dVarArr = eVar2.f27436W;
                d dVar = dVarArr[2];
                d dVar2 = dVar.f27399f;
                if (dVar2 != null && dVarArr[3].f27399f != null) {
                    if (eVar2.m0()) {
                        this.f27834h.f27789f = this.f27828b.f27436W[2].f();
                        this.f27835i.f27789f = -this.f27828b.f27436W[3].f();
                    } else {
                        f h10 = h(this.f27828b.f27436W[2]);
                        if (h10 != null) {
                            b(this.f27834h, h10, this.f27828b.f27436W[2].f());
                        }
                        f h11 = h(this.f27828b.f27436W[3]);
                        if (h11 != null) {
                            b(this.f27835i, h11, -this.f27828b.f27436W[3].f());
                        }
                        this.f27834h.f27785b = true;
                        this.f27835i.f27785b = true;
                    }
                    if (this.f27828b.b0()) {
                        b(this.f27810k, this.f27834h, this.f27828b.p());
                        return;
                    }
                    return;
                } else if (dVar2 != null) {
                    f h12 = h(dVar);
                    if (h12 != null) {
                        b(this.f27834h, h12, this.f27828b.f27436W[2].f());
                        b(this.f27835i, this.f27834h, this.f27831e.f27790g);
                        if (this.f27828b.b0()) {
                            b(this.f27810k, this.f27834h, this.f27828b.p());
                            return;
                        }
                        return;
                    }
                    return;
                } else {
                    d dVar3 = dVarArr[3];
                    if (dVar3.f27399f != null) {
                        f h13 = h(dVar3);
                        if (h13 != null) {
                            b(this.f27835i, h13, -this.f27828b.f27436W[3].f());
                            b(this.f27834h, this.f27835i, -this.f27831e.f27790g);
                        }
                        if (this.f27828b.b0()) {
                            b(this.f27810k, this.f27834h, this.f27828b.p());
                            return;
                        }
                        return;
                    }
                    d dVar4 = dVarArr[4];
                    if (dVar4.f27399f != null) {
                        f h14 = h(dVar4);
                        if (h14 != null) {
                            b(this.f27810k, h14, 0);
                            b(this.f27834h, this.f27810k, -this.f27828b.p());
                            b(this.f27835i, this.f27834h, this.f27831e.f27790g);
                            return;
                        }
                        return;
                    } else if (!(eVar2 instanceof i) && eVar2.L() != null && this.f27828b.o(d.a.CENTER).f27399f == null) {
                        b(this.f27834h, this.f27828b.L().f27450f.f27834h, this.f27828b.a0());
                        b(this.f27835i, this.f27834h, this.f27831e.f27790g);
                        if (this.f27828b.b0()) {
                            b(this.f27810k, this.f27834h, this.f27828b.p());
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
            }
        }
        if (z10 || this.f27830d != e.b.MATCH_CONSTRAINT) {
            gVar.b(this);
        } else {
            e eVar3 = this.f27828b;
            int i10 = eVar3.f27486x;
            if (i10 == 2) {
                e L12 = eVar3.L();
                if (L12 != null) {
                    g gVar2 = L12.f27450f.f27831e;
                    this.f27831e.f27795l.add(gVar2);
                    gVar2.f27794k.add(this.f27831e);
                    g gVar3 = this.f27831e;
                    gVar3.f27785b = true;
                    gVar3.f27794k.add(this.f27834h);
                    this.f27831e.f27794k.add(this.f27835i);
                }
            } else if (i10 == 3 && !eVar3.m0()) {
                e eVar4 = this.f27828b;
                if (eVar4.f27484w != 3) {
                    g gVar4 = eVar4.f27448e.f27831e;
                    this.f27831e.f27795l.add(gVar4);
                    gVar4.f27794k.add(this.f27831e);
                    g gVar5 = this.f27831e;
                    gVar5.f27785b = true;
                    gVar5.f27794k.add(this.f27834h);
                    this.f27831e.f27794k.add(this.f27835i);
                }
            }
        }
        e eVar5 = this.f27828b;
        d[] dVarArr2 = eVar5.f27436W;
        d dVar5 = dVarArr2[2];
        d dVar6 = dVar5.f27399f;
        if (dVar6 != null && dVarArr2[3].f27399f != null) {
            if (eVar5.m0()) {
                this.f27834h.f27789f = this.f27828b.f27436W[2].f();
                this.f27835i.f27789f = -this.f27828b.f27436W[3].f();
            } else {
                f h15 = h(this.f27828b.f27436W[2]);
                f h16 = h(this.f27828b.f27436W[3]);
                if (h15 != null) {
                    h15.b(this);
                }
                if (h16 != null) {
                    h16.b(this);
                }
                this.f27836j = p.b.CENTER;
            }
            if (this.f27828b.b0()) {
                c(this.f27810k, this.f27834h, 1, this.f27811l);
            }
        } else if (dVar6 != null) {
            f h17 = h(dVar5);
            if (h17 != null) {
                b(this.f27834h, h17, this.f27828b.f27436W[2].f());
                c(this.f27835i, this.f27834h, 1, this.f27831e);
                if (this.f27828b.b0()) {
                    c(this.f27810k, this.f27834h, 1, this.f27811l);
                }
                e.b bVar2 = this.f27830d;
                e.b bVar3 = e.b.MATCH_CONSTRAINT;
                if (bVar2 == bVar3 && this.f27828b.v() > 0.0f) {
                    l lVar = this.f27828b.f27448e;
                    if (lVar.f27830d == bVar3) {
                        lVar.f27831e.f27794k.add(this.f27831e);
                        this.f27831e.f27795l.add(this.f27828b.f27448e.f27831e);
                        this.f27831e.f27784a = this;
                    }
                }
            }
        } else {
            d dVar7 = dVarArr2[3];
            if (dVar7.f27399f != null) {
                f h18 = h(dVar7);
                if (h18 != null) {
                    b(this.f27835i, h18, -this.f27828b.f27436W[3].f());
                    c(this.f27834h, this.f27835i, -1, this.f27831e);
                    if (this.f27828b.b0()) {
                        c(this.f27810k, this.f27834h, 1, this.f27811l);
                    }
                }
            } else {
                d dVar8 = dVarArr2[4];
                if (dVar8.f27399f != null) {
                    f h19 = h(dVar8);
                    if (h19 != null) {
                        b(this.f27810k, h19, 0);
                        c(this.f27834h, this.f27810k, -1, this.f27811l);
                        c(this.f27835i, this.f27834h, 1, this.f27831e);
                    }
                } else if (!(eVar5 instanceof i) && eVar5.L() != null) {
                    b(this.f27834h, this.f27828b.L().f27450f.f27834h, this.f27828b.a0());
                    c(this.f27835i, this.f27834h, 1, this.f27831e);
                    if (this.f27828b.b0()) {
                        c(this.f27810k, this.f27834h, 1, this.f27811l);
                    }
                    e.b bVar4 = this.f27830d;
                    e.b bVar5 = e.b.MATCH_CONSTRAINT;
                    if (bVar4 == bVar5 && this.f27828b.v() > 0.0f) {
                        l lVar2 = this.f27828b.f27448e;
                        if (lVar2.f27830d == bVar5) {
                            lVar2.f27831e.f27794k.add(this.f27831e);
                            this.f27831e.f27795l.add(this.f27828b.f27448e.f27831e);
                            this.f27831e.f27784a = this;
                        }
                    }
                }
            }
        }
        if (this.f27831e.f27795l.size() == 0) {
            this.f27831e.f27786c = true;
        }
    }

    public void e() {
        f fVar = this.f27834h;
        if (fVar.f27793j) {
            this.f27828b.r1(fVar.f27790g);
        }
    }

    /* access modifiers changed from: package-private */
    public void f() {
        this.f27829c = null;
        this.f27834h.c();
        this.f27835i.c();
        this.f27810k.c();
        this.f27831e.c();
        this.f27833g = false;
    }

    /* access modifiers changed from: package-private */
    public boolean m() {
        return this.f27830d != e.b.MATCH_CONSTRAINT || this.f27828b.f27486x == 0;
    }

    /* access modifiers changed from: package-private */
    public void q() {
        this.f27833g = false;
        this.f27834h.c();
        this.f27834h.f27793j = false;
        this.f27835i.c();
        this.f27835i.f27793j = false;
        this.f27810k.c();
        this.f27810k.f27793j = false;
        this.f27831e.f27793j = false;
    }

    public String toString() {
        return "VerticalRun " + this.f27828b.t();
    }
}
