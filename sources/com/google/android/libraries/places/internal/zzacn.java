package com.google.android.libraries.places.internal;

public final class zzacn extends zzago implements zzahx {
    /* access modifiers changed from: private */
    public static final zzacn zzb;
    private int zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private zzzz zzh;
    private zzacw zzi;
    private zzabk zzj;
    private zzaaj zzk;
    private zzabi zzl;
    private zzaal zzm;
    private zzabg zzn;
    private zzacy zzo;
    private zzacy zzp;
    private zzabm zzq;
    private zzaav zzr;
    private zzacp zzs;
    private zzacr zzt;
    private zzacc zzu;
    private zzabs zzv;
    private zzact zzw;
    private byte zzx = 2;

    static {
        zzacn zzacn = new zzacn();
        zzb = zzacn;
        zzago.zzI(zzacn.class, zzacn);
    }

    private zzacn() {
    }

    public static zzacl zza() {
        return (zzacl) zzb.zzw();
    }

    static /* synthetic */ void zzd(zzacn zzacn, String str) {
        str.getClass();
        zzacn.zzd |= 2;
        zzacn.zzf = str;
    }

    static /* synthetic */ void zze(zzacn zzacn, String str) {
        str.getClass();
        zzacn.zzd |= 4;
        zzacn.zzg = str;
    }

    static /* synthetic */ void zzf(zzacn zzacn, zzabi zzabi) {
        zzabi.getClass();
        zzacn.zzl = zzabi;
        zzacn.zzd |= 128;
    }

    static /* synthetic */ void zzg(zzacn zzacn, zzaal zzaal) {
        zzaal.getClass();
        zzacn.zzm = zzaal;
        zzacn.zzd |= 256;
    }

    static /* synthetic */ void zzh(zzacn zzacn, int i10) {
        zzacn.zze = i10 - 1;
        zzacn.zzd |= 1;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzx);
        }
        if (i11 == 2) {
            return zzago.zzF(zzb, "\u0001\u0013\u0000\u0001\u0001\u0013\u0013\u0000\u0000\u0004\u0001᠌\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0006\bဉ\u0007\tᐉ\b\nဉ\t\u000bဉ\u000b\fဉ\n\rဉ\f\u000eဉ\r\u000fဉ\u000e\u0010ဉ\u000f\u0011ဉ\u0010\u0012ဉ\u0011\u0013ဉ\u0012", new Object[]{"zzd", "zze", zzacm.zza, "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzp", "zzo", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw"});
        } else if (i11 == 3) {
            return new zzacn();
        } else {
            if (i11 == 4) {
                return new zzacl((zzyp) null);
            }
            if (i11 == 5) {
                return zzb;
            }
            this.zzx = obj == null ? (byte) 0 : 1;
            return null;
        }
    }
}
