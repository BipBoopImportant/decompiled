package xa;

final class w implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ C8971l f57793a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ x f57794b;

    w(x xVar, C8971l lVar) {
        this.f57794b = xVar;
        this.f57793a = lVar;
    }

    public final void run() {
        if (this.f57793a.o()) {
            this.f57794b.f57797c.v();
            return;
        }
        try {
            this.f57794b.f57797c.u(this.f57794b.f57796b.then(this.f57793a));
        } catch (C8969j e10) {
            if (e10.getCause() instanceof Exception) {
                this.f57794b.f57797c.t((Exception) e10.getCause());
            } else {
                this.f57794b.f57797c.t(e10);
            }
        } catch (Exception e11) {
            this.f57794b.f57797c.t(e11);
        }
    }
}
