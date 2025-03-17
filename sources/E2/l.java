package E2;

import H2.i;
import android.os.Handler;
import android.os.Process;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

class l {

    private static class a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        private String f5999a;

        /* renamed from: b  reason: collision with root package name */
        private int f6000b;

        /* renamed from: E2.l$a$a  reason: collision with other inner class name */
        private static class C0048a extends Thread {

            /* renamed from: a  reason: collision with root package name */
            private final int f6001a;

            C0048a(Runnable runnable, String str, int i10) {
                super(runnable, str);
                this.f6001a = i10;
            }

            public void run() {
                Process.setThreadPriority(this.f6001a);
                super.run();
            }
        }

        a(String str, int i10) {
            this.f5999a = str;
            this.f6000b = i10;
        }

        public Thread newThread(Runnable runnable) {
            return new C0048a(runnable, this.f5999a, this.f6000b);
        }
    }

    private static class b implements Executor {

        /* renamed from: a  reason: collision with root package name */
        private final Handler f6002a;

        b(Handler handler) {
            this.f6002a = (Handler) i.g(handler);
        }

        public void execute(Runnable runnable) {
            if (!this.f6002a.post((Runnable) i.g(runnable))) {
                throw new RejectedExecutionException(this.f6002a + " is shutting down");
            }
        }
    }

    private static class c<T> implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private Callable<T> f6003a;

        /* renamed from: b  reason: collision with root package name */
        private H2.a<T> f6004b;

        /* renamed from: c  reason: collision with root package name */
        private Handler f6005c;

        class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ H2.a f6006a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Object f6007b;

            a(H2.a aVar, Object obj) {
                this.f6006a = aVar;
                this.f6007b = obj;
            }

            public void run() {
                this.f6006a.accept(this.f6007b);
            }
        }

        c(Handler handler, Callable<T> callable, H2.a<T> aVar) {
            this.f6003a = callable;
            this.f6004b = aVar;
            this.f6005c = handler;
        }

        public void run() {
            T t10;
            try {
                t10 = this.f6003a.call();
            } catch (Exception unused) {
                t10 = null;
            }
            this.f6005c.post(new a(this.f6004b, t10));
        }
    }

    static ThreadPoolExecutor a(String str, int i10, int i11) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, (long) i11, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new a(str, i10));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    static Executor b(Handler handler) {
        return new b(handler);
    }

    static <T> void c(Executor executor, Callable<T> callable, H2.a<T> aVar) {
        executor.execute(new c(b.a(), callable, aVar));
    }

    static <T> T d(ExecutorService executorService, Callable<T> callable, int i10) {
        try {
            return executorService.submit(callable).get((long) i10, TimeUnit.MILLISECONDS);
        } catch (ExecutionException e10) {
            throw new RuntimeException(e10);
        } catch (InterruptedException e11) {
            throw e11;
        } catch (TimeoutException unused) {
            throw new InterruptedException("timeout");
        }
    }
}
