package ML;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.maplibre.geojson.LineString;
import org.maplibre.geojson.MultiLineString;
import org.maplibre.geojson.MultiPoint;
import org.maplibre.geojson.MultiPolygon;
import org.maplibre.geojson.Point;
import org.maplibre.geojson.Polygon;

/* renamed from: ML.b  reason: case insensitive filesystem */
public final class C16091b {
    private static List<Point> a(List<Point> list, LineString lineString) {
        list.addAll(lineString.coordinates());
        return list;
    }

    private static List<Point> b(List<Point> list, MultiLineString multiLineString) {
        for (int i10 = 0; i10 < multiLineString.coordinates().size(); i10++) {
            list.addAll((Collection) multiLineString.coordinates().get(i10));
        }
        return list;
    }

    private static List<Point> c(List<Point> list, MultiPoint multiPoint) {
        list.addAll(multiPoint.coordinates());
        return list;
    }

    private static List<Point> d(List<Point> list, MultiPolygon multiPolygon, boolean z10) {
        for (int i10 = 0; i10 < multiPolygon.coordinates().size(); i10++) {
            for (int i11 = 0; i11 < ((List) multiPolygon.coordinates().get(i10)).size(); i11++) {
                for (int i12 = 0; i12 < ((List) ((List) multiPolygon.coordinates().get(i10)).get(i11)).size() - (z10 ? 1 : 0); i12++) {
                    list.add(((List) ((List) multiPolygon.coordinates().get(i10)).get(i11)).get(i12));
                }
            }
        }
        return list;
    }

    private static List<Point> e(List<Point> list, Point point) {
        list.add(point);
        return list;
    }

    private static List<Point> f(List<Point> list, Polygon polygon, boolean z10) {
        for (int i10 = 0; i10 < polygon.coordinates().size(); i10++) {
            for (int i11 = 0; i11 < ((List) polygon.coordinates().get(i10)).size() - (z10 ? 1 : 0); i11++) {
                list.add(((List) polygon.coordinates().get(i10)).get(i11));
            }
        }
        return list;
    }

    public static List<Point> g(LineString lineString) {
        return a(new ArrayList(), lineString);
    }

    public static List<Point> h(MultiLineString multiLineString) {
        return b(new ArrayList(), multiLineString);
    }

    public static List<Point> i(MultiPoint multiPoint) {
        return c(new ArrayList(), multiPoint);
    }

    public static List<Point> j(MultiPolygon multiPolygon, boolean z10) {
        return d(new ArrayList(), multiPolygon, z10);
    }

    public static List<Point> k(Point point) {
        return e(new ArrayList(), point);
    }

    public static List<Point> l(Polygon polygon, boolean z10) {
        return f(new ArrayList(), polygon, z10);
    }
}
