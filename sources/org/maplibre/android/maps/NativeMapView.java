package org.maplibre.android.maps;

import AL.C15447a;
import LL.C16031a;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.RectF;
import android.text.TextUtils;
import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.maplibre.android.annotations.Marker;
import org.maplibre.android.annotations.Polygon;
import org.maplibre.android.annotations.Polyline;
import org.maplibre.android.camera.CameraPosition;
import org.maplibre.android.geometry.LatLng;
import org.maplibre.android.geometry.LatLngBounds;
import org.maplibre.android.geometry.ProjectedMeters;
import org.maplibre.android.log.Logger;
import org.maplibre.android.maps.renderer.MapRenderer;
import org.maplibre.android.storage.FileSource;
import org.maplibre.android.style.layers.Layer;
import org.maplibre.android.style.layers.TransitionOptions;
import org.maplibre.android.style.light.Light;
import org.maplibre.android.style.sources.Source;
import org.maplibre.android.tile.TileOperation;
import org.maplibre.geojson.Feature;
import org.maplibre.geojson.Geometry;

final class NativeMapView implements v {

    /* renamed from: a  reason: collision with root package name */
    private final FileSource f145796a;

    /* renamed from: b  reason: collision with root package name */
    private final MapRenderer f145797b;

    /* renamed from: c  reason: collision with root package name */
    private final Thread f145798c;

    /* renamed from: d  reason: collision with root package name */
    private c f145799d;

    /* renamed from: e  reason: collision with root package name */
    private a f145800e;

    /* renamed from: f  reason: collision with root package name */
    private final float f145801f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f145802g = false;

    /* renamed from: h  reason: collision with root package name */
    private double[] f145803h;
    @Keep
    private long nativePtr = 0;

    interface a extends b {
        void a(String str, String str2);

        void b(int i10, int i11, String str);

        void c(boolean z10);

        void d();

        void e(String str);

        void f(String str, String str2);

        void h(String[] strArr, int i10, int i11);

        void i();

        void j(boolean z10);

        void k(String str);

        void l(String[] strArr, int i10, int i11);

        void m(String[] strArr, int i10, int i11);

        void n(String str, String str2);

        void o();

        void p(boolean z10, double d10, double d11);

        void q(boolean z10);

        void r(int i10, int i11, String str);

        void s(int i10, int i11, String str);

        boolean t(String str);

        void v();

        void w();

        void x(TileOperation tileOperation, int i10, int i11, int i12, int i13, int i14, String str);

        void y(String str);
    }

    interface b {
        void g();

        void u();
    }

    public interface c {
    }

    static {
        org.maplibre.android.a.a();
    }

    public NativeMapView(Context context, float f10, boolean z10, c cVar, a aVar, MapRenderer mapRenderer) {
        this.f145797b = mapRenderer;
        this.f145799d = cVar;
        FileSource c10 = FileSource.c(context);
        this.f145796a = c10;
        this.f145801f = f10;
        this.f145798c = Thread.currentThread();
        this.f145800e = aVar;
        nativeInitialize(this, c10, mapRenderer, f10, z10);
    }

    private boolean a(String str) {
        if (this.f145798c == Thread.currentThread()) {
            if (this.f145802g && !TextUtils.isEmpty(str)) {
                String format = String.format("You're calling `%s` after the `MapView` was destroyed, were you invoking it after `onDestroy()`?", new Object[]{str});
                Logger.e("Mbgl-NativeMapView", format);
                org.maplibre.android.c.b(format);
            }
            return this.f145802g;
        }
        throw new C15447a(String.format("Map interactions should happen on the UI thread. Method invoked from wrong thread is %s.", new Object[]{str}));
    }

