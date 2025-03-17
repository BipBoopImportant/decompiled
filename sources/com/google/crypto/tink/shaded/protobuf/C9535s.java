package com.google.crypto.tink.shaded.protobuf;

/* renamed from: com.google.crypto.tink.shaded.protobuf.s  reason: case insensitive filesystem */
final class C9535s {

    /* renamed from: a  reason: collision with root package name */
    private static final C9534q<?> f68091a = new r();

    /* renamed from: b  reason: collision with root package name */
    private static final C9534q<?> f68092b = c();

    static C9534q<?> a() {
        C9534q<?> qVar = f68092b;
        if (qVar != null) {
            return qVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    static C9534q<?> b() {
        return f68091a;
    }

    private static C9534q<?> c() {
        try {
            return (C9534q) Class.forName("com.google.crypto.tink.shaded.protobuf.ExtensionSchemaFull").getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
        } catch (Exception unused) {
            return null;
        }
    }
}
