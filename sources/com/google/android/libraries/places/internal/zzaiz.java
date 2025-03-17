package com.google.android.libraries.places.internal;

import java.util.Arrays;

public final class zzaiz {
    private static final zzaiz zza = new zzaiz(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzaiz(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.zze = -1;
        this.zzb = 0;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z10;
    }

    public static zzaiz zzc() {
        return zza;
    }

    static zzaiz zze(zzaiz zzaiz, zzaiz zzaiz2) {
        int i10 = zzaiz.zzb;
        int i11 = zzaiz2.zzb;
        int[] copyOf = Arrays.copyOf(zzaiz.zzc, 0);
        System.arraycopy(zzaiz2.zzc, 0, copyOf, 0, 0);
        Object[] copyOf2 = Arrays.copyOf(zzaiz.zzd, 0);
        System.arraycopy(zzaiz2.zzd, 0, copyOf2, 0, 0);
        return new zzaiz(0, copyOf, copyOf2, true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzaiz)) {
            return false;
        }
        zzaiz zzaiz = (zzaiz) obj;
        return true;
    }

    public final int hashCode() {
        return 506991;
    }

    public final int zza() {
        int i10 = this.zze;
        if (i10 != -1) {
            return i10;
        }
        this.zze = 0;
        return 0;
    }

    public final int zzb() {
        int i10 = this.zze;
        if (i10 != -1) {
            return i10;
        }
        this.zze = 0;
        return 0;
    }

    /* access modifiers changed from: package-private */
    public final zzaiz zzd(zzaiz zzaiz) {
        if (zzaiz.equals(zza)) {
            return this;
        }
        if (this.zzf) {
            int[] iArr = this.zzc;
            int length = iArr.length;
            System.arraycopy(zzaiz.zzc, 0, iArr, 0, 0);
            System.arraycopy(zzaiz.zzd, 0, this.zzd, 0, 0);
            this.zzb = 0;
            return this;
        }
        throw new UnsupportedOperationException();
    }

    public final void zzf() {
        if (this.zzf) {
            this.zzf = false;
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzg(StringBuilder sb2, int i10) {
    }

    private zzaiz() {
        this(0, new int[8], new Object[8], true);
    }
}
