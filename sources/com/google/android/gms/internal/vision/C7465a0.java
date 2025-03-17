package com.google.android.gms.internal.vision;

/* renamed from: com.google.android.gms.internal.vision.a0  reason: case insensitive filesystem */
final class C7465a0 {

    /* renamed from: a  reason: collision with root package name */
    private static final Class<?> f49296a = a("libcore.io.Memory");

    /* renamed from: b  reason: collision with root package name */
    private static final boolean f49297b = (a("org.robolectric.Robolectric") != null);

    private static <T> Class<T> a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    static boolean b() {
        return f49296a != null && !f49297b;
    }

    static Class<?> c() {
        return f49296a;
    }
}
