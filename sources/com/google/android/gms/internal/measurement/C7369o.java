package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.measurement.o  reason: case insensitive filesystem */
final class C7369o implements Iterator<C7400s> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Iterator f49025a;

    C7369o(Iterator it) {
        this.f49025a = it;
    }

    public final boolean hasNext() {
        return this.f49025a.hasNext();
    }

    public final /* synthetic */ Object next() {
        return new C7416u((String) this.f49025a.next());
    }
}
