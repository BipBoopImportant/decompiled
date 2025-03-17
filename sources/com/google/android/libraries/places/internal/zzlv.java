package com.google.android.libraries.places.internal;

import java.util.HashMap;
import java.util.Map;

public final class zzlv {
    private static final zzlz zza = new zzls();
    private static final zzly zzb = new zzlt();
    /* access modifiers changed from: private */
    public final Map zzc = new HashMap();
    /* access modifiers changed from: private */
    public final Map zzd = new HashMap();
    /* access modifiers changed from: private */
    public final zzlz zze;
    /* access modifiers changed from: private */
    public zzly zzf = null;

    /* synthetic */ zzlv(zzlz zzlz, zzlu zzlu) {
        this.zze = zzlz;
    }

    public final zzlv zza(zzly zzly) {
        this.zzf = zzly;
        return this;
    }

    public final zzma zzd() {
        return new zzlx(this, (zzlw) null);
    }

    /* access modifiers changed from: package-private */
    public final void zzg(zzlm zzlm) {
        zznj.zza(zzlm, "key");
        if (zzlm.zzb()) {
            zzly zzly = zzb;
            zznj.zza(zzlm, "key");
            if (zzlm.zzb()) {
                this.zzc.remove(zzlm);
                this.zzd.put(zzlm, zzly);
                return;
            }
            throw new IllegalArgumentException("key must be repeating");
        }
        zzlz zzlz = zza;
        zznj.zza(zzlm, "key");
        this.zzd.remove(zzlm);
        this.zzc.put(zzlm, zzlz);
    }
}
