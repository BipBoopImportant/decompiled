package h2;

import h2.C5414d;
import h2.C5419i;
import java.util.ArrayList;

/* renamed from: h2.b  reason: case insensitive filesystem */
public class C5412b implements C5414d.a {

    /* renamed from: a  reason: collision with root package name */
    C5419i f23787a = null;

    /* renamed from: b  reason: collision with root package name */
    float f23788b = 0.0f;

    /* renamed from: c  reason: collision with root package name */
    boolean f23789c = false;

    /* renamed from: d  reason: collision with root package name */
    ArrayList<C5419i> f23790d = new ArrayList<>();

    /* renamed from: e  reason: collision with root package name */
    public a f23791e;

    /* renamed from: f  reason: collision with root package name */
    boolean f23792f = false;

    /* renamed from: h2.b$a */
    public interface a {
        float a(C5419i iVar, boolean z10);

        C5419i b(int i10);

        float c(C5412b bVar, boolean z10);

        void clear();

        void d(C5419i iVar, float f10, boolean z10);

        void e();

        boolean f(C5419i iVar);

        int g();

        float h(int i10);

        float i(C5419i iVar);

        void j(C5419i iVar, float f10);

        void k(float f10);
    }

    public C5412b() {
    }

    private boolean u(C5419i iVar, C5414d dVar) {
        return iVar.f23847m <= 1;
    }

    private C5419i w(boolean[] zArr, C5419i iVar) {
        C5419i.a aVar;
        int g10 = this.f23791e.g();
        C5419i iVar2 = null;
        float f10 = 0.0f;
        for (int i10 = 0; i10 < g10; i10++) {
            float h10 = this.f23791e.h(i10);
            if (h10 < 0.0f) {
                C5419i b10 = this.f23791e.b(i10);
                if ((zArr == null || !zArr[b10.f23837c]) && b10 != iVar && (((aVar = b10.f23844j) == C5419i.a.SLACK || aVar == C5419i.a.ERROR) && h10 < f10)) {
                    f10 = h10;
                    iVar2 = b10;
                }
            }
        }
        return iVar2;
    }

    public void A(C5414d dVar, C5419i iVar, boolean z10) {
        if (iVar != null && iVar.f23841g) {
            this.f23788b += iVar.f23840f * this.f23791e.i(iVar);
            this.f23791e.a(iVar, z10);
            if (z10) {
                iVar.m(this);
            }
            if (C5414d.f23799u && this.f23791e.g() == 0) {
                this.f23792f = true;
                dVar.f23805b = true;
            }
        }
    }

    public void B(C5414d dVar, C5412b bVar, boolean z10) {
        this.f23788b += bVar.f23788b * this.f23791e.c(bVar, z10);
        if (z10) {
            bVar.f23787a.m(this);
        }
        if (C5414d.f23799u && this.f23787a != null && this.f23791e.g() == 0) {
            this.f23792f = true;
            dVar.f23805b = true;
        }
    }

    public void C(C5414d dVar, C5419i iVar, boolean z10) {
        if (iVar != null && iVar.f23848n) {
            float i10 = this.f23791e.i(iVar);
            this.f23788b += iVar.f23850p * i10;
            this.f23791e.a(iVar, z10);
            if (z10) {
                iVar.m(this);
            }
            this.f23791e.d(dVar.f23818o.f23796d[iVar.f23849o], i10, z10);
            if (C5414d.f23799u && this.f23791e.g() == 0) {
                this.f23792f = true;
                dVar.f23805b = true;
            }
        }
    }

    public void D(C5414d dVar) {
        if (dVar.f23811h.length != 0) {
            boolean z10 = false;
            while (!z10) {
                int g10 = this.f23791e.g();
                for (int i10 = 0; i10 < g10; i10++) {
                    C5419i b10 = this.f23791e.b(i10);
                    if (b10.f23838d != -1 || b10.f23841g || b10.f23848n) {
                        this.f23790d.add(b10);
                    }
                }
                int size = this.f23790d.size();
                if (size > 0) {
                    for (int i11 = 0; i11 < size; i11++) {
                        C5419i iVar = this.f23790d.get(i11);
                        if (iVar.f23841g) {
                            A(dVar, iVar, true);
                        } else if (iVar.f23848n) {
                            C(dVar, iVar, true);
                        } else {
                            B(dVar, dVar.f23811h[iVar.f23838d], true);
                        }
                    }
                    this.f23790d.clear();
                } else {
                    z10 = true;
                }
            }
            if (C5414d.f23799u && this.f23787a != null && this.f23791e.g() == 0) {
                this.f23792f = true;
                dVar.f23805b = true;
            }
        }
    }

