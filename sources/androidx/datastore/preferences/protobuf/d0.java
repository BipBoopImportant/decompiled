package androidx.datastore.preferences.protobuf;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

final class d0 {

    /* renamed from: c  reason: collision with root package name */
    private static final d0 f21298c = new d0();

    /* renamed from: d  reason: collision with root package name */
    static boolean f21299d = false;

    /* renamed from: a  reason: collision with root package name */
    private final i0 f21300a = new J();

    /* renamed from: b  reason: collision with root package name */
    private final ConcurrentMap<Class<?>, h0<?>> f21301b = new ConcurrentHashMap();

    private d0() {
    }

    public static d0 a() {
        return f21298c;
    }

    public h0<?> b(Class<?> cls, h0<?> h0Var) {
        C5172z.b(cls, "messageType");
        C5172z.b(h0Var, "schema");
        return this.f21301b.putIfAbsent(cls, h0Var);
    }

    public <T> h0<T> c(Class<T> cls) {
        C5172z.b(cls, "messageType");
        h0<T> h0Var = this.f21301b.get(cls);
        if (h0Var != null) {
            return h0Var;
        }
        h0<T> a10 = this.f21300a.a(cls);
        h0<?> b10 = b(cls, a10);
        return b10 != null ? b10 : a10;
    }

    public <T> h0<T> d(T t10) {
        return c(t10.getClass());
    }
}
