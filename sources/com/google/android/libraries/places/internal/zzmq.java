package com.google.android.libraries.places.internal;

import java.util.Set;
import java.util.logging.Level;

public final class zzmq implements zzmk {
    private final String zza;
    private final Level zzb;
    private final Set zzc;
    private final zzma zzd;

    private zzmq(String str, boolean z10, boolean z11, Level level, boolean z12, Set set, zzma zzma) {
        this.zza = "";
        this.zzb = level;
        this.zzc = set;
        this.zzd = zzma;
    }

    public final zzlp zza(String str) {
        return new zzmt(this.zza, str, true, false, this.zzb, this.zzc, this.zzd, (zzms) null);
    }

    public final zzmq zzb(boolean z10) {
        return new zzmq(this.zza, true, false, Level.OFF, false, this.zzc, this.zzd);
    }

    public zzmq() {
        this("", true, false, Level.ALL, false, zzmt.zza, zzmt.zzb);
    }
}
