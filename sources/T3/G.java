package t3;

import java.util.Arrays;

public final class G<V> {

    /* renamed from: a  reason: collision with root package name */
    private long[] f29452a;

    /* renamed from: b  reason: collision with root package name */
    private V[] f29453b;

    /* renamed from: c  reason: collision with root package name */
    private int f29454c;

    /* renamed from: d  reason: collision with root package name */
    private int f29455d;

    public G() {
        this(10);
    }

    private void b(long j10, V v10) {
        int i10 = this.f29454c;
        int i11 = this.f29455d;
        V[] vArr = this.f29453b;
        int length = (i10 + i11) % vArr.length;
        this.f29452a[length] = j10;
        vArr[length] = v10;
        this.f29455d = i11 + 1;
    }

    private void d(long j10) {
        int i10 = this.f29455d;
        if (i10 > 0) {
            if (j10 <= this.f29452a[((this.f29454c + i10) - 1) % this.f29453b.length]) {
                c();
            }
        }
    }

    private void e() {
        int length = this.f29453b.length;
        if (this.f29455d >= length) {
            int i10 = length * 2;
            long[] jArr = new long[i10];
            V[] f10 = f(i10);
            int i11 = this.f29454c;
            int i12 = length - i11;
            System.arraycopy(this.f29452a, i11, jArr, 0, i12);
            System.arraycopy(this.f29453b, this.f29454c, f10, 0, i12);
            int i13 = this.f29454c;
            if (i13 > 0) {
                System.arraycopy(this.f29452a, 0, jArr, i12, i13);
                System.arraycopy(this.f29453b, 0, f10, i12, this.f29454c);
            }
            this.f29452a = jArr;
            this.f29453b = f10;
            this.f29454c = 0;
        }
    }

    private static <V> V[] f(int i10) {
        return new Object[i10];
    }

    private V h(long j10, boolean z10) {
        V v10 = null;
        long j11 = Long.MAX_VALUE;
        while (this.f29455d > 0) {
            long j12 = j10 - this.f29452a[this.f29454c];
            if (j12 < 0 && (z10 || (-j12) >= j11)) {
                break;
            }
            v10 = k();
            j11 = j12;
        }
        return v10;
    }

    private V k() {
        C5950a.g(this.f29455d > 0);
        V[] vArr = this.f29453b;
        int i10 = this.f29454c;
        V v10 = vArr[i10];
        vArr[i10] = null;
        this.f29454c = (i10 + 1) % vArr.length;
        this.f29455d--;
        return v10;
    }

    public synchronized void a(long j10, V v10) {
        d(j10);
        e();
        b(j10, v10);
    }

    public synchronized void c() {
        this.f29454c = 0;
        this.f29455d = 0;
        Arrays.fill(this.f29453b, (Object) null);
    }

    public synchronized V g(long j10) {
        return h(j10, false);
    }

    public synchronized V i() {
        return this.f29455d == 0 ? null : k();
    }

    public synchronized V j(long j10) {
        return h(j10, true);
    }

    public synchronized int l() {
        return this.f29455d;
    }

    public G(int i10) {
        this.f29452a = new long[i10];
        this.f29453b = f(i10);
    }
}
