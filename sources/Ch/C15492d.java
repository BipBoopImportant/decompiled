package CH;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0003\n\u0002\b\u0003\u001a\u0011\u0010\u0001\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"", "a", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "ktor-client-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: CH.d  reason: case insensitive filesystem */
public final class C15492d {
    public static final Throwable a(Throwable th2) {
        C17542s.j(th2, "<this>");
        Throwable th3 = th2;
        while (th3 instanceof CancellationException) {
            CancellationException cancellationException = (CancellationException) th3;
            if (C17542s.e(th3, cancellationException.getCause())) {
                return th2;
            }
            th3 = cancellationException.getCause();
        }
        return th3 == null ? th2 : th3;
    }
}
