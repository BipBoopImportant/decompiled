package l0;

import c2.d;
import kotlin.Metadata;
import m0.C5523B;
import m0.C5570z;

@Metadata(d1 = {"\u0000$\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a!\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"", "splinePositions", "splineTimes", "", "nbSamples", "LXH/N;", "b", "([F[FI)V", "T", "Lc2/d;", "density", "Lm0/z;", "c", "(Lc2/d;)Lm0/z;", "animation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class x {
    /* access modifiers changed from: private */
    public static final void b(float[] fArr, float[] fArr2, int i10) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        int i11 = i10;
        float f18 = 0.0f;
        float f19 = 0.0f;
        for (int i12 = 0; i12 < i11; i12++) {
            float f20 = ((float) i12) / ((float) i11);
            float f21 = 1.0f;
            while (true) {
                f10 = ((f21 - f18) / 2.0f) + f18;
                f11 = 1.0f - f10;
                f12 = f10 * 3.0f * f11;
                f13 = f10 * f10 * f10;
                float f22 = (((f11 * 0.175f) + (f10 * 0.35000002f)) * f12) + f13;
                if (((double) Math.abs(f22 - f20)) < 1.0E-5d) {
                    break;
                } else if (f22 > f20) {
                    f21 = f10;
                } else {
                    f18 = f10;
                }
            }
            float f23 = 0.5f;
            fArr[i12] = (f12 * ((f11 * 0.5f) + f10)) + f13;
            float f24 = 1.0f;
            while (true) {
                f14 = ((f24 - f19) / 2.0f) + f19;
                f15 = 1.0f - f14;
                f16 = f14 * 3.0f * f15;
                f17 = f14 * f14 * f14;
                float f25 = (((f15 * f23) + f14) * f16) + f17;
                if (((double) Math.abs(f25 - f20)) < 1.0E-5d) {
                    break;
                }
                if (f25 > f20) {
                    f24 = f14;
                } else {
                    f19 = f14;
                }
                f23 = 0.5f;
            }
            fArr2[i12] = (f16 * ((f15 * 0.175f) + (f14 * 0.35000002f))) + f17;
        }
        fArr2[i11] = 1.0f;
        fArr[i11] = 1.0f;
    }

    public static final <T> C5570z<T> c(d dVar) {
        return C5523B.d(new y(dVar));
    }
}
