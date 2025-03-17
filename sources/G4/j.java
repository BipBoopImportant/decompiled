package g4;

import N3.C6660F;
import N3.J;
import N3.K;
import t3.C5950a;
import t3.N;

final class j implements C7871g {

    /* renamed from: a  reason: collision with root package name */
    private final long f51261a;

    /* renamed from: b  reason: collision with root package name */
    private final int f51262b;

    /* renamed from: c  reason: collision with root package name */
    private final long f51263c;

    /* renamed from: d  reason: collision with root package name */
    private final int f51264d;

    /* renamed from: e  reason: collision with root package name */
    private final long f51265e;

    /* renamed from: f  reason: collision with root package name */
    private final long f51266f;

    /* renamed from: g  reason: collision with root package name */
    private final long[] f51267g;

    private j(long j10, int i10, long j11, int i11) {
        this(j10, i10, j11, i11, -1, (long[]) null);
    }

    public static j a(i iVar, long j10) {
        long[] jArr;
        long a10 = iVar.a();
        if (a10 == -9223372036854775807L) {
            return null;
        }
        long j11 = iVar.f51257c;
        if (j11 == -1 || (jArr = iVar.f51260f) == null) {
            C6660F.a aVar = iVar.f51255a;
            return new j(j10, aVar.f38755c, a10, aVar.f38758f);
        }
        C6660F.a aVar2 = iVar.f51255a;
        return new j(j10, aVar2.f38755c, a10, aVar2.f38758f, j11, jArr);
    }

    private long b(int i10) {
        return (this.f51263c * ((long) i10)) / 100;
    }

    public J.a c(long j10) {
        if (!f()) {
            return new J.a(new K(0, this.f51261a + ((long) this.f51262b)));
        }
        long q10 = N.q(j10, 0, this.f51263c);
        double d10 = (((double) q10) * 100.0d) / ((double) this.f51263c);
        double d11 = 0.0d;
        if (d10 > 0.0d) {
            if (d10 >= 100.0d) {
                d11 = 256.0d;
            } else {
                int i10 = (int) d10;
                long[] jArr = (long[]) C5950a.i(this.f51267g);
                double d12 = (double) jArr[i10];
                d11 = d12 + ((d10 - ((double) i10)) * ((i10 == 99 ? 256.0d : (double) jArr[i10 + 1]) - d12));
            }
        }
        return new J.a(new K(q10, this.f51261a + N.q(Math.round((d11 / 256.0d) * ((double) this.f51265e)), (long) this.f51262b, this.f51265e - 1)));
    }

    public long e() {
        return this.f51266f;
    }

    public boolean f() {
        return this.f51267g != null;
    }

    public long g(long j10) {
        long j11 = j10 - this.f51261a;
        if (!f() || j11 <= ((long) this.f51262b)) {
            return 0;
        }
        long[] jArr = (long[]) C5950a.i(this.f51267g);
        double d10 = (((double) j11) * 256.0d) / ((double) this.f51265e);
        int h10 = N.h(jArr, (long) d10, true, true);
        long b10 = b(h10);
        long j12 = jArr[h10];
        int i10 = h10 + 1;
        long b11 = b(i10);
        long j13 = h10 == 99 ? 256 : jArr[i10];
        return b10 + Math.round((j12 == j13 ? 0.0d : (d10 - ((double) j12)) / ((double) (j13 - j12))) * ((double) (b11 - b10)));
    }

    public int k() {
        return this.f51264d;
    }

    public long l() {
        return this.f51263c;
    }

    private j(long j10, int i10, long j11, int i11, long j12, long[] jArr) {
        this.f51261a = j10;
        this.f51262b = i10;
        this.f51263c = j11;
        this.f51264d = i11;
        this.f51265e = j12;
        this.f51267g = jArr;
        this.f51266f = j12 != -1 ? j10 + j12 : -1;
    }
}
