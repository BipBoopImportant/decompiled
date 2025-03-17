package com.google.android.libraries.places.internal;

public final class zzzz extends zzago implements zzahx {
    /* access modifiers changed from: private */
    public static final zzzz zzb;
    private int zzd;
    private int zze;
    private zzagw zzf = zzago.zzB();
    private String zzg = "";
    private String zzh = "";
    private boolean zzi;
    private zzagw zzj = zzago.zzB();

    static {
        zzzz zzzz = new zzzz();
        zzb = zzzz;
        zzago.zzI(zzzz.class, zzzz);
    }

    private zzzz() {
    }

    public static zzzy zza() {
        return (zzzy) zzb.zzw();
    }

    static /* synthetic */ void zzd(zzzz zzzz, String str) {
        zzagw zzagw = zzzz.zzf;
        if (!zzagw.zzc()) {
            zzzz.zzf = zzago.zzC(zzagw);
        }
        zzzz.zzf.add(str);
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzago.zzF(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0002\u0000\u0001င\u0000\u0002\u001a\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006\u001a", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        } else if (i11 == 3) {
            return new zzzz();
        } else {
            if (i11 == 4) {
                return new zzzy((zzyp) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
