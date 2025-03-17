package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.measurement.f  reason: case insensitive filesystem */
final class C7289f implements Iterator<C7400s> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ Iterator f48919a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Iterator f48920b;

    C7289f(C7298g gVar, Iterator it, Iterator it2) {
        this.f48919a = it;
        this.f48920b = it2;
    }

    public final boolean hasNext() {
        if (this.f48919a.hasNext()) {
            return true;
        }
        return this.f48920b.hasNext();
    }

    public final /* synthetic */ Object next() {
        if (this.f48919a.hasNext()) {
            return new C7416u(((Integer) this.f48919a.next()).toString());
        }
        if (this.f48920b.hasNext()) {
            return new C7416u((String) this.f48920b.next());
        }
        throw new NoSuchElementException();
    }
}
