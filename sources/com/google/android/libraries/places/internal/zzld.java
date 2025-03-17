package com.google.android.libraries.places.internal;

import java.util.ListIterator;

abstract class zzld extends zzlc implements ListIterator {
    zzld(ListIterator listIterator) {
        super(listIterator);
    }

    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.Iterator, java.util.ListIterator] */
    public final boolean hasPrevious() {
        return this.zzb.hasPrevious();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.Iterator, java.util.ListIterator] */
    public final int nextIndex() {
        return this.zzb.nextIndex();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.Iterator, java.util.ListIterator] */
    public final Object previous() {
        return zza(this.zzb.previous());
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.Iterator, java.util.ListIterator] */
    public final int previousIndex() {
        return this.zzb.previousIndex();
    }

    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
