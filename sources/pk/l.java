package pk;

import IC.C13023e;
import KJ.C15987c;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b*\b\b\u0018\u00002\u00020\u0001:\u0002%\u001aB\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\f\u0012\u0006\u0010\u0016\u001a\u00020\u0011\u0012\u0006\u0010\u0017\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0019J¬\u0001\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00112\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\f2\b\b\u0002\u0010\u0016\u001a\u00020\u00112\b\b\u0002\u0010\u0017\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010!\u001a\u00020\u00112\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010#\u001a\u0004\b$\u0010\u001dR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b%\u0010#\u001a\u0004\b&\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010#\u001a\u0004\b(\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b-\u0010#\u001a\u0004\b.\u0010\u001dR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u0010\u001fR\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b2\u00100\u001a\u0004\b3\u0010\u001fR\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b-\u00106R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b.\u00107\u001a\u0004\b'\u00108R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b$\u00109\u001a\u0004\b:\u0010;R\u0017\u0010\u0013\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b&\u00109\u001a\u0004\b)\u0010;R\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\f8\u0006¢\u0006\f\n\u0004\b+\u00105\u001a\u0004\b2\u00106R\u0017\u0010\u0016\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b1\u00109\u001a\u0004\b4\u0010;R\u0017\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b3\u0010#\u001a\u0004\b<\u0010\u001dR\u0011\u0010=\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b/\u0010\u001d¨\u0006>"}, d2 = {"Lpk/l;", "", "", "itemNo", "name", "description", "Lpk/p;", "price", "imageUrl", "", "quantity", "totalPackages", "LKJ/c;", "Lpk/l$b;", "childItems", "Lpk/l$a;", "availability", "", "isDiscontinued", "canBeAddedToCart", "LIC/e;", "ecoFees", "familyAndRegularPriceSameSize", "measurement", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lpk/p;Ljava/lang/String;IILKJ/c;Lpk/l$a;ZZLKJ/c;ZLjava/lang/String;)V", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lpk/p;Ljava/lang/String;IILKJ/c;Lpk/l$a;ZZLKJ/c;ZLjava/lang/String;)Lpk/l;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "j", "b", "k", "c", "getDescription", "d", "Lpk/p;", "l", "()Lpk/p;", "e", "i", "f", "I", "m", "g", "n", "h", "LKJ/c;", "()LKJ/c;", "Lpk/l$a;", "()Lpk/l$a;", "Z", "o", "()Z", "getMeasurement", "descriptionWithMeasurement", "shoppinglist-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class l {

    /* renamed from: a  reason: collision with root package name */
    private final String f100962a;

    /* renamed from: b  reason: collision with root package name */
    private final String f100963b;

    /* renamed from: c  reason: collision with root package name */
    private final String f100964c;

    /* renamed from: d  reason: collision with root package name */
    private final p f100965d;

    /* renamed from: e  reason: collision with root package name */
    private final String f100966e;

    /* renamed from: f  reason: collision with root package name */
    private final int f100967f;

    /* renamed from: g  reason: collision with root package name */
    private final int f100968g;

    /* renamed from: h  reason: collision with root package name */
    private final C15987c<b> f100969h;

    /* renamed from: i  reason: collision with root package name */
    private final a f100970i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f100971j;

    /* renamed from: k  reason: collision with root package name */
    private final boolean f100972k;

    /* renamed from: l  reason: collision with root package name */
    private final C15987c<C13023e> f100973l;

    /* renamed from: m  reason: collision with root package name */
    private final boolean f100974m;

    /* renamed from: n  reason: collision with root package name */
    private final String f100975n;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0005\u000e\u0007\n\u000f\fR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\bR\u0016\u0010\r\u001a\u0004\u0018\u00010\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\b\u0001\u0005\u0010\u0011\u0012\u0013\u0014¨\u0006\u0015"}, d2 = {"Lpk/l$a;", "", "LIC/e;", "l", "()LIC/e;", "label", "", "c", "()Ljava/lang/String;", "bin", "b", "aisle", "a", "location", "d", "e", "Lpk/l$a$a;", "Lpk/l$a$b;", "Lpk/l$a$c;", "Lpk/l$a$d;", "Lpk/l$a$e;", "shoppinglist-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface a {

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u0018\u0010\u000bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u0014\u0010\u000b¨\u0006\u001c"}, d2 = {"Lpk/l$a$a;", "Lpk/l$a;", "LIC/e;", "label", "", "bin", "aisle", "location", "<init>", "(LIC/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LIC/e;", "l", "()LIC/e;", "b", "Ljava/lang/String;", "c", "d", "shoppinglist-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: pk.l$a$a  reason: collision with other inner class name */
        public static final class C2375a implements a {

            /* renamed from: a  reason: collision with root package name */
            private final C13023e f100976a;

            /* renamed from: b  reason: collision with root package name */
            private final String f100977b;

            /* renamed from: c  reason: collision with root package name */
            private final String f100978c;

            /* renamed from: d  reason: collision with root package name */
            private final String f100979d;

            public C2375a(C13023e eVar, String str, String str2, String str3) {
                C17542s.j(eVar, "label");
                this.f100976a = eVar;
                this.f100977b = str;
                this.f100978c = str2;
                this.f100979d = str3;
            }

            public String a() {
                return this.f100979d;
            }

            public String b() {
                return this.f100978c;
            }

            public String c() {
                return this.f100977b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C2375a)) {
                    return false;
                }
                C2375a aVar = (C2375a) obj;
                return C17542s.e(this.f100976a, aVar.f100976a) && C17542s.e(this.f100977b, aVar.f100977b) && C17542s.e(this.f100978c, aVar.f100978c) && C17542s.e(this.f100979d, aVar.f100979d);
            }

            public int hashCode() {
                int hashCode = this.f100976a.hashCode() * 31;
                String str = this.f100977b;
                int i10 = 0;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.f100978c;
                int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.f100979d;
                if (str3 != null) {
                    i10 = str3.hashCode();
                }
                return hashCode3 + i10;
            }

            public C13023e l() {
                return this.f100976a;
            }

            public String toString() {
                C13023e eVar = this.f100976a;
                String str = this.f100977b;
                String str2 = this.f100978c;
                String str3 = this.f100979d;
                return "InStock(label=" + eVar + ", bin=" + str + ", aisle=" + str2 + ", location=" + str3 + ")";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0012\u001a\u00020\r8\u0016X\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0017\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u0004R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0019\u001a\u0004\b\u0013\u0010\u0004R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u000e\u0010\u0004¨\u0006\u001e"}, d2 = {"Lpk/l$a$b;", "Lpk/l$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "LIC/e;", "a", "LIC/e;", "l", "()LIC/e;", "label", "b", "Z", "d", "()Z", "notAvailableInAllStores", "c", "Ljava/lang/String;", "bin", "aisle", "e", "location", "shoppinglist-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class b implements a {

            /* renamed from: a  reason: collision with root package name */
            private final C13023e f100980a;

            /* renamed from: b  reason: collision with root package name */
            private final boolean f100981b;

            /* renamed from: c  reason: collision with root package name */
            private final String f100982c;

            /* renamed from: d  reason: collision with root package name */
            private final String f100983d;

            /* renamed from: e  reason: collision with root package name */
            private final String f100984e;

            public String a() {
                return this.f100984e;
            }

            public String b() {
                return this.f100983d;
            }

            public String c() {
                return this.f100982c;
            }

            public final boolean d() {
                return this.f100981b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return C17542s.e(this.f100980a, bVar.f100980a) && this.f100981b == bVar.f100981b && C17542s.e(this.f100982c, bVar.f100982c) && C17542s.e(this.f100983d, bVar.f100983d) && C17542s.e(this.f100984e, bVar.f100984e);
            }

            public int hashCode() {
                int hashCode = ((this.f100980a.hashCode() * 31) + Boolean.hashCode(this.f100981b)) * 31;
                String str = this.f100982c;
                int i10 = 0;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.f100983d;
                int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.f100984e;
                if (str3 != null) {
                    i10 = str3.hashCode();
                }
                return hashCode3 + i10;
            }

            public C13023e l() {
                return this.f100980a;
            }

            public String toString() {
                C13023e eVar = this.f100980a;
                boolean z10 = this.f100981b;
                String str = this.f100982c;
                String str2 = this.f100983d;
                String str3 = this.f100984e;
                return "NotSold(label=" + eVar + ", notAvailableInAllStores=" + z10 + ", bin=" + str + ", aisle=" + str2 + ", location=" + str3 + ")";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0012\b\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u0019\u001a\u0004\b\"\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010\u001fR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0016X\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b \u0010\u0010R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0016X\u0004¢\u0006\f\n\u0004\b\u001e\u0010$\u001a\u0004\b\u001c\u0010\u0010R\u001c\u0010\f\u001a\u0004\u0018\u00010\t8\u0016X\u0004¢\u0006\f\n\u0004\b%\u0010$\u001a\u0004\b\u0018\u0010\u0010¨\u0006&"}, d2 = {"Lpk/l$a$c;", "Lpk/l$a;", "LIC/e;", "label", "", "showBackInStockNotification", "availableInOtherStores", "backInStockExpectationLabel", "showAlternatives", "", "bin", "aisle", "location", "<init>", "(LIC/e;ZZLIC/e;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "LIC/e;", "l", "()LIC/e;", "b", "Z", "g", "()Z", "c", "d", "e", "f", "Ljava/lang/String;", "h", "shoppinglist-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class c implements a {

            /* renamed from: a  reason: collision with root package name */
            private final C13023e f100985a;

            /* renamed from: b  reason: collision with root package name */
            private final boolean f100986b;

            /* renamed from: c  reason: collision with root package name */
            private final boolean f100987c;

            /* renamed from: d  reason: collision with root package name */
            private final C13023e f100988d;

            /* renamed from: e  reason: collision with root package name */
            private final boolean f100989e;

            /* renamed from: f  reason: collision with root package name */
            private final String f100990f;

            /* renamed from: g  reason: collision with root package name */
            private final String f100991g;

            /* renamed from: h  reason: collision with root package name */
            private final String f100992h;

            public c(C13023e eVar, boolean z10, boolean z11, C13023e eVar2, boolean z12, String str, String str2, String str3) {
                C17542s.j(eVar, "label");
                this.f100985a = eVar;
                this.f100986b = z10;
                this.f100987c = z11;
                this.f100988d = eVar2;
                this.f100989e = z12;
                this.f100990f = str;
                this.f100991g = str2;
                this.f100992h = str3;
            }

            public String a() {
                return this.f100992h;
            }

            public String b() {
                return this.f100991g;
            }

            public String c() {
                return this.f100990f;
            }

            public final boolean d() {
                return this.f100987c;
            }

            public final C13023e e() {
                return this.f100988d;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return C17542s.e(this.f100985a, cVar.f100985a) && this.f100986b == cVar.f100986b && this.f100987c == cVar.f100987c && C17542s.e(this.f100988d, cVar.f100988d) && this.f100989e == cVar.f100989e && C17542s.e(this.f100990f, cVar.f100990f) && C17542s.e(this.f100991g, cVar.f100991g) && C17542s.e(this.f100992h, cVar.f100992h);
            }

            public final boolean f() {
                return this.f100989e;
            }

            public final boolean g() {
                return this.f100986b;
            }

            public int hashCode() {
                int hashCode = ((((this.f100985a.hashCode() * 31) + Boolean.hashCode(this.f100986b)) * 31) + Boolean.hashCode(this.f100987c)) * 31;
                C13023e eVar = this.f100988d;
                int i10 = 0;
                int hashCode2 = (((hashCode + (eVar == null ? 0 : eVar.hashCode())) * 31) + Boolean.hashCode(this.f100989e)) * 31;
                String str = this.f100990f;
                int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.f100991g;
                int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.f100992h;
                if (str3 != null) {
                    i10 = str3.hashCode();
                }
                return hashCode4 + i10;
            }

            public C13023e l() {
                return this.f100985a;
            }

            public String toString() {
                C13023e eVar = this.f100985a;
                boolean z10 = this.f100986b;
                boolean z11 = this.f100987c;
                C13023e eVar2 = this.f100988d;
                boolean z12 = this.f100989e;
                String str = this.f100990f;
                String str2 = this.f100991g;
                String str3 = this.f100992h;
                return "OutOfStock(label=" + eVar + ", showBackInStockNotification=" + z10 + ", availableInOtherStores=" + z11 + ", backInStockExpectationLabel=" + eVar2 + ", showAlternatives=" + z12 + ", bin=" + str + ", aisle=" + str2 + ", location=" + str3 + ")";
            }
        }

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u0018\u0010\u000bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u0014\u0010\u000b¨\u0006\u001c"}, d2 = {"Lpk/l$a$d;", "Lpk/l$a;", "LIC/e;", "label", "", "bin", "aisle", "location", "<init>", "(LIC/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LIC/e;", "l", "()LIC/e;", "b", "Ljava/lang/String;", "c", "d", "shoppinglist-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class d implements a {

            /* renamed from: a  reason: collision with root package name */
            private final C13023e f100993a;

            /* renamed from: b  reason: collision with root package name */
            private final String f100994b;

            /* renamed from: c  reason: collision with root package name */
            private final String f100995c;

            /* renamed from: d  reason: collision with root package name */
            private final String f100996d;

            public d(C13023e eVar, String str, String str2, String str3) {
                C17542s.j(eVar, "label");
                this.f100993a = eVar;
                this.f100994b = str;
                this.f100995c = str2;
                this.f100996d = str3;
            }

            public String a() {
                return this.f100996d;
            }

            public String b() {
                return this.f100995c;
            }

            public String c() {
                return this.f100994b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return C17542s.e(this.f100993a, dVar.f100993a) && C17542s.e(this.f100994b, dVar.f100994b) && C17542s.e(this.f100995c, dVar.f100995c) && C17542s.e(this.f100996d, dVar.f100996d);
            }

            public int hashCode() {
                int hashCode = this.f100993a.hashCode() * 31;
                String str = this.f100994b;
                int i10 = 0;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.f100995c;
                int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.f100996d;
                if (str3 != null) {
                    i10 = str3.hashCode();
                }
                return hashCode3 + i10;
            }

            public C13023e l() {
                return this.f100993a;
            }

            public String toString() {
                C13023e eVar = this.f100993a;
                String str = this.f100994b;
                String str2 = this.f100995c;
                String str3 = this.f100996d;
                return "RunningLow(label=" + eVar + ", bin=" + str + ", aisle=" + str2 + ", location=" + str3 + ")";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00068\u0016X\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\bR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00068\u0016X\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0015\u0010\bR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00068\u0016X\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u0011\u0010\b¨\u0006\u001c"}, d2 = {"Lpk/l$a$e;", "Lpk/l$a;", "LIC/e;", "label", "<init>", "(LIC/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LIC/e;", "l", "()LIC/e;", "b", "Ljava/lang/String;", "c", "bin", "aisle", "d", "location", "shoppinglist-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class e implements a {

            /* renamed from: a  reason: collision with root package name */
            private final C13023e f100997a;

            /* renamed from: b  reason: collision with root package name */
            private final String f100998b;

            /* renamed from: c  reason: collision with root package name */
            private final String f100999c;

            /* renamed from: d  reason: collision with root package name */
            private final String f101000d;

            public e(C13023e eVar) {
                C17542s.j(eVar, "label");
                this.f100997a = eVar;
            }

            public String a() {
                return this.f101000d;
            }

            public String b() {
                return this.f100999c;
            }

            public String c() {
                return this.f100998b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof e) && C17542s.e(this.f100997a, ((e) obj).f100997a);
            }

            public int hashCode() {
                return this.f100997a.hashCode();
            }

            public C13023e l() {
                return this.f100997a;
            }

            public String toString() {
                C13023e eVar = this.f100997a;
                return "Unknown(label=" + eVar + ")";
            }
        }

        String a();

        String b();

        String c();

        C13023e l();
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\r\b\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0018\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0010R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b\u001c\u0010\u0010R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0015\u0010\u001e¨\u0006\u001f"}, d2 = {"Lpk/l$b;", "", "", "itemNo", "name", "description", "", "quantity", "totalPackages", "Lpk/l$a;", "availability", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILpk/l$a;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "d", "I", "e", "f", "Lpk/l$a;", "()Lpk/l$a;", "shoppinglist-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final String f101001a;

        /* renamed from: b  reason: collision with root package name */
        private final String f101002b;

        /* renamed from: c  reason: collision with root package name */
        private final String f101003c;

        /* renamed from: d  reason: collision with root package name */
        private final int f101004d;

        /* renamed from: e  reason: collision with root package name */
        private final int f101005e;

        /* renamed from: f  reason: collision with root package name */
        private final a f101006f;

        public b(String str, String str2, String str3, int i10, int i11, a aVar) {
            C17542s.j(str, "itemNo");
            C17542s.j(str2, "name");
            C17542s.j(str3, "description");
            C17542s.j(aVar, "availability");
            this.f101001a = str;
            this.f101002b = str2;
            this.f101003c = str3;
            this.f101004d = i10;
            this.f101005e = i11;
            this.f101006f = aVar;
        }

        public final a a() {
            return this.f101006f;
        }

        public final String b() {
            return this.f101003c;
        }

        public final String c() {
            return this.f101001a;
        }

        public final String d() {
            return this.f101002b;
        }

        public final int e() {
            return this.f101004d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return C17542s.e(this.f101001a, bVar.f101001a) && C17542s.e(this.f101002b, bVar.f101002b) && C17542s.e(this.f101003c, bVar.f101003c) && this.f101004d == bVar.f101004d && this.f101005e == bVar.f101005e && C17542s.e(this.f101006f, bVar.f101006f);
        }

        public final int f() {
            return this.f101005e;
        }

        public int hashCode() {
            return (((((((((this.f101001a.hashCode() * 31) + this.f101002b.hashCode()) * 31) + this.f101003c.hashCode()) * 31) + Integer.hashCode(this.f101004d)) * 31) + Integer.hashCode(this.f101005e)) * 31) + this.f101006f.hashCode();
        }

        public String toString() {
            String str = this.f101001a;
            String str2 = this.f101002b;
            String str3 = this.f101003c;
            int i10 = this.f101004d;
            int i11 = this.f101005e;
            a aVar = this.f101006f;
            return "ChildItem(itemNo=" + str + ", name=" + str2 + ", description=" + str3 + ", quantity=" + i10 + ", totalPackages=" + i11 + ", availability=" + aVar + ")";
        }
    }

    public l(String str, String str2, String str3, p pVar, String str4, int i10, int i11, C15987c<b> cVar, a aVar, boolean z10, boolean z11, C15987c<? extends C13023e> cVar2, boolean z12, String str5) {
        C17542s.j(str, "itemNo");
        C17542s.j(str3, "description");
        C17542s.j(pVar, "price");
        C17542s.j(cVar, "childItems");
        C17542s.j(aVar, "availability");
        C17542s.j(cVar2, "ecoFees");
        C17542s.j(str5, "measurement");
        this.f100962a = str;
        this.f100963b = str2;
        this.f100964c = str3;
        this.f100965d = pVar;
        this.f100966e = str4;
        this.f100967f = i10;
        this.f100968g = i11;
        this.f100969h = cVar;
        this.f100970i = aVar;
        this.f100971j = z10;
        this.f100972k = z11;
        this.f100973l = cVar2;
        this.f100974m = z12;
        this.f100975n = str5;
    }

    public static /* synthetic */ l b(l lVar, String str, String str2, String str3, p pVar, String str4, int i10, int i11, C15987c cVar, a aVar, boolean z10, boolean z11, C15987c cVar2, boolean z12, String str5, int i12, Object obj) {
        l lVar2 = lVar;
        int i13 = i12;
        return lVar.a((i13 & 1) != 0 ? lVar2.f100962a : str, (i13 & 2) != 0 ? lVar2.f100963b : str2, (i13 & 4) != 0 ? lVar2.f100964c : str3, (i13 & 8) != 0 ? lVar2.f100965d : pVar, (i13 & 16) != 0 ? lVar2.f100966e : str4, (i13 & 32) != 0 ? lVar2.f100967f : i10, (i13 & 64) != 0 ? lVar2.f100968g : i11, (i13 & 128) != 0 ? lVar2.f100969h : cVar, (i13 & 256) != 0 ? lVar2.f100970i : aVar, (i13 & 512) != 0 ? lVar2.f100971j : z10, (i13 & 1024) != 0 ? lVar2.f100972k : z11, (i13 & RecyclerView.n.FLAG_MOVED) != 0 ? lVar2.f100973l : cVar2, (i13 & RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? lVar2.f100974m : z12, (i13 & 8192) != 0 ? lVar2.f100975n : str5);
    }

    public final l a(String str, String str2, String str3, p pVar, String str4, int i10, int i11, C15987c<b> cVar, a aVar, boolean z10, boolean z11, C15987c<? extends C13023e> cVar2, boolean z12, String str5) {
        String str6 = str;
        C17542s.j(str6, "itemNo");
        String str7 = str3;
        C17542s.j(str7, "description");
        p pVar2 = pVar;
        C17542s.j(pVar2, "price");
        C15987c<b> cVar3 = cVar;
        C17542s.j(cVar3, "childItems");
        a aVar2 = aVar;
        C17542s.j(aVar2, "availability");
        C15987c<? extends C13023e> cVar4 = cVar2;
        C17542s.j(cVar4, "ecoFees");
        String str8 = str5;
        C17542s.j(str8, "measurement");
        return new l(str6, str2, str7, pVar2, str4, i10, i11, cVar3, aVar2, z10, z11, cVar4, z12, str8);
    }

    public final a c() {
        return this.f100970i;
    }

    public final boolean d() {
        return this.f100972k;
    }

    public final C15987c<b> e() {
        return this.f100969h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return C17542s.e(this.f100962a, lVar.f100962a) && C17542s.e(this.f100963b, lVar.f100963b) && C17542s.e(this.f100964c, lVar.f100964c) && C17542s.e(this.f100965d, lVar.f100965d) && C17542s.e(this.f100966e, lVar.f100966e) && this.f100967f == lVar.f100967f && this.f100968g == lVar.f100968g && C17542s.e(this.f100969h, lVar.f100969h) && C17542s.e(this.f100970i, lVar.f100970i) && this.f100971j == lVar.f100971j && this.f100972k == lVar.f100972k && C17542s.e(this.f100973l, lVar.f100973l) && this.f100974m == lVar.f100974m && C17542s.e(this.f100975n, lVar.f100975n);
    }

    public final String f() {
        String str = this.f100964c + ", " + this.f100975n;
        if (this.f100975n.length() <= 0) {
            str = null;
        }
        return str == null ? this.f100964c : str;
    }

    public final C15987c<C13023e> g() {
        return this.f100973l;
    }

    public final boolean h() {
        return this.f100974m;
    }

    public int hashCode() {
        int hashCode = this.f100962a.hashCode() * 31;
        String str = this.f100963b;
        int i10 = 0;
        int hashCode2 = (((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f100964c.hashCode()) * 31) + this.f100965d.hashCode()) * 31;
        String str2 = this.f100966e;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return ((((((((((((((((((hashCode2 + i10) * 31) + Integer.hashCode(this.f100967f)) * 31) + Integer.hashCode(this.f100968g)) * 31) + this.f100969h.hashCode()) * 31) + this.f100970i.hashCode()) * 31) + Boolean.hashCode(this.f100971j)) * 31) + Boolean.hashCode(this.f100972k)) * 31) + this.f100973l.hashCode()) * 31) + Boolean.hashCode(this.f100974m)) * 31) + this.f100975n.hashCode();
    }

    public final String i() {
        return this.f100966e;
    }

    public final String j() {
        return this.f100962a;
    }

    public final String k() {
        return this.f100963b;
    }

    public final p l() {
        return this.f100965d;
    }

    public final int m() {
        return this.f100967f;
    }

    public final int n() {
        return this.f100968g;
    }

    public final boolean o() {
        return this.f100971j;
    }

    public String toString() {
        String str = this.f100962a;
        String str2 = this.f100963b;
        String str3 = this.f100964c;
        p pVar = this.f100965d;
        String str4 = this.f100966e;
        int i10 = this.f100967f;
        int i11 = this.f100968g;
        C15987c<b> cVar = this.f100969h;
        a aVar = this.f100970i;
        boolean z10 = this.f100971j;
        boolean z11 = this.f100972k;
        C15987c<C13023e> cVar2 = this.f100973l;
        boolean z12 = this.f100974m;
        String str5 = this.f100975n;
        return "ListProductItem(itemNo=" + str + ", name=" + str2 + ", description=" + str3 + ", price=" + pVar + ", imageUrl=" + str4 + ", quantity=" + i10 + ", totalPackages=" + i11 + ", childItems=" + cVar + ", availability=" + aVar + ", isDiscontinued=" + z10 + ", canBeAddedToCart=" + z11 + ", ecoFees=" + cVar2 + ", familyAndRegularPriceSameSize=" + z12 + ", measurement=" + str5 + ")";
    }
}
