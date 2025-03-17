package org.maplibre.android.maps.renderer;

import android.content.Context;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import androidx.annotation.Keep;
import org.maplibre.android.log.Logger;
import org.maplibre.android.maps.o;
import org.maplibre.android.maps.p;

@Keep
public abstract class MapRenderer implements MapRendererScheduler {
    private static final String TAG = "Mbgl-MapRenderer";
    private double expectedRenderTime = 0.0d;
    private long nativePtr = 0;
    private o.j onFpsChangedListener;
    private long timeElapsed;

    public enum a {
        WHEN_DIRTY,
        CONTINUOUS
    }

    static {
        org.maplibre.android.a.a();
    }

    public MapRenderer(Context context, String str) {
        nativeInitialize(this, context.getResources().getDisplayMetrics().density, str);
    }

    public static MapRenderer create(p pVar, Context context, Runnable runnable) {
        String I10 = pVar.I();
        return pVar.W() ? MapRendererFactory.newTextureViewMapRenderer(context, new TextureView(context), I10, pVar.Y(), runnable) : MapRendererFactory.newSurfaceViewMapRenderer(context, I10, pVar.T(), runnable);
    }

    private native void nativeInitialize(MapRenderer mapRenderer, float f10, String str);

    private native void nativeOnSurfaceChanged(int i10, int i11);

    private native void nativeOnSurfaceCreated(Surface surface);

    private native void nativeOnSurfaceDestroyed();

    private native void nativeRender();

    private native void nativeSetSwapBehaviorFlush(boolean z10);

    private void updateFps() {
        long nanoTime = System.nanoTime();
        if (this.timeElapsed <= 0) {
            this.timeElapsed = nanoTime;
            return;
        }
        throw null;
    }

    /* access modifiers changed from: protected */
    public native void finalize();

    public abstract a getRenderingRefreshMode();

    public abstract View getView();

    /* access modifiers changed from: protected */
    public native void nativeReset();

    public void onDestroy() {
    }

    /* access modifiers changed from: protected */
    public void onDrawFrame() {
        long nanoTime = System.nanoTime();
        try {
            nativeRender();
        } catch (Error e10) {
            Logger.e(TAG, e10.getMessage());
        }
        double nanoTime2 = (double) (System.nanoTime() - nanoTime);
        double d10 = this.expectedRenderTime;
        if (nanoTime2 < d10) {
            try {
                Thread.sleep((long) ((d10 - nanoTime2) / 1000000.0d));
            } catch (InterruptedException e11) {
                Logger.e(TAG, e11.getMessage());
            }
        }
    }

    public void onPause() {
    }

    public void onResume() {
    }

    public void onStart() {
    }

    public void onStop() {
    }

    /* access modifiers changed from: protected */
    public void onSurfaceChanged(int i10, int i11) {
        nativeOnSurfaceChanged(i10, i11);
    }

    /* access modifiers changed from: protected */
    public void onSurfaceCreated(Surface surface) {
        nativeOnSurfaceCreated(surface);
    }

    /* access modifiers changed from: protected */
    public void onSurfaceDestroyed() {
        nativeOnSurfaceDestroyed();
    }

    /* access modifiers changed from: package-private */
    public void queueEvent(MapRendererRunnable mapRendererRunnable) {
        queueEvent(mapRendererRunnable);
    }

    public void setMaximumFps(int i10) {
        if (i10 > 0) {
            this.expectedRenderTime = 1.0E9d / ((double) i10);
        }
    }

    public void setOnFpsChangedListener(o.j jVar) {
    }

    public abstract void setRenderingRefreshMode(a aVar);

    public void setSwapBehaviorFlush(boolean z10) {
        nativeSetSwapBehaviorFlush(z10);
    }
}
