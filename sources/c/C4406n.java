package C;

import H2.i;
import androidx.camera.core.impl.H;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: C.n  reason: case insensitive filesystem */
public class C4406n implements Executor {

    /* renamed from: c  reason: collision with root package name */
    private static final ThreadFactory f5372c = new a();

    /* renamed from: a  reason: collision with root package name */
    private final Object f5373a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private ThreadPoolExecutor f5374b = b();

    /* renamed from: C.n$a */
    class a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        private final AtomicInteger f5375a = new AtomicInteger(0);

        a() {
        }

        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format(Locale.US, "CameraX-core_camera_%d", new Object[]{Integer.valueOf(this.f5375a.getAndIncrement())}));
            return thread;
        }
    }

    private static ThreadPoolExecutor b() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), f5372c);
        threadPoolExecutor.setRejectedExecutionHandler(new C4405m());
        return threadPoolExecutor;
    }

    /* access modifiers changed from: package-private */
    public void c(H h10) {
        ThreadPoolExecutor threadPoolExecutor;
        i.g(h10);
        synchronized (this.f5373a) {
            try {
                if (this.f5374b.isShutdown()) {
                    this.f5374b = b();
                }
                threadPoolExecutor = this.f5374b;
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        int max = Math.max(1, h10.b().size());
        threadPoolExecutor.setMaximumPoolSize(max);
        threadPoolExecutor.setCorePoolSize(max);
    }

    public void execute(Runnable runnable) {
        i.g(runnable);
        synchronized (this.f5373a) {
            this.f5374b.execute(runnable);
        }
    }
}
