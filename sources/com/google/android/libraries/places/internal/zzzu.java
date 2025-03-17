package com.google.android.libraries.places.internal;

public final class zzzu extends zzago implements zzahx {
    /* access modifiers changed from: private */
    public static final zzzu zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private zzzi zzj;
    private zzzb zzk;
    private zzyw zzl;
    private zzadc zzm;
    private zzzd zzn;
    private zzzg zzo;
    private zzade zzp;
    private zzadm zzq;
    private zzadi zzr;
    private int zzs;

    static {
        zzzu zzzu = new zzzu();
        zzb = zzzu;
        zzago.zzI(zzzu.class, zzzu);
    }

    private zzzu() {
    }

    public static zzzp zza() {
        return (zzzp) zzb.zzw();
    }

    static /* synthetic */ void zzd(zzzu zzzu, int i10) {
        zzzu.zzd |= 4;
        zzzu.zzg = i10;
    }

    static /* synthetic */ void zze(zzzu zzzu, zzzi zzzi) {
        zzzi.getClass();
        zzzu.zzj = zzzi;
        zzzu.zzd |= 32;
    }

    static /* synthetic */ void zzf(zzzu zzzu, zzyw zzyw) {
        zzyw.getClass();
        zzzu.zzl = zzyw;
        zzzu.zzd |= 128;
    }

    static /* synthetic */ void zzg(zzzu zzzu, zzzd zzzd) {
        zzzd.getClass();
        zzzu.zzn = zzzd;
        zzzu.zzd |= 512;
    }

    static /* synthetic */ void zzh(zzzu zzzu, int i10) {
        zzzu.zze = i10 - 1;
        zzzu.zzd |= 1;
    }

    static /* synthetic */ void zzi(zzzu zzzu, int i10) {
        zzzu.zzf = i10 - 1;
        zzzu.zzd |= 2;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzago.zzF(zzb, "\u0001\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003င\u0002\u0004᠌\u0003\u0005᠌\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဉ\u0007\tဉ\b\nဉ\t\u000bဉ\n\fဉ\u000b\rဉ\f\u000eဉ\r\u000f᠌\u000e", new Object[]{"zzd", "zze", zzzr.zza, "zzf", zzzt.zza, "zzg", "zzh", zzzq.zza, "zzi", zzzo.zza, "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", zzzs.zza});
        } else if (i11 == 3) {
            return new zzzu();
        } else {
            if (i11 == 4) {
                return new zzzp((zzyp) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
