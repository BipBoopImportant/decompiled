package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.d  reason: case insensitive filesystem */
final class C5151d {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f21295a;

    /* renamed from: b  reason: collision with root package name */
    private static final Class<?> f21296b = a("libcore.io.Memory");

    /* renamed from: c  reason: collision with root package name */
    private static final boolean f21297c = (!f21295a && a("org.robolectric.Robolectric") != null);

    private static <T> Class<T> a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    static Class<?> b() {
        return f21296b;
    }

    static boolean c() {
        return f21295a || (f21296b != null && !f21297c);
    }
}
