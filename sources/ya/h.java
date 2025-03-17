package Ya;

import Za.C9375F;
import android.content.Context;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    private static C9368e f64858a;

    static synchronized C9368e a(Context context) {
        C9368e eVar;
        synchronized (h.class) {
            try {
                if (f64858a == null) {
                    g gVar = new g((C9369f) null);
                    gVar.b(new m(C9375F.a(context)));
                    f64858a = gVar.a();
                }
                eVar = f64858a;
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        return eVar;
    }
}
