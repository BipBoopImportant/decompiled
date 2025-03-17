package com.google.android.libraries.places.internal;

import java.util.List;

final class zzagc implements zzajp {
    private final zzagb zza;

    private zzagc(zzagb zzagb) {
        byte[] bArr = zzagx.zzd;
        this.zza = zzagb;
        zzagb.zza = this;
    }

    public static zzagc zza(zzagb zzagb) {
        zzagc zzagc = zzagb.zza;
        return zzagc != null ? zzagc : new zzagc(zzagb);
    }

    public final void zzA(int i10, List list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.zza.zzo(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                int intValue = ((Integer) list.get(i13)).intValue();
                i12 += zzagb.zzx((intValue >> 31) ^ (intValue + intValue));
            }
            this.zza.zzq(i12);
            while (i11 < list.size()) {
                zzagb zzagb = this.zza;
                int intValue2 = ((Integer) list.get(i11)).intValue();
                zzagb.zzq((intValue2 >> 31) ^ (intValue2 + intValue2));
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            zzagb zzagb2 = this.zza;
            int intValue3 = ((Integer) list.get(i11)).intValue();
            zzagb2.zzp(i10, (intValue3 >> 31) ^ (intValue3 + intValue3));
            i11++;
        }
    }

    public final void zzB(int i10, long j10) {
        this.zza.zzr(i10, (j10 >> 63) ^ (j10 + j10));
    }

    public final void zzC(int i10, List list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.zza.zzo(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                long longValue = ((Long) list.get(i13)).longValue();
                i12 += zzagb.zzy((longValue >> 63) ^ (longValue + longValue));
            }
            this.zza.zzq(i12);
            while (i11 < list.size()) {
                zzagb zzagb = this.zza;
                long longValue2 = ((Long) list.get(i11)).longValue();
                zzagb.zzs((longValue2 >> 63) ^ (longValue2 + longValue2));
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            zzagb zzagb2 = this.zza;
            long longValue3 = ((Long) list.get(i11)).longValue();
            zzagb2.zzr(i10, (longValue3 >> 63) ^ (longValue3 + longValue3));
            i11++;
        }
    }

    public final void zzD(int i10, String str) {
        this.zza.zzm(i10, str);
    }

