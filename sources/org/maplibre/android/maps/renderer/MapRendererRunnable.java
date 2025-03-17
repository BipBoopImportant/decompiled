package org.maplibre.android.maps.renderer;

import androidx.annotation.Keep;

@Keep
class MapRendererRunnable implements Runnable {
    private final long nativePtr;

    MapRendererRunnable(long j10) {
        this.nativePtr = j10;
    }

    private native void nativeInitialize();

    /* access modifiers changed from: protected */
    public native void finalize();

    public native void run();
}
