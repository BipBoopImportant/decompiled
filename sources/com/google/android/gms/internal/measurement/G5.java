package com.google.android.gms.internal.measurement;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

final class G5 {

    /* renamed from: c  reason: collision with root package name */
    private static final G5 f48665c = new G5();

    /* renamed from: a  reason: collision with root package name */
    private final M5 f48666a = new C7304g5();

    /* renamed from: b  reason: collision with root package name */
    private final ConcurrentMap<Class<?>, K5<?>> f48667b = new ConcurrentHashMap();

    private G5() {
    }

    public static G5 a() {
        return f48665c;
    }

    public final <T> K5<T> b(Class<T> cls) {
        O4.f(cls, "messageType");
        K5<T> k52 = this.f48667b.get(cls);
        if (k52 != null) {
            return k52;
        }
        K5<T> zza = this.f48666a.zza(cls);
        O4.f(cls, "messageType");
        O4.f(zza, "schema");
        K5<T> putIfAbsent = this.f48667b.putIfAbsent(cls, zza);
        return putIfAbsent != null ? putIfAbsent : zza;
    }

    public final <T> K5<T> c(T t10) {
        return b(t10.getClass());
    }
}
