package com.google.crypto.tink.shaded.protobuf;

/* renamed from: com.google.crypto.tink.shaded.protobuf.o  reason: case insensitive filesystem */
final class C9532o {

    /* renamed from: a  reason: collision with root package name */
    static final Class<?> f68071a = c();

    public static C9533p a() {
        C9533p b10 = b("getEmptyRegistry");
        return b10 != null ? b10 : C9533p.f68074d;
    }

    private static final C9533p b(String str) {
        Class<?> cls = f68071a;
        if (cls == null) {
            return null;
        }
        try {
            return (C9533p) cls.getDeclaredMethod(str, (Class[]) null).invoke((Object) null, (Object[]) null);
        } catch (Exception unused) {
            return null;
        }
    }

    static Class<?> c() {
        try {
            return Class.forName("com.google.crypto.tink.shaded.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
