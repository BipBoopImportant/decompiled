package org.maplibre.geojson;

import androidx.annotation.Keep;

@Keep
public interface CoordinateContainer<T> extends Geometry {
    T coordinates();
}
