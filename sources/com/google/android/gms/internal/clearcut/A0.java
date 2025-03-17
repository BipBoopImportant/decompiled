package com.google.android.gms.internal.clearcut;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class A0 extends C7223t<Long> implements C7201l0<Long>, RandomAccess {

    /* renamed from: d  reason: collision with root package name */
    private static final A0 f48136d;

    /* renamed from: b  reason: collision with root package name */
    private long[] f48137b;

    /* renamed from: c  reason: collision with root package name */
    private int f48138c;

    static {
        A0 a02 = new A0();
        f48136d = a02;
        a02.zzv();
    }

    A0() {
        this(new long[10], 0);
    }

    private final void j(int i10) {
        if (i10 < 0 || i10 >= this.f48138c) {
            throw new IndexOutOfBoundsException(k(i10));
        }
    }

    private final String k(int i10) {
        int i11 = this.f48138c;
        StringBuilder sb2 = new StringBuilder(35);
        sb2.append("Index:");
        sb2.append(i10);
        sb2.append(", Size:");
        sb2.append(i11);
        return sb2.toString();
    }

    private final void m(int i10, long j10) {
        int i11;
        b();
        if (i10 < 0 || i10 > (i11 = this.f48138c)) {
            throw new IndexOutOfBoundsException(k(i10));
        }
        long[] jArr = this.f48137b;
        if (i11 < jArr.length) {
            System.arraycopy(jArr, i10, jArr, i10 + 1, i11 - i10);
        } else {
            long[] jArr2 = new long[(((i11 * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            System.arraycopy(this.f48137b, i10, jArr2, i10 + 1, this.f48138c - i10);
            this.f48137b = jArr2;
        }
        this.f48137b[i10] = j10;
        this.f48138c++;
        this.modCount++;
    }

    public final /* synthetic */ C7201l0 R0(int i10) {
        if (i10 >= this.f48138c) {
            return new A0(Arrays.copyOf(this.f48137b, i10), this.f48138c);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ void add(int i10, Object obj) {
        m(i10, ((Long) obj).longValue());
    }

    public final boolean addAll(Collection<? extends Long> collection) {
        b();
        C7192i0.a(collection);
        if (!(collection instanceof A0)) {
            return super.addAll(collection);
        }
        A0 a02 = (A0) collection;
        int i10 = a02.f48138c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f48138c;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            long[] jArr = this.f48137b;
            if (i12 > jArr.length) {
                this.f48137b = Arrays.copyOf(jArr, i12);
            }
            System.arraycopy(a02.f48137b, 0, this.f48137b, this.f48138c, a02.f48138c);
            this.f48138c = i12;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A0)) {
            return super.equals(obj);
        }
        A0 a02 = (A0) obj;
        if (this.f48138c != a02.f48138c) {
            return false;
        }
        long[] jArr = a02.f48137b;
        for (int i10 = 0; i10 < this.f48138c; i10++) {
            if (this.f48137b[i10] != jArr[i10]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i10) {
        return Long.valueOf(i(i10));
    }

    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f48138c; i11++) {
            i10 = (i10 * 31) + C7192i0.j(this.f48137b[i11]);
        }
        return i10;
    }

    public final long i(int i10) {
        j(i10);
        return this.f48137b[i10];
    }

    public final void p(long j10) {
        m(this.f48138c, j10);
    }

    public final /* synthetic */ Object remove(int i10) {
        b();
        j(i10);
        long[] jArr = this.f48137b;
        long j10 = jArr[i10];
        int i11 = this.f48138c;
        if (i10 < i11 - 1) {
            System.arraycopy(jArr, i10 + 1, jArr, i10, i11 - i10);
        }
        this.f48138c--;
        this.modCount++;
        return Long.valueOf(j10);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i10, int i11) {
        b();
        if (i11 >= i10) {
            long[] jArr = this.f48137b;
            System.arraycopy(jArr, i11, jArr, i10, this.f48138c - i11);
            this.f48138c -= i11 - i10;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i10, Object obj) {
        long longValue = ((Long) obj).longValue();
        b();
        j(i10);
        long[] jArr = this.f48137b;
        long j10 = jArr[i10];
        jArr[i10] = longValue;
        return Long.valueOf(j10);
    }

    public final int size() {
        return this.f48138c;
    }

    private A0(long[] jArr, int i10) {
        this.f48137b = jArr;
        this.f48138c = i10;
    }

    public final boolean remove(Object obj) {
        b();
        for (int i10 = 0; i10 < this.f48138c; i10++) {
            if (obj.equals(Long.valueOf(this.f48137b[i10]))) {
                long[] jArr = this.f48137b;
                System.arraycopy(jArr, i10 + 1, jArr, i10, this.f48138c - i10);
                this.f48138c--;
                this.modCount++;
                return true;
            }
        }
        return false;
    }
}
