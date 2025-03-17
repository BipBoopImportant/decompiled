package t3;

import java.util.NoSuchElementException;

public final class s {

    /* renamed from: a  reason: collision with root package name */
    private int f29545a;

    /* renamed from: b  reason: collision with root package name */
    private int f29546b;

    /* renamed from: c  reason: collision with root package name */
    private int f29547c;

    /* renamed from: d  reason: collision with root package name */
    private long[] f29548d;

    /* renamed from: e  reason: collision with root package name */
    private int f29549e;

    public s() {
        this(16);
    }

    public void a() {
        this.f29545a = 0;
        this.f29546b = -1;
        this.f29547c = 0;
    }

    public long b() {
        if (this.f29547c != 0) {
            return this.f29548d[this.f29545a];
        }
        throw new NoSuchElementException();
    }

    public boolean c() {
        return this.f29547c == 0;
    }

    public long d() {
        int i10 = this.f29547c;
        if (i10 != 0) {
            long[] jArr = this.f29548d;
            int i11 = this.f29545a;
            long j10 = jArr[i11];
            this.f29545a = this.f29549e & (i11 + 1);
            this.f29547c = i10 - 1;
            return j10;
        }
        throw new NoSuchElementException();
    }

    public s(int i10) {
        C5950a.a(i10 >= 0 && i10 <= 1073741824);
        i10 = i10 == 0 ? 1 : i10;
        i10 = Integer.bitCount(i10) != 1 ? Integer.highestOneBit(i10 - 1) << 1 : i10;
        this.f29545a = 0;
        this.f29546b = -1;
        this.f29547c = 0;
        long[] jArr = new long[i10];
        this.f29548d = jArr;
        this.f29549e = jArr.length - 1;
    }
}
