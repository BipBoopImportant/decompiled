package org.maplibre.android.maps.renderer;

import GL.C15807a;
import HL.C15865a;
import HL.C15866b;
import android.content.Context;
import android.view.Surface;
import android.view.TextureView;
import androidx.annotation.Keep;
import org.maplibre.android.maps.renderer.surfaceview.MapLibreGLSurfaceView;

@Keep
public class MapRendererFactory {

    class a extends C15866b {

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Runnable f145984d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(Context context, TextureView textureView, String str, boolean z10, Runnable runnable) {
            super(context, textureView, str, z10);
            this.f145984d = runnable;
        }

        /* access modifiers changed from: protected */
        public void onSurfaceCreated(Surface surface) {
            this.f145984d.run();
            super.onSurfaceCreated(surface);
        }
    }

    class b extends C15807a {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Runnable f145985b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(Context context, MapLibreGLSurfaceView mapLibreGLSurfaceView, String str, Runnable runnable) {
            super(context, mapLibreGLSurfaceView, str);
            this.f145985b = runnable;
        }

        public void onSurfaceCreated(Surface surface) {
            this.f145985b.run();
            super.onSurfaceCreated(surface);
        }
    }

    public static org.maplibre.android.maps.renderer.surfaceview.a newSurfaceViewMapRenderer(Context context, String str, boolean z10, Runnable runnable) {
        MapLibreGLSurfaceView mapLibreGLSurfaceView = new MapLibreGLSurfaceView(context);
        mapLibreGLSurfaceView.setZOrderMediaOverlay(z10);
        return new b(context, mapLibreGLSurfaceView, str, runnable);
    }

    public static C15866b newTextureViewMapRenderer(Context context, TextureView textureView, String str, boolean z10, Runnable runnable) {
        a aVar = new a(context, textureView, str, z10, runnable);
        aVar.b(new C15865a(textureView, aVar));
        return aVar;
    }
}
