package com.google.android.libraries.places.internal;

public final class zzzb extends zzago implements zzahx {
    private static final zzagu zzb = new zzyy();
    /* access modifiers changed from: private */
    public static final zzzb zzd;
    private int zze;
    private zzagt zzf = zzago.zzz();
    private int zzg;

    static {
        zzzb zzzb = new zzzb();
        zzd = zzzb;
        zzago.zzI(zzzb.class, zzzb);
    }

    private zzzb() {
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzago.zzF(zzd, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ࠞ\u0002င\u0000", new Object[]{"zze", "zzf", zzyz.zza, "zzg"});
        } else if (i11 == 3) {
            return new zzzb();
        } else {
            if (i11 == 4) {
                return new zzza((zzyp) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzd;
        }
    }
}
