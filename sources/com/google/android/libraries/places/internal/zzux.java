package com.google.android.libraries.places.internal;

public final class zzux extends zzago implements zzahx {
    private static final zzagu zzb = new zzus();
    private static final zzagu zzd = new zzut();
    /* access modifiers changed from: private */
    public static final zzux zze;
    private int zzf;
    private zzagw zzg = zzago.zzB();
    private long zzh;
    private zzagt zzi = zzago.zzz();
    private zzagt zzj = zzago.zzz();

    static {
        zzux zzux = new zzux();
        zze = zzux;
        zzago.zzI(zzux.class, zzux);
    }

    private zzux() {
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            zzags zzags = zzpu.zza;
            return zzago.zzF(zze, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0003\u0000\u0001\u001b\u0002ဂ\u0000\u0003ࠬ\u0004ࠬ", new Object[]{"zzf", "zzg", zzuw.class, "zzh", "zzi", zzags, "zzj", zzags});
        } else if (i11 == 3) {
            return new zzux();
        } else {
            if (i11 == 4) {
                return new zzuu((zzub) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zze;
        }
    }
}
