package com.google.android.libraries.places.internal;

public final class zzzx extends zzago implements zzahx {
    /* access modifiers changed from: private */
    public static final zzzx zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private int zzg;

    static {
        zzzx zzzx = new zzzx();
        zzb = zzzx;
        zzago.zzI(zzzx.class, zzzx);
    }

    private zzzx() {
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzago.zzF(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003᠌\u0002", new Object[]{"zzd", "zze", "zzf", "zzg", zzzw.zza});
        } else if (i11 == 3) {
            return new zzzx();
        } else {
            if (i11 == 4) {
                return new zzzv((zzyp) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
