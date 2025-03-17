package org.maplibre.android.maps.renderer.surfaceview;

import android.content.Context;
import android.view.Surface;
import android.view.View;
import org.maplibre.android.maps.renderer.MapRenderer;
import org.maplibre.android.maps.renderer.surfaceview.MapLibreSurfaceView;

public class a extends MapRenderer {

    /* renamed from: a  reason: collision with root package name */
    protected final MapLibreSurfaceView f146032a;

    /* renamed from: org.maplibre.android.maps.renderer.surfaceview.a$a  reason: collision with other inner class name */
    class C4253a implements MapLibreSurfaceView.a {
        C4253a() {
        }

        public void a() {
            a.this.nativeReset();
        }
    }

    public a(Context context, MapLibreSurfaceView mapLibreSurfaceView, String str) {
        super(context, str);
        this.f146032a = mapLibreSurfaceView;
        mapLibreSurfaceView.setDetachedListener(new C4253a());
    }

    public MapRenderer.a getRenderingRefreshMode() {
        return this.f146032a.getRenderingRefreshMode();
    }

    public View getView() {
        return this.f146032a;
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public void onDrawFrame() {
        super.onDrawFrame();
    }

    public void onPause() {
        super.onPause();
    }

    public void onResume() {
        super.onResume();
    }

    public void onStart() {
        this.f146032a.e();
    }

    public void onStop() {
        this.f146032a.d();
    }

    public void onSurfaceChanged(int i10, int i11) {
        super.onSurfaceChanged(i10, i11);
    }

    public void onSurfaceCreated(Surface surface) {
        super.onSurfaceCreated(surface);
    }

    public void onSurfaceDestroyed() {
        super.onSurfaceDestroyed();
    }

    public void queueEvent(Runnable runnable) {
        this.f146032a.f(runnable);
    }

    public void requestRender() {
        this.f146032a.g();
    }

    public void setRenderingRefreshMode(MapRenderer.a aVar) {
        this.f146032a.setRenderingRefreshMode(aVar);
    }

    public void waitForEmpty() {
        this.f146032a.h();
    }
}
