package gH;

import android.os.Looper;

/* renamed from: gH.b  reason: case insensitive filesystem */
public final class C17266b {

    /* renamed from: a  reason: collision with root package name */
    private static Thread f143291a;

    public static void a() {
        if (!b()) {
            throw new IllegalStateException("Must be called on the Main thread.");
        }
    }

    public static boolean b() {
        if (f143291a == null) {
            f143291a = Looper.getMainLooper().getThread();
        }
        return Thread.currentThread() == f143291a;
    }
}
