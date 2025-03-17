package com.google.android.gms.internal.vision;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.vision.d2  reason: case insensitive filesystem */
class C7479d2 extends AbstractSet {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ W1 f49308a;

    private C7479d2(W1 w12) {
        this.f49308a = w12;
    }

    public /* synthetic */ boolean add(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (contains(entry)) {
            return false;
        }
        this.f49308a.put((Comparable) entry.getKey(), entry.getValue());
        return true;
    }

    public void clear() {
        this.f49308a.clear();
    }

    public boolean contains(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.f49308a.get(entry.getKey());
        Object value = entry.getValue();
        if (obj2 != value) {
            return obj2 != null && obj2.equals(value);
        }
        return true;
    }

    public Iterator iterator() {
        return new C7483e2(this.f49308a, (V1) null);
    }

    public boolean remove(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (!contains(entry)) {
            return false;
        }
        this.f49308a.remove(entry.getKey());
        return true;
    }

    public int size() {
        return this.f49308a.size();
    }

    /* synthetic */ C7479d2(W1 w12, V1 v12) {
        this(w12);
    }
}
