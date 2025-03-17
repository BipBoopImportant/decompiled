package v;

import B2.a;
import C.K0;

class p2 implements K0 {

    /* renamed from: a  reason: collision with root package name */
    private float f30646a;

    /* renamed from: b  reason: collision with root package name */
    private final float f30647b;

    /* renamed from: c  reason: collision with root package name */
    private final float f30648c;

    /* renamed from: d  reason: collision with root package name */
    private float f30649d;

    p2(float f10, float f11) {
        this.f30647b = f10;
        this.f30648c = f11;
    }

    private float e(float f10) {
        float f11 = this.f30647b;
        float f12 = this.f30648c;
        if (f11 == f12) {
            return 0.0f;
        }
        if (f10 == f11) {
            return 1.0f;
        }
        if (f10 == f12) {
            return 0.0f;
        }
        float f13 = 1.0f / f12;
        return ((1.0f / f10) - f13) / ((1.0f / f11) - f13);
    }

    private float f(float f10) {
        if (f10 == 1.0f) {
            return this.f30647b;
        }
        if (f10 == 0.0f) {
            return this.f30648c;
        }
        float f11 = this.f30647b;
        float f12 = this.f30648c;
        double d10 = (double) (1.0f / f12);
        return (float) a.a(1.0d / (d10 + ((((double) (1.0f / f11)) - d10) * ((double) f10))), (double) f12, (double) f11);
    }

    public float a() {
        return this.f30647b;
    }

    public float b() {
        return this.f30649d;
    }

    public float c() {
        return this.f30648c;
    }

    public float d() {
        return this.f30646a;
    }

    /* access modifiers changed from: package-private */
    public void g(float f10) {
        if (f10 > 1.0f || f10 < 0.0f) {
            throw new IllegalArgumentException("Requested linearZoom " + f10 + " is not within valid range [0..1]");
        }
        this.f30649d = f10;
        this.f30646a = f(f10);
    }

    /* access modifiers changed from: package-private */
    public void h(float f10) {
        if (f10 > this.f30647b || f10 < this.f30648c) {
            throw new IllegalArgumentException("Requested zoomRatio " + f10 + " is not within valid range [" + this.f30648c + " , " + this.f30647b + "]");
        }
        this.f30646a = f10;
        this.f30649d = e(f10);
    }
}
