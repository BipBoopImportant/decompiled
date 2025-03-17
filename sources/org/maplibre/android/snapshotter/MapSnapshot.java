package org.maplibre.android.snapshotter;

import android.graphics.Bitmap;
import android.graphics.PointF;
import androidx.annotation.Keep;
import kotlin.Metadata;
import org.maplibre.android.geometry.LatLng;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001B/\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rH ¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H ¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u0012H ¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\rH ¢\u0006\u0004\b\u0018\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\"\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010$¨\u0006%"}, d2 = {"Lorg/maplibre/android/snapshotter/MapSnapshot;", "", "", "nativePtr", "Landroid/graphics/Bitmap;", "bitmap", "", "", "attributions", "", "showLogo", "<init>", "(JLandroid/graphics/Bitmap;[Ljava/lang/String;Z)V", "LXH/N;", "initialize", "()V", "Lorg/maplibre/android/geometry/LatLng;", "latLng", "Landroid/graphics/PointF;", "pixelForLatLng", "(Lorg/maplibre/android/geometry/LatLng;)Landroid/graphics/PointF;", "pointF", "latLngForPixel", "(Landroid/graphics/PointF;)Lorg/maplibre/android/geometry/LatLng;", "finalize", "J", "getNativePtr", "()J", "Landroid/graphics/Bitmap;", "getBitmap", "()Landroid/graphics/Bitmap;", "[Ljava/lang/String;", "getAttributions", "()[Ljava/lang/String;", "isShowLogo", "Z", "()Z", "MapLibreAndroid_drawableRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Keep
public final class MapSnapshot {
    private final String[] attributions;
    private final Bitmap bitmap;
    private final boolean isShowLogo;
    private final long nativePtr;

    private MapSnapshot(long j10, Bitmap bitmap2, String[] strArr, boolean z10) {
        this.nativePtr = j10;
        this.bitmap = bitmap2;
        this.attributions = strArr;
        this.isShowLogo = z10;
    }

    @Keep
    private final native void initialize();

    /* access modifiers changed from: protected */
    @Keep
    public final native void finalize();

    public final String[] getAttributions() {
        return this.attributions;
    }

    public final Bitmap getBitmap() {
        return this.bitmap;
    }

    public final long getNativePtr() {
        return this.nativePtr;
    }

    public final boolean isShowLogo() {
        return this.isShowLogo;
    }

    @Keep
    public final native LatLng latLngForPixel(PointF pointF);

    @Keep
    public final native PointF pixelForLatLng(LatLng latLng);
}
