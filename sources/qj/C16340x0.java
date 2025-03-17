package QJ;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0011\u0010\b\u001a\u00020\u0004*\u00020\u0005¢\u0006\u0004\b\b\u0010\t*\f\b\u0007\u0010\n\"\u00020\u00012\u00020\u0001¨\u0006\u000b"}, d2 = {"Ljava/util/concurrent/ExecutorService;", "LQJ/v0;", "c", "(Ljava/util/concurrent/ExecutorService;)LQJ/v0;", "Ljava/util/concurrent/Executor;", "LQJ/M;", "b", "(Ljava/util/concurrent/Executor;)LQJ/M;", "a", "(LQJ/M;)Ljava/util/concurrent/Executor;", "CloseableCoroutineDispatcher", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: QJ.x0  reason: case insensitive filesystem */
public final class C16340x0 {
    public static final Executor a(M m10) {
        Executor P02;
        C16336v0 v0Var = m10 instanceof C16336v0 ? (C16336v0) m10 : null;
        return (v0Var == null || (P02 = v0Var.P0()) == null) ? new C16309h0(m10) : P02;
    }

    public static final M b(Executor executor) {
        M m10;
        C16309h0 h0Var = executor instanceof C16309h0 ? (C16309h0) executor : null;
        return (h0Var == null || (m10 = h0Var.f137633a) == null) ? new C16338w0(executor) : m10;
    }

    public static final C16336v0 c(ExecutorService executorService) {
        return new C16338w0(executorService);
    }
}
