package com.google.android.gms.internal.vision;

/* renamed from: com.google.android.gms.internal.vision.z1  reason: case insensitive filesystem */
final class C7554z1 {

    /* renamed from: a  reason: collision with root package name */
    private static final C7548x1 f49422a = c();

    /* renamed from: b  reason: collision with root package name */
    private static final C7548x1 f49423b = new C7545w1();

    static C7548x1 a() {
        return f49422a;
    }

    static C7548x1 b() {
        return f49423b;
    }

    private static C7548x1 c() {
        try {
            return (C7548x1) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
        } catch (Exception unused) {
            return null;
        }
    }
}
