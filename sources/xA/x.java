package xa;

import java.util.concurrent.Executor;

final class x implements K {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f57795a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C8962c f57796b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final P f57797c;

    public x(Executor executor, C8962c cVar, P p10) {
        this.f57795a = executor;
        this.f57796b = cVar;
        this.f57797c = p10;
    }

    public final void b(C8971l lVar) {
        this.f57795a.execute(new w(this, lVar));
    }
}
