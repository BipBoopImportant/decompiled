package EB;

import XH.C16824o;
import XH.C16825p;
import com.google.android.libraries.places.api.model.PlaceTypes;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0017\b\b\u0018\u00002\u00020\u0001:\u0002\u001e\u001bBS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\t\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001f\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b!\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010$R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b%\u0010#\u001a\u0004\b%\u0010$R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b!\u0010&\u001a\u0004\b'\u0010(R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\t8\u0006¢\u0006\f\n\u0004\b\u001d\u0010&\u001a\u0004\b \u0010(R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010)\u001a\u0004\b\u001e\u0010*R\u001b\u0010.\u001a\u00020\u00188FX\u0002¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b+\u0010-¨\u0006/"}, d2 = {"LEB/c;", "", "", "storeId", "title", "storeAddress", "", "latitude", "longitude", "", "LEB/c$b;", "storeSettings", "LEB/c$a;", "childStores", "LEB/a;", "buCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDLjava/util/List;Ljava/util/List;LEB/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "g", "b", "h", "c", "f", "d", "D", "()D", "e", "Ljava/util/List;", "getStoreSettings", "()Ljava/util/List;", "LEB/a;", "()LEB/a;", "i", "LXH/o;", "()Z", "isShopAndGoEnabled", "datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: EB.c  reason: case insensitive filesystem */
public final class C12831c {

    /* renamed from: a  reason: collision with root package name */
    private final String f109317a;

    /* renamed from: b  reason: collision with root package name */
    private final String f109318b;

    /* renamed from: c  reason: collision with root package name */
    private final String f109319c;

    /* renamed from: d  reason: collision with root package name */
    private final double f109320d;

    /* renamed from: e  reason: collision with root package name */
    private final double f109321e;

    /* renamed from: f  reason: collision with root package name */
    private final List<b> f109322f;

    /* renamed from: g  reason: collision with root package name */
    private final List<a> f109323g;

    /* renamed from: h  reason: collision with root package name */
    private final C12829a f109324h;

    /* renamed from: i  reason: collision with root package name */
    private final C16824o f109325i = C16825p.b(new C12830b(this));

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0014\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001d¨\u0006 "}, d2 = {"LEB/c$a;", "", "", "storeId", "title", "address", "", "latitude", "longitude", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DD)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getStoreId", "b", "c", "getAddress", "d", "D", "getLatitude", "()D", "e", "getLongitude", "datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: EB.c$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final String f109326a;

        /* renamed from: b  reason: collision with root package name */
        private final String f109327b;

        /* renamed from: c  reason: collision with root package name */
        private final String f109328c;

        /* renamed from: d  reason: collision with root package name */
        private final double f109329d;

        /* renamed from: e  reason: collision with root package name */
        private final double f109330e;

        public a(String str, String str2, String str3, double d10, double d11) {
            C17542s.j(str, "storeId");
            C17542s.j(str2, "title");
            C17542s.j(str3, PlaceTypes.ADDRESS);
            this.f109326a = str;
            this.f109327b = str2;
            this.f109328c = str3;
            this.f109329d = d10;
            this.f109330e = d11;
        }

