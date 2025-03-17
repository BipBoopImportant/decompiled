package Za;

final class x extends t {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ C9373D f65058b;

    x(C9373D d10) {
        this.f65058b = d10;
    }

    public final void a() {
        synchronized (this.f65058b.f65023f) {
            try {
                if (this.f65058b.f65028k.get() > 0) {
                    if (this.f65058b.f65028k.decrementAndGet() > 0) {
                        this.f65058b.f65019b.d("Leaving the connection open for other ongoing calls.", new Object[0]);
                        return;
                    }
                }
                C9373D d10 = this.f65058b;
                if (d10.f65030m != null) {
                    d10.f65019b.d("Unbind from service.", new Object[0]);
                    C9373D d11 = this.f65058b;
                    d11.f65018a.unbindService(d11.f65029l);
                    this.f65058b.f65024g = false;
                    this.f65058b.f65030m = null;
                    this.f65058b.f65029l = null;
                }
                this.f65058b.w();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
