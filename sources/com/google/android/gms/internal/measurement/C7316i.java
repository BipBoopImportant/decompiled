package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.measurement.i  reason: case insensitive filesystem */
final class C7316i implements Iterator<C7400s> {

    /* renamed from: a  reason: collision with root package name */
    private int f48941a = 0;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C7298g f48942b;

    C7316i(C7298g gVar) {
        this.f48942b = gVar;
    }

    public final boolean hasNext() {
        return this.f48941a < this.f48942b.s();
    }

    public final /* synthetic */ Object next() {
        if (this.f48941a < this.f48942b.s()) {
            C7298g gVar = this.f48942b;
            int i10 = this.f48941a;
            this.f48941a = i10 + 1;
            return gVar.p(i10);
        }
        int i11 = this.f48941a;
        throw new NoSuchElementException("Out of bounds index: " + i11);
    }
}
