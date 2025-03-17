package com.google.android.libraries.places.internal;

import java.util.Iterator;

final class zzjh extends zzjk {
    final /* synthetic */ zzjk zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzjh(zzjk zzjk, zzjk zzjk2) {
        super(zzjk2, (zzjj) null);
        this.zza = zzjk;
    }

    public final Appendable zza(Appendable appendable, Iterator it) {
        zzjp.zzc(it, "parts");
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (next != null) {
                appendable.append(zzjk.zzf(next));
                break;
            }
        }
        while (it.hasNext()) {
            Object next2 = it.next();
            if (next2 != null) {
                appendable.append(this.zza.zza);
                appendable.append(zzjk.zzf(next2));
            }
        }
        return appendable;
    }
}
