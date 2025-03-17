package t3;

import java.util.Arrays;

public final class r {

    /* renamed from: a  reason: collision with root package name */
    private int f29543a;

    /* renamed from: b  reason: collision with root package name */
    private long[] f29544b;

    public r() {
        this(32);
    }

    public void a(long j10) {
        int i10 = this.f29543a;
        long[] jArr = this.f29544b;
        if (i10 == jArr.length) {
            this.f29544b = Arrays.copyOf(jArr, i10 * 2);
        }
        long[] jArr2 = this.f29544b;
        int i11 = this.f29543a;
        this.f29543a = i11 + 1;
        jArr2[i11] = j10;
    }

    public void b(long[] jArr) {
        int length = this.f29543a + jArr.length;
        long[] jArr2 = this.f29544b;
        if (length > jArr2.length) {
            this.f29544b = Arrays.copyOf(jArr2, Math.max(jArr2.length * 2, length));
        }
        System.arraycopy(jArr, 0, this.f29544b, this.f29543a, jArr.length);
        this.f29543a = length;
    }

    public long c(int i10) {
        if (i10 >= 0 && i10 < this.f29543a) {
            return this.f29544b[i10];
        }
        throw new IndexOutOfBoundsException("Invalid index " + i10 + ", size is " + this.f29543a);
    }

    public int d() {
        return this.f29543a;
    }

    public r(int i10) {
        this.f29544b = new long[i10];
    }
}
