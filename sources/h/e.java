package H;

import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

final class e implements Executor {

    /* renamed from: b  reason: collision with root package name */
    private static volatile Executor f6670b;

    /* renamed from: a  reason: collision with root package name */
    private final ExecutorService f6671a = Executors.newFixedThreadPool(2, new a());

    class a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        private final AtomicInteger f6672a = new AtomicInteger(0);

        a() {
        }

        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format(Locale.US, "CameraX-camerax_io_%d", new Object[]{Integer.valueOf(this.f6672a.getAndIncrement())}));
            return thread;
        }
    }

    e() {
    }

    static Executor a() {
        if (f6670b != null) {
            return f6670b;
        }
        synchronized (e.class) {
            try {
                if (f6670b == null) {
                    f6670b = new e();
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        return f6670b;
    }

    public void execute(Runnable runnable) {
        this.f6671a.execute(runnable);
    }
}
