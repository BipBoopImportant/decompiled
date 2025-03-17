package com.android.volley;

import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class v {

    /* renamed from: a  reason: collision with root package name */
    public static String f46285a = "Volley";

    /* renamed from: b  reason: collision with root package name */
    public static boolean f46286b = Log.isLoggable("Volley", 2);

    /* renamed from: c  reason: collision with root package name */
    private static final String f46287c = v.class.getName();

    static class a {

        /* renamed from: c  reason: collision with root package name */
        public static final boolean f46288c = v.f46286b;

        /* renamed from: a  reason: collision with root package name */
        private final List<C0806a> f46289a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        private boolean f46290b = false;

        /* renamed from: com.android.volley.v$a$a  reason: collision with other inner class name */
        private static class C0806a {

            /* renamed from: a  reason: collision with root package name */
            public final String f46291a;

            /* renamed from: b  reason: collision with root package name */
            public final long f46292b;

            /* renamed from: c  reason: collision with root package name */
            public final long f46293c;

            public C0806a(String str, long j10, long j11) {
                this.f46291a = str;
                this.f46292b = j10;
                this.f46293c = j11;
            }
        }

        a() {
        }

        private long c() {
            if (this.f46289a.size() == 0) {
                return 0;
            }
            long j10 = this.f46289a.get(0).f46293c;
            List<C0806a> list = this.f46289a;
            return list.get(list.size() - 1).f46293c - j10;
        }

        public synchronized void a(String str, long j10) {
            if (!this.f46290b) {
                this.f46289a.add(new C0806a(str, j10, SystemClock.elapsedRealtime()));
            } else {
                throw new IllegalStateException("Marker added to finished log");
            }
        }

        public synchronized void b(String str) {
            this.f46290b = true;
            long c10 = c();
            if (c10 > 0) {
                long j10 = this.f46289a.get(0).f46293c;
                v.b("(%-4d ms) %s", Long.valueOf(c10), str);
                for (C0806a next : this.f46289a) {
                    long j11 = next.f46293c;
                    v.b("(+%-4d) [%2d] %s", Long.valueOf(j11 - j10), Long.valueOf(next.f46292b), next.f46291a);
                    j10 = j11;
                }
            }
        }

        /* access modifiers changed from: protected */
        public void finalize() {
            if (!this.f46290b) {
                b("Request on the loose");
                v.c("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
            }
        }
    }

    private static String a(String str, Object... objArr) {
        String str2;
        if (objArr != null) {
            str = String.format(Locale.US, str, objArr);
        }
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        int i10 = 2;
        while (true) {
            if (i10 >= stackTrace.length) {
                str2 = "<unknown>";
                break;
            } else if (!stackTrace[i10].getClassName().equals(f46287c)) {
                String className = stackTrace[i10].getClassName();
                String substring = className.substring(className.lastIndexOf(46) + 1);
                str2 = substring.substring(substring.lastIndexOf(36) + 1) + "." + stackTrace[i10].getMethodName();
                break;
            } else {
                i10++;
            }
        }
        return String.format(Locale.US, "[%d] %s: %s", new Object[]{Long.valueOf(Thread.currentThread().getId()), str2, str});
    }

    public static void b(String str, Object... objArr) {
        Log.d(f46285a, a(str, objArr));
    }

    public static void c(String str, Object... objArr) {
        Log.e(f46285a, a(str, objArr));
    }

    public static void d(Throwable th2, String str, Object... objArr) {
        Log.e(f46285a, a(str, objArr), th2);
    }

    public static void e(String str, Object... objArr) {
        if (f46286b) {
            Log.v(f46285a, a(str, objArr));
        }
    }

    public static void f(String str, Object... objArr) {
        Log.wtf(f46285a, a(str, objArr));
    }
}
