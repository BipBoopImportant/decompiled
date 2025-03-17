package k2;

public class o implements q {

    /* renamed from: a  reason: collision with root package name */
    double f25123a = 0.5d;

    /* renamed from: b  reason: collision with root package name */
    private boolean f25124b = false;

    /* renamed from: c  reason: collision with root package name */
    private double f25125c;

    /* renamed from: d  reason: collision with root package name */
    private double f25126d;

    /* renamed from: e  reason: collision with root package name */
    private double f25127e;

    /* renamed from: f  reason: collision with root package name */
    private float f25128f;

    /* renamed from: g  reason: collision with root package name */
    private float f25129g;

    /* renamed from: h  reason: collision with root package name */
    private float f25130h;

    /* renamed from: i  reason: collision with root package name */
    private float f25131i;

    /* renamed from: j  reason: collision with root package name */
    private float f25132j;

    /* renamed from: k  reason: collision with root package name */
    private int f25133k = 0;

    private void b(double d10) {
        if (d10 > 0.0d) {
            double d11 = this.f25125c;
            double d12 = this.f25123a;
            int sqrt = (int) ((9.0d / ((Math.sqrt(d11 / ((double) this.f25131i)) * d10) * 4.0d)) + 1.0d);
            double d13 = d10 / ((double) sqrt);
            int i10 = 0;
            while (i10 < sqrt) {
                float f10 = this.f25129g;
                double d14 = this.f25126d;
                float f11 = this.f25130h;
                double d15 = d11;
                float f12 = this.f25131i;
                double d16 = d12;
                double d17 = ((double) f11) + ((((((-d11) * (((double) f10) - d14)) - (((double) f11) * d12)) / ((double) f12)) * d13) / 2.0d);
                double d18 = ((((-((((double) f10) + ((d13 * d17) / 2.0d)) - d14)) * d15) - (d17 * d16)) / ((double) f12)) * d13;
                double d19 = ((double) f11) + (d18 / 2.0d);
                float f13 = f11 + ((float) d18);
                this.f25130h = f13;
                float f14 = f10 + ((float) (d19 * d13));
                this.f25129g = f14;
                int i11 = this.f25133k;
                if (i11 > 0) {
                    if (f14 < 0.0f && (i11 & 1) == 1) {
                        this.f25129g = -f14;
                        this.f25130h = -f13;
                    }
                    float f15 = this.f25129g;
                    if (f15 > 1.0f && (i11 & 2) == 2) {
                        this.f25129g = 2.0f - f15;
                        this.f25130h = -this.f25130h;
                    }
                }
                i10++;
                d11 = d15;
                d12 = d16;
            }
        }
    }

    public boolean a() {
        double d10 = ((double) this.f25129g) - this.f25126d;
        double d11 = this.f25125c;
        double d12 = (double) this.f25130h;
        return Math.sqrt((((d12 * d12) * ((double) this.f25131i)) + ((d11 * d10) * d10)) / d11) <= ((double) this.f25132j);
    }

    public void c(float f10, float f11, float f12, float f13, float f14, float f15, float f16, int i10) {
        this.f25126d = (double) f11;
        this.f25123a = (double) f15;
        this.f25124b = false;
        this.f25129g = f10;
        this.f25127e = (double) f12;
        this.f25125c = (double) f14;
        this.f25131i = f13;
        this.f25132j = f16;
        this.f25133k = i10;
        this.f25128f = 0.0f;
    }

    public float getInterpolation(float f10) {
        b((double) (f10 - this.f25128f));
        this.f25128f = f10;
        if (a()) {
            this.f25129g = (float) this.f25126d;
        }
        return this.f25129g;
    }
}
