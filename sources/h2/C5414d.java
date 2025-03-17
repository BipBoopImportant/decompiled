package h2;

import h2.C5419i;
import java.util.Arrays;
import java.util.HashMap;
import p2.d;
import p2.e;

/* renamed from: h2.d  reason: case insensitive filesystem */
public class C5414d {

    /* renamed from: s  reason: collision with root package name */
    public static boolean f23797s = false;

    /* renamed from: t  reason: collision with root package name */
    public static boolean f23798t = true;

    /* renamed from: u  reason: collision with root package name */
    public static boolean f23799u = true;

    /* renamed from: v  reason: collision with root package name */
    public static boolean f23800v = true;

    /* renamed from: w  reason: collision with root package name */
    public static boolean f23801w = false;

    /* renamed from: x  reason: collision with root package name */
    public static long f23802x;

    /* renamed from: y  reason: collision with root package name */
    public static long f23803y;

    /* renamed from: a  reason: collision with root package name */
    private int f23804a = 1000;

    /* renamed from: b  reason: collision with root package name */
    public boolean f23805b = false;

    /* renamed from: c  reason: collision with root package name */
    int f23806c = 0;

    /* renamed from: d  reason: collision with root package name */
    private HashMap<String, C5419i> f23807d = null;

    /* renamed from: e  reason: collision with root package name */
    private a f23808e;

    /* renamed from: f  reason: collision with root package name */
    private int f23809f = 32;

    /* renamed from: g  reason: collision with root package name */
    private int f23810g = 32;

    /* renamed from: h  reason: collision with root package name */
    C5412b[] f23811h = new C5412b[32];

    /* renamed from: i  reason: collision with root package name */
    public boolean f23812i = false;

    /* renamed from: j  reason: collision with root package name */
    public boolean f23813j = false;

    /* renamed from: k  reason: collision with root package name */
    private boolean[] f23814k = new boolean[32];

    /* renamed from: l  reason: collision with root package name */
    int f23815l = 1;

    /* renamed from: m  reason: collision with root package name */
    int f23816m = 0;

    /* renamed from: n  reason: collision with root package name */
    private int f23817n = 32;

    /* renamed from: o  reason: collision with root package name */
    final C5413c f23818o;

    /* renamed from: p  reason: collision with root package name */
    private C5419i[] f23819p = new C5419i[1000];

    /* renamed from: q  reason: collision with root package name */
    private int f23820q = 0;

    /* renamed from: r  reason: collision with root package name */
    private a f23821r;

    /* renamed from: h2.d$a */
    interface a {
        void a(a aVar);

        C5419i b(C5414d dVar, boolean[] zArr);

        void c(C5419i iVar);

        void clear();

        C5419i getKey();

        boolean isEmpty();
    }

    /* renamed from: h2.d$b */
    static class b extends C5412b {
        b(C5413c cVar) {
            this.f23791e = new C5420j(this, cVar);
        }
    }

    public C5414d() {
        D();
        C5413c cVar = new C5413c();
        this.f23818o = cVar;
        this.f23808e = new C5418h(cVar);
        if (f23801w) {
            this.f23821r = new b(cVar);
        } else {
            this.f23821r = new C5412b(cVar);
        }
    }

