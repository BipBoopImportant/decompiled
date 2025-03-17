package com.google.android.libraries.places.internal;

import java.util.Iterator;
import java.util.Set;

public final class zzmd {
    private static final zzlz zza = new zzmb();
    private static final zzly zzb = new zzmc();

    public static zzlv zza(Set set) {
        zzlv zzlv = new zzlv(zza, (zzlu) null);
        zzlv.zza(zzb);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            zzlv.zzg((zzlm) it.next());
        }
        return zzlv;
    }
}
