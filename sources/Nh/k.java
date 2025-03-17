package NH;

import dI.C17164e;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a#\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"", "exception", "LdI/e;", "continuation", "a", "(Ljava/lang/Throwable;LdI/e;)Ljava/lang/Throwable;", "ktor-utils"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class k {
    public static final Throwable a(Throwable th2, C17164e<?> eVar) {
        C17542s.j(th2, "exception");
        C17542s.j(eVar, "continuation");
        try {
            return j.a(th2, th2.getCause());
        } catch (Throwable unused) {
            return th2;
        }
    }
}
