package w2;

final class m {

    /* renamed from: k  reason: collision with root package name */
    static final m f31379k = k(C6208b.f31344c, (float) ((((double) C6208b.h(50.0f)) * 63.66197723675813d) / 100.0d), 50.0f, 2.0f, false);

    /* renamed from: a  reason: collision with root package name */
    private final float f31380a;

    /* renamed from: b  reason: collision with root package name */
    private final float f31381b;

    /* renamed from: c  reason: collision with root package name */
    private final float f31382c;

    /* renamed from: d  reason: collision with root package name */
    private final float f31383d;

    /* renamed from: e  reason: collision with root package name */
    private final float f31384e;

    /* renamed from: f  reason: collision with root package name */
    private final float f31385f;

    /* renamed from: g  reason: collision with root package name */
    private final float[] f31386g;

    /* renamed from: h  reason: collision with root package name */
    private final float f31387h;

    /* renamed from: i  reason: collision with root package name */
    private final float f31388i;

    /* renamed from: j  reason: collision with root package name */
    private final float f31389j;

    private m(float f10, float f11, float f12, float f13, float f14, float f15, float[] fArr, float f16, float f17, float f18) {
        this.f31385f = f10;
        this.f31380a = f11;
        this.f31381b = f12;
        this.f31382c = f13;
        this.f31383d = f14;
        this.f31384e = f15;
        this.f31386g = fArr;
        this.f31387h = f16;
        this.f31388i = f17;
        this.f31389j = f18;
    }

    static m k(float[] fArr, float f10, float f11, float f12, boolean z10) {
        float f13 = f10;
        float[][] fArr2 = C6208b.f31342a;
        float f14 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f15 = fArr[1];
        float f16 = fArr[2];
        float f17 = (fArr3[0] * f14) + (fArr3[1] * f15) + (fArr3[2] * f16);
        float[] fArr4 = fArr2[1];
        float f18 = (fArr4[0] * f14) + (fArr4[1] * f15) + (fArr4[2] * f16);
        float[] fArr5 = fArr2[2];
        float f19 = (f14 * fArr5[0]) + (f15 * fArr5[1]) + (f16 * fArr5[2]);
        float f20 = (f12 / 10.0f) + 0.8f;
        float d10 = ((double) f20) >= 0.9d ? C6208b.d(0.59f, 0.69f, (f20 - 0.9f) * 10.0f) : C6208b.d(0.525f, 0.59f, (f20 - 0.8f) * 10.0f);
        float exp = z10 ? 1.0f : (1.0f - (((float) Math.exp((double) (((-f13) - 42.0f) / 92.0f))) * 0.2777778f)) * f20;
        double d11 = (double) exp;
        if (d11 > 1.0d) {
            exp = 1.0f;
        } else if (d11 < 0.0d) {
            exp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f17) * exp) + 1.0f) - exp, (((100.0f / f18) * exp) + 1.0f) - exp, (((100.0f / f19) * exp) + 1.0f) - exp};
        float f21 = 1.0f / ((5.0f * f13) + 1.0f);
        float f22 = f21 * f21 * f21 * f21;
        float f23 = 1.0f - f22;
        float cbrt = (f22 * f13) + (0.1f * f23 * f23 * ((float) Math.cbrt(((double) f13) * 5.0d)));
        float h10 = C6208b.h(f11) / fArr[1];
        double d12 = (double) h10;
        float sqrt = ((float) Math.sqrt(d12)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d12, 0.2d));
        float[] fArr7 = {(float) Math.pow(((double) ((fArr6[0] * cbrt) * f17)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr6[1] * cbrt) * f18)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr6[2] * cbrt) * f19)) / 100.0d, 0.42d)};
        float f24 = fArr7[0];
        float f25 = (f24 * 400.0f) / (f24 + 27.13f);
        float f26 = fArr7[1];
        float f27 = (f26 * 400.0f) / (f26 + 27.13f);
        float f28 = fArr7[2];
        float[] fArr8 = {f25, f27, (400.0f * f28) / (f28 + 27.13f)};
        return new m(h10, ((fArr8[0] * 2.0f) + fArr8[1] + (fArr8[2] * 0.05f)) * pow, pow, pow, d10, f20, fArr6, cbrt, (float) Math.pow((double) cbrt, 0.25d), sqrt);
    }

    /* access modifiers changed from: package-private */
    public float a() {
        return this.f31380a;
    }

    /* access modifiers changed from: package-private */
    public float b() {
        return this.f31383d;
    }

    /* access modifiers changed from: package-private */
    public float c() {
        return this.f31387h;
    }

    /* access modifiers changed from: package-private */
    public float d() {
        return this.f31388i;
    }

    /* access modifiers changed from: package-private */
    public float e() {
        return this.f31385f;
    }

    /* access modifiers changed from: package-private */
    public float f() {
        return this.f31381b;
    }

    /* access modifiers changed from: package-private */
    public float g() {
        return this.f31384e;
    }

    /* access modifiers changed from: package-private */
    public float h() {
        return this.f31382c;
    }

    /* access modifiers changed from: package-private */
    public float[] i() {
        return this.f31386g;
    }

    /* access modifiers changed from: package-private */
    public float j() {
        return this.f31389j;
    }
}
