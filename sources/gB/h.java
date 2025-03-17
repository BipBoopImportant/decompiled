package GB;

import com.ingka.ikea.appconfig.model.LocationLatLng;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0015\b\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001e\u0010\u0012R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b\u001f\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010#\u001a\u0004\b\u001a\u0010$R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b\u001d\u0010+¨\u0006,"}, d2 = {"LGB/h;", "", "", "storeId", "title", "storeAddress", "Lcom/ingka/ikea/appconfig/model/LocationLatLng;", "storeLocation", "", "LGB/c;", "hours", "LGB/i;", "storeInformation", "LGB/g;", "smallStoreDetails", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ingka/ikea/appconfig/model/LocationLatLng;Ljava/util/List;LGB/i;LGB/g;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getStoreId", "b", "e", "c", "d", "Lcom/ingka/ikea/appconfig/model/LocationLatLng;", "()Lcom/ingka/ikea/appconfig/model/LocationLatLng;", "Ljava/util/List;", "()Ljava/util/List;", "f", "LGB/i;", "getStoreInformation", "()LGB/i;", "g", "LGB/g;", "()LGB/g;", "store_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h {

    /* renamed from: a  reason: collision with root package name */
    private final String f110283a;

    /* renamed from: b  reason: collision with root package name */
    private final String f110284b;

    /* renamed from: c  reason: collision with root package name */
    private final String f110285c;

    /* renamed from: d  reason: collision with root package name */
    private final LocationLatLng f110286d;

    /* renamed from: e  reason: collision with root package name */
    private final List<C12918c> f110287e;

    /* renamed from: f  reason: collision with root package name */
    private final i f110288f;

    /* renamed from: g  reason: collision with root package name */
    private final g f110289g;

    public h(String str, String str2, String str3, LocationLatLng locationLatLng, List<C12918c> list, i iVar, g gVar) {
        C17542s.j(str, "storeId");
        C17542s.j(str2, "title");
        C17542s.j(locationLatLng, "storeLocation");
        C17542s.j(list, "hours");
        this.f110283a = str;
        this.f110284b = str2;
        this.f110285c = str3;
        this.f110286d = locationLatLng;
        this.f110287e = list;
        this.f110288f = iVar;
        this.f110289g = gVar;
    }

    public final List<C12918c> a() {
        return this.f110287e;
    }

    public final g b() {
        return this.f110289g;
    }

    public final String c() {
        return this.f110285c;
    }

    public final LocationLatLng d() {
        return this.f110286d;
    }

    public final String e() {
        return this.f110284b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return C17542s.e(this.f110283a, hVar.f110283a) && C17542s.e(this.f110284b, hVar.f110284b) && C17542s.e(this.f110285c, hVar.f110285c) && C17542s.e(this.f110286d, hVar.f110286d) && C17542s.e(this.f110287e, hVar.f110287e) && C17542s.e(this.f110288f, hVar.f110288f) && C17542s.e(this.f110289g, hVar.f110289g);
    }

    public int hashCode() {
        int hashCode = ((this.f110283a.hashCode() * 31) + this.f110284b.hashCode()) * 31;
        String str = this.f110285c;
        int i10 = 0;
        int hashCode2 = (((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f110286d.hashCode()) * 31) + this.f110287e.hashCode()) * 31;
        i iVar = this.f110288f;
        int hashCode3 = (hashCode2 + (iVar == null ? 0 : iVar.hashCode())) * 31;
        g gVar = this.f110289g;
        if (gVar != null) {
            i10 = gVar.hashCode();
        }
        return hashCode3 + i10;
    }

    public String toString() {
        String str = this.f110283a;
        String str2 = this.f110284b;
        String str3 = this.f110285c;
        LocationLatLng locationLatLng = this.f110286d;
        List<C12918c> list = this.f110287e;
        i iVar = this.f110288f;
        g gVar = this.f110289g;
        return "StoreDetails(storeId=" + str + ", title=" + str2 + ", storeAddress=" + str3 + ", storeLocation=" + locationLatLng + ", hours=" + list + ", storeInformation=" + iVar + ", smallStoreDetails=" + gVar + ")";
    }
}
