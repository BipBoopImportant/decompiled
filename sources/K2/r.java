package k2;

public class r implements q {

    /* renamed from: a  reason: collision with root package name */
    private float f25135a;

    /* renamed from: b  reason: collision with root package name */
    private float f25136b;

    /* renamed from: c  reason: collision with root package name */
    private float f25137c;

    /* renamed from: d  reason: collision with root package name */
    private float f25138d;

    /* renamed from: e  reason: collision with root package name */
    private float f25139e;

    /* renamed from: f  reason: collision with root package name */
    private float f25140f;

    /* renamed from: g  reason: collision with root package name */
    private float f25141g;

    /* renamed from: h  reason: collision with root package name */
    private float f25142h;

    /* renamed from: i  reason: collision with root package name */
    private float f25143i;

    /* renamed from: j  reason: collision with root package name */
    private int f25144j;

    /* renamed from: k  reason: collision with root package name */
    private String f25145k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f25146l = false;

    /* renamed from: m  reason: collision with root package name */
    private float f25147m;

    /* renamed from: n  reason: collision with root package name */
    private float f25148n;

    /* renamed from: o  reason: collision with root package name */
    private float f25149o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f25150p = false;

    public static class a implements q {

        /* renamed from: a  reason: collision with root package name */
        private float f25151a;

        /* renamed from: b  reason: collision with root package name */
        private float f25152b;

        /* renamed from: c  reason: collision with root package name */
        private float f25153c;

        /* renamed from: d  reason: collision with root package name */
        private float f25154d;

        /* renamed from: e  reason: collision with root package name */
        private float f25155e;

        /* renamed from: f  reason: collision with root package name */
        private float f25156f;

        /* renamed from: g  reason: collision with root package name */
        private boolean f25157g = false;

        public boolean a() {
            return this.f25157g;
        }

        public void b(float f10, float f11, float f12) {
            this.f25157g = false;
            this.f25151a = f11;
            this.f25152b = f12;
            this.f25156f = f10;
            float f13 = (f11 - f10) / (f12 / 2.0f);
            this.f25155e = f13;
            this.f25153c = (-f12) / f13;
        }

        public float c(float f10) {
            if (f10 > this.f25155e) {
                return 0.0f;
            }
            float f11 = this.f25152b + (this.f25153c * f10);
            this.f25154d = f11;
            return f11;
        }

        public float getInterpolation(float f10) {
            if (f10 > this.f25155e) {
                this.f25157g = true;
                return this.f25151a;
            }
            c(f10);
            return this.f25156f + ((this.f25152b + ((this.f25153c * f10) / 2.0f)) * f10);
        }
    }

    private float b(float f10) {
        this.f25150p = false;
        float f11 = this.f25138d;
        if (f10 <= f11) {
            float f12 = this.f25135a;
            return (f12 * f10) + ((((this.f25136b - f12) * f10) * f10) / (f11 * 2.0f));
        }
        int i10 = this.f25144j;
        if (i10 == 1) {
            return this.f25141g;
        }
        float f13 = f10 - f11;
        float f14 = this.f25139e;
        if (f13 < f14) {
            float f15 = this.f25141g;
            float f16 = this.f25136b;
            return f15 + (f16 * f13) + ((((this.f25137c - f16) * f13) * f13) / (f14 * 2.0f));
        } else if (i10 == 2) {
            return this.f25142h;
        } else {
            float f17 = f13 - f14;
            float f18 = this.f25140f;
            if (f17 <= f18) {
                float f19 = this.f25142h;
                float f20 = this.f25137c;
                return (f19 + (f20 * f17)) - (((f20 * f17) * f17) / (f18 * 2.0f));
            }
            this.f25150p = true;
            return this.f25143i;
        }
    }

