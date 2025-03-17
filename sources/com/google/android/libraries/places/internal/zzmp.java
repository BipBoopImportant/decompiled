package com.google.android.libraries.places.internal;

import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

final class zzmp extends zzmu {
    private static final zzmp zza = new zzmp(zzmu.zze());
    private final AtomicReference zzb;

    zzmp(zzmu zzmu) {
        this.zzb = new AtomicReference(zzmu);
    }

    public static final zzmp zzb() {
        return zza;
    }

    public final zzlr zza() {
        return ((zzmu) this.zzb.get()).zza();
    }

    public final zznh zzc() {
        return ((zzmu) this.zzb.get()).zzc();
    }

    public final boolean zzd(String str, Level level, boolean z10) {
        ((zzmu) this.zzb.get()).zzd(str, level, z10);
        return false;
    }
}
