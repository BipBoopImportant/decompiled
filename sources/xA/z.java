package xa;

import java.util.concurrent.Executor;

final class z<TResult, TContinuationResult> implements C8967h<TContinuationResult>, C8966g, C8964e, K {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f57800a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C8962c f57801b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final P f57802c;

    public z(Executor executor, C8962c cVar, P p10) {
        this.f57800a = executor;
        this.f57801b = cVar;
        this.f57802c = p10;
    }

    public final void a(TContinuationResult tcontinuationresult) {
        this.f57802c.u(tcontinuationresult);
    }

    public final void b(C8971l lVar) {
        this.f57800a.execute(new y(this, lVar));
    }

    public final void c(Exception exc) {
        this.f57802c.t(exc);
    }

    public final void onCanceled() {
        this.f57802c.v();
    }
}
