package vc;

import android.annotation.SuppressLint;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class b {

    /* renamed from: a  reason: collision with root package name */
    private static final C10303a f77146a;

    /* renamed from: b  reason: collision with root package name */
    private static volatile C10303a f77147b;

    /* renamed from: vc.b$b  reason: collision with other inner class name */
    private static class C1426b implements C10303a {
        private C1426b() {
        }

        public ExecutorService a(ThreadFactory threadFactory, c cVar) {
            return b(1, threadFactory, cVar);
        }

        @SuppressLint({"ThreadPoolCreation"})
        public ExecutorService b(int i10, ThreadFactory threadFactory, c cVar) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i10, i10, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            return Executors.unconfigurableExecutorService(threadPoolExecutor);
        }
    }

    static {
        C1426b bVar = new C1426b();
        f77146a = bVar;
        f77147b = bVar;
    }

    public static C10303a a() {
        return f77147b;
    }
}
