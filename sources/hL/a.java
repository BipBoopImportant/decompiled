package Hl;

import fI.C17221b;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\u0003J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LHl/a;", "", "LHl/a$a;", "a", "()LHl/a$a;", "wirelessautoconnect_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface a {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"LHl/a$a;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "CELLULAR", "WIFI", "OTHER", "wirelessautoconnect_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Hl.a$a  reason: collision with other inner class name */
    public enum C1585a {
        CELLULAR("Mobile"),
        WIFI("Wi-Fi"),
        OTHER("Other");
        
        private final String value;

        static {
            C1585a[] a10;
            $ENTRIES = C17221b.a(a10);
        }

        private C1585a(String str) {
            this.value = str;
        }

        public final String b() {
            return this.value;
        }
    }

    C1585a a();
}
