package k2;

import i2.C5438a;
import i2.C5442e;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.Arrays;
import k2.u;

public abstract class n {

    /* renamed from: a  reason: collision with root package name */
    protected b f25113a;

    /* renamed from: b  reason: collision with root package name */
    protected int[] f25114b = new int[10];

    /* renamed from: c  reason: collision with root package name */
    protected float[] f25115c = new float[10];

    /* renamed from: d  reason: collision with root package name */
    private int f25116d;

    /* renamed from: e  reason: collision with root package name */
    private String f25117e;

    private static class a extends n {

        /* renamed from: f  reason: collision with root package name */
        String f25118f;

        /* renamed from: g  reason: collision with root package name */
        long f25119g;

        a(String str, long j10) {
            this.f25118f = str;
            this.f25119g = j10;
        }

        public void e(u uVar, float f10) {
            uVar.c(uVar.a(this.f25118f), a(f10));
        }
    }

    public static class b extends n {

        /* renamed from: f  reason: collision with root package name */
        String f25120f;

        /* renamed from: g  reason: collision with root package name */
        h f25121g;

        /* renamed from: h  reason: collision with root package name */
        float[] f25122h;

        public b(String str, h hVar) {
            this.f25120f = str.split(",")[1];
            this.f25121g = hVar;
        }

        public void d(int i10, float f10) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute)");
        }

        public void e(u uVar, float f10) {
            i((C5442e) uVar, f10);
        }

        public void g(int i10) {
            int e10 = this.f25121g.e();
            int m10 = this.f25121g.f(0).m();
            double[] dArr = new double[e10];
            this.f25122h = new float[m10];
            int[] iArr = new int[2];
            iArr[1] = m10;
            iArr[0] = e10;
            double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, iArr);
            for (int i11 = 0; i11 < e10; i11++) {
                int c10 = this.f25121g.c(i11);
                C5438a f10 = this.f25121g.f(i11);
                dArr[i11] = ((double) c10) * 0.01d;
                f10.k(this.f25122h);
                int i12 = 0;
                while (true) {
                    float[] fArr = this.f25122h;
                    if (i12 >= fArr.length) {
                        break;
                    }
                    dArr2[i11][i12] = (double) fArr[i12];
                    i12++;
                }
            }
            this.f25113a = b.a(i10, dArr, dArr2);
        }

        public void h(int i10, C5438a aVar) {
            this.f25121g.a(i10, aVar);
        }

        public void i(C5442e eVar, float f10) {
            this.f25113a.e((double) f10, this.f25122h);
            this.f25121g.f(0).q(eVar, this.f25122h);
        }
    }

    private static class c {
        static void a(int[] iArr, float[] fArr, int i10, int i11) {
            int[] iArr2 = new int[(iArr.length + 10)];
            iArr2[0] = i11;
            iArr2[1] = i10;
            int i12 = 2;
            while (i12 > 0) {
                int i13 = iArr2[i12 - 1];
                int i14 = i12 - 2;
                int i15 = iArr2[i14];
                if (i13 < i15) {
                    int b10 = b(iArr, fArr, i13, i15);
                    iArr2[i14] = b10 - 1;
                    iArr2[i12 - 1] = i13;
                    int i16 = i12 + 1;
                    iArr2[i12] = i15;
                    i12 += 2;
                    iArr2[i16] = b10 + 1;
                } else {
                    i12 = i14;
                }
            }
        }

        private static int b(int[] iArr, float[] fArr, int i10, int i11) {
            int i12 = iArr[i11];
            int i13 = i10;
            while (i10 < i11) {
                if (iArr[i10] <= i12) {
                    c(iArr, fArr, i13, i10);
                    i13++;
                }
                i10++;
            }
            c(iArr, fArr, i13, i11);
            return i13;
        }

        private static void c(int[] iArr, float[] fArr, int i10, int i11) {
            int i12 = iArr[i10];
            iArr[i10] = iArr[i11];
            iArr[i11] = i12;
            float f10 = fArr[i10];
            fArr[i10] = fArr[i11];
            fArr[i11] = f10;
        }
    }

    public static n b(String str, h hVar) {
        return new b(str, hVar);
    }

    public static n c(String str, long j10) {
        return new a(str, j10);
    }

    public float a(float f10) {
        return (float) this.f25113a.c((double) f10, 0);
    }

    public void d(int i10, float f10) {
        int[] iArr = this.f25114b;
        if (iArr.length < this.f25116d + 1) {
            this.f25114b = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f25115c;
            this.f25115c = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f25114b;
        int i11 = this.f25116d;
        iArr2[i11] = i10;
        this.f25115c[i11] = f10;
        this.f25116d = i11 + 1;
    }

    public void e(u uVar, float f10) {
        uVar.c(u.a.a(this.f25117e), a(f10));
    }

    public void f(String str) {
        this.f25117e = str;
    }

    public void g(int i10) {
        int i11 = this.f25116d;
        if (i11 != 0) {
            c.a(this.f25114b, this.f25115c, 0, i11 - 1);
            int i12 = 1;
            for (int i13 = 1; i13 < this.f25116d; i13++) {
                int[] iArr = this.f25114b;
                if (iArr[i13 - 1] != iArr[i13]) {
                    i12++;
                }
            }
            double[] dArr = new double[i12];
            int[] iArr2 = new int[2];
            iArr2[1] = 1;
            iArr2[0] = i12;
            double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, iArr2);
            int i14 = 0;
            for (int i15 = 0; i15 < this.f25116d; i15++) {
                if (i15 > 0) {
                    int[] iArr3 = this.f25114b;
                    if (iArr3[i15] == iArr3[i15 - 1]) {
                    }
                }
                dArr[i14] = ((double) this.f25114b[i15]) * 0.01d;
                dArr2[i14][0] = (double) this.f25115c[i15];
                i14++;
            }
            this.f25113a = b.a(i10, dArr, dArr2);
        }
    }

    public String toString() {
        String str = this.f25117e;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i10 = 0; i10 < this.f25116d; i10++) {
            str = str + "[" + this.f25114b[i10] + " , " + decimalFormat.format((double) this.f25115c[i10]) + "] ";
        }
        return str;
    }
}