    public void a(C5414d.a aVar) {
        if (aVar instanceof C5412b) {
            C5412b bVar = (C5412b) aVar;
            this.f23787a = null;
            this.f23791e.clear();
            for (int i10 = 0; i10 < bVar.f23791e.g(); i10++) {
                this.f23791e.d(bVar.f23791e.b(i10), bVar.f23791e.h(i10), true);
            }
        }
    }

    public C5419i b(C5414d dVar, boolean[] zArr) {
        return w(zArr, (C5419i) null);
    }

    public void c(C5419i iVar) {
        int i10 = iVar.f23839e;
        float f10 = 1.0f;
        if (i10 != 1) {
            if (i10 == 2) {
                f10 = 1000.0f;
            } else if (i10 == 3) {
                f10 = 1000000.0f;
            } else if (i10 == 4) {
                f10 = 1.0E9f;
            } else if (i10 == 5) {
                f10 = 1.0E12f;
            }
        }
        this.f23791e.j(iVar, f10);
    }

    public void clear() {
        this.f23791e.clear();
        this.f23787a = null;
        this.f23788b = 0.0f;
    }

    public C5412b d(C5414d dVar, int i10) {
        this.f23791e.j(dVar.o(i10, "ep"), 1.0f);
        this.f23791e.j(dVar.o(i10, "em"), -1.0f);
        return this;
    }

    /* access modifiers changed from: package-private */
    public C5412b e(C5419i iVar, int i10) {
        this.f23791e.j(iVar, (float) i10);
        return this;
    }

    /* access modifiers changed from: package-private */
    public boolean f(C5414d dVar) {
        boolean z10;
        C5419i g10 = g(dVar);
        if (g10 == null) {
            z10 = true;
        } else {
            x(g10);
            z10 = false;
        }
        if (this.f23791e.g() == 0) {
            this.f23792f = true;
        }
        return z10;
    }

    /* access modifiers changed from: package-private */
    public C5419i g(C5414d dVar) {
        boolean u10;
        boolean u11;
        int g10 = this.f23791e.g();
        C5419i iVar = null;
        float f10 = 0.0f;
        float f11 = 0.0f;
        boolean z10 = false;
        boolean z11 = false;
        C5419i iVar2 = null;
        for (int i10 = 0; i10 < g10; i10++) {
            float h10 = this.f23791e.h(i10);
            C5419i b10 = this.f23791e.b(i10);
            if (b10.f23844j == C5419i.a.UNRESTRICTED) {
                if (iVar == null) {
                    u11 = u(b10, dVar);
                } else if (f10 > h10) {
                    u11 = u(b10, dVar);
                } else if (!z10 && u(b10, dVar)) {
                    f10 = h10;
                    iVar = b10;
                    z10 = true;
                }
                z10 = u11;
                f10 = h10;
                iVar = b10;
            } else if (iVar == null && h10 < 0.0f) {
                if (iVar2 == null) {
                    u10 = u(b10, dVar);
                } else if (f11 > h10) {
                    u10 = u(b10, dVar);
                } else if (!z11 && u(b10, dVar)) {
                    f11 = h10;
                    iVar2 = b10;
                    z11 = true;
                }
                z11 = u10;
                f11 = h10;
                iVar2 = b10;
            }
        }
        return iVar != null ? iVar : iVar2;
    }

    public C5419i getKey() {
        return this.f23787a;
    }

