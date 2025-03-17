package com.google.android.gms.internal.vision;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class S0 extends C7469b0<Integer> implements C7466a1<Integer>, L1, RandomAccess {

    /* renamed from: d  reason: collision with root package name */
    private static final S0 f49267d;

    /* renamed from: b  reason: collision with root package name */
    private int[] f49268b;

    /* renamed from: c  reason: collision with root package name */
    private int f49269c;

    static {
        S0 s02 = new S0(new int[0], 0);
        f49267d = s02;
        s02.zzb();
    }

    S0() {
        this(new int[10], 0);
    }

    public static S0 k() {
        return f49267d;
    }

    private final void m(int i10) {
        if (i10 < 0 || i10 >= this.f49269c) {
            throw new IndexOutOfBoundsException(p(i10));
        }
    }

    private final String p(int i10) {
        int i11 = this.f49269c;
        StringBuilder sb2 = new StringBuilder(35);
        sb2.append("Index:");
        sb2.append(i10);
        sb2.append(", Size:");
        sb2.append(i11);
        return sb2.toString();
    }

    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        int intValue = ((Integer) obj).intValue();
        b();
        if (i10 < 0 || i10 > (i11 = this.f49269c)) {
            throw new IndexOutOfBoundsException(p(i10));
        }
        int[] iArr = this.f49268b;
        if (i11 < iArr.length) {
            System.arraycopy(iArr, i10, iArr, i10 + 1, i11 - i10);
        } else {
            int[] iArr2 = new int[(((i11 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            System.arraycopy(this.f49268b, i10, iArr2, i10 + 1, this.f49269c - i10);
            this.f49268b = iArr2;
        }
        this.f49268b[i10] = intValue;
        this.f49269c++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Integer> collection) {
        b();
        U0.d(collection);
        if (!(collection instanceof S0)) {
            return super.addAll(collection);
        }
        S0 s02 = (S0) collection;
        int i10 = s02.f49269c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f49269c;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            int[] iArr = this.f49268b;
            if (i12 > iArr.length) {
                this.f49268b = Arrays.copyOf(iArr, i12);
            }
            System.arraycopy(s02.f49268b, 0, this.f49268b, this.f49269c, s02.f49269c);
            this.f49269c = i12;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final /* synthetic */ C7466a1 c(int i10) {
        if (i10 >= this.f49269c) {
            return new S0(Arrays.copyOf(this.f49268b, i10), this.f49269c);
        }
        throw new IllegalArgumentException();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S0)) {
            return super.equals(obj);
        }
        S0 s02 = (S0) obj;
        if (this.f49269c != s02.f49269c) {
            return false;
        }
        int[] iArr = s02.f49268b;
        for (int i10 = 0; i10 < this.f49269c; i10++) {
            if (this.f49268b[i10] != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i10) {
        return Integer.valueOf(i(i10));
    }

    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f49269c; i11++) {
            i10 = (i10 * 31) + this.f49268b[i11];
        }
        return i10;
    }

    public final int i(int i10) {
        m(i10);
        return this.f49268b[i10];
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f49268b[i10] == intValue) {
                return i10;
            }
        }
        return -1;
    }

    public final void j(int i10) {
        b();
        int i11 = this.f49269c;
        int[] iArr = this.f49268b;
        if (i11 == iArr.length) {
            int[] iArr2 = new int[(((i11 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i11);
            this.f49268b = iArr2;
        }
        int[] iArr3 = this.f49268b;
        int i12 = this.f49269c;
        this.f49269c = i12 + 1;
        iArr3[i12] = i10;
    }

    public final /* synthetic */ Object remove(int i10) {
        b();
        m(i10);
        int[] iArr = this.f49268b;
        int i11 = iArr[i10];
        int i12 = this.f49269c;
        if (i10 < i12 - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (i12 - i10) - 1);
        }
        this.f49269c--;
        this.modCount++;
        return Integer.valueOf(i11);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i10, int i11) {
        b();
        if (i11 >= i10) {
            int[] iArr = this.f49268b;
            System.arraycopy(iArr, i11, iArr, i10, this.f49269c - i11);
            this.f49269c -= i11 - i10;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i10, Object obj) {
        int intValue = ((Integer) obj).intValue();
        b();
        m(i10);
        int[] iArr = this.f49268b;
        int i11 = iArr[i10];
        iArr[i10] = intValue;
        return Integer.valueOf(i11);
    }

    public final int size() {
        return this.f49269c;
    }

    private S0(int[] iArr, int i10) {
        this.f49268b = iArr;
        this.f49269c = i10;
    }

    public final /* synthetic */ boolean add(Object obj) {
        j(((Integer) obj).intValue());
        return true;
    }
}
