package com.google.android.libraries.places.internal;

public final class zzacw extends zzago implements zzahx {
    /* access modifiers changed from: private */
    public static final zzacw zzb;
    private int zzd;
    private zzrf zze;
    private int zzf;
    private int zzg;
    private String zzh = "";
    private int zzi;
    private byte zzj = 2;

    static {
        zzacw zzacw = new zzacw();
        zzb = zzacw;
        zzago.zzI(zzacw.class, zzacw);
    }

    private zzacw() {
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzj);
        }
        if (i11 == 2) {
            return zzago.zzF(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0001\u0001ᐉ\u0000\u0002င\u0001\u0003င\u0002\u0004ဈ\u0003\u0005᠌\u0004", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", zzacv.zza});
        } else if (i11 == 3) {
            return new zzacw();
        } else {
            if (i11 == 4) {
                return new zzacu((zzyp) null);
            }
            if (i11 == 5) {
                return zzb;
            }
            this.zzj = obj == null ? (byte) 0 : 1;
            return null;
        }
    }
}
