package com.google.android.libraries.places.internal;

public final class zzabp extends zzago implements zzahx {
    /* access modifiers changed from: private */
    public static final zzabp zzb;
    private int zzd;
    private zzzz zze;
    private int zzf;
    private int zzg;
    private zzach zzh;

    static {
        zzabp zzabp = new zzabp();
        zzb = zzabp;
        zzago.zzI(zzabp.class, zzabp);
    }

    private zzabp() {
    }

    public static zzabn zza() {
        return (zzabn) zzb.zzw();
    }

    static /* synthetic */ void zzd(zzabp zzabp, int i10) {
        zzabp.zzd |= 4;
        zzabp.zzg = i10;
    }

    static /* synthetic */ void zze(zzabp zzabp, zzach zzach) {
        zzach.getClass();
        zzabp.zzh = zzach;
        zzabp.zzd |= 8;
    }

    static /* synthetic */ void zzf(zzabp zzabp, int i10) {
        zzabp.zzf = i10 - 1;
        zzabp.zzd |= 2;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzago.zzF(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002᠌\u0001\u0003င\u0002\u0004ဉ\u0003", new Object[]{"zzd", "zze", "zzf", zzabo.zza, "zzg", "zzh"});
        } else if (i11 == 3) {
            return new zzabp();
        } else {
            if (i11 == 4) {
                return new zzabn((zzyp) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
