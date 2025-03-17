package io.ktor.utils.io;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0003\n\u0002\b\u0003\u001a\u0013\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"", "a", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "ktor-io"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class s {
    public static final Throwable a(Throwable th2) {
        C17542s.j(th2, "<this>");
        Throwable th3 = th2;
        while (th3 instanceof CancellationException) {
            if (C17542s.e(th3, th3.getCause())) {
                return th2;
            }
            Throwable cause = th3.getCause();
            if (cause == null) {
                return th3;
            }
            th3 = cause;
        }
        return th3;
    }
}
