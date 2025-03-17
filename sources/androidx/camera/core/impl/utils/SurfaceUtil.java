package androidx.camera.core.impl.utils;

import android.view.Surface;

public class SurfaceUtil {

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f17021a = 0;

        /* renamed from: b  reason: collision with root package name */
        public int f17022b = 0;

        /* renamed from: c  reason: collision with root package name */
        public int f17023c = 0;
    }

    static {
        System.loadLibrary("surface_util_jni");
    }

    public static a a(Surface surface) {
        int[] nativeGetSurfaceInfo = nativeGetSurfaceInfo(surface);
        a aVar = new a();
        aVar.f17021a = nativeGetSurfaceInfo[0];
        aVar.f17022b = nativeGetSurfaceInfo[1];
        aVar.f17023c = nativeGetSurfaceInfo[2];
        return aVar;
    }

    private static native int[] nativeGetSurfaceInfo(Surface surface);
}
