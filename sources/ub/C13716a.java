package UB;

import fI.C17221b;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001:\u0001\u0007J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LUB/a;", "", "", "storeId", "LUB/a$a;", "componentValue", "LXH/N;", "a", "(Ljava/lang/String;LUB/a$a;)V", "storedetails-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: UB.a  reason: case insensitive filesystem */
public interface C13716a {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"LUB/a$a;", "", "", "analyticsName", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "EXPANDED", "COLLAPSED", "storedetails-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: UB.a$a  reason: collision with other inner class name */
    public enum C2873a {
        EXPANDED("expand"),
        COLLAPSED("collapse");
        
        private final String analyticsName;

        static {
            C2873a[] a10;
            $ENTRIES = C17221b.a(a10);
        }

        private C2873a(String str) {
            this.analyticsName = str;
        }

        public final String b() {
            return this.analyticsName;
        }
    }

    void a(String str, C2873a aVar);
}
