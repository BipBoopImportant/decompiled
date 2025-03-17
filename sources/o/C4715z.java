package O;

import C.C4391e0;
import C.C4417z;
import H2.i;
import Q.d;
import Q.e;
import Q.g;
import android.graphics.Bitmap;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.util.Log;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.ImageProcessingUtil;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: O.z  reason: case insensitive filesystem */
public class C4715z {

    /* renamed from: a  reason: collision with root package name */
    protected final AtomicBoolean f9663a = new AtomicBoolean(false);

    /* renamed from: b  reason: collision with root package name */
    protected final Map<Surface, g> f9664b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    protected Thread f9665c;

    /* renamed from: d  reason: collision with root package name */
    protected EGLDisplay f9666d = EGL14.EGL_NO_DISPLAY;

    /* renamed from: e  reason: collision with root package name */
    protected EGLContext f9667e = EGL14.EGL_NO_CONTEXT;

    /* renamed from: f  reason: collision with root package name */
    protected int[] f9668f = d.f11909a;

    /* renamed from: g  reason: collision with root package name */
    protected EGLConfig f9669g;

    /* renamed from: h  reason: collision with root package name */
    protected EGLSurface f9670h = EGL14.EGL_NO_SURFACE;

    /* renamed from: i  reason: collision with root package name */
    protected Surface f9671i;

    /* renamed from: j  reason: collision with root package name */
    protected Map<d.e, d.f> f9672j = Collections.emptyMap();

    /* renamed from: k  reason: collision with root package name */
    protected d.f f9673k = null;

    /* renamed from: l  reason: collision with root package name */
    protected d.e f9674l = d.e.UNKNOWN;

    /* renamed from: m  reason: collision with root package name */
    private int f9675m = -1;

    private void a(int i10) {
        GLES20.glActiveTexture(33984);
        d.g("glActiveTexture");
        GLES20.glBindTexture(36197, i10);
        d.g("glBindTexture");
    }

    private void b(C4417z zVar, e.a aVar) {
        e.a aVar2 = aVar;
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        this.f9666d = eglGetDisplay;
        if (!Objects.equals(eglGetDisplay, EGL14.EGL_NO_DISPLAY)) {
            int i10 = 2;
            int[] iArr = new int[2];
            if (EGL14.eglInitialize(this.f9666d, iArr, 0, iArr, 1)) {
                if (aVar2 != null) {
                    aVar2.c(iArr[0] + "." + iArr[1]);
                }
                int i11 = zVar.d() ? 10 : 8;
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                if (EGL14.eglChooseConfig(this.f9666d, new int[]{12324, i11, 12323, i11, 12322, i11, 12321, zVar.d() ? 2 : 8, 12325, 0, 12326, 0, 12352, zVar.d() ? 64 : 4, 12610, zVar.d() ? -1 : 1, 12339, 5, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
                    EGLConfig eGLConfig = eGLConfigArr[0];
                    if (zVar.d()) {
                        i10 = 3;
                    }
                    EGLContext eglCreateContext = EGL14.eglCreateContext(this.f9666d, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, i10, 12344}, 0);
                    d.f("eglCreateContext");
                    this.f9669g = eGLConfig;
                    this.f9667e = eglCreateContext;
                    int[] iArr2 = new int[1];
                    EGL14.eglQueryContext(this.f9666d, eglCreateContext, 12440, iArr2, 0);
                    Log.d("OpenGlRenderer", "EGLContext created, client version " + iArr2[0]);
                    return;
                }
                throw new IllegalStateException("Unable to find a suitable EGLConfig");
            }
            this.f9666d = EGL14.EGL_NO_DISPLAY;
            throw new IllegalStateException("Unable to initialize EGL14");
        }
        throw new IllegalStateException("Unable to get EGL14 display");
    }

    private void d() {
        EGLDisplay eGLDisplay = this.f9666d;
        EGLConfig eGLConfig = this.f9669g;
        Objects.requireNonNull(eGLConfig);
        this.f9670h = d.n(eGLDisplay, eGLConfig, 1, 1);
    }

    private H2.d<String, String> e(C4417z zVar) {
        d.i(this.f9663a, false);
        try {
            b(zVar, (e.a) null);
            d();
            i(this.f9670h);
            String glGetString = GLES20.glGetString(7939);
            String eglQueryString = EGL14.eglQueryString(this.f9666d, 12373);
            if (glGetString == null) {
                glGetString = "";
            }
            if (eglQueryString == null) {
                eglQueryString = "";
            }
            return new H2.d<>(glGetString, eglQueryString);
        } catch (IllegalStateException e10) {
            C4391e0.m("OpenGlRenderer", "Failed to get GL or EGL extensions: " + e10.getMessage(), e10);
            return new H2.d<>("", "");
        } finally {
            l();
        }
    }

    private void l() {
        for (d.f b10 : this.f9672j.values()) {
            b10.b();
        }
        this.f9672j = Collections.emptyMap();
        this.f9673k = null;
        if (!Objects.equals(this.f9666d, EGL14.EGL_NO_DISPLAY)) {
            EGLDisplay eGLDisplay = this.f9666d;
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            for (g next : this.f9664b.values()) {
                if (!Objects.equals(next.a(), EGL14.EGL_NO_SURFACE) && !EGL14.eglDestroySurface(this.f9666d, next.a())) {
                    d.e("eglDestroySurface");
                }
            }
            this.f9664b.clear();
            if (!Objects.equals(this.f9670h, EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f9666d, this.f9670h);
                this.f9670h = EGL14.EGL_NO_SURFACE;
            }
            if (!Objects.equals(this.f9667e, EGL14.EGL_NO_CONTEXT)) {
                EGL14.eglDestroyContext(this.f9666d, this.f9667e);
                this.f9667e = EGL14.EGL_NO_CONTEXT;
            }
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.f9666d);
            this.f9666d = EGL14.EGL_NO_DISPLAY;
        }
        this.f9669g = null;
        this.f9675m = -1;
        this.f9674l = d.e.UNKNOWN;
        this.f9671i = null;
        this.f9665c = null;
    }

