package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.n  reason: case insensitive filesystem */
final class C5161n {

    /* renamed from: a  reason: collision with root package name */
    static final Class<?> f21397a = c();

    public static C5162o a() {
        C5162o b10 = b("getEmptyRegistry");
        return b10 != null ? b10 : C5162o.f21400c;
    }

    private static final C5162o b(String str) {
        Class<?> cls = f21397a;
        if (cls == null) {
            return null;
        }
        try {
            return (C5162o) cls.getDeclaredMethod(str, (Class[]) null).invoke((Object) null, (Object[]) null);
        } catch (Exception unused) {
            return null;
        }
    }

    static Class<?> c() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
