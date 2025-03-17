package g4;

import N3.C6660F;
import N3.J;
import N3.K;
import t3.B;
import t3.N;
import t3.q;

final class h implements C7871g {

    /* renamed from: a  reason: collision with root package name */
    private final long[] f51250a;

    /* renamed from: b  reason: collision with root package name */
    private final long[] f51251b;

    /* renamed from: c  reason: collision with root package name */
    private final long f51252c;

    /* renamed from: d  reason: collision with root package name */
    private final long f51253d;

    /* renamed from: e  reason: collision with root package name */
    private final int f51254e;

    private h(long[] jArr, long[] jArr2, long j10, long j11, int i10) {
        this.f51250a = jArr;
        this.f51251b = jArr2;
        this.f51252c = j10;
        this.f51253d = j11;
        this.f51254e = i10;
    }

    public static h a(long j10, long j11, C6660F.a aVar, B b10) {
        int i10;
        long j12 = j10;
        C6660F.a aVar2 = aVar;
        B b11 = b10;
        b11.X(6);
        long q10 = j11 + ((long) aVar2.f38755c) + ((long) b10.q());
        int q11 = b10.q();
        if (q11 <= 0) {
            return null;
        }
        int i11 = aVar2.f38756d;
        long Z02 = N.Z0((long) q11, ((long) (i11 >= 32000 ? 1152 : 576)) * 1000000, (long) i11);
        int P10 = b10.P();
        int P11 = b10.P();
        int P12 = b10.P();
        b11.X(2);
        long j13 = j11 + ((long) aVar2.f38755c);
        long[] jArr = new long[P10];
        long[] jArr2 = new long[P10];
        int i12 = 0;
        while (i12 < P10) {
            int i13 = P11;
            jArr[i12] = (((long) i12) * Z02) / ((long) P10);
            long j14 = j13;
            jArr2[i12] = j14;
            if (P12 == 1) {
                i10 = b10.H();
            } else if (P12 == 2) {
                i10 = b10.P();
            } else if (P12 == 3) {
                i10 = b10.K();
            } else if (P12 != 4) {
                return null;
            } else {
                i10 = b10.L();
            }
            long j15 = (long) i10;
            int i14 = i13;
            j13 = j14 + (j15 * ((long) i14));
            i12++;
            B b12 = b10;
            P11 = i14;
            P10 = P10;
        }
        if (!(j12 == -1 || j12 == q10)) {
            q.h("VbriSeeker", "VBRI data size mismatch: " + j12 + ", " + q10);
        }
        if (q10 != j13) {
            q.h("VbriSeeker", "VBRI bytes and ToC mismatch (using max): " + q10 + ", " + j13 + "\nSeeking will be inaccurate.");
            q10 = Math.max(q10, j13);
        }
        return new h(jArr, jArr2, Z02, q10, aVar2.f38758f);
    }

    public J.a c(long j10) {
        int h10 = N.h(this.f51250a, j10, true, true);
        K k10 = new K(this.f51250a[h10], this.f51251b[h10]);
        if (k10.f38766a >= j10 || h10 == this.f51250a.length - 1) {
            return new J.a(k10);
        }
        int i10 = h10 + 1;
        return new J.a(k10, new K(this.f51250a[i10], this.f51251b[i10]));
    }

    public long e() {
        return this.f51253d;
    }

    public boolean f() {
        return true;
    }

    public long g(long j10) {
        return this.f51250a[N.h(this.f51251b, j10, true, true)];
    }

    public int k() {
        return this.f51254e;
    }

    public long l() {
        return this.f51252c;
    }
}
