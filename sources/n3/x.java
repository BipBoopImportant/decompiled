package N3;

import N3.J;
import N3.y;
import t3.C5950a;
import t3.N;

public final class x implements J {

    /* renamed from: a  reason: collision with root package name */
    private final y f38939a;

    /* renamed from: b  reason: collision with root package name */
    private final long f38940b;

    public x(y yVar, long j10) {
        this.f38939a = yVar;
        this.f38940b = j10;
    }

    private K a(long j10, long j11) {
        return new K((j10 * 1000000) / ((long) this.f38939a.f38945e), this.f38940b + j11);
    }

    public J.a c(long j10) {
        C5950a.i(this.f38939a.f38951k);
        y yVar = this.f38939a;
        y.a aVar = yVar.f38951k;
        long[] jArr = aVar.f38953a;
        long[] jArr2 = aVar.f38954b;
        int h10 = N.h(jArr, yVar.i(j10), true, false);
        long j11 = 0;
        long j12 = h10 == -1 ? 0 : jArr[h10];
        if (h10 != -1) {
            j11 = jArr2[h10];
        }
        K a10 = a(j12, j11);
        if (a10.f38766a == j10 || h10 == jArr.length - 1) {
            return new J.a(a10);
        }
        int i10 = h10 + 1;
        return new J.a(a10, a(jArr[i10], jArr2[i10]));
    }

    public boolean f() {
        return true;
    }

    public long l() {
        return this.f38939a.f();
    }
}
