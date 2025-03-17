package com.google.android.libraries.places.internal;

import java.util.Iterator;

public abstract class zzle implements Iterator {
    protected zzle() {
    }

    @Deprecated
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
