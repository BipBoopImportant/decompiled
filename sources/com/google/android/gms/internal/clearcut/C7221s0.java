package com.google.android.gms.internal.clearcut;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.clearcut.s0  reason: case insensitive filesystem */
final class C7221s0<K> implements Iterator<Map.Entry<K, Object>> {

    /* renamed from: a  reason: collision with root package name */
    private Iterator<Map.Entry<K, Object>> f48480a;

    public C7221s0(Iterator<Map.Entry<K, Object>> it) {
        this.f48480a = it;
    }

    public final boolean hasNext() {
        return this.f48480a.hasNext();
    }

    public final /* synthetic */ Object next() {
        Map.Entry next = this.f48480a.next();
        return next.getValue() instanceof C7213p0 ? new C7218r0(next) : next;
    }

    public final void remove() {
        this.f48480a.remove();
    }
}
