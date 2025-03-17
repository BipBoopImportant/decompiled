package K6;

import android.app.Application;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.HandlerThread;
import android.os.SystemClock;
import java.util.Observable;

final class G extends Observable implements SensorEventListener {

    /* renamed from: a  reason: collision with root package name */
    SensorManager f37582a;

    /* renamed from: b  reason: collision with root package name */
    Sensor f37583b;

    /* renamed from: c  reason: collision with root package name */
    Sensor f37584c;

    /* renamed from: d  reason: collision with root package name */
    Sensor f37585d;

    /* renamed from: e  reason: collision with root package name */
    HandlerThread f37586e;

    /* renamed from: f  reason: collision with root package name */
    boolean f37587f = false;

    /* renamed from: g  reason: collision with root package name */
    boolean f37588g = false;

    /* renamed from: h  reason: collision with root package name */
    boolean f37589h = false;

    /* renamed from: i  reason: collision with root package name */
    private boolean f37590i = false;

    /* renamed from: j  reason: collision with root package name */
    private boolean f37591j = false;

    /* renamed from: k  reason: collision with root package name */
    boolean f37592k = false;

    /* renamed from: l  reason: collision with root package name */
    long f37593l = 0;

    /* renamed from: m  reason: collision with root package name */
    private float[] f37594m = new float[3];

    /* renamed from: n  reason: collision with root package name */
    private float[] f37595n = new float[3];

    /* renamed from: o  reason: collision with root package name */
    boolean f37596o = true;

    G(Application application) {
        try {
            this.f37582a = (SensorManager) application.getSystemService("sensor");
        } catch (NullPointerException e10) {
            C6595p.e("OrientationListener", "Exception on getting sensor service", e10);
            y.a(e10);
        }
    }

    public final void a() {
        if (this.f37588g) {
            this.f37582a.unregisterListener(this, this.f37584c);
            this.f37588g = false;
        }
        if (this.f37589h) {
            this.f37582a.unregisterListener(this, this.f37585d);
            this.f37589h = false;
        }
        if (this.f37587f) {
            this.f37582a.unregisterListener(this, this.f37583b);
            this.f37587f = false;
        }
        this.f37592k = false;
        HandlerThread handlerThread = this.f37586e;
        if (handlerThread != null && handlerThread.isAlive()) {
            this.f37586e.quitSafely();
        }
    }

    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        try {
            long uptimeMillis = SystemClock.uptimeMillis();
            if (!this.f37592k && sensorEvent.accuracy == 0) {
                C6595p.d("OrientationListener", "Unreliable orientation sensor data...", new Throwable[0]);
                this.f37592k = true;
            }
            int type = sensorEvent.sensor.getType();
            if (type == 9) {
                this.f37594m = (float[]) sensorEvent.values.clone();
                this.f37590i = true;
            } else if (type == 1) {
                this.f37594m = (float[]) sensorEvent.values.clone();
                this.f37590i = true;
            } else if (type == 2) {
                this.f37595n = (float[]) sensorEvent.values.clone();
                this.f37591j = true;
            }
            if (this.f37590i && this.f37591j) {
                long j10 = this.f37593l;
                if (uptimeMillis - j10 >= 100 || C6599u.f37713e == 1) {
                    long j11 = uptimeMillis - j10;
                    this.f37593l = uptimeMillis;
                    boolean z10 = C6599u.f37713e != 0;
                    C6599u.f37713e = 0;
                    setChanged();
                    notifyObservers(new F(this.f37594m, this.f37595n, this.f37593l, z10 ? 2 : 1, this.f37596o, j11));
                    this.f37590i = false;
                    this.f37591j = false;
                    this.f37596o = false;
                }
            }
        } catch (Exception e10) {
            C6595p.d("OrientationListener", "Exception in processing orientation event", e10);
            y.a(e10);
        }
    }
}
