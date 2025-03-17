package com.google.android.libraries.places.internal;

public final class zzvq extends zzago implements zzahx {
    /* access modifiers changed from: private */
    public static final zzvq zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private String zzg = "";

    static {
        zzvq zzvq = new zzvq();
        zzb = zzvq;
        zzago.zzI(zzvq.class, zzvq);
    }

    private zzvq() {
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzago.zzF(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003ဈ\u0002", new Object[]{"zzd", "zze", zzvp.zza, "zzf", "zzg"});
        } else if (i11 == 3) {
            return new zzvq();
        } else {
            if (i11 == 4) {
                return new zzvo((zzub) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
