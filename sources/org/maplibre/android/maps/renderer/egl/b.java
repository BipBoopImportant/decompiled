package org.maplibre.android.maps.renderer.egl;

import android.opengl.GLSurfaceView;
import android.util.Log;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;

public class b implements GLSurfaceView.EGLContextFactory {
    public EGLContext createContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
        if (eGLDisplay == null || eGLConfig == null) {
            return EGL10.EGL_NO_CONTEXT;
        }
        return egl10.eglCreateContext(eGLDisplay, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{12440, 2, 12344});
    }

    public void destroyContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext) {
        if (!egl10.eglDestroyContext(eGLDisplay, eGLContext)) {
            Log.e("DefaultContextFactory", "display:" + eGLDisplay + " context: " + eGLContext);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("tid=");
            sb2.append(Thread.currentThread().getId());
            Log.i("DefaultContextFactory", sb2.toString());
        }
    }
}
