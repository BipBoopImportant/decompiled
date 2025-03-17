package org.maplibre.geojson;

import Qc.b;
import Tc.a;
import Tc.c;
import androidx.annotation.Keep;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.google.gson.f;
import org.maplibre.geojson.gson.BoundingBoxTypeAdapter;
import org.maplibre.geojson.gson.GeoJsonAdapterFactory;

@Keep
public final class Feature implements GeoJson {
    private static final String TYPE = "Feature";
    @b(BoundingBoxTypeAdapter.class)
    private final BoundingBox bbox;
    private final Geometry geometry;

    /* renamed from: id  reason: collision with root package name */
    private final String f146106id;
    /* access modifiers changed from: private */
    public final JsonObject properties;
    private final String type;

    static final class GsonTypeAdapter extends TypeAdapter<Feature> {
        private volatile TypeAdapter<BoundingBox> boundingBoxTypeAdapter;
        private volatile TypeAdapter<Geometry> geometryTypeAdapter;
        private final Gson gson;
        private volatile TypeAdapter<JsonObject> jsonObjectTypeAdapter;
        private volatile TypeAdapter<String> stringTypeAdapter;

        GsonTypeAdapter(Gson gson2) {
            this.gson = gson2;
        }

        public Feature read(a aVar) {
            if (aVar.F() == Tc.b.NULL) {
                aVar.x();
                return null;
            }
            aVar.e();
            String str = null;
            BoundingBox boundingBox = null;
            String str2 = null;
            Geometry geometry = null;
            JsonObject jsonObject = null;
            while (aVar.hasNext()) {
                String B02 = aVar.B0();
                if (aVar.F() != Tc.b.NULL) {
                    B02.hashCode();
                    Class<String> cls = String.class;
                    char c10 = 65535;
                    switch (B02.hashCode()) {
                        case -926053069:
                            if (B02.equals("properties")) {
                                c10 = 0;
                                break;
                            }
                            break;
                        case 3355:
                            if (B02.equals("id")) {
                                c10 = 1;
                                break;
                            }
                            break;
                        case 3017257:
                            if (B02.equals("bbox")) {
                                c10 = 2;
                                break;
                            }
                            break;
                        case 3575610:
                            if (B02.equals("type")) {
                                c10 = 3;
                                break;
                            }
                            break;
                        case 1846020210:
                            if (B02.equals("geometry")) {
                                c10 = 4;
                                break;
                            }
                            break;
                    }
                    switch (c10) {
                        case 0:
                            TypeAdapter<JsonObject> typeAdapter = this.jsonObjectTypeAdapter;
                            if (typeAdapter == null) {
                                typeAdapter = this.gson.q(JsonObject.class);
                                this.jsonObjectTypeAdapter = typeAdapter;
                            }
                            jsonObject = typeAdapter.read(aVar);
                            break;
                        case 1:
                            TypeAdapter<String> typeAdapter2 = this.stringTypeAdapter;
                            if (typeAdapter2 == null) {
                                typeAdapter2 = this.gson.q(cls);
                                this.stringTypeAdapter = typeAdapter2;
                            }
                            str2 = typeAdapter2.read(aVar);
                            break;
                        case 2:
                            TypeAdapter<BoundingBox> typeAdapter3 = this.boundingBoxTypeAdapter;
                            if (typeAdapter3 == null) {
                                typeAdapter3 = this.gson.q(BoundingBox.class);
                                this.boundingBoxTypeAdapter = typeAdapter3;
                            }
                            boundingBox = typeAdapter3.read(aVar);
                            break;
                        case 3:
                            TypeAdapter<String> typeAdapter4 = this.stringTypeAdapter;
                            if (typeAdapter4 == null) {
                                typeAdapter4 = this.gson.q(cls);
                                this.stringTypeAdapter = typeAdapter4;
                            }
                            str = typeAdapter4.read(aVar);
                            break;
                        case 4:
                            TypeAdapter<Geometry> typeAdapter5 = this.geometryTypeAdapter;
                            if (typeAdapter5 == null) {
                                typeAdapter5 = this.gson.q(Geometry.class);
                                this.geometryTypeAdapter = typeAdapter5;
                            }
                            geometry = typeAdapter5.read(aVar);
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
            return new Feature(str, boundingBox, str2, geometry, jsonObject);
        }

        public void write(c cVar, Feature feature) {
            if (feature == null) {
                cVar.v();
                return;
            }
            cVar.f();
            cVar.t("type");
            TypeAdapter<String> typeAdapter = this.stringTypeAdapter;
            Class<String> cls = String.class;
            if (typeAdapter == null) {
                typeAdapter = this.gson.q(cls);
                this.stringTypeAdapter = typeAdapter;
            }
            typeAdapter.write(cVar, feature.type());
            cVar.t("bbox");
            if (feature.bbox() == null) {
                cVar.v();
            } else {
                TypeAdapter<BoundingBox> typeAdapter2 = this.boundingBoxTypeAdapter;
                if (typeAdapter2 == null) {
                    typeAdapter2 = this.gson.q(BoundingBox.class);
                    this.boundingBoxTypeAdapter = typeAdapter2;
                }
                typeAdapter2.write(cVar, feature.bbox());
            }
            cVar.t("id");
            if (feature.id() == null) {
                cVar.v();
            } else {
                TypeAdapter<String> typeAdapter3 = this.stringTypeAdapter;
                if (typeAdapter3 == null) {
                    typeAdapter3 = this.gson.q(cls);
                    this.stringTypeAdapter = typeAdapter3;
                }
                typeAdapter3.write(cVar, feature.id());
            }
            cVar.t("geometry");
            if (feature.geometry() == null) {
                cVar.v();
            } else {
                TypeAdapter<Geometry> typeAdapter4 = this.geometryTypeAdapter;
                if (typeAdapter4 == null) {
                    typeAdapter4 = this.gson.q(Geometry.class);
                    this.geometryTypeAdapter = typeAdapter4;
                }
                typeAdapter4.write(cVar, feature.geometry());
            }
            cVar.t("properties");
            if (feature.properties == null) {
                cVar.v();
            } else {
                TypeAdapter<JsonObject> typeAdapter5 = this.jsonObjectTypeAdapter;
                if (typeAdapter5 == null) {
                    typeAdapter5 = this.gson.q(JsonObject.class);
                    this.jsonObjectTypeAdapter = typeAdapter5;
                }
                typeAdapter5.write(cVar, feature.properties());
            }
            cVar.i();
        }
    }

    Feature(String str, BoundingBox boundingBox, String str2, Geometry geometry2, JsonObject jsonObject) {
        if (str != null) {
            this.type = str;
            this.bbox = boundingBox;
            this.f146106id = str2;
            this.geometry = geometry2;
            this.properties = jsonObject;
            return;
        }
        throw new NullPointerException("Null type");
    }

    public static Feature fromGeometry(Geometry geometry2) {
        return new Feature(TYPE, (BoundingBox) null, (String) null, geometry2, new JsonObject());
    }

    public static Feature fromJson(String str) {
        f fVar = new f();
        fVar.e(GeoJsonAdapterFactory.create());
        fVar.e(GeometryAdapterFactory.create());
        Feature feature = (Feature) fVar.b().n(str, Feature.class);
        return feature.properties != null ? feature : new Feature(TYPE, feature.bbox(), feature.id(), feature.geometry(), new JsonObject());
    }

    public static TypeAdapter<Feature> typeAdapter(Gson gson) {
        return new GsonTypeAdapter(gson);
    }

    public void addBooleanProperty(String str, Boolean bool) {
        properties().addProperty(str, bool);
    }

    public void addCharacterProperty(String str, Character ch2) {
        properties().addProperty(str, ch2);
    }

    public void addNumberProperty(String str, Number number) {
        properties().addProperty(str, number);
    }

    public void addProperty(String str, JsonElement jsonElement) {
        properties().add(str, jsonElement);
    }

    public void addStringProperty(String str, String str2) {
        properties().addProperty(str, str2);
    }

    public BoundingBox bbox() {
        return this.bbox;
    }

    public boolean equals(Object obj) {
        BoundingBox boundingBox;
        String str;
        Geometry geometry2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Feature)) {
            return false;
        }
        Feature feature = (Feature) obj;
        if (this.type.equals(feature.type()) && ((boundingBox = this.bbox) != null ? boundingBox.equals(feature.bbox()) : feature.bbox() == null) && ((str = this.f146106id) != null ? str.equals(feature.id()) : feature.id() == null) && ((geometry2 = this.geometry) != null ? geometry2.equals(feature.geometry()) : feature.geometry() == null)) {
            JsonObject jsonObject = this.properties;
            if (jsonObject == null) {
                if (feature.properties == null) {
                    return true;
                }
            } else if (jsonObject.equals(feature.properties())) {
                return true;
            }
        }
        return false;
    }

