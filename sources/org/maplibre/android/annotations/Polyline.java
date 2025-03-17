package org.maplibre.android.annotations;

import androidx.annotation.Keep;

@Deprecated
public final class Polyline extends BasePointCollection {
    @Keep
    private int color = -16777216;
    @Keep
    private float width = 10.0f;

    Polyline() {
    }
}
