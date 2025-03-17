package h2;

import h2.C5412b;
import java.util.Arrays;

/* renamed from: h2.j  reason: case insensitive filesystem */
public class C5420j implements C5412b.a {

    /* renamed from: n  reason: collision with root package name */
    private static float f23852n = 0.001f;

    /* renamed from: a  reason: collision with root package name */
    private final int f23853a = -1;

    /* renamed from: b  reason: collision with root package name */
    private int f23854b = 16;

    /* renamed from: c  reason: collision with root package name */
    private int f23855c = 16;

    /* renamed from: d  reason: collision with root package name */
    int[] f23856d = new int[16];

    /* renamed from: e  reason: collision with root package name */
    int[] f23857e = new int[16];

    /* renamed from: f  reason: collision with root package name */
    int[] f23858f = new int[16];

    /* renamed from: g  reason: collision with root package name */
    float[] f23859g = new float[16];

    /* renamed from: h  reason: collision with root package name */
    int[] f23860h = new int[16];

    /* renamed from: i  reason: collision with root package name */
    int[] f23861i = new int[16];

    /* renamed from: j  reason: collision with root package name */
    int f23862j = 0;

    /* renamed from: k  reason: collision with root package name */
    int f23863k = -1;

    /* renamed from: l  reason: collision with root package name */
    private final C5412b f23864l;

    /* renamed from: m  reason: collision with root package name */
    protected final C5413c f23865m;

    C5420j(C5412b bVar, C5413c cVar) {
        this.f23864l = bVar;
        this.f23865m = cVar;
        clear();
    }

    private void l(C5419i iVar, int i10) {
        int[] iArr;
        int i11 = iVar.f23837c % this.f23855c;
        int[] iArr2 = this.f23856d;
        int i12 = iArr2[i11];
        if (i12 == -1) {
            iArr2[i11] = i10;
        } else {
            while (true) {
                iArr = this.f23857e;
                int i13 = iArr[i12];
                if (i13 == -1) {
                    break;
                }
                i12 = i13;
            }
            iArr[i12] = i10;
        }
        this.f23857e[i10] = -1;
    }

    private void m(int i10, C5419i iVar, float f10) {
        this.f23858f[i10] = iVar.f23837c;
        this.f23859g[i10] = f10;
        this.f23860h[i10] = -1;
        this.f23861i[i10] = -1;
        iVar.a(this.f23864l);
        iVar.f23847m++;
        this.f23862j++;
    }

    private int n() {
        for (int i10 = 0; i10 < this.f23854b; i10++) {
            if (this.f23858f[i10] == -1) {
                return i10;
            }
        }
        return -1;
    }

    private void o() {
        int i10 = this.f23854b * 2;
        this.f23858f = Arrays.copyOf(this.f23858f, i10);
        this.f23859g = Arrays.copyOf(this.f23859g, i10);
        this.f23860h = Arrays.copyOf(this.f23860h, i10);
        this.f23861i = Arrays.copyOf(this.f23861i, i10);
        this.f23857e = Arrays.copyOf(this.f23857e, i10);
        for (int i11 = this.f23854b; i11 < i10; i11++) {
            this.f23858f[i11] = -1;
            this.f23857e[i11] = -1;
        }
        this.f23854b = i10;
    }

