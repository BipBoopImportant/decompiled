package org.maplibre.android.maps.renderer;

import androidx.annotation.Keep;

public interface MapRendererScheduler {
    @Keep
    void queueEvent(Runnable runnable);

    @Keep
    void requestRender();

    @Keep
    void waitForEmpty();
}
