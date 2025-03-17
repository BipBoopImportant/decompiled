package com.google.android.gms.internal.clearcut;

final class J0 {

    /* renamed from: a  reason: collision with root package name */
    private static final H0 f48199a = c();

    /* renamed from: b  reason: collision with root package name */
    private static final H0 f48200b = new I0();

    static H0 a() {
        return f48199a;
    }

    static H0 b() {
        return f48200b;
    }

    private static H0 c() {
        try {
            return (H0) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
        } catch (Exception unused) {
            return null;
        }
    }
}
