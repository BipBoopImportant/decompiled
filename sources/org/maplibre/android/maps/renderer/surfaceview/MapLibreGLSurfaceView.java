package org.maplibre.android.maps.renderer.surfaceview;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.util.Log;
import java.lang.ref.WeakReference;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL;
import org.maplibre.android.maps.renderer.egl.c;
import org.maplibre.android.maps.renderer.surfaceview.MapLibreSurfaceView;

public class MapLibreGLSurfaceView extends MapLibreSurfaceView {

    /* renamed from: f  reason: collision with root package name */
    protected final WeakReference<MapLibreGLSurfaceView> f145993f = new WeakReference<>(this);
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public GLSurfaceView.EGLConfigChooser f145994g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public GLSurfaceView.EGLContextFactory f145995h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public GLSurfaceView.EGLWindowSurfaceFactory f145996i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public boolean f145997j;

    private static class a {

        /* renamed from: a  reason: collision with root package name */
        private WeakReference<MapLibreGLSurfaceView> f145998a;

        /* renamed from: b  reason: collision with root package name */
        EGL10 f145999b;

        /* renamed from: c  reason: collision with root package name */
        EGLDisplay f146000c;

        /* renamed from: d  reason: collision with root package name */
        EGLSurface f146001d;

        /* renamed from: e  reason: collision with root package name */
        EGLConfig f146002e;

        /* renamed from: f  reason: collision with root package name */
        EGLContext f146003f;

