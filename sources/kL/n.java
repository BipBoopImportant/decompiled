package KL;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import org.maplibre.android.geometry.LatLng;
import org.maplibre.geojson.Point;

public class n extends j<k> {

    /* renamed from: A  reason: collision with root package name */
    private String f135984A;

    /* renamed from: B  reason: collision with root package name */
    private String f135985B;

    /* renamed from: C  reason: collision with root package name */
    private Float f135986C;

    /* renamed from: D  reason: collision with root package name */
    private Float f135987D;

    /* renamed from: a  reason: collision with root package name */
    private boolean f135988a;

    /* renamed from: b  reason: collision with root package name */
    private JsonElement f135989b;

    /* renamed from: c  reason: collision with root package name */
    private Point f135990c;

    /* renamed from: d  reason: collision with root package name */
    private Float f135991d;

    /* renamed from: e  reason: collision with root package name */
    private Float f135992e;

    /* renamed from: f  reason: collision with root package name */
    private String f135993f;

    /* renamed from: g  reason: collision with root package name */
    private Float f135994g;

    /* renamed from: h  reason: collision with root package name */
    private Float[] f135995h;

    /* renamed from: i  reason: collision with root package name */
    private String f135996i;

    /* renamed from: j  reason: collision with root package name */
    private String f135997j;

    /* renamed from: k  reason: collision with root package name */
    private String[] f135998k;

    /* renamed from: l  reason: collision with root package name */
    private Float f135999l;

    /* renamed from: m  reason: collision with root package name */
    private Float f136000m;

    /* renamed from: n  reason: collision with root package name */
    private Float f136001n;

    /* renamed from: o  reason: collision with root package name */
    private String f136002o;

    /* renamed from: p  reason: collision with root package name */
    private Float f136003p;

    /* renamed from: q  reason: collision with root package name */
    private String f136004q;

    /* renamed from: r  reason: collision with root package name */
    private Float f136005r;

    /* renamed from: s  reason: collision with root package name */
    private String f136006s;

    /* renamed from: t  reason: collision with root package name */
    private Float[] f136007t;

    /* renamed from: u  reason: collision with root package name */
    private Float f136008u;

    /* renamed from: v  reason: collision with root package name */
    private String f136009v;

    /* renamed from: w  reason: collision with root package name */
    private String f136010w;

    /* renamed from: x  reason: collision with root package name */
    private Float f136011x;

    /* renamed from: y  reason: collision with root package name */
    private Float f136012y;

    /* renamed from: z  reason: collision with root package name */
    private Float f136013z;

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public k a(long j10, C15999c<?, k, ?, ?, ?, ?> cVar) {
        if (this.f135990c != null) {
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("symbol-sort-key", (Number) this.f135991d);
            jsonObject.addProperty("icon-size", (Number) this.f135992e);
            jsonObject.addProperty("icon-image", this.f135993f);
            jsonObject.addProperty("icon-rotate", (Number) this.f135994g);
            jsonObject.add("icon-offset", C16000d.a(this.f135995h));
            jsonObject.addProperty("icon-anchor", this.f135996i);
            jsonObject.addProperty("text-field", this.f135997j);
            jsonObject.add("text-font", C16000d.b(this.f135998k));
            jsonObject.addProperty("text-size", (Number) this.f135999l);
            jsonObject.addProperty("text-max-width", (Number) this.f136000m);
            jsonObject.addProperty("text-letter-spacing", (Number) this.f136001n);
            jsonObject.addProperty("text-justify", this.f136002o);
            jsonObject.addProperty("text-radial-offset", (Number) this.f136003p);
            jsonObject.addProperty("text-anchor", this.f136004q);
            jsonObject.addProperty("text-rotate", (Number) this.f136005r);
            jsonObject.addProperty("text-transform", this.f136006s);
            jsonObject.add("text-offset", C16000d.a(this.f136007t));
            jsonObject.addProperty("icon-opacity", (Number) this.f136008u);
            jsonObject.addProperty("icon-color", this.f136009v);
            jsonObject.addProperty("icon-halo-color", this.f136010w);
            jsonObject.addProperty("icon-halo-width", (Number) this.f136011x);
            jsonObject.addProperty("icon-halo-blur", (Number) this.f136012y);
            jsonObject.addProperty("text-opacity", (Number) this.f136013z);
            jsonObject.addProperty("text-color", this.f135984A);
            jsonObject.addProperty("text-halo-color", this.f135985B);
            jsonObject.addProperty("text-halo-width", (Number) this.f135986C);
            jsonObject.addProperty("text-halo-blur", (Number) this.f135987D);
            k kVar = new k(j10, cVar, jsonObject, this.f135990c);
            kVar.h(this.f135988a);
            kVar.g(this.f135989b);
            return kVar;
        }
        throw new RuntimeException("geometry field is required");
    }

    public JsonElement c() {
        return this.f135989b;
    }

    public LatLng d() {
        if (this.f135990c == null) {
            return null;
        }
        return new LatLng(this.f135990c.latitude(), this.f135990c.longitude());
    }

    public n e(JsonElement jsonElement) {
        this.f135989b = jsonElement;
        return this;
    }

    public n f(String str) {
        this.f135993f = str;
        return this;
    }

    public n g(Float f10) {
        this.f135992e = f10;
        return this;
    }

    public n h(LatLng latLng) {
        this.f135990c = Point.fromLngLat(latLng.b(), latLng.a());
        return this;
    }
}
