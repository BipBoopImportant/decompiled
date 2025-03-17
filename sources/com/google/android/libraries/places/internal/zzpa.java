package com.google.android.libraries.places.internal;

public final class zzpa extends zzago implements zzahx {
    /* access modifiers changed from: private */
    public static final zzpa zzb;
    private int zzd;
    private zzagw zze = zzago.zzB();
    private int zzf;

    static {
        zzpa zzpa = new zzpa();
        zzb = zzpa;
        zzago.zzI(zzpa.class, zzpa);
    }

    private zzpa() {
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzago.zzF(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002င\u0000", new Object[]{"zzd", "zze", zzov.class, "zzf"});
        } else if (i11 == 3) {
            return new zzpa();
        } else {
            if (i11 == 4) {
                return new zzoz((zzot) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
