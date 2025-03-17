package HL;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import java.lang.ref.WeakReference;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL10;
import org.maplibre.android.log.Logger;
import org.maplibre.android.maps.renderer.egl.a;

/* renamed from: HL.a  reason: case insensitive filesystem */
public class C15865a extends C15867c {

    /* renamed from: m  reason: collision with root package name */
    private final C3330a f135365m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f135366n;

    /* renamed from: HL.a$a  reason: collision with other inner class name */
    private static class C3330a {

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<TextureView> f135367a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f135368b;

        /* renamed from: c  reason: collision with root package name */
        private EGL10 f135369c;

        /* renamed from: d  reason: collision with root package name */
        private EGLConfig f135370d;

        /* renamed from: e  reason: collision with root package name */
        private EGLDisplay f135371e = EGL10.EGL_NO_DISPLAY;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public EGLContext f135372f = EGL10.EGL_NO_CONTEXT;
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public EGLSurface f135373g = EGL10.EGL_NO_SURFACE;

        C3330a(WeakReference<TextureView> weakReference, boolean z10) {
            this.f135367a = weakReference;
            this.f135368b = z10;
        }

        /* access modifiers changed from: private */
        public void h() {
            EGLContext eGLContext = this.f135372f;
            EGLContext eGLContext2 = EGL10.EGL_NO_CONTEXT;
            if (eGLContext != eGLContext2) {
                if (!this.f135369c.eglDestroyContext(this.f135371e, eGLContext)) {
                    Logger.w("Mbgl-TextureViewRenderThread", String.format("Could not destroy egl context. Display %s, Context %s", new Object[]{this.f135371e, this.f135372f}));
                }
                this.f135372f = eGLContext2;
            }
        }

        /* access modifiers changed from: private */
        public void i() {
            EGLSurface eGLSurface = this.f135373g;
            EGLSurface eGLSurface2 = EGL10.EGL_NO_SURFACE;
            if (eGLSurface != eGLSurface2) {
                if (!this.f135369c.eglDestroySurface(this.f135371e, eGLSurface)) {
                    Logger.w("Mbgl-TextureViewRenderThread", String.format("Could not destroy egl surface. Display %s, Surface %s", new Object[]{this.f135371e, this.f135373g}));
                }
                this.f135373g = eGLSurface2;
            }
        }

        private void m() {
            EGLDisplay eGLDisplay = this.f135371e;
            EGLDisplay eGLDisplay2 = EGL10.EGL_NO_DISPLAY;
            if (eGLDisplay != eGLDisplay2) {
                if (!this.f135369c.eglTerminate(eGLDisplay)) {
                    Logger.w("Mbgl-TextureViewRenderThread", String.format("Could not terminate egl. Display %s", new Object[]{this.f135371e}));
                }
                this.f135371e = eGLDisplay2;
            }
        }

        /* access modifiers changed from: package-private */
        public void e() {
            i();
            h();
            m();
        }

        /* access modifiers changed from: package-private */
        public GL10 f() {
            return (GL10) this.f135372f.getGL();
        }

        /* access modifiers changed from: package-private */
        public boolean g() {
            i();
            TextureView textureView = this.f135367a.get();
            if (textureView == null || textureView.getSurfaceTexture() == null) {
                this.f135373g = EGL10.EGL_NO_SURFACE;
            } else {
                this.f135373g = this.f135369c.eglCreateWindowSurface(this.f135371e, this.f135370d, textureView.getSurfaceTexture(), new int[]{12344});
            }
            EGLSurface eGLSurface = this.f135373g;
            if (eGLSurface != null && eGLSurface != EGL10.EGL_NO_SURFACE) {
                return j();
            }
            if (this.f135369c.eglGetError() != 12299) {
                return false;
            }
            Logger.e("Mbgl-TextureViewRenderThread", "createWindowSurface returned EGL_BAD_NATIVE_WINDOW.");
            return false;
        }

        /* access modifiers changed from: package-private */
        public boolean j() {
            EGL10 egl10 = this.f135369c;
            EGLDisplay eGLDisplay = this.f135371e;
            EGLSurface eGLSurface = this.f135373g;
            if (egl10.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.f135372f)) {
                return true;
            }
            Logger.w("Mbgl-TextureViewRenderThread", String.format("eglMakeCurrent: %s", new Object[]{Integer.valueOf(this.f135369c.eglGetError())}));
            return false;
        }

