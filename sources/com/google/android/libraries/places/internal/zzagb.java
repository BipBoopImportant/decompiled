package com.google.android.libraries.places.internal;

import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class zzagb extends zzafj {
    public static final /* synthetic */ int zzb = 0;
    private static final Logger zzc = Logger.getLogger(zzagb.class.getName());
    /* access modifiers changed from: private */
    public static final boolean zzd = zzaji.zzx();
    zzagc zza;

    private zzagb() {
    }

    @Deprecated
    static int zzt(int i10, zzahw zzahw, zzaih zzaih) {
        int zzr = ((zzafg) zzahw).zzr(zzaih);
        int zzx = zzx(i10 << 3);
        return zzx + zzx + zzr;
    }

    public static int zzu(int i10) {
        if (i10 >= 0) {
            return zzx(i10);
        }
        return 10;
    }

    static int zzv(zzahw zzahw, zzaih zzaih) {
        int zzr = ((zzafg) zzahw).zzr(zzaih);
        return zzx(zzr) + zzr;
    }

    public static int zzw(String str) {
        int i10;
        try {
            i10 = zzajm.zzc(str);
        } catch (zzajl unused) {
            i10 = str.getBytes(zzagx.zzb).length;
        }
        return zzx(i10) + i10;
    }

    public static int zzx(int i10) {
        if ((i10 & -128) == 0) {
            return 1;
        }
        if ((i10 & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i10) == 0) {
            return 3;
        }
        return (i10 & -268435456) == 0 ? 4 : 5;
    }

    public static int zzy(long j10) {
        int i10;
        if ((-128 & j10) == 0) {
            return 1;
        }
        if (j10 < 0) {
            return 10;
        }
        if ((-34359738368L & j10) != 0) {
            j10 >>>= 28;
            i10 = 6;
        } else {
            i10 = 2;
        }
        if ((-2097152 & j10) != 0) {
            j10 >>>= 14;
            i10 += 2;
        }
        return (j10 & -16384) != 0 ? i10 + 1 : i10;
    }

    public static zzagb zzz(byte[] bArr, int i10, int i11) {
        return new zzafy(bArr, 0, i11);
    }

    public final void zzA() {
        if (zza() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzB(String str, zzajl zzajl) {
        zzc.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", zzajl);
        byte[] bytes = str.getBytes(zzagx.zzb);
        try {
            int length = bytes.length;
            zzq(length);
            zzl(bytes, 0, length);
        } catch (IndexOutOfBoundsException e10) {
            throw new zzafz(e10);
        }
    }

    public abstract int zza();

    public abstract void zzb(byte b10);

    public abstract void zzd(int i10, boolean z10);

    public abstract void zze(int i10, zzaft zzaft);

    public abstract void zzf(int i10, int i11);

    public abstract void zzg(int i10);

    public abstract void zzh(int i10, long j10);

    public abstract void zzi(long j10);

    public abstract void zzj(int i10, int i11);

    public abstract void zzk(int i10);

    public abstract void zzl(byte[] bArr, int i10, int i11);

    public abstract void zzm(int i10, String str);

    public abstract void zzo(int i10, int i11);

    public abstract void zzp(int i10, int i11);

    public abstract void zzq(int i10);

    public abstract void zzr(int i10, long j10);

    public abstract void zzs(long j10);

    /* synthetic */ zzagb(zzaga zzaga) {
    }
}
