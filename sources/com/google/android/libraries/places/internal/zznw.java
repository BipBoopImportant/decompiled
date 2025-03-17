package com.google.android.libraries.places.internal;

public final class zznw extends zzago implements zzahx {
    /* access modifiers changed from: private */
    public static final zznw zzb;
    private zzce zzA;
    private zzbj zzB;
    private byte zzC = 2;
    private int zzd;
    private int zze = 1;
    private zzabb zzf;
    private zzpy zzg;
    private zzadw zzh;
    private zzxy zzi;
    private zzte zzj;
    private zzbu zzk;
    private zzps zzl;
    private zzoy zzm;
    private zzqr zzn;
    private zzve zzo;
    private zzvw zzp;
    private zzvz zzq;
    private zzoi zzr;
    private zzrl zzs;
    private zzc zzt;
    private zzan zzu;
    private zzav zzv;
    private zzcv zzw;
    private zzay zzx;
    private zzbf zzy;
    private zzae zzz;

    static {
        zznw zznw = new zznw();
        zzb = zznw;
        zzago.zzI(zznw.class, zznw);
    }

    private zznw() {
    }

    public static zznu zza() {
        return (zznu) zzb.zzw();
    }

    static /* synthetic */ void zzd(zznw zznw, zzabb zzabb) {
        zzabb.getClass();
        zznw.zzf = zzabb;
        zznw.zzd |= 2;
    }

    static /* synthetic */ void zze(zznw zznw, int i10) {
        zznw.zze = 1;
        zznw.zzd = 1 | zznw.zzd;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzC);
        }
        if (i11 == 2) {
            return zzago.zzF(zzb, "\u0001\u0018\u0000\u0001\u0001\u0019\u0018\u0000\u0000\u0002\u0001᠌\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဉ\u0007\tဉ\b\nဉ\t\u000bဉ\n\fဉ\u000b\rဉ\f\u000fဉ\r\u0010ဉ\u000e\u0011ဉ\u000f\u0012ဉ\u0010\u0013ဉ\u0011\u0014ဉ\u0012\u0015ဉ\u0013\u0016ဉ\u0014\u0017ဉ\u0015\u0018ဉ\u0016\u0019ဉ\u0017", new Object[]{"zzd", "zze", zznv.zza, "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB"});
        } else if (i11 == 3) {
            return new zznw();
        } else {
            if (i11 == 4) {
                return new zznu((zznt) null);
            }
            if (i11 == 5) {
                return zzb;
            }
            this.zzC = obj == null ? (byte) 0 : 1;
            return null;
        }
    }
}