        private void d() {
            EGLSurface eGLSurface;
            EGLSurface eGLSurface2 = this.f146001d;
            if (eGLSurface2 != null && eGLSurface2 != (eGLSurface = EGL10.EGL_NO_SURFACE)) {
                this.f145999b.eglMakeCurrent(this.f146000c, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
                MapLibreGLSurfaceView mapLibreGLSurfaceView = this.f145998a.get();
                if (mapLibreGLSurfaceView != null) {
                    mapLibreGLSurfaceView.f145996i.destroySurface(this.f145999b, this.f146000c, this.f146001d);
                }
                this.f146001d = null;
            }
        }

        static String f(String str, int i10) {
            return str + " failed: " + c.a(i10);
        }

        static void g(String str, String str2, int i10) {
            Log.w(str, f(str2, i10));
        }

        /* access modifiers changed from: package-private */
        public GL a() {
            return this.f146003f.getGL();
        }

        /* access modifiers changed from: package-private */
        public boolean b() {
            if (this.f145999b == null) {
                Log.e("MapLibreSurfaceView", "egl not initialized");
                return false;
            } else if (this.f146000c == null) {
                Log.e("MapLibreSurfaceView", "eglDisplay not initialized");
                return false;
            } else if (this.f146002e == null) {
                Log.e("MapLibreSurfaceView", "mEglConfig not initialized");
                return false;
            } else {
                d();
                MapLibreGLSurfaceView mapLibreGLSurfaceView = this.f145998a.get();
                if (mapLibreGLSurfaceView != null) {
                    this.f146001d = mapLibreGLSurfaceView.f145996i.createWindowSurface(this.f145999b, this.f146000c, this.f146002e, mapLibreGLSurfaceView.getHolder());
                } else {
                    this.f146001d = null;
                }
                EGLSurface eGLSurface = this.f146001d;
                if (eGLSurface == null || eGLSurface == EGL10.EGL_NO_SURFACE) {
                    if (this.f145999b.eglGetError() == 12299) {
                        Log.e("MapLibreSurfaceView", "createWindowSurface returned EGL_BAD_NATIVE_WINDOW.");
                    }
                    return false;
                } else if (this.f145999b.eglMakeCurrent(this.f146000c, eGLSurface, eGLSurface, this.f146003f)) {
                    return true;
                } else {
                    g("MapLibreSurfaceView", "eglMakeCurrent", this.f145999b.eglGetError());
                    return false;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void c() {
            d();
        }

        public void e() {
            if (this.f146003f != null) {
                MapLibreGLSurfaceView mapLibreGLSurfaceView = this.f145998a.get();
                if (mapLibreGLSurfaceView != null) {
                    mapLibreGLSurfaceView.f145995h.destroyContext(this.f145999b, this.f146000c, this.f146003f);
                }
                this.f146003f = null;
            }
            EGLDisplay eGLDisplay = this.f146000c;
            if (eGLDisplay != null) {
                this.f145999b.eglTerminate(eGLDisplay);
                this.f146000c = null;
            }
        }

        public void h() {
            try {
                EGL10 egl10 = (EGL10) EGLContext.getEGL();
                this.f145999b = egl10;
                EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
                this.f146000c = eglGetDisplay;
                if (eglGetDisplay == EGL10.EGL_NO_DISPLAY) {
                    Log.e("MapLibreSurfaceView", "eglGetDisplay failed");
                    return;
                }
                if (!this.f145999b.eglInitialize(eglGetDisplay, new int[2])) {
                    Log.e("MapLibreSurfaceView", "eglInitialize failed");
                    return;
                }
                MapLibreGLSurfaceView mapLibreGLSurfaceView = this.f145998a.get();
                if (mapLibreGLSurfaceView == null) {
                    this.f146002e = null;
                    this.f146003f = null;
                } else {
                    EGLConfig chooseConfig = mapLibreGLSurfaceView.f145994g.chooseConfig(this.f145999b, this.f146000c);
                    this.f146002e = chooseConfig;
                    if (chooseConfig == null) {
                        Log.e("MapLibreSurfaceView", "failed to select an EGL configuration");
                        return;
                    }
                    this.f146003f = mapLibreGLSurfaceView.f145995h.createContext(this.f145999b, this.f146000c, this.f146002e);
                }
                EGLContext eGLContext = this.f146003f;
                if (eGLContext == null || eGLContext == EGL10.EGL_NO_CONTEXT) {
                    this.f146003f = null;
                    Log.e("MapLibreSurfaceView", "createContext failed");
                    return;
                }
                this.f146001d = null;
            } catch (Exception e10) {
                Log.e("MapLibreSurfaceView", "createContext failed: ", e10);
            }
        }

        public int i() {
            if (!this.f145999b.eglSwapBuffers(this.f146000c, this.f146001d)) {
                return this.f145999b.eglGetError();
            }
            return 12288;
        }

        private a(WeakReference<MapLibreGLSurfaceView> weakReference) {
            this.f145998a = weakReference;
        }
    }

    static class b extends MapLibreSurfaceView.b {

        /* renamed from: q  reason: collision with root package name */
        private boolean f146004q;

        /* renamed from: r  reason: collision with root package name */
        private boolean f146005r;

        /* renamed from: s  reason: collision with root package name */
        private boolean f146006s;

        /* renamed from: t  reason: collision with root package name */
        private boolean f146007t;

        /* renamed from: u  reason: collision with root package name */
        private boolean f146008u;

        /* renamed from: v  reason: collision with root package name */
        private a f146009v;

        /* renamed from: w  reason: collision with root package name */
        protected WeakReference<MapLibreGLSurfaceView> f146010w;

        b(WeakReference<MapLibreGLSurfaceView> weakReference) {
            super(weakReference.get().f146011a);
            this.f146010w = weakReference;
        }

        private void p() {
            if (this.f146005r) {
                this.f146009v.e();
                this.f146005r = false;
                this.f146031p.notifyAll();
            }
        }

        private void q() {
            if (this.f146006s) {
                this.f146006s = false;
                this.f146009v.c();
            }
        }

        public boolean a() {
            return this.f146005r && this.f146006s && h();
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Code restructure failed: missing block: B:101:0x0139, code lost:
            if (r14 == null) goto L_0x0145;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:103:?, code lost:
            r14.run();
            r14 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:106:0x0145, code lost:
            if (r8 == false) goto L_0x0174;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:108:0x014d, code lost:
            if (r1.f146009v.b() == false) goto L_0x0160;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:109:0x014f, code lost:
            r3 = r1.f146031p;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:110:0x0151, code lost:
            monitor-enter(r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:113:?, code lost:
            r1.f146007t = true;
            r1.f146031p.notifyAll();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:114:0x015a, code lost:
            monitor-exit(r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:115:0x015b, code lost:
            r8 = r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:120:0x0160, code lost:
            r3 = r1.f146031p;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:121:0x0162, code lost:
            monitor-enter(r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:124:?, code lost:
            r1.f146007t = true;
            r1.f146004q = true;
            r1.f146031p.notifyAll();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:125:0x016d, code lost:
            monitor-exit(r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:131:0x0174, code lost:
            if (r9 == false) goto L_0x017f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:132:0x0176, code lost:
            r3 = (javax.microedition.khronos.opengles.GL10) r1.f146009v.a();
            r9 = r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:133:0x017f, code lost:
            if (r7 == false) goto L_0x0195;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:134:0x0181, code lost:
            r3 = r1.f146010w.get();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:135:0x0189, code lost:
            if (r3 == null) goto L_0x0192;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:136:0x018b, code lost:
            r15 = null;
            r3.f146012b.onSurfaceCreated((android.view.Surface) null);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:137:0x0192, code lost:
            r15 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:138:0x0193, code lost:
            r7 = r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:139:0x0195, code lost:
            r15 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:140:0x0196, code lost:
            if (r10 == false) goto L_0x01a8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:141:0x0198, code lost:
            r3 = r1.f146010w.get();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:142:0x01a0, code lost:
            if (r3 == null) goto L_0x01a7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:143:0x01a2, code lost:
            r3.f146012b.onSurfaceChanged(r12, r13);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:144:0x01a7, code lost:
            r10 = r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:145:0x01a8, code lost:
            r3 = r1.f146010w.get();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:146:0x01b0, code lost:
            if (r3 == null) goto L_0x01bd;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:147:0x01b2, code lost:
            r3.f146012b.onDrawFrame();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:148:0x01b7, code lost:
            if (r6 == null) goto L_0x01bd;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:149:0x01b9, code lost:
            r6.run();
            r6 = r15;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:150:0x01bd, code lost:
            r3 = r1.f146009v.i();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:151:0x01c5, code lost:
            if (r3 == 12288) goto L_0x01e5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:153:0x01c9, code lost:
            if (r3 == 12302) goto L_0x01e2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:154:0x01cb, code lost:
            org.maplibre.android.maps.renderer.surfaceview.MapLibreGLSurfaceView.a.g("MapLibreSurfaceView", "eglSwapBuffers", r3);
            r3 = r1.f146031p;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:155:0x01d4, code lost:
            monitor-enter(r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:156:0x01d5, code lost:
            r0 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:158:?, code lost:
            r1.f146004q = true;
            r1.f146031p.notifyAll();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:159:0x01dd, code lost:
            monitor-exit(r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:165:0x01e2, code lost:
            r0 = true;
            r2 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:166:0x01e5, code lost:
            r0 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:167:0x01e6, code lost:
            if (r11 == false) goto L_0x01ea;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:168:0x01e8, code lost:
            r4 = r0;
            r11 = false;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void c() {
            /*
                r16 = this;
                r1 = r16
                org.maplibre.android.maps.renderer.surfaceview.MapLibreGLSurfaceView$a r0 = new org.maplibre.android.maps.renderer.surfaceview.MapLibreGLSurfaceView$a
                java.lang.ref.WeakReference<org.maplibre.android.maps.renderer.surfaceview.MapLibreGLSurfaceView> r2 = r1.f146010w
                r3 = 0
                r0.<init>(r2)
                r1.f146009v = r0
                r0 = 0
                r1.f146005r = r0
                r1.f146006s = r0
                r1.f146026k = r0
                r2 = r0
                r4 = r2
                r5 = r4
                r7 = r5
                r8 = r7
                r9 = r8
                r10 = r9
                r11 = r10
                r12 = r11
                r13 = r12
                r6 = r3
                r14 = r6
            L_0x001f:
                org.maplibre.android.maps.renderer.surfaceview.MapLibreSurfaceView$c r15 = r1.f146031p     // Catch:{ all -> 0x0142 }
                monitor-enter(r15)     // Catch:{ all -> 0x0142 }
            L_0x0022:
                boolean r3 = r1.f146016a     // Catch:{ all -> 0x0035 }
                if (r3 == 0) goto L_0x0038
                monitor-exit(r15)     // Catch:{ all -> 0x0035 }
                org.maplibre.android.maps.renderer.surfaceview.MapLibreSurfaceView$c r2 = r1.f146031p
                monitor-enter(r2)
                r16.q()     // Catch:{ all -> 0x0032 }
                r16.p()     // Catch:{ all -> 0x0032 }
                monitor-exit(r2)     // Catch:{ all -> 0x0032 }
                return
            L_0x0032:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x0032 }
                throw r0
            L_0x0035:
                r0 = move-exception
                goto L_0x0202
            L_0x0038:
                java.util.ArrayList<java.lang.Runnable> r3 = r1.f146028m     // Catch:{ all -> 0x0035 }
                boolean r3 = r3.isEmpty()     // Catch:{ all -> 0x0035 }
                if (r3 != 0) goto L_0x004d
                java.util.ArrayList<java.lang.Runnable> r3 = r1.f146028m     // Catch:{ all -> 0x0035 }
                r14 = 0
                java.lang.Object r3 = r3.remove(r14)     // Catch:{ all -> 0x0035 }
                r14 = r3
                java.lang.Runnable r14 = (java.lang.Runnable) r14     // Catch:{ all -> 0x0035 }
                r0 = 0
                goto L_0x0138
            L_0x004d:
                boolean r3 = r1.f146019d     // Catch:{ all -> 0x0035 }
                boolean r0 = r1.f146018c     // Catch:{ all -> 0x0035 }
                if (r3 == r0) goto L_0x005b
                r1.f146019d = r0     // Catch:{ all -> 0x0035 }
                org.maplibre.android.maps.renderer.surfaceview.MapLibreSurfaceView$c r3 = r1.f146031p     // Catch:{ all -> 0x0035 }
                r3.notifyAll()     // Catch:{ all -> 0x0035 }
                goto L_0x005c
            L_0x005b:
                r0 = 0
            L_0x005c:
                boolean r3 = r1.f146008u     // Catch:{ all -> 0x0035 }
                if (r3 == 0) goto L_0x006a
                r16.q()     // Catch:{ all -> 0x0035 }
                r16.p()     // Catch:{ all -> 0x0035 }
                r3 = 0
                r1.f146008u = r3     // Catch:{ all -> 0x0035 }
                r5 = 1
            L_0x006a:
                if (r2 == 0) goto L_0x0073
                r16.q()     // Catch:{ all -> 0x0035 }
                r16.p()     // Catch:{ all -> 0x0035 }
                r2 = 0
            L_0x0073:
                if (r0 == 0) goto L_0x007c
                boolean r3 = r1.f146006s     // Catch:{ all -> 0x0035 }
                if (r3 == 0) goto L_0x007c
                r16.q()     // Catch:{ all -> 0x0035 }
            L_0x007c:
                if (r0 == 0) goto L_0x0096
                boolean r0 = r1.f146005r     // Catch:{ all -> 0x0035 }
                if (r0 == 0) goto L_0x0096
                java.lang.ref.WeakReference<org.maplibre.android.maps.renderer.surfaceview.MapLibreGLSurfaceView> r0 = r1.f146010w     // Catch:{ all -> 0x0035 }
                java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0035 }
                org.maplibre.android.maps.renderer.surfaceview.MapLibreGLSurfaceView r0 = (org.maplibre.android.maps.renderer.surfaceview.MapLibreGLSurfaceView) r0     // Catch:{ all -> 0x0035 }
                if (r0 == 0) goto L_0x0093
                boolean r0 = r0.f145997j     // Catch:{ all -> 0x0035 }
                if (r0 == 0) goto L_0x0093
                goto L_0x0096
            L_0x0093:
                r16.p()     // Catch:{ all -> 0x0035 }
            L_0x0096:
                boolean r0 = r1.f146020e     // Catch:{ all -> 0x0035 }
                if (r0 != 0) goto L_0x00b0
                boolean r0 = r1.f146021f     // Catch:{ all -> 0x0035 }
                if (r0 != 0) goto L_0x00b0
                boolean r0 = r1.f146006s     // Catch:{ all -> 0x0035 }
                if (r0 == 0) goto L_0x00a5
                r16.q()     // Catch:{ all -> 0x0035 }
            L_0x00a5:
                r0 = 1
                r1.f146021f = r0     // Catch:{ all -> 0x0035 }
                r0 = 0
                r1.f146004q = r0     // Catch:{ all -> 0x0035 }
                org.maplibre.android.maps.renderer.surfaceview.MapLibreSurfaceView$c r0 = r1.f146031p     // Catch:{ all -> 0x0035 }
                r0.notifyAll()     // Catch:{ all -> 0x0035 }
            L_0x00b0:
                boolean r0 = r1.f146020e     // Catch:{ all -> 0x0035 }
                if (r0 == 0) goto L_0x00c0
                boolean r0 = r1.f146021f     // Catch:{ all -> 0x0035 }
                if (r0 == 0) goto L_0x00c0
                r0 = 0
                r1.f146021f = r0     // Catch:{ all -> 0x0035 }
                org.maplibre.android.maps.renderer.surfaceview.MapLibreSurfaceView$c r0 = r1.f146031p     // Catch:{ all -> 0x0035 }
                r0.notifyAll()     // Catch:{ all -> 0x0035 }
            L_0x00c0:
                if (r4 == 0) goto L_0x00ce
                r0 = 0
                r1.f146026k = r0     // Catch:{ all -> 0x0035 }
                r0 = 1
                r1.f146027l = r0     // Catch:{ all -> 0x0035 }
                org.maplibre.android.maps.renderer.surfaceview.MapLibreSurfaceView$c r0 = r1.f146031p     // Catch:{ all -> 0x0035 }
                r0.notifyAll()     // Catch:{ all -> 0x0035 }
                r4 = 0
            L_0x00ce:
                java.lang.Runnable r0 = r1.f146030o     // Catch:{ all -> 0x0035 }
                if (r0 == 0) goto L_0x00d6
                r3 = 0
                r1.f146030o = r3     // Catch:{ all -> 0x0035 }
                r6 = r0
            L_0x00d6:
                boolean r0 = r16.h()     // Catch:{ all -> 0x0035 }
                if (r0 == 0) goto L_0x01ec
                boolean r0 = r1.f146005r     // Catch:{ all -> 0x0035 }
                if (r0 != 0) goto L_0x0107
                if (r5 == 0) goto L_0x00e4
                r5 = 0
                goto L_0x0107
            L_0x00e4:
                org.maplibre.android.maps.renderer.surfaceview.MapLibreGLSurfaceView$a r0 = r1.f146009v     // Catch:{ RuntimeException -> 0x00f3 }
                r0.h()     // Catch:{ RuntimeException -> 0x00f3 }
                r0 = 1
                r1.f146005r = r0     // Catch:{ all -> 0x0035 }
                org.maplibre.android.maps.renderer.surfaceview.MapLibreSurfaceView$c r0 = r1.f146031p     // Catch:{ all -> 0x0035 }
                r0.notifyAll()     // Catch:{ all -> 0x0035 }
                r7 = 1
                goto L_0x0107
            L_0x00f3:
                org.maplibre.android.maps.renderer.surfaceview.MapLibreSurfaceView$c r0 = r1.f146031p     // Catch:{ all -> 0x0035 }
                r0.notifyAll()     // Catch:{ all -> 0x0035 }
                monitor-exit(r15)     // Catch:{ all -> 0x0035 }
                org.maplibre.android.maps.renderer.surfaceview.MapLibreSurfaceView$c r2 = r1.f146031p
                monitor-enter(r2)
                r16.q()     // Catch:{ all -> 0x0104 }
                r16.p()     // Catch:{ all -> 0x0104 }
                monitor-exit(r2)     // Catch:{ all -> 0x0104 }
                return
            L_0x0104:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x0104 }
                throw r0
            L_0x0107:
                boolean r0 = r1.f146005r     // Catch:{ all -> 0x0035 }
                if (r0 == 0) goto L_0x0115
                boolean r0 = r1.f146006s     // Catch:{ all -> 0x0035 }
                if (r0 != 0) goto L_0x0115
                r0 = 1
                r1.f146006s = r0     // Catch:{ all -> 0x0035 }
                r8 = 1
                r9 = 1
                r10 = 1
            L_0x0115:
                boolean r0 = r1.f146006s     // Catch:{ all -> 0x0035 }
                if (r0 == 0) goto L_0x01fa
                boolean r0 = r1.f146029n     // Catch:{ all -> 0x0035 }
                if (r0 == 0) goto L_0x012b
                int r12 = r1.f146022g     // Catch:{ all -> 0x0035 }
                int r13 = r1.f146023h     // Catch:{ all -> 0x0035 }
                r0 = 1
                r1.f146026k = r0     // Catch:{ all -> 0x0035 }
                r0 = 0
                r1.f146029n = r0     // Catch:{ all -> 0x0035 }
                r0 = 0
                r8 = 1
                r10 = 1
                goto L_0x012c
            L_0x012b:
                r0 = 0
            L_0x012c:
                r1.f146025j = r0     // Catch:{ all -> 0x0035 }
                org.maplibre.android.maps.renderer.surfaceview.MapLibreSurfaceView$c r3 = r1.f146031p     // Catch:{ all -> 0x0035 }
                r3.notifyAll()     // Catch:{ all -> 0x0035 }
                boolean r3 = r1.f146026k     // Catch:{ all -> 0x0035 }
                if (r3 == 0) goto L_0x0138
                r11 = 1
            L_0x0138:
                monitor-exit(r15)     // Catch:{ all -> 0x0035 }
                if (r14 == 0) goto L_0x0145
                r14.run()     // Catch:{ all -> 0x0142 }
                r3 = 0
                r14 = 0
                goto L_0x001f
            L_0x0142:
                r0 = move-exception
                goto L_0x0204
            L_0x0145:
                if (r8 == 0) goto L_0x0174
                org.maplibre.android.maps.renderer.surfaceview.MapLibreGLSurfaceView$a r3 = r1.f146009v     // Catch:{ all -> 0x0142 }
                boolean r3 = r3.b()     // Catch:{ all -> 0x0142 }
                if (r3 == 0) goto L_0x0160
                org.maplibre.android.maps.renderer.surfaceview.MapLibreSurfaceView$c r3 = r1.f146031p     // Catch:{ all -> 0x0142 }
                monitor-enter(r3)     // Catch:{ all -> 0x0142 }
                r8 = 1
                r1.f146007t = r8     // Catch:{ all -> 0x015d }
                org.maplibre.android.maps.renderer.surfaceview.MapLibreSurfaceView$c r8 = r1.f146031p     // Catch:{ all -> 0x015d }
                r8.notifyAll()     // Catch:{ all -> 0x015d }
                monitor-exit(r3)     // Catch:{ all -> 0x015d }
                r8 = r0
                goto L_0x0174
            L_0x015d:
                r0 = move-exception
                monitor-exit(r3)     // Catch:{ all -> 0x015d }
                throw r0     // Catch:{ all -> 0x0142 }
            L_0x0160:
                org.maplibre.android.maps.renderer.surfaceview.MapLibreSurfaceView$c r3 = r1.f146031p     // Catch:{ all -> 0x0142 }
                monitor-enter(r3)     // Catch:{ all -> 0x0142 }
                r15 = 1
                r1.f146007t = r15     // Catch:{ all -> 0x0171 }
                r1.f146004q = r15     // Catch:{ all -> 0x0171 }
                org.maplibre.android.maps.renderer.surfaceview.MapLibreSurfaceView$c r15 = r1.f146031p     // Catch:{ all -> 0x0171 }
                r15.notifyAll()     // Catch:{ all -> 0x0171 }
                monitor-exit(r3)     // Catch:{ all -> 0x0171 }
            L_0x016e:
                r3 = 0
                goto L_0x001f
            L_0x0171:
                r0 = move-exception
                monitor-exit(r3)     // Catch:{ all -> 0x0171 }
                throw r0     // Catch:{ all -> 0x0142 }
            L_0x0174:
                if (r9 == 0) goto L_0x017f
                org.maplibre.android.maps.renderer.surfaceview.MapLibreGLSurfaceView$a r3 = r1.f146009v     // Catch:{ all -> 0x0142 }
                javax.microedition.khronos.opengles.GL r3 = r3.a()     // Catch:{ all -> 0x0142 }
                javax.microedition.khronos.opengles.GL10 r3 = (javax.microedition.khronos.opengles.GL10) r3     // Catch:{ all -> 0x0142 }
                r9 = r0
            L_0x017f:
                if (r7 == 0) goto L_0x0195
                java.lang.ref.WeakReference<org.maplibre.android.maps.renderer.surfaceview.MapLibreGLSurfaceView> r3 = r1.f146010w     // Catch:{ all -> 0x0142 }
                java.lang.Object r3 = r3.get()     // Catch:{ all -> 0x0142 }
                org.maplibre.android.maps.renderer.surfaceview.MapLibreSurfaceView r3 = (org.maplibre.android.maps.renderer.surfaceview.MapLibreSurfaceView) r3     // Catch:{ all -> 0x0142 }
                if (r3 == 0) goto L_0x0192
                org.maplibre.android.maps.renderer.surfaceview.a r3 = r3.f146012b     // Catch:{ all -> 0x0142 }
                r15 = 0
                r3.onSurfaceCreated(r15)     // Catch:{ all -> 0x0142 }
                goto L_0x0193
            L_0x0192:
                r15 = 0
            L_0x0193:
                r7 = r0
                goto L_0x0196
            L_0x0195:
                r15 = 0
            L_0x0196:
                if (r10 == 0) goto L_0x01a8
                java.lang.ref.WeakReference<org.maplibre.android.maps.renderer.surfaceview.MapLibreGLSurfaceView> r3 = r1.f146010w     // Catch:{ all -> 0x0142 }
                java.lang.Object r3 = r3.get()     // Catch:{ all -> 0x0142 }
                org.maplibre.android.maps.renderer.surfaceview.MapLibreSurfaceView r3 = (org.maplibre.android.maps.renderer.surfaceview.MapLibreSurfaceView) r3     // Catch:{ all -> 0x0142 }
                if (r3 == 0) goto L_0x01a7
                org.maplibre.android.maps.renderer.surfaceview.a r3 = r3.f146012b     // Catch:{ all -> 0x0142 }
                r3.onSurfaceChanged(r12, r13)     // Catch:{ all -> 0x0142 }
            L_0x01a7:
                r10 = r0
            L_0x01a8:
                java.lang.ref.WeakReference<org.maplibre.android.maps.renderer.surfaceview.MapLibreGLSurfaceView> r3 = r1.f146010w     // Catch:{ all -> 0x0142 }
                java.lang.Object r3 = r3.get()     // Catch:{ all -> 0x0142 }
                org.maplibre.android.maps.renderer.surfaceview.MapLibreSurfaceView r3 = (org.maplibre.android.maps.renderer.surfaceview.MapLibreSurfaceView) r3     // Catch:{ all -> 0x0142 }
                if (r3 == 0) goto L_0x01bd
                org.maplibre.android.maps.renderer.surfaceview.a r3 = r3.f146012b     // Catch:{ all -> 0x0142 }
                r3.onDrawFrame()     // Catch:{ all -> 0x0142 }
                if (r6 == 0) goto L_0x01bd
                r6.run()     // Catch:{ all -> 0x0142 }
                r6 = r15
            L_0x01bd:
                org.maplibre.android.maps.renderer.surfaceview.MapLibreGLSurfaceView$a r3 = r1.f146009v     // Catch:{ all -> 0x0142 }
                int r3 = r3.i()     // Catch:{ all -> 0x0142 }
                r0 = 12288(0x3000, float:1.7219E-41)
                if (r3 == r0) goto L_0x01e5
                r0 = 12302(0x300e, float:1.7239E-41)
                if (r3 == r0) goto L_0x01e2
                java.lang.String r0 = "MapLibreSurfaceView"
                java.lang.String r15 = "eglSwapBuffers"
                org.maplibre.android.maps.renderer.surfaceview.MapLibreGLSurfaceView.a.g(r0, r15, r3)     // Catch:{ all -> 0x0142 }
                org.maplibre.android.maps.renderer.surfaceview.MapLibreSurfaceView$c r3 = r1.f146031p     // Catch:{ all -> 0x0142 }
                monitor-enter(r3)     // Catch:{ all -> 0x0142 }
                r0 = 1
                r1.f146004q = r0     // Catch:{ all -> 0x01df }
                org.maplibre.android.maps.renderer.surfaceview.MapLibreSurfaceView$c r15 = r1.f146031p     // Catch:{ all -> 0x01df }
                r15.notifyAll()     // Catch:{ all -> 0x01df }
                monitor-exit(r3)     // Catch:{ all -> 0x01df }
                goto L_0x01e6
            L_0x01df:
                r0 = move-exception
                monitor-exit(r3)     // Catch:{ all -> 0x01df }
                throw r0     // Catch:{ all -> 0x0142 }
            L_0x01e2:
                r0 = 1
                r2 = r0
                goto L_0x01e6
            L_0x01e5:
                r0 = 1
            L_0x01e6:
                if (r11 == 0) goto L_0x01ea
                r4 = r0
                r11 = 0
            L_0x01ea:
                r0 = 0
                goto L_0x016e
            L_0x01ec:
                r0 = 0
                if (r6 == 0) goto L_0x01fa
                java.lang.String r3 = "MapLibreSurfaceView"
                java.lang.String r0 = "Warning, !readyToDraw() but waiting for draw finished! Early reporting draw finished."
                android.util.Log.w(r3, r0)     // Catch:{ all -> 0x0035 }
                r6.run()     // Catch:{ all -> 0x0035 }
                r6 = 0
            L_0x01fa:
                org.maplibre.android.maps.renderer.surfaceview.MapLibreSurfaceView$c r0 = r1.f146031p     // Catch:{ all -> 0x0035 }
                r0.wait()     // Catch:{ all -> 0x0035 }
                r0 = 0
                goto L_0x0022
            L_0x0202:
                monitor-exit(r15)     // Catch:{ all -> 0x0035 }
                throw r0     // Catch:{ all -> 0x0142 }
            L_0x0204:
                org.maplibre.android.maps.renderer.surfaceview.MapLibreSurfaceView$c r2 = r1.f146031p
                monitor-enter(r2)
                r16.q()     // Catch:{ all -> 0x020f }
                r16.p()     // Catch:{ all -> 0x020f }
                monitor-exit(r2)     // Catch:{ all -> 0x020f }
                throw r0
            L_0x020f:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x020f }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: org.maplibre.android.maps.renderer.surfaceview.MapLibreGLSurfaceView.b.c():void");
        }

        /* access modifiers changed from: protected */
        public boolean h() {
            return super.h() && !this.f146004q;
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(7:11|12|14|15|25|20|5) */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x000e, code lost:
            continue;
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0022 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void m() {
            /*
                r2 = this;
                org.maplibre.android.maps.renderer.surfaceview.MapLibreSurfaceView$c r0 = r2.f146031p
                monitor-enter(r0)
                r1 = 1
                r2.f146020e = r1     // Catch:{ all -> 0x0020 }
                r1 = 0
                r2.f146007t = r1     // Catch:{ all -> 0x0020 }
                org.maplibre.android.maps.renderer.surfaceview.MapLibreSurfaceView$c r1 = r2.f146031p     // Catch:{ all -> 0x0020 }
                r1.notifyAll()     // Catch:{ all -> 0x0020 }
            L_0x000e:
                boolean r1 = r2.f146021f     // Catch:{ all -> 0x0020 }
                if (r1 == 0) goto L_0x002a
                boolean r1 = r2.f146007t     // Catch:{ all -> 0x0020 }
                if (r1 != 0) goto L_0x002a
                boolean r1 = r2.f146017b     // Catch:{ all -> 0x0020 }
                if (r1 != 0) goto L_0x002a
                org.maplibre.android.maps.renderer.surfaceview.MapLibreSurfaceView$c r1 = r2.f146031p     // Catch:{ InterruptedException -> 0x0022 }
                r1.wait()     // Catch:{ InterruptedException -> 0x0022 }
                goto L_0x000e
            L_0x0020:
                r1 = move-exception
                goto L_0x002c
            L_0x0022:
                java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0020 }
                r1.interrupt()     // Catch:{ all -> 0x0020 }
                goto L_0x000e
            L_0x002a:
                monitor-exit(r0)     // Catch:{ all -> 0x0020 }
                return
            L_0x002c:
                monitor-exit(r0)     // Catch:{ all -> 0x0020 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: org.maplibre.android.maps.renderer.surfaceview.MapLibreGLSurfaceView.b.m():void");
        }
    }

    public MapLibreGLSurfaceView(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public void b() {
        this.f146013c = new b(this.f145993f);
    }

    public boolean getPreserveEGLContextOnPause() {
        return this.f145997j;
    }

    public void setEGLConfigChooser(GLSurfaceView.EGLConfigChooser eGLConfigChooser) {
        a();
        this.f145994g = eGLConfigChooser;
    }

    public void setEGLContextFactory(GLSurfaceView.EGLContextFactory eGLContextFactory) {
        a();
        this.f145995h = eGLContextFactory;
    }

    public void setEGLWindowSurfaceFactory(GLSurfaceView.EGLWindowSurfaceFactory eGLWindowSurfaceFactory) {
        a();
        this.f145996i = eGLWindowSurfaceFactory;
    }

    public void setPreserveEGLContextOnPause(boolean z10) {
        this.f145997j = z10;
    }

    public void setRenderer(a aVar) {
        if (this.f145994g == null) {
            throw new IllegalStateException("No eglConfigChooser provided");
        } else if (this.f145995h == null) {
            throw new IllegalStateException("No eglContextFactory provided");
        } else if (this.f145996i != null) {
            super.setRenderer(aVar);
        } else {
            throw new IllegalStateException("No eglWindowSurfaceFactory provided");
        }
    }
}
