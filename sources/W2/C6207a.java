package w2;

import x2.C6244c;

/* renamed from: w2.a  reason: case insensitive filesystem */
public class C6207a {

    /* renamed from: a  reason: collision with root package name */
    private final float f31333a;

    /* renamed from: b  reason: collision with root package name */
    private final float f31334b;

    /* renamed from: c  reason: collision with root package name */
    private final float f31335c;

    /* renamed from: d  reason: collision with root package name */
    private final float f31336d;

    /* renamed from: e  reason: collision with root package name */
    private final float f31337e;

    /* renamed from: f  reason: collision with root package name */
    private final float f31338f;

    /* renamed from: g  reason: collision with root package name */
    private final float f31339g;

    /* renamed from: h  reason: collision with root package name */
    private final float f31340h;

    /* renamed from: i  reason: collision with root package name */
    private final float f31341i;

    C6207a(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18) {
        this.f31333a = f10;
        this.f31334b = f11;
        this.f31335c = f12;
        this.f31336d = f13;
        this.f31337e = f14;
        this.f31338f = f15;
        this.f31339g = f16;
        this.f31340h = f17;
        this.f31341i = f18;
    }

    private static C6207a b(float f10, float f11, float f12) {
        float f13 = 100.0f;
        float f14 = 1000.0f;
        float f15 = 0.0f;
        C6207a aVar = null;
        float f16 = 1000.0f;
        while (Math.abs(f15 - f13) > 0.01f) {
            float f17 = ((f13 - f15) / 2.0f) + f15;
            int p10 = e(f17, f11, f10).p();
            float b10 = C6208b.b(p10);
            float abs = Math.abs(f12 - b10);
            if (abs < 0.2f) {
                C6207a c10 = c(p10);
                float a10 = c10.a(e(c10.k(), c10.i(), f10));
                if (a10 <= 1.0f) {
                    aVar = c10;
                    f14 = abs;
                    f16 = a10;
                }
            }
            if (f14 == 0.0f && f16 == 0.0f) {
                break;
            } else if (b10 < f12) {
                f15 = f17;
            } else {
                f13 = f17;
            }
        }
        return aVar;
    }

    static C6207a c(int i10) {
        float[] fArr = new float[7];
        float[] fArr2 = new float[3];
        d(i10, m.f31379k, fArr, fArr2);
        return new C6207a(fArr2[0], fArr2[1], fArr[0], fArr[1], fArr[2], fArr[3], fArr[4], fArr[5], fArr[6]);
    }

