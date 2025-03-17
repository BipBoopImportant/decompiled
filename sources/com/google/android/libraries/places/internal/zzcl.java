package com.google.android.libraries.places.internal;

public final class zzcl extends zzago implements zzahx {
    /* access modifiers changed from: private */
    public static final zzcl zzb;
    private int zzd;
    private double zze = 1.0d;
    private double zzf = 1.0d;

    static {
        zzcl zzcl = new zzcl();
        zzb = zzcl;
        zzago.zzI(zzcl.class, zzcl);
    }

    private zzcl() {
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzago.zzF(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001က\u0000\u0002က\u0001", new Object[]{"zzd", "zze", "zzf"});
        } else if (i11 == 3) {
            return new zzcl();
        } else {
            if (i11 == 4) {
                return new zzck((zzcj) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
