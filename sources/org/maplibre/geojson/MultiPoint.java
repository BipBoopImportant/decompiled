package org.maplibre.geojson;

import Tc.a;
import Tc.c;
import androidx.annotation.Keep;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.f;
import java.util.ArrayList;
import java.util.List;
import org.maplibre.geojson.gson.GeoJsonAdapterFactory;

@Keep
public final class MultiPoint implements CoordinateContainer<List<Point>> {
    private static final String TYPE = "MultiPoint";
    private final BoundingBox bbox;
    private final List<Point> coordinates;
    private final String type;

    static final class GsonTypeAdapter extends BaseGeometryTypeAdapter<MultiPoint, List<Point>> {
        GsonTypeAdapter(Gson gson) {
            super(gson, new ListOfPointCoordinatesTypeAdapter());
        }

        /* access modifiers changed from: package-private */
        public CoordinateContainer<List<Point>> createCoordinateContainer(String str, BoundingBox boundingBox, List<Point> list) {
            if (str == null) {
                str = MultiPoint.TYPE;
            }
            return new MultiPoint(str, boundingBox, list);
        }

        public MultiPoint read(a aVar) {
            return (MultiPoint) readCoordinateContainer(aVar);
        }

        public void write(c cVar, MultiPoint multiPoint) {
            writeCoordinateContainer(cVar, multiPoint);
        }
    }

    MultiPoint(String str, BoundingBox boundingBox, List<Point> list) {
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

    public static MultiPoint fromJson(String str) {
        f fVar = new f();
        fVar.e(GeoJsonAdapterFactory.create());
        return (MultiPoint) fVar.b().n(str, MultiPoint.class);
    }

    public static MultiPoint fromLngLats(List<Point> list) {
        return new MultiPoint(TYPE, (BoundingBox) null, list);
    }

    public static TypeAdapter<MultiPoint> typeAdapter(Gson gson) {
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
            boolean r1 = r5 instanceof org.maplibre.geojson.MultiPoint
            r2 = 0
            if (r1 == 0) goto L_0x003b
            org.maplibre.geojson.MultiPoint r5 = (org.maplibre.geojson.MultiPoint) r5
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
            java.util.List<org.maplibre.geojson.Point> r1 = r4.coordinates
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
        throw new UnsupportedOperationException("Method not decompiled: org.maplibre.geojson.MultiPoint.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int hashCode = (this.type.hashCode() ^ 1000003) * 1000003;
        BoundingBox boundingBox = this.bbox;
        return ((hashCode ^ (boundingBox == null ? 0 : boundingBox.hashCode())) * 1000003) ^ this.coordinates.hashCode();
    }

    public String toJson() {
        f fVar = new f();
        fVar.e(GeoJsonAdapterFactory.create());
        return fVar.b().w(this);
    }

    public String toString() {
        return "MultiPoint{type=" + this.type + ", bbox=" + this.bbox + ", coordinates=" + this.coordinates + "}";
    }

    public String type() {
        return this.type;
    }

    public static MultiPoint fromLngLats(List<Point> list, BoundingBox boundingBox) {
        return new MultiPoint(TYPE, boundingBox, list);
    }

    public List<Point> coordinates() {
        return this.coordinates;
    }

    static MultiPoint fromLngLats(double[][] dArr) {
        ArrayList arrayList = new ArrayList(dArr.length);
        for (double[] fromLngLat : dArr) {
            arrayList.add(Point.fromLngLat(fromLngLat));
        }
        return new MultiPoint(TYPE, (BoundingBox) null, arrayList);
    }
}
