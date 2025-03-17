package com.google.android.libraries.places.internal;

import java.nio.charset.Charset;

class zzafq extends zzafp {
    protected final byte[] zza;

    zzafq(byte[] bArr) {
        bArr.getClass();
        this.zza = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzaft) || zzd() != ((zzaft) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (!(obj instanceof zzafq)) {
            return obj.equals(this);
        }
        zzafq zzafq = (zzafq) obj;
        int zzk = zzk();
        int zzk2 = zzafq.zzk();
        if (zzk != 0 && zzk2 != 0 && zzk != zzk2) {
            return false;
        }
        int zzd = zzd();
        if (zzd > zzafq.zzd()) {
            throw new IllegalArgumentException("Length too large: " + zzd + zzd());
        } else if (zzd <= zzafq.zzd()) {
            byte[] bArr = this.zza;
            byte[] bArr2 = zzafq.zza;
            zzafq.zzc();
            int i10 = 0;
            int i11 = 0;
            while (i10 < zzd) {
                if (bArr[i10] != bArr2[i11]) {
                    return false;
                }
                i10++;
                i11++;
            }
            return true;
        } else {
            throw new IllegalArgumentException("Ran off end of other: 0, " + zzd + ", " + zzafq.zzd());
        }
    }

    public byte zza(int i10) {
        return this.zza[i10];
    }

    /* access modifiers changed from: package-private */
    public byte zzb(int i10) {
        return this.zza[i10];
    }

    /* access modifiers changed from: protected */
    public int zzc() {
        return 0;
    }

    public int zzd() {
        return this.zza.length;
    }

    /* access modifiers changed from: protected */
    public final int zze(int i10, int i11, int i12) {
        return zzagx.zzb(i10, this.zza, 0, i12);
    }

    public final zzaft zzf(int i10, int i11) {
        zzaft.zzj(0, i11, zzd());
        return i11 == 0 ? zzaft.zzb : new zzafn(this.zza, 0, i11);
    }

    /* access modifiers changed from: protected */
    public final String zzg(Charset charset) {
        return new String(this.zza, 0, zzd(), charset);
    }

    /* access modifiers changed from: package-private */
    public final void zzh(zzafj zzafj) {
        ((zzafy) zzafj).zzc(this.zza, 0, zzd());
    }

    public final boolean zzi() {
        return zzajm.zze(this.zza, 0, zzd());
    }
}
