package com.google.android.gms.internal.clearcut;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class S {

    /* renamed from: b  reason: collision with root package name */
    private static final Class<?> f48258b = a();

    /* renamed from: c  reason: collision with root package name */
    static final S f48259c = new S(true);

    /* renamed from: a  reason: collision with root package name */
    private final Map<Object, Object> f48260a;

    S() {
        this.f48260a = new HashMap();
    }

    private static Class<?> a() {
        try {
            return Class.forName("com.google.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static S b() {
        return Q.b();
    }

    private S(boolean z10) {
        this.f48260a = Collections.emptyMap();
    }
}
