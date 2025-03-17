package com.google.android.libraries.places.internal;

public final class zzaal extends zzago implements zzahx {
    /* access modifiers changed from: private */
    public static final zzaal zzb;
    private int zzd;
    private String zze = "";
    private zzrf zzf;
    private zzzz zzg;
    private byte zzh = 2;

    static {
        zzaal zzaal = new zzaal();
        zzb = zzaal;
        zzago.zzI(zzaal.class, zzaal);
    }

    private zzaal() {
    }

    public static zzaak zza() {
        return (zzaak) zzb.zzw();
    }

    static /* synthetic */ void zzd(zzaal zzaal, zzzz zzzz) {
        zzaal.zzg = zzzz;
        zzaal.zzd |= 4;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzh);
        }
        if (i11 == 2) {
            return zzago.zzF(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ဈ\u0000\u0002ᐉ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        } else if (i11 == 3) {
            return new zzaal();
        } else {
            if (i11 == 4) {
                return new zzaak((zzyp) null);
            }
            if (i11 == 5) {
                return zzb;
            }
            this.zzh = obj == null ? (byte) 0 : 1;
            return null;
        }
    }
}