    private double[] b(double[] dArr) {
        if (dArr == null) {
            dArr = this.f145803h;
        }
        this.f145803h = null;
        if (dArr == null) {
            return null;
        }
        double d10 = dArr[1];
        float f10 = this.f145801f;
        return new double[]{d10 / ((double) f10), dArr[0] / ((double) f10), dArr[3] / ((double) f10), dArr[2] / ((double) f10)};
    }

    @Keep
    private native void nativeAddAnnotationIcon(String str, int i10, int i11, float f10, byte[] bArr);

    @Keep
    private native void nativeAddImage(String str, Bitmap bitmap, float f10, boolean z10);

    @Keep
    private native void nativeAddImages(Image[] imageArr);

    @Keep
    private native void nativeAddLayer(long j10, String str);

    @Keep
    private native void nativeAddLayerAbove(long j10, String str);

    @Keep
    private native void nativeAddLayerAt(long j10, int i10);

    @Keep
    private native long[] nativeAddMarkers(Marker[] markerArr);

    @Keep
    private native long[] nativeAddPolygons(Polygon[] polygonArr);

    @Keep
    private native long[] nativeAddPolylines(Polyline[] polylineArr);

    @Keep
    private native void nativeAddSource(Source source, long j10);

    @Keep
    private native void nativeCancelTransitions();

    @Keep
    private native void nativeDestroy();

    @Keep
    private native void nativeEaseTo(double d10, double d11, double d12, long j10, double d13, double d14, double[] dArr, boolean z10);

    @Keep
    private native void nativeFlyTo(double d10, double d11, double d12, long j10, double d13, double d14, double[] dArr);

    @Keep
    private native double nativeGetBearing();

    @Keep
    private native CameraPosition nativeGetCameraForGeometry(Geometry geometry, double d10, double d11, double d12, double d13, double d14, double d15);

    @Keep
    private native CameraPosition nativeGetCameraForLatLngBounds(LatLngBounds latLngBounds, double d10, double d11, double d12, double d13, double d14, double d15);

    @Keep
    private native CameraPosition nativeGetCameraPosition();

    @Keep
    private native boolean nativeGetDebug();

    @Keep
    private native Bitmap nativeGetImage(String str);

    @Keep
    private native LatLng nativeGetLatLng();

    @Keep
    private native Layer nativeGetLayer(String str);

    @Keep
    private native Layer[] nativeGetLayers();

    @Keep
    private native Light nativeGetLight();

    @Keep
    private native double nativeGetMaxPitch();

    @Keep
    private native double nativeGetMaxZoom();

    @Keep
    private native double nativeGetMetersPerPixelAtLatitude(double d10, double d11);

    @Keep
    private native double nativeGetMinPitch();

    @Keep
    private native double nativeGetMinZoom();

    @Keep
    private native double nativeGetPitch();

    @Keep
    private native boolean nativeGetPrefetchTiles();

    @Keep
    private native int nativeGetPrefetchZoomDelta();

    @Keep
    private native Source nativeGetSource(String str);

    @Keep
    private native Source[] nativeGetSources();

    @Keep
    private native String nativeGetStyleJson();

    @Keep
    private native String nativeGetStyleUrl();

    @Keep
    private native boolean nativeGetTileCacheEnabled();

    @Keep
    private native double nativeGetTopOffsetPixelsForAnnotationSymbol(String str);

    @Keep
    private native long nativeGetTransitionDelay();

    @Keep
    private native long nativeGetTransitionDuration();

    @Keep
    private native TransitionOptions nativeGetTransitionOptions();

    @Keep
    private native void nativeGetVisibleCoordinateBounds(double[] dArr);

    @Keep
    private native double nativeGetZoom();

    @Keep
    private native void nativeInitialize(NativeMapView nativeMapView, FileSource fileSource, MapRenderer mapRenderer, float f10, boolean z10);

    @Keep
    private native boolean nativeIsFullyLoaded();

    @Keep
    private native void nativeJumpTo(double d10, double d11, double d12, double d13, double d14, double[] dArr);

