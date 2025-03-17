package F9;

import R9.b;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import ba.C7088e;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import xa.C8971l;

public final class D {

    /* renamed from: e  reason: collision with root package name */
    private static D f35547e;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Context f35548a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final ScheduledExecutorService f35549b;

    /* renamed from: c  reason: collision with root package name */
    private x f35550c = new x(this, (w) null);

    /* renamed from: d  reason: collision with root package name */
    private int f35551d = 1;

    D(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f35549b = scheduledExecutorService;
        this.f35548a = context.getApplicationContext();
    }

    public static synchronized D b(Context context) {
        D d10;
        synchronized (D.class) {
            try {
                if (f35547e == null) {
                    C7088e.a();
                    f35547e = new D(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new b("MessengerIpcClient"))));
                }
                d10 = f35547e;
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        return d10;
    }

    private final synchronized int f() {
        int i10;
        i10 = this.f35551d;
        this.f35551d = i10 + 1;
        return i10;
    }

    private final synchronized C8971l g(A a10) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Queueing ".concat(a10.toString()));
            }
            if (!this.f35550c.g(a10)) {
                x xVar = new x(this, (w) null);
                this.f35550c = xVar;
                xVar.g(a10);
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
        return a10.f35544b.a();
    }

    public final C8971l c(int i10, Bundle bundle) {
        return g(new z(f(), i10, bundle));
    }

    public final C8971l d(int i10, Bundle bundle) {
        return g(new C(f(), i10, bundle));
    }
}
