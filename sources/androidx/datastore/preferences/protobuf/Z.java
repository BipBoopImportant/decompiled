package androidx.datastore.preferences.protobuf;

final class Z {

    /* renamed from: a  reason: collision with root package name */
    private static final X f21291a = c();

    /* renamed from: b  reason: collision with root package name */
    private static final X f21292b = new Y();

    static X a() {
        return f21291a;
    }

    static X b() {
        return f21292b;
    }

    private static X c() {
        if (d0.f21299d) {
            return null;
        }
        try {
            return (X) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
        } catch (Exception unused) {
            return null;
        }
    }
}