        public final String a() {
            return this.f109327b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f109326a, aVar.f109326a) && C17542s.e(this.f109327b, aVar.f109327b) && C17542s.e(this.f109328c, aVar.f109328c) && Double.compare(this.f109329d, aVar.f109329d) == 0 && Double.compare(this.f109330e, aVar.f109330e) == 0;
        }

        public int hashCode() {
            return (((((((this.f109326a.hashCode() * 31) + this.f109327b.hashCode()) * 31) + this.f109328c.hashCode()) * 31) + Double.hashCode(this.f109329d)) * 31) + Double.hashCode(this.f109330e);
        }

        public String toString() {
            String str = this.f109326a;
            String str2 = this.f109327b;
            String str3 = this.f109328c;
            double d10 = this.f109329d;
            double d11 = this.f109330e;
            return "ChildStore(storeId=" + str + ", title=" + str2 + ", address=" + str3 + ", latitude=" + d10 + ", longitude=" + d11 + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"LEB/c$b;", "", "", "key", "", "value", "<init>", "(Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Z", "()Z", "datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: EB.c$b */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final String f109331a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f109332b;

        public b(String str, boolean z10) {
            C17542s.j(str, "key");
            this.f109331a = str;
            this.f109332b = z10;
        }

        public final String a() {
            return this.f109331a;
        }

        public final boolean b() {
            return this.f109332b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return C17542s.e(this.f109331a, bVar.f109331a) && this.f109332b == bVar.f109332b;
        }

        public int hashCode() {
            return (this.f109331a.hashCode() * 31) + Boolean.hashCode(this.f109332b);
        }

        public String toString() {
            String str = this.f109331a;
            boolean z10 = this.f109332b;
            return "StoreSetting(key=" + str + ", value=" + z10 + ")";
        }
    }

    public C12831c(String str, String str2, String str3, double d10, double d11, List<b> list, List<a> list2, C12829a aVar) {
        C17542s.j(str, "storeId");
        C17542s.j(str2, "title");
        C17542s.j(str3, "storeAddress");
        C17542s.j(list, "storeSettings");
        C17542s.j(list2, "childStores");
        C17542s.j(aVar, "buCode");
        this.f109317a = str;
        this.f109318b = str2;
        this.f109319c = str3;
        this.f109320d = d10;
        this.f109321e = d11;
        this.f109322f = list;
        this.f109323g = list2;
        this.f109324h = aVar;
    }

    /* access modifiers changed from: private */
    public static final boolean j(C12831c cVar) {
        Object obj;
        Iterator it = cVar.f109322f.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C17542s.e(((b) obj).a(), "shopGoEnabled")) {
                break;
            }
        }
        b bVar = (b) obj;
        if (bVar != null) {
            return bVar.b();
        }
        return false;
    }

    public final C12829a b() {
        return this.f109324h;
    }

    public final List<a> c() {
        return this.f109323g;
    }

    public final double d() {
        return this.f109320d;
    }

    public final double e() {
        return this.f109321e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12831c)) {
            return false;
        }
        C12831c cVar = (C12831c) obj;
        return C17542s.e(this.f109317a, cVar.f109317a) && C17542s.e(this.f109318b, cVar.f109318b) && C17542s.e(this.f109319c, cVar.f109319c) && Double.compare(this.f109320d, cVar.f109320d) == 0 && Double.compare(this.f109321e, cVar.f109321e) == 0 && C17542s.e(this.f109322f, cVar.f109322f) && C17542s.e(this.f109323g, cVar.f109323g) && this.f109324h == cVar.f109324h;
    }

    public final String f() {
        return this.f109319c;
    }

    public final String g() {
        return this.f109317a;
    }

    public final String h() {
        return this.f109318b;
    }

    public int hashCode() {
        return (((((((((((((this.f109317a.hashCode() * 31) + this.f109318b.hashCode()) * 31) + this.f109319c.hashCode()) * 31) + Double.hashCode(this.f109320d)) * 31) + Double.hashCode(this.f109321e)) * 31) + this.f109322f.hashCode()) * 31) + this.f109323g.hashCode()) * 31) + this.f109324h.hashCode();
    }

    public final boolean i() {
        return ((Boolean) this.f109325i.getValue()).booleanValue();
    }

    public String toString() {
        String str = this.f109317a;
        String str2 = this.f109318b;
        String str3 = this.f109319c;
        double d10 = this.f109320d;
        double d11 = this.f109321e;
        List<b> list = this.f109322f;
        List<a> list2 = this.f109323g;
        C12829a aVar = this.f109324h;
        return "Store(storeId=" + str + ", title=" + str2 + ", storeAddress=" + str3 + ", latitude=" + d10 + ", longitude=" + d11 + ", storeSettings=" + list + ", childStores=" + list2 + ", buCode=" + aVar + ")";
    }
}
