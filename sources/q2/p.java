package q2;

import p2.d;
import p2.e;

public abstract class p implements d {

    /* renamed from: a  reason: collision with root package name */
    public int f27827a;

    /* renamed from: b  reason: collision with root package name */
    e f27828b;

    /* renamed from: c  reason: collision with root package name */
    m f27829c;

    /* renamed from: d  reason: collision with root package name */
    protected e.b f27830d;

    /* renamed from: e  reason: collision with root package name */
    g f27831e = new g(this);

    /* renamed from: f  reason: collision with root package name */
    public int f27832f = 0;

    /* renamed from: g  reason: collision with root package name */
    boolean f27833g = false;

    /* renamed from: h  reason: collision with root package name */
    public f f27834h = new f(this);

    /* renamed from: i  reason: collision with root package name */
    public f f27835i = new f(this);

    /* renamed from: j  reason: collision with root package name */
    protected b f27836j = b.NONE;

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f27837a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                p2.d$a[] r0 = p2.d.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f27837a = r0
                p2.d$a r1 = p2.d.a.LEFT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f27837a     // Catch:{ NoSuchFieldError -> 0x001d }
                p2.d$a r1 = p2.d.a.RIGHT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f27837a     // Catch:{ NoSuchFieldError -> 0x0028 }
                p2.d$a r1 = p2.d.a.TOP     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f27837a     // Catch:{ NoSuchFieldError -> 0x0033 }
                p2.d$a r1 = p2.d.a.BASELINE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f27837a     // Catch:{ NoSuchFieldError -> 0x003e }
                p2.d$a r1 = p2.d.a.BOTTOM     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: q2.p.a.<clinit>():void");
        }
    }

    enum b {
        NONE,
        START,
        END,
        CENTER
    }

    public p(e eVar) {
        this.f27828b = eVar;
    }

    private void l(int i10, int i11) {
        int i12 = this.f27827a;
        if (i12 == 0) {
            this.f27831e.d(g(i11, i10));
        } else if (i12 == 1) {
            this.f27831e.d(Math.min(g(this.f27831e.f27796m, i10), i11));
        } else if (i12 == 2) {
            e L10 = this.f27828b.L();
            if (L10 != null) {
                g gVar = (i10 == 0 ? L10.f27448e : L10.f27450f).f27831e;
                if (gVar.f27793j) {
                    this.f27831e.d(g((int) ((((float) gVar.f27790g) * (i10 == 0 ? this.f27828b.f27406B : this.f27828b.f27412E)) + 0.5f), i10));
                }
            }
        } else if (i12 == 3) {
            e eVar = this.f27828b;
            p pVar = eVar.f27448e;
            e.b bVar = pVar.f27830d;
            e.b bVar2 = e.b.MATCH_CONSTRAINT;
            if (bVar == bVar2 && pVar.f27827a == 3) {
                n nVar = eVar.f27450f;
                if (nVar.f27830d == bVar2 && nVar.f27827a == 3) {
                    return;
                }
            }
            if (i10 == 0) {
                pVar = eVar.f27450f;
            }
            if (pVar.f27831e.f27793j) {
                float v10 = eVar.v();
                this.f27831e.d(i10 == 1 ? (int) ((((float) pVar.f27831e.f27790g) / v10) + 0.5f) : (int) ((v10 * ((float) pVar.f27831e.f27790g)) + 0.5f));
            }
        }
    }

    public void a(d dVar) {
    }

    /* access modifiers changed from: protected */
    public final void b(f fVar, f fVar2, int i10) {
        fVar.f27795l.add(fVar2);
        fVar.f27789f = i10;
        fVar2.f27794k.add(fVar);
    }

    /* access modifiers changed from: protected */
    public final void c(f fVar, f fVar2, int i10, g gVar) {
        fVar.f27795l.add(fVar2);
        fVar.f27795l.add(this.f27831e);
        fVar.f27791h = i10;
        fVar.f27792i = gVar;
        fVar2.f27794k.add(fVar);
        gVar.f27794k.add(fVar);
    }

    /* access modifiers changed from: package-private */
    public abstract void d();

    /* access modifiers changed from: package-private */
    public abstract void e();

    /* access modifiers changed from: package-private */
    public abstract void f();

    /* access modifiers changed from: protected */
    public final int g(int i10, int i11) {
        int i12;
        if (i11 == 0) {
            e eVar = this.f27828b;
            int i13 = eVar.f27404A;
            i12 = Math.max(eVar.f27490z, i10);
            if (i13 > 0) {
                i12 = Math.min(i13, i10);
            }
            if (i12 == i10) {
                return i10;
            }
        } else {
            e eVar2 = this.f27828b;
            int i14 = eVar2.f27410D;
            int max = Math.max(eVar2.f27408C, i10);
            if (i14 > 0) {
                max = Math.min(i14, i10);
            }
            if (i12 == i10) {
                return i10;
            }
        }
        return i12;
    }

    /* access modifiers changed from: protected */
    public final f h(d dVar) {
        d dVar2 = dVar.f27399f;
        if (dVar2 == null) {
            return null;
        }
        e eVar = dVar2.f27397d;
        int i10 = a.f27837a[dVar2.f27398e.ordinal()];
        if (i10 == 1) {
            return eVar.f27448e.f27834h;
        }
        if (i10 == 2) {
            return eVar.f27448e.f27835i;
        }
        if (i10 == 3) {
            return eVar.f27450f.f27834h;
        }
        if (i10 == 4) {
            return eVar.f27450f.f27810k;
        }
        if (i10 != 5) {
            return null;
        }
        return eVar.f27450f.f27835i;
    }

    /* access modifiers changed from: protected */
    public final f i(d dVar, int i10) {
        d dVar2 = dVar.f27399f;
        if (dVar2 == null) {
            return null;
        }
        e eVar = dVar2.f27397d;
        p pVar = i10 == 0 ? eVar.f27448e : eVar.f27450f;
        int i11 = a.f27837a[dVar2.f27398e.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 5) {
                        return null;
                    }
                }
            }
            return pVar.f27835i;
        }
        return pVar.f27834h;
    }

    public long j() {
        g gVar = this.f27831e;
        if (gVar.f27793j) {
            return (long) gVar.f27790g;
        }
        return 0;
    }

    public boolean k() {
        return this.f27833g;
    }

    /* access modifiers changed from: package-private */
    public abstract boolean m();

    /* access modifiers changed from: protected */
    public void n(d dVar, d dVar2, d dVar3, int i10) {
        f h10 = h(dVar2);
        f h11 = h(dVar3);
        if (h10.f27793j && h11.f27793j) {
            int f10 = h10.f27790g + dVar2.f();
            int f11 = h11.f27790g - dVar3.f();
            int i11 = f11 - f10;
            if (!this.f27831e.f27793j && this.f27830d == e.b.MATCH_CONSTRAINT) {
                l(i10, i11);
            }
            g gVar = this.f27831e;
            if (gVar.f27793j) {
                if (gVar.f27790g == i11) {
                    this.f27834h.d(f10);
                    this.f27835i.d(f11);
                    return;
                }
                float y10 = i10 == 0 ? this.f27828b.y() : this.f27828b.T();
                if (h10 == h11) {
                    f10 = h10.f27790g;
                    f11 = h11.f27790g;
                    y10 = 0.5f;
                }
                this.f27834h.d((int) (((float) f10) + 0.5f + (((float) ((f11 - f10) - this.f27831e.f27790g)) * y10)));
                this.f27835i.d(this.f27834h.f27790g + this.f27831e.f27790g);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void o(d dVar) {
    }

    /* access modifiers changed from: protected */
    public void p(d dVar) {
    }
}
