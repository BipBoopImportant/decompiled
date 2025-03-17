package t3;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;

/* renamed from: t3.j  reason: case insensitive filesystem */
public final class C5959j implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* renamed from: g  reason: collision with root package name */
    private static final int[] f29497g = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* renamed from: a  reason: collision with root package name */
    private final Handler f29498a;

    /* renamed from: b  reason: collision with root package name */
    private final int[] f29499b;

    /* renamed from: c  reason: collision with root package name */
    private EGLDisplay f29500c;

    /* renamed from: d  reason: collision with root package name */
    private EGLContext f29501d;

    /* renamed from: e  reason: collision with root package name */
    private EGLSurface f29502e;

    /* renamed from: f  reason: collision with root package name */
    private SurfaceTexture f29503f;

    /* renamed from: t3.j$a */
    public interface a {
    }

    public C5959j(Handler handler) {
        this(handler, (a) null);
    }

    private static EGLConfig a(EGLDisplay eGLDisplay) {
        boolean z10 = true;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr = new int[1];
        boolean eglChooseConfig = EGL14.eglChooseConfig(eGLDisplay, f29497g, 0, eGLConfigArr, 0, 1, iArr, 0);
        if (!eglChooseConfig || iArr[0] <= 0 || eGLConfigArr[0] == null) {
            z10 = false;
        }
        C5961l.c(z10, N.G("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr[0]), eGLConfigArr[0]));
        return eGLConfigArr[0];
    }

    private static EGLContext b(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i10) {
        boolean z10 = true;
        EGLContext eglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, i10 == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        if (eglCreateContext == null) {
            z10 = false;
        }
        C5961l.c(z10, "eglCreateContext failed");
        return eglCreateContext;
    }

    private static EGLSurface c(EGLDisplay eGLDisplay, EGLConfig eGLConfig, EGLContext eGLContext, int i10) {
        EGLSurface eGLSurface;
        boolean z10 = true;
        if (i10 == 1) {
            eGLSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eGLSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i10 == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            if (eGLSurface == null) {
                z10 = false;
            }
            C5961l.c(z10, "eglCreatePbufferSurface failed");
        }
        C5961l.c(EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext), "eglMakeCurrent failed");
        return eGLSurface;
    }

    private void d() {
    }

    private static void e(int[] iArr) {
        GLES20.glGenTextures(1, iArr, 0);
        C5961l.b();
    }

    private static EGLDisplay f() {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        C5961l.c(eglGetDisplay != null, "eglGetDisplay failed");
        int[] iArr = new int[2];
        C5961l.c(EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1), "eglInitialize failed");
        return eglGetDisplay;
    }

    public SurfaceTexture g() {
        return (SurfaceTexture) C5950a.e(this.f29503f);
    }

    public void h(int i10) {
        EGLDisplay f10 = f();
        this.f29500c = f10;
        EGLConfig a10 = a(f10);
        EGLContext b10 = b(this.f29500c, a10, i10);
        this.f29501d = b10;
        this.f29502e = c(this.f29500c, a10, b10, i10);
        e(this.f29499b);
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f29499b[0]);
        this.f29503f = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
    }

    public void i() {
        this.f29498a.removeCallbacks(this);
        try {
            SurfaceTexture surfaceTexture = this.f29503f;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, this.f29499b, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = this.f29500c;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = this.f29500c;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = this.f29502e;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f29500c, this.f29502e);
            }
            EGLContext eGLContext = this.f29501d;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(this.f29500c, eGLContext);
            }
            EGL14.eglReleaseThread();
            EGLDisplay eGLDisplay3 = this.f29500c;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.f29500c);
            }
            this.f29500c = null;
            this.f29501d = null;
            this.f29502e = null;
            this.f29503f = null;
        }
    }

    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f29498a.post(this);
    }

    public void run() {
        d();
        SurfaceTexture surfaceTexture = this.f29503f;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }

    public C5959j(Handler handler, a aVar) {
        this.f29498a = handler;
        this.f29499b = new int[1];
    }
}
