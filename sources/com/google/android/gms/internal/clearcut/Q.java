package com.google.android.gms.internal.clearcut;

final class Q {

    /* renamed from: a  reason: collision with root package name */
    private static final Class<?> f48231a = a();

    private static Class<?> a() {
        try {
            return Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static S b() {
        Class<?> cls = f48231a;
        if (cls != null) {
            try {
                return (S) cls.getDeclaredMethod("getEmptyRegistry", (Class[]) null).invoke((Object) null, (Object[]) null);
            } catch (Exception unused) {
            }
        }
        return S.f48259c;
    }
}
