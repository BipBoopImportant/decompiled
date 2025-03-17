package com.google.android.libraries.places.internal;

public final class zzacf extends zzago implements zzahx {
    /* access modifiers changed from: private */
    public static final zzacf zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private boolean zzg;

    static {
        zzacf zzacf = new zzacf();
        zzb = zzacf;
        zzago.zzI(zzacf.class, zzacf);
    }

    private zzacf() {
    }

    public static zzacd zza() {
        return (zzacd) zzb.zzw();
    }

    static /* synthetic */ void zzd(zzacf zzacf, int i10) {
        zzacf.zze = 1;
        zzacf.zzd = 1 | zzacf.zzd;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzago.zzF(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003ဇ\u0002", new Object[]{"zzd", "zze", zzace.zza, "zzf", "zzg"});
        } else if (i11 == 3) {
            return new zzacf();
        } else {
            if (i11 == 4) {
                return new zzacd((zzyp) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
