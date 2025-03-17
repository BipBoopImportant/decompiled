package g4;

import N3.C6660F;
import t3.B;
import t3.N;

final class i {

    /* renamed from: a  reason: collision with root package name */
    public final C6660F.a f51255a;

    /* renamed from: b  reason: collision with root package name */
    public final long f51256b;

    /* renamed from: c  reason: collision with root package name */
    public final long f51257c;

    /* renamed from: d  reason: collision with root package name */
    public final int f51258d;

    /* renamed from: e  reason: collision with root package name */
    public final int f51259e;

    /* renamed from: f  reason: collision with root package name */
    public final long[] f51260f;

    private i(C6660F.a aVar, long j10, long j11, long[] jArr, int i10, int i11) {
        this.f51255a = new C6660F.a(aVar);
        this.f51256b = j10;
        this.f51257c = j11;
        this.f51260f = jArr;
        this.f51258d = i10;
        this.f51259e = i11;
    }

    public static i b(C6660F.a aVar, B b10) {
        long[] jArr;
        int i10;
        int i11;
        int q10 = b10.q();
        int L10 = (q10 & 1) != 0 ? b10.L() : -1;
        long J10 = (q10 & 2) != 0 ? b10.J() : -1;
        if ((q10 & 4) == 4) {
            long[] jArr2 = new long[100];
            for (int i12 = 0; i12 < 100; i12++) {
                jArr2[i12] = (long) b10.H();
            }
            jArr = jArr2;
        } else {
            jArr = null;
        }
        if ((q10 & 8) != 0) {
            b10.X(4);
        }
        if (b10.a() >= 24) {
            b10.X(21);
            int K10 = b10.K();
            i10 = K10 & 4095;
            i11 = (16773120 & K10) >> 12;
        } else {
            i11 = -1;
            i10 = -1;
        }
        return new i(aVar, (long) L10, J10, jArr, i11, i10);
    }

    public long a() {
        long j10 = this.f51256b;
        if (j10 == -1 || j10 == 0) {
            return -9223372036854775807L;
        }
        C6660F.a aVar = this.f51255a;
        return N.Y0((j10 * ((long) aVar.f38759g)) - 1, aVar.f38756d);
    }
}
