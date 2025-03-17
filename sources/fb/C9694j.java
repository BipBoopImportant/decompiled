package fb;

import xa.C8972m;

/* renamed from: fb.j  reason: case insensitive filesystem */
public abstract class C9694j implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final C8972m f72939a;

    C9694j() {
        this.f72939a = null;
    }

    /* access modifiers changed from: protected */
    public abstract void a();

    /* access modifiers changed from: package-private */
    public final C8972m b() {
        return this.f72939a;
    }

    public final void c(Exception exc) {
        C8972m mVar = this.f72939a;
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

    public C9694j(C8972m mVar) {
        this.f72939a = mVar;
    }
}
