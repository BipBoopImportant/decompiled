package G;

import H2.i;
import android.os.Handler;
import android.os.Looper;

public final class p {
    public static void a() {
        i.j(c(), "Not in application's main thread");
    }

    private static Handler b() {
        return new Handler(Looper.getMainLooper());
    }

    public static boolean c() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public static void d(Runnable runnable) {
        if (c()) {
            runnable.run();
        } else {
            i.j(b().post(runnable), "Unable to post to main thread");
        }
    }
}
