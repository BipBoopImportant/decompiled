package xa;

import java.util.concurrent.Executor;

final class D implements K {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f57746a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Object f57747b = new Object();
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public C8965f f57748c;

    public D(Executor executor, C8965f fVar) {
        this.f57746a = executor;
        this.f57748c = fVar;
    }

    public final void b(C8971l lVar) {
        synchronized (this.f57747b) {
            try {
                if (this.f57748c != null) {
                    this.f57746a.execute(new C(this, lVar));
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
    }
}
