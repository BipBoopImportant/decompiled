package com.google.android.libraries.places.internal;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

final class zzaie {
    private static final zzaie zza = new zzaie();
    private final zzaii zzb = new zzaho();
    private final ConcurrentMap zzc = new ConcurrentHashMap();

    private zzaie() {
    }

    public static zzaie zza() {
        return zza;
    }

    public final zzaih zzb(Class cls) {
        zzagx.zzc(cls, "messageType");
        zzaih zzaih = (zzaih) this.zzc.get(cls);
        if (zzaih == null) {
            zzaih = this.zzb.zza(cls);
            zzagx.zzc(cls, "messageType");
            zzagx.zzc(zzaih, "schema");
            zzaih zzaih2 = (zzaih) this.zzc.putIfAbsent(cls, zzaih);
            return zzaih2 == null ? zzaih : zzaih2;
        }
    }
}