    @Keep
    private native LatLng nativeLatLngForPixel(float f10, float f11);

    @Keep
    private native LatLng nativeLatLngForProjectedMeters(double d10, double d11);

    @Keep
    private native void nativeLatLngsForPixels(double[] dArr, double[] dArr2, float f10);

    @Keep
    private native void nativeMoveBy(double d10, double d11, long j10);

    @Keep
    private native void nativeOnLowMemory();

    @Keep
    private native PointF nativePixelForLatLng(double d10, double d11);

    @Keep
    private native void nativePixelsForLatLngs(double[] dArr, double[] dArr2, float f10);

    @Keep
    private native ProjectedMeters nativeProjectedMetersForLatLng(double d10, double d11);

    @Keep
    private native long[] nativeQueryPointAnnotations(RectF rectF);

    @Keep
    private native Feature[] nativeQueryRenderedFeaturesForBox(float f10, float f11, float f12, float f13, String[] strArr, Object[] objArr);

    @Keep
    private native Feature[] nativeQueryRenderedFeaturesForPoint(float f10, float f11, String[] strArr, Object[] objArr);

    @Keep
    private native long[] nativeQueryShapeAnnotations(RectF rectF);

    @Keep
    private native void nativeRemoveAnnotationIcon(String str);

    @Keep
    private native void nativeRemoveAnnotations(long[] jArr);

    @Keep
    private native void nativeRemoveImage(String str);

    @Keep
    private native boolean nativeRemoveLayer(long j10);

    @Keep
    private native boolean nativeRemoveLayerAt(int i10);

    @Keep
    private native boolean nativeRemoveSource(Source source, long j10);

    @Keep
    private native void nativeResetNorth();

    @Keep
    private native void nativeResetPosition();

    @Keep
    private native void nativeResetZoom();

    @Keep
    private native void nativeResizeView(int i10, int i11);

    @Keep
    private native void nativeRotateBy(double d10, double d11, double d12, double d13, long j10);

    @Keep
    private native void nativeSetBearing(double d10, long j10);

    @Keep
    private native void nativeSetBearingXY(double d10, double d11, double d12, long j10);

    @Keep
    private native void nativeSetDebug(boolean z10);

    @Keep
    private native void nativeSetGestureInProgress(boolean z10);

    @Keep
    private native void nativeSetLatLng(double d10, double d11, double[] dArr, long j10);

    @Keep
    private native void nativeSetLatLngBounds(LatLngBounds latLngBounds);

    @Keep
    private native void nativeSetMaxPitch(double d10);

    @Keep
    private native void nativeSetMaxZoom(double d10);

    @Keep
    private native void nativeSetMinPitch(double d10);

    @Keep
    private native void nativeSetMinZoom(double d10);

    @Keep
    private native void nativeSetPitch(double d10, long j10);

    @Keep
    private native void nativeSetPrefetchTiles(boolean z10);

    @Keep
    private native void nativeSetPrefetchZoomDelta(int i10);

    @Keep
    private native void nativeSetReachability(boolean z10);

    @Keep
    private native void nativeSetStyleJson(String str);

    @Keep
    private native void nativeSetStyleUrl(String str);

    @Keep
    private native void nativeSetTileCacheEnabled(boolean z10);

    @Keep
    private native void nativeSetTransitionDelay(long j10);

    @Keep
    private native void nativeSetTransitionDuration(long j10);

    @Keep
    private native void nativeSetTransitionOptions(TransitionOptions transitionOptions);

    @Keep
    private native void nativeSetVisibleCoordinateBounds(LatLng[] latLngArr, RectF rectF, double d10, long j10);

    @Keep
    private native void nativeSetZoom(double d10, double d11, double d12, long j10);

    @Keep
    private native void nativeTakeSnapshot();

    @Keep
    private native void nativeTriggerRepaint();

    @Keep
    private native void nativeUpdateMarker(long j10, double d10, double d11, String str);

