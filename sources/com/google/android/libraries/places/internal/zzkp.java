package com.google.android.libraries.places.internal;

import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

final class zzkp extends AbstractSequentialList implements Serializable {
    final List zza;
    final zzdl zzb;

    zzkp(List list, zzdl zzdl) {
        list.getClass();
        this.zza = list;
        this.zzb = zzdl;
    }

    public final void clear() {
        this.zza.clear();
    }

    public final ListIterator listIterator(int i10) {
        return new zzko(this, this.zza.listIterator(i10));
    }

    public final int size() {
        return this.zza.size();
    }
}
