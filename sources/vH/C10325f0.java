package vh;

import com.google.android.libraries.places.api.model.PlaceTypes;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import wh.C10370a;
import wh.C10374e;
import wh.C10375f;
import wh.C10377h;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0019\b\b\u0018\u00002\u00020\u0001:\r)*!'$+,\u001e-\u001a./\u001cBC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010\u0012R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010#\u001a\u0004\b$\u0010%R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b$\u0010&\u001a\u0004\b'\u0010(R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\n8\u0006¢\u0006\f\n\u0004\b'\u0010&\u001a\u0004\b\u001a\u0010(¨\u00060"}, d2 = {"Lvh/f0;", "", "Lwh/e;", "solution", "Lwh/f;", "fulfillmentMethodType", "", "id", "Lvh/f0$l;", "solutionPrice", "", "Lvh/f0$m;", "splittedItems", "Lvh/f0$c;", "deliveries", "<init>", "(Lwh/e;Lwh/f;Ljava/lang/String;Lvh/f0$l;Ljava/util/List;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lwh/e;", "d", "()Lwh/e;", "b", "Lwh/f;", "()Lwh/f;", "c", "Ljava/lang/String;", "Lvh/f0$l;", "e", "()Lvh/f0$l;", "Ljava/util/List;", "f", "()Ljava/util/List;", "l", "m", "k", "i", "j", "g", "h", "apollo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: vh.f0  reason: case insensitive filesystem */
public final class C10325f0 {

    /* renamed from: a  reason: collision with root package name */
    private final C10374e f77394a;

    /* renamed from: b  reason: collision with root package name */
    private final C10375f f77395b;

    /* renamed from: c  reason: collision with root package name */
    private final String f77396c;

    /* renamed from: d  reason: collision with root package name */
    private final l f77397d;

    /* renamed from: e  reason: collision with root package name */
    private final List<m> f77398e;

    /* renamed from: f  reason: collision with root package name */
    private final List<c> f77399f;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0015¨\u0006\u0016"}, d2 = {"Lvh/f0$a;", "", "", "__typename", "Lvh/a;", "addressFragment", "<init>", "(Ljava/lang/String;Lvh/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lvh/a;", "()Lvh/a;", "apollo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: vh.f0$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final String f77400a;

        /* renamed from: b  reason: collision with root package name */
        private final C10314a f77401b;

        public a(String str, C10314a aVar) {
            C17542s.j(str, "__typename");
            C17542s.j(aVar, "addressFragment");
            this.f77400a = str;
            this.f77401b = aVar;
        }

        public final C10314a a() {
            return this.f77401b;
        }

        public final String b() {
            return this.f77400a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f77400a, aVar.f77400a) && C17542s.e(this.f77401b, aVar.f77401b);
        }

        public int hashCode() {
            return (this.f77400a.hashCode() * 31) + this.f77401b.hashCode();
        }

        public String toString() {
            String str = this.f77400a;
            C10314a aVar = this.f77401b;
            return "Address(__typename=" + str + ", addressFragment=" + aVar + ")";
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lvh/f0$b;", "", "Lwh/a;", "type", "<init>", "(Lwh/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lwh/a;", "()Lwh/a;", "apollo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: vh.f0$b */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final C10370a f77402a;

        public b(C10370a aVar) {
            C17542s.j(aVar, "type");
            this.f77402a = aVar;
        }

        public final C10370a a() {
            return this.f77402a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f77402a == ((b) obj).f77402a;
        }

        public int hashCode() {
            return this.f77402a.hashCode();
        }

        public String toString() {
            C10370a aVar = this.f77402a;
            return "Capability(type=" + aVar + ")";
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u001b\b\b\u0018\u00002\u00020\u0001BO\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010\u0015R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b#\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u000b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b(\u0010 \u001a\u0004\b)\u0010\u0015R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b&\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b)\u0010-\u001a\u0004\b(\u0010.R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b+\u0010/\u001a\u0004\b!\u00100¨\u00061"}, d2 = {"Lvh/f0$c;", "", "", "Lvh/f0$e;", "deliveryItems", "", "id", "", "rangeOfDays", "Lvh/f0$k;", "selectedTimeWindow", "serviceItemId", "Lwh/h;", "type", "Lvh/f0$j;", "selectedPickUpPoint", "Lvh/f0$h;", "presentation", "<init>", "(Ljava/util/List;Ljava/lang/String;ZLvh/f0$k;Ljava/lang/String;Lwh/h;Lvh/f0$j;Lvh/f0$h;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "Ljava/lang/String;", "c", "Z", "d", "()Z", "Lvh/f0$k;", "f", "()Lvh/f0$k;", "e", "g", "Lwh/h;", "h", "()Lwh/h;", "Lvh/f0$j;", "()Lvh/f0$j;", "Lvh/f0$h;", "()Lvh/f0$h;", "apollo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: vh.f0$c */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        private final List<e> f77403a;

        /* renamed from: b  reason: collision with root package name */
        private final String f77404b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f77405c;

        /* renamed from: d  reason: collision with root package name */
        private final k f77406d;

        /* renamed from: e  reason: collision with root package name */
        private final String f77407e;

        /* renamed from: f  reason: collision with root package name */
        private final C10377h f77408f;

        /* renamed from: g  reason: collision with root package name */
        private final j f77409g;

        /* renamed from: h  reason: collision with root package name */
        private final h f77410h;

        public c(List<e> list, String str, boolean z10, k kVar, String str2, C10377h hVar, j jVar, h hVar2) {
            C17542s.j(list, "deliveryItems");
            C17542s.j(str, "id");
            C17542s.j(kVar, "selectedTimeWindow");
            C17542s.j(str2, "serviceItemId");
            C17542s.j(hVar, "type");
            C17542s.j(hVar2, "presentation");
            this.f77403a = list;
            this.f77404b = str;
            this.f77405c = z10;
            this.f77406d = kVar;
            this.f77407e = str2;
            this.f77408f = hVar;
            this.f77409g = jVar;
            this.f77410h = hVar2;
        }

        public final List<e> a() {
            return this.f77403a;
        }

        public final String b() {
            return this.f77404b;
        }

        public final h c() {
            return this.f77410h;
        }

        public final boolean d() {
            return this.f77405c;
        }

        public final j e() {
            return this.f77409g;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return C17542s.e(this.f77403a, cVar.f77403a) && C17542s.e(this.f77404b, cVar.f77404b) && this.f77405c == cVar.f77405c && C17542s.e(this.f77406d, cVar.f77406d) && C17542s.e(this.f77407e, cVar.f77407e) && this.f77408f == cVar.f77408f && C17542s.e(this.f77409g, cVar.f77409g) && C17542s.e(this.f77410h, cVar.f77410h);
        }

        public final k f() {
            return this.f77406d;
        }

        public final String g() {
            return this.f77407e;
        }

        public final C10377h h() {
            return this.f77408f;
        }

        public int hashCode() {
            int hashCode = ((((((((((this.f77403a.hashCode() * 31) + this.f77404b.hashCode()) * 31) + Boolean.hashCode(this.f77405c)) * 31) + this.f77406d.hashCode()) * 31) + this.f77407e.hashCode()) * 31) + this.f77408f.hashCode()) * 31;
            j jVar = this.f77409g;
            return ((hashCode + (jVar == null ? 0 : jVar.hashCode())) * 31) + this.f77410h.hashCode();
        }

        public String toString() {
            List<e> list = this.f77403a;
            String str = this.f77404b;
            boolean z10 = this.f77405c;
            k kVar = this.f77406d;
            String str2 = this.f77407e;
            C10377h hVar = this.f77408f;
            j jVar = this.f77409g;
            h hVar2 = this.f77410h;
            return "Delivery(deliveryItems=" + list + ", id=" + str + ", rangeOfDays=" + z10 + ", selectedTimeWindow=" + kVar + ", serviceItemId=" + str2 + ", type=" + hVar + ", selectedPickUpPoint=" + jVar + ", presentation=" + hVar2 + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0015¨\u0006\u0016"}, d2 = {"Lvh/f0$d;", "", "", "__typename", "Lvh/p;", "deliveryDateDetailsFragment", "<init>", "(Ljava/lang/String;Lvh/p;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lvh/p;", "()Lvh/p;", "apollo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: vh.f0$d */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        private final String f77411a;

        /* renamed from: b  reason: collision with root package name */
        private final C10339p f77412b;

        public d(String str, C10339p pVar) {
            C17542s.j(str, "__typename");
            C17542s.j(pVar, "deliveryDateDetailsFragment");
            this.f77411a = str;
            this.f77412b = pVar;
        }

        public final C10339p a() {
            return this.f77412b;
        }

        public final String b() {
            return this.f77411a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return C17542s.e(this.f77411a, dVar.f77411a) && C17542s.e(this.f77412b, dVar.f77412b);
        }

        public int hashCode() {
            return (this.f77411a.hashCode() * 31) + this.f77412b.hashCode();
        }

        public String toString() {
            String str = this.f77411a;
            C10339p pVar = this.f77412b;
            return "DeliveryDateDetails(__typename=" + str + ", deliveryDateDetailsFragment=" + pVar + ")";
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0012\u0010\b¨\u0006\u0013"}, d2 = {"Lvh/f0$e;", "", "", "itemNo", "parentId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "apollo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: vh.f0$e */
    public static final class e {

        /* renamed from: a  reason: collision with root package name */
        private final String f77413a;

        /* renamed from: b  reason: collision with root package name */
        private final String f77414b;

        public e(String str, String str2) {
            C17542s.j(str, "itemNo");
            this.f77413a = str;
            this.f77414b = str2;
        }

        public final String a() {
            return this.f77413a;
        }

        public final String b() {
            return this.f77414b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return C17542s.e(this.f77413a, eVar.f77413a) && C17542s.e(this.f77414b, eVar.f77414b);
        }

        public int hashCode() {
            int hashCode = this.f77413a.hashCode() * 31;
            String str = this.f77414b;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            String str = this.f77413a;
            String str2 = this.f77414b;
            return "DeliveryItem(itemNo=" + str + ", parentId=" + str2 + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0015\u0010\f¨\u0006\u0016"}, d2 = {"Lvh/f0$f;", "", "", "articleId", "", "deliveryPart", "numberOfDeliveries", "<init>", "(Ljava/lang/String;II)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "I", "c", "apollo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: vh.f0$f */
    public static final class f {

        /* renamed from: a  reason: collision with root package name */
        private final String f77415a;

        /* renamed from: b  reason: collision with root package name */
        private final int f77416b;

        /* renamed from: c  reason: collision with root package name */
        private final int f77417c;

        public f(String str, int i10, int i11) {
            C17542s.j(str, "articleId");
            this.f77415a = str;
            this.f77416b = i10;
            this.f77417c = i11;
        }

        public final String a() {
            return this.f77415a;
        }

        public final int b() {
            return this.f77416b;
        }

        public final int c() {
            return this.f77417c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return C17542s.e(this.f77415a, fVar.f77415a) && this.f77416b == fVar.f77416b && this.f77417c == fVar.f77417c;
        }

        public int hashCode() {
            return (((this.f77415a.hashCode() * 31) + Integer.hashCode(this.f77416b)) * 31) + Integer.hashCode(this.f77417c);
        }

        public String toString() {
            String str = this.f77415a;
            int i10 = this.f77416b;
            int i11 = this.f77417c;
            return "Item(articleId=" + str + ", deliveryPart=" + i10 + ", numberOfDeliveries=" + i11 + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0015¨\u0006\u0016"}, d2 = {"Lvh/f0$g;", "", "", "__typename", "Lvh/L;", "openingHoursFragment", "<init>", "(Ljava/lang/String;Lvh/L;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lvh/L;", "()Lvh/L;", "apollo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: vh.f0$g */
    public static final class g {

        /* renamed from: a  reason: collision with root package name */
        private final String f77418a;

        /* renamed from: b  reason: collision with root package name */
        private final L f77419b;

        public g(String str, L l10) {
            C17542s.j(str, "__typename");
            C17542s.j(l10, "openingHoursFragment");
            this.f77418a = str;
            this.f77419b = l10;
        }

        public final L a() {
            return this.f77419b;
        }

        public final String b() {
            return this.f77418a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return C17542s.e(this.f77418a, gVar.f77418a) && C17542s.e(this.f77419b, gVar.f77419b);
        }

        public int hashCode() {
            return (this.f77418a.hashCode() * 31) + this.f77419b.hashCode();
        }

        public String toString() {
            String str = this.f77418a;
            L l10 = this.f77419b;
            return "OpeningHours(__typename=" + str + ", openingHoursFragment=" + l10 + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000f\b\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0018\u001a\u0004\b\u0017\u0010\fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0013\u0010\u001b¨\u0006\u001c"}, d2 = {"Lvh/f0$h;", "", "Lvh/f0$d;", "deliveryDateDetails", "", "selectTimeWindowDescription", "collapsedDeliveryInformation", "", "allowChangingTimeslot", "<init>", "(Lvh/f0$d;Ljava/lang/String;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lvh/f0$d;", "c", "()Lvh/f0$d;", "b", "Ljava/lang/String;", "d", "Z", "()Z", "apollo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: vh.f0$h */
    public static final class h {

        /* renamed from: a  reason: collision with root package name */
        private final d f77420a;

        /* renamed from: b  reason: collision with root package name */
        private final String f77421b;

        /* renamed from: c  reason: collision with root package name */
        private final String f77422c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f77423d;

        public h(d dVar, String str, String str2, boolean z10) {
            this.f77420a = dVar;
            this.f77421b = str;
            this.f77422c = str2;
            this.f77423d = z10;
        }

        public final boolean a() {
            return this.f77423d;
        }

        public final String b() {
            return this.f77422c;
        }

        public final d c() {
            return this.f77420a;
        }

        public final String d() {
            return this.f77421b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return C17542s.e(this.f77420a, hVar.f77420a) && C17542s.e(this.f77421b, hVar.f77421b) && C17542s.e(this.f77422c, hVar.f77422c) && this.f77423d == hVar.f77423d;
        }

        public int hashCode() {
            d dVar = this.f77420a;
            int i10 = 0;
            int hashCode = (dVar == null ? 0 : dVar.hashCode()) * 31;
            String str = this.f77421b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f77422c;
            if (str2 != null) {
                i10 = str2.hashCode();
            }
            return ((hashCode2 + i10) * 31) + Boolean.hashCode(this.f77423d);
        }

        public String toString() {
            d dVar = this.f77420a;
            String str = this.f77421b;
            String str2 = this.f77422c;
            boolean z10 = this.f77423d;
            return "Presentation(deliveryDateDetails=" + dVar + ", selectTimeWindowDescription=" + str + ", collapsedDeliveryInformation=" + str2 + ", allowChangingTimeslot=" + z10 + ")";
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\u0014¨\u0006\u0015"}, d2 = {"Lvh/f0$i;", "", "", "inclTax", "exclTax", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Double;", "b", "()Ljava/lang/Double;", "apollo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: vh.f0$i */
    public static final class i {

        /* renamed from: a  reason: collision with root package name */
        private final Double f77424a;

        /* renamed from: b  reason: collision with root package name */
        private final Double f77425b;

        public i(Double d10, Double d11) {
            this.f77424a = d10;
            this.f77425b = d11;
        }

        public final Double a() {
            return this.f77425b;
        }

        public final Double b() {
            return this.f77424a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return C17542s.e(this.f77424a, iVar.f77424a) && C17542s.e(this.f77425b, iVar.f77425b);
        }

        public int hashCode() {
            Double d10 = this.f77424a;
            int i10 = 0;
            int hashCode = (d10 == null ? 0 : d10.hashCode()) * 31;
            Double d11 = this.f77425b;
            if (d11 != null) {
                i10 = d11.hashCode();
            }
            return hashCode + i10;
        }

        public String toString() {
            Double d10 = this.f77424a;
            Double d11 = this.f77425b;
            return "Price(inclTax=" + d10 + ", exclTax=" + d11 + ")";
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0014\b\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b!\u0010 \u001a\u0004\b#\u0010\"R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u0011R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b%\u0010$\u001a\u0004\b&\u0010\u0011R\u0017\u0010\u000b\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b&\u0010$\u001a\u0004\b\u001f\u0010\u0011R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b'\u0010)¨\u0006*"}, d2 = {"Lvh/f0$j;", "", "Lvh/f0$a;", "address", "", "distance", "latitude", "longitude", "", "name", "ocPUPId", "identifier", "Lvh/f0$g;", "openingHours", "<init>", "(Lvh/f0$a;DLjava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvh/f0$g;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lvh/f0$a;", "()Lvh/f0$a;", "b", "D", "()D", "c", "Ljava/lang/Double;", "d", "()Ljava/lang/Double;", "e", "Ljava/lang/String;", "f", "g", "h", "Lvh/f0$g;", "()Lvh/f0$g;", "apollo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: vh.f0$j */
    public static final class j {

        /* renamed from: a  reason: collision with root package name */
        private final a f77426a;

        /* renamed from: b  reason: collision with root package name */
        private final double f77427b;

        /* renamed from: c  reason: collision with root package name */
        private final Double f77428c;

        /* renamed from: d  reason: collision with root package name */
        private final Double f77429d;

        /* renamed from: e  reason: collision with root package name */
        private final String f77430e;

        /* renamed from: f  reason: collision with root package name */
        private final String f77431f;

        /* renamed from: g  reason: collision with root package name */
        private final String f77432g;

        /* renamed from: h  reason: collision with root package name */
        private final g f77433h;

        public j(a aVar, double d10, Double d11, Double d12, String str, String str2, String str3, g gVar) {
            C17542s.j(aVar, PlaceTypes.ADDRESS);
            C17542s.j(str, "name");
            C17542s.j(str2, "ocPUPId");
            C17542s.j(str3, "identifier");
            C17542s.j(gVar, "openingHours");
            this.f77426a = aVar;
            this.f77427b = d10;
            this.f77428c = d11;
            this.f77429d = d12;
            this.f77430e = str;
            this.f77431f = str2;
            this.f77432g = str3;
            this.f77433h = gVar;
        }

        public final a a() {
            return this.f77426a;
        }

        public final double b() {
            return this.f77427b;
        }

        public final String c() {
            return this.f77432g;
        }

        public final Double d() {
            return this.f77428c;
        }

        public final Double e() {
            return this.f77429d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return C17542s.e(this.f77426a, jVar.f77426a) && Double.compare(this.f77427b, jVar.f77427b) == 0 && C17542s.e(this.f77428c, jVar.f77428c) && C17542s.e(this.f77429d, jVar.f77429d) && C17542s.e(this.f77430e, jVar.f77430e) && C17542s.e(this.f77431f, jVar.f77431f) && C17542s.e(this.f77432g, jVar.f77432g) && C17542s.e(this.f77433h, jVar.f77433h);
        }

        public final String f() {
            return this.f77430e;
        }

        public final String g() {
            return this.f77431f;
        }

        public final g h() {
            return this.f77433h;
        }

        public int hashCode() {
            int hashCode = ((this.f77426a.hashCode() * 31) + Double.hashCode(this.f77427b)) * 31;
            Double d10 = this.f77428c;
            int i10 = 0;
            int hashCode2 = (hashCode + (d10 == null ? 0 : d10.hashCode())) * 31;
            Double d11 = this.f77429d;
            if (d11 != null) {
                i10 = d11.hashCode();
            }
            return ((((((((hashCode2 + i10) * 31) + this.f77430e.hashCode()) * 31) + this.f77431f.hashCode()) * 31) + this.f77432g.hashCode()) * 31) + this.f77433h.hashCode();
        }

        public String toString() {
            a aVar = this.f77426a;
            double d10 = this.f77427b;
            Double d11 = this.f77428c;
            Double d12 = this.f77429d;
            String str = this.f77430e;
            String str2 = this.f77431f;
            String str3 = this.f77432g;
            g gVar = this.f77433h;
            return "SelectedPickUpPoint(address=" + aVar + ", distance=" + d10 + ", latitude=" + d11 + ", longitude=" + d12 + ", name=" + str + ", ocPUPId=" + str2 + ", identifier=" + str3 + ", openingHours=" + gVar + ")";
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u001a\u0010\u000fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001e\u0010\u000fR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0018\u001a\u0004\b\u001f\u0010\u000fR\u001f\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u001e\u0010 \u001a\u0004\b\u0017\u0010!¨\u0006\""}, d2 = {"Lvh/f0$k;", "", "", "fromDateTime", "id", "Lvh/f0$i;", "price", "toDateTime", "timeZone", "", "Lvh/f0$b;", "capability", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lvh/f0$i;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "Lvh/f0$i;", "d", "()Lvh/f0$i;", "f", "e", "Ljava/util/List;", "()Ljava/util/List;", "apollo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: vh.f0$k */
    public static final class k {

        /* renamed from: a  reason: collision with root package name */
        private final String f77434a;

        /* renamed from: b  reason: collision with root package name */
        private final String f77435b;

        /* renamed from: c  reason: collision with root package name */
        private final i f77436c;

        /* renamed from: d  reason: collision with root package name */
        private final String f77437d;

        /* renamed from: e  reason: collision with root package name */
        private final String f77438e;

        /* renamed from: f  reason: collision with root package name */
        private final List<b> f77439f;

        public k(String str, String str2, i iVar, String str3, String str4, List<b> list) {
            C17542s.j(str, "fromDateTime");
            C17542s.j(str2, "id");
            C17542s.j(str3, "toDateTime");
            C17542s.j(str4, "timeZone");
            this.f77434a = str;
            this.f77435b = str2;
            this.f77436c = iVar;
            this.f77437d = str3;
            this.f77438e = str4;
            this.f77439f = list;
        }

        public final List<b> a() {
            return this.f77439f;
        }

        public final String b() {
            return this.f77434a;
        }

        public final String c() {
            return this.f77435b;
        }

        public final i d() {
            return this.f77436c;
        }

        public final String e() {
            return this.f77438e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return C17542s.e(this.f77434a, kVar.f77434a) && C17542s.e(this.f77435b, kVar.f77435b) && C17542s.e(this.f77436c, kVar.f77436c) && C17542s.e(this.f77437d, kVar.f77437d) && C17542s.e(this.f77438e, kVar.f77438e) && C17542s.e(this.f77439f, kVar.f77439f);
        }

        public final String f() {
            return this.f77437d;
        }

        public int hashCode() {
            int hashCode = ((this.f77434a.hashCode() * 31) + this.f77435b.hashCode()) * 31;
            i iVar = this.f77436c;
            int i10 = 0;
            int hashCode2 = (((((hashCode + (iVar == null ? 0 : iVar.hashCode())) * 31) + this.f77437d.hashCode()) * 31) + this.f77438e.hashCode()) * 31;
            List<b> list = this.f77439f;
            if (list != null) {
                i10 = list.hashCode();
            }
            return hashCode2 + i10;
        }

        public String toString() {
            String str = this.f77434a;
            String str2 = this.f77435b;
            i iVar = this.f77436c;
            String str3 = this.f77437d;
            String str4 = this.f77438e;
            List<b> list = this.f77439f;
            return "SelectedTimeWindow(fromDateTime=" + str + ", id=" + str2 + ", price=" + iVar + ", toDateTime=" + str3 + ", timeZone=" + str4 + ", capability=" + list + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0015¨\u0006\u0016"}, d2 = {"Lvh/f0$l;", "", "", "__typename", "Lvh/u0;", "solutionPriceFragment", "<init>", "(Ljava/lang/String;Lvh/u0;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lvh/u0;", "()Lvh/u0;", "apollo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: vh.f0$l */
    public static final class l {

        /* renamed from: a  reason: collision with root package name */
        private final String f77440a;

        /* renamed from: b  reason: collision with root package name */
        private final u0 f77441b;

        public l(String str, u0 u0Var) {
            C17542s.j(str, "__typename");
            C17542s.j(u0Var, "solutionPriceFragment");
            this.f77440a = str;
            this.f77441b = u0Var;
        }

        public final u0 a() {
            return this.f77441b;
        }

        public final String b() {
            return this.f77440a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return C17542s.e(this.f77440a, lVar.f77440a) && C17542s.e(this.f77441b, lVar.f77441b);
        }

        public int hashCode() {
            return (this.f77440a.hashCode() * 31) + this.f77441b.hashCode();
        }

        public String toString() {
            String str = this.f77440a;
            u0 u0Var = this.f77441b;
            return "SolutionPrice(__typename=" + str + ", solutionPriceFragment=" + u0Var + ")";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\nR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, d2 = {"Lvh/f0$m;", "", "", "deliveryId", "", "Lvh/f0$f;", "items", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Ljava/util/List;", "()Ljava/util/List;", "apollo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: vh.f0$m */
    public static final class m {

        /* renamed from: a  reason: collision with root package name */
        private final String f77442a;

        /* renamed from: b  reason: collision with root package name */
        private final List<f> f77443b;

        public m(String str, List<f> list) {
            C17542s.j(str, "deliveryId");
            C17542s.j(list, "items");
            this.f77442a = str;
            this.f77443b = list;
        }

        public final String a() {
            return this.f77442a;
        }

        public final List<f> b() {
            return this.f77443b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof m)) {
                return false;
            }
            m mVar = (m) obj;
            return C17542s.e(this.f77442a, mVar.f77442a) && C17542s.e(this.f77443b, mVar.f77443b);
        }

        public int hashCode() {
            return (this.f77442a.hashCode() * 31) + this.f77443b.hashCode();
        }

        public String toString() {
            String str = this.f77442a;
            List<f> list = this.f77443b;
            return "SplittedItem(deliveryId=" + str + ", items=" + list + ")";
        }
    }

    public C10325f0(C10374e eVar, C10375f fVar, String str, l lVar, List<m> list, List<c> list2) {
        C17542s.j(eVar, "solution");
        C17542s.j(fVar, "fulfillmentMethodType");
        C17542s.j(str, "id");
        C17542s.j(lVar, "solutionPrice");
        C17542s.j(list, "splittedItems");
        C17542s.j(list2, "deliveries");
        this.f77394a = eVar;
        this.f77395b = fVar;
        this.f77396c = str;
        this.f77397d = lVar;
        this.f77398e = list;
        this.f77399f = list2;
    }

    public final List<c> a() {
        return this.f77399f;
    }

    public final C10375f b() {
        return this.f77395b;
    }

    public final String c() {
        return this.f77396c;
    }

    public final C10374e d() {
        return this.f77394a;
    }

    public final l e() {
        return this.f77397d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10325f0)) {
            return false;
        }
        C10325f0 f0Var = (C10325f0) obj;
        return this.f77394a == f0Var.f77394a && this.f77395b == f0Var.f77395b && C17542s.e(this.f77396c, f0Var.f77396c) && C17542s.e(this.f77397d, f0Var.f77397d) && C17542s.e(this.f77398e, f0Var.f77398e) && C17542s.e(this.f77399f, f0Var.f77399f);
    }

    public final List<m> f() {
        return this.f77398e;
    }

    public int hashCode() {
        return (((((((((this.f77394a.hashCode() * 31) + this.f77395b.hashCode()) * 31) + this.f77396c.hashCode()) * 31) + this.f77397d.hashCode()) * 31) + this.f77398e.hashCode()) * 31) + this.f77399f.hashCode();
    }

    public String toString() {
        C10374e eVar = this.f77394a;
        C10375f fVar = this.f77395b;
        String str = this.f77396c;
        l lVar = this.f77397d;
        List<m> list = this.f77398e;
        List<c> list2 = this.f77399f;
        return "SelectedDeliveryServiceFragment(solution=" + eVar + ", fulfillmentMethodType=" + fVar + ", id=" + str + ", solutionPrice=" + lVar + ", splittedItems=" + list + ", deliveries=" + list2 + ")";
    }
}
