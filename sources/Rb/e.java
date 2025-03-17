package Rb;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import xa.C8971l;
import xa.C8974o;

public class e implements Executor {

    /* renamed from: a  reason: collision with root package name */
    private final ExecutorService f63176a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f63177b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private C8971l<?> f63178c = C8974o.f(null);

    e(ExecutorService executorService) {
        this.f63176a = executorService;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ C8971l e(Callable callable, C8971l lVar) {
        return (C8971l) callable.call();
    }

    public ExecutorService c() {
        return this.f63176a;
    }

    public void execute(Runnable runnable) {
        this.f63176a.execute(runnable);
    }

    public C8971l<Void> f(Runnable runnable) {
        C8971l<TContinuationResult> j10;
        synchronized (this.f63177b) {
            j10 = this.f63178c.j(this.f63176a, new d(runnable));
            this.f63178c = j10;
        }
        return j10;
    }

    public <T> C8971l<T> g(Callable<C8971l<T>> callable) {
        C8971l<TContinuationResult> j10;
        synchronized (this.f63177b) {
            j10 = this.f63178c.j(this.f63176a, new c(callable));
            this.f63178c = j10;
        }
        return j10;
    }
}
