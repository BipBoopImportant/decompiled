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
public final class MultiLineString implements CoordinateContainer<List<List<Point>>> {
    private static final String TYPE = "MultiLineString";
    private final BoundingBox bbox;
    private final List<List<Point>> coordinates;
    private final String type;

    static final class GsonTypeAdapter extends BaseGeometryTypeAdapter<MultiLineString, List<List<Point>>> {
        GsonTypeAdapter(Gson gson) {
            super(gson, new ListOfListOfPointCoordinatesTypeAdapter());
        }

        /* access modifiers changed from: package-private */
        public CoordinateContainer<List<List<Point>>> createCoordinateContainer(String str, BoundingBox boundingBox, List<List<Point>> list) {
            if (str == null) {
                str = MultiLineString.TYPE;
            }
            return new MultiLineString(str, boundingBox, list);
        }

        public MultiLineString read(a aVar) {
            return (MultiLineString) readCoordinateContainer(aVar);
        }

        public void write(c cVar, MultiLineString multiLineString) {
            writeCoordinateContainer(cVar, multiLineString);
        }
    }

    MultiLineString(String str, BoundingBox boundingBox, List<List<Point>> list) {
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

    public static MultiLineString fromJson(String str) {
        f fVar = new f();
        fVar.e(GeoJsonAdapterFactory.create());
        return (MultiLineString) fVar.b().n(str, MultiLineString.class);
    }

    public static MultiLineString fromLineString(LineString lineString) {
        return new MultiLineString(TYPE, (BoundingBox) null, Arrays.asList(new List[]{lineString.coordinates()}));
    }

    public static MultiLineString fromLineStrings(List<LineString> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (LineString coordinates2 : list) {
            arrayList.add(coordinates2.coordinates());
        }
        return new MultiLineString(TYPE, (BoundingBox) null, arrayList);
    }

    public static MultiLineString fromLngLats(List<List<Point>> list) {
        return new MultiLineString(TYPE, (BoundingBox) null, list);
    }

    public static TypeAdapter<MultiLineString> typeAdapter(Gson gson) {
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
            boolean r1 = r5 instanceof org.maplibre.geojson.MultiLineString
            r2 = 0
            if (r1 == 0) goto L_0x003b
            org.maplibre.geojson.MultiLineString r5 = (org.maplibre.geojson.MultiLineString) r5
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
        throw new UnsupportedOperationException("Method not decompiled: org.maplibre.geojson.MultiLineString.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int hashCode = (this.type.hashCode() ^ 1000003) * 1000003;
        BoundingBox boundingBox = this.bbox;
        return ((hashCode ^ (boundingBox == null ? 0 : boundingBox.hashCode())) * 1000003) ^ this.coordinates.hashCode();
    }

    public List<LineString> lineStrings() {
        List<List> coordinates2 = coordinates();
        ArrayList arrayList = new ArrayList(coordinates2.size());
        for (List fromLngLats : coordinates2) {
            arrayList.add(LineString.fromLngLats((List<Point>) fromLngLats));
        }
        return arrayList;
    }

    public String toJson() {
        f fVar = new f();
        fVar.e(GeoJsonAdapterFactory.create());
        return fVar.b().w(this);
    }

    public String toString() {
        return "MultiLineString{type=" + this.type + ", bbox=" + this.bbox + ", coordinates=" + this.coordinates + "}";
    }

    public String type() {
        return this.type;
    }

    public static MultiLineString fromLngLats(List<List<Point>> list, BoundingBox boundingBox) {
        return new MultiLineString(TYPE, boundingBox, list);
    }

    public List<List<Point>> coordinates() {
        return this.coordinates;
    }

    public static MultiLineString fromLineString(LineString lineString, BoundingBox boundingBox) {
        return new MultiLineString(TYPE, boundingBox, Arrays.asList(new List[]{lineString.coordinates()}));
    }

    static MultiLineString fromLngLats(double[][][] dArr) {
        ArrayList arrayList = new ArrayList(dArr.length);
        for (int i10 = 0; i10 < dArr.length; i10++) {
            ArrayList arrayList2 = new ArrayList(dArr[i10].length);
            int i11 = 0;
            while (true) {
                double[][] dArr2 = dArr[i10];
                if (i11 >= dArr2.length) {
                    break;
                }
                arrayList2.add(Point.fromLngLat(dArr2[i11]));
                i11++;
            }
            arrayList.add(arrayList2);
        }
        return new MultiLineString(TYPE, (BoundingBox) null, arrayList);
    }

    public static MultiLineString fromLineStrings(List<LineString> list, BoundingBox boundingBox) {
        ArrayList arrayList = new ArrayList(list.size());
        for (LineString coordinates2 : list) {
            arrayList.add(coordinates2.coordinates());
        }
        return new MultiLineString(TYPE, boundingBox, arrayList);
    }
}
