package V4;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static long f40423a;

    /* renamed from: b  reason: collision with root package name */
    private static Method f40424b;

    /* renamed from: c  reason: collision with root package name */
    private static Method f40425c;

    /* renamed from: d  reason: collision with root package name */
    private static Method f40426d;

    /* renamed from: e  reason: collision with root package name */
    private static Method f40427e;

    public static void a(String str, int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            c.a(l(str), i10);
        } else {
            b(l(str), i10);
        }
    }

    private static void b(String str, int i10) {
        try {
            if (f40425c == null) {
                f40425c = Trace.class.getMethod("asyncTraceBegin", new Class[]{Long.TYPE, String.class, Integer.TYPE});
            }
            f40425c.invoke((Object) null, new Object[]{Long.valueOf(f40423a), str, Integer.valueOf(i10)});
        } catch (Exception e10) {
            g("asyncTraceBegin", e10);
        }
    }

    public static void c(String str) {
        b.a(l(str));
    }

    public static void d(String str, int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            c.b(l(str), i10);
        } else {
            e(l(str), i10);
        }
    }

    private static void e(String str, int i10) {
        try {
            if (f40426d == null) {
                f40426d = Trace.class.getMethod("asyncTraceEnd", new Class[]{Long.TYPE, String.class, Integer.TYPE});
            }
            f40426d.invoke((Object) null, new Object[]{Long.valueOf(f40423a), str, Integer.valueOf(i10)});
        } catch (Exception e10) {
            g("asyncTraceEnd", e10);
        }
    }

    public static void f() {
        b.b();
    }

    private static void g(String str, Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
        Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }

    public static boolean h() {
        return Build.VERSION.SDK_INT >= 29 ? c.c() : i();
    }

    private static boolean i() {
        Class<Trace> cls = Trace.class;
        try {
            if (f40424b == null) {
                f40423a = cls.getField("TRACE_TAG_APP").getLong((Object) null);
                f40424b = cls.getMethod("isTagEnabled", new Class[]{Long.TYPE});
            }
            return ((Boolean) f40424b.invoke((Object) null, new Object[]{Long.valueOf(f40423a)})).booleanValue();
        } catch (Exception e10) {
            g("isTagEnabled", e10);
            return false;
        }
    }

    public static void j(String str, int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            c.d(l(str), i10);
        } else {
            k(l(str), i10);
        }
    }

    private static void k(String str, int i10) {
        try {
            if (f40427e == null) {
                f40427e = Trace.class.getMethod("traceCounter", new Class[]{Long.TYPE, String.class, Integer.TYPE});
            }
            f40427e.invoke((Object) null, new Object[]{Long.valueOf(f40423a), str, Integer.valueOf(i10)});
        } catch (Exception e10) {
            g("traceCounter", e10);
        }
    }

    private static String l(String str) {
        return str.length() <= 127 ? str : str.substring(0, 127);
    }
}
