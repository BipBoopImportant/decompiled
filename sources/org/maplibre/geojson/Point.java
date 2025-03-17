package org.maplibre.geojson;

import Tc.a;
import Tc.c;
import androidx.annotation.Keep;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.f;
import java.util.List;
import org.maplibre.geojson.gson.GeoJsonAdapterFactory;
import org.maplibre.geojson.shifter.CoordinateShifterManager;

@Keep
public final class Point implements CoordinateContainer<List<Double>> {
    private static final String TYPE = "Point";
    private final BoundingBox bbox;
    private final List<Double> coordinates;
    private final String type;

    static final class GsonTypeAdapter extends BaseGeometryTypeAdapter<Point, List<Double>> {
        GsonTypeAdapter(Gson gson) {
            super(gson, new ListOfDoublesCoordinatesTypeAdapter());
        }

        /* access modifiers changed from: package-private */
        public CoordinateContainer<List<Double>> createCoordinateContainer(String str, BoundingBox boundingBox, List<Double> list) {
            if (str == null) {
                str = Point.TYPE;
            }
            return new Point(str, boundingBox, list);
        }

        public Point read(a aVar) {
            return (Point) readCoordinateContainer(aVar);
        }

        public void write(c cVar, Point point) {
            writeCoordinateContainer(cVar, point);
        }
    }

    Point(String str, BoundingBox boundingBox, List<Double> list) {
        if (str != null) {
            this.type = str;
            this.bbox = boundingBox;
            if (list == null || list.size() == 0) {
                throw new NullPointerException("Null coordinates");
            }
            this.coordinates = list;
            return;
        }
        throw new NullPointerException("Null type");
    }

    public static Point fromJson(String str) {
        f fVar = new f();
        fVar.e(GeoJsonAdapterFactory.create());
        return (Point) fVar.b().n(str, Point.class);
    }

    public static Point fromLngLat(double d10, double d11) {
        return new Point(TYPE, (BoundingBox) null, CoordinateShifterManager.getCoordinateShifter().shiftLonLat(d10, d11));
    }

    public static TypeAdapter<Point> typeAdapter(Gson gson) {
        return new GsonTypeAdapter(gson);
    }

    public double altitude() {
        if (coordinates().size() < 3) {
            return Double.NaN;
        }
        return ((Double) coordinates().get(2)).doubleValue();
    }

    public BoundingBox bbox() {
        return this.bbox;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r1 = r4.bbox;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof org.maplibre.geojson.Point
            r2 = 0
            if (r1 == 0) goto L_0x003b
            org.maplibre.geojson.Point r5 = (org.maplibre.geojson.Point) r5
            java.lang.String r1 = r4.type
            java.lang.String r3 = r5.type()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0039
            org.maplibre.geojson.BoundingBox r1 = r4.bbox
            if (r1 != 0) goto L_0x0022
            org.maplibre.geojson.BoundingBox r1 = r5.bbox()
            if (r1 != 0) goto L_0x0039
            goto L_0x002c
        L_0x0022:
            org.maplibre.geojson.BoundingBox r3 = r5.bbox()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0039
        L_0x002c:
            java.util.List<java.lang.Double> r1 = r4.coordinates
            java.util.List r5 = r5.coordinates()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L_0x0039
            goto L_0x003a
        L_0x0039:
            r0 = r2
        L_0x003a:
            return r0
        L_0x003b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: org.maplibre.geojson.Point.equals(java.lang.Object):boolean");
    }

    public boolean hasAltitude() {
        return !Double.isNaN(altitude());
    }

    public int hashCode() {
        int hashCode = (this.type.hashCode() ^ 1000003) * 1000003;
        BoundingBox boundingBox = this.bbox;
        return ((hashCode ^ (boundingBox == null ? 0 : boundingBox.hashCode())) * 1000003) ^ this.coordinates.hashCode();
    }

    public double latitude() {
        return ((Double) coordinates().get(1)).doubleValue();
    }

    public double longitude() {
        return ((Double) coordinates().get(0)).doubleValue();
    }

    public String toJson() {
        f fVar = new f();
        fVar.e(GeoJsonAdapterFactory.create());
        return fVar.b().w(this);
    }

    public String toString() {
        return "Point{type=" + this.type + ", bbox=" + this.bbox + ", coordinates=" + this.coordinates + "}";
    }

    public String type() {
        return this.type;
    }

    public List<Double> coordinates() {
        return this.coordinates;
    }

    public static Point fromLngLat(double d10, double d11, BoundingBox boundingBox) {
        return new Point(TYPE, boundingBox, CoordinateShifterManager.getCoordinateShifter().shiftLonLat(d10, d11));
    }

    public static Point fromLngLat(double d10, double d11, double d12) {
        return new Point(TYPE, (BoundingBox) null, CoordinateShifterManager.getCoordinateShifter().shiftLonLatAlt(d10, d11, d12));
    }

    public static Point fromLngLat(double d10, double d11, double d12, BoundingBox boundingBox) {
        return new Point(TYPE, boundingBox, CoordinateShifterManager.getCoordinateShifter().shiftLonLatAlt(d10, d11, d12));
    }

    static Point fromLngLat(double[] dArr) {
        if (dArr.length == 2) {
            return fromLngLat(dArr[0], dArr[1]);
        }
        if (dArr.length > 2) {
            return fromLngLat(dArr[0], dArr[1], dArr[2]);
        }
        return null;
    }
}
