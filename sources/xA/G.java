package xa;

final class G implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ C8971l f57754a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ H f57755b;

    G(H h10, C8971l lVar) {
        this.f57755b = h10;
        this.f57754a = lVar;
    }

    public final void run() {
        synchronized (this.f57755b.f57757b) {
            try {
                H h10 = this.f57755b;
                if (h10.f57758c != null) {
                    h10.f57758c.a(this.f57754a.m());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
