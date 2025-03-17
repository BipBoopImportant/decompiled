package org.maplibre.android.style.layers;

import androidx.annotation.Keep;

public class RasterLayer extends Layer {
    @Keep
    RasterLayer(long j10) {
        super(j10);
    }

    @Keep
    private native Object nativeGetRasterBrightnessMax();

    @Keep
    private native TransitionOptions nativeGetRasterBrightnessMaxTransition();

    @Keep
    private native Object nativeGetRasterBrightnessMin();

    @Keep
    private native TransitionOptions nativeGetRasterBrightnessMinTransition();

    @Keep
    private native Object nativeGetRasterContrast();

    @Keep
    private native TransitionOptions nativeGetRasterContrastTransition();

    @Keep
    private native Object nativeGetRasterFadeDuration();

    @Keep
    private native Object nativeGetRasterHueRotate();

    @Keep
    private native TransitionOptions nativeGetRasterHueRotateTransition();

    @Keep
    private native Object nativeGetRasterOpacity();

    @Keep
    private native TransitionOptions nativeGetRasterOpacityTransition();

    @Keep
    private native Object nativeGetRasterResampling();

    @Keep
    private native Object nativeGetRasterSaturation();

    @Keep
    private native TransitionOptions nativeGetRasterSaturationTransition();

    @Keep
    private native void nativeSetRasterBrightnessMaxTransition(long j10, long j11);

    @Keep
    private native void nativeSetRasterBrightnessMinTransition(long j10, long j11);

    @Keep
    private native void nativeSetRasterContrastTransition(long j10, long j11);

    @Keep
    private native void nativeSetRasterHueRotateTransition(long j10, long j11);

    @Keep
    private native void nativeSetRasterOpacityTransition(long j10, long j11);

    @Keep
    private native void nativeSetRasterSaturationTransition(long j10, long j11);

    /* access modifiers changed from: protected */
    @Keep
    public native void finalize();

    /* access modifiers changed from: protected */
    @Keep
    public native void initialize(String str, String str2);
}
