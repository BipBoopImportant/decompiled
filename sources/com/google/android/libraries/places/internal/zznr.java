package com.google.android.libraries.places.internal;

import java.math.RoundingMode;

class zznr extends zzns {
    final zzno zzb;
    final Character zzc;

    zznr(zzno zzno, Character ch2) {
        this.zzb = zzno;
        if (ch2 == null || !zzno.zzb('=')) {
            this.zzc = ch2;
            return;
        }
        throw new IllegalArgumentException(zzju.zza("Padding character %s was already in alphabet", ch2));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zznr) {
            zznr zznr = (zznr) obj;
            if (this.zzb.equals(zznr.zzb)) {
                Character ch2 = this.zzc;
                Character ch3 = zznr.zzc;
                if (ch2 != ch3) {
                    return ch2 != null && ch2.equals(ch3);
                }
                return true;
            }
        }
    }

    public final int hashCode() {
        int hashCode = this.zzb.hashCode();
        Character ch2 = this.zzc;
        return hashCode ^ (ch2 == null ? 0 : ch2.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BaseEncoding.");
        sb2.append(this.zzb);
        if (8 % this.zzb.zzb != 0) {
            if (this.zzc == null) {
                sb2.append(".omitPadding()");
            } else {
                sb2.append(".withPadChar('");
                sb2.append(this.zzc);
                sb2.append("')");
            }
        }
        return sb2.toString();
    }

    /* access modifiers changed from: package-private */
    public void zza(Appendable appendable, byte[] bArr, int i10, int i11) {
        int i12 = 0;
        zzjp.zzi(0, i11, bArr.length);
        while (i12 < i11) {
            zzc(appendable, bArr, i12, Math.min(this.zzb.zzd, i11 - i12));
            i12 += this.zzb.zzd;
        }
    }

    /* access modifiers changed from: package-private */
    public final int zzb(int i10) {
        zzno zzno = this.zzb;
        return zzno.zzc * zzady.zza(i10, zzno.zzd, RoundingMode.CEILING);
    }

    /* access modifiers changed from: package-private */
    public final void zzc(Appendable appendable, byte[] bArr, int i10, int i11) {
        zzjp.zzi(i10, i10 + i11, bArr.length);
        int i12 = 0;
        zzjp.zzd(i11 <= this.zzb.zzd);
        long j10 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            j10 = (j10 | ((long) (bArr[i10 + i13] & 255))) << 8;
        }
        int i14 = ((i11 + 1) * 8) - this.zzb.zzb;
        while (i12 < i11 * 8) {
            zzno zzno = this.zzb;
            appendable.append(zzno.zza(zzno.zza & ((int) (j10 >>> (i14 - i12)))));
            i12 += this.zzb.zzb;
        }
        if (this.zzc != null) {
            while (i12 < this.zzb.zzd * 8) {
                this.zzc.charValue();
                appendable.append('=');
                i12 += this.zzb.zzb;
            }
        }
    }

    zznr(String str, String str2, Character ch2) {
        this(new zzno(str, str2.toCharArray()), ch2);
    }
}
