package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C5172z;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

final class I extends C5150c<Long> implements C5172z.h, RandomAccess, b0 {

    /* renamed from: d  reason: collision with root package name */
    private static final I f21249d = new I(new long[0], 0, false);

    /* renamed from: b  reason: collision with root package name */
    private long[] f21250b;

    /* renamed from: c  reason: collision with root package name */
    private int f21251c;

    I() {
        this(new long[10], 0, true);
    }

    private void k(int i10, long j10) {
        int i11;
        b();
        if (i10 < 0 || i10 > (i11 = this.f21251c)) {
            throw new IndexOutOfBoundsException(s(i10));
        }
        long[] jArr = this.f21250b;
        if (i11 < jArr.length) {
            System.arraycopy(jArr, i10, jArr, i10 + 1, i11 - i10);
        } else {
            long[] jArr2 = new long[(((i11 * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            System.arraycopy(this.f21250b, i10, jArr2, i10 + 1, this.f21251c - i10);
            this.f21250b = jArr2;
        }
        this.f21250b[i10] = j10;
        this.f21251c++;
        this.modCount++;
    }

    private void p(int i10) {
        if (i10 < 0 || i10 >= this.f21251c) {
            throw new IndexOutOfBoundsException(s(i10));
        }
    }

    private String s(int i10) {
        return "Index:" + i10 + ", Size:" + this.f21251c;
    }

    public long A(int i10, long j10) {
        b();
        p(i10);
        long[] jArr = this.f21250b;
        long j11 = jArr[i10];
        jArr[i10] = j10;
        return j11;
    }

    public boolean addAll(Collection<? extends Long> collection) {
        b();
        C5172z.a(collection);
        if (!(collection instanceof I)) {
            return super.addAll(collection);
        }
        I i10 = (I) collection;
        int i11 = i10.f21251c;
        if (i11 == 0) {
            return false;
        }
        int i12 = this.f21251c;
        if (Integer.MAX_VALUE - i12 >= i11) {
            int i13 = i12 + i11;
            long[] jArr = this.f21250b;
            if (i13 > jArr.length) {
                this.f21250b = Arrays.copyOf(jArr, i13);
            }
            System.arraycopy(i10.f21250b, 0, this.f21250b, this.f21251c, i10.f21251c);
            this.f21251c = i13;
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
        if (this.f21251c != i10.f21251c) {
            return false;
        }
        long[] jArr = i10.f21250b;
        for (int i11 = 0; i11 < this.f21251c; i11++) {
            if (this.f21250b[i11] != jArr[i11]) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f21251c; i11++) {
            i10 = (i10 * 31) + C5172z.f(this.f21250b[i11]);
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
            if (this.f21250b[i10] == longValue) {
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
        int i10 = this.f21251c;
        long[] jArr = this.f21250b;
        if (i10 == jArr.length) {
            long[] jArr2 = new long[(((i10 * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            this.f21250b = jArr2;
        }
        long[] jArr3 = this.f21250b;
        int i11 = this.f21251c;
        this.f21251c = i11 + 1;
        jArr3[i11] = j10;
    }

    /* renamed from: q */
    public Long get(int i10) {
        return Long.valueOf(r(i10));
    }

    public long r(int i10) {
        p(i10);
        return this.f21250b[i10];
    }

    /* access modifiers changed from: protected */
    public void removeRange(int i10, int i11) {
        b();
        if (i11 >= i10) {
            long[] jArr = this.f21250b;
            System.arraycopy(jArr, i11, jArr, i10, this.f21251c - i11);
            this.f21251c -= i11 - i10;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public int size() {
        return this.f21251c;
    }

    /* renamed from: t */
    public C5172z.h f(int i10) {
        if (i10 >= this.f21251c) {
            return new I(Arrays.copyOf(this.f21250b, i10), this.f21251c, true);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: x */
    public Long remove(int i10) {
        b();
        p(i10);
        long[] jArr = this.f21250b;
        long j10 = jArr[i10];
        int i11 = this.f21251c;
        if (i10 < i11 - 1) {
            System.arraycopy(jArr, i10 + 1, jArr, i10, (i11 - i10) - 1);
        }
        this.f21251c--;
        this.modCount++;
        return Long.valueOf(j10);
    }

    /* renamed from: y */
    public Long set(int i10, Long l10) {
        return Long.valueOf(A(i10, l10.longValue()));
    }

    private I(long[] jArr, int i10, boolean z10) {
        super(z10);
        this.f21250b = jArr;
        this.f21251c = i10;
    }
}
