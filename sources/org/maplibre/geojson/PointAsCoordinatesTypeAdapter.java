package org.maplibre.geojson;

import Tc.a;
import Tc.c;
import androidx.annotation.Keep;

@Keep
public class PointAsCoordinatesTypeAdapter extends BaseCoordinatesTypeAdapter<Point> {
    public Point read(a aVar) {
        return readPoint(aVar);
    }

    public void write(c cVar, Point point) {
        writePoint(cVar, point);
    }
}
