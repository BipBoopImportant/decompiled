package org.maplibre.android.style.sources;

import android.graphics.Bitmap;
import androidx.annotation.Keep;
import kotlin.Metadata;
import org.maplibre.android.geometry.LatLngQuad;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH ¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\u0006H ¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006H ¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H ¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\bH ¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\nH ¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lorg/maplibre/android/style/sources/ImageSource;", "Lorg/maplibre/android/style/sources/Source;", "", "nativePtr", "<init>", "(J)V", "", "layerId", "Lorg/maplibre/android/geometry/LatLngQuad;", "payload", "LXH/N;", "initialize", "(Ljava/lang/String;Lorg/maplibre/android/geometry/LatLngQuad;)V", "url", "nativeSetUrl", "(Ljava/lang/String;)V", "nativeGetUrl", "()Ljava/lang/String;", "Landroid/graphics/Bitmap;", "bitmap", "nativeSetImage", "(Landroid/graphics/Bitmap;)V", "latLngQuad", "nativeSetCoordinates", "(Lorg/maplibre/android/geometry/LatLngQuad;)V", "finalize", "()V", "MapLibreAndroid_drawableRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ImageSource extends Source {
    @Keep
    public ImageSource(long j10) {
        super(j10);
    }

    /* access modifiers changed from: protected */
    @Keep
    public final native void finalize();

    /* access modifiers changed from: protected */
    @Keep
    public final native void initialize(String str, LatLngQuad latLngQuad);

    /* access modifiers changed from: protected */
    @Keep
    public final native String nativeGetUrl();

    /* access modifiers changed from: protected */
    @Keep
    public final native void nativeSetCoordinates(LatLngQuad latLngQuad);

    /* access modifiers changed from: protected */
    @Keep
    public final native void nativeSetImage(Bitmap bitmap);

    /* access modifiers changed from: protected */
    @Keep
    public final native void nativeSetUrl(String str);
}
