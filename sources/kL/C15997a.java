package KL;

import CL.c;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import org.maplibre.android.maps.B;
import org.maplibre.geojson.Geometry;

/* renamed from: KL.a  reason: case insensitive filesystem */
public abstract class C15997a<T extends Geometry> {

    /* renamed from: a  reason: collision with root package name */
    protected JsonObject f135938a;

    /* renamed from: b  reason: collision with root package name */
    protected T f135939b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f135940c;

    C15997a(long j10, JsonObject jsonObject, T t10) {
        this.f135938a = jsonObject;
        jsonObject.addProperty("id", (Number) Long.valueOf(j10));
        this.f135939b = t10;
    }

    /* access modifiers changed from: package-private */
    public JsonObject a() {
        return this.f135938a;
    }

    public T b() {
        T t10 = this.f135939b;
        if (t10 != null) {
            return t10;
        }
        throw new IllegalStateException();
    }

    public long c() {
        return this.f135938a.get("id").getAsLong();
    }

    /* access modifiers changed from: package-private */
    public abstract String d();

    /* access modifiers changed from: package-private */
    public abstract Geometry e(B b10, c cVar, float f10, float f11);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C15997a aVar = (C15997a) obj;
        if (this.f135940c == aVar.f135940c && this.f135938a.equals(aVar.f135938a)) {
            return this.f135939b.equals(aVar.f135939b);
        }
        return false;
    }

    public boolean f() {
        return this.f135940c;
    }

    public void g(JsonElement jsonElement) {
        this.f135938a.add("custom_data", jsonElement);
    }

    public void h(boolean z10) {
        this.f135940c = z10;
    }

    public int hashCode() {
        return (((this.f135938a.hashCode() * 31) + this.f135939b.hashCode()) * 31) + (this.f135940c ? 1 : 0);
    }

    public void i(T t10) {
        this.f135939b = t10;
    }

    /* access modifiers changed from: package-private */
    public abstract void j();

    public String toString() {
        return d() + "{geometry=" + this.f135939b + ", properties=" + this.f135938a + ", isDraggable=" + this.f135940c + '}';
    }
}
