package com.google.android.gms.internal.vision;

final class F0 {

    /* renamed from: a  reason: collision with root package name */
    private static final E0<?> f49194a = new D0();

    /* renamed from: b  reason: collision with root package name */
    private static final E0<?> f49195b = c();

    static E0<?> a() {
        return f49194a;
    }

    static E0<?> b() {
        E0<?> e02 = f49195b;
        if (e02 != null) {
            return e02;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    private static E0<?> c() {
        try {
            return (E0) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
        } catch (Exception unused) {
            return null;
        }
    }
}
