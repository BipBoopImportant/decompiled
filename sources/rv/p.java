package Rv;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import mI.C17604b;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\b@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0005J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\t\u0001\u0003\u0001\u00020\u0002¨\u0006\n"}, d2 = {"LRv/p;", "", "", "value", "a", "(Ljava/lang/String;)Ljava/lang/String;", "d", "", "c", "(Ljava/lang/String;)I", "membership-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@C17604b
public final class p {
    public static String a(String str) {
        C17542s.j(str, "value");
        return str;
    }

    public static final boolean b(String str, String str2) {
        return C17542s.e(str, str2);
    }

    public static int c(String str) {
        return str.hashCode();
    }

    public static String d(String str) {
        return "UriString(value=" + str + ")";
    }
}
