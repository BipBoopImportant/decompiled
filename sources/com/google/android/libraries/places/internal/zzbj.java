package com.google.android.libraries.places.internal;

public final class zzbj extends zzago implements zzahx {
    /* access modifiers changed from: private */
    public static final zzbj zzb;
    private int zzd;
    private zzai zze;
    private zzbm zzf;
    private zzcl zzg;

    static {
        zzbj zzbj = new zzbj();
        zzb = zzbj;
        zzago.zzI(zzbj.class, zzbj);
    }

    private zzbj() {
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzago.zzF(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        } else if (i11 == 3) {
            return new zzbj();
        } else {
            if (i11 == 4) {
                return new zzbi((zzbg) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