    private int C(a aVar, boolean z10) {
        for (int i10 = 0; i10 < this.f23815l; i10++) {
            this.f23814k[i10] = false;
        }
        boolean z11 = false;
        int i11 = 0;
        while (!z11) {
            i11++;
            if (i11 >= this.f23815l * 2) {
                return i11;
            }
            if (aVar.getKey() != null) {
                this.f23814k[aVar.getKey().f23837c] = true;
            }
            C5419i b10 = aVar.b(this, this.f23814k);
            if (b10 != null) {
                boolean[] zArr = this.f23814k;
                int i12 = b10.f23837c;
                if (zArr[i12]) {
                    return i11;
                }
                zArr[i12] = true;
            }
            if (b10 != null) {
                float f10 = Float.MAX_VALUE;
                int i13 = -1;
                for (int i14 = 0; i14 < this.f23816m; i14++) {
                    C5412b bVar = this.f23811h[i14];
                    if (bVar.f23787a.f23844j != C5419i.a.UNRESTRICTED && !bVar.f23792f && bVar.t(b10)) {
                        float i15 = bVar.f23791e.i(b10);
                        if (i15 < 0.0f) {
                            float f11 = (-bVar.f23788b) / i15;
                            if (f11 < f10) {
                                i13 = i14;
                                f10 = f11;
                            }
                        }
                    }
                }
                if (i13 > -1) {
                    C5412b bVar2 = this.f23811h[i13];
                    bVar2.f23787a.f23838d = -1;
                    bVar2.x(b10);
                    C5419i iVar = bVar2.f23787a;
                    iVar.f23838d = i13;
                    iVar.C(this, bVar2);
                }
            } else {
                z11 = true;
            }
        }
        return i11;
    }

    private void D() {
        int i10 = 0;
        if (f23801w) {
            while (i10 < this.f23816m) {
                C5412b bVar = this.f23811h[i10];
                if (bVar != null) {
                    this.f23818o.f23793a.a(bVar);
                }
                this.f23811h[i10] = null;
                i10++;
            }
            return;
        }
        while (i10 < this.f23816m) {
            C5412b bVar2 = this.f23811h[i10];
            if (bVar2 != null) {
                this.f23818o.f23794b.a(bVar2);
            }
            this.f23811h[i10] = null;
            i10++;
        }
    }

    private C5419i a(C5419i.a aVar, String str) {
        C5419i b10 = this.f23818o.f23795c.b();
        if (b10 == null) {
            b10 = new C5419i(aVar, str);
            b10.B(aVar, str);
        } else {
            b10.n();
            b10.B(aVar, str);
        }
        int i10 = this.f23820q;
        int i11 = this.f23804a;
        if (i10 >= i11) {
            int i12 = i11 * 2;
            this.f23804a = i12;
            this.f23819p = (C5419i[]) Arrays.copyOf(this.f23819p, i12);
        }
        C5419i[] iVarArr = this.f23819p;
        int i13 = this.f23820q;
        this.f23820q = i13 + 1;
        iVarArr[i13] = b10;
        return b10;
    }

    private void l(C5412b bVar) {
        int i10;
        if (!f23799u || !bVar.f23792f) {
            C5412b[] bVarArr = this.f23811h;
            int i11 = this.f23816m;
            bVarArr[i11] = bVar;
            C5419i iVar = bVar.f23787a;
            iVar.f23838d = i11;
            this.f23816m = i11 + 1;
            iVar.C(this, bVar);
        } else {
            bVar.f23787a.v(this, bVar.f23788b);
        }
        if (f23799u && this.f23805b) {
            int i12 = 0;
            while (i12 < this.f23816m) {
                if (this.f23811h[i12] == null) {
                    System.out.println("WTF");
                }
                C5412b bVar2 = this.f23811h[i12];
                if (bVar2 != null && bVar2.f23792f) {
                    bVar2.f23787a.v(this, bVar2.f23788b);
                    if (f23801w) {
                        this.f23818o.f23793a.a(bVar2);
                    } else {
                        this.f23818o.f23794b.a(bVar2);
                    }
                    this.f23811h[i12] = null;
                    int i13 = i12 + 1;
                    int i14 = i13;
                    while (true) {
                        i10 = this.f23816m;
                        if (i13 >= i10) {
                            break;
                        }
                        C5412b[] bVarArr2 = this.f23811h;
                        int i15 = i13 - 1;
                        C5412b bVar3 = bVarArr2[i13];
                        bVarArr2[i15] = bVar3;
                        C5419i iVar2 = bVar3.f23787a;
                        if (iVar2.f23838d == i13) {
                            iVar2.f23838d = i15;
                        }
                        i14 = i13;
                        i13++;
                    }
                    if (i14 < i10) {
                        this.f23811h[i14] = null;
                    }
                    this.f23816m = i10 - 1;
                    i12--;
                }
                i12++;
            }
            this.f23805b = false;
        }
    }

