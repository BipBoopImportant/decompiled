package com.google.android.libraries.places.internal;

public final class zzaae extends zzago implements zzahx {
    /* access modifiers changed from: private */
    public static final zzaae zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private zzzz zzg;
    private zzrf zzh;
    private int zzi = 1;
    private String zzj = "";
    private int zzk;
    private int zzl;
    private String zzm = "";
    private int zzn;
    private byte zzo = 2;

    static {
        zzaae zzaae = new zzaae();
        zzb = zzaae;
        zzago.zzI(zzaae.class, zzaae);
    }

    private zzaae() {
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzo);
        }
        if (i11 == 2) {
            return zzago.zzF(zzb, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ᐉ\u0003\u0005᠌\u0004\u0006ဈ\u0005\u0007᠌\u0006\bင\u0007\tဈ\b\n᠌\t", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", zzaab.zza, "zzj", "zzk", zzaad.zza, "zzl", "zzm", "zzn", zzaac.zza});
        } else if (i11 == 3) {
            return new zzaae();
        } else {
            if (i11 == 4) {
                return new zzaaa((zzyp) null);
            }
            if (i11 == 5) {
                return zzb;
            }
            this.zzo = obj == null ? (byte) 0 : 1;
            return null;
        }
    }
}
