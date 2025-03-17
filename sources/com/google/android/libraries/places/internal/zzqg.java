package com.google.android.libraries.places.internal;

public final class zzqg extends zzago implements zzahx {
    /* access modifiers changed from: private */
    public static final zzqg zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private long zzg;
    private long zzh;
    private int zzi;
    private String zzj = "";

    static {
        zzqg zzqg = new zzqg();
        zzb = zzqg;
        zzago.zzI(zzqg.class, zzqg);
    }

    private zzqg() {
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzago.zzF(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005င\u0004\u0006ဈ\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        } else if (i11 == 3) {
            return new zzqg();
        } else {
            if (i11 == 4) {
                return new zzqf((zzpv) null);
            }
            if (i11 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
