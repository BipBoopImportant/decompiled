package com.google.protobuf;

import com.google.protobuf.C9592z;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class I extends C9570c<Long> implements C9592z.h, RandomAccess, b0 {

    /* renamed from: d  reason: collision with root package name */
    private static final I f69218d = new I(new long[0], 0, false);

    /* renamed from: b  reason: collision with root package name */
    private long[] f69219b;

    /* renamed from: c  reason: collision with root package name */
    private int f69220c;

    I() {
        this(new long[10], 0, true);
    }

    private void k(int i10, long j10) {
        int i11;
        b();
        if (i10 < 0 || i10 > (i11 = this.f69220c)) {
            throw new IndexOutOfBoundsException(t(i10));
        }
        long[] jArr = this.f69219b;
        if (i11 < jArr.length) {
            System.arraycopy(jArr, i10, jArr, i10 + 1, i11 - i10);
        } else {
            long[] jArr2 = new long[(((i11 * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            System.arraycopy(this.f69219b, i10, jArr2, i10 + 1, this.f69220c - i10);
            this.f69219b = jArr2;
        }
        this.f69219b[i10] = j10;
        this.f69220c++;
        this.modCount++;
    }

    public static I p() {
        return f69218d;
    }

    private void q(int i10) {
        if (i10 < 0 || i10 >= this.f69220c) {
            throw new IndexOutOfBoundsException(t(i10));
        }
    }

    private String t(int i10) {
        return "Index:" + i10 + ", Size:" + this.f69220c;
    }

    public long A(int i10, long j10) {
        b();
        q(i10);
        long[] jArr = this.f69219b;
        long j11 = jArr[i10];
        jArr[i10] = j10;
        return j11;
    }

    public boolean addAll(Collection<? extends Long> collection) {
        b();
        C9592z.a(collection);
        if (!(collection instanceof I)) {
            return super.addAll(collection);
        }
        I i10 = (I) collection;
        int i11 = i10.f69220c;
        if (i11 == 0) {
            return false;
        }
        int i12 = this.f69220c;
        if (Integer.MAX_VALUE - i12 >= i11) {
            int i13 = i12 + i11;
            long[] jArr = this.f69219b;
            if (i13 > jArr.length) {
                this.f69219b = Arrays.copyOf(jArr, i13);
            }
            System.arraycopy(i10.f69219b, 0, this.f69219b, this.f69220c, i10.f69220c);
            this.f69220c = i13;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof I)) {
            return super.equals(obj);
        }
        I i10 = (I) obj;
        if (this.f69220c != i10.f69220c) {
            return false;
        }
        long[] jArr = i10.f69219b;
        for (int i11 = 0; i11 < this.f69220c; i11++) {
            if (this.f69219b[i11] != jArr[i11]) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f69220c; i11++) {
            i10 = (i10 * 31) + C9592z.f(this.f69219b[i11]);
        }
        return i10;
    }

    /* renamed from: i */
    public void add(int i10, Long l10) {
        k(i10, l10.longValue());
    }

    public int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f69219b[i10] == longValue) {
                return i10;
            }
        }
        return -1;
    }

    /* renamed from: j */
    public boolean add(Long l10) {
        m(l10.longValue());
        return true;
    }

    public void m(long j10) {
        b();
        int i10 = this.f69220c;
        long[] jArr = this.f69219b;
        if (i10 == jArr.length) {
            long[] jArr2 = new long[(((i10 * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            this.f69219b = jArr2;
        }
        long[] jArr3 = this.f69219b;
        int i11 = this.f69220c;
        this.f69220c = i11 + 1;
        jArr3[i11] = j10;
    }

    /* renamed from: r */
    public Long get(int i10) {
        return Long.valueOf(s(i10));
    }

    /* access modifiers changed from: protected */
    public void removeRange(int i10, int i11) {
        b();
        if (i11 >= i10) {
            long[] jArr = this.f69219b;
            System.arraycopy(jArr, i11, jArr, i10, this.f69220c - i11);
            this.f69220c -= i11 - i10;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public long s(int i10) {
        q(i10);
        return this.f69219b[i10];
    }

    public int size() {
        return this.f69220c;
    }

    /* renamed from: x */
    public Long remove(int i10) {
        b();
        q(i10);
        long[] jArr = this.f69219b;
        long j10 = jArr[i10];
        int i11 = this.f69220c;
        if (i10 < i11 - 1) {
            System.arraycopy(jArr, i10 + 1, jArr, i10, (i11 - i10) - 1);
        }
        this.f69220c--;
        this.modCount++;
        return Long.valueOf(j10);
    }

    /* renamed from: y */
    public Long set(int i10, Long l10) {
        return Long.valueOf(A(i10, l10.longValue()));
    }

    private I(long[] jArr, int i10, boolean z10) {
        super(z10);
        this.f69219b = jArr;
        this.f69220c = i10;
    }

    public C9592z.h f(int i10) {
        if (i10 >= this.f69220c) {
            return new I(Arrays.copyOf(this.f69219b, i10), this.f69220c, true);
        }
        throw new IllegalArgumentException();
    }
}