    public Geometry geometry() {
        return this.geometry;
    }

    public Boolean getBooleanProperty(String str) {
        JsonElement jsonElement = properties().get(str);
        if (jsonElement == null) {
            return null;
        }
        return Boolean.valueOf(jsonElement.getAsBoolean());
    }

    @Deprecated
    public Character getCharacterProperty(String str) {
        JsonElement jsonElement = properties().get(str);
        if (jsonElement == null) {
            return null;
        }
        return Character.valueOf(jsonElement.getAsCharacter());
    }

    public Number getNumberProperty(String str) {
        JsonElement jsonElement = properties().get(str);
        if (jsonElement == null) {
            return null;
        }
        return jsonElement.getAsNumber();
    }

    public JsonElement getProperty(String str) {
        return properties().get(str);
    }

    public String getStringProperty(String str) {
        JsonElement jsonElement = properties().get(str);
        if (jsonElement == null) {
            return null;
        }
        return jsonElement.getAsString();
    }

    public boolean hasNonNullValueForProperty(String str) {
        return hasProperty(str) && !getProperty(str).isJsonNull();
    }

    public boolean hasProperty(String str) {
        return properties().has(str);
    }

    public int hashCode() {
        int hashCode = (this.type.hashCode() ^ 1000003) * 1000003;
        BoundingBox boundingBox = this.bbox;
        int i10 = 0;
        int hashCode2 = (hashCode ^ (boundingBox == null ? 0 : boundingBox.hashCode())) * 1000003;
        String str = this.f146106id;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        Geometry geometry2 = this.geometry;
        int hashCode4 = (hashCode3 ^ (geometry2 == null ? 0 : geometry2.hashCode())) * 1000003;
        JsonObject jsonObject = this.properties;
        if (jsonObject != null) {
            i10 = jsonObject.hashCode();
        }
        return hashCode4 ^ i10;
    }

