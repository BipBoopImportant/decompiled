package t3;

import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;

public final class q {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f29538a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private static int f29539b = 0;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f29540c = true;

    /* renamed from: d  reason: collision with root package name */
    private static a f29541d = a.f29542a;

    public interface a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f29542a = new C0463a();

        /* renamed from: t3.q$a$a  reason: collision with other inner class name */
        class C0463a implements a {
            C0463a() {
            }

            public void a(String str, String str2, Throwable th2) {
                Log.d(str, q.a(str2, th2));
            }

            public void b(String str, String str2, Throwable th2) {
                Log.w(str, q.a(str2, th2));
            }

            public void c(String str, String str2, Throwable th2) {
                Log.e(str, q.a(str2, th2));
            }

            public void h(String str, String str2, Throwable th2) {
                Log.i(str, q.a(str2, th2));
            }
        }

        void a(String str, String str2, Throwable th2);

        void b(String str, String str2, Throwable th2);

        void c(String str, String str2, Throwable th2);

        void h(String str, String str2, Throwable th2);
    }

    public static String a(String str, Throwable th2) {
        String e10 = e(th2);
        if (TextUtils.isEmpty(e10)) {
            return str;
        }
        return str + "\n  " + e10.replace("\n", "\n  ") + 10;
    }

    public static void b(String str, String str2) {
        synchronized (f29538a) {
            try {
                if (f29539b == 0) {
                    f29541d.a(str, str2, (Throwable) null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void c(String str, String str2) {
        synchronized (f29538a) {
            try {
                if (f29539b <= 3) {
                    f29541d.c(str, str2, (Throwable) null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void d(String str, String str2, Throwable th2) {
        synchronized (f29538a) {
            try {
                if (f29539b <= 3) {
                    f29541d.c(str, str2, th2);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public static String e(Throwable th2) {
        if (th2 == null) {
            return null;
        }
        synchronized (f29538a) {
            try {
                if (g(th2)) {
                    return "UnknownHostException (no network)";
                }
                if (!f29540c) {
                    String message = th2.getMessage();
                    return message;
                }
                String replace = Log.getStackTraceString(th2).trim().replace("\t", "    ");
                return replace;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public static void f(String str, String str2) {
        synchronized (f29538a) {
            try {
                if (f29539b <= 1) {
                    f29541d.h(str, str2, (Throwable) null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static boolean g(Throwable th2) {
        while (th2 != null) {
            if (th2 instanceof UnknownHostException) {
                return true;
            }
            th2 = th2.getCause();
        }
        return false;
    }

    public static void h(String str, String str2) {
        synchronized (f29538a) {
            try {
                if (f29539b <= 2) {
                    f29541d.b(str, str2, (Throwable) null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void i(String str, String str2, Throwable th2) {
        synchronized (f29538a) {
            try {
                if (f29539b <= 2) {
                    f29541d.b(str, str2, th2);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
