package com.google.android.gms.internal.clearcut;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.clearcut.p1  reason: case insensitive filesystem */
class C7214p1 extends AbstractSet {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C7187g1 f48476a;

    private C7214p1(C7187g1 g1Var) {
        this.f48476a = g1Var;
    }

    public /* synthetic */ boolean add(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (contains(entry)) {
            return false;
        }
        this.f48476a.put((Comparable) entry.getKey(), entry.getValue());
        return true;
    }

    public void clear() {
        this.f48476a.clear();
    }

    public boolean contains(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.f48476a.get(entry.getKey());
        Object value = entry.getValue();
        if (obj2 != value) {
            return obj2 != null && obj2.equals(value);
        }
        return true;
    }

    public Iterator iterator() {
        return new C7211o1(this.f48476a, (C7190h1) null);
    }

    public boolean remove(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (!contains(entry)) {
            return false;
        }
        this.f48476a.remove(entry.getKey());
        return true;
    }

    public int size() {
        return this.f48476a.size();
    }

    /* synthetic */ C7214p1(C7187g1 g1Var, C7190h1 h1Var) {
        this(g1Var);
    }
}
