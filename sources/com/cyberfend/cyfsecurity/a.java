package com.cyberfend.cyfsecurity;

import K6.A;
import K6.C6580a;
import K6.C6586g;
import K6.C6587h;
import K6.C6595p;
import K6.C6597s;
import K6.C6599u;
import K6.r;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.os.SystemClock;
import android.util.Log;
import android.view.ViewGroup;
import com.cyberfend.cyfsecurity.SensorDataBuilder;
import org.json.JSONException;
import org.json.JSONObject;

@SuppressLint({"Registered"})
@Deprecated
public class a {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static A f47782a = new A();

    /* renamed from: b  reason: collision with root package name */
    private static boolean f47783b = false;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f47784c = false;

    /* renamed from: d  reason: collision with root package name */
    private static boolean f47785d = false;

    /* renamed from: e  reason: collision with root package name */
    public static C6580a.C0597a f47786e = null;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static String f47787f = null;

    static {
        Log.i("CYFMonitor", "Initializing Akamai BMP SDK Version 3.3.8-rc2");
        new Thread(new SensorDataBuilder.a()).start();
    }

    public static void a() {
        try {
            C6595p.c("CYFMonitor", "Stop collecting sensor data", new Throwable[0]);
            f47782a.r();
            f47782a.o();
        } catch (Exception unused) {
        }
    }

    public static void b(Activity activity) {
        try {
            C6595p.c("CYFMonitor", "Start collecting sensor data", new Throwable[0]);
            if (C6599u.f37711c == 0) {
                C6599u.f37711c = SystemClock.uptimeMillis();
            }
            if (C6599u.f37709a == 0) {
                C6599u.f37709a = System.currentTimeMillis();
            }
            f47782a.q();
            f47782a.m();
            if (!A.i(activity.getWindow())) {
                f47782a.l(activity.getWindow());
                f47782a.g((ViewGroup) activity.findViewById(16908290));
            }
        } catch (Exception unused) {
        }
    }

    public static void c(Application application) {
        try {
            if (f47782a.s().booleanValue()) {
                f(false, application);
            }
        } catch (Exception unused) {
        }
    }

    private static void d(Application application, String str, Boolean bool) {
        Log.i("CYFMonitor", "Initializing Akamai BMP Monitor");
        if (!f47784c) {
            if (SensorDataBuilder.f47780b) {
                C6595p.c("CYFMonitor", "Load Library Failure", new Throwable[0]);
                C6580a.C0597a aVar = f47786e;
                if (aVar != null) {
                    aVar.a("Load Library Failure");
                    return;
                }
                return;
            }
            f47782a.d(0);
            long uptimeMillis = SystemClock.uptimeMillis();
            C6595p.c("CYFMonitor", "Registering activity lifecycle callbacks", new Throwable[0]);
            C6587h.a().c(application);
            f47782a.p(application);
            f47782a.n(application);
            f47782a.j(application);
            f47782a.e(application);
            application.registerActivityLifecycleCallbacks(new C6597s());
            f47784c = true;
            f47783b = true;
            f47787f = str;
            f(bool.booleanValue(), application);
            C6595p.c("CYFMonitor", "Initialize-Time: " + (SystemClock.uptimeMillis() - uptimeMillis) + "ms", new Throwable[0]);
        }
    }

    public static void e(boolean z10) {
        f47785d = z10;
    }

    private static void f(boolean z10, Application application) {
        try {
            String str = f47787f;
            if (str == null || str.length() <= 0) {
                A a10 = f47782a;
                a10.f37520n = false;
                a10.a();
                return;
            }
            int i10 = z10 ? 3 : 2;
            r.a();
            r.b(application, f47787f, i10, new C0820a(z10, application));
        } catch (Exception unused) {
        }
    }

    public static A g() {
        return f47782a;
    }

    public static synchronized String j() {
        String b10;
        synchronized (a.class) {
            b10 = f47782a.b();
        }
        return b10;
    }

    public static synchronized void k(Application application) {
        synchronized (a.class) {
            d(application, "", Boolean.FALSE);
        }
    }

    public static boolean l() {
        return f47785d;
    }

    public static void m(int i10) {
        if ((i10 < 4 || i10 > 6) && i10 != 15) {
            C6595p.e("CYFMonitor", "Invalid log level specified in setLogLevel(), ignoring.", new Throwable[0]);
        } else {
            C6595p.f37700b.f37701a = i10;
        }
    }

    public static void n(C6580a.C0597a aVar) {
        f47786e = aVar;
    }

    /* renamed from: com.cyberfend.cyfsecurity.a$a  reason: collision with other inner class name */
    static class C0820a implements r.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f47788a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Application f47789b;

        C0820a(boolean z10, Application application) {
            this.f47788a = z10;
            this.f47789b = application;
        }

        public final void a(JSONObject jSONObject) {
            String str;
            if (this.f47788a) {
                C6586g.q().h(this.f47789b, a.f47787f, jSONObject);
            }
            try {
                str = jSONObject.getString("serversidesignal");
            } catch (JSONException unused) {
                a.f47782a.d(3);
                str = null;
            }
            a.f47782a.f(this.f47789b, a.f47787f, str);
        }

        public final void a() {
            if (this.f47788a) {
                C6586g.q().h(this.f47789b, a.f47787f, (JSONObject) null);
            }
            a.f47782a.f(this.f47789b, a.f47787f, (String) null);
            a.f47782a.d(2);
        }
    }
}
