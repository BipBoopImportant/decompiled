package com.google.crypto.tink.shaded.protobuf;

final class O {

    /* renamed from: a  reason: collision with root package name */
    private static final M f67936a = c();

    /* renamed from: b  reason: collision with root package name */
    private static final M f67937b = new N();

    static M a() {
        return f67936a;
    }

    static M b() {
        return f67937b;
    }

    private static M c() {
        try {
            return (M) Class.forName("com.google.crypto.tink.shaded.protobuf.MapFieldSchemaFull").getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
        } catch (Exception unused) {
            return null;
        }
    }
}
