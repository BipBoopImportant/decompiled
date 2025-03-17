package com.google.protobuf;

final class O {

    /* renamed from: a  reason: collision with root package name */
    private static final M f69234a = c();

    /* renamed from: b  reason: collision with root package name */
    private static final M f69235b = new N();

    static M a() {
        return f69234a;
    }

    static M b() {
        return f69235b;
    }

    private static M c() {
        try {
            return (M) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
        } catch (Exception unused) {
            return null;
        }
    }
}
