package t3;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

public class E implements C5953d {
    protected E() {
    }

    public long a() {
        return System.currentTimeMillis();
    }

    public long b() {
        return System.nanoTime();
    }

    public long c() {
        return SystemClock.elapsedRealtime();
    }

    public long d() {
        return SystemClock.uptimeMillis();
    }

    public C5962m e(Looper looper, Handler.Callback callback) {
        return new F(new Handler(looper, callback));
    }

    public void f() {
    }
}
