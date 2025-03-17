package Lh;

import com.ingka.ikea.appconfig.model.LocationLatLng;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0017\u0010\fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u001aR\u0017\u0010\b\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0018\u0010\u001d¨\u0006\u001e"}, d2 = {"LLh/a;", "T", "", "", "id", "name", "Lcom/ingka/ikea/appconfig/model/LocationLatLng;", "location", "model", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/ingka/ikea/appconfig/model/LocationLatLng;Ljava/lang/Object;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "getName", "c", "Lcom/ingka/ikea/appconfig/model/LocationLatLng;", "()Lcom/ingka/ikea/appconfig/model/LocationLatLng;", "d", "Ljava/lang/Object;", "()Ljava/lang/Object;", "pointofinterest_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a<T> {

    /* renamed from: a  reason: collision with root package name */
    private final String f61686a;

    /* renamed from: b  reason: collision with root package name */
    private final String f61687b;

    /* renamed from: c  reason: collision with root package name */
    private final LocationLatLng f61688c;

    /* renamed from: d  reason: collision with root package name */
    private final T f61689d;

    public a(String str, String str2, LocationLatLng locationLatLng, T t10) {
        C17542s.j(str, "id");
        C17542s.j(str2, "name");
        C17542s.j(locationLatLng, "location");
        this.f61686a = str;
        this.f61687b = str2;
        this.f61688c = locationLatLng;
        this.f61689d = t10;
    }

    public final String a() {
        return this.f61686a;
    }

    public final LocationLatLng b() {
        return this.f61688c;
    }

    public final T c() {
        return this.f61689d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return C17542s.e(this.f61686a, aVar.f61686a) && C17542s.e(this.f61687b, aVar.f61687b) && C17542s.e(this.f61688c, aVar.f61688c) && C17542s.e(this.f61689d, aVar.f61689d);
    }

    public int hashCode() {
        int hashCode = ((((this.f61686a.hashCode() * 31) + this.f61687b.hashCode()) * 31) + this.f61688c.hashCode()) * 31;
        T t10 = this.f61689d;
        return hashCode + (t10 == null ? 0 : t10.hashCode());
    }

    public String toString() {
        String str = this.f61686a;
        String str2 = this.f61687b;
        LocationLatLng locationLatLng = this.f61688c;
        T t10 = this.f61689d;
        return "PointOfInterest(id=" + str + ", name=" + str2 + ", location=" + locationLatLng + ", model=" + t10 + ")";
    }
}