        /* access modifiers changed from: package-private */
        public void k() {
            EGL10 egl10 = (EGL10) EGLContext.getEGL();
            this.f135369c = egl10;
            EGLDisplay eGLDisplay = this.f135371e;
            EGLDisplay eGLDisplay2 = EGL10.EGL_NO_DISPLAY;
            if (eGLDisplay == eGLDisplay2) {
                EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
                this.f135371e = eglGetDisplay;
                if (eglGetDisplay != eGLDisplay2) {
                    if (!this.f135369c.eglInitialize(eglGetDisplay, new int[2])) {
                        throw new RuntimeException("eglInitialize failed");
                    }
                } else {
                    throw new RuntimeException("eglGetDisplay failed");
                }
            }
            if (this.f135367a == null) {
                this.f135370d = null;
                this.f135372f = EGL10.EGL_NO_CONTEXT;
            } else {
                EGLContext eGLContext = this.f135372f;
                EGLContext eGLContext2 = EGL10.EGL_NO_CONTEXT;
                if (eGLContext == eGLContext2) {
                    EGLConfig chooseConfig = new a(this.f135368b).chooseConfig(this.f135369c, this.f135371e);
                    this.f135370d = chooseConfig;
                    this.f135372f = this.f135369c.eglCreateContext(this.f135371e, chooseConfig, eGLContext2, new int[]{12440, 2, 12344});
                }
            }
            if (this.f135372f == EGL10.EGL_NO_CONTEXT) {
                throw new RuntimeException("createContext");
            }
        }

