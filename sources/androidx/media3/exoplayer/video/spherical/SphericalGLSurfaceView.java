package androidx.media3.exoplayer.video.spherical;

import L3.o;
import M3.C6649a;
import M3.C6651c;
import M3.C6652d;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.WindowManager;
import androidx.media3.exoplayer.video.spherical.b;
import androidx.media3.exoplayer.video.spherical.h;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import t3.C5950a;
import t3.C5961l;

public final class SphericalGLSurfaceView extends GLSurfaceView {

    /* renamed from: m  reason: collision with root package name */
    public static final /* synthetic */ int f43019m = 0;

    /* renamed from: a  reason: collision with root package name */
    private final CopyOnWriteArrayList<b> f43020a;

    /* renamed from: b  reason: collision with root package name */
    private final SensorManager f43021b;

    /* renamed from: c  reason: collision with root package name */
    private final Sensor f43022c;

    /* renamed from: d  reason: collision with root package name */
    private final b f43023d;

    /* renamed from: e  reason: collision with root package name */
    private final Handler f43024e;

    /* renamed from: f  reason: collision with root package name */
    private final h f43025f;

    /* renamed from: g  reason: collision with root package name */
    private final g f43026g;

    /* renamed from: h  reason: collision with root package name */
    private SurfaceTexture f43027h;

    /* renamed from: i  reason: collision with root package name */
    private Surface f43028i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f43029j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f43030k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f43031l;

    final class a implements GLSurfaceView.Renderer, h.a, b.a {

        /* renamed from: a  reason: collision with root package name */
        private final g f43032a;

        /* renamed from: b  reason: collision with root package name */
        private final float[] f43033b = new float[16];

        /* renamed from: c  reason: collision with root package name */
        private final float[] f43034c = new float[16];

        /* renamed from: d  reason: collision with root package name */
        private final float[] f43035d;

        /* renamed from: e  reason: collision with root package name */
        private final float[] f43036e;

        /* renamed from: f  reason: collision with root package name */
        private final float[] f43037f;

        /* renamed from: g  reason: collision with root package name */
        private float f43038g;

        /* renamed from: h  reason: collision with root package name */
        private float f43039h;

        /* renamed from: i  reason: collision with root package name */
        private final float[] f43040i;

        /* renamed from: j  reason: collision with root package name */
        private final float[] f43041j;

        public a(g gVar) {
            float[] fArr = new float[16];
            this.f43035d = fArr;
            float[] fArr2 = new float[16];
            this.f43036e = fArr2;
            float[] fArr3 = new float[16];
            this.f43037f = fArr3;
            this.f43040i = new float[16];
            this.f43041j = new float[16];
            this.f43032a = gVar;
            C5961l.k(fArr);
            C5961l.k(fArr2);
            C5961l.k(fArr3);
            this.f43039h = 3.1415927f;
        }

