package o;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: o.d  reason: case insensitive filesystem */
public class C5648d extends C5649e {

    /* renamed from: a  reason: collision with root package name */
    private final Object f26591a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final ExecutorService f26592b = Executors.newFixedThreadPool(4, new a());

    /* renamed from: c  reason: collision with root package name */
    private volatile Handler f26593c;

    /* renamed from: o.d$a */
    class a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        private final AtomicInteger f26594a = new AtomicInteger(0);

        a() {
        }

        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName("arch_disk_io_" + this.f26594a.getAndIncrement());
            return thread;
        }
    }

    /* renamed from: o.d$b */
    private static class b {
        public static Handler a(Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    private static Handler e(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return b.a(looper);
        }
        try {
            return Handler.class.getDeclaredConstructor(new Class[]{Looper.class, Handler.Callback.class, Boolean.TYPE}).newInstance(new Object[]{looper, null, Boolean.TRUE});
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }

    public void a(Runnable runnable) {
        this.f26592b.execute(runnable);
    }

    public boolean c() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public void d(Runnable runnable) {
        if (this.f26593c == null) {
            synchronized (this.f26591a) {
                try {
                    if (this.f26593c == null) {
                        this.f26593c = e(Looper.getMainLooper());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        this.f26593c.post(runnable);
    }
}
