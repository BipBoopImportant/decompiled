package p2;

import java.util.ArrayList;
import p2.e;

/* renamed from: p2.c  reason: case insensitive filesystem */
public class C5758c {

    /* renamed from: a  reason: collision with root package name */
    protected e f27372a;

    /* renamed from: b  reason: collision with root package name */
    protected e f27373b;

    /* renamed from: c  reason: collision with root package name */
    protected e f27374c;

    /* renamed from: d  reason: collision with root package name */
    protected e f27375d;

    /* renamed from: e  reason: collision with root package name */
    protected e f27376e;

    /* renamed from: f  reason: collision with root package name */
    protected e f27377f;

    /* renamed from: g  reason: collision with root package name */
    protected e f27378g;

    /* renamed from: h  reason: collision with root package name */
    protected ArrayList<e> f27379h;

    /* renamed from: i  reason: collision with root package name */
    protected int f27380i;

    /* renamed from: j  reason: collision with root package name */
    protected int f27381j;

    /* renamed from: k  reason: collision with root package name */
    protected float f27382k = 0.0f;

    /* renamed from: l  reason: collision with root package name */
    int f27383l;

    /* renamed from: m  reason: collision with root package name */
    int f27384m;

    /* renamed from: n  reason: collision with root package name */
    int f27385n;

    /* renamed from: o  reason: collision with root package name */
    boolean f27386o;

    /* renamed from: p  reason: collision with root package name */
    private int f27387p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f27388q;

    /* renamed from: r  reason: collision with root package name */
    protected boolean f27389r;

    /* renamed from: s  reason: collision with root package name */
    protected boolean f27390s;

    /* renamed from: t  reason: collision with root package name */
    protected boolean f27391t;

    /* renamed from: u  reason: collision with root package name */
    protected boolean f27392u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f27393v;

    public C5758c(e eVar, int i10, boolean z10) {
        this.f27372a = eVar;
        this.f27387p = i10;
        this.f27388q = z10;
    }

    private void b() {
        int i10 = this.f27387p * 2;
        e eVar = this.f27372a;
        boolean z10 = true;
        this.f27386o = true;
        e eVar2 = eVar;
        boolean z11 = false;
        while (!z11) {
            this.f27380i++;
            e[] eVarArr = eVar.f27415F0;
            int i11 = this.f27387p;
            e eVar3 = null;
            eVarArr[i11] = null;
            eVar.f27413E0[i11] = null;
            if (eVar.X() != 8) {
                this.f27383l++;
                e.b u10 = eVar.u(this.f27387p);
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (u10 != bVar) {
                    this.f27384m += eVar.F(this.f27387p);
                }
                int f10 = this.f27384m + eVar.f27436W[i10].f();
                this.f27384m = f10;
                int i12 = i10 + 1;
                this.f27384m = f10 + eVar.f27436W[i12].f();
                int f11 = this.f27385n + eVar.f27436W[i10].f();
                this.f27385n = f11;
                this.f27385n = f11 + eVar.f27436W[i12].f();
                if (this.f27373b == null) {
                    this.f27373b = eVar;
                }
                this.f27375d = eVar;
                e.b[] bVarArr = eVar.f27439Z;
                int i13 = this.f27387p;
                if (bVarArr[i13] == bVar) {
                    int i14 = eVar.f27488y[i13];
                    if (i14 == 0 || i14 == 3 || i14 == 2) {
                        this.f27381j++;
                        float f12 = eVar.f27411D0[i13];
                        if (f12 > 0.0f) {
                            this.f27382k += f12;
                        }
                        if (c(eVar, i13)) {
                            if (f12 < 0.0f) {
                                this.f27389r = true;
                            } else {
                                this.f27390s = true;
                            }
                            if (this.f27379h == null) {
                                this.f27379h = new ArrayList<>();
                            }
                            this.f27379h.add(eVar);
                        }
                        if (this.f27377f == null) {
                            this.f27377f = eVar;
                        }
                        e eVar4 = this.f27378g;
                        if (eVar4 != null) {
                            eVar4.f27413E0[this.f27387p] = eVar;
                        }
                        this.f27378g = eVar;
                    }
                    if (this.f27387p == 0) {
                        if (eVar.f27484w != 0) {
                            this.f27386o = false;
                        } else if (!(eVar.f27490z == 0 && eVar.f27404A == 0)) {
                            this.f27386o = false;
                        }
                    } else if (eVar.f27486x != 0) {
                        this.f27386o = false;
                    } else if (!(eVar.f27408C == 0 && eVar.f27410D == 0)) {
                        this.f27386o = false;
                    }
                    if (eVar.f27447d0 != 0.0f) {
                        this.f27386o = false;
                        this.f27392u = true;
                    }
                }
            }
            if (eVar2 != eVar) {
                eVar2.f27415F0[this.f27387p] = eVar;
            }
            d dVar = eVar.f27436W[i10 + 1].f27399f;
            if (dVar != null) {
                e eVar5 = dVar.f27397d;
                d dVar2 = eVar5.f27436W[i10].f27399f;
                if (dVar2 != null && dVar2.f27397d == eVar) {
                    eVar3 = eVar5;
                }
            }
            if (eVar3 == null) {
                eVar3 = eVar;
                z11 = true;
            }
            eVar2 = eVar;
            eVar = eVar3;
        }
        e eVar6 = this.f27373b;
        if (eVar6 != null) {
            this.f27384m -= eVar6.f27436W[i10].f();
        }
        e eVar7 = this.f27375d;
        if (eVar7 != null) {
            this.f27384m -= eVar7.f27436W[i10 + 1].f();
        }
        this.f27374c = eVar;
        if (this.f27387p != 0 || !this.f27388q) {
            this.f27376e = this.f27372a;
        } else {
            this.f27376e = eVar;
        }
        if (!this.f27390s || !this.f27389r) {
            z10 = false;
        }
        this.f27391t = z10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        r2 = r2.f27488y[r3];
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean c(p2.e r2, int r3) {
        /*
            int r0 = r2.X()
            r1 = 8
            if (r0 == r1) goto L_0x001b
            p2.e$b[] r0 = r2.f27439Z
            r0 = r0[r3]
            p2.e$b r1 = p2.e.b.MATCH_CONSTRAINT
            if (r0 != r1) goto L_0x001b
            int[] r2 = r2.f27488y
            r2 = r2[r3]
            if (r2 == 0) goto L_0x0019
            r3 = 3
            if (r2 != r3) goto L_0x001b
        L_0x0019:
            r2 = 1
            goto L_0x001c
        L_0x001b:
            r2 = 0
        L_0x001c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p2.C5758c.c(p2.e, int):boolean");
    }

    public void a() {
        if (!this.f27393v) {
            b();
        }
        this.f27393v = true;
    }
}
