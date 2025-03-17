package IC;

import kotlin.Metadata;
import mI.C17604b;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\u0005\u0001\u0003\u0001\u00020\u0002¨\u0006\n"}, d2 = {"LIC/b;", "", "", "value", "a", "(I)I", "", "d", "(I)Ljava/lang/String;", "c", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@C17604b
/* renamed from: IC.b  reason: case insensitive filesystem */
public final class C13020b {
    public static int a(int i10) {
        if (i10 >= 0) {
            return i10;
        }
        throw new IllegalArgumentException("Plural count should be >= 0");
    }

    public static final boolean b(int i10, int i11) {
        return i10 == i11;
    }

    public static int c(int i10) {
        return Integer.hashCode(i10);
    }

    public static String d(int i10) {
        return "PluralCount(value=" + i10 + ")";
    }
}