    public String id() {
        return this.f146106id;
    }

    public JsonObject properties() {
        return this.properties;
    }

    public JsonElement removeProperty(String str) {
        return properties().remove(str);
    }

    public String toJson() {
        return new f().e(GeoJsonAdapterFactory.create()).e(GeometryAdapterFactory.create()).b().w(properties().size() == 0 ? new Feature(TYPE, bbox(), id(), geometry(), (JsonObject) null) : this);
    }

    public String toString() {
        return "Feature{type=" + this.type + ", bbox=" + this.bbox + ", id=" + this.f146106id + ", geometry=" + this.geometry + ", properties=" + this.properties + "}";
    }

    public String type() {
        return this.type;
    }

    public static Feature fromGeometry(Geometry geometry2, BoundingBox boundingBox) {
        return new Feature(TYPE, boundingBox, (String) null, geometry2, new JsonObject());
    }

    public static Feature fromGeometry(Geometry geometry2, JsonObject jsonObject) {
        if (jsonObject == null) {
            jsonObject = new JsonObject();
        }
        return new Feature(TYPE, (BoundingBox) null, (String) null, geometry2, jsonObject);
    }

    public static Feature fromGeometry(Geometry geometry2, JsonObject jsonObject, BoundingBox boundingBox) {
        if (jsonObject == null) {
            jsonObject = new JsonObject();
        }
        return new Feature(TYPE, boundingBox, (String) null, geometry2, jsonObject);
    }

    public static Feature fromGeometry(Geometry geometry2, JsonObject jsonObject, String str) {
        if (jsonObject == null) {
            jsonObject = new JsonObject();
        }
        return new Feature(TYPE, (BoundingBox) null, str, geometry2, jsonObject);
    }

    public static Feature fromGeometry(Geometry geometry2, JsonObject jsonObject, String str, BoundingBox boundingBox) {
        if (jsonObject == null) {
            jsonObject = new JsonObject();
        }
        return new Feature(TYPE, boundingBox, str, geometry2, jsonObject);
    }
}
