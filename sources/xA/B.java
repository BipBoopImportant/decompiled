package xa;

import java.util.concurrent.Executor;

final class B implements K {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f57741a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Object f57742b = new Object();
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public C8964e f57743c;

    public B(Executor executor, C8964e eVar) {
        this.f57741a = executor;
        this.f57743c = eVar;
    }

    public final void b(C8971l lVar) {
        if (lVar.o()) {
            synchronized (this.f57742b) {
                try {
                    if (this.f57743c != null) {
                        this.f57741a.execute(new A(this));
                    }
                } catch (Throwable th2) {
                    while (true) {
                        throw th2;
                    }
                }
            }
        }
    }
}
