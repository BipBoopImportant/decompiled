package com.google.android.libraries.places.internal;

public final class zzpy extends zzago implements zzahx {
    /* access modifiers changed from: private */
    public static final zzpy zzb;
    private int zzd;
    private int zze = 1;
    private zzqa zzf;
    private zzqc zzg;
    private zzaey zzh;
    private zzqe zzi;
    private zzqi zzj;
    private byte zzk = 2;

    static {
        zzpy zzpy = new zzpy();
        zzb = zzpy;
        zzago.zzI(zzpy.class, zzpy);
    }

    private zzpy() {
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzk);
        }
        if (i11 == 2) {
            return zzago.zzF(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0001\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ᐉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005", new Object[]{"zzd", "zze", zzpx.zza, "zzf", "zzg", "zzh", "zzi", "zzj"});
        } else if (i11 == 3) {
            return new zzpy();
        } else {
            if (i11 == 4) {
                return new zzpw((zzpv) null);
            }
            if (i11 == 5) {
                return zzb;
            }
            this.zzk = obj == null ? (byte) 0 : 1;
            return null;
        }
    }
}
