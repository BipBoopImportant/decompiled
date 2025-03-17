package h2;

import h2.C5412b;
import java.util.Arrays;

/* renamed from: h2.a  reason: case insensitive filesystem */
public class C5411a implements C5412b.a {

    /* renamed from: l  reason: collision with root package name */
    private static float f23775l = 0.001f;

    /* renamed from: a  reason: collision with root package name */
    int f23776a = 0;

    /* renamed from: b  reason: collision with root package name */
    private final C5412b f23777b;

    /* renamed from: c  reason: collision with root package name */
    protected final C5413c f23778c;

    /* renamed from: d  reason: collision with root package name */
    private int f23779d = 8;

    /* renamed from: e  reason: collision with root package name */
    private C5419i f23780e = null;

    /* renamed from: f  reason: collision with root package name */
    private int[] f23781f = new int[8];

    /* renamed from: g  reason: collision with root package name */
    private int[] f23782g = new int[8];

    /* renamed from: h  reason: collision with root package name */
    private float[] f23783h = new float[8];

    /* renamed from: i  reason: collision with root package name */
    private int f23784i = -1;

    /* renamed from: j  reason: collision with root package name */
    private int f23785j = -1;

    /* renamed from: k  reason: collision with root package name */
    private boolean f23786k = false;

    C5411a(C5412b bVar, C5413c cVar) {
        this.f23777b = bVar;
        this.f23778c = cVar;
    }

    public final float a(C5419i iVar, boolean z10) {
        if (this.f23780e == iVar) {
            this.f23780e = null;
        }
        int i10 = this.f23784i;
        if (i10 == -1) {
            return 0.0f;
        }
        int i11 = 0;
        int i12 = -1;
        while (i10 != -1 && i11 < this.f23776a) {
            if (this.f23781f[i10] == iVar.f23837c) {
                if (i10 == this.f23784i) {
                    this.f23784i = this.f23782g[i10];
                } else {
                    int[] iArr = this.f23782g;
                    iArr[i12] = iArr[i10];
                }
                if (z10) {
                    iVar.m(this.f23777b);
                }
                iVar.f23847m--;
                this.f23776a--;
                this.f23781f[i10] = -1;
                if (this.f23786k) {
                    this.f23785j = i10;
                }
                return this.f23783h[i10];
            }
            i11++;
            i12 = i10;
            i10 = this.f23782g[i10];
        }
        return 0.0f;
    }

    public C5419i b(int i10) {
        int i11 = this.f23784i;
        int i12 = 0;
        while (i11 != -1 && i12 < this.f23776a) {
            if (i12 == i10) {
                return this.f23778c.f23796d[this.f23781f[i11]];
            }
            i11 = this.f23782g[i11];
            i12++;
        }
        return null;
    }

    public float c(C5412b bVar, boolean z10) {
        float i10 = i(bVar.f23787a);
        a(bVar.f23787a, z10);
        C5412b.a aVar = bVar.f23791e;
        int g10 = aVar.g();
        for (int i11 = 0; i11 < g10; i11++) {
            C5419i b10 = aVar.b(i11);
            d(b10, aVar.i(b10) * i10, z10);
        }
        return i10;
    }

    public final void clear() {
        int i10 = this.f23784i;
        int i11 = 0;
        while (i10 != -1 && i11 < this.f23776a) {
            C5419i iVar = this.f23778c.f23796d[this.f23781f[i10]];
            if (iVar != null) {
                iVar.m(this.f23777b);
            }
            i10 = this.f23782g[i10];
            i11++;
        }
        this.f23784i = -1;
        this.f23785j = -1;
        this.f23786k = false;
        this.f23776a = 0;
    }

