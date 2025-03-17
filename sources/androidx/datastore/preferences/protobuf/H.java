package androidx.datastore.preferences.protobuf;

final class H {

    /* renamed from: a  reason: collision with root package name */
    private static final F f21247a = c();

    /* renamed from: b  reason: collision with root package name */
    private static final F f21248b = new G();

    static F a() {
        return f21247a;
    }

    static F b() {
        return f21248b;
    }

    private static F c() {
        if (d0.f21299d) {
            return null;
        }
        try {
            return (F) Class.forName("androidx.datastore.preferences.protobuf.ListFieldSchemaFull").getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
        } catch (Exception unused) {
            return null;
        }
    }
}
