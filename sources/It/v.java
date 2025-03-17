package It;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LIt/v;", "", "a", "b", "LIt/v$a;", "LIt/v$b;", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface v {

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0015\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0012\u0010\t¨\u0006\u0016"}, d2 = {"LIt/v$a;", "LIt/v;", "", "productName", "listName", "listId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements v {

        /* renamed from: a  reason: collision with root package name */
        private final String f82449a;

        /* renamed from: b  reason: collision with root package name */
        private final String f82450b;

        /* renamed from: c  reason: collision with root package name */
        private final String f82451c;

        public a(String str, String str2, String str3) {
            C17542s.j(str, "productName");
            C17542s.j(str2, "listName");
            C17542s.j(str3, "listId");
            this.f82449a = str;
            this.f82450b = str2;
            this.f82451c = str3;
        }

        public final String a() {
            return this.f82451c;
        }

        public final String b() {
            return this.f82450b;
        }

        public final String c() {
            return this.f82449a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f82449a, aVar.f82449a) && C17542s.e(this.f82450b, aVar.f82450b) && C17542s.e(this.f82451c, aVar.f82451c);
        }

        public int hashCode() {
            return (((this.f82449a.hashCode() * 31) + this.f82450b.hashCode()) * 31) + this.f82451c.hashCode();
        }

        public String toString() {
            String str = this.f82449a;
            String str2 = this.f82450b;
            String str3 = this.f82451c;
            return "AddedToList(productName=" + str + ", listName=" + str2 + ", listId=" + str3 + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0015\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0012\u0010\t¨\u0006\u0016"}, d2 = {"LIt/v$b;", "LIt/v;", "", "productName", "listName", "listId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements v {

        /* renamed from: a  reason: collision with root package name */
        private final String f82452a;

        /* renamed from: b  reason: collision with root package name */
        private final String f82453b;

        /* renamed from: c  reason: collision with root package name */
        private final String f82454c;

        public b(String str, String str2, String str3) {
            C17542s.j(str, "productName");
            C17542s.j(str2, "listName");
            C17542s.j(str3, "listId");
            this.f82452a = str;
            this.f82453b = str2;
            this.f82454c = str3;
        }

        public final String a() {
            return this.f82454c;
        }

        public final String b() {
            return this.f82453b;
        }

        public final String c() {
            return this.f82452a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return C17542s.e(this.f82452a, bVar.f82452a) && C17542s.e(this.f82453b, bVar.f82453b) && C17542s.e(this.f82454c, bVar.f82454c);
        }

        public int hashCode() {
            return (((this.f82452a.hashCode() * 31) + this.f82453b.hashCode()) * 31) + this.f82454c.hashCode();
        }

        public String toString() {
            String str = this.f82452a;
            String str2 = this.f82453b;
            String str3 = this.f82454c;
            return "RemovedFromList(productName=" + str + ", listName=" + str2 + ", listId=" + str3 + ")";
        }
    }
}
