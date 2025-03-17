package t4;

import N3.C6667e;
import N3.C6679q;
import t3.B;
import t3.H;
import t3.N;

final class z extends C6667e {

    private static final class b implements C6667e.f {

        /* renamed from: a  reason: collision with root package name */
        private final H f56556a;

        /* renamed from: b  reason: collision with root package name */
        private final B f56557b;

        private C6667e.C0613e c(B b10, long j10, long j11) {
            int i10 = -1;
            int i11 = -1;
            long j12 = -9223372036854775807L;
            while (b10.a() >= 4) {
                if (z.k(b10.e(), b10.f()) != 442) {
                    b10.X(1);
                } else {
                    b10.X(4);
                    long l10 = C8773A.l(b10);
                    if (l10 != -9223372036854775807L) {
                        long b11 = this.f56556a.b(l10);
                        if (b11 > j10) {
                            return j12 == -9223372036854775807L ? C6667e.C0613e.d(b11, j11) : C6667e.C0613e.e(j11 + ((long) i11));
                        }
                        if (100000 + b11 > j10) {
                            return C6667e.C0613e.e(j11 + ((long) b10.f()));
                        }
                        i11 = b10.f();
                        j12 = b11;
                    }
                    d(b10);
                    i10 = b10.f();
                }
            }
            return j12 != -9223372036854775807L ? C6667e.C0613e.f(j12, j11 + ((long) i10)) : C6667e.C0613e.f38870d;
        }

        private static void d(B b10) {
            int g10 = b10.g();
            if (b10.a() < 10) {
                b10.W(g10);
                return;
            }
            b10.X(9);
            int H10 = b10.H() & 7;
            if (b10.a() < H10) {
                b10.W(g10);
                return;
            }
            b10.X(H10);
            if (b10.a() < 4) {
                b10.W(g10);
                return;
            }
            if (z.k(b10.e(), b10.f()) == 443) {
                b10.X(4);
                int P10 = b10.P();
                if (b10.a() < P10) {
                    b10.W(g10);
                    return;
                }
                b10.X(P10);
            }
            while (b10.a() >= 4 && (r1 = z.k(b10.e(), b10.f())) != 442 && r1 != 441 && (r1 >>> 8) == 1) {
                b10.X(4);
                if (b10.a() < 2) {
                    b10.W(g10);
                    return;
                } else {
                    b10.W(Math.min(b10.g(), b10.f() + b10.P()));
                }
            }
        }

        public C6667e.C0613e a(C6679q qVar, long j10) {
            long position = qVar.getPosition();
            int min = (int) Math.min(20000, qVar.getLength() - position);
            this.f56557b.S(min);
            qVar.o(this.f56557b.e(), 0, min);
            return c(this.f56557b, j10, position);
        }

        public void b() {
            this.f56557b.T(N.f29467f);
        }

        private b(H h10) {
            this.f56556a = h10;
            this.f56557b = new B();
        }
    }

    public z(H h10, long j10, long j11) {
        super(new C6667e.b(), new b(h10), j10, 0, j10 + 1, 0, j11, 188, 1000);
    }

    /* access modifiers changed from: private */
    public static int k(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & 255) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
    }
}
