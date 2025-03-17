package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

final class X4<K> implements Iterator<Map.Entry<K, Object>> {

    /* renamed from: a  reason: collision with root package name */
    private Iterator<Map.Entry<K, Object>> f48825a;

    public X4(Iterator<Map.Entry<K, Object>> it) {
        this.f48825a = it;
    }

    public final boolean hasNext() {
        return this.f48825a.hasNext();
    }

    public final /* synthetic */ Object next() {
        Map.Entry next = this.f48825a.next();
        return next.getValue() instanceof V4 ? new Y4(next) : next;
    }

    public final void remove() {
        this.f48825a.remove();
    }
}
