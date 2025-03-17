package com.google.android.libraries.places.internal;

public final class zzqn extends zzago implements zzahx {
    /* access modifiers changed from: private */
    public static final zzqn zzb;
    private int zzd;
    private zzagt zze = zzago.zzz();
    private zzagt zzf = zzago.zzz();
    private int zzg;
    private int zzh;
    private long zzi;
    private int zzj;

    static {
        zzqn zzqn = new zzqn();
        zzb = zzqn;
        zzago.zzI(zzqn.class, zzqn);
    }

    private zzqn() {
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzago.zzF(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0002\u0000\u0001\u0016\u0002\u0016\u0003င\u0000\u0004င\u0001\u0005ဂ\u0002\u0006င\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        } else if (i11 == 3) {
            return new zzqn();
        } else {
            if (i11 == 4) {
                return new zzqm((zzqj) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
