package com.google.android.libraries.places.internal;

public final class zzaey extends zzago implements zzahx {
    /* access modifiers changed from: private */
    public static final zzaey zzb;
    private int zzd;
    private int zze;
    private zzaec zzf;
    private zzaec zzg;
    private zzagw zzh = zzago.zzB();
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private zzaec zzn;
    private zzaef zzo;
    private zzael zzp;
    private int zzq;
    private int zzr;
    private zzaei zzs;
    private byte zzt = 2;

    static {
        zzaey zzaey = new zzaey();
        zzb = zzaey;
        zzago.zzI(zzaey.class, zzaey);
    }

    private zzaey() {
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzt);
        }
        if (i11 == 2) {
            return zzago.zzF(zzb, "\u0001\u000f\u0000\u0001\u0002\u0010\u000f\u0000\u0001\u0001\u0002ᔄ\u0000\u0003ဉ\u0001\u0004ဉ\u0002\u0005\u001b\u0006င\u0003\u0007င\u0004\bင\u0005\tင\u0006\nင\u0007\u000bဉ\b\fဉ\t\rဉ\n\u000eင\u000b\u000fင\f\u0010ဉ\r", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", zzaev.class, "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs"});
        } else if (i11 == 3) {
            return new zzaey();
        } else {
            if (i11 == 4) {
                return new zzaex((zzaew) null);
            }
            if (i11 == 5) {
                return zzb;
            }
            this.zzt = obj == null ? (byte) 0 : 1;
            return null;
        }
    }
}
