package H;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ScheduledExecutorService;

final class f {

    /* renamed from: a  reason: collision with root package name */
    private static volatile ScheduledExecutorService f6674a;

    private f() {
    }

    static ScheduledExecutorService a() {
        if (f6674a != null) {
            return f6674a;
        }
        synchronized (f.class) {
            try {
                if (f6674a == null) {
                    f6674a = new c(new Handler(Looper.getMainLooper()));
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        return f6674a;
    }
}
