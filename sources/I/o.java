package I;

import C.C4391e0;
import H2.i;
import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import ob.C10101e;

abstract class o<V> implements C10101e<V> {

    static class a<V> extends o<V> {

        /* renamed from: a  reason: collision with root package name */
        private final Throwable f7106a;

        a(Throwable th2) {
            this.f7106a = th2;
        }

        public V get() {
            throw new ExecutionException(this.f7106a);
        }

        public String toString() {
            return super.toString() + "[status=FAILURE, cause=[" + this.f7106a + "]]";
        }
    }

    static final class b<V> extends a<V> implements ScheduledFuture<V> {
        b(Throwable th2) {
            super(th2);
        }

        public long getDelay(TimeUnit timeUnit) {
            return 0;
        }

        /* renamed from: j */
        public int compareTo(Delayed delayed) {
            return -1;
        }
    }

    static final class c<V> extends o<V> {

        /* renamed from: b  reason: collision with root package name */
        static final o<Object> f7107b = new c((Object) null);

        /* renamed from: a  reason: collision with root package name */
        private final V f7108a;

        c(V v10) {
            this.f7108a = v10;
        }

        public V get() {
            return this.f7108a;
        }

        public String toString() {
            return super.toString() + "[status=SUCCESS, result=[" + this.f7108a + "]]";
        }
    }

    o() {
    }

    public static <V> C10101e<V> b() {
        return c.f7107b;
    }

    public void a(Runnable runnable, Executor executor) {
        i.g(runnable);
        i.g(executor);
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            C4391e0.d("ImmediateFuture", "Experienced RuntimeException while attempting to notify " + runnable + " on Executor " + executor, e10);
        }
    }

    public boolean cancel(boolean z10) {
        return false;
    }

    public abstract V get();

    public V get(long j10, TimeUnit timeUnit) {
        i.g(timeUnit);
        return get();
    }

    public boolean isCancelled() {
        return false;
    }

    public boolean isDone() {
        return true;
    }
}
