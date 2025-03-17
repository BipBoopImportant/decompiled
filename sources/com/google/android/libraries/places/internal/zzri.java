package com.google.android.libraries.places.internal;

public final class zzri extends zzago implements zzahx {
    /* access modifiers changed from: private */
    public static final zzri zzb;
    private int zzd;
    private boolean zze;
    private boolean zzf;
    private boolean zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;

    static {
        zzri zzri = new zzri();
        zzb = zzri;
        zzago.zzI(zzri.class, zzri);
    }

    private zzri() {
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzago.zzF(zzb, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဋ\u0003\u0005ဋ\u0004\u0006ဋ\u0005\u0007ဋ\u0006", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        } else if (i11 == 3) {
            return new zzri();
        } else {
            if (i11 == 4) {
                return new zzrh((zzrg) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
