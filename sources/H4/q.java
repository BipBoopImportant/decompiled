package h4;

import c4.C7093d;
import q3.z;
import t3.B;

public final class q {
    private static int a(int i10, B b10, int i11) {
        if (i10 == 12) {
            return 240;
        }
        if (i10 == 13) {
            return 120;
        }
        if (i10 == 21 && b10.a() >= 8 && b10.f() + 8 <= i11) {
            int q10 = b10.q();
            int q11 = b10.q();
            if (q10 >= 12 && q11 == 1936877170) {
                return b10.I();
            }
        }
        return -2147483647;
    }

    public static z b(B b10, int i10) {
        b10.X(12);
        while (b10.f() < i10) {
            int f10 = b10.f();
            int q10 = b10.q();
            if (b10.q() != 1935766900) {
                b10.W(f10 + q10);
            } else if (q10 < 16) {
                return null;
            } else {
                b10.X(4);
                int i11 = -1;
                int i12 = 0;
                for (int i13 = 0; i13 < 2; i13++) {
                    int H10 = b10.H();
                    int H11 = b10.H();
                    if (H10 == 0) {
                        i11 = H11;
                    } else if (H10 == 1) {
                        i12 = H11;
                    }
                }
                int a10 = a(i11, b10, i10);
                if (a10 == -2147483647) {
                    return null;
                }
                return new z(new C7093d((float) a10, i12));
            }
        }
        return null;
    }
}
