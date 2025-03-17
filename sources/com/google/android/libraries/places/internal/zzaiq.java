package com.google.android.libraries.places.internal;

import java.util.Iterator;
import java.util.Map;

final class zzaiq implements Iterator {
    final /* synthetic */ zzaiu zza;
    private int zzb = -1;
    private boolean zzc;
    private Iterator zzd;

    /* synthetic */ zzaiq(zzaiu zzaiu, zzaip zzaip) {
        this.zza = zzaiu;
    }

    private final Iterator zza() {
        if (this.zzd == null) {
            this.zzd = this.zza.zzc.entrySet().iterator();
        }
        return this.zzd;
    }

    public final boolean hasNext() {
        if (this.zzb + 1 < this.zza.zzb.size()) {
            return true;
        }
        if (!this.zza.zzc.isEmpty()) {
            return zza().hasNext();
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ Object next() {
        this.zzc = true;
        int i10 = this.zzb + 1;
        this.zzb = i10;
        return i10 < this.zza.zzb.size() ? (Map.Entry) this.zza.zzb.get(this.zzb) : (Map.Entry) zza().next();
    }

    public final void remove() {
        if (this.zzc) {
            this.zzc = false;
            this.zza.zzn();
            if (this.zzb < this.zza.zzb.size()) {
                zzaiu zzaiu = this.zza;
                int i10 = this.zzb;
                this.zzb = i10 - 1;
                Object unused = zzaiu.zzl(i10);
                return;
            }
            zza().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}
