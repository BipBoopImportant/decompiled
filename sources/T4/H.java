package t4;

import N3.C6667e;
import N3.C6679q;
import t3.B;
import t3.N;

final class H extends C6667e {

    private static final class a implements C6667e.f {

        /* renamed from: a  reason: collision with root package name */
        private final t3.H f56190a;

        /* renamed from: b  reason: collision with root package name */
        private final B f56191b = new B();

        /* renamed from: c  reason: collision with root package name */
        private final int f56192c;

        /* renamed from: d  reason: collision with root package name */
        private final int f56193d;

        public a(int i10, t3.H h10, int i11) {
            this.f56192c = i10;
            this.f56190a = h10;
            this.f56193d = i11;
        }

        private C6667e.C0613e c(B b10, long j10, long j11) {
            int a10;
            int i10;
            B b11 = b10;
            long j12 = j11;
            int g10 = b10.g();
            long j13 = -1;
            long j14 = -1;
            long j15 = -9223372036854775807L;
            while (b10.a() >= 188 && (i10 = a10 + 188) <= g10) {
                long c10 = M.c(b11, (a10 = M.a(b10.e(), b10.f(), g10)), this.f56192c);
                if (c10 != -9223372036854775807L) {
                    long b12 = this.f56190a.b(c10);
                    if (b12 > j10) {
                        return j15 == -9223372036854775807L ? C6667e.C0613e.d(b12, j12) : C6667e.C0613e.e(j12 + j14);
                    }
                    if (100000 + b12 > j10) {
                        return C6667e.C0613e.e(j12 + ((long) a10));
                    }
                    j14 = (long) a10;
                    j15 = b12;
                }
                b11.W(i10);
                j13 = (long) i10;
            }
            return j15 != -9223372036854775807L ? C6667e.C0613e.f(j15, j12 + j13) : C6667e.C0613e.f38870d;
        }

        public C6667e.C0613e a(C6679q qVar, long j10) {
            long position = qVar.getPosition();
            int min = (int) Math.min((long) this.f56193d, qVar.getLength() - position);
            this.f56191b.S(min);
            qVar.o(this.f56191b.e(), 0, min);
            return c(this.f56191b, j10, position);
        }

        public void b() {
            this.f56191b.T(N.f29467f);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public H(t3.H r17, long r18, long r20, int r22, int r23) {
        /*
            r16 = this;
            N3.e$b r1 = new N3.e$b
            r1.<init>()
            t4.H$a r2 = new t4.H$a
            r0 = r17
            r3 = r22
            r4 = r23
            r2.<init>(r3, r0, r4)
            r3 = 1
            long r7 = r18 + r3
            r13 = 188(0xbc, double:9.3E-322)
            r15 = 940(0x3ac, float:1.317E-42)
            r5 = 0
            r9 = 0
            r0 = r16
            r3 = r18
            r11 = r20
            r0.<init>(r1, r2, r3, r5, r7, r9, r11, r13, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t4.H.<init>(t3.H, long, long, int, int):void");
    }
}
