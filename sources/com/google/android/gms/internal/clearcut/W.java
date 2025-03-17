package com.google.android.gms.internal.clearcut;

final class W {

    /* renamed from: a  reason: collision with root package name */
    private static final T<?> f48272a = new U();

    /* renamed from: b  reason: collision with root package name */
    private static final T<?> f48273b = a();

    private static T<?> a() {
        try {
            return (T) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
        } catch (Exception unused) {
            return null;
        }
    }

    static T<?> b() {
        return f48272a;
    }

    static T<?> c() {
        T<?> t10 = f48273b;
        if (t10 != null) {
            return t10;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
}
