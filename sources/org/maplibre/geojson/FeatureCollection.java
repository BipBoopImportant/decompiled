package org.maplibre.geojson;

import Qc.b;
import Tc.a;
import Tc.c;
import androidx.annotation.Keep;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.f;
import com.google.gson.reflect.TypeToken;
import java.util.Arrays;
import java.util.List;
import org.maplibre.geojson.gson.BoundingBoxTypeAdapter;
import org.maplibre.geojson.gson.GeoJsonAdapterFactory;

@Keep
public final class FeatureCollection implements GeoJson {
    private static final String TYPE = "FeatureCollection";
    @b(BoundingBoxTypeAdapter.class)
    private final BoundingBox bbox;
    private final List<Feature> features;
    private final String type;

    static final class GsonTypeAdapter extends TypeAdapter<FeatureCollection> {
        private volatile TypeAdapter<BoundingBox> boundingBoxAdapter;
        private final Gson gson;
        private volatile TypeAdapter<List<Feature>> listFeatureAdapter;
        private volatile TypeAdapter<String> stringAdapter;

        GsonTypeAdapter(Gson gson2) {
            this.gson = gson2;
        }

        public FeatureCollection read(a aVar) {
            String str = null;
            if (aVar.F() == Tc.b.NULL) {
                aVar.x();
                return null;
            }
            aVar.e();
            BoundingBox boundingBox = null;
            List list = null;
            while (aVar.hasNext()) {
                String B02 = aVar.B0();
                if (aVar.F() != Tc.b.NULL) {
                    B02.hashCode();
                    char c10 = 65535;
                    switch (B02.hashCode()) {
                        case -290659267:
                            if (B02.equals("features")) {
                                c10 = 0;
                                break;
                            }
                            break;
                        case 3017257:
                            if (B02.equals("bbox")) {
                                c10 = 1;
                                break;
                            }
                            break;
                        case 3575610:
                            if (B02.equals("type")) {
                                c10 = 2;
                                break;
                            }
                            break;
                    }
                    switch (c10) {
                        case 0:
                            TypeAdapter<List<Feature>> typeAdapter = this.listFeatureAdapter;
                            if (typeAdapter == null) {
                                typeAdapter = this.gson.p(TypeToken.getParameterized(List.class, Feature.class));
                                this.listFeatureAdapter = typeAdapter;
                            }
                            list = typeAdapter.read(aVar);
                            break;
                        case 1:
                            TypeAdapter<BoundingBox> typeAdapter2 = this.boundingBoxAdapter;
                            if (typeAdapter2 == null) {
                                typeAdapter2 = this.gson.q(BoundingBox.class);
                                this.boundingBoxAdapter = typeAdapter2;
                            }
                            boundingBox = typeAdapter2.read(aVar);
                            break;
                        case 2:
                            TypeAdapter<String> typeAdapter3 = this.stringAdapter;
                            if (typeAdapter3 == null) {
                                typeAdapter3 = this.gson.q(String.class);
                                this.stringAdapter = typeAdapter3;
                            }
                            str = typeAdapter3.read(aVar);
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
            return new FeatureCollection(str, boundingBox, list);
        }

        public void write(c cVar, FeatureCollection featureCollection) {
            if (featureCollection == null) {
                cVar.v();
                return;
            }
            cVar.f();
            cVar.t("type");
            if (featureCollection.type() == null) {
                cVar.v();
            } else {
                TypeAdapter<String> typeAdapter = this.stringAdapter;
                if (typeAdapter == null) {
                    typeAdapter = this.gson.q(String.class);
                    this.stringAdapter = typeAdapter;
                }
                typeAdapter.write(cVar, featureCollection.type());
            }
            cVar.t("bbox");
            if (featureCollection.bbox() == null) {
                cVar.v();
            } else {
                TypeAdapter<BoundingBox> typeAdapter2 = this.boundingBoxAdapter;
                if (typeAdapter2 == null) {
                    typeAdapter2 = this.gson.q(BoundingBox.class);
                    this.boundingBoxAdapter = typeAdapter2;
                }
                typeAdapter2.write(cVar, featureCollection.bbox());
            }
            cVar.t("features");
            if (featureCollection.features() == null) {
                cVar.v();
            } else {
                TypeAdapter<List<Feature>> typeAdapter3 = this.listFeatureAdapter;
                if (typeAdapter3 == null) {
                    typeAdapter3 = this.gson.p(TypeToken.getParameterized(List.class, Feature.class));
                    this.listFeatureAdapter = typeAdapter3;
                }
                typeAdapter3.write(cVar, featureCollection.features());
            }
            cVar.i();
        }
    }

    FeatureCollection(String str, BoundingBox boundingBox, List<Feature> list) {
        if (str != null) {
            this.type = str;
            this.bbox = boundingBox;
            this.features = list;
            return;
        }
        throw new NullPointerException("Null type");
    }

    public static FeatureCollection fromFeature(Feature feature) {
        return new FeatureCollection(TYPE, (BoundingBox) null, Arrays.asList(new Feature[]{feature}));
    }

    public static FeatureCollection fromFeatures(Feature[] featureArr) {
        return new FeatureCollection(TYPE, (BoundingBox) null, Arrays.asList(featureArr));
    }

    public static FeatureCollection fromJson(String str) {
        f fVar = new f();
        fVar.e(GeoJsonAdapterFactory.create());
        fVar.e(GeometryAdapterFactory.create());
        return (FeatureCollection) fVar.b().n(str, FeatureCollection.class);
    }

    public static TypeAdapter<FeatureCollection> typeAdapter(Gson gson) {
        return new GsonTypeAdapter(gson);
    }

    public BoundingBox bbox() {
        return this.bbox;
    }

    public boolean equals(Object obj) {
        BoundingBox boundingBox;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FeatureCollection)) {
            return false;
        }
        FeatureCollection featureCollection = (FeatureCollection) obj;
        if (this.type.equals(featureCollection.type()) && ((boundingBox = this.bbox) != null ? boundingBox.equals(featureCollection.bbox()) : featureCollection.bbox() == null)) {
            List<Feature> list = this.features;
            if (list == null) {
                if (featureCollection.features() == null) {
                    return true;
                }
            } else if (list.equals(featureCollection.features())) {
                return true;
            }
        }
        return false;
    }

