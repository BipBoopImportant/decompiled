package com.google.android.gms.internal.vision;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

final class N1 {

    /* renamed from: c  reason: collision with root package name */
    private static final N1 f49233c = new N1();

    /* renamed from: a  reason: collision with root package name */
    private final U1 f49234a = new C7530r1();

    /* renamed from: b  reason: collision with root package name */
    private final ConcurrentMap<Class<?>, S1<?>> f49235b = new ConcurrentHashMap();

    private N1() {
    }

    public static N1 a() {
        return f49233c;
    }

    public final <T> S1<T> b(Class<T> cls) {
        U0.f(cls, "messageType");
        S1<T> s12 = this.f49235b.get(cls);
        if (s12 != null) {
            return s12;
        }
        S1<T> zza = this.f49234a.zza(cls);
        U0.f(cls, "messageType");
        U0.f(zza, "schema");
        S1<T> putIfAbsent = this.f49235b.putIfAbsent(cls, zza);
        return putIfAbsent != null ? putIfAbsent : zza;
    }

    public final <T> S1<T> c(T t10) {
        return b(t10.getClass());
    }
}
