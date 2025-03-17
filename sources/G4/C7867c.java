package g4;

import N3.J;
import N3.K;
import android.util.Pair;
import b4.l;
import t3.N;

/* renamed from: g4.c  reason: case insensitive filesystem */
final class C7867c implements C7871g {

    /* renamed from: a  reason: collision with root package name */
    private final long[] f51224a;

    /* renamed from: b  reason: collision with root package name */
    private final long[] f51225b;

    /* renamed from: c  reason: collision with root package name */
    private final long f51226c;

    private C7867c(long[] jArr, long[] jArr2, long j10) {
        this.f51224a = jArr;
        this.f51225b = jArr2;
        this.f51226c = j10 == -9223372036854775807L ? N.P0(jArr2[jArr2.length - 1]) : j10;
    }

    public static C7867c a(long j10, l lVar, long j11) {
        int length = lVar.f45402e.length;
        int i10 = length + 1;
        long[] jArr = new long[i10];
        long[] jArr2 = new long[i10];
        jArr[0] = j10;
        long j12 = 0;
        jArr2[0] = 0;
        for (int i11 = 1; i11 <= length; i11++) {
            int i12 = i11 - 1;
            j10 += (long) (lVar.f45400c + lVar.f45402e[i12]);
            j12 += (long) (lVar.f45401d + lVar.f45403f[i12]);
            jArr[i11] = j10;
            jArr2[i11] = j12;
        }
        return new C7867c(jArr, jArr2, j11);
    }

    private static Pair<Long, Long> b(long j10, long[] jArr, long[] jArr2) {
        int h10 = N.h(jArr, j10, true, true);
        long j11 = jArr[h10];
        long j12 = jArr2[h10];
        int i10 = h10 + 1;
        if (i10 == jArr.length) {
            return Pair.create(Long.valueOf(j11), Long.valueOf(j12));
        }
        long j13 = jArr[i10];
        return Pair.create(Long.valueOf(j10), Long.valueOf(((long) ((j13 == j11 ? 0.0d : (((double) j10) - ((double) j11)) / ((double) (j13 - j11))) * ((double) (jArr2[i10] - j12)))) + j12));
    }

    public J.a c(long j10) {
        Pair<Long, Long> b10 = b(N.q1(N.q(j10, 0, this.f51226c)), this.f51225b, this.f51224a);
        return new J.a(new K(N.P0(((Long) b10.first).longValue()), ((Long) b10.second).longValue()));
    }

    public long e() {
        return -1;
    }

    public boolean f() {
        return true;
    }

    public long g(long j10) {
        return N.P0(((Long) b(j10, this.f51224a, this.f51225b).second).longValue());
    }

    public int k() {
        return -2147483647;
    }

    public long l() {
        return this.f51226c;
    }
}
