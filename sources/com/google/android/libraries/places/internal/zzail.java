package com.google.android.libraries.places.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;

final class zzail implements Iterator {
    zzail() {
    }

    public final boolean hasNext() {
        return false;
    }

    public final Object next() {
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
