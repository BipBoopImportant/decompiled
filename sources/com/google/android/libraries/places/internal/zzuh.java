package com.google.android.libraries.places.internal;

public final class zzuh extends zzago implements zzahx {
    /* access modifiers changed from: private */
    public static final zzuh zzb;
    private int zzd;
    private String zze = "";
    private int zzf;
    private zzagw zzg = zzago.zzB();

    static {
        zzuh zzuh = new zzuh();
        zzb = zzuh;
        zzago.zzI(zzuh.class, zzuh);
    }

    private zzuh() {
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzago.zzF(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002င\u0001\u0003\u001b", new Object[]{"zzd", "zze", "zzf", "zzg", zzug.class});
        } else if (i11 == 3) {
            return new zzuh();
        } else {
            if (i11 == 4) {
                return new zzue((zzub) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
