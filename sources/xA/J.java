package xa;

import java.util.concurrent.Executor;

final class J<TResult, TContinuationResult> implements C8967h<TContinuationResult>, C8966g, C8964e, K {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f57761a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C8970k f57762b;

    /* renamed from: c  reason: collision with root package name */
    private final P f57763c;

    public J(Executor executor, C8970k kVar, P p10) {
        this.f57761a = executor;
        this.f57762b = kVar;
        this.f57763c = p10;
    }

    public final void a(TContinuationResult tcontinuationresult) {
        this.f57763c.u(tcontinuationresult);
    }

    public final void b(C8971l lVar) {
        this.f57761a.execute(new I(this, lVar));
    }

    public final void c(Exception exc) {
        this.f57763c.t(exc);
    }

    public final void onCanceled() {
        this.f57763c.v();
    }
}
