package DK;

import AK.g;
import android.util.Log;

/* renamed from: DK.a  reason: case insensitive filesystem */
public final class C15581a {

    /* renamed from: c  reason: collision with root package name */
    private static C15581a f133883c;

    /* renamed from: a  reason: collision with root package name */
    private final b f133884a;

    /* renamed from: b  reason: collision with root package name */
    private final int f133885b;

    /* renamed from: DK.a$a  reason: collision with other inner class name */
    private static final class C3297a implements b {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public static final C3297a f133886a = new C3297a();

        private C3297a() {
        }

        public boolean a(String str, int i10) {
            return Log.isLoggable(str, i10);
        }

        public void b(int i10, String str, String str2) {
            Log.println(i10, str, str2);
        }

        public String c(Throwable th2) {
            return Log.getStackTraceString(th2);
        }
    }

    /* renamed from: DK.a$b */
    public interface b {
        boolean a(String str, int i10);

        void b(int i10, String str, String str2);

        String c(Throwable th2);
    }

    C15581a(b bVar) {
        this.f133884a = (b) g.d(bVar);
        int i10 = 7;
        while (i10 >= 2 && this.f133884a.a("AppAuth", i10)) {
            i10--;
        }
        this.f133885b = i10 + 1;
    }

    public static void a(String str, Object... objArr) {
        d().f(3, (Throwable) null, str, objArr);
    }

    public static void b(Throwable th2, String str, Object... objArr) {
        d().f(3, th2, str, objArr);
    }

    public static void c(String str, Object... objArr) {
        d().f(6, (Throwable) null, str, objArr);
    }

    public static synchronized C15581a d() {
        C15581a aVar;
        synchronized (C15581a.class) {
            try {
                if (f133883c == null) {
                    f133883c = new C15581a(C3297a.f133886a);
                }
                aVar = f133883c;
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        return aVar;
    }

    public static void e(String str, Object... objArr) {
        d().f(4, (Throwable) null, str, objArr);
    }

    public static void g(String str, Object... objArr) {
        d().f(5, (Throwable) null, str, objArr);
    }

    public void f(int i10, Throwable th2, String str, Object... objArr) {
        if (this.f133885b <= i10) {
            if (objArr != null && objArr.length >= 1) {
                str = String.format(str, objArr);
            }
            if (th2 != null) {
                str = str + "\n" + this.f133884a.c(th2);
            }
            this.f133884a.b(i10, "AppAuth", str);
        }
    }
}
