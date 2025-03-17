package com.google.android.libraries.places.internal;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

public abstract class zzaft implements Iterable, Serializable {
    private static final Comparator zza = new zzafl();
    public static final zzaft zzb = new zzafq(zzagx.zzd);
    private static final zzafs zzd = new zzafs((zzafr) null);
    private int zzc = 0;

    static {
        int i10 = zzafi.zza;
    }

    zzaft() {
    }

    static int zzj(int i10, int i11, int i12) {
        if (((i12 - i11) | i11) >= 0) {
            return i11;
        }
        throw new IndexOutOfBoundsException("End index: " + i11 + " >= " + i12);
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i10 = this.zzc;
        if (i10 == 0) {
            int zzd2 = zzd();
            i10 = zze(zzd2, 0, zzd2);
            if (i10 == 0) {
                i10 = 1;
            }
            this.zzc = i10;
        }
        return i10;
    }

    public final /* synthetic */ Iterator iterator() {
        return new zzafk(this);
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(zzd()), zzd() <= 50 ? zzaiw.zza(this) : zzaiw.zza(zzf(0, 47)).concat("...")});
    }

    public abstract byte zza(int i10);

    /* access modifiers changed from: package-private */
    public abstract byte zzb(int i10);

    public abstract int zzd();

    /* access modifiers changed from: protected */
    public abstract int zze(int i10, int i11, int i12);

    public abstract zzaft zzf(int i10, int i11);

    /* access modifiers changed from: protected */
    public abstract String zzg(Charset charset);

    /* access modifiers changed from: package-private */
    public abstract void zzh(zzafj zzafj);

    public abstract boolean zzi();

    /* access modifiers changed from: protected */
    public final int zzk() {
        return this.zzc;
    }

    public final String zzl(Charset charset) {
        return zzd() == 0 ? "" : zzg(charset);
    }
}
