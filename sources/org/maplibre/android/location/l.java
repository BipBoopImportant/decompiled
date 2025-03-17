package org.maplibre.android.location;

import android.location.Location;
import org.maplibre.android.maps.o;

public final class l {
    static float a(o oVar, Location location) {
        if (location == null) {
            return 0.0f;
        }
        return (float) (((double) location.getAccuracy()) * (1.0d / oVar.s().c(location.getLatitude())));
    }
}