    /* access modifiers changed from: package-private */
    public C5412b h(C5419i iVar, C5419i iVar2, int i10, float f10, C5419i iVar3, C5419i iVar4, int i11) {
        if (iVar2 == iVar3) {
            this.f23791e.j(iVar, 1.0f);
            this.f23791e.j(iVar4, 1.0f);
            this.f23791e.j(iVar2, -2.0f);
            return this;
        }
        if (f10 == 0.5f) {
            this.f23791e.j(iVar, 1.0f);
            this.f23791e.j(iVar2, -1.0f);
            this.f23791e.j(iVar3, -1.0f);
            this.f23791e.j(iVar4, 1.0f);
            if (i10 > 0 || i11 > 0) {
                this.f23788b = (float) ((-i10) + i11);
            }
        } else if (f10 <= 0.0f) {
            this.f23791e.j(iVar, -1.0f);
            this.f23791e.j(iVar2, 1.0f);
            this.f23788b = (float) i10;
        } else if (f10 >= 1.0f) {
            this.f23791e.j(iVar4, -1.0f);
            this.f23791e.j(iVar3, 1.0f);
            this.f23788b = (float) (-i11);
        } else {
            float f11 = 1.0f - f10;
            this.f23791e.j(iVar, f11 * 1.0f);
            this.f23791e.j(iVar2, f11 * -1.0f);
            this.f23791e.j(iVar3, -1.0f * f10);
            this.f23791e.j(iVar4, 1.0f * f10);
            if (i10 > 0 || i11 > 0) {
                this.f23788b = (((float) (-i10)) * f11) + (((float) i11) * f10);
            }
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    public C5412b i(C5419i iVar, int i10) {
        this.f23787a = iVar;
        float f10 = (float) i10;
        iVar.f23840f = f10;
        this.f23788b = f10;
        this.f23792f = true;
        return this;
    }

    public boolean isEmpty() {
        return this.f23787a == null && this.f23788b == 0.0f && this.f23791e.g() == 0;
    }

    /* access modifiers changed from: package-private */
    public C5412b j(C5419i iVar, C5419i iVar2, float f10) {
        this.f23791e.j(iVar, -1.0f);
        this.f23791e.j(iVar2, f10);
        return this;
    }

    public C5412b k(C5419i iVar, C5419i iVar2, C5419i iVar3, C5419i iVar4, float f10) {
        this.f23791e.j(iVar, -1.0f);
        this.f23791e.j(iVar2, 1.0f);
        this.f23791e.j(iVar3, f10);
        this.f23791e.j(iVar4, -f10);
        return this;
    }

    public C5412b l(float f10, float f11, float f12, C5419i iVar, C5419i iVar2, C5419i iVar3, C5419i iVar4) {
        this.f23788b = 0.0f;
        if (f11 == 0.0f || f10 == f12) {
            this.f23791e.j(iVar, 1.0f);
            this.f23791e.j(iVar2, -1.0f);
            this.f23791e.j(iVar4, 1.0f);
            this.f23791e.j(iVar3, -1.0f);
        } else if (f10 == 0.0f) {
            this.f23791e.j(iVar, 1.0f);
            this.f23791e.j(iVar2, -1.0f);
        } else if (f12 == 0.0f) {
            this.f23791e.j(iVar3, 1.0f);
            this.f23791e.j(iVar4, -1.0f);
        } else {
            float f13 = (f10 / f11) / (f12 / f11);
            this.f23791e.j(iVar, 1.0f);
            this.f23791e.j(iVar2, -1.0f);
            this.f23791e.j(iVar4, f13);
            this.f23791e.j(iVar3, -f13);
        }
        return this;
    }

    public C5412b m(C5419i iVar, int i10) {
        if (i10 < 0) {
            this.f23788b = (float) (i10 * -1);
            this.f23791e.j(iVar, 1.0f);
        } else {
            this.f23788b = (float) i10;
            this.f23791e.j(iVar, -1.0f);
        }
        return this;
    }

    public C5412b n(C5419i iVar, C5419i iVar2, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.f23788b = (float) i10;
        }
        if (!z10) {
            this.f23791e.j(iVar, -1.0f);
            this.f23791e.j(iVar2, 1.0f);
        } else {
            this.f23791e.j(iVar, 1.0f);
            this.f23791e.j(iVar2, -1.0f);
        }
        return this;
    }

    public C5412b o(C5419i iVar, C5419i iVar2, C5419i iVar3, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.f23788b = (float) i10;
        }
        if (!z10) {
            this.f23791e.j(iVar, -1.0f);
            this.f23791e.j(iVar2, 1.0f);
            this.f23791e.j(iVar3, 1.0f);
        } else {
            this.f23791e.j(iVar, 1.0f);
            this.f23791e.j(iVar2, -1.0f);
            this.f23791e.j(iVar3, -1.0f);
        }
        return this;
    }

