package k2;

import java.util.Arrays;

public class t {

    /* renamed from: a  reason: collision with root package name */
    int[] f25172a = new int[10];

    /* renamed from: b  reason: collision with root package name */
    int[] f25173b = new int[10];

    /* renamed from: c  reason: collision with root package name */
    int f25174c = 0;

    /* renamed from: d  reason: collision with root package name */
    int[] f25175d = new int[10];

    /* renamed from: e  reason: collision with root package name */
    float[] f25176e = new float[10];

    /* renamed from: f  reason: collision with root package name */
    int f25177f = 0;

    /* renamed from: g  reason: collision with root package name */
    int[] f25178g = new int[5];

    /* renamed from: h  reason: collision with root package name */
    String[] f25179h = new String[5];

    /* renamed from: i  reason: collision with root package name */
    int f25180i = 0;

    /* renamed from: j  reason: collision with root package name */
    int[] f25181j = new int[4];

    /* renamed from: k  reason: collision with root package name */
    boolean[] f25182k = new boolean[4];

    /* renamed from: l  reason: collision with root package name */
    int f25183l = 0;

    public void a(int i10, float f10) {
        int i11 = this.f25177f;
        int[] iArr = this.f25175d;
        if (i11 >= iArr.length) {
            this.f25175d = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f25176e;
            this.f25176e = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f25175d;
        int i12 = this.f25177f;
        iArr2[i12] = i10;
        float[] fArr2 = this.f25176e;
        this.f25177f = i12 + 1;
        fArr2[i12] = f10;
    }

    public void b(int i10, int i11) {
        int i12 = this.f25174c;
        int[] iArr = this.f25172a;
        if (i12 >= iArr.length) {
            this.f25172a = Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = this.f25173b;
            this.f25173b = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f25172a;
        int i13 = this.f25174c;
        iArr3[i13] = i10;
        int[] iArr4 = this.f25173b;
        this.f25174c = i13 + 1;
        iArr4[i13] = i11;
    }

    public void c(int i10, String str) {
        int i11 = this.f25180i;
        int[] iArr = this.f25178g;
        if (i11 >= iArr.length) {
            this.f25178g = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f25179h;
            this.f25179h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.f25178g;
        int i12 = this.f25180i;
        iArr2[i12] = i10;
        String[] strArr2 = this.f25179h;
        this.f25180i = i12 + 1;
        strArr2[i12] = str;
    }

    public void d(int i10, boolean z10) {
        int i11 = this.f25183l;
        int[] iArr = this.f25181j;
        if (i11 >= iArr.length) {
            this.f25181j = Arrays.copyOf(iArr, iArr.length * 2);
            boolean[] zArr = this.f25182k;
            this.f25182k = Arrays.copyOf(zArr, zArr.length * 2);
        }
        int[] iArr2 = this.f25181j;
        int i12 = this.f25183l;
        iArr2[i12] = i10;
        boolean[] zArr2 = this.f25182k;
        this.f25183l = i12 + 1;
        zArr2[i12] = z10;
    }

    public void e(int i10, String str) {
        if (str != null) {
            c(i10, str);
        }
    }

    public void f(t tVar) {
        for (int i10 = 0; i10 < this.f25174c; i10++) {
            tVar.b(this.f25172a[i10], this.f25173b[i10]);
        }
        for (int i11 = 0; i11 < this.f25177f; i11++) {
            tVar.a(this.f25175d[i11], this.f25176e[i11]);
        }
        for (int i12 = 0; i12 < this.f25180i; i12++) {
            tVar.c(this.f25178g[i12], this.f25179h[i12]);
        }
        for (int i13 = 0; i13 < this.f25183l; i13++) {
            tVar.d(this.f25181j[i13], this.f25182k[i13]);
        }
    }

    public void g(u uVar) {
        for (int i10 = 0; i10 < this.f25174c; i10++) {
            uVar.b(this.f25172a[i10], this.f25173b[i10]);
        }
        for (int i11 = 0; i11 < this.f25177f; i11++) {
            uVar.c(this.f25175d[i11], this.f25176e[i11]);
        }
        for (int i12 = 0; i12 < this.f25180i; i12++) {
            uVar.e(this.f25178g[i12], this.f25179h[i12]);
        }
        for (int i13 = 0; i13 < this.f25183l; i13++) {
            uVar.d(this.f25181j[i13], this.f25182k[i13]);
        }
    }

    public void h() {
        this.f25183l = 0;
        this.f25180i = 0;
        this.f25177f = 0;
        this.f25174c = 0;
    }

    public String toString() {
        return "TypedBundle{mCountInt=" + this.f25174c + ", mCountFloat=" + this.f25177f + ", mCountString=" + this.f25180i + ", mCountBoolean=" + this.f25183l + '}';
    }
}
