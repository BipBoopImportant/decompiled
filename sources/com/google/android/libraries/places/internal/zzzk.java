package com.google.android.libraries.places.internal;

public final class zzzk extends zzago implements zzahx {
    /* access modifiers changed from: private */
    public static final zzzk zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        zzzk zzzk = new zzzk();
        zzb = zzzk;
        zzago.zzI(zzzk.class, zzzk);
    }

    private zzzk() {
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzago.zzF(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        } else if (i11 == 3) {
            return new zzzk();
        } else {
            if (i11 == 4) {
                return new zzzj((zzyp) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
