package w6;

import F6.b;
import F6.e;
import F6.f;
import F6.g;
import F6.h;
import android.content.Context;
import java.io.File;

/* renamed from: w6.e  reason: case insensitive filesystem */
public class C8923e {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f57233a = false;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f57234b = false;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f57235c = true;

    /* renamed from: d  reason: collision with root package name */
    private static boolean f57236d = true;

    /* renamed from: e  reason: collision with root package name */
    private static C8919a f57237e = C8919a.AUTOMATIC;

    /* renamed from: f  reason: collision with root package name */
    private static f f57238f;

    /* renamed from: g  reason: collision with root package name */
    private static e f57239g;

    /* renamed from: h  reason: collision with root package name */
    private static volatile h f57240h;

    /* renamed from: i  reason: collision with root package name */
    private static volatile g f57241i;

    /* renamed from: j  reason: collision with root package name */
    private static ThreadLocal<I6.f> f57242j;

    public static void b(String str) {
        if (f57234b) {
            f().a(str);
        }
    }

    public static float c(String str) {
        if (!f57234b) {
            return 0.0f;
        }
        return f().b(str);
    }

    public static C8919a d() {
        return f57237e;
    }

    public static boolean e() {
        return f57236d;
    }

    private static I6.f f() {
        I6.f fVar = f57242j.get();
        if (fVar != null) {
            return fVar;
        }
        I6.f fVar2 = new I6.f();
        f57242j.set(fVar2);
        return fVar2;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ File g(Context context) {
        return new File(context.getCacheDir(), "lottie_network_cache");
    }

    public static g h(Context context) {
        if (!f57235c) {
            return null;
        }
        Context applicationContext = context.getApplicationContext();
        g gVar = f57241i;
        if (gVar == null) {
            synchronized (g.class) {
                try {
                    gVar = f57241i;
                    if (gVar == null) {
                        e eVar = f57239g;
                        if (eVar == null) {
                            eVar = new C8922d(applicationContext);
                        }
                        gVar = new g(eVar);
                        f57241i = gVar;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return gVar;
    }

    public static h i(Context context) {
        h hVar = f57240h;
        if (hVar == null) {
            synchronized (h.class) {
                try {
                    hVar = f57240h;
                    if (hVar == null) {
                        g h10 = h(context);
                        f fVar = f57238f;
                        if (fVar == null) {
                            fVar = new b();
                        }
                        hVar = new h(h10, fVar);
                        f57240h = hVar;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return hVar;
    }
}
