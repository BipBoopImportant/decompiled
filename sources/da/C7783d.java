package da;

import android.os.StrictMode;
import java.util.concurrent.Callable;

/* renamed from: da.d  reason: case insensitive filesystem */
public final class C7783d {
    /* JADX INFO: finally extract failed */
    public static <T> T a(Callable<T> callable) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(StrictMode.ThreadPolicy.LAX);
            T call = callable.call();
            StrictMode.setThreadPolicy(threadPolicy);
            return call;
        } catch (Throwable th2) {
            StrictMode.setThreadPolicy(threadPolicy);
            throw th2;
        }
    }
}
