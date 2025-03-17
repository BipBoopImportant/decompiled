package K9;

import android.util.Log;

/* renamed from: K9.j  reason: case insensitive filesystem */
public final class C6612j {

    /* renamed from: a  reason: collision with root package name */
    private final String f37877a;

    /* renamed from: b  reason: collision with root package name */
    private final String f37878b;

    public C6612j(String str) {
        this(str, (String) null);
    }

    private final String g(String str) {
        String str2 = this.f37878b;
        return str2 == null ? str : str2.concat(str);
    }

    public boolean a(int i10) {
        return Log.isLoggable(this.f37877a, i10);
    }

    public void b(String str, String str2) {
        if (a(3)) {
            Log.d(str, g(str2));
        }
    }

    public void c(String str, String str2) {
        if (a(6)) {
            Log.e(str, g(str2));
        }
    }

    public void d(String str, String str2, Throwable th2) {
        if (a(6)) {
            Log.e(str, g(str2), th2);
        }
    }

    public void e(String str, String str2) {
        if (a(2)) {
            Log.v(str, g(str2));
        }
    }

    public void f(String str, String str2) {
        if (a(5)) {
            Log.w(str, g(str2));
        }
    }

    public C6612j(String str, String str2) {
        C6620s.m(str, "log tag cannot be null");
        C6620s.c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.f37877a = str;
        this.f37878b = (str2 == null || str2.length() <= 0) ? null : str2;
    }
}
