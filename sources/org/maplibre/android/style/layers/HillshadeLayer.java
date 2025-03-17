package org.maplibre.android.style.layers;

import androidx.annotation.Keep;

public class HillshadeLayer extends Layer {
    @Keep
    HillshadeLayer(long j10) {
        super(j10);
    }

    @Keep
    private native Object nativeGetHillshadeAccentColor();

    @Keep
    private native TransitionOptions nativeGetHillshadeAccentColorTransition();

    @Keep
    private native Object nativeGetHillshadeExaggeration();

    @Keep
    private native TransitionOptions nativeGetHillshadeExaggerationTransition();

    @Keep
    private native Object nativeGetHillshadeHighlightColor();

    @Keep
    private native TransitionOptions nativeGetHillshadeHighlightColorTransition();

    @Keep
    private native Object nativeGetHillshadeIlluminationAnchor();

    @Keep
    private native Object nativeGetHillshadeIlluminationDirection();

    @Keep
    private native Object nativeGetHillshadeShadowColor();

    @Keep
    private native TransitionOptions nativeGetHillshadeShadowColorTransition();

    @Keep
    private native void nativeSetHillshadeAccentColorTransition(long j10, long j11);

    @Keep
    private native void nativeSetHillshadeExaggerationTransition(long j10, long j11);

    @Keep
    private native void nativeSetHillshadeHighlightColorTransition(long j10, long j11);

    @Keep
    private native void nativeSetHillshadeShadowColorTransition(long j10, long j11);

    /* access modifiers changed from: protected */
    @Keep
    public native void finalize();

    /* access modifiers changed from: protected */
    @Keep
    public native void initialize(String str, String str2);
}