    @Keep
    private native void nativeUpdatePolygon(long j10, Polygon polygon);

    @Keep
    private native void nativeUpdatePolyline(long j10, Polyline polyline);

    @Keep
    private void onCameraDidChange(boolean z10) {
        a aVar = this.f145800e;
        if (aVar != null) {
            aVar.q(z10);
        }
    }

    @Keep
    private void onCameraIsChanging() {
        a aVar = this.f145800e;
        if (aVar != null) {
            aVar.d();
        }
    }

    @Keep
    private void onCameraWillChange(boolean z10) {
        a aVar = this.f145800e;
        if (aVar != null) {
            aVar.j(z10);
        }
    }

    @Keep
    private boolean onCanRemoveUnusedStyleImage(String str) {
        a aVar = this.f145800e;
        if (aVar != null) {
            return aVar.t(str);
        }
        return true;
    }

    @Keep
    private void onDidBecomeIdle() {
        a aVar = this.f145800e;
        if (aVar != null) {
            aVar.v();
        }
    }

    @Keep
    private void onDidFailLoadingMap(String str) {
        a aVar = this.f145800e;
        if (aVar != null) {
            aVar.k(str);
        }
    }

    @Keep
    private void onDidFinishLoadingMap() {
        a aVar = this.f145800e;
        if (aVar != null) {
            aVar.w();
        }
    }

    @Keep
    private void onDidFinishLoadingStyle() {
        a aVar = this.f145800e;
        if (aVar != null) {
            aVar.g();
        }
    }

    @Keep
    private void onDidFinishRenderingFrame(boolean z10, double d10, double d11) {
        a aVar = this.f145800e;
        if (aVar != null) {
            aVar.p(z10, d10, d11);
        }
    }

    @Keep
    private void onDidFinishRenderingMap(boolean z10) {
        a aVar = this.f145800e;
        if (aVar != null) {
            aVar.c(z10);
        }
    }

    @Keep
    private void onGlyphsError(String[] strArr, int i10, int i11) {
        a aVar = this.f145800e;
        if (aVar != null) {
            aVar.h(strArr, i10, i11);
        }
    }

    @Keep
    private void onGlyphsLoaded(String[] strArr, int i10, int i11) {
        a aVar = this.f145800e;
        if (aVar != null) {
            aVar.l(strArr, i10, i11);
        }
    }

    @Keep
    private void onGlyphsRequested(String[] strArr, int i10, int i11) {
        a aVar = this.f145800e;
        if (aVar != null) {
            aVar.m(strArr, i10, i11);
        }
    }

    @Keep
    private void onPostCompileShader(int i10, int i11, String str) {
        a aVar = this.f145800e;
        if (aVar != null) {
            aVar.r(i10, i11, str);
        }
    }

    @Keep
    private void onPreCompileShader(int i10, int i11, String str) {
        a aVar = this.f145800e;
        if (aVar != null) {
            aVar.s(i10, i11, str);
        }
    }

    @Keep
    private void onShaderCompileFailed(int i10, int i11, String str) {
        a aVar = this.f145800e;
        if (aVar != null) {
            aVar.b(i10, i11, str);
        }
    }

    @Keep
    private void onSourceChanged(String str) {
        a aVar = this.f145800e;
        if (aVar != null) {
            aVar.y(str);
        }
    }

    @Keep
    private void onSpriteError(String str, String str2) {
        a aVar = this.f145800e;
        if (aVar != null) {
            aVar.n(str, str2);
        }
    }

    @Keep
    private void onSpriteLoaded(String str, String str2) {
        a aVar = this.f145800e;
        if (aVar != null) {
            aVar.a(str, str2);
        }
    }

    @Keep
    private void onSpriteRequested(String str, String str2) {
        a aVar = this.f145800e;
        if (aVar != null) {
            aVar.f(str, str2);
        }
    }

