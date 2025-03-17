package xa;

final class C implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ C8971l f57744a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ D f57745b;

    C(D d10, C8971l lVar) {
        this.f57745b = d10;
        this.f57744a = lVar;
    }

    public final void run() {
        synchronized (this.f57745b.f57747b) {
            try {
                D d10 = this.f57745b;
                if (d10.f57748c != null) {
                    d10.f57748c.onComplete(this.f57744a);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
