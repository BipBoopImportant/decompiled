package com.google.android.libraries.places.internal;

public final class zzvn extends zzago implements zzahx {
    /* access modifiers changed from: private */
    public static final zzvn zzb;
    private int zzd;
    private boolean zze;
    private boolean zzf;

    static {
        zzvn zzvn = new zzvn();
        zzb = zzvn;
        zzago.zzI(zzvn.class, zzvn);
    }

    private zzvn() {
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzago.zzF(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"zzd", "zze", "zzf"});
        } else if (i11 == 3) {
            return new zzvn();
        } else {
            if (i11 == 4) {
                return new zzvm((zzub) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
