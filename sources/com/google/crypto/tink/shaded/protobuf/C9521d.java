package com.google.crypto.tink.shaded.protobuf;

/* renamed from: com.google.crypto.tink.shaded.protobuf.d  reason: case insensitive filesystem */
final class C9521d {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f67966a;

    /* renamed from: b  reason: collision with root package name */
    private static final Class<?> f67967b = a("libcore.io.Memory");

    /* renamed from: c  reason: collision with root package name */
    private static final boolean f67968c = (!f67966a && a("org.robolectric.Robolectric") != null);

    private static <T> Class<T> a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    static Class<?> b() {
        return f67967b;
    }

    static boolean c() {
        return f67966a || (f67967b != null && !f67968c);
    }
}
