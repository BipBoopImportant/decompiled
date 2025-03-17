package com.google.android.libraries.places.internal;

public final class zzce extends zzago implements zzahx {
    /* access modifiers changed from: private */
    public static final zzce zzb;
    private zzagw zzd = zzago.zzB();

    static {
        zzce zzce = new zzce();
        zzb = zzce;
        zzago.zzI(zzce.class, zzce);
    }

    private zzce() {
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzago.zzF(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", zzci.class});
        } else if (i11 == 3) {
            return new zzce();
        } else {
            if (i11 == 4) {
                return new zzcd((zzcc) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
