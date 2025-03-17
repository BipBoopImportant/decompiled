package H7;

import android.os.Process;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.Log;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public final class a implements ExecutorService {

    /* renamed from: b  reason: collision with root package name */
    private static final long f36463b = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: c  reason: collision with root package name */
    private static volatile int f36464c;

    /* renamed from: a  reason: collision with root package name */
    private final ExecutorService f36465a;

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final boolean f36466a;

        /* renamed from: b  reason: collision with root package name */
        private int f36467b;

        /* renamed from: c  reason: collision with root package name */
        private int f36468c;

        /* renamed from: d  reason: collision with root package name */
        private ThreadFactory f36469d = new c();

        /* renamed from: e  reason: collision with root package name */
        private e f36470e = e.f36484d;

        /* renamed from: f  reason: collision with root package name */
        private String f36471f;

        /* renamed from: g  reason: collision with root package name */
        private long f36472g;

        b(boolean z10) {
            this.f36466a = z10;
        }

        public a a() {
            if (!TextUtils.isEmpty(this.f36471f)) {
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(this.f36467b, this.f36468c, this.f36472g, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new d(this.f36469d, this.f36471f, this.f36470e, this.f36466a));
                if (this.f36472g != 0) {
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                }
                return new a(threadPoolExecutor);
            }
            throw new IllegalArgumentException("Name must be non-null and non-empty, but given: " + this.f36471f);
        }

        public b b(String str) {
            this.f36471f = str;
            return this;
        }

        public b c(int i10) {
            this.f36467b = i10;
            this.f36468c = i10;
            return this;
        }
    }

    private static final class c implements ThreadFactory {

        /* renamed from: H7.a$c$a  reason: collision with other inner class name */
        class C0576a extends Thread {
            C0576a(Runnable runnable) {
                super(runnable);
            }

            public void run() {
                Process.setThreadPriority(9);
                super.run();
            }
        }

        private c() {
        }

        public Thread newThread(Runnable runnable) {
            return new C0576a(runnable);
        }
    }

    private static final class d implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        private final ThreadFactory f36474a;

        /* renamed from: b  reason: collision with root package name */
        private final String f36475b;

        /* renamed from: c  reason: collision with root package name */
        final e f36476c;

        /* renamed from: d  reason: collision with root package name */
        final boolean f36477d;

        /* renamed from: e  reason: collision with root package name */
        private final AtomicInteger f36478e = new AtomicInteger();

        /* renamed from: H7.a$d$a  reason: collision with other inner class name */
        class C0577a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Runnable f36479a;

            C0577a(Runnable runnable) {
                this.f36479a = runnable;
            }

            public void run() {
                if (d.this.f36477d) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    this.f36479a.run();
                } catch (Throwable th2) {
                    d.this.f36476c.a(th2);
                }
            }
        }

        d(ThreadFactory threadFactory, String str, e eVar, boolean z10) {
            this.f36474a = threadFactory;
            this.f36475b = str;
            this.f36476c = eVar;
            this.f36477d = z10;
        }

        public Thread newThread(Runnable runnable) {
            Thread newThread = this.f36474a.newThread(new C0577a(runnable));
            newThread.setName("glide-" + this.f36475b + "-thread-" + this.f36478e.getAndIncrement());
            return newThread;
        }
    }

    public interface e {

        /* renamed from: a  reason: collision with root package name */
        public static final e f36481a = new C0578a();

        /* renamed from: b  reason: collision with root package name */
        public static final e f36482b;

        /* renamed from: c  reason: collision with root package name */
        public static final e f36483c = new c();

        /* renamed from: d  reason: collision with root package name */
        public static final e f36484d;

        /* renamed from: H7.a$e$a  reason: collision with other inner class name */
        class C0578a implements e {
            C0578a() {
            }

            public void a(Throwable th2) {
            }
        }

        class b implements e {
            b() {
            }

            public void a(Throwable th2) {
                if (th2 != null && Log.isLoggable("GlideExecutor", 6)) {
                    Log.e("GlideExecutor", "Request threw uncaught throwable", th2);
                }
            }
        }

        class c implements e {
            c() {
            }

            public void a(Throwable th2) {
                if (th2 != null) {
                    throw new RuntimeException("Request threw uncaught throwable", th2);
                }
            }
        }

        static {
            b bVar = new b();
            f36482b = bVar;
            f36484d = bVar;
        }

        void a(Throwable th2);
    }

    a(ExecutorService executorService) {
        this.f36465a = executorService;
    }

    static int a() {
        return b() >= 4 ? 2 : 1;
    }

    public static int b() {
        if (f36464c == 0) {
            f36464c = Math.min(4, b.a());
        }
        return f36464c;
    }

    public static b c() {
        return new b(true).c(a()).b("animation");
    }

    public static a d() {
        return c().a();
    }

    public static b e() {
        return new b(true).c(1).b("disk-cache");
    }

    public static a f() {
        return e().a();
    }

    public static b g() {
        return new b(false).c(b()).b("source");
    }

    public static a h() {
        return g().a();
    }

    public static a i() {
        return new a(new ThreadPoolExecutor(0, Integer.MAX_VALUE, f36463b, TimeUnit.MILLISECONDS, new SynchronousQueue(), new d(new c(), "source-unlimited", e.f36484d, false)));
    }

    public boolean awaitTermination(long j10, TimeUnit timeUnit) {
        return this.f36465a.awaitTermination(j10, timeUnit);
    }

    public void execute(Runnable runnable) {
        this.f36465a.execute(runnable);
    }

    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) {
        return this.f36465a.invokeAll(collection);
    }

    public <T> T invokeAny(Collection<? extends Callable<T>> collection) {
        return this.f36465a.invokeAny(collection);
    }

    public boolean isShutdown() {
        return this.f36465a.isShutdown();
    }

    public boolean isTerminated() {
        return this.f36465a.isTerminated();
    }

    public void shutdown() {
        this.f36465a.shutdown();
    }

    public List<Runnable> shutdownNow() {
        return this.f36465a.shutdownNow();
    }

    public Future<?> submit(Runnable runnable) {
        return this.f36465a.submit(runnable);
    }

    public String toString() {
        return this.f36465a.toString();
    }

    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j10, TimeUnit timeUnit) {
        return this.f36465a.invokeAll(collection, j10, timeUnit);
    }

    public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j10, TimeUnit timeUnit) {
        return this.f36465a.invokeAny(collection, j10, timeUnit);
    }

    public <T> Future<T> submit(Runnable runnable, T t10) {
        return this.f36465a.submit(runnable, t10);
    }

    public <T> Future<T> submit(Callable<T> callable) {
        return this.f36465a.submit(callable);
    }
}
