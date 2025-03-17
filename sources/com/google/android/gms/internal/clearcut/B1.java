package com.google.android.gms.internal.clearcut;

import java.util.Iterator;

final class B1 implements Iterator<String> {

    /* renamed from: a  reason: collision with root package name */
    private Iterator<String> f48160a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C7243z1 f48161b;

    B1(C7243z1 z1Var) {
        this.f48161b = z1Var;
        this.f48160a = z1Var.f48527a.iterator();
    }

    public final boolean hasNext() {
        return this.f48160a.hasNext();
    }

    public final /* synthetic */ Object next() {
        return this.f48160a.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
