package com.google.android.libraries.places.internal;

import androidx.recyclerview.widget.RecyclerView;

public final class zzaaq extends zzago implements zzahx {
    /* access modifiers changed from: private */
    public static final zzaaq zzb;
    private int zzd;
    private int zze;
    private int zzf = 1;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private boolean zzq;
    private int zzr;
    private int zzs;
    private int zzt;

    static {
        zzaaq zzaaq = new zzaaq();
        zzb = zzaaq;
        zzago.zzI(zzaaq.class, zzaaq);
    }

    private zzaaq() {
    }

    public static zzaan zza() {
        return (zzaan) zzb.zzw();
    }

    static /* synthetic */ void zzd(zzaaq zzaaq, boolean z10) {
        zzaaq.zzd |= 4;
        zzaaq.zzg = z10;
    }

    static /* synthetic */ void zze(zzaaq zzaaq, boolean z10) {
        zzaaq.zzd |= 8;
        zzaaq.zzh = z10;
    }

    static /* synthetic */ void zzf(zzaaq zzaaq, boolean z10) {
        zzaaq.zzd |= 16;
        zzaaq.zzi = z10;
    }

    static /* synthetic */ void zzg(zzaaq zzaaq, int i10) {
        zzaaq.zzd |= 32;
        zzaaq.zzj = i10;
    }

    static /* synthetic */ void zzh(zzaaq zzaaq, int i10) {
        zzaaq.zzd |= 64;
        zzaaq.zzk = i10;
    }

    static /* synthetic */ void zzi(zzaaq zzaaq, int i10) {
        zzaaq.zzd |= 128;
        zzaaq.zzl = i10;
    }

    static /* synthetic */ void zzj(zzaaq zzaaq, int i10) {
        zzaaq.zzd |= 256;
        zzaaq.zzm = i10;
    }

    static /* synthetic */ void zzk(zzaaq zzaaq, int i10) {
        zzaaq.zzd |= 512;
        zzaaq.zzn = i10;
    }

    static /* synthetic */ void zzl(zzaaq zzaaq, int i10) {
        zzaaq.zzd |= 1024;
        zzaaq.zzo = i10;
    }

    static /* synthetic */ void zzm(zzaaq zzaaq, int i10) {
        zzaaq.zzd |= RecyclerView.n.FLAG_MOVED;
        zzaaq.zzp = i10;
    }

    static /* synthetic */ void zzn(zzaaq zzaaq, boolean z10) {
        zzaaq.zzd |= RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT;
        zzaaq.zzq = z10;
    }

    static /* synthetic */ void zzo(zzaaq zzaaq, int i10) {
        zzaaq.zzd |= 8192;
        zzaaq.zzr = i10;
    }

    static /* synthetic */ void zzp(zzaaq zzaaq, int i10) {
        zzaaq.zze = i10 - 1;
        zzaaq.zzd |= 1;
    }

    static /* synthetic */ void zzq(zzaaq zzaaq, int i10) {
        zzaaq.zzf = i10;
        zzaaq.zzd |= 2;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzago.zzF(zzb, "\u0001\u0010\u0000\u0001\u0001\u0011\u0010\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဋ\u0005\u0007ဋ\u0006\bဋ\u0007\nဋ\t\u000bဋ\n\fဋ\u000b\rဇ\f\u000eဋ\r\u000fဋ\b\u0010ဋ\u000e\u0011᠌\u000f", new Object[]{"zzd", "zze", zzaap.zza, "zzf", zzaam.zza, "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzn", "zzo", "zzp", "zzq", "zzr", "zzm", "zzs", "zzt", zzaao.zza});
        } else if (i11 == 3) {
            return new zzaaq();
        } else {
            if (i11 == 4) {
                return new zzaan((zzyp) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
