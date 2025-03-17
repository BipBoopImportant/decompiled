package Fi;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\u0006J\"\u0010\u0006\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0002H¦\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LFi/a;", "", "", "dateFormat", "dateString", "LFi/a$a;", "a", "(Ljava/lang/String;Ljava/lang/String;)LFi/a$a;", "purchasehistory-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Fi.a  reason: case insensitive filesystem */
public interface C10713a {

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0010\u0010\b¨\u0006\u0013"}, d2 = {"LFi/a$a;", "", "", "title", "subtitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "purchasehistory-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Fi.a$a  reason: collision with other inner class name */
    public static final class C1548a {

        /* renamed from: a  reason: collision with root package name */
        private final String f80846a;

        /* renamed from: b  reason: collision with root package name */
        private final String f80847b;

        public C1548a(String str, String str2) {
            C17542s.j(str, "title");
            C17542s.j(str2, "subtitle");
            this.f80846a = str;
            this.f80847b = str2;
        }

        public final String a() {
            return this.f80847b;
        }

        public final String b() {
            return this.f80846a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1548a)) {
                return false;
            }
            C1548a aVar = (C1548a) obj;
            return C17542s.e(this.f80846a, aVar.f80846a) && C17542s.e(this.f80847b, aVar.f80847b);
        }

        public int hashCode() {
            return (this.f80846a.hashCode() * 31) + this.f80847b.hashCode();
        }

        public String toString() {
            String str = this.f80846a;
            String str2 = this.f80847b;
            return "FormattedTitles(title=" + str + ", subtitle=" + str2 + ")";
        }
    }

    C1548a a(String str, String str2);
}
