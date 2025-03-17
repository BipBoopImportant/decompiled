package zG;

import OE.n;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.sugarcube.app.base.data.database.CachedCatalogItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"LzG/e;", "", "<init>", "()V", "b", "c", "a", "LzG/e$a;", "LzG/e$b;", "LzG/e$c;", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class e {

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\n¨\u0006\u0012"}, d2 = {"LzG/e$a;", "LzG/e;", "", "messageRes", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends e {

        /* renamed from: a  reason: collision with root package name */
        private final int f152778a;

        public a() {
            this(0, 1, (DefaultConstructorMarker) null);
        }

        public final int a() {
            return this.f152778a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f152778a == ((a) obj).f152778a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f152778a);
        }

        public String toString() {
            int i10 = this.f152778a;
            return "Error(messageRes=" + i10 + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ a(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? n.f113336b5 : i10);
        }

        public a(int i10) {
            super((DefaultConstructorMarker) null);
            this.f152778a = i10;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LzG/e$b;", "LzG/e;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends e {

        /* renamed from: a  reason: collision with root package name */
        public static final b f152779a = new b();

        private b() {
            super((DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return 955017338;
        }

        public String toString() {
            return "Loading";
        }
    }

    public /* synthetic */ e(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private e() {
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\r\b\b\u0018\u00002\u00020\u0001B3\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0015\u0010\rR\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001d\u001a\u0004\b\u001c\u0010\r¨\u0006\u001e"}, d2 = {"LzG/e$c;", "LzG/e;", "", "Lcom/sugarcube/app/base/data/database/CachedCatalogItem;", "items", "", "isPaging", "", "country", "language", "<init>", "(Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "Z", "d", "()Z", "c", "Ljava/lang/String;", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c extends e {

        /* renamed from: a  reason: collision with root package name */
        private final List<CachedCatalogItem> f152780a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f152781b;

        /* renamed from: c  reason: collision with root package name */
        private final String f152782c;

        /* renamed from: d  reason: collision with root package name */
        private final String f152783d;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ c(List list, boolean z10, String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, (i10 & 2) != 0 ? false : z10, (i10 & 4) != 0 ? "us" : str, (i10 & 8) != 0 ? "en" : str2);
        }

        public final String a() {
            return this.f152782c;
        }

        public final List<CachedCatalogItem> b() {
            return this.f152780a;
        }

        public final String c() {
            return this.f152783d;
        }

        public final boolean d() {
            return this.f152781b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return C17542s.e(this.f152780a, cVar.f152780a) && this.f152781b == cVar.f152781b && C17542s.e(this.f152782c, cVar.f152782c) && C17542s.e(this.f152783d, cVar.f152783d);
        }

        public int hashCode() {
            return (((((this.f152780a.hashCode() * 31) + Boolean.hashCode(this.f152781b)) * 31) + this.f152782c.hashCode()) * 31) + this.f152783d.hashCode();
        }

        public String toString() {
            List<CachedCatalogItem> list = this.f152780a;
            boolean z10 = this.f152781b;
            String str = this.f152782c;
            String str2 = this.f152783d;
            return "Success(items=" + list + ", isPaging=" + z10 + ", country=" + str + ", language=" + str2 + ")";
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(List<CachedCatalogItem> list, boolean z10, String str, String str2) {
            super((DefaultConstructorMarker) null);
            C17542s.j(list, "items");
            C17542s.j(str, PlaceTypes.COUNTRY);
            C17542s.j(str2, "language");
            this.f152780a = list;
            this.f152781b = z10;
            this.f152782c = str;
            this.f152783d = str2;
        }
    }
}
