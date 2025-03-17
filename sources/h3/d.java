package h3;

import android.view.animation.Interpolator;

abstract class d implements Interpolator {

    /* renamed from: a  reason: collision with root package name */
    private final float[] f23869a;

    /* renamed from: b  reason: collision with root package name */
    private final float f23870b;

    protected d(float[] fArr) {
        this.f23869a = fArr;
        this.f23870b = 1.0f / ((float) (fArr.length - 1));
    }

    public float getInterpolation(float f10) {
        if (f10 >= 1.0f) {
            return 1.0f;
        }
        if (f10 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f23869a;
        int min = Math.min((int) (((float) (fArr.length - 1)) * f10), fArr.length - 2);
        float f11 = this.f23870b;
        float f12 = (f10 - (((float) min) * f11)) / f11;
        float[] fArr2 = this.f23869a;
        float f13 = fArr2[min];
        return f13 + (f12 * (fArr2[min + 1] - f13));
    }
}
