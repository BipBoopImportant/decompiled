package org.maplibre.android.style.sources;

import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.maplibre.geojson.Feature;
import org.maplibre.geojson.FeatureCollection;
import org.maplibre.geojson.Geometry;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001d\b\u0016\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nB\u001d\b\u0016\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0004\u0010\rJ\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0006H ¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0012\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000bH ¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u000f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H ¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u000f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H ¢\u0006\u0004\b\u001a\u0010\u001bJ&\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00140\u001c2\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001cH ¢\u0006\u0004\b\u001f\u0010 J\"\u0010!\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\u001c2\u0006\u0010\u0015\u001a\u00020\u0014H ¢\u0006\u0004\b!\u0010\"J2\u0010%\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\u001c2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010#\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u0002H ¢\u0006\u0004\b%\u0010&J\u0018\u0010(\u001a\u00020'2\u0006\u0010\u0015\u001a\u00020\u0014H ¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020\u000f2\b\u0010*\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b+\u0010\u0013J$\u0010-\u001a\u00020\u000f2\b\u0010,\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u001dH ¢\u0006\u0004\b-\u0010.J\u001a\u00100\u001a\u00020\u000f2\b\u0010/\u001a\u0004\u0018\u00010\u0006H ¢\u0006\u0004\b0\u0010\u0011J\u0012\u00101\u001a\u0004\u0018\u00010\u0006H ¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\u000fH ¢\u0006\u0004\b3\u00104¨\u00065"}, d2 = {"Lorg/maplibre/android/style/sources/GeoJsonSource;", "Lorg/maplibre/android/style/sources/Source;", "", "nativePtr", "<init>", "(J)V", "", "id", "Lorg/maplibre/android/style/sources/a;", "options", "(Ljava/lang/String;Lorg/maplibre/android/style/sources/a;)V", "Lorg/maplibre/geojson/FeatureCollection;", "features", "(Ljava/lang/String;Lorg/maplibre/geojson/FeatureCollection;)V", "geoJson", "LXH/N;", "nativeSetGeoJsonString", "(Ljava/lang/String;)V", "nativeSetFeatureCollection", "(Lorg/maplibre/geojson/FeatureCollection;)V", "Lorg/maplibre/geojson/Feature;", "feature", "nativeSetFeature", "(Lorg/maplibre/geojson/Feature;)V", "Lorg/maplibre/geojson/Geometry;", "geometry", "nativeSetGeometry", "(Lorg/maplibre/geojson/Geometry;)V", "", "", "filter", "querySourceFeatures", "([Ljava/lang/Object;)[Lorg/maplibre/geojson/Feature;", "nativeGetClusterChildren", "(Lorg/maplibre/geojson/Feature;)[Lorg/maplibre/geojson/Feature;", "limit", "offset", "nativeGetClusterLeaves", "(Lorg/maplibre/geojson/Feature;JJ)[Lorg/maplibre/geojson/Feature;", "", "nativeGetClusterExpansionZoom", "(Lorg/maplibre/geojson/Feature;)I", "featureCollection", "a", "layerId", "initialize", "(Ljava/lang/String;Ljava/lang/Object;)V", "url", "nativeSetUrl", "nativeGetUrl", "()Ljava/lang/String;", "finalize", "()V", "MapLibreAndroid_drawableRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GeoJsonSource extends Source {
    @Keep
    public GeoJsonSource(long j10) {
        super(j10);
    }

    @Keep
    private final native Feature[] nativeGetClusterChildren(Feature feature);

    @Keep
    private final native int nativeGetClusterExpansionZoom(Feature feature);

    @Keep
    private final native Feature[] nativeGetClusterLeaves(Feature feature, long j10, long j11);

    @Keep
    private final native void nativeSetFeature(Feature feature);

    @Keep
    private final native void nativeSetFeatureCollection(FeatureCollection featureCollection);

    @Keep
    private final native void nativeSetGeoJsonString(String str);

    @Keep
    private final native void nativeSetGeometry(Geometry geometry);

    @Keep
    private final native Feature[] querySourceFeatures(Object[] objArr);

    public final void a(FeatureCollection featureCollection) {
        if (!this.detached) {
            checkThread();
            if (featureCollection == null || featureCollection.features() == null) {
                nativeSetFeatureCollection(featureCollection);
            } else {
                nativeSetFeatureCollection(FeatureCollection.fromFeatures((List<Feature>) new ArrayList(featureCollection.features())));
            }
        }
    }

    /* access modifiers changed from: protected */
    @Keep
    public final native void finalize();

    /* access modifiers changed from: protected */
    @Keep
    public final native void initialize(String str, Object obj);

    /* access modifiers changed from: protected */
    @Keep
    public final native String nativeGetUrl();

    /* access modifiers changed from: protected */
    @Keep
    public final native void nativeSetUrl(String str);

    public GeoJsonSource(String str, a aVar) {
        initialize(str, aVar);
        a(FeatureCollection.fromFeatures((List<Feature>) new ArrayList()));
    }

    public GeoJsonSource(String str, FeatureCollection featureCollection) {
        initialize(str, (Object) null);
        a(featureCollection);
    }
}
