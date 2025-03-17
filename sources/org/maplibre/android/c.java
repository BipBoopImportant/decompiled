package org.maplibre.android;

public class c {

    /* renamed from: a  reason: collision with root package name */
    private static volatile boolean f145492a;

    public static synchronized void a(boolean z10) {
        synchronized (c.class) {
            f145492a = z10;
        }
    }

    public static void b(String str) {
        if (f145492a) {
            throw new d(str);
        }
    }

    public static void c(String str, Throwable th2) {
        if (f145492a) {
            throw new d(String.format("%s - %s", new Object[]{str, th2}));
        }
    }

    public static void d(Throwable th2) {
        if (f145492a) {
            throw new d(String.format("%s", new Object[]{th2}));
        }
    }
}
