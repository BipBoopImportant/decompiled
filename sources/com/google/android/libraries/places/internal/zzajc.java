package com.google.android.libraries.places.internal;

import java.util.Iterator;

final class zzajc implements Iterator {
    final Iterator zza;
    final /* synthetic */ zzajd zzb;

    zzajc(zzajd zzajd) {
        this.zzb = zzajd;
        this.zza = zzajd.zza.iterator();
    }

    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.zza.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
