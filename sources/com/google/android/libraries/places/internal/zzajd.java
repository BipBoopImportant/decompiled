package com.google.android.libraries.places.internal;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

@Deprecated
public final class zzajd extends AbstractList implements RandomAccess, zzahe {
    /* access modifiers changed from: private */
    public final zzahe zza;

    public zzajd(zzahe zzahe) {
        this.zza = zzahe;
    }

    public final /* bridge */ /* synthetic */ Object get(int i10) {
        return ((zzahd) this.zza).get(i10);
    }

    public final Iterator iterator() {
        return new zzajc(this);
    }

    public final ListIterator listIterator(int i10) {
        return new zzajb(this, i10);
    }

    public final int size() {
        return this.zza.size();
    }

    public final zzahe zzd() {
        return this;
    }

    public final Object zze(int i10) {
        return this.zza.zze(i10);
    }

    public final List zzh() {
        return this.zza.zzh();
    }
}
