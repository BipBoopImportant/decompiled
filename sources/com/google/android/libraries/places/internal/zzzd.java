package com.google.android.libraries.places.internal;

public final class zzzd extends zzago implements zzahx {
    /* access modifiers changed from: private */
    public static final zzzd zzb;
    private int zzd;
    private int zze;

    static {
        zzzd zzzd = new zzzd();
        zzb = zzzd;
        zzago.zzI(zzzd.class, zzzd);
    }

    private zzzd() {
    }

    public static zzzc zza() {
        return (zzzc) zzb.zzw();
    }

    static /* synthetic */ void zzd(zzzd zzzd, int i10) {
        zzzd.zzd |= 1;
        zzzd.zze = i10;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzago.zzF(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"zzd", "zze"});
        } else if (i11 == 3) {
            return new zzzd();
        } else {
            if (i11 == 4) {
                return new zzzc((zzyp) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
