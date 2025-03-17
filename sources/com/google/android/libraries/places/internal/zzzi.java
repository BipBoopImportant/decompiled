package com.google.android.libraries.places.internal;

public final class zzzi extends zzago implements zzahx {
    /* access modifiers changed from: private */
    public static final zzzi zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        zzzi zzzi = new zzzi();
        zzb = zzzi;
        zzago.zzI(zzzi.class, zzzi);
    }

    private zzzi() {
    }

    public static zzzh zza() {
        return (zzzh) zzb.zzw();
    }

    static /* synthetic */ void zzd(zzzi zzzi, int i10) {
        zzzi.zzd |= 1;
        zzzi.zze = 1;
    }

    static /* synthetic */ void zze(zzzi zzzi, int i10) {
        zzzi.zzd |= 2;
        zzzi.zzf = i10;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzago.zzF(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zzd", "zze", "zzf"});
        } else if (i11 == 3) {
            return new zzzi();
        } else {
            if (i11 == 4) {
                return new zzzh((zzyp) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
