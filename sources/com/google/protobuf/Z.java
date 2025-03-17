package com.google.protobuf;

final class Z {

    /* renamed from: a  reason: collision with root package name */
    private static final X f69261a = c();

    /* renamed from: b  reason: collision with root package name */
    private static final X f69262b = new Y();

    static X a() {
        return f69261a;
    }

    static X b() {
        return f69262b;
    }

    private static X c() {
        try {
            return (X) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
        } catch (Exception unused) {
            return null;
        }
    }
}
