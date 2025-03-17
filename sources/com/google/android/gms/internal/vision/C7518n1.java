package com.google.android.gms.internal.vision;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.vision.n1  reason: case insensitive filesystem */
final class C7518n1 extends C7469b0<Long> implements C7466a1<Long>, L1, RandomAccess {

    /* renamed from: d  reason: collision with root package name */
    private static final C7518n1 f49356d;

    /* renamed from: b  reason: collision with root package name */
    private long[] f49357b;

    /* renamed from: c  reason: collision with root package name */
    private int f49358c;

    static {
        C7518n1 n1Var = new C7518n1(new long[0], 0);
        f49356d = n1Var;
        n1Var.zzb();
    }

    C7518n1() {
        this(new long[10], 0);
    }

    private final void j(int i10) {
        if (i10 < 0 || i10 >= this.f49358c) {
            throw new IndexOutOfBoundsException(k(i10));
        }
    }

    private final String k(int i10) {
        int i11 = this.f49358c;
        StringBuilder sb2 = new StringBuilder(35);
        sb2.append("Index:");
        sb2.append(i10);
        sb2.append(", Size:");
        sb2.append(i11);
        return sb2.toString();
    }

    public final /* synthetic */ void add(int i10, Object obj) {
        int i11;
        long longValue = ((Long) obj).longValue();
        b();
        if (i10 < 0 || i10 > (i11 = this.f49358c)) {
            throw new IndexOutOfBoundsException(k(i10));
        }
        long[] jArr = this.f49357b;
        if (i11 < jArr.length) {
            System.arraycopy(jArr, i10, jArr, i10 + 1, i11 - i10);
        } else {
            long[] jArr2 = new long[(((i11 * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            System.arraycopy(this.f49357b, i10, jArr2, i10 + 1, this.f49358c - i10);
            this.f49357b = jArr2;
        }
        this.f49357b[i10] = longValue;
        this.f49358c++;
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends Long> collection) {
        b();
        U0.d(collection);
        if (!(collection instanceof C7518n1)) {
            return super.addAll(collection);
        }
        C7518n1 n1Var = (C7518n1) collection;
        int i10 = n1Var.f49358c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f49358c;
        if (Integer.MAX_VALUE - i11 >= i10) {
            int i12 = i11 + i10;
            long[] jArr = this.f49357b;
            if (i12 > jArr.length) {
                this.f49357b = Arrays.copyOf(jArr, i12);
            }
            System.arraycopy(n1Var.f49357b, 0, this.f49357b, this.f49358c, n1Var.f49358c);
            this.f49358c = i12;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final /* synthetic */ C7466a1 c(int i10) {
        if (i10 >= this.f49358c) {
            return new C7518n1(Arrays.copyOf(this.f49357b, i10), this.f49358c);
        }
        throw new IllegalArgumentException();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final long d(int i10) {
        j(i10);
        return this.f49357b[i10];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7518n1)) {
            return super.equals(obj);
        }
        C7518n1 n1Var = (C7518n1) obj;
        if (this.f49358c != n1Var.f49358c) {
            return false;
        }
        long[] jArr = n1Var.f49357b;
        for (int i10 = 0; i10 < this.f49358c; i10++) {
            if (this.f49357b[i10] != jArr[i10]) {
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
        for (int i11 = 0; i11 < this.f49358c; i11++) {
            i10 = (i10 * 31) + U0.b(this.f49357b[i11]);
        }
        return i10;
    }

    public final void i(long j10) {
        b();
        int i10 = this.f49358c;
        long[] jArr = this.f49357b;
        if (i10 == jArr.length) {
            long[] jArr2 = new long[(((i10 * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            this.f49357b = jArr2;
        }
        long[] jArr3 = this.f49357b;
        int i11 = this.f49358c;
        this.f49358c = i11 + 1;
        jArr3[i11] = j10;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f49357b[i10] == longValue) {
                return i10;
            }
        }
        return -1;
    }

    public final /* synthetic */ Object remove(int i10) {
        b();
        j(i10);
        long[] jArr = this.f49357b;
        long j10 = jArr[i10];
        int i11 = this.f49358c;
        if (i10 < i11 - 1) {
            System.arraycopy(jArr, i10 + 1, jArr, i10, (i11 - i10) - 1);
        }
        this.f49358c--;
        this.modCount++;
        return Long.valueOf(j10);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i10, int i11) {
        b();
        if (i11 >= i10) {
            long[] jArr = this.f49357b;
            System.arraycopy(jArr, i11, jArr, i10, this.f49358c - i11);
            this.f49358c -= i11 - i10;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* synthetic */ Object set(int i10, Object obj) {
        long longValue = ((Long) obj).longValue();
        b();
        j(i10);
        long[] jArr = this.f49357b;
        long j10 = jArr[i10];
        jArr[i10] = longValue;
        return Long.valueOf(j10);
    }

    public final int size() {
        return this.f49358c;
    }

    private C7518n1(long[] jArr, int i10) {
        this.f49357b = jArr;
        this.f49358c = i10;
    }

    public final /* synthetic */ boolean add(Object obj) {
        i(((Long) obj).longValue());
        return true;
    }
}
