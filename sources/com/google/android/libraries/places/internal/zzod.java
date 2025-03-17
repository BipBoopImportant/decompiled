package com.google.android.libraries.places.internal;

public final class zzod extends zzago implements zzahx {
    /* access modifiers changed from: private */
    public static final zzod zzb;
    private int zzd;
    private String zze = "";
    private int zzf;
    private int zzg;
    private String zzh = "";
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private int zzm;

    static {
        zzod zzod = new zzod();
        zzb = zzod;
        zzago.zzI(zzod.class, zzod);
    }

    private zzod() {
    }

    public static zzny zza() {
        return (zzny) zzb.zzw();
    }

    static /* synthetic */ void zzd(zzod zzod, String str) {
        zzod.zzd |= 1;
        zzod.zze = str;
    }

    static /* synthetic */ void zze(zzod zzod, int i10) {
        zzod.zzd |= 2;
        zzod.zzf = i10;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzago.zzF(zzb, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003င\u0002\u0004ဈ\u0003\u0005င\u0004\u0006᠌\u0005\u0007᠌\u0006\b᠌\u0007\t᠌\b", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", zznz.zza, "zzk", zzob.zza, "zzl", zzoa.zza, "zzm", zzoc.zza});
        } else if (i11 == 3) {
            return new zzod();
        } else {
            if (i11 == 4) {
                return new zzny((zznx) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
