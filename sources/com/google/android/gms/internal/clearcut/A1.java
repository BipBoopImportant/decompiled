package com.google.android.gms.internal.clearcut;

import java.util.ListIterator;

final class A1 implements ListIterator<String> {

    /* renamed from: a  reason: collision with root package name */
    private ListIterator<String> f48139a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ int f48140b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ C7243z1 f48141c;

    A1(C7243z1 z1Var, int i10) {
        this.f48141c = z1Var;
        this.f48140b = i10;
        this.f48139a = z1Var.f48527a.listIterator(i10);
    }

    public final /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean hasNext() {
        return this.f48139a.hasNext();
    }

    public final boolean hasPrevious() {
        return this.f48139a.hasPrevious();
    }

    public final /* synthetic */ Object next() {
        return this.f48139a.next();
    }

    public final int nextIndex() {
        return this.f48139a.nextIndex();
    }

    public final /* synthetic */ Object previous() {
        return this.f48139a.previous();
    }

    public final int previousIndex() {
        return this.f48139a.previousIndex();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
