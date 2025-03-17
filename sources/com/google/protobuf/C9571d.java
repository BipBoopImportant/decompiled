package com.google.protobuf;

/* renamed from: com.google.protobuf.d  reason: case insensitive filesystem */
final class C9571d {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f69265a;

    /* renamed from: b  reason: collision with root package name */
    private static final Class<?> f69266b = a("libcore.io.Memory");

    /* renamed from: c  reason: collision with root package name */
    private static final boolean f69267c = (!f69265a && a("org.robolectric.Robolectric") != null);

    private static <T> Class<T> a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    static Class<?> b() {
        return f69266b;
    }

    static boolean c() {
        return f69265a || (f69266b != null && !f69267c);
    }
}
