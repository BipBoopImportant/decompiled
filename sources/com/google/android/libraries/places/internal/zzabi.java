package com.google.android.libraries.places.internal;

public final class zzabi extends zzago implements zzahx {
    /* access modifiers changed from: private */
    public static final zzabi zzb;
    private int zzd;
    private zzagw zze = zzago.zzB();
    private int zzf;
    private int zzg;
    private zzach zzh;

    static {
        zzabi zzabi = new zzabi();
        zzb = zzabi;
        zzago.zzI(zzabi.class, zzabi);
    }

    private zzabi() {
    }

    public static zzabh zza() {
        return (zzabh) zzb.zzw();
    }

    static /* synthetic */ void zzd(zzabi zzabi, int i10) {
        zzabi.zzd |= 2;
        zzabi.zzg = 1;
    }

    static /* synthetic */ void zze(zzabi zzabi, zzach zzach) {
        zzach.getClass();
        zzabi.zzh = zzach;
        zzabi.zzd |= 4;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzago.zzF(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001a\u0002᠌\u0000\u0003ဋ\u0001\u0004ဉ\u0002", new Object[]{"zzd", "zze", "zzf", zzze.zza, "zzg", "zzh"});
        } else if (i11 == 3) {
            return new zzabi();
        } else {
            if (i11 == 4) {
                return new zzabh((zzyp) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
