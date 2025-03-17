package com.google.protobuf;

/* renamed from: com.google.protobuf.o  reason: case insensitive filesystem */
final class C9582o {

    /* renamed from: a  reason: collision with root package name */
    static final Class<?> f69362a = c();

    public static C9583p a() {
        C9583p b10 = b("getEmptyRegistry");
        return b10 != null ? b10 : C9583p.f69365d;
    }

    private static final C9583p b(String str) {
        Class<?> cls = f69362a;
        if (cls == null) {
            return null;
        }
        try {
            return (C9583p) cls.getDeclaredMethod(str, (Class[]) null).invoke((Object) null, (Object[]) null);
        } catch (Exception unused) {
            return null;
        }
    }

    static Class<?> c() {
        try {
            return Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