    private void q(ByteBuffer byteBuffer, Size size, float[] fArr) {
        i.b(byteBuffer.capacity() == (size.getWidth() * size.getHeight()) * 4, "ByteBuffer capacity is not equal to width * height * 4.");
        i.b(byteBuffer.isDirect(), "ByteBuffer is not direct.");
        int u10 = d.u();
        GLES20.glActiveTexture(33985);
        d.g("glActiveTexture");
        GLES20.glBindTexture(3553, u10);
        d.g("glBindTexture");
        GLES20.glTexImage2D(3553, 0, 6407, size.getWidth(), size.getHeight(), 0, 6407, 5121, (Buffer) null);
        d.g("glTexImage2D");
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10241, 9729);
        int t10 = d.t();
        GLES20.glBindFramebuffer(36160, t10);
        d.g("glBindFramebuffer");
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, u10, 0);
        d.g("glFramebufferTexture2D");
        GLES20.glActiveTexture(33984);
        d.g("glActiveTexture");
        GLES20.glBindTexture(36197, this.f9675m);
        d.g("glBindTexture");
        this.f9671i = null;
        GLES20.glViewport(0, 0, size.getWidth(), size.getHeight());
        GLES20.glScissor(0, 0, size.getWidth(), size.getHeight());
        d.f fVar = (d.f) i.g(this.f9673k);
        if (fVar instanceof d.g) {
            ((d.g) fVar).h(fArr);
        }
        GLES20.glDrawArrays(5, 0, 4);
        d.g("glDrawArrays");
        GLES20.glReadPixels(0, 0, size.getWidth(), size.getHeight(), 6408, 5121, byteBuffer);
        d.g("glReadPixels");
        GLES20.glBindFramebuffer(36160, 0);
        d.s(u10);
        d.r(t10);
        a(this.f9675m);
    }

    /* access modifiers changed from: protected */
    public g c(Surface surface) {
        try {
            EGLDisplay eGLDisplay = this.f9666d;
            EGLConfig eGLConfig = this.f9669g;
            Objects.requireNonNull(eGLConfig);
            EGLSurface q10 = d.q(eGLDisplay, eGLConfig, surface, this.f9668f);
            Size x10 = d.x(this.f9666d, q10);
            return g.d(q10, x10.getWidth(), x10.getHeight());
        } catch (IllegalArgumentException | IllegalStateException e10) {
            C4391e0.m("OpenGlRenderer", "Failed to create EGL surface: " + e10.getMessage(), e10);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public g f(Surface surface) {
        i.j(this.f9664b.containsKey(surface), "The surface is not registered.");
        g gVar = this.f9664b.get(surface);
        Objects.requireNonNull(gVar);
        return gVar;
    }

    public int g() {
        d.i(this.f9663a, true);
        d.h(this.f9665c);
        return this.f9675m;
    }

    public e h(C4417z zVar, Map<d.e, C> map) {
        d.i(this.f9663a, false);
        e.a a10 = e.a();
        try {
            if (zVar.d()) {
                H2.d<String, String> e10 = e(zVar);
                String str = (String) i.g((String) e10.f7052a);
                String str2 = (String) i.g((String) e10.f7053b);
                if (!str.contains("GL_EXT_YUV_target")) {
                    C4391e0.l("OpenGlRenderer", "Device does not support GL_EXT_YUV_target. Fallback to SDR.");
                    zVar = C4417z.f5465d;
                }
                this.f9668f = d.k(str2, zVar);
                a10.d(str);
                a10.b(str2);
            }
            b(zVar, a10);
            d();
            i(this.f9670h);
            a10.e(d.w());
            this.f9672j = d.o(zVar, map);
            int p10 = d.p();
            this.f9675m = p10;
            s(p10);
            this.f9665c = Thread.currentThread();
            this.f9663a.set(true);
            return a10.a();
        } catch (IllegalStateException e11) {
            e = e11;
            l();
            throw e;
        } catch (IllegalArgumentException e12) {
            e = e12;
            l();
            throw e;
        }
    }

    /* access modifiers changed from: protected */
    public void i(EGLSurface eGLSurface) {
        i.g(this.f9666d);
        i.g(this.f9667e);
        if (!EGL14.eglMakeCurrent(this.f9666d, eGLSurface, eGLSurface, this.f9667e)) {
            throw new IllegalStateException("eglMakeCurrent failed");
        }
    }

    public void j(Surface surface) {
        d.i(this.f9663a, true);
        d.h(this.f9665c);
        if (!this.f9664b.containsKey(surface)) {
            this.f9664b.put(surface, d.f11920l);
        }
    }

    public void k() {
        if (this.f9663a.getAndSet(false)) {
            d.h(this.f9665c);
            l();
        }
    }

    /* access modifiers changed from: protected */
    public void m(Surface surface, boolean z10) {
        if (this.f9671i == surface) {
            this.f9671i = null;
            i(this.f9670h);
        }
        g remove = z10 ? this.f9664b.remove(surface) : this.f9664b.put(surface, d.f11920l);
        if (remove != null && remove != d.f11920l) {
            try {
                EGL14.eglDestroySurface(this.f9666d, remove.a());
            } catch (RuntimeException e10) {
                C4391e0.m("OpenGlRenderer", "Failed to destroy EGL surface: " + e10.getMessage(), e10);
            }
        }
    }

    public void n(long j10, float[] fArr, Surface surface) {
        d.i(this.f9663a, true);
        d.h(this.f9665c);
        g f10 = f(surface);
        if (f10 == d.f11920l) {
            f10 = c(surface);
            if (f10 != null) {
                this.f9664b.put(surface, f10);
            } else {
                return;
            }
        }
        if (surface != this.f9671i) {
            i(f10.a());
            this.f9671i = surface;
            GLES20.glViewport(0, 0, f10.c(), f10.b());
            GLES20.glScissor(0, 0, f10.c(), f10.b());
        }
        d.f fVar = (d.f) i.g(this.f9673k);
        if (fVar instanceof d.g) {
            ((d.g) fVar).h(fArr);
        }
        GLES20.glDrawArrays(5, 0, 4);
        d.g("glDrawArrays");
        EGLExt.eglPresentationTimeANDROID(this.f9666d, f10.a(), j10);
        if (!EGL14.eglSwapBuffers(this.f9666d, f10.a())) {
            C4391e0.l("OpenGlRenderer", "Failed to swap buffers with EGL error: 0x" + Integer.toHexString(EGL14.eglGetError()));
            m(surface, false);
        }
    }

    public void o(d.e eVar) {
        d.i(this.f9663a, true);
        d.h(this.f9665c);
        if (this.f9674l != eVar) {
            this.f9674l = eVar;
            s(this.f9675m);
        }
    }

    public Bitmap p(Size size, float[] fArr) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(size.getWidth() * size.getHeight() * 4);
        q(allocateDirect, size, fArr);
        Bitmap createBitmap = Bitmap.createBitmap(size.getWidth(), size.getHeight(), Bitmap.Config.ARGB_8888);
        allocateDirect.rewind();
        ImageProcessingUtil.j(createBitmap, allocateDirect, size.getWidth() * 4);
        return createBitmap;
    }

    public void r(Surface surface) {
        d.i(this.f9663a, true);
        d.h(this.f9665c);
        m(surface, true);
    }

    /* access modifiers changed from: protected */
    public void s(int i10) {
        d.f fVar = this.f9672j.get(this.f9674l);
        if (fVar != null) {
            if (this.f9673k != fVar) {
                this.f9673k = fVar;
                fVar.f();
                Log.d("OpenGlRenderer", "Using program for input format " + this.f9674l + ": " + this.f9673k);
            }
            a(i10);
            return;
        }
        throw new IllegalStateException("Unable to configure program for input format: " + this.f9674l);
    }
}