    public List<Feature> features() {
        return this.features;
    }

    public int hashCode() {
        int hashCode = (this.type.hashCode() ^ 1000003) * 1000003;
        BoundingBox boundingBox = this.bbox;
        int i10 = 0;
        int hashCode2 = (hashCode ^ (boundingBox == null ? 0 : boundingBox.hashCode())) * 1000003;
        List<Feature> list = this.features;
        if (list != null) {
            i10 = list.hashCode();
        }
        return hashCode2 ^ i10;
    }

    public String toJson() {
        f fVar = new f();
        fVar.e(GeoJsonAdapterFactory.create());
        fVar.e(GeometryAdapterFactory.create());
        return fVar.b().w(this);
    }

    public String toString() {
        return "FeatureCollection{type=" + this.type + ", bbox=" + this.bbox + ", features=" + this.features + "}";
    }

    public String type() {
        return this.type;
    }

    public static FeatureCollection fromFeatures(List<Feature> list) {
        return new FeatureCollection(TYPE, (BoundingBox) null, list);
    }

    public static FeatureCollection fromFeature(Feature feature, BoundingBox boundingBox) {
        return new FeatureCollection(TYPE, boundingBox, Arrays.asList(new Feature[]{feature}));
    }

    public static FeatureCollection fromFeatures(Feature[] featureArr, BoundingBox boundingBox) {
        return new FeatureCollection(TYPE, boundingBox, Arrays.asList(featureArr));
    }

    public static FeatureCollection fromFeatures(List<Feature> list, BoundingBox boundingBox) {
        return new FeatureCollection(TYPE, boundingBox, list);
    }
}
