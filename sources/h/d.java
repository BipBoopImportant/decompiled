package H;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

final class d implements Executor {

    /* renamed from: b  reason: collision with root package name */
    private static volatile Executor f6667b;

    /* renamed from: a  reason: collision with root package name */
    private final ExecutorService f6668a = Executors.newSingleThreadExecutor(new a());

    class a implements ThreadFactory {
        a() {
        }

        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setPriority(10);
            thread.setName("CameraX-camerax_high_priority");
            return thread;
        }
    }

    d() {
    }

    static Executor a() {
        if (f6667b != null) {
            return f6667b;
        }
        synchronized (d.class) {
            try {
                if (f6667b == null) {
                    f6667b = new d();
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        return f6667b;
    }

    public void execute(Runnable runnable) {
        this.f6668a.execute(runnable);
    }
}
