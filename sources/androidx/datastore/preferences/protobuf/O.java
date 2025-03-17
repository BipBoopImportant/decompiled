package androidx.datastore.preferences.protobuf;

final class O {

    /* renamed from: a  reason: collision with root package name */
    private static final M f21265a = c();

    /* renamed from: b  reason: collision with root package name */
    private static final M f21266b = new N();

    static M a() {
        return f21265a;
    }

    static M b() {
        return f21266b;
    }

    private static M c() {
        if (d0.f21299d) {
            return null;
        }
        try {
            return (M) Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
        } catch (Exception unused) {
            return null;
        }
    }
}
