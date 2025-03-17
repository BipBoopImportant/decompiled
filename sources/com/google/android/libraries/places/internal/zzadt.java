package com.google.android.libraries.places.internal;

public final class zzadt extends zzago implements zzahx {
    /* access modifiers changed from: private */
    public static final zzadt zzb;
    private int zzd;
    private long zze;
    private int zzf;

    static {
        zzadt zzadt = new zzadt();
        zzb = zzadt;
        zzago.zzI(zzadt.class, zzadt);
    }

    private zzadt() {
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzago.zzF(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဏ\u0001", new Object[]{"zzd", "zze", "zzf"});
        } else if (i11 == 3) {
            return new zzadt();
        } else {
            if (i11 == 4) {
                return new zzads((zzadr) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
