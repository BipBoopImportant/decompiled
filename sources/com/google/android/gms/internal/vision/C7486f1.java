package com.google.android.gms.internal.vision;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.vision.f1  reason: case insensitive filesystem */
final class C7486f1<K> implements Iterator<Map.Entry<K, Object>> {

    /* renamed from: a  reason: collision with root package name */
    private Iterator<Map.Entry<K, Object>> f49320a;

    public C7486f1(Iterator<Map.Entry<K, Object>> it) {
        this.f49320a = it;
    }

    public final boolean hasNext() {
        return this.f49320a.hasNext();
    }

    public final /* synthetic */ Object next() {
        Map.Entry next = this.f49320a.next();
        return next.getValue() instanceof C7482e1 ? new C7490g1(next) : next;
    }

    public final void remove() {
        this.f49320a.remove();
    }
}