    static void d(int i10, m mVar, float[] fArr, float[] fArr2) {
        float[] fArr3 = fArr2;
        C6208b.f(i10, fArr3);
        float[][] fArr4 = C6208b.f31342a;
        float f10 = fArr3[0];
        float[] fArr5 = fArr4[0];
        float f11 = fArr3[1];
        float f12 = fArr3[2];
        float f13 = (fArr5[0] * f10) + (fArr5[1] * f11) + (fArr5[2] * f12);
        float[] fArr6 = fArr4[1];
        float f14 = (fArr6[0] * f10) + (fArr6[1] * f11) + (fArr6[2] * f12);
        float[] fArr7 = fArr4[2];
        float f15 = mVar.i()[0] * f13;
        float f16 = mVar.i()[1] * f14;
        float f17 = mVar.i()[2] * ((f10 * fArr7[0]) + (f11 * fArr7[1]) + (f12 * fArr7[2]));
        float pow = (float) Math.pow(((double) (mVar.c() * Math.abs(f15))) / 100.0d, 0.42d);
        float pow2 = (float) Math.pow(((double) (mVar.c() * Math.abs(f16))) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow(((double) (mVar.c() * Math.abs(f17))) / 100.0d, 0.42d);
        float signum = ((Math.signum(f15) * 400.0f) * pow) / (pow + 27.13f);
        float signum2 = ((Math.signum(f16) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum3 = ((Math.signum(f17) * 400.0f) * pow3) / (pow3 + 27.13f);
        double d10 = (double) signum3;
        float f18 = ((float) (((((double) signum) * 11.0d) + (((double) signum2) * -12.0d)) + d10)) / 11.0f;
        float f19 = ((float) (((double) (signum + signum2)) - (d10 * 2.0d))) / 9.0f;
        float f20 = signum2 * 20.0f;
        float f21 = (((signum * 20.0f) + f20) + (21.0f * signum3)) / 20.0f;
        float f22 = (((signum * 40.0f) + f20) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2((double) f19, (double) f18)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f23 = (3.1415927f * atan2) / 180.0f;
        float f24 = f21;
        float f25 = f19;
        float pow4 = ((float) Math.pow((double) ((f22 * mVar.f()) / mVar.a()), (double) (mVar.b() * mVar.j()))) * 100.0f;
        float b10 = (4.0f / mVar.b()) * ((float) Math.sqrt((double) (pow4 / 100.0f))) * (mVar.a() + 4.0f) * mVar.d();
        float pow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, (double) mVar.e()), 0.73d)) * ((float) Math.pow((double) ((((((((float) (Math.cos(((((double) (((double) atan2) < 20.14d ? 360.0f + atan2 : atan2)) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * mVar.g()) * mVar.h()) * ((float) Math.sqrt((double) ((f18 * f18) + (f25 * f25))))) / (f24 + 0.305f)), 0.9d));
        float sqrt = ((float) Math.sqrt(((double) pow4) / 100.0d)) * pow5;
        float d11 = mVar.d() * sqrt;
        float sqrt2 = ((float) Math.sqrt((double) ((pow5 * mVar.b()) / (mVar.a() + 4.0f)))) * 50.0f;
        float f26 = (1.7f * pow4) / ((0.007f * pow4) + 1.0f);
        float log = ((float) Math.log((double) ((0.0228f * d11) + 1.0f))) * 43.85965f;
        double d12 = (double) f23;
        float cos = ((float) Math.cos(d12)) * log;
        float sin = log * ((float) Math.sin(d12));
        fArr3[0] = atan2;
        fArr3[1] = sqrt;
        if (fArr != null) {
            fArr[0] = pow4;
            fArr[1] = b10;
            fArr[2] = d11;
            fArr[3] = sqrt2;
            fArr[4] = f26;
            fArr[5] = cos;
            fArr[6] = sin;
        }
    }

    private static C6207a e(float f10, float f11, float f12) {
        return f(f10, f11, f12, m.f31379k);
    }

    private static C6207a f(float f10, float f11, float f12, m mVar) {
        float f13 = f10;
        double d10 = ((double) f13) / 100.0d;
        float b10 = (4.0f / mVar.b()) * ((float) Math.sqrt(d10)) * (mVar.a() + 4.0f) * mVar.d();
        float d11 = f11 * mVar.d();
        float sqrt = ((float) Math.sqrt((double) (((f11 / ((float) Math.sqrt(d10))) * mVar.b()) / (mVar.a() + 4.0f)))) * 50.0f;
        float f14 = (1.7f * f13) / ((0.007f * f13) + 1.0f);
        float log = ((float) Math.log((((double) d11) * 0.0228d) + 1.0d)) * 43.85965f;
        double d12 = (double) ((3.1415927f * f12) / 180.0f);
        return new C6207a(f12, f11, f13, b10, d11, sqrt, f14, log * ((float) Math.cos(d12)), log * ((float) Math.sin(d12)));
    }

    public static int m(float f10, float f11, float f12) {
        return n(f10, f11, f12, m.f31379k);
    }

    static int n(float f10, float f11, float f12, m mVar) {
        if (((double) f11) < 1.0d || ((double) Math.round(f12)) <= 0.0d || ((double) Math.round(f12)) >= 100.0d) {
            return C6208b.a(f12);
        }
        float min = f10 < 0.0f ? 0.0f : Math.min(360.0f, f10);
        C6207a aVar = null;
        boolean z10 = true;
        float f13 = 0.0f;
        float f14 = f11;
        while (Math.abs(f13 - f11) >= 0.4f) {
            C6207a b10 = b(min, f14, f12);
            if (!z10) {
                if (b10 == null) {
                    f11 = f14;
                } else {
                    f13 = f14;
                    aVar = b10;
                }
                f14 = ((f11 - f13) / 2.0f) + f13;
            } else if (b10 != null) {
                return b10.o(mVar);
            } else {
                f14 = ((f11 - f13) / 2.0f) + f13;
                z10 = false;
            }
        }
        return aVar == null ? C6208b.a(f12) : aVar.o(mVar);
    }

    /* access modifiers changed from: package-private */
    public float a(C6207a aVar) {
        float l10 = l() - aVar.l();
        float g10 = g() - aVar.g();
        float h10 = h() - aVar.h();
        return (float) (Math.pow(Math.sqrt((double) ((l10 * l10) + (g10 * g10) + (h10 * h10))), 0.63d) * 1.41d);
    }

    /* access modifiers changed from: package-private */
    public float g() {
        return this.f31340h;
    }

    /* access modifiers changed from: package-private */
    public float h() {
        return this.f31341i;
    }

    /* access modifiers changed from: package-private */
    public float i() {
        return this.f31334b;
    }

    /* access modifiers changed from: package-private */
    public float j() {
        return this.f31333a;
    }

    /* access modifiers changed from: package-private */
    public float k() {
        return this.f31335c;
    }

    /* access modifiers changed from: package-private */
    public float l() {
        return this.f31339g;
    }

    /* access modifiers changed from: package-private */
    public int o(m mVar) {
        float pow = (float) Math.pow(((double) ((((double) i()) == 0.0d || ((double) k()) == 0.0d) ? 0.0f : i() / ((float) Math.sqrt(((double) k()) / 100.0d)))) / Math.pow(1.64d - Math.pow(0.29d, (double) mVar.e()), 0.73d), 1.1111111111111112d);
        double j10 = (double) ((j() * 3.1415927f) / 180.0f);
        float a10 = mVar.a() * ((float) Math.pow(((double) k()) / 100.0d, (1.0d / ((double) mVar.b())) / ((double) mVar.j())));
        float cos = ((float) (Math.cos(2.0d + j10) + 3.8d)) * 0.25f * 3846.1538f * mVar.g() * mVar.h();
        float f10 = a10 / mVar.f();
        float sin = (float) Math.sin(j10);
        float cos2 = (float) Math.cos(j10);
        float f11 = (((0.305f + f10) * 23.0f) * pow) / (((cos * 23.0f) + ((11.0f * pow) * cos2)) + ((pow * 108.0f) * sin));
        float f12 = cos2 * f11;
        float f13 = f11 * sin;
        float f14 = f10 * 460.0f;
        float f15 = (((451.0f * f12) + f14) + (288.0f * f13)) / 1403.0f;
        float f16 = ((f14 - (891.0f * f12)) - (261.0f * f13)) / 1403.0f;
        float f17 = ((f14 - (f12 * 220.0f)) - (f13 * 6300.0f)) / 1403.0f;
        float signum = Math.signum(f15) * (100.0f / mVar.c()) * ((float) Math.pow((double) ((float) Math.max(0.0d, (((double) Math.abs(f15)) * 27.13d) / (400.0d - ((double) Math.abs(f15))))), 2.380952380952381d));
        float signum2 = Math.signum(f16) * (100.0f / mVar.c()) * ((float) Math.pow((double) ((float) Math.max(0.0d, (((double) Math.abs(f16)) * 27.13d) / (400.0d - ((double) Math.abs(f16))))), 2.380952380952381d));
        float signum3 = Math.signum(f17) * (100.0f / mVar.c()) * ((float) Math.pow((double) ((float) Math.max(0.0d, (((double) Math.abs(f17)) * 27.13d) / (400.0d - ((double) Math.abs(f17))))), 2.380952380952381d));
        float f18 = signum / mVar.i()[0];
        float f19 = signum2 / mVar.i()[1];
        float f20 = signum3 / mVar.i()[2];
        float[][] fArr = C6208b.f31343b;
        float[] fArr2 = fArr[0];
        float f21 = (fArr2[0] * f18) + (fArr2[1] * f19) + (fArr2[2] * f20);
        float[] fArr3 = fArr[1];
        float[] fArr4 = fArr[2];
        return C6244c.c((double) f21, (double) ((fArr3[0] * f18) + (fArr3[1] * f19) + (fArr3[2] * f20)), (double) ((f18 * fArr4[0]) + (f19 * fArr4[1]) + (f20 * fArr4[2])));
    }

    /* access modifiers changed from: package-private */
    public int p() {
        return o(m.f31379k);
    }
}
