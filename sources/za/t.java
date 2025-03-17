package Za;

import xa.C8972m;

public abstract class t implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final C8972m f65051a;

    t() {
        this.f65051a = null;
    }

    /* access modifiers changed from: protected */
    public abstract void a();

    /* access modifiers changed from: package-private */
    public final C8972m b() {
        return this.f65051a;
    }

    public final void c(Exception exc) {
        C8972m mVar = this.f65051a;
        if (mVar != null) {
            mVar.d(exc);
        }
    }

    public final void run() {
        try {
            a();
        } catch (Exception e10) {
            c(e10);
        }
    }

    public t(C8972m mVar) {
        this.f65051a = mVar;
    }
}
