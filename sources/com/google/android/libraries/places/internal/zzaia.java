package com.google.android.libraries.places.internal;

final class zzaia implements zzaih {
    private final zzahw zza;
    private final zzaiy zzb;
    private final boolean zzc;
    private final zzage zzd;

    private zzaia(zzaiy zzaiy, zzage zzage, zzahw zzahw) {
        this.zzb = zzaiy;
        this.zzc = zzage.zzc(zzahw);
        this.zzd = zzage;
        this.zza = zzahw;
    }

    static zzaia zzi(zzaiy zzaiy, zzage zzage, zzahw zzahw) {
        return new zzaia(zzaiy, zzage, zzahw);
    }

    public final int zza(Object obj) {
        zzaiy zzaiy = this.zzb;
        int zzb2 = zzaiy.zzb(zzaiy.zzc(obj));
        if (!this.zzc) {
            return zzb2;
        }
        this.zzd.zza(obj);
        throw null;
    }

    public final int zzb(Object obj) {
        int hashCode = this.zzb.zzc(obj).hashCode();
        if (!this.zzc) {
            return hashCode;
        }
        this.zzd.zza(obj);
        throw null;
    }

    public final Object zzc() {
        zzahw zzahw = this.zza;
        return zzahw instanceof zzago ? ((zzago) zzahw).zzy() : zzahw.zzD().zzs();
    }

    public final void zzd(Object obj) {
        this.zzb.zze(obj);
        this.zzd.zzb(obj);
    }

    public final void zze(Object obj, Object obj2) {
        zzaij.zzA(this.zzb, obj, obj2);
        if (this.zzc) {
            this.zzd.zza(obj2);
            throw null;
        }
    }

    public final void zzf(Object obj, zzajp zzajp) {
        this.zzd.zza(obj);
        throw null;
    }

    public final boolean zzg(Object obj, Object obj2) {
        if (!this.zzb.zzc(obj).equals(this.zzb.zzc(obj2))) {
            return false;
        }
        if (!this.zzc) {
            return true;
        }
        this.zzd.zza(obj);
        this.zzd.zza(obj2);
        throw null;
    }

    public final boolean zzh(Object obj) {
        this.zzd.zza(obj);
        throw null;
    }
}
