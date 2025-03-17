package LE;

import android.util.Log;

/* renamed from: LE.a  reason: case insensitive filesystem */
public final class C13184a {

    /* renamed from: a  reason: collision with root package name */
    public static int f111870a = 5;

    public static void a(Exception exc) {
        if (d()) {
            exc.printStackTrace();
        }
    }

    public static void b(Object obj) {
        if (d()) {
            Log.e("RootBeer", c() + String.valueOf(obj));
            Log.e("QLog", c() + String.valueOf(obj));
        }
    }

    private static String c() {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        String methodName = stackTrace[2].getMethodName();
        String className = stackTrace[2].getClassName();
        int lineNumber = stackTrace[2].getLineNumber();
        String substring = className.substring(className.lastIndexOf(46) + 1);
        return substring + ": " + methodName + "() [" + lineNumber + "] - ";
    }

    public static boolean d() {
        return f111870a > 0;
    }

    public static boolean e() {
        return f111870a > 4;
    }

    public static void f(Object obj) {
        if (e()) {
            Log.v("RootBeer", c() + String.valueOf(obj));
        }
    }
}
