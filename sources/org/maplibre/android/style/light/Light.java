package org.maplibre.android.style.light;

import androidx.annotation.Keep;
import org.maplibre.android.style.layers.TransitionOptions;
import org.maplibre.android.utils.g;

public class Light {
    @Keep
    private long nativePtr;

    @Keep
    Light(long j10) {
        a();
        this.nativePtr = j10;
    }

    private void a() {
        g.a("Mbgl-Light");
    }

    @Keep
    private native String nativeGetAnchor();

    @Keep
    private native String nativeGetColor();

    @Keep
    private native TransitionOptions nativeGetColorTransition();

    @Keep
    private native float nativeGetIntensity();

    @Keep
    private native TransitionOptions nativeGetIntensityTransition();

    @Keep
    private native Position nativeGetPosition();

    @Keep
    private native TransitionOptions nativeGetPositionTransition();

    @Keep
    private native void nativeSetAnchor(String str);

    @Keep
    private native void nativeSetColor(String str);

    @Keep
    private native void nativeSetColorTransition(long j10, long j11);

    @Keep
    private native void nativeSetIntensity(float f10);

    @Keep
    private native void nativeSetIntensityTransition(long j10, long j11);

    @Keep
    private native void nativeSetPosition(Position position);

    @Keep
    private native void nativeSetPositionTransition(long j10, long j11);
}