    public C5412b p(C5419i iVar, C5419i iVar2, C5419i iVar3, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.f23788b = (float) i10;
        }
        if (!z10) {
            this.f23791e.j(iVar, -1.0f);
            this.f23791e.j(iVar2, 1.0f);
            this.f23791e.j(iVar3, -1.0f);
        } else {
            this.f23791e.j(iVar, 1.0f);
            this.f23791e.j(iVar2, -1.0f);
            this.f23791e.j(iVar3, 1.0f);
        }
        return this;
    }

    public C5412b q(C5419i iVar, C5419i iVar2, C5419i iVar3, C5419i iVar4, float f10) {
        this.f23791e.j(iVar3, 0.5f);
        this.f23791e.j(iVar4, 0.5f);
        this.f23791e.j(iVar, -0.5f);
        this.f23791e.j(iVar2, -0.5f);
        this.f23788b = -f10;
        return this;
    }

    /* access modifiers changed from: package-private */
    public void r() {
        float f10 = this.f23788b;
        if (f10 < 0.0f) {
            this.f23788b = f10 * -1.0f;
            this.f23791e.e();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean s() {
        C5419i iVar = this.f23787a;
        return iVar != null && (iVar.f23844j == C5419i.a.UNRESTRICTED || this.f23788b >= 0.0f);
    }

    /* access modifiers changed from: package-private */
    public boolean t(C5419i iVar) {
        return this.f23791e.f(iVar);
    }

    public String toString() {
        return z();
    }

    public C5419i v(C5419i iVar) {
        return w((boolean[]) null, iVar);
    }

    /* access modifiers changed from: package-private */
    public void x(C5419i iVar) {
        C5419i iVar2 = this.f23787a;
        if (iVar2 != null) {
            this.f23791e.j(iVar2, -1.0f);
            this.f23787a.f23838d = -1;
            this.f23787a = null;
        }
        float a10 = this.f23791e.a(iVar, true) * -1.0f;
        this.f23787a = iVar;
        if (a10 != 1.0f) {
            this.f23788b /= a10;
            this.f23791e.k(a10);
        }
    }

    public void y() {
        this.f23787a = null;
        this.f23791e.clear();
        this.f23788b = 0.0f;
        this.f23792f = false;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0069, code lost:
        r7 = r10.f23791e.h(r3);
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00d0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String z() {
        /*
            r10 = this;
            h2.i r0 = r10.f23787a
            java.lang.String r1 = ""
            if (r0 != 0) goto L_0x0018
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = "0"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            goto L_0x0029
        L_0x0018:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            h2.i r1 = r10.f23787a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L_0x0029:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " = "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            float r1 = r10.f23788b
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x0056
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            float r0 = r10.f23788b
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = r4
            goto L_0x0057
        L_0x0056:
            r1 = r3
        L_0x0057:
            h2.b$a r5 = r10.f23791e
            int r5 = r5.g()
        L_0x005d:
            if (r3 >= r5) goto L_0x00ec
            h2.b$a r6 = r10.f23791e
            h2.i r6 = r6.b(r3)
            if (r6 != 0) goto L_0x0069
            goto L_0x00e8
        L_0x0069:
            h2.b$a r7 = r10.f23791e
            float r7 = r7.h(r3)
            int r8 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r8 != 0) goto L_0x0075
            goto L_0x00e8
        L_0x0075:
            java.lang.String r6 = r6.toString()
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L_0x0094
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 >= 0) goto L_0x00ba
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "- "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L_0x0092:
            float r7 = r7 * r9
            goto L_0x00ba
        L_0x0094:
            if (r8 <= 0) goto L_0x00a8
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " + "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto L_0x00ba
        L_0x00a8:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " - "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto L_0x0092
        L_0x00ba:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x00d0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
            goto L_0x00e7
        L_0x00d0:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
        L_0x00e7:
            r1 = r4
        L_0x00e8:
            int r3 = r3 + 1
            goto L_0x005d
        L_0x00ec:
            if (r1 != 0) goto L_0x00ff
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "0.0"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L_0x00ff:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h2.C5412b.z():java.lang.String");
    }

    public C5412b(C5413c cVar) {
        this.f23791e = new C5411a(this, cVar);
    }
}
