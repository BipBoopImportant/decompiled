package com.google.android.libraries.places.internal;

public final class zzabk extends zzago implements zzahx {
    /* access modifiers changed from: private */
    public static final zzabk zzb;
    private int zzd;
    private zzrd zze;
    private byte zzf = 2;

    static {
        zzabk zzabk = new zzabk();
        zzb = zzabk;
        zzago.zzI(zzabk.class, zzabk);
    }

    private zzabk() {
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzf);
        }
        if (i11 == 2) {
            return zzago.zzF(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"zzd", "zze"});
        } else if (i11 == 3) {
            return new zzabk();
        } else {
            if (i11 == 4) {
                return new zzabj((zzyp) null);
            }
            if (i11 == 5) {
                return zzb;
            }
            this.zzf = obj == null ? (byte) 0 : 1;
            return null;
        }
    }
}
