package org.maplibre.geojson.utils;

public class GeoJsonUtils {
    private static long MAX_DOUBLE_TO_ROUND = ((long) (9.223372036854776E18d / 1.0E7d));
    private static double ROUND_PRECISION = 1.0E7d;

    public static double trim(double d10) {
        long j10 = MAX_DOUBLE_TO_ROUND;
        return (d10 > ((double) j10) || d10 < ((double) (-j10))) ? d10 : ((double) Math.round(d10 * ROUND_PRECISION)) / ROUND_PRECISION;
    }
}
