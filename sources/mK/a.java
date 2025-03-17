package Mk;

import fI.C17221b;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001:\u0001\u0005J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LMk/a;", "", "LMk/a$a;", "state", "LXH/N;", "a", "(LMk/a$a;)V", "splash_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface a {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"LMk/a$a;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "AUTHORIZED", "DENIED", "NOT_NOW", "splash_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Mk.a$a  reason: collision with other inner class name */
    public enum C1671a {
        AUTHORIZED("authorize"),
        DENIED("denied"),
        NOT_NOW("not_now");
        
        private final String value;

        static {
            C1671a[] a10;
            $ENTRIES = C17221b.a(a10);
        }

        private C1671a(String str) {
            this.value = str;
        }

        public final String b() {
            return this.value;
        }
    }

    void a(C1671a aVar);
}
