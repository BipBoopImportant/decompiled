package com.google.android.gms.measurement.internal;

import java.util.Iterator;

final class I implements Iterator<String> {

    /* renamed from: a  reason: collision with root package name */
    private Iterator<String> f49656a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ F f49657b;

    I(F f10) {
        this.f49657b = f10;
        this.f49656a = f10.f49622a.keySet().iterator();
    }

    public final boolean hasNext() {
        return this.f49656a.hasNext();
    }

    public final /* synthetic */ Object next() {
        return this.f49656a.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
