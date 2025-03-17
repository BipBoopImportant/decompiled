package com.google.android.gms.internal.vision;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.vision.g1  reason: case insensitive filesystem */
final class C7490g1<K> implements Map.Entry<K, Object> {

    /* renamed from: a  reason: collision with root package name */
    private Map.Entry<K, C7482e1> f49325a;

    private C7490g1(Map.Entry<K, C7482e1> entry) {
        this.f49325a = entry;
    }

    public final C7482e1 a() {
        return this.f49325a.getValue();
    }

    public final K getKey() {
        return this.f49325a.getKey();
    }

    public final Object getValue() {
        if (this.f49325a.getValue() == null) {
            return null;
        }
        return C7482e1.e();
    }

    public final Object setValue(Object obj) {
        if (obj instanceof A1) {
            return this.f49325a.getValue().a((A1) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}
