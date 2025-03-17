package com.google.android.gms.internal.clearcut;

/* renamed from: com.google.android.gms.internal.clearcut.u  reason: case insensitive filesystem */
final class C7226u {

    /* renamed from: a  reason: collision with root package name */
    private static final Class<?> f48487a = a("libcore.io.Memory");

    /* renamed from: b  reason: collision with root package name */
    private static final boolean f48488b = (a("org.robolectric.Robolectric") != null);

    private static <T> Class<T> a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    static boolean b() {
        return f48487a != null && !f48488b;
    }

    static Class<?> c() {
        return f48487a;
    }
}
