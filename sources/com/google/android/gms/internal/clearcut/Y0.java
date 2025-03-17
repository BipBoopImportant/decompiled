package com.google.android.gms.internal.clearcut;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

final class Y0 {

    /* renamed from: c  reason: collision with root package name */
    private static final Y0 f48284c = new Y0();

    /* renamed from: a  reason: collision with root package name */
    private final C7181e1 f48285a;

    /* renamed from: b  reason: collision with root package name */
    private final ConcurrentMap<Class<?>, C7178d1<?>> f48286b = new ConcurrentHashMap();

    private Y0() {
        String[] strArr = {"com.google.protobuf.AndroidProto3SchemaFactory"};
        C7181e1 e1Var = null;
        for (int i10 = 0; i10 <= 0; i10++) {
            e1Var = c(strArr[0]);
            if (e1Var != null) {
                break;
            }
        }
        this.f48285a = e1Var == null ? new B0() : e1Var;
    }

    public static Y0 a() {
        return f48284c;
    }

    private static C7181e1 c(String str) {
        try {
            return (C7181e1) Class.forName(str).getConstructor((Class[]) null).newInstance((Object[]) null);
        } catch (Throwable unused) {
            return null;
        }
    }

    public final <T> C7178d1<T> b(Class<T> cls) {
        C7192i0.e(cls, "messageType");
        C7178d1<T> d1Var = this.f48286b.get(cls);
        if (d1Var != null) {
            return d1Var;
        }
        C7178d1<T> a10 = this.f48285a.a(cls);
        C7192i0.e(cls, "messageType");
        C7192i0.e(a10, "schema");
        C7178d1<T> putIfAbsent = this.f48286b.putIfAbsent(cls, a10);
        return putIfAbsent != null ? putIfAbsent : a10;
    }

    public final <T> C7178d1<T> d(T t10) {
        return b(t10.getClass());
    }
}
