package xa;

final class A implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ B f57740a;

    A(B b10) {
        this.f57740a = b10;
    }

    public final void run() {
        synchronized (this.f57740a.f57742b) {
            try {
                B b10 = this.f57740a;
                if (b10.f57743c != null) {
                    b10.f57743c.onCanceled();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