    public void d(C5419i iVar, float f10, boolean z10) {
        float f11 = f23775l;
        if (f10 <= (-f11) || f10 >= f11) {
            int i10 = this.f23784i;
            if (i10 == -1) {
                this.f23784i = 0;
                this.f23783h[0] = f10;
                this.f23781f[0] = iVar.f23837c;
                this.f23782g[0] = -1;
                iVar.f23847m++;
                iVar.a(this.f23777b);
                this.f23776a++;
                if (!this.f23786k) {
                    int i11 = this.f23785j + 1;
                    this.f23785j = i11;
                    int[] iArr = this.f23781f;
                    if (i11 >= iArr.length) {
                        this.f23786k = true;
                        this.f23785j = iArr.length - 1;
                        return;
                    }
                    return;
                }
                return;
            }
            int i12 = 0;
            int i13 = -1;
            while (i10 != -1 && i12 < this.f23776a) {
                int i14 = this.f23781f[i10];
                int i15 = iVar.f23837c;
                if (i14 == i15) {
                    float[] fArr = this.f23783h;
                    float f12 = fArr[i10] + f10;
                    float f13 = f23775l;
                    if (f12 > (-f13) && f12 < f13) {
                        f12 = 0.0f;
                    }
                    fArr[i10] = f12;
                    if (f12 == 0.0f) {
                        if (i10 == this.f23784i) {
                            this.f23784i = this.f23782g[i10];
                        } else {
                            int[] iArr2 = this.f23782g;
                            iArr2[i13] = iArr2[i10];
                        }
                        if (z10) {
                            iVar.m(this.f23777b);
                        }
                        if (this.f23786k) {
                            this.f23785j = i10;
                        }
                        iVar.f23847m--;
                        this.f23776a--;
                        return;
                    }
                    return;
                }
                if (i14 < i15) {
                    i13 = i10;
                }
                i10 = this.f23782g[i10];
                i12++;
            }
            int i16 = this.f23785j;
            int i17 = i16 + 1;
            if (this.f23786k) {
                int[] iArr3 = this.f23781f;
                if (iArr3[i16] != -1) {
                    i16 = iArr3.length;
                }
            } else {
                i16 = i17;
            }
            int[] iArr4 = this.f23781f;
            if (i16 >= iArr4.length && this.f23776a < iArr4.length) {
                int i18 = 0;
                while (true) {
                    int[] iArr5 = this.f23781f;
                    if (i18 >= iArr5.length) {
                        break;
                    } else if (iArr5[i18] == -1) {
                        i16 = i18;
                        break;
                    } else {
                        i18++;
                    }
                }
            }
            int[] iArr6 = this.f23781f;
            if (i16 >= iArr6.length) {
                i16 = iArr6.length;
                int i19 = this.f23779d * 2;
                this.f23779d = i19;
                this.f23786k = false;
                this.f23785j = i16 - 1;
                this.f23783h = Arrays.copyOf(this.f23783h, i19);
                this.f23781f = Arrays.copyOf(this.f23781f, this.f23779d);
                this.f23782g = Arrays.copyOf(this.f23782g, this.f23779d);
            }
            this.f23781f[i16] = iVar.f23837c;
            this.f23783h[i16] = f10;
            if (i13 != -1) {
                int[] iArr7 = this.f23782g;
                iArr7[i16] = iArr7[i13];
                iArr7[i13] = i16;
            } else {
                this.f23782g[i16] = this.f23784i;
                this.f23784i = i16;
            }
            iVar.f23847m++;
            iVar.a(this.f23777b);
            this.f23776a++;
            if (!this.f23786k) {
                this.f23785j++;
            }
            int i20 = this.f23785j;
            int[] iArr8 = this.f23781f;
            if (i20 >= iArr8.length) {
                this.f23786k = true;
                this.f23785j = iArr8.length - 1;
            }
        }
    }

    public void e() {
        int i10 = this.f23784i;
        int i11 = 0;
        while (i10 != -1 && i11 < this.f23776a) {
            float[] fArr = this.f23783h;
            fArr[i10] = fArr[i10] * -1.0f;
            i10 = this.f23782g[i10];
            i11++;
        }
    }

    public boolean f(C5419i iVar) {
        int i10 = this.f23784i;
        if (i10 == -1) {
            return false;
        }
        int i11 = 0;
        while (i10 != -1 && i11 < this.f23776a) {
            if (this.f23781f[i10] == iVar.f23837c) {
                return true;
            }
            i10 = this.f23782g[i10];
            i11++;
        }
        return false;
    }

    public int g() {
        return this.f23776a;
    }

    public float h(int i10) {
        int i11 = this.f23784i;
        int i12 = 0;
        while (i11 != -1 && i12 < this.f23776a) {
            if (i12 == i10) {
                return this.f23783h[i11];
            }
            i11 = this.f23782g[i11];
            i12++;
        }
        return 0.0f;
    }

