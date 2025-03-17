package com.google.protobuf;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

final class d0 {

    /* renamed from: c  reason: collision with root package name */
    private static final d0 f69268c = new d0();

    /* renamed from: a  reason: collision with root package name */
    private final i0 f69269a = new J();

    /* renamed from: b  reason: collision with root package name */
    private final ConcurrentMap<Class<?>, h0<?>> f69270b = new ConcurrentHashMap();

    private d0() {
    }

    public static d0 a() {
        return f69268c;
    }

    public h0<?> b(Class<?> cls, h0<?> h0Var) {
        C9592z.b(cls, "messageType");
        C9592z.b(h0Var, "schema");
        return this.f69270b.putIfAbsent(cls, h0Var);
    }

    public <T> h0<T> c(Class<T> cls) {
        C9592z.b(cls, "messageType");
        h0<T> h0Var = this.f69270b.get(cls);
        if (h0Var != null) {
            return h0Var;
        }
        h0<T> a10 = this.f69269a.a(cls);
        h0<?> b10 = b(cls, a10);
        return b10 != null ? b10 : a10;
    }

    public <T> h0<T> d(T t10) {
        return c(t10.getClass());
    }
}
