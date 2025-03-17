package k2;

public abstract class b {

    static class a extends b {

        /* renamed from: a  reason: collision with root package name */
        double f25045a;

        /* renamed from: b  reason: collision with root package name */
        double[] f25046b;

        a(double d10, double[] dArr) {
            this.f25045a = d10;
            this.f25046b = dArr;
        }

        public double c(double d10, int i10) {
            return this.f25046b[i10];
        }

        public void d(double d10, double[] dArr) {
            double[] dArr2 = this.f25046b;
            System.arraycopy(dArr2, 0, dArr, 0, dArr2.length);
        }

        public void e(double d10, float[] fArr) {
            int i10 = 0;
            while (true) {
                double[] dArr = this.f25046b;
                if (i10 < dArr.length) {
                    fArr[i10] = (float) dArr[i10];
                    i10++;
                } else {
                    return;
                }
            }
        }

        public void f(double d10, double[] dArr) {
            for (int i10 = 0; i10 < this.f25046b.length; i10++) {
                dArr[i10] = 0.0d;
            }
        }

        public double[] g() {
            return new double[]{this.f25045a};
        }
    }

    public static b a(int i10, double[] dArr, double[][] dArr2) {
        if (dArr.length == 1) {
            i10 = 2;
        }
        return i10 != 0 ? i10 != 2 ? new i(dArr, dArr2) : new a(dArr[0], dArr2[0]) : new j(dArr, dArr2);
    }

    public static b b(int[] iArr, double[] dArr, double[][] dArr2) {
        return new C5503a(iArr, dArr, dArr2);
    }

    public abstract double c(double d10, int i10);

    public abstract void d(double d10, double[] dArr);

    public abstract void e(double d10, float[] fArr);

    public abstract void f(double d10, double[] dArr);

    public abstract double[] g();
}
