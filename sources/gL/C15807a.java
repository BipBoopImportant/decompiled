package GL;

import android.content.Context;
import org.maplibre.android.maps.renderer.MapRenderer;
import org.maplibre.android.maps.renderer.egl.b;
import org.maplibre.android.maps.renderer.egl.d;
import org.maplibre.android.maps.renderer.surfaceview.MapLibreGLSurfaceView;
import org.maplibre.android.maps.renderer.surfaceview.a;

/* renamed from: GL.a  reason: case insensitive filesystem */
public class C15807a extends a {
    public C15807a(Context context, MapLibreGLSurfaceView mapLibreGLSurfaceView, String str) {
        super(context, mapLibreGLSurfaceView, str);
        mapLibreGLSurfaceView.setEGLContextFactory(new b());
        mapLibreGLSurfaceView.setEGLWindowSurfaceFactory(new d());
        mapLibreGLSurfaceView.setEGLConfigChooser(new org.maplibre.android.maps.renderer.egl.a());
        mapLibreGLSurfaceView.setRenderer(this);
        mapLibreGLSurfaceView.setRenderingRefreshMode(MapRenderer.a.WHEN_DIRTY);
        mapLibreGLSurfaceView.setPreserveEGLContextOnPause(true);
    }
}
