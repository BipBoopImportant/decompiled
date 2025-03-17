package G;

import D2.i;
import android.os.Handler;
import android.os.Looper;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    private static volatile Handler f6104a;

    private l() {
    }

    public static Handler a() {
        if (f6104a != null) {
            return f6104a;
        }
        synchronized (l.class) {
            try {
                if (f6104a == null) {
                    f6104a = i.a(Looper.getMainLooper());
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        return f6104a;
    }
}
