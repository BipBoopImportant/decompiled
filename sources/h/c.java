package H;

import I.n;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.concurrent.futures.c;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.RunnableScheduledFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import ob.C10101e;

final class c extends AbstractExecutorService implements ScheduledExecutorService {

    /* renamed from: b  reason: collision with root package name */
    private static ThreadLocal<ScheduledExecutorService> f6655b = new a();

    /* renamed from: a  reason: collision with root package name */
    private final Handler f6656a;

    class a extends ThreadLocal<ScheduledExecutorService> {
        a() {
        }

        /* renamed from: a */
        public ScheduledExecutorService initialValue() {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                return a.d();
            }
            if (Looper.myLooper() != null) {
                return new c(new Handler(Looper.myLooper()));
            }
            return null;
        }
    }

    class b implements Callable<Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Runnable f6657a;

        b(Runnable runnable) {
            this.f6657a = runnable;
        }

        /* renamed from: a */
        public Void call() {
            this.f6657a.run();
            return null;
        }
    }

    /* renamed from: H.c$c  reason: collision with other inner class name */
    private static class C0065c<V> implements RunnableScheduledFuture<V> {

        /* renamed from: a  reason: collision with root package name */
        final AtomicReference<c.a<V>> f6659a = new AtomicReference<>((Object) null);

        /* renamed from: b  reason: collision with root package name */
        private final long f6660b;

        /* renamed from: c  reason: collision with root package name */
        private final Callable<V> f6661c;

        /* renamed from: d  reason: collision with root package name */
        private final C10101e<V> f6662d;

        /* renamed from: H.c$c$a */
        class a implements c.C0320c<V> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Handler f6663a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Callable f6664b;

            /* renamed from: H.c$c$a$a  reason: collision with other inner class name */
            class C0066a implements Runnable {
                C0066a() {
                }

                public void run() {
                    if (C0065c.this.f6659a.getAndSet((Object) null) != null) {
                        a aVar = a.this;
                        aVar.f6663a.removeCallbacks(C0065c.this);
                    }
                }
            }

            a(Handler handler, Callable callable) {
                this.f6663a = handler;
                this.f6664b = callable;
            }

            public Object a(c.a<V> aVar) {
                aVar.a(new C0066a(), a.a());
                C0065c.this.f6659a.set(aVar);
                return "HandlerScheduledFuture-" + this.f6664b.toString();
            }
        }

        C0065c(Handler handler, long j10, Callable<V> callable) {
            this.f6660b = j10;
            this.f6661c = callable;
            this.f6662d = androidx.concurrent.futures.c.a(new a(handler, callable));
        }

        /* renamed from: b */
        public int compareTo(Delayed delayed) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            return Long.compare(getDelay(timeUnit), delayed.getDelay(timeUnit));
        }

        public boolean cancel(boolean z10) {
            return this.f6662d.cancel(z10);
        }

        public V get() {
            return this.f6662d.get();
        }

        public long getDelay(TimeUnit timeUnit) {
            return timeUnit.convert(this.f6660b - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
        }

        public boolean isCancelled() {
            return this.f6662d.isCancelled();
        }

        public boolean isDone() {
            return this.f6662d.isDone();
        }

        public boolean isPeriodic() {
            return false;
        }

        public void run() {
            c.a andSet = this.f6659a.getAndSet((Object) null);
            if (andSet != null) {
                try {
                    andSet.c(this.f6661c.call());
                } catch (Exception e10) {
                    andSet.f(e10);
                }
            }
        }

        public V get(long j10, TimeUnit timeUnit) {
            return this.f6662d.get(j10, timeUnit);
        }
    }

    c(Handler handler) {
        this.f6656a = handler;
    }

    private RejectedExecutionException a() {
        return new RejectedExecutionException(this.f6656a + " is shutting down");
    }

    public boolean awaitTermination(long j10, TimeUnit timeUnit) {
        throw new UnsupportedOperationException(c.class.getSimpleName() + " cannot be shut down. Use Looper.quitSafely().");
    }

    public void execute(Runnable runnable) {
        if (!this.f6656a.post(runnable)) {
            throw a();
        }
    }

    public boolean isShutdown() {
        return false;
    }

    public boolean isTerminated() {
        return false;
    }

    public ScheduledFuture<?> schedule(Runnable runnable, long j10, TimeUnit timeUnit) {
        return schedule(new b(runnable), j10, timeUnit);
    }

    public ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        throw new UnsupportedOperationException(c.class.getSimpleName() + " does not yet support fixed-rate scheduling.");
    }

    public ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        throw new UnsupportedOperationException(c.class.getSimpleName() + " does not yet support fixed-delay scheduling.");
    }

    public void shutdown() {
        throw new UnsupportedOperationException(c.class.getSimpleName() + " cannot be shut down. Use Looper.quitSafely().");
    }

    public List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException(c.class.getSimpleName() + " cannot be shut down. Use Looper.quitSafely().");
    }

    public <V> ScheduledFuture<V> schedule(Callable<V> callable, long j10, TimeUnit timeUnit) {
        long uptimeMillis = SystemClock.uptimeMillis() + TimeUnit.MILLISECONDS.convert(j10, timeUnit);
        C0065c cVar = new C0065c(this.f6656a, uptimeMillis, callable);
        if (this.f6656a.postAtTime(cVar, uptimeMillis)) {
            return cVar;
        }
        return n.o(a());
    }
}
