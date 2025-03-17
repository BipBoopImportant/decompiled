package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.measurement.x  reason: case insensitive filesystem */
final class C7440x implements Iterator<C7400s> {

    /* renamed from: a  reason: collision with root package name */
    private int f49134a = 0;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C7416u f49135b;

    C7440x(C7416u uVar) {
        this.f49135b = uVar;
    }

    public final boolean hasNext() {
        return this.f49134a < this.f49135b.f49084a.length();
    }

    public final /* synthetic */ Object next() {
        if (this.f49134a < this.f49135b.f49084a.length()) {
            int i10 = this.f49134a;
            this.f49134a = i10 + 1;
            return new C7416u(String.valueOf(i10));
        }
        throw new NoSuchElementException();
    }
}
