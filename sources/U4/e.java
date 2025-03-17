package u4;

import N3.J;
import N3.K;
import t3.N;

final class e implements J {

    /* renamed from: a  reason: collision with root package name */
    private final c f56835a;

    /* renamed from: b  reason: collision with root package name */
    private final int f56836b;

    /* renamed from: c  reason: collision with root package name */
    private final long f56837c;

    /* renamed from: d  reason: collision with root package name */
    private final long f56838d;

    /* renamed from: e  reason: collision with root package name */
    private final long f56839e;

    public e(c cVar, int i10, long j10, long j11) {
        this.f56835a = cVar;
        this.f56836b = i10;
        this.f56837c = j10;
        long j12 = (j11 - j10) / ((long) cVar.f56830e);
        this.f56838d = j12;
        this.f56839e = a(j12);
    }

    private long a(long j10) {
        return N.Z0(j10 * ((long) this.f56836b), 1000000, (long) this.f56835a.f56828c);
    }

    public J.a c(long j10) {
        long q10 = N.q((((long) this.f56835a.f56828c) * j10) / (((long) this.f56836b) * 1000000), 0, this.f56838d - 1);
        long j11 = this.f56837c + (((long) this.f56835a.f56830e) * q10);
        long a10 = a(q10);
        K k10 = new K(a10, j11);
        if (a10 >= j10 || q10 == this.f56838d - 1) {
            return new J.a(k10);
        }
        long j12 = q10 + 1;
        return new J.a(k10, new K(a(j12), this.f56837c + (((long) this.f56835a.f56830e) * j12)));
    }

    public boolean f() {
        return true;
    }

    public long l() {
        return this.f56839e;
    }
}
