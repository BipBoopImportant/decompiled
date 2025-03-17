package org.maplibre.geojson;

import Tc.a;
import Tc.b;
import Tc.c;
import androidx.annotation.Keep;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.f;
import com.google.gson.reflect.TypeToken;
import java.util.Arrays;
import java.util.List;
import org.maplibre.geojson.gson.GeoJsonAdapterFactory;

@Keep
public final class GeometryCollection implements Geometry {
    private static final String TYPE = "GeometryCollection";
    private final BoundingBox bbox;
    private final List<Geometry> geometries;
    private final String type;

    static final class GsonTypeAdapter extends TypeAdapter<GeometryCollection> {
        private volatile TypeAdapter<BoundingBox> boundingBoxTypeAdapter;
        private final Gson gson;
        private volatile TypeAdapter<List<Geometry>> listGeometryAdapter;
        private volatile TypeAdapter<String> stringTypeAdapter;

        GsonTypeAdapter(Gson gson2) {
            this.gson = gson2;
        }

        public GeometryCollection read(a aVar) {
            String str = null;
            if (aVar.F() == b.NULL) {
                aVar.x();
                return null;
            }
            aVar.e();
            BoundingBox boundingBox = null;
            List list = null;
            while (aVar.hasNext()) {
                String B02 = aVar.B0();
                if (aVar.F() != b.NULL) {
                    B02.hashCode();
                    char c10 = 65535;
                    switch (B02.hashCode()) {
                        case 3017257:
                            if (B02.equals("bbox")) {
                                c10 = 0;
                                break;
                            }
                            break;
                        case 3575610:
                            if (B02.equals("type")) {
                                c10 = 1;
                                break;
                            }
                            break;
                        case 203916432:
                            if (B02.equals("geometries")) {
                                c10 = 2;
                                break;
                            }
                            break;
                    }
                    switch (c10) {
                        case 0:
                            TypeAdapter<BoundingBox> typeAdapter = this.boundingBoxTypeAdapter;
                            if (typeAdapter == null) {
                                typeAdapter = this.gson.q(BoundingBox.class);
                                this.boundingBoxTypeAdapter = typeAdapter;
                            }
                            boundingBox = typeAdapter.read(aVar);
                            break;
                        case 1:
                            TypeAdapter<String> typeAdapter2 = this.stringTypeAdapter;
                            if (typeAdapter2 == null) {
                                typeAdapter2 = this.gson.q(String.class);
                                this.stringTypeAdapter = typeAdapter2;
                            }
                            str = typeAdapter2.read(aVar);
                            break;
                        case 2:
                            TypeAdapter<List<Geometry>> typeAdapter3 = this.listGeometryAdapter;
                            if (typeAdapter3 == null) {
                                typeAdapter3 = this.gson.p(TypeToken.getParameterized(List.class, Geometry.class));
                                this.listGeometryAdapter = typeAdapter3;
                            }
                            list = typeAdapter3.read(aVar);
                            break;
                        default:
                            aVar.a0();
                            break;
                    }
                } else {
                    aVar.x();
                }
            }
            aVar.l();
            if (str == null) {
                str = GeometryCollection.TYPE;
            }
            return new GeometryCollection(str, boundingBox, list);
        }

        public void write(c cVar, GeometryCollection geometryCollection) {
            if (geometryCollection == null) {
                cVar.v();
                return;
            }
            cVar.f();
            cVar.t("type");
            if (geometryCollection.type() == null) {
                cVar.v();
            } else {
                TypeAdapter<String> typeAdapter = this.stringTypeAdapter;
                if (typeAdapter == null) {
                    typeAdapter = this.gson.q(String.class);
                    this.stringTypeAdapter = typeAdapter;
                }
                typeAdapter.write(cVar, geometryCollection.type());
            }
            cVar.t("bbox");
            if (geometryCollection.bbox() == null) {
                cVar.v();
            } else {
                TypeAdapter<BoundingBox> typeAdapter2 = this.boundingBoxTypeAdapter;
                if (typeAdapter2 == null) {
                    typeAdapter2 = this.gson.q(BoundingBox.class);
                    this.boundingBoxTypeAdapter = typeAdapter2;
                }
                typeAdapter2.write(cVar, geometryCollection.bbox());
            }
            cVar.t("geometries");
            if (geometryCollection.geometries() == null) {
                cVar.v();
            } else {
                TypeAdapter<List<Geometry>> typeAdapter3 = this.listGeometryAdapter;
                if (typeAdapter3 == null) {
                    typeAdapter3 = this.gson.p(TypeToken.getParameterized(List.class, Geometry.class));
                    this.listGeometryAdapter = typeAdapter3;
                }
                typeAdapter3.write(cVar, geometryCollection.geometries());
            }
            cVar.i();
        }
    }

    GeometryCollection(String str, BoundingBox boundingBox, List<Geometry> list) {
        if (str != null) {
            this.type = str;
            this.bbox = boundingBox;
            if (list != null) {
                this.geometries = list;
                return;
            }
            throw new NullPointerException("Null geometries");
        }
        throw new NullPointerException("Null type");
    }

    public static GeometryCollection fromGeometries(List<Geometry> list) {
        return new GeometryCollection(TYPE, (BoundingBox) null, list);
    }

    public static GeometryCollection fromGeometry(Geometry geometry) {
        return new GeometryCollection(TYPE, (BoundingBox) null, Arrays.asList(new Geometry[]{geometry}));
    }

    public static GeometryCollection fromJson(String str) {
        f fVar = new f();
        fVar.e(GeoJsonAdapterFactory.create());
        fVar.e(GeometryAdapterFactory.create());
        return (GeometryCollection) fVar.b().n(str, GeometryCollection.class);
    }

    public static TypeAdapter<GeometryCollection> typeAdapter(Gson gson) {
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
            boolean r1 = r5 instanceof org.maplibre.geojson.GeometryCollection
            r2 = 0
            if (r1 == 0) goto L_0x003b
            org.maplibre.geojson.GeometryCollection r5 = (org.maplibre.geojson.GeometryCollection) r5
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
            java.util.List<org.maplibre.geojson.Geometry> r1 = r4.geometries
            java.util.List r5 = r5.geometries()
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
        throw new UnsupportedOperationException("Method not decompiled: org.maplibre.geojson.GeometryCollection.equals(java.lang.Object):boolean");
    }

    public List<Geometry> geometries() {
        return this.geometries;
    }

    public int hashCode() {
        int hashCode = (this.type.hashCode() ^ 1000003) * 1000003;
        BoundingBox boundingBox = this.bbox;
        return ((hashCode ^ (boundingBox == null ? 0 : boundingBox.hashCode())) * 1000003) ^ this.geometries.hashCode();
    }

    public String toJson() {
        f fVar = new f();
        fVar.e(GeoJsonAdapterFactory.create());
        fVar.e(GeometryAdapterFactory.create());
        return fVar.b().w(this);
    }

    public String toString() {
        return "GeometryCollection{type=" + this.type + ", bbox=" + this.bbox + ", geometries=" + this.geometries + "}";
    }

    public String type() {
        return this.type;
    }

    public static GeometryCollection fromGeometries(List<Geometry> list, BoundingBox boundingBox) {
        return new GeometryCollection(TYPE, boundingBox, list);
    }

    public static GeometryCollection fromGeometry(Geometry geometry, BoundingBox boundingBox) {
        return new GeometryCollection(TYPE, boundingBox, Arrays.asList(new Geometry[]{geometry}));
    }
}
