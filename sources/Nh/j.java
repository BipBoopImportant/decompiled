package NH;

import io.ktor.utils.io.r;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0003\n\u0002\b\u0004\u001a\u001d\u0010\u0002\u001a\u00020\u0000*\u00020\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"", "cause", "a", "(Ljava/lang/Throwable;Ljava/lang/Throwable;)Ljava/lang/Throwable;", "ktor-utils"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class j {
    public static final Throwable a(Throwable th2, Throwable th3) {
        Throwable e10;
        C17542s.j(th2, "<this>");
        if (th3 == null || C17542s.e(th2.getCause(), th3) || (e10 = r.e(th2, th3)) == null) {
            return th2;
        }
        e10.setStackTrace(th2.getStackTrace());
        return e10;
    }
}