    private void f(float f10, float f11, float f12, float f13, float f14) {
        this.f25150p = false;
        this.f25143i = f11;
        if (f10 == 0.0f) {
            f10 = 1.0E-4f;
        }
        float f15 = f10 / f12;
        float f16 = (f15 * f10) / 2.0f;
        if (f10 < 0.0f) {
            float sqrt = (float) Math.sqrt((double) ((f11 - ((((-f10) / f12) * f10) / 2.0f)) * f12));
            if (sqrt < f13) {
                this.f25145k = "backward accelerate, decelerate";
                this.f25144j = 2;
                this.f25135a = f10;
                this.f25136b = sqrt;
                this.f25137c = 0.0f;
                float f17 = (sqrt - f10) / f12;
                this.f25138d = f17;
                this.f25139e = sqrt / f12;
                this.f25141g = ((f10 + sqrt) * f17) / 2.0f;
                this.f25142h = f11;
                this.f25143i = f11;
                return;
            }
            this.f25145k = "backward accelerate cruse decelerate";
            this.f25144j = 3;
            this.f25135a = f10;
            this.f25136b = f13;
            this.f25137c = f13;
            float f18 = (f13 - f10) / f12;
            this.f25138d = f18;
            float f19 = f13 / f12;
            this.f25140f = f19;
            float f20 = ((f10 + f13) * f18) / 2.0f;
            float f21 = (f19 * f13) / 2.0f;
            this.f25139e = ((f11 - f20) - f21) / f13;
            this.f25141g = f20;
            this.f25142h = f11 - f21;
            this.f25143i = f11;
        } else if (f16 >= f11) {
            this.f25145k = "hard stop";
            this.f25144j = 1;
            this.f25135a = f10;
            this.f25136b = 0.0f;
            this.f25141g = f11;
            this.f25138d = (2.0f * f11) / f10;
        } else {
            float f22 = f11 - f16;
            float f23 = f22 / f10;
            if (f23 + f15 < f14) {
                this.f25145k = "cruse decelerate";
                this.f25144j = 2;
                this.f25135a = f10;
                this.f25136b = f10;
                this.f25137c = 0.0f;
                this.f25141g = f22;
                this.f25142h = f11;
                this.f25138d = f23;
                this.f25139e = f15;
                return;
            }
            float sqrt2 = (float) Math.sqrt((double) ((f12 * f11) + ((f10 * f10) / 2.0f)));
            float f24 = (sqrt2 - f10) / f12;
            this.f25138d = f24;
            float f25 = sqrt2 / f12;
            this.f25139e = f25;
            if (sqrt2 < f13) {
                this.f25145k = "accelerate decelerate";
                this.f25144j = 2;
                this.f25135a = f10;
                this.f25136b = sqrt2;
                this.f25137c = 0.0f;
                this.f25138d = f24;
                this.f25139e = f25;
                this.f25141g = ((f10 + sqrt2) * f24) / 2.0f;
                this.f25142h = f11;
                return;
            }
            this.f25145k = "accelerate cruse decelerate";
            this.f25144j = 3;
            this.f25135a = f10;
            this.f25136b = f13;
            this.f25137c = f13;
            float f26 = (f13 - f10) / f12;
            this.f25138d = f26;
            float f27 = f13 / f12;
            this.f25140f = f27;
            float f28 = ((f10 + f13) * f26) / 2.0f;
            float f29 = (f27 * f13) / 2.0f;
            this.f25139e = ((f11 - f28) - f29) / f13;
            this.f25141g = f28;
            this.f25142h = f11 - f29;
            this.f25143i = f11;
        }
    }

    public boolean a() {
        return d() < 1.0E-5f && Math.abs(this.f25143i - this.f25148n) < 1.0E-5f;
    }

    public void c(float f10, float f11, float f12, float f13, float f14, float f15) {
        boolean z10 = false;
        this.f25150p = false;
        this.f25147m = f10;
        if (f10 > f11) {
            z10 = true;
        }
        this.f25146l = z10;
        if (z10) {
            f(-f12, f10 - f11, f14, f15, f13);
            return;
        }
        f(f12, f11 - f10, f14, f15, f13);
    }

    public float d() {
        return this.f25146l ? -e(this.f25149o) : e(this.f25149o);
    }

    public float e(float f10) {
        float f11 = this.f25138d;
        if (f10 <= f11) {
            float f12 = this.f25135a;
            return f12 + (((this.f25136b - f12) * f10) / f11);
        }
        int i10 = this.f25144j;
        if (i10 == 1) {
            return 0.0f;
        }
        float f13 = f10 - f11;
        float f14 = this.f25139e;
        if (f13 < f14) {
            float f15 = this.f25136b;
            return f15 + (((this.f25137c - f15) * f13) / f14);
        } else if (i10 == 2) {
            return 0.0f;
        } else {
            float f16 = f13 - f14;
            float f17 = this.f25140f;
            if (f16 >= f17) {
                return 0.0f;
            }
            float f18 = this.f25137c;
            return f18 - ((f16 * f18) / f17);
        }
    }

    public float getInterpolation(float f10) {
        float b10 = b(f10);
        this.f25148n = b10;
        this.f25149o = f10;
        return this.f25146l ? this.f25147m - b10 : this.f25147m + b10;
    }
}
