package fb;

import xa.C8972m;

/* renamed from: fb.m  reason: case insensitive filesystem */
final class C9697m extends C9694j {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ C8972m f72943b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ C9694j f72944c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ t f72945d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C9697m(t tVar, C8972m mVar, C8972m mVar2, C9694j jVar) {
        super(mVar);
        this.f72943b = mVar2;
        this.f72944c = jVar;
        this.f72945d = tVar;
    }

    public final void a() {
        synchronized (this.f72945d.f72957f) {
            try {
                t.n(this.f72945d, this.f72943b);
                if (this.f72945d.f72962k.getAndIncrement() > 0) {
                    this.f72945d.f72953b.c("Already connected to the service.", new Object[0]);
                }
                t.p(this.f72945d, this.f72944c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
