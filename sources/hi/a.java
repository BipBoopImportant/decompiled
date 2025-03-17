package hi;

import TJ.C16532g;
import gi.C9748c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001:\u0001\tJ\u0018\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H¦\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lhi/a;", "", "LTJ/g;", "Lgi/c;", "invoke", "()LTJ/g;", "Lhi/a$a;", "item", "LXH/N;", "a", "(Lhi/a$a;)V", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface a {

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0012\u0010\b¨\u0006\u0013"}, d2 = {"Lhi/a$a;", "", "", "itemNo", "name", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: hi.a$a  reason: collision with other inner class name */
    public static final class C1314a {

        /* renamed from: a  reason: collision with root package name */
        private final String f74121a;

        /* renamed from: b  reason: collision with root package name */
        private final String f74122b;

        public C1314a(String str, String str2) {
            C17542s.j(str, "itemNo");
            C17542s.j(str2, "name");
            this.f74121a = str;
            this.f74122b = str2;
        }

        public final String a() {
            return this.f74121a;
        }

        public final String b() {
            return this.f74122b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1314a)) {
                return false;
            }
            C1314a aVar = (C1314a) obj;
            return C17542s.e(this.f74121a, aVar.f74121a) && C17542s.e(this.f74122b, aVar.f74122b);
        }

        public int hashCode() {
            return (this.f74121a.hashCode() * 31) + this.f74122b.hashCode();
        }

        public String toString() {
            String str = this.f74121a;
            String str2 = this.f74122b;
            return "ItemDetails(itemNo=" + str + ", name=" + str2 + ")";
        }
    }

    void a(C1314a aVar);

    C16532g<C9748c> invoke();
}