    public final void zzE(int i10, List list) {
        int i11 = 0;
        if (list instanceof zzahe) {
            zzahe zzahe = (zzahe) list;
            while (i11 < list.size()) {
                Object zze = zzahe.zze(i11);
                if (zze instanceof String) {
                    this.zza.zzm(i10, (String) zze);
                } else {
                    this.zza.zze(i10, (zzaft) zze);
                }
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzm(i10, (String) list.get(i11));
            i11++;
        }
    }

    public final void zzF(int i10, int i11) {
        this.zza.zzp(i10, i11);
    }

    public final void zzG(int i10, List list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.zza.zzo(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += zzagb.zzx(((Integer) list.get(i13)).intValue());
            }
            this.zza.zzq(i12);
            while (i11 < list.size()) {
                this.zza.zzq(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzp(i10, ((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    public final void zzH(int i10, long j10) {
        this.zza.zzr(i10, j10);
    }

    public final void zzI(int i10, List list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.zza.zzo(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += zzagb.zzy(((Long) list.get(i13)).longValue());
            }
            this.zza.zzq(i12);
            while (i11 < list.size()) {
                this.zza.zzs(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzr(i10, ((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    public final void zzb(int i10, boolean z10) {
        this.zza.zzd(i10, z10);
    }

    public final void zzc(int i10, List list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.zza.zzo(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Boolean) list.get(i13)).booleanValue();
                i12++;
            }
            this.zza.zzq(i12);
            while (i11 < list.size()) {
                this.zza.zzb(((Boolean) list.get(i11)).booleanValue() ? (byte) 1 : 0);
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzd(i10, ((Boolean) list.get(i11)).booleanValue());
            i11++;
        }
    }

    public final void zzd(int i10, zzaft zzaft) {
        this.zza.zze(i10, zzaft);
    }

    public final void zze(int i10, List list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.zza.zze(i10, (zzaft) list.get(i11));
        }
    }

    public final void zzf(int i10, double d10) {
        this.zza.zzh(i10, Double.doubleToRawLongBits(d10));
    }

    public final void zzg(int i10, List list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.zza.zzo(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Double) list.get(i13)).doubleValue();
                i12 += 8;
            }
            this.zza.zzq(i12);
            while (i11 < list.size()) {
                this.zza.zzi(Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzh(i10, Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
            i11++;
        }
    }

    public final void zzh(int i10, int i11) {
        this.zza.zzj(i10, i11);
    }

    public final void zzi(int i10, List list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.zza.zzo(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += zzagb.zzu(((Integer) list.get(i13)).intValue());
            }
            this.zza.zzq(i12);
            while (i11 < list.size()) {
                this.zza.zzk(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzj(i10, ((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    public final void zzj(int i10, int i11) {
        this.zza.zzf(i10, i11);
    }

    public final void zzk(int i10, List list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.zza.zzo(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Integer) list.get(i13)).intValue();
                i12 += 4;
            }
            this.zza.zzq(i12);
            while (i11 < list.size()) {
                this.zza.zzg(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzf(i10, ((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    public final void zzl(int i10, long j10) {
        this.zza.zzh(i10, j10);
    }

    public final void zzm(int i10, List list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.zza.zzo(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Long) list.get(i13)).longValue();
                i12 += 8;
            }
            this.zza.zzq(i12);
            while (i11 < list.size()) {
                this.zza.zzi(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzh(i10, ((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    public final void zzn(int i10, float f10) {
        this.zza.zzf(i10, Float.floatToRawIntBits(f10));
    }

    public final void zzo(int i10, List list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.zza.zzo(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Float) list.get(i13)).floatValue();
                i12 += 4;
            }
            this.zza.zzq(i12);
            while (i11 < list.size()) {
                this.zza.zzg(Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzf(i10, Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
            i11++;
        }
    }

    public final void zzp(int i10, Object obj, zzaih zzaih) {
        zzagb zzagb = this.zza;
        zzagb.zzo(i10, 3);
        zzaih.zzf((zzahw) obj, zzagb.zza);
        zzagb.zzo(i10, 4);
    }

    public final void zzq(int i10, int i11) {
        this.zza.zzj(i10, i11);
    }

    public final void zzr(int i10, List list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.zza.zzo(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += zzagb.zzu(((Integer) list.get(i13)).intValue());
            }
            this.zza.zzq(i12);
            while (i11 < list.size()) {
                this.zza.zzk(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzj(i10, ((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    public final void zzs(int i10, long j10) {
        this.zza.zzr(i10, j10);
    }

    public final void zzt(int i10, List list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.zza.zzo(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                i12 += zzagb.zzy(((Long) list.get(i13)).longValue());
            }
            this.zza.zzq(i12);
            while (i11 < list.size()) {
                this.zza.zzs(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzr(i10, ((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    public final void zzu(int i10, Object obj, zzaih zzaih) {
        zzahw zzahw = (zzahw) obj;
        zzafy zzafy = (zzafy) this.zza;
        zzafy.zzq((i10 << 3) | 2);
        zzafy.zzq(((zzafg) zzahw).zzr(zzaih));
        zzaih.zzf(zzahw, zzafy.zza);
    }

    public final void zzv(int i10, int i11) {
        this.zza.zzf(i10, i11);
    }

    public final void zzw(int i10, List list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.zza.zzo(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Integer) list.get(i13)).intValue();
                i12 += 4;
            }
            this.zza.zzq(i12);
            while (i11 < list.size()) {
                this.zza.zzg(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzf(i10, ((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    public final void zzx(int i10, long j10) {
        this.zza.zzh(i10, j10);
    }

    public final void zzy(int i10, List list, boolean z10) {
        int i11 = 0;
        if (z10) {
            this.zza.zzo(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Long) list.get(i13)).longValue();
                i12 += 8;
            }
            this.zza.zzq(i12);
            while (i11 < list.size()) {
                this.zza.zzi(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        while (i11 < list.size()) {
            this.zza.zzh(i10, ((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    public final void zzz(int i10, int i11) {
        this.zza.zzp(i10, (i11 >> 31) ^ (i11 + i11));
    }
}
