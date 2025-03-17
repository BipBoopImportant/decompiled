package fb;

/* renamed from: fb.n  reason: case insensitive filesystem */
final class C9698n extends C9694j {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ t f72946b;

    C9698n(t tVar) {
        this.f72946b = tVar;
    }

    public final void a() {
        synchronized (this.f72946b.f72957f) {
            try {
                if (this.f72946b.f72962k.get() <= 0 || this.f72946b.f72962k.decrementAndGet() <= 0) {
                    t tVar = this.f72946b;
                    if (tVar.f72964m != null) {
                        tVar.f72953b.c("Unbind from service.", new Object[0]);
                        t tVar2 = this.f72946b;
                        tVar2.f72952a.unbindService(tVar2.f72963l);
                        this.f72946b.f72958g = false;
                        this.f72946b.f72964m = null;
                        this.f72946b.f72963l = null;
                    }
                    this.f72946b.w();
                    return;
                }
                this.f72946b.f72953b.c("Leaving the connection open for other ongoing calls.", new Object[0]);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
