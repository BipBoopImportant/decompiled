package com.google.android.libraries.places.internal;

public final class zzuz extends zzago implements zzahx {
    /* access modifiers changed from: private */
    public static final zzuz zzb;
    private int zzd;
    private zzux zze;
    private zzup zzf;

    static {
        zzuz zzuz = new zzuz();
        zzb = zzuz;
        zzago.zzI(zzuz.class, zzuz);
    }

    private zzuz() {
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzago.zzF(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zzd", "zze", "zzf"});
        } else if (i11 == 3) {
            return new zzuz();
        } else {
            if (i11 == 4) {
                return new zzuy((zzub) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
