package com.google.android.gms.internal.measurement;

import java.util.Map;

final class Y4<K> implements Map.Entry<K, Object> {

    /* renamed from: a  reason: collision with root package name */
    private Map.Entry<K, V4> f48834a;

    public final V4 a() {
        return this.f48834a.getValue();
    }

    public final K getKey() {
        return this.f48834a.getKey();
    }

    public final Object getValue() {
        if (this.f48834a.getValue() == null) {
            return null;
        }
        throw new NoSuchMethodError();
    }

    public final Object setValue(Object obj) {
        if (obj instanceof C7406s5) {
            return this.f48834a.getValue().b((C7406s5) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }

    private Y4(Map.Entry<K, V4> entry) {
        this.f48834a = entry;
    }
}
