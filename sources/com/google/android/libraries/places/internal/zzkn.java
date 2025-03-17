package com.google.android.libraries.places.internal;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

final class zzkn extends AbstractList implements RandomAccess, Serializable {
    final List zza;
    final zzdl zzb;

    zzkn(List list, zzdl zzdl) {
        list.getClass();
        this.zza = list;
        this.zzb = zzdl;
    }

    public final void clear() {
        this.zza.clear();
    }

    public final Object get(int i10) {
        return ((zzdm) this.zza.get(i10)).toString();
    }

    public final boolean isEmpty() {
        return this.zza.isEmpty();
    }

    public final Iterator iterator() {
        return listIterator();
    }

    public final ListIterator listIterator(int i10) {
        return new zzkm(this, this.zza.listIterator(i10));
    }

    public final Object remove(int i10) {
        return ((zzdm) this.zza.remove(i10)).toString();
    }

    public final int size() {
        return this.zza.size();
    }
}
