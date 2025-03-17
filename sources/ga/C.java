package ga;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public abstract class C extends C7906h implements ExecutorService {
    protected C() {
    }

    public final boolean awaitTermination(long j10, TimeUnit timeUnit) {
        return b().awaitTermination(j10, timeUnit);
    }

    /* access modifiers changed from: protected */
    public abstract ExecutorService b();

    public final List invokeAll(Collection collection) {
        return b().invokeAll(collection);
    }

    public final Object invokeAny(Collection collection) {
        return b().invokeAny(collection);
    }

    public final boolean isShutdown() {
        return b().isShutdown();
    }

    public final boolean isTerminated() {
        return b().isTerminated();
    }

    public final void shutdown() {
        b().shutdown();
    }

    public final List shutdownNow() {
        return b().shutdownNow();
    }

    public final Future submit(Runnable runnable) {
        return b().submit(runnable);
    }

    public final List invokeAll(Collection collection, long j10, TimeUnit timeUnit) {
        return b().invokeAll(collection, j10, timeUnit);
    }

    public final Object invokeAny(Collection collection, long j10, TimeUnit timeUnit) {
        return b().invokeAny(collection, j10, timeUnit);
    }

    public final Future submit(Runnable runnable, Object obj) {
        return b().submit(runnable, obj);
    }

    public final Future submit(Callable callable) {
        return b().submit(callable);
    }
}
