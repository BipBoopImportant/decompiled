package K6;

import android.app.Application;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.HandlerThread;
import android.os.SystemClock;
import java.util.Observable;

final class B extends Observable implements SensorEventListener {

    /* renamed from: a  reason: collision with root package name */
    SensorManager f37523a;

    /* renamed from: b  reason: collision with root package name */
    Sensor f37524b;

    /* renamed from: c  reason: collision with root package name */
    Sensor f37525c;

    /* renamed from: d  reason: collision with root package name */
    HandlerThread f37526d;

    /* renamed from: e  reason: collision with root package name */
    long f37527e = 0;

    /* renamed from: f  reason: collision with root package name */
    boolean f37528f = false;

    /* renamed from: g  reason: collision with root package name */
    boolean f37529g = false;

    /* renamed from: h  reason: collision with root package name */
    boolean f37530h = false;

    /* renamed from: i  reason: collision with root package name */
    boolean f37531i = false;

    /* renamed from: j  reason: collision with root package name */
    boolean f37532j = false;

    /* renamed from: k  reason: collision with root package name */
    private float f37533k = -1.0f;

    /* renamed from: l  reason: collision with root package name */
    private float f37534l = -1.0f;

    /* renamed from: m  reason: collision with root package name */
    private float f37535m = -1.0f;

    /* renamed from: n  reason: collision with root package name */
    private float f37536n = -1.0f;

    /* renamed from: o  reason: collision with root package name */
    private float f37537o = -1.0f;

    /* renamed from: p  reason: collision with root package name */
    private float f37538p = -1.0f;

    /* renamed from: q  reason: collision with root package name */
    private float f37539q = -1.0f;

    /* renamed from: r  reason: collision with root package name */
    private float f37540r = -1.0f;

    /* renamed from: s  reason: collision with root package name */
    private float f37541s = -1.0f;

    /* renamed from: t  reason: collision with root package name */
    float f37542t = 0.0f;

    /* renamed from: u  reason: collision with root package name */
    private final float[] f37543u = {0.0f, 0.0f, 0.0f};

    /* renamed from: v  reason: collision with root package name */
    int f37544v = 0;

    /* renamed from: w  reason: collision with root package name */
    boolean f37545w = true;

    public B(Application application) {
        try {
            this.f37523a = (SensorManager) application.getSystemService("sensor");
        } catch (Exception e10) {
            C6595p.e("MotionListener", "Exception on getting sensor service", e10);
            y.a(e10);
        }
    }

    public final void a() {
        if (this.f37529g) {
            this.f37523a.unregisterListener(this, this.f37525c);
            this.f37529g = false;
        }
        if (this.f37528f) {
            this.f37523a.unregisterListener(this, this.f37524b);
            this.f37528f = false;
        }
        this.f37532j = false;
        HandlerThread handlerThread = this.f37526d;
        if (handlerThread != null && handlerThread.isAlive()) {
            this.f37526d.quitSafely();
        }
    }

    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        String str;
        Object obj;
        SensorEvent sensorEvent2 = sensorEvent;
        try {
            long uptimeMillis = SystemClock.uptimeMillis();
            if (!this.f37532j && sensorEvent2.accuracy == 0) {
                C6595p.d("MotionListener", "Unreliable motion sensors data...", new Throwable[0]);
                this.f37532j = true;
            }
            int type = sensorEvent2.sensor.getType();
            if (type == 4) {
                if (this.f37529g) {
                    float[] fArr = sensorEvent2.values;
                    this.f37539q = fArr[0];
                    this.f37540r = fArr[1];
                    this.f37541s = fArr[2];
                    this.f37530h = true;
                }
            } else if (type == 1 && this.f37528f) {
                float[] fArr2 = sensorEvent2.values;
                this.f37533k = fArr2[0];
                this.f37534l = fArr2[1];
                this.f37535m = fArr2[2];
                int i10 = this.f37544v + 1;
                this.f37544v = i10;
                float nanoTime = 1.0f / (((float) i10) / ((((float) System.nanoTime()) - this.f37542t) / 1.0E9f));
                if (Float.isNaN(nanoTime) || Float.isInfinite(nanoTime)) {
                    nanoTime = 0.0f;
                }
                float f10 = 0.18f / (nanoTime + 0.18f);
                float[] fArr3 = this.f37543u;
                float f11 = 1.0f - f10;
                fArr3[0] = (fArr3[0] * f10) + (fArr2[0] * f11);
                fArr3[1] = (fArr3[1] * f10) + (fArr2[1] * f11);
                fArr3[2] = (f10 * fArr3[2]) + (f11 * fArr2[2]);
                float[] fArr4 = {0.0f, 0.0f, 0.0f};
                float f12 = fArr2[0] - fArr3[0];
                fArr4[0] = f12;
                fArr4[1] = fArr2[1] - fArr3[1];
                fArr4[2] = fArr2[2] - fArr3[2];
                if (Float.isNaN(f12) || Float.isInfinite(fArr4[0])) {
                    fArr4[0] = 0.0f;
                }
                if (Float.isNaN(fArr4[1]) || Float.isInfinite(fArr4[1])) {
                    fArr4[1] = 0.0f;
                }
                if (Float.isNaN(fArr4[2]) || Float.isInfinite(fArr4[2])) {
                    fArr4[2] = 0.0f;
                }
                float f13 = fArr4[0];
                float f14 = fArr4[1];
                float f15 = fArr4[2];
                this.f37533k *= -1.0f;
                this.f37534l *= -1.0f;
                this.f37535m *= -1.0f;
                this.f37536n = f13 * -1.0f;
                this.f37537o = f14 * -1.0f;
                this.f37538p = f15 * -1.0f;
                this.f37531i = true;
            }
            if (this.f37530h && this.f37531i) {
                long j10 = this.f37527e;
                if (uptimeMillis - j10 >= 100 || C6599u.f37712d == 1) {
                    long j11 = uptimeMillis - j10;
                    this.f37527e = uptimeMillis;
                    boolean z10 = C6599u.f37712d != 0;
                    C6599u.f37712d = 0;
                    setChanged();
                    str = "MotionListener";
                    try {
                        new D(this.f37533k, this.f37534l, this.f37535m, this.f37536n, this.f37537o, this.f37538p, this.f37539q, this.f37540r, this.f37541s, this.f37527e, z10 ? 2 : 1, this.f37545w, j11);
                        notifyObservers(obj);
                        this.f37530h = !this.f37529g;
                        this.f37531i = !this.f37528f;
                        this.f37545w = false;
                    } catch (Exception e10) {
                        e = e10;
                        C6595p.d(str, "Exception in processing motion event", e);
                        y.a(e);
                    }
                }
            }
        } catch (Exception e11) {
            e = e11;
            str = "MotionListener";
            C6595p.d(str, "Exception in processing motion event", e);
            y.a(e);
        }
    }
}
