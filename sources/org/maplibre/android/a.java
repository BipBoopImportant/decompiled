package org.maplibre.android;

import org.maplibre.android.log.Logger;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    private static final a f145448a;

    /* renamed from: b  reason: collision with root package name */
    private static volatile a f145449b;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f145450c;

    static {
        a a10 = MapLibre.getModuleProvider().b().a();
        f145448a = a10;
        f145449b = a10;
    }

    public static synchronized void a() {
        synchronized (a.class) {
            try {
                if (!f145450c) {
                    f145450c = true;
                    f145449b.b("maplibre");
                }
            } catch (UnsatisfiedLinkError e10) {
                f145450c = false;
                Logger.e("Mbgl-LibraryLoader", "Failed to load native shared library.", e10);
                c.c("Failed to load native shared library.", e10);
            }
        }
    }

    public abstract void b(String str);
}
