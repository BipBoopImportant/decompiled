package ip;

import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\f\n\u0002\u0010\u001c\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0017\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"", "", "a", "(Ljava/lang/Iterable;)Z", "common_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class c {
    public static final boolean a(Iterable<Boolean> iterable) {
        C17542s.j(iterable, "<this>");
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        for (Boolean booleanValue : iterable) {
            if (booleanValue.booleanValue()) {
                return true;
            }
        }
        return false;
    }
}
