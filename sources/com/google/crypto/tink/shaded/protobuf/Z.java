package com.google.crypto.tink.shaded.protobuf;

final class Z {

    /* renamed from: a  reason: collision with root package name */
    private static final X f67962a = c();

    /* renamed from: b  reason: collision with root package name */
    private static final X f67963b = new Y();

    static X a() {
        return f67962a;
    }

    static X b() {
        return f67963b;
    }

    private static X c() {
        try {
            return (X) Class.forName("com.google.crypto.tink.shaded.protobuf.NewInstanceSchemaFull").getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
        } catch (Exception unused) {
            return null;
        }
    }
}
