package Zc;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;

public class o {

    /* renamed from: a  reason: collision with root package name */
    private final Object f65128a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private boolean f65129b;

    /* renamed from: c  reason: collision with root package name */
    private final Queue f65130c = new ArrayDeque();
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final AtomicReference f65131d = new AtomicReference();

    /* access modifiers changed from: private */
    public final void d() {
        synchronized (this.f65128a) {
            try {
                if (this.f65130c.isEmpty()) {
                    this.f65129b = false;
                    return;
                }
                I i10 = (I) this.f65130c.remove();
                e(i10.f65082a, i10.f65083b);
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
    }

    private final void e(Executor executor, Runnable runnable) {
        try {
            executor.execute(new G(this, runnable));
        } catch (RejectedExecutionException unused) {
            d();
        }
    }

    public void a(Executor executor, Runnable runnable) {
        synchronized (this.f65128a) {
            try {
                if (this.f65129b) {
                    this.f65130c.add(new I(executor, runnable, (H) null));
                    return;
                }
                this.f65129b = true;
                e(executor, runnable);
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
    }
}
