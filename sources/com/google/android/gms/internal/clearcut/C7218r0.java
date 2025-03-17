package com.google.android.gms.internal.clearcut;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.clearcut.r0  reason: case insensitive filesystem */
final class C7218r0<K> implements Map.Entry<K, Object> {

    /* renamed from: a  reason: collision with root package name */
    private Map.Entry<K, C7213p0> f48478a;

    private C7218r0(Map.Entry<K, C7213p0> entry) {
        this.f48478a = entry;
    }

    public final C7213p0 a() {
        return this.f48478a.getValue();
    }

    public final K getKey() {
        return this.f48478a.getKey();
    }

    public final Object getValue() {
        if (this.f48478a.getValue() == null) {
            return null;
        }
        return C7213p0.e();
    }

    public final Object setValue(Object obj) {
        if (obj instanceof M0) {
            return this.f48478a.getValue().c((M0) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}
