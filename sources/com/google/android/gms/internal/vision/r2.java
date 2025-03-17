package com.google.android.gms.internal.vision;

import java.util.Iterator;

final class r2 implements Iterator<String> {

    /* renamed from: a  reason: collision with root package name */
    private Iterator<String> f49396a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ o2 f49397b;

    r2(o2 o2Var) {
        this.f49397b = o2Var;
        this.f49396a = o2Var.f49362a.iterator();
    }

    public final boolean hasNext() {
        return this.f49396a.hasNext();
    }

    public final /* synthetic */ Object next() {
        return this.f49396a.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