    public final float i(C5419i iVar) {
        int i10 = this.f23784i;
        int i11 = 0;
        while (i10 != -1 && i11 < this.f23776a) {
            if (this.f23781f[i10] == iVar.f23837c) {
                return this.f23783h[i10];
            }
            i10 = this.f23782g[i10];
            i11++;
        }
        return 0.0f;
    }

    public final void j(C5419i iVar, float f10) {
        if (f10 == 0.0f) {
            a(iVar, true);
            return;
        }
        int i10 = this.f23784i;
        if (i10 == -1) {
            this.f23784i = 0;
            this.f23783h[0] = f10;
            this.f23781f[0] = iVar.f23837c;
            this.f23782g[0] = -1;
            iVar.f23847m++;
            iVar.a(this.f23777b);
            this.f23776a++;
            if (!this.f23786k) {
                int i11 = this.f23785j + 1;
                this.f23785j = i11;
                int[] iArr = this.f23781f;
                if (i11 >= iArr.length) {
                    this.f23786k = true;
                    this.f23785j = iArr.length - 1;
                    return;
                }
                return;
            }
            return;
        }
        int i12 = 0;
        int i13 = -1;
        while (i10 != -1 && i12 < this.f23776a) {
            int i14 = this.f23781f[i10];
            int i15 = iVar.f23837c;
            if (i14 == i15) {
                this.f23783h[i10] = f10;
                return;
            }
            if (i14 < i15) {
                i13 = i10;
            }
            i10 = this.f23782g[i10];
            i12++;
        }
        int i16 = this.f23785j;
        int i17 = i16 + 1;
        if (this.f23786k) {
            int[] iArr2 = this.f23781f;
            if (iArr2[i16] != -1) {
                i16 = iArr2.length;
            }
        } else {
            i16 = i17;
        }
        int[] iArr3 = this.f23781f;
        if (i16 >= iArr3.length && this.f23776a < iArr3.length) {
            int i18 = 0;
            while (true) {
                int[] iArr4 = this.f23781f;
                if (i18 >= iArr4.length) {
                    break;
                } else if (iArr4[i18] == -1) {
                    i16 = i18;
                    break;
                } else {
                    i18++;
                }
            }
        }
        int[] iArr5 = this.f23781f;
        if (i16 >= iArr5.length) {
            i16 = iArr5.length;
            int i19 = this.f23779d * 2;
            this.f23779d = i19;
            this.f23786k = false;
            this.f23785j = i16 - 1;
            this.f23783h = Arrays.copyOf(this.f23783h, i19);
            this.f23781f = Arrays.copyOf(this.f23781f, this.f23779d);
            this.f23782g = Arrays.copyOf(this.f23782g, this.f23779d);
        }
        this.f23781f[i16] = iVar.f23837c;
        this.f23783h[i16] = f10;
        if (i13 != -1) {
            int[] iArr6 = this.f23782g;
            iArr6[i16] = iArr6[i13];
            iArr6[i13] = i16;
        } else {
            this.f23782g[i16] = this.f23784i;
            this.f23784i = i16;
        }
        iVar.f23847m++;
        iVar.a(this.f23777b);
        int i20 = this.f23776a + 1;
        this.f23776a = i20;
        if (!this.f23786k) {
            this.f23785j++;
        }
        int[] iArr7 = this.f23781f;
        if (i20 >= iArr7.length) {
            this.f23786k = true;
        }
        if (this.f23785j >= iArr7.length) {
            this.f23786k = true;
            this.f23785j = iArr7.length - 1;
        }
    }

    public void k(float f10) {
        int i10 = this.f23784i;
        int i11 = 0;
        while (i10 != -1 && i11 < this.f23776a) {
            float[] fArr = this.f23783h;
            fArr[i10] = fArr[i10] / f10;
            i10 = this.f23782g[i10];
            i11++;
        }
    }

    public String toString() {
        int i10 = this.f23784i;
        String str = "";
        int i11 = 0;
        while (i10 != -1 && i11 < this.f23776a) {
            str = ((str + " -> ") + this.f23783h[i10] + " : ") + this.f23778c.f23796d[this.f23781f[i10]];
            i10 = this.f23782g[i10];
            i11++;
        }
        return str;
    }
}
