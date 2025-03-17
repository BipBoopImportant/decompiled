package org.maplibre.geojson.shifter;

import java.util.Arrays;
import java.util.List;
import org.maplibre.geojson.Point;

public final class CoordinateShifterManager {
    private static final CoordinateShifter DEFAULT;
    private static volatile CoordinateShifter coordinateShifter;

    static {
        AnonymousClass1 r02 = new CoordinateShifter() {
            public List<Double> shiftLonLat(double d10, double d11) {
                return Arrays.asList(new Double[]{Double.valueOf(d10), Double.valueOf(d11)});
            }

            public List<Double> shiftLonLatAlt(double d10, double d11, double d12) {
                return Double.isNaN(d12) ? Arrays.asList(new Double[]{Double.valueOf(d10), Double.valueOf(d11)}) : Arrays.asList(new Double[]{Double.valueOf(d10), Double.valueOf(d11), Double.valueOf(d12)});
            }

            public List<Double> unshiftPoint(List<Double> list) {
                return list;
            }

            public List<Double> unshiftPoint(Point point) {
                return point.coordinates();
            }
        };
        DEFAULT = r02;
        coordinateShifter = r02;
    }

    public static CoordinateShifter getCoordinateShifter() {
        return coordinateShifter;
    }

    public static boolean isUsingDefaultShifter() {
        return coordinateShifter == DEFAULT;
    }

    public static void setCoordinateShifter(CoordinateShifter coordinateShifter2) {
        if (coordinateShifter2 == null) {
            coordinateShifter2 = DEFAULT;
        }
        coordinateShifter = coordinateShifter2;
    }
}
