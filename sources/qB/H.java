package Qb;

import Nb.g;
import android.annotation.SuppressLint;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

public final class H {

    class a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f62921a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AtomicLong f62922b;

        /* renamed from: Qb.H$a$a  reason: collision with other inner class name */
        class C1067a extends C9246d {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Runnable f62923a;

            C1067a(Runnable runnable) {
                this.f62923a = runnable;
            }

            public void a() {
                this.f62923a.run();
            }
        }

        a(String str, AtomicLong atomicLong) {
            this.f62921a = str;
            this.f62922b = atomicLong;
        }

        public Thread newThread(Runnable runnable) {
            Thread newThread = Executors.defaultThreadFactory().newThread(new C1067a(runnable));
            newThread.setName(this.f62921a + this.f62922b.getAndIncrement());
            return newThread;
        }
    }

    class b extends C9246d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f62925a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ExecutorService f62926b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f62927c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ TimeUnit f62928d;

        b(String str, ExecutorService executorService, long j10, TimeUnit timeUnit) {
            this.f62925a = str;
            this.f62926b = executorService;
            this.f62927c = j10;
            this.f62928d = timeUnit;
        }

        public void a() {
            try {
                g f10 = g.f();
                f10.b("Executing shutdown hook for " + this.f62925a);
                this.f62926b.shutdown();
                if (!this.f62926b.awaitTermination(this.f62927c, this.f62928d)) {
                    g f11 = g.f();
                    f11.b(this.f62925a + " did not shut down in the allocated time. Requesting immediate shutdown.");
                    this.f62926b.shutdownNow();
                }
            } catch (InterruptedException unused) {
                g.f().b(String.format(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", new Object[]{this.f62925a}));
                this.f62926b.shutdownNow();
            }
        }
    }

    private static void a(String str, ExecutorService executorService) {
        b(str, executorService, 2, TimeUnit.SECONDS);
    }

    @SuppressLint({"ThreadPoolCreation"})
    private static void b(String str, ExecutorService executorService, long j10, TimeUnit timeUnit) {
        Runtime runtime = Runtime.getRuntime();
        b bVar = new b(str, executorService, j10, timeUnit);
        runtime.addShutdownHook(new Thread(bVar, "Crashlytics Shutdown Hook for " + str));
    }

    public static ExecutorService c(String str) {
        ExecutorService e10 = e(d(str), new ThreadPoolExecutor.DiscardPolicy());
        a(str, e10);
        return e10;
    }

    public static ThreadFactory d(String str) {
        return new a(str, new AtomicLong(1));
    }

    @SuppressLint({"ThreadPoolCreation"})
    private static ExecutorService e(ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        return Executors.unconfigurableExecutorService(new ThreadPoolExecutor(1, 1, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), threadFactory, rejectedExecutionHandler));
    }
}
