package pE;

import android.util.Log;

/* renamed from: pE.c  reason: case insensitive filesystem */
public class C14918c {

    /* renamed from: a  reason: collision with root package name */
    private static int f130336a = 5;

    public static void a(String str, String str2) {
        if (h(3)) {
            Log.d(str, str2);
        }
    }

    public static void b(String str, String str2, Throwable th2) {
        if (h(3)) {
            Log.d(str, str2, th2);
        }
    }

    public static void c(String str, String str2) {
        if (h(6)) {
            Log.e(str, str2);
        }
    }

    public static void d(String str, String str2, Throwable th2) {
        if (h(6)) {
            Log.e(str, str2, th2);
        }
    }

    public static void e(String str, String str2) {
        if (h(4)) {
            Log.i(str, str2);
        }
    }

    public static void f(String str, String str2, Throwable th2) {
        if (h(4)) {
            Log.i(str, str2, th2);
        }
    }

    public static void g(int i10) {
        f130336a = i10;
    }

    private static boolean h(int i10) {
        return f130336a <= i10;
    }

    public static void i(String str, String str2) {
        if (h(2)) {
            Log.v(str, str2);
        }
    }

    public static void j(String str, String str2, Throwable th2) {
        if (h(2)) {
            Log.v(str, str2, th2);
        }
    }

    public static void k(String str, String str2) {
        if (h(5)) {
            Log.w(str, str2);
        }
    }
}
