package Nb;

import android.util.Log;

public class g {

    /* renamed from: c  reason: collision with root package name */
    static final g f61980c = new g("FirebaseCrashlytics");

    /* renamed from: a  reason: collision with root package name */
    private final String f61981a;

    /* renamed from: b  reason: collision with root package name */
    private int f61982b = 4;

    public g(String str) {
        this.f61981a = str;
    }

    private boolean a(int i10) {
        return this.f61982b <= i10 || Log.isLoggable(this.f61981a, i10);
    }

    public static g f() {
        return f61980c;
    }

    public void b(String str) {
        c(str, (Throwable) null);
    }

    public void c(String str, Throwable th2) {
        if (a(3)) {
            Log.d(this.f61981a, str, th2);
        }
    }

    public void d(String str) {
        e(str, (Throwable) null);
    }

    public void e(String str, Throwable th2) {
        if (a(6)) {
            Log.e(this.f61981a, str, th2);
        }
    }

    public void g(String str) {
        h(str, (Throwable) null);
    }

    public void h(String str, Throwable th2) {
        if (a(4)) {
            Log.i(this.f61981a, str, th2);
        }
    }

    public void i(String str) {
        j(str, (Throwable) null);
    }

    public void j(String str, Throwable th2) {
        if (a(2)) {
            Log.v(this.f61981a, str, th2);
        }
    }

    public void k(String str) {
        l(str, (Throwable) null);
    }

    public void l(String str, Throwable th2) {
        if (a(5)) {
            Log.w(this.f61981a, str, th2);
        }
    }
}
