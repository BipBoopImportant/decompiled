package xa;

import java.util.concurrent.Executor;

final class H implements K {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f57756a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Object f57757b = new Object();
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public C8967h f57758c;

    public H(Executor executor, C8967h hVar) {
        this.f57756a = executor;
        this.f57758c = hVar;
    }

    public final void b(C8971l lVar) {
        if (lVar.q()) {
            synchronized (this.f57757b) {
                try {
                    if (this.f57758c != null) {
                        this.f57756a.execute(new G(this, lVar));
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
