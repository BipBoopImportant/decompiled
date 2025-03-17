package com.google.android.libraries.places.internal;

public final class zzan extends zzago implements zzahx {
    /* access modifiers changed from: private */
    public static final zzan zzb;
    private int zzd;
    private zzcl zze;
    private zzai zzf;
    private zzal zzg;

    static {
        zzan zzan = new zzan();
        zzb = zzan;
        zzago.zzI(zzan.class, zzan);
    }

    private zzan() {
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzago.zzF(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0001\u0002ဉ\u0002\u0003ဉ\u0000", new Object[]{"zzd", "zzf", "zzg", "zze"});
        } else if (i11 == 3) {
            return new zzan();
        } else {
            if (i11 == 4) {
                return new zzam((zzaj) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
