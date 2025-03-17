package com.google.android.gms.internal.clearcut;

import java.util.Iterator;
import java.util.NoSuchElementException;

final class B implements Iterator {

    /* renamed from: a  reason: collision with root package name */
    private int f48155a = 0;

    /* renamed from: b  reason: collision with root package name */
    private final int f48156b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ A f48157c;

    B(A a10) {
        this.f48157c = a10;
        this.f48156b = a10.size();
    }

    private final byte b() {
        try {
            A a10 = this.f48157c;
            int i10 = this.f48155a;
            this.f48155a = i10 + 1;
            return a10.t(i10);
        } catch (IndexOutOfBoundsException e10) {
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    public final boolean hasNext() {
        return this.f48155a < this.f48156b;
    }

    public final /* synthetic */ Object next() {
        return Byte.valueOf(b());
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
