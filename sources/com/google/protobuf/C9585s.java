package com.google.protobuf;

/* renamed from: com.google.protobuf.s  reason: case insensitive filesystem */
final class C9585s {

    /* renamed from: a  reason: collision with root package name */
    private static final C9584q<?> f69382a = new r();

    /* renamed from: b  reason: collision with root package name */
    private static final C9584q<?> f69383b = c();

    static C9584q<?> a() {
        C9584q<?> qVar = f69383b;
        if (qVar != null) {
            return qVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    static C9584q<?> b() {
        return f69382a;
    }

    private static C9584q<?> c() {
        try {
            return (C9584q) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
        } catch (Exception unused) {
            return null;
        }
    }
}
