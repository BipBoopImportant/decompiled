package com.google.android.libraries.places.internal;

final class zzahi extends zzahk {
    /* synthetic */ zzahi(zzahh zzahh) {
        super((zzahj) null);
    }

    /* access modifiers changed from: package-private */
    public final void zza(Object obj, long j10) {
        ((zzagw) zzaji.zzf(obj, j10)).zzb();
    }

    /* access modifiers changed from: package-private */
    public final void zzb(Object obj, Object obj2, long j10) {
        zzagw zzagw = (zzagw) zzaji.zzf(obj, j10);
        zzagw zzagw2 = (zzagw) zzaji.zzf(obj2, j10);
        int size = zzagw.size();
        int size2 = zzagw2.size();
        if (size > 0 && size2 > 0) {
            if (!zzagw.zzc()) {
                zzagw = zzagw.zzf(size2 + size);
            }
            zzagw.addAll(zzagw2);
        }
        if (size > 0) {
            zzagw2 = zzagw;
        }
        zzaji.zzs(obj, j10, zzagw2);
    }

    private zzahi() {
        super((zzahj) null);
    }
}
