package com.google.android.libraries.places.internal;

public final class zzj extends zzago implements zzahx {
    /* access modifiers changed from: private */
    public static final zzj zzb;
    private int zzd;
    private zzcb zze;
    private int zzf;

    static {
        zzj zzj = new zzj();
        zzb = zzj;
        zzago.zzI(zzj.class, zzj);
    }

    private zzj() {
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzago.zzF(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002᠌\u0001", new Object[]{"zzd", "zze", "zzf", zzi.zza});
        } else if (i11 == 3) {
            return new zzj();
        } else {
            if (i11 == 4) {
                return new zzh((zza) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
