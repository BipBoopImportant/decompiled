package kotlin.jvm.internal;

import XH.C16806M;
import XH.C16821l;
import java.util.Arrays;

/* renamed from: kotlin.jvm.internal.s  reason: case insensitive filesystem */
public class C17542s {

    /* renamed from: kotlin.jvm.internal.s$a */
    public static class a {
        private a() {
        }
    }

    private C17542s() {
    }

    public static boolean a(Double d10, double d11) {
        return d10 != null && d10.doubleValue() == d11;
    }

    public static boolean b(Double d10, Double d11) {
        if (d10 == null) {
            if (d11 != null) {
                return false;
            }
        } else if (d11 == null || d10.doubleValue() != d11.doubleValue()) {
            return false;
        }
        return true;
    }

    public static boolean c(Float f10, float f11) {
        return f10 != null && f10.floatValue() == f11;
    }

    public static boolean d(Float f10, Float f11) {
        if (f10 == null) {
            if (f11 != null) {
                return false;
            }
        } else if (f11 == null || f10.floatValue() != f11.floatValue()) {
            return false;
        }
        return true;
    }

    public static boolean e(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static void f(Object obj, String str) {
        if (obj == null) {
            throw ((IllegalStateException) p(new IllegalStateException(str + " must not be null")));
        }
    }

    public static void g(Object obj) {
        if (obj == null) {
            r();
        }
    }

    public static void h(Object obj, String str) {
        if (obj == null) {
            s(str);
        }
    }

    public static void i(Object obj, String str) {
        if (obj == null) {
            throw ((NullPointerException) p(new NullPointerException(str + " must not be null")));
        }
    }

    public static void j(Object obj, String str) {
        if (obj == null) {
            v(str);
        }
    }

    public static void k(Object obj, String str) {
        if (obj == null) {
            u(str);
        }
    }

    public static int l(int i10, int i11) {
        if (i10 < i11) {
            return -1;
        }
        return i10 == i11 ? 0 : 1;
    }

    public static int m(long j10, long j11) {
        int i10 = (j10 > j11 ? 1 : (j10 == j11 ? 0 : -1));
        if (i10 < 0) {
            return -1;
        }
        return i10 == 0 ? 0 : 1;
    }

    private static String n(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String name = C17542s.class.getName();
        int i10 = 0;
        while (!stackTrace[i10].getClassName().equals(name)) {
            i10++;
        }
        while (stackTrace[i10].getClassName().equals(name)) {
            i10++;
        }
        StackTraceElement stackTraceElement = stackTrace[i10];
        String className = stackTraceElement.getClassName();
        String methodName = stackTraceElement.getMethodName();
        return "Parameter specified as non-null is null: method " + className + "." + methodName + ", parameter " + str;
    }

    public static void o(int i10, String str) {
        w();
    }

    private static <T extends Throwable> T p(T t10) {
        return q(t10, C17542s.class.getName());
    }

    static <T extends Throwable> T q(T t10, String str) {
        StackTraceElement[] stackTrace = t10.getStackTrace();
        int length = stackTrace.length;
        int i10 = -1;
        for (int i11 = 0; i11 < length; i11++) {
            if (str.equals(stackTrace[i11].getClassName())) {
                i10 = i11;
            }
        }
        t10.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i10 + 1, length));
        return t10;
    }

    public static void r() {
        throw ((NullPointerException) p(new NullPointerException()));
    }

    public static void s(String str) {
        throw ((NullPointerException) p(new NullPointerException(str)));
    }

    public static void t() {
        throw ((C16821l) p(new C16821l()));
    }

    private static void u(String str) {
        throw ((IllegalArgumentException) p(new IllegalArgumentException(n(str))));
    }

    private static void v(String str) {
        throw ((NullPointerException) p(new NullPointerException(n(str))));
    }

    public static void w() {
        x("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    public static void x(String str) {
        throw new UnsupportedOperationException(str);
    }

    public static void y(String str) {
        throw ((C16806M) p(new C16806M(str)));
    }

    public static void z(String str) {
        y("lateinit property " + str + " has not been initialized");
    }
}
