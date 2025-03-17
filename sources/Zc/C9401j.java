package Zc;

import K9.C6620s;
import ga.C;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: Zc.j  reason: case insensitive filesystem */
public class C9401j extends C {

    /* renamed from: b  reason: collision with root package name */
    private static final ThreadLocal f65097b = new ThreadLocal();

    /* renamed from: a  reason: collision with root package name */
    private final ThreadPoolExecutor f65098a;

    public C9401j() {
        ThreadFactory defaultThreadFactory = Executors.defaultThreadFactory();
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(availableProcessors, availableProcessors, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new w(defaultThreadFactory));
        this.f65098a = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    static /* synthetic */ void d(Runnable runnable) {
        f65097b.set(new ArrayDeque());
        runnable.run();
    }

    /* access modifiers changed from: private */
    public static void e(Deque deque, Runnable runnable) {
        C6620s.l(deque);
        deque.add(runnable);
        if (deque.size() <= 1) {
            do {
                runnable.run();
                deque.removeFirst();
                runnable = (Runnable) deque.peekFirst();
            } while (runnable != null);
        }
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object a() {
        return this.f65098a;
    }

    /* access modifiers changed from: protected */
    public final ExecutorService b() {
        return this.f65098a;
    }

    public final void execute(Runnable runnable) {
        Deque deque = (Deque) f65097b.get();
        if (deque == null || deque.size() > 1) {
            this.f65098a.execute(new x(runnable));
        } else {
            e(deque, runnable);
        }
    }
}
