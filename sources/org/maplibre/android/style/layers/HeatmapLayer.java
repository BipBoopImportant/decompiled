package org.maplibre.android.style.layers;

import androidx.annotation.Keep;

public class HeatmapLayer extends Layer {
    @Keep
    HeatmapLayer(long j10) {
        super(j10);
    }

    @Keep
    private native Object nativeGetHeatmapColor();

    @Keep
    private native Object nativeGetHeatmapIntensity();

    @Keep
    private native TransitionOptions nativeGetHeatmapIntensityTransition();

    @Keep
    private native Object nativeGetHeatmapOpacity();

    @Keep
    private native TransitionOptions nativeGetHeatmapOpacityTransition();

    @Keep
    private native Object nativeGetHeatmapRadius();

    @Keep
    private native TransitionOptions nativeGetHeatmapRadiusTransition();

    @Keep
    private native Object nativeGetHeatmapWeight();

    @Keep
    private native void nativeSetHeatmapIntensityTransition(long j10, long j11);

    @Keep
    private native void nativeSetHeatmapOpacityTransition(long j10, long j11);

    @Keep
    private native void nativeSetHeatmapRadiusTransition(long j10, long j11);

    /* access modifiers changed from: protected */
    @Keep
    public native void finalize();

    /* access modifiers changed from: protected */
    @Keep
    public native void initialize(String str, String str2);
}
