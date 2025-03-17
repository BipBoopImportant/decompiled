package com.google.android.libraries.places.internal;

public final class zzyu extends zzago implements zzahx {
    /* access modifiers changed from: private */
    public static final zzyu zzb;
    private int zzd;
    private String zze = "";
    private int zzf;

    static {
        zzyu zzyu = new zzyu();
        zzb = zzyu;
        zzago.zzI(zzyu.class, zzyu);
    }

    private zzyu() {
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzago.zzF(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001", new Object[]{"zzd", "zze", "zzf", zzyt.zza});
        } else if (i11 == 3) {
            return new zzyu();
        } else {
            if (i11 == 4) {
                return new zzys((zzyp) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
