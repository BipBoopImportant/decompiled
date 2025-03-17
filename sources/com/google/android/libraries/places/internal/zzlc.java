package com.google.android.libraries.places.internal;

import java.util.Iterator;

abstract class zzlc implements Iterator {
    final Iterator zzb;

    zzlc(Iterator it) {
        it.getClass();
        this.zzb = it;
    }

    public final boolean hasNext() {
        return this.zzb.hasNext();
    }

    public final Object next() {
        return zza(this.zzb.next());
    }

    public final void remove() {
        this.zzb.remove();
    }

    /* access modifiers changed from: package-private */
    public abstract Object zza(Object obj);
}
