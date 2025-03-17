package org.maplibre.geojson;

import Tc.a;
import Tc.c;
import androidx.annotation.Keep;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.maplibre.geojson.gson.GeoJsonAdapterFactory;

@Keep
public final class MultiPolygon implements CoordinateContainer<List<List<List<Point>>>> {
    private static final String TYPE = "MultiPolygon";
    private final BoundingBox bbox;
    private final List<List<List<Point>>> coordinates;
    private final String type;

    static final class GsonTypeAdapter extends BaseGeometryTypeAdapter<MultiPolygon, List<List<List<Point>>>> {
        GsonTypeAdapter(Gson gson) {
            super(gson, new ListofListofListOfPointCoordinatesTypeAdapter());
        }

        /* access modifiers changed from: package-private */
        public CoordinateContainer<List<List<List<Point>>>> createCoordinateContainer(String str, BoundingBox boundingBox, List<List<List<Point>>> list) {
            if (str == null) {
                str = MultiPolygon.TYPE;
            }
            return new MultiPolygon(str, boundingBox, list);
        }

        public MultiPolygon read(a aVar) {
            return (MultiPolygon) readCoordinateContainer(aVar);
        }

        public void write(c cVar, MultiPolygon multiPolygon) {
            writeCoordinateContainer(cVar, multiPolygon);
        }
    }

    MultiPolygon(String str, BoundingBox boundingBox, List<List<List<Point>>> list) {
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

    public static MultiPolygon fromJson(String str) {
        f fVar = new f();
        fVar.e(GeoJsonAdapterFactory.create());
        return (MultiPolygon) fVar.b().n(str, MultiPolygon.class);
    }

    public static MultiPolygon fromLngLats(List<List<List<Point>>> list) {
        return new MultiPolygon(TYPE, (BoundingBox) null, list);
    }

    public static MultiPolygon fromPolygon(Polygon polygon) {
        return new MultiPolygon(TYPE, (BoundingBox) null, Arrays.asList(new List[]{polygon.coordinates()}));
    }

    public static MultiPolygon fromPolygons(List<Polygon> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (Polygon coordinates2 : list) {
            arrayList.add(coordinates2.coordinates());
        }
        return new MultiPolygon(TYPE, (BoundingBox) null, arrayList);
    }

    public static TypeAdapter<MultiPolygon> typeAdapter(Gson gson) {
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
            boolean r1 = r5 instanceof org.maplibre.geojson.MultiPolygon
            r2 = 0
            if (r1 == 0) goto L_0x003b
            org.maplibre.geojson.MultiPolygon r5 = (org.maplibre.geojson.MultiPolygon) r5
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
            java.util.List<java.util.List<java.util.List<org.maplibre.geojson.Point>>> r1 = r4.coordinates
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
        throw new UnsupportedOperationException("Method not decompiled: org.maplibre.geojson.MultiPolygon.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int hashCode = (this.type.hashCode() ^ 1000003) * 1000003;
        BoundingBox boundingBox = this.bbox;
        return ((hashCode ^ (boundingBox == null ? 0 : boundingBox.hashCode())) * 1000003) ^ this.coordinates.hashCode();
    }

    public List<Polygon> polygons() {
        List<List> coordinates2 = coordinates();
        ArrayList arrayList = new ArrayList(coordinates2.size());
        for (List fromLngLats : coordinates2) {
            arrayList.add(Polygon.fromLngLats((List<List<Point>>) fromLngLats));
        }
        return arrayList;
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

    public static MultiPolygon fromLngLats(List<List<List<Point>>> list, BoundingBox boundingBox) {
        return new MultiPolygon(TYPE, boundingBox, list);
    }

    public List<List<List<Point>>> coordinates() {
        return this.coordinates;
    }

    static MultiPolygon fromLngLats(double[][][][] dArr) {
        ArrayList arrayList = new ArrayList(dArr.length);
        for (int i10 = 0; i10 < dArr.length; i10++) {
            ArrayList arrayList2 = new ArrayList(dArr[i10].length);
            for (int i11 = 0; i11 < dArr[i10].length; i11++) {
                ArrayList arrayList3 = new ArrayList(dArr[i10][i11].length);
                int i12 = 0;
                while (true) {
                    double[][] dArr2 = dArr[i10][i11];
                    if (i12 >= dArr2.length) {
                        break;
                    }
                    arrayList3.add(Point.fromLngLat(dArr2[i12]));
                    i12++;
                }
                arrayList2.add(arrayList3);
            }
            arrayList.add(arrayList2);
        }
        return new MultiPolygon(TYPE, (BoundingBox) null, arrayList);
    }

    public static MultiPolygon fromPolygon(Polygon polygon, BoundingBox boundingBox) {
        return new MultiPolygon(TYPE, boundingBox, Arrays.asList(new List[]{polygon.coordinates()}));
    }

    public static MultiPolygon fromPolygons(List<Polygon> list, BoundingBox boundingBox) {
        ArrayList arrayList = new ArrayList(list.size());
        for (Polygon coordinates2 : list) {
            arrayList.add(coordinates2.coordinates());
        }
        return new MultiPolygon(TYPE, boundingBox, arrayList);
    }
}
