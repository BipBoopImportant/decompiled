package ML;

import java.util.ArrayList;
import java.util.List;
import org.maplibre.geojson.Geometry;
import org.maplibre.geojson.GeometryCollection;
import org.maplibre.geojson.LineString;
import org.maplibre.geojson.MultiLineString;
import org.maplibre.geojson.MultiPoint;
import org.maplibre.geojson.MultiPolygon;
import org.maplibre.geojson.Point;
import org.maplibre.geojson.Polygon;

/* renamed from: ML.a  reason: case insensitive filesystem */
public final class C16090a {
    public static double[] a(Geometry geometry) {
        if (geometry instanceof Point) {
            return f((Point) geometry);
        }
        if (geometry instanceof MultiPoint) {
            return d((MultiPoint) geometry);
        }
        if (geometry instanceof LineString) {
            return b((LineString) geometry);
        }
        if (geometry instanceof MultiLineString) {
            return c((MultiLineString) geometry);
        }
        if (geometry instanceof Polygon) {
            return g((Polygon) geometry);
        }
        if (geometry instanceof MultiPolygon) {
            return e((MultiPolygon) geometry);
        }
        if (geometry instanceof GeometryCollection) {
            ArrayList arrayList = new ArrayList();
            for (Geometry a10 : ((GeometryCollection) geometry).geometries()) {
                double[] a11 = a(a10);
                arrayList.add(Point.fromLngLat(a11[0], a11[1]));
                arrayList.add(Point.fromLngLat(a11[2], a11[1]));
                arrayList.add(Point.fromLngLat(a11[2], a11[3]));
                arrayList.add(Point.fromLngLat(a11[0], a11[3]));
            }
            return d(MultiPoint.fromLngLats((List<Point>) arrayList));
        }
        throw new RuntimeException("Unknown geometry class: " + geometry.getClass());
    }

    public static double[] b(LineString lineString) {
        return h(C16091b.g(lineString));
    }

    public static double[] c(MultiLineString multiLineString) {
        return h(C16091b.h(multiLineString));
    }

    public static double[] d(MultiPoint multiPoint) {
        return h(C16091b.i(multiPoint));
    }

    public static double[] e(MultiPolygon multiPolygon) {
        return h(C16091b.j(multiPolygon, false));
    }

    public static double[] f(Point point) {
        return h(C16091b.k(point));
    }

    public static double[] g(Polygon polygon) {
        return h(C16091b.l(polygon, false));
    }

    private static double[] h(List<Point> list) {
        double[] dArr = {Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY};
        for (Point next : list) {
            if (dArr[0] > next.longitude()) {
                dArr[0] = next.longitude();
            }
            if (dArr[1] > next.latitude()) {
                dArr[1] = next.latitude();
            }
            if (dArr[2] < next.longitude()) {
                dArr[2] = next.longitude();
            }
            if (dArr[3] < next.latitude()) {
                dArr[3] = next.latitude();
            }
        }
        return dArr;
    }
}