    @Keep
    private void onStyleImageMissing(String str) {
        a aVar = this.f145800e;
        if (aVar != null) {
            aVar.e(str);
        }
    }

    @Keep
    private void onTileAction(TileOperation tileOperation, int i10, int i11, int i12, int i13, int i14, String str) {
        a aVar = this.f145800e;
        if (aVar != null) {
            aVar.x(tileOperation, i10, i11, i12, i13, i14, str);
        }
    }

    @Keep
    private void onWillStartLoadingMap() {
        a aVar = this.f145800e;
        if (aVar != null) {
            aVar.u();
        }
    }

    @Keep
    private void onWillStartRenderingFrame() {
        a aVar = this.f145800e;
        if (aVar != null) {
            aVar.i();
        }
    }

    @Keep
    private void onWillStartRenderingMap() {
        a aVar = this.f145800e;
        if (aVar != null) {
            aVar.o();
        }
    }

    public double A(String str) {
        if (a("getTopOffsetPixelsForAnnotationSymbol")) {
            return 0.0d;
        }
        return nativeGetTopOffsetPixelsForAnnotationSymbol(str);
    }

    public void B(double d10) {
        if (!a("setMaxPitch")) {
            nativeSetMaxPitch(d10);
        }
    }

    public long C(Marker marker) {
        if (a("addMarker")) {
            return 0;
        }
        return nativeAddMarkers(new Marker[]{marker})[0];
    }

    public void D(Image[] imageArr) {
        if (!a("addImages")) {
            nativeAddImages(imageArr);
        }
    }

    public void E(boolean z10) {
        if (!a("setReachability")) {
            nativeSetReachability(z10);
        }
    }

    public void F(String str) {
        if (!a("removeImage")) {
            nativeRemoveImage(str);
        }
    }

    public void G(LatLng latLng, double d10, double d11, double d12, double[] dArr, long j10, boolean z10) {
        if (!a("easeTo")) {
            nativeEaseTo(d11, latLng.a(), latLng.b(), j10, d12, d10, b(dArr), z10);
        }
    }

    public RectF H(RectF rectF) {
        float f10 = rectF.left;
        float f11 = this.f145801f;
        return new RectF(f10 / f11, rectF.top / f11, rectF.right / f11, rectF.bottom / f11);
    }

    public double I() {
        if (a("getPitch")) {
            return 0.0d;
        }
        return nativeGetPitch();
    }

    public void J(TransitionOptions transitionOptions) {
        nativeSetTransitionOptions(transitionOptions);
    }

    public PointF K(LatLng latLng) {
        if (a("pixelForLatLng")) {
            return new PointF();
        }
        PointF nativePixelForLatLng = nativePixelForLatLng(latLng.a(), latLng.b());
        float f10 = nativePixelForLatLng.x;
        float f11 = this.f145801f;
        nativePixelForLatLng.set(f10 * f11, nativePixelForLatLng.y * f11);
        return nativePixelForLatLng;
    }

    public void L(double d10, long j10) {
        if (!a("setPitch")) {
            nativeSetPitch(d10, j10);
        }
    }

    public void M(double d10) {
        if (!a("setMinPitch")) {
            nativeSetMinPitch(d10);
        }
    }

    public void N(boolean z10) {
        if (!a("setGestureInProgress")) {
            nativeSetGestureInProgress(z10);
        }
    }

    public void O(double d10, double d11, double d12, long j10) {
        if (!a("setBearing")) {
            float f10 = this.f145801f;
            nativeSetBearingXY(d10, d11 / ((double) f10), d12 / ((double) f10), j10);
        }
    }

    public double P(double d10) {
        if (a("getMetersPerPixelAtLatitude")) {
            return 0.0d;
        }
        return nativeGetMetersPerPixelAtLatitude(d10, e0());
    }

    public long[] Q(RectF rectF) {
        return a("queryShapeAnnotations") ? new long[0] : nativeQueryShapeAnnotations(rectF);
    }

