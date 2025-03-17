package com.google.android.libraries.places.internal;

public final class zzadc extends zzago implements zzahx {
    /* access modifiers changed from: private */
    public static final zzadc zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        zzadc zzadc = new zzadc();
        zzb = zzadc;
        zzago.zzI(zzadc.class, zzadc);
    }

    private zzadc() {
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzago.zzF(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zzd", "zze", "zzf"});
        } else if (i11 == 3) {
            return new zzadc();
        } else {
            if (i11 == 4) {
                return new zzadb((zzyp) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
