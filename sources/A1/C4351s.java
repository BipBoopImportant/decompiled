package A1;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LA1/s;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "", "time", "<init>", "(J)V", "", "fillInStackTrace", "()Ljava/lang/Throwable;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: A1.s  reason: case insensitive filesystem */
public final class C4351s extends CancellationException {
    public C4351s(long j10) {
        super("Timed out waiting for " + j10 + " ms");
    }

    public Throwable fillInStackTrace() {
        setStackTrace(V.f4364a);
        return this;
    }
}
