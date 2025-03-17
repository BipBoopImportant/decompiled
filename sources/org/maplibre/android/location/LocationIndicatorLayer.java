package org.maplibre.android.location;

import androidx.annotation.Keep;
import org.maplibre.android.style.layers.Layer;
import org.maplibre.android.style.layers.TransitionOptions;

class LocationIndicatorLayer extends Layer {
    @Keep
    LocationIndicatorLayer(long j10) {
        super(j10);
    }

    @Keep
    private native Object nativeGetAccuracyRadius();

    @Keep
    private native Object nativeGetAccuracyRadiusBorderColor();

    @Keep
    private native TransitionOptions nativeGetAccuracyRadiusBorderColorTransition();

    @Keep
    private native Object nativeGetAccuracyRadiusColor();

    @Keep
    private native TransitionOptions nativeGetAccuracyRadiusColorTransition();

    @Keep
    private native TransitionOptions nativeGetAccuracyRadiusTransition();

    @Keep
    private native Object nativeGetBearing();

    @Keep
    private native Object nativeGetBearingImage();

    @Keep
    private native Object nativeGetBearingImageSize();

    @Keep
    private native TransitionOptions nativeGetBearingImageSizeTransition();

    @Keep
    private native TransitionOptions nativeGetBearingTransition();

    @Keep
    private native Object nativeGetImageTiltDisplacement();

    @Keep
    private native Object nativeGetLocation();

    @Keep
    private native TransitionOptions nativeGetLocationTransition();

    @Keep
    private native Object nativeGetPerspectiveCompensation();

    @Keep
    private native Object nativeGetShadowImage();

    @Keep
    private native Object nativeGetShadowImageSize();

    @Keep
    private native TransitionOptions nativeGetShadowImageSizeTransition();

    @Keep
    private native Object nativeGetTopImage();

    @Keep
    private native Object nativeGetTopImageSize();

    @Keep
    private native TransitionOptions nativeGetTopImageSizeTransition();

    @Keep
    private native void nativeSetAccuracyRadiusBorderColorTransition(long j10, long j11);

    @Keep
    private native void nativeSetAccuracyRadiusColorTransition(long j10, long j11);

    @Keep
    private native void nativeSetAccuracyRadiusTransition(long j10, long j11);

    @Keep
    private native void nativeSetBearingImageSizeTransition(long j10, long j11);

    @Keep
    private native void nativeSetBearingTransition(long j10, long j11);

    @Keep
    private native void nativeSetLocationTransition(long j10, long j11);

    @Keep
    private native void nativeSetShadowImageSizeTransition(long j10, long j11);

    @Keep
    private native void nativeSetTopImageSizeTransition(long j10, long j11);

    /* access modifiers changed from: protected */
    @Keep
    public native void finalize();

    /* access modifiers changed from: protected */
    @Keep
    public native void initialize(String str);
}
