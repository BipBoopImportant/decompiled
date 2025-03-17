package xa;

import java.util.concurrent.Callable;

final class Q implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ P f57775a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Callable f57776b;

    Q(P p10, Callable callable) {
        this.f57775a = p10;
        this.f57776b = callable;
    }

    public final void run() {
        try {
            this.f57775a.u(this.f57776b.call());
        } catch (Exception e10) {
            this.f57775a.t(e10);
        } catch (Throwable th2) {
            this.f57775a.t(new RuntimeException(th2));
        }
    }
}
