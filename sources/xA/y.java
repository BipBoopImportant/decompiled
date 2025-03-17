package xa;

import java.util.concurrent.Executor;

final class y implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ C8971l f57798a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ z f57799b;

    y(z zVar, C8971l lVar) {
        this.f57799b = zVar;
        this.f57798a = lVar;
    }

    public final void run() {
        try {
            C8971l lVar = (C8971l) this.f57799b.f57801b.then(this.f57798a);
            if (lVar == null) {
                this.f57799b.c(new NullPointerException("Continuation returned null"));
                return;
            }
            z zVar = this.f57799b;
            Executor executor = C8973n.f57780b;
            lVar.f(executor, zVar);
            lVar.d(executor, this.f57799b);
            lVar.a(executor, this.f57799b);
        } catch (C8969j e10) {
            if (e10.getCause() instanceof Exception) {
                this.f57799b.f57802c.t((Exception) e10.getCause());
            } else {
                this.f57799b.f57802c.t(e10);
            }
        } catch (Exception e11) {
            this.f57799b.f57802c.t(e11);
        }
    }
}
