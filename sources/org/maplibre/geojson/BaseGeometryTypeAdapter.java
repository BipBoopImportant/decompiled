package org.maplibre.geojson;

import Tc.a;
import Tc.b;
import Tc.c;
import androidx.annotation.Keep;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import org.maplibre.geojson.exception.GeoJsonException;
import org.maplibre.geojson.gson.BoundingBoxTypeAdapter;

@Keep
abstract class BaseGeometryTypeAdapter<G, T> extends TypeAdapter<G> {
    private volatile TypeAdapter<BoundingBox> boundingBoxAdapter = new BoundingBoxTypeAdapter();
    private volatile TypeAdapter<T> coordinatesAdapter;
    private final Gson gson;
    private volatile TypeAdapter<String> stringAdapter;

    BaseGeometryTypeAdapter(Gson gson2, TypeAdapter<T> typeAdapter) {
        this.gson = gson2;
        this.coordinatesAdapter = typeAdapter;
    }

    /* access modifiers changed from: package-private */
    public abstract CoordinateContainer<T> createCoordinateContainer(String str, BoundingBox boundingBox, T t10);

    public CoordinateContainer<T> readCoordinateContainer(a aVar) {
        String str = null;
        if (aVar.F() == b.NULL) {
            aVar.x();
            return null;
        }
        aVar.e();
        BoundingBox boundingBox = null;
        T t10 = null;
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
                    case 1871919611:
                        if (B02.equals("coordinates")) {
                            c10 = 2;
                            break;
                        }
                        break;
                }
                switch (c10) {
                    case 0:
                        TypeAdapter<BoundingBox> typeAdapter = this.boundingBoxAdapter;
                        if (typeAdapter == null) {
                            typeAdapter = this.gson.q(BoundingBox.class);
                            this.boundingBoxAdapter = typeAdapter;
                        }
                        boundingBox = typeAdapter.read(aVar);
                        break;
                    case 1:
                        TypeAdapter<String> typeAdapter2 = this.stringAdapter;
                        if (typeAdapter2 == null) {
                            typeAdapter2 = this.gson.q(String.class);
                            this.stringAdapter = typeAdapter2;
                        }
                        str = typeAdapter2.read(aVar);
                        break;
                    case 2:
                        TypeAdapter<T> typeAdapter3 = this.coordinatesAdapter;
                        if (typeAdapter3 != null) {
                            t10 = typeAdapter3.read(aVar);
                            break;
                        } else {
                            throw new GeoJsonException("Coordinates type adapter is null");
                        }
                    default:
                        aVar.a0();
                        break;
                }
            } else {
                aVar.x();
            }
        }
        aVar.l();
        return createCoordinateContainer(str, boundingBox, t10);
    }

    public void writeCoordinateContainer(c cVar, CoordinateContainer<T> coordinateContainer) {
        if (coordinateContainer == null) {
            cVar.v();
            return;
        }
        cVar.f();
        cVar.t("type");
        if (coordinateContainer.type() == null) {
            cVar.v();
        } else {
            TypeAdapter<String> typeAdapter = this.stringAdapter;
            if (typeAdapter == null) {
                typeAdapter = this.gson.q(String.class);
                this.stringAdapter = typeAdapter;
            }
            typeAdapter.write(cVar, coordinateContainer.type());
        }
        cVar.t("bbox");
        if (coordinateContainer.bbox() == null) {
            cVar.v();
        } else {
            TypeAdapter<BoundingBox> typeAdapter2 = this.boundingBoxAdapter;
            if (typeAdapter2 == null) {
                typeAdapter2 = this.gson.q(BoundingBox.class);
                this.boundingBoxAdapter = typeAdapter2;
            }
            typeAdapter2.write(cVar, coordinateContainer.bbox());
        }
        cVar.t("coordinates");
        if (coordinateContainer.coordinates() == null) {
            cVar.v();
        } else {
            TypeAdapter<T> typeAdapter3 = this.coordinatesAdapter;
            if (typeAdapter3 != null) {
                typeAdapter3.write(cVar, coordinateContainer.coordinates());
            } else {
                throw new GeoJsonException("Coordinates type adapter is null");
            }
        }
        cVar.i();
    }
}
