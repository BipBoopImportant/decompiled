package com.google.android.libraries.places.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class zzjt {
    /* access modifiers changed from: private */
    public final zzjf zza;
    private final zzjr zzb;

    private zzjt(zzjr zzjr) {
        zzje zzje = zzje.zza;
        this.zzb = zzjr;
        this.zza = zzje;
    }

    public static zzjt zzb(char c10) {
        return new zzjt(new zzjr(new zzjc('.')));
    }

    public final List zzc(CharSequence charSequence) {
        zzjq zzjq = new zzjq(this.zzb, this, "3.2.0");
        ArrayList arrayList = new ArrayList();
        while (zzjq.hasNext()) {
            arrayList.add((String) zzjq.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
