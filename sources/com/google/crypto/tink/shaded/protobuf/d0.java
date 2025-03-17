package com.google.crypto.tink.shaded.protobuf;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

final class d0 {

    /* renamed from: c  reason: collision with root package name */
    private static final d0 f67969c = new d0();

    /* renamed from: a  reason: collision with root package name */
    private final i0 f67970a = new J();

    /* renamed from: b  reason: collision with root package name */
    private final ConcurrentMap<Class<?>, h0<?>> f67971b = new ConcurrentHashMap();

    private d0() {
    }

    public static d0 a() {
        return f67969c;
    }

    public h0<?> b(Class<?> cls, h0<?> h0Var) {
        A.b(cls, "messageType");
        A.b(h0Var, "schema");
        return this.f67971b.putIfAbsent(cls, h0Var);
    }

    public <T> h0<T> c(Class<T> cls) {
        A.b(cls, "messageType");
        h0<T> h0Var = this.f67971b.get(cls);
        if (h0Var != null) {
            return h0Var;
        }
        h0<T> a10 = this.f67970a.a(cls);
        h0<?> b10 = b(cls, a10);
        return b10 != null ? b10 : a10;
    }

    public <T> h0<T> d(T t10) {
        return c(t10.getClass());
    }
}
