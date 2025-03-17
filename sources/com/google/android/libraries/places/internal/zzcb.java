package com.google.android.libraries.places.internal;

public final class zzcb extends zzago implements zzahx {
    /* access modifiers changed from: private */
    public static final zzcb zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;

    static {
        zzcb zzcb = new zzcb();
        zzb = zzcb;
        zzago.zzI(zzcb.class, zzcb);
    }

    private zzcb() {
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzago.zzF(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        } else if (i11 == 3) {
            return new zzcb();
        } else {
            if (i11 == 4) {
                return new zzca((zzbz) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
