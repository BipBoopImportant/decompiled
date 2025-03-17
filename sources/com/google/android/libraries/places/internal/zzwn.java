package com.google.android.libraries.places.internal;

public final class zzwn extends zzago implements zzahx {
    /* access modifiers changed from: private */
    public static final zzwn zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        zzwn zzwn = new zzwn();
        zzb = zzwn;
        zzago.zzI(zzwn.class, zzwn);
    }

    private zzwn() {
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzago.zzF(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zzd", "zze", zzwk.zza, "zzf", zzwm.zza, "zzg", zzwl.zza});
        } else if (i11 == 3) {
            return new zzwn();
        } else {
            if (i11 == 4) {
                return new zzwj((zzwa) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