    public void R(Layer layer, String str) {
        if (!a("addLayerAbove")) {
            nativeAddLayerAbove(layer.d(), str);
        }
    }

    public void S(int i10, int i11) {
        if (!a("resizeView")) {
            int ceil = (int) Math.ceil((double) (((float) i10) / this.f145801f));
            int ceil2 = (int) Math.ceil((double) (((float) i11) / this.f145801f));
            if (ceil < 0) {
                Logger.e("Mbgl-NativeMapView", String.format("Device returned a negative width size, setting value to 0 instead of %s", new Object[]{Integer.valueOf(ceil)}));
                ceil = 0;
            }
            if (ceil2 < 0) {
                Logger.e("Mbgl-NativeMapView", String.format("Device returned a negative height size, setting value to 0 instead of %s", new Object[]{Integer.valueOf(ceil2)}));
                ceil2 = 0;
            }
            if (ceil > 65535) {
                Logger.e("Mbgl-NativeMapView", String.format("Device returned an out of range width size, capping value at 65535 instead of %s", new Object[]{Integer.valueOf(ceil)}));
                ceil = 65535;
            }
            if (ceil2 > 65535) {
                Logger.e("Mbgl-NativeMapView", String.format("Device returned an out of range height size, capping value at 65535 instead of %s", new Object[]{Integer.valueOf(ceil2)}));
                ceil2 = 65535;
            }
            nativeResizeView(ceil, ceil2);
        }
    }

    public void T(String str, int i10, int i11, float f10, byte[] bArr) {
        if (!a("addAnnotationIcon")) {
            nativeAddAnnotationIcon(str, i10, i11, f10, bArr);
        }
    }

    public void U(Layer layer, int i10) {
        if (!a("addLayerAt")) {
            nativeAddLayerAt(layer.d(), i10);
        }
    }

    public void V(Layer layer) {
        if (!a("addLayer")) {
            nativeAddLayer(layer.d(), (String) null);
        }
    }

    public void W(Source source) {
        if (!a("addSource")) {
            nativeAddSource(source, source.getNativePtr());
        }
    }

    public void X(LatLng latLng, double d10, double d11, double d12, double[] dArr) {
        if (!a("jumpTo")) {
            nativeJumpTo(d12, latLng.a(), latLng.b(), d11, d10, b(dArr));
        }
    }

    public String Y() {
        return a("getStyleUri") ? "" : nativeGetStyleUrl();
    }

    public List<Feature> Z(PointF pointF, String[] strArr, C16031a aVar) {
        if (a("queryRenderedFeatures")) {
            return new ArrayList();
        }
        float f10 = pointF.x;
        float f11 = this.f145801f;
        Feature[] nativeQueryRenderedFeaturesForPoint = nativeQueryRenderedFeaturesForPoint(f10 / f11, pointF.y / f11, strArr, aVar != null ? aVar.e() : null);
        return nativeQueryRenderedFeaturesForPoint != null ? Arrays.asList(nativeQueryRenderedFeaturesForPoint) : new ArrayList();
    }

    public void a0(LatLngBounds latLngBounds) {
        if (!a("setLatLngBounds")) {
            nativeSetLatLngBounds(latLngBounds);
        }
    }

    public void b0(double d10) {
        if (!a("setMinZoom")) {
            nativeSetMinZoom(d10);
        }
    }

    public void c(long[] jArr) {
        if (!a("removeAnnotations")) {
            nativeRemoveAnnotations(jArr);
        }
    }

    public void c0(double d10, double d11, long j10) {
        if (!a("moveBy")) {
            try {
                float f10 = this.f145801f;
                nativeMoveBy(d10 / ((double) f10), d11 / ((double) f10), j10);
            } catch (Error e10) {
                Logger.d("Mbgl-NativeMapView", "Error when executing NativeMapView#moveBy", e10);
            }
        }
    }

