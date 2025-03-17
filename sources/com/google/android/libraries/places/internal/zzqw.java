package com.google.android.libraries.places.internal;

public final class zzqw extends zzago implements zzahx {
    /* access modifiers changed from: private */
    public static final zzqw zzb;
    private int zzd = 0;
    private Object zze;

    static {
        zzqw zzqw = new zzqw();
        zzb = zzqw;
        zzago.zzI(zzqw.class, zzqw);
    }

    private zzqw() {
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzago.zzF(zzb, "\u0001\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"zze", "zzd", zzra.class, zzqu.class, zzqy.class});
        } else if (i11 == 3) {
            return new zzqw();
        } else {
            if (i11 == 4) {
                return new zzqv((zzqs) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
