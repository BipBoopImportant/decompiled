package N3;

import N3.y;
import Z3.C6738a;
import b4.h;
import java.util.Arrays;
import java.util.List;
import kb.C9967v;
import q3.z;
import t3.A;
import t3.B;

public final class w {

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public y f38938a;

        public a(y yVar) {
            this.f38938a = yVar;
        }
    }

    public static boolean a(C6679q qVar) {
        B b10 = new B(4);
        qVar.o(b10.e(), 0, 4);
        return b10.J() == 1716281667;
    }

    public static int b(C6679q qVar) {
        qVar.f();
        B b10 = new B(2);
        qVar.o(b10.e(), 0, 2);
        int P10 = b10.P();
        if ((P10 >> 2) == 16382) {
            qVar.f();
            return P10;
        }
        qVar.f();
        throw q3.B.a("First frame does not start with sync code.", (Throwable) null);
    }

    public static z c(C6679q qVar, boolean z10) {
        z a10 = new C6658D().a(qVar, z10 ? null : h.f45389b);
        if (a10 == null || a10.e() == 0) {
            return null;
        }
        return a10;
    }

    public static z d(C6679q qVar, boolean z10) {
        qVar.f();
        long h10 = qVar.h();
        z c10 = c(qVar, z10);
        qVar.k((int) (qVar.h() - h10));
        return c10;
    }

    public static boolean e(C6679q qVar, a aVar) {
        qVar.f();
        A a10 = new A(new byte[4]);
        qVar.o(a10.f29434a, 0, 4);
        boolean g10 = a10.g();
        int h10 = a10.h(7);
        int h11 = a10.h(24) + 4;
        if (h10 == 0) {
            aVar.f38938a = h(qVar);
        } else {
            y yVar = aVar.f38938a;
            if (yVar == null) {
                throw new IllegalArgumentException();
            } else if (h10 == 3) {
                aVar.f38938a = yVar.b(f(qVar, h11));
            } else if (h10 == 4) {
                aVar.f38938a = yVar.c(j(qVar, h11));
            } else if (h10 == 6) {
                B b10 = new B(h11);
                qVar.readFully(b10.e(), 0, h11);
                b10.X(4);
                aVar.f38938a = yVar.a(C9967v.F(C6738a.a(b10)));
            } else {
                qVar.k(h11);
            }
        }
        return g10;
    }

    private static y.a f(C6679q qVar, int i10) {
        B b10 = new B(i10);
        qVar.readFully(b10.e(), 0, i10);
        return g(b10);
    }

    public static y.a g(B b10) {
        b10.X(1);
        int K10 = b10.K();
        long f10 = ((long) b10.f()) + ((long) K10);
        int i10 = K10 / 18;
        long[] jArr = new long[i10];
        long[] jArr2 = new long[i10];
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                break;
            }
            long A10 = b10.A();
            if (A10 == -1) {
                jArr = Arrays.copyOf(jArr, i11);
                jArr2 = Arrays.copyOf(jArr2, i11);
                break;
            }
            jArr[i11] = A10;
            jArr2[i11] = b10.A();
            b10.X(2);
            i11++;
        }
        b10.X((int) (f10 - ((long) b10.f())));
        return new y.a(jArr, jArr2);
    }

    private static y h(C6679q qVar) {
        byte[] bArr = new byte[38];
        qVar.readFully(bArr, 0, 38);
        return new y(bArr, 4);
    }

    public static void i(C6679q qVar) {
        B b10 = new B(4);
        qVar.readFully(b10.e(), 0, 4);
        if (b10.J() != 1716281667) {
            throw q3.B.a("Failed to read FLAC stream marker.", (Throwable) null);
        }
    }

    private static List<String> j(C6679q qVar, int i10) {
        B b10 = new B(i10);
        qVar.readFully(b10.e(), 0, i10);
        b10.X(4);
        return Arrays.asList(S.k(b10, false, false).f38793b);
    }
}
