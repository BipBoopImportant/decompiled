package org.maplibre.android.maps.renderer.egl;

import android.opengl.GLSurfaceView;
import android.util.Log;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

public class d implements GLSurfaceView.EGLWindowSurfaceFactory {
    public EGLSurface createWindowSurface(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, Object obj) {
        if (eGLDisplay == null || eGLConfig == null || obj == null) {
            return null;
        }
        try {
            return egl10.eglCreateWindowSurface(eGLDisplay, eGLConfig, obj, (int[]) null);
        } catch (Exception e10) {
            Log.e("EGLWindowSurfaceFactory", "eglCreateWindowSurface", e10);
            return null;
        }
    }

    public void destroySurface(EGL10 egl10, EGLDisplay eGLDisplay, EGLSurface eGLSurface) {
        egl10.eglDestroySurface(eGLDisplay, eGLSurface);
    }
}
