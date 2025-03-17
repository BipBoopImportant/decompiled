package HL;

import android.content.Context;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import org.maplibre.android.maps.renderer.MapRenderer;

/* renamed from: HL.b  reason: case insensitive filesystem */
public class C15866b extends MapRenderer {

    /* renamed from: a  reason: collision with root package name */
    private C15867c f135374a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f135375b;

    /* renamed from: c  reason: collision with root package name */
    private TextureView f135376c;

    public C15866b(Context context, TextureView textureView, String str, boolean z10) {
        super(context, str);
        this.f135376c = textureView;
        this.f135375b = z10;
    }

    public boolean a() {
        return this.f135375b;
    }

    public void b(C15867c cVar) {
        this.f135374a = cVar;
        cVar.setName("TextureViewRenderer");
        this.f135374a.start();
    }

    public MapRenderer.a getRenderingRefreshMode() {
        throw new RuntimeException("getRenderingRefreshMode is not supported for TextureViewMapRenderer. Use SurfaceViewMapRenderer to set the rendering refresh mode.");
    }

    public View getView() {
        return this.f135376c;
    }

    public void onDestroy() {
        this.f135374a.a();
    }

    /* access modifiers changed from: protected */
    public void onDrawFrame() {
        super.onDrawFrame();
    }

    public void onStart() {
        this.f135374a.c();
    }

    public void onStop() {
        this.f135374a.b();
    }

    /* access modifiers changed from: protected */
    public void onSurfaceChanged(int i10, int i11) {
        super.onSurfaceChanged(i10, i11);
    }

    /* access modifiers changed from: protected */
    public void onSurfaceCreated(Surface surface) {
        super.onSurfaceCreated(surface);
    }

    /* access modifiers changed from: protected */
    public void onSurfaceDestroyed() {
        super.onSurfaceDestroyed();
    }

    public void queueEvent(Runnable runnable) {
        this.f135374a.d(runnable);
    }

    public void requestRender() {
        this.f135374a.e();
    }

    public void setRenderingRefreshMode(MapRenderer.a aVar) {
        throw new RuntimeException("setRenderingRefreshMode is not supported for TextureViewMapRenderer. Use SurfaceViewMapRenderer to set the rendering refresh mode.");
    }

    public void waitForEmpty() {
        this.f135374a.f();
    }
}
