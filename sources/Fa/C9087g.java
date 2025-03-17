package Fa;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;

/* renamed from: Fa.g  reason: case insensitive filesystem */
public class C9087g implements TypeEvaluator<Matrix> {

    /* renamed from: a  reason: collision with root package name */
    private final float[] f60381a = new float[9];

    /* renamed from: b  reason: collision with root package name */
    private final float[] f60382b = new float[9];

    /* renamed from: c  reason: collision with root package name */
    private final Matrix f60383c = new Matrix();

    public Matrix a(float f10, Matrix matrix, Matrix matrix2) {
        matrix.getValues(this.f60381a);
        matrix2.getValues(this.f60382b);
        for (int i10 = 0; i10 < 9; i10++) {
            float[] fArr = this.f60382b;
            float f11 = fArr[i10];
            float f12 = this.f60381a[i10];
            fArr[i10] = f12 + ((f11 - f12) * f10);
        }
        this.f60383c.setValues(this.f60382b);
        return this.f60383c;
    }
}
