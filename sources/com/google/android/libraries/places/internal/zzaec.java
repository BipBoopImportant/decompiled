package com.google.android.libraries.places.internal;

public final class zzaec extends zzago implements zzahx {
    /* access modifiers changed from: private */
    public static final zzaec zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;

    static {
        zzaec zzaec = new zzaec();
        zzb = zzaec;
        zzago.zzI(zzaec.class, zzaec);
    }

    private zzaec() {
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzago.zzF(zzb, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        } else if (i11 == 3) {
            return new zzaec();
        } else {
            if (i11 == 4) {
                return new zzaeb((zzaea) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
