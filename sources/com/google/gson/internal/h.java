package com.google.gson.internal;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;
import java.util.RandomAccess;

public class h<E> extends AbstractList<E> implements RandomAccess {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList<E> f69159a;

    public h(ArrayList<E> arrayList) {
        Objects.requireNonNull(arrayList);
        this.f69159a = arrayList;
    }

    private E b(E e10) {
        if (e10 != null) {
            return e10;
        }
        throw new NullPointerException("Element must be non-null");
    }

    public void add(int i10, E e10) {
        this.f69159a.add(i10, b(e10));
    }

    public void clear() {
        this.f69159a.clear();
    }

    public boolean contains(Object obj) {
        return this.f69159a.contains(obj);
    }

    public boolean equals(Object obj) {
        return this.f69159a.equals(obj);
    }

    public E get(int i10) {
        return this.f69159a.get(i10);
    }

    public int hashCode() {
        return this.f69159a.hashCode();
    }

    public int indexOf(Object obj) {
        return this.f69159a.indexOf(obj);
    }

    public int lastIndexOf(Object obj) {
        return this.f69159a.lastIndexOf(obj);
    }

    public E remove(int i10) {
        return this.f69159a.remove(i10);
    }

    public boolean removeAll(Collection<?> collection) {
        return this.f69159a.removeAll(collection);
    }

    public boolean retainAll(Collection<?> collection) {
        return this.f69159a.retainAll(collection);
    }

    public E set(int i10, E e10) {
        return this.f69159a.set(i10, b(e10));
    }

    public int size() {
        return this.f69159a.size();
    }

    public Object[] toArray() {
        return this.f69159a.toArray();
    }

    public boolean remove(Object obj) {
        return this.f69159a.remove(obj);
    }

    public <T> T[] toArray(T[] tArr) {
        return this.f69159a.toArray(tArr);
    }
}
