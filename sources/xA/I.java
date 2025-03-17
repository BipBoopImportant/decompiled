package xa;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

final class I implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ C8971l f57759a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ J f57760b;

    I(J j10, C8971l lVar) {
        this.f57760b = j10;
        this.f57759a = lVar;
    }

    public final void run() {
        try {
            C8971l then = this.f57760b.f57762b.then(this.f57759a.m());
            if (then == null) {
                this.f57760b.c(new NullPointerException("Continuation returned null"));
                return;
            }
            J j10 = this.f57760b;
            Executor executor = C8973n.f57780b;
            then.f(executor, j10);
            then.d(executor, this.f57760b);
            then.a(executor, this.f57760b);
        } catch (C8969j e10) {
            if (e10.getCause() instanceof Exception) {
                this.f57760b.c((Exception) e10.getCause());
            } else {
                this.f57760b.c(e10);
            }
        } catch (CancellationException unused) {
            this.f57760b.onCanceled();
        } catch (Exception e11) {
            this.f57760b.c(e11);
        }
    }
}
