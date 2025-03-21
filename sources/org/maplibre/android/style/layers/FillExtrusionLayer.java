package org.maplibre.android.style.layers;

import androidx.annotation.Keep;

public class FillExtrusionLayer extends Layer {
    @Keep
    FillExtrusionLayer(long j10) {
        super(j10);
    }

    @Keep
    private native Object nativeGetFillExtrusionBase();

    @Keep
    private native TransitionOptions nativeGetFillExtrusionBaseTransition();

    @Keep
    private native Object nativeGetFillExtrusionColor();

    @Keep
    private native TransitionOptions nativeGetFillExtrusionColorTransition();

    @Keep
    private native Object nativeGetFillExtrusionHeight();

    @Keep
    private native TransitionOptions nativeGetFillExtrusionHeightTransition();

    @Keep
    private native Object nativeGetFillExtrusionOpacity();

    @Keep
    private native TransitionOptions nativeGetFillExtrusionOpacityTransition();

    @Keep
    private native Object nativeGetFillExtrusionPattern();

    @Keep
    private native TransitionOptions nativeGetFillExtrusionPatternTransition();

    @Keep
    private native Object nativeGetFillExtrusionTranslate();

    @Keep
    private native Object nativeGetFillExtrusionTranslateAnchor();

    @Keep
    private native TransitionOptions nativeGetFillExtrusionTranslateTransition();

    @Keep
    private native Object nativeGetFillExtrusionVerticalGradient();

    @Keep
    private native void nativeSetFillExtrusionBaseTransition(long j10, long j11);

    @Keep
    private native void nativeSetFillExtrusionColorTransition(long j10, long j11);

    @Keep
    private native void nativeSetFillExtrusionHeightTransition(long j10, long j11);

    @Keep
    private native void nativeSetFillExtrusionOpacityTransition(long j10, long j11);

    @Keep
    private native void nativeSetFillExtrusionPatternTransition(long j10, long j11);

    @Keep
    private native void nativeSetFillExtrusionTranslateTransition(long j10, long j11);

    /* access modifiers changed from: protected */
    @Keep
    public native void finalize();

    /* access modifiers changed from: protected */
    @Keep
    public native void initialize(String str, String str2);
}