    private void n() {
        for (int i10 = 0; i10 < this.f23816m; i10++) {
            C5412b bVar = this.f23811h[i10];
            bVar.f23787a.f23840f = bVar.f23788b;
        }
    }

    public static C5412b s(C5414d dVar, C5419i iVar, C5419i iVar2, float f10) {
        return dVar.r().j(iVar, iVar2, f10);
    }

    private int u(a aVar) {
        for (int i10 = 0; i10 < this.f23816m; i10++) {
            C5412b bVar = this.f23811h[i10];
            if (bVar.f23787a.f23844j != C5419i.a.UNRESTRICTED && bVar.f23788b < 0.0f) {
                boolean z10 = false;
                int i11 = 0;
                while (!z10) {
                    i11++;
                    float f10 = Float.MAX_VALUE;
                    int i12 = 0;
                    int i13 = -1;
                    int i14 = -1;
                    int i15 = 0;
                    while (true) {
                        if (i12 >= this.f23816m) {
                            break;
                        }
                        C5412b bVar2 = this.f23811h[i12];
                        if (bVar2.f23787a.f23844j != C5419i.a.UNRESTRICTED && !bVar2.f23792f && bVar2.f23788b < 0.0f) {
                            int i16 = 9;
                            if (f23800v) {
                                int g10 = bVar2.f23791e.g();
                                int i17 = 0;
                                while (i17 < g10) {
                                    C5419i b10 = bVar2.f23791e.b(i17);
                                    float i18 = bVar2.f23791e.i(b10);
                                    if (i18 > 0.0f) {
                                        int i19 = 0;
                                        while (i19 < i16) {
                                            float f11 = b10.f23842h[i19] / i18;
                                            if ((f11 < f10 && i19 == i15) || i19 > i15) {
                                                i15 = i19;
                                                i14 = b10.f23837c;
                                                i13 = i12;
                                                f10 = f11;
                                            }
                                            i19++;
                                            i16 = 9;
                                        }
                                    }
                                    i17++;
                                    i16 = 9;
                                }
                            } else {
                                for (int i20 = 1; i20 < this.f23815l; i20++) {
                                    C5419i iVar = this.f23818o.f23796d[i20];
                                    float i21 = bVar2.f23791e.i(iVar);
                                    if (i21 > 0.0f) {
                                        for (int i22 = 0; i22 < 9; i22++) {
                                            float f12 = iVar.f23842h[i22] / i21;
                                            if ((f12 < f10 && i22 == i15) || i22 > i15) {
                                                i13 = i12;
                                                i14 = i20;
                                                i15 = i22;
                                                f10 = f12;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        i12++;
                    }
                    if (i13 != -1) {
                        C5412b bVar3 = this.f23811h[i13];
                        bVar3.f23787a.f23838d = -1;
                        bVar3.x(this.f23818o.f23796d[i14]);
                        C5419i iVar2 = bVar3.f23787a;
                        iVar2.f23838d = i13;
                        iVar2.C(this, bVar3);
                    } else {
                        z10 = true;
                    }
                    if (i11 > this.f23815l / 2) {
                        z10 = true;
                    }
                }
                return i11;
            }
        }
        return 0;
    }

    public static C5415e x() {
        return null;
    }

    private void z() {
        int i10 = this.f23809f * 2;
        this.f23809f = i10;
        this.f23811h = (C5412b[]) Arrays.copyOf(this.f23811h, i10);
        C5413c cVar = this.f23818o;
        cVar.f23796d = (C5419i[]) Arrays.copyOf(cVar.f23796d, this.f23809f);
        int i11 = this.f23809f;
        this.f23814k = new boolean[i11];
        this.f23810g = i11;
        this.f23817n = i11;
    }

    public void A() {
        if (this.f23808e.isEmpty()) {
            n();
        } else if (this.f23812i || this.f23813j) {
            for (int i10 = 0; i10 < this.f23816m; i10++) {
                if (!this.f23811h[i10].f23792f) {
                    B(this.f23808e);
                    return;
                }
            }
            n();
        } else {
            B(this.f23808e);
        }
    }

    /* access modifiers changed from: package-private */
    public void B(a aVar) {
        u(aVar);
        C(aVar, false);
        n();
    }

    public void E() {
        C5413c cVar;
        int i10 = 0;
        while (true) {
            cVar = this.f23818o;
            C5419i[] iVarArr = cVar.f23796d;
            if (i10 >= iVarArr.length) {
                break;
            }
            C5419i iVar = iVarArr[i10];
            if (iVar != null) {
                iVar.n();
            }
            i10++;
        }
        cVar.f23795c.c(this.f23819p, this.f23820q);
        this.f23820q = 0;
        Arrays.fill(this.f23818o.f23796d, (Object) null);
        HashMap<String, C5419i> hashMap = this.f23807d;
        if (hashMap != null) {
            hashMap.clear();
        }
        this.f23806c = 0;
        this.f23808e.clear();
        this.f23815l = 1;
        for (int i11 = 0; i11 < this.f23816m; i11++) {
            C5412b bVar = this.f23811h[i11];
            if (bVar != null) {
                bVar.f23789c = false;
            }
        }
        D();
        this.f23816m = 0;
        if (f23801w) {
            this.f23821r = new b(this.f23818o);
        } else {
            this.f23821r = new C5412b(this.f23818o);
        }
    }

    public void b(e eVar, e eVar2, float f10, int i10) {
        e eVar3 = eVar;
        e eVar4 = eVar2;
        d.a aVar = d.a.LEFT;
        C5419i q10 = q(eVar3.o(aVar));
        d.a aVar2 = d.a.TOP;
        C5419i q11 = q(eVar3.o(aVar2));
        d.a aVar3 = d.a.RIGHT;
        C5419i q12 = q(eVar3.o(aVar3));
        d.a aVar4 = d.a.BOTTOM;
        C5419i q13 = q(eVar3.o(aVar4));
        C5419i q14 = q(eVar4.o(aVar));
        C5419i q15 = q(eVar4.o(aVar2));
        C5419i q16 = q(eVar4.o(aVar3));
        C5419i q17 = q(eVar4.o(aVar4));
        C5412b r10 = r();
        double d10 = (double) f10;
        C5419i iVar = q16;
        double d11 = (double) i10;
        r10.q(q11, q13, q15, q17, (float) (Math.sin(d10) * d11));
        d(r10);
        C5412b r11 = r();
        r11.q(q10, q12, q14, iVar, (float) (Math.cos(d10) * d11));
        d(r11);
    }

    public void c(C5419i iVar, C5419i iVar2, int i10, float f10, C5419i iVar3, C5419i iVar4, int i11, int i12) {
        int i13 = i12;
        C5412b r10 = r();
        r10.h(iVar, iVar2, i10, f10, iVar3, iVar4, i11);
        if (i13 != 8) {
            r10.d(this, i13);
        }
        d(r10);
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0082 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0083  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void d(h2.C5412b r6) {
        /*
            r5 = this;
            if (r6 != 0) goto L_0x0003
            return
        L_0x0003:
            int r0 = r5.f23816m
            r1 = 1
            int r0 = r0 + r1
            int r2 = r5.f23817n
            if (r0 >= r2) goto L_0x0012
            int r0 = r5.f23815l
            int r0 = r0 + r1
            int r2 = r5.f23810g
            if (r0 < r2) goto L_0x0015
        L_0x0012:
            r5.z()
        L_0x0015:
            boolean r0 = r6.f23792f
            r2 = 0
            if (r0 != 0) goto L_0x0084
            r6.D(r5)
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L_0x0024
            return
        L_0x0024:
            r6.r()
            boolean r0 = r6.f(r5)
            if (r0 == 0) goto L_0x007b
            h2.i r0 = r5.p()
            r6.f23787a = r0
            int r3 = r5.f23816m
            r5.l(r6)
            int r4 = r5.f23816m
            int r3 = r3 + r1
            if (r4 != r3) goto L_0x007b
            h2.d$a r2 = r5.f23821r
            r2.a(r6)
            h2.d$a r2 = r5.f23821r
            r5.C(r2, r1)
            int r2 = r0.f23838d
            r3 = -1
            if (r2 != r3) goto L_0x007c
            h2.i r2 = r6.f23787a
            if (r2 != r0) goto L_0x0059
            h2.i r0 = r6.v(r0)
            if (r0 == 0) goto L_0x0059
            r6.x(r0)
        L_0x0059:
            boolean r0 = r6.f23792f
            if (r0 != 0) goto L_0x0062
            h2.i r0 = r6.f23787a
            r0.C(r5, r6)
        L_0x0062:
            boolean r0 = f23801w
            if (r0 == 0) goto L_0x006e
            h2.c r0 = r5.f23818o
            h2.f<h2.b> r0 = r0.f23793a
            r0.a(r6)
            goto L_0x0075
        L_0x006e:
            h2.c r0 = r5.f23818o
            h2.f<h2.b> r0 = r0.f23794b
            r0.a(r6)
        L_0x0075:
            int r0 = r5.f23816m
            int r0 = r0 - r1
            r5.f23816m = r0
            goto L_0x007c
        L_0x007b:
            r1 = r2
        L_0x007c:
            boolean r0 = r6.s()
            if (r0 != 0) goto L_0x0083
            return
        L_0x0083:
            r2 = r1
        L_0x0084:
            if (r2 != 0) goto L_0x0089
            r5.l(r6)
        L_0x0089:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h2.C5414d.d(h2.b):void");
    }

    public C5412b e(C5419i iVar, C5419i iVar2, int i10, int i11) {
        if (!f23798t || i11 != 8 || !iVar2.f23841g || iVar.f23838d != -1) {
            C5412b r10 = r();
            r10.n(iVar, iVar2, i10);
            if (i11 != 8) {
                r10.d(this, i11);
            }
            d(r10);
            return r10;
        }
        iVar.v(this, iVar2.f23840f + ((float) i10));
        return null;
    }

    public void f(C5419i iVar, int i10) {
        if (!f23798t || iVar.f23838d != -1) {
            int i11 = iVar.f23838d;
            if (i11 != -1) {
                C5412b bVar = this.f23811h[i11];
                if (bVar.f23792f) {
                    bVar.f23788b = (float) i10;
                } else if (bVar.f23791e.g() == 0) {
                    bVar.f23792f = true;
                    bVar.f23788b = (float) i10;
                } else {
                    C5412b r10 = r();
                    r10.m(iVar, i10);
                    d(r10);
                }
            } else {
                C5412b r11 = r();
                r11.i(iVar, i10);
                d(r11);
            }
        } else {
            float f10 = (float) i10;
            iVar.v(this, f10);
            for (int i12 = 0; i12 < this.f23806c + 1; i12++) {
                C5419i iVar2 = this.f23818o.f23796d[i12];
                if (iVar2 != null && iVar2.f23848n && iVar2.f23849o == iVar.f23837c) {
                    iVar2.v(this, iVar2.f23850p + f10);
                }
            }
        }
    }

    public void g(C5419i iVar, C5419i iVar2, int i10, boolean z10) {
        C5412b r10 = r();
        C5419i t10 = t();
        t10.f23839e = 0;
        r10.o(iVar, iVar2, t10, i10);
        d(r10);
    }

    public void h(C5419i iVar, C5419i iVar2, int i10, int i11) {
        C5412b r10 = r();
        C5419i t10 = t();
        t10.f23839e = 0;
        r10.o(iVar, iVar2, t10, i10);
        if (i11 != 8) {
            m(r10, (int) (r10.f23791e.i(t10) * -1.0f), i11);
        }
        d(r10);
    }

    public void i(C5419i iVar, C5419i iVar2, int i10, boolean z10) {
        C5412b r10 = r();
        C5419i t10 = t();
        t10.f23839e = 0;
        r10.p(iVar, iVar2, t10, i10);
        d(r10);
    }

    public void j(C5419i iVar, C5419i iVar2, int i10, int i11) {
        C5412b r10 = r();
        C5419i t10 = t();
        t10.f23839e = 0;
        r10.p(iVar, iVar2, t10, i10);
        if (i11 != 8) {
            m(r10, (int) (r10.f23791e.i(t10) * -1.0f), i11);
        }
        d(r10);
    }

    public void k(C5419i iVar, C5419i iVar2, C5419i iVar3, C5419i iVar4, float f10, int i10) {
        C5412b r10 = r();
        r10.k(iVar, iVar2, iVar3, iVar4, f10);
        if (i10 != 8) {
            r10.d(this, i10);
        }
        d(r10);
    }

    /* access modifiers changed from: package-private */
    public void m(C5412b bVar, int i10, int i11) {
        bVar.e(o(i11, (String) null), i10);
    }

    public C5419i o(int i10, String str) {
        if (this.f23815l + 1 >= this.f23810g) {
            z();
        }
        C5419i a10 = a(C5419i.a.ERROR, str);
        int i11 = this.f23806c + 1;
        this.f23806c = i11;
        this.f23815l++;
        a10.f23837c = i11;
        a10.f23839e = i10;
        this.f23818o.f23796d[i11] = a10;
        this.f23808e.c(a10);
        return a10;
    }

    public C5419i p() {
        if (this.f23815l + 1 >= this.f23810g) {
            z();
        }
        C5419i a10 = a(C5419i.a.SLACK, (String) null);
        int i10 = this.f23806c + 1;
        this.f23806c = i10;
        this.f23815l++;
        a10.f23837c = i10;
        this.f23818o.f23796d[i10] = a10;
        return a10;
    }

    public C5419i q(Object obj) {
        C5419i iVar = null;
        if (obj == null) {
            return null;
        }
        if (this.f23815l + 1 >= this.f23810g) {
            z();
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            iVar = dVar.i();
            if (iVar == null) {
                dVar.s(this.f23818o);
                iVar = dVar.i();
            }
            int i10 = iVar.f23837c;
            if (i10 == -1 || i10 > this.f23806c || this.f23818o.f23796d[i10] == null) {
                if (i10 != -1) {
                    iVar.n();
                }
                int i11 = this.f23806c + 1;
                this.f23806c = i11;
                this.f23815l++;
                iVar.f23837c = i11;
                iVar.f23844j = C5419i.a.UNRESTRICTED;
                this.f23818o.f23796d[i11] = iVar;
            }
        }
        return iVar;
    }

    public C5412b r() {
        C5412b bVar;
        if (f23801w) {
            bVar = this.f23818o.f23793a.b();
            if (bVar == null) {
                bVar = new b(this.f23818o);
                f23803y++;
            } else {
                bVar.y();
            }
        } else {
            bVar = this.f23818o.f23794b.b();
            if (bVar == null) {
                bVar = new C5412b(this.f23818o);
                f23802x++;
            } else {
                bVar.y();
            }
        }
        C5419i.j();
        return bVar;
    }

    public C5419i t() {
        if (this.f23815l + 1 >= this.f23810g) {
            z();
        }
        C5419i a10 = a(C5419i.a.SLACK, (String) null);
        int i10 = this.f23806c + 1;
        this.f23806c = i10;
        this.f23815l++;
        a10.f23837c = i10;
        this.f23818o.f23796d[i10] = a10;
        return a10;
    }

    public void v(C5415e eVar) {
    }

    public C5413c w() {
        return this.f23818o;
    }

    public int y(Object obj) {
        C5419i i10 = ((d) obj).i();
        if (i10 != null) {
            return (int) (i10.f23840f + 0.5f);
        }
        return 0;
    }
}
