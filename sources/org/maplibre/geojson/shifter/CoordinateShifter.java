package org.maplibre.geojson.shifter;

import java.util.List;
import org.maplibre.geojson.Point;

public interface CoordinateShifter {
    List<Double> shiftLonLat(double d10, double d11);

    List<Double> shiftLonLatAlt(double d10, double d11, double d12);

    List<Double> unshiftPoint(List<Double> list);

    List<Double> unshiftPoint(Point point);
}
