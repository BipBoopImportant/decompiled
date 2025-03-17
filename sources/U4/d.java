package u4;

import N3.C6679q;
import android.util.Pair;
import t3.B;
import t3.C5950a;
import t3.N;
import t3.q;

final class d {

    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f56833a;

        /* renamed from: b  reason: collision with root package name */
        public final long f56834b;

        private a(int i10, long j10) {
            this.f56833a = i10;
            this.f56834b = j10;
        }

        public static a a(C6679q qVar, B b10) {
            qVar.o(b10.e(), 0, 8);
            b10.W(0);
            return new a(b10.q(), b10.x());
        }
    }

    public static boolean a(C6679q qVar) {
        B b10 = new B(8);
        int i10 = a.a(qVar, b10).f56833a;
        if (i10 != 1380533830 && i10 != 1380333108) {
            return false;
        }
        qVar.o(b10.e(), 0, 4);
        b10.W(0);
        int q10 = b10.q();
        if (q10 == 1463899717) {
            return true;
        }
        q.c("WavHeaderReader", "Unsupported form type: " + q10);
        return false;
    }

    public static c b(C6679q qVar) {
        byte[] bArr;
        B b10 = new B(16);
        a d10 = d(1718449184, qVar, b10);
        C5950a.g(d10.f56834b >= 16);
        qVar.o(b10.e(), 0, 16);
        b10.W(0);
        int z10 = b10.z();
        int z11 = b10.z();
        int y10 = b10.y();
        int y11 = b10.y();
        int z12 = b10.z();
        int z13 = b10.z();
        int i10 = ((int) d10.f56834b) - 16;
        if (i10 > 0) {
            byte[] bArr2 = new byte[i10];
            qVar.o(bArr2, 0, i10);
            bArr = bArr2;
        } else {
            bArr = N.f29467f;
        }
        qVar.k((int) (qVar.h() - qVar.getPosition()));
        return new c(z10, z11, y10, y11, z12, z13, bArr);
    }

    public static long c(C6679q qVar) {
        B b10 = new B(8);
        a a10 = a.a(qVar, b10);
        if (a10.f56833a != 1685272116) {
            qVar.f();
            return -1;
        }
        qVar.i(8);
        b10.W(0);
        qVar.o(b10.e(), 0, 8);
        long v10 = b10.v();
        qVar.k(((int) a10.f56834b) + 8);
        return v10;
    }

    private static a d(int i10, C6679q qVar, B b10) {
        a a10 = a.a(qVar, b10);
        while (a10.f56833a != i10) {
            q.h("WavHeaderReader", "Ignoring unknown WAV chunk: " + a10.f56833a);
            long j10 = a10.f56834b;
            long j11 = 8 + j10;
            if (j10 % 2 != 0) {
                j11 = 9 + j10;
            }
            if (j11 <= 2147483647L) {
                qVar.k((int) j11);
                a10 = a.a(qVar, b10);
            } else {
                throw q3.B.c("Chunk is too large (~2GB+) to skip; id: " + a10.f56833a);
            }
        }
        return a10;
    }

    public static Pair<Long, Long> e(C6679q qVar) {
        qVar.f();
        a d10 = d(1684108385, qVar, new B(8));
        qVar.k(8);
        return Pair.create(Long.valueOf(qVar.getPosition()), Long.valueOf(d10.f56834b));
    }
}
