package org.maplibre.android.style.layers;

import androidx.annotation.Keep;

public class CustomLayer extends Layer {
    @Keep
    CustomLayer(long j10) {
        super(j10);
    }

    /* access modifiers changed from: protected */
    @Keep
    public native void finalize();

    /* access modifiers changed from: protected */
    @Keep
    public native void initialize(String str, long j10);

    @Deprecated
    @Keep
    public void update() {
    }
}
