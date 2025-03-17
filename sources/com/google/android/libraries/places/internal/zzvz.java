package com.google.android.libraries.places.internal;

public final class zzvz extends zzago implements zzahx {
    /* access modifiers changed from: private */
    public static final zzvz zzb;
    private int zzd = 0;
    private Object zze;

    static {
        zzvz zzvz = new zzvz();
        zzb = zzvz;
        zzago.zzI(zzvz.class, zzvz);
    }

    private zzvz() {
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzago.zzF(zzb, "\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001<\u0000", new Object[]{"zze", "zzd", zzqw.class});
        } else if (i11 == 3) {
            return new zzvz();
        } else {
            if (i11 == 4) {
                return new zzvy((zzvx) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
