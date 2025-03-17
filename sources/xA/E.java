package xa;

import K9.C6620s;

final class E implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ C8971l f57749a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ F f57750b;

    E(F f10, C8971l lVar) {
        this.f57750b = f10;
        this.f57749a = lVar;
    }

    public final void run() {
        synchronized (this.f57750b.f57752b) {
            try {
                F f10 = this.f57750b;
                if (f10.f57753c != null) {
                    f10.f57753c.c((Exception) C6620s.l(this.f57749a.l()));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
