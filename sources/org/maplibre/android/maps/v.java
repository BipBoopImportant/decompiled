package org.maplibre.android.maps;

import LL.C16031a;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.List;
import org.maplibre.android.annotations.Marker;
import org.maplibre.android.camera.CameraPosition;
import org.maplibre.android.geometry.LatLng;
import org.maplibre.android.geometry.LatLngBounds;
import org.maplibre.android.style.layers.Layer;
import org.maplibre.android.style.layers.TransitionOptions;
import org.maplibre.android.style.sources.Source;
import org.maplibre.geojson.Feature;
import org.maplibre.geojson.Geometry;

interface v {
    double A(String str);

    void B(double d10);

    long C(Marker marker);

    void D(Image[] imageArr);

    void E(boolean z10);

    void F(String str);

    void G(LatLng latLng, double d10, double d11, double d12, double[] dArr, long j10, boolean z10);

    RectF H(RectF rectF);

    double I();

    void J(TransitionOptions transitionOptions);

    PointF K(LatLng latLng);

    void L(double d10, long j10);

    void M(double d10);

    void N(boolean z10);

    void O(double d10, double d11, double d12, long j10);

    double P(double d10);

    long[] Q(RectF rectF);

    void R(Layer layer, String str);

    void S(int i10, int i11);

    void T(String str, int i10, int i11, float f10, byte[] bArr);

    void U(Layer layer, int i10);

    void V(Layer layer);

    void W(Source source);

    void X(LatLng latLng, double d10, double d11, double d12, double[] dArr);

    String Y();

    List<Feature> Z(PointF pointF, String[] strArr, C16031a aVar);

    void a0(LatLngBounds latLngBounds);

    void b0(double d10);

    void c0(double d10, double d11, long j10);

    CameraPosition d0(Geometry geometry, int[] iArr, double d10, double d11);

    double e0();

    void f0(String str);

    double g0();

    float getPixelRatio();

    long[] h0(RectF rectF);

    void i0(boolean z10);

    boolean isDestroyed();

    void j0(double d10, PointF pointF, long j10);

    void k0(int i10);

    CameraPosition p();

    void q();

    List<Source> r();

    void s(Layer layer, String str);

    void t(long j10);

    CameraPosition u(LatLngBounds latLngBounds, int[] iArr, double d10, double d11);

    void v(String str);

    Source w(String str);

    LatLng x(PointF pointF);

    void y(double d10);

    void z(String str);
}
