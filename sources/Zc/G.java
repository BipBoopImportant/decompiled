package Zc;

public final /* synthetic */ class G implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ o f65080a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Runnable f65081b;

    public /* synthetic */ G(o oVar, Runnable runnable) {
        this.f65080a = oVar;
        this.f65081b = runnable;
    }

    public final void run() {
        Class<Throwable> cls = Throwable.class;
        o oVar = this.f65080a;
        Runnable runnable = this.f65081b;
        K k10 = new K(oVar, (J) null);
        try {
            runnable.run();
            k10.close();
            return;
        } catch (Throwable th2) {
            try {
                cls.getDeclaredMethod("addSuppressed", new Class[]{cls}).invoke(th, new Object[]{th2});
            } catch (Exception unused) {
            }
        }
        throw th;
    }
}
