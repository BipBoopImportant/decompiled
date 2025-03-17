package com.google.android.gms.internal.clearcut;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.clearcut.t  reason: case insensitive filesystem */
abstract class C7223t<E> extends AbstractList<E> implements C7201l0<E> {

    /* renamed from: a  reason: collision with root package name */
    private boolean f48482a = true;

    C7223t() {
    }

    public boolean N() {
        return this.f48482a;
    }

    public boolean add(E e10) {
        b();
        return super.add(e10);
    }

    public boolean addAll(int i10, Collection<? extends E> collection) {
        b();
        return super.addAll(i10, collection);
    }

    /* access modifiers changed from: protected */
    public final void b() {
        if (!this.f48482a) {
            throw new UnsupportedOperationException();
        }
    }

    public void clear() {
        b();
        super.clear();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int i10 = 0; i10 < size; i10++) {
            if (!get(i10).equals(list.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int size = size();
        int i10 = 1;
        for (int i11 = 0; i11 < size; i11++) {
            i10 = (i10 * 31) + get(i11).hashCode();
        }
        return i10;
    }

    public boolean remove(Object obj) {
        b();
        return super.remove(obj);
    }

    public boolean removeAll(Collection<?> collection) {
        b();
        return super.removeAll(collection);
    }

    public boolean retainAll(Collection<?> collection) {
        b();
        return super.retainAll(collection);
    }

    public final void zzv() {
        this.f48482a = false;
    }

    public boolean addAll(Collection<? extends E> collection) {
        b();
        return super.addAll(collection);
    }
}