    public CameraPosition d0(Geometry geometry, int[] iArr, double d10, double d11) {
        if (a("getCameraForGeometry")) {
            return null;
        }
        float f10 = this.f145801f;
        return nativeGetCameraForGeometry(geometry, (double) (((float) iArr[1]) / f10), (double) (((float) iArr[0]) / f10), (double) (((float) iArr[3]) / f10), (double) (((float) iArr[2]) / f10), d10, d11);
    }

    public double e0() {
        if (a("getZoom")) {
            return 0.0d;
        }
        return nativeGetZoom();
    }

    public void f0(String str) {
        if (!a("setStyleUri")) {
            nativeSetStyleUrl(str);
        }
    }

    public double g0() {
        if (a("getBearing")) {
            return 0.0d;
        }
        return nativeGetBearing();
    }

    public float getPixelRatio() {
        return this.f145801f;
    }

    public long[] h0(RectF rectF) {
        return a("queryPointAnnotations") ? new long[0] : nativeQueryPointAnnotations(rectF);
    }

    public void i0(boolean z10) {
        if (!a("setDebug")) {
            nativeSetDebug(z10);
        }
    }

    public boolean isDestroyed() {
        return this.f145802g;
    }

    public void j0(double d10, PointF pointF, long j10) {
        if (!a("setZoom")) {
            float f10 = pointF.x;
            float f11 = this.f145801f;
            nativeSetZoom(d10, (double) (f10 / f11), (double) (pointF.y / f11), j10);
        }
    }

    public void k0(int i10) {
        if (!a("nativeSetPrefetchZoomDelta")) {
            nativeSetPrefetchZoomDelta(i10);
        }
    }

    /* access modifiers changed from: protected */
    @Keep
    public void onSnapshotReady(Bitmap bitmap) {
        a("OnSnapshotReady");
    }

    public CameraPosition p() {
        return a("getCameraValues") ? new CameraPosition.a().b() : this.f145803h != null ? new CameraPosition.a(nativeGetCameraPosition()).c(this.f145803h).b() : nativeGetCameraPosition();
    }

    public void q() {
        if (!a("cancelTransitions")) {
            nativeCancelTransitions();
        }
    }

    public List<Source> r() {
        return a("getSources") ? new ArrayList() : Arrays.asList(nativeGetSources());
    }

    public void s(Layer layer, String str) {
        if (!a("addLayerBelow")) {
            nativeAddLayer(layer.d(), str);
        }
    }

    public void t(long j10) {
        if (!a("removeAnnotation")) {
            c(new long[]{j10});
        }
    }

    public CameraPosition u(LatLngBounds latLngBounds, int[] iArr, double d10, double d11) {
        if (a("getCameraForLatLngBounds")) {
            return null;
        }
        float f10 = this.f145801f;
        return nativeGetCameraForLatLngBounds(latLngBounds, (double) (((float) iArr[1]) / f10), (double) (((float) iArr[0]) / f10), (double) (((float) iArr[3]) / f10), (double) (((float) iArr[2]) / f10), d10, d11);
    }

    public void v(String str) {
        if (!a("setStyleJson")) {
            nativeSetStyleJson(str);
        }
    }

    public Source w(String str) {
        if (a("getSource")) {
            return null;
        }
        return nativeGetSource(str);
    }

    public LatLng x(PointF pointF) {
        if (a("latLngForPixel")) {
            return new LatLng();
        }
        float f10 = pointF.x;
        float f11 = this.f145801f;
        return nativeLatLngForPixel(f10 / f11, pointF.y / f11);
    }

    public void y(double d10) {
        if (!a("setMaxZoom")) {
            nativeSetMaxZoom(d10);
        }
    }

    public void z(String str) {
        if (!a("setApiBaseUrl")) {
            this.f145796a.setApiBaseUrl(str);
        }
    }
}
