package a9;

import D8.c;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C17542s;

/* renamed from: a9.u6  reason: case insensitive filesystem */
public final class C6947u6 {

    /* renamed from: a  reason: collision with root package name */
    public final ThreadPoolExecutor f42890a;

    /* renamed from: b  reason: collision with root package name */
    public final c f42891b = new c("ThreadPool");

    /* renamed from: a9.u6$a */
    public static final class a {
        public static final Thread a(String str, Runnable runnable) {
            C17542s.j(str, "$threadName");
            C17542s.j(runnable, "task");
            Thread thread = new Thread(runnable);
            thread.setPriority(10);
            thread.setName(str);
            return thread;
        }

        public final ThreadPoolExecutor b(int i10, TimeUnit timeUnit, ArrayBlockingQueue arrayBlockingQueue, ThreadPoolExecutor.AbortPolicy abortPolicy, String str) {
            C17542s.j(timeUnit, "unit");
            C17542s.j(arrayBlockingQueue, "workQueue");
            C17542s.j(abortPolicy, "rejectedExecutionHandler");
            C17542s.j(str, "threadName");
            return new ThreadPoolExecutor(i10, 1, 30, timeUnit, arrayBlockingQueue, new C6939t6(str), abortPolicy);
        }
    }

    public C6947u6(int i10) {
        a aVar = new a();
        C17542s.j(aVar, "threadPoolExecutorProvider");
        this.f42890a = aVar.b(i10 != 0 ? 1 : 0, TimeUnit.SECONDS, new ArrayBlockingQueue(60, true), i10 != 0 ? i10 != 1 ? new ThreadPoolExecutor.AbortPolicy() : new ThreadPoolExecutor.AbortPolicy() : new ThreadPoolExecutor.AbortPolicy(), i10 != 0 ? i10 != 1 ? "cs" : "cs-cpu" : "cs-io");
    }
}
