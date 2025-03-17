package Mh;

import com.ingka.ikea.appconfig.model.LocationLatLng;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000e\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u001d\b\u0016\u0012\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001c¨\u0006\u001d"}, d2 = {"LMh/a;", "", "", "id", "Lcom/ingka/ikea/appconfig/model/LocationLatLng;", "location", "", "selected", "<init>", "(Ljava/lang/String;Lcom/ingka/ikea/appconfig/model/LocationLatLng;Z)V", "LLh/a;", "poi", "(LLh/a;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lcom/ingka/ikea/appconfig/model/LocationLatLng;", "()Lcom/ingka/ikea/appconfig/model/LocationLatLng;", "c", "Z", "()Z", "pointofinterest_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final String f61953a;

    /* renamed from: b  reason: collision with root package name */
    private final LocationLatLng f61954b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f61955c;

    public a(String str, LocationLatLng locationLatLng, boolean z10) {
        C17542s.j(str, "id");
        C17542s.j(locationLatLng, "location");
        this.f61953a = str;
        this.f61954b = locationLatLng;
        this.f61955c = z10;
    }

    public final String a() {
        return this.f61953a;
    }

    public final LocationLatLng b() {
        return this.f61954b;
    }

    public final boolean c() {
        return this.f61955c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return C17542s.e(this.f61953a, aVar.f61953a) && C17542s.e(this.f61954b, aVar.f61954b) && this.f61955c == aVar.f61955c;
    }

    public int hashCode() {
        return (((this.f61953a.hashCode() * 31) + this.f61954b.hashCode()) * 31) + Boolean.hashCode(this.f61955c);
    }

    public String toString() {
        String str = this.f61953a;
        LocationLatLng locationLatLng = this.f61954b;
        boolean z10 = this.f61955c;
        return "PointOfInterestMarker(id=" + str + ", location=" + locationLatLng + ", selected=" + z10 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public a(Lh.a<?> aVar, boolean z10) {
        this(aVar.a(), aVar.b(), z10);
        C17542s.j(aVar, "poi");
    }
}
