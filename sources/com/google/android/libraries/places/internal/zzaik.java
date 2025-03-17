package com.google.android.libraries.places.internal;

import java.util.Collections;
import java.util.List;
import java.util.Map;

final class zzaik extends zzaiu {
    zzaik(int i10) {
        super(i10, (zzait) null);
    }

    public final void zza() {
        if (!zzj()) {
            for (int i10 = 0; i10 < zzb(); i10++) {
                Map.Entry zzg = zzg(i10);
                if (((zzagh) zzg.getKey()).zzc()) {
                    zzg.setValue(Collections.unmodifiableList((List) zzg.getValue()));
                }
            }
            for (Map.Entry entry : zzc()) {
                if (((zzagh) entry.getKey()).zzc()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.zza();
    }
}
