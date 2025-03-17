package org.maplibre.geojson;

import androidx.annotation.Keep;
import java.io.Serializable;

@Keep
public interface GeoJson extends Serializable {
    BoundingBox bbox();

    String toJson();

    String type();
}
