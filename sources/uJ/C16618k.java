package UJ;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LUJ/k;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "<init>", "()V", "", "fillInStackTrace", "()Ljava/lang/Throwable;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: UJ.k  reason: case insensitive filesystem */
public final class C16618k extends CancellationException {
    public C16618k() {
        super("Child of the scoped flow was cancelled");
    }

    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
