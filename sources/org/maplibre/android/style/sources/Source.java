package org.maplibre.android.style.sources;

import androidx.annotation.Keep;
import org.maplibre.android.a;
import org.maplibre.android.utils.g;

public abstract class Source {
    private static final String TAG = "Mbgl-Source";
    protected boolean detached;
    @Keep
    private long nativePtr;

    static {
        a.a();
    }

    @Keep
    protected Source(long j10) {
        checkThread();
        this.nativePtr = j10;
    }

    /* access modifiers changed from: protected */
    public void checkThread() {
        g.a(TAG);
    }

    public String getAttribution() {
        checkThread();
        return nativeGetAttribution();
    }

    public String getId() {
        checkThread();
        return nativeGetId();
    }

    public Integer getMaxOverscaleFactorForParentTiles() {
        return nativeGetMaxOverscaleFactorForParentTiles();
    }

    public Long getMinimumTileUpdateInterval() {
        return nativeGetMinimumTileUpdateInterval();
    }

    public long getNativePtr() {
        return this.nativePtr;
    }

    public Integer getPrefetchZoomDelta() {
        return nativeGetPrefetchZoomDelta();
    }

    public Boolean isVolatile() {
        return nativeIsVolatile();
    }

    /* access modifiers changed from: protected */
    @Keep
    public native String nativeGetAttribution();

    /* access modifiers changed from: protected */
    @Keep
    public native String nativeGetId();

    /* access modifiers changed from: protected */
    @Keep
    public native Integer nativeGetMaxOverscaleFactorForParentTiles();

    /* access modifiers changed from: protected */
    @Keep
    public native Long nativeGetMinimumTileUpdateInterval();

    /* access modifiers changed from: protected */
    @Keep
    public native Integer nativeGetPrefetchZoomDelta();

    /* access modifiers changed from: protected */
    @Keep
    public native Boolean nativeIsVolatile();

    /* access modifiers changed from: protected */
    @Keep
    public native void nativeSetMaxOverscaleFactorForParentTiles(Integer num);

    /* access modifiers changed from: protected */
    @Keep
    public native void nativeSetMinimumTileUpdateInterval(Long l10);

    /* access modifiers changed from: protected */
    @Keep
    public native void nativeSetPrefetchZoomDelta(Integer num);

    /* access modifiers changed from: protected */
    @Keep
    public native void nativeSetVolatile(Boolean bool);

    public void setDetached() {
        this.detached = true;
    }

    public void setMaxOverscaleFactorForParentTiles(Integer num) {
        nativeSetMaxOverscaleFactorForParentTiles(num);
    }

    public void setMinimumTileUpdateInterval(Long l10) {
        nativeSetMinimumTileUpdateInterval(l10);
    }

    public void setPrefetchZoomDelta(Integer num) {
        nativeSetPrefetchZoomDelta(num);
    }

    public void setVolatile(Boolean bool) {
        nativeSetVolatile(bool);
    }

    public Source() {
        checkThread();
    }
}
