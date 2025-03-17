package org.maplibre.android.log;

import FL.C15697a;
import android.util.Log;
import androidx.annotation.Keep;

@Keep
public final class Logger {
    public static final int DEBUG = 3;
    private static final C15697a DEFAULT;
    public static final int ERROR = 6;
    public static final int INFO = 4;
    public static final int NONE = 99;
    public static final int VERBOSE = 2;
    public static final int WARN = 5;
    private static int logLevel;
    private static volatile C15697a logger;

    class a implements C15697a {
        a() {
        }

        public void a(String str, String str2, Throwable th2) {
            Log.d(str, str2, th2);
        }

        public void b(String str, String str2, Throwable th2) {
            Log.w(str, str2, th2);
        }

        public void c(String str, String str2, Throwable th2) {
            Log.e(str, str2, th2);
        }

        public void d(String str, String str2) {
            Log.w(str, str2);
        }

        public void e(String str, String str2) {
            Log.e(str, str2);
        }

        public void f(String str, String str2) {
            Log.d(str, str2);
        }

        public void g(String str, String str2) {
            Log.i(str, str2);
        }

        public void h(String str, String str2, Throwable th2) {
            Log.i(str, str2, th2);
        }

        public void i(String str, String str2) {
            Log.v(str, str2);
        }

        public void j(String str, String str2, Throwable th2) {
            Log.v(str, str2, th2);
        }
    }

    static {
        a aVar = new a();
        DEFAULT = aVar;
        logger = aVar;
    }

    public static void d(String str, String str2) {
        if (logLevel <= 3) {
            logger.f(str, str2);
        }
    }

    public static void e(String str, String str2) {
        if (logLevel <= 6) {
            logger.e(str, str2);
        }
    }

    public static void i(String str, String str2) {
        if (logLevel <= 4) {
            logger.g(str, str2);
        }
    }

    public static void log(int i10, String str, String str2) {
        if (i10 == 2) {
            v(str, str2);
        } else if (i10 == 3) {
            d(str, str2);
        } else if (i10 == 4) {
            i(str, str2);
        } else if (i10 == 5) {
            w(str, str2);
        } else if (i10 == 6) {
            e(str, str2);
        } else {
            throw new UnsupportedOperationException();
        }
    }

    public static void setLoggerDefinition(C15697a aVar) {
        logger = aVar;
    }

    public static void setVerbosity(int i10) {
        logLevel = i10;
    }

    public static void v(String str, String str2) {
        if (logLevel <= 2) {
            logger.i(str, str2);
        }
    }

    public static void w(String str, String str2) {
        if (logLevel <= 5) {
            logger.d(str, str2);
        }
    }

    public static void d(String str, String str2, Throwable th2) {
        if (logLevel <= 3) {
            logger.a(str, str2, th2);
        }
    }

    public static void e(String str, String str2, Throwable th2) {
        if (logLevel <= 6) {
            logger.c(str, str2, th2);
        }
    }

    public static void i(String str, String str2, Throwable th2) {
        if (logLevel <= 4) {
            logger.h(str, str2, th2);
        }
    }

    public static void v(String str, String str2, Throwable th2) {
        if (logLevel <= 2) {
            logger.j(str, str2, th2);
        }
    }

    public static void w(String str, String str2, Throwable th2) {
        if (logLevel <= 5) {
            logger.b(str, str2, th2);
        }
    }
}
