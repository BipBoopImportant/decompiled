package com.google.android.libraries.places.internal;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class zzagp extends zzafh implements RandomAccess, zzagt, zzaid {
    private static final zzagp zza = new zzagp(new int[0], 0, false);
    private int[] zzb;
    private int zzc;

    zzagp() {
        this(new int[10], 0, true);
    }

    public static zzagp zze() {
        return zza;
    }

    private final String zzg(int i10) {
        int i11 = this.zzc;
        return "Index:" + i10 + ", Size:" + i11;
    }

    private final void zzh(int i10) {
        if (i10 < 0 || i10 >= this.zzc) {
            throw new IndexOutOfBoundsException(zzg(i10));
        }
    }

    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        int intValue = ((Integer) obj).intValue();
        zza();
        if (i10 < 0 || i10 > (i11 = this.zzc)) {
            throw new IndexOutOfBoundsException(zzg(i10));
        }
        int[] iArr = this.zzb;
        if (i11 < iArr.length) {
            System.arraycopy(iArr, i10, iArr, i10 + 1, i11 - i10);
        } else {
            int[] iArr2 = new int[(((i11 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            System.arraycopy(this.zzb, i10, iArr2, i10 + 1, this.zzc - i10);
            this.zzb = iArr2;
        }
        this.zzb[i10] = intValue;
        this.zzc++;
        this.modCount++;
    }

    public final boolean addAll(Collection collection) {
        zza();
        byte[] bArr = zzagx.zzd;
        collection.getClass();
        if (!(collection instanceof zzagp)) {
            return super.addAll(collection);
        }
        zzagp zzagp = (zzagp) collection;
        int i10 = zzagp.zzc;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.zzc;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            int[] iArr = this.zzb;
            if (i12 > iArr.length) {
                this.zzb = Arrays.copyOf(iArr, i12);
            }
            System.arraycopy(zzagp.zzb, 0, this.zzb, this.zzc, zzagp.zzc);
            this.zzc = i12;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzagp)) {
            return super.equals(obj);
        }
        zzagp zzagp = (zzagp) obj;
        if (this.zzc != zzagp.zzc) {
            return false;
        }
        int[] iArr = zzagp.zzb;
        for (int i10 = 0; i10 < this.zzc; i10++) {
            if (this.zzb[i10] != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i10) {
        zzh(i10);
        return Integer.valueOf(this.zzb[i10]);
    }

    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.zzc; i11++) {
            i10 = (i10 * 31) + this.zzb[i11];
        }
        return i10;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i10 = this.zzc;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.zzb[i11] == intValue) {
                return i11;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        zza();
        zzh(i10);
        int[] iArr = this.zzb;
        int i11 = iArr[i10];
        int i12 = this.zzc;
        if (i10 < i12 - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (i12 - i10) - 1);
        }
        this.zzc--;
        this.modCount++;
        return Integer.valueOf(i11);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i10, int i11) {
        zza();
        if (i11 >= i10) {
            int[] iArr = this.zzb;
            System.arraycopy(iArr, i11, iArr, i10, this.zzc - i11);
            this.zzc -= i11 - i10;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        int intValue = ((Integer) obj).intValue();
        zza();
        zzh(i10);
        int[] iArr = this.zzb;
        int i11 = iArr[i10];
        iArr[i10] = intValue;
        return Integer.valueOf(i11);
    }

    public final int size() {
        return this.zzc;
    }

    public final int zzd(int i10) {
        zzh(i10);
        return this.zzb[i10];
    }

    public final /* bridge */ /* synthetic */ zzagw zzf(int i10) {
        if (i10 >= this.zzc) {
            return new zzagp(Arrays.copyOf(this.zzb, i10), this.zzc, true);
        }
        throw new IllegalArgumentException();
    }

    private zzagp(int[] iArr, int i10, boolean z10) {
        super(z10);
        this.zzb = iArr;
        this.zzc = i10;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        int intValue = ((Integer) obj).intValue();
        zza();
        int i10 = this.zzc;
        int[] iArr = this.zzb;
        if (i10 == iArr.length) {
            int[] iArr2 = new int[(((i10 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            this.zzb = iArr2;
        }
        int[] iArr3 = this.zzb;
        int i11 = this.zzc;
        this.zzc = i11 + 1;
        iArr3[i11] = intValue;
        return true;
    }
}