    private void q(int i10, C5419i iVar, float f10) {
        int n10 = n();
        m(n10, iVar, f10);
        if (i10 != -1) {
            this.f23860h[n10] = i10;
            int[] iArr = this.f23861i;
            iArr[n10] = iArr[i10];
            iArr[i10] = n10;
        } else {
            this.f23860h[n10] = -1;
            if (this.f23862j > 0) {
                this.f23861i[n10] = this.f23863k;
                this.f23863k = n10;
            } else {
                this.f23861i[n10] = -1;
            }
        }
        int i11 = this.f23861i[n10];
        if (i11 != -1) {
            this.f23860h[i11] = n10;
        }
        l(iVar, n10);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void r(h2.C5419i r6) {
        /*
            r5 = this;
            int r6 = r6.f23837c
            int r0 = r5.f23855c
            int r0 = r6 % r0
            int[] r1 = r5.f23856d
            r2 = r1[r0]
            r3 = -1
            if (r2 != r3) goto L_0x000e
            return
        L_0x000e:
            int[] r4 = r5.f23858f
            r4 = r4[r2]
            if (r4 != r6) goto L_0x001d
            int[] r6 = r5.f23857e
            r4 = r6[r2]
            r1[r0] = r4
            r6[r2] = r3
            goto L_0x0039
        L_0x001d:
            int[] r0 = r5.f23857e
            r1 = r0[r2]
            if (r1 == r3) goto L_0x002b
            int[] r4 = r5.f23858f
            r4 = r4[r1]
            if (r4 == r6) goto L_0x002b
            r2 = r1
            goto L_0x001d
        L_0x002b:
            if (r1 == r3) goto L_0x0039
            int[] r4 = r5.f23858f
            r4 = r4[r1]
            if (r4 != r6) goto L_0x0039
            r6 = r0[r1]
            r0[r2] = r6
            r0[r1] = r3
        L_0x0039:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h2.C5420j.r(h2.i):void");
    }

    public float a(C5419i iVar, boolean z10) {
        int p10 = p(iVar);
        if (p10 == -1) {
            return 0.0f;
        }
        r(iVar);
        float f10 = this.f23859g[p10];
        if (this.f23863k == p10) {
            this.f23863k = this.f23861i[p10];
        }
        this.f23858f[p10] = -1;
        int[] iArr = this.f23860h;
        int i10 = iArr[p10];
        if (i10 != -1) {
            int[] iArr2 = this.f23861i;
            iArr2[i10] = iArr2[p10];
        }
        int i11 = this.f23861i[p10];
        if (i11 != -1) {
            iArr[i11] = iArr[p10];
        }
        this.f23862j--;
        iVar.f23847m--;
        if (z10) {
            iVar.m(this.f23864l);
        }
        return f10;
    }

    public C5419i b(int i10) {
        int i11 = this.f23862j;
        if (i11 == 0) {
            return null;
        }
        int i12 = this.f23863k;
        for (int i13 = 0; i13 < i11; i13++) {
            if (i13 == i10 && i12 != -1) {
                return this.f23865m.f23796d[this.f23858f[i12]];
            }
            i12 = this.f23861i[i12];
            if (i12 == -1) {
                break;
            }
        }
        return null;
    }

    public float c(C5412b bVar, boolean z10) {
        float i10 = i(bVar.f23787a);
        a(bVar.f23787a, z10);
        C5420j jVar = (C5420j) bVar.f23791e;
        int g10 = jVar.g();
        int i11 = 0;
        int i12 = 0;
        while (i11 < g10) {
            int i13 = jVar.f23858f[i12];
            if (i13 != -1) {
                d(this.f23865m.f23796d[i13], jVar.f23859g[i12] * i10, z10);
                i11++;
            }
            i12++;
        }
        return i10;
    }

    public void clear() {
        int i10 = this.f23862j;
        for (int i11 = 0; i11 < i10; i11++) {
            C5419i b10 = b(i11);
            if (b10 != null) {
                b10.m(this.f23864l);
            }
        }
        for (int i12 = 0; i12 < this.f23854b; i12++) {
            this.f23858f[i12] = -1;
            this.f23857e[i12] = -1;
        }
        for (int i13 = 0; i13 < this.f23855c; i13++) {
            this.f23856d[i13] = -1;
        }
        this.f23862j = 0;
        this.f23863k = -1;
    }

    public void d(C5419i iVar, float f10, boolean z10) {
        float f11 = f23852n;
        if (f10 <= (-f11) || f10 >= f11) {
            int p10 = p(iVar);
            if (p10 == -1) {
                j(iVar, f10);
                return;
            }
            float[] fArr = this.f23859g;
            float f12 = fArr[p10] + f10;
            fArr[p10] = f12;
            float f13 = f23852n;
            if (f12 > (-f13) && f12 < f13) {
                fArr[p10] = 0.0f;
                a(iVar, z10);
            }
        }
    }

    public void e() {
        int i10 = this.f23862j;
        int i11 = this.f23863k;
        int i12 = 0;
        while (i12 < i10) {
            float[] fArr = this.f23859g;
            fArr[i11] = fArr[i11] * -1.0f;
            i11 = this.f23861i[i11];
            if (i11 != -1) {
                i12++;
            } else {
                return;
            }
        }
    }

    public boolean f(C5419i iVar) {
        return p(iVar) != -1;
    }

    public int g() {
        return this.f23862j;
    }

    public float h(int i10) {
        int i11 = this.f23862j;
        int i12 = this.f23863k;
        for (int i13 = 0; i13 < i11; i13++) {
            if (i13 == i10) {
                return this.f23859g[i12];
            }
            i12 = this.f23861i[i12];
            if (i12 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    public float i(C5419i iVar) {
        int p10 = p(iVar);
        if (p10 != -1) {
            return this.f23859g[p10];
        }
        return 0.0f;
    }

    public void j(C5419i iVar, float f10) {
        float f11 = f23852n;
        if (f10 <= (-f11) || f10 >= f11) {
            if (this.f23862j == 0) {
                m(0, iVar, f10);
                l(iVar, 0);
                this.f23863k = 0;
                return;
            }
            int p10 = p(iVar);
            if (p10 != -1) {
                this.f23859g[p10] = f10;
                return;
            }
            if (this.f23862j + 1 >= this.f23854b) {
                o();
            }
            int i10 = this.f23862j;
            int i11 = this.f23863k;
            int i12 = -1;
            for (int i13 = 0; i13 < i10; i13++) {
                int i14 = this.f23858f[i11];
                int i15 = iVar.f23837c;
                if (i14 == i15) {
                    this.f23859g[i11] = f10;
                    return;
                }
                if (i14 < i15) {
                    i12 = i11;
                }
                i11 = this.f23861i[i11];
                if (i11 == -1) {
                    break;
                }
            }
            q(i12, iVar, f10);
            return;
        }
        a(iVar, true);
    }

    public void k(float f10) {
        int i10 = this.f23862j;
        int i11 = this.f23863k;
        int i12 = 0;
        while (i12 < i10) {
            float[] fArr = this.f23859g;
            fArr[i11] = fArr[i11] / f10;
            i11 = this.f23861i[i11];
            if (i11 != -1) {
                i12++;
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0032 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int p(h2.C5419i r4) {
        /*
            r3 = this;
            int r0 = r3.f23862j
            r1 = -1
            if (r0 == 0) goto L_0x0033
            if (r4 != 0) goto L_0x0008
            goto L_0x0033
        L_0x0008:
            int r4 = r4.f23837c
            int r0 = r3.f23855c
            int r0 = r4 % r0
            int[] r2 = r3.f23856d
            r0 = r2[r0]
            if (r0 != r1) goto L_0x0015
            return r1
        L_0x0015:
            int[] r2 = r3.f23858f
            r2 = r2[r0]
            if (r2 != r4) goto L_0x001c
            return r0
        L_0x001c:
            int[] r2 = r3.f23857e
            r0 = r2[r0]
            if (r0 == r1) goto L_0x0029
            int[] r2 = r3.f23858f
            r2 = r2[r0]
            if (r2 == r4) goto L_0x0029
            goto L_0x001c
        L_0x0029:
            if (r0 != r1) goto L_0x002c
            return r1
        L_0x002c:
            int[] r2 = r3.f23858f
            r2 = r2[r0]
            if (r2 != r4) goto L_0x0033
            return r0
        L_0x0033:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: h2.C5420j.p(h2.i):int");
    }

    public String toString() {
        String str;
        String str2;
        String str3 = hashCode() + " { ";
        int i10 = this.f23862j;
        for (int i11 = 0; i11 < i10; i11++) {
            C5419i b10 = b(i11);
            if (b10 != null) {
                String str4 = str3 + b10 + " = " + h(i11) + " ";
                int p10 = p(b10);
                String str5 = str4 + "[p: ";
                if (this.f23860h[p10] != -1) {
                    str = str5 + this.f23865m.f23796d[this.f23858f[this.f23860h[p10]]];
                } else {
                    str = str5 + "none";
                }
                String str6 = str + ", n: ";
                if (this.f23861i[p10] != -1) {
                    str2 = str6 + this.f23865m.f23796d[this.f23858f[this.f23861i[p10]]];
                } else {
                    str2 = str6 + "none";
                }
                str3 = str2 + "]";
            }
        }
        return str3 + " }";
    }
}
