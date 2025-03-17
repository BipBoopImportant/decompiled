package com.google.android.libraries.places.internal;

public final class zzvg extends zzago implements zzahx {
    /* access modifiers changed from: private */
    public static final zzvg zzb;
    private int zzd;
    private int zze;
    private float zzf;
    private float zzg;

    static {
        zzvg zzvg = new zzvg();
        zzb = zzvg;
        zzago.zzI(zzvg.class, zzvg);
    }

    private zzvg() {
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzago.zzF(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ခ\u0001\u0003ခ\u0002", new Object[]{"zzd", "zze", zzva.zza, "zzf", "zzg"});
        } else if (i11 == 3) {
            return new zzvg();
        } else {
            if (i11 == 4) {
                return new zzvf((zzub) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
