package androidx.work;

import android.util.Log;

/* renamed from: androidx.work.y  reason: case insensitive filesystem */
public abstract class C7055y {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f45325a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private static volatile C7055y f45326b = null;

    /* renamed from: c  reason: collision with root package name */
    private static final int f45327c = 20;

    /* renamed from: androidx.work.y$a */
    public static class a extends C7055y {

        /* renamed from: d  reason: collision with root package name */
        private final int f45328d;

        public a(int i10) {
            super(i10);
            this.f45328d = i10;
        }

        public void a(String str, String str2) {
            if (this.f45328d <= 3) {
                Log.d(str, str2);
            }
        }

        public void b(String str, String str2, Throwable th2) {
            if (this.f45328d <= 3) {
                Log.d(str, str2, th2);
            }
        }

        public void c(String str, String str2) {
            if (this.f45328d <= 6) {
                Log.e(str, str2);
            }
        }

        public void d(String str, String str2, Throwable th2) {
            if (this.f45328d <= 6) {
                Log.e(str, str2, th2);
            }
        }

        public void f(String str, String str2) {
            if (this.f45328d <= 4) {
                Log.i(str, str2);
            }
        }

        public void g(String str, String str2, Throwable th2) {
            if (this.f45328d <= 4) {
                Log.i(str, str2, th2);
            }
        }

        public void j(String str, String str2) {
            if (this.f45328d <= 2) {
                Log.v(str, str2);
            }
        }

        public void k(String str, String str2) {
            if (this.f45328d <= 5) {
                Log.w(str, str2);
            }
        }

        public void l(String str, String str2, Throwable th2) {
            if (this.f45328d <= 5) {
                Log.w(str, str2, th2);
            }
        }
    }

    public C7055y(int i10) {
    }

    public static C7055y e() {
        C7055y yVar;
        synchronized (f45325a) {
            try {
                if (f45326b == null) {
                    f45326b = new a(3);
                }
                yVar = f45326b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return yVar;
    }

    public static void h(C7055y yVar) {
        synchronized (f45325a) {
            try {
                if (f45326b == null) {
                    f45326b = yVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static String i(String str) {
        int length = str.length();
        StringBuilder sb2 = new StringBuilder(23);
        sb2.append("WM-");
        int i10 = f45327c;
        if (length >= i10) {
            sb2.append(str.substring(0, i10));
        } else {
            sb2.append(str);
        }
        return sb2.toString();
    }

    public abstract void a(String str, String str2);

    public abstract void b(String str, String str2, Throwable th2);

    public abstract void c(String str, String str2);

    public abstract void d(String str, String str2, Throwable th2);

    public abstract void f(String str, String str2);

    public abstract void g(String str, String str2, Throwable th2);

    public abstract void j(String str, String str2);

    public abstract void k(String str, String str2);

    public abstract void l(String str, String str2, Throwable th2);
}
