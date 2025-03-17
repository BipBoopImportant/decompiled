package androidx.datastore.preferences.protobuf;

final class r {

    /* renamed from: a  reason: collision with root package name */
    private static final C5163p<?> f21412a = new C5164q();

    /* renamed from: b  reason: collision with root package name */
    private static final C5163p<?> f21413b = c();

    static C5163p<?> a() {
        C5163p<?> pVar = f21413b;
        if (pVar != null) {
            return pVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    static C5163p<?> b() {
        return f21412a;
    }

    private static C5163p<?> c() {
        if (d0.f21299d) {
            return null;
        }
        try {
            return (C5163p) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
        } catch (Exception unused) {
            return null;
        }
    }
}
