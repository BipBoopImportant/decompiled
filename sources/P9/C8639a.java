package p9;

import android.util.Log;

/* renamed from: p9.a  reason: case insensitive filesystem */
public final class C8639a {
    public static void a(String str, String str2, Object obj) {
        String d10 = d(str);
        if (Log.isLoggable(d10, 3)) {
            Log.d(d10, String.format(str2, new Object[]{obj}));
        }
    }

    public static void b(String str, String str2, Object... objArr) {
        String d10 = d(str);
        if (Log.isLoggable(d10, 3)) {
            Log.d(d10, String.format(str2, objArr));
        }
    }

    public static void c(String str, String str2, Throwable th2) {
        String d10 = d(str);
        if (Log.isLoggable(d10, 6)) {
            Log.e(d10, str2, th2);
        }
    }

    private static String d(String str) {
        return "TRuntime." + str;
    }

    public static void e(String str, String str2, Object obj) {
        String d10 = d(str);
        if (Log.isLoggable(d10, 4)) {
            Log.i(d10, String.format(str2, new Object[]{obj}));
        }
    }

    public static void f(String str, String str2, Object obj) {
        String d10 = d(str);
        if (Log.isLoggable(d10, 5)) {
            Log.w(d10, String.format(str2, new Object[]{obj}));
        }
    }
}