        private float c(float f10) {
            if (f10 > 1.0f) {
                return (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / ((double) f10))) * 2.0d);
            }
            return 90.0f;
        }

        private void d() {
            Matrix.setRotateM(this.f43036e, 0, -this.f43038g, (float) Math.cos((double) this.f43039h), (float) Math.sin((double) this.f43039h), 0.0f);
        }

        public synchronized void a(float[] fArr, float f10) {
            float[] fArr2 = this.f43035d;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            this.f43039h = -f10;
            d();
        }

        public synchronized void b(PointF pointF) {
            this.f43038g = pointF.y;
            d();
            Matrix.setRotateM(this.f43037f, 0, -pointF.x, 0.0f, 1.0f, 0.0f);
        }

        public void onDrawFrame(GL10 gl10) {
            synchronized (this) {
                Matrix.multiplyMM(this.f43041j, 0, this.f43035d, 0, this.f43037f, 0);
                Matrix.multiplyMM(this.f43040i, 0, this.f43036e, 0, this.f43041j, 0);
            }
            Matrix.multiplyMM(this.f43034c, 0, this.f43033b, 0, this.f43040i, 0);
            this.f43032a.c(this.f43034c, false);
        }

        public boolean onSingleTapUp(MotionEvent motionEvent) {
            return SphericalGLSurfaceView.this.performClick();
        }

        public void onSurfaceChanged(GL10 gl10, int i10, int i11) {
            GLES20.glViewport(0, 0, i10, i11);
            float f10 = ((float) i10) / ((float) i11);
            Matrix.perspectiveM(this.f43033b, 0, c(f10), f10, 0.1f, 100.0f);
        }

        public synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            SphericalGLSurfaceView.this.g(this.f43032a.d());
        }
    }

    public interface b {
        void C(Surface surface);

        void u(Surface surface);
    }

    public SphericalGLSurfaceView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void e() {
        Surface surface = this.f43028i;
        if (surface != null) {
            Iterator<b> it = this.f43020a.iterator();
            while (it.hasNext()) {
                it.next().u(surface);
            }
        }
        h(this.f43027h, surface);
        this.f43027h = null;
        this.f43028i = null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void f(SurfaceTexture surfaceTexture) {
        SurfaceTexture surfaceTexture2 = this.f43027h;
        Surface surface = this.f43028i;
        Surface surface2 = new Surface(surfaceTexture);
        this.f43027h = surfaceTexture;
        this.f43028i = surface2;
        Iterator<b> it = this.f43020a.iterator();
        while (it.hasNext()) {
            it.next().C(surface2);
        }
        h(surfaceTexture2, surface);
    }

    /* access modifiers changed from: private */
    public void g(SurfaceTexture surfaceTexture) {
        this.f43024e.post(new C6652d(this, surfaceTexture));
    }

    private static void h(SurfaceTexture surfaceTexture, Surface surface) {
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        if (surface != null) {
            surface.release();
        }
    }

    private void j() {
        boolean z10 = this.f43029j && this.f43030k;
        Sensor sensor = this.f43022c;
        if (sensor != null && z10 != this.f43031l) {
            if (z10) {
                this.f43021b.registerListener(this.f43023d, sensor, 0);
            } else {
                this.f43021b.unregisterListener(this.f43023d);
            }
            this.f43031l = z10;
        }
    }

    public void d(b bVar) {
        this.f43020a.add(bVar);
    }

    public C6649a getCameraMotionListener() {
        return this.f43026g;
    }

    public o getVideoFrameMetadataListener() {
        return this.f43026g;
    }

    public Surface getVideoSurface() {
        return this.f43028i;
    }

    public void i(b bVar) {
        this.f43020a.remove(bVar);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f43024e.post(new C6651c(this));
    }

    public void onPause() {
        this.f43030k = false;
        j();
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        this.f43030k = true;
        j();
    }

    public void setDefaultStereoMode(int i10) {
        this.f43026g.h(i10);
    }

    public void setUseSensorRotation(boolean z10) {
        this.f43029j = z10;
        j();
    }

    public SphericalGLSurfaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f43020a = new CopyOnWriteArrayList<>();
        this.f43024e = new Handler(Looper.getMainLooper());
        SensorManager sensorManager = (SensorManager) C5950a.e(context.getSystemService("sensor"));
        this.f43021b = sensorManager;
        Sensor defaultSensor = sensorManager.getDefaultSensor(15);
        this.f43022c = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        g gVar = new g();
        this.f43026g = gVar;
        a aVar = new a(gVar);
        h hVar = new h(context, aVar, 25.0f);
        this.f43025f = hVar;
        this.f43023d = new b(((WindowManager) C5950a.e((WindowManager) context.getSystemService("window"))).getDefaultDisplay(), hVar, aVar);
        this.f43029j = true;
        setEGLContextClientVersion(2);
        setRenderer(aVar);
        setOnTouchListener(hVar);
    }
}
