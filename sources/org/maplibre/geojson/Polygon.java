package org.maplibre.geojson;

import Tc.a;
import Tc.c;
import androidx.annotation.Keep;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.f;
import java.util.ArrayList;
import java.util.List;
import org.maplibre.geojson.exception.GeoJsonException;
import org.maplibre.geojson.gson.GeoJsonAdapterFactory;

@Keep
public final class Polygon implements CoordinateContainer<List<List<Point>>> {
    private static final String TYPE = "Polygon";
    private final BoundingBox bbox;
    private final List<List<Point>> coordinates;
    private final String type;

    static final class GsonTypeAdapter extends BaseGeometryTypeAdapter<Polygon, List<List<Point>>> {
        GsonTypeAdapter(Gson gson) {
            super(gson, new ListOfListOfPointCoordinatesTypeAdapter());
        }

        /* access modifiers changed from: package-private */
        public CoordinateContainer<List<List<Point>>> createCoordinateContainer(String str, BoundingBox boundingBox, List<List<Point>> list) {
            if (str == null) {
                str = Polygon.TYPE;
            }
            return new Polygon(str, boundingBox, list);
        }

        public Polygon read(a aVar) {
            return (Polygon) readCoordinateContainer(aVar);
        }

        public void write(c cVar, Polygon polygon) {
            writeCoordinateContainer(cVar, polygon);
        }
    }

    Polygon(String str, BoundingBox boundingBox, List<List<Point>> list) {
        if (str != null) {
            this.type = str;
            this.bbox = boundingBox;
            if (list != null) {
                this.coordinates = list;
                return;
            }
            throw new NullPointerException("Null coordinates");
        }
        throw new NullPointerException("Null type");
    }

    private static void ensureIsLinearRing(LineString lineString) {
        if (lineString.coordinates().size() < 4) {
            throw new GeoJsonException("LinearRings need to be made up of 4 or more coordinates.");
        } else if (!((Point) lineString.coordinates().get(0)).equals(lineString.coordinates().get(lineString.coordinates().size() - 1))) {
            throw new GeoJsonException("LinearRings require first and last coordinate to be identical.");
        }
    }

    public static Polygon fromJson(String str) {
        f fVar = new f();
        fVar.e(GeoJsonAdapterFactory.create());
        return (Polygon) fVar.b().n(str, Polygon.class);
    }

    public static Polygon fromLngLats(List<List<Point>> list) {
        return new Polygon(TYPE, (BoundingBox) null, list);
    }

    public static Polygon fromOuterInner(LineString lineString, LineString... lineStringArr) {
        ensureIsLinearRing(lineString);
        ArrayList arrayList = new ArrayList();
        arrayList.add(lineString.coordinates());
        if (lineStringArr == null) {
            return new Polygon(TYPE, (BoundingBox) null, arrayList);
        }
        for (LineString lineString2 : lineStringArr) {
            ensureIsLinearRing(lineString2);
            arrayList.add(lineString2.coordinates());
        }
        return new Polygon(TYPE, (BoundingBox) null, arrayList);
    }

    public static TypeAdapter<Polygon> typeAdapter(Gson gson) {
        return new GsonTypeAdapter(gson);
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
            boolean r1 = r5 instanceof org.maplibre.geojson.Polygon
            r2 = 0
            if (r1 == 0) goto L_0x003b
            org.maplibre.geojson.Polygon r5 = (org.maplibre.geojson.Polygon) r5
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
            java.util.List<java.util.List<org.maplibre.geojson.Point>> r1 = r4.coordinates
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
        throw new UnsupportedOperationException("Method not decompiled: org.maplibre.geojson.Polygon.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int hashCode = (this.type.hashCode() ^ 1000003) * 1000003;
        BoundingBox boundingBox = this.bbox;
        return ((hashCode ^ (boundingBox == null ? 0 : boundingBox.hashCode())) * 1000003) ^ this.coordinates.hashCode();
    }

    public List<LineString> inner() {
        List coordinates2 = coordinates();
        if (coordinates2.size() <= 1) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(coordinates2.size() - 1);
        for (List fromLngLats : coordinates2.subList(1, coordinates2.size())) {
            arrayList.add(LineString.fromLngLats((List<Point>) fromLngLats));
        }
        return arrayList;
    }

    public LineString outer() {
        return LineString.fromLngLats((List<Point>) (List) coordinates().get(0));
    }

    public String toJson() {
        f fVar = new f();
        fVar.e(GeoJsonAdapterFactory.create());
        return fVar.b().w(this);
    }

    public String toString() {
        return "Polygon{type=" + this.type + ", bbox=" + this.bbox + ", coordinates=" + this.coordinates + "}";
    }

    public String type() {
        return this.type;
    }

    public static Polygon fromLngLats(List<List<Point>> list, BoundingBox boundingBox) {
        return new Polygon(TYPE, boundingBox, list);
    }

    public List<List<Point>> coordinates() {
        return this.coordinates;
    }

    static Polygon fromLngLats(double[][][] dArr) {
        ArrayList arrayList = new ArrayList(dArr.length);
        for (double[][] dArr2 : dArr) {
            ArrayList arrayList2 = new ArrayList(dArr2.length);
            for (double[] fromLngLat : dArr2) {
                arrayList2.add(Point.fromLngLat(fromLngLat));
            }
            arrayList.add(arrayList2);
        }
        return new Polygon(TYPE, (BoundingBox) null, arrayList);
    }

    public static Polygon fromOuterInner(LineString lineString, BoundingBox boundingBox, LineString... lineStringArr) {
        ensureIsLinearRing(lineString);
        ArrayList arrayList = new ArrayList();
        arrayList.add(lineString.coordinates());
        if (lineStringArr == null) {
            return new Polygon(TYPE, boundingBox, arrayList);
        }
        for (LineString lineString2 : lineStringArr) {
            ensureIsLinearRing(lineString2);
            arrayList.add(lineString2.coordinates());
        }
        return new Polygon(TYPE, boundingBox, arrayList);
    }

    public static Polygon fromOuterInner(LineString lineString, List<LineString> list) {
        ensureIsLinearRing(lineString);
        ArrayList arrayList = new ArrayList();
        arrayList.add(lineString.coordinates());
        if (list == null || list.isEmpty()) {
            return new Polygon(TYPE, (BoundingBox) null, arrayList);
        }
        for (LineString next : list) {
            ensureIsLinearRing(next);
            arrayList.add(next.coordinates());
        }
        return new Polygon(TYPE, (BoundingBox) null, arrayList);
    }

    public static Polygon fromOuterInner(LineString lineString, BoundingBox boundingBox, List<LineString> list) {
        ensureIsLinearRing(lineString);
        ArrayList arrayList = new ArrayList();
        arrayList.add(lineString.coordinates());
        if (list == null) {
            return new Polygon(TYPE, boundingBox, arrayList);
        }
        for (LineString next : list) {
            ensureIsLinearRing(next);
            arrayList.add(next.coordinates());
        }
        return new Polygon(TYPE, boundingBox, arrayList);
    }
}
