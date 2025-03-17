package com.google.android.libraries.places.internal;

public final class zzrf extends zzago implements zzahx {
    /* access modifiers changed from: private */
    public static final zzrf zzb;
    private int zzd;
    private zzrd zze;
    private zzrd zzf;
    private byte zzg = 2;

    static {
        zzrf zzrf = new zzrf();
        zzb = zzrf;
        zzago.zzI(zzrf.class, zzrf);
    }

    private zzrf() {
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzg);
        }
        if (i11 == 2) {
            return zzago.zzF(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001", new Object[]{"zzd", "zze", "zzf"});
        } else if (i11 == 3) {
            return new zzrf();
        } else {
            if (i11 == 4) {
                return new zzre((zzrb) null);
            }
            if (i11 == 5) {
                return zzb;
            }
            this.zzg = obj == null ? (byte) 0 : 1;
            return null;
        }
    }
}
