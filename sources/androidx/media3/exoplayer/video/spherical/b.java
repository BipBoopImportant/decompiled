package androidx.media3.exoplayer.video.spherical;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.view.Display;

final class b implements SensorEventListener {

    /* renamed from: a  reason: collision with root package name */
    private final float[] f43047a = new float[16];

    /* renamed from: b  reason: collision with root package name */
    private final float[] f43048b = new float[16];

    /* renamed from: c  reason: collision with root package name */
    private final float[] f43049c = new float[16];

    /* renamed from: d  reason: collision with root package name */
    private final float[] f43050d = new float[3];

    /* renamed from: e  reason: collision with root package name */
    private final Display f43051e;

    /* renamed from: f  reason: collision with root package name */
    private final a[] f43052f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f43053g;

    public interface a {
        void a(float[] fArr, float f10);
    }

    public b(Display display, a... aVarArr) {
        this.f43051e = display;
        this.f43052f = aVarArr;
    }

    private float a(float[] fArr) {
        SensorManager.remapCoordinateSystem(fArr, 1, 131, this.f43048b);
        SensorManager.getOrientation(this.f43048b, this.f43050d);
        return this.f43050d[2];
    }

    private void b(float[] fArr, float f10) {
        for (a a10 : this.f43052f) {
            a10.a(fArr, f10);
        }
    }

    private void c(float[] fArr) {
        if (!this.f43053g) {
            a.a(this.f43049c, fArr);
            this.f43053g = true;
        }
        float[] fArr2 = this.f43048b;
        System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
        Matrix.multiplyMM(fArr, 0, this.f43048b, 0, this.f43049c, 0);
    }

    private void d(float[] fArr, int i10) {
        if (i10 != 0) {
            int i11 = 129;
            int i12 = 1;
            if (i10 == 1) {
                i12 = 129;
                i11 = 2;
            } else if (i10 == 2) {
                i12 = 130;
            } else if (i10 == 3) {
                i11 = 130;
            } else {
                throw new IllegalStateException();
            }
            float[] fArr2 = this.f43048b;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            SensorManager.remapCoordinateSystem(this.f43048b, i11, i12, fArr);
        }
    }

    private static void e(float[] fArr) {
        Matrix.rotateM(fArr, 0, 90.0f, 1.0f, 0.0f, 0.0f);
    }

    public void onAccuracyChanged(Sensor sensor, int i10) {
    }

    public void onSensorChanged(SensorEvent sensorEvent) {
        SensorManager.getRotationMatrixFromVector(this.f43047a, sensorEvent.values);
        d(this.f43047a, this.f43051e.getRotation());
        float a10 = a(this.f43047a);
        e(this.f43047a);
        c(this.f43047a);
        b(this.f43047a, a10);
    }
}
