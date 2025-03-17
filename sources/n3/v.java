package N3;

import t3.B;
import t3.N;

public final class v {

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public long f38937a;
    }

    private static boolean a(B b10, y yVar, int i10) {
        int j10 = j(b10, i10);
        return j10 != -1 && j10 <= yVar.f38942b;
    }

    private static boolean b(B b10, int i10) {
        return b10.H() == N.y(b10.e(), i10, b10.f() - 1, 0);
    }

    private static boolean c(B b10, y yVar, boolean z10, a aVar) {
        try {
            long Q10 = b10.Q();
            if (!z10) {
                Q10 *= (long) yVar.f38942b;
            }
            aVar.f38937a = Q10;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static boolean d(B b10, y yVar, int i10, a aVar) {
        B b11 = b10;
        y yVar2 = yVar;
        int f10 = b10.f();
        long J10 = b10.J();
        long j10 = J10 >>> 16;
        if (j10 != ((long) i10)) {
            return false;
        }
        return g((int) ((J10 >> 4) & 15), yVar2) && f((int) ((J10 >> 1) & 7), yVar2) && !(((J10 & 1) > 1 ? 1 : ((J10 & 1) == 1 ? 0 : -1)) == 0) && c(b11, yVar2, ((j10 & 1) > 1 ? 1 : ((j10 & 1) == 1 ? 0 : -1)) == 0, aVar) && a(b11, yVar2, (int) ((J10 >> 12) & 15)) && e(b11, yVar2, (int) ((J10 >> 8) & 15)) && b(b11, f10);
    }

    private static boolean e(B b10, y yVar, int i10) {
        int i11 = yVar.f38945e;
        if (i10 == 0) {
            return true;
        }
        if (i10 <= 11) {
            return i10 == yVar.f38946f;
        }
        if (i10 == 12) {
            return b10.H() * 1000 == i11;
        }
        if (i10 > 14) {
            return false;
        }
        int P10 = b10.P();
        if (i10 == 14) {
            P10 *= 10;
        }
        return P10 == i11;
    }

    private static boolean f(int i10, y yVar) {
        return i10 == 0 || i10 == yVar.f38949i;
    }

    private static boolean g(int i10, y yVar) {
        return i10 <= 7 ? i10 == yVar.f38947g - 1 : i10 <= 10 && yVar.f38947g == 2;
    }

    public static boolean h(C6679q qVar, y yVar, int i10, a aVar) {
        long h10 = qVar.h();
        byte[] bArr = new byte[2];
        qVar.o(bArr, 0, 2);
        if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i10) {
            qVar.f();
            qVar.i((int) (h10 - qVar.getPosition()));
            return false;
        }
        B b10 = new B(16);
        System.arraycopy(bArr, 0, b10.e(), 0, 2);
        b10.V(C6680s.c(qVar, b10.e(), 2, 14));
        qVar.f();
        qVar.i((int) (h10 - qVar.getPosition()));
        return d(b10, yVar, i10, aVar);
    }

    public static long i(C6679q qVar, y yVar) {
        qVar.f();
        boolean z10 = true;
        qVar.i(1);
        byte[] bArr = new byte[1];
        qVar.o(bArr, 0, 1);
        if ((bArr[0] & 1) != 1) {
            z10 = false;
        }
        qVar.i(2);
        int i10 = z10 ? 7 : 6;
        B b10 = new B(i10);
        b10.V(C6680s.c(qVar, b10.e(), 0, i10));
        qVar.f();
        a aVar = new a();
        if (c(b10, yVar, z10, aVar)) {
            return aVar.f38937a;
        }
        throw q3.B.a((String) null, (Throwable) null);
    }

    public static int j(B b10, int i10) {
        switch (i10) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i10 - 2);
            case 6:
                return b10.H() + 1;
            case 7:
                return b10.P() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i10 - 8);
            default:
                return -1;
        }
    }
}
