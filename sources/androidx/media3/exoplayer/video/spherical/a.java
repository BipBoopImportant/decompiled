package androidx.media3.exoplayer.video.spherical;

import android.opengl.Matrix;
import t3.C5961l;
import t3.G;

final class a {

    /* renamed from: a  reason: collision with root package name */
    private final float[] f43043a = new float[16];

    /* renamed from: b  reason: collision with root package name */
    private final float[] f43044b = new float[16];

    /* renamed from: c  reason: collision with root package name */
    private final G<float[]> f43045c = new G<>();

    /* renamed from: d  reason: collision with root package name */
    private boolean f43046d;

    public static void a(float[] fArr, float[] fArr2) {
        C5961l.k(fArr);
        float f10 = fArr2[10];
        float f11 = fArr2[8];
        float sqrt = (float) Math.sqrt((double) ((f10 * f10) + (f11 * f11)));
        float f12 = fArr2[10];
        fArr[0] = f12 / sqrt;
        float f13 = fArr2[8];
        fArr[2] = f13 / sqrt;
        fArr[8] = (-f13) / sqrt;
        fArr[10] = f12 / sqrt;
    }

    private static void b(float[] fArr, float[] fArr2) {
        float f10 = fArr2[0];
        float f11 = -fArr2[1];
        float f12 = -fArr2[2];
        float length = Matrix.length(f10, f11, f12);
        if (length != 0.0f) {
            Matrix.setRotateM(fArr, 0, (float) Math.toDegrees((double) length), f10 / length, f11 / length, f12 / length);
            return;
        }
        C5961l.k(fArr);
    }

    public boolean c(float[] fArr, long j10) {
        float[] j11 = this.f43045c.j(j10);
        if (j11 == null) {
            return false;
        }
        b(this.f43044b, j11);
        if (!this.f43046d) {
            a(this.f43043a, this.f43044b);
            this.f43046d = true;
        }
        Matrix.multiplyMM(fArr, 0, this.f43043a, 0, this.f43044b, 0);
        return true;
    }

    public void d() {
        this.f43045c.c();
        this.f43046d = false;
    }

    public void e(long j10, float[] fArr) {
        this.f43045c.a(j10, fArr);
    }
}
