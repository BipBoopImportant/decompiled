package com.google.android.libraries.places.internal;

public final class zzaaj extends zzago implements zzahx {
    /* access modifiers changed from: private */
    public static final zzaaj zzb;
    private int zzd;
    private String zze = "";
    private zzrd zzf;
    private String zzg = "";
    private zzagw zzh = zzago.zzB();
    private String zzi = "";
    private String zzj = "";
    private byte zzk = 2;

    static {
        zzaaj zzaaj = new zzaaj();
        zzb = zzaaj;
        zzago.zzI(zzaaj.class, zzaaj);
    }

    private zzaaj() {
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzk);
        }
        if (i11 == 2) {
            return zzago.zzF(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001ဈ\u0000\u0002ᐉ\u0001\u0003ဈ\u0002\u0004\u001a\u0005ဈ\u0003\u0006ဈ\u0004", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        } else if (i11 == 3) {
            return new zzaaj();
        } else {
            if (i11 == 4) {
                return new zzaai((zzyp) null);
            }
            if (i11 == 5) {
                return zzb;
            }
            this.zzk = obj == null ? (byte) 0 : 1;
            return null;
        }
    }
}
