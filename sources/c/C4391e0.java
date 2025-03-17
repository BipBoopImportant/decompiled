package C;

import android.util.Log;

/* renamed from: C.e0  reason: case insensitive filesystem */
public final class C4391e0 {

    /* renamed from: a  reason: collision with root package name */
    private static int f5337a = 3;

    public static void a(String str, String str2) {
        String k10 = k(str);
        if (g(k10, 3)) {
            Log.d(k10, str2);
        }
    }

    public static void b(String str, String str2, Throwable th2) {
        String k10 = k(str);
        if (g(k10, 3)) {
            Log.d(k10, str2, th2);
        }
    }

    public static void c(String str, String str2) {
        String k10 = k(str);
        if (g(k10, 6)) {
            Log.e(k10, str2);
        }
    }

    public static void d(String str, String str2, Throwable th2) {
        String k10 = k(str);
        if (g(k10, 6)) {
            Log.e(k10, str2, th2);
        }
    }

    public static void e(String str, String str2) {
        String k10 = k(str);
        if (g(k10, 4)) {
            Log.i(k10, str2);
        }
    }

    public static boolean f(String str) {
        return g(k(str), 3);
    }

    private static boolean g(String str, int i10) {
        return f5337a <= i10 || Log.isLoggable(str, i10);
    }

    public static boolean h(String str) {
        return g(k(str), 2);
    }

    static void i() {
        f5337a = 3;
    }

    static void j(int i10) {
        f5337a = i10;
    }

    private static String k(String str) {
        return str;
    }

    public static void l(String str, String str2) {
        String k10 = k(str);
        if (g(k10, 5)) {
            Log.w(k10, str2);
        }
    }

    public static void m(String str, String str2, Throwable th2) {
        String k10 = k(str);
        if (g(k10, 5)) {
            Log.w(k10, str2, th2);
        }
    }
}
