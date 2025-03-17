package a9;

import android.os.Looper;

public final class A6 {
    public static boolean a() {
        return Looper.getMainLooper().isCurrentThread();
    }
}
