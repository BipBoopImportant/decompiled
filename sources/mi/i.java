package mi;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lmi/i;", "", "b", "a", "Lmi/i$a;", "Lmi/i$b;", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface i {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lmi/i$a;", "Lmi/i;", "<init>", "()V", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements i {

        /* renamed from: a  reason: collision with root package name */
        public static final a f75477a = new a();

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0015\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0016\u0010\n¨\u0006\u0018"}, d2 = {"Lmi/i$b;", "Lmi/i;", "", "itemNo", "itemType", "productName", "productDescription", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "d", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements i {

        /* renamed from: a  reason: collision with root package name */
        private final String f75478a;

        /* renamed from: b  reason: collision with root package name */
        private final String f75479b;

        /* renamed from: c  reason: collision with root package name */
        private final String f75480c;

        /* renamed from: d  reason: collision with root package name */
        private final String f75481d;

        public b(String str, String str2, String str3, String str4) {
            C17542s.j(str, "itemNo");
            C17542s.j(str2, "itemType");
            C17542s.j(str3, "productName");
            C17542s.j(str4, "productDescription");
            this.f75478a = str;
            this.f75479b = str2;
            this.f75480c = str3;
            this.f75481d = str4;
        }

        public final String a() {
            return this.f75478a;
        }

        public final String b() {
            return this.f75479b;
        }

        public final String c() {
            return this.f75481d;
        }

        public final String d() {
            return this.f75480c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return C17542s.e(this.f75478a, bVar.f75478a) && C17542s.e(this.f75479b, bVar.f75479b) && C17542s.e(this.f75480c, bVar.f75480c) && C17542s.e(this.f75481d, bVar.f75481d);
        }

        public int hashCode() {
            return (((((this.f75478a.hashCode() * 31) + this.f75479b.hashCode()) * 31) + this.f75480c.hashCode()) * 31) + this.f75481d.hashCode();
        }

        public String toString() {
            String str = this.f75478a;
            String str2 = this.f75479b;
            String str3 = this.f75480c;
            String str4 = this.f75481d;
            return "Show(itemNo=" + str + ", itemType=" + str2 + ", productName=" + str3 + ", productDescription=" + str4 + ")";
        }
    }
}
