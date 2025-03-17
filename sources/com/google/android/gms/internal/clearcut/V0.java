package com.google.android.gms.internal.clearcut;

final class V0 {

    /* renamed from: a  reason: collision with root package name */
    private static final T0 f48268a = c();

    /* renamed from: b  reason: collision with root package name */
    private static final T0 f48269b = new U0();

    static T0 a() {
        return f48268a;
    }

    static T0 b() {
        return f48269b;
    }

    private static T0 c() {
        try {
            return (T0) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
        } catch (Exception unused) {
            return null;
        }
    }
}
