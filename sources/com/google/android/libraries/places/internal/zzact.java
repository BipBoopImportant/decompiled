package com.google.android.libraries.places.internal;

public final class zzact extends zzago implements zzahx {
    /* access modifiers changed from: private */
    public static final zzact zzb;
    private zzagw zzd = zzago.zzB();
    private zzagw zze = zzago.zzB();

    static {
        zzact zzact = new zzact();
        zzb = zzact;
        zzago.zzI(zzact.class, zzact);
    }

    private zzact() {
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzago.zzF(zzb, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001a\u0002\u001b", new Object[]{"zzd", "zze", zzyu.class});
        } else if (i11 == 3) {
            return new zzact();
        } else {
            if (i11 == 4) {
                return new zzacs((zzyp) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
