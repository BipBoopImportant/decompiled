package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.h5  reason: case insensitive filesystem */
final class C7313h5 extends X3<Long> implements S4, D5, RandomAccess {

    /* renamed from: d  reason: collision with root package name */
    private static final long[] f48936d;

    /* renamed from: e  reason: collision with root package name */
    private static final C7313h5 f48937e;

    /* renamed from: b  reason: collision with root package name */
    private long[] f48938b;

    /* renamed from: c  reason: collision with root package name */
    private int f48939c;

    static {
        long[] jArr = new long[0];
        f48936d = jArr;
        f48937e = new C7313h5(jArr, 0, false);
    }

    C7313h5() {
        this(f48936d, 0, true);
    }

    public static C7313h5 j() {
        return f48937e;
    }

    private static int m(int i10) {
        return Math.max(((i10 * 3) / 2) + 1, 10);
    }

    private final String p(int i10) {
        int i11 = this.f48939c;
        return "Index:" + i10 + ", Size:" + i11;
    }

    private final void q(int i10) {
        if (i10 < 0 || i10 >= this.f48939c) {
            throw new IndexOutOfBoundsException(p(i10));
        }
    }

    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        long longValue = ((Long) obj).longValue();
        b();
        if (i10 < 0 || i10 > (i11 = this.f48939c)) {
            throw new IndexOutOfBoundsException(p(i10));
        }
        long[] jArr = this.f48938b;
        if (i11 < jArr.length) {
            System.arraycopy(jArr, i10, jArr, i10 + 1, i11 - i10);
        } else {
            long[] jArr2 = new long[m(jArr.length)];
            System.arraycopy(this.f48938b, 0, jArr2, 0, i10);
            System.arraycopy(this.f48938b, i10, jArr2, i10 + 1, this.f48939c - i10);
            this.f48938b = jArr2;
        }
        this.f48938b[i10] = longValue;
        this.f48939c++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Long> collection) {
        b();
        O4.e(collection);
        if (!(collection instanceof C7313h5)) {
            return super.addAll(collection);
        }
        C7313h5 h5Var = (C7313h5) collection;
        int i10 = h5Var.f48939c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f48939c;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            long[] jArr = this.f48938b;
            if (i12 > jArr.length) {
                this.f48938b = Arrays.copyOf(jArr, i12);
            }
            System.arraycopy(h5Var.f48938b, 0, this.f48938b, this.f48939c, h5Var.f48939c);
            this.f48939c = i12;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final long d(int i10) {
        q(i10);
        return this.f48938b[i10];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7313h5)) {
            return super.equals(obj);
        }
        C7313h5 h5Var = (C7313h5) obj;
        if (this.f48939c != h5Var.f48939c) {
            return false;
        }
        long[] jArr = h5Var.f48938b;
        for (int i10 = 0; i10 < this.f48939c; i10++) {
            if (this.f48938b[i10] != jArr[i10]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i10) {
        return Long.valueOf(d(i10));
    }

    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f48939c; i11++) {
            i10 = (i10 * 31) + O4.b(this.f48938b[i11]);
        }
        return i10;
    }

    public final void i(long j10) {
        b();
        int i10 = this.f48939c;
        long[] jArr = this.f48938b;
        if (i10 == jArr.length) {
            long[] jArr2 = new long[m(jArr.length)];
            System.arraycopy(this.f48938b, 0, jArr2, 0, this.f48939c);
            this.f48938b = jArr2;
        }
        long[] jArr3 = this.f48938b;
        int i11 = this.f48939c;
        this.f48939c = i11 + 1;
        jArr3[i11] = j10;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f48938b[i10] == longValue) {
                return i10;
            }
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public final void k(int i10) {
        long[] jArr = this.f48938b;
        if (i10 > jArr.length) {
            if (jArr.length == 0) {
                this.f48938b = new long[Math.max(i10, 10)];
                return;
            }
            int length = jArr.length;
            while (length < i10) {
                length = m(length);
            }
            this.f48938b = Arrays.copyOf(this.f48938b, length);
        }
    }

    public final /* synthetic */ Object remove(int i10) {
        b();
        q(i10);
        long[] jArr = this.f48938b;
        long j10 = jArr[i10];
        int i11 = this.f48939c;
        if (i10 < i11 - 1) {
            System.arraycopy(jArr, i10 + 1, jArr, i10, (i11 - i10) - 1);
        }
        this.f48939c--;
        this.modCount++;
        return Long.valueOf(j10);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i10, int i11) {
        b();
        if (i11 >= i10) {
            long[] jArr = this.f48938b;
            System.arraycopy(jArr, i11, jArr, i10, this.f48939c - i11);
            this.f48939c -= i11 - i10;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i10, Object obj) {
        long longValue = ((Long) obj).longValue();
        b();
        q(i10);
        long[] jArr = this.f48938b;
        long j10 = jArr[i10];
        jArr[i10] = longValue;
        return Long.valueOf(j10);
    }

    public final int size() {
        return this.f48939c;
    }

    /* renamed from: z */
    public final S4 c(int i10) {
        if (i10 >= this.f48939c) {
            return new C7313h5(i10 == 0 ? f48936d : Arrays.copyOf(this.f48938b, i10), this.f48939c, true);
        }
        throw new IllegalArgumentException();
    }

    private C7313h5(long[] jArr, int i10, boolean z10) {
        super(z10);
        this.f48938b = jArr;
        this.f48939c = i10;
    }

    public final /* synthetic */ boolean add(Object obj) {
        i(((Long) obj).longValue());
        return true;
    }
}
