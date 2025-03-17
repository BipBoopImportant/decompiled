package xa;

import java.util.concurrent.Executor;

final class F implements K {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f57751a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Object f57752b = new Object();
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public C8966g f57753c;

    public F(Executor executor, C8966g gVar) {
        this.f57751a = executor;
        this.f57753c = gVar;
    }

    public final void b(C8971l lVar) {
        if (!lVar.q() && !lVar.o()) {
            synchronized (this.f57752b) {
                try {
                    if (this.f57753c != null) {
                        this.f57751a.execute(new E(this, lVar));
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
