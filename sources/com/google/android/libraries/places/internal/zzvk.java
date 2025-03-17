package com.google.android.libraries.places.internal;

public final class zzvk extends zzago implements zzahx {
    /* access modifiers changed from: private */
    public static final zzvk zzb;
    private int zzd;
    private float zze;
    private float zzf;
    private zzvg zzg;
    private zzvg zzh;
    private zzuj zzi;
    private zzuj zzj;
    private long zzk;

    static {
        zzvk zzvk = new zzvk();
        zzb = zzvk;
        zzago.zzI(zzvk.class, zzvk);
    }

    private zzvk() {
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzago.zzF(zzb, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဂ\u0006", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        } else if (i11 == 3) {
            return new zzvk();
        } else {
            if (i11 == 4) {
                return new zzvj((zzub) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