        /* access modifiers changed from: package-private */
        public int l() {
            if (!this.f135369c.eglSwapBuffers(this.f135371e, this.f135373g)) {
                return this.f135369c.eglGetError();
            }
            return 12288;
        }
    }

    public C15865a(TextureView textureView, C15866b bVar) {
        super(textureView, bVar);
        this.f135365m = new C3330a(new WeakReference(textureView), bVar.a());
    }

    public /* bridge */ /* synthetic */ void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        super.onSurfaceTextureAvailable(surfaceTexture, i10, i11);
    }

    public /* bridge */ /* synthetic */ boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        return super.onSurfaceTextureDestroyed(surfaceTexture);
    }

    public /* bridge */ /* synthetic */ void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        super.onSurfaceTextureSizeChanged(surfaceTexture, i10, i11);
    }

    public /* bridge */ /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        super.onSurfaceTextureUpdated(surfaceTexture);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:102:0x011c, code lost:
        org.maplibre.android.log.Logger.w("Mbgl-TextureViewRenderThread", "Context lost. Waiting for re-aquire");
        r1 = r9.f135378b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0125, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:?, code lost:
        r9.f135380d = null;
        r9.f135386j = true;
        r9.f135366n = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x012c, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0000, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0084, code lost:
        if (r2 == null) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        r2.run();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x008e, code lost:
        r9.f135365m.f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0093, code lost:
        if (r7 == false) goto L_0x00bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0095, code lost:
        r9.f135365m.k();
        r1 = r9.f135378b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x009c, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00a3, code lost:
        if (r9.f135365m.g() != false) goto L_0x00ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00a5, code lost:
        r9.f135386j = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00a7, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00ac, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:?, code lost:
        r9.f135377a.onSurfaceCreated((android.view.Surface) null);
        r9.f135377a.onSurfaceChanged(r3, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00bb, code lost:
        if (r8 == false) goto L_0x00d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00bd, code lost:
        r1 = r9.f135378b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00bf, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:?, code lost:
        r9.f135365m.g();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x00c5, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:?, code lost:
        r9.f135377a.onSurfaceChanged(r3, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x00d2, code lost:
        if (r9.f135384h == false) goto L_0x00dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x00d4, code lost:
        r9.f135377a.onSurfaceChanged(r3, r6);
        r9.f135384h = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x00e5, code lost:
        if (HL.C15865a.C3330a.b(r9.f135365m) != javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE) goto L_0x00e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x00e9, code lost:
        r9.f135377a.onDrawFrame();
        r1 = r9.f135365m.l();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x00f6, code lost:
        if (r1 == 12288) goto L_0x0000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x00fa, code lost:
        if (r1 == 12302) goto L_0x011c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x00fc, code lost:
        org.maplibre.android.log.Logger.w("Mbgl-TextureViewRenderThread", java.lang.String.format("eglSwapBuffer error: %s. Waiting or new surface", new java.lang.Object[]{java.lang.Integer.valueOf(r1)}));
        r1 = r9.f135378b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0111, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:?, code lost:
        r9.f135380d = null;
        r9.f135386j = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0116, code lost:
        monitor-exit(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r9 = this;
        L_0x0000:
            r0 = 1
            java.lang.Object r1 = r9.f135378b     // Catch:{ InterruptedException -> 0x014f, all -> 0x008b }
            monitor-enter(r1)     // Catch:{ InterruptedException -> 0x014f, all -> 0x008b }
        L_0x0004:
            boolean r2 = r9.f135387k     // Catch:{ all -> 0x001d }
            if (r2 == 0) goto L_0x0020
            monitor-exit(r1)     // Catch:{ all -> 0x001d }
            HL.a$a r1 = r9.f135365m
            r1.e()
            java.lang.Object r2 = r9.f135378b
            monitor-enter(r2)
            r9.f135388l = r0     // Catch:{ all -> 0x001a }
            java.lang.Object r0 = r9.f135378b     // Catch:{ all -> 0x001a }
            r0.notifyAll()     // Catch:{ all -> 0x001a }
            monitor-exit(r2)     // Catch:{ all -> 0x001a }
            return
        L_0x001a:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x001a }
            throw r0
        L_0x001d:
            r2 = move-exception
            goto L_0x0139
        L_0x0020:
            java.util.ArrayList<java.lang.Runnable> r2 = r9.f135379c     // Catch:{ all -> 0x001d }
            boolean r2 = r2.isEmpty()     // Catch:{ all -> 0x001d }
            r3 = -1
            r4 = 0
            r5 = 0
            if (r2 != 0) goto L_0x0037
            java.util.ArrayList<java.lang.Runnable> r2 = r9.f135379c     // Catch:{ all -> 0x001d }
            java.lang.Object r2 = r2.remove(r5)     // Catch:{ all -> 0x001d }
            java.lang.Runnable r2 = (java.lang.Runnable) r2     // Catch:{ all -> 0x001d }
            r6 = r3
        L_0x0034:
            r7 = r5
            r8 = r7
            goto L_0x0083
        L_0x0037:
            boolean r2 = r9.f135386j     // Catch:{ all -> 0x001d }
            if (r2 == 0) goto L_0x0043
            HL.a$a r2 = r9.f135365m     // Catch:{ all -> 0x001d }
            r2.i()     // Catch:{ all -> 0x001d }
            r9.f135386j = r5     // Catch:{ all -> 0x001d }
            goto L_0x004e
        L_0x0043:
            boolean r2 = r9.f135366n     // Catch:{ all -> 0x001d }
            if (r2 == 0) goto L_0x0051
            HL.a$a r2 = r9.f135365m     // Catch:{ all -> 0x001d }
            r2.h()     // Catch:{ all -> 0x001d }
            r9.f135366n = r5     // Catch:{ all -> 0x001d }
        L_0x004e:
            r6 = r3
        L_0x004f:
            r2 = r4
            goto L_0x0034
        L_0x0051:
            android.graphics.SurfaceTexture r2 = r9.f135380d     // Catch:{ all -> 0x001d }
            if (r2 == 0) goto L_0x0132
            boolean r2 = r9.f135385i     // Catch:{ all -> 0x001d }
            if (r2 != 0) goto L_0x0132
            boolean r2 = r9.f135383g     // Catch:{ all -> 0x001d }
            if (r2 == 0) goto L_0x0132
            int r3 = r9.f135381e     // Catch:{ all -> 0x001d }
            int r2 = r9.f135382f     // Catch:{ all -> 0x001d }
            HL.a$a r6 = r9.f135365m     // Catch:{ all -> 0x001d }
            javax.microedition.khronos.egl.EGLContext r6 = r6.f135372f     // Catch:{ all -> 0x001d }
            javax.microedition.khronos.egl.EGLContext r7 = javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT     // Catch:{ all -> 0x001d }
            if (r6 != r7) goto L_0x0070
            r7 = r0
            r6 = r2
            r2 = r4
            r8 = r5
            goto L_0x0083
        L_0x0070:
            HL.a$a r6 = r9.f135365m     // Catch:{ all -> 0x001d }
            javax.microedition.khronos.egl.EGLSurface r6 = r6.f135373g     // Catch:{ all -> 0x001d }
            javax.microedition.khronos.egl.EGLSurface r7 = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE     // Catch:{ all -> 0x001d }
            if (r6 != r7) goto L_0x007f
            r8 = r0
            r6 = r2
            r2 = r4
            r7 = r5
            goto L_0x0083
        L_0x007f:
            r9.f135383g = r5     // Catch:{ all -> 0x001d }
            r6 = r2
            goto L_0x004f
        L_0x0083:
            monitor-exit(r1)     // Catch:{ all -> 0x001d }
            if (r2 == 0) goto L_0x008e
            r2.run()     // Catch:{ InterruptedException -> 0x014f, all -> 0x008b }
            goto L_0x0000
        L_0x008b:
            r1 = move-exception
            goto L_0x013b
        L_0x008e:
            HL.a$a r1 = r9.f135365m     // Catch:{ InterruptedException -> 0x014f, all -> 0x008b }
            r1.f()     // Catch:{ InterruptedException -> 0x014f, all -> 0x008b }
            if (r7 == 0) goto L_0x00bb
            HL.a$a r1 = r9.f135365m     // Catch:{ InterruptedException -> 0x014f, all -> 0x008b }
            r1.k()     // Catch:{ InterruptedException -> 0x014f, all -> 0x008b }
            java.lang.Object r1 = r9.f135378b     // Catch:{ InterruptedException -> 0x014f, all -> 0x008b }
            monitor-enter(r1)     // Catch:{ InterruptedException -> 0x014f, all -> 0x008b }
            HL.a$a r2 = r9.f135365m     // Catch:{ all -> 0x00aa }
            boolean r2 = r2.g()     // Catch:{ all -> 0x00aa }
            if (r2 != 0) goto L_0x00ac
            r9.f135386j = r0     // Catch:{ all -> 0x00aa }
            monitor-exit(r1)     // Catch:{ all -> 0x00aa }
            goto L_0x0000
        L_0x00aa:
            r2 = move-exception
            goto L_0x00b9
        L_0x00ac:
            monitor-exit(r1)     // Catch:{ all -> 0x00aa }
            HL.b r1 = r9.f135377a     // Catch:{ InterruptedException -> 0x014f, all -> 0x008b }
            r1.onSurfaceCreated(r4)     // Catch:{ InterruptedException -> 0x014f, all -> 0x008b }
            HL.b r1 = r9.f135377a     // Catch:{ InterruptedException -> 0x014f, all -> 0x008b }
            r1.onSurfaceChanged(r3, r6)     // Catch:{ InterruptedException -> 0x014f, all -> 0x008b }
            goto L_0x0000
        L_0x00b9:
            monitor-exit(r1)     // Catch:{ all -> 0x00aa }
            throw r2     // Catch:{ InterruptedException -> 0x014f, all -> 0x008b }
        L_0x00bb:
            if (r8 == 0) goto L_0x00d0
            java.lang.Object r1 = r9.f135378b     // Catch:{ InterruptedException -> 0x014f, all -> 0x008b }
            monitor-enter(r1)     // Catch:{ InterruptedException -> 0x014f, all -> 0x008b }
            HL.a$a r2 = r9.f135365m     // Catch:{ all -> 0x00cd }
            r2.g()     // Catch:{ all -> 0x00cd }
            monitor-exit(r1)     // Catch:{ all -> 0x00cd }
            HL.b r1 = r9.f135377a     // Catch:{ InterruptedException -> 0x014f, all -> 0x008b }
            r1.onSurfaceChanged(r3, r6)     // Catch:{ InterruptedException -> 0x014f, all -> 0x008b }
            goto L_0x0000
        L_0x00cd:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00cd }
            throw r2     // Catch:{ InterruptedException -> 0x014f, all -> 0x008b }
        L_0x00d0:
            boolean r1 = r9.f135384h     // Catch:{ InterruptedException -> 0x014f, all -> 0x008b }
            if (r1 == 0) goto L_0x00dd
            HL.b r1 = r9.f135377a     // Catch:{ InterruptedException -> 0x014f, all -> 0x008b }
            r1.onSurfaceChanged(r3, r6)     // Catch:{ InterruptedException -> 0x014f, all -> 0x008b }
            r9.f135384h = r5     // Catch:{ InterruptedException -> 0x014f, all -> 0x008b }
            goto L_0x0000
        L_0x00dd:
            HL.a$a r1 = r9.f135365m     // Catch:{ InterruptedException -> 0x014f, all -> 0x008b }
            javax.microedition.khronos.egl.EGLSurface r1 = r1.f135373g     // Catch:{ InterruptedException -> 0x014f, all -> 0x008b }
            javax.microedition.khronos.egl.EGLSurface r2 = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE     // Catch:{ InterruptedException -> 0x014f, all -> 0x008b }
            if (r1 != r2) goto L_0x00e9
            goto L_0x0000
        L_0x00e9:
            HL.b r1 = r9.f135377a     // Catch:{ InterruptedException -> 0x014f, all -> 0x008b }
            r1.onDrawFrame()     // Catch:{ InterruptedException -> 0x014f, all -> 0x008b }
            HL.a$a r1 = r9.f135365m     // Catch:{ InterruptedException -> 0x014f, all -> 0x008b }
            int r1 = r1.l()     // Catch:{ InterruptedException -> 0x014f, all -> 0x008b }
            r2 = 12288(0x3000, float:1.7219E-41)
            if (r1 == r2) goto L_0x0000
            r2 = 12302(0x300e, float:1.7239E-41)
            if (r1 == r2) goto L_0x011c
            java.lang.String r2 = "Mbgl-TextureViewRenderThread"
            java.lang.String r3 = "eglSwapBuffer error: %s. Waiting or new surface"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ InterruptedException -> 0x014f, all -> 0x008b }
            java.lang.Object[] r1 = new java.lang.Object[]{r1}     // Catch:{ InterruptedException -> 0x014f, all -> 0x008b }
            java.lang.String r1 = java.lang.String.format(r3, r1)     // Catch:{ InterruptedException -> 0x014f, all -> 0x008b }
            org.maplibre.android.log.Logger.w(r2, r1)     // Catch:{ InterruptedException -> 0x014f, all -> 0x008b }
            java.lang.Object r1 = r9.f135378b     // Catch:{ InterruptedException -> 0x014f, all -> 0x008b }
            monitor-enter(r1)     // Catch:{ InterruptedException -> 0x014f, all -> 0x008b }
            r9.f135380d = r4     // Catch:{ all -> 0x0119 }
            r9.f135386j = r0     // Catch:{ all -> 0x0119 }
            monitor-exit(r1)     // Catch:{ all -> 0x0119 }
            goto L_0x0000
        L_0x0119:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0119 }
            throw r2     // Catch:{ InterruptedException -> 0x014f, all -> 0x008b }
        L_0x011c:
            java.lang.String r1 = "Mbgl-TextureViewRenderThread"
            java.lang.String r2 = "Context lost. Waiting for re-aquire"
            org.maplibre.android.log.Logger.w(r1, r2)     // Catch:{ InterruptedException -> 0x014f, all -> 0x008b }
            java.lang.Object r1 = r9.f135378b     // Catch:{ InterruptedException -> 0x014f, all -> 0x008b }
            monitor-enter(r1)     // Catch:{ InterruptedException -> 0x014f, all -> 0x008b }
            r9.f135380d = r4     // Catch:{ all -> 0x012f }
            r9.f135386j = r0     // Catch:{ all -> 0x012f }
            r9.f135366n = r0     // Catch:{ all -> 0x012f }
            monitor-exit(r1)     // Catch:{ all -> 0x012f }
            goto L_0x0000
        L_0x012f:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x012f }
            throw r2     // Catch:{ InterruptedException -> 0x014f, all -> 0x008b }
        L_0x0132:
            java.lang.Object r2 = r9.f135378b     // Catch:{ all -> 0x001d }
            r2.wait()     // Catch:{ all -> 0x001d }
            goto L_0x0004
        L_0x0139:
            monitor-exit(r1)     // Catch:{ all -> 0x001d }
            throw r2     // Catch:{ InterruptedException -> 0x014f, all -> 0x008b }
        L_0x013b:
            HL.a$a r2 = r9.f135365m
            r2.e()
            java.lang.Object r2 = r9.f135378b
            monitor-enter(r2)
            r9.f135388l = r0     // Catch:{ all -> 0x014c }
            java.lang.Object r0 = r9.f135378b     // Catch:{ all -> 0x014c }
            r0.notifyAll()     // Catch:{ all -> 0x014c }
            monitor-exit(r2)     // Catch:{ all -> 0x014c }
            throw r1
        L_0x014c:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x014c }
            throw r0
        L_0x014f:
            HL.a$a r1 = r9.f135365m
            r1.e()
            java.lang.Object r1 = r9.f135378b
            monitor-enter(r1)
            r9.f135388l = r0     // Catch:{ all -> 0x0160 }
            java.lang.Object r0 = r9.f135378b     // Catch:{ all -> 0x0160 }
            r0.notifyAll()     // Catch:{ all -> 0x0160 }
            monitor-exit(r1)     // Catch:{ all -> 0x0160 }
            return
        L_0x0160:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0160 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: HL.C15865a.run():void");
    }
}
