package com.google.android.gms.internal.vision;

final class J1 {

    /* renamed from: a  reason: collision with root package name */
    private static final H1 f49212a = c();

    /* renamed from: b  reason: collision with root package name */
    private static final H1 f49213b = new K1();

    static H1 a() {
        return f49212a;
    }

    static H1 b() {
        return f49213b;
    }

    private static H1 c() {
        try {
            return (H1) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
        } catch (Exception unused) {
            return null;
        }
    }
}
