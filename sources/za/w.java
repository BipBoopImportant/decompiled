package Za;

import xa.C8972m;

final class w extends t {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ C8972m f65055b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ t f65056c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ C9373D f65057d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    w(C9373D d10, C8972m mVar, C8972m mVar2, t tVar) {
        super(mVar);
        this.f65057d = d10;
        this.f65055b = mVar2;
        this.f65056c = tVar;
    }

    public final void a() {
        synchronized (this.f65057d.f65023f) {
            try {
                C9373D.n(this.f65057d, this.f65055b);
                if (this.f65057d.f65028k.getAndIncrement() > 0) {
                    this.f65057d.f65019b.d("Already connected to the service.", new Object[0]);
                }
                C9373D.p(this.f65057d, this.f65056c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
