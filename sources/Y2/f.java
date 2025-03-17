package Y2;

import Y2.b;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    double f14878a = Math.sqrt(1500.0d);

    /* renamed from: b  reason: collision with root package name */
    double f14879b = 0.5d;

    /* renamed from: c  reason: collision with root package name */
    private boolean f14880c = false;

    /* renamed from: d  reason: collision with root package name */
    private double f14881d;

    /* renamed from: e  reason: collision with root package name */
    private double f14882e;

    /* renamed from: f  reason: collision with root package name */
    private double f14883f;

    /* renamed from: g  reason: collision with root package name */
    private double f14884g;

    /* renamed from: h  reason: collision with root package name */
    private double f14885h;

    /* renamed from: i  reason: collision with root package name */
    private double f14886i = Double.MAX_VALUE;

    /* renamed from: j  reason: collision with root package name */
    private final b.p f14887j = new b.p();

    public f() {
    }

    private void b() {
        if (!this.f14880c) {
            if (this.f14886i != Double.MAX_VALUE) {
                double d10 = this.f14879b;
                if (d10 > 1.0d) {
                    double d11 = this.f14878a;
                    this.f14883f = ((-d10) * d11) + (d11 * Math.sqrt((d10 * d10) - 1.0d));
                    double d12 = this.f14879b;
                    double d13 = this.f14878a;
                    this.f14884g = ((-d12) * d13) - (d13 * Math.sqrt((d12 * d12) - 1.0d));
                } else if (d10 >= 0.0d && d10 < 1.0d) {
                    this.f14885h = this.f14878a * Math.sqrt(1.0d - (d10 * d10));
                }
                this.f14880c = true;
                return;
            }
            throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
        }
    }

    public float a() {
        return (float) this.f14886i;
    }

    public boolean c(float f10, float f11) {
        return ((double) Math.abs(f11)) < this.f14882e && ((double) Math.abs(f10 - a())) < this.f14881d;
    }

    public f d(float f10) {
        if (f10 >= 0.0f) {
            this.f14879b = (double) f10;
            this.f14880c = false;
            return this;
        }
        throw new IllegalArgumentException("Damping ratio must be non-negative");
    }

    public f e(float f10) {
        this.f14886i = (double) f10;
        return this;
    }

    public f f(float f10) {
        if (f10 > 0.0f) {
            this.f14878a = Math.sqrt((double) f10);
            this.f14880c = false;
            return this;
        }
        throw new IllegalArgumentException("Spring stiffness constant must be positive.");
    }

    /* access modifiers changed from: package-private */
    public void g(double d10) {
        double abs = Math.abs(d10);
        this.f14881d = abs;
        this.f14882e = abs * 62.5d;
    }

    /* access modifiers changed from: package-private */
    public b.p h(double d10, double d11, long j10) {
        double d12;
        double d13;
        b();
        double d14 = ((double) j10) / 1000.0d;
        double d15 = d10 - this.f14886i;
        double d16 = this.f14879b;
        if (d16 > 1.0d) {
            double d17 = this.f14884g;
            double d18 = this.f14883f;
            double d19 = d15 - (((d17 * d15) - d11) / (d17 - d18));
            double d20 = ((d15 * d17) - d11) / (d17 - d18);
            d13 = (Math.pow(2.718281828459045d, d17 * d14) * d19) + (Math.pow(2.718281828459045d, this.f14883f * d14) * d20);
            double d21 = this.f14884g;
            double pow = d19 * d21 * Math.pow(2.718281828459045d, d21 * d14);
            double d22 = this.f14883f;
            d12 = pow + (d20 * d22 * Math.pow(2.718281828459045d, d22 * d14));
        } else if (d16 == 1.0d) {
            double d23 = this.f14878a;
            double d24 = d11 + (d23 * d15);
            double d25 = d15 + (d24 * d14);
            d13 = Math.pow(2.718281828459045d, (-d23) * d14) * d25;
            double pow2 = d25 * Math.pow(2.718281828459045d, (-this.f14878a) * d14);
            double d26 = this.f14878a;
            d12 = (d24 * Math.pow(2.718281828459045d, (-d26) * d14)) + (pow2 * (-d26));
        } else {
            double d27 = 1.0d / this.f14885h;
            double d28 = this.f14878a;
            double d29 = d27 * ((d16 * d28 * d15) + d11);
            double pow3 = Math.pow(2.718281828459045d, (-d16) * d28 * d14) * ((Math.cos(this.f14885h * d14) * d15) + (Math.sin(this.f14885h * d14) * d29));
            double d30 = this.f14878a;
            double d31 = this.f14879b;
            double pow4 = Math.pow(2.718281828459045d, (-d31) * d30 * d14);
            double d32 = this.f14885h;
            double d33 = pow3;
            double sin = (-d32) * d15 * Math.sin(d32 * d14);
            double d34 = this.f14885h;
            d12 = ((-d30) * pow3 * d31) + (pow4 * (sin + (d29 * d34 * Math.cos(d34 * d14))));
            d13 = d33;
        }
        b.p pVar = this.f14887j;
        pVar.f14871a = (float) (d13 + this.f14886i);
        pVar.f14872b = (float) d12;
        return pVar;
    }

    public f(float f10) {
        this.f14886i = (double) f10;
    }
}
